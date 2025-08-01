// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMergeTemplateSpecSourceHelmFileParameterArgs extends com.pulumi.resources.ResourceArgs {

    public static final GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMergeTemplateSpecSourceHelmFileParameterArgs Empty = new GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMergeTemplateSpecSourceHelmFileParameterArgs();

    /**
     * Name of the Helm parameter.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return Name of the Helm parameter.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * Path to the file containing the values for the Helm parameter.
     * 
     */
    @Import(name="path", required=true)
    private Output<String> path;

    /**
     * @return Path to the file containing the values for the Helm parameter.
     * 
     */
    public Output<String> path() {
        return this.path;
    }

    private GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMergeTemplateSpecSourceHelmFileParameterArgs() {}

    private GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMergeTemplateSpecSourceHelmFileParameterArgs(GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMergeTemplateSpecSourceHelmFileParameterArgs $) {
        this.name = $.name;
        this.path = $.path;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMergeTemplateSpecSourceHelmFileParameterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMergeTemplateSpecSourceHelmFileParameterArgs $;

        public Builder() {
            $ = new GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMergeTemplateSpecSourceHelmFileParameterArgs();
        }

        public Builder(GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMergeTemplateSpecSourceHelmFileParameterArgs defaults) {
            $ = new GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMergeTemplateSpecSourceHelmFileParameterArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name Name of the Helm parameter.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of the Helm parameter.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param path Path to the file containing the values for the Helm parameter.
         * 
         * @return builder
         * 
         */
        public Builder path(Output<String> path) {
            $.path = path;
            return this;
        }

        /**
         * @param path Path to the file containing the values for the Helm parameter.
         * 
         * @return builder
         * 
         */
        public Builder path(String path) {
            return path(Output.of(path));
        }

        public GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMergeTemplateSpecSourceHelmFileParameterArgs build() {
            if ($.name == null) {
                throw new MissingRequiredPropertyException("GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMergeTemplateSpecSourceHelmFileParameterArgs", "name");
            }
            if ($.path == null) {
                throw new MissingRequiredPropertyException("GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMergeTemplateSpecSourceHelmFileParameterArgs", "path");
            }
            return $;
        }
    }

}
