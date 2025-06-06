// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Harness.Platform.Inputs
{

    public sealed class GitopsAppProjectProjectSpecNamespaceResourceWhitelistGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Group of the namespace resource whitelist.
        /// </summary>
        [Input("group")]
        public Input<string>? Group { get; set; }

        /// <summary>
        /// Kind of the namespace resource whitelist.
        /// </summary>
        [Input("kind")]
        public Input<string>? Kind { get; set; }

        public GitopsAppProjectProjectSpecNamespaceResourceWhitelistGetArgs()
        {
        }
        public static new GitopsAppProjectProjectSpecNamespaceResourceWhitelistGetArgs Empty => new GitopsAppProjectProjectSpecNamespaceResourceWhitelistGetArgs();
    }
}
