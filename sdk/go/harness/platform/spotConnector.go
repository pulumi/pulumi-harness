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

// Resource for creating a Spot connector.
//
// ## Import
//
// # Import using spot cloud provider connector id
//
// ```sh
// $ pulumi import harness:platform/spotConnector:SpotConnector example <connector_id>
// ```
type SpotConnector struct {
	pulumi.CustomResourceState

	// Description of the resource.
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// Unique identifier of the resource.
	Identifier pulumi.StringOutput `pulumi:"identifier"`
	// Name of the resource.
	Name pulumi.StringOutput `pulumi:"name"`
	// Unique identifier of the organization.
	OrgId pulumi.StringPtrOutput `pulumi:"orgId"`
	// Authenticate to Spot using account id and permanent token.
	PermanentToken SpotConnectorPermanentTokenOutput `pulumi:"permanentToken"`
	// Unique identifier of the project.
	ProjectId pulumi.StringPtrOutput `pulumi:"projectId"`
	// Tags to associate with the resource.
	Tags pulumi.StringArrayOutput `pulumi:"tags"`
}

// NewSpotConnector registers a new resource with the given unique name, arguments, and options.
func NewSpotConnector(ctx *pulumi.Context,
	name string, args *SpotConnectorArgs, opts ...pulumi.ResourceOption) (*SpotConnector, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Identifier == nil {
		return nil, errors.New("invalid value for required argument 'Identifier'")
	}
	if args.PermanentToken == nil {
		return nil, errors.New("invalid value for required argument 'PermanentToken'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource SpotConnector
	err := ctx.RegisterResource("harness:platform/spotConnector:SpotConnector", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetSpotConnector gets an existing SpotConnector resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetSpotConnector(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *SpotConnectorState, opts ...pulumi.ResourceOption) (*SpotConnector, error) {
	var resource SpotConnector
	err := ctx.ReadResource("harness:platform/spotConnector:SpotConnector", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering SpotConnector resources.
type spotConnectorState struct {
	// Description of the resource.
	Description *string `pulumi:"description"`
	// Unique identifier of the resource.
	Identifier *string `pulumi:"identifier"`
	// Name of the resource.
	Name *string `pulumi:"name"`
	// Unique identifier of the organization.
	OrgId *string `pulumi:"orgId"`
	// Authenticate to Spot using account id and permanent token.
	PermanentToken *SpotConnectorPermanentToken `pulumi:"permanentToken"`
	// Unique identifier of the project.
	ProjectId *string `pulumi:"projectId"`
	// Tags to associate with the resource.
	Tags []string `pulumi:"tags"`
}

type SpotConnectorState struct {
	// Description of the resource.
	Description pulumi.StringPtrInput
	// Unique identifier of the resource.
	Identifier pulumi.StringPtrInput
	// Name of the resource.
	Name pulumi.StringPtrInput
	// Unique identifier of the organization.
	OrgId pulumi.StringPtrInput
	// Authenticate to Spot using account id and permanent token.
	PermanentToken SpotConnectorPermanentTokenPtrInput
	// Unique identifier of the project.
	ProjectId pulumi.StringPtrInput
	// Tags to associate with the resource.
	Tags pulumi.StringArrayInput
}

func (SpotConnectorState) ElementType() reflect.Type {
	return reflect.TypeOf((*spotConnectorState)(nil)).Elem()
}

type spotConnectorArgs struct {
	// Description of the resource.
	Description *string `pulumi:"description"`
	// Unique identifier of the resource.
	Identifier string `pulumi:"identifier"`
	// Name of the resource.
	Name *string `pulumi:"name"`
	// Unique identifier of the organization.
	OrgId *string `pulumi:"orgId"`
	// Authenticate to Spot using account id and permanent token.
	PermanentToken SpotConnectorPermanentToken `pulumi:"permanentToken"`
	// Unique identifier of the project.
	ProjectId *string `pulumi:"projectId"`
	// Tags to associate with the resource.
	Tags []string `pulumi:"tags"`
}

// The set of arguments for constructing a SpotConnector resource.
type SpotConnectorArgs struct {
	// Description of the resource.
	Description pulumi.StringPtrInput
	// Unique identifier of the resource.
	Identifier pulumi.StringInput
	// Name of the resource.
	Name pulumi.StringPtrInput
	// Unique identifier of the organization.
	OrgId pulumi.StringPtrInput
	// Authenticate to Spot using account id and permanent token.
	PermanentToken SpotConnectorPermanentTokenInput
	// Unique identifier of the project.
	ProjectId pulumi.StringPtrInput
	// Tags to associate with the resource.
	Tags pulumi.StringArrayInput
}

func (SpotConnectorArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*spotConnectorArgs)(nil)).Elem()
}

type SpotConnectorInput interface {
	pulumi.Input

	ToSpotConnectorOutput() SpotConnectorOutput
	ToSpotConnectorOutputWithContext(ctx context.Context) SpotConnectorOutput
}

func (*SpotConnector) ElementType() reflect.Type {
	return reflect.TypeOf((**SpotConnector)(nil)).Elem()
}

func (i *SpotConnector) ToSpotConnectorOutput() SpotConnectorOutput {
	return i.ToSpotConnectorOutputWithContext(context.Background())
}

func (i *SpotConnector) ToSpotConnectorOutputWithContext(ctx context.Context) SpotConnectorOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SpotConnectorOutput)
}

// SpotConnectorArrayInput is an input type that accepts SpotConnectorArray and SpotConnectorArrayOutput values.
// You can construct a concrete instance of `SpotConnectorArrayInput` via:
//
//	SpotConnectorArray{ SpotConnectorArgs{...} }
type SpotConnectorArrayInput interface {
	pulumi.Input

	ToSpotConnectorArrayOutput() SpotConnectorArrayOutput
	ToSpotConnectorArrayOutputWithContext(context.Context) SpotConnectorArrayOutput
}

type SpotConnectorArray []SpotConnectorInput

func (SpotConnectorArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*SpotConnector)(nil)).Elem()
}

