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
    /// Resource for creating a Harness DBDevOps Schema.
    /// 
    /// ## Import
    /// 
    /// Import project level db schema
    /// 
    /// ```sh
    /// $ pulumi import harness:platform/dbSchema:DbSchema example &lt;org_id&gt;/&lt;project_id&gt;/&lt;db_schema_id&gt;
    /// ```
    /// </summary>
    [HarnessResourceType("harness:platform/dbSchema:DbSchema")]
    public partial class DbSchema : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Changelog script details
        /// </summary>
        [Output("changelogScript")]
        public Output<Outputs.DbSchemaChangelogScript?> ChangelogScript { get; private set; } = null!;

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
        public Output<string> OrgId { get; private set; } = null!;

        /// <summary>
        /// Unique identifier of the project.
        /// </summary>
        [Output("projectId")]
        public Output<string> ProjectId { get; private set; } = null!;

        /// <summary>
        /// Provides a connector and path at which to find the database schema representation
        /// </summary>
        [Output("schemaSource")]
        public Output<Outputs.DbSchemaSchemaSource?> SchemaSource { get; private set; } = null!;

        /// <summary>
        /// The service associated with schema.
        /// </summary>
        [Output("service")]
        public Output<string?> Service { get; private set; } = null!;

        /// <summary>
        /// Tags to associate with the resource.
        /// </summary>
        [Output("tags")]
        public Output<ImmutableArray<string>> Tags { get; private set; } = null!;

        /// <summary>
        /// Type of the database schema (repository/script).
        /// </summary>
        [Output("type")]
        public Output<string?> Type { get; private set; } = null!;


        /// <summary>
        /// Create a DbSchema resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public DbSchema(string name, DbSchemaArgs args, CustomResourceOptions? options = null)
            : base("harness:platform/dbSchema:DbSchema", name, args ?? new DbSchemaArgs(), MakeResourceOptions(options, ""))
        {
        }

        private DbSchema(string name, Input<string> id, DbSchemaState? state = null, CustomResourceOptions? options = null)
            : base("harness:platform/dbSchema:DbSchema", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing DbSchema resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static DbSchema Get(string name, Input<string> id, DbSchemaState? state = null, CustomResourceOptions? options = null)
        {
            return new DbSchema(name, id, state, options);
        }
    }

    public sealed class DbSchemaArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Changelog script details
        /// </summary>
        [Input("changelogScript")]
        public Input<Inputs.DbSchemaChangelogScriptArgs>? ChangelogScript { get; set; }

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
        [Input("orgId", required: true)]
        public Input<string> OrgId { get; set; } = null!;

        /// <summary>
        /// Unique identifier of the project.
        /// </summary>
        [Input("projectId", required: true)]
        public Input<string> ProjectId { get; set; } = null!;

        /// <summary>
        /// Provides a connector and path at which to find the database schema representation
        /// </summary>
        [Input("schemaSource")]
        public Input<Inputs.DbSchemaSchemaSourceArgs>? SchemaSource { get; set; }

        /// <summary>
        /// The service associated with schema.
        /// </summary>
        [Input("service")]
        public Input<string>? Service { get; set; }

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
        /// Type of the database schema (repository/script).
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        public DbSchemaArgs()
        {
        }
        public static new DbSchemaArgs Empty => new DbSchemaArgs();
    }

    public sealed class DbSchemaState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Changelog script details
        /// </summary>
        [Input("changelogScript")]
        public Input<Inputs.DbSchemaChangelogScriptGetArgs>? ChangelogScript { get; set; }

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

        /// <summary>
        /// Provides a connector and path at which to find the database schema representation
        /// </summary>
        [Input("schemaSource")]
        public Input<Inputs.DbSchemaSchemaSourceGetArgs>? SchemaSource { get; set; }

        /// <summary>
        /// The service associated with schema.
        /// </summary>
        [Input("service")]
        public Input<string>? Service { get; set; }

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
        /// Type of the database schema (repository/script).
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        public DbSchemaState()
        {
        }
        public static new DbSchemaState Empty => new DbSchemaState();
    }
}
