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

type Overrides struct {
	pulumi.CustomResourceState

	// The cluster ID to which the overrides are associated.
	ClusterId pulumi.StringOutput `pulumi:"clusterId"`
	// The environment ID to which the overrides are associated.
	EnvId pulumi.StringOutput `pulumi:"envId"`
	// Contains parameters related to creating an Entity for Git Experience.
	GitDetails OverridesGitDetailsOutput `pulumi:"gitDetails"`
	// The identifier of the override entity.
	Identifier pulumi.StringOutput `pulumi:"identifier"`
	// import override from git
	ImportFromGit pulumi.BoolOutput `pulumi:"importFromGit"`
	// The infrastructure ID to which the overrides are associated.
	InfraId pulumi.StringOutput `pulumi:"infraId"`
	// force import override from remote even if same file path already exist
	IsForceImport pulumi.BoolOutput `pulumi:"isForceImport"`
	// Unique identifier of the organization.
	OrgId pulumi.StringPtrOutput `pulumi:"orgId"`
	// Unique identifier of the project.
	ProjectId pulumi.StringPtrOutput `pulumi:"projectId"`
	// The service ID to which the overrides applies.
	ServiceId pulumi.StringOutput `pulumi:"serviceId"`
	// The type of the overrides.
	Type pulumi.StringOutput `pulumi:"type"`
	// The yaml of the override entity
	Yaml pulumi.StringOutput `pulumi:"yaml"`
}

