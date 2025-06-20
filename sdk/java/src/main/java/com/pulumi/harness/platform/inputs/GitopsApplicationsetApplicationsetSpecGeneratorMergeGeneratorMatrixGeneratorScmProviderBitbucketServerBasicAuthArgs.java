// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.harness.platform.inputs.GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMatrixGeneratorScmProviderBitbucketServerBasicAuthPasswordRefArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMatrixGeneratorScmProviderBitbucketServerBasicAuthArgs extends com.pulumi.resources.ResourceArgs {

    public static final GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMatrixGeneratorScmProviderBitbucketServerBasicAuthArgs Empty = new GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMatrixGeneratorScmProviderBitbucketServerBasicAuthArgs();

    /**
     * Password (or personal access token) reference.
     * 
     */
    @Import(name="passwordRef")
    private @Nullable Output<GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMatrixGeneratorScmProviderBitbucketServerBasicAuthPasswordRefArgs> passwordRef;

    /**
     * @return Password (or personal access token) reference.
     * 
     */
    public Optional<Output<GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMatrixGeneratorScmProviderBitbucketServerBasicAuthPasswordRefArgs>> passwordRef() {
        return Optional.ofNullable(this.passwordRef);
    }

    /**
     * Username for Basic auth.
     * 
     */
    @Import(name="username")
    private @Nullable Output<String> username;

    /**
     * @return Username for Basic auth.
     * 
     */
    public Optional<Output<String>> username() {
        return Optional.ofNullable(this.username);
    }

    private GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMatrixGeneratorScmProviderBitbucketServerBasicAuthArgs() {}

    private GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMatrixGeneratorScmProviderBitbucketServerBasicAuthArgs(GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMatrixGeneratorScmProviderBitbucketServerBasicAuthArgs $) {
        this.passwordRef = $.passwordRef;
        this.username = $.username;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMatrixGeneratorScmProviderBitbucketServerBasicAuthArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMatrixGeneratorScmProviderBitbucketServerBasicAuthArgs $;

        public Builder() {
            $ = new GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMatrixGeneratorScmProviderBitbucketServerBasicAuthArgs();
        }

        public Builder(GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMatrixGeneratorScmProviderBitbucketServerBasicAuthArgs defaults) {
            $ = new GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMatrixGeneratorScmProviderBitbucketServerBasicAuthArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param passwordRef Password (or personal access token) reference.
         * 
         * @return builder
         * 
         */
        public Builder passwordRef(@Nullable Output<GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMatrixGeneratorScmProviderBitbucketServerBasicAuthPasswordRefArgs> passwordRef) {
            $.passwordRef = passwordRef;
            return this;
        }

        /**
         * @param passwordRef Password (or personal access token) reference.
         * 
         * @return builder
         * 
         */
        public Builder passwordRef(GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMatrixGeneratorScmProviderBitbucketServerBasicAuthPasswordRefArgs passwordRef) {
            return passwordRef(Output.of(passwordRef));
        }

        /**
         * @param username Username for Basic auth.
         * 
         * @return builder
         * 
         */
        public Builder username(@Nullable Output<String> username) {
            $.username = username;
            return this;
        }

        /**
         * @param username Username for Basic auth.
         * 
         * @return builder
         * 
         */
        public Builder username(String username) {
            return username(Output.of(username));
        }

        public GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMatrixGeneratorScmProviderBitbucketServerBasicAuthArgs build() {
            return $;
        }
    }

}
