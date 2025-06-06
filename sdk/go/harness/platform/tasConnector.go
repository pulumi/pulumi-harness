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

// Resource for creating an Tas in Harness.
//
// ## Import
//
// # Import account level tas connector
//
// ```sh
// $ pulumi import harness:platform/tasConnector:TasConnector example <connector_id>
// ```
//
// # Import organization level tas connector
//
// ```sh
// $ pulumi import harness:platform/tasConnector:TasConnector example <organization_id>/<connector_id>
// ```
//
// # Import project level tas connector
//
// ```sh
// $ pulumi import harness:platform/tasConnector:TasConnector example <organization_id>/<project_id>/<connector_id>
// ```
type TasConnector struct {
	pulumi.CustomResourceState

	// Contains Tas connector credentials.
	Credentials TasConnectorCredentialsOutput `pulumi:"credentials"`
	// Tags to filter delegates for connection.
	DelegateSelectors pulumi.StringArrayOutput `pulumi:"delegateSelectors"`
	// Description of the resource.
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// Execute on delegate or not.
	ExecuteOnDelegate pulumi.BoolPtrOutput `pulumi:"executeOnDelegate"`
	// Unique identifier of the resource.
	Identifier pulumi.StringOutput `pulumi:"identifier"`
	// Name of the resource.
	Name pulumi.StringOutput `pulumi:"name"`
	// Unique identifier of the organization.
	OrgId pulumi.StringPtrOutput `pulumi:"orgId"`
	// Unique identifier of the project.
	ProjectId pulumi.StringPtrOutput `pulumi:"projectId"`
	// Tags to associate with the resource.
	Tags pulumi.StringArrayOutput `pulumi:"tags"`
}

