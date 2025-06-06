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

// Resource for creating a Bitbucket connector.
//
// ## Import
//
// # Import account level bitbucket connector
//
// ```sh
// $ pulumi import harness:platform/bitbucketConnector:BitbucketConnector example <connector_id>
// ```
//
// # Import org level bitbucket connector
//
// ```sh
// $ pulumi import harness:platform/bitbucketConnector:BitbucketConnector example <ord_id>/<connector_id>
// ```
//
// # Import project level bitbucket connector
//
// ```sh
// $ pulumi import harness:platform/bitbucketConnector:BitbucketConnector example <org_id>/<project_id>/<connector_id>
// ```
type BitbucketConnector struct {
	pulumi.CustomResourceState

	// Configuration for using the BitBucket api. API Access is required for using “Git Experience”, for creation of Git based triggers, Webhooks management and updating Git statuses.
	ApiAuthentication BitbucketConnectorApiAuthenticationPtrOutput `pulumi:"apiAuthentication"`
	// Whether the connection we're making is to a BitBucket repository or a BitBucket account. Valid values are Account, Repo.
	ConnectionType pulumi.StringOutput `pulumi:"connectionType"`
	// Credentials to use for the connection.
	Credentials BitbucketConnectorCredentialsOutput `pulumi:"credentials"`
	// Tags to filter delegates for connection.
	DelegateSelectors pulumi.StringArrayOutput `pulumi:"delegateSelectors"`
	// Description of the resource.
	Description pulumi.StringPtrOutput `pulumi:"description"`
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
	// URL of the BitBucket repository or account.
	Url pulumi.StringOutput `pulumi:"url"`
	// Repository to test the connection with. This is only used when `connectionType` is `Account`.
	ValidationRepo pulumi.StringPtrOutput `pulumi:"validationRepo"`
}

