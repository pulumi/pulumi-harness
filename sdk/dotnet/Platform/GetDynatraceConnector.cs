// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Harness.Platform
{
    public static class GetDynatraceConnector
    {
        /// <summary>
        /// Datasource for looking up a Dynatrace connector.
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
        ///     var example = Harness.Platform.GetDynatraceConnector.Invoke(new()
        ///     {
        ///         Identifier = "identifier",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Task<GetDynatraceConnectorResult> InvokeAsync(GetDynatraceConnectorArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetDynatraceConnectorResult>("harness:platform/getDynatraceConnector:getDynatraceConnector", args ?? new GetDynatraceConnectorArgs(), options.WithDefaults());

        /// <summary>
        /// Datasource for looking up a Dynatrace connector.
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
        ///     var example = Harness.Platform.GetDynatraceConnector.Invoke(new()
        ///     {
        ///         Identifier = "identifier",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetDynatraceConnectorResult> Invoke(GetDynatraceConnectorInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetDynatraceConnectorResult>("harness:platform/getDynatraceConnector:getDynatraceConnector", args ?? new GetDynatraceConnectorInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// Datasource for looking up a Dynatrace connector.
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
        ///     var example = Harness.Platform.GetDynatraceConnector.Invoke(new()
        ///     {
        ///         Identifier = "identifier",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetDynatraceConnectorResult> Invoke(GetDynatraceConnectorInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetDynatraceConnectorResult>("harness:platform/getDynatraceConnector:getDynatraceConnector", args ?? new GetDynatraceConnectorInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetDynatraceConnectorArgs : global::Pulumi.InvokeArgs
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

        public GetDynatraceConnectorArgs()
        {
        }
        public static new GetDynatraceConnectorArgs Empty => new GetDynatraceConnectorArgs();
    }

    public sealed class GetDynatraceConnectorInvokeArgs : global::Pulumi.InvokeArgs
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

        public GetDynatraceConnectorInvokeArgs()
        {
        }
        public static new GetDynatraceConnectorInvokeArgs Empty => new GetDynatraceConnectorInvokeArgs();
    }


    [OutputType]
    public sealed class GetDynatraceConnectorResult
    {
        /// <summary>
        /// The reference to the Harness secret containing the api token. To reference a secret at the organization scope, prefix 'org' to the expression: org.{identifier}. To reference a secret at the account scope, prefix 'account` to the expression: account.{identifier}.
        /// </summary>
        public readonly string ApiTokenRef;
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
        /// URL of the Dynatrace server.
        /// </summary>
        public readonly string Url;

        [OutputConstructor]
        private GetDynatraceConnectorResult(
            string apiTokenRef,

            ImmutableArray<string> delegateSelectors,

            string description,

            string id,

            string identifier,

            string? name,

            string? orgId,

            string? projectId,

            ImmutableArray<string> tags,

            string url)
        {
            ApiTokenRef = apiTokenRef;
            DelegateSelectors = delegateSelectors;
            Description = description;
            Id = id;
            Identifier = identifier;
            Name = name;
            OrgId = orgId;
            ProjectId = projectId;
            Tags = tags;
            Url = url;
        }
    }
}
