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

// Resource for adding a user to a group.
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
//			_, err := harness.LookupUser(ctx, &harness.LookupUserArgs{
//				Email: pulumi.StringRef("testuser@example.com"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			admin, err := harness.NewUserGroup(ctx, "admin", &harness.UserGroupArgs{
//				Name: pulumi.String("admin"),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = harness.NewAddUserToGroup(ctx, "example_add_user_to_groups", &harness.AddUserToGroupArgs{
//				GroupId: admin.ID(),
//				UserId:  pulumi.Any(test.Id),
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
// # Import using the Harness user and user group id
//
// ```sh
// $ pulumi import harness:index/addUserToGroup:AddUserToGroup example_admin <user_id>/<group_id>
// ```
type AddUserToGroup struct {
	pulumi.CustomResourceState

	// The name of the user.
	GroupId pulumi.StringOutput `pulumi:"groupId"`
	// Unique identifier of the user.
	UserId pulumi.StringOutput `pulumi:"userId"`
}

// NewAddUserToGroup registers a new resource with the given unique name, arguments, and options.
func NewAddUserToGroup(ctx *pulumi.Context,
	name string, args *AddUserToGroupArgs, opts ...pulumi.ResourceOption) (*AddUserToGroup, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.GroupId == nil {
		return nil, errors.New("invalid value for required argument 'GroupId'")
	}
	if args.UserId == nil {
		return nil, errors.New("invalid value for required argument 'UserId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource AddUserToGroup
	err := ctx.RegisterResource("harness:index/addUserToGroup:AddUserToGroup", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetAddUserToGroup gets an existing AddUserToGroup resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetAddUserToGroup(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *AddUserToGroupState, opts ...pulumi.ResourceOption) (*AddUserToGroup, error) {
	var resource AddUserToGroup
	err := ctx.ReadResource("harness:index/addUserToGroup:AddUserToGroup", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering AddUserToGroup resources.
type addUserToGroupState struct {
	// The name of the user.
	GroupId *string `pulumi:"groupId"`
	// Unique identifier of the user.
	UserId *string `pulumi:"userId"`
}

type AddUserToGroupState struct {
	// The name of the user.
	GroupId pulumi.StringPtrInput
	// Unique identifier of the user.
	UserId pulumi.StringPtrInput
}

func (AddUserToGroupState) ElementType() reflect.Type {
	return reflect.TypeOf((*addUserToGroupState)(nil)).Elem()
}

type addUserToGroupArgs struct {
	// The name of the user.
	GroupId string `pulumi:"groupId"`
	// Unique identifier of the user.
	UserId string `pulumi:"userId"`
}

// The set of arguments for constructing a AddUserToGroup resource.
type AddUserToGroupArgs struct {
	// The name of the user.
	GroupId pulumi.StringInput
	// Unique identifier of the user.
	UserId pulumi.StringInput
}

func (AddUserToGroupArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*addUserToGroupArgs)(nil)).Elem()
}

type AddUserToGroupInput interface {
	pulumi.Input

	ToAddUserToGroupOutput() AddUserToGroupOutput
	ToAddUserToGroupOutputWithContext(ctx context.Context) AddUserToGroupOutput
}

func (*AddUserToGroup) ElementType() reflect.Type {
	return reflect.TypeOf((**AddUserToGroup)(nil)).Elem()
}

func (i *AddUserToGroup) ToAddUserToGroupOutput() AddUserToGroupOutput {
	return i.ToAddUserToGroupOutputWithContext(context.Background())
}

func (i *AddUserToGroup) ToAddUserToGroupOutputWithContext(ctx context.Context) AddUserToGroupOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AddUserToGroupOutput)
}

// AddUserToGroupArrayInput is an input type that accepts AddUserToGroupArray and AddUserToGroupArrayOutput values.
// You can construct a concrete instance of `AddUserToGroupArrayInput` via:
//
//	AddUserToGroupArray{ AddUserToGroupArgs{...} }
type AddUserToGroupArrayInput interface {
	pulumi.Input

	ToAddUserToGroupArrayOutput() AddUserToGroupArrayOutput
	ToAddUserToGroupArrayOutputWithContext(context.Context) AddUserToGroupArrayOutput
}

type AddUserToGroupArray []AddUserToGroupInput

func (AddUserToGroupArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*AddUserToGroup)(nil)).Elem()
}

