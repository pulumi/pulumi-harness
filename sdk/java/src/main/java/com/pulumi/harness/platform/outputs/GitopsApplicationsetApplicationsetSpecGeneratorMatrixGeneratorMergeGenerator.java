// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.harness.platform.outputs.GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMergeGeneratorCluster;
import com.pulumi.harness.platform.outputs.GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMergeGeneratorClusterDecisionResource;
import com.pulumi.harness.platform.outputs.GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMergeGeneratorGit;
import com.pulumi.harness.platform.outputs.GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMergeGeneratorList;
import com.pulumi.harness.platform.outputs.GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMergeGeneratorPullRequest;
import com.pulumi.harness.platform.outputs.GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMergeGeneratorScmProvider;
import com.pulumi.harness.platform.outputs.GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMergeGeneratorSelector;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMergeGenerator {
    /**
     * @return The [cluster decision resource](https://argo-cd.readthedocs.io/en/stable/operator-manual/applicationset/Generators-Cluster-Decision-Resource/) generates a list of Argo CD clusters.
     * 
     */
    private @Nullable List<GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMergeGeneratorClusterDecisionResource> clusterDecisionResources;
    /**
     * @return The [cluster generator](https://argo-cd.readthedocs.io/en/stable/operator-manual/applicationset/Generators-Cluster/) produces parameters based on the list of items found within the cluster secret.
     * 
     */
    private @Nullable List<GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMergeGeneratorCluster> clusters;
    /**
     * @return [Git generators](https://argo-cd.readthedocs.io/en/stable/operator-manual/applicationset/Generators-Git/) generates parameters using either the directory structure of a specified Git repository (directory generator), or, using the contents of JSON/YAML files found within a specified repository (file generator).
     * 
     */
    private @Nullable List<GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMergeGeneratorGit> gits;
    /**
     * @return [List generators](https://argo-cd.readthedocs.io/en/stable/operator-manual/applicationset/Generators-List/) generate parameters based on an arbitrary list of key/value pairs (as long as the values are string values).
     * 
     */
    private @Nullable List<GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMergeGeneratorList> lists;
    /**
     * @return [Pull Request generators](https://argo-cd.readthedocs.io/en/stable/operator-manual/applicationset/Generators-Pull-Request/) uses the API of an SCMaaS provider to automatically discover open pull requests within a repository.
     * 
     */
    private @Nullable List<GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMergeGeneratorPullRequest> pullRequests;
    /**
     * @return [SCM Provider generators](https://argo-cd.readthedocs.io/en/stable/operator-manual/applicationset/Generators-SCM-Provider/) uses the API of an SCMaaS provider to automatically discover repositories within an organization.
     * 
     */
    private @Nullable List<GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMergeGeneratorScmProvider> scmProviders;
    /**
     * @return The Selector allows to post-filter based on generated values using the kubernetes common labelSelector format.
     * 
     */
    private @Nullable GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMergeGeneratorSelector selector;

    private GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMergeGenerator() {}
    /**
     * @return The [cluster decision resource](https://argo-cd.readthedocs.io/en/stable/operator-manual/applicationset/Generators-Cluster-Decision-Resource/) generates a list of Argo CD clusters.
     * 
     */
    public List<GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMergeGeneratorClusterDecisionResource> clusterDecisionResources() {
        return this.clusterDecisionResources == null ? List.of() : this.clusterDecisionResources;
    }
    /**
     * @return The [cluster generator](https://argo-cd.readthedocs.io/en/stable/operator-manual/applicationset/Generators-Cluster/) produces parameters based on the list of items found within the cluster secret.
     * 
     */
    public List<GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMergeGeneratorCluster> clusters() {
        return this.clusters == null ? List.of() : this.clusters;
    }
    /**
     * @return [Git generators](https://argo-cd.readthedocs.io/en/stable/operator-manual/applicationset/Generators-Git/) generates parameters using either the directory structure of a specified Git repository (directory generator), or, using the contents of JSON/YAML files found within a specified repository (file generator).
     * 
     */
    public List<GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMergeGeneratorGit> gits() {
        return this.gits == null ? List.of() : this.gits;
    }
    /**
     * @return [List generators](https://argo-cd.readthedocs.io/en/stable/operator-manual/applicationset/Generators-List/) generate parameters based on an arbitrary list of key/value pairs (as long as the values are string values).
     * 
     */
    public List<GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMergeGeneratorList> lists() {
        return this.lists == null ? List.of() : this.lists;
    }
    /**
     * @return [Pull Request generators](https://argo-cd.readthedocs.io/en/stable/operator-manual/applicationset/Generators-Pull-Request/) uses the API of an SCMaaS provider to automatically discover open pull requests within a repository.
     * 
     */
    public List<GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMergeGeneratorPullRequest> pullRequests() {
        return this.pullRequests == null ? List.of() : this.pullRequests;
    }
    /**
     * @return [SCM Provider generators](https://argo-cd.readthedocs.io/en/stable/operator-manual/applicationset/Generators-SCM-Provider/) uses the API of an SCMaaS provider to automatically discover repositories within an organization.
     * 
     */
    public List<GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMergeGeneratorScmProvider> scmProviders() {
        return this.scmProviders == null ? List.of() : this.scmProviders;
    }
    /**
     * @return The Selector allows to post-filter based on generated values using the kubernetes common labelSelector format.
     * 
     */
    public Optional<GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMergeGeneratorSelector> selector() {
        return Optional.ofNullable(this.selector);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMergeGenerator defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMergeGeneratorClusterDecisionResource> clusterDecisionResources;
        private @Nullable List<GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMergeGeneratorCluster> clusters;
        private @Nullable List<GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMergeGeneratorGit> gits;
        private @Nullable List<GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMergeGeneratorList> lists;
        private @Nullable List<GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMergeGeneratorPullRequest> pullRequests;
        private @Nullable List<GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMergeGeneratorScmProvider> scmProviders;
        private @Nullable GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMergeGeneratorSelector selector;
        public Builder() {}
        public Builder(GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMergeGenerator defaults) {
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
        public Builder clusterDecisionResources(@Nullable List<GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMergeGeneratorClusterDecisionResource> clusterDecisionResources) {

            this.clusterDecisionResources = clusterDecisionResources;
            return this;
        }
        public Builder clusterDecisionResources(GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMergeGeneratorClusterDecisionResource... clusterDecisionResources) {
            return clusterDecisionResources(List.of(clusterDecisionResources));
        }
        @CustomType.Setter
        public Builder clusters(@Nullable List<GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMergeGeneratorCluster> clusters) {

            this.clusters = clusters;
            return this;
        }
        public Builder clusters(GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMergeGeneratorCluster... clusters) {
            return clusters(List.of(clusters));
        }
        @CustomType.Setter
        public Builder gits(@Nullable List<GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMergeGeneratorGit> gits) {

            this.gits = gits;
            return this;
        }
        public Builder gits(GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMergeGeneratorGit... gits) {
            return gits(List.of(gits));
        }
        @CustomType.Setter
        public Builder lists(@Nullable List<GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMergeGeneratorList> lists) {

            this.lists = lists;
            return this;
        }
        public Builder lists(GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMergeGeneratorList... lists) {
            return lists(List.of(lists));
        }
        @CustomType.Setter
        public Builder pullRequests(@Nullable List<GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMergeGeneratorPullRequest> pullRequests) {

            this.pullRequests = pullRequests;
            return this;
        }
        public Builder pullRequests(GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMergeGeneratorPullRequest... pullRequests) {
            return pullRequests(List.of(pullRequests));
        }
        @CustomType.Setter
        public Builder scmProviders(@Nullable List<GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMergeGeneratorScmProvider> scmProviders) {

            this.scmProviders = scmProviders;
            return this;
        }
        public Builder scmProviders(GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMergeGeneratorScmProvider... scmProviders) {
            return scmProviders(List.of(scmProviders));
        }
        @CustomType.Setter
        public Builder selector(@Nullable GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMergeGeneratorSelector selector) {

            this.selector = selector;
            return this;
        }
        public GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMergeGenerator build() {
            final var _resultValue = new GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMergeGenerator();
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
