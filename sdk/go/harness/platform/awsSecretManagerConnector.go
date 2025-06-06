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

// ## Example Usage
//
// ## Import
//
// # Import account level aws secret manager connector
//
// ```sh
// $ pulumi import harness:platform/awsSecretManagerConnector:AwsSecretManagerConnector example <connector_id>
// ```
//
// # Import org level aws secret manager connector
//
// ```sh
// $ pulumi import harness:platform/awsSecretManagerConnector:AwsSecretManagerConnector example <ord_id>/<connector_id>
// ```
//
// # Import project level aws secret manager connector
//
// ```sh
// $ pulumi import harness:platform/awsSecretManagerConnector:AwsSecretManagerConnector example <org_id>/<project_id>/<connector_id>
// ```
type AwsSecretManagerConnector struct {
	pulumi.CustomResourceState

	// Credentials to connect to AWS.
	Credentials AwsSecretManagerConnectorCredentialsOutput `pulumi:"credentials"`
	// Use as Default Secrets Manager.
	Default pulumi.BoolPtrOutput `pulumi:"default"`
	// Tags to filter delegates for connection.
	DelegateSelectors pulumi.StringArrayOutput `pulumi:"delegateSelectors"`
	// Description of the resource.
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// Run the operation on the delegate or harness platform.
	ExecuteOnDelegate pulumi.BoolPtrOutput `pulumi:"executeOnDelegate"`
	// Whether to force delete secret value or not.
	ForceDeleteWithoutRecovery pulumi.BoolPtrOutput `pulumi:"forceDeleteWithoutRecovery"`
	// Unique identifier of the resource.
	Identifier pulumi.StringOutput `pulumi:"identifier"`
	// Name of the resource.
	Name pulumi.StringOutput `pulumi:"name"`
	// Unique identifier of the organization.
	OrgId pulumi.StringPtrOutput `pulumi:"orgId"`
	// Unique identifier of the project.
	ProjectId pulumi.StringPtrOutput `pulumi:"projectId"`
	// recovery duration in days in AWS Secrets Manager.
	RecoveryWindowInDays pulumi.IntPtrOutput `pulumi:"recoveryWindowInDays"`
	// The AWS region where the AWS Secret Manager is.
	Region pulumi.StringOutput `pulumi:"region"`
	// A prefix to be added to all secrets.
	SecretNamePrefix pulumi.StringPtrOutput `pulumi:"secretNamePrefix"`
	// Tags to associate with the resource.
	Tags pulumi.StringArrayOutput `pulumi:"tags"`
	// Whether to update secret value using putSecretValue action.
	UsePutSecret pulumi.BoolPtrOutput `pulumi:"usePutSecret"`
}

