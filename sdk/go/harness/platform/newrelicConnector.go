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

// Resource for creating a New Relic connector.
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
//			_, err := platform.NewNewrelicConnector(ctx, "test", &platform.NewrelicConnectorArgs{
//				Identifier:  pulumi.String("identifier"),
//				Name:        pulumi.String("name"),
//				Description: pulumi.String("test"),
//				Tags: pulumi.StringArray{
//					pulumi.String("foo:bar"),
//				},
//				Url: pulumi.String("https://newrelic.com/"),
//				DelegateSelectors: pulumi.StringArray{
//					pulumi.String("harness-delegate"),
//				},
//				AccountId: pulumi.String("nr_account_id"),
//				ApiKeyRef: pulumi.String("account.secret_id"),
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
// # Import account level newrelic connector
//
// ```sh
// $ pulumi import harness:platform/newrelicConnector:NewrelicConnector example <connector_id>
// ```
//
// # Import org level newrelic connector
//
// ```sh
// $ pulumi import harness:platform/newrelicConnector:NewrelicConnector example <ord_id>/<connector_id>
// ```
//
// # Import project level newrelic connector
//
// ```sh
// $ pulumi import harness:platform/newrelicConnector:NewrelicConnector example <org_id>/<project_id>/<connector_id>
// ```
type NewrelicConnector struct {
	pulumi.CustomResourceState

	// Account ID of the NewRelic account.
	AccountId pulumi.StringOutput `pulumi:"accountId"`
	// Reference to the Harness secret containing the api key. To reference a secret at the organization scope, prefix 'org' to the expression: org.{identifier}. To reference a secret at the account scope, prefix 'account` to the expression: account.{identifier}.
	ApiKeyRef pulumi.StringOutput `pulumi:"apiKeyRef"`
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
	// URL of the NewRelic server.
	Url pulumi.StringOutput `pulumi:"url"`
}

