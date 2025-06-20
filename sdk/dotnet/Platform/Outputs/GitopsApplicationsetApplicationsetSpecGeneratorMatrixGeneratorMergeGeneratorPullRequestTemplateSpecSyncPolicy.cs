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
    public sealed class GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMergeGeneratorPullRequestTemplateSpecSyncPolicy
    {
        /// <summary>
        /// Whether to automatically keep an application synced to the target revision.
        /// </summary>
        public readonly Outputs.GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMergeGeneratorPullRequestTemplateSpecSyncPolicyAutomated? Automated;
        /// <summary>
        /// Controls metadata in the given namespace (if `CreateNamespace=true`).
        /// </summary>
        public readonly Outputs.GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMergeGeneratorPullRequestTemplateSpecSyncPolicyManagedNamespaceMetadata? ManagedNamespaceMetadata;
        /// <summary>
        /// Controls failed sync retry behavior.
        /// </summary>
        public readonly Outputs.GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMergeGeneratorPullRequestTemplateSpecSyncPolicyRetry? Retry;
        /// <summary>
        /// List of sync options. More info: https://argo-cd.readthedocs.io/en/stable/user-guide/sync-options/.
        /// </summary>
        public readonly ImmutableArray<string> SyncOptions;

        [OutputConstructor]
        private GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMergeGeneratorPullRequestTemplateSpecSyncPolicy(
            Outputs.GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMergeGeneratorPullRequestTemplateSpecSyncPolicyAutomated? automated,

            Outputs.GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMergeGeneratorPullRequestTemplateSpecSyncPolicyManagedNamespaceMetadata? managedNamespaceMetadata,

            Outputs.GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMergeGeneratorPullRequestTemplateSpecSyncPolicyRetry? retry,

            ImmutableArray<string> syncOptions)
        {
            Automated = automated;
            ManagedNamespaceMetadata = managedNamespaceMetadata;
            Retry = retry;
            SyncOptions = syncOptions;
        }
    }
}
