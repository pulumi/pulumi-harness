// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.service;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.harness.service.inputs.HelmVariableArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class HelmArgs extends com.pulumi.resources.ResourceArgs {

    public static final HelmArgs Empty = new HelmArgs();

    /**
     * The id of the application the service belongs to
     * 
     */
    @Import(name="appId", required=true)
    private Output<String> appId;

    /**
     * @return The id of the application the service belongs to
     * 
     */
    public Output<String> appId() {
        return this.appId;
    }

    /**
     * Description of th service
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return Description of th service
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Name of the service
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Name of the service
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Variables to be used in the service
     * 
     */
    @Import(name="variables")
    private @Nullable Output<List<HelmVariableArgs>> variables;

    /**
     * @return Variables to be used in the service
     * 
     */
    public Optional<Output<List<HelmVariableArgs>>> variables() {
        return Optional.ofNullable(this.variables);
    }

    private HelmArgs() {}

    private HelmArgs(HelmArgs $) {
        this.appId = $.appId;
        this.description = $.description;
        this.name = $.name;
        this.variables = $.variables;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(HelmArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private HelmArgs $;

        public Builder() {
            $ = new HelmArgs();
        }

        public Builder(HelmArgs defaults) {
            $ = new HelmArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param appId The id of the application the service belongs to
         * 
         * @return builder
         * 
         */
        public Builder appId(Output<String> appId) {
            $.appId = appId;
            return this;
        }

        /**
         * @param appId The id of the application the service belongs to
         * 
         * @return builder
         * 
         */
        public Builder appId(String appId) {
            return appId(Output.of(appId));
        }

        /**
         * @param description Description of th service
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Description of th service
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param name Name of the service
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of the service
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param variables Variables to be used in the service
         * 
         * @return builder
         * 
         */
        public Builder variables(@Nullable Output<List<HelmVariableArgs>> variables) {
            $.variables = variables;
            return this;
        }

        /**
         * @param variables Variables to be used in the service
         * 
         * @return builder
         * 
         */
        public Builder variables(List<HelmVariableArgs> variables) {
            return variables(Output.of(variables));
        }

        /**
         * @param variables Variables to be used in the service
         * 
         * @return builder
         * 
         */
        public Builder variables(HelmVariableArgs... variables) {
            return variables(List.of(variables));
        }

        public HelmArgs build() {
            if ($.appId == null) {
                throw new MissingRequiredPropertyException("HelmArgs", "appId");
            }
            return $;
        }
    }

}
