// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.harness.inputs.GetEnvironmentVariableOverrideArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetEnvironmentArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetEnvironmentArgs Empty = new GetEnvironmentArgs();

    /**
     * The id of the application.
     * 
     */
    @Import(name="appId", required=true)
    private Output<String> appId;

    /**
     * @return The id of the application.
     * 
     */
    public Output<String> appId() {
        return this.appId;
    }

    /**
     * The id of the environment.
     * 
     */
    @Import(name="environmentId")
    private @Nullable Output<String> environmentId;

    /**
     * @return The id of the environment.
     * 
     */
    public Optional<Output<String>> environmentId() {
        return Optional.ofNullable(this.environmentId);
    }

    /**
     * The name of the environment.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the environment.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Override for a service variable
     * 
     */
    @Import(name="variableOverrides")
    private @Nullable Output<List<GetEnvironmentVariableOverrideArgs>> variableOverrides;

    /**
     * @return Override for a service variable
     * 
     */
    public Optional<Output<List<GetEnvironmentVariableOverrideArgs>>> variableOverrides() {
        return Optional.ofNullable(this.variableOverrides);
    }

    private GetEnvironmentArgs() {}

    private GetEnvironmentArgs(GetEnvironmentArgs $) {
        this.appId = $.appId;
        this.environmentId = $.environmentId;
        this.name = $.name;
        this.variableOverrides = $.variableOverrides;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetEnvironmentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetEnvironmentArgs $;

        public Builder() {
            $ = new GetEnvironmentArgs();
        }

        public Builder(GetEnvironmentArgs defaults) {
            $ = new GetEnvironmentArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param appId The id of the application.
         * 
         * @return builder
         * 
         */
        public Builder appId(Output<String> appId) {
            $.appId = appId;
            return this;
        }

        /**
         * @param appId The id of the application.
         * 
         * @return builder
         * 
         */
        public Builder appId(String appId) {
            return appId(Output.of(appId));
        }

        /**
         * @param environmentId The id of the environment.
         * 
         * @return builder
         * 
         */
        public Builder environmentId(@Nullable Output<String> environmentId) {
            $.environmentId = environmentId;
            return this;
        }

        /**
         * @param environmentId The id of the environment.
         * 
         * @return builder
         * 
         */
        public Builder environmentId(String environmentId) {
            return environmentId(Output.of(environmentId));
        }

        /**
         * @param name The name of the environment.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the environment.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param variableOverrides Override for a service variable
         * 
         * @return builder
         * 
         */
        public Builder variableOverrides(@Nullable Output<List<GetEnvironmentVariableOverrideArgs>> variableOverrides) {
            $.variableOverrides = variableOverrides;
            return this;
        }

        /**
         * @param variableOverrides Override for a service variable
         * 
         * @return builder
         * 
         */
        public Builder variableOverrides(List<GetEnvironmentVariableOverrideArgs> variableOverrides) {
            return variableOverrides(Output.of(variableOverrides));
        }

        /**
         * @param variableOverrides Override for a service variable
         * 
         * @return builder
         * 
         */
        public Builder variableOverrides(GetEnvironmentVariableOverrideArgs... variableOverrides) {
            return variableOverrides(List.of(variableOverrides));
        }

        public GetEnvironmentArgs build() {
            if ($.appId == null) {
                throw new MissingRequiredPropertyException("GetEnvironmentArgs", "appId");
            }
            return $;
        }
    }

}
