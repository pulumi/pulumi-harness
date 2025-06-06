// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package platform

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-harness/sdk/go/harness/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Datasource for looking up a Custom Health source connector.
func LookupConnectorCustomhealthsource(ctx *pulumi.Context, args *LookupConnectorCustomhealthsourceArgs, opts ...pulumi.InvokeOption) (*LookupConnectorCustomhealthsourceResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupConnectorCustomhealthsourceResult
	err := ctx.Invoke("harness:platform/getConnectorCustomhealthsource:getConnectorCustomhealthsource", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getConnectorCustomhealthsource.
type LookupConnectorCustomhealthsourceArgs struct {
	// Unique identifier of the resource.
	Identifier string `pulumi:"identifier"`
	// Name of the resource.
	Name *string `pulumi:"name"`
	// Unique identifier of the organization.
	OrgId *string `pulumi:"orgId"`
	// Unique identifier of the project.
	ProjectId *string `pulumi:"projectId"`
}

// A collection of values returned by getConnectorCustomhealthsource.
type LookupConnectorCustomhealthsourceResult struct {
	// Tags to filter delegates for connection.
	DelegateSelectors []string `pulumi:"delegateSelectors"`
	// Description of the resource.
	Description string `pulumi:"description"`
	// Headers.
	Headers []GetConnectorCustomhealthsourceHeader `pulumi:"headers"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// Unique identifier of the resource.
	Identifier string `pulumi:"identifier"`
	// HTTP Verb Method for the API Call
	Method string `pulumi:"method"`
	// Name of the resource.
	Name *string `pulumi:"name"`
	// Unique identifier of the organization.
	OrgId *string `pulumi:"orgId"`
	// Parameters.
	Params []GetConnectorCustomhealthsourceParam `pulumi:"params"`
	// Unique identifier of the project.
	ProjectId *string `pulumi:"projectId"`
	// Tags to associate with the resource.
	Tags []string `pulumi:"tags"`
	// URL of the Custom Health source server.
	Url string `pulumi:"url"`
	// Body to be sent with the API Call
	ValidationBody string `pulumi:"validationBody"`
	// Path to be added to the base URL for the API Call
	ValidationPath string `pulumi:"validationPath"`
}

func LookupConnectorCustomhealthsourceOutput(ctx *pulumi.Context, args LookupConnectorCustomhealthsourceOutputArgs, opts ...pulumi.InvokeOption) LookupConnectorCustomhealthsourceResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (LookupConnectorCustomhealthsourceResultOutput, error) {
			args := v.(LookupConnectorCustomhealthsourceArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("harness:platform/getConnectorCustomhealthsource:getConnectorCustomhealthsource", args, LookupConnectorCustomhealthsourceResultOutput{}, options).(LookupConnectorCustomhealthsourceResultOutput), nil
		}).(LookupConnectorCustomhealthsourceResultOutput)
}

// A collection of arguments for invoking getConnectorCustomhealthsource.
type LookupConnectorCustomhealthsourceOutputArgs struct {
	// Unique identifier of the resource.
	Identifier pulumi.StringInput `pulumi:"identifier"`
	// Name of the resource.
	Name pulumi.StringPtrInput `pulumi:"name"`
	// Unique identifier of the organization.
	OrgId pulumi.StringPtrInput `pulumi:"orgId"`
	// Unique identifier of the project.
	ProjectId pulumi.StringPtrInput `pulumi:"projectId"`
}

func (LookupConnectorCustomhealthsourceOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupConnectorCustomhealthsourceArgs)(nil)).Elem()
}

// A collection of values returned by getConnectorCustomhealthsource.
type LookupConnectorCustomhealthsourceResultOutput struct{ *pulumi.OutputState }

func (LookupConnectorCustomhealthsourceResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupConnectorCustomhealthsourceResult)(nil)).Elem()
}

func (o LookupConnectorCustomhealthsourceResultOutput) ToLookupConnectorCustomhealthsourceResultOutput() LookupConnectorCustomhealthsourceResultOutput {
	return o
}

func (o LookupConnectorCustomhealthsourceResultOutput) ToLookupConnectorCustomhealthsourceResultOutputWithContext(ctx context.Context) LookupConnectorCustomhealthsourceResultOutput {
	return o
}

// Tags to filter delegates for connection.
func (o LookupConnectorCustomhealthsourceResultOutput) DelegateSelectors() pulumi.StringArrayOutput {
	return o.ApplyT(func(v LookupConnectorCustomhealthsourceResult) []string { return v.DelegateSelectors }).(pulumi.StringArrayOutput)
}

// Description of the resource.
func (o LookupConnectorCustomhealthsourceResultOutput) Description() pulumi.StringOutput {
	return o.ApplyT(func(v LookupConnectorCustomhealthsourceResult) string { return v.Description }).(pulumi.StringOutput)
}

// Headers.
func (o LookupConnectorCustomhealthsourceResultOutput) Headers() GetConnectorCustomhealthsourceHeaderArrayOutput {
	return o.ApplyT(func(v LookupConnectorCustomhealthsourceResult) []GetConnectorCustomhealthsourceHeader {
		return v.Headers
	}).(GetConnectorCustomhealthsourceHeaderArrayOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupConnectorCustomhealthsourceResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupConnectorCustomhealthsourceResult) string { return v.Id }).(pulumi.StringOutput)
}

// Unique identifier of the resource.
func (o LookupConnectorCustomhealthsourceResultOutput) Identifier() pulumi.StringOutput {
	return o.ApplyT(func(v LookupConnectorCustomhealthsourceResult) string { return v.Identifier }).(pulumi.StringOutput)
}

// HTTP Verb Method for the API Call
func (o LookupConnectorCustomhealthsourceResultOutput) Method() pulumi.StringOutput {
	return o.ApplyT(func(v LookupConnectorCustomhealthsourceResult) string { return v.Method }).(pulumi.StringOutput)
}

// Name of the resource.
func (o LookupConnectorCustomhealthsourceResultOutput) Name() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupConnectorCustomhealthsourceResult) *string { return v.Name }).(pulumi.StringPtrOutput)
}

// Unique identifier of the organization.
func (o LookupConnectorCustomhealthsourceResultOutput) OrgId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupConnectorCustomhealthsourceResult) *string { return v.OrgId }).(pulumi.StringPtrOutput)
}

// Parameters.
func (o LookupConnectorCustomhealthsourceResultOutput) Params() GetConnectorCustomhealthsourceParamArrayOutput {
	return o.ApplyT(func(v LookupConnectorCustomhealthsourceResult) []GetConnectorCustomhealthsourceParam { return v.Params }).(GetConnectorCustomhealthsourceParamArrayOutput)
}

// Unique identifier of the project.
func (o LookupConnectorCustomhealthsourceResultOutput) ProjectId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupConnectorCustomhealthsourceResult) *string { return v.ProjectId }).(pulumi.StringPtrOutput)
}

// Tags to associate with the resource.
func (o LookupConnectorCustomhealthsourceResultOutput) Tags() pulumi.StringArrayOutput {
	return o.ApplyT(func(v LookupConnectorCustomhealthsourceResult) []string { return v.Tags }).(pulumi.StringArrayOutput)
}

// URL of the Custom Health source server.
func (o LookupConnectorCustomhealthsourceResultOutput) Url() pulumi.StringOutput {
	return o.ApplyT(func(v LookupConnectorCustomhealthsourceResult) string { return v.Url }).(pulumi.StringOutput)
}

// Body to be sent with the API Call
func (o LookupConnectorCustomhealthsourceResultOutput) ValidationBody() pulumi.StringOutput {
	return o.ApplyT(func(v LookupConnectorCustomhealthsourceResult) string { return v.ValidationBody }).(pulumi.StringOutput)
}

// Path to be added to the base URL for the API Call
func (o LookupConnectorCustomhealthsourceResultOutput) ValidationPath() pulumi.StringOutput {
	return o.ApplyT(func(v LookupConnectorCustomhealthsourceResult) string { return v.ValidationPath }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupConnectorCustomhealthsourceResultOutput{})
}