// NewAwsSecretManagerConnector registers a new resource with the given unique name, arguments, and options.
func NewAwsSecretManagerConnector(ctx *pulumi.Context,
	name string, args *AwsSecretManagerConnectorArgs, opts ...pulumi.ResourceOption) (*AwsSecretManagerConnector, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Credentials == nil {
		return nil, errors.New("invalid value for required argument 'Credentials'")
	}
	if args.Identifier == nil {
		return nil, errors.New("invalid value for required argument 'Identifier'")
	}
	if args.Region == nil {
		return nil, errors.New("invalid value for required argument 'Region'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource AwsSecretManagerConnector
	err := ctx.RegisterResource("harness:platform/awsSecretManagerConnector:AwsSecretManagerConnector", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetAwsSecretManagerConnector gets an existing AwsSecretManagerConnector resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetAwsSecretManagerConnector(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *AwsSecretManagerConnectorState, opts ...pulumi.ResourceOption) (*AwsSecretManagerConnector, error) {
	var resource AwsSecretManagerConnector
	err := ctx.ReadResource("harness:platform/awsSecretManagerConnector:AwsSecretManagerConnector", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering AwsSecretManagerConnector resources.
type awsSecretManagerConnectorState struct {
	// Credentials to connect to AWS.
	Credentials *AwsSecretManagerConnectorCredentials `pulumi:"credentials"`
	// Use as Default Secrets Manager.
	Default *bool `pulumi:"default"`
	// Tags to filter delegates for connection.
	DelegateSelectors []string `pulumi:"delegateSelectors"`
	// Description of the resource.
	Description *string `pulumi:"description"`
	// Run the operation on the delegate or harness platform.
	ExecuteOnDelegate *bool `pulumi:"executeOnDelegate"`
	// Whether to force delete secret value or not.
	ForceDeleteWithoutRecovery *bool `pulumi:"forceDeleteWithoutRecovery"`
	// Unique identifier of the resource.
	Identifier *string `pulumi:"identifier"`
	// Name of the resource.
	Name *string `pulumi:"name"`
	// Unique identifier of the organization.
	OrgId *string `pulumi:"orgId"`
	// Unique identifier of the project.
	ProjectId *string `pulumi:"projectId"`
	// recovery duration in days in AWS Secrets Manager.
	RecoveryWindowInDays *int `pulumi:"recoveryWindowInDays"`
	// The AWS region where the AWS Secret Manager is.
	Region *string `pulumi:"region"`
	// A prefix to be added to all secrets.
	SecretNamePrefix *string `pulumi:"secretNamePrefix"`
	// Tags to associate with the resource.
	Tags []string `pulumi:"tags"`
	// Whether to update secret value using putSecretValue action.
	UsePutSecret *bool `pulumi:"usePutSecret"`
}

type AwsSecretManagerConnectorState struct {
	// Credentials to connect to AWS.
	Credentials AwsSecretManagerConnectorCredentialsPtrInput
	// Use as Default Secrets Manager.
	Default pulumi.BoolPtrInput
	// Tags to filter delegates for connection.
	DelegateSelectors pulumi.StringArrayInput
	// Description of the resource.
	Description pulumi.StringPtrInput
	// Run the operation on the delegate or harness platform.
	ExecuteOnDelegate pulumi.BoolPtrInput
	// Whether to force delete secret value or not.
	ForceDeleteWithoutRecovery pulumi.BoolPtrInput
	// Unique identifier of the resource.
	Identifier pulumi.StringPtrInput
	// Name of the resource.
	Name pulumi.StringPtrInput
	// Unique identifier of the organization.
	OrgId pulumi.StringPtrInput
	// Unique identifier of the project.
	ProjectId pulumi.StringPtrInput
	// recovery duration in days in AWS Secrets Manager.
	RecoveryWindowInDays pulumi.IntPtrInput
	// The AWS region where the AWS Secret Manager is.
	Region pulumi.StringPtrInput
	// A prefix to be added to all secrets.
	SecretNamePrefix pulumi.StringPtrInput
	// Tags to associate with the resource.
	Tags pulumi.StringArrayInput
	// Whether to update secret value using putSecretValue action.
	UsePutSecret pulumi.BoolPtrInput
}

func (AwsSecretManagerConnectorState) ElementType() reflect.Type {
	return reflect.TypeOf((*awsSecretManagerConnectorState)(nil)).Elem()
}

type awsSecretManagerConnectorArgs struct {
	// Credentials to connect to AWS.
	Credentials AwsSecretManagerConnectorCredentials `pulumi:"credentials"`
	// Use as Default Secrets Manager.
	Default *bool `pulumi:"default"`
	// Tags to filter delegates for connection.
	DelegateSelectors []string `pulumi:"delegateSelectors"`
	// Description of the resource.
	Description *string `pulumi:"description"`
	// Run the operation on the delegate or harness platform.
	ExecuteOnDelegate *bool `pulumi:"executeOnDelegate"`
	// Whether to force delete secret value or not.
	ForceDeleteWithoutRecovery *bool `pulumi:"forceDeleteWithoutRecovery"`
	// Unique identifier of the resource.
	Identifier string `pulumi:"identifier"`
	// Name of the resource.
	Name *string `pulumi:"name"`
	// Unique identifier of the organization.
	OrgId *string `pulumi:"orgId"`
	// Unique identifier of the project.
	ProjectId *string `pulumi:"projectId"`
	// recovery duration in days in AWS Secrets Manager.
	RecoveryWindowInDays *int `pulumi:"recoveryWindowInDays"`
	// The AWS region where the AWS Secret Manager is.
	Region string `pulumi:"region"`
	// A prefix to be added to all secrets.
	SecretNamePrefix *string `pulumi:"secretNamePrefix"`
	// Tags to associate with the resource.
	Tags []string `pulumi:"tags"`
	// Whether to update secret value using putSecretValue action.
	UsePutSecret *bool `pulumi:"usePutSecret"`
}

// The set of arguments for constructing a AwsSecretManagerConnector resource.
type AwsSecretManagerConnectorArgs struct {
	// Credentials to connect to AWS.
	Credentials AwsSecretManagerConnectorCredentialsInput
	// Use as Default Secrets Manager.
	Default pulumi.BoolPtrInput
	// Tags to filter delegates for connection.
	DelegateSelectors pulumi.StringArrayInput
	// Description of the resource.
	Description pulumi.StringPtrInput
	// Run the operation on the delegate or harness platform.
	ExecuteOnDelegate pulumi.BoolPtrInput
	// Whether to force delete secret value or not.
	ForceDeleteWithoutRecovery pulumi.BoolPtrInput
	// Unique identifier of the resource.
	Identifier pulumi.StringInput
	// Name of the resource.
	Name pulumi.StringPtrInput
	// Unique identifier of the organization.
	OrgId pulumi.StringPtrInput
	// Unique identifier of the project.
	ProjectId pulumi.StringPtrInput
	// recovery duration in days in AWS Secrets Manager.
	RecoveryWindowInDays pulumi.IntPtrInput
	// The AWS region where the AWS Secret Manager is.
	Region pulumi.StringInput
	// A prefix to be added to all secrets.
	SecretNamePrefix pulumi.StringPtrInput
	// Tags to associate with the resource.
	Tags pulumi.StringArrayInput
	// Whether to update secret value using putSecretValue action.
	UsePutSecret pulumi.BoolPtrInput
}

func (AwsSecretManagerConnectorArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*awsSecretManagerConnectorArgs)(nil)).Elem()
}

type AwsSecretManagerConnectorInput interface {
	pulumi.Input

	ToAwsSecretManagerConnectorOutput() AwsSecretManagerConnectorOutput
	ToAwsSecretManagerConnectorOutputWithContext(ctx context.Context) AwsSecretManagerConnectorOutput
}

func (*AwsSecretManagerConnector) ElementType() reflect.Type {
	return reflect.TypeOf((**AwsSecretManagerConnector)(nil)).Elem()
}

func (i *AwsSecretManagerConnector) ToAwsSecretManagerConnectorOutput() AwsSecretManagerConnectorOutput {
	return i.ToAwsSecretManagerConnectorOutputWithContext(context.Background())
}

func (i *AwsSecretManagerConnector) ToAwsSecretManagerConnectorOutputWithContext(ctx context.Context) AwsSecretManagerConnectorOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AwsSecretManagerConnectorOutput)
}

// AwsSecretManagerConnectorArrayInput is an input type that accepts AwsSecretManagerConnectorArray and AwsSecretManagerConnectorArrayOutput values.
// You can construct a concrete instance of `AwsSecretManagerConnectorArrayInput` via:
//
//	AwsSecretManagerConnectorArray{ AwsSecretManagerConnectorArgs{...} }
type AwsSecretManagerConnectorArrayInput interface {
	pulumi.Input

	ToAwsSecretManagerConnectorArrayOutput() AwsSecretManagerConnectorArrayOutput
	ToAwsSecretManagerConnectorArrayOutputWithContext(context.Context) AwsSecretManagerConnectorArrayOutput
}

type AwsSecretManagerConnectorArray []AwsSecretManagerConnectorInput

func (AwsSecretManagerConnectorArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*AwsSecretManagerConnector)(nil)).Elem()
}

