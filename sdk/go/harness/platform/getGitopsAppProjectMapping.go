// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package platform

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-harness/sdk/go/harness/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Resource for managing the Harness GitOps Application Project Mappings.
func LookupGitopsAppProjectMapping(ctx *pulumi.Context, args *LookupGitopsAppProjectMappingArgs, opts ...pulumi.InvokeOption) (*LookupGitopsAppProjectMappingResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupGitopsAppProjectMappingResult
	err := ctx.Invoke("harness:platform/getGitopsAppProjectMapping:getGitopsAppProjectMapping", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getGitopsAppProjectMapping.
type LookupGitopsAppProjectMappingArgs struct {
	// Account identifier of the GitOps agent's Application Project.
	//
	// Deprecated: This field is deprecated and will be removed in a future release.
	AccountId *string `pulumi:"accountId"`
	// Agent identifier for which the ArgoCD and Harness project mapping is to be created.
	AgentId string `pulumi:"agentId"`
	// ArgoCD Project name which is to be mapped to the Harness project.
	ArgoProjectName string `pulumi:"argoProjectName"`
	// Organization identifier of the GitOps agent's Application Project.
	OrgId string `pulumi:"orgId"`
	// Project identifier of the GitOps agent's Application Project.
	ProjectId string `pulumi:"projectId"`
}

// A collection of values returned by getGitopsAppProjectMapping.
type LookupGitopsAppProjectMappingResult struct {
	// Account identifier of the GitOps agent's Application Project.
	//
	// Deprecated: This field is deprecated and will be removed in a future release.
	AccountId string `pulumi:"accountId"`
	// Agent identifier for which the ArgoCD and Harness project mapping is to be created.
	AgentId string `pulumi:"agentId"`
	// ArgoCD Project name which is to be mapped to the Harness project.
	ArgoProjectName string `pulumi:"argoProjectName"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// Identifier of the GitOps Application Project.
	Identifier string `pulumi:"identifier"`
	// Organization identifier of the GitOps agent's Application Project.
	OrgId string `pulumi:"orgId"`
	// Project identifier of the GitOps agent's Application Project.
	ProjectId string `pulumi:"projectId"`
}

func LookupGitopsAppProjectMappingOutput(ctx *pulumi.Context, args LookupGitopsAppProjectMappingOutputArgs, opts ...pulumi.InvokeOption) LookupGitopsAppProjectMappingResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (LookupGitopsAppProjectMappingResultOutput, error) {
			args := v.(LookupGitopsAppProjectMappingArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("harness:platform/getGitopsAppProjectMapping:getGitopsAppProjectMapping", args, LookupGitopsAppProjectMappingResultOutput{}, options).(LookupGitopsAppProjectMappingResultOutput), nil
		}).(LookupGitopsAppProjectMappingResultOutput)
}

// A collection of arguments for invoking getGitopsAppProjectMapping.
type LookupGitopsAppProjectMappingOutputArgs struct {
	// Account identifier of the GitOps agent's Application Project.
	//
	// Deprecated: This field is deprecated and will be removed in a future release.
	AccountId pulumi.StringPtrInput `pulumi:"accountId"`
	// Agent identifier for which the ArgoCD and Harness project mapping is to be created.
	AgentId pulumi.StringInput `pulumi:"agentId"`
	// ArgoCD Project name which is to be mapped to the Harness project.
	ArgoProjectName pulumi.StringInput `pulumi:"argoProjectName"`
	// Organization identifier of the GitOps agent's Application Project.
	OrgId pulumi.StringInput `pulumi:"orgId"`
	// Project identifier of the GitOps agent's Application Project.
	ProjectId pulumi.StringInput `pulumi:"projectId"`
}

func (LookupGitopsAppProjectMappingOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupGitopsAppProjectMappingArgs)(nil)).Elem()
}

// A collection of values returned by getGitopsAppProjectMapping.
type LookupGitopsAppProjectMappingResultOutput struct{ *pulumi.OutputState }

func (LookupGitopsAppProjectMappingResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupGitopsAppProjectMappingResult)(nil)).Elem()
}

func (o LookupGitopsAppProjectMappingResultOutput) ToLookupGitopsAppProjectMappingResultOutput() LookupGitopsAppProjectMappingResultOutput {
	return o
}

func (o LookupGitopsAppProjectMappingResultOutput) ToLookupGitopsAppProjectMappingResultOutputWithContext(ctx context.Context) LookupGitopsAppProjectMappingResultOutput {
	return o
}

// Account identifier of the GitOps agent's Application Project.
//
// Deprecated: This field is deprecated and will be removed in a future release.
func (o LookupGitopsAppProjectMappingResultOutput) AccountId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupGitopsAppProjectMappingResult) string { return v.AccountId }).(pulumi.StringOutput)
}

// Agent identifier for which the ArgoCD and Harness project mapping is to be created.
func (o LookupGitopsAppProjectMappingResultOutput) AgentId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupGitopsAppProjectMappingResult) string { return v.AgentId }).(pulumi.StringOutput)
}

// ArgoCD Project name which is to be mapped to the Harness project.
func (o LookupGitopsAppProjectMappingResultOutput) ArgoProjectName() pulumi.StringOutput {
	return o.ApplyT(func(v LookupGitopsAppProjectMappingResult) string { return v.ArgoProjectName }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupGitopsAppProjectMappingResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupGitopsAppProjectMappingResult) string { return v.Id }).(pulumi.StringOutput)
}

// Identifier of the GitOps Application Project.
func (o LookupGitopsAppProjectMappingResultOutput) Identifier() pulumi.StringOutput {
	return o.ApplyT(func(v LookupGitopsAppProjectMappingResult) string { return v.Identifier }).(pulumi.StringOutput)
}

// Organization identifier of the GitOps agent's Application Project.
func (o LookupGitopsAppProjectMappingResultOutput) OrgId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupGitopsAppProjectMappingResult) string { return v.OrgId }).(pulumi.StringOutput)
}

// Project identifier of the GitOps agent's Application Project.
func (o LookupGitopsAppProjectMappingResultOutput) ProjectId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupGitopsAppProjectMappingResult) string { return v.ProjectId }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupGitopsAppProjectMappingResultOutput{})
}
