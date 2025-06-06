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
    /// Resource for creating folders in Harness.
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
    ///     // Create folder
    ///     var example = new Harness.Platform.FileStoreFolder("example", new()
    ///     {
    ///         OrgId = "org_id",
    ///         ProjectId = "project_id",
    ///         Identifier = "identifier",
    ///         Name = "name",
    ///         Description = "description",
    ///         Tags = new[]
    ///         {
    ///             "foo:bar",
    ///             "baz:qux",
    ///         },
    ///         ParentIdentifier = "parent_identifier",
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Import account level folder
    /// 
    /// ```sh
    /// $ pulumi import harness:platform/fileStoreFolder:FileStoreFolder example &lt;identifier&gt;
    /// ```
    /// 
    /// Import org level folder
    /// 
    /// ```sh
    /// $ pulumi import harness:platform/fileStoreFolder:FileStoreFolder example &lt;org_id&gt;/&lt;identifier&gt;
    /// ```
    /// 
    /// Import org level folder
    /// 
    /// ```sh
    /// $ pulumi import harness:platform/fileStoreFolder:FileStoreFolder example &lt;org_id&gt;/&lt;project_id&gt;/&lt;identifier&gt;
    /// ```
    /// </summary>
    [HarnessResourceType("harness:platform/fileStoreFolder:FileStoreFolder")]
    public partial class FileStoreFolder : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Created by
        /// </summary>
        [Output("createdBies")]
        public Output<ImmutableArray<Outputs.FileStoreFolderCreatedBy>> CreatedBies { get; private set; } = null!;

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
        /// Last modified at
        /// </summary>
        [Output("lastModifiedAt")]
        public Output<int> LastModifiedAt { get; private set; } = null!;

        /// <summary>
        /// Last modified by
        /// </summary>
        [Output("lastModifiedBies")]
        public Output<ImmutableArray<Outputs.FileStoreFolderLastModifiedBy>> LastModifiedBies { get; private set; } = null!;

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
        /// Folder parent identifier on Harness File Store. If the file is at the root level, the parent_identifier will be `Root`.
        /// </summary>
        [Output("parentIdentifier")]
        public Output<string> ParentIdentifier { get; private set; } = null!;

        /// <summary>
        /// Harness File Store folder path
        /// </summary>
        [Output("path")]
        public Output<string> Path { get; private set; } = null!;

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
        /// Create a FileStoreFolder resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public FileStoreFolder(string name, FileStoreFolderArgs args, CustomResourceOptions? options = null)
            : base("harness:platform/fileStoreFolder:FileStoreFolder", name, args ?? new FileStoreFolderArgs(), MakeResourceOptions(options, ""))
        {
        }

        private FileStoreFolder(string name, Input<string> id, FileStoreFolderState? state = null, CustomResourceOptions? options = null)
            : base("harness:platform/fileStoreFolder:FileStoreFolder", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing FileStoreFolder resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static FileStoreFolder Get(string name, Input<string> id, FileStoreFolderState? state = null, CustomResourceOptions? options = null)
        {
            return new FileStoreFolder(name, id, state, options);
        }
    }

    public sealed class FileStoreFolderArgs : global::Pulumi.ResourceArgs
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
        /// Folder parent identifier on Harness File Store. If the file is at the root level, the parent_identifier will be `Root`.
        /// </summary>
        [Input("parentIdentifier", required: true)]
        public Input<string> ParentIdentifier { get; set; } = null!;

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

        public FileStoreFolderArgs()
        {
        }
        public static new FileStoreFolderArgs Empty => new FileStoreFolderArgs();
    }

    public sealed class FileStoreFolderState : global::Pulumi.ResourceArgs
    {
        [Input("createdBies")]
        private InputList<Inputs.FileStoreFolderCreatedByGetArgs>? _createdBies;

        /// <summary>
        /// Created by
        /// </summary>
        public InputList<Inputs.FileStoreFolderCreatedByGetArgs> CreatedBies
        {
            get => _createdBies ?? (_createdBies = new InputList<Inputs.FileStoreFolderCreatedByGetArgs>());
            set => _createdBies = value;
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
        /// Last modified at
        /// </summary>
        [Input("lastModifiedAt")]
        public Input<int>? LastModifiedAt { get; set; }

        [Input("lastModifiedBies")]
        private InputList<Inputs.FileStoreFolderLastModifiedByGetArgs>? _lastModifiedBies;

        /// <summary>
        /// Last modified by
        /// </summary>
        public InputList<Inputs.FileStoreFolderLastModifiedByGetArgs> LastModifiedBies
        {
            get => _lastModifiedBies ?? (_lastModifiedBies = new InputList<Inputs.FileStoreFolderLastModifiedByGetArgs>());
            set => _lastModifiedBies = value;
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
        /// Folder parent identifier on Harness File Store. If the file is at the root level, the parent_identifier will be `Root`.
        /// </summary>
        [Input("parentIdentifier")]
        public Input<string>? ParentIdentifier { get; set; }

        /// <summary>
        /// Harness File Store folder path
        /// </summary>
        [Input("path")]
        public Input<string>? Path { get; set; }

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

        public FileStoreFolderState()
        {
        }
        public static new FileStoreFolderState Empty => new FileStoreFolderState();
    }
}
