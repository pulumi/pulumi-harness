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

// Resource for creating a Harness CCM Filters.
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
//			_, err := harness.NewPlatformCcmFilters(ctx, "test", &harness.PlatformCcmFiltersArgs{
//				Identifier: pulumi.String("identifier"),
//				Name:       pulumi.String("name"),
//				OrgId:      pulumi.String("org_id"),
//				ProjectId:  pulumi.String("project_id"),
//				Type:       pulumi.String("CCMRecommendation"),
//				FilterProperties: &harness.PlatformCcmFiltersFilterPropertiesArgs{
//					Tags: pulumi.StringArray{
//						pulumi.String("foo:bar"),
//					},
//					FilterType: pulumi.String("CCMRecommendation"),
//				},
//				FilterVisibility: pulumi.String("EveryOne"),
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
// # Import account level ccm filter
//
// ```sh
// $ pulumi import harness:index/platformCcmFilters:PlatformCcmFilters example <filter_id>/<type>
// ```
//
// # Import org level ccm filter
//
// ```sh
// $ pulumi import harness:index/platformCcmFilters:PlatformCcmFilters example <ord_id>/<filter_id>/<type>
// ```
//
// # Import project level ccm filter
//
// ```sh
// $ pulumi import harness:index/platformCcmFilters:PlatformCcmFilters example <org_id>/<project_id>/<filter_id>/<type>
// ```
type PlatformCcmFilters struct {
	pulumi.CustomResourceState

	// Properties of the filters entity defined in Harness.
	FilterProperties PlatformCcmFiltersFilterPropertiesOutput `pulumi:"filterProperties"`
	// This indicates visibility of filters. By default, everyone can view this filter..
	FilterVisibility pulumi.StringPtrOutput `pulumi:"filterVisibility"`
	// Unique identifier of the resource.
	Identifier pulumi.StringOutput `pulumi:"identifier"`
	// Name of the ccm filters.
	Name pulumi.StringOutput `pulumi:"name"`
	// Organization Identifier for the Entity.
	OrgId pulumi.StringPtrOutput `pulumi:"orgId"`
	// Project Identifier for the Entity.
	ProjectId pulumi.StringPtrOutput `pulumi:"projectId"`
	// Type of ccm filters.
	Type pulumi.StringOutput `pulumi:"type"`
}

