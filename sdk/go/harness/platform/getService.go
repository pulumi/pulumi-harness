// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package platform

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-harness/sdk/go/harness/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Data source for retrieving a Harness service.
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
//			_, err := platform.LookupService(ctx, &platform.LookupServiceArgs{
//				Identifier: "identifier",
//				OrgId:      pulumi.StringRef("org_id"),
//				ProjectId:  pulumi.StringRef("project_id"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func LookupService(ctx *pulumi.Context, args *LookupServiceArgs, opts ...pulumi.InvokeOption) (*LookupServiceResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupServiceResult
	err := ctx.Invoke("harness:platform/getService:getService", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getService.
type LookupServiceArgs struct {
	GitDetails *GetServiceGitDetails `pulumi:"gitDetails"`
	// Unique identifier of the resource.
	Identifier string `pulumi:"identifier"`
	// Name of the resource.
	Name *string `pulumi:"name"`
	// Unique identifier of the organization.
	OrgId *string `pulumi:"orgId"`
	// Unique identifier of the project.
	ProjectId *string `pulumi:"projectId"`
}

// A collection of values returned by getService.
type LookupServiceResult struct {
	// Description of the resource.
	Description string               `pulumi:"description"`
	GitDetails  GetServiceGitDetails `pulumi:"gitDetails"`
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
	// Input Set YAML
	Yaml string `pulumi:"yaml"`
}

func LookupServiceOutput(ctx *pulumi.Context, args LookupServiceOutputArgs, opts ...pulumi.InvokeOption) LookupServiceResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (LookupServiceResultOutput, error) {
			args := v.(LookupServiceArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("harness:platform/getService:getService", args, LookupServiceResultOutput{}, options).(LookupServiceResultOutput), nil
		}).(LookupServiceResultOutput)
}

// A collection of arguments for invoking getService.
type LookupServiceOutputArgs struct {
	GitDetails GetServiceGitDetailsPtrInput `pulumi:"gitDetails"`
	// Unique identifier of the resource.
	Identifier pulumi.StringInput `pulumi:"identifier"`
	// Name of the resource.
	Name pulumi.StringPtrInput `pulumi:"name"`
	// Unique identifier of the organization.
	OrgId pulumi.StringPtrInput `pulumi:"orgId"`
	// Unique identifier of the project.
	ProjectId pulumi.StringPtrInput `pulumi:"projectId"`
}

func (LookupServiceOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupServiceArgs)(nil)).Elem()
}

// A collection of values returned by getService.
type LookupServiceResultOutput struct{ *pulumi.OutputState }

func (LookupServiceResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupServiceResult)(nil)).Elem()
}

func (o LookupServiceResultOutput) ToLookupServiceResultOutput() LookupServiceResultOutput {
	return o
}

func (o LookupServiceResultOutput) ToLookupServiceResultOutputWithContext(ctx context.Context) LookupServiceResultOutput {
	return o
}

// Description of the resource.
func (o LookupServiceResultOutput) Description() pulumi.StringOutput {
	return o.ApplyT(func(v LookupServiceResult) string { return v.Description }).(pulumi.StringOutput)
}

func (o LookupServiceResultOutput) GitDetails() GetServiceGitDetailsOutput {
	return o.ApplyT(func(v LookupServiceResult) GetServiceGitDetails { return v.GitDetails }).(GetServiceGitDetailsOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupServiceResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupServiceResult) string { return v.Id }).(pulumi.StringOutput)
}

// Unique identifier of the resource.
func (o LookupServiceResultOutput) Identifier() pulumi.StringOutput {
	return o.ApplyT(func(v LookupServiceResult) string { return v.Identifier }).(pulumi.StringOutput)
}

// Name of the resource.
func (o LookupServiceResultOutput) Name() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupServiceResult) *string { return v.Name }).(pulumi.StringPtrOutput)
}

// Unique identifier of the organization.
func (o LookupServiceResultOutput) OrgId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupServiceResult) *string { return v.OrgId }).(pulumi.StringPtrOutput)
}

// Unique identifier of the project.
func (o LookupServiceResultOutput) ProjectId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupServiceResult) *string { return v.ProjectId }).(pulumi.StringPtrOutput)
}

// Tags to associate with the resource.
func (o LookupServiceResultOutput) Tags() pulumi.StringArrayOutput {
	return o.ApplyT(func(v LookupServiceResult) []string { return v.Tags }).(pulumi.StringArrayOutput)
}

// Input Set YAML
func (o LookupServiceResultOutput) Yaml() pulumi.StringOutput {
	return o.ApplyT(func(v LookupServiceResult) string { return v.Yaml }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupServiceResultOutput{})
}
