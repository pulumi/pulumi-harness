// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
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
        /// Name of the destination.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Namespace of the destination.
        /// </summary>
        [Input("namespace")]
        public Input<string>? Namespace { get; set; }

        /// <summary>
        /// Server URL of the destination.
        /// </summary>
        [Input("server")]
        public Input<string>? Server { get; set; }

        public GitopsAppProjectProjectSpecDestinationGetArgs()
        {
        }
        public static new GitopsAppProjectProjectSpecDestinationGetArgs Empty => new GitopsAppProjectProjectSpecDestinationGetArgs();
    }
}