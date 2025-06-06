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

// Resource for creating a Harness service override V2.
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
//			_, err := platform.NewServiceOverridesV2(ctx, "test", &platform.ServiceOverridesV2Args{
//				OrgId:     pulumi.String("orgIdentifier"),
//				ProjectId: pulumi.String("projectIdentifier"),
//				EnvId:     pulumi.String("environmentIdentifier"),
//				ServiceId: pulumi.String("serviceIdentifier"),
//				InfraId:   pulumi.String("infraIdentifier"),
//				Type:      pulumi.String("INFRA_SERVICE_OVERRIDE"),
//				Yaml: pulumi.String(`variables:
//	  - name: var1
//	    type: String
//	    value: val1
//
// configFiles:
//   - configFile:
//     identifier: sampleConfigFile
//     spec:
//     store:
//     type: Harness
//     spec:
//     files:
//   - account:/configFile1
//
// manifests:
//   - manifest:
//     identifier: sampleManifestFile
//     type: Values
//     spec:
//     store:
//     type: Harness
//     spec:
//     files:
//   - account:/manifestFile1
//
// `),
//
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
// ### Creating Remote Service Override
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
//			_, err := platform.NewServiceOverridesV2(ctx, "test", &platform.ServiceOverridesV2Args{
//				OrgId:     pulumi.String("orgIdentifier"),
//				ProjectId: pulumi.String("projectIdentifier"),
//				EnvId:     pulumi.String("environmentIdentifier"),
//				ServiceId: pulumi.String("serviceIdentifier"),
//				InfraId:   pulumi.String("infraIdentifier"),
//				Type:      pulumi.String("INFRA_SERVICE_OVERRIDE"),
//				GitDetails: &platform.ServiceOverridesV2GitDetailsArgs{
//					StoreType:    pulumi.String("REMOTE"),
//					ConnectorRef: pulumi.String("connector_ref"),
//					RepoName:     pulumi.String("repo_name"),
//					FilePath:     pulumi.String("file_path"),
//					Branch:       pulumi.String("branch"),
//				},
//				Yaml: pulumi.String(`variables:
//	  - name: v1
//	    type: String
//	    value: val1
//
// manifests:
//   - manifest:
//     identifier: manifest1
//     type: Values
//     spec:
//     store:
//     type: Github
//     spec:
//     connectorRef: "<+input>"
//     gitFetchType: Branch
//     paths:
//   - path-updated
//     repoName: "<+input>"
//     branch: master
//     skipResourceVersioning: false
//
// `),
//
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
// ### Importing Service Override From Git
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
//			_, err := platform.NewServiceOverridesV2(ctx, "test", &platform.ServiceOverridesV2Args{
//				OrgId:         pulumi.String("orgIdentifier"),
//				ProjectId:     pulumi.String("projectIdentifier"),
//				EnvId:         pulumi.String("environmentIdentifier"),
//				ServiceId:     pulumi.String("serviceIdentifier"),
//				InfraId:       pulumi.String("infraIdentifier"),
//				Type:          pulumi.String("INFRA_SERVICE_OVERRIDE"),
//				ImportFromGit: pulumi.Bool(true),
//				GitDetails: &platform.ServiceOverridesV2GitDetailsArgs{
//					StoreType:    pulumi.String("REMOTE"),
//					ConnectorRef: pulumi.String("connector_ref"),
//					RepoName:     pulumi.String("repo_name"),
//					FilePath:     pulumi.String("file_path"),
//					Branch:       pulumi.String("branch"),
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
// # Import account level service override
//
// ```sh
// $ pulumi import harness:platform/serviceOverridesV2:ServiceOverridesV2 example <override_id>
// ```
//
// # Import org level service override
//
// ```sh
// $ pulumi import harness:platform/serviceOverridesV2:ServiceOverridesV2 example <org_id>/<override_id>
// ```
//
// # Import project level service override
//
// ```sh
// $ pulumi import harness:platform/serviceOverridesV2:ServiceOverridesV2 example <org_id>/<project_id>/<override_id>
// ```
type ServiceOverridesV2 struct {
	pulumi.CustomResourceState

	// The cluster ID to which the overrides are associated.
	ClusterId pulumi.StringOutput `pulumi:"clusterId"`
	// The environment ID to which the overrides are associated.
	EnvId pulumi.StringOutput `pulumi:"envId"`
	// Contains parameters related to creating an Entity for Git Experience.
	GitDetails ServiceOverridesV2GitDetailsOutput `pulumi:"gitDetails"`
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
	// The yaml of the overrides spec object.
	Yaml pulumi.StringOutput `pulumi:"yaml"`
}

