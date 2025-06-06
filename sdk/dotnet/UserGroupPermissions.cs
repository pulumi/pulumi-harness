// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Harness
{
    /// <summary>
    /// Resource for adding permissions to an existing Harness user group.
    /// </summary>
    [HarnessResourceType("harness:index/userGroupPermissions:UserGroupPermissions")]
    public partial class UserGroupPermissions : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The account permissions of the user group. Valid options are ADMINISTER*OTHER*ACCOUNT*FUNCTIONS, CREATE*AND*DELETE*APPLICATION, CREATE*CUSTOM*DASHBOARDS, MANAGE*ALERT*NOTIFICATION*RULES, MANAGE*API*KEYS, MANAGE*APPLICATION*STACKS, MANAGE*AUTHENTICATION*SETTINGS, MANAGE*CLOUD*PROVIDERS, MANAGE*CONFIG*AS*CODE, MANAGE*CONNECTORS, MANAGE*CUSTOM*DASHBOARDS, MANAGE*DELEGATE*PROFILES, MANAGE*DELEGATES, MANAGE*DEPLOYMENT*FREEZES, MANAGE*IP*WHITELIST, MANAGE*PIPELINE*GOVERNANCE*STANDARDS, MANAGE*RESTRICTED*ACCESS, MANAGE*SECRET*MANAGERS, MANAGE*SECRETS, MANAGE*SSH*AND*WINRM, MANAGE*TAGS, MANAGE*TEMPLATE*LIBRARY, MANAGE*USER*AND*USER*GROUPS*AND*API*KEYS, MANAGE*USERS*AND*GROUPS, READ*USERS*AND*GROUPS, VIEW*AUDITS, VIEW*USER*AND*USER*GROUPS*AND*API_KEYS
        /// </summary>
        [Output("accountPermissions")]
        public Output<ImmutableArray<string>> AccountPermissions { get; private set; } = null!;

        /// <summary>
        /// Application specific permissions
        /// </summary>
        [Output("appPermissions")]
        public Output<Outputs.UserGroupPermissionsAppPermissions?> AppPermissions { get; private set; } = null!;

        /// <summary>
        /// Unique identifier of the user group.
        /// </summary>
        [Output("userGroupId")]
        public Output<string> UserGroupId { get; private set; } = null!;


        /// <summary>
        /// Create a UserGroupPermissions resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public UserGroupPermissions(string name, UserGroupPermissionsArgs args, CustomResourceOptions? options = null)
            : base("harness:index/userGroupPermissions:UserGroupPermissions", name, args ?? new UserGroupPermissionsArgs(), MakeResourceOptions(options, ""))
        {
        }

        private UserGroupPermissions(string name, Input<string> id, UserGroupPermissionsState? state = null, CustomResourceOptions? options = null)
            : base("harness:index/userGroupPermissions:UserGroupPermissions", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing UserGroupPermissions resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static UserGroupPermissions Get(string name, Input<string> id, UserGroupPermissionsState? state = null, CustomResourceOptions? options = null)
        {
            return new UserGroupPermissions(name, id, state, options);
        }
    }

    public sealed class UserGroupPermissionsArgs : global::Pulumi.ResourceArgs
    {
        [Input("accountPermissions")]
        private InputList<string>? _accountPermissions;

        /// <summary>
        /// The account permissions of the user group. Valid options are ADMINISTER*OTHER*ACCOUNT*FUNCTIONS, CREATE*AND*DELETE*APPLICATION, CREATE*CUSTOM*DASHBOARDS, MANAGE*ALERT*NOTIFICATION*RULES, MANAGE*API*KEYS, MANAGE*APPLICATION*STACKS, MANAGE*AUTHENTICATION*SETTINGS, MANAGE*CLOUD*PROVIDERS, MANAGE*CONFIG*AS*CODE, MANAGE*CONNECTORS, MANAGE*CUSTOM*DASHBOARDS, MANAGE*DELEGATE*PROFILES, MANAGE*DELEGATES, MANAGE*DEPLOYMENT*FREEZES, MANAGE*IP*WHITELIST, MANAGE*PIPELINE*GOVERNANCE*STANDARDS, MANAGE*RESTRICTED*ACCESS, MANAGE*SECRET*MANAGERS, MANAGE*SECRETS, MANAGE*SSH*AND*WINRM, MANAGE*TAGS, MANAGE*TEMPLATE*LIBRARY, MANAGE*USER*AND*USER*GROUPS*AND*API*KEYS, MANAGE*USERS*AND*GROUPS, READ*USERS*AND*GROUPS, VIEW*AUDITS, VIEW*USER*AND*USER*GROUPS*AND*API_KEYS
        /// </summary>
        public InputList<string> AccountPermissions
        {
            get => _accountPermissions ?? (_accountPermissions = new InputList<string>());
            set => _accountPermissions = value;
        }

        /// <summary>
        /// Application specific permissions
        /// </summary>
        [Input("appPermissions")]
        public Input<Inputs.UserGroupPermissionsAppPermissionsArgs>? AppPermissions { get; set; }

        /// <summary>
        /// Unique identifier of the user group.
        /// </summary>
        [Input("userGroupId", required: true)]
        public Input<string> UserGroupId { get; set; } = null!;

        public UserGroupPermissionsArgs()
        {
        }
        public static new UserGroupPermissionsArgs Empty => new UserGroupPermissionsArgs();
    }

    public sealed class UserGroupPermissionsState : global::Pulumi.ResourceArgs
    {
        [Input("accountPermissions")]
        private InputList<string>? _accountPermissions;

        /// <summary>
        /// The account permissions of the user group. Valid options are ADMINISTER*OTHER*ACCOUNT*FUNCTIONS, CREATE*AND*DELETE*APPLICATION, CREATE*CUSTOM*DASHBOARDS, MANAGE*ALERT*NOTIFICATION*RULES, MANAGE*API*KEYS, MANAGE*APPLICATION*STACKS, MANAGE*AUTHENTICATION*SETTINGS, MANAGE*CLOUD*PROVIDERS, MANAGE*CONFIG*AS*CODE, MANAGE*CONNECTORS, MANAGE*CUSTOM*DASHBOARDS, MANAGE*DELEGATE*PROFILES, MANAGE*DELEGATES, MANAGE*DEPLOYMENT*FREEZES, MANAGE*IP*WHITELIST, MANAGE*PIPELINE*GOVERNANCE*STANDARDS, MANAGE*RESTRICTED*ACCESS, MANAGE*SECRET*MANAGERS, MANAGE*SECRETS, MANAGE*SSH*AND*WINRM, MANAGE*TAGS, MANAGE*TEMPLATE*LIBRARY, MANAGE*USER*AND*USER*GROUPS*AND*API*KEYS, MANAGE*USERS*AND*GROUPS, READ*USERS*AND*GROUPS, VIEW*AUDITS, VIEW*USER*AND*USER*GROUPS*AND*API_KEYS
        /// </summary>
        public InputList<string> AccountPermissions
        {
            get => _accountPermissions ?? (_accountPermissions = new InputList<string>());
            set => _accountPermissions = value;
        }

        /// <summary>
        /// Application specific permissions
        /// </summary>
        [Input("appPermissions")]
        public Input<Inputs.UserGroupPermissionsAppPermissionsGetArgs>? AppPermissions { get; set; }

        /// <summary>
        /// Unique identifier of the user group.
        /// </summary>
        [Input("userGroupId")]
        public Input<string>? UserGroupId { get; set; }

        public UserGroupPermissionsState()
        {
        }
        public static new UserGroupPermissionsState Empty => new UserGroupPermissionsState();
    }
}
