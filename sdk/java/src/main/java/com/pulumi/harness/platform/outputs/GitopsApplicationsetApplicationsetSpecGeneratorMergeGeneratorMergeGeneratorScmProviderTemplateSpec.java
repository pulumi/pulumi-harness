// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.harness.platform.outputs.GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMergeGeneratorScmProviderTemplateSpecDestination;
import com.pulumi.harness.platform.outputs.GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMergeGeneratorScmProviderTemplateSpecIgnoreDifference;
import com.pulumi.harness.platform.outputs.GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMergeGeneratorScmProviderTemplateSpecInfo;
import com.pulumi.harness.platform.outputs.GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMergeGeneratorScmProviderTemplateSpecSource;
import com.pulumi.harness.platform.outputs.GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMergeGeneratorScmProviderTemplateSpecSyncPolicy;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMergeGeneratorScmProviderTemplateSpec {
    /**
     * @return Reference to the Kubernetes server and namespace in which the application will be deployed.
     * 
     */
    private @Nullable GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMergeGeneratorScmProviderTemplateSpecDestination destination;
    /**
     * @return Resources and their fields which should be ignored during comparison. More info: https://argo-cd.readthedocs.io/en/stable/user-guide/diffing/#application-level-configuration.
     * 
     */
    private @Nullable List<GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMergeGeneratorScmProviderTemplateSpecIgnoreDifference> ignoreDifferences;
    /**
     * @return List of information (URLs, email addresses, and plain text) that relates to the application.
     * 
     */
    private @Nullable List<GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMergeGeneratorScmProviderTemplateSpecInfo> infos;
    /**
     * @return The project the application belongs to.
     * 
     */
    private @Nullable String project;
    /**
     * @return Limits the number of items kept in the application&#39;s revision history, which is used for informational purposes as well as for rollbacks to previous versions. This should only be changed in exceptional circumstances. Setting to zero will store no history. This will reduce storage used. Increasing will increase the space used to store the history, so we do not recommend increasing it. Default is 10.
     * 
     */
    private @Nullable Integer revisionHistoryLimit;
    /**
     * @return Location of the application&#39;s manifests or chart.
     * 
     */
    private @Nullable List<GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMergeGeneratorScmProviderTemplateSpecSource> source;
    /**
     * @return Location of the application&#39;s manifests or chart. Use when specifying multiple fields
     * 
     */
    private @Nullable List<GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMergeGeneratorScmProviderTemplateSpecSource> sources;
    /**
     * @return Controls when and how a sync will be performed.
     * 
     */
    private @Nullable GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMergeGeneratorScmProviderTemplateSpecSyncPolicy syncPolicy;

    private GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMergeGeneratorScmProviderTemplateSpec() {}
    /**
     * @return Reference to the Kubernetes server and namespace in which the application will be deployed.
     * 
     */
    public Optional<GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMergeGeneratorScmProviderTemplateSpecDestination> destination() {
        return Optional.ofNullable(this.destination);
    }
    /**
     * @return Resources and their fields which should be ignored during comparison. More info: https://argo-cd.readthedocs.io/en/stable/user-guide/diffing/#application-level-configuration.
     * 
     */
    public List<GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMergeGeneratorScmProviderTemplateSpecIgnoreDifference> ignoreDifferences() {
        return this.ignoreDifferences == null ? List.of() : this.ignoreDifferences;
    }
    /**
     * @return List of information (URLs, email addresses, and plain text) that relates to the application.
     * 
     */
    public List<GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMergeGeneratorScmProviderTemplateSpecInfo> infos() {
        return this.infos == null ? List.of() : this.infos;
    }
    /**
     * @return The project the application belongs to.
     * 
     */
    public Optional<String> project() {
        return Optional.ofNullable(this.project);
    }
    /**
     * @return Limits the number of items kept in the application&#39;s revision history, which is used for informational purposes as well as for rollbacks to previous versions. This should only be changed in exceptional circumstances. Setting to zero will store no history. This will reduce storage used. Increasing will increase the space used to store the history, so we do not recommend increasing it. Default is 10.
     * 
     */
    public Optional<Integer> revisionHistoryLimit() {
        return Optional.ofNullable(this.revisionHistoryLimit);
    }
    /**
     * @return Location of the application&#39;s manifests or chart.
     * 
     */
    public List<GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMergeGeneratorScmProviderTemplateSpecSource> source() {
        return this.source == null ? List.of() : this.source;
    }
    /**
     * @return Location of the application&#39;s manifests or chart. Use when specifying multiple fields
     * 
     */
    public List<GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMergeGeneratorScmProviderTemplateSpecSource> sources() {
        return this.sources == null ? List.of() : this.sources;
    }
    /**
     * @return Controls when and how a sync will be performed.
     * 
     */
    public Optional<GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMergeGeneratorScmProviderTemplateSpecSyncPolicy> syncPolicy() {
        return Optional.ofNullable(this.syncPolicy);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMergeGeneratorScmProviderTemplateSpec defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMergeGeneratorScmProviderTemplateSpecDestination destination;
        private @Nullable List<GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMergeGeneratorScmProviderTemplateSpecIgnoreDifference> ignoreDifferences;
        private @Nullable List<GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMergeGeneratorScmProviderTemplateSpecInfo> infos;
        private @Nullable String project;
        private @Nullable Integer revisionHistoryLimit;
        private @Nullable List<GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMergeGeneratorScmProviderTemplateSpecSource> source;
        private @Nullable List<GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMergeGeneratorScmProviderTemplateSpecSource> sources;
        private @Nullable GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMergeGeneratorScmProviderTemplateSpecSyncPolicy syncPolicy;
        public Builder() {}
        public Builder(GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMergeGeneratorScmProviderTemplateSpec defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.destination = defaults.destination;
    	      this.ignoreDifferences = defaults.ignoreDifferences;
    	      this.infos = defaults.infos;
    	      this.project = defaults.project;
    	      this.revisionHistoryLimit = defaults.revisionHistoryLimit;
    	      this.source = defaults.source;
    	      this.sources = defaults.sources;
    	      this.syncPolicy = defaults.syncPolicy;
        }

        @CustomType.Setter
        public Builder destination(@Nullable GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMergeGeneratorScmProviderTemplateSpecDestination destination) {

            this.destination = destination;
            return this;
        }
        @CustomType.Setter
        public Builder ignoreDifferences(@Nullable List<GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMergeGeneratorScmProviderTemplateSpecIgnoreDifference> ignoreDifferences) {

            this.ignoreDifferences = ignoreDifferences;
            return this;
        }
        public Builder ignoreDifferences(GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMergeGeneratorScmProviderTemplateSpecIgnoreDifference... ignoreDifferences) {
            return ignoreDifferences(List.of(ignoreDifferences));
        }
        @CustomType.Setter
        public Builder infos(@Nullable List<GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMergeGeneratorScmProviderTemplateSpecInfo> infos) {

            this.infos = infos;
            return this;
        }
        public Builder infos(GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMergeGeneratorScmProviderTemplateSpecInfo... infos) {
            return infos(List.of(infos));
        }
        @CustomType.Setter
        public Builder project(@Nullable String project) {

            this.project = project;
            return this;
        }
        @CustomType.Setter
        public Builder revisionHistoryLimit(@Nullable Integer revisionHistoryLimit) {

            this.revisionHistoryLimit = revisionHistoryLimit;
            return this;
        }
        @CustomType.Setter
        public Builder source(@Nullable List<GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMergeGeneratorScmProviderTemplateSpecSource> source) {

            this.source = source;
            return this;
        }
        public Builder source(GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMergeGeneratorScmProviderTemplateSpecSource... source) {
            return source(List.of(source));
        }
        @CustomType.Setter
        public Builder sources(@Nullable List<GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMergeGeneratorScmProviderTemplateSpecSource> sources) {

            this.sources = sources;
            return this;
        }
        public Builder sources(GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMergeGeneratorScmProviderTemplateSpecSource... sources) {
            return sources(List.of(sources));
        }
        @CustomType.Setter
        public Builder syncPolicy(@Nullable GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMergeGeneratorScmProviderTemplateSpecSyncPolicy syncPolicy) {

            this.syncPolicy = syncPolicy;
            return this;
        }
        public GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMergeGeneratorScmProviderTemplateSpec build() {
            final var _resultValue = new GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMergeGeneratorScmProviderTemplateSpec();
            _resultValue.destination = destination;
            _resultValue.ignoreDifferences = ignoreDifferences;
            _resultValue.infos = infos;
            _resultValue.project = project;
            _resultValue.revisionHistoryLimit = revisionHistoryLimit;
            _resultValue.source = source;
            _resultValue.sources = sources;
            _resultValue.syncPolicy = syncPolicy;
            return _resultValue;
        }
    }
}