// NewServiceOverridesV2 registers a new resource with the given unique name, arguments, and options.
func NewServiceOverridesV2(ctx *pulumi.Context,
	name string, args *ServiceOverridesV2Args, opts ...pulumi.ResourceOption) (*ServiceOverridesV2, error) {
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
	var resource ServiceOverridesV2
	err := ctx.RegisterResource("harness:platform/serviceOverridesV2:ServiceOverridesV2", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetServiceOverridesV2 gets an existing ServiceOverridesV2 resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetServiceOverridesV2(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ServiceOverridesV2State, opts ...pulumi.ResourceOption) (*ServiceOverridesV2, error) {
	var resource ServiceOverridesV2
	err := ctx.ReadResource("harness:platform/serviceOverridesV2:ServiceOverridesV2", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering ServiceOverridesV2 resources.
type serviceOverridesV2State struct {
	// The cluster ID to which the overrides are associated.
	ClusterId *string `pulumi:"clusterId"`
	// The environment ID to which the overrides are associated.
	EnvId *string `pulumi:"envId"`
	// Contains parameters related to creating an Entity for Git Experience.
	GitDetails *ServiceOverridesV2GitDetails `pulumi:"gitDetails"`
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
	// The yaml of the overrides spec object.
	Yaml *string `pulumi:"yaml"`
}

type ServiceOverridesV2State struct {
	// The cluster ID to which the overrides are associated.
	ClusterId pulumi.StringPtrInput
	// The environment ID to which the overrides are associated.
	EnvId pulumi.StringPtrInput
	// Contains parameters related to creating an Entity for Git Experience.
	GitDetails ServiceOverridesV2GitDetailsPtrInput
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
	// The yaml of the overrides spec object.
	Yaml pulumi.StringPtrInput
}

func (ServiceOverridesV2State) ElementType() reflect.Type {
	return reflect.TypeOf((*serviceOverridesV2State)(nil)).Elem()
}

type serviceOverridesV2Args struct {
	// The cluster ID to which the overrides are associated.
	ClusterId *string `pulumi:"clusterId"`
	// The environment ID to which the overrides are associated.
	EnvId string `pulumi:"envId"`
	// Contains parameters related to creating an Entity for Git Experience.
	GitDetails *ServiceOverridesV2GitDetails `pulumi:"gitDetails"`
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
	// The yaml of the overrides spec object.
	Yaml *string `pulumi:"yaml"`
}

// The set of arguments for constructing a ServiceOverridesV2 resource.
type ServiceOverridesV2Args struct {
	// The cluster ID to which the overrides are associated.
	ClusterId pulumi.StringPtrInput
	// The environment ID to which the overrides are associated.
	EnvId pulumi.StringInput
	// Contains parameters related to creating an Entity for Git Experience.
	GitDetails ServiceOverridesV2GitDetailsPtrInput
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
	// The yaml of the overrides spec object.
	Yaml pulumi.StringPtrInput
}

func (ServiceOverridesV2Args) ElementType() reflect.Type {
	return reflect.TypeOf((*serviceOverridesV2Args)(nil)).Elem()
}

type ServiceOverridesV2Input interface {
	pulumi.Input

	ToServiceOverridesV2Output() ServiceOverridesV2Output
	ToServiceOverridesV2OutputWithContext(ctx context.Context) ServiceOverridesV2Output
}

func (*ServiceOverridesV2) ElementType() reflect.Type {
	return reflect.TypeOf((**ServiceOverridesV2)(nil)).Elem()
}

func (i *ServiceOverridesV2) ToServiceOverridesV2Output() ServiceOverridesV2Output {
	return i.ToServiceOverridesV2OutputWithContext(context.Background())
}

func (i *ServiceOverridesV2) ToServiceOverridesV2OutputWithContext(ctx context.Context) ServiceOverridesV2Output {
	return pulumi.ToOutputWithContext(ctx, i).(ServiceOverridesV2Output)
}

// ServiceOverridesV2ArrayInput is an input type that accepts ServiceOverridesV2Array and ServiceOverridesV2ArrayOutput values.
// You can construct a concrete instance of `ServiceOverridesV2ArrayInput` via:
//
//	ServiceOverridesV2Array{ ServiceOverridesV2Args{...} }
type ServiceOverridesV2ArrayInput interface {
	pulumi.Input

	ToServiceOverridesV2ArrayOutput() ServiceOverridesV2ArrayOutput
	ToServiceOverridesV2ArrayOutputWithContext(context.Context) ServiceOverridesV2ArrayOutput
}

type ServiceOverridesV2Array []ServiceOverridesV2Input

func (ServiceOverridesV2Array) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ServiceOverridesV2)(nil)).Elem()
}

func (i ServiceOverridesV2Array) ToServiceOverridesV2ArrayOutput() ServiceOverridesV2ArrayOutput {
	return i.ToServiceOverridesV2ArrayOutputWithContext(context.Background())
}

func (i ServiceOverridesV2Array) ToServiceOverridesV2ArrayOutputWithContext(ctx context.Context) ServiceOverridesV2ArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ServiceOverridesV2ArrayOutput)
}

