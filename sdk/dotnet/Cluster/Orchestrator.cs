// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Harness.Cluster
{
    /// <summary>
    /// Resource for creating ClusterOrchestrators.
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
    ///     var test = new Harness.Cluster.Orchestrator("test", new()
    ///     {
    ///         Name = "name",
    ///         ClusterEndpoint = "http://test.test.com",
    ///         K8sConnectorId = "test",
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Import using the Harness aws cloud provider id.
    /// 
    /// ```sh
    /// $ pulumi import harness:cluster/orchestrator:Orchestrator example &lt;provider_id&gt;
    /// ```
    /// </summary>
    [HarnessResourceType("harness:cluster/orchestrator:Orchestrator")]
    public partial class Orchestrator : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Endpoint of the k8s cluster being onboarded under the orchestrator
        /// </summary>
        [Output("clusterEndpoint")]
        public Output<string> ClusterEndpoint { get; private set; } = null!;

        /// <summary>
        /// ID of the Harness Kubernetes Connector Being used
        /// </summary>
        [Output("k8sConnectorId")]
        public Output<string> K8sConnectorId { get; private set; } = null!;

        /// <summary>
        /// Name of the Orchestrator
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;


        /// <summary>
        /// Create a Orchestrator resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Orchestrator(string name, OrchestratorArgs args, CustomResourceOptions? options = null)
            : base("harness:cluster/orchestrator:Orchestrator", name, args ?? new OrchestratorArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Orchestrator(string name, Input<string> id, OrchestratorState? state = null, CustomResourceOptions? options = null)
            : base("harness:cluster/orchestrator:Orchestrator", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
                PluginDownloadURL = "github://api.github.com/pulumi",
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing Orchestrator resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Orchestrator Get(string name, Input<string> id, OrchestratorState? state = null, CustomResourceOptions? options = null)
        {
            return new Orchestrator(name, id, state, options);
        }
    }

    public sealed class OrchestratorArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Endpoint of the k8s cluster being onboarded under the orchestrator
        /// </summary>
        [Input("clusterEndpoint", required: true)]
        public Input<string> ClusterEndpoint { get; set; } = null!;

        /// <summary>
        /// ID of the Harness Kubernetes Connector Being used
        /// </summary>
        [Input("k8sConnectorId", required: true)]
        public Input<string> K8sConnectorId { get; set; } = null!;

        /// <summary>
        /// Name of the Orchestrator
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        public OrchestratorArgs()
        {
        }
        public static new OrchestratorArgs Empty => new OrchestratorArgs();
    }

    public sealed class OrchestratorState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Endpoint of the k8s cluster being onboarded under the orchestrator
        /// </summary>
        [Input("clusterEndpoint")]
        public Input<string>? ClusterEndpoint { get; set; }

        /// <summary>
        /// ID of the Harness Kubernetes Connector Being used
        /// </summary>
        [Input("k8sConnectorId")]
        public Input<string>? K8sConnectorId { get; set; }

        /// <summary>
        /// Name of the Orchestrator
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        public OrchestratorState()
        {
        }
        public static new OrchestratorState Empty => new OrchestratorState();
    }
}