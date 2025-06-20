// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Harness.Platform.Inputs
{

    public sealed class GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMatrixGeneratorArgs : global::Pulumi.ResourceArgs
    {
        [Input("clusterDecisionResources")]
        private InputList<Inputs.GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMatrixGeneratorClusterDecisionResourceArgs>? _clusterDecisionResources;

        /// <summary>
        /// The [cluster decision resource](https://argo-cd.readthedocs.io/en/stable/operator-manual/applicationset/Generators-Cluster-Decision-Resource/) generates a list of Argo CD clusters.
        /// </summary>
        public InputList<Inputs.GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMatrixGeneratorClusterDecisionResourceArgs> ClusterDecisionResources
        {
            get => _clusterDecisionResources ?? (_clusterDecisionResources = new InputList<Inputs.GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMatrixGeneratorClusterDecisionResourceArgs>());
            set => _clusterDecisionResources = value;
        }

        [Input("clusters")]
        private InputList<Inputs.GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMatrixGeneratorClusterArgs>? _clusters;

        /// <summary>
        /// The [cluster generator](https://argo-cd.readthedocs.io/en/stable/operator-manual/applicationset/Generators-Cluster/) produces parameters based on the list of items found within the cluster secret.
        /// </summary>
        public InputList<Inputs.GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMatrixGeneratorClusterArgs> Clusters
        {
            get => _clusters ?? (_clusters = new InputList<Inputs.GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMatrixGeneratorClusterArgs>());
            set => _clusters = value;
        }

        [Input("gits")]
        private InputList<Inputs.GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMatrixGeneratorGitArgs>? _gits;

        /// <summary>
        /// [Git generators](https://argo-cd.readthedocs.io/en/stable/operator-manual/applicationset/Generators-Git/) generates parameters using either the directory structure of a specified Git repository (directory generator), or, using the contents of JSON/YAML files found within a specified repository (file generator).
        /// </summary>
        public InputList<Inputs.GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMatrixGeneratorGitArgs> Gits
        {
            get => _gits ?? (_gits = new InputList<Inputs.GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMatrixGeneratorGitArgs>());
            set => _gits = value;
        }

        [Input("lists")]
        private InputList<Inputs.GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMatrixGeneratorListArgs>? _lists;

        /// <summary>
        /// [List generators](https://argo-cd.readthedocs.io/en/stable/operator-manual/applicationset/Generators-List/) generate parameters based on an arbitrary list of key/value pairs (as long as the values are string values).
        /// </summary>
        public InputList<Inputs.GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMatrixGeneratorListArgs> Lists
        {
            get => _lists ?? (_lists = new InputList<Inputs.GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMatrixGeneratorListArgs>());
            set => _lists = value;
        }

        [Input("pullRequests")]
        private InputList<Inputs.GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMatrixGeneratorPullRequestArgs>? _pullRequests;

        /// <summary>
        /// [Pull Request generators](https://argo-cd.readthedocs.io/en/stable/operator-manual/applicationset/Generators-Pull-Request/) uses the API of an SCMaaS provider to automatically discover open pull requests within a repository.
        /// </summary>
        public InputList<Inputs.GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMatrixGeneratorPullRequestArgs> PullRequests
        {
            get => _pullRequests ?? (_pullRequests = new InputList<Inputs.GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMatrixGeneratorPullRequestArgs>());
            set => _pullRequests = value;
        }

        [Input("scmProviders")]
        private InputList<Inputs.GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMatrixGeneratorScmProviderArgs>? _scmProviders;

        /// <summary>
        /// [SCM Provider generators](https://argo-cd.readthedocs.io/en/stable/operator-manual/applicationset/Generators-SCM-Provider/) uses the API of an SCMaaS provider to automatically discover repositories within an organization.
        /// </summary>
        public InputList<Inputs.GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMatrixGeneratorScmProviderArgs> ScmProviders
        {
            get => _scmProviders ?? (_scmProviders = new InputList<Inputs.GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMatrixGeneratorScmProviderArgs>());
            set => _scmProviders = value;
        }

        /// <summary>
        /// The Selector allows to post-filter based on generated values using the kubernetes common labelSelector format.
        /// </summary>
        [Input("selector")]
        public Input<Inputs.GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMatrixGeneratorSelectorArgs>? Selector { get; set; }

        public GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMatrixGeneratorArgs()
        {
        }
        public static new GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMatrixGeneratorArgs Empty => new GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMatrixGeneratorArgs();
    }
}