// NewPlatformCcmFilters registers a new resource with the given unique name, arguments, and options.
func NewPlatformCcmFilters(ctx *pulumi.Context,
	name string, args *PlatformCcmFiltersArgs, opts ...pulumi.ResourceOption) (*PlatformCcmFilters, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.FilterProperties == nil {
		return nil, errors.New("invalid value for required argument 'FilterProperties'")
	}
	if args.Identifier == nil {
		return nil, errors.New("invalid value for required argument 'Identifier'")
	}
	if args.Type == nil {
		return nil, errors.New("invalid value for required argument 'Type'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource PlatformCcmFilters
	err := ctx.RegisterResource("harness:index/platformCcmFilters:PlatformCcmFilters", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetPlatformCcmFilters gets an existing PlatformCcmFilters resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetPlatformCcmFilters(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *PlatformCcmFiltersState, opts ...pulumi.ResourceOption) (*PlatformCcmFilters, error) {
	var resource PlatformCcmFilters
	err := ctx.ReadResource("harness:index/platformCcmFilters:PlatformCcmFilters", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering PlatformCcmFilters resources.
type platformCcmFiltersState struct {
	// Properties of the filters entity defined in Harness.
	FilterProperties *PlatformCcmFiltersFilterProperties `pulumi:"filterProperties"`
	// This indicates visibility of filters. By default, everyone can view this filter..
	FilterVisibility *string `pulumi:"filterVisibility"`
	// Unique identifier of the resource.
	Identifier *string `pulumi:"identifier"`
	// Name of the ccm filters.
	Name *string `pulumi:"name"`
	// Organization Identifier for the Entity.
	OrgId *string `pulumi:"orgId"`
	// Project Identifier for the Entity.
	ProjectId *string `pulumi:"projectId"`
	// Type of ccm filters.
	Type *string `pulumi:"type"`
}

type PlatformCcmFiltersState struct {
	// Properties of the filters entity defined in Harness.
	FilterProperties PlatformCcmFiltersFilterPropertiesPtrInput
	// This indicates visibility of filters. By default, everyone can view this filter..
	FilterVisibility pulumi.StringPtrInput
	// Unique identifier of the resource.
	Identifier pulumi.StringPtrInput
	// Name of the ccm filters.
	Name pulumi.StringPtrInput
	// Organization Identifier for the Entity.
	OrgId pulumi.StringPtrInput
	// Project Identifier for the Entity.
	ProjectId pulumi.StringPtrInput
	// Type of ccm filters.
	Type pulumi.StringPtrInput
}

func (PlatformCcmFiltersState) ElementType() reflect.Type {
	return reflect.TypeOf((*platformCcmFiltersState)(nil)).Elem()
}

type platformCcmFiltersArgs struct {
	// Properties of the filters entity defined in Harness.
	FilterProperties PlatformCcmFiltersFilterProperties `pulumi:"filterProperties"`
	// This indicates visibility of filters. By default, everyone can view this filter..
	FilterVisibility *string `pulumi:"filterVisibility"`
	// Unique identifier of the resource.
	Identifier string `pulumi:"identifier"`
	// Name of the ccm filters.
	Name *string `pulumi:"name"`
	// Organization Identifier for the Entity.
	OrgId *string `pulumi:"orgId"`
	// Project Identifier for the Entity.
	ProjectId *string `pulumi:"projectId"`
	// Type of ccm filters.
	Type string `pulumi:"type"`
}

// The set of arguments for constructing a PlatformCcmFilters resource.
type PlatformCcmFiltersArgs struct {
	// Properties of the filters entity defined in Harness.
	FilterProperties PlatformCcmFiltersFilterPropertiesInput
	// This indicates visibility of filters. By default, everyone can view this filter..
	FilterVisibility pulumi.StringPtrInput
	// Unique identifier of the resource.
	Identifier pulumi.StringInput
	// Name of the ccm filters.
	Name pulumi.StringPtrInput
	// Organization Identifier for the Entity.
	OrgId pulumi.StringPtrInput
	// Project Identifier for the Entity.
	ProjectId pulumi.StringPtrInput
	// Type of ccm filters.
	Type pulumi.StringInput
}

func (PlatformCcmFiltersArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*platformCcmFiltersArgs)(nil)).Elem()
}

type PlatformCcmFiltersInput interface {
	pulumi.Input

	ToPlatformCcmFiltersOutput() PlatformCcmFiltersOutput
	ToPlatformCcmFiltersOutputWithContext(ctx context.Context) PlatformCcmFiltersOutput
}

func (*PlatformCcmFilters) ElementType() reflect.Type {
	return reflect.TypeOf((**PlatformCcmFilters)(nil)).Elem()
}

func (i *PlatformCcmFilters) ToPlatformCcmFiltersOutput() PlatformCcmFiltersOutput {
	return i.ToPlatformCcmFiltersOutputWithContext(context.Background())
}

func (i *PlatformCcmFilters) ToPlatformCcmFiltersOutputWithContext(ctx context.Context) PlatformCcmFiltersOutput {
	return pulumi.ToOutputWithContext(ctx, i).(PlatformCcmFiltersOutput)
}

// PlatformCcmFiltersArrayInput is an input type that accepts PlatformCcmFiltersArray and PlatformCcmFiltersArrayOutput values.
// You can construct a concrete instance of `PlatformCcmFiltersArrayInput` via:
//
//	PlatformCcmFiltersArray{ PlatformCcmFiltersArgs{...} }
type PlatformCcmFiltersArrayInput interface {
	pulumi.Input

	ToPlatformCcmFiltersArrayOutput() PlatformCcmFiltersArrayOutput
	ToPlatformCcmFiltersArrayOutputWithContext(context.Context) PlatformCcmFiltersArrayOutput
}

type PlatformCcmFiltersArray []PlatformCcmFiltersInput

func (PlatformCcmFiltersArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*PlatformCcmFilters)(nil)).Elem()
}

func (i PlatformCcmFiltersArray) ToPlatformCcmFiltersArrayOutput() PlatformCcmFiltersArrayOutput {
	return i.ToPlatformCcmFiltersArrayOutputWithContext(context.Background())
}

func (i PlatformCcmFiltersArray) ToPlatformCcmFiltersArrayOutputWithContext(ctx context.Context) PlatformCcmFiltersArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(PlatformCcmFiltersArrayOutput)
}

// PlatformCcmFiltersMapInput is an input type that accepts PlatformCcmFiltersMap and PlatformCcmFiltersMapOutput values.
// You can construct a concrete instance of `PlatformCcmFiltersMapInput` via:
//
//	PlatformCcmFiltersMap{ "key": PlatformCcmFiltersArgs{...} }
type PlatformCcmFiltersMapInput interface {
	pulumi.Input

	ToPlatformCcmFiltersMapOutput() PlatformCcmFiltersMapOutput
	ToPlatformCcmFiltersMapOutputWithContext(context.Context) PlatformCcmFiltersMapOutput
}

type PlatformCcmFiltersMap map[string]PlatformCcmFiltersInput

func (PlatformCcmFiltersMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*PlatformCcmFilters)(nil)).Elem()
}

func (i PlatformCcmFiltersMap) ToPlatformCcmFiltersMapOutput() PlatformCcmFiltersMapOutput {
	return i.ToPlatformCcmFiltersMapOutputWithContext(context.Background())
}

