// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package platform

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-harness/sdk/go/harness/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Data Source for fetching a Harness GitOps Repository.
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
//			_, err := platform.GetGitopsRepository(ctx, &platform.GetGitopsRepositoryArgs{
//				Identifier: "identifier",
//				AccountId:  "account_id",
//				ProjectId:  pulumi.StringRef("project_id"),
//				OrgId:      pulumi.StringRef("org_id"),
//				AgentId:    "agent_id",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func GetGitopsRepository(ctx *pulumi.Context, args *GetGitopsRepositoryArgs, opts ...pulumi.InvokeOption) (*GetGitopsRepositoryResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetGitopsRepositoryResult
	err := ctx.Invoke("harness:platform/getGitopsRepository:getGitopsRepository", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getGitopsRepository.
type GetGitopsRepositoryArgs struct {
	// Account identifier of the GitOps repository.
	AccountId string `pulumi:"accountId"`
	// Agent identifier of the GitOps repository.
	AgentId string `pulumi:"agentId"`
	// Indicates if to operate on credential set instead of repository.
	CredsOnly *bool `pulumi:"credsOnly"`
	// Identifier of the GitOps repository.
	Identifier string `pulumi:"identifier"`
	// Organization identifier of the GitOps repository.
	OrgId *string `pulumi:"orgId"`
	// Project identifier of the GitOps repository.
	ProjectId *string `pulumi:"projectId"`
	// Indicates to force refresh query for repository.
	QueryForceRefresh *bool `pulumi:"queryForceRefresh"`
	// Project to query for the GitOps repo.
	QueryProject *string `pulumi:"queryProject"`
	// GitOps repository to query.
	QueryRepo *string `pulumi:"queryRepo"`
	// Update mask of the repository.
	UpdateMasks []GetGitopsRepositoryUpdateMask `pulumi:"updateMasks"`
	// Indicates if the GitOps repository should be updated if existing and inserted if not.
	Upsert *bool `pulumi:"upsert"`
}

// A collection of values returned by getGitopsRepository.
type GetGitopsRepositoryResult struct {
	// Account identifier of the GitOps repository.
	AccountId string `pulumi:"accountId"`
	// Agent identifier of the GitOps repository.
	AgentId string `pulumi:"agentId"`
	// Indicates if to operate on credential set instead of repository.
	CredsOnly *bool `pulumi:"credsOnly"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// Identifier of the GitOps repository.
	Identifier string `pulumi:"identifier"`
	// Organization identifier of the GitOps repository.
	OrgId *string `pulumi:"orgId"`
	// Project identifier of the GitOps repository.
	ProjectId *string `pulumi:"projectId"`
	// Indicates to force refresh query for repository.
	QueryForceRefresh *bool `pulumi:"queryForceRefresh"`
	// Project to query for the GitOps repo.
	QueryProject *string `pulumi:"queryProject"`
	// GitOps repository to query.
	QueryRepo *string `pulumi:"queryRepo"`
	// Repo details holding application configurations.
	Repos []GetGitopsRepositoryRepo `pulumi:"repos"`
	// Update mask of the repository.
	UpdateMasks []GetGitopsRepositoryUpdateMask `pulumi:"updateMasks"`
	// Indicates if the GitOps repository should be updated if existing and inserted if not.
	Upsert *bool `pulumi:"upsert"`
}

func GetGitopsRepositoryOutput(ctx *pulumi.Context, args GetGitopsRepositoryOutputArgs, opts ...pulumi.InvokeOption) GetGitopsRepositoryResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetGitopsRepositoryResult, error) {
			args := v.(GetGitopsRepositoryArgs)
			r, err := GetGitopsRepository(ctx, &args, opts...)
			var s GetGitopsRepositoryResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetGitopsRepositoryResultOutput)
}

// A collection of arguments for invoking getGitopsRepository.
type GetGitopsRepositoryOutputArgs struct {
	// Account identifier of the GitOps repository.
	AccountId pulumi.StringInput `pulumi:"accountId"`
	// Agent identifier of the GitOps repository.
	AgentId pulumi.StringInput `pulumi:"agentId"`
	// Indicates if to operate on credential set instead of repository.
	CredsOnly pulumi.BoolPtrInput `pulumi:"credsOnly"`
	// Identifier of the GitOps repository.
	Identifier pulumi.StringInput `pulumi:"identifier"`
	// Organization identifier of the GitOps repository.
	OrgId pulumi.StringPtrInput `pulumi:"orgId"`
	// Project identifier of the GitOps repository.
	ProjectId pulumi.StringPtrInput `pulumi:"projectId"`
	// Indicates to force refresh query for repository.
	QueryForceRefresh pulumi.BoolPtrInput `pulumi:"queryForceRefresh"`
	// Project to query for the GitOps repo.
	QueryProject pulumi.StringPtrInput `pulumi:"queryProject"`
	// GitOps repository to query.
	QueryRepo pulumi.StringPtrInput `pulumi:"queryRepo"`
	// Update mask of the repository.
	UpdateMasks GetGitopsRepositoryUpdateMaskArrayInput `pulumi:"updateMasks"`
	// Indicates if the GitOps repository should be updated if existing and inserted if not.
	Upsert pulumi.BoolPtrInput `pulumi:"upsert"`
}

func (GetGitopsRepositoryOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetGitopsRepositoryArgs)(nil)).Elem()
}

// A collection of values returned by getGitopsRepository.
type GetGitopsRepositoryResultOutput struct{ *pulumi.OutputState }

func (GetGitopsRepositoryResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetGitopsRepositoryResult)(nil)).Elem()
}

func (o GetGitopsRepositoryResultOutput) ToGetGitopsRepositoryResultOutput() GetGitopsRepositoryResultOutput {
	return o
}

func (o GetGitopsRepositoryResultOutput) ToGetGitopsRepositoryResultOutputWithContext(ctx context.Context) GetGitopsRepositoryResultOutput {
	return o
}

// Account identifier of the GitOps repository.
func (o GetGitopsRepositoryResultOutput) AccountId() pulumi.StringOutput {
	return o.ApplyT(func(v GetGitopsRepositoryResult) string { return v.AccountId }).(pulumi.StringOutput)
}

// Agent identifier of the GitOps repository.
func (o GetGitopsRepositoryResultOutput) AgentId() pulumi.StringOutput {
	return o.ApplyT(func(v GetGitopsRepositoryResult) string { return v.AgentId }).(pulumi.StringOutput)
}

// Indicates if to operate on credential set instead of repository.
func (o GetGitopsRepositoryResultOutput) CredsOnly() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v GetGitopsRepositoryResult) *bool { return v.CredsOnly }).(pulumi.BoolPtrOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetGitopsRepositoryResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetGitopsRepositoryResult) string { return v.Id }).(pulumi.StringOutput)
}

// Identifier of the GitOps repository.
func (o GetGitopsRepositoryResultOutput) Identifier() pulumi.StringOutput {
	return o.ApplyT(func(v GetGitopsRepositoryResult) string { return v.Identifier }).(pulumi.StringOutput)
}

// Organization identifier of the GitOps repository.
func (o GetGitopsRepositoryResultOutput) OrgId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetGitopsRepositoryResult) *string { return v.OrgId }).(pulumi.StringPtrOutput)
}

// Project identifier of the GitOps repository.
func (o GetGitopsRepositoryResultOutput) ProjectId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetGitopsRepositoryResult) *string { return v.ProjectId }).(pulumi.StringPtrOutput)
}

// Indicates to force refresh query for repository.
func (o GetGitopsRepositoryResultOutput) QueryForceRefresh() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v GetGitopsRepositoryResult) *bool { return v.QueryForceRefresh }).(pulumi.BoolPtrOutput)
}

// Project to query for the GitOps repo.
func (o GetGitopsRepositoryResultOutput) QueryProject() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetGitopsRepositoryResult) *string { return v.QueryProject }).(pulumi.StringPtrOutput)
}

// GitOps repository to query.
func (o GetGitopsRepositoryResultOutput) QueryRepo() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetGitopsRepositoryResult) *string { return v.QueryRepo }).(pulumi.StringPtrOutput)
}

// Repo details holding application configurations.
func (o GetGitopsRepositoryResultOutput) Repos() GetGitopsRepositoryRepoArrayOutput {
	return o.ApplyT(func(v GetGitopsRepositoryResult) []GetGitopsRepositoryRepo { return v.Repos }).(GetGitopsRepositoryRepoArrayOutput)
}

// Update mask of the repository.
func (o GetGitopsRepositoryResultOutput) UpdateMasks() GetGitopsRepositoryUpdateMaskArrayOutput {
	return o.ApplyT(func(v GetGitopsRepositoryResult) []GetGitopsRepositoryUpdateMask { return v.UpdateMasks }).(GetGitopsRepositoryUpdateMaskArrayOutput)
}

// Indicates if the GitOps repository should be updated if existing and inserted if not.
func (o GetGitopsRepositoryResultOutput) Upsert() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v GetGitopsRepositoryResult) *bool { return v.Upsert }).(pulumi.BoolPtrOutput)
}

func init() {
	pulumi.RegisterOutputType(GetGitopsRepositoryResultOutput{})
}
