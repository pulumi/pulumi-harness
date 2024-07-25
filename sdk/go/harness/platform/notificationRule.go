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

// Resource for creating a Notification Rule.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"encoding/json"
//
//	"github.com/pulumi/pulumi-harness/sdk/go/harness/platform"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			tmpJSON0, err := json.Marshal(map[string]interface{}{
//				"webhook_url": "http://myslackwebhookurl.com",
//				"user_groups": []string{
//					"account.test",
//				},
//			})
//			if err != nil {
//				return err
//			}
//			json0 := string(tmpJSON0)
//			tmpJSON1, err := json.Marshal(map[string]interface{}{
//				"threshold": 1,
//			})
//			if err != nil {
//				return err
//			}
//			json1 := string(tmpJSON1)
//			tmpJSON2, err := json.Marshal(map[string]interface{}{
//				"threshold": 30,
//			})
//			if err != nil {
//				return err
//			}
//			json2 := string(tmpJSON2)
//			tmpJSON3, err := json.Marshal(map[string]interface{}{
//				"threshold": 300,
//			})
//			if err != nil {
//				return err
//			}
//			json3 := string(tmpJSON3)
//			// Sample resource for SLO
//			_, err = platform.NewNotificationRule(ctx, "example", &platform.NotificationRuleArgs{
//				OrgId:      pulumi.String("org_id"),
//				ProjectId:  pulumi.String("project_id"),
//				Identifier: pulumi.String("identifier"),
//				Request: &platform.NotificationRuleRequestArgs{
//					Name: pulumi.String("name"),
//					NotificationMethod: &platform.NotificationRuleRequestNotificationMethodArgs{
//						Type: pulumi.String("Slack"),
//						Spec: pulumi.String(json0),
//					},
//					Type: pulumi.String("ServiceLevelObjective"),
//					Conditions: platform.NotificationRuleRequestConditionArray{
//						&platform.NotificationRuleRequestConditionArgs{
//							Type: pulumi.String("ErrorBudgetBurnRate"),
//							Spec: pulumi.String(json1),
//						},
//						&platform.NotificationRuleRequestConditionArgs{
//							Type: pulumi.String("ErrorBudgetRemainingPercentage"),
//							Spec: pulumi.String(json2),
//						},
//						&platform.NotificationRuleRequestConditionArgs{
//							Type: pulumi.String("ErrorBudgetRemainingMinutes"),
//							Spec: pulumi.String(json3),
//						},
//					},
//				},
//			})
//			if err != nil {
//				return err
//			}
//			tmpJSON4, err := json.Marshal(map[string]interface{}{
//				"webhook_url": "http://myslackwebhookurl.com",
//				"user_groups": []string{
//					"account.test",
//				},
//			})
//			if err != nil {
//				return err
//			}
//			json4 := string(tmpJSON4)
//			tmpJSON5, err := json.Marshal(map[string]interface{}{
//				"threshold": 33,
//				"period":    "30m",
//				"changeCategories": []string{
//					"Deployment",
//					"Infrastructure",
//				},
//			})
//			if err != nil {
//				return err
//			}
//			json5 := string(tmpJSON5)
//			tmpJSON6, err := json.Marshal(map[string]interface{}{
//				"threshold": 33,
//				"period":    "30m",
//			})
//			if err != nil {
//				return err
//			}
//			json6 := string(tmpJSON6)
//			tmpJSON7, err := json.Marshal(map[string]interface{}{
//				"changeCategories": []string{
//					"Deployment",
//					"Alert",
//					"ChaosExperiment",
//				},
//			})
//			if err != nil {
//				return err
//			}
//			json7 := string(tmpJSON7)
//			tmpJSON8, err := json.Marshal(nil)
//			if err != nil {
//				return err
//			}
//			json8 := string(tmpJSON8)
//			// Sample resource for Monitored Service
//			_, err = platform.NewNotificationRule(ctx, "example1", &platform.NotificationRuleArgs{
//				OrgId:      pulumi.String("org_id"),
//				ProjectId:  pulumi.String("project_id"),
//				Identifier: pulumi.String("identifier"),
//				Request: &platform.NotificationRuleRequestArgs{
//					Name: pulumi.String("name"),
//					NotificationMethod: &platform.NotificationRuleRequestNotificationMethodArgs{
//						Type: pulumi.String("Slack"),
//						Spec: pulumi.String(json4),
//					},
//					Type: pulumi.String("MonitoredService"),
//					Conditions: platform.NotificationRuleRequestConditionArray{
//						&platform.NotificationRuleRequestConditionArgs{
//							Type: pulumi.String("ChangeImpact"),
//							Spec: pulumi.String(json5),
//						},
//						&platform.NotificationRuleRequestConditionArgs{
//							Type: pulumi.String("HealthScore"),
//							Spec: pulumi.String(json6),
//						},
//						&platform.NotificationRuleRequestConditionArgs{
//							Type: pulumi.String("ChangeObserved"),
//							Spec: pulumi.String(json7),
//						},
//						&platform.NotificationRuleRequestConditionArgs{
//							Type: pulumi.String("DeploymentImpactReport"),
//							Spec: pulumi.String(json8),
//						},
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
// # Import account level Notification Rule
//
// ```sh
// $ pulumi import harness:platform/notificationRule:NotificationRule example <notification_rule_id>
// ```
//
// # Import organization level Notification Rule
//
// ```sh
// $ pulumi import harness:platform/notificationRule:NotificationRule example <org_id>/<notification_rule_id>
// ```
//
// # Import project level Notification Rule
//
// ```sh
// $ pulumi import harness:platform/notificationRule:NotificationRule example <org_id>/<project_id>/<notification_rule_id>
// ```
type NotificationRule struct {
	pulumi.CustomResourceState

	// Identifier of the Notification Rule.
	Identifier pulumi.StringOutput `pulumi:"identifier"`
	// Identifier of the organization in which the Notification Rule is configured.
	OrgId pulumi.StringOutput `pulumi:"orgId"`
	// Identifier of the project in which the Notification Rule is configured.
	ProjectId pulumi.StringOutput `pulumi:"projectId"`
	// Request for creating or updating Notification Rule.
	Request NotificationRuleRequestPtrOutput `pulumi:"request"`
}

