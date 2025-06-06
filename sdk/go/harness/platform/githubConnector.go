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

// Resource for creating a Github connector.
//
// ## Import
//
// # Import account level github connector
//
// ```sh
// $ pulumi import harness:platform/githubConnector:GithubConnector example <connector_id>
// ```
//
// # Import org level github connector
//
// ```sh
// $ pulumi import harness:platform/githubConnector:GithubConnector example <ord_id>/<connector_id>
// ```
//
// # Import project level github connector
//
// ```sh
// $ pulumi import harness:platform/githubConnector:GithubConnector example <org_id>/<project_id>/<connector_id>
// ```
type GithubConnector struct {
	pulumi.CustomResourceState

	// Configuration for using the github api. API Access is required for using “Git Experience”, for creation of Git based triggers, Webhooks management and updating Git statuses.
	ApiAuthentication GithubConnectorApiAuthenticationPtrOutput `pulumi:"apiAuthentication"`
	// Whether the connection we're making is to a github repository or a github account. Valid values are Account, Repo.
	ConnectionType pulumi.StringOutput `pulumi:"connectionType"`
	// Credentials to use for the connection.
	Credentials GithubConnectorCredentialsOutput `pulumi:"credentials"`
	// Tags to filter delegates for connection.
	DelegateSelectors pulumi.StringArrayOutput `pulumi:"delegateSelectors"`
	// Description of the resource.
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// Execute on delegate or not.
	ExecuteOnDelegate pulumi.BoolPtrOutput `pulumi:"executeOnDelegate"`
	// Enable this flag for force deletion of github connector
	ForceDelete pulumi.BoolOutput `pulumi:"forceDelete"`
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
	// URL of the Github repository or account.
	Url pulumi.StringOutput `pulumi:"url"`
	// Repository to test the connection with. This is only used when `connectionType` is `Account`.
	ValidationRepo pulumi.StringPtrOutput `pulumi:"validationRepo"`
}

