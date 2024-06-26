// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GitOpsApplicationsApplicationSpecSourcePluginEnvArgs extends com.pulumi.resources.ResourceArgs {

    public static final GitOpsApplicationsApplicationSpecSourcePluginEnvArgs Empty = new GitOpsApplicationsApplicationSpecSourcePluginEnvArgs();

    /**
     * Name of the variable, usually expressed in uppercase.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Name of the variable, usually expressed in uppercase.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Value of the variable.
     * 
     */
    @Import(name="value")
    private @Nullable Output<String> value;

    /**
     * @return Value of the variable.
     * 
     */
    public Optional<Output<String>> value() {
        return Optional.ofNullable(this.value);
    }

    private GitOpsApplicationsApplicationSpecSourcePluginEnvArgs() {}

    private GitOpsApplicationsApplicationSpecSourcePluginEnvArgs(GitOpsApplicationsApplicationSpecSourcePluginEnvArgs $) {
        this.name = $.name;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GitOpsApplicationsApplicationSpecSourcePluginEnvArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GitOpsApplicationsApplicationSpecSourcePluginEnvArgs $;

        public Builder() {
            $ = new GitOpsApplicationsApplicationSpecSourcePluginEnvArgs();
        }

        public Builder(GitOpsApplicationsApplicationSpecSourcePluginEnvArgs defaults) {
            $ = new GitOpsApplicationsApplicationSpecSourcePluginEnvArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name Name of the variable, usually expressed in uppercase.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of the variable, usually expressed in uppercase.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param value Value of the variable.
         * 
         * @return builder
         * 
         */
        public Builder value(@Nullable Output<String> value) {
            $.value = value;
            return this;
        }

        /**
         * @param value Value of the variable.
         * 
         * @return builder
         * 
         */
        public Builder value(String value) {
            return value(Output.of(value));
        }

        public GitOpsApplicationsApplicationSpecSourcePluginEnvArgs build() {
            return $;
        }
    }

}
