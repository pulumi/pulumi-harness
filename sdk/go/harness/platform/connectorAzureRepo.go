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

type ConnectorAzureRepo struct {
	pulumi.CustomResourceState

	// Configuration for using the azure api. API Access is required for using “Git Experience”, for creation of Git based
	// triggers, Webhooks management and updating Git statuses.
	ApiAuthentication ConnectorAzureRepoApiAuthenticationPtrOutput `pulumi:"apiAuthentication"`
	// Whether the connection we're making is to a azure repository or a azure account. Valid values are Project, Repo.
	ConnectionType pulumi.StringOutput `pulumi:"connectionType"`
	// Credentials to use for the connection.
	Credentials ConnectorAzureRepoCredentialsOutput `pulumi:"credentials"`
	// Tags to filter delegates for connection.
	DelegateSelectors pulumi.StringArrayOutput `pulumi:"delegateSelectors"`
	// Description of the resource.
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// Execute on delegate or not.
	ExecuteOnDelegate pulumi.BoolPtrOutput `pulumi:"executeOnDelegate"`
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
	// URL of the azure repository or account.
	Url pulumi.StringOutput `pulumi:"url"`
	// Repository to test the connection with. This is only used when `connectionType` is `Account`.
	ValidationRepo pulumi.StringPtrOutput `pulumi:"validationRepo"`
}

