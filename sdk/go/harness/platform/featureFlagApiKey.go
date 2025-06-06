// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package platform

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-harness/sdk/go/harness/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Resource for creating an environment SDK key for Feature Flags.
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
//			testserverapikey, err := platform.NewFeatureFlagApiKey(ctx, "testserverapikey", &platform.FeatureFlagApiKeyArgs{
//				Identifier:  pulumi.String("testserver"),
//				Name:        pulumi.String("TestServer"),
//				Description: pulumi.String("this is a server SDK key"),
//				OrgId:       pulumi.String("test"),
//				ProjectId:   pulumi.String("testff"),
//				EnvId:       pulumi.String("testenv"),
//				ExpiredAt:   pulumi.Int(1713729225),
//				Type:        pulumi.String("Server"),
//			})
//			if err != nil {
//				return err
//			}
//			ctx.Export("serversdkkey", testserverapikey.ApiKey)
//			return nil
//		})
//	}
//
// ```
type FeatureFlagApiKey struct {
	pulumi.CustomResourceState

	// The value of the SDK API Key
	ApiKey pulumi.StringOutput `pulumi:"apiKey"`
	// Description of the SDK API Key
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// Environment Identifier
	EnvId pulumi.StringOutput `pulumi:"envId"`
	// Expiration datetime of the SDK API Key
	ExpiredAt pulumi.IntPtrOutput `pulumi:"expiredAt"`
	// Identifier of the SDK API Key
	Identifier pulumi.StringOutput `pulumi:"identifier"`
	// Name of the SDK API Key
	Name pulumi.StringOutput `pulumi:"name"`
	// Organization Identifier
	OrgId pulumi.StringOutput `pulumi:"orgId"`
	// Project Identifier
	ProjectId pulumi.StringOutput `pulumi:"projectId"`
	// Type of SDK. Valid values are `Server` or `Client`.
	Type pulumi.StringOutput `pulumi:"type"`
}

