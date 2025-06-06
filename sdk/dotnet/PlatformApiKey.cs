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
    /// Resource for creating and managing Harness API Keys. API Keys can be created at the account, organization, or project level.
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
    ///     // Create API Key at account level
    ///     var accountLevel = new Harness.PlatformApiKey("account_level", new()
    ///     {
    ///         Identifier = "test_apikey",
    ///         Name = "test_apikey",
    ///         ParentId = "parent_id",
    ///         ApikeyType = "USER",
    ///         AccountId = "account_id",
    ///     });
    /// 
    ///     // Create API Key at organization level
    ///     var orgLevel = new Harness.PlatformApiKey("org_level", new()
    ///     {
    ///         Identifier = "test_apikey",
    ///         Name = "test_apikey",
    ///         ParentId = "parent_id",
    ///         ApikeyType = "USER",
    ///         AccountId = "account_id",
    ///         OrgId = "org_id",
    ///     });
    /// 
    ///     // Create API Key at project level
    ///     var projectLevel = new Harness.PlatformApiKey("project_level", new()
    ///     {
    ///         Identifier = "test_apikey",
    ///         Name = "test_apikey",
    ///         ParentId = "parent_id",
    ///         ApikeyType = "USER",
    ///         AccountId = "account_id",
    ///         OrgId = "org_id",
    ///         ProjectId = "project_id",
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Import account level apikey
    /// 
    /// ```sh
    /// $ pulumi import harness:index/platformApiKey:PlatformApiKey harness_platform_apikey &lt;parent_id&gt;/&lt;apikey_id&gt;/&lt;apikey_type&gt;
    /// ```
    /// 
    /// Import org level apikey
    /// 
    /// ```sh
    /// $ pulumi import harness:index/platformApiKey:PlatformApiKey harness_platform_apikey &lt;org_id&gt;/&lt;parent_id&gt;/&lt;apikey_id&gt;/&lt;apikey_type&gt;
    /// ```
    /// 
    /// Import project level apikey
    /// 
    /// ```sh
    /// $ pulumi import harness:index/platformApiKey:PlatformApiKey harness_platform_apikey &lt;org_id&gt;/&lt;project_id&gt;/&lt;parent_id&gt;/&lt;apikey_id&gt;/&lt;apikey_type&gt;
    /// ```
    /// </summary>
    [HarnessResourceType("harness:index/platformApiKey:PlatformApiKey")]
    public partial class PlatformApiKey : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Account Identifier for the Entity
        /// </summary>
        [Output("accountId")]
        public Output<string> AccountId { get; private set; } = null!;

        /// <summary>
        /// Type of the API Key
        /// </summary>
        [Output("apikeyType")]
        public Output<string> ApikeyType { get; private set; } = null!;

        /// <summary>
        /// Default expiration time of the Token within API Key
        /// </summary>
        [Output("defaultTimeToExpireToken")]
        public Output<int?> DefaultTimeToExpireToken { get; private set; } = null!;

        /// <summary>
        /// Description of the resource.
        /// </summary>
        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        /// <summary>
        /// Unique identifier of the resource.
        /// </summary>
        [Output("identifier")]
        public Output<string> Identifier { get; private set; } = null!;

        /// <summary>
        /// Name of the resource.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// Unique identifier of the organization.
        /// </summary>
        [Output("orgId")]
        public Output<string?> OrgId { get; private set; } = null!;

        /// <summary>
        /// Parent Entity Identifier of the API Key
        /// </summary>
        [Output("parentId")]
        public Output<string> ParentId { get; private set; } = null!;

        /// <summary>
        /// Unique identifier of the project.
        /// </summary>
        [Output("projectId")]
        public Output<string?> ProjectId { get; private set; } = null!;

        /// <summary>
        /// Tags to associate with the resource.
        /// </summary>
        [Output("tags")]
        public Output<ImmutableArray<string>> Tags { get; private set; } = null!;


        /// <summary>
        /// Create a PlatformApiKey resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public PlatformApiKey(string name, PlatformApiKeyArgs args, CustomResourceOptions? options = null)
            : base("harness:index/platformApiKey:PlatformApiKey", name, args ?? new PlatformApiKeyArgs(), MakeResourceOptions(options, ""))
        {
        }

        private PlatformApiKey(string name, Input<string> id, PlatformApiKeyState? state = null, CustomResourceOptions? options = null)
            : base("harness:index/platformApiKey:PlatformApiKey", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing PlatformApiKey resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static PlatformApiKey Get(string name, Input<string> id, PlatformApiKeyState? state = null, CustomResourceOptions? options = null)
        {
            return new PlatformApiKey(name, id, state, options);
        }
    }

    public sealed class PlatformApiKeyArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Account Identifier for the Entity
        /// </summary>
        [Input("accountId", required: true)]
        public Input<string> AccountId { get; set; } = null!;

        /// <summary>
        /// Type of the API Key
        /// </summary>
        [Input("apikeyType", required: true)]
        public Input<string> ApikeyType { get; set; } = null!;

        /// <summary>
        /// Default expiration time of the Token within API Key
        /// </summary>
        [Input("defaultTimeToExpireToken")]
        public Input<int>? DefaultTimeToExpireToken { get; set; }

        /// <summary>
        /// Description of the resource.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

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
        /// Parent Entity Identifier of the API Key
        /// </summary>
        [Input("parentId", required: true)]
        public Input<string> ParentId { get; set; } = null!;

        /// <summary>
        /// Unique identifier of the project.
        /// </summary>
        [Input("projectId")]
        public Input<string>? ProjectId { get; set; }

        [Input("tags")]
        private InputList<string>? _tags;

        /// <summary>
        /// Tags to associate with the resource.
        /// </summary>
        public InputList<string> Tags
        {
            get => _tags ?? (_tags = new InputList<string>());
            set => _tags = value;
        }

        public PlatformApiKeyArgs()
        {
        }
        public static new PlatformApiKeyArgs Empty => new PlatformApiKeyArgs();
    }

    public sealed class PlatformApiKeyState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Account Identifier for the Entity
        /// </summary>
        [Input("accountId")]
        public Input<string>? AccountId { get; set; }

        /// <summary>
        /// Type of the API Key
        /// </summary>
        [Input("apikeyType")]
        public Input<string>? ApikeyType { get; set; }

        /// <summary>
        /// Default expiration time of the Token within API Key
        /// </summary>
        [Input("defaultTimeToExpireToken")]
        public Input<int>? DefaultTimeToExpireToken { get; set; }

        /// <summary>
        /// Description of the resource.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// Unique identifier of the resource.
        /// </summary>
        [Input("identifier")]
        public Input<string>? Identifier { get; set; }

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
        /// Parent Entity Identifier of the API Key
        /// </summary>
        [Input("parentId")]
        public Input<string>? ParentId { get; set; }

        /// <summary>
        /// Unique identifier of the project.
        /// </summary>
        [Input("projectId")]
        public Input<string>? ProjectId { get; set; }

        [Input("tags")]
        private InputList<string>? _tags;

        /// <summary>
        /// Tags to associate with the resource.
        /// </summary>
        public InputList<string> Tags
        {
            get => _tags ?? (_tags = new InputList<string>());
            set => _tags = value;
        }

        public PlatformApiKeyState()
        {
        }
        public static new PlatformApiKeyState Empty => new PlatformApiKeyState();
    }
}
