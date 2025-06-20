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
    public sealed class GitopsApplicationsetApplicationsetSpecGeneratorMergeGenerator
    {
        /// <summary>
        /// The [cluster decision resource](https://argo-cd.readthedocs.io/en/stable/operator-manual/applicationset/Generators-Cluster-Decision-Resource/) generates a list of Argo CD clusters.
        /// </summary>
        public readonly ImmutableArray<Outputs.GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorClusterDecisionResource> ClusterDecisionResources;
        /// <summary>
        /// The [cluster generator](https://argo-cd.readthedocs.io/en/stable/operator-manual/applicationset/Generators-Cluster/) produces parameters based on the list of items found within the cluster secret.
        /// </summary>
        public readonly ImmutableArray<Outputs.GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorCluster> Clusters;
        /// <summary>
        /// [Git generators](https://argo-cd.readthedocs.io/en/stable/operator-manual/applicationset/Generators-Git/) generates parameters using either the directory structure of a specified Git repository (directory generator), or, using the contents of JSON/YAML files found within a specified repository (file generator).
        /// </summary>
        public readonly ImmutableArray<Outputs.GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorGit> Gits;
        /// <summary>
        /// [List generators](https://argo-cd.readthedocs.io/en/stable/operator-manual/applicationset/Generators-List/) generate parameters based on an arbitrary list of key/value pairs (as long as the values are string values).
        /// </summary>
        public readonly ImmutableArray<Outputs.GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorList> Lists;
        /// <summary>
        /// [Matrix generators](https://argo-cd.readthedocs.io/en/stable/operator-manual/applicationset/Generators-Matrix/) combine the parameters generated by two child generators, iterating through every combination of each generator's generated parameters. Take note of the [restrictions](https://argo-cd.readthedocs.io/en/stable/operator-manual/applicationset/Generators-Matrix/#restrictions) regarding their usage - particularly regarding nesting matrix generators.
        /// </summary>
        public readonly ImmutableArray<Outputs.GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMatrix> Matrices;
        /// <summary>
        /// [Merge generators](https://argo-cd.readthedocs.io/en/stable/operator-manual/applicationset/Generators-Merge/) combine parameters produced by the base (first) generator with matching parameter sets produced by subsequent generators. Take note of the [restrictions](https://argo-cd.readthedocs.io/en/stable/operator-manual/applicationset/Generators-Merge/#restrictions) regarding their usage - particularly regarding nesting merge generators.
        /// </summary>
        public readonly ImmutableArray<Outputs.GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMerge> Merges;
        /// <summary>
        /// [Pull Request generators](https://argo-cd.readthedocs.io/en/stable/operator-manual/applicationset/Generators-Pull-Request/) uses the API of an SCMaaS provider to automatically discover open pull requests within a repository.
        /// </summary>
        public readonly ImmutableArray<Outputs.GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorPullRequest> PullRequests;
        /// <summary>
        /// [SCM Provider generators](https://argo-cd.readthedocs.io/en/stable/operator-manual/applicationset/Generators-SCM-Provider/) uses the API of an SCMaaS provider to automatically discover repositories within an organization.
        /// </summary>
        public readonly ImmutableArray<Outputs.GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorScmProvider> ScmProviders;
        /// <summary>
        /// The Selector allows to post-filter based on generated values using the kubernetes common labelSelector format.
        /// </summary>
        public readonly Outputs.GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorSelector? Selector;

        [OutputConstructor]
        private GitopsApplicationsetApplicationsetSpecGeneratorMergeGenerator(
            ImmutableArray<Outputs.GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorClusterDecisionResource> clusterDecisionResources,

            ImmutableArray<Outputs.GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorCluster> clusters,

            ImmutableArray<Outputs.GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorGit> gits,

            ImmutableArray<Outputs.GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorList> lists,

            ImmutableArray<Outputs.GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMatrix> matrices,

            ImmutableArray<Outputs.GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMerge> merges,

            ImmutableArray<Outputs.GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorPullRequest> pullRequests,

            ImmutableArray<Outputs.GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorScmProvider> scmProviders,

            Outputs.GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorSelector? selector)
        {
            ClusterDecisionResources = clusterDecisionResources;
            Clusters = clusters;
            Gits = gits;
            Lists = lists;
            Matrices = matrices;
            Merges = merges;
            PullRequests = pullRequests;
            ScmProviders = scmProviders;
            Selector = selector;
        }
    }
}
