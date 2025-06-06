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
    /// Resource for creating a Harness Template Filters.
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
    ///     var test = new Harness.Platform.TemplateFilters("test", new()
    ///     {
    ///         Identifier = "identifier",
    ///         Name = "name",
    ///         OrgId = "org_id",
    ///         ProjectId = "project_id",
    ///         Type = "Template",
    ///         FilterProperties = new Harness.Platform.Inputs.TemplateFiltersFilterPropertiesArgs
    ///         {
    ///             Tags = new[]
    ///             {
    ///                 "foo:bar",
    ///             },
    ///             FilterType = "Template",
    ///         },
    ///         FilterVisibility = "EveryOne",
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Import account level template filter
    /// 
    /// ```sh
    /// $ pulumi import harness:platform/templateFilters:TemplateFilters example &lt;filter_id&gt;/&lt;type&gt;
    /// ```
    /// 
    /// Import org level template filter
    /// 
    /// ```sh
    /// $ pulumi import harness:platform/templateFilters:TemplateFilters example &lt;org_id&gt;/&lt;filter_id&gt;/&lt;type&gt;
    /// ```
    /// 
    /// Import project level template filter
    /// 
    /// ```sh
    /// $ pulumi import harness:platform/templateFilters:TemplateFilters example &lt;org_id&gt;/&lt;project_id&gt;/&lt;filter_id&gt;/&lt;type&gt;
    /// ```
    /// </summary>
    [HarnessResourceType("harness:platform/templateFilters:TemplateFilters")]
    public partial class TemplateFilters : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Properties of the filters entity defined in Harness.
        /// </summary>
        [Output("filterProperties")]
        public Output<Outputs.TemplateFiltersFilterProperties> FilterProperties { get; private set; } = null!;

        /// <summary>
        /// Only accept values "EveryOne" and "OnlyCreator". This indicates visibility of filters. By default, everyone can view this filter.
        /// </summary>
        [Output("filterVisibility")]
        public Output<string?> FilterVisibility { get; private set; } = null!;

        /// <summary>
        /// Unique identifier of the resource.
        /// </summary>
        [Output("identifier")]
        public Output<string> Identifier { get; private set; } = null!;

        /// <summary>
        /// Name of the template filters.
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
        /// Type of template filters. Currently supported types are { Template}
        /// </summary>
        [Output("type")]
        public Output<string> Type { get; private set; } = null!;


        /// <summary>
        /// Create a TemplateFilters resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public TemplateFilters(string name, TemplateFiltersArgs args, CustomResourceOptions? options = null)
            : base("harness:platform/templateFilters:TemplateFilters", name, args ?? new TemplateFiltersArgs(), MakeResourceOptions(options, ""))
        {
        }

        private TemplateFilters(string name, Input<string> id, TemplateFiltersState? state = null, CustomResourceOptions? options = null)
            : base("harness:platform/templateFilters:TemplateFilters", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing TemplateFilters resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static TemplateFilters Get(string name, Input<string> id, TemplateFiltersState? state = null, CustomResourceOptions? options = null)
        {
            return new TemplateFilters(name, id, state, options);
        }
    }

    public sealed class TemplateFiltersArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Properties of the filters entity defined in Harness.
        /// </summary>
        [Input("filterProperties", required: true)]
        public Input<Inputs.TemplateFiltersFilterPropertiesArgs> FilterProperties { get; set; } = null!;

        /// <summary>
        /// Only accept values "EveryOne" and "OnlyCreator". This indicates visibility of filters. By default, everyone can view this filter.
        /// </summary>
        [Input("filterVisibility")]
        public Input<string>? FilterVisibility { get; set; }

        /// <summary>
        /// Unique identifier of the resource.
        /// </summary>
        [Input("identifier", required: true)]
        public Input<string> Identifier { get; set; } = null!;

        /// <summary>
        /// Name of the template filters.
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
        /// Type of template filters. Currently supported types are { Template}
        /// </summary>
        [Input("type", required: true)]
        public Input<string> Type { get; set; } = null!;

        public TemplateFiltersArgs()
        {
        }
        public static new TemplateFiltersArgs Empty => new TemplateFiltersArgs();
    }

    public sealed class TemplateFiltersState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Properties of the filters entity defined in Harness.
        /// </summary>
        [Input("filterProperties")]
        public Input<Inputs.TemplateFiltersFilterPropertiesGetArgs>? FilterProperties { get; set; }

        /// <summary>
        /// Only accept values "EveryOne" and "OnlyCreator". This indicates visibility of filters. By default, everyone can view this filter.
        /// </summary>
        [Input("filterVisibility")]
        public Input<string>? FilterVisibility { get; set; }

        /// <summary>
        /// Unique identifier of the resource.
        /// </summary>
        [Input("identifier")]
        public Input<string>? Identifier { get; set; }

        /// <summary>
        /// Name of the template filters.
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
        /// Type of template filters. Currently supported types are { Template}
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        public TemplateFiltersState()
        {
        }
        public static new TemplateFiltersState Empty => new TemplateFiltersState();
    }
}
