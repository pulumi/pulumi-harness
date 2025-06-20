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

// Resource for creating a Kubernetes Cloud Cost connector.
//
// These connectors need to be created at the account level in Harness.
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
//			_, err := platform.NewKubernetesCloudCostConnector(ctx, "example", &platform.KubernetesCloudCostConnectorArgs{
//				Identifier:  pulumi.String("identifier"),
//				Name:        pulumi.String("name"),
//				Description: pulumi.String("example"),
//				Tags: pulumi.StringArray{
//					pulumi.String("foo:bar"),
//				},
//				FeaturesEnableds: pulumi.StringArray{
//					pulumi.String("VISIBILITY"),
//					pulumi.String("OPTIMIZATION"),
//				},
//				ConnectorRef: pulumi.String("connector_ref"),
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
// # Import account level kubernetes cloud cost connector
//
// ```sh
// $ pulumi import harness:platform/kubernetesCloudCostConnector:KubernetesCloudCostConnector example <connector_id>
// ```
type KubernetesCloudCostConnector struct {
	pulumi.CustomResourceState

	// Reference to a Kubernetes connector also at the account level.
	ConnectorRef pulumi.StringOutput `pulumi:"connectorRef"`
	// Description of the resource.
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// Indicates which feature to enable among Billing, Optimization, and Visibility.
	FeaturesEnableds pulumi.StringArrayOutput `pulumi:"featuresEnableds"`
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

// NewKubernetesCloudCostConnector registers a new resource with the given unique name, arguments, and options.
func NewKubernetesCloudCostConnector(ctx *pulumi.Context,
	name string, args *KubernetesCloudCostConnectorArgs, opts ...pulumi.ResourceOption) (*KubernetesCloudCostConnector, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.ConnectorRef == nil {
		return nil, errors.New("invalid value for required argument 'ConnectorRef'")
	}
	if args.FeaturesEnableds == nil {
		return nil, errors.New("invalid value for required argument 'FeaturesEnableds'")
	}
	if args.Identifier == nil {
		return nil, errors.New("invalid value for required argument 'Identifier'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource KubernetesCloudCostConnector
	err := ctx.RegisterResource("harness:platform/kubernetesCloudCostConnector:KubernetesCloudCostConnector", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetKubernetesCloudCostConnector gets an existing KubernetesCloudCostConnector resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetKubernetesCloudCostConnector(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *KubernetesCloudCostConnectorState, opts ...pulumi.ResourceOption) (*KubernetesCloudCostConnector, error) {
	var resource KubernetesCloudCostConnector
	err := ctx.ReadResource("harness:platform/kubernetesCloudCostConnector:KubernetesCloudCostConnector", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering KubernetesCloudCostConnector resources.
type kubernetesCloudCostConnectorState struct {
	// Reference to a Kubernetes connector also at the account level.
	ConnectorRef *string `pulumi:"connectorRef"`
	// Description of the resource.
	Description *string `pulumi:"description"`
	// Indicates which feature to enable among Billing, Optimization, and Visibility.
	FeaturesEnableds []string `pulumi:"featuresEnableds"`
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

type KubernetesCloudCostConnectorState struct {
	// Reference to a Kubernetes connector also at the account level.
	ConnectorRef pulumi.StringPtrInput
	// Description of the resource.
	Description pulumi.StringPtrInput
	// Indicates which feature to enable among Billing, Optimization, and Visibility.
	FeaturesEnableds pulumi.StringArrayInput
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

func (KubernetesCloudCostConnectorState) ElementType() reflect.Type {
	return reflect.TypeOf((*kubernetesCloudCostConnectorState)(nil)).Elem()
}

type kubernetesCloudCostConnectorArgs struct {
	// Reference to a Kubernetes connector also at the account level.
	ConnectorRef string `pulumi:"connectorRef"`
	// Description of the resource.
	Description *string `pulumi:"description"`
	// Indicates which feature to enable among Billing, Optimization, and Visibility.
	FeaturesEnableds []string `pulumi:"featuresEnableds"`
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

// The set of arguments for constructing a KubernetesCloudCostConnector resource.
type KubernetesCloudCostConnectorArgs struct {
	// Reference to a Kubernetes connector also at the account level.
	ConnectorRef pulumi.StringInput
	// Description of the resource.
	Description pulumi.StringPtrInput
	// Indicates which feature to enable among Billing, Optimization, and Visibility.
	FeaturesEnableds pulumi.StringArrayInput
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

func (KubernetesCloudCostConnectorArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*kubernetesCloudCostConnectorArgs)(nil)).Elem()
}

type KubernetesCloudCostConnectorInput interface {
	pulumi.Input

	ToKubernetesCloudCostConnectorOutput() KubernetesCloudCostConnectorOutput
	ToKubernetesCloudCostConnectorOutputWithContext(ctx context.Context) KubernetesCloudCostConnectorOutput
}

func (*KubernetesCloudCostConnector) ElementType() reflect.Type {
	return reflect.TypeOf((**KubernetesCloudCostConnector)(nil)).Elem()
}

func (i *KubernetesCloudCostConnector) ToKubernetesCloudCostConnectorOutput() KubernetesCloudCostConnectorOutput {
	return i.ToKubernetesCloudCostConnectorOutputWithContext(context.Background())
}

func (i *KubernetesCloudCostConnector) ToKubernetesCloudCostConnectorOutputWithContext(ctx context.Context) KubernetesCloudCostConnectorOutput {
	return pulumi.ToOutputWithContext(ctx, i).(KubernetesCloudCostConnectorOutput)
}

// KubernetesCloudCostConnectorArrayInput is an input type that accepts KubernetesCloudCostConnectorArray and KubernetesCloudCostConnectorArrayOutput values.
// You can construct a concrete instance of `KubernetesCloudCostConnectorArrayInput` via:
//
//	KubernetesCloudCostConnectorArray{ KubernetesCloudCostConnectorArgs{...} }
type KubernetesCloudCostConnectorArrayInput interface {
	pulumi.Input

	ToKubernetesCloudCostConnectorArrayOutput() KubernetesCloudCostConnectorArrayOutput
	ToKubernetesCloudCostConnectorArrayOutputWithContext(context.Context) KubernetesCloudCostConnectorArrayOutput
}

type KubernetesCloudCostConnectorArray []KubernetesCloudCostConnectorInput

func (KubernetesCloudCostConnectorArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*KubernetesCloudCostConnector)(nil)).Elem()
}

func (i KubernetesCloudCostConnectorArray) ToKubernetesCloudCostConnectorArrayOutput() KubernetesCloudCostConnectorArrayOutput {
	return i.ToKubernetesCloudCostConnectorArrayOutputWithContext(context.Background())
}

func (i KubernetesCloudCostConnectorArray) ToKubernetesCloudCostConnectorArrayOutputWithContext(ctx context.Context) KubernetesCloudCostConnectorArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(KubernetesCloudCostConnectorArrayOutput)
}

// KubernetesCloudCostConnectorMapInput is an input type that accepts KubernetesCloudCostConnectorMap and KubernetesCloudCostConnectorMapOutput values.
// You can construct a concrete instance of `KubernetesCloudCostConnectorMapInput` via:
//
//	KubernetesCloudCostConnectorMap{ "key": KubernetesCloudCostConnectorArgs{...} }
type KubernetesCloudCostConnectorMapInput interface {
	pulumi.Input

	ToKubernetesCloudCostConnectorMapOutput() KubernetesCloudCostConnectorMapOutput
	ToKubernetesCloudCostConnectorMapOutputWithContext(context.Context) KubernetesCloudCostConnectorMapOutput
}

type KubernetesCloudCostConnectorMap map[string]KubernetesCloudCostConnectorInput

func (KubernetesCloudCostConnectorMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*KubernetesCloudCostConnector)(nil)).Elem()
}

func (i KubernetesCloudCostConnectorMap) ToKubernetesCloudCostConnectorMapOutput() KubernetesCloudCostConnectorMapOutput {
	return i.ToKubernetesCloudCostConnectorMapOutputWithContext(context.Background())
}

func (i KubernetesCloudCostConnectorMap) ToKubernetesCloudCostConnectorMapOutputWithContext(ctx context.Context) KubernetesCloudCostConnectorMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(KubernetesCloudCostConnectorMapOutput)
}

type KubernetesCloudCostConnectorOutput struct{ *pulumi.OutputState }

func (KubernetesCloudCostConnectorOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**KubernetesCloudCostConnector)(nil)).Elem()
}

func (o KubernetesCloudCostConnectorOutput) ToKubernetesCloudCostConnectorOutput() KubernetesCloudCostConnectorOutput {
	return o
}

func (o KubernetesCloudCostConnectorOutput) ToKubernetesCloudCostConnectorOutputWithContext(ctx context.Context) KubernetesCloudCostConnectorOutput {
	return o
}

// Reference to a Kubernetes connector also at the account level.
func (o KubernetesCloudCostConnectorOutput) ConnectorRef() pulumi.StringOutput {
	return o.ApplyT(func(v *KubernetesCloudCostConnector) pulumi.StringOutput { return v.ConnectorRef }).(pulumi.StringOutput)
}

// Description of the resource.
func (o KubernetesCloudCostConnectorOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *KubernetesCloudCostConnector) pulumi.StringPtrOutput { return v.Description }).(pulumi.StringPtrOutput)
}