// NewGithubConnector registers a new resource with the given unique name, arguments, and options.
func NewGithubConnector(ctx *pulumi.Context,
	name string, args *GithubConnectorArgs, opts ...pulumi.ResourceOption) (*GithubConnector, error) {
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
	var resource GithubConnector
	err := ctx.RegisterResource("harness:platform/githubConnector:GithubConnector", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetGithubConnector gets an existing GithubConnector resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetGithubConnector(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *GithubConnectorState, opts ...pulumi.ResourceOption) (*GithubConnector, error) {
	var resource GithubConnector
	err := ctx.ReadResource("harness:platform/githubConnector:GithubConnector", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering GithubConnector resources.
type githubConnectorState struct {
	// Configuration for using the github api. API Access is required for using “Git Experience”, for creation of Git based triggers, Webhooks management and updating Git statuses.
	ApiAuthentication *GithubConnectorApiAuthentication `pulumi:"apiAuthentication"`
	// Whether the connection we're making is to a github repository or a github account. Valid values are Account, Repo.
	ConnectionType *string `pulumi:"connectionType"`
	// Credentials to use for the connection.
	Credentials *GithubConnectorCredentials `pulumi:"credentials"`
	// Tags to filter delegates for connection.
	DelegateSelectors []string `pulumi:"delegateSelectors"`
	// Description of the resource.
	Description *string `pulumi:"description"`
	// Execute on delegate or not.
	ExecuteOnDelegate *bool `pulumi:"executeOnDelegate"`
	// Enable this flag for force deletion of github connector
	ForceDelete *bool `pulumi:"forceDelete"`
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
	// URL of the Github repository or account.
	Url *string `pulumi:"url"`
	// Repository to test the connection with. This is only used when `connectionType` is `Account`.
	ValidationRepo *string `pulumi:"validationRepo"`
}

type GithubConnectorState struct {
	// Configuration for using the github api. API Access is required for using “Git Experience”, for creation of Git based triggers, Webhooks management and updating Git statuses.
	ApiAuthentication GithubConnectorApiAuthenticationPtrInput
	// Whether the connection we're making is to a github repository or a github account. Valid values are Account, Repo.
	ConnectionType pulumi.StringPtrInput
	// Credentials to use for the connection.
	Credentials GithubConnectorCredentialsPtrInput
	// Tags to filter delegates for connection.
	DelegateSelectors pulumi.StringArrayInput
	// Description of the resource.
	Description pulumi.StringPtrInput
	// Execute on delegate or not.
	ExecuteOnDelegate pulumi.BoolPtrInput
	// Enable this flag for force deletion of github connector
	ForceDelete pulumi.BoolPtrInput
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
	// URL of the Github repository or account.
	Url pulumi.StringPtrInput
	// Repository to test the connection with. This is only used when `connectionType` is `Account`.
	ValidationRepo pulumi.StringPtrInput
}

func (GithubConnectorState) ElementType() reflect.Type {
	return reflect.TypeOf((*githubConnectorState)(nil)).Elem()
}

type githubConnectorArgs struct {
	// Configuration for using the github api. API Access is required for using “Git Experience”, for creation of Git based triggers, Webhooks management and updating Git statuses.
	ApiAuthentication *GithubConnectorApiAuthentication `pulumi:"apiAuthentication"`
	// Whether the connection we're making is to a github repository or a github account. Valid values are Account, Repo.
	ConnectionType string `pulumi:"connectionType"`
	// Credentials to use for the connection.
	Credentials GithubConnectorCredentials `pulumi:"credentials"`
	// Tags to filter delegates for connection.
	DelegateSelectors []string `pulumi:"delegateSelectors"`
	// Description of the resource.
	Description *string `pulumi:"description"`
	// Execute on delegate or not.
	ExecuteOnDelegate *bool `pulumi:"executeOnDelegate"`
	// Enable this flag for force deletion of github connector
	ForceDelete *bool `pulumi:"forceDelete"`
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
	// URL of the Github repository or account.
	Url string `pulumi:"url"`
	// Repository to test the connection with. This is only used when `connectionType` is `Account`.
	ValidationRepo *string `pulumi:"validationRepo"`
}

// The set of arguments for constructing a GithubConnector resource.
type GithubConnectorArgs struct {
	// Configuration for using the github api. API Access is required for using “Git Experience”, for creation of Git based triggers, Webhooks management and updating Git statuses.
	ApiAuthentication GithubConnectorApiAuthenticationPtrInput
	// Whether the connection we're making is to a github repository or a github account. Valid values are Account, Repo.
	ConnectionType pulumi.StringInput
	// Credentials to use for the connection.
	Credentials GithubConnectorCredentialsInput
	// Tags to filter delegates for connection.
	DelegateSelectors pulumi.StringArrayInput
	// Description of the resource.
	Description pulumi.StringPtrInput
	// Execute on delegate or not.
	ExecuteOnDelegate pulumi.BoolPtrInput
	// Enable this flag for force deletion of github connector
	ForceDelete pulumi.BoolPtrInput
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
	// URL of the Github repository or account.
	Url pulumi.StringInput
	// Repository to test the connection with. This is only used when `connectionType` is `Account`.
	ValidationRepo pulumi.StringPtrInput
}

func (GithubConnectorArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*githubConnectorArgs)(nil)).Elem()
}

type GithubConnectorInput interface {
	pulumi.Input

	ToGithubConnectorOutput() GithubConnectorOutput
	ToGithubConnectorOutputWithContext(ctx context.Context) GithubConnectorOutput
}

func (*GithubConnector) ElementType() reflect.Type {
	return reflect.TypeOf((**GithubConnector)(nil)).Elem()
}

func (i *GithubConnector) ToGithubConnectorOutput() GithubConnectorOutput {
	return i.ToGithubConnectorOutputWithContext(context.Background())
}

func (i *GithubConnector) ToGithubConnectorOutputWithContext(ctx context.Context) GithubConnectorOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GithubConnectorOutput)
}

