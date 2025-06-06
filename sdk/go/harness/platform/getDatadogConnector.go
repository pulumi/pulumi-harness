// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package platform

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-harness/sdk/go/harness/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Datasource for looking up a Datadog connector.
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
//			_, err := platform.LookupDatadogConnector(ctx, &platform.LookupDatadogConnectorArgs{
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
func LookupDatadogConnector(ctx *pulumi.Context, args *LookupDatadogConnectorArgs, opts ...pulumi.InvokeOption) (*LookupDatadogConnectorResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupDatadogConnectorResult
	err := ctx.Invoke("harness:platform/getDatadogConnector:getDatadogConnector", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getDatadogConnector.
type LookupDatadogConnectorArgs struct {
	// Tags to filter delegates for connection.
	DelegateSelectors []string `pulumi:"delegateSelectors"`
	// Unique identifier of the resource.
	Identifier string `pulumi:"identifier"`
	// Name of the resource.
	Name *string `pulumi:"name"`
	// Unique identifier of the organization.
	OrgId *string `pulumi:"orgId"`
	// Unique identifier of the project.
	ProjectId *string `pulumi:"projectId"`
}

// A collection of values returned by getDatadogConnector.
type LookupDatadogConnectorResult struct {
	// Reference to the Harness secret containing the api key. To reference a secret at the organization scope, prefix 'org' to the expression: org.{identifier}. To reference a secret at the account scope, prefix 'account` to the expression: account.{identifier}.
	ApiKeyRef string `pulumi:"apiKeyRef"`
	// Reference to the Harness secret containing the application key. To reference a secret at the organization scope, prefix 'org' to the expression: org.{identifier}. To reference a secret at the account scope, prefix 'account` to the expression: account.{identifier}.
	ApplicationKeyRef string `pulumi:"applicationKeyRef"`
	// Tags to filter delegates for connection.
	DelegateSelectors []string `pulumi:"delegateSelectors"`
	// Description of the resource.
	Description string `pulumi:"description"`
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
	// URL of the Datadog server.
	Url string `pulumi:"url"`
}

func LookupDatadogConnectorOutput(ctx *pulumi.Context, args LookupDatadogConnectorOutputArgs, opts ...pulumi.InvokeOption) LookupDatadogConnectorResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (LookupDatadogConnectorResultOutput, error) {
			args := v.(LookupDatadogConnectorArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("harness:platform/getDatadogConnector:getDatadogConnector", args, LookupDatadogConnectorResultOutput{}, options).(LookupDatadogConnectorResultOutput), nil
		}).(LookupDatadogConnectorResultOutput)
}

// A collection of arguments for invoking getDatadogConnector.
type LookupDatadogConnectorOutputArgs struct {
	// Tags to filter delegates for connection.
	DelegateSelectors pulumi.StringArrayInput `pulumi:"delegateSelectors"`
	// Unique identifier of the resource.
	Identifier pulumi.StringInput `pulumi:"identifier"`
	// Name of the resource.
	Name pulumi.StringPtrInput `pulumi:"name"`
	// Unique identifier of the organization.
	OrgId pulumi.StringPtrInput `pulumi:"orgId"`
	// Unique identifier of the project.
	ProjectId pulumi.StringPtrInput `pulumi:"projectId"`
}

func (LookupDatadogConnectorOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupDatadogConnectorArgs)(nil)).Elem()
}

// A collection of values returned by getDatadogConnector.
type LookupDatadogConnectorResultOutput struct{ *pulumi.OutputState }

func (LookupDatadogConnectorResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupDatadogConnectorResult)(nil)).Elem()
}

func (o LookupDatadogConnectorResultOutput) ToLookupDatadogConnectorResultOutput() LookupDatadogConnectorResultOutput {
	return o
}

func (o LookupDatadogConnectorResultOutput) ToLookupDatadogConnectorResultOutputWithContext(ctx context.Context) LookupDatadogConnectorResultOutput {
	return o
}

// Reference to the Harness secret containing the api key. To reference a secret at the organization scope, prefix 'org' to the expression: org.{identifier}. To reference a secret at the account scope, prefix 'account` to the expression: account.{identifier}.
func (o LookupDatadogConnectorResultOutput) ApiKeyRef() pulumi.StringOutput {
	return o.ApplyT(func(v LookupDatadogConnectorResult) string { return v.ApiKeyRef }).(pulumi.StringOutput)
}

// Reference to the Harness secret containing the application key. To reference a secret at the organization scope, prefix 'org' to the expression: org.{identifier}. To reference a secret at the account scope, prefix 'account` to the expression: account.{identifier}.
func (o LookupDatadogConnectorResultOutput) ApplicationKeyRef() pulumi.StringOutput {
	return o.ApplyT(func(v LookupDatadogConnectorResult) string { return v.ApplicationKeyRef }).(pulumi.StringOutput)
}

// Tags to filter delegates for connection.
func (o LookupDatadogConnectorResultOutput) DelegateSelectors() pulumi.StringArrayOutput {
	return o.ApplyT(func(v LookupDatadogConnectorResult) []string { return v.DelegateSelectors }).(pulumi.StringArrayOutput)
}

// Description of the resource.
func (o LookupDatadogConnectorResultOutput) Description() pulumi.StringOutput {
	return o.ApplyT(func(v LookupDatadogConnectorResult) string { return v.Description }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupDatadogConnectorResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupDatadogConnectorResult) string { return v.Id }).(pulumi.StringOutput)
}

// Unique identifier of the resource.
func (o LookupDatadogConnectorResultOutput) Identifier() pulumi.StringOutput {
	return o.ApplyT(func(v LookupDatadogConnectorResult) string { return v.Identifier }).(pulumi.StringOutput)
}

// Name of the resource.
func (o LookupDatadogConnectorResultOutput) Name() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupDatadogConnectorResult) *string { return v.Name }).(pulumi.StringPtrOutput)
}

// Unique identifier of the organization.
func (o LookupDatadogConnectorResultOutput) OrgId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupDatadogConnectorResult) *string { return v.OrgId }).(pulumi.StringPtrOutput)
}

// Unique identifier of the project.
func (o LookupDatadogConnectorResultOutput) ProjectId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupDatadogConnectorResult) *string { return v.ProjectId }).(pulumi.StringPtrOutput)
}

// Tags to associate with the resource.
func (o LookupDatadogConnectorResultOutput) Tags() pulumi.StringArrayOutput {
	return o.ApplyT(func(v LookupDatadogConnectorResult) []string { return v.Tags }).(pulumi.StringArrayOutput)
}

// URL of the Datadog server.
func (o LookupDatadogConnectorResultOutput) Url() pulumi.StringOutput {
	return o.ApplyT(func(v LookupDatadogConnectorResult) string { return v.Url }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupDatadogConnectorResultOutput{})
}
