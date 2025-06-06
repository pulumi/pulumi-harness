// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package platform

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-harness/sdk/go/harness/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Data source for retrieving a Harness Infrastructure.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-harness/sdk/go/harness/platform"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := platform.LookupInfrastructure(ctx, &platform.LookupInfrastructureArgs{
//				Identifier: "identifier",
//				Name:       pulumi.StringRef("name"),
//				OrgId:      pulumi.StringRef("org_id"),
//				ProjectId:  pulumi.StringRef("project_id"),
//				EnvId:      "env_id",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func LookupInfrastructure(ctx *pulumi.Context, args *LookupInfrastructureArgs, opts ...pulumi.InvokeOption) (*LookupInfrastructureResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupInfrastructureResult
	err := ctx.Invoke("harness:platform/getInfrastructure:getInfrastructure", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getInfrastructure.
type LookupInfrastructureArgs struct {
	// environment identifier.
	EnvId      string                       `pulumi:"envId"`
	GitDetails *GetInfrastructureGitDetails `pulumi:"gitDetails"`
	// Unique identifier of the resource.
	Identifier string `pulumi:"identifier"`
	// Name of the resource.
	Name *string `pulumi:"name"`
	// Unique identifier of the organization.
	OrgId *string `pulumi:"orgId"`
	// Unique identifier of the project.
	ProjectId *string `pulumi:"projectId"`
}

// A collection of values returned by getInfrastructure.
type LookupInfrastructureResult struct {
	// Infrastructure deployment type. Valid values are Kubernetes, NativeHelm, Ssh, WinRm, ServerlessAwsLambda, AzureWebApp, Custom, ECS.
	DeploymentType string `pulumi:"deploymentType"`
	// Description of the resource.
	Description string `pulumi:"description"`
	// environment identifier.
	EnvId      string                      `pulumi:"envId"`
	GitDetails GetInfrastructureGitDetails `pulumi:"gitDetails"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// Unique identifier of the resource.
	Identifier string `pulumi:"identifier"`
	// Name of the resource.
	Name *string `pulumi:"name"`
	// Unique identifier of the organization.
	OrgId *string `pulumi:"orgId"`
	// Unique identifier of the project.
	ProjectId *string `pulumi:"projectId"`
	// Tags to associate with the resource.
	Tags []string `pulumi:"tags"`
	// Type of Infrastructure. Valid values are KubernetesDirect, KubernetesGcp, ServerlessAwsLambda, Pdc, KubernetesAzure, SshWinRmAzure, SshWinRmAws, AzureWebApp, ECS, GitOps, CustomDeployment, TAS, KubernetesRancher, AWS_SAM.
	Type string `pulumi:"type"`
	// Infrastructure YAML
	Yaml string `pulumi:"yaml"`
}

func LookupInfrastructureOutput(ctx *pulumi.Context, args LookupInfrastructureOutputArgs, opts ...pulumi.InvokeOption) LookupInfrastructureResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (LookupInfrastructureResultOutput, error) {
			args := v.(LookupInfrastructureArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("harness:platform/getInfrastructure:getInfrastructure", args, LookupInfrastructureResultOutput{}, options).(LookupInfrastructureResultOutput), nil
		}).(LookupInfrastructureResultOutput)
}

// A collection of arguments for invoking getInfrastructure.
type LookupInfrastructureOutputArgs struct {
	// environment identifier.
	EnvId      pulumi.StringInput                  `pulumi:"envId"`
	GitDetails GetInfrastructureGitDetailsPtrInput `pulumi:"gitDetails"`
	// Unique identifier of the resource.
	Identifier pulumi.StringInput `pulumi:"identifier"`
	// Name of the resource.
	Name pulumi.StringPtrInput `pulumi:"name"`
	// Unique identifier of the organization.
	OrgId pulumi.StringPtrInput `pulumi:"orgId"`
	// Unique identifier of the project.
	ProjectId pulumi.StringPtrInput `pulumi:"projectId"`
}

func (LookupInfrastructureOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupInfrastructureArgs)(nil)).Elem()
}

// A collection of values returned by getInfrastructure.
type LookupInfrastructureResultOutput struct{ *pulumi.OutputState }

func (LookupInfrastructureResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupInfrastructureResult)(nil)).Elem()
}

func (o LookupInfrastructureResultOutput) ToLookupInfrastructureResultOutput() LookupInfrastructureResultOutput {
	return o
}

func (o LookupInfrastructureResultOutput) ToLookupInfrastructureResultOutputWithContext(ctx context.Context) LookupInfrastructureResultOutput {
	return o
}

// Infrastructure deployment type. Valid values are Kubernetes, NativeHelm, Ssh, WinRm, ServerlessAwsLambda, AzureWebApp, Custom, ECS.
func (o LookupInfrastructureResultOutput) DeploymentType() pulumi.StringOutput {
	return o.ApplyT(func(v LookupInfrastructureResult) string { return v.DeploymentType }).(pulumi.StringOutput)
}

// Description of the resource.
func (o LookupInfrastructureResultOutput) Description() pulumi.StringOutput {
	return o.ApplyT(func(v LookupInfrastructureResult) string { return v.Description }).(pulumi.StringOutput)
}

// environment identifier.
func (o LookupInfrastructureResultOutput) EnvId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupInfrastructureResult) string { return v.EnvId }).(pulumi.StringOutput)
}

func (o LookupInfrastructureResultOutput) GitDetails() GetInfrastructureGitDetailsOutput {
	return o.ApplyT(func(v LookupInfrastructureResult) GetInfrastructureGitDetails { return v.GitDetails }).(GetInfrastructureGitDetailsOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupInfrastructureResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupInfrastructureResult) string { return v.Id }).(pulumi.StringOutput)
}

// Unique identifier of the resource.
func (o LookupInfrastructureResultOutput) Identifier() pulumi.StringOutput {
	return o.ApplyT(func(v LookupInfrastructureResult) string { return v.Identifier }).(pulumi.StringOutput)
}

// Name of the resource.
func (o LookupInfrastructureResultOutput) Name() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupInfrastructureResult) *string { return v.Name }).(pulumi.StringPtrOutput)
}

// Unique identifier of the organization.
func (o LookupInfrastructureResultOutput) OrgId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupInfrastructureResult) *string { return v.OrgId }).(pulumi.StringPtrOutput)
}

// Unique identifier of the project.
func (o LookupInfrastructureResultOutput) ProjectId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupInfrastructureResult) *string { return v.ProjectId }).(pulumi.StringPtrOutput)
}

// Tags to associate with the resource.
func (o LookupInfrastructureResultOutput) Tags() pulumi.StringArrayOutput {
	return o.ApplyT(func(v LookupInfrastructureResult) []string { return v.Tags }).(pulumi.StringArrayOutput)
}

// Type of Infrastructure. Valid values are KubernetesDirect, KubernetesGcp, ServerlessAwsLambda, Pdc, KubernetesAzure, SshWinRmAzure, SshWinRmAws, AzureWebApp, ECS, GitOps, CustomDeployment, TAS, KubernetesRancher, AWS_SAM.
func (o LookupInfrastructureResultOutput) Type() pulumi.StringOutput {
	return o.ApplyT(func(v LookupInfrastructureResult) string { return v.Type }).(pulumi.StringOutput)
}

// Infrastructure YAML
func (o LookupInfrastructureResultOutput) Yaml() pulumi.StringOutput {
	return o.ApplyT(func(v LookupInfrastructureResult) string { return v.Yaml }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupInfrastructureResultOutput{})
}