// NewNotificationRule registers a new resource with the given unique name, arguments, and options.
func NewNotificationRule(ctx *pulumi.Context,
	name string, args *NotificationRuleArgs, opts ...pulumi.ResourceOption) (*NotificationRule, error) {
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
	var resource NotificationRule
	err := ctx.RegisterResource("harness:platform/notificationRule:NotificationRule", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetNotificationRule gets an existing NotificationRule resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetNotificationRule(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *NotificationRuleState, opts ...pulumi.ResourceOption) (*NotificationRule, error) {
	var resource NotificationRule
	err := ctx.ReadResource("harness:platform/notificationRule:NotificationRule", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering NotificationRule resources.
type notificationRuleState struct {
	// Identifier of the Notification Rule.
	Identifier *string `pulumi:"identifier"`
	// Identifier of the organization in which the Notification Rule is configured.
	OrgId *string `pulumi:"orgId"`
	// Identifier of the project in which the Notification Rule is configured.
	ProjectId *string `pulumi:"projectId"`
	// Request for creating or updating Notification Rule.
	Request *NotificationRuleRequest `pulumi:"request"`
}

type NotificationRuleState struct {
	// Identifier of the Notification Rule.
	Identifier pulumi.StringPtrInput
	// Identifier of the organization in which the Notification Rule is configured.
	OrgId pulumi.StringPtrInput
	// Identifier of the project in which the Notification Rule is configured.
	ProjectId pulumi.StringPtrInput
	// Request for creating or updating Notification Rule.
	Request NotificationRuleRequestPtrInput
}

func (NotificationRuleState) ElementType() reflect.Type {
	return reflect.TypeOf((*notificationRuleState)(nil)).Elem()
}

type notificationRuleArgs struct {
	// Identifier of the Notification Rule.
	Identifier string `pulumi:"identifier"`
	// Identifier of the organization in which the Notification Rule is configured.
	OrgId string `pulumi:"orgId"`
	// Identifier of the project in which the Notification Rule is configured.
	ProjectId string `pulumi:"projectId"`
	// Request for creating or updating Notification Rule.
	Request *NotificationRuleRequest `pulumi:"request"`
}

// The set of arguments for constructing a NotificationRule resource.
type NotificationRuleArgs struct {
	// Identifier of the Notification Rule.
	Identifier pulumi.StringInput
	// Identifier of the organization in which the Notification Rule is configured.
	OrgId pulumi.StringInput
	// Identifier of the project in which the Notification Rule is configured.
	ProjectId pulumi.StringInput
	// Request for creating or updating Notification Rule.
	Request NotificationRuleRequestPtrInput
}

func (NotificationRuleArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*notificationRuleArgs)(nil)).Elem()
}

type NotificationRuleInput interface {
	pulumi.Input

	ToNotificationRuleOutput() NotificationRuleOutput
	ToNotificationRuleOutputWithContext(ctx context.Context) NotificationRuleOutput
}

func (*NotificationRule) ElementType() reflect.Type {
	return reflect.TypeOf((**NotificationRule)(nil)).Elem()
}

func (i *NotificationRule) ToNotificationRuleOutput() NotificationRuleOutput {
	return i.ToNotificationRuleOutputWithContext(context.Background())
}

func (i *NotificationRule) ToNotificationRuleOutputWithContext(ctx context.Context) NotificationRuleOutput {
	return pulumi.ToOutputWithContext(ctx, i).(NotificationRuleOutput)
}

// NotificationRuleArrayInput is an input type that accepts NotificationRuleArray and NotificationRuleArrayOutput values.
// You can construct a concrete instance of `NotificationRuleArrayInput` via:
//
//	NotificationRuleArray{ NotificationRuleArgs{...} }
type NotificationRuleArrayInput interface {
	pulumi.Input

	ToNotificationRuleArrayOutput() NotificationRuleArrayOutput
	ToNotificationRuleArrayOutputWithContext(context.Context) NotificationRuleArrayOutput
}

type NotificationRuleArray []NotificationRuleInput

func (NotificationRuleArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*NotificationRule)(nil)).Elem()
}

