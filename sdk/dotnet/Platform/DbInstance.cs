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
    /// Resource for creating a Harness DBDevOps Instance.
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
    ///     var test = new Harness.Platform.DbInstance("test", new()
    ///     {
    ///         Identifier = "identifier",
    ///         OrgId = "org_id",
    ///         ProjectId = "project_id",
    ///         Name = "name",
    ///         Tags = new[]
    ///         {
    ///             "foo:bar",
    ///             "bar:foo",
    ///         },
    ///         Schema = "schema1",
    ///         Branch = "main",
    ///         Connector = "jdbcConnector",
    ///         Context = "ctx",
    ///         LiquibaseSubstituteProperties = 
    ///         {
    ///             { "key1", "value1" },
    ///             { "key2", "value2" },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Import project level db instance
    /// 
    /// ```sh
    /// $ pulumi import harness:platform/dbInstance:DbInstance example &lt;org_id&gt;/&lt;project_id&gt;/&lt;db_schema_id&gt;/&lt;db_instance_id&gt;
    /// ```
    /// </summary>
    [HarnessResourceType("harness:platform/dbInstance:DbInstance")]
    public partial class DbInstance : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The branch of changeSet repository
        /// </summary>
        [Output("branch")]
        public Output<string?> Branch { get; private set; } = null!;

        /// <summary>
        /// The connector to database
        /// </summary>
        [Output("connector")]
        public Output<string> Connector { get; private set; } = null!;

        /// <summary>
        /// The liquibase context
        /// </summary>
        [Output("context")]
        public Output<string?> Context { get; private set; } = null!;

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
        /// The properties to substitute in liquibase changelog
        /// </summary>
        [Output("liquibaseSubstituteProperties")]
        public Output<ImmutableDictionary<string, string>?> LiquibaseSubstituteProperties { get; private set; } = null!;

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
        /// The identifier of the parent database schema
        /// </summary>
        [Output("schema")]
        public Output<string> Schema { get; private set; } = null!;

        /// <summary>
        /// Tags to associate with the resource.
        /// </summary>
        [Output("tags")]
        public Output<ImmutableArray<string>> Tags { get; private set; } = null!;


        /// <summary>
        /// Create a DbInstance resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public DbInstance(string name, DbInstanceArgs args, CustomResourceOptions? options = null)
            : base("harness:platform/dbInstance:DbInstance", name, args ?? new DbInstanceArgs(), MakeResourceOptions(options, ""))
        {
        }

        private DbInstance(string name, Input<string> id, DbInstanceState? state = null, CustomResourceOptions? options = null)
            : base("harness:platform/dbInstance:DbInstance", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing DbInstance resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static DbInstance Get(string name, Input<string> id, DbInstanceState? state = null, CustomResourceOptions? options = null)
        {
            return new DbInstance(name, id, state, options);
        }
    }

    public sealed class DbInstanceArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The branch of changeSet repository
        /// </summary>
        [Input("branch")]
        public Input<string>? Branch { get; set; }

        /// <summary>
        /// The connector to database
        /// </summary>
        [Input("connector", required: true)]
        public Input<string> Connector { get; set; } = null!;

        /// <summary>
        /// The liquibase context
        /// </summary>
        [Input("context")]
        public Input<string>? Context { get; set; }

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

        [Input("liquibaseSubstituteProperties")]
        private InputMap<string>? _liquibaseSubstituteProperties;

        /// <summary>
        /// The properties to substitute in liquibase changelog
        /// </summary>
        public InputMap<string> LiquibaseSubstituteProperties
        {
            get => _liquibaseSubstituteProperties ?? (_liquibaseSubstituteProperties = new InputMap<string>());
            set => _liquibaseSubstituteProperties = value;
        }

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
        /// The identifier of the parent database schema
        /// </summary>
        [Input("schema", required: true)]
        public Input<string> Schema { get; set; } = null!;

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

        public DbInstanceArgs()
        {
        }
        public static new DbInstanceArgs Empty => new DbInstanceArgs();
    }

    public sealed class DbInstanceState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The branch of changeSet repository
        /// </summary>
        [Input("branch")]
        public Input<string>? Branch { get; set; }

        /// <summary>
        /// The connector to database
        /// </summary>
        [Input("connector")]
        public Input<string>? Connector { get; set; }

        /// <summary>
        /// The liquibase context
        /// </summary>
        [Input("context")]
        public Input<string>? Context { get; set; }

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

        [Input("liquibaseSubstituteProperties")]
        private InputMap<string>? _liquibaseSubstituteProperties;

        /// <summary>
        /// The properties to substitute in liquibase changelog
        /// </summary>
        public InputMap<string> LiquibaseSubstituteProperties
        {
            get => _liquibaseSubstituteProperties ?? (_liquibaseSubstituteProperties = new InputMap<string>());
            set => _liquibaseSubstituteProperties = value;
        }

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
        /// The identifier of the parent database schema
        /// </summary>
        [Input("schema")]
        public Input<string>? Schema { get; set; }

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

        public DbInstanceState()
        {
        }
        public static new DbInstanceState Empty => new DbInstanceState();
    }
}
