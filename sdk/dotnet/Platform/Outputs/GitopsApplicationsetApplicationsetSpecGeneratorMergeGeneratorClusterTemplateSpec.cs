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
    public sealed class GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorClusterTemplateSpec
    {
        /// <summary>
        /// Reference to the Kubernetes server and namespace in which the application will be deployed.
        /// </summary>
        public readonly Outputs.GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorClusterTemplateSpecDestination? Destination;
        /// <summary>
        /// Resources and their fields which should be ignored during comparison. More info: https://argo-cd.readthedocs.io/en/stable/user-guide/diffing/#application-level-configuration.
        /// </summary>
        public readonly ImmutableArray<Outputs.GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorClusterTemplateSpecIgnoreDifference> IgnoreDifferences;
        /// <summary>
        /// List of information (URLs, email addresses, and plain text) that relates to the application.
        /// </summary>
        public readonly ImmutableArray<Outputs.GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorClusterTemplateSpecInfo> Infos;
        /// <summary>
        /// The project the application belongs to.
        /// </summary>
        public readonly string? Project;
        /// <summary>
        /// Limits the number of items kept in the application's revision history, which is used for informational purposes as well as for rollbacks to previous versions. This should only be changed in exceptional circumstances. Setting to zero will store no history. This will reduce storage used. Increasing will increase the space used to store the history, so we do not recommend increasing it. Default is 10.
        /// </summary>
        public readonly int? RevisionHistoryLimit;
        /// <summary>
        /// Location of the application's manifests or chart.
        /// </summary>
        public readonly ImmutableArray<Outputs.GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorClusterTemplateSpecSource> Source;
        /// <summary>
        /// Location of the application's manifests or chart. Use when specifying multiple fields
        /// </summary>
        public readonly ImmutableArray<Outputs.GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorClusterTemplateSpecSource> Sources;
        /// <summary>
        /// Controls when and how a sync will be performed.
        /// </summary>
        public readonly Outputs.GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorClusterTemplateSpecSyncPolicy? SyncPolicy;

        [OutputConstructor]
        private GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorClusterTemplateSpec(
            Outputs.GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorClusterTemplateSpecDestination? destination,

            ImmutableArray<Outputs.GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorClusterTemplateSpecIgnoreDifference> ignoreDifferences,

            ImmutableArray<Outputs.GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorClusterTemplateSpecInfo> infos,

            string? project,

            int? revisionHistoryLimit,

            ImmutableArray<Outputs.GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorClusterTemplateSpecSource> source,

            ImmutableArray<Outputs.GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorClusterTemplateSpecSource> sources,

            Outputs.GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorClusterTemplateSpecSyncPolicy? syncPolicy)
        {
            Destination = destination;
            IgnoreDifferences = ignoreDifferences;
            Infos = infos;
            Project = project;
            RevisionHistoryLimit = revisionHistoryLimit;
            Source = source;
            Sources = sources;
            SyncPolicy = syncPolicy;
        }
    }
}
