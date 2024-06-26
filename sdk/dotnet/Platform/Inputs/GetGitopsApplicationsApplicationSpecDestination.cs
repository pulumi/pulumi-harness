// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Harness.Platform.Inputs
{

    public sealed class GetGitopsApplicationsApplicationSpecDestinationArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// URL of the target cluster and must be set to the kubernetes control plane API.
        /// </summary>
        [Input("name")]
        public string? Name { get; set; }

        /// <summary>
        /// Target namespace of the GitOps application's resources. The namespace will only be set for namespace-scoped resources that have not set a value for .metadata.namespace.
        /// </summary>
        [Input("namespace")]
        public string? Namespace { get; set; }

        /// <summary>
        /// Server of the destination of the GitOps application.
        /// </summary>
        [Input("server")]
        public string? Server { get; set; }

        public GetGitopsApplicationsApplicationSpecDestinationArgs()
        {
        }
        public static new GetGitopsApplicationsApplicationSpecDestinationArgs Empty => new GetGitopsApplicationsApplicationSpecDestinationArgs();
    }
}