// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Harness.Platform.Inputs
{

    public sealed class EnvironmentClustersMappingClusterGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// account Identifier of the account
        /// </summary>
        [Input("identifier")]
        public Input<string>? Identifier { get; set; }

        /// <summary>
        /// name of the cluster
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// scope at which the cluster exists in harness gitops, project vs org vs account
        /// </summary>
        [Input("scope")]
        public Input<string>? Scope { get; set; }

        public EnvironmentClustersMappingClusterGetArgs()
        {
        }
        public static new EnvironmentClustersMappingClusterGetArgs Empty => new EnvironmentClustersMappingClusterGetArgs();
    }
}
