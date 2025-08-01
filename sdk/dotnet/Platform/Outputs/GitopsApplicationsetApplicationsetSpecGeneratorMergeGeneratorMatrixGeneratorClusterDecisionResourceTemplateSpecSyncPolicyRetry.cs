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
    public sealed class GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMatrixGeneratorClusterDecisionResourceTemplateSpecSyncPolicyRetry
    {
        /// <summary>
        /// Controls how to backoff on subsequent retries of failed syncs.
        /// </summary>
        public readonly Outputs.GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMatrixGeneratorClusterDecisionResourceTemplateSpecSyncPolicyRetryBackoff? Backoff;
        /// <summary>
        /// Maximum number of attempts for retrying a failed sync. If set to 0, no retries will be performed.
        /// </summary>
        public readonly string? Limit;

        [OutputConstructor]
        private GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMatrixGeneratorClusterDecisionResourceTemplateSpecSyncPolicyRetry(
            Outputs.GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMatrixGeneratorClusterDecisionResourceTemplateSpecSyncPolicyRetryBackoff? backoff,

            string? limit)
        {
            Backoff = backoff;
            Limit = limit;
        }
    }
}
