// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Harness.Platform.Outputs
{

    [OutputType]
    public sealed class GitOpsClusterRequestId
    {
        /// <summary>
        /// Type of the specified cluster identifier ( 'server' - default, 'name' ).
        /// </summary>
        public readonly string? Type;
        /// <summary>
        /// Cluster server URL or the cluster name.
        /// </summary>
        public readonly string? Value;

        [OutputConstructor]
        private GitOpsClusterRequestId(
            string? type,

            string? value)
        {
            Type = type;
            Value = value;
        }
    }
}
