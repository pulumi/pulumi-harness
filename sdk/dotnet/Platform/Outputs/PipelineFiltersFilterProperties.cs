// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Harness.Platform.Outputs
{

    [OutputType]
    public sealed class PipelineFiltersFilterProperties
    {
        /// <summary>
        /// description of the pipline filter.
        /// </summary>
        public readonly string? Description;
        /// <summary>
        /// Corresponding Entity of the filters. Currently supported types are {Connector, DelegateProfile, Delegate, PipelineSetup, PipelineExecution, Deployment, Audit, Template, EnvironmentGroup, FileStore, CCMRecommendation, Anomaly, Environment}.
        /// </summary>
        public readonly string FilterType;
        /// <summary>
        /// module properties of the pipline filter.
        /// </summary>
        public readonly Outputs.PipelineFiltersFilterPropertiesModuleProperties? ModuleProperties;
        /// <summary>
        /// Name of the pipeline filter.
        /// </summary>
        public readonly string? Name;
        /// <summary>
        /// Pipeline identifiers to filter on.
        /// </summary>
        public readonly ImmutableArray<string> PipelineIdentifiers;
        /// <summary>
        /// Name of the pipeline execution filter.
        /// </summary>
        public readonly string? PipelineName;
        /// <summary>
        /// Tags to associate with the pipeline. tags should be in the form of `{key:key1, value:key1value}`
        /// </summary>
        public readonly ImmutableArray<ImmutableDictionary<string, string>> PipelineTags;
        /// <summary>
        /// Tags to associate with the resource. Tags should be in the form `name:value`.
        /// </summary>
        public readonly ImmutableArray<string> Tags;

        [OutputConstructor]
        private PipelineFiltersFilterProperties(
            string? description,

            string filterType,

            Outputs.PipelineFiltersFilterPropertiesModuleProperties? moduleProperties,

            string? name,

            ImmutableArray<string> pipelineIdentifiers,

            string? pipelineName,

            ImmutableArray<ImmutableDictionary<string, string>> pipelineTags,

            ImmutableArray<string> tags)
        {
            Description = description;
            FilterType = filterType;
            ModuleProperties = moduleProperties;
            Name = name;
            PipelineIdentifiers = pipelineIdentifiers;
            PipelineName = pipelineName;
            PipelineTags = pipelineTags;
            Tags = tags;
        }
    }
}
