// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.harness.platform.outputs.GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMatrixGeneratorGitTemplateSpecDestination;
import com.pulumi.harness.platform.outputs.GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMatrixGeneratorGitTemplateSpecIgnoreDifference;
import com.pulumi.harness.platform.outputs.GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMatrixGeneratorGitTemplateSpecInfo;
import com.pulumi.harness.platform.outputs.GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMatrixGeneratorGitTemplateSpecSource;
import com.pulumi.harness.platform.outputs.GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMatrixGeneratorGitTemplateSpecSyncPolicy;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMatrixGeneratorGitTemplateSpec {
    /**
     * @return Reference to the Kubernetes server and namespace in which the application will be deployed.
     * 
     */
    private @Nullable GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMatrixGeneratorGitTemplateSpecDestination destination;
    /**
     * @return Resources and their fields which should be ignored during comparison. More info: https://argo-cd.readthedocs.io/en/stable/user-guide/diffing/#application-level-configuration.
     * 
     */
    private @Nullable List<GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMatrixGeneratorGitTemplateSpecIgnoreDifference> ignoreDifferences;
    /**
     * @return List of information (URLs, email addresses, and plain text) that relates to the application.
     * 
     */
    private @Nullable List<GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMatrixGeneratorGitTemplateSpecInfo> infos;
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
    private @Nullable List<GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMatrixGeneratorGitTemplateSpecSource> source;
    /**
     * @return Location of the application&#39;s manifests or chart. Use when specifying multiple fields
     * 
     */
    private @Nullable List<GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMatrixGeneratorGitTemplateSpecSource> sources;
    /**
     * @return Controls when and how a sync will be performed.
     * 
     */
    private @Nullable GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMatrixGeneratorGitTemplateSpecSyncPolicy syncPolicy;

    private GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMatrixGeneratorGitTemplateSpec() {}
    /**
     * @return Reference to the Kubernetes server and namespace in which the application will be deployed.
     * 
     */
    public Optional<GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMatrixGeneratorGitTemplateSpecDestination> destination() {
        return Optional.ofNullable(this.destination);
    }
    /**
     * @return Resources and their fields which should be ignored during comparison. More info: https://argo-cd.readthedocs.io/en/stable/user-guide/diffing/#application-level-configuration.
     * 
     */
    public List<GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMatrixGeneratorGitTemplateSpecIgnoreDifference> ignoreDifferences() {
        return this.ignoreDifferences == null ? List.of() : this.ignoreDifferences;
    }
    /**
     * @return List of information (URLs, email addresses, and plain text) that relates to the application.
     * 
     */
    public List<GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMatrixGeneratorGitTemplateSpecInfo> infos() {
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
    public List<GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMatrixGeneratorGitTemplateSpecSource> source() {
        return this.source == null ? List.of() : this.source;
    }
    /**
     * @return Location of the application&#39;s manifests or chart. Use when specifying multiple fields
     * 
     */
    public List<GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMatrixGeneratorGitTemplateSpecSource> sources() {
        return this.sources == null ? List.of() : this.sources;
    }
    /**
     * @return Controls when and how a sync will be performed.
     * 
     */
    public Optional<GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMatrixGeneratorGitTemplateSpecSyncPolicy> syncPolicy() {
        return Optional.ofNullable(this.syncPolicy);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMatrixGeneratorGitTemplateSpec defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMatrixGeneratorGitTemplateSpecDestination destination;
        private @Nullable List<GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMatrixGeneratorGitTemplateSpecIgnoreDifference> ignoreDifferences;
        private @Nullable List<GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMatrixGeneratorGitTemplateSpecInfo> infos;
        private @Nullable String project;
        private @Nullable Integer revisionHistoryLimit;
        private @Nullable List<GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMatrixGeneratorGitTemplateSpecSource> source;
        private @Nullable List<GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMatrixGeneratorGitTemplateSpecSource> sources;
        private @Nullable GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMatrixGeneratorGitTemplateSpecSyncPolicy syncPolicy;
        public Builder() {}
        public Builder(GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMatrixGeneratorGitTemplateSpec defaults) {
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
        public Builder destination(@Nullable GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMatrixGeneratorGitTemplateSpecDestination destination) {

            this.destination = destination;
            return this;
        }
        @CustomType.Setter
        public Builder ignoreDifferences(@Nullable List<GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMatrixGeneratorGitTemplateSpecIgnoreDifference> ignoreDifferences) {

            this.ignoreDifferences = ignoreDifferences;
            return this;
        }
        public Builder ignoreDifferences(GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMatrixGeneratorGitTemplateSpecIgnoreDifference... ignoreDifferences) {
            return ignoreDifferences(List.of(ignoreDifferences));
        }
        @CustomType.Setter
        public Builder infos(@Nullable List<GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMatrixGeneratorGitTemplateSpecInfo> infos) {

            this.infos = infos;
            return this;
        }
        public Builder infos(GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMatrixGeneratorGitTemplateSpecInfo... infos) {
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
        public Builder source(@Nullable List<GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMatrixGeneratorGitTemplateSpecSource> source) {

            this.source = source;
            return this;
        }
        public Builder source(GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMatrixGeneratorGitTemplateSpecSource... source) {
            return source(List.of(source));
        }
        @CustomType.Setter
        public Builder sources(@Nullable List<GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMatrixGeneratorGitTemplateSpecSource> sources) {

            this.sources = sources;
            return this;
        }
        public Builder sources(GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMatrixGeneratorGitTemplateSpecSource... sources) {
            return sources(List.of(sources));
        }
        @CustomType.Setter
        public Builder syncPolicy(@Nullable GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMatrixGeneratorGitTemplateSpecSyncPolicy syncPolicy) {

            this.syncPolicy = syncPolicy;
            return this;
        }
        public GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMatrixGeneratorGitTemplateSpec build() {
            final var _resultValue = new GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMatrixGeneratorGitTemplateSpec();
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