// NewNewrelicConnector registers a new resource with the given unique name, arguments, and options.
func NewNewrelicConnector(ctx *pulumi.Context,
	name string, args *NewrelicConnectorArgs, opts ...pulumi.ResourceOption) (*NewrelicConnector, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.AccountId == nil {
		return nil, errors.New("invalid value for required argument 'AccountId'")
	}
	if args.ApiKeyRef == nil {
		return nil, errors.New("invalid value for required argument 'ApiKeyRef'")
	}
	if args.Identifier == nil {
		return nil, errors.New("invalid value for required argument 'Identifier'")
	}
	if args.Url == nil {
		return nil, errors.New("invalid value for required argument 'Url'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource NewrelicConnector
	err := ctx.RegisterResource("harness:platform/newrelicConnector:NewrelicConnector", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetNewrelicConnector gets an existing NewrelicConnector resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetNewrelicConnector(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *NewrelicConnectorState, opts ...pulumi.ResourceOption) (*NewrelicConnector, error) {
	var resource NewrelicConnector
	err := ctx.ReadResource("harness:platform/newrelicConnector:NewrelicConnector", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering NewrelicConnector resources.
type newrelicConnectorState struct {
	// Account ID of the NewRelic account.
	AccountId *string `pulumi:"accountId"`
	// Reference to the Harness secret containing the api key. To reference a secret at the organization scope, prefix 'org' to the expression: org.{identifier}. To reference a secret at the account scope, prefix 'account` to the expression: account.{identifier}.
	ApiKeyRef *string `pulumi:"apiKeyRef"`
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
	// URL of the NewRelic server.
	Url *string `pulumi:"url"`
}

type NewrelicConnectorState struct {
	// Account ID of the NewRelic account.
	AccountId pulumi.StringPtrInput
	// Reference to the Harness secret containing the api key. To reference a secret at the organization scope, prefix 'org' to the expression: org.{identifier}. To reference a secret at the account scope, prefix 'account` to the expression: account.{identifier}.
	ApiKeyRef pulumi.StringPtrInput
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
	// URL of the NewRelic server.
	Url pulumi.StringPtrInput
}

func (NewrelicConnectorState) ElementType() reflect.Type {
	return reflect.TypeOf((*newrelicConnectorState)(nil)).Elem()
}

type newrelicConnectorArgs struct {
	// Account ID of the NewRelic account.
	AccountId string `pulumi:"accountId"`
	// Reference to the Harness secret containing the api key. To reference a secret at the organization scope, prefix 'org' to the expression: org.{identifier}. To reference a secret at the account scope, prefix 'account` to the expression: account.{identifier}.
	ApiKeyRef string `pulumi:"apiKeyRef"`
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
	// URL of the NewRelic server.
	Url string `pulumi:"url"`
}

// The set of arguments for constructing a NewrelicConnector resource.
type NewrelicConnectorArgs struct {
	// Account ID of the NewRelic account.
	AccountId pulumi.StringInput
	// Reference to the Harness secret containing the api key. To reference a secret at the organization scope, prefix 'org' to the expression: org.{identifier}. To reference a secret at the account scope, prefix 'account` to the expression: account.{identifier}.
	ApiKeyRef pulumi.StringInput
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
	// URL of the NewRelic server.
	Url pulumi.StringInput
}

func (NewrelicConnectorArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*newrelicConnectorArgs)(nil)).Elem()
}

type NewrelicConnectorInput interface {
	pulumi.Input

	ToNewrelicConnectorOutput() NewrelicConnectorOutput
	ToNewrelicConnectorOutputWithContext(ctx context.Context) NewrelicConnectorOutput
}

func (*NewrelicConnector) ElementType() reflect.Type {
	return reflect.TypeOf((**NewrelicConnector)(nil)).Elem()
}

func (i *NewrelicConnector) ToNewrelicConnectorOutput() NewrelicConnectorOutput {
	return i.ToNewrelicConnectorOutputWithContext(context.Background())
}

func (i *NewrelicConnector) ToNewrelicConnectorOutputWithContext(ctx context.Context) NewrelicConnectorOutput {
	return pulumi.ToOutputWithContext(ctx, i).(NewrelicConnectorOutput)
}

// NewrelicConnectorArrayInput is an input type that accepts NewrelicConnectorArray and NewrelicConnectorArrayOutput values.
// You can construct a concrete instance of `NewrelicConnectorArrayInput` via:
//
//	NewrelicConnectorArray{ NewrelicConnectorArgs{...} }
type NewrelicConnectorArrayInput interface {
	pulumi.Input

	ToNewrelicConnectorArrayOutput() NewrelicConnectorArrayOutput
	ToNewrelicConnectorArrayOutputWithContext(context.Context) NewrelicConnectorArrayOutput
}

type NewrelicConnectorArray []NewrelicConnectorInput

func (NewrelicConnectorArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*NewrelicConnector)(nil)).Elem()
}

func (i NewrelicConnectorArray) ToNewrelicConnectorArrayOutput() NewrelicConnectorArrayOutput {
	return i.ToNewrelicConnectorArrayOutputWithContext(context.Background())
}

func (i NewrelicConnectorArray) ToNewrelicConnectorArrayOutputWithContext(ctx context.Context) NewrelicConnectorArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(NewrelicConnectorArrayOutput)
}

// NewrelicConnectorMapInput is an input type that accepts NewrelicConnectorMap and NewrelicConnectorMapOutput values.
// You can construct a concrete instance of `NewrelicConnectorMapInput` via:
//
//	NewrelicConnectorMap{ "key": NewrelicConnectorArgs{...} }
type NewrelicConnectorMapInput interface {
	pulumi.Input

	ToNewrelicConnectorMapOutput() NewrelicConnectorMapOutput
	ToNewrelicConnectorMapOutputWithContext(context.Context) NewrelicConnectorMapOutput
}

type NewrelicConnectorMap map[string]NewrelicConnectorInput

func (NewrelicConnectorMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*NewrelicConnector)(nil)).Elem()
}

func (i NewrelicConnectorMap) ToNewrelicConnectorMapOutput() NewrelicConnectorMapOutput {
	return i.ToNewrelicConnectorMapOutputWithContext(context.Background())
}

func (i NewrelicConnectorMap) ToNewrelicConnectorMapOutputWithContext(ctx context.Context) NewrelicConnectorMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(NewrelicConnectorMapOutput)
}

type NewrelicConnectorOutput struct{ *pulumi.OutputState }

func (NewrelicConnectorOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**NewrelicConnector)(nil)).Elem()
}

func (o NewrelicConnectorOutput) ToNewrelicConnectorOutput() NewrelicConnectorOutput {
	return o
}

func (o NewrelicConnectorOutput) ToNewrelicConnectorOutputWithContext(ctx context.Context) NewrelicConnectorOutput {
	return o
}

