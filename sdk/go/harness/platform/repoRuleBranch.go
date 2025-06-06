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

// Resource for creating a Harness Repo Branch Rule.
type RepoRuleBranch struct {
	pulumi.CustomResourceState

	// List of users who can bypass this rule.
	Bypasses RepoRuleBranchBypassArrayOutput `pulumi:"bypasses"`
	// Timestamp when the rule was created.
	Created pulumi.IntOutput `pulumi:"created"`
	// ID of the user who created the rule.
	CreatedBy pulumi.IntOutput `pulumi:"createdBy"`
	// Description of the rule.
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// Identifier of the rule.
	Identifier pulumi.StringOutput `pulumi:"identifier"`
	// Unique identifier of the organization.
	OrgId pulumi.StringPtrOutput `pulumi:"orgId"`
	// Pattern of branch to which rule will apply.
	Patterns RepoRuleBranchPatternArrayOutput `pulumi:"patterns"`
	// Policies to be applied for this rule.
	Policies RepoRuleBranchPolicyArrayOutput `pulumi:"policies"`
	// Unique identifier of the project.
	ProjectId pulumi.StringPtrOutput `pulumi:"projectId"`
	// Repo identifier of the repository.
	RepoIdentifier pulumi.StringOutput `pulumi:"repoIdentifier"`
	// State of the rule (active, disable, monitor).
	State pulumi.StringOutput `pulumi:"state"`
	// Timestamp when the rule was updated.
	Updated pulumi.IntOutput `pulumi:"updated"`
	// ID of the user who updated the rule.
	UpdatedBy pulumi.IntOutput `pulumi:"updatedBy"`
}

