// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetGitopsApplicationsApplicationSpecSyncPolicyRetryBackoff extends com.pulumi.resources.InvokeArgs {

    public static final GetGitopsApplicationsApplicationSpecSyncPolicyRetryBackoff Empty = new GetGitopsApplicationsApplicationSpecSyncPolicyRetryBackoff();

    /**
     * Amount to back off. Default unit is seconds, but could also be a duration (e.g. &#34;2m&#34;, &#34;1h&#34;).
     * 
     */
    @Import(name="duration")
    private @Nullable String duration;

    /**
     * @return Amount to back off. Default unit is seconds, but could also be a duration (e.g. &#34;2m&#34;, &#34;1h&#34;).
     * 
     */
    public Optional<String> duration() {
        return Optional.ofNullable(this.duration);
    }

    /**
     * Factor to multiply the base duration after each failed retry.
     * 
     */
    @Import(name="factor")
    private @Nullable String factor;

    /**
     * @return Factor to multiply the base duration after each failed retry.
     * 
     */
    public Optional<String> factor() {
        return Optional.ofNullable(this.factor);
    }

    /**
     * Maximum amount of time allowed of the backoff strategy.
     * 
     */
    @Import(name="maxDuration")
    private @Nullable String maxDuration;

    /**
     * @return Maximum amount of time allowed of the backoff strategy.
     * 
     */
    public Optional<String> maxDuration() {
        return Optional.ofNullable(this.maxDuration);
    }

    private GetGitopsApplicationsApplicationSpecSyncPolicyRetryBackoff() {}

    private GetGitopsApplicationsApplicationSpecSyncPolicyRetryBackoff(GetGitopsApplicationsApplicationSpecSyncPolicyRetryBackoff $) {
        this.duration = $.duration;
        this.factor = $.factor;
        this.maxDuration = $.maxDuration;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetGitopsApplicationsApplicationSpecSyncPolicyRetryBackoff defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetGitopsApplicationsApplicationSpecSyncPolicyRetryBackoff $;

        public Builder() {
            $ = new GetGitopsApplicationsApplicationSpecSyncPolicyRetryBackoff();
        }

        public Builder(GetGitopsApplicationsApplicationSpecSyncPolicyRetryBackoff defaults) {
            $ = new GetGitopsApplicationsApplicationSpecSyncPolicyRetryBackoff(Objects.requireNonNull(defaults));
        }

        /**
         * @param duration Amount to back off. Default unit is seconds, but could also be a duration (e.g. &#34;2m&#34;, &#34;1h&#34;).
         * 
         * @return builder
         * 
         */
        public Builder duration(@Nullable String duration) {
            $.duration = duration;
            return this;
        }

        /**
         * @param factor Factor to multiply the base duration after each failed retry.
         * 
         * @return builder
         * 
         */
        public Builder factor(@Nullable String factor) {
            $.factor = factor;
            return this;
        }

        /**
         * @param maxDuration Maximum amount of time allowed of the backoff strategy.
         * 
         * @return builder
         * 
         */
        public Builder maxDuration(@Nullable String maxDuration) {
            $.maxDuration = maxDuration;
            return this;
        }

        public GetGitopsApplicationsApplicationSpecSyncPolicyRetryBackoff build() {
            return $;
        }
    }

}
