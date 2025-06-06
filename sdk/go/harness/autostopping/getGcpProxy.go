// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package autostopping

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-harness/sdk/go/harness/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Data source for GCP Autostopping proxy
func LookupGcpProxy(ctx *pulumi.Context, args *LookupGcpProxyArgs, opts ...pulumi.InvokeOption) (*LookupGcpProxyResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupGcpProxyResult
	err := ctx.Invoke("harness:autostopping/getGcpProxy:getGcpProxy", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getGcpProxy.
type LookupGcpProxyArgs struct {
	// Boolean value to indicate if proxy vm needs to have static IP
	AllocateStaticIp *bool `pulumi:"allocateStaticIp"`
	// Harness NG API key
	ApiKey       string                   `pulumi:"apiKey"`
	Certificates *GetGcpProxyCertificates `pulumi:"certificates"`
	// Id of the cloud connector
	CloudConnectorId              string `pulumi:"cloudConnectorId"`
	DeleteCloudResourcesOnDestroy bool   `pulumi:"deleteCloudResourcesOnDestroy"`
	// Hostname for the proxy
	HostName string `pulumi:"hostName"`
	// Machine instance type
	MachineType string `pulumi:"machineType"`
	// Name of the proxy
	Name string `pulumi:"name"`
	// Region in which cloud resources are hosted
	Region string `pulumi:"region"`
	// Security Group to define the security rules that determine the inbound and outbound traffic
	SecurityGroups []string `pulumi:"securityGroups"`
	// VPC in which cloud resources are hosted
	SubnetId string `pulumi:"subnetId"`
	// VPC in which cloud resources are hosted
	Vpc string `pulumi:"vpc"`
	// Zone in which cloud resources are hosted
	Zone string `pulumi:"zone"`
}

// A collection of values returned by getGcpProxy.
type LookupGcpProxyResult struct {
	// Boolean value to indicate if proxy vm needs to have static IP
	AllocateStaticIp *bool `pulumi:"allocateStaticIp"`
	// Harness NG API key
	ApiKey       string                   `pulumi:"apiKey"`
	Certificates *GetGcpProxyCertificates `pulumi:"certificates"`
	// Id of the cloud connector
	CloudConnectorId              string `pulumi:"cloudConnectorId"`
	DeleteCloudResourcesOnDestroy bool   `pulumi:"deleteCloudResourcesOnDestroy"`
	// Hostname for the proxy
	HostName string `pulumi:"hostName"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// Unique identifier of the resource
	Identifier string `pulumi:"identifier"`
	// Machine instance type
	MachineType string `pulumi:"machineType"`
	// Name of the proxy
	Name string `pulumi:"name"`
	// Region in which cloud resources are hosted
	Region string `pulumi:"region"`
	// Security Group to define the security rules that determine the inbound and outbound traffic
	SecurityGroups []string `pulumi:"securityGroups"`
	// VPC in which cloud resources are hosted
	SubnetId string `pulumi:"subnetId"`
	// VPC in which cloud resources are hosted
	Vpc string `pulumi:"vpc"`
	// Zone in which cloud resources are hosted
	Zone string `pulumi:"zone"`
}

func LookupGcpProxyOutput(ctx *pulumi.Context, args LookupGcpProxyOutputArgs, opts ...pulumi.InvokeOption) LookupGcpProxyResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (LookupGcpProxyResultOutput, error) {
			args := v.(LookupGcpProxyArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("harness:autostopping/getGcpProxy:getGcpProxy", args, LookupGcpProxyResultOutput{}, options).(LookupGcpProxyResultOutput), nil
		}).(LookupGcpProxyResultOutput)
}

// A collection of arguments for invoking getGcpProxy.
type LookupGcpProxyOutputArgs struct {
	// Boolean value to indicate if proxy vm needs to have static IP
	AllocateStaticIp pulumi.BoolPtrInput `pulumi:"allocateStaticIp"`
	// Harness NG API key
	ApiKey       pulumi.StringInput              `pulumi:"apiKey"`
	Certificates GetGcpProxyCertificatesPtrInput `pulumi:"certificates"`
	// Id of the cloud connector
	CloudConnectorId              pulumi.StringInput `pulumi:"cloudConnectorId"`
	DeleteCloudResourcesOnDestroy pulumi.BoolInput   `pulumi:"deleteCloudResourcesOnDestroy"`
	// Hostname for the proxy
	HostName pulumi.StringInput `pulumi:"hostName"`
	// Machine instance type
	MachineType pulumi.StringInput `pulumi:"machineType"`
	// Name of the proxy
	Name pulumi.StringInput `pulumi:"name"`
	// Region in which cloud resources are hosted
	Region pulumi.StringInput `pulumi:"region"`
	// Security Group to define the security rules that determine the inbound and outbound traffic
	SecurityGroups pulumi.StringArrayInput `pulumi:"securityGroups"`
	// VPC in which cloud resources are hosted
	SubnetId pulumi.StringInput `pulumi:"subnetId"`
	// VPC in which cloud resources are hosted
	Vpc pulumi.StringInput `pulumi:"vpc"`
	// Zone in which cloud resources are hosted
	Zone pulumi.StringInput `pulumi:"zone"`
}

func (LookupGcpProxyOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupGcpProxyArgs)(nil)).Elem()
}

// A collection of values returned by getGcpProxy.
type LookupGcpProxyResultOutput struct{ *pulumi.OutputState }

func (LookupGcpProxyResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupGcpProxyResult)(nil)).Elem()
}

func (o LookupGcpProxyResultOutput) ToLookupGcpProxyResultOutput() LookupGcpProxyResultOutput {
	return o
}

func (o LookupGcpProxyResultOutput) ToLookupGcpProxyResultOutputWithContext(ctx context.Context) LookupGcpProxyResultOutput {
	return o
}

// Boolean value to indicate if proxy vm needs to have static IP
func (o LookupGcpProxyResultOutput) AllocateStaticIp() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v LookupGcpProxyResult) *bool { return v.AllocateStaticIp }).(pulumi.BoolPtrOutput)
}

// Harness NG API key
func (o LookupGcpProxyResultOutput) ApiKey() pulumi.StringOutput {
	return o.ApplyT(func(v LookupGcpProxyResult) string { return v.ApiKey }).(pulumi.StringOutput)
}

func (o LookupGcpProxyResultOutput) Certificates() GetGcpProxyCertificatesPtrOutput {
	return o.ApplyT(func(v LookupGcpProxyResult) *GetGcpProxyCertificates { return v.Certificates }).(GetGcpProxyCertificatesPtrOutput)
}

// Id of the cloud connector
func (o LookupGcpProxyResultOutput) CloudConnectorId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupGcpProxyResult) string { return v.CloudConnectorId }).(pulumi.StringOutput)
}

func (o LookupGcpProxyResultOutput) DeleteCloudResourcesOnDestroy() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupGcpProxyResult) bool { return v.DeleteCloudResourcesOnDestroy }).(pulumi.BoolOutput)
}

// Hostname for the proxy
func (o LookupGcpProxyResultOutput) HostName() pulumi.StringOutput {
	return o.ApplyT(func(v LookupGcpProxyResult) string { return v.HostName }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupGcpProxyResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupGcpProxyResult) string { return v.Id }).(pulumi.StringOutput)
}

// Unique identifier of the resource
func (o LookupGcpProxyResultOutput) Identifier() pulumi.StringOutput {
	return o.ApplyT(func(v LookupGcpProxyResult) string { return v.Identifier }).(pulumi.StringOutput)
}

// Machine instance type
func (o LookupGcpProxyResultOutput) MachineType() pulumi.StringOutput {
	return o.ApplyT(func(v LookupGcpProxyResult) string { return v.MachineType }).(pulumi.StringOutput)
}

// Name of the proxy
func (o LookupGcpProxyResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v LookupGcpProxyResult) string { return v.Name }).(pulumi.StringOutput)
}

// Region in which cloud resources are hosted
func (o LookupGcpProxyResultOutput) Region() pulumi.StringOutput {
	return o.ApplyT(func(v LookupGcpProxyResult) string { return v.Region }).(pulumi.StringOutput)
}

// Security Group to define the security rules that determine the inbound and outbound traffic
func (o LookupGcpProxyResultOutput) SecurityGroups() pulumi.StringArrayOutput {
	return o.ApplyT(func(v LookupGcpProxyResult) []string { return v.SecurityGroups }).(pulumi.StringArrayOutput)
}

// VPC in which cloud resources are hosted
func (o LookupGcpProxyResultOutput) SubnetId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupGcpProxyResult) string { return v.SubnetId }).(pulumi.StringOutput)
}

// VPC in which cloud resources are hosted
func (o LookupGcpProxyResultOutput) Vpc() pulumi.StringOutput {
	return o.ApplyT(func(v LookupGcpProxyResult) string { return v.Vpc }).(pulumi.StringOutput)
}

// Zone in which cloud resources are hosted
func (o LookupGcpProxyResultOutput) Zone() pulumi.StringOutput {
	return o.ApplyT(func(v LookupGcpProxyResult) string { return v.Zone }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupGcpProxyResultOutput{})
}
