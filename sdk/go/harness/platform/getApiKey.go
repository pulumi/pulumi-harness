// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package platform

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-harness/sdk/go/harness/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

func GetApiKey(ctx *pulumi.Context, args *GetApiKeyArgs, opts ...pulumi.InvokeOption) (*GetApiKeyResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetApiKeyResult
	err := ctx.Invoke("harness:platform/getApiKey:getApiKey", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getApiKey.
type GetApiKeyArgs struct {
	AccountId                string            `pulumi:"accountId"`
	ApikeyType               string            `pulumi:"apikeyType"`
	DefaultTimeToExpireToken *int              `pulumi:"defaultTimeToExpireToken"`
	Description              *string           `pulumi:"description"`
	Identifier               string            `pulumi:"identifier"`
	Name                     string            `pulumi:"name"`
	OrgId                    *string           `pulumi:"orgId"`
	ParentId                 string            `pulumi:"parentId"`
	ProjectId                *string           `pulumi:"projectId"`
	Tags                     map[string]string `pulumi:"tags"`
}

// A collection of values returned by getApiKey.
type GetApiKeyResult struct {
	AccountId                string  `pulumi:"accountId"`
	ApikeyType               string  `pulumi:"apikeyType"`
	DefaultTimeToExpireToken *int    `pulumi:"defaultTimeToExpireToken"`
	Description              *string `pulumi:"description"`
	// The provider-assigned unique ID for this managed resource.
	Id         string            `pulumi:"id"`
	Identifier string            `pulumi:"identifier"`
	Name       string            `pulumi:"name"`
	OrgId      *string           `pulumi:"orgId"`
	ParentId   string            `pulumi:"parentId"`
	ProjectId  *string           `pulumi:"projectId"`
	Tags       map[string]string `pulumi:"tags"`
}

func GetApiKeyOutput(ctx *pulumi.Context, args GetApiKeyOutputArgs, opts ...pulumi.InvokeOption) GetApiKeyResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetApiKeyResult, error) {
			args := v.(GetApiKeyArgs)
			r, err := GetApiKey(ctx, &args, opts...)
			var s GetApiKeyResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetApiKeyResultOutput)
}

// A collection of arguments for invoking getApiKey.
type GetApiKeyOutputArgs struct {
	AccountId                pulumi.StringInput    `pulumi:"accountId"`
	ApikeyType               pulumi.StringInput    `pulumi:"apikeyType"`
	DefaultTimeToExpireToken pulumi.IntPtrInput    `pulumi:"defaultTimeToExpireToken"`
	Description              pulumi.StringPtrInput `pulumi:"description"`
	Identifier               pulumi.StringInput    `pulumi:"identifier"`
	Name                     pulumi.StringInput    `pulumi:"name"`
	OrgId                    pulumi.StringPtrInput `pulumi:"orgId"`
	ParentId                 pulumi.StringInput    `pulumi:"parentId"`
	ProjectId                pulumi.StringPtrInput `pulumi:"projectId"`
	Tags                     pulumi.StringMapInput `pulumi:"tags"`
}

func (GetApiKeyOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetApiKeyArgs)(nil)).Elem()
}

// A collection of values returned by getApiKey.
type GetApiKeyResultOutput struct{ *pulumi.OutputState }

func (GetApiKeyResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetApiKeyResult)(nil)).Elem()
}

func (o GetApiKeyResultOutput) ToGetApiKeyResultOutput() GetApiKeyResultOutput {
	return o
}

func (o GetApiKeyResultOutput) ToGetApiKeyResultOutputWithContext(ctx context.Context) GetApiKeyResultOutput {
	return o
}

func (o GetApiKeyResultOutput) AccountId() pulumi.StringOutput {
	return o.ApplyT(func(v GetApiKeyResult) string { return v.AccountId }).(pulumi.StringOutput)
}

func (o GetApiKeyResultOutput) ApikeyType() pulumi.StringOutput {
	return o.ApplyT(func(v GetApiKeyResult) string { return v.ApikeyType }).(pulumi.StringOutput)
}

func (o GetApiKeyResultOutput) DefaultTimeToExpireToken() pulumi.IntPtrOutput {
	return o.ApplyT(func(v GetApiKeyResult) *int { return v.DefaultTimeToExpireToken }).(pulumi.IntPtrOutput)
}

func (o GetApiKeyResultOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetApiKeyResult) *string { return v.Description }).(pulumi.StringPtrOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetApiKeyResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetApiKeyResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o GetApiKeyResultOutput) Identifier() pulumi.StringOutput {
	return o.ApplyT(func(v GetApiKeyResult) string { return v.Identifier }).(pulumi.StringOutput)
}

func (o GetApiKeyResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v GetApiKeyResult) string { return v.Name }).(pulumi.StringOutput)
}

func (o GetApiKeyResultOutput) OrgId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetApiKeyResult) *string { return v.OrgId }).(pulumi.StringPtrOutput)
}

func (o GetApiKeyResultOutput) ParentId() pulumi.StringOutput {
	return o.ApplyT(func(v GetApiKeyResult) string { return v.ParentId }).(pulumi.StringOutput)
}

func (o GetApiKeyResultOutput) ProjectId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetApiKeyResult) *string { return v.ProjectId }).(pulumi.StringPtrOutput)
}

func (o GetApiKeyResultOutput) Tags() pulumi.StringMapOutput {
	return o.ApplyT(func(v GetApiKeyResult) map[string]string { return v.Tags }).(pulumi.StringMapOutput)
}

func init() {
	pulumi.RegisterOutputType(GetApiKeyResultOutput{})
}