func (i SpotConnectorArray) ToSpotConnectorArrayOutput() SpotConnectorArrayOutput {
	return i.ToSpotConnectorArrayOutputWithContext(context.Background())
}

func (i SpotConnectorArray) ToSpotConnectorArrayOutputWithContext(ctx context.Context) SpotConnectorArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SpotConnectorArrayOutput)
}

// SpotConnectorMapInput is an input type that accepts SpotConnectorMap and SpotConnectorMapOutput values.
// You can construct a concrete instance of `SpotConnectorMapInput` via:
//
//	SpotConnectorMap{ "key": SpotConnectorArgs{...} }
type SpotConnectorMapInput interface {
	pulumi.Input

	ToSpotConnectorMapOutput() SpotConnectorMapOutput
	ToSpotConnectorMapOutputWithContext(context.Context) SpotConnectorMapOutput
}

type SpotConnectorMap map[string]SpotConnectorInput

func (SpotConnectorMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*SpotConnector)(nil)).Elem()
}

func (i SpotConnectorMap) ToSpotConnectorMapOutput() SpotConnectorMapOutput {
	return i.ToSpotConnectorMapOutputWithContext(context.Background())
}

func (i SpotConnectorMap) ToSpotConnectorMapOutputWithContext(ctx context.Context) SpotConnectorMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SpotConnectorMapOutput)
}

type SpotConnectorOutput struct{ *pulumi.OutputState }

func (SpotConnectorOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**SpotConnector)(nil)).Elem()
}

func (o SpotConnectorOutput) ToSpotConnectorOutput() SpotConnectorOutput {
	return o
}

func (o SpotConnectorOutput) ToSpotConnectorOutputWithContext(ctx context.Context) SpotConnectorOutput {
	return o
}

// Description of the resource.
func (o SpotConnectorOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *SpotConnector) pulumi.StringPtrOutput { return v.Description }).(pulumi.StringPtrOutput)
}

// Unique identifier of the resource.
func (o SpotConnectorOutput) Identifier() pulumi.StringOutput {
	return o.ApplyT(func(v *SpotConnector) pulumi.StringOutput { return v.Identifier }).(pulumi.StringOutput)
}

// Name of the resource.
func (o SpotConnectorOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *SpotConnector) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// Unique identifier of the organization.
func (o SpotConnectorOutput) OrgId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *SpotConnector) pulumi.StringPtrOutput { return v.OrgId }).(pulumi.StringPtrOutput)
}

// Authenticate to Spot using account id and permanent token.
func (o SpotConnectorOutput) PermanentToken() SpotConnectorPermanentTokenOutput {
	return o.ApplyT(func(v *SpotConnector) SpotConnectorPermanentTokenOutput { return v.PermanentToken }).(SpotConnectorPermanentTokenOutput)
}

// Unique identifier of the project.
func (o SpotConnectorOutput) ProjectId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *SpotConnector) pulumi.StringPtrOutput { return v.ProjectId }).(pulumi.StringPtrOutput)
}

// Tags to associate with the resource.
func (o SpotConnectorOutput) Tags() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *SpotConnector) pulumi.StringArrayOutput { return v.Tags }).(pulumi.StringArrayOutput)
}

type SpotConnectorArrayOutput struct{ *pulumi.OutputState }

func (SpotConnectorArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*SpotConnector)(nil)).Elem()
}

func (o SpotConnectorArrayOutput) ToSpotConnectorArrayOutput() SpotConnectorArrayOutput {
	return o
}

func (o SpotConnectorArrayOutput) ToSpotConnectorArrayOutputWithContext(ctx context.Context) SpotConnectorArrayOutput {
	return o
}

func (o SpotConnectorArrayOutput) Index(i pulumi.IntInput) SpotConnectorOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *SpotConnector {
		return vs[0].([]*SpotConnector)[vs[1].(int)]
	}).(SpotConnectorOutput)
}

type SpotConnectorMapOutput struct{ *pulumi.OutputState }

func (SpotConnectorMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*SpotConnector)(nil)).Elem()
}

func (o SpotConnectorMapOutput) ToSpotConnectorMapOutput() SpotConnectorMapOutput {
	return o
}

func (o SpotConnectorMapOutput) ToSpotConnectorMapOutputWithContext(ctx context.Context) SpotConnectorMapOutput {
	return o
}

func (o SpotConnectorMapOutput) MapIndex(k pulumi.StringInput) SpotConnectorOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *SpotConnector {
		return vs[0].(map[string]*SpotConnector)[vs[1].(string)]
	}).(SpotConnectorOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*SpotConnectorInput)(nil)).Elem(), &SpotConnector{})
	pulumi.RegisterInputType(reflect.TypeOf((*SpotConnectorArrayInput)(nil)).Elem(), SpotConnectorArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*SpotConnectorMapInput)(nil)).Elem(), SpotConnectorMap{})
	pulumi.RegisterOutputType(SpotConnectorOutput{})
	pulumi.RegisterOutputType(SpotConnectorArrayOutput{})
	pulumi.RegisterOutputType(SpotConnectorMapOutput{})
}