// NewBitbucketConnector registers a new resource with the given unique name, arguments, and options.
func NewBitbucketConnector(ctx *pulumi.Context,
	name string, args *BitbucketConnectorArgs, opts ...pulumi.ResourceOption) (*BitbucketConnector, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.ConnectionType == nil {
		return nil, errors.New("invalid value for required argument 'ConnectionType'")
	}
	if args.Credentials == nil {
		return nil, errors.New("invalid value for required argument 'Credentials'")
	}
	if args.Identifier == nil {
		return nil, errors.New("invalid value for required argument 'Identifier'")
	}
	if args.Url == nil {
		return nil, errors.New("invalid value for required argument 'Url'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource BitbucketConnector
	err := ctx.RegisterResource("harness:platform/bitbucketConnector:BitbucketConnector", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetBitbucketConnector gets an existing BitbucketConnector resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetBitbucketConnector(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *BitbucketConnectorState, opts ...pulumi.ResourceOption) (*BitbucketConnector, error) {
	var resource BitbucketConnector
	err := ctx.ReadResource("harness:platform/bitbucketConnector:BitbucketConnector", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering BitbucketConnector resources.
type bitbucketConnectorState struct {
	// Configuration for using the BitBucket api. API Access is required for using “Git Experience”, for creation of Git based triggers, Webhooks management and updating Git statuses.
	ApiAuthentication *BitbucketConnectorApiAuthentication `pulumi:"apiAuthentication"`
	// Whether the connection we're making is to a BitBucket repository or a BitBucket account. Valid values are Account, Repo.
	ConnectionType *string `pulumi:"connectionType"`
	// Credentials to use for the connection.
	Credentials *BitbucketConnectorCredentials `pulumi:"credentials"`
	// Tags to filter delegates for connection.
	DelegateSelectors []string `pulumi:"delegateSelectors"`
	// Description of the resource.
	Description *string `pulumi:"description"`
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
	// URL of the BitBucket repository or account.
	Url *string `pulumi:"url"`
	// Repository to test the connection with. This is only used when `connectionType` is `Account`.
	ValidationRepo *string `pulumi:"validationRepo"`
}

type BitbucketConnectorState struct {
	// Configuration for using the BitBucket api. API Access is required for using “Git Experience”, for creation of Git based triggers, Webhooks management and updating Git statuses.
	ApiAuthentication BitbucketConnectorApiAuthenticationPtrInput
	// Whether the connection we're making is to a BitBucket repository or a BitBucket account. Valid values are Account, Repo.
	ConnectionType pulumi.StringPtrInput
	// Credentials to use for the connection.
	Credentials BitbucketConnectorCredentialsPtrInput
	// Tags to filter delegates for connection.
	DelegateSelectors pulumi.StringArrayInput
	// Description of the resource.
	Description pulumi.StringPtrInput
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
	// URL of the BitBucket repository or account.
	Url pulumi.StringPtrInput
	// Repository to test the connection with. This is only used when `connectionType` is `Account`.
	ValidationRepo pulumi.StringPtrInput
}

func (BitbucketConnectorState) ElementType() reflect.Type {
	return reflect.TypeOf((*bitbucketConnectorState)(nil)).Elem()
}

type bitbucketConnectorArgs struct {
	// Configuration for using the BitBucket api. API Access is required for using “Git Experience”, for creation of Git based triggers, Webhooks management and updating Git statuses.
	ApiAuthentication *BitbucketConnectorApiAuthentication `pulumi:"apiAuthentication"`
	// Whether the connection we're making is to a BitBucket repository or a BitBucket account. Valid values are Account, Repo.
	ConnectionType string `pulumi:"connectionType"`
	// Credentials to use for the connection.
	Credentials BitbucketConnectorCredentials `pulumi:"credentials"`
	// Tags to filter delegates for connection.
	DelegateSelectors []string `pulumi:"delegateSelectors"`
	// Description of the resource.
	Description *string `pulumi:"description"`
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
	// URL of the BitBucket repository or account.
	Url string `pulumi:"url"`
	// Repository to test the connection with. This is only used when `connectionType` is `Account`.
	ValidationRepo *string `pulumi:"validationRepo"`
}

// The set of arguments for constructing a BitbucketConnector resource.
type BitbucketConnectorArgs struct {
	// Configuration for using the BitBucket api. API Access is required for using “Git Experience”, for creation of Git based triggers, Webhooks management and updating Git statuses.
	ApiAuthentication BitbucketConnectorApiAuthenticationPtrInput
	// Whether the connection we're making is to a BitBucket repository or a BitBucket account. Valid values are Account, Repo.
	ConnectionType pulumi.StringInput
	// Credentials to use for the connection.
	Credentials BitbucketConnectorCredentialsInput
	// Tags to filter delegates for connection.
	DelegateSelectors pulumi.StringArrayInput
	// Description of the resource.
	Description pulumi.StringPtrInput
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
	// URL of the BitBucket repository or account.
	Url pulumi.StringInput
	// Repository to test the connection with. This is only used when `connectionType` is `Account`.
	ValidationRepo pulumi.StringPtrInput
}

func (BitbucketConnectorArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*bitbucketConnectorArgs)(nil)).Elem()
}

type BitbucketConnectorInput interface {
	pulumi.Input

	ToBitbucketConnectorOutput() BitbucketConnectorOutput
	ToBitbucketConnectorOutputWithContext(ctx context.Context) BitbucketConnectorOutput
}

func (*BitbucketConnector) ElementType() reflect.Type {
	return reflect.TypeOf((**BitbucketConnector)(nil)).Elem()
}

func (i *BitbucketConnector) ToBitbucketConnectorOutput() BitbucketConnectorOutput {
	return i.ToBitbucketConnectorOutputWithContext(context.Background())
}

func (i *BitbucketConnector) ToBitbucketConnectorOutputWithContext(ctx context.Context) BitbucketConnectorOutput {
	return pulumi.ToOutputWithContext(ctx, i).(BitbucketConnectorOutput)
}

// BitbucketConnectorArrayInput is an input type that accepts BitbucketConnectorArray and BitbucketConnectorArrayOutput values.
// You can construct a concrete instance of `BitbucketConnectorArrayInput` via:
//
//	BitbucketConnectorArray{ BitbucketConnectorArgs{...} }
type BitbucketConnectorArrayInput interface {
	pulumi.Input

	ToBitbucketConnectorArrayOutput() BitbucketConnectorArrayOutput
	ToBitbucketConnectorArrayOutputWithContext(context.Context) BitbucketConnectorArrayOutput
}

type BitbucketConnectorArray []BitbucketConnectorInput

func (BitbucketConnectorArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*BitbucketConnector)(nil)).Elem()
}

func (i BitbucketConnectorArray) ToBitbucketConnectorArrayOutput() BitbucketConnectorArrayOutput {
	return i.ToBitbucketConnectorArrayOutputWithContext(context.Background())
}

func (i BitbucketConnectorArray) ToBitbucketConnectorArrayOutputWithContext(ctx context.Context) BitbucketConnectorArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(BitbucketConnectorArrayOutput)
}

// BitbucketConnectorMapInput is an input type that accepts BitbucketConnectorMap and BitbucketConnectorMapOutput values.
// You can construct a concrete instance of `BitbucketConnectorMapInput` via:
//
//	BitbucketConnectorMap{ "key": BitbucketConnectorArgs{...} }
type BitbucketConnectorMapInput interface {
	pulumi.Input

	ToBitbucketConnectorMapOutput() BitbucketConnectorMapOutput
	ToBitbucketConnectorMapOutputWithContext(context.Context) BitbucketConnectorMapOutput
}

type BitbucketConnectorMap map[string]BitbucketConnectorInput

func (BitbucketConnectorMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*BitbucketConnector)(nil)).Elem()
}

