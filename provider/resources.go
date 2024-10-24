package harness

import (
	"bytes"
	"fmt"
	"os"
	"path"

	// embed is used to store bridge-metadata.json in the compiled binary
	_ "embed"

	harnessShim "github.com/harness/terraform-provider-harness/shim"

	"github.com/pulumi/pulumi-terraform-bridge/v3/pkg/tfbridge"
	tks "github.com/pulumi/pulumi-terraform-bridge/v3/pkg/tfbridge/tokens"
	shimv2 "github.com/pulumi/pulumi-terraform-bridge/v3/pkg/tfshim/sdk-v2"
	"github.com/pulumi/pulumi/sdk/v3/go/common/tokens"

	"github.com/pulumi/pulumi-harness/provider/pkg/version"
)

// all of the token components used below.
const (
	mainPkg = "harness"
	mainMod = "index"

	cloudProviderMod = "cloudprovider"
	platformMod      = "platform"
	serviceMod       = "service"
	autostoppingMod  = "autostopping"
)

var modules = []string{
	cloudProviderMod,
	platformMod,
	serviceMod,
	autostoppingMod,
	"cluster",
	"governance",
}

func harnessDataSource(mod string, res string) tokens.ModuleMember {
	return tfbridge.MakeDataSource(mainPkg, mod, res)
}

func harnessResource(mod string, res string) tokens.Type {
	return tfbridge.MakeResource(mainPkg, mod, res)
}