// ServiceOverridesV2MapInput is an input type that accepts ServiceOverridesV2Map and ServiceOverridesV2MapOutput values.
// You can construct a concrete instance of `ServiceOverridesV2MapInput` via:
//
//	ServiceOverridesV2Map{ "key": ServiceOverridesV2Args{...} }
type ServiceOverridesV2MapInput interface {
	pulumi.Input

	ToServiceOverridesV2MapOutput() ServiceOverridesV2MapOutput
	ToServiceOverridesV2MapOutputWithContext(context.Context) ServiceOverridesV2MapOutput
}

type ServiceOverridesV2Map map[string]ServiceOverridesV2Input

func (ServiceOverridesV2Map) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ServiceOverridesV2)(nil)).Elem()
}

func (i ServiceOverridesV2Map) ToServiceOverridesV2MapOutput() ServiceOverridesV2MapOutput {
	return i.ToServiceOverridesV2MapOutputWithContext(context.Background())
}

func (i ServiceOverridesV2Map) ToServiceOverridesV2MapOutputWithContext(ctx context.Context) ServiceOverridesV2MapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ServiceOverridesV2MapOutput)
}

type ServiceOverridesV2Output struct{ *pulumi.OutputState }

func (ServiceOverridesV2Output) ElementType() reflect.Type {
	return reflect.TypeOf((**ServiceOverridesV2)(nil)).Elem()
}

func (o ServiceOverridesV2Output) ToServiceOverridesV2Output() ServiceOverridesV2Output {
	return o
}

func (o ServiceOverridesV2Output) ToServiceOverridesV2OutputWithContext(ctx context.Context) ServiceOverridesV2Output {
	return o
}

// The cluster ID to which the overrides are associated.
func (o ServiceOverridesV2Output) ClusterId() pulumi.StringOutput {
	return o.ApplyT(func(v *ServiceOverridesV2) pulumi.StringOutput { return v.ClusterId }).(pulumi.StringOutput)
}

// The environment ID to which the overrides are associated.
func (o ServiceOverridesV2Output) EnvId() pulumi.StringOutput {
	return o.ApplyT(func(v *ServiceOverridesV2) pulumi.StringOutput { return v.EnvId }).(pulumi.StringOutput)
}

// Contains parameters related to creating an Entity for Git Experience.
func (o ServiceOverridesV2Output) GitDetails() ServiceOverridesV2GitDetailsOutput {
	return o.ApplyT(func(v *ServiceOverridesV2) ServiceOverridesV2GitDetailsOutput { return v.GitDetails }).(ServiceOverridesV2GitDetailsOutput)
}

// The identifier of the override entity.
func (o ServiceOverridesV2Output) Identifier() pulumi.StringOutput {
	return o.ApplyT(func(v *ServiceOverridesV2) pulumi.StringOutput { return v.Identifier }).(pulumi.StringOutput)
}

