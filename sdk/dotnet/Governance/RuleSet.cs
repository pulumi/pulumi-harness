// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Harness.Governance
{
    /// <summary>
    /// Resource for creating, updating, and managing rule.
    /// </summary>
    [HarnessResourceType("harness:governance/ruleSet:RuleSet")]
    public partial class RuleSet : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The cloud provider for the rule set. It should be either AWS, AZURE or GCP.
        /// </summary>
        [Output("cloudProvider")]
        public Output<string> CloudProvider { get; private set; } = null!;

        /// <summary>
        /// Description for rule set.
        /// </summary>
        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        /// <summary>
        /// Name of the rule set.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// List of rule IDs
        /// </summary>
        [Output("ruleIds")]
        public Output<ImmutableArray<string>> RuleIds { get; private set; } = null!;

        /// <summary>
        /// Id of the rule.
        /// </summary>
        [Output("ruleSetId")]
        public Output<string> RuleSetId { get; private set; } = null!;


        /// <summary>
        /// Create a RuleSet resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public RuleSet(string name, RuleSetArgs args, CustomResourceOptions? options = null)
            : base("harness:governance/ruleSet:RuleSet", name, args ?? new RuleSetArgs(), MakeResourceOptions(options, ""))
        {
        }

        private RuleSet(string name, Input<string> id, RuleSetState? state = null, CustomResourceOptions? options = null)
            : base("harness:governance/ruleSet:RuleSet", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing RuleSet resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static RuleSet Get(string name, Input<string> id, RuleSetState? state = null, CustomResourceOptions? options = null)
        {
            return new RuleSet(name, id, state, options);
        }
    }

    public sealed class RuleSetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The cloud provider for the rule set. It should be either AWS, AZURE or GCP.
        /// </summary>
        [Input("cloudProvider", required: true)]
        public Input<string> CloudProvider { get; set; } = null!;

        /// <summary>
        /// Description for rule set.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// Name of the rule set.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("ruleIds", required: true)]
        private InputList<string>? _ruleIds;

        /// <summary>
        /// List of rule IDs
        /// </summary>
        public InputList<string> RuleIds
        {
            get => _ruleIds ?? (_ruleIds = new InputList<string>());
            set => _ruleIds = value;
        }

        public RuleSetArgs()
        {
        }
        public static new RuleSetArgs Empty => new RuleSetArgs();
    }

    public sealed class RuleSetState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The cloud provider for the rule set. It should be either AWS, AZURE or GCP.
        /// </summary>
        [Input("cloudProvider")]
        public Input<string>? CloudProvider { get; set; }

        /// <summary>
        /// Description for rule set.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// Name of the rule set.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("ruleIds")]
        private InputList<string>? _ruleIds;

        /// <summary>
        /// List of rule IDs
        /// </summary>
        public InputList<string> RuleIds
        {
            get => _ruleIds ?? (_ruleIds = new InputList<string>());
            set => _ruleIds = value;
        }

        /// <summary>
        /// Id of the rule.
        /// </summary>
        [Input("ruleSetId")]
        public Input<string>? RuleSetId { get; set; }

        public RuleSetState()
        {
        }
        public static new RuleSetState Empty => new RuleSetState();
    }
}
