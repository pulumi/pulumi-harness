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
    public sealed class GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorClusterTemplate
    {
        /// <summary>
        /// Kubernetes object metadata for templated Application.
        /// </summary>
        public readonly Outputs.GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorClusterTemplateMetadata? Metadata;
        /// <summary>
        /// The application specification.
        /// </summary>
        public readonly Outputs.GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorClusterTemplateSpec? Spec;

        [OutputConstructor]
        private GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorClusterTemplate(
            Outputs.GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorClusterTemplateMetadata? metadata,

            Outputs.GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorClusterTemplateSpec? spec)
        {
            Metadata = metadata;
            Spec = spec;
        }
    }
}