func (i BitbucketConnectorMap) ToBitbucketConnectorMapOutput() BitbucketConnectorMapOutput {
	return i.ToBitbucketConnectorMapOutputWithContext(context.Background())
}

func (i BitbucketConnectorMap) ToBitbucketConnectorMapOutputWithContext(ctx context.Context) BitbucketConnectorMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(BitbucketConnectorMapOutput)
}

type BitbucketConnectorOutput struct{ *pulumi.OutputState }

func (BitbucketConnectorOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**BitbucketConnector)(nil)).Elem()
}

func (o BitbucketConnectorOutput) ToBitbucketConnectorOutput() BitbucketConnectorOutput {
	return o
}

func (o BitbucketConnectorOutput) ToBitbucketConnectorOutputWithContext(ctx context.Context) BitbucketConnectorOutput {
	return o
}

// Configuration for using the BitBucket api. API Access is required for using “Git Experience”, for creation of Git based triggers, Webhooks management and updating Git statuses.
func (o BitbucketConnectorOutput) ApiAuthentication() BitbucketConnectorApiAuthenticationPtrOutput {
	return o.ApplyT(func(v *BitbucketConnector) BitbucketConnectorApiAuthenticationPtrOutput { return v.ApiAuthentication }).(BitbucketConnectorApiAuthenticationPtrOutput)
}

// Whether the connection we're making is to a BitBucket repository or a BitBucket account. Valid values are Account, Repo.
func (o BitbucketConnectorOutput) ConnectionType() pulumi.StringOutput {
	return o.ApplyT(func(v *BitbucketConnector) pulumi.StringOutput { return v.ConnectionType }).(pulumi.StringOutput)
}

// Credentials to use for the connection.
func (o BitbucketConnectorOutput) Credentials() BitbucketConnectorCredentialsOutput {
	return o.ApplyT(func(v *BitbucketConnector) BitbucketConnectorCredentialsOutput { return v.Credentials }).(BitbucketConnectorCredentialsOutput)
}

