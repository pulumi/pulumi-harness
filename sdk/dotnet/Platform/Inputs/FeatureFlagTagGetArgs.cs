// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Harness.Platform.Inputs
{

    public sealed class FeatureFlagTagGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The identifier of the tag
        /// </summary>
        [Input("identifier", required: true)]
        public Input<string> Identifier { get; set; } = null!;

        public FeatureFlagTagGetArgs()
        {
        }
        public static new FeatureFlagTagGetArgs Empty => new FeatureFlagTagGetArgs();
    }
}
