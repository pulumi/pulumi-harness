// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.harness.platform.inputs.GitopsApplicationsetApplicationsetSpecGeneratorPullRequestTemplateMetadataArgs;
import com.pulumi.harness.platform.inputs.GitopsApplicationsetApplicationsetSpecGeneratorPullRequestTemplateSpecArgs;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GitopsApplicationsetApplicationsetSpecGeneratorPullRequestTemplateArgs extends com.pulumi.resources.ResourceArgs {

    public static final GitopsApplicationsetApplicationsetSpecGeneratorPullRequestTemplateArgs Empty = new GitopsApplicationsetApplicationsetSpecGeneratorPullRequestTemplateArgs();

    /**
     * Kubernetes object metadata for templated Application.
     * 
     */
    @Import(name="metadata")
    private @Nullable Output<GitopsApplicationsetApplicationsetSpecGeneratorPullRequestTemplateMetadataArgs> metadata;

    /**
     * @return Kubernetes object metadata for templated Application.
     * 
     */
    public Optional<Output<GitopsApplicationsetApplicationsetSpecGeneratorPullRequestTemplateMetadataArgs>> metadata() {
        return Optional.ofNullable(this.metadata);
    }

    /**
     * The application specification.
     * 
     */
    @Import(name="spec")
    private @Nullable Output<GitopsApplicationsetApplicationsetSpecGeneratorPullRequestTemplateSpecArgs> spec;

    /**
     * @return The application specification.
     * 
     */
    public Optional<Output<GitopsApplicationsetApplicationsetSpecGeneratorPullRequestTemplateSpecArgs>> spec() {
        return Optional.ofNullable(this.spec);
    }

    private GitopsApplicationsetApplicationsetSpecGeneratorPullRequestTemplateArgs() {}

    private GitopsApplicationsetApplicationsetSpecGeneratorPullRequestTemplateArgs(GitopsApplicationsetApplicationsetSpecGeneratorPullRequestTemplateArgs $) {
        this.metadata = $.metadata;
        this.spec = $.spec;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GitopsApplicationsetApplicationsetSpecGeneratorPullRequestTemplateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GitopsApplicationsetApplicationsetSpecGeneratorPullRequestTemplateArgs $;

        public Builder() {
            $ = new GitopsApplicationsetApplicationsetSpecGeneratorPullRequestTemplateArgs();
        }

        public Builder(GitopsApplicationsetApplicationsetSpecGeneratorPullRequestTemplateArgs defaults) {
            $ = new GitopsApplicationsetApplicationsetSpecGeneratorPullRequestTemplateArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param metadata Kubernetes object metadata for templated Application.
         * 
         * @return builder
         * 
         */
        public Builder metadata(@Nullable Output<GitopsApplicationsetApplicationsetSpecGeneratorPullRequestTemplateMetadataArgs> metadata) {
            $.metadata = metadata;
            return this;
        }

        /**
         * @param metadata Kubernetes object metadata for templated Application.
         * 
         * @return builder
         * 
         */
        public Builder metadata(GitopsApplicationsetApplicationsetSpecGeneratorPullRequestTemplateMetadataArgs metadata) {
            return metadata(Output.of(metadata));
        }

        /**
         * @param spec The application specification.
         * 
         * @return builder
         * 
         */
        public Builder spec(@Nullable Output<GitopsApplicationsetApplicationsetSpecGeneratorPullRequestTemplateSpecArgs> spec) {
            $.spec = spec;
            return this;
        }

        /**
         * @param spec The application specification.
         * 
         * @return builder
         * 
         */
        public Builder spec(GitopsApplicationsetApplicationsetSpecGeneratorPullRequestTemplateSpecArgs spec) {
            return spec(Output.of(spec));
        }

        public GitopsApplicationsetApplicationsetSpecGeneratorPullRequestTemplateArgs build() {
            return $;
        }
    }

}