func (i NotificationRuleArray) ToNotificationRuleArrayOutput() NotificationRuleArrayOutput {
	return i.ToNotificationRuleArrayOutputWithContext(context.Background())
}

func (i NotificationRuleArray) ToNotificationRuleArrayOutputWithContext(ctx context.Context) NotificationRuleArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(NotificationRuleArrayOutput)
}

// NotificationRuleMapInput is an input type that accepts NotificationRuleMap and NotificationRuleMapOutput values.
// You can construct a concrete instance of `NotificationRuleMapInput` via:
//
//	NotificationRuleMap{ "key": NotificationRuleArgs{...} }
type NotificationRuleMapInput interface {
	pulumi.Input

	ToNotificationRuleMapOutput() NotificationRuleMapOutput
	ToNotificationRuleMapOutputWithContext(context.Context) NotificationRuleMapOutput
}

type NotificationRuleMap map[string]NotificationRuleInput

func (NotificationRuleMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*NotificationRule)(nil)).Elem()
}

func (i NotificationRuleMap) ToNotificationRuleMapOutput() NotificationRuleMapOutput {
	return i.ToNotificationRuleMapOutputWithContext(context.Background())
}

func (i NotificationRuleMap) ToNotificationRuleMapOutputWithContext(ctx context.Context) NotificationRuleMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(NotificationRuleMapOutput)
}

type NotificationRuleOutput struct{ *pulumi.OutputState }

func (NotificationRuleOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**NotificationRule)(nil)).Elem()
}

func (o NotificationRuleOutput) ToNotificationRuleOutput() NotificationRuleOutput {
	return o
}

func (o NotificationRuleOutput) ToNotificationRuleOutputWithContext(ctx context.Context) NotificationRuleOutput {
	return o
}

// Identifier of the Notification Rule.
func (o NotificationRuleOutput) Identifier() pulumi.StringOutput {
	return o.ApplyT(func(v *NotificationRule) pulumi.StringOutput { return v.Identifier }).(pulumi.StringOutput)
}

// Identifier of the organization in which the Notification Rule is configured.
func (o NotificationRuleOutput) OrgId() pulumi.StringOutput {
	return o.ApplyT(func(v *NotificationRule) pulumi.StringOutput { return v.OrgId }).(pulumi.StringOutput)
}

// Identifier of the project in which the Notification Rule is configured.
func (o NotificationRuleOutput) ProjectId() pulumi.StringOutput {
	return o.ApplyT(func(v *NotificationRule) pulumi.StringOutput { return v.ProjectId }).(pulumi.StringOutput)
}

// Request for creating or updating Notification Rule.
func (o NotificationRuleOutput) Request() NotificationRuleRequestPtrOutput {
	return o.ApplyT(func(v *NotificationRule) NotificationRuleRequestPtrOutput { return v.Request }).(NotificationRuleRequestPtrOutput)
}

type NotificationRuleArrayOutput struct{ *pulumi.OutputState }

func (NotificationRuleArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*NotificationRule)(nil)).Elem()
}

func (o NotificationRuleArrayOutput) ToNotificationRuleArrayOutput() NotificationRuleArrayOutput {
	return o
}

func (o NotificationRuleArrayOutput) ToNotificationRuleArrayOutputWithContext(ctx context.Context) NotificationRuleArrayOutput {
	return o
}

func (o NotificationRuleArrayOutput) Index(i pulumi.IntInput) NotificationRuleOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *NotificationRule {
		return vs[0].([]*NotificationRule)[vs[1].(int)]
	}).(NotificationRuleOutput)
}

type NotificationRuleMapOutput struct{ *pulumi.OutputState }

func (NotificationRuleMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*NotificationRule)(nil)).Elem()
}

func (o NotificationRuleMapOutput) ToNotificationRuleMapOutput() NotificationRuleMapOutput {
	return o
}

func (o NotificationRuleMapOutput) ToNotificationRuleMapOutputWithContext(ctx context.Context) NotificationRuleMapOutput {
	return o
}

func (o NotificationRuleMapOutput) MapIndex(k pulumi.StringInput) NotificationRuleOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *NotificationRule {
		return vs[0].(map[string]*NotificationRule)[vs[1].(string)]
	}).(NotificationRuleOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*NotificationRuleInput)(nil)).Elem(), &NotificationRule{})
	pulumi.RegisterInputType(reflect.TypeOf((*NotificationRuleArrayInput)(nil)).Elem(), NotificationRuleArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*NotificationRuleMapInput)(nil)).Elem(), NotificationRuleMap{})
	pulumi.RegisterOutputType(NotificationRuleOutput{})
	pulumi.RegisterOutputType(NotificationRuleArrayOutput{})
	pulumi.RegisterOutputType(NotificationRuleMapOutput{})
}