// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.harness.platform.outputs.GitopsApplicationsetApplicationsetSpecGeneratorClusterDecisionResourceTemplateSpecSyncPolicyRetryBackoff;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GitopsApplicationsetApplicationsetSpecGeneratorClusterDecisionResourceTemplateSpecSyncPolicyRetry {
    /**
     * @return Controls how to backoff on subsequent retries of failed syncs.
     * 
     */
    private @Nullable GitopsApplicationsetApplicationsetSpecGeneratorClusterDecisionResourceTemplateSpecSyncPolicyRetryBackoff backoff;
    /**
     * @return Maximum number of attempts for retrying a failed sync. If set to 0, no retries will be performed.
     * 
     */
    private @Nullable String limit;

    private GitopsApplicationsetApplicationsetSpecGeneratorClusterDecisionResourceTemplateSpecSyncPolicyRetry() {}
    /**
     * @return Controls how to backoff on subsequent retries of failed syncs.
     * 
     */
    public Optional<GitopsApplicationsetApplicationsetSpecGeneratorClusterDecisionResourceTemplateSpecSyncPolicyRetryBackoff> backoff() {
        return Optional.ofNullable(this.backoff);
    }
    /**
     * @return Maximum number of attempts for retrying a failed sync. If set to 0, no retries will be performed.
     * 
     */
    public Optional<String> limit() {
        return Optional.ofNullable(this.limit);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GitopsApplicationsetApplicationsetSpecGeneratorClusterDecisionResourceTemplateSpecSyncPolicyRetry defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable GitopsApplicationsetApplicationsetSpecGeneratorClusterDecisionResourceTemplateSpecSyncPolicyRetryBackoff backoff;
        private @Nullable String limit;
        public Builder() {}
        public Builder(GitopsApplicationsetApplicationsetSpecGeneratorClusterDecisionResourceTemplateSpecSyncPolicyRetry defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backoff = defaults.backoff;
    	      this.limit = defaults.limit;
        }

        @CustomType.Setter
        public Builder backoff(@Nullable GitopsApplicationsetApplicationsetSpecGeneratorClusterDecisionResourceTemplateSpecSyncPolicyRetryBackoff backoff) {

            this.backoff = backoff;
            return this;
        }
        @CustomType.Setter
        public Builder limit(@Nullable String limit) {

            this.limit = limit;
            return this;
        }
        public GitopsApplicationsetApplicationsetSpecGeneratorClusterDecisionResourceTemplateSpecSyncPolicyRetry build() {
            final var _resultValue = new GitopsApplicationsetApplicationsetSpecGeneratorClusterDecisionResourceTemplateSpecSyncPolicyRetry();
            _resultValue.backoff = backoff;
            _resultValue.limit = limit;
            return _resultValue;
        }
    }
}