func (i PlatformCcmFiltersMap) ToPlatformCcmFiltersMapOutputWithContext(ctx context.Context) PlatformCcmFiltersMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(PlatformCcmFiltersMapOutput)
}

type PlatformCcmFiltersOutput struct{ *pulumi.OutputState }

func (PlatformCcmFiltersOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**PlatformCcmFilters)(nil)).Elem()
}

func (o PlatformCcmFiltersOutput) ToPlatformCcmFiltersOutput() PlatformCcmFiltersOutput {
	return o
}

func (o PlatformCcmFiltersOutput) ToPlatformCcmFiltersOutputWithContext(ctx context.Context) PlatformCcmFiltersOutput {
	return o
}

// Properties of the filters entity defined in Harness.
func (o PlatformCcmFiltersOutput) FilterProperties() PlatformCcmFiltersFilterPropertiesOutput {
	return o.ApplyT(func(v *PlatformCcmFilters) PlatformCcmFiltersFilterPropertiesOutput { return v.FilterProperties }).(PlatformCcmFiltersFilterPropertiesOutput)
}

// This indicates visibility of filters. By default, everyone can view this filter..
func (o PlatformCcmFiltersOutput) FilterVisibility() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *PlatformCcmFilters) pulumi.StringPtrOutput { return v.FilterVisibility }).(pulumi.StringPtrOutput)
}

// Unique identifier of the resource.
func (o PlatformCcmFiltersOutput) Identifier() pulumi.StringOutput {
	return o.ApplyT(func(v *PlatformCcmFilters) pulumi.StringOutput { return v.Identifier }).(pulumi.StringOutput)
}

// Name of the ccm filters.
func (o PlatformCcmFiltersOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *PlatformCcmFilters) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// Organization Identifier for the Entity.
func (o PlatformCcmFiltersOutput) OrgId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *PlatformCcmFilters) pulumi.StringPtrOutput { return v.OrgId }).(pulumi.StringPtrOutput)
}

// Project Identifier for the Entity.
func (o PlatformCcmFiltersOutput) ProjectId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *PlatformCcmFilters) pulumi.StringPtrOutput { return v.ProjectId }).(pulumi.StringPtrOutput)
}

// Type of ccm filters.
func (o PlatformCcmFiltersOutput) Type() pulumi.StringOutput {
	return o.ApplyT(func(v *PlatformCcmFilters) pulumi.StringOutput { return v.Type }).(pulumi.StringOutput)
}

type PlatformCcmFiltersArrayOutput struct{ *pulumi.OutputState }

func (PlatformCcmFiltersArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*PlatformCcmFilters)(nil)).Elem()
}

func (o PlatformCcmFiltersArrayOutput) ToPlatformCcmFiltersArrayOutput() PlatformCcmFiltersArrayOutput {
	return o
}

func (o PlatformCcmFiltersArrayOutput) ToPlatformCcmFiltersArrayOutputWithContext(ctx context.Context) PlatformCcmFiltersArrayOutput {
	return o
}

func (o PlatformCcmFiltersArrayOutput) Index(i pulumi.IntInput) PlatformCcmFiltersOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *PlatformCcmFilters {
		return vs[0].([]*PlatformCcmFilters)[vs[1].(int)]
	}).(PlatformCcmFiltersOutput)
}

type PlatformCcmFiltersMapOutput struct{ *pulumi.OutputState }

func (PlatformCcmFiltersMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*PlatformCcmFilters)(nil)).Elem()
}

func (o PlatformCcmFiltersMapOutput) ToPlatformCcmFiltersMapOutput() PlatformCcmFiltersMapOutput {
	return o
}

func (o PlatformCcmFiltersMapOutput) ToPlatformCcmFiltersMapOutputWithContext(ctx context.Context) PlatformCcmFiltersMapOutput {
	return o
}

func (o PlatformCcmFiltersMapOutput) MapIndex(k pulumi.StringInput) PlatformCcmFiltersOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *PlatformCcmFilters {
		return vs[0].(map[string]*PlatformCcmFilters)[vs[1].(string)]
	}).(PlatformCcmFiltersOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*PlatformCcmFiltersInput)(nil)).Elem(), &PlatformCcmFilters{})
	pulumi.RegisterInputType(reflect.TypeOf((*PlatformCcmFiltersArrayInput)(nil)).Elem(), PlatformCcmFiltersArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*PlatformCcmFiltersMapInput)(nil)).Elem(), PlatformCcmFiltersMap{})
	pulumi.RegisterOutputType(PlatformCcmFiltersOutput{})
	pulumi.RegisterOutputType(PlatformCcmFiltersArrayOutput{})
	pulumi.RegisterOutputType(PlatformCcmFiltersMapOutput{})
}
