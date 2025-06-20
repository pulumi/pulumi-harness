// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.harness.platform.outputs.GitopsApplicationsetApplicationsetSpecGeneratorCluster;
import com.pulumi.harness.platform.outputs.GitopsApplicationsetApplicationsetSpecGeneratorClusterDecisionResource;
import com.pulumi.harness.platform.outputs.GitopsApplicationsetApplicationsetSpecGeneratorGit;
import com.pulumi.harness.platform.outputs.GitopsApplicationsetApplicationsetSpecGeneratorList;
import com.pulumi.harness.platform.outputs.GitopsApplicationsetApplicationsetSpecGeneratorMatrix;
import com.pulumi.harness.platform.outputs.GitopsApplicationsetApplicationsetSpecGeneratorMerge;
import com.pulumi.harness.platform.outputs.GitopsApplicationsetApplicationsetSpecGeneratorPullRequest;
import com.pulumi.harness.platform.outputs.GitopsApplicationsetApplicationsetSpecGeneratorScmProvider;
import com.pulumi.harness.platform.outputs.GitopsApplicationsetApplicationsetSpecGeneratorSelector;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GitopsApplicationsetApplicationsetSpecGenerator {
    /**
     * @return The [cluster decision resource](https://argo-cd.readthedocs.io/en/stable/operator-manual/applicationset/Generators-Cluster-Decision-Resource/) generates a list of Argo CD clusters.
     * 
     */
    private @Nullable List<GitopsApplicationsetApplicationsetSpecGeneratorClusterDecisionResource> clusterDecisionResources;
    /**
     * @return The [cluster generator](https://argo-cd.readthedocs.io/en/stable/operator-manual/applicationset/Generators-Cluster/) produces parameters based on the list of items found within the cluster secret.
     * 
     */
    private @Nullable List<GitopsApplicationsetApplicationsetSpecGeneratorCluster> clusters;
    /**
     * @return [Git generators](https://argo-cd.readthedocs.io/en/stable/operator-manual/applicationset/Generators-Git/) generates parameters using either the directory structure of a specified Git repository (directory generator), or, using the contents of JSON/YAML files found within a specified repository (file generator).
     * 
     */
    private @Nullable List<GitopsApplicationsetApplicationsetSpecGeneratorGit> gits;
    /**
     * @return [List generators](https://argo-cd.readthedocs.io/en/stable/operator-manual/applicationset/Generators-List/) generate parameters based on an arbitrary list of key/value pairs (as long as the values are string values).
     * 
     */
    private @Nullable List<GitopsApplicationsetApplicationsetSpecGeneratorList> lists;
    /**
     * @return [Matrix generators](https://argo-cd.readthedocs.io/en/stable/operator-manual/applicationset/Generators-Matrix/) combine the parameters generated by two child generators, iterating through every combination of each generator&#39;s generated parameters. Take note of the [restrictions](https://argo-cd.readthedocs.io/en/stable/operator-manual/applicationset/Generators-Matrix/#restrictions) regarding their usage - particularly regarding nesting matrix generators.
     * 
     */
    private @Nullable List<GitopsApplicationsetApplicationsetSpecGeneratorMatrix> matrices;
    /**
     * @return [Merge generators](https://argo-cd.readthedocs.io/en/stable/operator-manual/applicationset/Generators-Merge/) combine parameters produced by the base (first) generator with matching parameter sets produced by subsequent generators. Take note of the [restrictions](https://argo-cd.readthedocs.io/en/stable/operator-manual/applicationset/Generators-Merge/#restrictions) regarding their usage - particularly regarding nesting merge generators.
     * 
     */
    private @Nullable List<GitopsApplicationsetApplicationsetSpecGeneratorMerge> merges;
    /**
     * @return [Pull Request generators](https://argo-cd.readthedocs.io/en/stable/operator-manual/applicationset/Generators-Pull-Request/) uses the API of an SCMaaS provider to automatically discover open pull requests within a repository.
     * 
     */
    private @Nullable List<GitopsApplicationsetApplicationsetSpecGeneratorPullRequest> pullRequests;
    /**
     * @return [SCM Provider generators](https://argo-cd.readthedocs.io/en/stable/operator-manual/applicationset/Generators-SCM-Provider/) uses the API of an SCMaaS provider to automatically discover repositories within an organization.
     * 
     */
    private @Nullable List<GitopsApplicationsetApplicationsetSpecGeneratorScmProvider> scmProviders;
    /**
     * @return The Selector allows to post-filter based on generated values using the kubernetes common labelSelector format.
     * 
     */
    private @Nullable GitopsApplicationsetApplicationsetSpecGeneratorSelector selector;

    private GitopsApplicationsetApplicationsetSpecGenerator() {}
    /**
     * @return The [cluster decision resource](https://argo-cd.readthedocs.io/en/stable/operator-manual/applicationset/Generators-Cluster-Decision-Resource/) generates a list of Argo CD clusters.
     * 
     */
    public List<GitopsApplicationsetApplicationsetSpecGeneratorClusterDecisionResource> clusterDecisionResources() {
        return this.clusterDecisionResources == null ? List.of() : this.clusterDecisionResources;
    }
    /**
     * @return The [cluster generator](https://argo-cd.readthedocs.io/en/stable/operator-manual/applicationset/Generators-Cluster/) produces parameters based on the list of items found within the cluster secret.
     * 
     */
    public List<GitopsApplicationsetApplicationsetSpecGeneratorCluster> clusters() {
        return this.clusters == null ? List.of() : this.clusters;
    }
    /**
     * @return [Git generators](https://argo-cd.readthedocs.io/en/stable/operator-manual/applicationset/Generators-Git/) generates parameters using either the directory structure of a specified Git repository (directory generator), or, using the contents of JSON/YAML files found within a specified repository (file generator).
     * 
     */
    public List<GitopsApplicationsetApplicationsetSpecGeneratorGit> gits() {
        return this.gits == null ? List.of() : this.gits;
    }
    /**
     * @return [List generators](https://argo-cd.readthedocs.io/en/stable/operator-manual/applicationset/Generators-List/) generate parameters based on an arbitrary list of key/value pairs (as long as the values are string values).
     * 
     */
    public List<GitopsApplicationsetApplicationsetSpecGeneratorList> lists() {
        return this.lists == null ? List.of() : this.lists;
    }
    /**
     * @return [Matrix generators](https://argo-cd.readthedocs.io/en/stable/operator-manual/applicationset/Generators-Matrix/) combine the parameters generated by two child generators, iterating through every combination of each generator&#39;s generated parameters. Take note of the [restrictions](https://argo-cd.readthedocs.io/en/stable/operator-manual/applicationset/Generators-Matrix/#restrictions) regarding their usage - particularly regarding nesting matrix generators.
     * 
     */
    public List<GitopsApplicationsetApplicationsetSpecGeneratorMatrix> matrices() {
        return this.matrices == null ? List.of() : this.matrices;
    }
    /**
     * @return [Merge generators](https://argo-cd.readthedocs.io/en/stable/operator-manual/applicationset/Generators-Merge/) combine parameters produced by the base (first) generator with matching parameter sets produced by subsequent generators. Take note of the [restrictions](https://argo-cd.readthedocs.io/en/stable/operator-manual/applicationset/Generators-Merge/#restrictions) regarding their usage - particularly regarding nesting merge generators.
     * 
     */
    public List<GitopsApplicationsetApplicationsetSpecGeneratorMerge> merges() {
        return this.merges == null ? List.of() : this.merges;
    }
    /**
     * @return [Pull Request generators](https://argo-cd.readthedocs.io/en/stable/operator-manual/applicationset/Generators-Pull-Request/) uses the API of an SCMaaS provider to automatically discover open pull requests within a repository.
     * 
     */
    public List<GitopsApplicationsetApplicationsetSpecGeneratorPullRequest> pullRequests() {
        return this.pullRequests == null ? List.of() : this.pullRequests;
    }
    /**
     * @return [SCM Provider generators](https://argo-cd.readthedocs.io/en/stable/operator-manual/applicationset/Generators-SCM-Provider/) uses the API of an SCMaaS provider to automatically discover repositories within an organization.
     * 
     */
    public List<GitopsApplicationsetApplicationsetSpecGeneratorScmProvider> scmProviders() {
        return this.scmProviders == null ? List.of() : this.scmProviders;
    }
    /**
     * @return The Selector allows to post-filter based on generated values using the kubernetes common labelSelector format.
     * 
     */
    public Optional<GitopsApplicationsetApplicationsetSpecGeneratorSelector> selector() {
        return Optional.ofNullable(this.selector);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GitopsApplicationsetApplicationsetSpecGenerator defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<GitopsApplicationsetApplicationsetSpecGeneratorClusterDecisionResource> clusterDecisionResources;
        private @Nullable List<GitopsApplicationsetApplicationsetSpecGeneratorCluster> clusters;
        private @Nullable List<GitopsApplicationsetApplicationsetSpecGeneratorGit> gits;
        private @Nullable List<GitopsApplicationsetApplicationsetSpecGeneratorList> lists;
        private @Nullable List<GitopsApplicationsetApplicationsetSpecGeneratorMatrix> matrices;
        private @Nullable List<GitopsApplicationsetApplicationsetSpecGeneratorMerge> merges;
        private @Nullable List<GitopsApplicationsetApplicationsetSpecGeneratorPullRequest> pullRequests;
        private @Nullable List<GitopsApplicationsetApplicationsetSpecGeneratorScmProvider> scmProviders;
        private @Nullable GitopsApplicationsetApplicationsetSpecGeneratorSelector selector;
        public Builder() {}
        public Builder(GitopsApplicationsetApplicationsetSpecGenerator defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clusterDecisionResources = defaults.clusterDecisionResources;
    	      this.clusters = defaults.clusters;
    	      this.gits = defaults.gits;
    	      this.lists = defaults.lists;
    	      this.matrices = defaults.matrices;
    	      this.merges = defaults.merges;
    	      this.pullRequests = defaults.pullRequests;
    	      this.scmProviders = defaults.scmProviders;
    	      this.selector = defaults.selector;
        }

        @CustomType.Setter
        public Builder clusterDecisionResources(@Nullable List<GitopsApplicationsetApplicationsetSpecGeneratorClusterDecisionResource> clusterDecisionResources) {

            this.clusterDecisionResources = clusterDecisionResources;
            return this;
        }
        public Builder clusterDecisionResources(GitopsApplicationsetApplicationsetSpecGeneratorClusterDecisionResource... clusterDecisionResources) {
            return clusterDecisionResources(List.of(clusterDecisionResources));
        }
        @CustomType.Setter
        public Builder clusters(@Nullable List<GitopsApplicationsetApplicationsetSpecGeneratorCluster> clusters) {

            this.clusters = clusters;
            return this;
        }
        public Builder clusters(GitopsApplicationsetApplicationsetSpecGeneratorCluster... clusters) {
            return clusters(List.of(clusters));
        }
        @CustomType.Setter
        public Builder gits(@Nullable List<GitopsApplicationsetApplicationsetSpecGeneratorGit> gits) {

            this.gits = gits;
            return this;
        }
        public Builder gits(GitopsApplicationsetApplicationsetSpecGeneratorGit... gits) {
            return gits(List.of(gits));
        }
        @CustomType.Setter
        public Builder lists(@Nullable List<GitopsApplicationsetApplicationsetSpecGeneratorList> lists) {

            this.lists = lists;
            return this;
        }
        public Builder lists(GitopsApplicationsetApplicationsetSpecGeneratorList... lists) {
            return lists(List.of(lists));
        }
        @CustomType.Setter
        public Builder matrices(@Nullable List<GitopsApplicationsetApplicationsetSpecGeneratorMatrix> matrices) {

            this.matrices = matrices;
            return this;
        }
        public Builder matrices(GitopsApplicationsetApplicationsetSpecGeneratorMatrix... matrices) {
            return matrices(List.of(matrices));
        }
        @CustomType.Setter
        public Builder merges(@Nullable List<GitopsApplicationsetApplicationsetSpecGeneratorMerge> merges) {

            this.merges = merges;
            return this;
        }
        public Builder merges(GitopsApplicationsetApplicationsetSpecGeneratorMerge... merges) {
            return merges(List.of(merges));
        }
        @CustomType.Setter
        public Builder pullRequests(@Nullable List<GitopsApplicationsetApplicationsetSpecGeneratorPullRequest> pullRequests) {

            this.pullRequests = pullRequests;
            return this;
        }
        public Builder pullRequests(GitopsApplicationsetApplicationsetSpecGeneratorPullRequest... pullRequests) {
            return pullRequests(List.of(pullRequests));
        }
        @CustomType.Setter
        public Builder scmProviders(@Nullable List<GitopsApplicationsetApplicationsetSpecGeneratorScmProvider> scmProviders) {

            this.scmProviders = scmProviders;
            return this;
        }
        public Builder scmProviders(GitopsApplicationsetApplicationsetSpecGeneratorScmProvider... scmProviders) {
            return scmProviders(List.of(scmProviders));
        }
        @CustomType.Setter
        public Builder selector(@Nullable GitopsApplicationsetApplicationsetSpecGeneratorSelector selector) {

            this.selector = selector;
            return this;
        }
        public GitopsApplicationsetApplicationsetSpecGenerator build() {
            final var _resultValue = new GitopsApplicationsetApplicationsetSpecGenerator();
            _resultValue.clusterDecisionResources = clusterDecisionResources;
            _resultValue.clusters = clusters;
            _resultValue.gits = gits;
            _resultValue.lists = lists;
            _resultValue.matrices = matrices;
            _resultValue.merges = merges;
            _resultValue.pullRequests = pullRequests;
            _resultValue.scmProviders = scmProviders;
            _resultValue.selector = selector;
            return _resultValue;
        }
    }
}