// GithubConnectorArrayInput is an input type that accepts GithubConnectorArray and GithubConnectorArrayOutput values.
// You can construct a concrete instance of `GithubConnectorArrayInput` via:
//
//	GithubConnectorArray{ GithubConnectorArgs{...} }
type GithubConnectorArrayInput interface {
	pulumi.Input

	ToGithubConnectorArrayOutput() GithubConnectorArrayOutput
	ToGithubConnectorArrayOutputWithContext(context.Context) GithubConnectorArrayOutput
}

type GithubConnectorArray []GithubConnectorInput

func (GithubConnectorArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*GithubConnector)(nil)).Elem()
}

func (i GithubConnectorArray) ToGithubConnectorArrayOutput() GithubConnectorArrayOutput {
	return i.ToGithubConnectorArrayOutputWithContext(context.Background())
}

func (i GithubConnectorArray) ToGithubConnectorArrayOutputWithContext(ctx context.Context) GithubConnectorArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GithubConnectorArrayOutput)
}

// GithubConnectorMapInput is an input type that accepts GithubConnectorMap and GithubConnectorMapOutput values.
// You can construct a concrete instance of `GithubConnectorMapInput` via:
//
//	GithubConnectorMap{ "key": GithubConnectorArgs{...} }
type GithubConnectorMapInput interface {
	pulumi.Input

	ToGithubConnectorMapOutput() GithubConnectorMapOutput
	ToGithubConnectorMapOutputWithContext(context.Context) GithubConnectorMapOutput
}

type GithubConnectorMap map[string]GithubConnectorInput

func (GithubConnectorMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*GithubConnector)(nil)).Elem()
}

func (i GithubConnectorMap) ToGithubConnectorMapOutput() GithubConnectorMapOutput {
	return i.ToGithubConnectorMapOutputWithContext(context.Background())
}

func (i GithubConnectorMap) ToGithubConnectorMapOutputWithContext(ctx context.Context) GithubConnectorMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GithubConnectorMapOutput)
}

type GithubConnectorOutput struct{ *pulumi.OutputState }

func (GithubConnectorOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**GithubConnector)(nil)).Elem()
}

func (o GithubConnectorOutput) ToGithubConnectorOutput() GithubConnectorOutput {
	return o
}

func (o GithubConnectorOutput) ToGithubConnectorOutputWithContext(ctx context.Context) GithubConnectorOutput {
	return o
}

// Configuration for using the github api. API Access is required for using “Git Experience”, for creation of Git based triggers, Webhooks management and updating Git statuses.
func (o GithubConnectorOutput) ApiAuthentication() GithubConnectorApiAuthenticationPtrOutput {
	return o.ApplyT(func(v *GithubConnector) GithubConnectorApiAuthenticationPtrOutput { return v.ApiAuthentication }).(GithubConnectorApiAuthenticationPtrOutput)
}

// Whether the connection we're making is to a github repository or a github account. Valid values are Account, Repo.
func (o GithubConnectorOutput) ConnectionType() pulumi.StringOutput {
	return o.ApplyT(func(v *GithubConnector) pulumi.StringOutput { return v.ConnectionType }).(pulumi.StringOutput)
}

// Credentials to use for the connection.
func (o GithubConnectorOutput) Credentials() GithubConnectorCredentialsOutput {
	return o.ApplyT(func(v *GithubConnector) GithubConnectorCredentialsOutput { return v.Credentials }).(GithubConnectorCredentialsOutput)
}

// Tags to filter delegates for connection.
func (o GithubConnectorOutput) DelegateSelectors() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *GithubConnector) pulumi.StringArrayOutput { return v.DelegateSelectors }).(pulumi.StringArrayOutput)
}

// Description of the resource.
func (o GithubConnectorOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *GithubConnector) pulumi.StringPtrOutput { return v.Description }).(pulumi.StringPtrOutput)
}