// NewOverrides registers a new resource with the given unique name, arguments, and options.
func NewOverrides(ctx *pulumi.Context,
	name string, args *OverridesArgs, opts ...pulumi.ResourceOption) (*Overrides, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.EnvId == nil {
		return nil, errors.New("invalid value for required argument 'EnvId'")
	}
	if args.Type == nil {
		return nil, errors.New("invalid value for required argument 'Type'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource Overrides
	err := ctx.RegisterResource("harness:platform/overrides:Overrides", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetOverrides gets an existing Overrides resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetOverrides(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *OverridesState, opts ...pulumi.ResourceOption) (*Overrides, error) {
	var resource Overrides
	err := ctx.ReadResource("harness:platform/overrides:Overrides", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Overrides resources.
type overridesState struct {
	// The cluster ID to which the overrides are associated.
	ClusterId *string `pulumi:"clusterId"`
	// The environment ID to which the overrides are associated.
	EnvId *string `pulumi:"envId"`
	// Contains parameters related to creating an Entity for Git Experience.
	GitDetails *OverridesGitDetails `pulumi:"gitDetails"`
	// The identifier of the override entity.
	Identifier *string `pulumi:"identifier"`
	// import override from git
	ImportFromGit *bool `pulumi:"importFromGit"`
	// The infrastructure ID to which the overrides are associated.
	InfraId *string `pulumi:"infraId"`
	// force import override from remote even if same file path already exist
	IsForceImport *bool `pulumi:"isForceImport"`
	// Unique identifier of the organization.
	OrgId *string `pulumi:"orgId"`
	// Unique identifier of the project.
	ProjectId *string `pulumi:"projectId"`
	// The service ID to which the overrides applies.
	ServiceId *string `pulumi:"serviceId"`
	// The type of the overrides.
	Type *string `pulumi:"type"`
	// The yaml of the override entity
	Yaml *string `pulumi:"yaml"`
}

type OverridesState struct {
	// The cluster ID to which the overrides are associated.
	ClusterId pulumi.StringPtrInput
	// The environment ID to which the overrides are associated.
	EnvId pulumi.StringPtrInput
	// Contains parameters related to creating an Entity for Git Experience.
	GitDetails OverridesGitDetailsPtrInput
	// The identifier of the override entity.
	Identifier pulumi.StringPtrInput
	// import override from git
	ImportFromGit pulumi.BoolPtrInput
	// The infrastructure ID to which the overrides are associated.
	InfraId pulumi.StringPtrInput
	// force import override from remote even if same file path already exist
	IsForceImport pulumi.BoolPtrInput
	// Unique identifier of the organization.
	OrgId pulumi.StringPtrInput
	// Unique identifier of the project.
	ProjectId pulumi.StringPtrInput
	// The service ID to which the overrides applies.
	ServiceId pulumi.StringPtrInput
	// The type of the overrides.
	Type pulumi.StringPtrInput
	// The yaml of the override entity
	Yaml pulumi.StringPtrInput
}

func (OverridesState) ElementType() reflect.Type {
	return reflect.TypeOf((*overridesState)(nil)).Elem()
}

type overridesArgs struct {
	// The cluster ID to which the overrides are associated.
	ClusterId *string `pulumi:"clusterId"`
	// The environment ID to which the overrides are associated.
	EnvId string `pulumi:"envId"`
	// Contains parameters related to creating an Entity for Git Experience.
	GitDetails *OverridesGitDetails `pulumi:"gitDetails"`
	// The identifier of the override entity.
	Identifier *string `pulumi:"identifier"`
	// import override from git
	ImportFromGit *bool `pulumi:"importFromGit"`
	// The infrastructure ID to which the overrides are associated.
	InfraId *string `pulumi:"infraId"`
	// force import override from remote even if same file path already exist
	IsForceImport *bool `pulumi:"isForceImport"`
	// Unique identifier of the organization.
	OrgId *string `pulumi:"orgId"`
	// Unique identifier of the project.
	ProjectId *string `pulumi:"projectId"`
	// The service ID to which the overrides applies.
	ServiceId *string `pulumi:"serviceId"`
	// The type of the overrides.
	Type string `pulumi:"type"`
	// The yaml of the override entity
	Yaml *string `pulumi:"yaml"`
}

// The set of arguments for constructing a Overrides resource.
type OverridesArgs struct {
	// The cluster ID to which the overrides are associated.
	ClusterId pulumi.StringPtrInput
	// The environment ID to which the overrides are associated.
	EnvId pulumi.StringInput
	// Contains parameters related to creating an Entity for Git Experience.
	GitDetails OverridesGitDetailsPtrInput
	// The identifier of the override entity.
	Identifier pulumi.StringPtrInput
	// import override from git
	ImportFromGit pulumi.BoolPtrInput
	// The infrastructure ID to which the overrides are associated.
	InfraId pulumi.StringPtrInput
	// force import override from remote even if same file path already exist
	IsForceImport pulumi.BoolPtrInput
	// Unique identifier of the organization.
	OrgId pulumi.StringPtrInput
	// Unique identifier of the project.
	ProjectId pulumi.StringPtrInput
	// The service ID to which the overrides applies.
	ServiceId pulumi.StringPtrInput
	// The type of the overrides.
	Type pulumi.StringInput
	// The yaml of the override entity
	Yaml pulumi.StringPtrInput
}

func (OverridesArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*overridesArgs)(nil)).Elem()
}

type OverridesInput interface {
	pulumi.Input

	ToOverridesOutput() OverridesOutput
	ToOverridesOutputWithContext(ctx context.Context) OverridesOutput
}

func (*Overrides) ElementType() reflect.Type {
	return reflect.TypeOf((**Overrides)(nil)).Elem()
}

func (i *Overrides) ToOverridesOutput() OverridesOutput {
	return i.ToOverridesOutputWithContext(context.Background())
}

func (i *Overrides) ToOverridesOutputWithContext(ctx context.Context) OverridesOutput {
	return pulumi.ToOutputWithContext(ctx, i).(OverridesOutput)
}

// OverridesArrayInput is an input type that accepts OverridesArray and OverridesArrayOutput values.
// You can construct a concrete instance of `OverridesArrayInput` via:
//
//	OverridesArray{ OverridesArgs{...} }
type OverridesArrayInput interface {
	pulumi.Input

	ToOverridesArrayOutput() OverridesArrayOutput
	ToOverridesArrayOutputWithContext(context.Context) OverridesArrayOutput
}

type OverridesArray []OverridesInput

func (OverridesArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Overrides)(nil)).Elem()
}

func (i OverridesArray) ToOverridesArrayOutput() OverridesArrayOutput {
	return i.ToOverridesArrayOutputWithContext(context.Background())
}

func (i OverridesArray) ToOverridesArrayOutputWithContext(ctx context.Context) OverridesArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(OverridesArrayOutput)
}

// OverridesMapInput is an input type that accepts OverridesMap and OverridesMapOutput values.
// You can construct a concrete instance of `OverridesMapInput` via:
//
//	OverridesMap{ "key": OverridesArgs{...} }
type OverridesMapInput interface {
	pulumi.Input

	ToOverridesMapOutput() OverridesMapOutput
	ToOverridesMapOutputWithContext(context.Context) OverridesMapOutput
}

type OverridesMap map[string]OverridesInput

func (OverridesMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Overrides)(nil)).Elem()
}

func (i OverridesMap) ToOverridesMapOutput() OverridesMapOutput {
	return i.ToOverridesMapOutputWithContext(context.Background())
}

func (i OverridesMap) ToOverridesMapOutputWithContext(ctx context.Context) OverridesMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(OverridesMapOutput)
}

type OverridesOutput struct{ *pulumi.OutputState }

func (OverridesOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Overrides)(nil)).Elem()
}

func (o OverridesOutput) ToOverridesOutput() OverridesOutput {
	return o
}

