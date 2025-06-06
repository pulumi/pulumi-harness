// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Harness.Platform.Inputs
{

    public sealed class GitOpsApplicationsApplicationSpecArgs : global::Pulumi.ResourceArgs
    {
        [Input("destinations")]
        private InputList<Inputs.GitOpsApplicationsApplicationSpecDestinationArgs>? _destinations;

        /// <summary>
        /// Information about the GitOps application's destination.
        /// </summary>
        public InputList<Inputs.GitOpsApplicationsApplicationSpecDestinationArgs> Destinations
        {
            get => _destinations ?? (_destinations = new InputList<Inputs.GitOpsApplicationsApplicationSpecDestinationArgs>());
            set => _destinations = value;
        }

        /// <summary>
        /// The ArgoCD project name corresponding to this GitOps application. Value must match mappings of ArgoCD projects to harness project.
        /// </summary>
        [Input("project")]
        public Input<string>? Project { get; set; }

        [Input("source")]
        private InputList<Inputs.GitOpsApplicationsApplicationSpecSourceArgs>? _source;

        /// <summary>
        /// Contains all information about the source of the GitOps application.
        /// </summary>
        public InputList<Inputs.GitOpsApplicationsApplicationSpecSourceArgs> Source
        {
            get => _source ?? (_source = new InputList<Inputs.GitOpsApplicationsApplicationSpecSourceArgs>());
            set => _source = value;
        }

        [Input("sources")]
        private InputList<Inputs.GitOpsApplicationsApplicationSpecSourceArgs>? _sources;

        /// <summary>
        /// List of sources for the GitOps application. Multi Source support
        /// </summary>
        public InputList<Inputs.GitOpsApplicationsApplicationSpecSourceArgs> Sources
        {
            get => _sources ?? (_sources = new InputList<Inputs.GitOpsApplicationsApplicationSpecSourceArgs>());
            set => _sources = value;
        }

        [Input("syncPolicies")]
        private InputList<Inputs.GitOpsApplicationsApplicationSpecSyncPolicyArgs>? _syncPolicies;

        /// <summary>
        /// Controls when a sync will be performed in response to updates in git.
        /// </summary>
        public InputList<Inputs.GitOpsApplicationsApplicationSpecSyncPolicyArgs> SyncPolicies
        {
            get => _syncPolicies ?? (_syncPolicies = new InputList<Inputs.GitOpsApplicationsApplicationSpecSyncPolicyArgs>());
            set => _syncPolicies = value;
        }

        public GitOpsApplicationsApplicationSpecArgs()
        {
        }
        public static new GitOpsApplicationsApplicationSpecArgs Empty => new GitOpsApplicationsApplicationSpecArgs();
    }
}
