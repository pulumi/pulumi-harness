// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Harness.Platform.Inputs
{

    public sealed class GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorClusterTemplateGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Kubernetes object metadata for templated Application.
        /// </summary>
        [Input("metadata")]
        public Input<Inputs.GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorClusterTemplateMetadataGetArgs>? Metadata { get; set; }

        /// <summary>
        /// The application specification.
        /// </summary>
        [Input("spec")]
        public Input<Inputs.GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorClusterTemplateSpecGetArgs>? Spec { get; set; }

        public GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorClusterTemplateGetArgs()
        {
        }
        public static new GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorClusterTemplateGetArgs Empty => new GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorClusterTemplateGetArgs();
    }
}
