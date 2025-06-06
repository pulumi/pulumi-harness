// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package platform

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-harness/sdk/go/harness/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Datasource for looking up an Azure Cloud Provider Connector.
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
//			_, err := platform.LookupAzureCloudProviderConnector(ctx, &platform.LookupAzureCloudProviderConnectorArgs{
//				Identifier: "identifier",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func LookupAzureCloudProviderConnector(ctx *pulumi.Context, args *LookupAzureCloudProviderConnectorArgs, opts ...pulumi.InvokeOption) (*LookupAzureCloudProviderConnectorResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupAzureCloudProviderConnectorResult
	err := ctx.Invoke("harness:platform/getAzureCloudProviderConnector:getAzureCloudProviderConnector", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getAzureCloudProviderConnector.
type LookupAzureCloudProviderConnectorArgs struct {
	// Unique identifier of the resource.
	Identifier string `pulumi:"identifier"`
	// Name of the resource.
	Name *string `pulumi:"name"`
	// Unique identifier of the organization.
	OrgId *string `pulumi:"orgId"`
	// Unique identifier of the project.
	ProjectId *string `pulumi:"projectId"`
}

// A collection of values returned by getAzureCloudProviderConnector.
type LookupAzureCloudProviderConnectorResult struct {
	// Specifies the Azure Environment type, which is AZURE by default. Can either be AZURE or AZURE*US*GOVERNMENT
	AzureEnvironmentType string `pulumi:"azureEnvironmentType"`
	// Contains Azure connector credentials.
	Credentials []GetAzureCloudProviderConnectorCredential `pulumi:"credentials"`
	// Tags to filter delegates for connection.
	DelegateSelectors []string `pulumi:"delegateSelectors"`
	// Description of the resource.
	Description string `pulumi:"description"`
	// Execute on delegate or not.
	ExecuteOnDelegate bool `pulumi:"executeOnDelegate"`
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
}

func LookupAzureCloudProviderConnectorOutput(ctx *pulumi.Context, args LookupAzureCloudProviderConnectorOutputArgs, opts ...pulumi.InvokeOption) LookupAzureCloudProviderConnectorResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (LookupAzureCloudProviderConnectorResultOutput, error) {
			args := v.(LookupAzureCloudProviderConnectorArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("harness:platform/getAzureCloudProviderConnector:getAzureCloudProviderConnector", args, LookupAzureCloudProviderConnectorResultOutput{}, options).(LookupAzureCloudProviderConnectorResultOutput), nil
		}).(LookupAzureCloudProviderConnectorResultOutput)
}

// A collection of arguments for invoking getAzureCloudProviderConnector.
type LookupAzureCloudProviderConnectorOutputArgs struct {
	// Unique identifier of the resource.
	Identifier pulumi.StringInput `pulumi:"identifier"`
	// Name of the resource.
	Name pulumi.StringPtrInput `pulumi:"name"`
	// Unique identifier of the organization.
	OrgId pulumi.StringPtrInput `pulumi:"orgId"`
	// Unique identifier of the project.
	ProjectId pulumi.StringPtrInput `pulumi:"projectId"`
}

func (LookupAzureCloudProviderConnectorOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupAzureCloudProviderConnectorArgs)(nil)).Elem()
}

// A collection of values returned by getAzureCloudProviderConnector.
type LookupAzureCloudProviderConnectorResultOutput struct{ *pulumi.OutputState }

func (LookupAzureCloudProviderConnectorResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupAzureCloudProviderConnectorResult)(nil)).Elem()
}

func (o LookupAzureCloudProviderConnectorResultOutput) ToLookupAzureCloudProviderConnectorResultOutput() LookupAzureCloudProviderConnectorResultOutput {
	return o
}

func (o LookupAzureCloudProviderConnectorResultOutput) ToLookupAzureCloudProviderConnectorResultOutputWithContext(ctx context.Context) LookupAzureCloudProviderConnectorResultOutput {
	return o
}

// Specifies the Azure Environment type, which is AZURE by default. Can either be AZURE or AZURE*US*GOVERNMENT
func (o LookupAzureCloudProviderConnectorResultOutput) AzureEnvironmentType() pulumi.StringOutput {
	return o.ApplyT(func(v LookupAzureCloudProviderConnectorResult) string { return v.AzureEnvironmentType }).(pulumi.StringOutput)
}

// Contains Azure connector credentials.
func (o LookupAzureCloudProviderConnectorResultOutput) Credentials() GetAzureCloudProviderConnectorCredentialArrayOutput {
	return o.ApplyT(func(v LookupAzureCloudProviderConnectorResult) []GetAzureCloudProviderConnectorCredential {
		return v.Credentials
	}).(GetAzureCloudProviderConnectorCredentialArrayOutput)
}

// Tags to filter delegates for connection.
func (o LookupAzureCloudProviderConnectorResultOutput) DelegateSelectors() pulumi.StringArrayOutput {
	return o.ApplyT(func(v LookupAzureCloudProviderConnectorResult) []string { return v.DelegateSelectors }).(pulumi.StringArrayOutput)
}

// Description of the resource.
func (o LookupAzureCloudProviderConnectorResultOutput) Description() pulumi.StringOutput {
	return o.ApplyT(func(v LookupAzureCloudProviderConnectorResult) string { return v.Description }).(pulumi.StringOutput)
}

// Execute on delegate or not.
func (o LookupAzureCloudProviderConnectorResultOutput) ExecuteOnDelegate() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupAzureCloudProviderConnectorResult) bool { return v.ExecuteOnDelegate }).(pulumi.BoolOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupAzureCloudProviderConnectorResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupAzureCloudProviderConnectorResult) string { return v.Id }).(pulumi.StringOutput)
}

// Unique identifier of the resource.
func (o LookupAzureCloudProviderConnectorResultOutput) Identifier() pulumi.StringOutput {
	return o.ApplyT(func(v LookupAzureCloudProviderConnectorResult) string { return v.Identifier }).(pulumi.StringOutput)
}

// Name of the resource.
func (o LookupAzureCloudProviderConnectorResultOutput) Name() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupAzureCloudProviderConnectorResult) *string { return v.Name }).(pulumi.StringPtrOutput)
}

// Unique identifier of the organization.
func (o LookupAzureCloudProviderConnectorResultOutput) OrgId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupAzureCloudProviderConnectorResult) *string { return v.OrgId }).(pulumi.StringPtrOutput)
}

// Unique identifier of the project.
func (o LookupAzureCloudProviderConnectorResultOutput) ProjectId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupAzureCloudProviderConnectorResult) *string { return v.ProjectId }).(pulumi.StringPtrOutput)
}

// Tags to associate with the resource.
func (o LookupAzureCloudProviderConnectorResultOutput) Tags() pulumi.StringArrayOutput {
	return o.ApplyT(func(v LookupAzureCloudProviderConnectorResult) []string { return v.Tags }).(pulumi.StringArrayOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupAzureCloudProviderConnectorResultOutput{})
}
