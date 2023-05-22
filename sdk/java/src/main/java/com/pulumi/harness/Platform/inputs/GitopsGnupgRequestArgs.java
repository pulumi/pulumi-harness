// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.harness.platform.inputs.GitopsGnupgRequestPublickeyArgs;
import java.lang.Boolean;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GitopsGnupgRequestArgs extends com.pulumi.resources.ResourceArgs {

    public static final GitopsGnupgRequestArgs Empty = new GitopsGnupgRequestArgs();

    /**
     * Public key details.
     * 
     */
    @Import(name="publickeys")
    private @Nullable Output<List<GitopsGnupgRequestPublickeyArgs>> publickeys;

    /**
     * @return Public key details.
     * 
     */
    public Optional<Output<List<GitopsGnupgRequestPublickeyArgs>>> publickeys() {
        return Optional.ofNullable(this.publickeys);
    }

    /**
     * Indicates if the GnuPG Key should be inserted if not present or updated if present.
     * 
     */
    @Import(name="upsert", required=true)
    private Output<Boolean> upsert;

    /**
     * @return Indicates if the GnuPG Key should be inserted if not present or updated if present.
     * 
     */
    public Output<Boolean> upsert() {
        return this.upsert;
    }

    private GitopsGnupgRequestArgs() {}

    private GitopsGnupgRequestArgs(GitopsGnupgRequestArgs $) {
        this.publickeys = $.publickeys;
        this.upsert = $.upsert;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GitopsGnupgRequestArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GitopsGnupgRequestArgs $;

        public Builder() {
            $ = new GitopsGnupgRequestArgs();
        }

        public Builder(GitopsGnupgRequestArgs defaults) {
            $ = new GitopsGnupgRequestArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param publickeys Public key details.
         * 
         * @return builder
         * 
         */
        public Builder publickeys(@Nullable Output<List<GitopsGnupgRequestPublickeyArgs>> publickeys) {
            $.publickeys = publickeys;
            return this;
        }

        /**
         * @param publickeys Public key details.
         * 
         * @return builder
         * 
         */
        public Builder publickeys(List<GitopsGnupgRequestPublickeyArgs> publickeys) {
            return publickeys(Output.of(publickeys));
        }

        /**
         * @param publickeys Public key details.
         * 
         * @return builder
         * 
         */
        public Builder publickeys(GitopsGnupgRequestPublickeyArgs... publickeys) {
            return publickeys(List.of(publickeys));
        }

        /**
         * @param upsert Indicates if the GnuPG Key should be inserted if not present or updated if present.
         * 
         * @return builder
         * 
         */
        public Builder upsert(Output<Boolean> upsert) {
            $.upsert = upsert;
            return this;
        }

        /**
         * @param upsert Indicates if the GnuPG Key should be inserted if not present or updated if present.
         * 
         * @return builder
         * 
         */
        public Builder upsert(Boolean upsert) {
            return upsert(Output.of(upsert));
        }

        public GitopsGnupgRequestArgs build() {
            $.upsert = Objects.requireNonNull($.upsert, "expected parameter 'upsert' to be non-null");
            return $;
        }
    }

}