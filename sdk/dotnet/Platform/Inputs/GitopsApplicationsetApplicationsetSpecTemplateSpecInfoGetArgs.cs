// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Harness.Platform.Inputs
{

    public sealed class GitopsApplicationsetApplicationsetSpecTemplateSpecInfoGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Name of the information.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Value of the information.
        /// </summary>
        [Input("value")]
        public Input<string>? Value { get; set; }

        public GitopsApplicationsetApplicationsetSpecTemplateSpecInfoGetArgs()
        {
        }
        public static new GitopsApplicationsetApplicationsetSpecTemplateSpecInfoGetArgs Empty => new GitopsApplicationsetApplicationsetSpecTemplateSpecInfoGetArgs();
    }
}