// Provider returns additional overlaid schema and metadata associated with the provider..
func Provider() tfbridge.ProviderInfo {
	p := shimv2.NewProvider(harnessShim.NewProvider())

	// Create a Pulumi provider mapping
	prov := tfbridge.ProviderInfo{
		P:                 p,
		Name:              "harness",
		DisplayName:       "Harness",
		Publisher:         "Pulumi",
		LogoURL:           "https://raw.githubusercontent.com/pulumi/pulumi-harness/main/assets/logo.png",
		PluginDownloadURL: "github://api.github.com/pulumi",
		Description:       "A Pulumi package for creating and managing Harness  resources.",
		Keywords:          []string{"pulumi", "harness"},
		License:           "Apache-2.0",
		Homepage:          "https://www.pulumi.com",
		Repository:        "https://github.com/pulumi/pulumi-harness",
		GitHubOrg:         "harness",
		DocRules:          &tfbridge.DocRuleInfo{EditRules: editRules},
		Config: map[string]*tfbridge.SchemaInfo{
			"endpoint": {
				Default: &tfbridge.DefaultInfo{
					EnvVars: []string{"HARNESS_ENDPOINT"},
				},
			},
			"account_id": {
				Default: &tfbridge.DefaultInfo{
					EnvVars: []string{"HARNESS_ACCOUNT_ID"},
				},
			},
			"api_key": {
				Default: &tfbridge.DefaultInfo{
					EnvVars: []string{"HARNESS_API_KEY"},
				},
			},
			"platform_api_key": {
				Default: &tfbridge.DefaultInfo{
					EnvVars: []string{"HARNESS_PLATFORM_API_KEY"},
				},
			},
		},
		Resources: map[string]*tfbridge.ResourceInfo{
			"harness_add_user_to_group":         {Tok: harnessResource(mainMod, "AddUserToGroup")},
			"harness_application":               {Tok: harnessResource(mainMod, "Application")},
			"harness_application_gitsync":       {Tok: harnessResource(mainMod, "ApplicationGitSync")},
			"harness_cloudprovider_aws":         {Tok: harnessResource(cloudProviderMod, "Aws")},
			"harness_cloudprovider_azure":       {Tok: harnessResource(cloudProviderMod, "Azure")},
			"harness_cloudprovider_datacenter":  {Tok: harnessResource(cloudProviderMod, "Datacenter")},
			"harness_cloudprovider_gcp":         {Tok: harnessResource(cloudProviderMod, "Gcp")},
			"harness_cloudprovider_kubernetes":  {Tok: harnessResource(cloudProviderMod, "Kubernetes")},
			"harness_cloudprovider_spot":        {Tok: harnessResource(cloudProviderMod, "Spot")},
			"harness_cloudprovider_tanzu":       {Tok: harnessResource(cloudProviderMod, "Tanzu")},
			"harness_delegate_approval":         {Tok: harnessResource(mainMod, "DelegateApproval")},
			"harness_encrypted_text":            {Tok: harnessResource(mainMod, "EncryptedText")},
			"harness_environment":               {Tok: harnessResource(mainMod, "Environment")},
			"harness_git_connector":             {Tok: harnessResource(mainMod, "GitConnector")},
			"harness_infrastructure_definition": {Tok: harnessResource(mainMod, "InfrastructureDefinition")},
			"harness_platform_apikey": {
				Tok: harnessResource(mainMod, "PlatformApiKey"),
			},
			"harness_platform_ccm_filters":           {Tok: harnessResource(mainMod, "PlatformCcmFilters")},
			"harness_platform_connector_appdynamics": {Tok: harnessResource(platformMod, "AppDynamicsConnector")},
			"harness_platform_connector_azure_cloud_cost": {
				Tok: harnessResource(platformMod, "AzureCloudCostConnector"),
			},
			"harness_platform_connector_artifactory": {Tok: harnessResource(platformMod, "ArtifactoryConnector")},
			"harness_platform_connector_azure_cloud_provider": {
				Tok: harnessResource(platformMod, "AzureCloudProviderConnector"),
			},
			"harness_platform_connector_azure_key_vault": {Tok: harnessResource(platformMod, "AzureKeyVaultConnector")},
			"harness_platform_connector_elasticsearch":   {Tok: harnessResource(platformMod, "ElasticsearchConnector")},
			"harness_platform_connector_gcp_cloud_cost":  {Tok: harnessResource(platformMod, "GcpCloudCostConnector")},
			"harness_platform_connector_gcp_secret_manager": {
				Tok: harnessResource(platformMod, "GcpSecretManagerConnector"),
			},
			"harness_platform_connector_jenkins": {Tok: harnessResource(platformMod, "JenkinsConnector")},
			"harness_platform_connector_kubernetes_cloud_cost": {
				Tok: harnessResource(platformMod, "KubernetesCloudCostConnector"),
			},
			"harness_platform_connector_oci_helm":    {Tok: harnessResource(platformMod, "OciHelmConnector")},
			"harness_platform_connector_service_now": {Tok: harnessResource(platformMod, "ServiceNowConnector")},
			"harness_platform_connector_spot":        {Tok: harnessResource(platformMod, "SpotConnector")},
			"harness_platform_connector_tas":         {Tok: harnessResource(platformMod, "TasConnector")},
			"harness_platform_connector_terraform_cloud": {
				Tok: harnessResource(platformMod, "TerraformCloudConnector"),
			},

			"harness_platform_connector_aws": {Tok: harnessResource(platformMod, "AwsConnector")},
			"harness_platform_connector_aws_secret_manager": {
				Tok: harnessResource(platformMod, "AwsSecretManagerConnector"),
			},
			"harness_platform_connector_awscc":      {Tok: harnessResource(platformMod, "AwsCCConnector")},
			"harness_platform_connector_awskms":     {Tok: harnessResource(platformMod, "AwsKmsConnector")},
			"harness_platform_connector_bitbucket":  {Tok: harnessResource(platformMod, "BitbucketConnector")},
			"harness_platform_connector_datadog":    {Tok: harnessResource(platformMod, "DatadogConnector")},
			"harness_platform_connector_docker":     {Tok: harnessResource(platformMod, "DockerConnector")},
			"harness_platform_connector_dynatrace":  {Tok: harnessResource(platformMod, "DynatraceConnector")},
			"harness_platform_connector_gcp":        {Tok: harnessResource(platformMod, "GcpConnector")},
			"harness_platform_connector_git":        {Tok: harnessResource(platformMod, "GitConnector")},
			"harness_platform_connector_github":     {Tok: harnessResource(platformMod, "GithubConnector")},
			"harness_platform_connector_gitlab":     {Tok: harnessResource(platformMod, "GitlabConnector")},
			"harness_platform_connector_helm":       {Tok: harnessResource(platformMod, "HelmConnector")},
			"harness_platform_connector_jira":       {Tok: harnessResource(platformMod, "JiraConnector")},
			"harness_platform_connector_kubernetes": {Tok: harnessResource(platformMod, "KubernetesConnector")},
			"harness_platform_connector_newrelic":   {Tok: harnessResource(platformMod, "NewrelicConnector")},
			"harness_platform_connector_nexus":      {Tok: harnessResource(platformMod, "NexusConnector")},
			"harness_platform_connector_pagerduty":  {Tok: harnessResource(platformMod, "PagerdutyConnector")},
			"harness_platform_connector_prometheus": {Tok: harnessResource(platformMod, "PrometheusConnector")},
			"harness_platform_connector_splunk":     {Tok: harnessResource(platformMod, "SplunkConnector")},
			"harness_platform_connector_sumologic":  {Tok: harnessResource(platformMod, "SumologicConnector")},
			"harness_platform_connector_vault":      {Tok: harnessResource(platformMod, "VaultConnector")},
			"harness_platform_environment":          {Tok: harnessResource(platformMod, "Environment")},
			"harness_platform_environment_clusters_mapping": {
				Tok: harnessResource(platformMod, "EnvironmentClustersMapping"),
			},
			"harness_platform_environment_service_overrides": {
				Tok: harnessResource(platformMod, "EnvironmentServiceOverrides"),
			},
			"harness_platform_environment_group": {Tok: harnessResource(platformMod, "EnvironmentGroup")},
			"harness_platform_delegatetoken": {
				Docs: &tfbridge.DocInfo{
					Source: "platform_delegate_token.md",
				},
			},
			"harness_platform_feature_flag":        {Tok: harnessResource(platformMod, "FeatureFlag")},
			"harness_platform_ff_api_key":          {Tok: harnessResource(platformMod, "FeatureFlagApiKey")},
			"harness_platform_filters":             {Tok: harnessResource(platformMod, "Filters")},
			"harness_platform_gitops_applications": {Tok: harnessResource(platformMod, "GitOpsApplications")},
			"harness_platform_gitops_gnupg":        {Tok: harnessResource(platformMod, "GitOpsGnupg")},
			"harness_platform_gitops_repo_cert":    {Tok: harnessResource(platformMod, "GitOpsRepoCert")},
			"harness_platform_gitops_repo_cred":    {Tok: harnessResource(platformMod, "GitOpsRepoCred")},
			"harness_platform_manual_freeze":       {Tok: harnessResource(platformMod, "ManualFreeze")},
			"harness_platform_monitored_service":   {Tok: harnessResource(platformMod, "MonitoredService")},
			"harness_platform_overrides": {
				Docs: &tfbridge.DocInfo{
					AllowMissing: true,
				},
			},
			"harness_platform_pipeline_filters": {Tok: harnessResource(platformMod, "PipelineFilters")},
			"harness_platform_policy":           {Tok: harnessResource(platformMod, "Policy")},
			"harness_platform_policyset":        {Tok: harnessResource(platformMod, "PolicySet")},
			"harness_platform_service_overrides_v2": {
				Tok: harnessResource(platformMod, "ServiceOverridesV2"),
			},
			"harness_platform_gitops_agent":      {Tok: harnessResource(platformMod, "GitOpsAgent")},
			"harness_platform_gitops_cluster":    {Tok: harnessResource(platformMod, "GitOpsCluster")},
			"harness_platform_gitops_repository": {Tok: harnessResource(platformMod, "GitOpsRepository")},
			"harness_platform_secret_sshkey":     {Tok: harnessResource(platformMod, "SecretSshkey")},
			"harness_platform_secret_text":       {Tok: harnessResource(platformMod, "SecretText")},
			"harness_platform_service":           {Tok: harnessResource(platformMod, "Service")},
			"harness_platform_service_account":   {Tok: harnessResource(platformMod, "ServiceAccount")},
			"harness_platform_triggers":          {Tok: harnessResource(platformMod, "Triggers")},
			"harness_platform_usergroup":         {Tok: harnessResource(platformMod, "Usergroup")},
			"harness_platform_variables":         {Tok: harnessResource(platformMod, "Variables")},
			"harness_service_ami":                {Tok: harnessResource(serviceMod, "Ami")},
			"harness_service_aws_codedeploy":     {Tok: harnessResource(serviceMod, "Codedeploy")},
			"harness_service_aws_lambda":         {Tok: harnessResource(serviceMod, "Lambda")},
			"harness_service_ecs":                {Tok: harnessResource(serviceMod, "Ecs")},
			"harness_service_helm":               {Tok: harnessResource(serviceMod, "Helm")},
			"harness_service_kubernetes":         {Tok: harnessResource(serviceMod, "Kubernetes")},
			"harness_service_ssh":                {Tok: harnessResource(serviceMod, "Ssh")},
			"harness_service_tanzu":              {Tok: harnessResource(serviceMod, "Tanzu")},
			"harness_service_winrm":              {Tok: harnessResource(serviceMod, "Winrm")},
			"harness_ssh_credential":             {Tok: harnessResource(mainMod, "SshCredential")},
			"harness_user":                       {Tok: harnessResource(mainMod, "User")},
			"harness_user_group":                 {Tok: harnessResource(mainMod, "UserGroup")},
			"harness_user_group_permissions":     {Tok: harnessResource(mainMod, "UserGroupPermissions")},
			"harness_yaml_config":                {Tok: harnessResource(mainMod, "YamlConfig")},
		},
		DataSources: map[string]*tfbridge.DataSourceInfo{
			"harness_application":     {Tok: harnessDataSource(mainMod, "getApplication")},
			"harness_current_account": {Tok: harnessDataSource(mainMod, "getCurrentAccount")},
			"harness_delegate":        {Tok: harnessDataSource(mainMod, "getDelegate")},
			"harness_delegate_ids":    {Tok: harnessDataSource(cloudProviderMod, "getDelegateIds")},
			"harness_encrypted_text":  {Tok: harnessDataSource(mainMod, "getEncryptedText")},
			"harness_environment":     {Tok: harnessDataSource(mainMod, "getEnvironment")},
			"harness_git_connector":   {Tok: harnessDataSource(mainMod, "getGitConnector")},
			"harness_platform_apikey": {
				Tok: harnessDataSource(platformMod, "getApiKey"),
			},
			"harness_platform_connector_appdynamics": {
				Tok: harnessDataSource(platformMod, "getAppDynamicsConnector"),
			},
			"harness_platform_ccm_filters": {Tok: harnessDataSource(platformMod, "getCcmFilters")},
			"harness_platform_connector_azure_cloud_cost": {
				Tok: harnessDataSource(platformMod, "getAzureCloudCostConnector"),
			},
			"harness_platform_connector_azure_cloud_provider": {
				Tok: harnessDataSource(platformMod, "getAzureCloudProviderConnector"),
			},
			"harness_platform_connector_azure_key_vault": {
				Tok: harnessDataSource(platformMod, "getAzureKeyVaultConnector"),
			},
			"harness_platform_connector_elasticsearch": {
				Tok: harnessDataSource(platformMod, "getElasticsearchConnector"),
			},
			"harness_platform_connector_gcp_cloud_cost": {
				Tok: harnessDataSource(platformMod, "getGcpCloudCostConnector"),
			},
			"harness_platform_connector_gcp_secret_manager": {
				Tok: harnessDataSource(platformMod, "getGcpSecretManagerConnector"),
			},
			"harness_platform_connector_jenkins": {Tok: harnessDataSource(platformMod, "getJenkinsConnector")},
			"harness_platform_connector_kubernetes_cloud_cost": {
				Tok: harnessDataSource(platformMod, "getKubernetesCloudCostConnector"),
			},
			"harness_platform_connector_oci_helm": {Tok: harnessDataSource(platformMod, "getOciHelmConnector")},
			"harness_platform_connector_service_now": {
				Tok: harnessDataSource(platformMod, "getServiceNowConnector"),
			},
			"harness_platform_connector_spot": {Tok: harnessDataSource(platformMod, "getSpotConnector")},
			"harness_platform_connector_tas":  {Tok: harnessDataSource(platformMod, "getTasConnector")},
			"harness_platform_connector_terraform_cloud": {
				Tok: harnessDataSource(platformMod, "getTerraformCloudConnector"),
			},
			"harness_platform_connector_artifactory": {
				Tok: harnessDataSource(platformMod, "getArtifactoryConnector"),
			},
			"harness_platform_connector_aws": {Tok: harnessDataSource(platformMod, "getAwsConnector")},
			"harness_platform_connector_aws_secret_manager": {
				Tok: harnessDataSource(platformMod, "getAwsSecretManagerConnector"),
			},
			"harness_platform_connector_awscc":  {Tok: harnessDataSource(platformMod, "getAwsCCConnector")},
			"harness_platform_connector_awskms": {Tok: harnessDataSource(platformMod, "getAwsKmsConnector")},
			"harness_platform_connector_bitbucket": {
				Tok: harnessDataSource(platformMod, "getBitbucketConnector"),
			},
			"harness_platform_connector_datadog": {Tok: harnessDataSource(platformMod, "getDatadogConnector")},
			"harness_platform_connector_docker":  {Tok: harnessDataSource(platformMod, "getDockerConnector")},
			"harness_platform_connector_dynatrace": {
				Tok: harnessDataSource(platformMod, "getDynatraceConnector"),
			},
			"harness_platform_connector_gcp":    {Tok: harnessDataSource(platformMod, "getGcpConnector")},
			"harness_platform_connector_git":    {Tok: harnessDataSource(platformMod, "getGitConnector")},
			"harness_platform_connector_github": {Tok: harnessDataSource(platformMod, "getGithubConnector")},
			"harness_platform_connector_gitlab": {Tok: harnessDataSource(platformMod, "getGitlabConnector")},
			"harness_platform_connector_helm":   {Tok: harnessDataSource(platformMod, "getHelmConnector")},
			"harness_platform_connector_jira":   {Tok: harnessDataSource(platformMod, "getJiraConnector")},
			"harness_platform_connector_kubernetes": {
				Tok: harnessDataSource(platformMod, "getKubernetesConnector"),
			},
			"harness_platform_connector_nexus": {Tok: harnessDataSource(platformMod, "getNexusConnector")},
			"harness_platform_connector_pagerduty": {
				Tok: harnessDataSource(platformMod, "getPagerdutyConnector"),
			},
			"harness_platform_connector_prometheus": {
				Tok: harnessDataSource(platformMod, "getPrometheusConnector"),
			},
			"harness_platform_connector_splunk": {Tok: harnessDataSource(platformMod, "getSplunkConnector")},
			"harness_platform_connector_sumologic": {
				Tok: harnessDataSource(platformMod, "getSumologicConnector"),
			},
			"harness_platform_connector_vault": {Tok: harnessDataSource(platformMod, "getVaultConnector")},
			"harness_platform_current_account": {Docs: &tfbridge.DocInfo{AllowMissing: true}},
			"harness_platform_current_user":    {Tok: harnessDataSource(platformMod, "getCurrentUser")},
			"harness_platform_delegatetoken": {
				Docs: &tfbridge.DocInfo{
					Source: "platform_delegate_token.md",
				},
			},
			"harness_platform_environment_service_overrides": {
				Tok: harnessDataSource(platformMod, "getEnvironmentServiceOverrides"),
			},
			"harness_platform_filters": {Tok: harnessDataSource(platformMod, "getFilters")},
			"harness_platform_gitops_agent_deploy_yaml": {
				Tok: harnessDataSource(platformMod, "getGitopsAgentDeployYaml"),
			},
			"harness_platform_gitops_applications": {
				Tok: harnessDataSource(platformMod, "getGitopsApplications"),
			},
			"harness_platform_gitops_gnupg":      {Tok: harnessDataSource(platformMod, "getGitopsGnupg")},
			"harness_platform_gitops_repo_cert":  {Tok: harnessDataSource(platformMod, "getGitopsRepoCert")},
			"harness_platform_gitops_repo_cred":  {Tok: harnessDataSource(platformMod, "getGitopsRepoCred")},
			"harness_platform_manual_freeze":     {Tok: harnessDataSource(platformMod, "getManualFreeze")},
			"harness_platform_monitored_service": {Tok: harnessDataSource(platformMod, "getMonitoredService")},
			"harness_platform_pipeline_filters":  {Tok: harnessDataSource(platformMod, "getPipelineFilters")},
			"harness_platform_policy":            {Tok: harnessDataSource(platformMod, "getPolicy")},
			"harness_platform_policyset":         {Tok: harnessDataSource(platformMod, "getPolicySet")},
			"harness_platform_service_overrides_v2": {
				Tok: harnessDataSource(platformMod, "getServiceOverridesV2"),
			},
			"harness_platform_slo":              {Tok: harnessDataSource(platformMod, "getSlo")},
			"harness_platform_template":         {Tok: harnessDataSource(platformMod, "getTemplate")},
			"harness_platform_template_filters": {Tok: harnessDataSource(platformMod, "getTemplateFilters")},
			"harness_platform_token":            {Tok: harnessDataSource(platformMod, "getToken")},
			"harness_platform_user":             {Tok: harnessDataSource(platformMod, "getUser")},
			"harness_platform_variables": {
				Tok: harnessDataSource(platformMod, "getVariables"),
			},
			"harness_platform_environment": {Tok: harnessDataSource(platformMod, "getEnvironment")},
			"harness_platform_environment_clusters_mapping": {
				Tok: harnessDataSource(platformMod, "getEnvironmentClustersMapping"),
			},
			"harness_platform_environment_group": {Tok: harnessDataSource(platformMod, "getEnvironmentGroup")},
			"harness_platform_gitops_agent":      {Tok: harnessDataSource(platformMod, "getGitopsAgent")},
			"harness_platform_gitops_cluster":    {Tok: harnessDataSource(platformMod, "getGitopsCluster")},
			"harness_platform_gitops_repository": {Tok: harnessDataSource(platformMod, "getGitopsRepository")},
			"harness_platform_infrastructure":    {Tok: harnessDataSource(platformMod, "getInfrastructure")},
			"harness_platform_input_set":         {Tok: harnessDataSource(platformMod, "getInputSet")},
			"harness_platform_organization":      {Tok: harnessDataSource(platformMod, "getOrganization")},
			"harness_platform_overrides": {
				Docs: &tfbridge.DocInfo{
					AllowMissing: true,
				},
			},
			"harness_platform_pipeline":         {Tok: harnessDataSource(platformMod, "getPipeline")},
			"harness_platform_permissions":      {Tok: harnessDataSource(platformMod, "getPermissions")},
			"harness_platform_project":          {Tok: harnessDataSource(platformMod, "getProject")},
			"harness_platform_resource_group":   {Tok: harnessDataSource(platformMod, "getResourceGroup")},
			"harness_platform_roles":            {Tok: harnessDataSource(platformMod, "getRoles")},
			"harness_platform_role_assignments": {Tok: harnessDataSource(platformMod, "getRoleAssignments")},
			"harness_platform_secret_file":      {Tok: harnessDataSource(platformMod, "getSecretFile")},
			"harness_platform_secret_sshkey":    {Tok: harnessDataSource(platformMod, "getSecretSshkey")},
			"harness_platform_secret_text":      {Tok: harnessDataSource(platformMod, "getSecretText")},
			"harness_platform_service":          {Tok: harnessDataSource(platformMod, "getService")},
			"harness_platform_service_account":  {Tok: harnessDataSource(platformMod, "getServiceAccount")},
			"harness_platform_triggers":         {Tok: harnessDataSource(platformMod, "getTriggers")},
			"harness_platform_usergroup":        {Tok: harnessDataSource(platformMod, "getUsergroup")},
			// note this is renamed as it produces a conflict with the other datasource.
			"harness_platform_workspace_output": {
				Tok: harnessDataSource(platformMod, "getWorkspaceOutputValue"),
				Fields: map[string]*tfbridge.SchemaInfo{
					"outputs": {Name: "outputValues"},
				},
			},
			"harness_secret_manager": {Tok: harnessDataSource(mainMod, "getSecretManager")},
			"harness_service":        {Tok: harnessDataSource(mainMod, "getService")},
			"harness_ssh_credential": {Tok: harnessDataSource(mainMod, "getSshCredential")},
			"harness_sso_provider":   {Tok: harnessDataSource(mainMod, "getSsoProvider")},
			"harness_user":           {Tok: harnessDataSource(mainMod, "getUser")},
			"harness_user_group":     {Tok: harnessDataSource(mainMod, "getUserGroup")},
			"harness_trigger":        {Tok: harnessDataSource(mainMod, "getTrigger")},
			"harness_yaml_config":    {Tok: harnessDataSource(mainMod, "getYamlConfig")},
		},
		JavaScript: &tfbridge.JavaScriptInfo{
			// List any npm dependencies and their versions

			DevDependencies: map[string]string{
				"@types/node": "^10.0.0", // so we can access strongly typed node definitions.
				"@types/mime": "^2.0.0",
			},
			PackageName:          "@pulumi/harness",
			RespectSchemaVersion: true,
		},
		Python: &tfbridge.PythonInfo{
			PackageName:          "pulumi_harness",
			PyProject:            struct{ Enabled bool }{true},
			RespectSchemaVersion: true,
		},
		Golang: &tfbridge.GolangInfo{
			ImportBasePath: path.Join(
				fmt.Sprintf("github.com/pulumi/pulumi-%[1]s/sdk/", mainPkg),
				tfbridge.GetModuleMajorVersion(version.Version),
				"go",
				mainPkg,
			),
			GenerateResourceContainerTypes: true,
			RespectSchemaVersion:           true,
		},
		CSharp: &tfbridge.CSharpInfo{
			PackageReferences: map[string]string{
				"Pulumi": "3.*",
			},
			RootNamespace:        "Pulumi",
			RespectSchemaVersion: true,
		},
		MetadataInfo: tfbridge.NewProviderMetadata(metadata),
	}

	prov.MustComputeTokens(tks.KnownModules("harness_", "", modules, tks.MakeStandard(mainPkg)))
	prov.MustApplyAutoAliases()
	prov.SetAutonaming(255, "-")

	return prov
}

func editRules(defaults []tfbridge.DocsEdit) []tfbridge.DocsEdit {
	return append(
		defaults,
		fixInstallationExample,
	)
}

// In the upstream example, two providers are defined in the same code block.
// Pulumi Convert is not set up to handle this case, so this edit breaks the example up into two separate code blocks.
// This can be removed when https://github.com/pulumi/pulumi/issues/17596 is implemented.
var fixInstallationExample = tfbridge.DocsEdit{
	Path: "index.md",
	Edit: func(_ string, content []byte) ([]byte, error) {
		input, err := os.ReadFile("provider/installation-replaces/example-input.md")
		if err != nil {
			return nil, err
		}
		replace, err := os.ReadFile("provider/installation-replaces/example-desired.md")
		if err != nil {
			return nil, err
		}
		b := bytes.ReplaceAll(
			content,
			input,
			replace)
		return b, nil
	},
}

//go:embed cmd/pulumi-resource-harness/bridge-metadata.json
var metadata []byte
