// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Harness.Platform
{
    public static class GetPolicy
    {
        /// <summary>
        /// Data source for retrieving a Harness policy.
        /// 
        /// ## Example Usage
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Harness = Pulumi.Harness;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var test = Harness.Platform.GetPolicy.Invoke(new()
        ///     {
        ///         Identifier = testHarnessPlatformPolicy.Identifier,
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Task<GetPolicyResult> InvokeAsync(GetPolicyArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetPolicyResult>("harness:platform/getPolicy:getPolicy", args ?? new GetPolicyArgs(), options.WithDefaults());

        /// <summary>
        /// Data source for retrieving a Harness policy.
        /// 
        /// ## Example Usage
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Harness = Pulumi.Harness;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var test = Harness.Platform.GetPolicy.Invoke(new()
        ///     {
        ///         Identifier = testHarnessPlatformPolicy.Identifier,
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetPolicyResult> Invoke(GetPolicyInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetPolicyResult>("harness:platform/getPolicy:getPolicy", args ?? new GetPolicyInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// Data source for retrieving a Harness policy.
        /// 
        /// ## Example Usage
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Harness = Pulumi.Harness;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var test = Harness.Platform.GetPolicy.Invoke(new()
        ///     {
        ///         Identifier = testHarnessPlatformPolicy.Identifier,
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetPolicyResult> Invoke(GetPolicyInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetPolicyResult>("harness:platform/getPolicy:getPolicy", args ?? new GetPolicyInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetPolicyArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Unique identifier of the resource.
        /// </summary>
        [Input("identifier")]
        public string? Identifier { get; set; }

        /// <summary>
        /// Name of the resource.
        /// </summary>
        [Input("name")]
        public string? Name { get; set; }

        /// <summary>
        /// Unique identifier of the organization.
        /// </summary>
        [Input("orgId")]
        public string? OrgId { get; set; }

        /// <summary>
        /// Unique identifier of the project.
        /// </summary>
        [Input("projectId")]
        public string? ProjectId { get; set; }

        /// <summary>
        /// Rego code for the policy.
        /// </summary>
        [Input("rego")]
        public string? Rego { get; set; }

        public GetPolicyArgs()
        {
        }
        public static new GetPolicyArgs Empty => new GetPolicyArgs();
    }

    public sealed class GetPolicyInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Unique identifier of the resource.
        /// </summary>
        [Input("identifier")]
        public Input<string>? Identifier { get; set; }

        /// <summary>
        /// Name of the resource.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Unique identifier of the organization.
        /// </summary>
        [Input("orgId")]
        public Input<string>? OrgId { get; set; }

        /// <summary>
        /// Unique identifier of the project.
        /// </summary>
        [Input("projectId")]
        public Input<string>? ProjectId { get; set; }

        /// <summary>
        /// Rego code for the policy.
        /// </summary>
        [Input("rego")]
        public Input<string>? Rego { get; set; }

        public GetPolicyInvokeArgs()
        {
        }
        public static new GetPolicyInvokeArgs Empty => new GetPolicyInvokeArgs();
    }


    [OutputType]
    public sealed class GetPolicyResult
    {
        /// <summary>
        /// Description of the resource.
        /// </summary>
        public readonly string Description;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// Unique identifier of the resource.
        /// </summary>
        public readonly string? Identifier;
        /// <summary>
        /// Name of the resource.
        /// </summary>
        public readonly string? Name;
        /// <summary>
        /// Unique identifier of the organization.
        /// </summary>
        public readonly string? OrgId;
        /// <summary>
        /// Unique identifier of the project.
        /// </summary>
        public readonly string? ProjectId;
        /// <summary>
        /// Rego code for the policy.
        /// </summary>
        public readonly string Rego;
        /// <summary>
        /// Tags to associate with the resource.
        /// </summary>
        public readonly ImmutableArray<string> Tags;

        [OutputConstructor]
        private GetPolicyResult(
            string description,

            string id,

            string? identifier,

            string? name,

            string? orgId,

            string? projectId,

            string rego,

            ImmutableArray<string> tags)
        {
            Description = description;
            Id = id;
            Identifier = identifier;
            Name = name;
            OrgId = orgId;
            ProjectId = projectId;
            Rego = rego;
            Tags = tags;
        }
    }
}
