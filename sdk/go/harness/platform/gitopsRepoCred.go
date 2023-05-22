// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package platform

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Resource for creating a Harness Gitops Repositories Credentials.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/lbrlabs/pulumi-harness/sdk/go/harness/platform"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := platform.NewGitopsRepoCred(ctx, "test", &platform.GitopsRepoCredArgs{
//				Identifier: pulumi.String("identifier"),
//				AccountId:  pulumi.String("account_id"),
//				AgentId:    pulumi.String("agent_id"),
//				ProjectId:  pulumi.String("project_id"),
//				OrgId:      pulumi.String("org_id"),
//				Creds: platform.GitopsRepoCredCredArray{
//					&platform.GitopsRepoCredCredArgs{
//						Type:          pulumi.String("git"),
//						Url:           pulumi.String("github.com"),
//						SshPrivateKey: pulumi.String("yoursshprivatekey"),
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
// # Import a Account level Gitops Repository Credentials
//
// ```sh
//
//	$ pulumi import harness:platform/gitopsRepoCred:GitopsRepoCred example <agent_id>/<repocred_id>
//
// ```
//
//	Import a Project level Gitops Repository Credentials
//
// ```sh
//
//	$ pulumi import harness:platform/gitopsRepoCred:GitopsRepoCred example <organization_id>/<project_id>/<agent_id>/<repocred_id>
//
// ```
type GitopsRepoCred struct {
	pulumi.CustomResourceState

	// Account identifier of the Repository Credential.
	AccountId pulumi.StringOutput `pulumi:"accountId"`
	// Agent identifier of the Repository Credential.
	AgentId pulumi.StringOutput `pulumi:"agentId"`
	// credential details.
	Creds GitopsRepoCredCredArrayOutput `pulumi:"creds"`
	// Identifier of the Repository Credential.
	Identifier pulumi.StringOutput `pulumi:"identifier"`
	// Organization identifier of the Repository Credential.
	OrgId pulumi.StringPtrOutput `pulumi:"orgId"`
	// Project identifier of the Repository Credential.
	ProjectId pulumi.StringPtrOutput `pulumi:"projectId"`
	// if the Repository credential should be upserted.
	Upsert pulumi.BoolPtrOutput `pulumi:"upsert"`
}

