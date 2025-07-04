// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Harness.Platform.Inputs
{

    public sealed class GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMatrixArgs : global::Pulumi.ResourceArgs
    {
        [Input("generators", required: true)]
        private InputList<Inputs.GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMatrixGeneratorArgs>? _generators;

        /// <summary>
        /// Child generator. Generators are responsible for generating parameters, which are then combined by the parent matrix generator into the template fields of the ApplicationSet resource.
        /// </summary>
        public InputList<Inputs.GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMatrixGeneratorArgs> Generators
        {
            get => _generators ?? (_generators = new InputList<Inputs.GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMatrixGeneratorArgs>());
            set => _generators = value;
        }

        /// <summary>
        /// Generator template. Used to override the values of the spec-level template.
        /// </summary>
        [Input("template")]
        public Input<Inputs.GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMatrixTemplateArgs>? Template { get; set; }

        public GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMatrixArgs()
        {
        }
        public static new GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMatrixArgs Empty => new GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMatrixArgs();
    }
}
