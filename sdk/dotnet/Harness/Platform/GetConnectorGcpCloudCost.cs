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
    public static class GetConnectorGcpCloudCost
    {
        /// <summary>
        /// Datasource for looking up a GCP Cloud Cost Connector.
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
        ///     var example = Harness.Platform.GetConnectorGcpCloudCost.Invoke(new()
        ///     {
        ///         Identifier = "identifier",
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetConnectorGcpCloudCostResult> InvokeAsync(GetConnectorGcpCloudCostArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetConnectorGcpCloudCostResult>("harness:platform/getConnectorGcpCloudCost:getConnectorGcpCloudCost", args ?? new GetConnectorGcpCloudCostArgs(), options.WithDefaults());

        /// <summary>
        /// Datasource for looking up a GCP Cloud Cost Connector.
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
        ///     var example = Harness.Platform.GetConnectorGcpCloudCost.Invoke(new()
        ///     {
        ///         Identifier = "identifier",
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetConnectorGcpCloudCostResult> Invoke(GetConnectorGcpCloudCostInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetConnectorGcpCloudCostResult>("harness:platform/getConnectorGcpCloudCost:getConnectorGcpCloudCost", args ?? new GetConnectorGcpCloudCostInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetConnectorGcpCloudCostArgs : global::Pulumi.InvokeArgs
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

        public GetConnectorGcpCloudCostArgs()
        {
        }
        public static new GetConnectorGcpCloudCostArgs Empty => new GetConnectorGcpCloudCostArgs();
    }

    public sealed class GetConnectorGcpCloudCostInvokeArgs : global::Pulumi.InvokeArgs
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

        public GetConnectorGcpCloudCostInvokeArgs()
        {
        }
        public static new GetConnectorGcpCloudCostInvokeArgs Empty => new GetConnectorGcpCloudCostInvokeArgs();
    }


    [OutputType]
    public sealed class GetConnectorGcpCloudCostResult
    {
        /// <summary>
        /// Returns billing details.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetConnectorGcpCloudCostBillingExportSpecResult> BillingExportSpecs;
        /// <summary>
        /// Description of the resource.
        /// </summary>
        public readonly string Description;
        /// <summary>
        /// Indicates which features to enable among Billing, Optimization, and Visibility.
        /// </summary>
        public readonly ImmutableArray<string> FeaturesEnableds;
        /// <summary>
        /// GCP Project Id.
        /// </summary>
        public readonly string GcpProjectId;
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
        /// Email corresponding to the Service Account.
        /// </summary>
        public readonly string ServiceAccountEmail;
        /// <summary>
        /// Tags to associate with the resource.
        /// </summary>
        public readonly ImmutableArray<string> Tags;

        [OutputConstructor]
        private GetConnectorGcpCloudCostResult(
            ImmutableArray<Outputs.GetConnectorGcpCloudCostBillingExportSpecResult> billingExportSpecs,

            string description,

            ImmutableArray<string> featuresEnableds,

            string gcpProjectId,

            string id,

            string identifier,

            string? name,

            string? orgId,

            string? projectId,

            string serviceAccountEmail,

            ImmutableArray<string> tags)
        {
            BillingExportSpecs = billingExportSpecs;
            Description = description;
            FeaturesEnableds = featuresEnableds;
            GcpProjectId = gcpProjectId;
            Id = id;
            Identifier = identifier;
            Name = name;
            OrgId = orgId;
            ProjectId = projectId;
            ServiceAccountEmail = serviceAccountEmail;
            Tags = tags;
        }
    }
}