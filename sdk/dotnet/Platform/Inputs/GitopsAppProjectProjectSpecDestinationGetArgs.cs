// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Harness.Platform.Inputs
{

    public sealed class GitopsAppProjectProjectSpecDestinationGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Name of the destination cluster.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Permitted Namespaces for deployment in the destination cluster.
        /// </summary>
        [Input("namespace")]
        public Input<string>? Namespace { get; set; }

        /// <summary>
        /// Server URL of the destination cluster.
        /// </summary>
        [Input("server")]
        public Input<string>? Server { get; set; }

        public GitopsAppProjectProjectSpecDestinationGetArgs()
        {
        }
        public static new GitopsAppProjectProjectSpecDestinationGetArgs Empty => new GitopsAppProjectProjectSpecDestinationGetArgs();
    }
}
