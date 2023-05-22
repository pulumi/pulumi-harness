// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GitopsApplicationsApplicationSpecSyncPolicyRetryBackoff {
    private @Nullable String duration;
    private @Nullable String factor;
    private @Nullable String maxDuration;

    private GitopsApplicationsApplicationSpecSyncPolicyRetryBackoff() {}
    public Optional<String> duration() {
        return Optional.ofNullable(this.duration);
    }
    public Optional<String> factor() {
        return Optional.ofNullable(this.factor);
    }
    public Optional<String> maxDuration() {
        return Optional.ofNullable(this.maxDuration);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GitopsApplicationsApplicationSpecSyncPolicyRetryBackoff defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String duration;
        private @Nullable String factor;
        private @Nullable String maxDuration;
        public Builder() {}
        public Builder(GitopsApplicationsApplicationSpecSyncPolicyRetryBackoff defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.duration = defaults.duration;
    	      this.factor = defaults.factor;
    	      this.maxDuration = defaults.maxDuration;
        }

        @CustomType.Setter
        public Builder duration(@Nullable String duration) {
            this.duration = duration;
            return this;
        }
        @CustomType.Setter
        public Builder factor(@Nullable String factor) {
            this.factor = factor;
            return this;
        }
        @CustomType.Setter
        public Builder maxDuration(@Nullable String maxDuration) {
            this.maxDuration = maxDuration;
            return this;
        }
        public GitopsApplicationsApplicationSpecSyncPolicyRetryBackoff build() {
            final var o = new GitopsApplicationsApplicationSpecSyncPolicyRetryBackoff();
            o.duration = duration;
            o.factor = factor;
            o.maxDuration = maxDuration;
            return o;
        }
    }
}