func (i AwsSecretManagerConnectorArray) ToAwsSecretManagerConnectorArrayOutput() AwsSecretManagerConnectorArrayOutput {
	return i.ToAwsSecretManagerConnectorArrayOutputWithContext(context.Background())
}

func (i AwsSecretManagerConnectorArray) ToAwsSecretManagerConnectorArrayOutputWithContext(ctx context.Context) AwsSecretManagerConnectorArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AwsSecretManagerConnectorArrayOutput)
}

// AwsSecretManagerConnectorMapInput is an input type that accepts AwsSecretManagerConnectorMap and AwsSecretManagerConnectorMapOutput values.
// You can construct a concrete instance of `AwsSecretManagerConnectorMapInput` via:
//
//	AwsSecretManagerConnectorMap{ "key": AwsSecretManagerConnectorArgs{...} }
type AwsSecretManagerConnectorMapInput interface {
	pulumi.Input

	ToAwsSecretManagerConnectorMapOutput() AwsSecretManagerConnectorMapOutput
	ToAwsSecretManagerConnectorMapOutputWithContext(context.Context) AwsSecretManagerConnectorMapOutput
}

type AwsSecretManagerConnectorMap map[string]AwsSecretManagerConnectorInput

func (AwsSecretManagerConnectorMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*AwsSecretManagerConnector)(nil)).Elem()
}

