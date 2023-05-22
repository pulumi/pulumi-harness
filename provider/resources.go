package harness

import (
	"fmt"
	"path/filepath"
	"strings"
	"unicode"

	harnessShim "github.com/harness/terraform-provider-harness/shim"
	"github.com/lbrlabs/pulumi-harness/provider/pkg/version"
	"github.com/pulumi/pulumi-terraform-bridge/v3/pkg/tfbridge"
	"github.com/pulumi/pulumi-terraform-bridge/v3/pkg/tfbridge/x"
	shim "github.com/pulumi/pulumi-terraform-bridge/v3/pkg/tfshim"
	shimv2 "github.com/pulumi/pulumi-terraform-bridge/v3/pkg/tfshim/sdk-v2"
	"github.com/pulumi/pulumi/sdk/v3/go/common/resource"
	"github.com/pulumi/pulumi/sdk/v3/go/common/tokens"
	"github.com/pulumi/pulumi/sdk/v3/go/common/util/contract"
)

// all of the token components used below.
const (
	mainPkg = "harness"
	mainMod = "index"
	//applicationMod       = "Application"
	cloudProviderMod = "cloudprovider"
	platformMod      = "platform"
	serviceMod       = "service"
)

func preConfigureCallback(vars resource.PropertyMap, c shim.ResourceConfig) error {
	return nil
}

var namespaceMap = map[string]string{
	"harness": "Harness",
}

// harnessMember manufactures a type token for the Harness package and the given module and type.
func harnessMember(moduleTitle string, fn string, mem string) tokens.ModuleMember {
	moduleName := strings.ToLower(moduleTitle)
	namespaceMap[moduleName] = moduleTitle
	if fn != "" {
		moduleName += "/" + fn
	}
	return tokens.ModuleMember(mainPkg + ":" + moduleName + ":" + mem)
}

// harnessType manufactures a type token for the Launch Darkly package and the given module and type.
func harnessType(mod string, fn string, typ string) tokens.Type {
	return tokens.Type(harnessMember(mod, fn, typ))
}

func harnessTypeDefaultFile(mod string, typ string) tokens.Type {
	fn := string(unicode.ToLower(rune(typ[0]))) + typ[1:]
	return harnessType(mod, fn, typ)
}

// harnessDataSource manufactures a standard resource token given a module and resource name.
// It automatically uses the Launch Darkly package and names the file by simply lower casing the data
// source's first character.
func harnessDataSource(mod string, res string) tokens.ModuleMember {
	fn := string(unicode.ToLower(rune(res[0]))) + res[1:]
	return harnessMember(mod, fn, res)
}

// harnessResource manufactures a standard resource token given a module and resource name.
// It automatically uses the Launch Darkly package and names the file by simply lower casing the resource's
// first character.
func harnessResource(mod string, res string) tokens.Type {
	return harnessTypeDefaultFile(mod, res)
}

