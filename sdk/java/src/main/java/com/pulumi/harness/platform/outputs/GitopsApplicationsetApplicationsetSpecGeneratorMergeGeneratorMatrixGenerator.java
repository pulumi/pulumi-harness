// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.harness.platform.outputs.GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMatrixGeneratorCluster;
import com.pulumi.harness.platform.outputs.GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMatrixGeneratorClusterDecisionResource;
import com.pulumi.harness.platform.outputs.GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMatrixGeneratorGit;
import com.pulumi.harness.platform.outputs.GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMatrixGeneratorList;
import com.pulumi.harness.platform.outputs.GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMatrixGeneratorPullRequest;
import com.pulumi.harness.platform.outputs.GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMatrixGeneratorScmProvider;
import com.pulumi.harness.platform.outputs.GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMatrixGeneratorSelector;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMatrixGenerator {
    /**
     * @return The [cluster decision resource](https://argo-cd.readthedocs.io/en/stable/operator-manual/applicationset/Generators-Cluster-Decision-Resource/) generates a list of Argo CD clusters.
     * 
     */
    private @Nullable List<GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMatrixGeneratorClusterDecisionResource> clusterDecisionResources;
    /**
     * @return The [cluster generator](https://argo-cd.readthedocs.io/en/stable/operator-manual/applicationset/Generators-Cluster/) produces parameters based on the list of items found within the cluster secret.
     * 
     */
    private @Nullable List<GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMatrixGeneratorCluster> clusters;
    /**
     * @return [Git generators](https://argo-cd.readthedocs.io/en/stable/operator-manual/applicationset/Generators-Git/) generates parameters using either the directory structure of a specified Git repository (directory generator), or, using the contents of JSON/YAML files found within a specified repository (file generator).
     * 
     */
    private @Nullable List<GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMatrixGeneratorGit> gits;
    /**
     * @return [List generators](https://argo-cd.readthedocs.io/en/stable/operator-manual/applicationset/Generators-List/) generate parameters based on an arbitrary list of key/value pairs (as long as the values are string values).
     * 
     */
    private @Nullable List<GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMatrixGeneratorList> lists;
    /**
     * @return [Pull Request generators](https://argo-cd.readthedocs.io/en/stable/operator-manual/applicationset/Generators-Pull-Request/) uses the API of an SCMaaS provider to automatically discover open pull requests within a repository.
     * 
     */
    private @Nullable List<GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMatrixGeneratorPullRequest> pullRequests;
    /**
     * @return [SCM Provider generators](https://argo-cd.readthedocs.io/en/stable/operator-manual/applicationset/Generators-SCM-Provider/) uses the API of an SCMaaS provider to automatically discover repositories within an organization.
     * 
     */
    private @Nullable List<GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMatrixGeneratorScmProvider> scmProviders;
    /**
     * @return The Selector allows to post-filter based on generated values using the kubernetes common labelSelector format.
     * 
     */
    private @Nullable GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMatrixGeneratorSelector selector;

    private GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMatrixGenerator() {}
    /**
     * @return The [cluster decision resource](https://argo-cd.readthedocs.io/en/stable/operator-manual/applicationset/Generators-Cluster-Decision-Resource/) generates a list of Argo CD clusters.
     * 
     */
    public List<GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMatrixGeneratorClusterDecisionResource> clusterDecisionResources() {
        return this.clusterDecisionResources == null ? List.of() : this.clusterDecisionResources;
    }
    /**
     * @return The [cluster generator](https://argo-cd.readthedocs.io/en/stable/operator-manual/applicationset/Generators-Cluster/) produces parameters based on the list of items found within the cluster secret.
     * 
     */
    public List<GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMatrixGeneratorCluster> clusters() {
        return this.clusters == null ? List.of() : this.clusters;
    }
    /**
     * @return [Git generators](https://argo-cd.readthedocs.io/en/stable/operator-manual/applicationset/Generators-Git/) generates parameters using either the directory structure of a specified Git repository (directory generator), or, using the contents of JSON/YAML files found within a specified repository (file generator).
     * 
     */
    public List<GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMatrixGeneratorGit> gits() {
        return this.gits == null ? List.of() : this.gits;
    }
    /**
     * @return [List generators](https://argo-cd.readthedocs.io/en/stable/operator-manual/applicationset/Generators-List/) generate parameters based on an arbitrary list of key/value pairs (as long as the values are string values).
     * 
     */
    public List<GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMatrixGeneratorList> lists() {
        return this.lists == null ? List.of() : this.lists;
    }
    /**
     * @return [Pull Request generators](https://argo-cd.readthedocs.io/en/stable/operator-manual/applicationset/Generators-Pull-Request/) uses the API of an SCMaaS provider to automatically discover open pull requests within a repository.
     * 
     */
    public List<GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMatrixGeneratorPullRequest> pullRequests() {
        return this.pullRequests == null ? List.of() : this.pullRequests;
    }
    /**
     * @return [SCM Provider generators](https://argo-cd.readthedocs.io/en/stable/operator-manual/applicationset/Generators-SCM-Provider/) uses the API of an SCMaaS provider to automatically discover repositories within an organization.
     * 
     */
    public List<GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMatrixGeneratorScmProvider> scmProviders() {
        return this.scmProviders == null ? List.of() : this.scmProviders;
    }
    /**
     * @return The Selector allows to post-filter based on generated values using the kubernetes common labelSelector format.
     * 
     */
    public Optional<GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMatrixGeneratorSelector> selector() {
        return Optional.ofNullable(this.selector);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMatrixGenerator defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMatrixGeneratorClusterDecisionResource> clusterDecisionResources;
        private @Nullable List<GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMatrixGeneratorCluster> clusters;
        private @Nullable List<GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMatrixGeneratorGit> gits;
        private @Nullable List<GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMatrixGeneratorList> lists;
        private @Nullable List<GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMatrixGeneratorPullRequest> pullRequests;
        private @Nullable List<GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMatrixGeneratorScmProvider> scmProviders;
        private @Nullable GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMatrixGeneratorSelector selector;
        public Builder() {}
        public Builder(GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMatrixGenerator defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clusterDecisionResources = defaults.clusterDecisionResources;
    	      this.clusters = defaults.clusters;
    	      this.gits = defaults.gits;
    	      this.lists = defaults.lists;
    	      this.pullRequests = defaults.pullRequests;
    	      this.scmProviders = defaults.scmProviders;
    	      this.selector = defaults.selector;
        }

        @CustomType.Setter
        public Builder clusterDecisionResources(@Nullable List<GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMatrixGeneratorClusterDecisionResource> clusterDecisionResources) {

            this.clusterDecisionResources = clusterDecisionResources;
            return this;
        }
        public Builder clusterDecisionResources(GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMatrixGeneratorClusterDecisionResource... clusterDecisionResources) {
            return clusterDecisionResources(List.of(clusterDecisionResources));
        }
        @CustomType.Setter
        public Builder clusters(@Nullable List<GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMatrixGeneratorCluster> clusters) {

            this.clusters = clusters;
            return this;
        }
        public Builder clusters(GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMatrixGeneratorCluster... clusters) {
            return clusters(List.of(clusters));
        }
        @CustomType.Setter
        public Builder gits(@Nullable List<GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMatrixGeneratorGit> gits) {

            this.gits = gits;
            return this;
        }
        public Builder gits(GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMatrixGeneratorGit... gits) {
            return gits(List.of(gits));
        }
        @CustomType.Setter
        public Builder lists(@Nullable List<GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMatrixGeneratorList> lists) {

            this.lists = lists;
            return this;
        }
        public Builder lists(GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMatrixGeneratorList... lists) {
            return lists(List.of(lists));
        }
        @CustomType.Setter
        public Builder pullRequests(@Nullable List<GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMatrixGeneratorPullRequest> pullRequests) {

            this.pullRequests = pullRequests;
            return this;
        }
        public Builder pullRequests(GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMatrixGeneratorPullRequest... pullRequests) {
            return pullRequests(List.of(pullRequests));
        }
        @CustomType.Setter
        public Builder scmProviders(@Nullable List<GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMatrixGeneratorScmProvider> scmProviders) {

            this.scmProviders = scmProviders;
            return this;
        }
        public Builder scmProviders(GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMatrixGeneratorScmProvider... scmProviders) {
            return scmProviders(List.of(scmProviders));
        }
        @CustomType.Setter
        public Builder selector(@Nullable GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMatrixGeneratorSelector selector) {

            this.selector = selector;
            return this;
        }
        public GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMatrixGenerator build() {
            final var _resultValue = new GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMatrixGenerator();
            _resultValue.clusterDecisionResources = clusterDecisionResources;
            _resultValue.clusters = clusters;
            _resultValue.gits = gits;
            _resultValue.lists = lists;
            _resultValue.pullRequests = pullRequests;
            _resultValue.scmProviders = scmProviders;
            _resultValue.selector = selector;
            return _resultValue;
        }
    }
}