func (i AwsSecretManagerConnectorMap) ToAwsSecretManagerConnectorMapOutput() AwsSecretManagerConnectorMapOutput {
	return i.ToAwsSecretManagerConnectorMapOutputWithContext(context.Background())
}

func (i AwsSecretManagerConnectorMap) ToAwsSecretManagerConnectorMapOutputWithContext(ctx context.Context) AwsSecretManagerConnectorMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AwsSecretManagerConnectorMapOutput)
}

type AwsSecretManagerConnectorOutput struct{ *pulumi.OutputState }

func (AwsSecretManagerConnectorOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**AwsSecretManagerConnector)(nil)).Elem()
}

func (o AwsSecretManagerConnectorOutput) ToAwsSecretManagerConnectorOutput() AwsSecretManagerConnectorOutput {
	return o
}

func (o AwsSecretManagerConnectorOutput) ToAwsSecretManagerConnectorOutputWithContext(ctx context.Context) AwsSecretManagerConnectorOutput {
	return o
}

// Credentials to connect to AWS.
func (o AwsSecretManagerConnectorOutput) Credentials() AwsSecretManagerConnectorCredentialsOutput {
	return o.ApplyT(func(v *AwsSecretManagerConnector) AwsSecretManagerConnectorCredentialsOutput { return v.Credentials }).(AwsSecretManagerConnectorCredentialsOutput)
}

// Use as Default Secrets Manager.
func (o AwsSecretManagerConnectorOutput) Default() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *AwsSecretManagerConnector) pulumi.BoolPtrOutput { return v.Default }).(pulumi.BoolPtrOutput)
}

// Tags to filter delegates for connection.
func (o AwsSecretManagerConnectorOutput) DelegateSelectors() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *AwsSecretManagerConnector) pulumi.StringArrayOutput { return v.DelegateSelectors }).(pulumi.StringArrayOutput)
}

// Description of the resource.
func (o AwsSecretManagerConnectorOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *AwsSecretManagerConnector) pulumi.StringPtrOutput { return v.Description }).(pulumi.StringPtrOutput)
}

// Run the operation on the delegate or harness platform.
func (o AwsSecretManagerConnectorOutput) ExecuteOnDelegate() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *AwsSecretManagerConnector) pulumi.BoolPtrOutput { return v.ExecuteOnDelegate }).(pulumi.BoolPtrOutput)
}

// Whether to force delete secret value or not.
func (o AwsSecretManagerConnectorOutput) ForceDeleteWithoutRecovery() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *AwsSecretManagerConnector) pulumi.BoolPtrOutput { return v.ForceDeleteWithoutRecovery }).(pulumi.BoolPtrOutput)
}

// Unique identifier of the resource.
func (o AwsSecretManagerConnectorOutput) Identifier() pulumi.StringOutput {
	return o.ApplyT(func(v *AwsSecretManagerConnector) pulumi.StringOutput { return v.Identifier }).(pulumi.StringOutput)
}

// Name of the resource.
func (o AwsSecretManagerConnectorOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *AwsSecretManagerConnector) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// Unique identifier of the organization.
func (o AwsSecretManagerConnectorOutput) OrgId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *AwsSecretManagerConnector) pulumi.StringPtrOutput { return v.OrgId }).(pulumi.StringPtrOutput)
}

