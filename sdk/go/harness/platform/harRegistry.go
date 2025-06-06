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

// Resource for creating and managing Harness Registries.
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
//			// Example of a Virtual Registry
//			_, err := platform.NewHarRegistry(ctx, "virtual_registry", &platform.HarRegistryArgs{
//				Identifier:  pulumi.String("virtual_docker_registry"),
//				Description: pulumi.String("Virtual Docker Registry"),
//				SpaceRef:    pulumi.String("accountId/orgId/projectId"),
//				PackageType: pulumi.String("DOCKER"),
//				Configs: platform.HarRegistryConfigArray{
//					&platform.HarRegistryConfigArgs{
//						Type: pulumi.String("VIRTUAL"),
//						UpstreamProxies: pulumi.StringArray{
//							pulumi.String("registry1"),
//							pulumi.String("registry2"),
//						},
//					},
//				},
//				ParentRef: pulumi.String("accountId/orgId/projectId"),
//			})
//			if err != nil {
//				return err
//			}
//			// Example of an Upstream Registry with Authentication
//			_, err = platform.NewHarRegistry(ctx, "upstream_registry", &platform.HarRegistryArgs{
//				Identifier:  pulumi.String("upstream_helm_registry"),
//				Description: pulumi.String("Upstream Helm Registry"),
//				SpaceRef:    pulumi.String("accountId/orgId/projectId"),
//				PackageType: pulumi.String("HELM"),
//				Configs: platform.HarRegistryConfigArray{
//					&platform.HarRegistryConfigArgs{
//						Type:   pulumi.String("UPSTREAM"),
//						Source: pulumi.String("CUSTOM"),
//						Url:    pulumi.String("https://helm.sh"),
//						Auths: platform.HarRegistryConfigAuthArray{
//							&platform.HarRegistryConfigAuthArgs{
//								AuthType:         pulumi.String("UserPassword"),
//								UserName:         pulumi.String("registry_user"),
//								SecretIdentifier: pulumi.String("registry_password"),
//								SecretSpacePath:  pulumi.String("accountId/orgId/projectId"),
//							},
//						},
//					},
//				},
//				ParentRef: pulumi.String("accountId/orgId/projectId"),
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
type HarRegistry struct {
	pulumi.CustomResourceState

	// Allowed pattern for the registry
	AllowedPatterns pulumi.StringArrayOutput `pulumi:"allowedPatterns"`
	// Blocked pattern for the registry
	BlockedPatterns pulumi.StringArrayOutput `pulumi:"blockedPatterns"`
	// Configuration for the registry
	Configs HarRegistryConfigArrayOutput `pulumi:"configs"`
	// Timestamp when the registry was created
	CreatedAt pulumi.StringOutput `pulumi:"createdAt"`
	// Description of the registry
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// Unique identifier of the registry
	Identifier pulumi.StringOutput `pulumi:"identifier"`
	// Type of package (DOCKER, HELM, etc.)
	PackageType pulumi.StringOutput `pulumi:"packageType"`
	// Parent reference for the registry
	ParentRef pulumi.StringPtrOutput `pulumi:"parentRef"`
	// Space reference for the registry
	SpaceRef pulumi.StringPtrOutput `pulumi:"spaceRef"`
	// URL of the registry
	Url pulumi.StringOutput `pulumi:"url"`
}