func (i AddUserToGroupArray) ToAddUserToGroupArrayOutput() AddUserToGroupArrayOutput {
	return i.ToAddUserToGroupArrayOutputWithContext(context.Background())
}

func (i AddUserToGroupArray) ToAddUserToGroupArrayOutputWithContext(ctx context.Context) AddUserToGroupArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AddUserToGroupArrayOutput)
}

// AddUserToGroupMapInput is an input type that accepts AddUserToGroupMap and AddUserToGroupMapOutput values.
// You can construct a concrete instance of `AddUserToGroupMapInput` via:
//
//	AddUserToGroupMap{ "key": AddUserToGroupArgs{...} }
type AddUserToGroupMapInput interface {
	pulumi.Input

	ToAddUserToGroupMapOutput() AddUserToGroupMapOutput
	ToAddUserToGroupMapOutputWithContext(context.Context) AddUserToGroupMapOutput
}

type AddUserToGroupMap map[string]AddUserToGroupInput

func (AddUserToGroupMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*AddUserToGroup)(nil)).Elem()
}

func (i AddUserToGroupMap) ToAddUserToGroupMapOutput() AddUserToGroupMapOutput {
	return i.ToAddUserToGroupMapOutputWithContext(context.Background())
}

func (i AddUserToGroupMap) ToAddUserToGroupMapOutputWithContext(ctx context.Context) AddUserToGroupMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AddUserToGroupMapOutput)
}

type AddUserToGroupOutput struct{ *pulumi.OutputState }

func (AddUserToGroupOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**AddUserToGroup)(nil)).Elem()
}

func (o AddUserToGroupOutput) ToAddUserToGroupOutput() AddUserToGroupOutput {
	return o
}

func (o AddUserToGroupOutput) ToAddUserToGroupOutputWithContext(ctx context.Context) AddUserToGroupOutput {
	return o
}

// The name of the user.
func (o AddUserToGroupOutput) GroupId() pulumi.StringOutput {
	return o.ApplyT(func(v *AddUserToGroup) pulumi.StringOutput { return v.GroupId }).(pulumi.StringOutput)
}

// Unique identifier of the user.
func (o AddUserToGroupOutput) UserId() pulumi.StringOutput {
	return o.ApplyT(func(v *AddUserToGroup) pulumi.StringOutput { return v.UserId }).(pulumi.StringOutput)
}

type AddUserToGroupArrayOutput struct{ *pulumi.OutputState }

func (AddUserToGroupArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*AddUserToGroup)(nil)).Elem()
}

func (o AddUserToGroupArrayOutput) ToAddUserToGroupArrayOutput() AddUserToGroupArrayOutput {
	return o
}

func (o AddUserToGroupArrayOutput) ToAddUserToGroupArrayOutputWithContext(ctx context.Context) AddUserToGroupArrayOutput {
	return o
}

func (o AddUserToGroupArrayOutput) Index(i pulumi.IntInput) AddUserToGroupOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *AddUserToGroup {
		return vs[0].([]*AddUserToGroup)[vs[1].(int)]
	}).(AddUserToGroupOutput)
}

type AddUserToGroupMapOutput struct{ *pulumi.OutputState }

func (AddUserToGroupMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*AddUserToGroup)(nil)).Elem()
}

func (o AddUserToGroupMapOutput) ToAddUserToGroupMapOutput() AddUserToGroupMapOutput {
	return o
}

func (o AddUserToGroupMapOutput) ToAddUserToGroupMapOutputWithContext(ctx context.Context) AddUserToGroupMapOutput {
	return o
}

func (o AddUserToGroupMapOutput) MapIndex(k pulumi.StringInput) AddUserToGroupOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *AddUserToGroup {
		return vs[0].(map[string]*AddUserToGroup)[vs[1].(string)]
	}).(AddUserToGroupOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*AddUserToGroupInput)(nil)).Elem(), &AddUserToGroup{})
	pulumi.RegisterInputType(reflect.TypeOf((*AddUserToGroupArrayInput)(nil)).Elem(), AddUserToGroupArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*AddUserToGroupMapInput)(nil)).Elem(), AddUserToGroupMap{})
	pulumi.RegisterOutputType(AddUserToGroupOutput{})
	pulumi.RegisterOutputType(AddUserToGroupArrayOutput{})
	pulumi.RegisterOutputType(AddUserToGroupMapOutput{})
}