// Provider returns additional overlaid schema and metadata associated with the provider..
func Provider() tfbridge.ProviderInfo {
	p := shimv2.NewProvider(harnessShim.NewProvider())

	// Create a Pulumi provider mapping
	prov := tfbridge.ProviderInfo{
		P:                 p,
		Name:              "harness",
		DisplayName:       "Harness",
		Publisher:         "lbrlabs",
		LogoURL:           "https://raw.githubusercontent.com/lbrlabs/pulumi-harness/master/assets/logo.svg",
		PluginDownloadURL: "github://api.github.com/lbrlabs",
		Description:       "A Pulumi package for creating and managing Harness  resources.",
		Keywords:          []string{"pulumi", "harness", "lbrlabs"},
		License:           "Apache-2.0",
		Homepage:          "https://www.pulumi.com",
		Repository:        "https://github.com/lbrlabs/pulumi-harness",
		GitHubOrg:         "harness",
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
		PreConfigureCallback: preConfigureCallback,
		Resources: map[string]*tfbridge.ResourceInfo{
			"harness_add_user_to_group":        {Tok: harnessResource(mainMod, "AddUserToGroup")},
			"harness_application":              {Tok: harnessResource(mainMod, "Application")},
			"harness_application_gitsync":      {Tok: harnessResource(mainMod, "ApplicationGitSync")},
			"harness_cloudprovider_aws":        {Tok: harnessResource(cloudProviderMod, "Aws")},
			"harness_cloudprovider_azure":      {Tok: harnessResource(cloudProviderMod, "Azure")},
			"harness_cloudprovider_datacenter": {Tok: harnessResource(cloudProviderMod, "Datacenter")},
			"harness_cloudprovider_gcp":        {Tok: harnessResource(cloudProviderMod, "Gcp")},
			"harness_cloudprovider_kubernetes": {Tok: harnessResource(cloudProviderMod, "Kubernetes")},
			"harness_cloudprovider_spot":       {Tok: harnessResource(cloudProviderMod, "Spot")},
			"harness_cloudprovider_tanzu":      {Tok: harnessResource(cloudProviderMod, "Tanzu")},
			"harness_delegate_approval":        {Tok: harnessResource(mainMod, "DelegateApproval")}, "harness_encrypted_text": {Tok: harnessResource(mainMod, "EncryptedText")},
			"harness_environment":                            {Tok: harnessResource(mainMod, "Environment")},
			"harness_git_connector":                          {Tok: harnessResource(mainMod, "GitConnector")},
			"harness_infrastructure_definition":              {Tok: harnessResource(mainMod, "InfrastructureDefinition")},
			"harness_platform_connector_appdynamics":         {Tok: harnessResource(platformMod, "AppDynamicsConnector")},
			"harness_platform_apikey":                        {Tok: harnessResource(platformMod, "ApiKey")},
			"harness_platform_connector_artifactory":         {Tok: harnessResource(platformMod, "ArtifactoryConnector")},
			"harness_platform_connector_aws":                 {Tok: harnessResource(platformMod, "AwsConnector")},
			"harness_platform_connector_aws_secret_manager":  {Tok: harnessResource(platformMod, "AwsSecretManagerConnector")},
			"harness_platform_connector_awscc":               {Tok: harnessResource(platformMod, "AwsCCConnector")},
			"harness_platform_connector_awskms":              {Tok: harnessResource(platformMod, "AwsKmsConnector")},
			"harness_platform_connector_bitbucket":           {Tok: harnessResource(platformMod, "BitbucketConnector")},
			"harness_platform_connector_datadog":             {Tok: harnessResource(platformMod, "DatadogConnector")},
			"harness_platform_connector_docker":              {Tok: harnessResource(platformMod, "DockerConnector")},
			"harness_platform_connector_dynatrace":           {Tok: harnessResource(platformMod, "DynatraceConnector")},
			"harness_platform_connector_gcp":                 {Tok: harnessResource(platformMod, "GcpConnector")},
			"harness_platform_connector_git":                 {Tok: harnessResource(platformMod, "GitConnector")},
			"harness_platform_connector_github":              {Tok: harnessResource(platformMod, "GithubConnector")},
			"harness_platform_connector_gitlab":              {Tok: harnessResource(platformMod, "GitlabConnector")},
			"harness_platform_connector_helm":                {Tok: harnessResource(platformMod, "HelmConnector")},
			"harness_platform_connector_jira":                {Tok: harnessResource(platformMod, "JiraConnector")},
			"harness_platform_connector_kubernetes":          {Tok: harnessResource(platformMod, "KubernetesConnector")},
			"harness_platform_connector_newrelic":            {Tok: harnessResource(platformMod, "NewrelicConnector")},
			"harness_platform_connector_nexus":               {Tok: harnessResource(platformMod, "NexusConnector")},
			"harness_platform_connector_pagerduty":           {Tok: harnessResource(platformMod, "PagerdutyConnector")},
			"harness_platform_connector_prometheus":          {Tok: harnessResource(platformMod, "PrometheusConnector")},
			"harness_platform_connector_splunk":              {Tok: harnessResource(platformMod, "SplunkConnector")},
			"harness_platform_connector_sumologic":           {Tok: harnessResource(platformMod, "SumologicConnector")},
			"harness_platform_connector_vault":               {Tok: harnessResource(platformMod, "VaultConnector")},
			"harness_platform_environment":                   {Tok: harnessResource(platformMod, "Environment")},
			"harness_platform_environment_clusters_mapping":  {Tok: harnessResource(platformMod, "EnvironmentClustersMapping")},
			"harness_platform_environment_service_overrides": {Tok: harnessResource(platformMod, "EnvironmentServiceOverrides")},
			"harness_platform_environment_group":             {Tok: harnessResource(platformMod, "EnvironmentGroup")},
			"harness_platform_gitops_agent":                  {Tok: harnessResource(platformMod, "GitOpsAgent")},
			"harness_platform_gitops_cluster":                {Tok: harnessResource(platformMod, "GitOpsCluster")},
			"harness_platform_gitops_repository":             {Tok: harnessResource(platformMod, "GitOpsRepository")},
			"harness_platform_infrastructure":                {Tok: harnessResource(platformMod, "Infrastructure")},
			"harness_platform_input_set":                     {Tok: harnessResource(platformMod, "InputSet")},
			"harness_platform_organization":                  {Tok: harnessResource(platformMod, "Organization")},
			"harness_platform_pipeline":                      {Tok: harnessResource(platformMod, "Pipeline")},
			"harness_platform_project":                       {Tok: harnessResource(platformMod, "Project")},
			"harness_platform_resource_group":                {Tok: harnessResource(platformMod, "ResourceGroup")},
			"harness_platform_roles":                         {Tok: harnessResource(platformMod, "Roles")},
			"harness_platform_role_assignments":              {Tok: harnessResource(platformMod, "RoleAssignments")},
			"harness_platform_secret_file":                   {Tok: harnessResource(platformMod, "SecretFile")},
			"harness_platform_secret_sshkey":                 {Tok: harnessResource(platformMod, "SecretSshkey")},
			"harness_platform_secret_text":                   {Tok: harnessResource(platformMod, "SecretText")},
			"harness_platform_service":                       {Tok: harnessResource(platformMod, "Service")},
			"harness_platform_service_account":               {Tok: harnessResource(platformMod, "ServiceAccount")},
			"harness_platform_triggers":                      {Tok: harnessResource(platformMod, "Triggers")},
			"harness_platform_usergroup":                     {Tok: harnessResource(platformMod, "Usergroup")},
			"harness_platform_variables":                     {Tok: harnessResource(platformMod, "Variables")},
			"harness_service_ami":                            {Tok: harnessResource(serviceMod, "Ami")},
			"harness_service_aws_codedeploy":                 {Tok: harnessResource(serviceMod, "Codedeploy")},
			"harness_service_aws_lambda":                     {Tok: harnessResource(serviceMod, "Lambda")},
			"harness_service_ecs":                            {Tok: harnessResource(serviceMod, "Ecs")},
			"harness_service_helm":                           {Tok: harnessResource(serviceMod, "Helm")},
			"harness_service_kubernetes":                     {Tok: harnessResource(serviceMod, "Kubernetes")},
			"harness_service_ssh":                            {Tok: harnessResource(serviceMod, "Ssh")},
			"harness_service_tanzu":                          {Tok: harnessResource(serviceMod, "Tanzu")},
			"harness_service_winrm":                          {Tok: harnessResource(serviceMod, "Winrm")},
			"harness_ssh_credential":                         {Tok: harnessResource(mainMod, "SshCredential")},
			"harness_user":                                   {Tok: harnessResource(mainMod, "User")},
			"harness_user_group":                             {Tok: harnessResource(mainMod, "UserGroup")},
			"harness_user_group_permissions":                 {Tok: harnessResource(mainMod, "UserGroupPermissions")},
			"harness_yaml_config":                            {Tok: harnessResource(mainMod, "YamlConfig")},
		},
		DataSources: map[string]*tfbridge.DataSourceInfo{
			"harness_application":     {Tok: harnessDataSource(mainMod, "getApplication")},
			"harness_current_account": {Tok: harnessDataSource(mainMod, "getCurrentAccount")},
			"harness_delegate":        {Tok: harnessDataSource(mainMod, "getDelegate")},
			"harness_delegate_ids":    {Tok: harnessDataSource(cloudProviderMod, "getDelegateIds")},
			"harness_encrypted_text":  {Tok: harnessDataSource(mainMod, "getEncryptedText")},
			"harness_delegate_ds":     {Tok: harnessDataSource(mainMod, "getDelegateDs")},
			//"harness_environment":                            {Tok: harnessDataSource(mainMod, "Environment")},
			//"harness_environment_service_overrides":         {Tok: harnessDataSource(mainMod, "EnvironmentServiceOverrides")},
			"harness_git_connector":                         {Tok: harnessDataSource(mainMod, "getGitConnector")},
			"harness_platform_connector_appdynamics":        {Tok: harnessDataSource(platformMod, "getAppDynamicsConnector")},
			"harness_platform_connector_artifactory":        {Tok: harnessDataSource(platformMod, "getArtifactoryConnector")},
			"harness_platform_connector_aws":                {Tok: harnessDataSource(platformMod, "getAwsConnector")},
			"harness_platform_connector_aws_secret_manager": {Tok: harnessDataSource(platformMod, "getAwsSecretManagerConnector")},
			"harness_platform_connector_awscc":              {Tok: harnessDataSource(platformMod, "getAwsCCConnector")},
			"harness_platform_connector_awskms":             {Tok: harnessDataSource(platformMod, "getAwsKmsConnector")},
			"harness_platform_connector_bitbucket":          {Tok: harnessDataSource(platformMod, "getBitbucketConnector")},
			"harness_platform_connector_datadog":            {Tok: harnessDataSource(platformMod, "getDatadogConnector")},
			"harness_platform_connector_docker":             {Tok: harnessDataSource(platformMod, "getDockerConnector")},
			"harness_platform_connector_dynatrace":          {Tok: harnessDataSource(platformMod, "getDynatraceConnector")},
			"harness_platform_connector_gcp":                {Tok: harnessDataSource(platformMod, "getGcpConnector")},
			"harness_platform_connector_git":                {Tok: harnessDataSource(platformMod, "getGitConnector")},
			"harness_platform_connector_github":             {Tok: harnessDataSource(platformMod, "getGithubConnector")},
			"harness_platform_connector_gitlab":             {Tok: harnessDataSource(platformMod, "getGitlabConnector")},
			"harness_platform_connector_helm":               {Tok: harnessDataSource(platformMod, "getHelmConnector")},
			"harness_platform_connector_jira":               {Tok: harnessDataSource(platformMod, "getJiraConnector")},
			"harness_platform_connector_kubernetes":         {Tok: harnessDataSource(platformMod, "getKubernetesConnector")},
			"harness_platform_connector_nexus":              {Tok: harnessDataSource(platformMod, "getNexusConnector")},
			"harness_platform_connector_pagerduty":          {Tok: harnessDataSource(platformMod, "getPagerdutyConnector")},
			"harness_platform_connector_prometheus":         {Tok: harnessDataSource(platformMod, "getPrometheusConnector")},
			"harness_platform_connector_splunk":             {Tok: harnessDataSource(platformMod, "getSplunkConnector")},
			"harness_platform_connector_sumologic":          {Tok: harnessDataSource(platformMod, "getSumologicConnector")},
			"harness_platform_connector_vault":              {Tok: harnessDataSource(platformMod, "getVaultConnector")},
			"harness_platform_current_user":                 {Tok: harnessDataSource(platformMod, "getCurrentUser")},
			"harness_platform_environment":                  {Tok: harnessDataSource(platformMod, "getEnvironment")},
			"harness_platform_environment_clusters_mapping": {Tok: harnessDataSource(platformMod, "getEnvironmentClustersMapping")},
			"harness_platform_environment_group":            {Tok: harnessDataSource(platformMod, "getEnvironmentGroup")},
			//"harness_platform_environment_service_overrides": {Tok: harnessDataSource(platformMod, "getEnvironmentServiceOverrides")},
			"harness_platform_gitops_agent":      {Tok: harnessDataSource(platformMod, "getGitopsAgent")},
			"harness_platform_gitops_cluster":    {Tok: harnessDataSource(platformMod, "getGitopsCluster")},
			"harness_platform_gitops_repository": {Tok: harnessDataSource(platformMod, "getGitopsRepository")},
			"harness_platform_infrastructure":    {Tok: harnessDataSource(platformMod, "getInfrastructure")},
			"harness_platform_input_set":         {Tok: harnessDataSource(platformMod, "getInputSet")},
			"harness_platform_organization":      {Tok: harnessDataSource(platformMod, "getOrganization")},
			"harness_platform_pipeline":          {Tok: harnessDataSource(platformMod, "getPipeline")},
			"harness_platform_permissions":       {Tok: harnessDataSource(platformMod, "getPermissions")},
			"harness_platform_project":           {Tok: harnessDataSource(platformMod, "getProject")},
			"harness_platform_resource_group":    {Tok: harnessDataSource(platformMod, "getResourceGroup")},
			"harness_platform_roles":             {Tok: harnessDataSource(platformMod, "getRoles")},
			"harness_platform_role_assignments":  {Tok: harnessDataSource(platformMod, "getRoleAssignments")},
			"harness_platform_secret_file":       {Tok: harnessDataSource(platformMod, "getSecretFile")},
			"harness_platform_secret_sshkey":     {Tok: harnessDataSource(platformMod, "getSecretSshkey")},
			"harness_platform_secret_text":       {Tok: harnessDataSource(platformMod, "getSecretText")},
			"harness_platform_service":           {Tok: harnessDataSource(platformMod, "getService")},
			"harness_platform_service_account":   {Tok: harnessDataSource(platformMod, "getServiceAccount")},
			"harness_platform_triggers":          {Tok: harnessDataSource(platformMod, "getTriggers")},
			"harness_platform_usergroup":         {Tok: harnessDataSource(platformMod, "getUsergroup")},
			//"harness_platform_variables":         {Tok: harnessDataSource(platformMod, "getVariables")},
			"harness_secret_manager": {Tok: harnessDataSource(mainMod, "getSecretManager")},
			"harness_service":        {Tok: harnessDataSource(mainMod, "getService")},
			"harness_ssh_credential": {Tok: harnessDataSource(mainMod, "getSshCredential")},
			"harness_sso_provider":   {Tok: harnessDataSource(mainMod, "getSsoProvider")},
			"harness_user":           {Tok: harnessDataSource(mainMod, "getUser")},
			"harness_user_group":     {Tok: harnessDataSource(mainMod, "getUserGroup")},
			"harness_yaml_config":    {Tok: harnessDataSource(mainMod, "getYamlConfig")},
		},
		JavaScript: &tfbridge.JavaScriptInfo{
			// List any npm dependencies and their versions
			Dependencies: map[string]string{
				"@pulumi/pulumi": "^3.0.0",
			},
			DevDependencies: map[string]string{
				"@types/node": "^10.0.0", // so we can access strongly typed node definitions.
				"@types/mime": "^2.0.0",
			},
			PackageName: "@lbrlabs/pulumi-harness",
		},
		Python: &tfbridge.PythonInfo{
			// List any Python dependencies and their version ranges
			Requires: map[string]string{
				"pulumi": ">=3.0.0,<4.0.0",
			},
			PackageName: "lbrlabs_pulumi_harness",
		},
		Golang: &tfbridge.GolangInfo{
			ImportBasePath: filepath.Join(
				fmt.Sprintf("github.com/lbrlabs/pulumi-%[1]s/sdk/", mainPkg),
				tfbridge.GetModuleMajorVersion(version.Version),
				"go",
				mainPkg,
			),
			GenerateResourceContainerTypes: true,
		},
		CSharp: &tfbridge.CSharpInfo{
			PackageReferences: map[string]string{
				"Pulumi": "3.*",
			},
			RootNamespace: "Lbrlabs.PulumiPackage",
		},
	}

	err := x.ComputeDefaults(&prov, x.TokensMappedModules("harness_", mainMod,
		map[string]string{
			"platform":      "platform",
			"cloudprovider": "cloudprovider",
			"service":       "service",
		}, x.MakeStandardToken(mainPkg)))
	contract.AssertNoErrorf(err, "failed to compute default token mappings")

	prov.SetAutonaming(255, "-")

	return prov
}