// NewRepoRuleBranch registers a new resource with the given unique name, arguments, and options.
func NewRepoRuleBranch(ctx *pulumi.Context,
	name string, args *RepoRuleBranchArgs, opts ...pulumi.ResourceOption) (*RepoRuleBranch, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Bypasses == nil {
		return nil, errors.New("invalid value for required argument 'Bypasses'")
	}
	if args.Identifier == nil {
		return nil, errors.New("invalid value for required argument 'Identifier'")
	}
	if args.Policies == nil {
		return nil, errors.New("invalid value for required argument 'Policies'")
	}
	if args.RepoIdentifier == nil {
		return nil, errors.New("invalid value for required argument 'RepoIdentifier'")
	}
	if args.State == nil {
		return nil, errors.New("invalid value for required argument 'State'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource RepoRuleBranch
	err := ctx.RegisterResource("harness:platform/repoRuleBranch:RepoRuleBranch", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetRepoRuleBranch gets an existing RepoRuleBranch resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetRepoRuleBranch(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *RepoRuleBranchState, opts ...pulumi.ResourceOption) (*RepoRuleBranch, error) {
	var resource RepoRuleBranch
	err := ctx.ReadResource("harness:platform/repoRuleBranch:RepoRuleBranch", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering RepoRuleBranch resources.
type repoRuleBranchState struct {
	// List of users who can bypass this rule.
	Bypasses []RepoRuleBranchBypass `pulumi:"bypasses"`
	// Timestamp when the rule was created.
	Created *int `pulumi:"created"`
	// ID of the user who created the rule.
	CreatedBy *int `pulumi:"createdBy"`
	// Description of the rule.
	Description *string `pulumi:"description"`
	// Identifier of the rule.
	Identifier *string `pulumi:"identifier"`
	// Unique identifier of the organization.
	OrgId *string `pulumi:"orgId"`
	// Pattern of branch to which rule will apply.
	Patterns []RepoRuleBranchPattern `pulumi:"patterns"`
	// Policies to be applied for this rule.
	Policies []RepoRuleBranchPolicy `pulumi:"policies"`
	// Unique identifier of the project.
	ProjectId *string `pulumi:"projectId"`
	// Repo identifier of the repository.
	RepoIdentifier *string `pulumi:"repoIdentifier"`
	// State of the rule (active, disable, monitor).
	State *string `pulumi:"state"`
	// Timestamp when the rule was updated.
	Updated *int `pulumi:"updated"`
	// ID of the user who updated the rule.
	UpdatedBy *int `pulumi:"updatedBy"`
}

type RepoRuleBranchState struct {
	// List of users who can bypass this rule.
	Bypasses RepoRuleBranchBypassArrayInput
	// Timestamp when the rule was created.
	Created pulumi.IntPtrInput
	// ID of the user who created the rule.
	CreatedBy pulumi.IntPtrInput
	// Description of the rule.
	Description pulumi.StringPtrInput
	// Identifier of the rule.
	Identifier pulumi.StringPtrInput
	// Unique identifier of the organization.
	OrgId pulumi.StringPtrInput
	// Pattern of branch to which rule will apply.
	Patterns RepoRuleBranchPatternArrayInput
	// Policies to be applied for this rule.
	Policies RepoRuleBranchPolicyArrayInput
	// Unique identifier of the project.
	ProjectId pulumi.StringPtrInput
	// Repo identifier of the repository.
	RepoIdentifier pulumi.StringPtrInput
	// State of the rule (active, disable, monitor).
	State pulumi.StringPtrInput
	// Timestamp when the rule was updated.
	Updated pulumi.IntPtrInput
	// ID of the user who updated the rule.
	UpdatedBy pulumi.IntPtrInput
}

func (RepoRuleBranchState) ElementType() reflect.Type {
	return reflect.TypeOf((*repoRuleBranchState)(nil)).Elem()
}

type repoRuleBranchArgs struct {
	// List of users who can bypass this rule.
	Bypasses []RepoRuleBranchBypass `pulumi:"bypasses"`
	// Description of the rule.
	Description *string `pulumi:"description"`
	// Identifier of the rule.
	Identifier string `pulumi:"identifier"`
	// Unique identifier of the organization.
	OrgId *string `pulumi:"orgId"`
	// Pattern of branch to which rule will apply.
	Patterns []RepoRuleBranchPattern `pulumi:"patterns"`
	// Policies to be applied for this rule.
	Policies []RepoRuleBranchPolicy `pulumi:"policies"`
	// Unique identifier of the project.
	ProjectId *string `pulumi:"projectId"`
	// Repo identifier of the repository.
	RepoIdentifier string `pulumi:"repoIdentifier"`
	// State of the rule (active, disable, monitor).
	State string `pulumi:"state"`
}

// The set of arguments for constructing a RepoRuleBranch resource.
type RepoRuleBranchArgs struct {
	// List of users who can bypass this rule.
	Bypasses RepoRuleBranchBypassArrayInput
	// Description of the rule.
	Description pulumi.StringPtrInput
	// Identifier of the rule.
	Identifier pulumi.StringInput
	// Unique identifier of the organization.
	OrgId pulumi.StringPtrInput
	// Pattern of branch to which rule will apply.
	Patterns RepoRuleBranchPatternArrayInput
	// Policies to be applied for this rule.
	Policies RepoRuleBranchPolicyArrayInput
	// Unique identifier of the project.
	ProjectId pulumi.StringPtrInput
	// Repo identifier of the repository.
	RepoIdentifier pulumi.StringInput
	// State of the rule (active, disable, monitor).
	State pulumi.StringInput
}

func (RepoRuleBranchArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*repoRuleBranchArgs)(nil)).Elem()
}

type RepoRuleBranchInput interface {
	pulumi.Input

	ToRepoRuleBranchOutput() RepoRuleBranchOutput
	ToRepoRuleBranchOutputWithContext(ctx context.Context) RepoRuleBranchOutput
}

func (*RepoRuleBranch) ElementType() reflect.Type {
	return reflect.TypeOf((**RepoRuleBranch)(nil)).Elem()
}

func (i *RepoRuleBranch) ToRepoRuleBranchOutput() RepoRuleBranchOutput {
	return i.ToRepoRuleBranchOutputWithContext(context.Background())
}

func (i *RepoRuleBranch) ToRepoRuleBranchOutputWithContext(ctx context.Context) RepoRuleBranchOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RepoRuleBranchOutput)
}

// RepoRuleBranchArrayInput is an input type that accepts RepoRuleBranchArray and RepoRuleBranchArrayOutput values.
// You can construct a concrete instance of `RepoRuleBranchArrayInput` via:
//
//	RepoRuleBranchArray{ RepoRuleBranchArgs{...} }
type RepoRuleBranchArrayInput interface {
	pulumi.Input

	ToRepoRuleBranchArrayOutput() RepoRuleBranchArrayOutput
	ToRepoRuleBranchArrayOutputWithContext(context.Context) RepoRuleBranchArrayOutput
}

type RepoRuleBranchArray []RepoRuleBranchInput

func (RepoRuleBranchArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*RepoRuleBranch)(nil)).Elem()
}