// Execute on delegate or not.
func (o GithubConnectorOutput) ExecuteOnDelegate() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *GithubConnector) pulumi.BoolPtrOutput { return v.ExecuteOnDelegate }).(pulumi.BoolPtrOutput)
}

// Enable this flag for force deletion of github connector
func (o GithubConnectorOutput) ForceDelete() pulumi.BoolOutput {
	return o.ApplyT(func(v *GithubConnector) pulumi.BoolOutput { return v.ForceDelete }).(pulumi.BoolOutput)
}

// Unique identifier of the resource.
func (o GithubConnectorOutput) Identifier() pulumi.StringOutput {
	return o.ApplyT(func(v *GithubConnector) pulumi.StringOutput { return v.Identifier }).(pulumi.StringOutput)
}

// Name of the resource.
func (o GithubConnectorOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *GithubConnector) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// Unique identifier of the organization.
func (o GithubConnectorOutput) OrgId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *GithubConnector) pulumi.StringPtrOutput { return v.OrgId }).(pulumi.StringPtrOutput)
}

// Unique identifier of the project.
func (o GithubConnectorOutput) ProjectId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *GithubConnector) pulumi.StringPtrOutput { return v.ProjectId }).(pulumi.StringPtrOutput)
}

// Tags to associate with the resource.
func (o GithubConnectorOutput) Tags() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *GithubConnector) pulumi.StringArrayOutput { return v.Tags }).(pulumi.StringArrayOutput)
}

// URL of the Github repository or account.
func (o GithubConnectorOutput) Url() pulumi.StringOutput {
	return o.ApplyT(func(v *GithubConnector) pulumi.StringOutput { return v.Url }).(pulumi.StringOutput)
}

// Repository to test the connection with. This is only used when `connectionType` is `Account`.
func (o GithubConnectorOutput) ValidationRepo() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *GithubConnector) pulumi.StringPtrOutput { return v.ValidationRepo }).(pulumi.StringPtrOutput)
}

type GithubConnectorArrayOutput struct{ *pulumi.OutputState }

func (GithubConnectorArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*GithubConnector)(nil)).Elem()
}

func (o GithubConnectorArrayOutput) ToGithubConnectorArrayOutput() GithubConnectorArrayOutput {
	return o
}

func (o GithubConnectorArrayOutput) ToGithubConnectorArrayOutputWithContext(ctx context.Context) GithubConnectorArrayOutput {
	return o
}

func (o GithubConnectorArrayOutput) Index(i pulumi.IntInput) GithubConnectorOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *GithubConnector {
		return vs[0].([]*GithubConnector)[vs[1].(int)]
	}).(GithubConnectorOutput)
}

type GithubConnectorMapOutput struct{ *pulumi.OutputState }

func (GithubConnectorMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*GithubConnector)(nil)).Elem()
}

func (o GithubConnectorMapOutput) ToGithubConnectorMapOutput() GithubConnectorMapOutput {
	return o
}

func (o GithubConnectorMapOutput) ToGithubConnectorMapOutputWithContext(ctx context.Context) GithubConnectorMapOutput {
	return o
}

func (o GithubConnectorMapOutput) MapIndex(k pulumi.StringInput) GithubConnectorOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *GithubConnector {
		return vs[0].(map[string]*GithubConnector)[vs[1].(string)]
	}).(GithubConnectorOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*GithubConnectorInput)(nil)).Elem(), &GithubConnector{})
	pulumi.RegisterInputType(reflect.TypeOf((*GithubConnectorArrayInput)(nil)).Elem(), GithubConnectorArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*GithubConnectorMapInput)(nil)).Elem(), GithubConnectorMap{})
	pulumi.RegisterOutputType(GithubConnectorOutput{})
	pulumi.RegisterOutputType(GithubConnectorArrayOutput{})
	pulumi.RegisterOutputType(GithubConnectorMapOutput{})
}
