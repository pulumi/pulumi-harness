// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package platform

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-harness/sdk/go/harness/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Resource for creating a monitored service.
//
// ## Import
//
// Import account level monitored_service
//
// ```sh
// $ pulumi import harness:platform/monitoredService:MonitoredService example <monitored_service_id>
// ```
//
// Import organization level monitored_service
//
// ```sh
// $ pulumi import harness:platform/monitoredService:MonitoredService example <org_id>/<monitored_service_id>
// ```
//
// Import project level monitored_service
//
// ```sh
// $ pulumi import harness:platform/monitoredService:MonitoredService example <org_id>/<project_id>/<monitored_service_id>
// ```
type MonitoredService struct {
	pulumi.CustomResourceState

	// Identifier of the monitored service.
	Identifier pulumi.StringOutput `pulumi:"identifier"`
	// Identifier of the organization in which the monitored service is configured.
	OrgId pulumi.StringOutput `pulumi:"orgId"`
	// Identifier of the project in which the monitored service is configured.
	ProjectId pulumi.StringOutput `pulumi:"projectId"`
	// Request for creating or updating a monitored service.
	Request MonitoredServiceRequestPtrOutput `pulumi:"request"`
}

// NewMonitoredService registers a new resource with the given unique name, arguments, and options.
func NewMonitoredService(ctx *pulumi.Context,
	name string, args *MonitoredServiceArgs, opts ...pulumi.ResourceOption) (*MonitoredService, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Identifier == nil {
		return nil, errors.New("invalid value for required argument 'Identifier'")
	}
	if args.OrgId == nil {
		return nil, errors.New("invalid value for required argument 'OrgId'")
	}
	if args.ProjectId == nil {
		return nil, errors.New("invalid value for required argument 'ProjectId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource MonitoredService
	err := ctx.RegisterResource("harness:platform/monitoredService:MonitoredService", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetMonitoredService gets an existing MonitoredService resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetMonitoredService(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *MonitoredServiceState, opts ...pulumi.ResourceOption) (*MonitoredService, error) {
	var resource MonitoredService
	err := ctx.ReadResource("harness:platform/monitoredService:MonitoredService", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering MonitoredService resources.
type monitoredServiceState struct {
	// Identifier of the monitored service.
	Identifier *string `pulumi:"identifier"`
	// Identifier of the organization in which the monitored service is configured.
	OrgId *string `pulumi:"orgId"`
	// Identifier of the project in which the monitored service is configured.
	ProjectId *string `pulumi:"projectId"`
	// Request for creating or updating a monitored service.
	Request *MonitoredServiceRequest `pulumi:"request"`
}

type MonitoredServiceState struct {
	// Identifier of the monitored service.
	Identifier pulumi.StringPtrInput
	// Identifier of the organization in which the monitored service is configured.
	OrgId pulumi.StringPtrInput
	// Identifier of the project in which the monitored service is configured.
	ProjectId pulumi.StringPtrInput
	// Request for creating or updating a monitored service.
	Request MonitoredServiceRequestPtrInput
}

func (MonitoredServiceState) ElementType() reflect.Type {
	return reflect.TypeOf((*monitoredServiceState)(nil)).Elem()
}

type monitoredServiceArgs struct {
	// Identifier of the monitored service.
	Identifier string `pulumi:"identifier"`
	// Identifier of the organization in which the monitored service is configured.
	OrgId string `pulumi:"orgId"`
	// Identifier of the project in which the monitored service is configured.
	ProjectId string `pulumi:"projectId"`
	// Request for creating or updating a monitored service.
	Request *MonitoredServiceRequest `pulumi:"request"`
}

// The set of arguments for constructing a MonitoredService resource.
type MonitoredServiceArgs struct {
	// Identifier of the monitored service.
	Identifier pulumi.StringInput
	// Identifier of the organization in which the monitored service is configured.
	OrgId pulumi.StringInput
	// Identifier of the project in which the monitored service is configured.
	ProjectId pulumi.StringInput
	// Request for creating or updating a monitored service.
	Request MonitoredServiceRequestPtrInput
}

func (MonitoredServiceArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*monitoredServiceArgs)(nil)).Elem()
}

type MonitoredServiceInput interface {
	pulumi.Input

	ToMonitoredServiceOutput() MonitoredServiceOutput
	ToMonitoredServiceOutputWithContext(ctx context.Context) MonitoredServiceOutput
}

func (*MonitoredService) ElementType() reflect.Type {
	return reflect.TypeOf((**MonitoredService)(nil)).Elem()
}

func (i *MonitoredService) ToMonitoredServiceOutput() MonitoredServiceOutput {
	return i.ToMonitoredServiceOutputWithContext(context.Background())
}

func (i *MonitoredService) ToMonitoredServiceOutputWithContext(ctx context.Context) MonitoredServiceOutput {
	return pulumi.ToOutputWithContext(ctx, i).(MonitoredServiceOutput)
}

// MonitoredServiceArrayInput is an input type that accepts MonitoredServiceArray and MonitoredServiceArrayOutput values.
// You can construct a concrete instance of `MonitoredServiceArrayInput` via:
//
//	MonitoredServiceArray{ MonitoredServiceArgs{...} }
type MonitoredServiceArrayInput interface {
	pulumi.Input

	ToMonitoredServiceArrayOutput() MonitoredServiceArrayOutput
	ToMonitoredServiceArrayOutputWithContext(context.Context) MonitoredServiceArrayOutput
}

type MonitoredServiceArray []MonitoredServiceInput

func (MonitoredServiceArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*MonitoredService)(nil)).Elem()
}

func (i MonitoredServiceArray) ToMonitoredServiceArrayOutput() MonitoredServiceArrayOutput {
	return i.ToMonitoredServiceArrayOutputWithContext(context.Background())
}

func (i MonitoredServiceArray) ToMonitoredServiceArrayOutputWithContext(ctx context.Context) MonitoredServiceArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(MonitoredServiceArrayOutput)
}

// MonitoredServiceMapInput is an input type that accepts MonitoredServiceMap and MonitoredServiceMapOutput values.
// You can construct a concrete instance of `MonitoredServiceMapInput` via:
//
//	MonitoredServiceMap{ "key": MonitoredServiceArgs{...} }
type MonitoredServiceMapInput interface {
	pulumi.Input

	ToMonitoredServiceMapOutput() MonitoredServiceMapOutput
	ToMonitoredServiceMapOutputWithContext(context.Context) MonitoredServiceMapOutput
}

type MonitoredServiceMap map[string]MonitoredServiceInput

func (MonitoredServiceMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*MonitoredService)(nil)).Elem()
}

