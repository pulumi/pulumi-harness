// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package platform

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-harness/sdk/go/harness/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Data source for retrieving a Harness repo.
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
//			_, err := platform.LookupRepo(ctx, &platform.LookupRepoArgs{
//				Identifier: "identifier",
//				OrgId:      pulumi.StringRef("org_id"),
//				ProjectId:  pulumi.StringRef("proj_id"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func LookupRepo(ctx *pulumi.Context, args *LookupRepoArgs, opts ...pulumi.InvokeOption) (*LookupRepoResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupRepoResult
	err := ctx.Invoke("harness:platform/getRepo:getRepo", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getRepo.
type LookupRepoArgs struct {
	// Default branch of the repository (Applicate only for create).
	DefaultBranch *string `pulumi:"defaultBranch"`
	// Description of the repository.
	Description *string `pulumi:"description"`
	// Repository should be created with specified predefined gitignore file.
	GitIgnore *string `pulumi:"gitIgnore"`
	// Identifier of the repository.
	Identifier string `pulumi:"identifier"`
	// Repository should be created with specified predefined license file.
	License *string `pulumi:"license"`
	// Unique identifier of the organization.
	OrgId *string `pulumi:"orgId"`
	// Unique identifier of the project.
	ProjectId *string `pulumi:"projectId"`
	// Repository should be created with readme file.
	Readme *bool `pulumi:"readme"`
	// Configuration for importing an existing repository from SCM provider.
	Sources []GetRepoSource `pulumi:"sources"`
}

// A collection of values returned by getRepo.
type LookupRepoResult struct {
	// Timestamp when the repository was created.
	Created int `pulumi:"created"`
	// ID of the user who created the repository.
	CreatedBy int `pulumi:"createdBy"`
	// Default branch of the repository (Applicate only for create).
	DefaultBranch *string `pulumi:"defaultBranch"`
	// Description of the repository.
	Description *string `pulumi:"description"`
	// Repository should be created with specified predefined gitignore file.
	GitIgnore *string `pulumi:"gitIgnore"`
	// Git URL of the repository.
	GitUrl string `pulumi:"gitUrl"`
	// Internal ID of the repository.
	Id string `pulumi:"id"`
	// Identifier of the repository.
	Identifier string `pulumi:"identifier"`
	// Repository should be created with specified predefined license file.
	License *string `pulumi:"license"`
	// Name of the repository.
	Name string `pulumi:"name"`
	// Unique identifier of the organization.
	OrgId *string `pulumi:"orgId"`
	// Path of the repository.
	Path string `pulumi:"path"`
	// Unique identifier of the project.
	ProjectId *string `pulumi:"projectId"`
	// Repository should be created with readme file.
	Readme *bool `pulumi:"readme"`
	// Configuration for importing an existing repository from SCM provider.
	Sources []GetRepoSource `pulumi:"sources"`
	// Timestamp when the repository was last updated.
	Updated int `pulumi:"updated"`
}

func LookupRepoOutput(ctx *pulumi.Context, args LookupRepoOutputArgs, opts ...pulumi.InvokeOption) LookupRepoResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupRepoResult, error) {
			args := v.(LookupRepoArgs)
			r, err := LookupRepo(ctx, &args, opts...)
			var s LookupRepoResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupRepoResultOutput)
}

// A collection of arguments for invoking getRepo.
type LookupRepoOutputArgs struct {
	// Default branch of the repository (Applicate only for create).
	DefaultBranch pulumi.StringPtrInput `pulumi:"defaultBranch"`
	// Description of the repository.
	Description pulumi.StringPtrInput `pulumi:"description"`
	// Repository should be created with specified predefined gitignore file.
	GitIgnore pulumi.StringPtrInput `pulumi:"gitIgnore"`
	// Identifier of the repository.
	Identifier pulumi.StringInput `pulumi:"identifier"`
	// Repository should be created with specified predefined license file.
	License pulumi.StringPtrInput `pulumi:"license"`
	// Unique identifier of the organization.
	OrgId pulumi.StringPtrInput `pulumi:"orgId"`
	// Unique identifier of the project.
	ProjectId pulumi.StringPtrInput `pulumi:"projectId"`
	// Repository should be created with readme file.
	Readme pulumi.BoolPtrInput `pulumi:"readme"`
	// Configuration for importing an existing repository from SCM provider.
	Sources GetRepoSourceArrayInput `pulumi:"sources"`
}

