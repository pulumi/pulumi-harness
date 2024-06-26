// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.harness.platform.inputs.GitOpsClusterRequestClusterInfoConnectionStateAttemptedAtArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GitOpsClusterRequestClusterInfoConnectionStateArgs extends com.pulumi.resources.ResourceArgs {

    public static final GitOpsClusterRequestClusterInfoConnectionStateArgs Empty = new GitOpsClusterRequestClusterInfoConnectionStateArgs();

    /**
     * Time when cluster cache refresh has been requested.
     * 
     */
    @Import(name="attemptedAts")
    private @Nullable Output<List<GitOpsClusterRequestClusterInfoConnectionStateAttemptedAtArgs>> attemptedAts;

    /**
     * @return Time when cluster cache refresh has been requested.
     * 
     */
    public Optional<Output<List<GitOpsClusterRequestClusterInfoConnectionStateAttemptedAtArgs>>> attemptedAts() {
        return Optional.ofNullable(this.attemptedAts);
    }

    /**
     * Information about the connection status.
     * 
     */
    @Import(name="message")
    private @Nullable Output<String> message;

    /**
     * @return Information about the connection status.
     * 
     */
    public Optional<Output<String>> message() {
        return Optional.ofNullable(this.message);
    }

    /**
     * Current status indicator of the connection.
     * 
     */
    @Import(name="status")
    private @Nullable Output<String> status;

    /**
     * @return Current status indicator of the connection.
     * 
     */
    public Optional<Output<String>> status() {
        return Optional.ofNullable(this.status);
    }

    private GitOpsClusterRequestClusterInfoConnectionStateArgs() {}

    private GitOpsClusterRequestClusterInfoConnectionStateArgs(GitOpsClusterRequestClusterInfoConnectionStateArgs $) {
        this.attemptedAts = $.attemptedAts;
        this.message = $.message;
        this.status = $.status;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GitOpsClusterRequestClusterInfoConnectionStateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GitOpsClusterRequestClusterInfoConnectionStateArgs $;

        public Builder() {
            $ = new GitOpsClusterRequestClusterInfoConnectionStateArgs();
        }

        public Builder(GitOpsClusterRequestClusterInfoConnectionStateArgs defaults) {
            $ = new GitOpsClusterRequestClusterInfoConnectionStateArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param attemptedAts Time when cluster cache refresh has been requested.
         * 
         * @return builder
         * 
         */
        public Builder attemptedAts(@Nullable Output<List<GitOpsClusterRequestClusterInfoConnectionStateAttemptedAtArgs>> attemptedAts) {
            $.attemptedAts = attemptedAts;
            return this;
        }

        /**
         * @param attemptedAts Time when cluster cache refresh has been requested.
         * 
         * @return builder
         * 
         */
        public Builder attemptedAts(List<GitOpsClusterRequestClusterInfoConnectionStateAttemptedAtArgs> attemptedAts) {
            return attemptedAts(Output.of(attemptedAts));
        }

        /**
         * @param attemptedAts Time when cluster cache refresh has been requested.
         * 
         * @return builder
         * 
         */
        public Builder attemptedAts(GitOpsClusterRequestClusterInfoConnectionStateAttemptedAtArgs... attemptedAts) {
            return attemptedAts(List.of(attemptedAts));
        }

        /**
         * @param message Information about the connection status.
         * 
         * @return builder
         * 
         */
        public Builder message(@Nullable Output<String> message) {
            $.message = message;
            return this;
        }

        /**
         * @param message Information about the connection status.
         * 
         * @return builder
         * 
         */
        public Builder message(String message) {
            return message(Output.of(message));
        }

        /**
         * @param status Current status indicator of the connection.
         * 
         * @return builder
         * 
         */
        public Builder status(@Nullable Output<String> status) {
            $.status = status;
            return this;
        }

        /**
         * @param status Current status indicator of the connection.
         * 
         * @return builder
         * 
         */
        public Builder status(String status) {
            return status(Output.of(status));
        }

        public GitOpsClusterRequestClusterInfoConnectionStateArgs build() {
            return $;
        }
    }

}
