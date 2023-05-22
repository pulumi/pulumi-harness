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
    /// <summary>
    /// Resource for creating a Spot connector.
    /// 
    /// ## Example Usage
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Harness = Lbrlabs.PulumiPackage.Harness;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var spot = new Harness.Platform.ConnectorSpot("spot", new()
    ///     {
    ///         Description = "description of spot connector",
    ///         Identifier = "example_spot_cloud_provider",
    ///         PermanentToken = new Harness.Platform.Inputs.ConnectorSpotPermanentTokenArgs
    ///         {
    ///             ApiTokenRef = "account.TEST_spot_api_token",
    ///             DelegateSelectors = new[]
    ///             {
    ///                 "harness-delegate",
    ///             },
    ///             ExecuteOnDelegate = false,
    ///             SpotAccountId = "&lt;my-account-id&gt;",
    ///         },
    ///         Tags = new[]
    ///         {
    ///             "foo:bar",
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Import using spot cloud provider connector id
    /// 
    /// ```sh
    ///  $ pulumi import harness:platform/connectorSpot:ConnectorSpot example &lt;connector_id&gt;
    /// ```
    /// </summary>
    [HarnessResourceType("harness:platform/connectorSpot:ConnectorSpot")]
    public partial class ConnectorSpot : global::Pulumi.CustomResource
    {
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
        /// Authenticate to Spot using account id and permanent token.
        /// </summary>
        [Output("permanentToken")]
        public Output<Outputs.ConnectorSpotPermanentToken> PermanentToken { get; private set; } = null!;

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
        /// Create a ConnectorSpot resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public ConnectorSpot(string name, ConnectorSpotArgs args, CustomResourceOptions? options = null)
            : base("harness:platform/connectorSpot:ConnectorSpot", name, args ?? new ConnectorSpotArgs(), MakeResourceOptions(options, ""))
        {
        }

        private ConnectorSpot(string name, Input<string> id, ConnectorSpotState? state = null, CustomResourceOptions? options = null)
            : base("harness:platform/connectorSpot:ConnectorSpot", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
                PluginDownloadURL = "github://api.github.com/lbrlabs",
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing ConnectorSpot resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static ConnectorSpot Get(string name, Input<string> id, ConnectorSpotState? state = null, CustomResourceOptions? options = null)
        {
            return new ConnectorSpot(name, id, state, options);
        }
    }

    public sealed class ConnectorSpotArgs : global::Pulumi.ResourceArgs
    {
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
        /// Authenticate to Spot using account id and permanent token.
        /// </summary>
        [Input("permanentToken", required: true)]
        public Input<Inputs.ConnectorSpotPermanentTokenArgs> PermanentToken { get; set; } = null!;

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

        public ConnectorSpotArgs()
        {
        }
        public static new ConnectorSpotArgs Empty => new ConnectorSpotArgs();
    }

    public sealed class ConnectorSpotState : global::Pulumi.ResourceArgs
    {
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
        /// Authenticate to Spot using account id and permanent token.
        /// </summary>
        [Input("permanentToken")]
        public Input<Inputs.ConnectorSpotPermanentTokenGetArgs>? PermanentToken { get; set; }

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

        public ConnectorSpotState()
        {
        }
        public static new ConnectorSpotState Empty => new ConnectorSpotState();
    }
}