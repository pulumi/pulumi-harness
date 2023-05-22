// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package platform

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Data source for retrieving a monitored service.
func LookupMonitoredService(ctx *pulumi.Context, args *LookupMonitoredServiceArgs, opts ...pulumi.InvokeOption) (*LookupMonitoredServiceResult, error) {
	opts = pkgInvokeDefaultOpts(opts)
	var rv LookupMonitoredServiceResult
	err := ctx.Invoke("harness:platform/getMonitoredService:getMonitoredService", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getMonitoredService.
type LookupMonitoredServiceArgs struct {
	// Identifier of the monitored service.
	Identifier string `pulumi:"identifier"`
	// Identifier of the organization in which the monitored service is configured.
	OrgId string `pulumi:"orgId"`
	// Identifier of the project in which the monitored service is configured.
	ProjectId string `pulumi:"projectId"`
}

// A collection of values returned by getMonitoredService.
type LookupMonitoredServiceResult struct {
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// Identifier of the monitored service.
	Identifier string `pulumi:"identifier"`
	// Identifier of the organization in which the monitored service is configured.
	OrgId string `pulumi:"orgId"`
	// Identifier of the project in which the monitored service is configured.
	ProjectId string `pulumi:"projectId"`
}

func LookupMonitoredServiceOutput(ctx *pulumi.Context, args LookupMonitoredServiceOutputArgs, opts ...pulumi.InvokeOption) LookupMonitoredServiceResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupMonitoredServiceResult, error) {
			args := v.(LookupMonitoredServiceArgs)
			r, err := LookupMonitoredService(ctx, &args, opts...)
			var s LookupMonitoredServiceResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupMonitoredServiceResultOutput)
}

// A collection of arguments for invoking getMonitoredService.
type LookupMonitoredServiceOutputArgs struct {
	// Identifier of the monitored service.
	Identifier pulumi.StringInput `pulumi:"identifier"`
	// Identifier of the organization in which the monitored service is configured.
	OrgId pulumi.StringInput `pulumi:"orgId"`
	// Identifier of the project in which the monitored service is configured.
	ProjectId pulumi.StringInput `pulumi:"projectId"`
}

func (LookupMonitoredServiceOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupMonitoredServiceArgs)(nil)).Elem()
}

// A collection of values returned by getMonitoredService.
type LookupMonitoredServiceResultOutput struct{ *pulumi.OutputState }

func (LookupMonitoredServiceResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupMonitoredServiceResult)(nil)).Elem()
}

func (o LookupMonitoredServiceResultOutput) ToLookupMonitoredServiceResultOutput() LookupMonitoredServiceResultOutput {
	return o
}

func (o LookupMonitoredServiceResultOutput) ToLookupMonitoredServiceResultOutputWithContext(ctx context.Context) LookupMonitoredServiceResultOutput {
	return o
}

// The provider-assigned unique ID for this managed resource.
func (o LookupMonitoredServiceResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupMonitoredServiceResult) string { return v.Id }).(pulumi.StringOutput)
}

// Identifier of the monitored service.
func (o LookupMonitoredServiceResultOutput) Identifier() pulumi.StringOutput {
	return o.ApplyT(func(v LookupMonitoredServiceResult) string { return v.Identifier }).(pulumi.StringOutput)
}

// Identifier of the organization in which the monitored service is configured.
func (o LookupMonitoredServiceResultOutput) OrgId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupMonitoredServiceResult) string { return v.OrgId }).(pulumi.StringOutput)
}

// Identifier of the project in which the monitored service is configured.
func (o LookupMonitoredServiceResultOutput) ProjectId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupMonitoredServiceResult) string { return v.ProjectId }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupMonitoredServiceResultOutput{})
}