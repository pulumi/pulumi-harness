// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package service

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-harness/sdk/go/harness/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Resource for creating an SSH service. This resource uses the config-as-code API's. When updating the `name` or `path` of this resource you should typically also set the `createBeforeDestroy = true` lifecycle setting.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-harness/sdk/go/harness"
//	"github.com/pulumi/pulumi-harness/sdk/go/harness/service"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			example, err := harness.NewApplication(ctx, "example", &harness.ApplicationArgs{
//				Name: pulumi.String("example"),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = service.NewSsh(ctx, "example", &service.SshArgs{
//				AppId:        example.ID(),
//				ArtifactType: pulumi.String("TAR"),
//				Name:         pulumi.String("ssh-example"),
//				Description:  pulumi.String("Service for deploying applications with SSH."),
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
// # Import using the Harness application id and service id
//
// ```sh
// $ pulumi import harness:service/ssh:Ssh example <app_id>/<svc_id>
// ```
type Ssh struct {
	pulumi.CustomResourceState

	// The id of the application the service belongs to
	AppId pulumi.StringOutput `pulumi:"appId"`
	// The type of artifact to deploy.
	ArtifactType pulumi.StringOutput `pulumi:"artifactType"`
	// Description of th service
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// Name of the service
	Name pulumi.StringOutput `pulumi:"name"`
	// Variables to be used in the service
	Variables SshVariableArrayOutput `pulumi:"variables"`
}

// NewSsh registers a new resource with the given unique name, arguments, and options.
func NewSsh(ctx *pulumi.Context,
	name string, args *SshArgs, opts ...pulumi.ResourceOption) (*Ssh, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.AppId == nil {
		return nil, errors.New("invalid value for required argument 'AppId'")
	}
	if args.ArtifactType == nil {
		return nil, errors.New("invalid value for required argument 'ArtifactType'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource Ssh
	err := ctx.RegisterResource("harness:service/ssh:Ssh", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetSsh gets an existing Ssh resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetSsh(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *SshState, opts ...pulumi.ResourceOption) (*Ssh, error) {
	var resource Ssh
	err := ctx.ReadResource("harness:service/ssh:Ssh", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Ssh resources.
type sshState struct {
	// The id of the application the service belongs to
	AppId *string `pulumi:"appId"`
	// The type of artifact to deploy.
	ArtifactType *string `pulumi:"artifactType"`
	// Description of th service
	Description *string `pulumi:"description"`
	// Name of the service
	Name *string `pulumi:"name"`
	// Variables to be used in the service
	Variables []SshVariable `pulumi:"variables"`
}

type SshState struct {
	// The id of the application the service belongs to
	AppId pulumi.StringPtrInput
	// The type of artifact to deploy.
	ArtifactType pulumi.StringPtrInput
	// Description of th service
	Description pulumi.StringPtrInput
	// Name of the service
	Name pulumi.StringPtrInput
	// Variables to be used in the service
	Variables SshVariableArrayInput
}

func (SshState) ElementType() reflect.Type {
	return reflect.TypeOf((*sshState)(nil)).Elem()
}

type sshArgs struct {
	// The id of the application the service belongs to
	AppId string `pulumi:"appId"`
	// The type of artifact to deploy.
	ArtifactType string `pulumi:"artifactType"`
	// Description of th service
	Description *string `pulumi:"description"`
	// Name of the service
	Name *string `pulumi:"name"`
	// Variables to be used in the service
	Variables []SshVariable `pulumi:"variables"`
}

// The set of arguments for constructing a Ssh resource.
type SshArgs struct {
	// The id of the application the service belongs to
	AppId pulumi.StringInput
	// The type of artifact to deploy.
	ArtifactType pulumi.StringInput
	// Description of th service
	Description pulumi.StringPtrInput
	// Name of the service
	Name pulumi.StringPtrInput
	// Variables to be used in the service
	Variables SshVariableArrayInput
}

func (SshArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*sshArgs)(nil)).Elem()
}

type SshInput interface {
	pulumi.Input

	ToSshOutput() SshOutput
	ToSshOutputWithContext(ctx context.Context) SshOutput
}

func (*Ssh) ElementType() reflect.Type {
	return reflect.TypeOf((**Ssh)(nil)).Elem()
}

func (i *Ssh) ToSshOutput() SshOutput {
	return i.ToSshOutputWithContext(context.Background())
}

func (i *Ssh) ToSshOutputWithContext(ctx context.Context) SshOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SshOutput)
}

// SshArrayInput is an input type that accepts SshArray and SshArrayOutput values.
// You can construct a concrete instance of `SshArrayInput` via:
//
//	SshArray{ SshArgs{...} }
type SshArrayInput interface {
	pulumi.Input

	ToSshArrayOutput() SshArrayOutput
	ToSshArrayOutputWithContext(context.Context) SshArrayOutput
}

type SshArray []SshInput

func (SshArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Ssh)(nil)).Elem()
}

