// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.harness.platform.inputs.GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMergeGeneratorClusterTemplateSpecDestinationArgs;
import com.pulumi.harness.platform.inputs.GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMergeGeneratorClusterTemplateSpecIgnoreDifferenceArgs;
import com.pulumi.harness.platform.inputs.GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMergeGeneratorClusterTemplateSpecInfoArgs;
import com.pulumi.harness.platform.inputs.GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMergeGeneratorClusterTemplateSpecSourceArgs;
import com.pulumi.harness.platform.inputs.GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMergeGeneratorClusterTemplateSpecSyncPolicyArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMergeGeneratorClusterTemplateSpecArgs extends com.pulumi.resources.ResourceArgs {

    public static final GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMergeGeneratorClusterTemplateSpecArgs Empty = new GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMergeGeneratorClusterTemplateSpecArgs();

    /**
     * Reference to the Kubernetes server and namespace in which the application will be deployed.
     * 
     */
    @Import(name="destination")
    private @Nullable Output<GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMergeGeneratorClusterTemplateSpecDestinationArgs> destination;

    /**
     * @return Reference to the Kubernetes server and namespace in which the application will be deployed.
     * 
     */
    public Optional<Output<GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMergeGeneratorClusterTemplateSpecDestinationArgs>> destination() {
        return Optional.ofNullable(this.destination);
    }

    /**
     * Resources and their fields which should be ignored during comparison. More info: https://argo-cd.readthedocs.io/en/stable/user-guide/diffing/#application-level-configuration.
     * 
     */
    @Import(name="ignoreDifferences")
    private @Nullable Output<List<GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMergeGeneratorClusterTemplateSpecIgnoreDifferenceArgs>> ignoreDifferences;

    /**
     * @return Resources and their fields which should be ignored during comparison. More info: https://argo-cd.readthedocs.io/en/stable/user-guide/diffing/#application-level-configuration.
     * 
     */
    public Optional<Output<List<GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMergeGeneratorClusterTemplateSpecIgnoreDifferenceArgs>>> ignoreDifferences() {
        return Optional.ofNullable(this.ignoreDifferences);
    }

    /**
     * List of information (URLs, email addresses, and plain text) that relates to the application.
     * 
     */
    @Import(name="infos")
    private @Nullable Output<List<GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMergeGeneratorClusterTemplateSpecInfoArgs>> infos;

    /**
     * @return List of information (URLs, email addresses, and plain text) that relates to the application.
     * 
     */
    public Optional<Output<List<GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMergeGeneratorClusterTemplateSpecInfoArgs>>> infos() {
        return Optional.ofNullable(this.infos);
    }

    /**
     * The project the application belongs to.
     * 
     */
    @Import(name="project")
    private @Nullable Output<String> project;

    /**
     * @return The project the application belongs to.
     * 
     */
    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    /**
     * Limits the number of items kept in the application&#39;s revision history, which is used for informational purposes as well as for rollbacks to previous versions. This should only be changed in exceptional circumstances. Setting to zero will store no history. This will reduce storage used. Increasing will increase the space used to store the history, so we do not recommend increasing it. Default is 10.
     * 
     */
    @Import(name="revisionHistoryLimit")
    private @Nullable Output<Integer> revisionHistoryLimit;

    /**
     * @return Limits the number of items kept in the application&#39;s revision history, which is used for informational purposes as well as for rollbacks to previous versions. This should only be changed in exceptional circumstances. Setting to zero will store no history. This will reduce storage used. Increasing will increase the space used to store the history, so we do not recommend increasing it. Default is 10.
     * 
     */
    public Optional<Output<Integer>> revisionHistoryLimit() {
        return Optional.ofNullable(this.revisionHistoryLimit);
    }

    /**
     * Location of the application&#39;s manifests or chart.
     * 
     */
    @Import(name="source")
    private @Nullable Output<List<GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMergeGeneratorClusterTemplateSpecSourceArgs>> source;

    /**
     * @return Location of the application&#39;s manifests or chart.
     * 
     */
    public Optional<Output<List<GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMergeGeneratorClusterTemplateSpecSourceArgs>>> source() {
        return Optional.ofNullable(this.source);
    }

    /**
     * Location of the application&#39;s manifests or chart. Use when specifying multiple fields
     * 
     */
    @Import(name="sources")
    private @Nullable Output<List<GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMergeGeneratorClusterTemplateSpecSourceArgs>> sources;

    /**
     * @return Location of the application&#39;s manifests or chart. Use when specifying multiple fields
     * 
     */
    public Optional<Output<List<GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMergeGeneratorClusterTemplateSpecSourceArgs>>> sources() {
        return Optional.ofNullable(this.sources);
    }

    /**
     * Controls when and how a sync will be performed.
     * 
     */
    @Import(name="syncPolicy")
    private @Nullable Output<GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMergeGeneratorClusterTemplateSpecSyncPolicyArgs> syncPolicy;

    /**
     * @return Controls when and how a sync will be performed.
     * 
     */
    public Optional<Output<GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMergeGeneratorClusterTemplateSpecSyncPolicyArgs>> syncPolicy() {
        return Optional.ofNullable(this.syncPolicy);
    }

    private GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMergeGeneratorClusterTemplateSpecArgs() {}

    private GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMergeGeneratorClusterTemplateSpecArgs(GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMergeGeneratorClusterTemplateSpecArgs $) {
        this.destination = $.destination;
        this.ignoreDifferences = $.ignoreDifferences;
        this.infos = $.infos;
        this.project = $.project;
        this.revisionHistoryLimit = $.revisionHistoryLimit;
        this.source = $.source;
        this.sources = $.sources;
        this.syncPolicy = $.syncPolicy;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMergeGeneratorClusterTemplateSpecArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMergeGeneratorClusterTemplateSpecArgs $;

        public Builder() {
            $ = new GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMergeGeneratorClusterTemplateSpecArgs();
        }

        public Builder(GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMergeGeneratorClusterTemplateSpecArgs defaults) {
            $ = new GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMergeGeneratorClusterTemplateSpecArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param destination Reference to the Kubernetes server and namespace in which the application will be deployed.
         * 
         * @return builder
         * 
         */
        public Builder destination(@Nullable Output<GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMergeGeneratorClusterTemplateSpecDestinationArgs> destination) {
            $.destination = destination;
            return this;
        }

        /**
         * @param destination Reference to the Kubernetes server and namespace in which the application will be deployed.
         * 
         * @return builder
         * 
         */
        public Builder destination(GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMergeGeneratorClusterTemplateSpecDestinationArgs destination) {
            return destination(Output.of(destination));
        }

        /**
         * @param ignoreDifferences Resources and their fields which should be ignored during comparison. More info: https://argo-cd.readthedocs.io/en/stable/user-guide/diffing/#application-level-configuration.
         * 
         * @return builder
         * 
         */
        public Builder ignoreDifferences(@Nullable Output<List<GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMergeGeneratorClusterTemplateSpecIgnoreDifferenceArgs>> ignoreDifferences) {
            $.ignoreDifferences = ignoreDifferences;
            return this;
        }

        /**
         * @param ignoreDifferences Resources and their fields which should be ignored during comparison. More info: https://argo-cd.readthedocs.io/en/stable/user-guide/diffing/#application-level-configuration.
         * 
         * @return builder
         * 
         */
        public Builder ignoreDifferences(List<GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMergeGeneratorClusterTemplateSpecIgnoreDifferenceArgs> ignoreDifferences) {
            return ignoreDifferences(Output.of(ignoreDifferences));
        }

        /**
         * @param ignoreDifferences Resources and their fields which should be ignored during comparison. More info: https://argo-cd.readthedocs.io/en/stable/user-guide/diffing/#application-level-configuration.
         * 
         * @return builder
         * 
         */
        public Builder ignoreDifferences(GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMergeGeneratorClusterTemplateSpecIgnoreDifferenceArgs... ignoreDifferences) {
            return ignoreDifferences(List.of(ignoreDifferences));
        }

        /**
         * @param infos List of information (URLs, email addresses, and plain text) that relates to the application.
         * 
         * @return builder
         * 
         */
        public Builder infos(@Nullable Output<List<GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMergeGeneratorClusterTemplateSpecInfoArgs>> infos) {
            $.infos = infos;
            return this;
        }

        /**
         * @param infos List of information (URLs, email addresses, and plain text) that relates to the application.
         * 
         * @return builder
         * 
         */
        public Builder infos(List<GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMergeGeneratorClusterTemplateSpecInfoArgs> infos) {
            return infos(Output.of(infos));
        }

        /**
         * @param infos List of information (URLs, email addresses, and plain text) that relates to the application.
         * 
         * @return builder
         * 
         */
        public Builder infos(GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMergeGeneratorClusterTemplateSpecInfoArgs... infos) {
            return infos(List.of(infos));
        }

        /**
         * @param project The project the application belongs to.
         * 
         * @return builder
         * 
         */
        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        /**
         * @param project The project the application belongs to.
         * 
         * @return builder
         * 
         */
        public Builder project(String project) {
            return project(Output.of(project));
        }

        /**
         * @param revisionHistoryLimit Limits the number of items kept in the application&#39;s revision history, which is used for informational purposes as well as for rollbacks to previous versions. This should only be changed in exceptional circumstances. Setting to zero will store no history. This will reduce storage used. Increasing will increase the space used to store the history, so we do not recommend increasing it. Default is 10.
         * 
         * @return builder
         * 
         */
        public Builder revisionHistoryLimit(@Nullable Output<Integer> revisionHistoryLimit) {
            $.revisionHistoryLimit = revisionHistoryLimit;
            return this;
        }

        /**
         * @param revisionHistoryLimit Limits the number of items kept in the application&#39;s revision history, which is used for informational purposes as well as for rollbacks to previous versions. This should only be changed in exceptional circumstances. Setting to zero will store no history. This will reduce storage used. Increasing will increase the space used to store the history, so we do not recommend increasing it. Default is 10.
         * 
         * @return builder
         * 
         */
        public Builder revisionHistoryLimit(Integer revisionHistoryLimit) {
            return revisionHistoryLimit(Output.of(revisionHistoryLimit));
        }

        /**
         * @param source Location of the application&#39;s manifests or chart.
         * 
         * @return builder
         * 
         */
        public Builder source(@Nullable Output<List<GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMergeGeneratorClusterTemplateSpecSourceArgs>> source) {
            $.source = source;
            return this;
        }

        /**
         * @param source Location of the application&#39;s manifests or chart.
         * 
         * @return builder
         * 
         */
        public Builder source(List<GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMergeGeneratorClusterTemplateSpecSourceArgs> source) {
            return source(Output.of(source));
        }

        /**
         * @param source Location of the application&#39;s manifests or chart.
         * 
         * @return builder
         * 
         */
        public Builder source(GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMergeGeneratorClusterTemplateSpecSourceArgs... source) {
            return source(List.of(source));
        }

        /**
         * @param sources Location of the application&#39;s manifests or chart. Use when specifying multiple fields
         * 
         * @return builder
         * 
         */
        public Builder sources(@Nullable Output<List<GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMergeGeneratorClusterTemplateSpecSourceArgs>> sources) {
            $.sources = sources;
            return this;
        }

        /**
         * @param sources Location of the application&#39;s manifests or chart. Use when specifying multiple fields
         * 
         * @return builder
         * 
         */
        public Builder sources(List<GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMergeGeneratorClusterTemplateSpecSourceArgs> sources) {
            return sources(Output.of(sources));
        }

        /**
         * @param sources Location of the application&#39;s manifests or chart. Use when specifying multiple fields
         * 
         * @return builder
         * 
         */
        public Builder sources(GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMergeGeneratorClusterTemplateSpecSourceArgs... sources) {
            return sources(List.of(sources));
        }

        /**
         * @param syncPolicy Controls when and how a sync will be performed.
         * 
         * @return builder
         * 
         */
        public Builder syncPolicy(@Nullable Output<GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMergeGeneratorClusterTemplateSpecSyncPolicyArgs> syncPolicy) {
            $.syncPolicy = syncPolicy;
            return this;
        }

        /**
         * @param syncPolicy Controls when and how a sync will be performed.
         * 
         * @return builder
         * 
         */
        public Builder syncPolicy(GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMergeGeneratorClusterTemplateSpecSyncPolicyArgs syncPolicy) {
            return syncPolicy(Output.of(syncPolicy));
        }

        public GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMergeGeneratorClusterTemplateSpecArgs build() {
            return $;
        }
    }

}
