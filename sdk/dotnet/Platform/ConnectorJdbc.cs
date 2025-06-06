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
    /// Resource for creating a JDBC connector.
    /// 
    /// ## Import
    /// 
    /// Import account level jdbc connector
    /// 
    /// ```sh
    /// $ pulumi import harness:platform/connectorJdbc:ConnectorJdbc example &lt;connector_id&gt;
    /// ```
    /// 
    /// Import org level jdbc connector
    /// 
    /// ```sh
    /// $ pulumi import harness:platform/connectorJdbc:ConnectorJdbc example &lt;ord_id&gt;/&lt;connector_id&gt;
    /// ```
    /// 
    /// Import project level jdbc connector
    /// 
    /// ```sh
    /// $ pulumi import harness:platform/connectorJdbc:ConnectorJdbc example &lt;org_id&gt;/&lt;project_id&gt;/&lt;connector_id&gt;
    /// ```
    /// </summary>
    [HarnessResourceType("harness:platform/connectorJdbc:ConnectorJdbc")]
    public partial class ConnectorJdbc : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The credentials to use for the database server.
        /// </summary>
        [Output("credentials")]
        public Output<Outputs.ConnectorJdbcCredentials> Credentials { get; private set; } = null!;

        /// <summary>
        /// Tags to filter delegates for connection.
        /// </summary>
        [Output("delegateSelectors")]
        public Output<ImmutableArray<string>> DelegateSelectors { get; private set; } = null!;

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
        /// The URL of the database server.
        /// </summary>
        [Output("url")]
        public Output<string> Url { get; private set; } = null!;


        /// <summary>
        /// Create a ConnectorJdbc resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public ConnectorJdbc(string name, ConnectorJdbcArgs args, CustomResourceOptions? options = null)
            : base("harness:platform/connectorJdbc:ConnectorJdbc", name, args ?? new ConnectorJdbcArgs(), MakeResourceOptions(options, ""))
        {
        }

        private ConnectorJdbc(string name, Input<string> id, ConnectorJdbcState? state = null, CustomResourceOptions? options = null)
            : base("harness:platform/connectorJdbc:ConnectorJdbc", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing ConnectorJdbc resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static ConnectorJdbc Get(string name, Input<string> id, ConnectorJdbcState? state = null, CustomResourceOptions? options = null)
        {
            return new ConnectorJdbc(name, id, state, options);
        }
    }

    public sealed class ConnectorJdbcArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The credentials to use for the database server.
        /// </summary>
        [Input("credentials", required: true)]
        public Input<Inputs.ConnectorJdbcCredentialsArgs> Credentials { get; set; } = null!;

        [Input("delegateSelectors")]
        private InputList<string>? _delegateSelectors;

        /// <summary>
        /// Tags to filter delegates for connection.
        /// </summary>
        public InputList<string> DelegateSelectors
        {
            get => _delegateSelectors ?? (_delegateSelectors = new InputList<string>());
            set => _delegateSelectors = value;
        }

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

        /// <summary>
        /// The URL of the database server.
        /// </summary>
        [Input("url", required: true)]
        public Input<string> Url { get; set; } = null!;

        public ConnectorJdbcArgs()
        {
        }
        public static new ConnectorJdbcArgs Empty => new ConnectorJdbcArgs();
    }

    public sealed class ConnectorJdbcState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The credentials to use for the database server.
        /// </summary>
        [Input("credentials")]
        public Input<Inputs.ConnectorJdbcCredentialsGetArgs>? Credentials { get; set; }

        [Input("delegateSelectors")]
        private InputList<string>? _delegateSelectors;

        /// <summary>
        /// Tags to filter delegates for connection.
        /// </summary>
        public InputList<string> DelegateSelectors
        {
            get => _delegateSelectors ?? (_delegateSelectors = new InputList<string>());
            set => _delegateSelectors = value;
        }

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

        /// <summary>
        /// The URL of the database server.
        /// </summary>
        [Input("url")]
        public Input<string>? Url { get; set; }

        public ConnectorJdbcState()
        {
        }
        public static new ConnectorJdbcState Empty => new ConnectorJdbcState();
    }
}
