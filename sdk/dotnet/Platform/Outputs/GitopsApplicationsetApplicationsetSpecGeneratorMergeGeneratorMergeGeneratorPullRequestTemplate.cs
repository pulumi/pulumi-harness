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
    public sealed class GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMergeGeneratorPullRequestTemplate
    {
        /// <summary>
        /// Kubernetes object metadata for templated Application.
        /// </summary>
        public readonly Outputs.GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMergeGeneratorPullRequestTemplateMetadata? Metadata;
        /// <summary>
        /// The application specification.
        /// </summary>
        public readonly Outputs.GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMergeGeneratorPullRequestTemplateSpec? Spec;

        [OutputConstructor]
        private GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMergeGeneratorPullRequestTemplate(
            Outputs.GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMergeGeneratorPullRequestTemplateMetadata? metadata,

            Outputs.GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMergeGeneratorPullRequestTemplateSpec? spec)
        {
            Metadata = metadata;
            Spec = spec;
        }
    }
}