// NewGitopsRepoCred registers a new resource with the given unique name, arguments, and options.
func NewGitopsRepoCred(ctx *pulumi.Context,
	name string, args *GitopsRepoCredArgs, opts ...pulumi.ResourceOption) (*GitopsRepoCred, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.AccountId == nil {
		return nil, errors.New("invalid value for required argument 'AccountId'")
	}
	if args.AgentId == nil {
		return nil, errors.New("invalid value for required argument 'AgentId'")
	}
	if args.Identifier == nil {
		return nil, errors.New("invalid value for required argument 'Identifier'")
	}
	opts = pkgResourceDefaultOpts(opts)
	var resource GitopsRepoCred
	err := ctx.RegisterResource("harness:platform/gitopsRepoCred:GitopsRepoCred", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetGitopsRepoCred gets an existing GitopsRepoCred resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetGitopsRepoCred(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *GitopsRepoCredState, opts ...pulumi.ResourceOption) (*GitopsRepoCred, error) {
	var resource GitopsRepoCred
	err := ctx.ReadResource("harness:platform/gitopsRepoCred:GitopsRepoCred", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering GitopsRepoCred resources.
type gitopsRepoCredState struct {
	// Account identifier of the Repository Credential.
	AccountId *string `pulumi:"accountId"`
	// Agent identifier of the Repository Credential.
	AgentId *string `pulumi:"agentId"`
	// credential details.
	Creds []GitopsRepoCredCred `pulumi:"creds"`
	// Identifier of the Repository Credential.
	Identifier *string `pulumi:"identifier"`
	// Organization identifier of the Repository Credential.
	OrgId *string `pulumi:"orgId"`
	// Project identifier of the Repository Credential.
	ProjectId *string `pulumi:"projectId"`
	// if the Repository credential should be upserted.
	Upsert *bool `pulumi:"upsert"`
}

type GitopsRepoCredState struct {
	// Account identifier of the Repository Credential.
	AccountId pulumi.StringPtrInput
	// Agent identifier of the Repository Credential.
	AgentId pulumi.StringPtrInput
	// credential details.
	Creds GitopsRepoCredCredArrayInput
	// Identifier of the Repository Credential.
	Identifier pulumi.StringPtrInput
	// Organization identifier of the Repository Credential.
	OrgId pulumi.StringPtrInput
	// Project identifier of the Repository Credential.
	ProjectId pulumi.StringPtrInput
	// if the Repository credential should be upserted.
	Upsert pulumi.BoolPtrInput
}

func (GitopsRepoCredState) ElementType() reflect.Type {
	return reflect.TypeOf((*gitopsRepoCredState)(nil)).Elem()
}

type gitopsRepoCredArgs struct {
	// Account identifier of the Repository Credential.
	AccountId string `pulumi:"accountId"`
	// Agent identifier of the Repository Credential.
	AgentId string `pulumi:"agentId"`
	// credential details.
	Creds []GitopsRepoCredCred `pulumi:"creds"`
	// Identifier of the Repository Credential.
	Identifier string `pulumi:"identifier"`
	// Organization identifier of the Repository Credential.
	OrgId *string `pulumi:"orgId"`
	// Project identifier of the Repository Credential.
	ProjectId *string `pulumi:"projectId"`
	// if the Repository credential should be upserted.
	Upsert *bool `pulumi:"upsert"`
}

// The set of arguments for constructing a GitopsRepoCred resource.
type GitopsRepoCredArgs struct {
	// Account identifier of the Repository Credential.
	AccountId pulumi.StringInput
	// Agent identifier of the Repository Credential.
	AgentId pulumi.StringInput
	// credential details.
	Creds GitopsRepoCredCredArrayInput
	// Identifier of the Repository Credential.
	Identifier pulumi.StringInput
	// Organization identifier of the Repository Credential.
	OrgId pulumi.StringPtrInput
	// Project identifier of the Repository Credential.
	ProjectId pulumi.StringPtrInput
	// if the Repository credential should be upserted.
	Upsert pulumi.BoolPtrInput
}

func (GitopsRepoCredArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*gitopsRepoCredArgs)(nil)).Elem()
}

type GitopsRepoCredInput interface {
	pulumi.Input

	ToGitopsRepoCredOutput() GitopsRepoCredOutput
	ToGitopsRepoCredOutputWithContext(ctx context.Context) GitopsRepoCredOutput
}

func (*GitopsRepoCred) ElementType() reflect.Type {
	return reflect.TypeOf((**GitopsRepoCred)(nil)).Elem()
}

func (i *GitopsRepoCred) ToGitopsRepoCredOutput() GitopsRepoCredOutput {
	return i.ToGitopsRepoCredOutputWithContext(context.Background())
}

func (i *GitopsRepoCred) ToGitopsRepoCredOutputWithContext(ctx context.Context) GitopsRepoCredOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GitopsRepoCredOutput)
}

// GitopsRepoCredArrayInput is an input type that accepts GitopsRepoCredArray and GitopsRepoCredArrayOutput values.
// You can construct a concrete instance of `GitopsRepoCredArrayInput` via:
//
//	GitopsRepoCredArray{ GitopsRepoCredArgs{...} }
type GitopsRepoCredArrayInput interface {
	pulumi.Input

	ToGitopsRepoCredArrayOutput() GitopsRepoCredArrayOutput
	ToGitopsRepoCredArrayOutputWithContext(context.Context) GitopsRepoCredArrayOutput
}

type GitopsRepoCredArray []GitopsRepoCredInput

func (GitopsRepoCredArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*GitopsRepoCred)(nil)).Elem()
}

func (i GitopsRepoCredArray) ToGitopsRepoCredArrayOutput() GitopsRepoCredArrayOutput {
	return i.ToGitopsRepoCredArrayOutputWithContext(context.Background())
}

func (i GitopsRepoCredArray) ToGitopsRepoCredArrayOutputWithContext(ctx context.Context) GitopsRepoCredArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GitopsRepoCredArrayOutput)
}

// GitopsRepoCredMapInput is an input type that accepts GitopsRepoCredMap and GitopsRepoCredMapOutput values.
// You can construct a concrete instance of `GitopsRepoCredMapInput` via:
//
//	GitopsRepoCredMap{ "key": GitopsRepoCredArgs{...} }
type GitopsRepoCredMapInput interface {
	pulumi.Input

	ToGitopsRepoCredMapOutput() GitopsRepoCredMapOutput
	ToGitopsRepoCredMapOutputWithContext(context.Context) GitopsRepoCredMapOutput
}

type GitopsRepoCredMap map[string]GitopsRepoCredInput

func (GitopsRepoCredMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*GitopsRepoCred)(nil)).Elem()
}

func (i GitopsRepoCredMap) ToGitopsRepoCredMapOutput() GitopsRepoCredMapOutput {
	return i.ToGitopsRepoCredMapOutputWithContext(context.Background())
}