// NewTasConnector registers a new resource with the given unique name, arguments, and options.
func NewTasConnector(ctx *pulumi.Context,
	name string, args *TasConnectorArgs, opts ...pulumi.ResourceOption) (*TasConnector, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Credentials == nil {
		return nil, errors.New("invalid value for required argument 'Credentials'")
	}
	if args.Identifier == nil {
		return nil, errors.New("invalid value for required argument 'Identifier'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource TasConnector
	err := ctx.RegisterResource("harness:platform/tasConnector:TasConnector", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetTasConnector gets an existing TasConnector resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetTasConnector(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *TasConnectorState, opts ...pulumi.ResourceOption) (*TasConnector, error) {
	var resource TasConnector
	err := ctx.ReadResource("harness:platform/tasConnector:TasConnector", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering TasConnector resources.
type tasConnectorState struct {
	// Contains Tas connector credentials.
	Credentials *TasConnectorCredentials `pulumi:"credentials"`
	// Tags to filter delegates for connection.
	DelegateSelectors []string `pulumi:"delegateSelectors"`
	// Description of the resource.
	Description *string `pulumi:"description"`
	// Execute on delegate or not.
	ExecuteOnDelegate *bool `pulumi:"executeOnDelegate"`
	// Unique identifier of the resource.
	Identifier *string `pulumi:"identifier"`
	// Name of the resource.
	Name *string `pulumi:"name"`
	// Unique identifier of the organization.
	OrgId *string `pulumi:"orgId"`
	// Unique identifier of the project.
	ProjectId *string `pulumi:"projectId"`
	// Tags to associate with the resource.
	Tags []string `pulumi:"tags"`
}

type TasConnectorState struct {
	// Contains Tas connector credentials.
	Credentials TasConnectorCredentialsPtrInput
	// Tags to filter delegates for connection.
	DelegateSelectors pulumi.StringArrayInput
	// Description of the resource.
	Description pulumi.StringPtrInput
	// Execute on delegate or not.
	ExecuteOnDelegate pulumi.BoolPtrInput
	// Unique identifier of the resource.
	Identifier pulumi.StringPtrInput
	// Name of the resource.
	Name pulumi.StringPtrInput
	// Unique identifier of the organization.
	OrgId pulumi.StringPtrInput
	// Unique identifier of the project.
	ProjectId pulumi.StringPtrInput
	// Tags to associate with the resource.
	Tags pulumi.StringArrayInput
}

func (TasConnectorState) ElementType() reflect.Type {
	return reflect.TypeOf((*tasConnectorState)(nil)).Elem()
}

type tasConnectorArgs struct {
	// Contains Tas connector credentials.
	Credentials TasConnectorCredentials `pulumi:"credentials"`
	// Tags to filter delegates for connection.
	DelegateSelectors []string `pulumi:"delegateSelectors"`
	// Description of the resource.
	Description *string `pulumi:"description"`
	// Execute on delegate or not.
	ExecuteOnDelegate *bool `pulumi:"executeOnDelegate"`
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

// The set of arguments for constructing a TasConnector resource.
type TasConnectorArgs struct {
	// Contains Tas connector credentials.
	Credentials TasConnectorCredentialsInput
	// Tags to filter delegates for connection.
	DelegateSelectors pulumi.StringArrayInput
	// Description of the resource.
	Description pulumi.StringPtrInput
	// Execute on delegate or not.
	ExecuteOnDelegate pulumi.BoolPtrInput
	// Unique identifier of the resource.
	Identifier pulumi.StringInput
	// Name of the resource.
	Name pulumi.StringPtrInput
	// Unique identifier of the organization.
	OrgId pulumi.StringPtrInput
	// Unique identifier of the project.
	ProjectId pulumi.StringPtrInput
	// Tags to associate with the resource.
	Tags pulumi.StringArrayInput
}

func (TasConnectorArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*tasConnectorArgs)(nil)).Elem()
}

type TasConnectorInput interface {
	pulumi.Input

	ToTasConnectorOutput() TasConnectorOutput
	ToTasConnectorOutputWithContext(ctx context.Context) TasConnectorOutput
}

func (*TasConnector) ElementType() reflect.Type {
	return reflect.TypeOf((**TasConnector)(nil)).Elem()
}

func (i *TasConnector) ToTasConnectorOutput() TasConnectorOutput {
	return i.ToTasConnectorOutputWithContext(context.Background())
}

func (i *TasConnector) ToTasConnectorOutputWithContext(ctx context.Context) TasConnectorOutput {
	return pulumi.ToOutputWithContext(ctx, i).(TasConnectorOutput)
}

// TasConnectorArrayInput is an input type that accepts TasConnectorArray and TasConnectorArrayOutput values.
// You can construct a concrete instance of `TasConnectorArrayInput` via:
//
//	TasConnectorArray{ TasConnectorArgs{...} }
type TasConnectorArrayInput interface {
	pulumi.Input

	ToTasConnectorArrayOutput() TasConnectorArrayOutput
	ToTasConnectorArrayOutputWithContext(context.Context) TasConnectorArrayOutput
}

type TasConnectorArray []TasConnectorInput

func (TasConnectorArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*TasConnector)(nil)).Elem()
}

func (i TasConnectorArray) ToTasConnectorArrayOutput() TasConnectorArrayOutput {
	return i.ToTasConnectorArrayOutputWithContext(context.Background())
}

func (i TasConnectorArray) ToTasConnectorArrayOutputWithContext(ctx context.Context) TasConnectorArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(TasConnectorArrayOutput)
}

// TasConnectorMapInput is an input type that accepts TasConnectorMap and TasConnectorMapOutput values.
// You can construct a concrete instance of `TasConnectorMapInput` via:
//
//	TasConnectorMap{ "key": TasConnectorArgs{...} }
type TasConnectorMapInput interface {
	pulumi.Input

	ToTasConnectorMapOutput() TasConnectorMapOutput
	ToTasConnectorMapOutputWithContext(context.Context) TasConnectorMapOutput
}

type TasConnectorMap map[string]TasConnectorInput

func (TasConnectorMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*TasConnector)(nil)).Elem()
}

func (i TasConnectorMap) ToTasConnectorMapOutput() TasConnectorMapOutput {
	return i.ToTasConnectorMapOutputWithContext(context.Background())
}

func (i TasConnectorMap) ToTasConnectorMapOutputWithContext(ctx context.Context) TasConnectorMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(TasConnectorMapOutput)
}

