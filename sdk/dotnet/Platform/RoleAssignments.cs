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
    /// ## Example Usage
    /// 
    /// ## Import
    /// 
    /// Import account level role assignments
    /// 
    /// ```sh
    /// $ pulumi import harness:platform/roleAssignments:RoleAssignments example &lt;role_assignments_id&gt;
    /// ```
    /// 
    /// Import org level role assignments
    /// 
    /// ```sh
    /// $ pulumi import harness:platform/roleAssignments:RoleAssignments example &lt;ord_id&gt;/&lt;role_assignments_id&gt;
    /// ```
    /// 
    /// Import project level role assignments
    /// 
    /// ```sh
    /// $ pulumi import harness:platform/roleAssignments:RoleAssignments example &lt;org_id&gt;/&lt;project_id&gt;/&lt;role_assignments_id&gt;
    /// ```
    /// </summary>
    [HarnessResourceType("harness:platform/roleAssignments:RoleAssignments")]
    public partial class RoleAssignments : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The `disabled` attribute in the role assignment resource controls the status of the role assignment. Setting `disabled` to `false` activates the role and its permissions, enabling the assigned entity to perform allowed actions. Conversely, setting `disabled` to `true` deactivates the role, revoking the entity's permissions and action capabilities. Default value should be `false`.
        /// </summary>
        [Output("disabled")]
        public Output<bool?> Disabled { get; private set; } = null!;

        /// <summary>
        /// Identifier for role assignment.
        /// </summary>
        [Output("identifier")]
        public Output<string> Identifier { get; private set; } = null!;

        /// <summary>
        /// Specifies whether the role assignment is managed by Harness. Setting managed to `true` means that Harness will manage the lifecycle of the role assignment, including its creation, updates, and deletion. Conversely, setting it to `false` indicates that the role assignment is not managed by Harness, and thus Harness will not perform actions on it. Default value should be `false`.
        /// </summary>
        [Output("managed")]
        public Output<bool?> Managed { get; private set; } = null!;

        /// <summary>
        /// Org identifier.
        /// </summary>
        [Output("orgId")]
        public Output<string?> OrgId { get; private set; } = null!;

        /// <summary>
        /// Principal.
        /// </summary>
        [Output("principals")]
        public Output<ImmutableArray<Outputs.RoleAssignmentsPrincipal>> Principals { get; private set; } = null!;

        /// <summary>
        /// Project Identifier
        /// </summary>
        [Output("projectId")]
        public Output<string?> ProjectId { get; private set; } = null!;

        /// <summary>
        /// Resource group identifier.
        /// </summary>
        [Output("resourceGroupIdentifier")]
        public Output<string> ResourceGroupIdentifier { get; private set; } = null!;

        /// <summary>
        /// Role identifier.
        /// </summary>
        [Output("roleIdentifier")]
        public Output<string> RoleIdentifier { get; private set; } = null!;


        /// <summary>
        /// Create a RoleAssignments resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public RoleAssignments(string name, RoleAssignmentsArgs args, CustomResourceOptions? options = null)
            : base("harness:platform/roleAssignments:RoleAssignments", name, args ?? new RoleAssignmentsArgs(), MakeResourceOptions(options, ""))
        {
        }

        private RoleAssignments(string name, Input<string> id, RoleAssignmentsState? state = null, CustomResourceOptions? options = null)
            : base("harness:platform/roleAssignments:RoleAssignments", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing RoleAssignments resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static RoleAssignments Get(string name, Input<string> id, RoleAssignmentsState? state = null, CustomResourceOptions? options = null)
        {
            return new RoleAssignments(name, id, state, options);
        }
    }

    public sealed class RoleAssignmentsArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The `disabled` attribute in the role assignment resource controls the status of the role assignment. Setting `disabled` to `false` activates the role and its permissions, enabling the assigned entity to perform allowed actions. Conversely, setting `disabled` to `true` deactivates the role, revoking the entity's permissions and action capabilities. Default value should be `false`.
        /// </summary>
        [Input("disabled")]
        public Input<bool>? Disabled { get; set; }

        /// <summary>
        /// Identifier for role assignment.
        /// </summary>
        [Input("identifier")]
        public Input<string>? Identifier { get; set; }

        /// <summary>
        /// Specifies whether the role assignment is managed by Harness. Setting managed to `true` means that Harness will manage the lifecycle of the role assignment, including its creation, updates, and deletion. Conversely, setting it to `false` indicates that the role assignment is not managed by Harness, and thus Harness will not perform actions on it. Default value should be `false`.
        /// </summary>
        [Input("managed")]
        public Input<bool>? Managed { get; set; }

        /// <summary>
        /// Org identifier.
        /// </summary>
        [Input("orgId")]
        public Input<string>? OrgId { get; set; }

        [Input("principals", required: true)]
        private InputList<Inputs.RoleAssignmentsPrincipalArgs>? _principals;

        /// <summary>
        /// Principal.
        /// </summary>
        public InputList<Inputs.RoleAssignmentsPrincipalArgs> Principals
        {
            get => _principals ?? (_principals = new InputList<Inputs.RoleAssignmentsPrincipalArgs>());
            set => _principals = value;
        }

        /// <summary>
        /// Project Identifier
        /// </summary>
        [Input("projectId")]
        public Input<string>? ProjectId { get; set; }

        /// <summary>
        /// Resource group identifier.
        /// </summary>
        [Input("resourceGroupIdentifier", required: true)]
        public Input<string> ResourceGroupIdentifier { get; set; } = null!;

        /// <summary>
        /// Role identifier.
        /// </summary>
        [Input("roleIdentifier", required: true)]
        public Input<string> RoleIdentifier { get; set; } = null!;

        public RoleAssignmentsArgs()
        {
        }
        public static new RoleAssignmentsArgs Empty => new RoleAssignmentsArgs();
    }

    public sealed class RoleAssignmentsState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The `disabled` attribute in the role assignment resource controls the status of the role assignment. Setting `disabled` to `false` activates the role and its permissions, enabling the assigned entity to perform allowed actions. Conversely, setting `disabled` to `true` deactivates the role, revoking the entity's permissions and action capabilities. Default value should be `false`.
        /// </summary>
        [Input("disabled")]
        public Input<bool>? Disabled { get; set; }

        /// <summary>
        /// Identifier for role assignment.
        /// </summary>
        [Input("identifier")]
        public Input<string>? Identifier { get; set; }

        /// <summary>
        /// Specifies whether the role assignment is managed by Harness. Setting managed to `true` means that Harness will manage the lifecycle of the role assignment, including its creation, updates, and deletion. Conversely, setting it to `false` indicates that the role assignment is not managed by Harness, and thus Harness will not perform actions on it. Default value should be `false`.
        /// </summary>
        [Input("managed")]
        public Input<bool>? Managed { get; set; }

        /// <summary>
        /// Org identifier.
        /// </summary>
        [Input("orgId")]
        public Input<string>? OrgId { get; set; }

        [Input("principals")]
        private InputList<Inputs.RoleAssignmentsPrincipalGetArgs>? _principals;

        /// <summary>
        /// Principal.
        /// </summary>
        public InputList<Inputs.RoleAssignmentsPrincipalGetArgs> Principals
        {
            get => _principals ?? (_principals = new InputList<Inputs.RoleAssignmentsPrincipalGetArgs>());
            set => _principals = value;
        }

        /// <summary>
        /// Project Identifier
        /// </summary>
        [Input("projectId")]
        public Input<string>? ProjectId { get; set; }

        /// <summary>
        /// Resource group identifier.
        /// </summary>
        [Input("resourceGroupIdentifier")]
        public Input<string>? ResourceGroupIdentifier { get; set; }

        /// <summary>
        /// Role identifier.
        /// </summary>
        [Input("roleIdentifier")]
        public Input<string>? RoleIdentifier { get; set; }

        public RoleAssignmentsState()
        {
        }
        public static new RoleAssignmentsState Empty => new RoleAssignmentsState();
    }
}
