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
    /// Resource for creating Harness Pipeline Filters.
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
    ///     var test = new Harness.Platform.PipelineFilters("test", new()
    ///     {
    ///         Identifier = "identifier",
    ///         Name = "name",
    ///         OrgId = "org_id",
    ///         ProjectId = "project_id",
    ///         Type = "PipelineSetup",
    ///         FilterProperties = new Harness.Platform.Inputs.PipelineFiltersFilterPropertiesArgs
    ///         {
    ///             Name = "pipeline_name",
    ///             Description = "pipeline_description",
    ///             PipelineIdentifiers = new[]
    ///             {
    ///                 "id1",
    ///                 "id2",
    ///             },
    ///             FilterType = "PipelineSetup",
    ///         },
    ///         FilterVisibility = "EveryOne",
    ///     });
    /// 
    ///     // pipeline execution filter consisiting services (service_identifiers) filter
    ///     var execution = new Harness.Platform.PipelineFilters("execution", new()
    ///     {
    ///         Identifier = "identifier",
    ///         Name = "name",
    ///         OrgId = "org_id",
    ///         ProjectId = "project_id",
    ///         Type = "PipelineSetup",
    ///         FilterProperties = new Harness.Platform.Inputs.PipelineFiltersFilterPropertiesArgs
    ///         {
    ///             Name = "pipeline_name",
    ///             Description = "pipeline_description",
    ///             PipelineIdentifiers = new[]
    ///             {
    ///                 "id1",
    ///                 "id2",
    ///             },
    ///             FilterType = "PipelineExecution",
    ///             ModuleProperties = new Harness.Platform.Inputs.PipelineFiltersFilterPropertiesModulePropertiesArgs
    ///             {
    ///                 Cd = new Harness.Platform.Inputs.PipelineFiltersFilterPropertiesModulePropertiesCdArgs
    ///                 {
    ///                     DeploymentTypes = "Kubernetes",
    ///                     ServiceIdentifiers = new[]
    ///                     {
    ///                         "nginx",
    ///                     },
    ///                 },
    ///             },
    ///         },
    ///         FilterVisibility = "EveryOne",
    ///     });
    /// 
    ///     // pipeline filter with tags
    ///     var exampleWithTags = new Harness.Platform.PipelineFilters("example_with_tags", new()
    ///     {
    ///         Identifier = "identifier",
    ///         Name = "name",
    ///         OrgId = "org_id",
    ///         ProjectId = "project_id",
    ///         Type = "PipelineSetup",
    ///         FilterProperties = new Harness.Platform.Inputs.PipelineFiltersFilterPropertiesArgs
    ///         {
    ///             FilterType = "PipelineSetup",
    ///             PipelineTags = new[]
    ///             {
    ///                 
    ///                 {
    ///                     { "key", "tag1" },
    ///                     { "value", "123" },
    ///                 },
    ///                 
    ///                 {
    ///                     { "key", "tag2" },
    ///                     { "value", "456" },
    ///                 },
    ///             },
    ///             ModuleProperties = new Harness.Platform.Inputs.PipelineFiltersFilterPropertiesModulePropertiesArgs
    ///             {
    ///                 Cd = new Harness.Platform.Inputs.PipelineFiltersFilterPropertiesModulePropertiesCdArgs
    ///                 {
    ///                     DeploymentTypes = "Kubernetes",
    ///                     ServiceNames = new[]
    ///                     {
    ///                         "service1",
    ///                         "service2",
    ///                     },
    ///                     EnvironmentNames = new[]
    ///                     {
    ///                         "env1",
    ///                         "env2",
    ///                     },
    ///                     ArtifactDisplayNames = new[]
    ///                     {
    ///                         "artificatname1",
    ///                         "artifact2",
    ///                     },
    ///                 },
    ///                 Ci = new Harness.Platform.Inputs.PipelineFiltersFilterPropertiesModulePropertiesCiArgs
    ///                 {
    ///                     BuildType = "branch",
    ///                     Branch = "branch123",
    ///                     RepoNames = "repo1234",
    ///                 },
    ///             },
    ///         },
    ///     });
    /// 
    ///     var pipelinemoduleproperties = new Harness.Platform.PipelineFilters("pipelinemoduleproperties", new()
    ///     {
    ///         Identifier = "identifier",
    ///         Name = "name",
    ///         OrgId = testHarnessPlatformProject.OrgId,
    ///         ProjectId = testHarnessPlatformProject.Id,
    ///         Type = "PipelineExecution",
    ///         FilterProperties = new Harness.Platform.Inputs.PipelineFiltersFilterPropertiesArgs
    ///         {
    ///             FilterType = "PipelineExecution",
    ///             PipelineName = "test",
    ///             PipelineTags = new[]
    ///             {
    ///                 
    ///                 {
    ///                     { "key", "k1" },
    ///                     { "value", "v1" },
    ///                 },
    ///                 
    ///                 {
    ///                     { "key", "k2" },
    ///                     { "value", "v2" },
    ///                 },
    ///             },
    ///             ModuleProperties = new Harness.Platform.Inputs.PipelineFiltersFilterPropertiesModulePropertiesArgs
    ///             {
    ///                 Cd = new Harness.Platform.Inputs.PipelineFiltersFilterPropertiesModulePropertiesCdArgs
    ///                 {
    ///                     ServiceDefinitionTypes = "Kubernetes",
    ///                     ServiceIdentifiers = new[]
    ///                     {
    ///                         "K8",
    ///                     },
    ///                     EnvironmentIdentifiers = new[]
    ///                     {
    ///                         "dev",
    ///                     },
    ///                     ArtifactDisplayNames = new[]
    ///                     {
    ///                         "artificatname1",
    ///                     },
    ///                 },
    ///             },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Import account level pipeline filter
    /// 
    /// ```sh
    /// $ pulumi import harness:platform/pipelineFilters:PipelineFilters example &lt;filter_id&gt;/&lt;type&gt;
    /// ```
    /// 
    /// Import org level pipeline filter
    /// 
    /// ```sh
    /// $ pulumi import harness:platform/pipelineFilters:PipelineFilters example &lt;ord_id&gt;/&lt;filter_id&gt;/&lt;type&gt;
    /// ```
    /// 
    /// Import project level pipeline filter
    /// 
    /// ```sh
    /// $ pulumi import harness:platform/pipelineFilters:PipelineFilters example &lt;org_id&gt;/&lt;project_id&gt;/&lt;filter_id&gt;/&lt;type&gt;
    /// ```
    /// </summary>
    [HarnessResourceType("harness:platform/pipelineFilters:PipelineFilters")]
    public partial class PipelineFilters : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Properties of the filters entity defined in Harness.
        /// </summary>
        [Output("filterProperties")]
        public Output<Outputs.PipelineFiltersFilterProperties> FilterProperties { get; private set; } = null!;

        /// <summary>
        /// This indicates visibility of filters. By default, everyone can view this filter.
        /// </summary>
        [Output("filterVisibility")]
        public Output<string> FilterVisibility { get; private set; } = null!;

        /// <summary>
        /// Unique identifier of the resource.
        /// </summary>
        [Output("identifier")]
        public Output<string> Identifier { get; private set; } = null!;

        /// <summary>
        /// Name of the pipeline filters.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// Organization Identifier for the Entity.
        /// </summary>
        [Output("orgId")]
        public Output<string?> OrgId { get; private set; } = null!;

        /// <summary>
        /// Project Identifier for the Entity.
        /// </summary>
        [Output("projectId")]
        public Output<string?> ProjectId { get; private set; } = null!;

        /// <summary>
        /// Type of pipeline filters. Currently supported types are {PipelineSetup, PipelineExecution, Deployment, Template, EnvironmentGroup, Environment}
        /// </summary>
        [Output("type")]
        public Output<string> Type { get; private set; } = null!;


        /// <summary>
        /// Create a PipelineFilters resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public PipelineFilters(string name, PipelineFiltersArgs args, CustomResourceOptions? options = null)
            : base("harness:platform/pipelineFilters:PipelineFilters", name, args ?? new PipelineFiltersArgs(), MakeResourceOptions(options, ""))
        {
        }

        private PipelineFilters(string name, Input<string> id, PipelineFiltersState? state = null, CustomResourceOptions? options = null)
            : base("harness:platform/pipelineFilters:PipelineFilters", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing PipelineFilters resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static PipelineFilters Get(string name, Input<string> id, PipelineFiltersState? state = null, CustomResourceOptions? options = null)
        {
            return new PipelineFilters(name, id, state, options);
        }
    }

    public sealed class PipelineFiltersArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Properties of the filters entity defined in Harness.
        /// </summary>
        [Input("filterProperties", required: true)]
        public Input<Inputs.PipelineFiltersFilterPropertiesArgs> FilterProperties { get; set; } = null!;

        /// <summary>
        /// This indicates visibility of filters. By default, everyone can view this filter.
        /// </summary>
        [Input("filterVisibility")]
        public Input<string>? FilterVisibility { get; set; }

        /// <summary>
        /// Unique identifier of the resource.
        /// </summary>
        [Input("identifier", required: true)]
        public Input<string> Identifier { get; set; } = null!;

        /// <summary>
        /// Name of the pipeline filters.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Organization Identifier for the Entity.
        /// </summary>
        [Input("orgId")]
        public Input<string>? OrgId { get; set; }

        /// <summary>
        /// Project Identifier for the Entity.
        /// </summary>
        [Input("projectId")]
        public Input<string>? ProjectId { get; set; }

        /// <summary>
        /// Type of pipeline filters. Currently supported types are {PipelineSetup, PipelineExecution, Deployment, Template, EnvironmentGroup, Environment}
        /// </summary>
        [Input("type", required: true)]
        public Input<string> Type { get; set; } = null!;

        public PipelineFiltersArgs()
        {
        }
        public static new PipelineFiltersArgs Empty => new PipelineFiltersArgs();
    }

    public sealed class PipelineFiltersState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Properties of the filters entity defined in Harness.
        /// </summary>
        [Input("filterProperties")]
        public Input<Inputs.PipelineFiltersFilterPropertiesGetArgs>? FilterProperties { get; set; }

        /// <summary>
        /// This indicates visibility of filters. By default, everyone can view this filter.
        /// </summary>
        [Input("filterVisibility")]
        public Input<string>? FilterVisibility { get; set; }

        /// <summary>
        /// Unique identifier of the resource.
        /// </summary>
        [Input("identifier")]
        public Input<string>? Identifier { get; set; }

        /// <summary>
        /// Name of the pipeline filters.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Organization Identifier for the Entity.
        /// </summary>
        [Input("orgId")]
        public Input<string>? OrgId { get; set; }

        /// <summary>
        /// Project Identifier for the Entity.
        /// </summary>
        [Input("projectId")]
        public Input<string>? ProjectId { get; set; }

        /// <summary>
        /// Type of pipeline filters. Currently supported types are {PipelineSetup, PipelineExecution, Deployment, Template, EnvironmentGroup, Environment}
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        public PipelineFiltersState()
        {
        }
        public static new PipelineFiltersState Empty => new PipelineFiltersState();
    }
}
