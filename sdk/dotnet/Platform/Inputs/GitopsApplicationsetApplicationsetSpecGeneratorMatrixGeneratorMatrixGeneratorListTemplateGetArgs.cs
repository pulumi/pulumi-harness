// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Harness.Platform.Inputs
{

    public sealed class GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMatrixGeneratorListTemplateGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Kubernetes object metadata for templated Application.
        /// </summary>
        [Input("metadata")]
        public Input<Inputs.GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMatrixGeneratorListTemplateMetadataGetArgs>? Metadata { get; set; }

        /// <summary>
        /// The application specification.
        /// </summary>
        [Input("spec")]
        public Input<Inputs.GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMatrixGeneratorListTemplateSpecGetArgs>? Spec { get; set; }

        public GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMatrixGeneratorListTemplateGetArgs()
        {
        }
        public static new GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMatrixGeneratorListTemplateGetArgs Empty => new GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMatrixGeneratorListTemplateGetArgs();
    }
}