func (o OverridesOutput) ToOverridesOutputWithContext(ctx context.Context) OverridesOutput {
	return o
}

// The cluster ID to which the overrides are associated.
func (o OverridesOutput) ClusterId() pulumi.StringOutput {
	return o.ApplyT(func(v *Overrides) pulumi.StringOutput { return v.ClusterId }).(pulumi.StringOutput)
}

// The environment ID to which the overrides are associated.
func (o OverridesOutput) EnvId() pulumi.StringOutput {
	return o.ApplyT(func(v *Overrides) pulumi.StringOutput { return v.EnvId }).(pulumi.StringOutput)
}

// Contains parameters related to creating an Entity for Git Experience.
func (o OverridesOutput) GitDetails() OverridesGitDetailsOutput {
	return o.ApplyT(func(v *Overrides) OverridesGitDetailsOutput { return v.GitDetails }).(OverridesGitDetailsOutput)
}

// The identifier of the override entity.
func (o OverridesOutput) Identifier() pulumi.StringOutput {
	return o.ApplyT(func(v *Overrides) pulumi.StringOutput { return v.Identifier }).(pulumi.StringOutput)
}

// import override from git
func (o OverridesOutput) ImportFromGit() pulumi.BoolOutput {
	return o.ApplyT(func(v *Overrides) pulumi.BoolOutput { return v.ImportFromGit }).(pulumi.BoolOutput)
}

// The infrastructure ID to which the overrides are associated.
func (o OverridesOutput) InfraId() pulumi.StringOutput {
	return o.ApplyT(func(v *Overrides) pulumi.StringOutput { return v.InfraId }).(pulumi.StringOutput)
}

// force import override from remote even if same file path already exist
func (o OverridesOutput) IsForceImport() pulumi.BoolOutput {
	return o.ApplyT(func(v *Overrides) pulumi.BoolOutput { return v.IsForceImport }).(pulumi.BoolOutput)
}

// Unique identifier of the organization.
func (o OverridesOutput) OrgId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Overrides) pulumi.StringPtrOutput { return v.OrgId }).(pulumi.StringPtrOutput)
}

// Unique identifier of the project.
func (o OverridesOutput) ProjectId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Overrides) pulumi.StringPtrOutput { return v.ProjectId }).(pulumi.StringPtrOutput)
}

// The service ID to which the overrides applies.
func (o OverridesOutput) ServiceId() pulumi.StringOutput {
	return o.ApplyT(func(v *Overrides) pulumi.StringOutput { return v.ServiceId }).(pulumi.StringOutput)
}

// The type of the overrides.
func (o OverridesOutput) Type() pulumi.StringOutput {
	return o.ApplyT(func(v *Overrides) pulumi.StringOutput { return v.Type }).(pulumi.StringOutput)
}

// The yaml of the override entity
func (o OverridesOutput) Yaml() pulumi.StringOutput {
	return o.ApplyT(func(v *Overrides) pulumi.StringOutput { return v.Yaml }).(pulumi.StringOutput)
}

type OverridesArrayOutput struct{ *pulumi.OutputState }

func (OverridesArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Overrides)(nil)).Elem()
}

func (o OverridesArrayOutput) ToOverridesArrayOutput() OverridesArrayOutput {
	return o
}

func (o OverridesArrayOutput) ToOverridesArrayOutputWithContext(ctx context.Context) OverridesArrayOutput {
	return o
}

func (o OverridesArrayOutput) Index(i pulumi.IntInput) OverridesOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Overrides {
		return vs[0].([]*Overrides)[vs[1].(int)]
	}).(OverridesOutput)
}

type OverridesMapOutput struct{ *pulumi.OutputState }

func (OverridesMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Overrides)(nil)).Elem()
}

func (o OverridesMapOutput) ToOverridesMapOutput() OverridesMapOutput {
	return o
}

func (o OverridesMapOutput) ToOverridesMapOutputWithContext(ctx context.Context) OverridesMapOutput {
	return o
}

func (o OverridesMapOutput) MapIndex(k pulumi.StringInput) OverridesOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Overrides {
		return vs[0].(map[string]*Overrides)[vs[1].(string)]
	}).(OverridesOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*OverridesInput)(nil)).Elem(), &Overrides{})
	pulumi.RegisterInputType(reflect.TypeOf((*OverridesArrayInput)(nil)).Elem(), OverridesArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*OverridesMapInput)(nil)).Elem(), OverridesMap{})
	pulumi.RegisterOutputType(OverridesOutput{})
	pulumi.RegisterOutputType(OverridesArrayOutput{})
	pulumi.RegisterOutputType(OverridesMapOutput{})
}
