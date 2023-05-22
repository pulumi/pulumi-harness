// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;
using Pulumi;

namespace Lbrlabs.PulumiPackage.Harness.Platform
{
    public static class GetConnectorKubernetesCloudCost
    {
        /// <summary>
        /// Datasource for looking up a Kubernetes Cloud Cost connector.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Harness = Pulumi.Harness;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var example = Harness.Platform.GetConnectorKubernetesCloudCost.Invoke(new()
        ///     {
        ///         Identifier = "identifier",
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetConnectorKubernetesCloudCostResult> InvokeAsync(GetConnectorKubernetesCloudCostArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetConnectorKubernetesCloudCostResult>("harness:platform/getConnectorKubernetesCloudCost:getConnectorKubernetesCloudCost", args ?? new GetConnectorKubernetesCloudCostArgs(), options.WithDefaults());

        /// <summary>
        /// Datasource for looking up a Kubernetes Cloud Cost connector.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Harness = Pulumi.Harness;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var example = Harness.Platform.GetConnectorKubernetesCloudCost.Invoke(new()
        ///     {
        ///         Identifier = "identifier",
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetConnectorKubernetesCloudCostResult> Invoke(GetConnectorKubernetesCloudCostInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetConnectorKubernetesCloudCostResult>("harness:platform/getConnectorKubernetesCloudCost:getConnectorKubernetesCloudCost", args ?? new GetConnectorKubernetesCloudCostInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetConnectorKubernetesCloudCostArgs : global::Pulumi.InvokeArgs
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

        public GetConnectorKubernetesCloudCostArgs()
        {
        }
        public static new GetConnectorKubernetesCloudCostArgs Empty => new GetConnectorKubernetesCloudCostArgs();
    }

    public sealed class GetConnectorKubernetesCloudCostInvokeArgs : global::Pulumi.InvokeArgs
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

        public GetConnectorKubernetesCloudCostInvokeArgs()
        {
        }
        public static new GetConnectorKubernetesCloudCostInvokeArgs Empty => new GetConnectorKubernetesCloudCostInvokeArgs();
    }


    [OutputType]
    public sealed class GetConnectorKubernetesCloudCostResult
    {
        /// <summary>
        /// Reference of the Connector.
        /// </summary>
        public readonly string ConnectorRef;
        /// <summary>
        /// Description of the resource.
        /// </summary>
        public readonly string Description;
        /// <summary>
        /// Indicates which feature to enable among Billing, Optimization, and Visibility.
        /// </summary>
        public readonly ImmutableArray<string> FeaturesEnableds;
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

        [OutputConstructor]
        private GetConnectorKubernetesCloudCostResult(
            string connectorRef,

            string description,

            ImmutableArray<string> featuresEnableds,

            string id,

            string identifier,

            string? name,

            string? orgId,

            string? projectId,

            ImmutableArray<string> tags)
        {
            ConnectorRef = connectorRef;
            Description = description;
            FeaturesEnableds = featuresEnableds;
            Id = id;
            Identifier = identifier;
            Name = name;
            OrgId = orgId;
            ProjectId = projectId;
            Tags = tags;
        }
    }
}