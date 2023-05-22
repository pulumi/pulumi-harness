// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GitopsApplicationsApplicationSpecSourceDirectoryJsonnetTlaArgs extends com.pulumi.resources.ResourceArgs {

    public static final GitopsApplicationsApplicationSpecSourceDirectoryJsonnetTlaArgs Empty = new GitopsApplicationsApplicationSpecSourceDirectoryJsonnetTlaArgs();

    @Import(name="code")
    private @Nullable Output<Boolean> code;

    public Optional<Output<Boolean>> code() {
        return Optional.ofNullable(this.code);
    }

    /**
     * Name of the GitOps application.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Name of the GitOps application.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    @Import(name="value")
    private @Nullable Output<String> value;

    public Optional<Output<String>> value() {
        return Optional.ofNullable(this.value);
    }

    private GitopsApplicationsApplicationSpecSourceDirectoryJsonnetTlaArgs() {}

    private GitopsApplicationsApplicationSpecSourceDirectoryJsonnetTlaArgs(GitopsApplicationsApplicationSpecSourceDirectoryJsonnetTlaArgs $) {
        this.code = $.code;
        this.name = $.name;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GitopsApplicationsApplicationSpecSourceDirectoryJsonnetTlaArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GitopsApplicationsApplicationSpecSourceDirectoryJsonnetTlaArgs $;

        public Builder() {
            $ = new GitopsApplicationsApplicationSpecSourceDirectoryJsonnetTlaArgs();
        }

        public Builder(GitopsApplicationsApplicationSpecSourceDirectoryJsonnetTlaArgs defaults) {
            $ = new GitopsApplicationsApplicationSpecSourceDirectoryJsonnetTlaArgs(Objects.requireNonNull(defaults));
        }

        public Builder code(@Nullable Output<Boolean> code) {
            $.code = code;
            return this;
        }

        public Builder code(Boolean code) {
            return code(Output.of(code));
        }

        /**
         * @param name Name of the GitOps application.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of the GitOps application.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder value(@Nullable Output<String> value) {
            $.value = value;
            return this;
        }

        public Builder value(String value) {
            return value(Output.of(value));
        }

        public GitopsApplicationsApplicationSpecSourceDirectoryJsonnetTlaArgs build() {
            return $;
        }
    }

}