// NewConnectorAzureRepo registers a new resource with the given unique name, arguments, and options.
func NewConnectorAzureRepo(ctx *pulumi.Context,
	name string, args *ConnectorAzureRepoArgs, opts ...pulumi.ResourceOption) (*ConnectorAzureRepo, error) {
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
	var resource ConnectorAzureRepo
	err := ctx.RegisterResource("harness:platform/connectorAzureRepo:ConnectorAzureRepo", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetConnectorAzureRepo gets an existing ConnectorAzureRepo resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetConnectorAzureRepo(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ConnectorAzureRepoState, opts ...pulumi.ResourceOption) (*ConnectorAzureRepo, error) {
	var resource ConnectorAzureRepo
	err := ctx.ReadResource("harness:platform/connectorAzureRepo:ConnectorAzureRepo", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering ConnectorAzureRepo resources.
type connectorAzureRepoState struct {
	// Configuration for using the azure api. API Access is required for using “Git Experience”, for creation of Git based
	// triggers, Webhooks management and updating Git statuses.
	ApiAuthentication *ConnectorAzureRepoApiAuthentication `pulumi:"apiAuthentication"`
	// Whether the connection we're making is to a azure repository or a azure account. Valid values are Project, Repo.
	ConnectionType *string `pulumi:"connectionType"`
	// Credentials to use for the connection.
	Credentials *ConnectorAzureRepoCredentials `pulumi:"credentials"`
	// Tags to filter delegates for connection.
	DelegateSelectors []string `pulumi:"delegateSelectors"`
	// Description of the resource.
	Description *string `pulumi:"description"`
	// Execute on delegate or not.
	ExecuteOnDelegate *bool `pulumi:"executeOnDelegate"`
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
	// URL of the azure repository or account.
	Url *string `pulumi:"url"`
	// Repository to test the connection with. This is only used when `connectionType` is `Account`.
	ValidationRepo *string `pulumi:"validationRepo"`
}

type ConnectorAzureRepoState struct {
	// Configuration for using the azure api. API Access is required for using “Git Experience”, for creation of Git based
	// triggers, Webhooks management and updating Git statuses.
	ApiAuthentication ConnectorAzureRepoApiAuthenticationPtrInput
	// Whether the connection we're making is to a azure repository or a azure account. Valid values are Project, Repo.
	ConnectionType pulumi.StringPtrInput
	// Credentials to use for the connection.
	Credentials ConnectorAzureRepoCredentialsPtrInput
	// Tags to filter delegates for connection.
	DelegateSelectors pulumi.StringArrayInput
	// Description of the resource.
	Description pulumi.StringPtrInput
	// Execute on delegate or not.
	ExecuteOnDelegate pulumi.BoolPtrInput
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
	// URL of the azure repository or account.
	Url pulumi.StringPtrInput
	// Repository to test the connection with. This is only used when `connectionType` is `Account`.
	ValidationRepo pulumi.StringPtrInput
}

func (ConnectorAzureRepoState) ElementType() reflect.Type {
	return reflect.TypeOf((*connectorAzureRepoState)(nil)).Elem()
}

type connectorAzureRepoArgs struct {
	// Configuration for using the azure api. API Access is required for using “Git Experience”, for creation of Git based
	// triggers, Webhooks management and updating Git statuses.
	ApiAuthentication *ConnectorAzureRepoApiAuthentication `pulumi:"apiAuthentication"`
	// Whether the connection we're making is to a azure repository or a azure account. Valid values are Project, Repo.
	ConnectionType string `pulumi:"connectionType"`
	// Credentials to use for the connection.
	Credentials ConnectorAzureRepoCredentials `pulumi:"credentials"`
	// Tags to filter delegates for connection.
	DelegateSelectors []string `pulumi:"delegateSelectors"`
	// Description of the resource.
	Description *string `pulumi:"description"`
	// Execute on delegate or not.
	ExecuteOnDelegate *bool `pulumi:"executeOnDelegate"`
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
	// URL of the azure repository or account.
	Url string `pulumi:"url"`
	// Repository to test the connection with. This is only used when `connectionType` is `Account`.
	ValidationRepo *string `pulumi:"validationRepo"`
}

// The set of arguments for constructing a ConnectorAzureRepo resource.
type ConnectorAzureRepoArgs struct {
	// Configuration for using the azure api. API Access is required for using “Git Experience”, for creation of Git based
	// triggers, Webhooks management and updating Git statuses.
	ApiAuthentication ConnectorAzureRepoApiAuthenticationPtrInput
	// Whether the connection we're making is to a azure repository or a azure account. Valid values are Project, Repo.
	ConnectionType pulumi.StringInput
	// Credentials to use for the connection.
	Credentials ConnectorAzureRepoCredentialsInput
	// Tags to filter delegates for connection.
	DelegateSelectors pulumi.StringArrayInput
	// Description of the resource.
	Description pulumi.StringPtrInput
	// Execute on delegate or not.
	ExecuteOnDelegate pulumi.BoolPtrInput
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
	// URL of the azure repository or account.
	Url pulumi.StringInput
	// Repository to test the connection with. This is only used when `connectionType` is `Account`.
	ValidationRepo pulumi.StringPtrInput
}

func (ConnectorAzureRepoArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*connectorAzureRepoArgs)(nil)).Elem()
}

type ConnectorAzureRepoInput interface {
	pulumi.Input

	ToConnectorAzureRepoOutput() ConnectorAzureRepoOutput
	ToConnectorAzureRepoOutputWithContext(ctx context.Context) ConnectorAzureRepoOutput
}

func (*ConnectorAzureRepo) ElementType() reflect.Type {
	return reflect.TypeOf((**ConnectorAzureRepo)(nil)).Elem()
}

func (i *ConnectorAzureRepo) ToConnectorAzureRepoOutput() ConnectorAzureRepoOutput {
	return i.ToConnectorAzureRepoOutputWithContext(context.Background())
}

func (i *ConnectorAzureRepo) ToConnectorAzureRepoOutputWithContext(ctx context.Context) ConnectorAzureRepoOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ConnectorAzureRepoOutput)
}

// ConnectorAzureRepoArrayInput is an input type that accepts ConnectorAzureRepoArray and ConnectorAzureRepoArrayOutput values.
// You can construct a concrete instance of `ConnectorAzureRepoArrayInput` via:
//
//	ConnectorAzureRepoArray{ ConnectorAzureRepoArgs{...} }
type ConnectorAzureRepoArrayInput interface {
	pulumi.Input

	ToConnectorAzureRepoArrayOutput() ConnectorAzureRepoArrayOutput
	ToConnectorAzureRepoArrayOutputWithContext(context.Context) ConnectorAzureRepoArrayOutput
}

