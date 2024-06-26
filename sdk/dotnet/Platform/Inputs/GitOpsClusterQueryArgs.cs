// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Harness.Platform.Inputs
{

    public sealed class GitOpsClusterQueryArgs : global::Pulumi.ResourceArgs
    {
        [Input("ids")]
        private InputList<Inputs.GitOpsClusterQueryIdArgs>? _ids;

        /// <summary>
        /// Cluster server URL or the cluster name.
        /// </summary>
        public InputList<Inputs.GitOpsClusterQueryIdArgs> Ids
        {
            get => _ids ?? (_ids = new InputList<Inputs.GitOpsClusterQueryIdArgs>());
            set => _ids = value;
        }

        /// <summary>
        /// Name of the GitOps cluster.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Server of the GitOps cluster.
        /// </summary>
        [Input("server")]
        public Input<string>? Server { get; set; }

        public GitOpsClusterQueryArgs()
        {
        }
        public static new GitOpsClusterQueryArgs Empty => new GitOpsClusterQueryArgs();
    }
}
