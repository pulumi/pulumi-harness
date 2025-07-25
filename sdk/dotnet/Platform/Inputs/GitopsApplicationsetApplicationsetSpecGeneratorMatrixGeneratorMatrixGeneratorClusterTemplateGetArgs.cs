// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Harness.Platform.Inputs
{

    public sealed class GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMatrixGeneratorClusterTemplateGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Kubernetes object metadata for templated Application.
        /// </summary>
        [Input("metadata")]
        public Input<Inputs.GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMatrixGeneratorClusterTemplateMetadataGetArgs>? Metadata { get; set; }

        /// <summary>
        /// The application specification.
        /// </summary>
        [Input("spec")]
        public Input<Inputs.GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMatrixGeneratorClusterTemplateSpecGetArgs>? Spec { get; set; }

        public GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMatrixGeneratorClusterTemplateGetArgs()
        {
        }
        public static new GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMatrixGeneratorClusterTemplateGetArgs Empty => new GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMatrixGeneratorClusterTemplateGetArgs();
    }
}
