// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.harness.platform.inputs.GitopsApplicationsetApplicationsetSpecTemplateSpecSourceDirectoryJsonnetExtVarArgs;
import com.pulumi.harness.platform.inputs.GitopsApplicationsetApplicationsetSpecTemplateSpecSourceDirectoryJsonnetTlaArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GitopsApplicationsetApplicationsetSpecTemplateSpecSourceDirectoryJsonnetArgs extends com.pulumi.resources.ResourceArgs {

    public static final GitopsApplicationsetApplicationsetSpecTemplateSpecSourceDirectoryJsonnetArgs Empty = new GitopsApplicationsetApplicationsetSpecTemplateSpecSourceDirectoryJsonnetArgs();

    /**
     * List of Jsonnet External Variables.
     * 
     */
    @Import(name="extVars")
    private @Nullable Output<List<GitopsApplicationsetApplicationsetSpecTemplateSpecSourceDirectoryJsonnetExtVarArgs>> extVars;

    /**
     * @return List of Jsonnet External Variables.
     * 
     */
    public Optional<Output<List<GitopsApplicationsetApplicationsetSpecTemplateSpecSourceDirectoryJsonnetExtVarArgs>>> extVars() {
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
    private @Nullable Output<List<GitopsApplicationsetApplicationsetSpecTemplateSpecSourceDirectoryJsonnetTlaArgs>> tlas;

    /**
     * @return List of Jsonnet Top-level Arguments
     * 
     */
    public Optional<Output<List<GitopsApplicationsetApplicationsetSpecTemplateSpecSourceDirectoryJsonnetTlaArgs>>> tlas() {
        return Optional.ofNullable(this.tlas);
    }

    private GitopsApplicationsetApplicationsetSpecTemplateSpecSourceDirectoryJsonnetArgs() {}

    private GitopsApplicationsetApplicationsetSpecTemplateSpecSourceDirectoryJsonnetArgs(GitopsApplicationsetApplicationsetSpecTemplateSpecSourceDirectoryJsonnetArgs $) {
        this.extVars = $.extVars;
        this.libs = $.libs;
        this.tlas = $.tlas;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GitopsApplicationsetApplicationsetSpecTemplateSpecSourceDirectoryJsonnetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GitopsApplicationsetApplicationsetSpecTemplateSpecSourceDirectoryJsonnetArgs $;

        public Builder() {
            $ = new GitopsApplicationsetApplicationsetSpecTemplateSpecSourceDirectoryJsonnetArgs();
        }

        public Builder(GitopsApplicationsetApplicationsetSpecTemplateSpecSourceDirectoryJsonnetArgs defaults) {
            $ = new GitopsApplicationsetApplicationsetSpecTemplateSpecSourceDirectoryJsonnetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param extVars List of Jsonnet External Variables.
         * 
         * @return builder
         * 
         */
        public Builder extVars(@Nullable Output<List<GitopsApplicationsetApplicationsetSpecTemplateSpecSourceDirectoryJsonnetExtVarArgs>> extVars) {
            $.extVars = extVars;
            return this;
        }

        /**
         * @param extVars List of Jsonnet External Variables.
         * 
         * @return builder
         * 
         */
        public Builder extVars(List<GitopsApplicationsetApplicationsetSpecTemplateSpecSourceDirectoryJsonnetExtVarArgs> extVars) {
            return extVars(Output.of(extVars));
        }

        /**
         * @param extVars List of Jsonnet External Variables.
         * 
         * @return builder
         * 
         */
        public Builder extVars(GitopsApplicationsetApplicationsetSpecTemplateSpecSourceDirectoryJsonnetExtVarArgs... extVars) {
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
        public Builder tlas(@Nullable Output<List<GitopsApplicationsetApplicationsetSpecTemplateSpecSourceDirectoryJsonnetTlaArgs>> tlas) {
            $.tlas = tlas;
            return this;
        }

        /**
         * @param tlas List of Jsonnet Top-level Arguments
         * 
         * @return builder
         * 
         */
        public Builder tlas(List<GitopsApplicationsetApplicationsetSpecTemplateSpecSourceDirectoryJsonnetTlaArgs> tlas) {
            return tlas(Output.of(tlas));
        }

        /**
         * @param tlas List of Jsonnet Top-level Arguments
         * 
         * @return builder
         * 
         */
        public Builder tlas(GitopsApplicationsetApplicationsetSpecTemplateSpecSourceDirectoryJsonnetTlaArgs... tlas) {
            return tlas(List.of(tlas));
        }

        public GitopsApplicationsetApplicationsetSpecTemplateSpecSourceDirectoryJsonnetArgs build() {
            return $;
        }
    }

}
