// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package harness

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-harness/sdk/go/harness/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Data source for retrieving a Harness secret manager
func GetSecretManager(ctx *pulumi.Context, args *GetSecretManagerArgs, opts ...pulumi.InvokeOption) (*GetSecretManagerResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetSecretManagerResult
	err := ctx.Invoke("harness:index/getSecretManager:getSecretManager", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getSecretManager.
type GetSecretManagerArgs struct {
	// True to lookup the id of the default secret manager
	Default *bool `pulumi:"default"`
	// Unique identifier of the secret manager
	Id *string `pulumi:"id"`
	// The name of the secret manager
	Name *string `pulumi:"name"`
	// This block is used for scoping the resource to a specific set of applications or environments.
	UsageScopes []GetSecretManagerUsageScope `pulumi:"usageScopes"`
}

// A collection of values returned by getSecretManager.
type GetSecretManagerResult struct {
	// True to lookup the id of the default secret manager
	Default *bool `pulumi:"default"`
	// Unique identifier of the secret manager
	Id *string `pulumi:"id"`
	// The name of the secret manager
	Name *string `pulumi:"name"`
	// This block is used for scoping the resource to a specific set of applications or environments.
	UsageScopes []GetSecretManagerUsageScope `pulumi:"usageScopes"`
}

func GetSecretManagerOutput(ctx *pulumi.Context, args GetSecretManagerOutputArgs, opts ...pulumi.InvokeOption) GetSecretManagerResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (GetSecretManagerResultOutput, error) {
			args := v.(GetSecretManagerArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("harness:index/getSecretManager:getSecretManager", args, GetSecretManagerResultOutput{}, options).(GetSecretManagerResultOutput), nil
		}).(GetSecretManagerResultOutput)
}

// A collection of arguments for invoking getSecretManager.
type GetSecretManagerOutputArgs struct {
	// True to lookup the id of the default secret manager
	Default pulumi.BoolPtrInput `pulumi:"default"`
	// Unique identifier of the secret manager
	Id pulumi.StringPtrInput `pulumi:"id"`
	// The name of the secret manager
	Name pulumi.StringPtrInput `pulumi:"name"`
	// This block is used for scoping the resource to a specific set of applications or environments.
	UsageScopes GetSecretManagerUsageScopeArrayInput `pulumi:"usageScopes"`
}

func (GetSecretManagerOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetSecretManagerArgs)(nil)).Elem()
}

// A collection of values returned by getSecretManager.
type GetSecretManagerResultOutput struct{ *pulumi.OutputState }

func (GetSecretManagerResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetSecretManagerResult)(nil)).Elem()
}

func (o GetSecretManagerResultOutput) ToGetSecretManagerResultOutput() GetSecretManagerResultOutput {
	return o
}

func (o GetSecretManagerResultOutput) ToGetSecretManagerResultOutputWithContext(ctx context.Context) GetSecretManagerResultOutput {
	return o
}

// True to lookup the id of the default secret manager
func (o GetSecretManagerResultOutput) Default() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v GetSecretManagerResult) *bool { return v.Default }).(pulumi.BoolPtrOutput)
}

// Unique identifier of the secret manager
func (o GetSecretManagerResultOutput) Id() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetSecretManagerResult) *string { return v.Id }).(pulumi.StringPtrOutput)
}

// The name of the secret manager
func (o GetSecretManagerResultOutput) Name() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetSecretManagerResult) *string { return v.Name }).(pulumi.StringPtrOutput)
}

// This block is used for scoping the resource to a specific set of applications or environments.
func (o GetSecretManagerResultOutput) UsageScopes() GetSecretManagerUsageScopeArrayOutput {
	return o.ApplyT(func(v GetSecretManagerResult) []GetSecretManagerUsageScope { return v.UsageScopes }).(GetSecretManagerUsageScopeArrayOutput)
}

func init() {
	pulumi.RegisterOutputType(GetSecretManagerResultOutput{})
}
