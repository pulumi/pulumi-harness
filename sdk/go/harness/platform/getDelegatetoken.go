// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package platform

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-harness/sdk/go/harness/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

func LookupDelegatetoken(ctx *pulumi.Context, args *LookupDelegatetokenArgs, opts ...pulumi.InvokeOption) (*LookupDelegatetokenResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupDelegatetokenResult
	err := ctx.Invoke("harness:platform/getDelegatetoken:getDelegatetoken", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getDelegatetoken.
type LookupDelegatetokenArgs struct {
	AccountId   string  `pulumi:"accountId"`
	CreatedAt   *int    `pulumi:"createdAt"`
	Name        string  `pulumi:"name"`
	OrgId       *string `pulumi:"orgId"`
	ProjectId   *string `pulumi:"projectId"`
	TokenStatus *string `pulumi:"tokenStatus"`
	Value       *string `pulumi:"value"`
}

// A collection of values returned by getDelegatetoken.
type LookupDelegatetokenResult struct {
	AccountId string `pulumi:"accountId"`
	CreatedAt *int   `pulumi:"createdAt"`
	// The provider-assigned unique ID for this managed resource.
	Id          string  `pulumi:"id"`
	Name        string  `pulumi:"name"`
	OrgId       *string `pulumi:"orgId"`
	ProjectId   *string `pulumi:"projectId"`
	TokenStatus *string `pulumi:"tokenStatus"`
	Value       *string `pulumi:"value"`
}

func LookupDelegatetokenOutput(ctx *pulumi.Context, args LookupDelegatetokenOutputArgs, opts ...pulumi.InvokeOption) LookupDelegatetokenResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupDelegatetokenResult, error) {
			args := v.(LookupDelegatetokenArgs)
			r, err := LookupDelegatetoken(ctx, &args, opts...)
			var s LookupDelegatetokenResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupDelegatetokenResultOutput)
}

// A collection of arguments for invoking getDelegatetoken.
type LookupDelegatetokenOutputArgs struct {
	AccountId   pulumi.StringInput    `pulumi:"accountId"`
	CreatedAt   pulumi.IntPtrInput    `pulumi:"createdAt"`
	Name        pulumi.StringInput    `pulumi:"name"`
	OrgId       pulumi.StringPtrInput `pulumi:"orgId"`
	ProjectId   pulumi.StringPtrInput `pulumi:"projectId"`
	TokenStatus pulumi.StringPtrInput `pulumi:"tokenStatus"`
	Value       pulumi.StringPtrInput `pulumi:"value"`
}

func (LookupDelegatetokenOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupDelegatetokenArgs)(nil)).Elem()
}

// A collection of values returned by getDelegatetoken.
type LookupDelegatetokenResultOutput struct{ *pulumi.OutputState }

func (LookupDelegatetokenResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupDelegatetokenResult)(nil)).Elem()
}

func (o LookupDelegatetokenResultOutput) ToLookupDelegatetokenResultOutput() LookupDelegatetokenResultOutput {
	return o
}

func (o LookupDelegatetokenResultOutput) ToLookupDelegatetokenResultOutputWithContext(ctx context.Context) LookupDelegatetokenResultOutput {
	return o
}

func (o LookupDelegatetokenResultOutput) AccountId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupDelegatetokenResult) string { return v.AccountId }).(pulumi.StringOutput)
}

func (o LookupDelegatetokenResultOutput) CreatedAt() pulumi.IntPtrOutput {
	return o.ApplyT(func(v LookupDelegatetokenResult) *int { return v.CreatedAt }).(pulumi.IntPtrOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupDelegatetokenResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupDelegatetokenResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o LookupDelegatetokenResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v LookupDelegatetokenResult) string { return v.Name }).(pulumi.StringOutput)
}

func (o LookupDelegatetokenResultOutput) OrgId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupDelegatetokenResult) *string { return v.OrgId }).(pulumi.StringPtrOutput)
}

func (o LookupDelegatetokenResultOutput) ProjectId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupDelegatetokenResult) *string { return v.ProjectId }).(pulumi.StringPtrOutput)
}

func (o LookupDelegatetokenResultOutput) TokenStatus() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupDelegatetokenResult) *string { return v.TokenStatus }).(pulumi.StringPtrOutput)
}

func (o LookupDelegatetokenResultOutput) Value() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupDelegatetokenResult) *string { return v.Value }).(pulumi.StringPtrOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupDelegatetokenResultOutput{})
}
