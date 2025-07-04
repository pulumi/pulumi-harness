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
    public sealed class GitopsApplicationsetApplicationsetSpecGeneratorMatrix
    {
        /// <summary>
        /// Child generator. Generators are responsible for generating parameters, which are then combined by the parent matrix generator into the template fields of the ApplicationSet resource.
        /// </summary>
        public readonly ImmutableArray<Outputs.GitopsApplicationsetApplicationsetSpecGeneratorMatrixGenerator> Generators;
        /// <summary>
        /// Generator template. Used to override the values of the spec-level template.
        /// </summary>
        public readonly Outputs.GitopsApplicationsetApplicationsetSpecGeneratorMatrixTemplate? Template;

        [OutputConstructor]
        private GitopsApplicationsetApplicationsetSpecGeneratorMatrix(
            ImmutableArray<Outputs.GitopsApplicationsetApplicationsetSpecGeneratorMatrixGenerator> generators,

            Outputs.GitopsApplicationsetApplicationsetSpecGeneratorMatrixTemplate? template)
        {
            Generators = generators;
            Template = template;
        }
    }
}