func (i RepoRuleBranchArray) ToRepoRuleBranchArrayOutput() RepoRuleBranchArrayOutput {
	return i.ToRepoRuleBranchArrayOutputWithContext(context.Background())
}

func (i RepoRuleBranchArray) ToRepoRuleBranchArrayOutputWithContext(ctx context.Context) RepoRuleBranchArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RepoRuleBranchArrayOutput)
}

// RepoRuleBranchMapInput is an input type that accepts RepoRuleBranchMap and RepoRuleBranchMapOutput values.
// You can construct a concrete instance of `RepoRuleBranchMapInput` via:
//
//	RepoRuleBranchMap{ "key": RepoRuleBranchArgs{...} }
type RepoRuleBranchMapInput interface {
	pulumi.Input

	ToRepoRuleBranchMapOutput() RepoRuleBranchMapOutput
	ToRepoRuleBranchMapOutputWithContext(context.Context) RepoRuleBranchMapOutput
}

type RepoRuleBranchMap map[string]RepoRuleBranchInput

func (RepoRuleBranchMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*RepoRuleBranch)(nil)).Elem()
}

func (i RepoRuleBranchMap) ToRepoRuleBranchMapOutput() RepoRuleBranchMapOutput {
	return i.ToRepoRuleBranchMapOutputWithContext(context.Background())
}

func (i RepoRuleBranchMap) ToRepoRuleBranchMapOutputWithContext(ctx context.Context) RepoRuleBranchMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RepoRuleBranchMapOutput)
}

type RepoRuleBranchOutput struct{ *pulumi.OutputState }

func (RepoRuleBranchOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**RepoRuleBranch)(nil)).Elem()
}

func (o RepoRuleBranchOutput) ToRepoRuleBranchOutput() RepoRuleBranchOutput {
	return o
}

func (o RepoRuleBranchOutput) ToRepoRuleBranchOutputWithContext(ctx context.Context) RepoRuleBranchOutput {
	return o
}

// List of users who can bypass this rule.
func (o RepoRuleBranchOutput) Bypasses() RepoRuleBranchBypassArrayOutput {
	return o.ApplyT(func(v *RepoRuleBranch) RepoRuleBranchBypassArrayOutput { return v.Bypasses }).(RepoRuleBranchBypassArrayOutput)
}

// Timestamp when the rule was created.
func (o RepoRuleBranchOutput) Created() pulumi.IntOutput {
	return o.ApplyT(func(v *RepoRuleBranch) pulumi.IntOutput { return v.Created }).(pulumi.IntOutput)
}

// ID of the user who created the rule.
func (o RepoRuleBranchOutput) CreatedBy() pulumi.IntOutput {
	return o.ApplyT(func(v *RepoRuleBranch) pulumi.IntOutput { return v.CreatedBy }).(pulumi.IntOutput)
}

// Description of the rule.
func (o RepoRuleBranchOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *RepoRuleBranch) pulumi.StringPtrOutput { return v.Description }).(pulumi.StringPtrOutput)
}

// Identifier of the rule.
func (o RepoRuleBranchOutput) Identifier() pulumi.StringOutput {
	return o.ApplyT(func(v *RepoRuleBranch) pulumi.StringOutput { return v.Identifier }).(pulumi.StringOutput)
}

// Unique identifier of the organization.
func (o RepoRuleBranchOutput) OrgId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *RepoRuleBranch) pulumi.StringPtrOutput { return v.OrgId }).(pulumi.StringPtrOutput)
}

