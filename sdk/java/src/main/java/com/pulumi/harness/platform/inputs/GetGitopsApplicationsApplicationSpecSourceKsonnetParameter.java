// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetGitopsApplicationsApplicationSpecSourceKsonnetParameter extends com.pulumi.resources.InvokeArgs {

    public static final GetGitopsApplicationsApplicationSpecSourceKsonnetParameter Empty = new GetGitopsApplicationsApplicationSpecSourceKsonnetParameter();

    /**
     * Component of the parameter of the ksonnet application.
     * 
     */
    @Import(name="component")
    private @Nullable String component;

    /**
     * @return Component of the parameter of the ksonnet application.
     * 
     */
    public Optional<String> component() {
        return Optional.ofNullable(this.component);
    }

    /**
     * Name of the parameter of the ksonnet application.
     * 
     */
    @Import(name="name")
    private @Nullable String name;

    /**
     * @return Name of the parameter of the ksonnet application.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Value of the parameter of the ksonnet application.
     * 
     */
    @Import(name="value")
    private @Nullable String value;

    /**
     * @return Value of the parameter of the ksonnet application.
     * 
     */
    public Optional<String> value() {
        return Optional.ofNullable(this.value);
    }

    private GetGitopsApplicationsApplicationSpecSourceKsonnetParameter() {}

    private GetGitopsApplicationsApplicationSpecSourceKsonnetParameter(GetGitopsApplicationsApplicationSpecSourceKsonnetParameter $) {
        this.component = $.component;
        this.name = $.name;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetGitopsApplicationsApplicationSpecSourceKsonnetParameter defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetGitopsApplicationsApplicationSpecSourceKsonnetParameter $;

        public Builder() {
            $ = new GetGitopsApplicationsApplicationSpecSourceKsonnetParameter();
        }

        public Builder(GetGitopsApplicationsApplicationSpecSourceKsonnetParameter defaults) {
            $ = new GetGitopsApplicationsApplicationSpecSourceKsonnetParameter(Objects.requireNonNull(defaults));
        }

        /**
         * @param component Component of the parameter of the ksonnet application.
         * 
         * @return builder
         * 
         */
        public Builder component(@Nullable String component) {
            $.component = component;
            return this;
        }

        /**
         * @param name Name of the parameter of the ksonnet application.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable String name) {
            $.name = name;
            return this;
        }

        /**
         * @param value Value of the parameter of the ksonnet application.
         * 
         * @return builder
         * 
         */
        public Builder value(@Nullable String value) {
            $.value = value;
            return this;
        }

        public GetGitopsApplicationsApplicationSpecSourceKsonnetParameter build() {
            return $;
        }
    }

}
