// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package platform

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-harness/sdk/go/harness/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Data source for retrieving a Harness environment.
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
//			_, err := platform.LookupEnvironment(ctx, &platform.LookupEnvironmentArgs{
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
func LookupEnvironment(ctx *pulumi.Context, args *LookupEnvironmentArgs, opts ...pulumi.InvokeOption) (*LookupEnvironmentResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupEnvironmentResult
	err := ctx.Invoke("harness:platform/getEnvironment:getEnvironment", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getEnvironment.
type LookupEnvironmentArgs struct {
	GitDetails *GetEnvironmentGitDetails `pulumi:"gitDetails"`
	// Unique identifier of the resource.
	Identifier string `pulumi:"identifier"`
	// Name of the resource.
	Name *string `pulumi:"name"`
	// Unique identifier of the organization.
	OrgId *string `pulumi:"orgId"`
	// Unique identifier of the project.
	ProjectId *string `pulumi:"projectId"`
}

// A collection of values returned by getEnvironment.
type LookupEnvironmentResult struct {
	// Color of the environment.
	Color string `pulumi:"color"`
	// Description of the resource.
	Description string                   `pulumi:"description"`
	GitDetails  GetEnvironmentGitDetails `pulumi:"gitDetails"`
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
	// The type of environment.
	Type string `pulumi:"type"`
	// Environment YAML. In YAML, to reference an entity at the organization scope, prefix 'org' to the expression: org.{identifier}. To reference an entity at the account scope, prefix 'account` to the expression: account.{identifier}. For eg, to reference a connector with identifier 'connectorId' at the organization scope in a stage mention it as connectorRef: org.connectorId.
	Yaml string `pulumi:"yaml"`
}

func LookupEnvironmentOutput(ctx *pulumi.Context, args LookupEnvironmentOutputArgs, opts ...pulumi.InvokeOption) LookupEnvironmentResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (LookupEnvironmentResultOutput, error) {
			args := v.(LookupEnvironmentArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("harness:platform/getEnvironment:getEnvironment", args, LookupEnvironmentResultOutput{}, options).(LookupEnvironmentResultOutput), nil
		}).(LookupEnvironmentResultOutput)
}

// A collection of arguments for invoking getEnvironment.
type LookupEnvironmentOutputArgs struct {
	GitDetails GetEnvironmentGitDetailsPtrInput `pulumi:"gitDetails"`
	// Unique identifier of the resource.
	Identifier pulumi.StringInput `pulumi:"identifier"`
	// Name of the resource.
	Name pulumi.StringPtrInput `pulumi:"name"`
	// Unique identifier of the organization.
	OrgId pulumi.StringPtrInput `pulumi:"orgId"`
	// Unique identifier of the project.
	ProjectId pulumi.StringPtrInput `pulumi:"projectId"`
}

func (LookupEnvironmentOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupEnvironmentArgs)(nil)).Elem()
}

// A collection of values returned by getEnvironment.
type LookupEnvironmentResultOutput struct{ *pulumi.OutputState }

func (LookupEnvironmentResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupEnvironmentResult)(nil)).Elem()
}

func (o LookupEnvironmentResultOutput) ToLookupEnvironmentResultOutput() LookupEnvironmentResultOutput {
	return o
}

func (o LookupEnvironmentResultOutput) ToLookupEnvironmentResultOutputWithContext(ctx context.Context) LookupEnvironmentResultOutput {
	return o
}

// Color of the environment.
func (o LookupEnvironmentResultOutput) Color() pulumi.StringOutput {
	return o.ApplyT(func(v LookupEnvironmentResult) string { return v.Color }).(pulumi.StringOutput)
}

// Description of the resource.
func (o LookupEnvironmentResultOutput) Description() pulumi.StringOutput {
	return o.ApplyT(func(v LookupEnvironmentResult) string { return v.Description }).(pulumi.StringOutput)
}

func (o LookupEnvironmentResultOutput) GitDetails() GetEnvironmentGitDetailsOutput {
	return o.ApplyT(func(v LookupEnvironmentResult) GetEnvironmentGitDetails { return v.GitDetails }).(GetEnvironmentGitDetailsOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupEnvironmentResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupEnvironmentResult) string { return v.Id }).(pulumi.StringOutput)
}

// Unique identifier of the resource.
func (o LookupEnvironmentResultOutput) Identifier() pulumi.StringOutput {
	return o.ApplyT(func(v LookupEnvironmentResult) string { return v.Identifier }).(pulumi.StringOutput)
}

// Name of the resource.
func (o LookupEnvironmentResultOutput) Name() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupEnvironmentResult) *string { return v.Name }).(pulumi.StringPtrOutput)
}

// Unique identifier of the organization.
func (o LookupEnvironmentResultOutput) OrgId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupEnvironmentResult) *string { return v.OrgId }).(pulumi.StringPtrOutput)
}

// Unique identifier of the project.
func (o LookupEnvironmentResultOutput) ProjectId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupEnvironmentResult) *string { return v.ProjectId }).(pulumi.StringPtrOutput)
}

// Tags to associate with the resource.
func (o LookupEnvironmentResultOutput) Tags() pulumi.StringArrayOutput {
	return o.ApplyT(func(v LookupEnvironmentResult) []string { return v.Tags }).(pulumi.StringArrayOutput)
}

// The type of environment.
func (o LookupEnvironmentResultOutput) Type() pulumi.StringOutput {
	return o.ApplyT(func(v LookupEnvironmentResult) string { return v.Type }).(pulumi.StringOutput)
}

// Environment YAML. In YAML, to reference an entity at the organization scope, prefix 'org' to the expression: org.{identifier}. To reference an entity at the account scope, prefix 'account` to the expression: account.{identifier}. For eg, to reference a connector with identifier 'connectorId' at the organization scope in a stage mention it as connectorRef: org.connectorId.
func (o LookupEnvironmentResultOutput) Yaml() pulumi.StringOutput {
	return o.ApplyT(func(v LookupEnvironmentResult) string { return v.Yaml }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupEnvironmentResultOutput{})
}
