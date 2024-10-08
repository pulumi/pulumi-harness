// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Harness.Platform
{
    public static class GetUser
    {
        /// <summary>
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
        ///     var example = Harness.Platform.GetUser.Invoke(new()
        ///     {
        ///         OrgId = "org_id",
        ///         ProjectId = "project_id",
        ///         Email = "john.doe@harness.io",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Task<GetUserResult> InvokeAsync(GetUserArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetUserResult>("harness:platform/getUser:getUser", args ?? new GetUserArgs(), options.WithDefaults());

        /// <summary>
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
        ///     var example = Harness.Platform.GetUser.Invoke(new()
        ///     {
        ///         OrgId = "org_id",
        ///         ProjectId = "project_id",
        ///         Email = "john.doe@harness.io",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetUserResult> Invoke(GetUserInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetUserResult>("harness:platform/getUser:getUser", args ?? new GetUserInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetUserArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The email of the user.
        /// </summary>
        [Input("email", required: true)]
        public string Email { get; set; } = null!;

        /// <summary>
        /// Organization identifier of the user.
        /// </summary>
        [Input("orgId")]
        public string? OrgId { get; set; }

        /// <summary>
        /// Project identifier of the user.
        /// </summary>
        [Input("projectId")]
        public string? ProjectId { get; set; }

        public GetUserArgs()
        {
        }
        public static new GetUserArgs Empty => new GetUserArgs();
    }

    public sealed class GetUserInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The email of the user.
        /// </summary>
        [Input("email", required: true)]
        public Input<string> Email { get; set; } = null!;

        /// <summary>
        /// Organization identifier of the user.
        /// </summary>
        [Input("orgId")]
        public Input<string>? OrgId { get; set; }

        /// <summary>
        /// Project identifier of the user.
        /// </summary>
        [Input("projectId")]
        public Input<string>? ProjectId { get; set; }

        public GetUserInvokeArgs()
        {
        }
        public static new GetUserInvokeArgs Empty => new GetUserInvokeArgs();
    }


    [OutputType]
    public sealed class GetUserResult
    {
        /// <summary>
        /// Whether or not the user account is disabled.
        /// </summary>
        public readonly bool Disabled;
        /// <summary>
        /// The email of the user.
        /// </summary>
        public readonly string Email;
        /// <summary>
        /// Whether or not the user account is externally managed.
        /// </summary>
        public readonly bool ExternallyManaged;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// Unique identifier of the user.
        /// </summary>
        public readonly string Identifier;
        /// <summary>
        /// Whether or not the user account is locked.
        /// </summary>
        public readonly bool Locked;
        /// <summary>
        /// Name of the user.
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// Organization identifier of the user.
        /// </summary>
        public readonly string? OrgId;
        /// <summary>
        /// Project identifier of the user.
        /// </summary>
        public readonly string? ProjectId;

        [OutputConstructor]
        private GetUserResult(
            bool disabled,

            string email,

            bool externallyManaged,

            string id,

            string identifier,

            bool locked,

            string name,

            string? orgId,

            string? projectId)
        {
            Disabled = disabled;
            Email = email;
            ExternallyManaged = externallyManaged;
            Id = id;
            Identifier = identifier;
            Locked = locked;
            Name = name;
            OrgId = orgId;
            ProjectId = projectId;
        }
    }
}