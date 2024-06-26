// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Harness.Platform.Inputs
{

    public sealed class GetGitopsApplicationsApplicationSpecInputArgs : global::Pulumi.ResourceArgs
    {
        [Input("destinations")]
        private InputList<Inputs.GetGitopsApplicationsApplicationSpecDestinationInputArgs>? _destinations;

        /// <summary>
        /// Information about the GitOps application's destination.
        /// </summary>
        public InputList<Inputs.GetGitopsApplicationsApplicationSpecDestinationInputArgs> Destinations
        {
            get => _destinations ?? (_destinations = new InputList<Inputs.GetGitopsApplicationsApplicationSpecDestinationInputArgs>());
            set => _destinations = value;
        }

        [Input("sources")]
        private InputList<Inputs.GetGitopsApplicationsApplicationSpecSourceInputArgs>? _sources;

        /// <summary>
        /// Contains all information about the source of a GitOps application.
        /// </summary>
        public InputList<Inputs.GetGitopsApplicationsApplicationSpecSourceInputArgs> Sources
        {
            get => _sources ?? (_sources = new InputList<Inputs.GetGitopsApplicationsApplicationSpecSourceInputArgs>());
            set => _sources = value;
        }

        [Input("syncPolicies")]
        private InputList<Inputs.GetGitopsApplicationsApplicationSpecSyncPolicyInputArgs>? _syncPolicies;

        /// <summary>
        /// Controls when a sync will be performed in response to updates in git.
        /// </summary>
        public InputList<Inputs.GetGitopsApplicationsApplicationSpecSyncPolicyInputArgs> SyncPolicies
        {
            get => _syncPolicies ?? (_syncPolicies = new InputList<Inputs.GetGitopsApplicationsApplicationSpecSyncPolicyInputArgs>());
            set => _syncPolicies = value;
        }

        public GetGitopsApplicationsApplicationSpecInputArgs()
        {
        }
        public static new GetGitopsApplicationsApplicationSpecInputArgs Empty => new GetGitopsApplicationsApplicationSpecInputArgs();
    }
}