// Account ID of the NewRelic account.
func (o NewrelicConnectorOutput) AccountId() pulumi.StringOutput {
	return o.ApplyT(func(v *NewrelicConnector) pulumi.StringOutput { return v.AccountId }).(pulumi.StringOutput)
}

// Reference to the Harness secret containing the api key. To reference a secret at the organization scope, prefix 'org' to the expression: org.{identifier}. To reference a secret at the account scope, prefix 'account` to the expression: account.{identifier}.
func (o NewrelicConnectorOutput) ApiKeyRef() pulumi.StringOutput {
	return o.ApplyT(func(v *NewrelicConnector) pulumi.StringOutput { return v.ApiKeyRef }).(pulumi.StringOutput)
}

// Tags to filter delegates for connection.
func (o NewrelicConnectorOutput) DelegateSelectors() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *NewrelicConnector) pulumi.StringArrayOutput { return v.DelegateSelectors }).(pulumi.StringArrayOutput)
}

// Description of the resource.
func (o NewrelicConnectorOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *NewrelicConnector) pulumi.StringPtrOutput { return v.Description }).(pulumi.StringPtrOutput)
}

// Unique identifier of the resource.
func (o NewrelicConnectorOutput) Identifier() pulumi.StringOutput {
	return o.ApplyT(func(v *NewrelicConnector) pulumi.StringOutput { return v.Identifier }).(pulumi.StringOutput)
}

// Name of the resource.
func (o NewrelicConnectorOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *NewrelicConnector) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// Unique identifier of the organization.
func (o NewrelicConnectorOutput) OrgId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *NewrelicConnector) pulumi.StringPtrOutput { return v.OrgId }).(pulumi.StringPtrOutput)
}

// Unique identifier of the project.
func (o NewrelicConnectorOutput) ProjectId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *NewrelicConnector) pulumi.StringPtrOutput { return v.ProjectId }).(pulumi.StringPtrOutput)
}

// Tags to associate with the resource.
func (o NewrelicConnectorOutput) Tags() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *NewrelicConnector) pulumi.StringArrayOutput { return v.Tags }).(pulumi.StringArrayOutput)
}

// URL of the NewRelic server.
func (o NewrelicConnectorOutput) Url() pulumi.StringOutput {
	return o.ApplyT(func(v *NewrelicConnector) pulumi.StringOutput { return v.Url }).(pulumi.StringOutput)
}

type NewrelicConnectorArrayOutput struct{ *pulumi.OutputState }

func (NewrelicConnectorArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*NewrelicConnector)(nil)).Elem()
}

func (o NewrelicConnectorArrayOutput) ToNewrelicConnectorArrayOutput() NewrelicConnectorArrayOutput {
	return o
}

func (o NewrelicConnectorArrayOutput) ToNewrelicConnectorArrayOutputWithContext(ctx context.Context) NewrelicConnectorArrayOutput {
	return o
}

func (o NewrelicConnectorArrayOutput) Index(i pulumi.IntInput) NewrelicConnectorOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *NewrelicConnector {
		return vs[0].([]*NewrelicConnector)[vs[1].(int)]
	}).(NewrelicConnectorOutput)
}

type NewrelicConnectorMapOutput struct{ *pulumi.OutputState }

func (NewrelicConnectorMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*NewrelicConnector)(nil)).Elem()
}

func (o NewrelicConnectorMapOutput) ToNewrelicConnectorMapOutput() NewrelicConnectorMapOutput {
	return o
}

func (o NewrelicConnectorMapOutput) ToNewrelicConnectorMapOutputWithContext(ctx context.Context) NewrelicConnectorMapOutput {
	return o
}

func (o NewrelicConnectorMapOutput) MapIndex(k pulumi.StringInput) NewrelicConnectorOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *NewrelicConnector {
		return vs[0].(map[string]*NewrelicConnector)[vs[1].(string)]
	}).(NewrelicConnectorOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*NewrelicConnectorInput)(nil)).Elem(), &NewrelicConnector{})
	pulumi.RegisterInputType(reflect.TypeOf((*NewrelicConnectorArrayInput)(nil)).Elem(), NewrelicConnectorArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*NewrelicConnectorMapInput)(nil)).Elem(), NewrelicConnectorMap{})
	pulumi.RegisterOutputType(NewrelicConnectorOutput{})
	pulumi.RegisterOutputType(NewrelicConnectorArrayOutput{})
	pulumi.RegisterOutputType(NewrelicConnectorMapOutput{})
}