// NewFeatureFlagApiKey registers a new resource with the given unique name, arguments, and options.
func NewFeatureFlagApiKey(ctx *pulumi.Context,
	name string, args *FeatureFlagApiKeyArgs, opts ...pulumi.ResourceOption) (*FeatureFlagApiKey, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.EnvId == nil {
		return nil, errors.New("invalid value for required argument 'EnvId'")
	}
	if args.Identifier == nil {
		return nil, errors.New("invalid value for required argument 'Identifier'")
	}
	if args.OrgId == nil {
		return nil, errors.New("invalid value for required argument 'OrgId'")
	}
	if args.ProjectId == nil {
		return nil, errors.New("invalid value for required argument 'ProjectId'")
	}
	if args.Type == nil {
		return nil, errors.New("invalid value for required argument 'Type'")
	}
	secrets := pulumi.AdditionalSecretOutputs([]string{
		"apiKey",
	})
	opts = append(opts, secrets)
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource FeatureFlagApiKey
	err := ctx.RegisterResource("harness:platform/featureFlagApiKey:FeatureFlagApiKey", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetFeatureFlagApiKey gets an existing FeatureFlagApiKey resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetFeatureFlagApiKey(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *FeatureFlagApiKeyState, opts ...pulumi.ResourceOption) (*FeatureFlagApiKey, error) {
	var resource FeatureFlagApiKey
	err := ctx.ReadResource("harness:platform/featureFlagApiKey:FeatureFlagApiKey", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering FeatureFlagApiKey resources.
type featureFlagApiKeyState struct {
	// The value of the SDK API Key
	ApiKey *string `pulumi:"apiKey"`
	// Description of the SDK API Key
	Description *string `pulumi:"description"`
	// Environment Identifier
	EnvId *string `pulumi:"envId"`
	// Expiration datetime of the SDK API Key
	ExpiredAt *int `pulumi:"expiredAt"`
	// Identifier of the SDK API Key
	Identifier *string `pulumi:"identifier"`
	// Name of the SDK API Key
	Name *string `pulumi:"name"`
	// Organization Identifier
	OrgId *string `pulumi:"orgId"`
	// Project Identifier
	ProjectId *string `pulumi:"projectId"`
	// Type of SDK. Valid values are `Server` or `Client`.
	Type *string `pulumi:"type"`
}

type FeatureFlagApiKeyState struct {
	// The value of the SDK API Key
	ApiKey pulumi.StringPtrInput
	// Description of the SDK API Key
	Description pulumi.StringPtrInput
	// Environment Identifier
	EnvId pulumi.StringPtrInput
	// Expiration datetime of the SDK API Key
	ExpiredAt pulumi.IntPtrInput
	// Identifier of the SDK API Key
	Identifier pulumi.StringPtrInput
	// Name of the SDK API Key
	Name pulumi.StringPtrInput
	// Organization Identifier
	OrgId pulumi.StringPtrInput
	// Project Identifier
	ProjectId pulumi.StringPtrInput
	// Type of SDK. Valid values are `Server` or `Client`.
	Type pulumi.StringPtrInput
}

func (FeatureFlagApiKeyState) ElementType() reflect.Type {
	return reflect.TypeOf((*featureFlagApiKeyState)(nil)).Elem()
}

type featureFlagApiKeyArgs struct {
	// Description of the SDK API Key
	Description *string `pulumi:"description"`
	// Environment Identifier
	EnvId string `pulumi:"envId"`
	// Expiration datetime of the SDK API Key
	ExpiredAt *int `pulumi:"expiredAt"`
	// Identifier of the SDK API Key
	Identifier string `pulumi:"identifier"`
	// Name of the SDK API Key
	Name *string `pulumi:"name"`
	// Organization Identifier
	OrgId string `pulumi:"orgId"`
	// Project Identifier
	ProjectId string `pulumi:"projectId"`
	// Type of SDK. Valid values are `Server` or `Client`.
	Type string `pulumi:"type"`
}

// The set of arguments for constructing a FeatureFlagApiKey resource.
type FeatureFlagApiKeyArgs struct {
	// Description of the SDK API Key
	Description pulumi.StringPtrInput
	// Environment Identifier
	EnvId pulumi.StringInput
	// Expiration datetime of the SDK API Key
	ExpiredAt pulumi.IntPtrInput
	// Identifier of the SDK API Key
	Identifier pulumi.StringInput
	// Name of the SDK API Key
	Name pulumi.StringPtrInput
	// Organization Identifier
	OrgId pulumi.StringInput
	// Project Identifier
	ProjectId pulumi.StringInput
	// Type of SDK. Valid values are `Server` or `Client`.
	Type pulumi.StringInput
}

func (FeatureFlagApiKeyArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*featureFlagApiKeyArgs)(nil)).Elem()
}

type FeatureFlagApiKeyInput interface {
	pulumi.Input

	ToFeatureFlagApiKeyOutput() FeatureFlagApiKeyOutput
	ToFeatureFlagApiKeyOutputWithContext(ctx context.Context) FeatureFlagApiKeyOutput
}

func (*FeatureFlagApiKey) ElementType() reflect.Type {
	return reflect.TypeOf((**FeatureFlagApiKey)(nil)).Elem()
}

func (i *FeatureFlagApiKey) ToFeatureFlagApiKeyOutput() FeatureFlagApiKeyOutput {
	return i.ToFeatureFlagApiKeyOutputWithContext(context.Background())
}

func (i *FeatureFlagApiKey) ToFeatureFlagApiKeyOutputWithContext(ctx context.Context) FeatureFlagApiKeyOutput {
	return pulumi.ToOutputWithContext(ctx, i).(FeatureFlagApiKeyOutput)
}

// FeatureFlagApiKeyArrayInput is an input type that accepts FeatureFlagApiKeyArray and FeatureFlagApiKeyArrayOutput values.
// You can construct a concrete instance of `FeatureFlagApiKeyArrayInput` via:
//
//	FeatureFlagApiKeyArray{ FeatureFlagApiKeyArgs{...} }
type FeatureFlagApiKeyArrayInput interface {
	pulumi.Input

	ToFeatureFlagApiKeyArrayOutput() FeatureFlagApiKeyArrayOutput
	ToFeatureFlagApiKeyArrayOutputWithContext(context.Context) FeatureFlagApiKeyArrayOutput
}

type FeatureFlagApiKeyArray []FeatureFlagApiKeyInput

func (FeatureFlagApiKeyArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*FeatureFlagApiKey)(nil)).Elem()
}

func (i FeatureFlagApiKeyArray) ToFeatureFlagApiKeyArrayOutput() FeatureFlagApiKeyArrayOutput {
	return i.ToFeatureFlagApiKeyArrayOutputWithContext(context.Background())
}

func (i FeatureFlagApiKeyArray) ToFeatureFlagApiKeyArrayOutputWithContext(ctx context.Context) FeatureFlagApiKeyArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(FeatureFlagApiKeyArrayOutput)
}

// FeatureFlagApiKeyMapInput is an input type that accepts FeatureFlagApiKeyMap and FeatureFlagApiKeyMapOutput values.
// You can construct a concrete instance of `FeatureFlagApiKeyMapInput` via:
//
//	FeatureFlagApiKeyMap{ "key": FeatureFlagApiKeyArgs{...} }
type FeatureFlagApiKeyMapInput interface {
	pulumi.Input

	ToFeatureFlagApiKeyMapOutput() FeatureFlagApiKeyMapOutput
	ToFeatureFlagApiKeyMapOutputWithContext(context.Context) FeatureFlagApiKeyMapOutput
}

type FeatureFlagApiKeyMap map[string]FeatureFlagApiKeyInput

func (FeatureFlagApiKeyMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*FeatureFlagApiKey)(nil)).Elem()
}

func (i FeatureFlagApiKeyMap) ToFeatureFlagApiKeyMapOutput() FeatureFlagApiKeyMapOutput {
	return i.ToFeatureFlagApiKeyMapOutputWithContext(context.Background())
}

func (i FeatureFlagApiKeyMap) ToFeatureFlagApiKeyMapOutputWithContext(ctx context.Context) FeatureFlagApiKeyMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(FeatureFlagApiKeyMapOutput)
}

