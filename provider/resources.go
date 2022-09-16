package harness

import (
	"fmt"
	"path/filepath"
	"unicode"

	harnessShim "github.com/harness/terraform-provider-harness/shim"
	"github.com/lbrlabs/pulumi-harness/provider/pkg/version"
	"github.com/pulumi/pulumi-terraform-bridge/v3/pkg/tfbridge"
	shim "github.com/pulumi/pulumi-terraform-bridge/v3/pkg/tfshim"
	shimv2 "github.com/pulumi/pulumi-terraform-bridge/v3/pkg/tfshim/sdk-v2"
	"github.com/pulumi/pulumi/sdk/v3/go/common/resource"
	"github.com/pulumi/pulumi/sdk/v3/go/common/tokens"
)

// all of the token components used below.
const (
	mainPkg = "harness"
	mainMod = "index"
	//applicationMod       = "Application"
	cloudProviderMod     = "Cloudprovider"
	platformConnectorMod = "PlatformConnector"
	platformMod          = "Platform"
	serviceMod           = "Service"
)

func preConfigureCallback(vars resource.PropertyMap, c shim.ResourceConfig) error {
	return nil
}

// harnessMember manufactures a type token for the Harness package and the given module and type.
func harnessMember(mod string, mem string) tokens.ModuleMember {
	return tokens.ModuleMember(mainPkg + ":" + mod + ":" + mem)
}

// harnessType manufactures a type token for the Launch Darkly package and the given module and type.
func harnessType(mod string, typ string) tokens.Type {
	return tokens.Type(harnessMember(mod, typ))
}

// harnessDataSource manufactures a standard resource token given a module and resource name.
// It automatically uses the Launch Darkly package and names the file by simply lower casing the data
// source's first character.
func harnessDataSource(mod string, res string) tokens.ModuleMember {
	fn := string(unicode.ToLower(rune(res[0]))) + res[1:]
	return harnessMember(mod+"/"+fn, res)
}

// harnessResource manufactures a standard resource token given a module and resource name.
// It automatically uses the Launch Darkly package and names the file by simply lower casing the resource's
// first character.
func harnessResource(mod string, res string) tokens.Type {
	fn := string(unicode.ToLower(rune(res[0]))) + res[1:]
	return harnessType(mod+"/"+fn, res)
}