func (i MonitoredServiceMap) ToMonitoredServiceMapOutput() MonitoredServiceMapOutput {
	return i.ToMonitoredServiceMapOutputWithContext(context.Background())
}

func (i MonitoredServiceMap) ToMonitoredServiceMapOutputWithContext(ctx context.Context) MonitoredServiceMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(MonitoredServiceMapOutput)
}

type MonitoredServiceOutput struct{ *pulumi.OutputState }

func (MonitoredServiceOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**MonitoredService)(nil)).Elem()
}

func (o MonitoredServiceOutput) ToMonitoredServiceOutput() MonitoredServiceOutput {
	return o
}

func (o MonitoredServiceOutput) ToMonitoredServiceOutputWithContext(ctx context.Context) MonitoredServiceOutput {
	return o
}

// Identifier of the monitored service.
func (o MonitoredServiceOutput) Identifier() pulumi.StringOutput {
	return o.ApplyT(func(v *MonitoredService) pulumi.StringOutput { return v.Identifier }).(pulumi.StringOutput)
}

// Identifier of the organization in which the monitored service is configured.
func (o MonitoredServiceOutput) OrgId() pulumi.StringOutput {
	return o.ApplyT(func(v *MonitoredService) pulumi.StringOutput { return v.OrgId }).(pulumi.StringOutput)
}

// Identifier of the project in which the monitored service is configured.
func (o MonitoredServiceOutput) ProjectId() pulumi.StringOutput {
	return o.ApplyT(func(v *MonitoredService) pulumi.StringOutput { return v.ProjectId }).(pulumi.StringOutput)
}

// Request for creating or updating a monitored service.
func (o MonitoredServiceOutput) Request() MonitoredServiceRequestPtrOutput {
	return o.ApplyT(func(v *MonitoredService) MonitoredServiceRequestPtrOutput { return v.Request }).(MonitoredServiceRequestPtrOutput)
}

type MonitoredServiceArrayOutput struct{ *pulumi.OutputState }

func (MonitoredServiceArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*MonitoredService)(nil)).Elem()
}

func (o MonitoredServiceArrayOutput) ToMonitoredServiceArrayOutput() MonitoredServiceArrayOutput {
	return o
}

func (o MonitoredServiceArrayOutput) ToMonitoredServiceArrayOutputWithContext(ctx context.Context) MonitoredServiceArrayOutput {
	return o
}

func (o MonitoredServiceArrayOutput) Index(i pulumi.IntInput) MonitoredServiceOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *MonitoredService {
		return vs[0].([]*MonitoredService)[vs[1].(int)]
	}).(MonitoredServiceOutput)
}

type MonitoredServiceMapOutput struct{ *pulumi.OutputState }

func (MonitoredServiceMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*MonitoredService)(nil)).Elem()
}

func (o MonitoredServiceMapOutput) ToMonitoredServiceMapOutput() MonitoredServiceMapOutput {
	return o
}

func (o MonitoredServiceMapOutput) ToMonitoredServiceMapOutputWithContext(ctx context.Context) MonitoredServiceMapOutput {
	return o
}

func (o MonitoredServiceMapOutput) MapIndex(k pulumi.StringInput) MonitoredServiceOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *MonitoredService {
		return vs[0].(map[string]*MonitoredService)[vs[1].(string)]
	}).(MonitoredServiceOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*MonitoredServiceInput)(nil)).Elem(), &MonitoredService{})
	pulumi.RegisterInputType(reflect.TypeOf((*MonitoredServiceArrayInput)(nil)).Elem(), MonitoredServiceArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*MonitoredServiceMapInput)(nil)).Elem(), MonitoredServiceMap{})
	pulumi.RegisterOutputType(MonitoredServiceOutput{})
	pulumi.RegisterOutputType(MonitoredServiceArrayOutput{})
	pulumi.RegisterOutputType(MonitoredServiceMapOutput{})
}
