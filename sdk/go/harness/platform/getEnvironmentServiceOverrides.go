// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package platform

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-harness/sdk/go/harness/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Data source for Harness environment service overrides.
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
//			_, err := platform.LookupEnvironmentServiceOverrides(ctx, &platform.LookupEnvironmentServiceOverridesArgs{
//				OrgId:     pulumi.StringRef("orgIdentifier"),
//				ProjectId: pulumi.StringRef("projectIdentifier"),
//				EnvId:     "environmentIdentifier",
//				ServiceId: pulumi.StringRef("serviceIdentifier"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func LookupEnvironmentServiceOverrides(ctx *pulumi.Context, args *LookupEnvironmentServiceOverridesArgs, opts ...pulumi.InvokeOption) (*LookupEnvironmentServiceOverridesResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupEnvironmentServiceOverridesResult
	err := ctx.Invoke("harness:platform/getEnvironmentServiceOverrides:getEnvironmentServiceOverrides", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getEnvironmentServiceOverrides.
type LookupEnvironmentServiceOverridesArgs struct {
	// The env Id associated with the overrides. To reference an environment at the organization scope, prefix 'org' to the expression: org.{env*id}. To reference an environment at the account scope, prefix 'account' to the expression: account.{env*id}).
	EnvId string `pulumi:"envId"`
	// identifier of the service overrides.
	Identifier *string `pulumi:"identifier"`
	// Unique identifier of the organization.
	OrgId *string `pulumi:"orgId"`
	// Unique identifier of the project.
	ProjectId *string `pulumi:"projectId"`
	// The service Id associated with the overrides. To reference a service at the organization scope, prefix 'org' to the expression: org.{service*id}. To reference a service at the account scope, prefix 'account' to the expression: account.{service*id}).
	ServiceId *string `pulumi:"serviceId"`
}

// A collection of values returned by getEnvironmentServiceOverrides.
type LookupEnvironmentServiceOverridesResult struct {
	// The env Id associated with the overrides. To reference an environment at the organization scope, prefix 'org' to the expression: org.{env*id}. To reference an environment at the account scope, prefix 'account' to the expression: account.{env*id}).
	EnvId string `pulumi:"envId"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// identifier of the service overrides.
	Identifier string `pulumi:"identifier"`
	// Unique identifier of the organization.
	OrgId *string `pulumi:"orgId"`
	// Unique identifier of the project.
	ProjectId *string `pulumi:"projectId"`
	// The service Id associated with the overrides. To reference a service at the organization scope, prefix 'org' to the expression: org.{service*id}. To reference a service at the account scope, prefix 'account' to the expression: account.{service*id}).
	ServiceId *string `pulumi:"serviceId"`
	// Environment Service Overrides YAML
	Yaml string `pulumi:"yaml"`
}

func LookupEnvironmentServiceOverridesOutput(ctx *pulumi.Context, args LookupEnvironmentServiceOverridesOutputArgs, opts ...pulumi.InvokeOption) LookupEnvironmentServiceOverridesResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (LookupEnvironmentServiceOverridesResultOutput, error) {
			args := v.(LookupEnvironmentServiceOverridesArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("harness:platform/getEnvironmentServiceOverrides:getEnvironmentServiceOverrides", args, LookupEnvironmentServiceOverridesResultOutput{}, options).(LookupEnvironmentServiceOverridesResultOutput), nil
		}).(LookupEnvironmentServiceOverridesResultOutput)
}

// A collection of arguments for invoking getEnvironmentServiceOverrides.
type LookupEnvironmentServiceOverridesOutputArgs struct {
	// The env Id associated with the overrides. To reference an environment at the organization scope, prefix 'org' to the expression: org.{env*id}. To reference an environment at the account scope, prefix 'account' to the expression: account.{env*id}).
	EnvId pulumi.StringInput `pulumi:"envId"`
	// identifier of the service overrides.
	Identifier pulumi.StringPtrInput `pulumi:"identifier"`
	// Unique identifier of the organization.
	OrgId pulumi.StringPtrInput `pulumi:"orgId"`
	// Unique identifier of the project.
	ProjectId pulumi.StringPtrInput `pulumi:"projectId"`
	// The service Id associated with the overrides. To reference a service at the organization scope, prefix 'org' to the expression: org.{service*id}. To reference a service at the account scope, prefix 'account' to the expression: account.{service*id}).
	ServiceId pulumi.StringPtrInput `pulumi:"serviceId"`
}

func (LookupEnvironmentServiceOverridesOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupEnvironmentServiceOverridesArgs)(nil)).Elem()
}

// A collection of values returned by getEnvironmentServiceOverrides.
type LookupEnvironmentServiceOverridesResultOutput struct{ *pulumi.OutputState }

func (LookupEnvironmentServiceOverridesResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupEnvironmentServiceOverridesResult)(nil)).Elem()
}

func (o LookupEnvironmentServiceOverridesResultOutput) ToLookupEnvironmentServiceOverridesResultOutput() LookupEnvironmentServiceOverridesResultOutput {
	return o
}

func (o LookupEnvironmentServiceOverridesResultOutput) ToLookupEnvironmentServiceOverridesResultOutputWithContext(ctx context.Context) LookupEnvironmentServiceOverridesResultOutput {
	return o
}

// The env Id associated with the overrides. To reference an environment at the organization scope, prefix 'org' to the expression: org.{env*id}. To reference an environment at the account scope, prefix 'account' to the expression: account.{env*id}).
func (o LookupEnvironmentServiceOverridesResultOutput) EnvId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupEnvironmentServiceOverridesResult) string { return v.EnvId }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupEnvironmentServiceOverridesResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupEnvironmentServiceOverridesResult) string { return v.Id }).(pulumi.StringOutput)
}

// identifier of the service overrides.
func (o LookupEnvironmentServiceOverridesResultOutput) Identifier() pulumi.StringOutput {
	return o.ApplyT(func(v LookupEnvironmentServiceOverridesResult) string { return v.Identifier }).(pulumi.StringOutput)
}

// Unique identifier of the organization.
func (o LookupEnvironmentServiceOverridesResultOutput) OrgId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupEnvironmentServiceOverridesResult) *string { return v.OrgId }).(pulumi.StringPtrOutput)
}

// Unique identifier of the project.
func (o LookupEnvironmentServiceOverridesResultOutput) ProjectId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupEnvironmentServiceOverridesResult) *string { return v.ProjectId }).(pulumi.StringPtrOutput)
}

// The service Id associated with the overrides. To reference a service at the organization scope, prefix 'org' to the expression: org.{service*id}. To reference a service at the account scope, prefix 'account' to the expression: account.{service*id}).
func (o LookupEnvironmentServiceOverridesResultOutput) ServiceId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupEnvironmentServiceOverridesResult) *string { return v.ServiceId }).(pulumi.StringPtrOutput)
}

// Environment Service Overrides YAML
func (o LookupEnvironmentServiceOverridesResultOutput) Yaml() pulumi.StringOutput {
	return o.ApplyT(func(v LookupEnvironmentServiceOverridesResult) string { return v.Yaml }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupEnvironmentServiceOverridesResultOutput{})
}
