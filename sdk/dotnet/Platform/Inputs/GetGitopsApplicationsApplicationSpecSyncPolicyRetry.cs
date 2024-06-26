// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Harness.Platform.Inputs
{

    public sealed class GetGitopsApplicationsApplicationSpecSyncPolicyRetryArgs : global::Pulumi.InvokeArgs
    {
        [Input("backoffs")]
        private List<Inputs.GetGitopsApplicationsApplicationSpecSyncPolicyRetryBackoffArgs>? _backoffs;

        /// <summary>
        /// Backoff strategy to use on subsequent retries for failing syncs.
        /// </summary>
        public List<Inputs.GetGitopsApplicationsApplicationSpecSyncPolicyRetryBackoffArgs> Backoffs
        {
            get => _backoffs ?? (_backoffs = new List<Inputs.GetGitopsApplicationsApplicationSpecSyncPolicyRetryBackoffArgs>());
            set => _backoffs = value;
        }

        /// <summary>
        /// Limit is the maximum number of attempts for retrying a failed sync. If set to 0, no retries will be performed.
        /// </summary>
        [Input("limit")]
        public string? Limit { get; set; }

        public GetGitopsApplicationsApplicationSpecSyncPolicyRetryArgs()
        {
        }
        public static new GetGitopsApplicationsApplicationSpecSyncPolicyRetryArgs Empty => new GetGitopsApplicationsApplicationSpecSyncPolicyRetryArgs();
    }
}
