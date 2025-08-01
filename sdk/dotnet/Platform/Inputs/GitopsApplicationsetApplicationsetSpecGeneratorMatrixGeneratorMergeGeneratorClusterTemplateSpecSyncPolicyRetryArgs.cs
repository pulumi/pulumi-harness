// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Harness.Platform.Inputs
{

    public sealed class GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMergeGeneratorClusterTemplateSpecSyncPolicyRetryArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Controls how to backoff on subsequent retries of failed syncs.
        /// </summary>
        [Input("backoff")]
        public Input<Inputs.GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMergeGeneratorClusterTemplateSpecSyncPolicyRetryBackoffArgs>? Backoff { get; set; }

        /// <summary>
        /// Maximum number of attempts for retrying a failed sync. If set to 0, no retries will be performed.
        /// </summary>
        [Input("limit")]
        public Input<string>? Limit { get; set; }

        public GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMergeGeneratorClusterTemplateSpecSyncPolicyRetryArgs()
        {
        }
        public static new GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMergeGeneratorClusterTemplateSpecSyncPolicyRetryArgs Empty => new GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMergeGeneratorClusterTemplateSpecSyncPolicyRetryArgs();
    }
}
