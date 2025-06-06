// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Harness.Cloudprovider
{
    /// <summary>
    /// Resource for creating a physical data center cloud provider. This resource uses the config-as-code API's. When updating the `name` or `path` of this resource you should typically also set the `create_before_destroy = true` lifecycle setting.
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
    ///     var example = new Harness.Cloudprovider.Datacenter("example", new()
    ///     {
    ///         Name = "example",
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Import using the Harness datacenter cloud provider id.
    /// 
    /// ```sh
    /// $ pulumi import harness:cloudprovider/datacenter:Datacenter example &lt;provider_id&gt;
    /// ```
    /// </summary>
    [HarnessResourceType("harness:cloudprovider/datacenter:Datacenter")]
    public partial class Datacenter : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The name of the cloud provider.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// This block is used for scoping the resource to a specific set of applications or environments.
        /// </summary>
        [Output("usageScopes")]
        public Output<ImmutableArray<Outputs.DatacenterUsageScope>> UsageScopes { get; private set; } = null!;


        /// <summary>
        /// Create a Datacenter resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Datacenter(string name, DatacenterArgs? args = null, CustomResourceOptions? options = null)
            : base("harness:cloudprovider/datacenter:Datacenter", name, args ?? new DatacenterArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Datacenter(string name, Input<string> id, DatacenterState? state = null, CustomResourceOptions? options = null)
            : base("harness:cloudprovider/datacenter:Datacenter", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing Datacenter resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Datacenter Get(string name, Input<string> id, DatacenterState? state = null, CustomResourceOptions? options = null)
        {
            return new Datacenter(name, id, state, options);
        }
    }

    public sealed class DatacenterArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The name of the cloud provider.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("usageScopes")]
        private InputList<Inputs.DatacenterUsageScopeArgs>? _usageScopes;

        /// <summary>
        /// This block is used for scoping the resource to a specific set of applications or environments.
        /// </summary>
        public InputList<Inputs.DatacenterUsageScopeArgs> UsageScopes
        {
            get => _usageScopes ?? (_usageScopes = new InputList<Inputs.DatacenterUsageScopeArgs>());
            set => _usageScopes = value;
        }

        public DatacenterArgs()
        {
        }
        public static new DatacenterArgs Empty => new DatacenterArgs();
    }

    public sealed class DatacenterState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The name of the cloud provider.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("usageScopes")]
        private InputList<Inputs.DatacenterUsageScopeGetArgs>? _usageScopes;

        /// <summary>
        /// This block is used for scoping the resource to a specific set of applications or environments.
        /// </summary>
        public InputList<Inputs.DatacenterUsageScopeGetArgs> UsageScopes
        {
            get => _usageScopes ?? (_usageScopes = new InputList<Inputs.DatacenterUsageScopeGetArgs>());
            set => _usageScopes = value;
        }

        public DatacenterState()
        {
        }
        public static new DatacenterState Empty => new DatacenterState();
    }
}