// NewHarRegistry registers a new resource with the given unique name, arguments, and options.
func NewHarRegistry(ctx *pulumi.Context,
	name string, args *HarRegistryArgs, opts ...pulumi.ResourceOption) (*HarRegistry, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Configs == nil {
		return nil, errors.New("invalid value for required argument 'Configs'")
	}
	if args.Identifier == nil {
		return nil, errors.New("invalid value for required argument 'Identifier'")
	}
	if args.PackageType == nil {
		return nil, errors.New("invalid value for required argument 'PackageType'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource HarRegistry
	err := ctx.RegisterResource("harness:platform/harRegistry:HarRegistry", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetHarRegistry gets an existing HarRegistry resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetHarRegistry(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *HarRegistryState, opts ...pulumi.ResourceOption) (*HarRegistry, error) {
	var resource HarRegistry
	err := ctx.ReadResource("harness:platform/harRegistry:HarRegistry", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering HarRegistry resources.
type harRegistryState struct {
	// Allowed pattern for the registry
	AllowedPatterns []string `pulumi:"allowedPatterns"`
	// Blocked pattern for the registry
	BlockedPatterns []string `pulumi:"blockedPatterns"`
	// Configuration for the registry
	Configs []HarRegistryConfig `pulumi:"configs"`
	// Timestamp when the registry was created
	CreatedAt *string `pulumi:"createdAt"`
	// Description of the registry
	Description *string `pulumi:"description"`
	// Unique identifier of the registry
	Identifier *string `pulumi:"identifier"`
	// Type of package (DOCKER, HELM, etc.)
	PackageType *string `pulumi:"packageType"`
	// Parent reference for the registry
	ParentRef *string `pulumi:"parentRef"`
	// Space reference for the registry
	SpaceRef *string `pulumi:"spaceRef"`
	// URL of the registry
	Url *string `pulumi:"url"`
}

type HarRegistryState struct {
	// Allowed pattern for the registry
	AllowedPatterns pulumi.StringArrayInput
	// Blocked pattern for the registry
	BlockedPatterns pulumi.StringArrayInput
	// Configuration for the registry
	Configs HarRegistryConfigArrayInput
	// Timestamp when the registry was created
	CreatedAt pulumi.StringPtrInput
	// Description of the registry
	Description pulumi.StringPtrInput
	// Unique identifier of the registry
	Identifier pulumi.StringPtrInput
	// Type of package (DOCKER, HELM, etc.)
	PackageType pulumi.StringPtrInput
	// Parent reference for the registry
	ParentRef pulumi.StringPtrInput
	// Space reference for the registry
	SpaceRef pulumi.StringPtrInput
	// URL of the registry
	Url pulumi.StringPtrInput
}

func (HarRegistryState) ElementType() reflect.Type {
	return reflect.TypeOf((*harRegistryState)(nil)).Elem()
}

type harRegistryArgs struct {
	// Allowed pattern for the registry
	AllowedPatterns []string `pulumi:"allowedPatterns"`
	// Blocked pattern for the registry
	BlockedPatterns []string `pulumi:"blockedPatterns"`
	// Configuration for the registry
	Configs []HarRegistryConfig `pulumi:"configs"`
	// Description of the registry
	Description *string `pulumi:"description"`
	// Unique identifier of the registry
	Identifier string `pulumi:"identifier"`
	// Type of package (DOCKER, HELM, etc.)
	PackageType string `pulumi:"packageType"`
	// Parent reference for the registry
	ParentRef *string `pulumi:"parentRef"`
	// Space reference for the registry
	SpaceRef *string `pulumi:"spaceRef"`
}

// The set of arguments for constructing a HarRegistry resource.
type HarRegistryArgs struct {
	// Allowed pattern for the registry
	AllowedPatterns pulumi.StringArrayInput
	// Blocked pattern for the registry
	BlockedPatterns pulumi.StringArrayInput
	// Configuration for the registry
	Configs HarRegistryConfigArrayInput
	// Description of the registry
	Description pulumi.StringPtrInput
	// Unique identifier of the registry
	Identifier pulumi.StringInput
	// Type of package (DOCKER, HELM, etc.)
	PackageType pulumi.StringInput
	// Parent reference for the registry
	ParentRef pulumi.StringPtrInput
	// Space reference for the registry
	SpaceRef pulumi.StringPtrInput
}

func (HarRegistryArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*harRegistryArgs)(nil)).Elem()
}

type HarRegistryInput interface {
	pulumi.Input

	ToHarRegistryOutput() HarRegistryOutput
	ToHarRegistryOutputWithContext(ctx context.Context) HarRegistryOutput
}

func (*HarRegistry) ElementType() reflect.Type {
	return reflect.TypeOf((**HarRegistry)(nil)).Elem()
}

func (i *HarRegistry) ToHarRegistryOutput() HarRegistryOutput {
	return i.ToHarRegistryOutputWithContext(context.Background())
}

func (i *HarRegistry) ToHarRegistryOutputWithContext(ctx context.Context) HarRegistryOutput {
	return pulumi.ToOutputWithContext(ctx, i).(HarRegistryOutput)
}

// HarRegistryArrayInput is an input type that accepts HarRegistryArray and HarRegistryArrayOutput values.
// You can construct a concrete instance of `HarRegistryArrayInput` via:
//
//	HarRegistryArray{ HarRegistryArgs{...} }
type HarRegistryArrayInput interface {
	pulumi.Input

	ToHarRegistryArrayOutput() HarRegistryArrayOutput
	ToHarRegistryArrayOutputWithContext(context.Context) HarRegistryArrayOutput
}

type HarRegistryArray []HarRegistryInput

func (HarRegistryArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*HarRegistry)(nil)).Elem()
}

func (i HarRegistryArray) ToHarRegistryArrayOutput() HarRegistryArrayOutput {
	return i.ToHarRegistryArrayOutputWithContext(context.Background())
}

func (i HarRegistryArray) ToHarRegistryArrayOutputWithContext(ctx context.Context) HarRegistryArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(HarRegistryArrayOutput)
}

// HarRegistryMapInput is an input type that accepts HarRegistryMap and HarRegistryMapOutput values.
// You can construct a concrete instance of `HarRegistryMapInput` via:
//
//	HarRegistryMap{ "key": HarRegistryArgs{...} }
type HarRegistryMapInput interface {
	pulumi.Input

	ToHarRegistryMapOutput() HarRegistryMapOutput
	ToHarRegistryMapOutputWithContext(context.Context) HarRegistryMapOutput
}

type HarRegistryMap map[string]HarRegistryInput

func (HarRegistryMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*HarRegistry)(nil)).Elem()
}

