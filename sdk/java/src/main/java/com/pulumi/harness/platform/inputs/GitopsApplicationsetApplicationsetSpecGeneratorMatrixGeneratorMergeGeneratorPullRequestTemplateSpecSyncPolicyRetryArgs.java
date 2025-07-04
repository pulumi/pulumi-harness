// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.harness.platform.inputs.GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMergeGeneratorPullRequestTemplateSpecSyncPolicyRetryBackoffArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMergeGeneratorPullRequestTemplateSpecSyncPolicyRetryArgs extends com.pulumi.resources.ResourceArgs {

    public static final GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMergeGeneratorPullRequestTemplateSpecSyncPolicyRetryArgs Empty = new GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMergeGeneratorPullRequestTemplateSpecSyncPolicyRetryArgs();

    /**
     * Controls how to backoff on subsequent retries of failed syncs.
     * 
     */
    @Import(name="backoff")
    private @Nullable Output<GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMergeGeneratorPullRequestTemplateSpecSyncPolicyRetryBackoffArgs> backoff;

    /**
     * @return Controls how to backoff on subsequent retries of failed syncs.
     * 
     */
    public Optional<Output<GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMergeGeneratorPullRequestTemplateSpecSyncPolicyRetryBackoffArgs>> backoff() {
        return Optional.ofNullable(this.backoff);
    }

    /**
     * Maximum number of attempts for retrying a failed sync. If set to 0, no retries will be performed.
     * 
     */
    @Import(name="limit")
    private @Nullable Output<String> limit;

    /**
     * @return Maximum number of attempts for retrying a failed sync. If set to 0, no retries will be performed.
     * 
     */
    public Optional<Output<String>> limit() {
        return Optional.ofNullable(this.limit);
    }

    private GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMergeGeneratorPullRequestTemplateSpecSyncPolicyRetryArgs() {}

    private GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMergeGeneratorPullRequestTemplateSpecSyncPolicyRetryArgs(GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMergeGeneratorPullRequestTemplateSpecSyncPolicyRetryArgs $) {
        this.backoff = $.backoff;
        this.limit = $.limit;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMergeGeneratorPullRequestTemplateSpecSyncPolicyRetryArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMergeGeneratorPullRequestTemplateSpecSyncPolicyRetryArgs $;

        public Builder() {
            $ = new GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMergeGeneratorPullRequestTemplateSpecSyncPolicyRetryArgs();
        }

        public Builder(GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMergeGeneratorPullRequestTemplateSpecSyncPolicyRetryArgs defaults) {
            $ = new GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMergeGeneratorPullRequestTemplateSpecSyncPolicyRetryArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param backoff Controls how to backoff on subsequent retries of failed syncs.
         * 
         * @return builder
         * 
         */
        public Builder backoff(@Nullable Output<GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMergeGeneratorPullRequestTemplateSpecSyncPolicyRetryBackoffArgs> backoff) {
            $.backoff = backoff;
            return this;
        }

        /**
         * @param backoff Controls how to backoff on subsequent retries of failed syncs.
         * 
         * @return builder
         * 
         */
        public Builder backoff(GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMergeGeneratorPullRequestTemplateSpecSyncPolicyRetryBackoffArgs backoff) {
            return backoff(Output.of(backoff));
        }

        /**
         * @param limit Maximum number of attempts for retrying a failed sync. If set to 0, no retries will be performed.
         * 
         * @return builder
         * 
         */
        public Builder limit(@Nullable Output<String> limit) {
            $.limit = limit;
            return this;
        }

        /**
         * @param limit Maximum number of attempts for retrying a failed sync. If set to 0, no retries will be performed.
         * 
         * @return builder
         * 
         */
        public Builder limit(String limit) {
            return limit(Output.of(limit));
        }

        public GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMergeGeneratorPullRequestTemplateSpecSyncPolicyRetryArgs build() {
            return $;
        }
    }

}