// Pattern of branch to which rule will apply.
func (o RepoRuleBranchOutput) Patterns() RepoRuleBranchPatternArrayOutput {
	return o.ApplyT(func(v *RepoRuleBranch) RepoRuleBranchPatternArrayOutput { return v.Patterns }).(RepoRuleBranchPatternArrayOutput)
}

// Policies to be applied for this rule.
func (o RepoRuleBranchOutput) Policies() RepoRuleBranchPolicyArrayOutput {
	return o.ApplyT(func(v *RepoRuleBranch) RepoRuleBranchPolicyArrayOutput { return v.Policies }).(RepoRuleBranchPolicyArrayOutput)
}

// Unique identifier of the project.
func (o RepoRuleBranchOutput) ProjectId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *RepoRuleBranch) pulumi.StringPtrOutput { return v.ProjectId }).(pulumi.StringPtrOutput)
}

// Repo identifier of the repository.
func (o RepoRuleBranchOutput) RepoIdentifier() pulumi.StringOutput {
	return o.ApplyT(func(v *RepoRuleBranch) pulumi.StringOutput { return v.RepoIdentifier }).(pulumi.StringOutput)
}

// State of the rule (active, disable, monitor).
func (o RepoRuleBranchOutput) State() pulumi.StringOutput {
	return o.ApplyT(func(v *RepoRuleBranch) pulumi.StringOutput { return v.State }).(pulumi.StringOutput)
}

// Timestamp when the rule was updated.
func (o RepoRuleBranchOutput) Updated() pulumi.IntOutput {
	return o.ApplyT(func(v *RepoRuleBranch) pulumi.IntOutput { return v.Updated }).(pulumi.IntOutput)
}

// ID of the user who updated the rule.
func (o RepoRuleBranchOutput) UpdatedBy() pulumi.IntOutput {
	return o.ApplyT(func(v *RepoRuleBranch) pulumi.IntOutput { return v.UpdatedBy }).(pulumi.IntOutput)
}

type RepoRuleBranchArrayOutput struct{ *pulumi.OutputState }

func (RepoRuleBranchArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*RepoRuleBranch)(nil)).Elem()
}

func (o RepoRuleBranchArrayOutput) ToRepoRuleBranchArrayOutput() RepoRuleBranchArrayOutput {
	return o
}

func (o RepoRuleBranchArrayOutput) ToRepoRuleBranchArrayOutputWithContext(ctx context.Context) RepoRuleBranchArrayOutput {
	return o
}

func (o RepoRuleBranchArrayOutput) Index(i pulumi.IntInput) RepoRuleBranchOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *RepoRuleBranch {
		return vs[0].([]*RepoRuleBranch)[vs[1].(int)]
	}).(RepoRuleBranchOutput)
}

type RepoRuleBranchMapOutput struct{ *pulumi.OutputState }

func (RepoRuleBranchMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*RepoRuleBranch)(nil)).Elem()
}

func (o RepoRuleBranchMapOutput) ToRepoRuleBranchMapOutput() RepoRuleBranchMapOutput {
	return o
}

func (o RepoRuleBranchMapOutput) ToRepoRuleBranchMapOutputWithContext(ctx context.Context) RepoRuleBranchMapOutput {
	return o
}

func (o RepoRuleBranchMapOutput) MapIndex(k pulumi.StringInput) RepoRuleBranchOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *RepoRuleBranch {
		return vs[0].(map[string]*RepoRuleBranch)[vs[1].(string)]
	}).(RepoRuleBranchOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*RepoRuleBranchInput)(nil)).Elem(), &RepoRuleBranch{})
	pulumi.RegisterInputType(reflect.TypeOf((*RepoRuleBranchArrayInput)(nil)).Elem(), RepoRuleBranchArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*RepoRuleBranchMapInput)(nil)).Elem(), RepoRuleBranchMap{})
	pulumi.RegisterOutputType(RepoRuleBranchOutput{})
	pulumi.RegisterOutputType(RepoRuleBranchArrayOutput{})
	pulumi.RegisterOutputType(RepoRuleBranchMapOutput{})
}