// Indicates which feature to enable among Billing, Optimization, and Visibility.
func (o KubernetesCloudCostConnectorOutput) FeaturesEnableds() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *KubernetesCloudCostConnector) pulumi.StringArrayOutput { return v.FeaturesEnableds }).(pulumi.StringArrayOutput)
}

// Unique identifier of the resource.
func (o KubernetesCloudCostConnectorOutput) Identifier() pulumi.StringOutput {
	return o.ApplyT(func(v *KubernetesCloudCostConnector) pulumi.StringOutput { return v.Identifier }).(pulumi.StringOutput)
}

// Name of the resource.
func (o KubernetesCloudCostConnectorOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *KubernetesCloudCostConnector) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// Unique identifier of the organization.
func (o KubernetesCloudCostConnectorOutput) OrgId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *KubernetesCloudCostConnector) pulumi.StringPtrOutput { return v.OrgId }).(pulumi.StringPtrOutput)
}

// Unique identifier of the project.
func (o KubernetesCloudCostConnectorOutput) ProjectId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *KubernetesCloudCostConnector) pulumi.StringPtrOutput { return v.ProjectId }).(pulumi.StringPtrOutput)
}

// Tags to associate with the resource.
func (o KubernetesCloudCostConnectorOutput) Tags() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *KubernetesCloudCostConnector) pulumi.StringArrayOutput { return v.Tags }).(pulumi.StringArrayOutput)
}

