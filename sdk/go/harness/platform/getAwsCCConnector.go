// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package platform

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-harness/sdk/go/harness/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Datasource for looking up an AWS Cloud Cost connector.
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
//			_, err := platform.LookupAwsCCConnector(ctx, &platform.LookupAwsCCConnectorArgs{
//				Identifier: "identifier",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func LookupAwsCCConnector(ctx *pulumi.Context, args *LookupAwsCCConnectorArgs, opts ...pulumi.InvokeOption) (*LookupAwsCCConnectorResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupAwsCCConnectorResult
	err := ctx.Invoke("harness:platform/getAwsCCConnector:getAwsCCConnector", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getAwsCCConnector.
type LookupAwsCCConnectorArgs struct {
	// Unique identifier of the resource.
	Identifier string `pulumi:"identifier"`
	// Name of the resource.
	Name *string `pulumi:"name"`
	// Unique identifier of the organization.
	OrgId *string `pulumi:"orgId"`
	// Unique identifier of the project.
	ProjectId *string `pulumi:"projectId"`
}

// A collection of values returned by getAwsCCConnector.
type LookupAwsCCConnectorResult struct {
	// The AWS account id.
	AccountId string `pulumi:"accountId"`
	// Harness uses the secure cross-account role to access your AWS account. The role includes a restricted policy to access the cost and usage reports and resources for the sole purpose of cost analysis and cost optimization.
	CrossAccountAccesses []GetAwsCCConnectorCrossAccountAccess `pulumi:"crossAccountAccesses"`
	// Description of the resource.
	Description string `pulumi:"description"`
	// The features enabled for the connector. Valid values are BILLING, OPTIMIZATION, VISIBILITY, GOVERNANCE.
	FeaturesEnableds []string `pulumi:"featuresEnableds"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// Unique identifier of the resource.
	Identifier string `pulumi:"identifier"`
	// Name of the resource.
	Name *string `pulumi:"name"`
	// Unique identifier of the organization.
	OrgId *string `pulumi:"orgId"`
	// Unique identifier of the project.
	ProjectId *string `pulumi:"projectId"`
	// The cost and usage report name. Provided in the delivery options when the template is opened in the AWS console.
	ReportName string `pulumi:"reportName"`
	// The name of s3 bucket.
	S3Bucket string `pulumi:"s3Bucket"`
	// Tags to associate with the resource.
	Tags []string `pulumi:"tags"`
}

func LookupAwsCCConnectorOutput(ctx *pulumi.Context, args LookupAwsCCConnectorOutputArgs, opts ...pulumi.InvokeOption) LookupAwsCCConnectorResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (LookupAwsCCConnectorResultOutput, error) {
			args := v.(LookupAwsCCConnectorArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("harness:platform/getAwsCCConnector:getAwsCCConnector", args, LookupAwsCCConnectorResultOutput{}, options).(LookupAwsCCConnectorResultOutput), nil
		}).(LookupAwsCCConnectorResultOutput)
}

// A collection of arguments for invoking getAwsCCConnector.
type LookupAwsCCConnectorOutputArgs struct {
	// Unique identifier of the resource.
	Identifier pulumi.StringInput `pulumi:"identifier"`
	// Name of the resource.
	Name pulumi.StringPtrInput `pulumi:"name"`
	// Unique identifier of the organization.
	OrgId pulumi.StringPtrInput `pulumi:"orgId"`
	// Unique identifier of the project.
	ProjectId pulumi.StringPtrInput `pulumi:"projectId"`
}

func (LookupAwsCCConnectorOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupAwsCCConnectorArgs)(nil)).Elem()
}

// A collection of values returned by getAwsCCConnector.
type LookupAwsCCConnectorResultOutput struct{ *pulumi.OutputState }

func (LookupAwsCCConnectorResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupAwsCCConnectorResult)(nil)).Elem()
}

func (o LookupAwsCCConnectorResultOutput) ToLookupAwsCCConnectorResultOutput() LookupAwsCCConnectorResultOutput {
	return o
}

func (o LookupAwsCCConnectorResultOutput) ToLookupAwsCCConnectorResultOutputWithContext(ctx context.Context) LookupAwsCCConnectorResultOutput {
	return o
}

// The AWS account id.
func (o LookupAwsCCConnectorResultOutput) AccountId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupAwsCCConnectorResult) string { return v.AccountId }).(pulumi.StringOutput)
}

// Harness uses the secure cross-account role to access your AWS account. The role includes a restricted policy to access the cost and usage reports and resources for the sole purpose of cost analysis and cost optimization.
func (o LookupAwsCCConnectorResultOutput) CrossAccountAccesses() GetAwsCCConnectorCrossAccountAccessArrayOutput {
	return o.ApplyT(func(v LookupAwsCCConnectorResult) []GetAwsCCConnectorCrossAccountAccess {
		return v.CrossAccountAccesses
	}).(GetAwsCCConnectorCrossAccountAccessArrayOutput)
}

// Description of the resource.
func (o LookupAwsCCConnectorResultOutput) Description() pulumi.StringOutput {
	return o.ApplyT(func(v LookupAwsCCConnectorResult) string { return v.Description }).(pulumi.StringOutput)
}

// The features enabled for the connector. Valid values are BILLING, OPTIMIZATION, VISIBILITY, GOVERNANCE.
func (o LookupAwsCCConnectorResultOutput) FeaturesEnableds() pulumi.StringArrayOutput {
	return o.ApplyT(func(v LookupAwsCCConnectorResult) []string { return v.FeaturesEnableds }).(pulumi.StringArrayOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupAwsCCConnectorResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupAwsCCConnectorResult) string { return v.Id }).(pulumi.StringOutput)
}

// Unique identifier of the resource.
func (o LookupAwsCCConnectorResultOutput) Identifier() pulumi.StringOutput {
	return o.ApplyT(func(v LookupAwsCCConnectorResult) string { return v.Identifier }).(pulumi.StringOutput)
}

// Name of the resource.
func (o LookupAwsCCConnectorResultOutput) Name() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupAwsCCConnectorResult) *string { return v.Name }).(pulumi.StringPtrOutput)
}

// Unique identifier of the organization.
func (o LookupAwsCCConnectorResultOutput) OrgId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupAwsCCConnectorResult) *string { return v.OrgId }).(pulumi.StringPtrOutput)
}

// Unique identifier of the project.
func (o LookupAwsCCConnectorResultOutput) ProjectId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupAwsCCConnectorResult) *string { return v.ProjectId }).(pulumi.StringPtrOutput)
}

// The cost and usage report name. Provided in the delivery options when the template is opened in the AWS console.
func (o LookupAwsCCConnectorResultOutput) ReportName() pulumi.StringOutput {
	return o.ApplyT(func(v LookupAwsCCConnectorResult) string { return v.ReportName }).(pulumi.StringOutput)
}

// The name of s3 bucket.
func (o LookupAwsCCConnectorResultOutput) S3Bucket() pulumi.StringOutput {
	return o.ApplyT(func(v LookupAwsCCConnectorResult) string { return v.S3Bucket }).(pulumi.StringOutput)
}

// Tags to associate with the resource.
func (o LookupAwsCCConnectorResultOutput) Tags() pulumi.StringArrayOutput {
	return o.ApplyT(func(v LookupAwsCCConnectorResult) []string { return v.Tags }).(pulumi.StringArrayOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupAwsCCConnectorResultOutput{})
}
