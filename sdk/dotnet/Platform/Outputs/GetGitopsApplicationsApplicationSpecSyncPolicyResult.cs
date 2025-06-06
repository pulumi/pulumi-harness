// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Harness.Platform.Outputs
{

    [OutputType]
    public sealed class GetGitopsApplicationsApplicationSpecSyncPolicyResult
    {
        /// <summary>
        /// Controls the behavior of an automated sync.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetGitopsApplicationsApplicationSpecSyncPolicyAutomatedResult> Automateds;
        /// <summary>
        /// Contains information about the strategy to apply when a sync failed.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetGitopsApplicationsApplicationSpecSyncPolicyRetryResult> Retries;
        /// <summary>
        /// Options allow you to specify whole app sync-options.
        /// </summary>
        public readonly ImmutableArray<string> SyncOptions;

        [OutputConstructor]
        private GetGitopsApplicationsApplicationSpecSyncPolicyResult(
            ImmutableArray<Outputs.GetGitopsApplicationsApplicationSpecSyncPolicyAutomatedResult> automateds,

            ImmutableArray<Outputs.GetGitopsApplicationsApplicationSpecSyncPolicyRetryResult> retries,

            ImmutableArray<string> syncOptions)
        {
            Automateds = automateds;
            Retries = retries;
            SyncOptions = syncOptions;
        }
    }
}
