// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.harness.platform.inputs.GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMergeGeneratorClusterArgs;
import com.pulumi.harness.platform.inputs.GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMergeGeneratorClusterDecisionResourceArgs;
import com.pulumi.harness.platform.inputs.GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMergeGeneratorGitArgs;
import com.pulumi.harness.platform.inputs.GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMergeGeneratorListArgs;
import com.pulumi.harness.platform.inputs.GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMergeGeneratorPullRequestArgs;
import com.pulumi.harness.platform.inputs.GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMergeGeneratorScmProviderArgs;
import com.pulumi.harness.platform.inputs.GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMergeGeneratorSelectorArgs;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMergeGeneratorArgs extends com.pulumi.resources.ResourceArgs {

    public static final GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMergeGeneratorArgs Empty = new GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMergeGeneratorArgs();

    /**
     * The [cluster decision resource](https://argo-cd.readthedocs.io/en/stable/operator-manual/applicationset/Generators-Cluster-Decision-Resource/) generates a list of Argo CD clusters.
     * 
     */
    @Import(name="clusterDecisionResources")
    private @Nullable Output<List<GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMergeGeneratorClusterDecisionResourceArgs>> clusterDecisionResources;

    /**
     * @return The [cluster decision resource](https://argo-cd.readthedocs.io/en/stable/operator-manual/applicationset/Generators-Cluster-Decision-Resource/) generates a list of Argo CD clusters.
     * 
     */
    public Optional<Output<List<GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMergeGeneratorClusterDecisionResourceArgs>>> clusterDecisionResources() {
        return Optional.ofNullable(this.clusterDecisionResources);
    }

    /**
     * The [cluster generator](https://argo-cd.readthedocs.io/en/stable/operator-manual/applicationset/Generators-Cluster/) produces parameters based on the list of items found within the cluster secret.
     * 
     */
    @Import(name="clusters")
    private @Nullable Output<List<GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMergeGeneratorClusterArgs>> clusters;

    /**
     * @return The [cluster generator](https://argo-cd.readthedocs.io/en/stable/operator-manual/applicationset/Generators-Cluster/) produces parameters based on the list of items found within the cluster secret.
     * 
     */
    public Optional<Output<List<GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMergeGeneratorClusterArgs>>> clusters() {
        return Optional.ofNullable(this.clusters);
    }

    /**
     * [Git generators](https://argo-cd.readthedocs.io/en/stable/operator-manual/applicationset/Generators-Git/) generates parameters using either the directory structure of a specified Git repository (directory generator), or, using the contents of JSON/YAML files found within a specified repository (file generator).
     * 
     */
    @Import(name="gits")
    private @Nullable Output<List<GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMergeGeneratorGitArgs>> gits;

    /**
     * @return [Git generators](https://argo-cd.readthedocs.io/en/stable/operator-manual/applicationset/Generators-Git/) generates parameters using either the directory structure of a specified Git repository (directory generator), or, using the contents of JSON/YAML files found within a specified repository (file generator).
     * 
     */
    public Optional<Output<List<GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMergeGeneratorGitArgs>>> gits() {
        return Optional.ofNullable(this.gits);
    }

    /**
     * [List generators](https://argo-cd.readthedocs.io/en/stable/operator-manual/applicationset/Generators-List/) generate parameters based on an arbitrary list of key/value pairs (as long as the values are string values).
     * 
     */
    @Import(name="lists")
    private @Nullable Output<List<GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMergeGeneratorListArgs>> lists;

    /**
     * @return [List generators](https://argo-cd.readthedocs.io/en/stable/operator-manual/applicationset/Generators-List/) generate parameters based on an arbitrary list of key/value pairs (as long as the values are string values).
     * 
     */
    public Optional<Output<List<GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMergeGeneratorListArgs>>> lists() {
        return Optional.ofNullable(this.lists);
    }

    /**
     * [Pull Request generators](https://argo-cd.readthedocs.io/en/stable/operator-manual/applicationset/Generators-Pull-Request/) uses the API of an SCMaaS provider to automatically discover open pull requests within a repository.
     * 
     */
    @Import(name="pullRequests")
    private @Nullable Output<List<GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMergeGeneratorPullRequestArgs>> pullRequests;

    /**
     * @return [Pull Request generators](https://argo-cd.readthedocs.io/en/stable/operator-manual/applicationset/Generators-Pull-Request/) uses the API of an SCMaaS provider to automatically discover open pull requests within a repository.
     * 
     */
    public Optional<Output<List<GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMergeGeneratorPullRequestArgs>>> pullRequests() {
        return Optional.ofNullable(this.pullRequests);
    }

    /**
     * [SCM Provider generators](https://argo-cd.readthedocs.io/en/stable/operator-manual/applicationset/Generators-SCM-Provider/) uses the API of an SCMaaS provider to automatically discover repositories within an organization.
     * 
     */
    @Import(name="scmProviders")
    private @Nullable Output<List<GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMergeGeneratorScmProviderArgs>> scmProviders;

    /**
     * @return [SCM Provider generators](https://argo-cd.readthedocs.io/en/stable/operator-manual/applicationset/Generators-SCM-Provider/) uses the API of an SCMaaS provider to automatically discover repositories within an organization.
     * 
     */
    public Optional<Output<List<GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMergeGeneratorScmProviderArgs>>> scmProviders() {
        return Optional.ofNullable(this.scmProviders);
    }

    /**
     * The Selector allows to post-filter based on generated values using the kubernetes common labelSelector format.
     * 
     */
    @Import(name="selector")
    private @Nullable Output<GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMergeGeneratorSelectorArgs> selector;

    /**
     * @return The Selector allows to post-filter based on generated values using the kubernetes common labelSelector format.
     * 
     */
    public Optional<Output<GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMergeGeneratorSelectorArgs>> selector() {
        return Optional.ofNullable(this.selector);
    }

    private GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMergeGeneratorArgs() {}

    private GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMergeGeneratorArgs(GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMergeGeneratorArgs $) {
        this.clusterDecisionResources = $.clusterDecisionResources;
        this.clusters = $.clusters;
        this.gits = $.gits;
        this.lists = $.lists;
        this.pullRequests = $.pullRequests;
        this.scmProviders = $.scmProviders;
        this.selector = $.selector;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMergeGeneratorArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMergeGeneratorArgs $;

        public Builder() {
            $ = new GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMergeGeneratorArgs();
        }

        public Builder(GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMergeGeneratorArgs defaults) {
            $ = new GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMergeGeneratorArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param clusterDecisionResources The [cluster decision resource](https://argo-cd.readthedocs.io/en/stable/operator-manual/applicationset/Generators-Cluster-Decision-Resource/) generates a list of Argo CD clusters.
         * 
         * @return builder
         * 
         */
        public Builder clusterDecisionResources(@Nullable Output<List<GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMergeGeneratorClusterDecisionResourceArgs>> clusterDecisionResources) {
            $.clusterDecisionResources = clusterDecisionResources;
            return this;
        }

        /**
         * @param clusterDecisionResources The [cluster decision resource](https://argo-cd.readthedocs.io/en/stable/operator-manual/applicationset/Generators-Cluster-Decision-Resource/) generates a list of Argo CD clusters.
         * 
         * @return builder
         * 
         */
        public Builder clusterDecisionResources(List<GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMergeGeneratorClusterDecisionResourceArgs> clusterDecisionResources) {
            return clusterDecisionResources(Output.of(clusterDecisionResources));
        }

        /**
         * @param clusterDecisionResources The [cluster decision resource](https://argo-cd.readthedocs.io/en/stable/operator-manual/applicationset/Generators-Cluster-Decision-Resource/) generates a list of Argo CD clusters.
         * 
         * @return builder
         * 
         */
        public Builder clusterDecisionResources(GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMergeGeneratorClusterDecisionResourceArgs... clusterDecisionResources) {
            return clusterDecisionResources(List.of(clusterDecisionResources));
        }

        /**
         * @param clusters The [cluster generator](https://argo-cd.readthedocs.io/en/stable/operator-manual/applicationset/Generators-Cluster/) produces parameters based on the list of items found within the cluster secret.
         * 
         * @return builder
         * 
         */
        public Builder clusters(@Nullable Output<List<GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMergeGeneratorClusterArgs>> clusters) {
            $.clusters = clusters;
            return this;
        }

        /**
         * @param clusters The [cluster generator](https://argo-cd.readthedocs.io/en/stable/operator-manual/applicationset/Generators-Cluster/) produces parameters based on the list of items found within the cluster secret.
         * 
         * @return builder
         * 
         */
        public Builder clusters(List<GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMergeGeneratorClusterArgs> clusters) {
            return clusters(Output.of(clusters));
        }

        /**
         * @param clusters The [cluster generator](https://argo-cd.readthedocs.io/en/stable/operator-manual/applicationset/Generators-Cluster/) produces parameters based on the list of items found within the cluster secret.
         * 
         * @return builder
         * 
         */
        public Builder clusters(GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMergeGeneratorClusterArgs... clusters) {
            return clusters(List.of(clusters));
        }

        /**
         * @param gits [Git generators](https://argo-cd.readthedocs.io/en/stable/operator-manual/applicationset/Generators-Git/) generates parameters using either the directory structure of a specified Git repository (directory generator), or, using the contents of JSON/YAML files found within a specified repository (file generator).
         * 
         * @return builder
         * 
         */
        public Builder gits(@Nullable Output<List<GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMergeGeneratorGitArgs>> gits) {
            $.gits = gits;
            return this;
        }

        /**
         * @param gits [Git generators](https://argo-cd.readthedocs.io/en/stable/operator-manual/applicationset/Generators-Git/) generates parameters using either the directory structure of a specified Git repository (directory generator), or, using the contents of JSON/YAML files found within a specified repository (file generator).
         * 
         * @return builder
         * 
         */
        public Builder gits(List<GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMergeGeneratorGitArgs> gits) {
            return gits(Output.of(gits));
        }

        /**
         * @param gits [Git generators](https://argo-cd.readthedocs.io/en/stable/operator-manual/applicationset/Generators-Git/) generates parameters using either the directory structure of a specified Git repository (directory generator), or, using the contents of JSON/YAML files found within a specified repository (file generator).
         * 
         * @return builder
         * 
         */
        public Builder gits(GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMergeGeneratorGitArgs... gits) {
            return gits(List.of(gits));
        }

        /**
         * @param lists [List generators](https://argo-cd.readthedocs.io/en/stable/operator-manual/applicationset/Generators-List/) generate parameters based on an arbitrary list of key/value pairs (as long as the values are string values).
         * 
         * @return builder
         * 
         */
        public Builder lists(@Nullable Output<List<GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMergeGeneratorListArgs>> lists) {
            $.lists = lists;
            return this;
        }

        /**
         * @param lists [List generators](https://argo-cd.readthedocs.io/en/stable/operator-manual/applicationset/Generators-List/) generate parameters based on an arbitrary list of key/value pairs (as long as the values are string values).
         * 
         * @return builder
         * 
         */
        public Builder lists(List<GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMergeGeneratorListArgs> lists) {
            return lists(Output.of(lists));
        }

        /**
         * @param lists [List generators](https://argo-cd.readthedocs.io/en/stable/operator-manual/applicationset/Generators-List/) generate parameters based on an arbitrary list of key/value pairs (as long as the values are string values).
         * 
         * @return builder
         * 
         */
        public Builder lists(GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMergeGeneratorListArgs... lists) {
            return lists(List.of(lists));
        }

        /**
         * @param pullRequests [Pull Request generators](https://argo-cd.readthedocs.io/en/stable/operator-manual/applicationset/Generators-Pull-Request/) uses the API of an SCMaaS provider to automatically discover open pull requests within a repository.
         * 
         * @return builder
         * 
         */
        public Builder pullRequests(@Nullable Output<List<GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMergeGeneratorPullRequestArgs>> pullRequests) {
            $.pullRequests = pullRequests;
            return this;
        }

        /**
         * @param pullRequests [Pull Request generators](https://argo-cd.readthedocs.io/en/stable/operator-manual/applicationset/Generators-Pull-Request/) uses the API of an SCMaaS provider to automatically discover open pull requests within a repository.
         * 
         * @return builder
         * 
         */
        public Builder pullRequests(List<GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMergeGeneratorPullRequestArgs> pullRequests) {
            return pullRequests(Output.of(pullRequests));
        }

        /**
         * @param pullRequests [Pull Request generators](https://argo-cd.readthedocs.io/en/stable/operator-manual/applicationset/Generators-Pull-Request/) uses the API of an SCMaaS provider to automatically discover open pull requests within a repository.
         * 
         * @return builder
         * 
         */
        public Builder pullRequests(GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMergeGeneratorPullRequestArgs... pullRequests) {
            return pullRequests(List.of(pullRequests));
        }

        /**
         * @param scmProviders [SCM Provider generators](https://argo-cd.readthedocs.io/en/stable/operator-manual/applicationset/Generators-SCM-Provider/) uses the API of an SCMaaS provider to automatically discover repositories within an organization.
         * 
         * @return builder
         * 
         */
        public Builder scmProviders(@Nullable Output<List<GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMergeGeneratorScmProviderArgs>> scmProviders) {
            $.scmProviders = scmProviders;
            return this;
        }

        /**
         * @param scmProviders [SCM Provider generators](https://argo-cd.readthedocs.io/en/stable/operator-manual/applicationset/Generators-SCM-Provider/) uses the API of an SCMaaS provider to automatically discover repositories within an organization.
         * 
         * @return builder
         * 
         */
        public Builder scmProviders(List<GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMergeGeneratorScmProviderArgs> scmProviders) {
            return scmProviders(Output.of(scmProviders));
        }

        /**
         * @param scmProviders [SCM Provider generators](https://argo-cd.readthedocs.io/en/stable/operator-manual/applicationset/Generators-SCM-Provider/) uses the API of an SCMaaS provider to automatically discover repositories within an organization.
         * 
         * @return builder
         * 
         */
        public Builder scmProviders(GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMergeGeneratorScmProviderArgs... scmProviders) {
            return scmProviders(List.of(scmProviders));
        }

        /**
         * @param selector The Selector allows to post-filter based on generated values using the kubernetes common labelSelector format.
         * 
         * @return builder
         * 
         */
        public Builder selector(@Nullable Output<GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMergeGeneratorSelectorArgs> selector) {
            $.selector = selector;
            return this;
        }

        /**
         * @param selector The Selector allows to post-filter based on generated values using the kubernetes common labelSelector format.
         * 
         * @return builder
         * 
         */
        public Builder selector(GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMergeGeneratorSelectorArgs selector) {
            return selector(Output.of(selector));
        }

        public GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMergeGeneratorArgs build() {
            return $;
        }
    }

}
