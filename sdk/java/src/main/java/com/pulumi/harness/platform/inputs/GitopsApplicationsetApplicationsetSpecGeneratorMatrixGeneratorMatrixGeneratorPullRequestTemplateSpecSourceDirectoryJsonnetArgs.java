// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.harness.platform.inputs.GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMatrixGeneratorPullRequestTemplateSpecSourceDirectoryJsonnetExtVarArgs;
import com.pulumi.harness.platform.inputs.GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMatrixGeneratorPullRequestTemplateSpecSourceDirectoryJsonnetTlaArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMatrixGeneratorPullRequestTemplateSpecSourceDirectoryJsonnetArgs extends com.pulumi.resources.ResourceArgs {

    public static final GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMatrixGeneratorPullRequestTemplateSpecSourceDirectoryJsonnetArgs Empty = new GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMatrixGeneratorPullRequestTemplateSpecSourceDirectoryJsonnetArgs();

    /**
     * List of Jsonnet External Variables.
     * 
     */
    @Import(name="extVars")
    private @Nullable Output<List<GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMatrixGeneratorPullRequestTemplateSpecSourceDirectoryJsonnetExtVarArgs>> extVars;

    /**
     * @return List of Jsonnet External Variables.
     * 
     */
    public Optional<Output<List<GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMatrixGeneratorPullRequestTemplateSpecSourceDirectoryJsonnetExtVarArgs>>> extVars() {
        return Optional.ofNullable(this.extVars);
    }

    /**
     * Additional library search dirs.
     * 
     */
    @Import(name="libs")
    private @Nullable Output<List<String>> libs;

    /**
     * @return Additional library search dirs.
     * 
     */
    public Optional<Output<List<String>>> libs() {
        return Optional.ofNullable(this.libs);
    }

    /**
     * List of Jsonnet Top-level Arguments
     * 
     */
    @Import(name="tlas")
    private @Nullable Output<List<GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMatrixGeneratorPullRequestTemplateSpecSourceDirectoryJsonnetTlaArgs>> tlas;

    /**
     * @return List of Jsonnet Top-level Arguments
     * 
     */
    public Optional<Output<List<GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMatrixGeneratorPullRequestTemplateSpecSourceDirectoryJsonnetTlaArgs>>> tlas() {
        return Optional.ofNullable(this.tlas);
    }

    private GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMatrixGeneratorPullRequestTemplateSpecSourceDirectoryJsonnetArgs() {}

    private GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMatrixGeneratorPullRequestTemplateSpecSourceDirectoryJsonnetArgs(GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMatrixGeneratorPullRequestTemplateSpecSourceDirectoryJsonnetArgs $) {
        this.extVars = $.extVars;
        this.libs = $.libs;
        this.tlas = $.tlas;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMatrixGeneratorPullRequestTemplateSpecSourceDirectoryJsonnetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMatrixGeneratorPullRequestTemplateSpecSourceDirectoryJsonnetArgs $;

        public Builder() {
            $ = new GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMatrixGeneratorPullRequestTemplateSpecSourceDirectoryJsonnetArgs();
        }

        public Builder(GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMatrixGeneratorPullRequestTemplateSpecSourceDirectoryJsonnetArgs defaults) {
            $ = new GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMatrixGeneratorPullRequestTemplateSpecSourceDirectoryJsonnetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param extVars List of Jsonnet External Variables.
         * 
         * @return builder
         * 
         */
        public Builder extVars(@Nullable Output<List<GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMatrixGeneratorPullRequestTemplateSpecSourceDirectoryJsonnetExtVarArgs>> extVars) {
            $.extVars = extVars;
            return this;
        }

        /**
         * @param extVars List of Jsonnet External Variables.
         * 
         * @return builder
         * 
         */
        public Builder extVars(List<GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMatrixGeneratorPullRequestTemplateSpecSourceDirectoryJsonnetExtVarArgs> extVars) {
            return extVars(Output.of(extVars));
        }

        /**
         * @param extVars List of Jsonnet External Variables.
         * 
         * @return builder
         * 
         */
        public Builder extVars(GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMatrixGeneratorPullRequestTemplateSpecSourceDirectoryJsonnetExtVarArgs... extVars) {
            return extVars(List.of(extVars));
        }

        /**
         * @param libs Additional library search dirs.
         * 
         * @return builder
         * 
         */
        public Builder libs(@Nullable Output<List<String>> libs) {
            $.libs = libs;
            return this;
        }

        /**
         * @param libs Additional library search dirs.
         * 
         * @return builder
         * 
         */
        public Builder libs(List<String> libs) {
            return libs(Output.of(libs));
        }

        /**
         * @param libs Additional library search dirs.
         * 
         * @return builder
         * 
         */
        public Builder libs(String... libs) {
            return libs(List.of(libs));
        }

        /**
         * @param tlas List of Jsonnet Top-level Arguments
         * 
         * @return builder
         * 
         */
        public Builder tlas(@Nullable Output<List<GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMatrixGeneratorPullRequestTemplateSpecSourceDirectoryJsonnetTlaArgs>> tlas) {
            $.tlas = tlas;
            return this;
        }

        /**
         * @param tlas List of Jsonnet Top-level Arguments
         * 
         * @return builder
         * 
         */
        public Builder tlas(List<GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMatrixGeneratorPullRequestTemplateSpecSourceDirectoryJsonnetTlaArgs> tlas) {
            return tlas(Output.of(tlas));
        }

        /**
         * @param tlas List of Jsonnet Top-level Arguments
         * 
         * @return builder
         * 
         */
        public Builder tlas(GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMatrixGeneratorPullRequestTemplateSpecSourceDirectoryJsonnetTlaArgs... tlas) {
            return tlas(List.of(tlas));
        }

        public GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMatrixGeneratorPullRequestTemplateSpecSourceDirectoryJsonnetArgs build() {
            return $;
        }
    }

}