type KubernetesCloudCostConnectorArrayOutput struct{ *pulumi.OutputState }

func (KubernetesCloudCostConnectorArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*KubernetesCloudCostConnector)(nil)).Elem()
}

func (o KubernetesCloudCostConnectorArrayOutput) ToKubernetesCloudCostConnectorArrayOutput() KubernetesCloudCostConnectorArrayOutput {
	return o
}

func (o KubernetesCloudCostConnectorArrayOutput) ToKubernetesCloudCostConnectorArrayOutputWithContext(ctx context.Context) KubernetesCloudCostConnectorArrayOutput {
	return o
}

func (o KubernetesCloudCostConnectorArrayOutput) Index(i pulumi.IntInput) KubernetesCloudCostConnectorOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *KubernetesCloudCostConnector {
		return vs[0].([]*KubernetesCloudCostConnector)[vs[1].(int)]
	}).(KubernetesCloudCostConnectorOutput)
}

type KubernetesCloudCostConnectorMapOutput struct{ *pulumi.OutputState }

func (KubernetesCloudCostConnectorMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*KubernetesCloudCostConnector)(nil)).Elem()
}

func (o KubernetesCloudCostConnectorMapOutput) ToKubernetesCloudCostConnectorMapOutput() KubernetesCloudCostConnectorMapOutput {
	return o
}

func (o KubernetesCloudCostConnectorMapOutput) ToKubernetesCloudCostConnectorMapOutputWithContext(ctx context.Context) KubernetesCloudCostConnectorMapOutput {
	return o
}

func (o KubernetesCloudCostConnectorMapOutput) MapIndex(k pulumi.StringInput) KubernetesCloudCostConnectorOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *KubernetesCloudCostConnector {
		return vs[0].(map[string]*KubernetesCloudCostConnector)[vs[1].(string)]
	}).(KubernetesCloudCostConnectorOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*KubernetesCloudCostConnectorInput)(nil)).Elem(), &KubernetesCloudCostConnector{})
	pulumi.RegisterInputType(reflect.TypeOf((*KubernetesCloudCostConnectorArrayInput)(nil)).Elem(), KubernetesCloudCostConnectorArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*KubernetesCloudCostConnectorMapInput)(nil)).Elem(), KubernetesCloudCostConnectorMap{})
	pulumi.RegisterOutputType(KubernetesCloudCostConnectorOutput{})
	pulumi.RegisterOutputType(KubernetesCloudCostConnectorArrayOutput{})
	pulumi.RegisterOutputType(KubernetesCloudCostConnectorMapOutput{})
}
