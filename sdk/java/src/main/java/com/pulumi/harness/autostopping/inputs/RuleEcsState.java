// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.autostopping.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.harness.autostopping.inputs.RuleEcsContainerArgs;
import com.pulumi.harness.autostopping.inputs.RuleEcsDependArgs;
import com.pulumi.harness.autostopping.inputs.RuleEcsHttpArgs;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RuleEcsState extends com.pulumi.resources.ResourceArgs {

    public static final RuleEcsState Empty = new RuleEcsState();

    /**
     * Id of the cloud connector
     * 
     */
    @Import(name="cloudConnectorId")
    private @Nullable Output<String> cloudConnectorId;

    /**
     * @return Id of the cloud connector
     * 
     */
    public Optional<Output<String>> cloudConnectorId() {
        return Optional.ofNullable(this.cloudConnectorId);
    }

    @Import(name="container")
    private @Nullable Output<RuleEcsContainerArgs> container;

    public Optional<Output<RuleEcsContainerArgs>> container() {
        return Optional.ofNullable(this.container);
    }

    /**
     * Custom URLs used to access the instances
     * 
     */
    @Import(name="customDomains")
    private @Nullable Output<List<String>> customDomains;

    /**
     * @return Custom URLs used to access the instances
     * 
     */
    public Optional<Output<List<String>>> customDomains() {
        return Optional.ofNullable(this.customDomains);
    }

    /**
     * Dependent rules
     * 
     */
    @Import(name="depends")
    private @Nullable Output<List<RuleEcsDependArgs>> depends;

    /**
     * @return Dependent rules
     * 
     */
    public Optional<Output<List<RuleEcsDependArgs>>> depends() {
        return Optional.ofNullable(this.depends);
    }

    /**
     * Http routing configuration
     * 
     */
    @Import(name="https")
    private @Nullable Output<List<RuleEcsHttpArgs>> https;

    /**
     * @return Http routing configuration
     * 
     */
    public Optional<Output<List<RuleEcsHttpArgs>>> https() {
        return Optional.ofNullable(this.https);
    }

    /**
     * Unique identifier of the resource
     * 
     */
    @Import(name="identifier")
    private @Nullable Output<Double> identifier;

    /**
     * @return Unique identifier of the resource
     * 
     */
    public Optional<Output<Double>> identifier() {
        return Optional.ofNullable(this.identifier);
    }

    /**
     * Idle time in minutes. This is the time that the AutoStopping rule waits before stopping the idle instances.
     * 
     */
    @Import(name="idleTimeMins")
    private @Nullable Output<Integer> idleTimeMins;

    /**
     * @return Idle time in minutes. This is the time that the AutoStopping rule waits before stopping the idle instances.
     * 
     */
    public Optional<Output<Integer>> idleTimeMins() {
        return Optional.ofNullable(this.idleTimeMins);
    }

    /**
     * Name of the rule
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Name of the rule
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    private RuleEcsState() {}

    private RuleEcsState(RuleEcsState $) {
        this.cloudConnectorId = $.cloudConnectorId;
        this.container = $.container;
        this.customDomains = $.customDomains;
        this.depends = $.depends;
        this.https = $.https;
        this.identifier = $.identifier;
        this.idleTimeMins = $.idleTimeMins;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RuleEcsState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RuleEcsState $;

        public Builder() {
            $ = new RuleEcsState();
        }

        public Builder(RuleEcsState defaults) {
            $ = new RuleEcsState(Objects.requireNonNull(defaults));
        }

        /**
         * @param cloudConnectorId Id of the cloud connector
         * 
         * @return builder
         * 
         */
        public Builder cloudConnectorId(@Nullable Output<String> cloudConnectorId) {
            $.cloudConnectorId = cloudConnectorId;
            return this;
        }

        /**
         * @param cloudConnectorId Id of the cloud connector
         * 
         * @return builder
         * 
         */
        public Builder cloudConnectorId(String cloudConnectorId) {
            return cloudConnectorId(Output.of(cloudConnectorId));
        }

        public Builder container(@Nullable Output<RuleEcsContainerArgs> container) {
            $.container = container;
            return this;
        }

        public Builder container(RuleEcsContainerArgs container) {
            return container(Output.of(container));
        }

        /**
         * @param customDomains Custom URLs used to access the instances
         * 
         * @return builder
         * 
         */
        public Builder customDomains(@Nullable Output<List<String>> customDomains) {
            $.customDomains = customDomains;
            return this;
        }

        /**
         * @param customDomains Custom URLs used to access the instances
         * 
         * @return builder
         * 
         */
        public Builder customDomains(List<String> customDomains) {
            return customDomains(Output.of(customDomains));
        }

        /**
         * @param customDomains Custom URLs used to access the instances
         * 
         * @return builder
         * 
         */
        public Builder customDomains(String... customDomains) {
            return customDomains(List.of(customDomains));
        }

        /**
         * @param depends Dependent rules
         * 
         * @return builder
         * 
         */
        public Builder depends(@Nullable Output<List<RuleEcsDependArgs>> depends) {
            $.depends = depends;
            return this;
        }

        /**
         * @param depends Dependent rules
         * 
         * @return builder
         * 
         */
        public Builder depends(List<RuleEcsDependArgs> depends) {
            return depends(Output.of(depends));
        }

        /**
         * @param depends Dependent rules
         * 
         * @return builder
         * 
         */
        public Builder depends(RuleEcsDependArgs... depends) {
            return depends(List.of(depends));
        }

        /**
         * @param https Http routing configuration
         * 
         * @return builder
         * 
         */
        public Builder https(@Nullable Output<List<RuleEcsHttpArgs>> https) {
            $.https = https;
            return this;
        }

        /**
         * @param https Http routing configuration
         * 
         * @return builder
         * 
         */
        public Builder https(List<RuleEcsHttpArgs> https) {
            return https(Output.of(https));
        }

        /**
         * @param https Http routing configuration
         * 
         * @return builder
         * 
         */
        public Builder https(RuleEcsHttpArgs... https) {
            return https(List.of(https));
        }

        /**
         * @param identifier Unique identifier of the resource
         * 
         * @return builder
         * 
         */
        public Builder identifier(@Nullable Output<Double> identifier) {
            $.identifier = identifier;
            return this;
        }

        /**
         * @param identifier Unique identifier of the resource
         * 
         * @return builder
         * 
         */
        public Builder identifier(Double identifier) {
            return identifier(Output.of(identifier));
        }

        /**
         * @param idleTimeMins Idle time in minutes. This is the time that the AutoStopping rule waits before stopping the idle instances.
         * 
         * @return builder
         * 
         */
        public Builder idleTimeMins(@Nullable Output<Integer> idleTimeMins) {
            $.idleTimeMins = idleTimeMins;
            return this;
        }

        /**
         * @param idleTimeMins Idle time in minutes. This is the time that the AutoStopping rule waits before stopping the idle instances.
         * 
         * @return builder
         * 
         */
        public Builder idleTimeMins(Integer idleTimeMins) {
            return idleTimeMins(Output.of(idleTimeMins));
        }

        /**
         * @param name Name of the rule
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of the rule
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public RuleEcsState build() {
            return $;
        }
    }

}