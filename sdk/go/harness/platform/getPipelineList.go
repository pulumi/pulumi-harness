// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package platform

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-harness/sdk/go/harness/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Data source for retrieving a Harness pipeline list.
//
// ## Example Usage
//
// ### Without the Pagination
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
//			_, err := platform.GetPipelineList(ctx, &platform.GetPipelineListArgs{
//				OrgId:     "org_id",
//				ProjectId: "project_id",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
//
// ### With Pagination Logic
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
//			_, err := platform.GetPipelineList(ctx, &platform.GetPipelineListArgs{
//				OrgId:     "org_id",
//				ProjectId: "project_id",
//				Page:      pulumi.IntRef(1),
//				Limit:     pulumi.IntRef(4),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func GetPipelineList(ctx *pulumi.Context, args *GetPipelineListArgs, opts ...pulumi.InvokeOption) (*GetPipelineListResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetPipelineListResult
	err := ctx.Invoke("harness:platform/getPipelineList:getPipelineList", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getPipelineList.
type GetPipelineListArgs struct {
	Identifier *string `pulumi:"identifier"`
	// Optional pagination parameter indicating the maximum number of entities to retrieve per page.
	Limit *int    `pulumi:"limit"`
	Name  *string `pulumi:"name"`
	// Unique identifier of the organization.
	OrgId string `pulumi:"orgId"`
	// Optional pagination parameter indicating the page number when retrieving entities.
	Page *int `pulumi:"page"`
	// Unique identifier of the project.
	ProjectId string `pulumi:"projectId"`
}

// A collection of values returned by getPipelineList.
type GetPipelineListResult struct {
	Description string `pulumi:"description"`
	// The provider-assigned unique ID for this managed resource.
	Id         string  `pulumi:"id"`
	Identifier *string `pulumi:"identifier"`
	// Optional pagination parameter indicating the maximum number of entities to retrieve per page.
	Limit *int    `pulumi:"limit"`
	Name  *string `pulumi:"name"`
	// Unique identifier of the organization.
	OrgId string `pulumi:"orgId"`
	// Optional pagination parameter indicating the page number when retrieving entities.
	Page *int `pulumi:"page"`
	// Containing list of all pipeline with details identifier and name.
	Pipelines []GetPipelineListPipeline `pulumi:"pipelines"`
	// Unique identifier of the project.
	ProjectId string   `pulumi:"projectId"`
	Tags      []string `pulumi:"tags"`
}

func GetPipelineListOutput(ctx *pulumi.Context, args GetPipelineListOutputArgs, opts ...pulumi.InvokeOption) GetPipelineListResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (GetPipelineListResultOutput, error) {
			args := v.(GetPipelineListArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("harness:platform/getPipelineList:getPipelineList", args, GetPipelineListResultOutput{}, options).(GetPipelineListResultOutput), nil
		}).(GetPipelineListResultOutput)
}

// A collection of arguments for invoking getPipelineList.
type GetPipelineListOutputArgs struct {
	Identifier pulumi.StringPtrInput `pulumi:"identifier"`
	// Optional pagination parameter indicating the maximum number of entities to retrieve per page.
	Limit pulumi.IntPtrInput    `pulumi:"limit"`
	Name  pulumi.StringPtrInput `pulumi:"name"`
	// Unique identifier of the organization.
	OrgId pulumi.StringInput `pulumi:"orgId"`
	// Optional pagination parameter indicating the page number when retrieving entities.
	Page pulumi.IntPtrInput `pulumi:"page"`
	// Unique identifier of the project.
	ProjectId pulumi.StringInput `pulumi:"projectId"`
}

func (GetPipelineListOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetPipelineListArgs)(nil)).Elem()
}

// A collection of values returned by getPipelineList.
type GetPipelineListResultOutput struct{ *pulumi.OutputState }

func (GetPipelineListResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetPipelineListResult)(nil)).Elem()
}

func (o GetPipelineListResultOutput) ToGetPipelineListResultOutput() GetPipelineListResultOutput {
	return o
}

func (o GetPipelineListResultOutput) ToGetPipelineListResultOutputWithContext(ctx context.Context) GetPipelineListResultOutput {
	return o
}

func (o GetPipelineListResultOutput) Description() pulumi.StringOutput {
	return o.ApplyT(func(v GetPipelineListResult) string { return v.Description }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetPipelineListResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetPipelineListResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o GetPipelineListResultOutput) Identifier() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetPipelineListResult) *string { return v.Identifier }).(pulumi.StringPtrOutput)
}

// Optional pagination parameter indicating the maximum number of entities to retrieve per page.
func (o GetPipelineListResultOutput) Limit() pulumi.IntPtrOutput {
	return o.ApplyT(func(v GetPipelineListResult) *int { return v.Limit }).(pulumi.IntPtrOutput)
}

func (o GetPipelineListResultOutput) Name() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetPipelineListResult) *string { return v.Name }).(pulumi.StringPtrOutput)
}

// Unique identifier of the organization.
func (o GetPipelineListResultOutput) OrgId() pulumi.StringOutput {
	return o.ApplyT(func(v GetPipelineListResult) string { return v.OrgId }).(pulumi.StringOutput)
}

// Optional pagination parameter indicating the page number when retrieving entities.
func (o GetPipelineListResultOutput) Page() pulumi.IntPtrOutput {
	return o.ApplyT(func(v GetPipelineListResult) *int { return v.Page }).(pulumi.IntPtrOutput)
}

// Containing list of all pipeline with details identifier and name.
func (o GetPipelineListResultOutput) Pipelines() GetPipelineListPipelineArrayOutput {
	return o.ApplyT(func(v GetPipelineListResult) []GetPipelineListPipeline { return v.Pipelines }).(GetPipelineListPipelineArrayOutput)
}

// Unique identifier of the project.
func (o GetPipelineListResultOutput) ProjectId() pulumi.StringOutput {
	return o.ApplyT(func(v GetPipelineListResult) string { return v.ProjectId }).(pulumi.StringOutput)
}

func (o GetPipelineListResultOutput) Tags() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetPipelineListResult) []string { return v.Tags }).(pulumi.StringArrayOutput)
}

func init() {
	pulumi.RegisterOutputType(GetPipelineListResultOutput{})
}