// Provider returns additional overlaid schema and metadata associated with the provider..
func Provider() tfbridge.ProviderInfo {
	p := shimv2.NewProvider(harnessShim.NewProvider())

	// Create a Pulumi provider mapping
	prov := tfbridge.ProviderInfo{
		P:                    p,
		Name:                 "harness",
		DisplayName:          "Harness",
		Publisher:            "lbrlabs",
		LogoURL:              "",
		PluginDownloadURL:    "github://api.github.com/lbrlabs",
		Description:          "A Pulumi package for creating and managing Harness  resources.",
		Keywords:             []string{"pulumi", "harness", "lbrlabs"},
		License:              "Apache-2.0",
		Homepage:             "https://www.pulumi.com",
		Repository:           "https://github.com/lbrlabs/pulumi-harness",
		GitHubOrg:            "harness",
		Config:               map[string]*tfbridge.SchemaInfo{},
		PreConfigureCallback: preConfigureCallback,
		IgnoreMappings: []string{
			"harness_user_group_permissions",
		},
		Resources: map[string]*tfbridge.ResourceInfo{
			"harness_add_user_to_group":                     {Tok: harnessResource(mainMod, "AddUserToGroup")},
			"harness_application":                           {Tok: harnessResource(mainMod, "Application")},
			"harness_application_gitsync":                   {Tok: harnessResource(mainMod, "ApplicationGitSync")},
			"harness_cloudprovider_aws":                     {Tok: harnessResource(cloudProviderMod, "Aws")},
			"harness_cloudprovider_azure":                   {Tok: harnessResource(cloudProviderMod, "Azure")},
			"harness_cloudprovider_datacenter":              {Tok: harnessResource(cloudProviderMod, "Datacenter")},
			"harness_cloudprovider_gcp":                     {Tok: harnessResource(cloudProviderMod, "Gcp")},
			"harness_cloudprovider_kubernetes":              {Tok: harnessResource(cloudProviderMod, "Kubernetes")},
			"harness_cloudprovider_spot":                    {Tok: harnessResource(cloudProviderMod, "Spot")},
			"harness_cloudprovider_tanzu":                   {Tok: harnessResource(cloudProviderMod, "Tanzu")},
			"harness_delegate_approval":                     {Tok: harnessResource(mainMod, "DelegateApproval")},
			"harness_encrypted_text":                        {Tok: harnessResource(mainMod, "EncryptedText")},
			"harness_environment":                           {Tok: harnessResource(mainMod, "Environment")},
			"harness_git_connector":                         {Tok: harnessResource(mainMod, "GitConnector")},
			"harness_infrastructure_definition":             {Tok: harnessResource(mainMod, "InfrastructureDefinition")},
			"harness_platform_connector_appdynamics":        {Tok: harnessResource(platformConnectorMod, "AppDynamics")},
			"harness_platform_connector_artifactory":        {Tok: harnessResource(platformConnectorMod, "Artifactory")},
			"harness_platform_connector_aws":                {Tok: harnessResource(platformConnectorMod, "Aws")},
			"harness_platform_connector_aws_secret_manager": {Tok: harnessResource(platformConnectorMod, "AwsSecretManager")},
			"harness_platform_connector_awscc":              {Tok: harnessResource(platformConnectorMod, "AwsCC")},
			"harness_platform_connector_awskms":             {Tok: harnessResource(platformConnectorMod, "AwsKms")},
			"harness_platform_connector_bitbucket":          {Tok: harnessResource(platformConnectorMod, "Bitbucket")},
			"harness_platform_connector_datadog":            {Tok: harnessResource(platformConnectorMod, "Datadog")},
			"harness_platform_connector_docker":             {Tok: harnessResource(platformConnectorMod, "Docker")},
			"harness_platform_connector_dynatrace":          {Tok: harnessResource(platformConnectorMod, "Dynatrace")},
			"harness_platform_connector_gcp":                {Tok: harnessResource(platformConnectorMod, "Gcp")},
			"harness_platform_connector_git":                {Tok: harnessResource(platformConnectorMod, "Git")},
			"harness_platform_connector_github":             {Tok: harnessResource(platformConnectorMod, "Github")},
			"harness_platform_connector_gitlab":             {Tok: harnessResource(platformConnectorMod, "Gitlab")},
			"harness_platform_connector_helm":               {Tok: harnessResource(platformConnectorMod, "Helm")},
			"harness_platform_connector_jira":               {Tok: harnessResource(platformConnectorMod, "Jira")},
			"harness_platform_connector_kubernetes":         {Tok: harnessResource(platformConnectorMod, "Kubernetes")},
			"harness_platform_connector_newrelic":           {Tok: harnessResource(platformConnectorMod, "Newrelic")},
			"harness_platform_connector_nexus":              {Tok: harnessResource(platformConnectorMod, "Nexus")},
			"harness_platform_connector_pagerduty":          {Tok: harnessResource(platformConnectorMod, "Pagerduty")},
			"harness_platform_connector_prometheus":         {Tok: harnessResource(platformConnectorMod, "Prometheus")},
			"harness_platform_connector_splunk":             {Tok: harnessResource(platformConnectorMod, "Splunk")},
			"harness_platform_connector_sumologic":          {Tok: harnessResource(platformConnectorMod, "Sumologic")},
			"harness_platform_environment":                  {Tok: harnessResource(platformMod, "Environment")},
			"harness_platform_input_set":                    {Tok: harnessResource(platformMod, "InputSet")},
			"harness_platform_organization":                 {Tok: harnessResource(platformMod, "Organization")},
			"harness_platform_pipeline":                     {Tok: harnessResource(platformMod, "Pipeline")},
			"harness_platform_project":                      {Tok: harnessResource(platformMod, "Project")},
			"harness_platform_resource_group":               {Tok: harnessResource(platformMod, "ResourceGroup")},
			"harness_platform_roles":                        {Tok: harnessResource(platformMod, "Roles")},
			"harness_platform_secret_file":                  {Tok: harnessResource(platformMod, "SecretFile")},
			"harness_platform_secret_sshkey":                {Tok: harnessResource(platformMod, "SecretSshkey")},
			"harness_platform_secret_text":                  {Tok: harnessResource(platformMod, "SecretText")},
			"harness_platform_service":                      {Tok: harnessResource(platformMod, "Service")},
			"harness_platform_service_account":              {Tok: harnessResource(platformMod, "ServiceAccount")},
			"harness_platform_triggers":                     {Tok: harnessResource(platformMod, "Triggers")},
			"harness_platform_usergroup":                    {Tok: harnessResource(platformMod, "Usergroup")},
			"harness_service_ami":                           {Tok: harnessResource(serviceMod, "Ami")},
			"harness_service_aws_codedeploy":                {Tok: harnessResource(serviceMod, "Codedeploy")},
			"harness_service_aws_lambda":                    {Tok: harnessResource(serviceMod, "Lambda")},
			"harness_service_ecs":                           {Tok: harnessResource(serviceMod, "Ecs")},
			"harness_service_helm":                          {Tok: harnessResource(serviceMod, "Helm")},
			"harness_service_kubernetes":                    {Tok: harnessResource(serviceMod, "Kubernetes")},
			"harness_service_ssh":                           {Tok: harnessResource(serviceMod, "Ssh")},
			"harness_service_tanzu":                         {Tok: harnessResource(serviceMod, "Tanzu")},
			"harness_service_winrm":                         {Tok: harnessResource(serviceMod, "Winrm")},
			"harness_ssh_credential":                        {Tok: harnessResource(mainMod, "SshCredential")},
			"harness_user":                                  {Tok: harnessResource(mainMod, "User")},
			"harness_user_group":                            {Tok: harnessResource(mainMod, "UserGroup")},
			// "harness_user_group_permissions":                {Tok: harnessResource(mainMod, "UserGroupPermissions")},
			"harness_yaml_config": {Tok: harnessResource(mainMod, "YamlConfig")},
		},
		DataSources: map[string]*tfbridge.DataSourceInfo{
			"harness_application":     {Tok: harnessDataSource(mainMod, "getApplication")},
			"harness_current_account": {Tok: harnessDataSource(mainMod, "getCurrentAccount")},
			"harness_delegate":        {Tok: harnessDataSource(mainMod, "getDelegate")},
			"harness_delegate_ids":    {Tok: harnessDataSource(cloudProviderMod, "getDelegateIds")},
			"harness_encrypted_text":  {Tok: harnessDataSource(mainMod, "getEncryptedText")},
			// "harness_environment":                           {Tok: harnessDataSource(mainMod, "Environment")},
			"harness_git_connector":                         {Tok: harnessDataSource(mainMod, "getGitConnector")},
			"harness_platform_connector_appdynamics":        {Tok: harnessDataSource(platformConnectorMod, "getAppDynamics")},
			"harness_platform_connector_artifactory":        {Tok: harnessDataSource(platformConnectorMod, "getArtifactory")},
			"harness_platform_connector_aws":                {Tok: harnessDataSource(platformConnectorMod, "getAws")},
			"harness_platform_connector_aws_secret_manager": {Tok: harnessDataSource(platformConnectorMod, "getAwsSecretManager")},
			"harness_platform_connector_awscc":              {Tok: harnessDataSource(platformConnectorMod, "getAwsCC")},
			"harness_platform_connector_awskms":             {Tok: harnessDataSource(platformConnectorMod, "getAwsKms")},
			"harness_platform_connector_bitbucket":          {Tok: harnessDataSource(platformConnectorMod, "getBitbucket")},
			"harness_platform_connector_datadog":            {Tok: harnessDataSource(platformConnectorMod, "getDatadog")},
			"harness_platform_connector_docker":             {Tok: harnessDataSource(platformConnectorMod, "getDocker")},
			"harness_platform_connector_dynatrace":          {Tok: harnessDataSource(platformConnectorMod, "getDynatrace")},
			"harness_platform_connector_gcp":                {Tok: harnessDataSource(platformConnectorMod, "getGcp")},
			"harness_platform_connector_git":                {Tok: harnessDataSource(platformConnectorMod, "getGit")},
			"harness_platform_connector_github":             {Tok: harnessDataSource(platformConnectorMod, "getGithub")},
			"harness_platform_connector_gitlab":             {Tok: harnessDataSource(platformConnectorMod, "getGitlab")},
			"harness_platform_connector_helm":               {Tok: harnessDataSource(platformConnectorMod, "getHelm")},
			"harness_platform_connector_jira":               {Tok: harnessDataSource(platformConnectorMod, "getJira")},
			"harness_platform_connector_kubernetes":         {Tok: harnessDataSource(platformConnectorMod, "getKubernetes")},
			"harness_platform_connector_nexus":              {Tok: harnessDataSource(platformConnectorMod, "getNexus")},
			"harness_platform_connector_pagerduty":          {Tok: harnessDataSource(platformConnectorMod, "getPagerduty")},
			"harness_platform_connector_prometheus":         {Tok: harnessDataSource(platformConnectorMod, "getPrometheus")},
			"harness_platform_connector_splunk":             {Tok: harnessDataSource(platformConnectorMod, "getSplunk")},
			"harness_platform_connector_sumologic":          {Tok: harnessDataSource(platformConnectorMod, "getSumologic")},
			"harness_platform_current_user":                 {Tok: harnessDataSource(platformMod, "getCurrentUser")},
			"harness_platform_environment":                  {Tok: harnessDataSource(platformMod, "getEnvironment")},
			"harness_platform_input_set":                    {Tok: harnessDataSource(platformMod, "getInputSet")},
			"harness_platform_organization":                 {Tok: harnessDataSource(platformMod, "getOrganization")},
			"harness_platform_pipeline":                     {Tok: harnessDataSource(platformMod, "getPipeline")},
			"harness_platform_project":                      {Tok: harnessDataSource(platformMod, "getProject")},
			"harness_platform_resource_group":               {Tok: harnessDataSource(platformMod, "getResourceGroup")},
			"harness_platform_roles":                        {Tok: harnessDataSource(platformMod, "getRoles")},
			"harness_platform_secret_file":                  {Tok: harnessDataSource(platformMod, "getSecretFile")},
			"harness_platform_secret_sshkey":                {Tok: harnessDataSource(platformMod, "getSecretSshkey")},
			"harness_platform_secret_text":                  {Tok: harnessDataSource(platformMod, "getSecretText")},
			"harness_platform_service":                      {Tok: harnessDataSource(platformMod, "getService")},
			"harness_platform_service_account":              {Tok: harnessDataSource(platformMod, "getServiceAccount")},
			"harness_platform_triggers":                     {Tok: harnessDataSource(platformMod, "getTriggers")},
			"harness_platform_usergroup":                    {Tok: harnessDataSource(platformMod, "getUsergroup")},
			"harness_secret_manager":                        {Tok: harnessDataSource(mainMod, "getSecretManager")},
			"harness_service":                               {Tok: harnessDataSource(mainMod, "getService")},
			"harness_ssh_credential":                        {Tok: harnessDataSource(mainMod, "getSshCredential")},
			"harness_sso_provider":                          {Tok: harnessDataSource(mainMod, "getSsoProvider")},
			"harness_user":                                  {Tok: harnessDataSource(mainMod, "getUser")},
			"harness_user_group":                            {Tok: harnessDataSource(mainMod, "getUserGroup")},
			"harness_yaml_config":                           {Tok: harnessDataSource(mainMod, "getYamlConfig")},
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

	prov.SetAutonaming(255, "-")

	return prov
}