func (i GitopsRepoCredMap) ToGitopsRepoCredMapOutputWithContext(ctx context.Context) GitopsRepoCredMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GitopsRepoCredMapOutput)
}

type GitopsRepoCredOutput struct{ *pulumi.OutputState }

func (GitopsRepoCredOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**GitopsRepoCred)(nil)).Elem()
}

func (o GitopsRepoCredOutput) ToGitopsRepoCredOutput() GitopsRepoCredOutput {
	return o
}

func (o GitopsRepoCredOutput) ToGitopsRepoCredOutputWithContext(ctx context.Context) GitopsRepoCredOutput {
	return o
}

// Account identifier of the Repository Credential.
func (o GitopsRepoCredOutput) AccountId() pulumi.StringOutput {
	return o.ApplyT(func(v *GitopsRepoCred) pulumi.StringOutput { return v.AccountId }).(pulumi.StringOutput)
}

// Agent identifier of the Repository Credential.
func (o GitopsRepoCredOutput) AgentId() pulumi.StringOutput {
	return o.ApplyT(func(v *GitopsRepoCred) pulumi.StringOutput { return v.AgentId }).(pulumi.StringOutput)
}

// credential details.
func (o GitopsRepoCredOutput) Creds() GitopsRepoCredCredArrayOutput {
	return o.ApplyT(func(v *GitopsRepoCred) GitopsRepoCredCredArrayOutput { return v.Creds }).(GitopsRepoCredCredArrayOutput)
}

// Identifier of the Repository Credential.
func (o GitopsRepoCredOutput) Identifier() pulumi.StringOutput {
	return o.ApplyT(func(v *GitopsRepoCred) pulumi.StringOutput { return v.Identifier }).(pulumi.StringOutput)
}

// Organization identifier of the Repository Credential.
func (o GitopsRepoCredOutput) OrgId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *GitopsRepoCred) pulumi.StringPtrOutput { return v.OrgId }).(pulumi.StringPtrOutput)
}

// Project identifier of the Repository Credential.
func (o GitopsRepoCredOutput) ProjectId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *GitopsRepoCred) pulumi.StringPtrOutput { return v.ProjectId }).(pulumi.StringPtrOutput)
}

// if the Repository credential should be upserted.
func (o GitopsRepoCredOutput) Upsert() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *GitopsRepoCred) pulumi.BoolPtrOutput { return v.Upsert }).(pulumi.BoolPtrOutput)
}

type GitopsRepoCredArrayOutput struct{ *pulumi.OutputState }

func (GitopsRepoCredArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*GitopsRepoCred)(nil)).Elem()
}

func (o GitopsRepoCredArrayOutput) ToGitopsRepoCredArrayOutput() GitopsRepoCredArrayOutput {
	return o
}

func (o GitopsRepoCredArrayOutput) ToGitopsRepoCredArrayOutputWithContext(ctx context.Context) GitopsRepoCredArrayOutput {
	return o
}

func (o GitopsRepoCredArrayOutput) Index(i pulumi.IntInput) GitopsRepoCredOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *GitopsRepoCred {
		return vs[0].([]*GitopsRepoCred)[vs[1].(int)]
	}).(GitopsRepoCredOutput)
}

type GitopsRepoCredMapOutput struct{ *pulumi.OutputState }

func (GitopsRepoCredMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*GitopsRepoCred)(nil)).Elem()
}

func (o GitopsRepoCredMapOutput) ToGitopsRepoCredMapOutput() GitopsRepoCredMapOutput {
	return o
}

func (o GitopsRepoCredMapOutput) ToGitopsRepoCredMapOutputWithContext(ctx context.Context) GitopsRepoCredMapOutput {
	return o
}

func (o GitopsRepoCredMapOutput) MapIndex(k pulumi.StringInput) GitopsRepoCredOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *GitopsRepoCred {
		return vs[0].(map[string]*GitopsRepoCred)[vs[1].(string)]
	}).(GitopsRepoCredOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*GitopsRepoCredInput)(nil)).Elem(), &GitopsRepoCred{})
	pulumi.RegisterInputType(reflect.TypeOf((*GitopsRepoCredArrayInput)(nil)).Elem(), GitopsRepoCredArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*GitopsRepoCredMapInput)(nil)).Elem(), GitopsRepoCredMap{})
	pulumi.RegisterOutputType(GitopsRepoCredOutput{})
	pulumi.RegisterOutputType(GitopsRepoCredArrayOutput{})
	pulumi.RegisterOutputType(GitopsRepoCredMapOutput{})
}