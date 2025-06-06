// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Harness.Platform
{
    /// <summary>
    /// Resource for mapping environment with Harness Clusters.
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
    ///     // mapping a cluster to a project level env
    ///     var example = new Harness.Platform.EnvironmentClustersMapping("example", new()
    ///     {
    ///         Identifier = "mycustomidentifier",
    ///         OrgId = "orgIdentifer",
    ///         ProjectId = "projectIdentifier",
    ///         EnvId = "exampleEnvId",
    ///         Clusters = new[]
    ///         {
    ///             new Harness.Platform.Inputs.EnvironmentClustersMappingClusterArgs
    ///             {
    ///                 Identifier = "incluster",
    ///                 Name = "in-cluster",
    ///                 AgentIdentifier = "account.gitopsagentdev",
    ///                 Scope = "ACCOUNT",
    ///             },
    ///         },
    ///     });
    /// 
    ///     // mapping two clusters to account level env
    ///     var example2 = new Harness.Platform.EnvironmentClustersMapping("example2", new()
    ///     {
    ///         Identifier = "mycustomidentifier",
    ///         EnvId = "env1",
    ///         Clusters = new[]
    ///         {
    ///             new Harness.Platform.Inputs.EnvironmentClustersMappingClusterArgs
    ///             {
    ///                 Identifier = "clusterA",
    ///                 Name = "cluster-A",
    ///                 AgentIdentifier = "account.gitopsagentprod",
    ///                 Scope = "ACCOUNT",
    ///             },
    ///             new Harness.Platform.Inputs.EnvironmentClustersMappingClusterArgs
    ///             {
    ///                 Identifier = "clusterB",
    ///                 Name = "cluster-B",
    ///                 AgentIdentifier = "account.gitopsagentprod",
    ///                 Scope = "ACCOUNT",
    ///             },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// </summary>
    [HarnessResourceType("harness:platform/environmentClustersMapping:EnvironmentClustersMapping")]
    public partial class EnvironmentClustersMapping : global::Pulumi.CustomResource
    {
        /// <summary>
        /// list of cluster identifiers and names
        /// </summary>
        [Output("clusters")]
        public Output<ImmutableArray<Outputs.EnvironmentClustersMappingCluster>> Clusters { get; private set; } = null!;

        /// <summary>
        /// environment identifier.
        /// </summary>
        [Output("envId")]
        public Output<string> EnvId { get; private set; } = null!;

        /// <summary>
        /// identifier for the cluster mapping(can be given any value).
        /// </summary>
        [Output("identifier")]
        public Output<string> Identifier { get; private set; } = null!;

        /// <summary>
        /// org_id of the environment.
        /// </summary>
        [Output("orgId")]
        public Output<string?> OrgId { get; private set; } = null!;

        /// <summary>
        /// project_id of the environment.
        /// </summary>
        [Output("projectId")]
        public Output<string?> ProjectId { get; private set; } = null!;

        /// <summary>
        /// scope at which the environment exists in harness.
        /// </summary>
        [Output("scope")]
        public Output<string> Scope { get; private set; } = null!;


        /// <summary>
        /// Create a EnvironmentClustersMapping resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public EnvironmentClustersMapping(string name, EnvironmentClustersMappingArgs args, CustomResourceOptions? options = null)
            : base("harness:platform/environmentClustersMapping:EnvironmentClustersMapping", name, args ?? new EnvironmentClustersMappingArgs(), MakeResourceOptions(options, ""))
        {
        }

        private EnvironmentClustersMapping(string name, Input<string> id, EnvironmentClustersMappingState? state = null, CustomResourceOptions? options = null)
            : base("harness:platform/environmentClustersMapping:EnvironmentClustersMapping", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing EnvironmentClustersMapping resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static EnvironmentClustersMapping Get(string name, Input<string> id, EnvironmentClustersMappingState? state = null, CustomResourceOptions? options = null)
        {
            return new EnvironmentClustersMapping(name, id, state, options);
        }
    }

    public sealed class EnvironmentClustersMappingArgs : global::Pulumi.ResourceArgs
    {
        [Input("clusters")]
        private InputList<Inputs.EnvironmentClustersMappingClusterArgs>? _clusters;

        /// <summary>
        /// list of cluster identifiers and names
        /// </summary>
        public InputList<Inputs.EnvironmentClustersMappingClusterArgs> Clusters
        {
            get => _clusters ?? (_clusters = new InputList<Inputs.EnvironmentClustersMappingClusterArgs>());
            set => _clusters = value;
        }

        /// <summary>
        /// environment identifier.
        /// </summary>
        [Input("envId", required: true)]
        public Input<string> EnvId { get; set; } = null!;

        /// <summary>
        /// identifier for the cluster mapping(can be given any value).
        /// </summary>
        [Input("identifier", required: true)]
        public Input<string> Identifier { get; set; } = null!;

        /// <summary>
        /// org_id of the environment.
        /// </summary>
        [Input("orgId")]
        public Input<string>? OrgId { get; set; }

        /// <summary>
        /// project_id of the environment.
        /// </summary>
        [Input("projectId")]
        public Input<string>? ProjectId { get; set; }

        public EnvironmentClustersMappingArgs()
        {
        }
        public static new EnvironmentClustersMappingArgs Empty => new EnvironmentClustersMappingArgs();
    }

    public sealed class EnvironmentClustersMappingState : global::Pulumi.ResourceArgs
    {
        [Input("clusters")]
        private InputList<Inputs.EnvironmentClustersMappingClusterGetArgs>? _clusters;

        /// <summary>
        /// list of cluster identifiers and names
        /// </summary>
        public InputList<Inputs.EnvironmentClustersMappingClusterGetArgs> Clusters
        {
            get => _clusters ?? (_clusters = new InputList<Inputs.EnvironmentClustersMappingClusterGetArgs>());
            set => _clusters = value;
        }

        /// <summary>
        /// environment identifier.
        /// </summary>
        [Input("envId")]
        public Input<string>? EnvId { get; set; }

        /// <summary>
        /// identifier for the cluster mapping(can be given any value).
        /// </summary>
        [Input("identifier")]
        public Input<string>? Identifier { get; set; }

        /// <summary>
        /// org_id of the environment.
        /// </summary>
        [Input("orgId")]
        public Input<string>? OrgId { get; set; }

        /// <summary>
        /// project_id of the environment.
        /// </summary>
        [Input("projectId")]
        public Input<string>? ProjectId { get; set; }

        /// <summary>
        /// scope at which the environment exists in harness.
        /// </summary>
        [Input("scope")]
        public Input<string>? Scope { get; set; }

        public EnvironmentClustersMappingState()
        {
        }
        public static new EnvironmentClustersMappingState Empty => new EnvironmentClustersMappingState();
    }
}
