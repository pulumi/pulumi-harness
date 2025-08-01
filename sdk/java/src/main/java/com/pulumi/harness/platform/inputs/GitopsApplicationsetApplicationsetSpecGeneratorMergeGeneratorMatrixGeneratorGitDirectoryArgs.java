// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMatrixGeneratorGitDirectoryArgs extends com.pulumi.resources.ResourceArgs {

    public static final GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMatrixGeneratorGitDirectoryArgs Empty = new GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMatrixGeneratorGitDirectoryArgs();

    /**
     * Flag indicating whether or not the directory should be excluded when templating.
     * 
     */
    @Import(name="exclude")
    private @Nullable Output<Boolean> exclude;

    /**
     * @return Flag indicating whether or not the directory should be excluded when templating.
     * 
     */
    public Optional<Output<Boolean>> exclude() {
        return Optional.ofNullable(this.exclude);
    }

    /**
     * Path in the repository.
     * 
     */
    @Import(name="path", required=true)
    private Output<String> path;

    /**
     * @return Path in the repository.
     * 
     */
    public Output<String> path() {
        return this.path;
    }

    private GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMatrixGeneratorGitDirectoryArgs() {}

    private GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMatrixGeneratorGitDirectoryArgs(GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMatrixGeneratorGitDirectoryArgs $) {
        this.exclude = $.exclude;
        this.path = $.path;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMatrixGeneratorGitDirectoryArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMatrixGeneratorGitDirectoryArgs $;

        public Builder() {
            $ = new GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMatrixGeneratorGitDirectoryArgs();
        }

        public Builder(GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMatrixGeneratorGitDirectoryArgs defaults) {
            $ = new GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMatrixGeneratorGitDirectoryArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param exclude Flag indicating whether or not the directory should be excluded when templating.
         * 
         * @return builder
         * 
         */
        public Builder exclude(@Nullable Output<Boolean> exclude) {
            $.exclude = exclude;
            return this;
        }

        /**
         * @param exclude Flag indicating whether or not the directory should be excluded when templating.
         * 
         * @return builder
         * 
         */
        public Builder exclude(Boolean exclude) {
            return exclude(Output.of(exclude));
        }

        /**
         * @param path Path in the repository.
         * 
         * @return builder
         * 
         */
        public Builder path(Output<String> path) {
            $.path = path;
            return this;
        }

        /**
         * @param path Path in the repository.
         * 
         * @return builder
         * 
         */
        public Builder path(String path) {
            return path(Output.of(path));
        }

        public GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMatrixGeneratorGitDirectoryArgs build() {
            if ($.path == null) {
                throw new MissingRequiredPropertyException("GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMatrixGeneratorGitDirectoryArgs", "path");
            }
            return $;
        }
    }

}
