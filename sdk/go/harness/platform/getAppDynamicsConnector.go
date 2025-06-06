// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package platform

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-harness/sdk/go/harness/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Datasource for looking up an App Dynamics connector.
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
//			_, err := platform.LookupAppDynamicsConnector(ctx, &platform.LookupAppDynamicsConnectorArgs{
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
func LookupAppDynamicsConnector(ctx *pulumi.Context, args *LookupAppDynamicsConnectorArgs, opts ...pulumi.InvokeOption) (*LookupAppDynamicsConnectorResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupAppDynamicsConnectorResult
	err := ctx.Invoke("harness:platform/getAppDynamicsConnector:getAppDynamicsConnector", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getAppDynamicsConnector.
type LookupAppDynamicsConnectorArgs struct {
	// Unique identifier of the resource.
	Identifier string `pulumi:"identifier"`
	// Name of the resource.
	Name *string `pulumi:"name"`
	// Unique identifier of the organization.
	OrgId *string `pulumi:"orgId"`
	// Unique identifier of the project.
	ProjectId *string `pulumi:"projectId"`
}

// A collection of values returned by getAppDynamicsConnector.
type LookupAppDynamicsConnectorResult struct {
	// The App Dynamics account name.
	AccountName string `pulumi:"accountName"`
	// Authenticate to App Dynamics using api token.
	ApiTokens []GetAppDynamicsConnectorApiToken `pulumi:"apiTokens"`
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
	// URL of the App Dynamics controller.
	Url string `pulumi:"url"`
	// Authenticate to App Dynamics using username and password.
	UsernamePasswords []GetAppDynamicsConnectorUsernamePassword `pulumi:"usernamePasswords"`
}

func LookupAppDynamicsConnectorOutput(ctx *pulumi.Context, args LookupAppDynamicsConnectorOutputArgs, opts ...pulumi.InvokeOption) LookupAppDynamicsConnectorResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (LookupAppDynamicsConnectorResultOutput, error) {
			args := v.(LookupAppDynamicsConnectorArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("harness:platform/getAppDynamicsConnector:getAppDynamicsConnector", args, LookupAppDynamicsConnectorResultOutput{}, options).(LookupAppDynamicsConnectorResultOutput), nil
		}).(LookupAppDynamicsConnectorResultOutput)
}

// A collection of arguments for invoking getAppDynamicsConnector.
type LookupAppDynamicsConnectorOutputArgs struct {
	// Unique identifier of the resource.
	Identifier pulumi.StringInput `pulumi:"identifier"`
	// Name of the resource.
	Name pulumi.StringPtrInput `pulumi:"name"`
	// Unique identifier of the organization.
	OrgId pulumi.StringPtrInput `pulumi:"orgId"`
	// Unique identifier of the project.
	ProjectId pulumi.StringPtrInput `pulumi:"projectId"`
}

func (LookupAppDynamicsConnectorOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupAppDynamicsConnectorArgs)(nil)).Elem()
}

// A collection of values returned by getAppDynamicsConnector.
type LookupAppDynamicsConnectorResultOutput struct{ *pulumi.OutputState }

func (LookupAppDynamicsConnectorResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupAppDynamicsConnectorResult)(nil)).Elem()
}

func (o LookupAppDynamicsConnectorResultOutput) ToLookupAppDynamicsConnectorResultOutput() LookupAppDynamicsConnectorResultOutput {
	return o
}

func (o LookupAppDynamicsConnectorResultOutput) ToLookupAppDynamicsConnectorResultOutputWithContext(ctx context.Context) LookupAppDynamicsConnectorResultOutput {
	return o
}

// The App Dynamics account name.
func (o LookupAppDynamicsConnectorResultOutput) AccountName() pulumi.StringOutput {
	return o.ApplyT(func(v LookupAppDynamicsConnectorResult) string { return v.AccountName }).(pulumi.StringOutput)
}

// Authenticate to App Dynamics using api token.
func (o LookupAppDynamicsConnectorResultOutput) ApiTokens() GetAppDynamicsConnectorApiTokenArrayOutput {
	return o.ApplyT(func(v LookupAppDynamicsConnectorResult) []GetAppDynamicsConnectorApiToken { return v.ApiTokens }).(GetAppDynamicsConnectorApiTokenArrayOutput)
}

// Tags to filter delegates for connection.
func (o LookupAppDynamicsConnectorResultOutput) DelegateSelectors() pulumi.StringArrayOutput {
	return o.ApplyT(func(v LookupAppDynamicsConnectorResult) []string { return v.DelegateSelectors }).(pulumi.StringArrayOutput)
}

// Description of the resource.
func (o LookupAppDynamicsConnectorResultOutput) Description() pulumi.StringOutput {
	return o.ApplyT(func(v LookupAppDynamicsConnectorResult) string { return v.Description }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupAppDynamicsConnectorResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupAppDynamicsConnectorResult) string { return v.Id }).(pulumi.StringOutput)
}

// Unique identifier of the resource.
func (o LookupAppDynamicsConnectorResultOutput) Identifier() pulumi.StringOutput {
	return o.ApplyT(func(v LookupAppDynamicsConnectorResult) string { return v.Identifier }).(pulumi.StringOutput)
}

// Name of the resource.
func (o LookupAppDynamicsConnectorResultOutput) Name() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupAppDynamicsConnectorResult) *string { return v.Name }).(pulumi.StringPtrOutput)
}

// Unique identifier of the organization.
func (o LookupAppDynamicsConnectorResultOutput) OrgId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupAppDynamicsConnectorResult) *string { return v.OrgId }).(pulumi.StringPtrOutput)
}

// Unique identifier of the project.
func (o LookupAppDynamicsConnectorResultOutput) ProjectId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupAppDynamicsConnectorResult) *string { return v.ProjectId }).(pulumi.StringPtrOutput)
}

// Tags to associate with the resource.
func (o LookupAppDynamicsConnectorResultOutput) Tags() pulumi.StringArrayOutput {
	return o.ApplyT(func(v LookupAppDynamicsConnectorResult) []string { return v.Tags }).(pulumi.StringArrayOutput)
}

// URL of the App Dynamics controller.
func (o LookupAppDynamicsConnectorResultOutput) Url() pulumi.StringOutput {
	return o.ApplyT(func(v LookupAppDynamicsConnectorResult) string { return v.Url }).(pulumi.StringOutput)
}

// Authenticate to App Dynamics using username and password.
func (o LookupAppDynamicsConnectorResultOutput) UsernamePasswords() GetAppDynamicsConnectorUsernamePasswordArrayOutput {
	return o.ApplyT(func(v LookupAppDynamicsConnectorResult) []GetAppDynamicsConnectorUsernamePassword {
		return v.UsernamePasswords
	}).(GetAppDynamicsConnectorUsernamePasswordArrayOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupAppDynamicsConnectorResultOutput{})
}
