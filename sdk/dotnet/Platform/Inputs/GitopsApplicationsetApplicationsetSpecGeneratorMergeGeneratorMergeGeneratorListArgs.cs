// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Harness.Platform.Inputs
{

    public sealed class GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMergeGeneratorListArgs : global::Pulumi.ResourceArgs
    {
        [Input("elements", required: true)]
        private InputList<ImmutableDictionary<string, string>>? _elements;

        /// <summary>
        /// List of key/value pairs to pass as parameters into the template
        /// </summary>
        public InputList<ImmutableDictionary<string, string>> Elements
        {
            get => _elements ?? (_elements = new InputList<ImmutableDictionary<string, string>>());
            set => _elements = value;
        }

        /// <summary>
        /// Generator template. Used to override the values of the spec-level template.
        /// </summary>
        [Input("template")]
        public Input<Inputs.GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMergeGeneratorListTemplateArgs>? Template { get; set; }

        public GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMergeGeneratorListArgs()
        {
        }
        public static new GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMergeGeneratorListArgs Empty => new GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMergeGeneratorListArgs();
    }
}
