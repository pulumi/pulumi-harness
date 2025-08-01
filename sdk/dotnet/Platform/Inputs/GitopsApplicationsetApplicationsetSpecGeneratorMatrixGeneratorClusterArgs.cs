// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Harness.Platform.Inputs
{

    public sealed class GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorClusterArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Boolean value defaulting to `true` to indicate that this block has been added thereby allowing all other attributes to be optional.
        /// </summary>
        [Input("enabled", required: true)]
        public Input<bool> Enabled { get; set; } = null!;

        /// <summary>
        /// Label selector used to narrow the scope of targeted clusters.
        /// </summary>
        [Input("selector")]
        public Input<Inputs.GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorClusterSelectorArgs>? Selector { get; set; }

        /// <summary>
        /// Generator template. Used to override the values of the spec-level template.
        /// </summary>
        [Input("template")]
        public Input<Inputs.GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorClusterTemplateArgs>? Template { get; set; }

        [Input("values")]
        private InputMap<string>? _values;

        /// <summary>
        /// Arbitrary string key-value pairs to pass to the template via the values field of the cluster generator.
        /// </summary>
        public InputMap<string> Values
        {
            get => _values ?? (_values = new InputMap<string>());
            set => _values = value;
        }

        public GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorClusterArgs()
        {
        }
        public static new GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorClusterArgs Empty => new GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorClusterArgs();
    }
}
