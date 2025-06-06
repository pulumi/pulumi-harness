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
    /// Resource for adding a user to a group.
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
    ///     var exampleUser = Harness.GetUser.Invoke(new()
    ///     {
    ///         Email = "testuser@example.com",
    ///     });
    /// 
    ///     var admin = new Harness.UserGroup("admin", new()
    ///     {
    ///         Name = "admin",
    ///     });
    /// 
    ///     var exampleAddUserToGroups = new Harness.AddUserToGroup("example_add_user_to_groups", new()
    ///     {
    ///         GroupId = admin.Id,
    ///         UserId = test.Id,
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Import using the Harness user and user group id
    /// 
    /// ```sh
    /// $ pulumi import harness:index/addUserToGroup:AddUserToGroup example_admin &lt;user_id&gt;/&lt;group_id&gt;
    /// ```
    /// </summary>
    [HarnessResourceType("harness:index/addUserToGroup:AddUserToGroup")]
    public partial class AddUserToGroup : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The name of the user.
        /// </summary>
        [Output("groupId")]
        public Output<string> GroupId { get; private set; } = null!;

        /// <summary>
        /// Unique identifier of the user.
        /// </summary>
        [Output("userId")]
        public Output<string> UserId { get; private set; } = null!;


        /// <summary>
        /// Create a AddUserToGroup resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public AddUserToGroup(string name, AddUserToGroupArgs args, CustomResourceOptions? options = null)
            : base("harness:index/addUserToGroup:AddUserToGroup", name, args ?? new AddUserToGroupArgs(), MakeResourceOptions(options, ""))
        {
        }

        private AddUserToGroup(string name, Input<string> id, AddUserToGroupState? state = null, CustomResourceOptions? options = null)
            : base("harness:index/addUserToGroup:AddUserToGroup", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing AddUserToGroup resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static AddUserToGroup Get(string name, Input<string> id, AddUserToGroupState? state = null, CustomResourceOptions? options = null)
        {
            return new AddUserToGroup(name, id, state, options);
        }
    }

    public sealed class AddUserToGroupArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The name of the user.
        /// </summary>
        [Input("groupId", required: true)]
        public Input<string> GroupId { get; set; } = null!;

        /// <summary>
        /// Unique identifier of the user.
        /// </summary>
        [Input("userId", required: true)]
        public Input<string> UserId { get; set; } = null!;

        public AddUserToGroupArgs()
        {
        }
        public static new AddUserToGroupArgs Empty => new AddUserToGroupArgs();
    }

    public sealed class AddUserToGroupState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The name of the user.
        /// </summary>
        [Input("groupId")]
        public Input<string>? GroupId { get; set; }

        /// <summary>
        /// Unique identifier of the user.
        /// </summary>
        [Input("userId")]
        public Input<string>? UserId { get; set; }

        public AddUserToGroupState()
        {
        }
        public static new AddUserToGroupState Empty => new AddUserToGroupState();
    }
}
