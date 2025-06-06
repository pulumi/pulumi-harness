// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package harness

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-harness/sdk/go/harness/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Resource for creating an encrypted text secret
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-harness/sdk/go/harness"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_default, err := harness.GetSecretManager(ctx, &harness.GetSecretManagerArgs{
//				Default: pulumi.BoolRef(true),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			_, err = harness.NewEncryptedText(ctx, "example", &harness.EncryptedTextArgs{
//				Name:            pulumi.String("example-secret"),
//				Value:           pulumi.String("someval"),
//				SecretManagerId: pulumi.String(_default.Id),
//				UsageScopes: harness.EncryptedTextUsageScopeArray{
//					&harness.EncryptedTextUsageScopeArgs{
//						EnvironmentFilterType: pulumi.String("PRODUCTION_ENVIRONMENTS"),
//					},
//					&harness.EncryptedTextUsageScopeArgs{
//						EnvironmentFilterType: pulumi.String("NON_PRODUCTION_ENVIRONMENTS"),
//					},
//				},
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
//
// ## Import
//
// Import using the Harness encrypted text format.
//
// NOTE: The secret value cannot be decrypted and imported.
//
// ```sh
// $ pulumi import harness:index/encryptedText:EncryptedText example <secret_id>
// ```
type EncryptedText struct {
	pulumi.CustomResourceState

	// Boolean that indicates whether or not to inherit the usage scopes from the secret manager
	InheritScopesFromSecretManager pulumi.BoolPtrOutput `pulumi:"inheritScopesFromSecretManager"`
	// Name of the encrypted text secret
	Name pulumi.StringOutput `pulumi:"name"`
	// Boolean that indicates whether or not the secret is scoped to the account
	ScopedToAccount pulumi.BoolPtrOutput `pulumi:"scopedToAccount"`
	// The id of the secret manager to associate the secret with. Once set, this field cannot be changed.
	SecretManagerId pulumi.StringOutput `pulumi:"secretManagerId"`
	// Name of the existing secret. If you already have secrets created in a secrets manager such as HashiCorp Vault or AWS Secrets Manager, you do not need to re-create the existing secrets in Harness.
	SecretReference pulumi.StringPtrOutput `pulumi:"secretReference"`
	// This block is used for scoping the resource to a specific set of applications or environments.
	UsageScopes EncryptedTextUsageScopeArrayOutput `pulumi:"usageScopes"`
	// The value of the secret.
	Value pulumi.StringPtrOutput `pulumi:"value"`
}

