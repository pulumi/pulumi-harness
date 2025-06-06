// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Harness.Platform.Inputs
{

    public sealed class GitopsAppProjectProjectSpecClusterResourceWhitelistGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Group of the cluster resource whitelist.
        /// </summary>
        [Input("group")]
        public Input<string>? Group { get; set; }

        /// <summary>
        /// Kind of the cluster resource whitelist.
        /// </summary>
        [Input("kind")]
        public Input<string>? Kind { get; set; }

        public GitopsAppProjectProjectSpecClusterResourceWhitelistGetArgs()
        {
        }
        public static new GitopsAppProjectProjectSpecClusterResourceWhitelistGetArgs Empty => new GitopsAppProjectProjectSpecClusterResourceWhitelistGetArgs();
    }
}