type ConnectorAzureRepoArray []ConnectorAzureRepoInput

func (ConnectorAzureRepoArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ConnectorAzureRepo)(nil)).Elem()
}

func (i ConnectorAzureRepoArray) ToConnectorAzureRepoArrayOutput() ConnectorAzureRepoArrayOutput {
	return i.ToConnectorAzureRepoArrayOutputWithContext(context.Background())
}

func (i ConnectorAzureRepoArray) ToConnectorAzureRepoArrayOutputWithContext(ctx context.Context) ConnectorAzureRepoArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ConnectorAzureRepoArrayOutput)
}

// ConnectorAzureRepoMapInput is an input type that accepts ConnectorAzureRepoMap and ConnectorAzureRepoMapOutput values.
// You can construct a concrete instance of `ConnectorAzureRepoMapInput` via:
//
//	ConnectorAzureRepoMap{ "key": ConnectorAzureRepoArgs{...} }
type ConnectorAzureRepoMapInput interface {
	pulumi.Input

	ToConnectorAzureRepoMapOutput() ConnectorAzureRepoMapOutput
	ToConnectorAzureRepoMapOutputWithContext(context.Context) ConnectorAzureRepoMapOutput
}

type ConnectorAzureRepoMap map[string]ConnectorAzureRepoInput

func (ConnectorAzureRepoMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ConnectorAzureRepo)(nil)).Elem()
}

func (i ConnectorAzureRepoMap) ToConnectorAzureRepoMapOutput() ConnectorAzureRepoMapOutput {
	return i.ToConnectorAzureRepoMapOutputWithContext(context.Background())
}

func (i ConnectorAzureRepoMap) ToConnectorAzureRepoMapOutputWithContext(ctx context.Context) ConnectorAzureRepoMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ConnectorAzureRepoMapOutput)
}

type ConnectorAzureRepoOutput struct{ *pulumi.OutputState }

func (ConnectorAzureRepoOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**ConnectorAzureRepo)(nil)).Elem()
}

func (o ConnectorAzureRepoOutput) ToConnectorAzureRepoOutput() ConnectorAzureRepoOutput {
	return o
}

func (o ConnectorAzureRepoOutput) ToConnectorAzureRepoOutputWithContext(ctx context.Context) ConnectorAzureRepoOutput {
	return o
}

// Configuration for using the azure api. API Access is required for using “Git Experience”, for creation of Git based
// triggers, Webhooks management and updating Git statuses.
func (o ConnectorAzureRepoOutput) ApiAuthentication() ConnectorAzureRepoApiAuthenticationPtrOutput {
	return o.ApplyT(func(v *ConnectorAzureRepo) ConnectorAzureRepoApiAuthenticationPtrOutput { return v.ApiAuthentication }).(ConnectorAzureRepoApiAuthenticationPtrOutput)
}

// Whether the connection we're making is to a azure repository or a azure account. Valid values are Project, Repo.
func (o ConnectorAzureRepoOutput) ConnectionType() pulumi.StringOutput {
	return o.ApplyT(func(v *ConnectorAzureRepo) pulumi.StringOutput { return v.ConnectionType }).(pulumi.StringOutput)
}

// Credentials to use for the connection.
func (o ConnectorAzureRepoOutput) Credentials() ConnectorAzureRepoCredentialsOutput {
	return o.ApplyT(func(v *ConnectorAzureRepo) ConnectorAzureRepoCredentialsOutput { return v.Credentials }).(ConnectorAzureRepoCredentialsOutput)
}

// Tags to filter delegates for connection.
func (o ConnectorAzureRepoOutput) DelegateSelectors() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *ConnectorAzureRepo) pulumi.StringArrayOutput { return v.DelegateSelectors }).(pulumi.StringArrayOutput)
}

// Description of the resource.
func (o ConnectorAzureRepoOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ConnectorAzureRepo) pulumi.StringPtrOutput { return v.Description }).(pulumi.StringPtrOutput)
}