// NewEncryptedText registers a new resource with the given unique name, arguments, and options.
func NewEncryptedText(ctx *pulumi.Context,
	name string, args *EncryptedTextArgs, opts ...pulumi.ResourceOption) (*EncryptedText, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.SecretManagerId == nil {
		return nil, errors.New("invalid value for required argument 'SecretManagerId'")
	}
	if args.Value != nil {
		args.Value = pulumi.ToSecret(args.Value).(pulumi.StringPtrInput)
	}
	secrets := pulumi.AdditionalSecretOutputs([]string{
		"value",
	})
	opts = append(opts, secrets)
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource EncryptedText
	err := ctx.RegisterResource("harness:index/encryptedText:EncryptedText", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetEncryptedText gets an existing EncryptedText resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetEncryptedText(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *EncryptedTextState, opts ...pulumi.ResourceOption) (*EncryptedText, error) {
	var resource EncryptedText
	err := ctx.ReadResource("harness:index/encryptedText:EncryptedText", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering EncryptedText resources.
type encryptedTextState struct {
	// Boolean that indicates whether or not to inherit the usage scopes from the secret manager
	InheritScopesFromSecretManager *bool `pulumi:"inheritScopesFromSecretManager"`
	// Name of the encrypted text secret
	Name *string `pulumi:"name"`
	// Boolean that indicates whether or not the secret is scoped to the account
	ScopedToAccount *bool `pulumi:"scopedToAccount"`
	// The id of the secret manager to associate the secret with. Once set, this field cannot be changed.
	SecretManagerId *string `pulumi:"secretManagerId"`
	// Name of the existing secret. If you already have secrets created in a secrets manager such as HashiCorp Vault or AWS Secrets Manager, you do not need to re-create the existing secrets in Harness.
	SecretReference *string `pulumi:"secretReference"`
	// This block is used for scoping the resource to a specific set of applications or environments.
	UsageScopes []EncryptedTextUsageScope `pulumi:"usageScopes"`
	// The value of the secret.
	Value *string `pulumi:"value"`
}

type EncryptedTextState struct {
	// Boolean that indicates whether or not to inherit the usage scopes from the secret manager
	InheritScopesFromSecretManager pulumi.BoolPtrInput
	// Name of the encrypted text secret
	Name pulumi.StringPtrInput
	// Boolean that indicates whether or not the secret is scoped to the account
	ScopedToAccount pulumi.BoolPtrInput
	// The id of the secret manager to associate the secret with. Once set, this field cannot be changed.
	SecretManagerId pulumi.StringPtrInput
	// Name of the existing secret. If you already have secrets created in a secrets manager such as HashiCorp Vault or AWS Secrets Manager, you do not need to re-create the existing secrets in Harness.
	SecretReference pulumi.StringPtrInput
	// This block is used for scoping the resource to a specific set of applications or environments.
	UsageScopes EncryptedTextUsageScopeArrayInput
	// The value of the secret.
	Value pulumi.StringPtrInput
}

func (EncryptedTextState) ElementType() reflect.Type {
	return reflect.TypeOf((*encryptedTextState)(nil)).Elem()
}

type encryptedTextArgs struct {
	// Boolean that indicates whether or not to inherit the usage scopes from the secret manager
	InheritScopesFromSecretManager *bool `pulumi:"inheritScopesFromSecretManager"`
	// Name of the encrypted text secret
	Name *string `pulumi:"name"`
	// Boolean that indicates whether or not the secret is scoped to the account
	ScopedToAccount *bool `pulumi:"scopedToAccount"`
	// The id of the secret manager to associate the secret with. Once set, this field cannot be changed.
	SecretManagerId string `pulumi:"secretManagerId"`
	// Name of the existing secret. If you already have secrets created in a secrets manager such as HashiCorp Vault or AWS Secrets Manager, you do not need to re-create the existing secrets in Harness.
	SecretReference *string `pulumi:"secretReference"`
	// This block is used for scoping the resource to a specific set of applications or environments.
	UsageScopes []EncryptedTextUsageScope `pulumi:"usageScopes"`
	// The value of the secret.
	Value *string `pulumi:"value"`
}

// The set of arguments for constructing a EncryptedText resource.
type EncryptedTextArgs struct {
	// Boolean that indicates whether or not to inherit the usage scopes from the secret manager
	InheritScopesFromSecretManager pulumi.BoolPtrInput
	// Name of the encrypted text secret
	Name pulumi.StringPtrInput
	// Boolean that indicates whether or not the secret is scoped to the account
	ScopedToAccount pulumi.BoolPtrInput
	// The id of the secret manager to associate the secret with. Once set, this field cannot be changed.
	SecretManagerId pulumi.StringInput
	// Name of the existing secret. If you already have secrets created in a secrets manager such as HashiCorp Vault or AWS Secrets Manager, you do not need to re-create the existing secrets in Harness.
	SecretReference pulumi.StringPtrInput
	// This block is used for scoping the resource to a specific set of applications or environments.
	UsageScopes EncryptedTextUsageScopeArrayInput
	// The value of the secret.
	Value pulumi.StringPtrInput
}

func (EncryptedTextArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*encryptedTextArgs)(nil)).Elem()
}

type EncryptedTextInput interface {
	pulumi.Input

	ToEncryptedTextOutput() EncryptedTextOutput
	ToEncryptedTextOutputWithContext(ctx context.Context) EncryptedTextOutput
}

func (*EncryptedText) ElementType() reflect.Type {
	return reflect.TypeOf((**EncryptedText)(nil)).Elem()
}

func (i *EncryptedText) ToEncryptedTextOutput() EncryptedTextOutput {
	return i.ToEncryptedTextOutputWithContext(context.Background())
}

func (i *EncryptedText) ToEncryptedTextOutputWithContext(ctx context.Context) EncryptedTextOutput {
	return pulumi.ToOutputWithContext(ctx, i).(EncryptedTextOutput)
}

// EncryptedTextArrayInput is an input type that accepts EncryptedTextArray and EncryptedTextArrayOutput values.
// You can construct a concrete instance of `EncryptedTextArrayInput` via:
//
//	EncryptedTextArray{ EncryptedTextArgs{...} }
type EncryptedTextArrayInput interface {
	pulumi.Input

	ToEncryptedTextArrayOutput() EncryptedTextArrayOutput
	ToEncryptedTextArrayOutputWithContext(context.Context) EncryptedTextArrayOutput
}

type EncryptedTextArray []EncryptedTextInput

func (EncryptedTextArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*EncryptedText)(nil)).Elem()
}

func (i EncryptedTextArray) ToEncryptedTextArrayOutput() EncryptedTextArrayOutput {
	return i.ToEncryptedTextArrayOutputWithContext(context.Background())
}

func (i EncryptedTextArray) ToEncryptedTextArrayOutputWithContext(ctx context.Context) EncryptedTextArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(EncryptedTextArrayOutput)
}

// EncryptedTextMapInput is an input type that accepts EncryptedTextMap and EncryptedTextMapOutput values.
// You can construct a concrete instance of `EncryptedTextMapInput` via:
//
//	EncryptedTextMap{ "key": EncryptedTextArgs{...} }
type EncryptedTextMapInput interface {
	pulumi.Input

	ToEncryptedTextMapOutput() EncryptedTextMapOutput
	ToEncryptedTextMapOutputWithContext(context.Context) EncryptedTextMapOutput
}

