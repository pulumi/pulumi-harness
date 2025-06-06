// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Harness.Platform
{
    public static class GetGithubConnector
    {
        /// <summary>
        /// Datasource for looking up a Github connector.
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
        ///     var example = Harness.Platform.GetGithubConnector.Invoke(new()
        ///     {
        ///         Identifier = "identifier",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Task<GetGithubConnectorResult> InvokeAsync(GetGithubConnectorArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetGithubConnectorResult>("harness:platform/getGithubConnector:getGithubConnector", args ?? new GetGithubConnectorArgs(), options.WithDefaults());

        /// <summary>
        /// Datasource for looking up a Github connector.
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
        ///     var example = Harness.Platform.GetGithubConnector.Invoke(new()
        ///     {
        ///         Identifier = "identifier",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetGithubConnectorResult> Invoke(GetGithubConnectorInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetGithubConnectorResult>("harness:platform/getGithubConnector:getGithubConnector", args ?? new GetGithubConnectorInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// Datasource for looking up a Github connector.
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
        ///     var example = Harness.Platform.GetGithubConnector.Invoke(new()
        ///     {
        ///         Identifier = "identifier",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetGithubConnectorResult> Invoke(GetGithubConnectorInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetGithubConnectorResult>("harness:platform/getGithubConnector:getGithubConnector", args ?? new GetGithubConnectorInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetGithubConnectorArgs : global::Pulumi.InvokeArgs
    {
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
        /// Unique identifier of the project.
        /// </summary>
        [Input("projectId")]
        public string? ProjectId { get; set; }

        public GetGithubConnectorArgs()
        {
        }
        public static new GetGithubConnectorArgs Empty => new GetGithubConnectorArgs();
    }

    public sealed class GetGithubConnectorInvokeArgs : global::Pulumi.InvokeArgs
    {
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
        /// Unique identifier of the project.
        /// </summary>
        [Input("projectId")]
        public Input<string>? ProjectId { get; set; }

        public GetGithubConnectorInvokeArgs()
        {
        }
        public static new GetGithubConnectorInvokeArgs Empty => new GetGithubConnectorInvokeArgs();
    }


    [OutputType]
    public sealed class GetGithubConnectorResult
    {
        /// <summary>
        /// Configuration for using the github api. API Access is Computed for using “Git Experience”, for creation of Git based triggers, Webhooks management and updating Git statuses.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetGithubConnectorApiAuthenticationResult> ApiAuthentications;
        /// <summary>
        /// Whether the connection we're making is to a github repository or a github account. Valid values are Account, Repo.
        /// </summary>
        public readonly string ConnectionType;
        /// <summary>
        /// Credentials to use for the connection.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetGithubConnectorCredentialResult> Credentials;
        /// <summary>
        /// Tags to filter delegates for connection.
        /// </summary>
        public readonly ImmutableArray<string> DelegateSelectors;
        /// <summary>
        /// Description of the resource.
        /// </summary>
        public readonly string Description;
        public readonly bool ExecuteOnDelegate;
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
        /// Unique identifier of the project.
        /// </summary>
        public readonly string? ProjectId;
        /// <summary>
        /// Tags to associate with the resource.
        /// </summary>
        public readonly ImmutableArray<string> Tags;
        /// <summary>
        /// URL of the github repository or account.
        /// </summary>
        public readonly string Url;
        /// <summary>
        /// Repository to test the connection with. This is only used when `connection_type` is `Account`.
        /// </summary>
        public readonly string ValidationRepo;

        [OutputConstructor]
        private GetGithubConnectorResult(
            ImmutableArray<Outputs.GetGithubConnectorApiAuthenticationResult> apiAuthentications,

            string connectionType,

            ImmutableArray<Outputs.GetGithubConnectorCredentialResult> credentials,

            ImmutableArray<string> delegateSelectors,

            string description,

            bool executeOnDelegate,

            string id,

            string identifier,

            string? name,

            string? orgId,

            string? projectId,

            ImmutableArray<string> tags,

            string url,

            string validationRepo)
        {
            ApiAuthentications = apiAuthentications;
            ConnectionType = connectionType;
            Credentials = credentials;
            DelegateSelectors = delegateSelectors;
            Description = description;
            ExecuteOnDelegate = executeOnDelegate;
            Id = id;
            Identifier = identifier;
            Name = name;
            OrgId = orgId;
            ProjectId = projectId;
            Tags = tags;
            Url = url;
            ValidationRepo = validationRepo;
        }
    }
}