// Execute on delegate or not.
func (o ConnectorAzureRepoOutput) ExecuteOnDelegate() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *ConnectorAzureRepo) pulumi.BoolPtrOutput { return v.ExecuteOnDelegate }).(pulumi.BoolPtrOutput)
}

// Unique identifier of the resource.
func (o ConnectorAzureRepoOutput) Identifier() pulumi.StringOutput {
	return o.ApplyT(func(v *ConnectorAzureRepo) pulumi.StringOutput { return v.Identifier }).(pulumi.StringOutput)
}

// Name of the resource.
func (o ConnectorAzureRepoOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *ConnectorAzureRepo) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// Unique identifier of the organization.
func (o ConnectorAzureRepoOutput) OrgId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ConnectorAzureRepo) pulumi.StringPtrOutput { return v.OrgId }).(pulumi.StringPtrOutput)
}

// Unique identifier of the project.
func (o ConnectorAzureRepoOutput) ProjectId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ConnectorAzureRepo) pulumi.StringPtrOutput { return v.ProjectId }).(pulumi.StringPtrOutput)
}

// Tags to associate with the resource.
func (o ConnectorAzureRepoOutput) Tags() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *ConnectorAzureRepo) pulumi.StringArrayOutput { return v.Tags }).(pulumi.StringArrayOutput)
}

// URL of the azure repository or account.
func (o ConnectorAzureRepoOutput) Url() pulumi.StringOutput {
	return o.ApplyT(func(v *ConnectorAzureRepo) pulumi.StringOutput { return v.Url }).(pulumi.StringOutput)
}

// Repository to test the connection with. This is only used when `connectionType` is `Account`.
func (o ConnectorAzureRepoOutput) ValidationRepo() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ConnectorAzureRepo) pulumi.StringPtrOutput { return v.ValidationRepo }).(pulumi.StringPtrOutput)
}

type ConnectorAzureRepoArrayOutput struct{ *pulumi.OutputState }

func (ConnectorAzureRepoArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ConnectorAzureRepo)(nil)).Elem()
}

func (o ConnectorAzureRepoArrayOutput) ToConnectorAzureRepoArrayOutput() ConnectorAzureRepoArrayOutput {
	return o
}

func (o ConnectorAzureRepoArrayOutput) ToConnectorAzureRepoArrayOutputWithContext(ctx context.Context) ConnectorAzureRepoArrayOutput {
	return o
}

func (o ConnectorAzureRepoArrayOutput) Index(i pulumi.IntInput) ConnectorAzureRepoOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *ConnectorAzureRepo {
		return vs[0].([]*ConnectorAzureRepo)[vs[1].(int)]
	}).(ConnectorAzureRepoOutput)
}

type ConnectorAzureRepoMapOutput struct{ *pulumi.OutputState }

func (ConnectorAzureRepoMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ConnectorAzureRepo)(nil)).Elem()
}

func (o ConnectorAzureRepoMapOutput) ToConnectorAzureRepoMapOutput() ConnectorAzureRepoMapOutput {
	return o
}

func (o ConnectorAzureRepoMapOutput) ToConnectorAzureRepoMapOutputWithContext(ctx context.Context) ConnectorAzureRepoMapOutput {
	return o
}

func (o ConnectorAzureRepoMapOutput) MapIndex(k pulumi.StringInput) ConnectorAzureRepoOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *ConnectorAzureRepo {
		return vs[0].(map[string]*ConnectorAzureRepo)[vs[1].(string)]
	}).(ConnectorAzureRepoOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ConnectorAzureRepoInput)(nil)).Elem(), &ConnectorAzureRepo{})
	pulumi.RegisterInputType(reflect.TypeOf((*ConnectorAzureRepoArrayInput)(nil)).Elem(), ConnectorAzureRepoArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ConnectorAzureRepoMapInput)(nil)).Elem(), ConnectorAzureRepoMap{})
	pulumi.RegisterOutputType(ConnectorAzureRepoOutput{})
	pulumi.RegisterOutputType(ConnectorAzureRepoArrayOutput{})
	pulumi.RegisterOutputType(ConnectorAzureRepoMapOutput{})
}