type EncryptedTextMap map[string]EncryptedTextInput

func (EncryptedTextMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*EncryptedText)(nil)).Elem()
}

func (i EncryptedTextMap) ToEncryptedTextMapOutput() EncryptedTextMapOutput {
	return i.ToEncryptedTextMapOutputWithContext(context.Background())
}

func (i EncryptedTextMap) ToEncryptedTextMapOutputWithContext(ctx context.Context) EncryptedTextMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(EncryptedTextMapOutput)
}

type EncryptedTextOutput struct{ *pulumi.OutputState }

func (EncryptedTextOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**EncryptedText)(nil)).Elem()
}

func (o EncryptedTextOutput) ToEncryptedTextOutput() EncryptedTextOutput {
	return o
}

func (o EncryptedTextOutput) ToEncryptedTextOutputWithContext(ctx context.Context) EncryptedTextOutput {
	return o
}

// Boolean that indicates whether or not to inherit the usage scopes from the secret manager
func (o EncryptedTextOutput) InheritScopesFromSecretManager() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *EncryptedText) pulumi.BoolPtrOutput { return v.InheritScopesFromSecretManager }).(pulumi.BoolPtrOutput)
}

// Name of the encrypted text secret
func (o EncryptedTextOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *EncryptedText) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// Boolean that indicates whether or not the secret is scoped to the account
func (o EncryptedTextOutput) ScopedToAccount() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *EncryptedText) pulumi.BoolPtrOutput { return v.ScopedToAccount }).(pulumi.BoolPtrOutput)
}

// The id of the secret manager to associate the secret with. Once set, this field cannot be changed.
func (o EncryptedTextOutput) SecretManagerId() pulumi.StringOutput {
	return o.ApplyT(func(v *EncryptedText) pulumi.StringOutput { return v.SecretManagerId }).(pulumi.StringOutput)
}

// Name of the existing secret. If you already have secrets created in a secrets manager such as HashiCorp Vault or AWS Secrets Manager, you do not need to re-create the existing secrets in Harness.
func (o EncryptedTextOutput) SecretReference() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *EncryptedText) pulumi.StringPtrOutput { return v.SecretReference }).(pulumi.StringPtrOutput)
}

// This block is used for scoping the resource to a specific set of applications or environments.
func (o EncryptedTextOutput) UsageScopes() EncryptedTextUsageScopeArrayOutput {
	return o.ApplyT(func(v *EncryptedText) EncryptedTextUsageScopeArrayOutput { return v.UsageScopes }).(EncryptedTextUsageScopeArrayOutput)
}

// The value of the secret.
func (o EncryptedTextOutput) Value() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *EncryptedText) pulumi.StringPtrOutput { return v.Value }).(pulumi.StringPtrOutput)
}

type EncryptedTextArrayOutput struct{ *pulumi.OutputState }

func (EncryptedTextArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*EncryptedText)(nil)).Elem()
}

func (o EncryptedTextArrayOutput) ToEncryptedTextArrayOutput() EncryptedTextArrayOutput {
	return o
}

func (o EncryptedTextArrayOutput) ToEncryptedTextArrayOutputWithContext(ctx context.Context) EncryptedTextArrayOutput {
	return o
}

func (o EncryptedTextArrayOutput) Index(i pulumi.IntInput) EncryptedTextOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *EncryptedText {
		return vs[0].([]*EncryptedText)[vs[1].(int)]
	}).(EncryptedTextOutput)
}

type EncryptedTextMapOutput struct{ *pulumi.OutputState }

func (EncryptedTextMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*EncryptedText)(nil)).Elem()
}

func (o EncryptedTextMapOutput) ToEncryptedTextMapOutput() EncryptedTextMapOutput {
	return o
}

func (o EncryptedTextMapOutput) ToEncryptedTextMapOutputWithContext(ctx context.Context) EncryptedTextMapOutput {
	return o
}

func (o EncryptedTextMapOutput) MapIndex(k pulumi.StringInput) EncryptedTextOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *EncryptedText {
		return vs[0].(map[string]*EncryptedText)[vs[1].(string)]
	}).(EncryptedTextOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*EncryptedTextInput)(nil)).Elem(), &EncryptedText{})
	pulumi.RegisterInputType(reflect.TypeOf((*EncryptedTextArrayInput)(nil)).Elem(), EncryptedTextArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*EncryptedTextMapInput)(nil)).Elem(), EncryptedTextMap{})
	pulumi.RegisterOutputType(EncryptedTextOutput{})
	pulumi.RegisterOutputType(EncryptedTextArrayOutput{})
	pulumi.RegisterOutputType(EncryptedTextMapOutput{})
}
