// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;
using Pulumi;

namespace Lbrlabs.PulumiPackage.Harness.Platform.Inputs
{

    public sealed class GitOpsClusterRequestClusterConfigAwsAuthConfigArgs : global::Pulumi.ResourceArgs
    {
        [Input("clusterName")]
        public Input<string>? ClusterName { get; set; }

        [Input("roleARN")]
        public Input<string>? RoleARN { get; set; }

        public GitOpsClusterRequestClusterConfigAwsAuthConfigArgs()
        {
        }
        public static new GitOpsClusterRequestClusterConfigAwsAuthConfigArgs Empty => new GitOpsClusterRequestClusterConfigAwsAuthConfigArgs();
    }
}