func (i HarRegistryMap) ToHarRegistryMapOutput() HarRegistryMapOutput {
	return i.ToHarRegistryMapOutputWithContext(context.Background())
}

func (i HarRegistryMap) ToHarRegistryMapOutputWithContext(ctx context.Context) HarRegistryMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(HarRegistryMapOutput)
}

type HarRegistryOutput struct{ *pulumi.OutputState }

func (HarRegistryOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**HarRegistry)(nil)).Elem()
}

func (o HarRegistryOutput) ToHarRegistryOutput() HarRegistryOutput {
	return o
}

func (o HarRegistryOutput) ToHarRegistryOutputWithContext(ctx context.Context) HarRegistryOutput {
	return o
}

// Allowed pattern for the registry
func (o HarRegistryOutput) AllowedPatterns() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *HarRegistry) pulumi.StringArrayOutput { return v.AllowedPatterns }).(pulumi.StringArrayOutput)
}

// Blocked pattern for the registry
func (o HarRegistryOutput) BlockedPatterns() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *HarRegistry) pulumi.StringArrayOutput { return v.BlockedPatterns }).(pulumi.StringArrayOutput)
}

// Configuration for the registry
func (o HarRegistryOutput) Configs() HarRegistryConfigArrayOutput {
	return o.ApplyT(func(v *HarRegistry) HarRegistryConfigArrayOutput { return v.Configs }).(HarRegistryConfigArrayOutput)
}

// Timestamp when the registry was created
func (o HarRegistryOutput) CreatedAt() pulumi.StringOutput {
	return o.ApplyT(func(v *HarRegistry) pulumi.StringOutput { return v.CreatedAt }).(pulumi.StringOutput)
}

// Description of the registry
func (o HarRegistryOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *HarRegistry) pulumi.StringPtrOutput { return v.Description }).(pulumi.StringPtrOutput)
}

// Unique identifier of the registry
func (o HarRegistryOutput) Identifier() pulumi.StringOutput {
	return o.ApplyT(func(v *HarRegistry) pulumi.StringOutput { return v.Identifier }).(pulumi.StringOutput)
}

// Type of package (DOCKER, HELM, etc.)
func (o HarRegistryOutput) PackageType() pulumi.StringOutput {
	return o.ApplyT(func(v *HarRegistry) pulumi.StringOutput { return v.PackageType }).(pulumi.StringOutput)
}

// Parent reference for the registry
func (o HarRegistryOutput) ParentRef() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *HarRegistry) pulumi.StringPtrOutput { return v.ParentRef }).(pulumi.StringPtrOutput)
}

// Space reference for the registry
func (o HarRegistryOutput) SpaceRef() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *HarRegistry) pulumi.StringPtrOutput { return v.SpaceRef }).(pulumi.StringPtrOutput)
}

// URL of the registry
func (o HarRegistryOutput) Url() pulumi.StringOutput {
	return o.ApplyT(func(v *HarRegistry) pulumi.StringOutput { return v.Url }).(pulumi.StringOutput)
}

type HarRegistryArrayOutput struct{ *pulumi.OutputState }

func (HarRegistryArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*HarRegistry)(nil)).Elem()
}

func (o HarRegistryArrayOutput) ToHarRegistryArrayOutput() HarRegistryArrayOutput {
	return o
}

func (o HarRegistryArrayOutput) ToHarRegistryArrayOutputWithContext(ctx context.Context) HarRegistryArrayOutput {
	return o
}

func (o HarRegistryArrayOutput) Index(i pulumi.IntInput) HarRegistryOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *HarRegistry {
		return vs[0].([]*HarRegistry)[vs[1].(int)]
	}).(HarRegistryOutput)
}

type HarRegistryMapOutput struct{ *pulumi.OutputState }

func (HarRegistryMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*HarRegistry)(nil)).Elem()
}

func (o HarRegistryMapOutput) ToHarRegistryMapOutput() HarRegistryMapOutput {
	return o
}

func (o HarRegistryMapOutput) ToHarRegistryMapOutputWithContext(ctx context.Context) HarRegistryMapOutput {
	return o
}

func (o HarRegistryMapOutput) MapIndex(k pulumi.StringInput) HarRegistryOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *HarRegistry {
		return vs[0].(map[string]*HarRegistry)[vs[1].(string)]
	}).(HarRegistryOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*HarRegistryInput)(nil)).Elem(), &HarRegistry{})
	pulumi.RegisterInputType(reflect.TypeOf((*HarRegistryArrayInput)(nil)).Elem(), HarRegistryArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*HarRegistryMapInput)(nil)).Elem(), HarRegistryMap{})
	pulumi.RegisterOutputType(HarRegistryOutput{})
	pulumi.RegisterOutputType(HarRegistryArrayOutput{})
	pulumi.RegisterOutputType(HarRegistryMapOutput{})
}
