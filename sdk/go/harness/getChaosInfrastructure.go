// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package harness

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-harness/sdk/go/harness/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Data source for retrieving a chaos infrastructure.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-harness/sdk/go/harness"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := harness.LookupChaosInfrastructure(ctx, &harness.LookupChaosInfrastructureArgs{
//				Identifier:    "identifier",
//				OrgId:         "org_id",
//				ProjectId:     "project_id",
//				EnvironmentId: "env_id",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func LookupChaosInfrastructure(ctx *pulumi.Context, args *LookupChaosInfrastructureArgs, opts ...pulumi.InvokeOption) (*LookupChaosInfrastructureResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupChaosInfrastructureResult
	err := ctx.Invoke("harness:index/getChaosInfrastructure:getChaosInfrastructure", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getChaosInfrastructure.
type LookupChaosInfrastructureArgs struct {
	// Environment identifier of the chaos infrastructure.
	EnvironmentId string `pulumi:"environmentId"`
	// Identifier of the chaos infrastructure.
	Identifier string `pulumi:"identifier"`
	// Identifier of the organization in which the chaos infrastructure is configured.
	OrgId string `pulumi:"orgId"`
	// Identifier of the project in which the chaos infrastructure is configured.
	ProjectId string `pulumi:"projectId"`
}

// A collection of values returned by getChaosInfrastructure.
type LookupChaosInfrastructureResult struct {
	// Environment identifier of the chaos infrastructure.
	EnvironmentId string `pulumi:"environmentId"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// Identifier of the chaos infrastructure.
	Identifier string `pulumi:"identifier"`
	// Identifier of the organization in which the chaos infrastructure is configured.
	OrgId string `pulumi:"orgId"`
	// Identifier of the project in which the chaos infrastructure is configured.
	ProjectId string `pulumi:"projectId"`
}

func LookupChaosInfrastructureOutput(ctx *pulumi.Context, args LookupChaosInfrastructureOutputArgs, opts ...pulumi.InvokeOption) LookupChaosInfrastructureResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (LookupChaosInfrastructureResultOutput, error) {
			args := v.(LookupChaosInfrastructureArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("harness:index/getChaosInfrastructure:getChaosInfrastructure", args, LookupChaosInfrastructureResultOutput{}, options).(LookupChaosInfrastructureResultOutput), nil
		}).(LookupChaosInfrastructureResultOutput)
}

// A collection of arguments for invoking getChaosInfrastructure.
type LookupChaosInfrastructureOutputArgs struct {
	// Environment identifier of the chaos infrastructure.
	EnvironmentId pulumi.StringInput `pulumi:"environmentId"`
	// Identifier of the chaos infrastructure.
	Identifier pulumi.StringInput `pulumi:"identifier"`
	// Identifier of the organization in which the chaos infrastructure is configured.
	OrgId pulumi.StringInput `pulumi:"orgId"`
	// Identifier of the project in which the chaos infrastructure is configured.
	ProjectId pulumi.StringInput `pulumi:"projectId"`
}

func (LookupChaosInfrastructureOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupChaosInfrastructureArgs)(nil)).Elem()
}

// A collection of values returned by getChaosInfrastructure.
type LookupChaosInfrastructureResultOutput struct{ *pulumi.OutputState }

func (LookupChaosInfrastructureResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupChaosInfrastructureResult)(nil)).Elem()
}

func (o LookupChaosInfrastructureResultOutput) ToLookupChaosInfrastructureResultOutput() LookupChaosInfrastructureResultOutput {
	return o
}

func (o LookupChaosInfrastructureResultOutput) ToLookupChaosInfrastructureResultOutputWithContext(ctx context.Context) LookupChaosInfrastructureResultOutput {
	return o
}

// Environment identifier of the chaos infrastructure.
func (o LookupChaosInfrastructureResultOutput) EnvironmentId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupChaosInfrastructureResult) string { return v.EnvironmentId }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupChaosInfrastructureResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupChaosInfrastructureResult) string { return v.Id }).(pulumi.StringOutput)
}

// Identifier of the chaos infrastructure.
func (o LookupChaosInfrastructureResultOutput) Identifier() pulumi.StringOutput {
	return o.ApplyT(func(v LookupChaosInfrastructureResult) string { return v.Identifier }).(pulumi.StringOutput)
}

// Identifier of the organization in which the chaos infrastructure is configured.
func (o LookupChaosInfrastructureResultOutput) OrgId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupChaosInfrastructureResult) string { return v.OrgId }).(pulumi.StringOutput)
}

// Identifier of the project in which the chaos infrastructure is configured.
func (o LookupChaosInfrastructureResultOutput) ProjectId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupChaosInfrastructureResult) string { return v.ProjectId }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupChaosInfrastructureResultOutput{})
}
