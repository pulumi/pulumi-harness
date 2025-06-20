// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorPullRequestTemplateSpecInfoArgs extends com.pulumi.resources.ResourceArgs {

    public static final GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorPullRequestTemplateSpecInfoArgs Empty = new GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorPullRequestTemplateSpecInfoArgs();

    /**
     * Name of the information.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Name of the information.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Value of the information.
     * 
     */
    @Import(name="value")
    private @Nullable Output<String> value;

    /**
     * @return Value of the information.
     * 
     */
    public Optional<Output<String>> value() {
        return Optional.ofNullable(this.value);
    }

    private GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorPullRequestTemplateSpecInfoArgs() {}

    private GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorPullRequestTemplateSpecInfoArgs(GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorPullRequestTemplateSpecInfoArgs $) {
        this.name = $.name;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorPullRequestTemplateSpecInfoArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorPullRequestTemplateSpecInfoArgs $;

        public Builder() {
            $ = new GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorPullRequestTemplateSpecInfoArgs();
        }

        public Builder(GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorPullRequestTemplateSpecInfoArgs defaults) {
            $ = new GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorPullRequestTemplateSpecInfoArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name Name of the information.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of the information.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param value Value of the information.
         * 
         * @return builder
         * 
         */
        public Builder value(@Nullable Output<String> value) {
            $.value = value;
            return this;
        }

        /**
         * @param value Value of the information.
         * 
         * @return builder
         * 
         */
        public Builder value(String value) {
            return value(Output.of(value));
        }

        public GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorPullRequestTemplateSpecInfoArgs build() {
            return $;
        }
    }

}
