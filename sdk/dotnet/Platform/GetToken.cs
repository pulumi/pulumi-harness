// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Harness.Platform
{
    public static class GetToken
    {
        /// <summary>
        /// Data source for retrieving a Harness ApiKey Token.
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
        ///     var test = Harness.Platform.GetToken.Invoke(new()
        ///     {
        ///         Identifier = "test_token",
        ///         ParentId = "apikey_parent_id",
        ///         OrgId = "org_id",
        ///         ProjectId = "project_id",
        ///         ApikeyId = "apikey_id",
        ///         ApikeyType = "USER",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Task<GetTokenResult> InvokeAsync(GetTokenArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetTokenResult>("harness:platform/getToken:getToken", args ?? new GetTokenArgs(), options.WithDefaults());

        /// <summary>
        /// Data source for retrieving a Harness ApiKey Token.
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
        ///     var test = Harness.Platform.GetToken.Invoke(new()
        ///     {
        ///         Identifier = "test_token",
        ///         ParentId = "apikey_parent_id",
        ///         OrgId = "org_id",
        ///         ProjectId = "project_id",
        ///         ApikeyId = "apikey_id",
        ///         ApikeyType = "USER",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetTokenResult> Invoke(GetTokenInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetTokenResult>("harness:platform/getToken:getToken", args ?? new GetTokenInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// Data source for retrieving a Harness ApiKey Token.
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
        ///     var test = Harness.Platform.GetToken.Invoke(new()
        ///     {
        ///         Identifier = "test_token",
        ///         ParentId = "apikey_parent_id",
        ///         OrgId = "org_id",
        ///         ProjectId = "project_id",
        ///         ApikeyId = "apikey_id",
        ///         ApikeyType = "USER",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetTokenResult> Invoke(GetTokenInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetTokenResult>("harness:platform/getToken:getToken", args ?? new GetTokenInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetTokenArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Account Identifier for the Entity
        /// </summary>
        [Input("accountId", required: true)]
        public string AccountId { get; set; } = null!;

        /// <summary>
        /// Identifier of the API Key
        /// </summary>
        [Input("apikeyId", required: true)]
        public string ApikeyId { get; set; } = null!;

        /// <summary>
        /// Type of the API Key
        /// </summary>
        [Input("apikeyType", required: true)]
        public string ApikeyType { get; set; } = null!;

        /// <summary>
        /// Email Id of the user who created the Token
        /// </summary>
        [Input("email")]
        public string? Email { get; set; }

        /// <summary>
        /// Encoded password of the Token
        /// </summary>
        [Input("encodedPassword")]
        public string? EncodedPassword { get; set; }

        /// <summary>
        /// Unique identifier of the resource.
        /// </summary>
        [Input("identifier", required: true)]
        public string Identifier { get; set; } = null!;

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
        /// Parent Entity Identifier of the API Key
        /// </summary>
        [Input("parentId", required: true)]
        public string ParentId { get; set; } = null!;

        /// <summary>
        /// Unique identifier of the project.
        /// </summary>
        [Input("projectId")]
        public string? ProjectId { get; set; }

        /// <summary>
        /// Scheduled expiry time in milliseconds
        /// </summary>
        [Input("scheduledExpireTime")]
        public int? ScheduledExpireTime { get; set; }

        /// <summary>
        /// Name of the user who created the Token
        /// </summary>
        [Input("username")]
        public string? Username { get; set; }

        /// <summary>
        /// Boolean value to indicate if Token is valid or not.
        /// </summary>
        [Input("valid")]
        public bool? Valid { get; set; }

        /// <summary>
        /// This is the time from which the Token is valid. The time is in milliseconds
        /// </summary>
        [Input("validFrom")]
        public int? ValidFrom { get; set; }

        /// <summary>
        /// This is the time till which the Token is valid. The time is in milliseconds
        /// </summary>
        [Input("validTo")]
        public int? ValidTo { get; set; }

        public GetTokenArgs()
        {
        }
        public static new GetTokenArgs Empty => new GetTokenArgs();
    }

    public sealed class GetTokenInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Account Identifier for the Entity
        /// </summary>
        [Input("accountId", required: true)]
        public Input<string> AccountId { get; set; } = null!;

        /// <summary>
        /// Identifier of the API Key
        /// </summary>
        [Input("apikeyId", required: true)]
        public Input<string> ApikeyId { get; set; } = null!;

        /// <summary>
        /// Type of the API Key
        /// </summary>
        [Input("apikeyType", required: true)]
        public Input<string> ApikeyType { get; set; } = null!;

        /// <summary>
        /// Email Id of the user who created the Token
        /// </summary>
        [Input("email")]
        public Input<string>? Email { get; set; }

        /// <summary>
        /// Encoded password of the Token
        /// </summary>
        [Input("encodedPassword")]
        public Input<string>? EncodedPassword { get; set; }

        /// <summary>
        /// Unique identifier of the resource.
        /// </summary>
        [Input("identifier", required: true)]
        public Input<string> Identifier { get; set; } = null!;

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
        /// Parent Entity Identifier of the API Key
        /// </summary>
        [Input("parentId", required: true)]
        public Input<string> ParentId { get; set; } = null!;

        /// <summary>
        /// Unique identifier of the project.
        /// </summary>
        [Input("projectId")]
        public Input<string>? ProjectId { get; set; }

        /// <summary>
        /// Scheduled expiry time in milliseconds
        /// </summary>
        [Input("scheduledExpireTime")]
        public Input<int>? ScheduledExpireTime { get; set; }

        /// <summary>
        /// Name of the user who created the Token
        /// </summary>
        [Input("username")]
        public Input<string>? Username { get; set; }

        /// <summary>
        /// Boolean value to indicate if Token is valid or not.
        /// </summary>
        [Input("valid")]
        public Input<bool>? Valid { get; set; }

        /// <summary>
        /// This is the time from which the Token is valid. The time is in milliseconds
        /// </summary>
        [Input("validFrom")]
        public Input<int>? ValidFrom { get; set; }

        /// <summary>
        /// This is the time till which the Token is valid. The time is in milliseconds
        /// </summary>
        [Input("validTo")]
        public Input<int>? ValidTo { get; set; }

        public GetTokenInvokeArgs()
        {
        }
        public static new GetTokenInvokeArgs Empty => new GetTokenInvokeArgs();
    }


    [OutputType]
    public sealed class GetTokenResult
    {
        /// <summary>
        /// Account Identifier for the Entity
        /// </summary>
        public readonly string AccountId;
        /// <summary>
        /// Identifier of the API Key
        /// </summary>
        public readonly string ApikeyId;
        /// <summary>
        /// Type of the API Key
        /// </summary>
        public readonly string ApikeyType;
        /// <summary>
        /// Description of the resource.
        /// </summary>
        public readonly string Description;
        /// <summary>
        /// Email Id of the user who created the Token
        /// </summary>
        public readonly string? Email;
        /// <summary>
        /// Encoded password of the Token
        /// </summary>
        public readonly string? EncodedPassword;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// Unique identifier of the resource.
        /// </summary>
        public readonly string Identifier;
        /// <summary>
        /// Name of the resource.
        /// </summary>
        public readonly string? Name;
        /// <summary>
        /// Unique identifier of the organization.
        /// </summary>
        public readonly string? OrgId;
        /// <summary>
        /// Parent Entity Identifier of the API Key
        /// </summary>
        public readonly string ParentId;
        /// <summary>
        /// Unique identifier of the project.
        /// </summary>
        public readonly string? ProjectId;
        /// <summary>
        /// Scheduled expiry time in milliseconds
        /// </summary>
        public readonly int? ScheduledExpireTime;
        /// <summary>
        /// Tags to associate with the resource.
        /// </summary>
        public readonly ImmutableArray<string> Tags;
        /// <summary>
        /// Name of the user who created the Token
        /// </summary>
        public readonly string? Username;
        /// <summary>
        /// Boolean value to indicate if Token is valid or not.
        /// </summary>
        public readonly bool? Valid;
        /// <summary>
        /// This is the time from which the Token is valid. The time is in milliseconds
        /// </summary>
        public readonly int? ValidFrom;
        /// <summary>
        /// This is the time till which the Token is valid. The time is in milliseconds
        /// </summary>
        public readonly int? ValidTo;

        [OutputConstructor]
        private GetTokenResult(
            string accountId,

            string apikeyId,

            string apikeyType,

            string description,

            string? email,

            string? encodedPassword,

            string id,

            string identifier,

            string? name,

            string? orgId,

            string parentId,

            string? projectId,

            int? scheduledExpireTime,

            ImmutableArray<string> tags,

            string? username,

            bool? valid,

            int? validFrom,

            int? validTo)
        {
            AccountId = accountId;
            ApikeyId = apikeyId;
            ApikeyType = apikeyType;
            Description = description;
            Email = email;
            EncodedPassword = encodedPassword;
            Id = id;
            Identifier = identifier;
            Name = name;
            OrgId = orgId;
            ParentId = parentId;
            ProjectId = projectId;
            ScheduledExpireTime = scheduledExpireTime;
            Tags = tags;
            Username = username;
            Valid = valid;
            ValidFrom = validFrom;
            ValidTo = validTo;
        }
    }
}
