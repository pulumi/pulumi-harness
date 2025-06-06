// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Harness.Platform
{
    [HarnessResourceType("harness:platform/overrides:Overrides")]
    public partial class Overrides : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The cluster ID to which the overrides are associated.
        /// </summary>
        [Output("clusterId")]
        public Output<string> ClusterId { get; private set; } = null!;

        /// <summary>
        /// The environment ID to which the overrides are associated.
        /// </summary>
        [Output("envId")]
        public Output<string> EnvId { get; private set; } = null!;

        /// <summary>
        /// Contains parameters related to creating an Entity for Git Experience.
        /// </summary>
        [Output("gitDetails")]
        public Output<Outputs.OverridesGitDetails> GitDetails { get; private set; } = null!;

        /// <summary>
        /// The identifier of the override entity.
        /// </summary>
        [Output("identifier")]
        public Output<string> Identifier { get; private set; } = null!;

        /// <summary>
        /// import override from git
        /// </summary>
        [Output("importFromGit")]
        public Output<bool> ImportFromGit { get; private set; } = null!;

        /// <summary>
        /// The infrastructure ID to which the overrides are associated.
        /// </summary>
        [Output("infraId")]
        public Output<string> InfraId { get; private set; } = null!;

        /// <summary>
        /// force import override from remote even if same file path already exist
        /// </summary>
        [Output("isForceImport")]
        public Output<bool> IsForceImport { get; private set; } = null!;

        /// <summary>
        /// Unique identifier of the organization.
        /// </summary>
        [Output("orgId")]
        public Output<string?> OrgId { get; private set; } = null!;

        /// <summary>
        /// Unique identifier of the project.
        /// </summary>
        [Output("projectId")]
        public Output<string?> ProjectId { get; private set; } = null!;

        /// <summary>
        /// The service ID to which the overrides applies.
        /// </summary>
        [Output("serviceId")]
        public Output<string> ServiceId { get; private set; } = null!;

        /// <summary>
        /// The type of the overrides.
        /// </summary>
        [Output("type")]
        public Output<string> Type { get; private set; } = null!;

        /// <summary>
        /// The yaml of the override entity
        /// </summary>
        [Output("yaml")]
        public Output<string> Yaml { get; private set; } = null!;


        /// <summary>
        /// Create a Overrides resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Overrides(string name, OverridesArgs args, CustomResourceOptions? options = null)
            : base("harness:platform/overrides:Overrides", name, args ?? new OverridesArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Overrides(string name, Input<string> id, OverridesState? state = null, CustomResourceOptions? options = null)
            : base("harness:platform/overrides:Overrides", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing Overrides resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Overrides Get(string name, Input<string> id, OverridesState? state = null, CustomResourceOptions? options = null)
        {
            return new Overrides(name, id, state, options);
        }
    }

    public sealed class OverridesArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The cluster ID to which the overrides are associated.
        /// </summary>
        [Input("clusterId")]
        public Input<string>? ClusterId { get; set; }

        /// <summary>
        /// The environment ID to which the overrides are associated.
        /// </summary>
        [Input("envId", required: true)]
        public Input<string> EnvId { get; set; } = null!;

        /// <summary>
        /// Contains parameters related to creating an Entity for Git Experience.
        /// </summary>
        [Input("gitDetails")]
        public Input<Inputs.OverridesGitDetailsArgs>? GitDetails { get; set; }

        /// <summary>
        /// The identifier of the override entity.
        /// </summary>
        [Input("identifier")]
        public Input<string>? Identifier { get; set; }

        /// <summary>
        /// import override from git
        /// </summary>
        [Input("importFromGit")]
        public Input<bool>? ImportFromGit { get; set; }

        /// <summary>
        /// The infrastructure ID to which the overrides are associated.
        /// </summary>
        [Input("infraId")]
        public Input<string>? InfraId { get; set; }

        /// <summary>
        /// force import override from remote even if same file path already exist
        /// </summary>
        [Input("isForceImport")]
        public Input<bool>? IsForceImport { get; set; }

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

        /// <summary>
        /// The service ID to which the overrides applies.
        /// </summary>
        [Input("serviceId")]
        public Input<string>? ServiceId { get; set; }

        /// <summary>
        /// The type of the overrides.
        /// </summary>
        [Input("type", required: true)]
        public Input<string> Type { get; set; } = null!;

        /// <summary>
        /// The yaml of the override entity
        /// </summary>
        [Input("yaml")]
        public Input<string>? Yaml { get; set; }

        public OverridesArgs()
        {
        }
        public static new OverridesArgs Empty => new OverridesArgs();
    }

    public sealed class OverridesState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The cluster ID to which the overrides are associated.
        /// </summary>
        [Input("clusterId")]
        public Input<string>? ClusterId { get; set; }

        /// <summary>
        /// The environment ID to which the overrides are associated.
        /// </summary>
        [Input("envId")]
        public Input<string>? EnvId { get; set; }

        /// <summary>
        /// Contains parameters related to creating an Entity for Git Experience.
        /// </summary>
        [Input("gitDetails")]
        public Input<Inputs.OverridesGitDetailsGetArgs>? GitDetails { get; set; }

        /// <summary>
        /// The identifier of the override entity.
        /// </summary>
        [Input("identifier")]
        public Input<string>? Identifier { get; set; }

        /// <summary>
        /// import override from git
        /// </summary>
        [Input("importFromGit")]
        public Input<bool>? ImportFromGit { get; set; }

        /// <summary>
        /// The infrastructure ID to which the overrides are associated.
        /// </summary>
        [Input("infraId")]
        public Input<string>? InfraId { get; set; }

        /// <summary>
        /// force import override from remote even if same file path already exist
        /// </summary>
        [Input("isForceImport")]
        public Input<bool>? IsForceImport { get; set; }

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

        /// <summary>
        /// The service ID to which the overrides applies.
        /// </summary>
        [Input("serviceId")]
        public Input<string>? ServiceId { get; set; }

        /// <summary>
        /// The type of the overrides.
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        /// <summary>
        /// The yaml of the override entity
        /// </summary>
        [Input("yaml")]
        public Input<string>? Yaml { get; set; }

        public OverridesState()
        {
        }
        public static new OverridesState Empty => new OverridesState();
    }
}