// Unique identifier of the project.
func (o AwsSecretManagerConnectorOutput) ProjectId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *AwsSecretManagerConnector) pulumi.StringPtrOutput { return v.ProjectId }).(pulumi.StringPtrOutput)
}

// recovery duration in days in AWS Secrets Manager.
func (o AwsSecretManagerConnectorOutput) RecoveryWindowInDays() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *AwsSecretManagerConnector) pulumi.IntPtrOutput { return v.RecoveryWindowInDays }).(pulumi.IntPtrOutput)
}

// The AWS region where the AWS Secret Manager is.
func (o AwsSecretManagerConnectorOutput) Region() pulumi.StringOutput {
	return o.ApplyT(func(v *AwsSecretManagerConnector) pulumi.StringOutput { return v.Region }).(pulumi.StringOutput)
}

// A prefix to be added to all secrets.
func (o AwsSecretManagerConnectorOutput) SecretNamePrefix() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *AwsSecretManagerConnector) pulumi.StringPtrOutput { return v.SecretNamePrefix }).(pulumi.StringPtrOutput)
}

// Tags to associate with the resource.
func (o AwsSecretManagerConnectorOutput) Tags() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *AwsSecretManagerConnector) pulumi.StringArrayOutput { return v.Tags }).(pulumi.StringArrayOutput)
}

// Whether to update secret value using putSecretValue action.
func (o AwsSecretManagerConnectorOutput) UsePutSecret() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *AwsSecretManagerConnector) pulumi.BoolPtrOutput { return v.UsePutSecret }).(pulumi.BoolPtrOutput)
}

type AwsSecretManagerConnectorArrayOutput struct{ *pulumi.OutputState }

func (AwsSecretManagerConnectorArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*AwsSecretManagerConnector)(nil)).Elem()
}

func (o AwsSecretManagerConnectorArrayOutput) ToAwsSecretManagerConnectorArrayOutput() AwsSecretManagerConnectorArrayOutput {
	return o
}

func (o AwsSecretManagerConnectorArrayOutput) ToAwsSecretManagerConnectorArrayOutputWithContext(ctx context.Context) AwsSecretManagerConnectorArrayOutput {
	return o
}

func (o AwsSecretManagerConnectorArrayOutput) Index(i pulumi.IntInput) AwsSecretManagerConnectorOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *AwsSecretManagerConnector {
		return vs[0].([]*AwsSecretManagerConnector)[vs[1].(int)]
	}).(AwsSecretManagerConnectorOutput)
}

type AwsSecretManagerConnectorMapOutput struct{ *pulumi.OutputState }

func (AwsSecretManagerConnectorMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*AwsSecretManagerConnector)(nil)).Elem()
}

func (o AwsSecretManagerConnectorMapOutput) ToAwsSecretManagerConnectorMapOutput() AwsSecretManagerConnectorMapOutput {
	return o
}

func (o AwsSecretManagerConnectorMapOutput) ToAwsSecretManagerConnectorMapOutputWithContext(ctx context.Context) AwsSecretManagerConnectorMapOutput {
	return o
}

func (o AwsSecretManagerConnectorMapOutput) MapIndex(k pulumi.StringInput) AwsSecretManagerConnectorOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *AwsSecretManagerConnector {
		return vs[0].(map[string]*AwsSecretManagerConnector)[vs[1].(string)]
	}).(AwsSecretManagerConnectorOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*AwsSecretManagerConnectorInput)(nil)).Elem(), &AwsSecretManagerConnector{})
	pulumi.RegisterInputType(reflect.TypeOf((*AwsSecretManagerConnectorArrayInput)(nil)).Elem(), AwsSecretManagerConnectorArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*AwsSecretManagerConnectorMapInput)(nil)).Elem(), AwsSecretManagerConnectorMap{})
	pulumi.RegisterOutputType(AwsSecretManagerConnectorOutput{})
	pulumi.RegisterOutputType(AwsSecretManagerConnectorArrayOutput{})
	pulumi.RegisterOutputType(AwsSecretManagerConnectorMapOutput{})
}
