// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.harness.platform.inputs.GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorGitTemplateMetadataArgs;
import com.pulumi.harness.platform.inputs.GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorGitTemplateSpecArgs;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorGitTemplateArgs extends com.pulumi.resources.ResourceArgs {

    public static final GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorGitTemplateArgs Empty = new GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorGitTemplateArgs();

    /**
     * Kubernetes object metadata for templated Application.
     * 
     */
    @Import(name="metadata")
    private @Nullable Output<GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorGitTemplateMetadataArgs> metadata;

    /**
     * @return Kubernetes object metadata for templated Application.
     * 
     */
    public Optional<Output<GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorGitTemplateMetadataArgs>> metadata() {
        return Optional.ofNullable(this.metadata);
    }

    /**
     * The application specification.
     * 
     */
    @Import(name="spec")
    private @Nullable Output<GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorGitTemplateSpecArgs> spec;

    /**
     * @return The application specification.
     * 
     */
    public Optional<Output<GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorGitTemplateSpecArgs>> spec() {
        return Optional.ofNullable(this.spec);
    }

    private GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorGitTemplateArgs() {}

    private GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorGitTemplateArgs(GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorGitTemplateArgs $) {
        this.metadata = $.metadata;
        this.spec = $.spec;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorGitTemplateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorGitTemplateArgs $;

        public Builder() {
            $ = new GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorGitTemplateArgs();
        }

        public Builder(GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorGitTemplateArgs defaults) {
            $ = new GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorGitTemplateArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param metadata Kubernetes object metadata for templated Application.
         * 
         * @return builder
         * 
         */
        public Builder metadata(@Nullable Output<GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorGitTemplateMetadataArgs> metadata) {
            $.metadata = metadata;
            return this;
        }

        /**
         * @param metadata Kubernetes object metadata for templated Application.
         * 
         * @return builder
         * 
         */
        public Builder metadata(GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorGitTemplateMetadataArgs metadata) {
            return metadata(Output.of(metadata));
        }

        /**
         * @param spec The application specification.
         * 
         * @return builder
         * 
         */
        public Builder spec(@Nullable Output<GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorGitTemplateSpecArgs> spec) {
            $.spec = spec;
            return this;
        }

        /**
         * @param spec The application specification.
         * 
         * @return builder
         * 
         */
        public Builder spec(GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorGitTemplateSpecArgs spec) {
            return spec(Output.of(spec));
        }

        public GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorGitTemplateArgs build() {
            return $;
        }
    }

}