// import override from git
func (o ServiceOverridesV2Output) ImportFromGit() pulumi.BoolOutput {
	return o.ApplyT(func(v *ServiceOverridesV2) pulumi.BoolOutput { return v.ImportFromGit }).(pulumi.BoolOutput)
}

// The infrastructure ID to which the overrides are associated.
func (o ServiceOverridesV2Output) InfraId() pulumi.StringOutput {
	return o.ApplyT(func(v *ServiceOverridesV2) pulumi.StringOutput { return v.InfraId }).(pulumi.StringOutput)
}

// force import override from remote even if same file path already exist
func (o ServiceOverridesV2Output) IsForceImport() pulumi.BoolOutput {
	return o.ApplyT(func(v *ServiceOverridesV2) pulumi.BoolOutput { return v.IsForceImport }).(pulumi.BoolOutput)
}

// Unique identifier of the organization.
func (o ServiceOverridesV2Output) OrgId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ServiceOverridesV2) pulumi.StringPtrOutput { return v.OrgId }).(pulumi.StringPtrOutput)
}

// Unique identifier of the project.
func (o ServiceOverridesV2Output) ProjectId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ServiceOverridesV2) pulumi.StringPtrOutput { return v.ProjectId }).(pulumi.StringPtrOutput)
}

// The service ID to which the overrides applies.
func (o ServiceOverridesV2Output) ServiceId() pulumi.StringOutput {
	return o.ApplyT(func(v *ServiceOverridesV2) pulumi.StringOutput { return v.ServiceId }).(pulumi.StringOutput)
}

// The type of the overrides.
func (o ServiceOverridesV2Output) Type() pulumi.StringOutput {
	return o.ApplyT(func(v *ServiceOverridesV2) pulumi.StringOutput { return v.Type }).(pulumi.StringOutput)
}

// The yaml of the overrides spec object.
func (o ServiceOverridesV2Output) Yaml() pulumi.StringOutput {
	return o.ApplyT(func(v *ServiceOverridesV2) pulumi.StringOutput { return v.Yaml }).(pulumi.StringOutput)
}

type ServiceOverridesV2ArrayOutput struct{ *pulumi.OutputState }

func (ServiceOverridesV2ArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ServiceOverridesV2)(nil)).Elem()
}

func (o ServiceOverridesV2ArrayOutput) ToServiceOverridesV2ArrayOutput() ServiceOverridesV2ArrayOutput {
	return o
}

func (o ServiceOverridesV2ArrayOutput) ToServiceOverridesV2ArrayOutputWithContext(ctx context.Context) ServiceOverridesV2ArrayOutput {
	return o
}

func (o ServiceOverridesV2ArrayOutput) Index(i pulumi.IntInput) ServiceOverridesV2Output {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *ServiceOverridesV2 {
		return vs[0].([]*ServiceOverridesV2)[vs[1].(int)]
	}).(ServiceOverridesV2Output)
}

type ServiceOverridesV2MapOutput struct{ *pulumi.OutputState }

func (ServiceOverridesV2MapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ServiceOverridesV2)(nil)).Elem()
}

func (o ServiceOverridesV2MapOutput) ToServiceOverridesV2MapOutput() ServiceOverridesV2MapOutput {
	return o
}

func (o ServiceOverridesV2MapOutput) ToServiceOverridesV2MapOutputWithContext(ctx context.Context) ServiceOverridesV2MapOutput {
	return o
}

func (o ServiceOverridesV2MapOutput) MapIndex(k pulumi.StringInput) ServiceOverridesV2Output {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *ServiceOverridesV2 {
		return vs[0].(map[string]*ServiceOverridesV2)[vs[1].(string)]
	}).(ServiceOverridesV2Output)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ServiceOverridesV2Input)(nil)).Elem(), &ServiceOverridesV2{})
	pulumi.RegisterInputType(reflect.TypeOf((*ServiceOverridesV2ArrayInput)(nil)).Elem(), ServiceOverridesV2Array{})
	pulumi.RegisterInputType(reflect.TypeOf((*ServiceOverridesV2MapInput)(nil)).Elem(), ServiceOverridesV2Map{})
	pulumi.RegisterOutputType(ServiceOverridesV2Output{})
	pulumi.RegisterOutputType(ServiceOverridesV2ArrayOutput{})
	pulumi.RegisterOutputType(ServiceOverridesV2MapOutput{})
}