func (LookupRepoOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupRepoArgs)(nil)).Elem()
}

// A collection of values returned by getRepo.
type LookupRepoResultOutput struct{ *pulumi.OutputState }

func (LookupRepoResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupRepoResult)(nil)).Elem()
}

func (o LookupRepoResultOutput) ToLookupRepoResultOutput() LookupRepoResultOutput {
	return o
}

func (o LookupRepoResultOutput) ToLookupRepoResultOutputWithContext(ctx context.Context) LookupRepoResultOutput {
	return o
}

// Timestamp when the repository was created.
func (o LookupRepoResultOutput) Created() pulumi.IntOutput {
	return o.ApplyT(func(v LookupRepoResult) int { return v.Created }).(pulumi.IntOutput)
}

// ID of the user who created the repository.
func (o LookupRepoResultOutput) CreatedBy() pulumi.IntOutput {
	return o.ApplyT(func(v LookupRepoResult) int { return v.CreatedBy }).(pulumi.IntOutput)
}

// Default branch of the repository (Applicate only for create).
func (o LookupRepoResultOutput) DefaultBranch() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupRepoResult) *string { return v.DefaultBranch }).(pulumi.StringPtrOutput)
}

// Description of the repository.
func (o LookupRepoResultOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupRepoResult) *string { return v.Description }).(pulumi.StringPtrOutput)
}

// Repository should be created with specified predefined gitignore file.
func (o LookupRepoResultOutput) GitIgnore() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupRepoResult) *string { return v.GitIgnore }).(pulumi.StringPtrOutput)
}

// Git URL of the repository.
func (o LookupRepoResultOutput) GitUrl() pulumi.StringOutput {
	return o.ApplyT(func(v LookupRepoResult) string { return v.GitUrl }).(pulumi.StringOutput)
}

// Internal ID of the repository.
func (o LookupRepoResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupRepoResult) string { return v.Id }).(pulumi.StringOutput)
}

// Identifier of the repository.
func (o LookupRepoResultOutput) Identifier() pulumi.StringOutput {
	return o.ApplyT(func(v LookupRepoResult) string { return v.Identifier }).(pulumi.StringOutput)
}

// Repository should be created with specified predefined license file.
func (o LookupRepoResultOutput) License() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupRepoResult) *string { return v.License }).(pulumi.StringPtrOutput)
}

// Name of the repository.
func (o LookupRepoResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v LookupRepoResult) string { return v.Name }).(pulumi.StringOutput)
}

// Unique identifier of the organization.
func (o LookupRepoResultOutput) OrgId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupRepoResult) *string { return v.OrgId }).(pulumi.StringPtrOutput)
}

// Path of the repository.
func (o LookupRepoResultOutput) Path() pulumi.StringOutput {
	return o.ApplyT(func(v LookupRepoResult) string { return v.Path }).(pulumi.StringOutput)
}

// Unique identifier of the project.
func (o LookupRepoResultOutput) ProjectId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupRepoResult) *string { return v.ProjectId }).(pulumi.StringPtrOutput)
}

// Repository should be created with readme file.
func (o LookupRepoResultOutput) Readme() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v LookupRepoResult) *bool { return v.Readme }).(pulumi.BoolPtrOutput)
}

// Configuration for importing an existing repository from SCM provider.
func (o LookupRepoResultOutput) Sources() GetRepoSourceArrayOutput {
	return o.ApplyT(func(v LookupRepoResult) []GetRepoSource { return v.Sources }).(GetRepoSourceArrayOutput)
}

// Timestamp when the repository was last updated.
func (o LookupRepoResultOutput) Updated() pulumi.IntOutput {
	return o.ApplyT(func(v LookupRepoResult) int { return v.Updated }).(pulumi.IntOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupRepoResultOutput{})
}