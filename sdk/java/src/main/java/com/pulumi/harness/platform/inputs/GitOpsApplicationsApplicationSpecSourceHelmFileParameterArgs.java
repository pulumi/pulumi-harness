// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GitOpsApplicationsApplicationSpecSourceHelmFileParameterArgs extends com.pulumi.resources.ResourceArgs {

    public static final GitOpsApplicationsApplicationSpecSourceHelmFileParameterArgs Empty = new GitOpsApplicationsApplicationSpecSourceHelmFileParameterArgs();

    /**
     * Name of the helm parameter.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Name of the helm parameter.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Path to the file containing the values of the helm parameter.
     * 
     */
    @Import(name="path")
    private @Nullable Output<String> path;

    /**
     * @return Path to the file containing the values of the helm parameter.
     * 
     */
    public Optional<Output<String>> path() {
        return Optional.ofNullable(this.path);
    }

    private GitOpsApplicationsApplicationSpecSourceHelmFileParameterArgs() {}

    private GitOpsApplicationsApplicationSpecSourceHelmFileParameterArgs(GitOpsApplicationsApplicationSpecSourceHelmFileParameterArgs $) {
        this.name = $.name;
        this.path = $.path;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GitOpsApplicationsApplicationSpecSourceHelmFileParameterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GitOpsApplicationsApplicationSpecSourceHelmFileParameterArgs $;

        public Builder() {
            $ = new GitOpsApplicationsApplicationSpecSourceHelmFileParameterArgs();
        }

        public Builder(GitOpsApplicationsApplicationSpecSourceHelmFileParameterArgs defaults) {
            $ = new GitOpsApplicationsApplicationSpecSourceHelmFileParameterArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name Name of the helm parameter.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of the helm parameter.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param path Path to the file containing the values of the helm parameter.
         * 
         * @return builder
         * 
         */
        public Builder path(@Nullable Output<String> path) {
            $.path = path;
            return this;
        }

        /**
         * @param path Path to the file containing the values of the helm parameter.
         * 
         * @return builder
         * 
         */
        public Builder path(String path) {
            return path(Output.of(path));
        }

        public GitOpsApplicationsApplicationSpecSourceHelmFileParameterArgs build() {
            return $;
        }
    }

}
