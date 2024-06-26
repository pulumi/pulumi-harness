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
    public sealed class GitOpsApplicationsApplicationSpecDestination
    {
        /// <summary>
        /// URL of the target cluster and must be set to the kubernetes control plane API.
        /// </summary>
        public readonly string? Name;
        /// <summary>
        /// Target namespace of the GitOps application's resources. The namespace will only be set for namespace-scoped resources that have not set a value for .metadata.namespace.
        /// </summary>
        public readonly string? Namespace;
        /// <summary>
        /// Server of the destination of the GitOps application.
        /// </summary>
        public readonly string? Server;

        [OutputConstructor]
        private GitOpsApplicationsApplicationSpecDestination(
            string? name,

            string? @namespace,

            string? server)
        {
            Name = name;
            Namespace = @namespace;
            Server = server;
        }
    }
}