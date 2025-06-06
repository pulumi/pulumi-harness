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
    public sealed class PipelineFiltersFilterPropertiesModulePropertiesCi
    {
        /// <summary>
        /// Branch which was used while building.
        /// </summary>
        public readonly string? Branch;
        /// <summary>
        /// Build type of the pipeline. Possible values: branch.
        /// </summary>
        public readonly string? BuildType;
        /// <summary>
        /// CI execution info for the pipeline.
        /// </summary>
        public readonly Outputs.PipelineFiltersFilterPropertiesModulePropertiesCiCiExecutionInfo? CiExecutionInfo;
        /// <summary>
        /// name of the repository used in the pipeline.
        /// </summary>
        public readonly string? RepoNames;
        /// <summary>
        /// Tags to associate with the CI pipeline resource.
        /// </summary>
        public readonly string? Tag;

        [OutputConstructor]
        private PipelineFiltersFilterPropertiesModulePropertiesCi(
            string? branch,

            string? buildType,

            Outputs.PipelineFiltersFilterPropertiesModulePropertiesCiCiExecutionInfo? ciExecutionInfo,

            string? repoNames,

            string? tag)
        {
            Branch = branch;
            BuildType = buildType;
            CiExecutionInfo = ciExecutionInfo;
            RepoNames = repoNames;
            Tag = tag;
        }
    }
}
