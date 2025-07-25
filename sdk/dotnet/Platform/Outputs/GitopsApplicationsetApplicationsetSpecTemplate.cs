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
    public sealed class GitopsApplicationsetApplicationsetSpecTemplate
    {
        /// <summary>
        /// Kubernetes object metadata for templated Application.
        /// </summary>
        public readonly Outputs.GitopsApplicationsetApplicationsetSpecTemplateMetadata Metadata;
        /// <summary>
        /// The application specification.
        /// </summary>
        public readonly Outputs.GitopsApplicationsetApplicationsetSpecTemplateSpec Spec;

        [OutputConstructor]
        private GitopsApplicationsetApplicationsetSpecTemplate(
            Outputs.GitopsApplicationsetApplicationsetSpecTemplateMetadata metadata,

            Outputs.GitopsApplicationsetApplicationsetSpecTemplateSpec spec)
        {
            Metadata = metadata;
            Spec = spec;
        }
    }
}
