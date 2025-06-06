// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Harness.Platform
{
    public static class GetDockerConnector
    {
        /// <summary>
        /// Datasource for looking up a Datadog connector.
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
        ///     var example = Harness.Platform.GetDockerConnector.Invoke(new()
        ///     {
        ///         Identifier = "identifier",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Task<GetDockerConnectorResult> InvokeAsync(GetDockerConnectorArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetDockerConnectorResult>("harness:platform/getDockerConnector:getDockerConnector", args ?? new GetDockerConnectorArgs(), options.WithDefaults());

        /// <summary>
        /// Datasource for looking up a Datadog connector.
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
        ///     var example = Harness.Platform.GetDockerConnector.Invoke(new()
        ///     {
        ///         Identifier = "identifier",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetDockerConnectorResult> Invoke(GetDockerConnectorInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetDockerConnectorResult>("harness:platform/getDockerConnector:getDockerConnector", args ?? new GetDockerConnectorInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// Datasource for looking up a Datadog connector.
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
        ///     var example = Harness.Platform.GetDockerConnector.Invoke(new()
        ///     {
        ///         Identifier = "identifier",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetDockerConnectorResult> Invoke(GetDockerConnectorInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetDockerConnectorResult>("harness:platform/getDockerConnector:getDockerConnector", args ?? new GetDockerConnectorInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetDockerConnectorArgs : global::Pulumi.InvokeArgs
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

        public GetDockerConnectorArgs()
        {
        }
        public static new GetDockerConnectorArgs Empty => new GetDockerConnectorArgs();
    }

    public sealed class GetDockerConnectorInvokeArgs : global::Pulumi.InvokeArgs
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

        public GetDockerConnectorInvokeArgs()
        {
        }
        public static new GetDockerConnectorInvokeArgs Empty => new GetDockerConnectorInvokeArgs();
    }


    [OutputType]
    public sealed class GetDockerConnectorResult
    {
        /// <summary>
        /// The credentials to use for the docker registry. If not specified then the connection is made to the registry anonymously.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetDockerConnectorCredentialResult> Credentials;
        /// <summary>
        /// Tags to filter delegates for connection.
        /// </summary>
        public readonly ImmutableArray<string> DelegateSelectors;
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
        /// The type of the docker registry. Valid options are DockerHub, Harbor, Other, Quay
        /// </summary>
        public readonly string Type;
        /// <summary>
        /// The URL of the docker registry.
        /// </summary>
        public readonly string Url;

        [OutputConstructor]
        private GetDockerConnectorResult(
            ImmutableArray<Outputs.GetDockerConnectorCredentialResult> credentials,

            ImmutableArray<string> delegateSelectors,

            string description,

            string id,

            string identifier,

            string? name,

            string? orgId,

            string? projectId,

            ImmutableArray<string> tags,

            string type,

            string url)
        {
            Credentials = credentials;
            DelegateSelectors = delegateSelectors;
            Description = description;
            Id = id;
            Identifier = identifier;
            Name = name;
            OrgId = orgId;
            ProjectId = projectId;
            Tags = tags;
            Type = type;
            Url = url;
        }
    }
}