// Tags to filter delegates for connection.
func (o BitbucketConnectorOutput) DelegateSelectors() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *BitbucketConnector) pulumi.StringArrayOutput { return v.DelegateSelectors }).(pulumi.StringArrayOutput)
}

// Description of the resource.
func (o BitbucketConnectorOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *BitbucketConnector) pulumi.StringPtrOutput { return v.Description }).(pulumi.StringPtrOutput)
}

// Unique identifier of the resource.
func (o BitbucketConnectorOutput) Identifier() pulumi.StringOutput {
	return o.ApplyT(func(v *BitbucketConnector) pulumi.StringOutput { return v.Identifier }).(pulumi.StringOutput)
}

// Name of the resource.
func (o BitbucketConnectorOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *BitbucketConnector) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// Unique identifier of the organization.
func (o BitbucketConnectorOutput) OrgId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *BitbucketConnector) pulumi.StringPtrOutput { return v.OrgId }).(pulumi.StringPtrOutput)
}

// Unique identifier of the project.
func (o BitbucketConnectorOutput) ProjectId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *BitbucketConnector) pulumi.StringPtrOutput { return v.ProjectId }).(pulumi.StringPtrOutput)
}

// Tags to associate with the resource.
func (o BitbucketConnectorOutput) Tags() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *BitbucketConnector) pulumi.StringArrayOutput { return v.Tags }).(pulumi.StringArrayOutput)
}

// URL of the BitBucket repository or account.
func (o BitbucketConnectorOutput) Url() pulumi.StringOutput {
	return o.ApplyT(func(v *BitbucketConnector) pulumi.StringOutput { return v.Url }).(pulumi.StringOutput)
}

// Repository to test the connection with. This is only used when `connectionType` is `Account`.
func (o BitbucketConnectorOutput) ValidationRepo() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *BitbucketConnector) pulumi.StringPtrOutput { return v.ValidationRepo }).(pulumi.StringPtrOutput)
}

type BitbucketConnectorArrayOutput struct{ *pulumi.OutputState }

func (BitbucketConnectorArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*BitbucketConnector)(nil)).Elem()
}

func (o BitbucketConnectorArrayOutput) ToBitbucketConnectorArrayOutput() BitbucketConnectorArrayOutput {
	return o
}

func (o BitbucketConnectorArrayOutput) ToBitbucketConnectorArrayOutputWithContext(ctx context.Context) BitbucketConnectorArrayOutput {
	return o
}

func (o BitbucketConnectorArrayOutput) Index(i pulumi.IntInput) BitbucketConnectorOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *BitbucketConnector {
		return vs[0].([]*BitbucketConnector)[vs[1].(int)]
	}).(BitbucketConnectorOutput)
}

type BitbucketConnectorMapOutput struct{ *pulumi.OutputState }

func (BitbucketConnectorMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*BitbucketConnector)(nil)).Elem()
}

func (o BitbucketConnectorMapOutput) ToBitbucketConnectorMapOutput() BitbucketConnectorMapOutput {
	return o
}

func (o BitbucketConnectorMapOutput) ToBitbucketConnectorMapOutputWithContext(ctx context.Context) BitbucketConnectorMapOutput {
	return o
}

func (o BitbucketConnectorMapOutput) MapIndex(k pulumi.StringInput) BitbucketConnectorOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *BitbucketConnector {
		return vs[0].(map[string]*BitbucketConnector)[vs[1].(string)]
	}).(BitbucketConnectorOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*BitbucketConnectorInput)(nil)).Elem(), &BitbucketConnector{})
	pulumi.RegisterInputType(reflect.TypeOf((*BitbucketConnectorArrayInput)(nil)).Elem(), BitbucketConnectorArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*BitbucketConnectorMapInput)(nil)).Elem(), BitbucketConnectorMap{})
	pulumi.RegisterOutputType(BitbucketConnectorOutput{})
	pulumi.RegisterOutputType(BitbucketConnectorArrayOutput{})
	pulumi.RegisterOutputType(BitbucketConnectorMapOutput{})
}