func (i SshArray) ToSshArrayOutput() SshArrayOutput {
	return i.ToSshArrayOutputWithContext(context.Background())
}

func (i SshArray) ToSshArrayOutputWithContext(ctx context.Context) SshArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SshArrayOutput)
}

// SshMapInput is an input type that accepts SshMap and SshMapOutput values.
// You can construct a concrete instance of `SshMapInput` via:
//
//	SshMap{ "key": SshArgs{...} }
type SshMapInput interface {
	pulumi.Input

	ToSshMapOutput() SshMapOutput
	ToSshMapOutputWithContext(context.Context) SshMapOutput
}

type SshMap map[string]SshInput

func (SshMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Ssh)(nil)).Elem()
}

func (i SshMap) ToSshMapOutput() SshMapOutput {
	return i.ToSshMapOutputWithContext(context.Background())
}

func (i SshMap) ToSshMapOutputWithContext(ctx context.Context) SshMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SshMapOutput)
}

type SshOutput struct{ *pulumi.OutputState }

func (SshOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Ssh)(nil)).Elem()
}

func (o SshOutput) ToSshOutput() SshOutput {
	return o
}

func (o SshOutput) ToSshOutputWithContext(ctx context.Context) SshOutput {
	return o
}

// The id of the application the service belongs to
func (o SshOutput) AppId() pulumi.StringOutput {
	return o.ApplyT(func(v *Ssh) pulumi.StringOutput { return v.AppId }).(pulumi.StringOutput)
}

// The type of artifact to deploy.
func (o SshOutput) ArtifactType() pulumi.StringOutput {
	return o.ApplyT(func(v *Ssh) pulumi.StringOutput { return v.ArtifactType }).(pulumi.StringOutput)
}

// Description of th service
func (o SshOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Ssh) pulumi.StringPtrOutput { return v.Description }).(pulumi.StringPtrOutput)
}

// Name of the service
func (o SshOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *Ssh) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// Variables to be used in the service
func (o SshOutput) Variables() SshVariableArrayOutput {
	return o.ApplyT(func(v *Ssh) SshVariableArrayOutput { return v.Variables }).(SshVariableArrayOutput)
}

type SshArrayOutput struct{ *pulumi.OutputState }

func (SshArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Ssh)(nil)).Elem()
}

func (o SshArrayOutput) ToSshArrayOutput() SshArrayOutput {
	return o
}

func (o SshArrayOutput) ToSshArrayOutputWithContext(ctx context.Context) SshArrayOutput {
	return o
}

func (o SshArrayOutput) Index(i pulumi.IntInput) SshOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Ssh {
		return vs[0].([]*Ssh)[vs[1].(int)]
	}).(SshOutput)
}

type SshMapOutput struct{ *pulumi.OutputState }

func (SshMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Ssh)(nil)).Elem()
}

func (o SshMapOutput) ToSshMapOutput() SshMapOutput {
	return o
}

func (o SshMapOutput) ToSshMapOutputWithContext(ctx context.Context) SshMapOutput {
	return o
}

func (o SshMapOutput) MapIndex(k pulumi.StringInput) SshOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Ssh {
		return vs[0].(map[string]*Ssh)[vs[1].(string)]
	}).(SshOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*SshInput)(nil)).Elem(), &Ssh{})
	pulumi.RegisterInputType(reflect.TypeOf((*SshArrayInput)(nil)).Elem(), SshArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*SshMapInput)(nil)).Elem(), SshMap{})
	pulumi.RegisterOutputType(SshOutput{})
	pulumi.RegisterOutputType(SshArrayOutput{})
	pulumi.RegisterOutputType(SshMapOutput{})
}