type FeatureFlagApiKeyOutput struct{ *pulumi.OutputState }

func (FeatureFlagApiKeyOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**FeatureFlagApiKey)(nil)).Elem()
}

func (o FeatureFlagApiKeyOutput) ToFeatureFlagApiKeyOutput() FeatureFlagApiKeyOutput {
	return o
}

func (o FeatureFlagApiKeyOutput) ToFeatureFlagApiKeyOutputWithContext(ctx context.Context) FeatureFlagApiKeyOutput {
	return o
}

// The value of the SDK API Key
func (o FeatureFlagApiKeyOutput) ApiKey() pulumi.StringOutput {
	return o.ApplyT(func(v *FeatureFlagApiKey) pulumi.StringOutput { return v.ApiKey }).(pulumi.StringOutput)
}

// Description of the SDK API Key
func (o FeatureFlagApiKeyOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *FeatureFlagApiKey) pulumi.StringPtrOutput { return v.Description }).(pulumi.StringPtrOutput)
}

// Environment Identifier
func (o FeatureFlagApiKeyOutput) EnvId() pulumi.StringOutput {
	return o.ApplyT(func(v *FeatureFlagApiKey) pulumi.StringOutput { return v.EnvId }).(pulumi.StringOutput)
}

// Expiration datetime of the SDK API Key
func (o FeatureFlagApiKeyOutput) ExpiredAt() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *FeatureFlagApiKey) pulumi.IntPtrOutput { return v.ExpiredAt }).(pulumi.IntPtrOutput)
}

// Identifier of the SDK API Key
func (o FeatureFlagApiKeyOutput) Identifier() pulumi.StringOutput {
	return o.ApplyT(func(v *FeatureFlagApiKey) pulumi.StringOutput { return v.Identifier }).(pulumi.StringOutput)
}

// Name of the SDK API Key
func (o FeatureFlagApiKeyOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *FeatureFlagApiKey) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// Organization Identifier
func (o FeatureFlagApiKeyOutput) OrgId() pulumi.StringOutput {
	return o.ApplyT(func(v *FeatureFlagApiKey) pulumi.StringOutput { return v.OrgId }).(pulumi.StringOutput)
}

// Project Identifier
func (o FeatureFlagApiKeyOutput) ProjectId() pulumi.StringOutput {
	return o.ApplyT(func(v *FeatureFlagApiKey) pulumi.StringOutput { return v.ProjectId }).(pulumi.StringOutput)
}

// Type of SDK. Valid values are `Server` or `Client`.
func (o FeatureFlagApiKeyOutput) Type() pulumi.StringOutput {
	return o.ApplyT(func(v *FeatureFlagApiKey) pulumi.StringOutput { return v.Type }).(pulumi.StringOutput)
}

type FeatureFlagApiKeyArrayOutput struct{ *pulumi.OutputState }

func (FeatureFlagApiKeyArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*FeatureFlagApiKey)(nil)).Elem()
}

func (o FeatureFlagApiKeyArrayOutput) ToFeatureFlagApiKeyArrayOutput() FeatureFlagApiKeyArrayOutput {
	return o
}

func (o FeatureFlagApiKeyArrayOutput) ToFeatureFlagApiKeyArrayOutputWithContext(ctx context.Context) FeatureFlagApiKeyArrayOutput {
	return o
}

func (o FeatureFlagApiKeyArrayOutput) Index(i pulumi.IntInput) FeatureFlagApiKeyOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *FeatureFlagApiKey {
		return vs[0].([]*FeatureFlagApiKey)[vs[1].(int)]
	}).(FeatureFlagApiKeyOutput)
}

type FeatureFlagApiKeyMapOutput struct{ *pulumi.OutputState }

func (FeatureFlagApiKeyMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*FeatureFlagApiKey)(nil)).Elem()
}

func (o FeatureFlagApiKeyMapOutput) ToFeatureFlagApiKeyMapOutput() FeatureFlagApiKeyMapOutput {
	return o
}

func (o FeatureFlagApiKeyMapOutput) ToFeatureFlagApiKeyMapOutputWithContext(ctx context.Context) FeatureFlagApiKeyMapOutput {
	return o
}

func (o FeatureFlagApiKeyMapOutput) MapIndex(k pulumi.StringInput) FeatureFlagApiKeyOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *FeatureFlagApiKey {
		return vs[0].(map[string]*FeatureFlagApiKey)[vs[1].(string)]
	}).(FeatureFlagApiKeyOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*FeatureFlagApiKeyInput)(nil)).Elem(), &FeatureFlagApiKey{})
	pulumi.RegisterInputType(reflect.TypeOf((*FeatureFlagApiKeyArrayInput)(nil)).Elem(), FeatureFlagApiKeyArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*FeatureFlagApiKeyMapInput)(nil)).Elem(), FeatureFlagApiKeyMap{})
	pulumi.RegisterOutputType(FeatureFlagApiKeyOutput{})
	pulumi.RegisterOutputType(FeatureFlagApiKeyArrayOutput{})
	pulumi.RegisterOutputType(FeatureFlagApiKeyMapOutput{})
}