type TasConnectorOutput struct{ *pulumi.OutputState }

func (TasConnectorOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**TasConnector)(nil)).Elem()
}

func (o TasConnectorOutput) ToTasConnectorOutput() TasConnectorOutput {
	return o
}

func (o TasConnectorOutput) ToTasConnectorOutputWithContext(ctx context.Context) TasConnectorOutput {
	return o
}

// Contains Tas connector credentials.
func (o TasConnectorOutput) Credentials() TasConnectorCredentialsOutput {
	return o.ApplyT(func(v *TasConnector) TasConnectorCredentialsOutput { return v.Credentials }).(TasConnectorCredentialsOutput)
}

// Tags to filter delegates for connection.
func (o TasConnectorOutput) DelegateSelectors() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *TasConnector) pulumi.StringArrayOutput { return v.DelegateSelectors }).(pulumi.StringArrayOutput)
}

// Description of the resource.
func (o TasConnectorOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *TasConnector) pulumi.StringPtrOutput { return v.Description }).(pulumi.StringPtrOutput)
}

// Execute on delegate or not.
func (o TasConnectorOutput) ExecuteOnDelegate() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *TasConnector) pulumi.BoolPtrOutput { return v.ExecuteOnDelegate }).(pulumi.BoolPtrOutput)
}

// Unique identifier of the resource.
func (o TasConnectorOutput) Identifier() pulumi.StringOutput {
	return o.ApplyT(func(v *TasConnector) pulumi.StringOutput { return v.Identifier }).(pulumi.StringOutput)
}

// Name of the resource.
func (o TasConnectorOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *TasConnector) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// Unique identifier of the organization.
func (o TasConnectorOutput) OrgId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *TasConnector) pulumi.StringPtrOutput { return v.OrgId }).(pulumi.StringPtrOutput)
}

// Unique identifier of the project.
func (o TasConnectorOutput) ProjectId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *TasConnector) pulumi.StringPtrOutput { return v.ProjectId }).(pulumi.StringPtrOutput)
}

// Tags to associate with the resource.
func (o TasConnectorOutput) Tags() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *TasConnector) pulumi.StringArrayOutput { return v.Tags }).(pulumi.StringArrayOutput)
}

type TasConnectorArrayOutput struct{ *pulumi.OutputState }

func (TasConnectorArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*TasConnector)(nil)).Elem()
}

func (o TasConnectorArrayOutput) ToTasConnectorArrayOutput() TasConnectorArrayOutput {
	return o
}

func (o TasConnectorArrayOutput) ToTasConnectorArrayOutputWithContext(ctx context.Context) TasConnectorArrayOutput {
	return o
}

func (o TasConnectorArrayOutput) Index(i pulumi.IntInput) TasConnectorOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *TasConnector {
		return vs[0].([]*TasConnector)[vs[1].(int)]
	}).(TasConnectorOutput)
}

type TasConnectorMapOutput struct{ *pulumi.OutputState }

func (TasConnectorMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*TasConnector)(nil)).Elem()
}

func (o TasConnectorMapOutput) ToTasConnectorMapOutput() TasConnectorMapOutput {
	return o
}

func (o TasConnectorMapOutput) ToTasConnectorMapOutputWithContext(ctx context.Context) TasConnectorMapOutput {
	return o
}

func (o TasConnectorMapOutput) MapIndex(k pulumi.StringInput) TasConnectorOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *TasConnector {
		return vs[0].(map[string]*TasConnector)[vs[1].(string)]
	}).(TasConnectorOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*TasConnectorInput)(nil)).Elem(), &TasConnector{})
	pulumi.RegisterInputType(reflect.TypeOf((*TasConnectorArrayInput)(nil)).Elem(), TasConnectorArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*TasConnectorMapInput)(nil)).Elem(), TasConnectorMap{})
	pulumi.RegisterOutputType(TasConnectorOutput{})
	pulumi.RegisterOutputType(TasConnectorArrayOutput{})
	pulumi.RegisterOutputType(TasConnectorMapOutput{})
}
