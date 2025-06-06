// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package platform

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-harness/sdk/go/harness/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Data source for retrieving a Harness DBDevOps Instance.
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
//			_, err := platform.LookupDbInstance(ctx, &platform.LookupDbInstanceArgs{
//				Identifier: "identifier",
//				OrgId:      "org_id",
//				ProjectId:  "project_id",
//				Schema:     "schema1",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func LookupDbInstance(ctx *pulumi.Context, args *LookupDbInstanceArgs, opts ...pulumi.InvokeOption) (*LookupDbInstanceResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupDbInstanceResult
	err := ctx.Invoke("harness:platform/getDbInstance:getDbInstance", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getDbInstance.
type LookupDbInstanceArgs struct {
	// Unique identifier of the resource.
	Identifier                    string            `pulumi:"identifier"`
	LiquibaseSubstituteProperties map[string]string `pulumi:"liquibaseSubstituteProperties"`
	// Name of the resource.
	Name *string `pulumi:"name"`
	// Unique identifier of the organization.
	OrgId string `pulumi:"orgId"`
	// Unique identifier of the project.
	ProjectId string `pulumi:"projectId"`
	// The identifier of the parent database schema
	Schema string `pulumi:"schema"`
}

// A collection of values returned by getDbInstance.
type LookupDbInstanceResult struct {
	// The branch of changeSet repository
	Branch string `pulumi:"branch"`
	// The connector to database
	Connector string `pulumi:"connector"`
	// The liquibase context
	Context string `pulumi:"context"`
	// Description of the resource.
	Description string `pulumi:"description"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// Unique identifier of the resource.
	Identifier                    string            `pulumi:"identifier"`
	LiquibaseSubstituteProperties map[string]string `pulumi:"liquibaseSubstituteProperties"`
	// Name of the resource.
	Name *string `pulumi:"name"`
	// Unique identifier of the organization.
	OrgId string `pulumi:"orgId"`
	// Unique identifier of the project.
	ProjectId string `pulumi:"projectId"`
	// The identifier of the parent database schema
	Schema string `pulumi:"schema"`
	// Tags to associate with the resource.
	Tags []string `pulumi:"tags"`
}

func LookupDbInstanceOutput(ctx *pulumi.Context, args LookupDbInstanceOutputArgs, opts ...pulumi.InvokeOption) LookupDbInstanceResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (LookupDbInstanceResultOutput, error) {
			args := v.(LookupDbInstanceArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("harness:platform/getDbInstance:getDbInstance", args, LookupDbInstanceResultOutput{}, options).(LookupDbInstanceResultOutput), nil
		}).(LookupDbInstanceResultOutput)
}

// A collection of arguments for invoking getDbInstance.
type LookupDbInstanceOutputArgs struct {
	// Unique identifier of the resource.
	Identifier                    pulumi.StringInput    `pulumi:"identifier"`
	LiquibaseSubstituteProperties pulumi.StringMapInput `pulumi:"liquibaseSubstituteProperties"`
	// Name of the resource.
	Name pulumi.StringPtrInput `pulumi:"name"`
	// Unique identifier of the organization.
	OrgId pulumi.StringInput `pulumi:"orgId"`
	// Unique identifier of the project.
	ProjectId pulumi.StringInput `pulumi:"projectId"`
	// The identifier of the parent database schema
	Schema pulumi.StringInput `pulumi:"schema"`
}

func (LookupDbInstanceOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupDbInstanceArgs)(nil)).Elem()
}

// A collection of values returned by getDbInstance.
type LookupDbInstanceResultOutput struct{ *pulumi.OutputState }

func (LookupDbInstanceResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupDbInstanceResult)(nil)).Elem()
}

func (o LookupDbInstanceResultOutput) ToLookupDbInstanceResultOutput() LookupDbInstanceResultOutput {
	return o
}

func (o LookupDbInstanceResultOutput) ToLookupDbInstanceResultOutputWithContext(ctx context.Context) LookupDbInstanceResultOutput {
	return o
}

// The branch of changeSet repository
func (o LookupDbInstanceResultOutput) Branch() pulumi.StringOutput {
	return o.ApplyT(func(v LookupDbInstanceResult) string { return v.Branch }).(pulumi.StringOutput)
}

// The connector to database
func (o LookupDbInstanceResultOutput) Connector() pulumi.StringOutput {
	return o.ApplyT(func(v LookupDbInstanceResult) string { return v.Connector }).(pulumi.StringOutput)
}

// The liquibase context
func (o LookupDbInstanceResultOutput) Context() pulumi.StringOutput {
	return o.ApplyT(func(v LookupDbInstanceResult) string { return v.Context }).(pulumi.StringOutput)
}

// Description of the resource.
func (o LookupDbInstanceResultOutput) Description() pulumi.StringOutput {
	return o.ApplyT(func(v LookupDbInstanceResult) string { return v.Description }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupDbInstanceResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupDbInstanceResult) string { return v.Id }).(pulumi.StringOutput)
}

// Unique identifier of the resource.
func (o LookupDbInstanceResultOutput) Identifier() pulumi.StringOutput {
	return o.ApplyT(func(v LookupDbInstanceResult) string { return v.Identifier }).(pulumi.StringOutput)
}

func (o LookupDbInstanceResultOutput) LiquibaseSubstituteProperties() pulumi.StringMapOutput {
	return o.ApplyT(func(v LookupDbInstanceResult) map[string]string { return v.LiquibaseSubstituteProperties }).(pulumi.StringMapOutput)
}

// Name of the resource.
func (o LookupDbInstanceResultOutput) Name() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupDbInstanceResult) *string { return v.Name }).(pulumi.StringPtrOutput)
}

// Unique identifier of the organization.
func (o LookupDbInstanceResultOutput) OrgId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupDbInstanceResult) string { return v.OrgId }).(pulumi.StringOutput)
}

// Unique identifier of the project.
func (o LookupDbInstanceResultOutput) ProjectId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupDbInstanceResult) string { return v.ProjectId }).(pulumi.StringOutput)
}

// The identifier of the parent database schema
func (o LookupDbInstanceResultOutput) Schema() pulumi.StringOutput {
	return o.ApplyT(func(v LookupDbInstanceResult) string { return v.Schema }).(pulumi.StringOutput)
}

// Tags to associate with the resource.
func (o LookupDbInstanceResultOutput) Tags() pulumi.StringArrayOutput {
	return o.ApplyT(func(v LookupDbInstanceResult) []string { return v.Tags }).(pulumi.StringArrayOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupDbInstanceResultOutput{})
}
