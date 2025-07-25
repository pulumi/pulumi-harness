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
    public sealed class GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorClusterDecisionResourceTemplateSpecSyncPolicy
    {
        /// <summary>
        /// Whether to automatically keep an application synced to the target revision.
        /// </summary>
        public readonly Outputs.GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorClusterDecisionResourceTemplateSpecSyncPolicyAutomated? Automated;
        /// <summary>
        /// Controls metadata in the given namespace (if `CreateNamespace=true`).
        /// </summary>
        public readonly Outputs.GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorClusterDecisionResourceTemplateSpecSyncPolicyManagedNamespaceMetadata? ManagedNamespaceMetadata;
        /// <summary>
        /// Controls failed sync retry behavior.
        /// </summary>
        public readonly Outputs.GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorClusterDecisionResourceTemplateSpecSyncPolicyRetry? Retry;
        /// <summary>
        /// List of sync options. More info: https://argo-cd.readthedocs.io/en/stable/user-guide/sync-options/.
        /// </summary>
        public readonly ImmutableArray<string> SyncOptions;

        [OutputConstructor]
        private GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorClusterDecisionResourceTemplateSpecSyncPolicy(
            Outputs.GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorClusterDecisionResourceTemplateSpecSyncPolicyAutomated? automated,

            Outputs.GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorClusterDecisionResourceTemplateSpecSyncPolicyManagedNamespaceMetadata? managedNamespaceMetadata,

            Outputs.GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorClusterDecisionResourceTemplateSpecSyncPolicyRetry? retry,

            ImmutableArray<string> syncOptions)
        {
            Automated = automated;
            ManagedNamespaceMetadata = managedNamespaceMetadata;
            Retry = retry;
            SyncOptions = syncOptions;
        }
    }
}
