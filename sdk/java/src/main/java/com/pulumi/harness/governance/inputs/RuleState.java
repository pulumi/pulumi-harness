// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.governance.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RuleState extends com.pulumi.resources.ResourceArgs {

    public static final RuleState Empty = new RuleState();

    /**
     * The cloud provider for the rule. It should be either AWS, AZURE or GCP.
     * 
     */
    @Import(name="cloudProvider")
    private @Nullable Output<String> cloudProvider;

    /**
     * @return The cloud provider for the rule. It should be either AWS, AZURE or GCP.
     * 
     */
    public Optional<Output<String>> cloudProvider() {
        return Optional.ofNullable(this.cloudProvider);
    }

    /**
     * Description for rule.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return Description for rule.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Name of the rule.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Name of the rule.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Id of the rule.
     * 
     */
    @Import(name="ruleId")
    private @Nullable Output<String> ruleId;

    /**
     * @return Id of the rule.
     * 
     */
    public Optional<Output<String>> ruleId() {
        return Optional.ofNullable(this.ruleId);
    }

    /**
     * The policy YAML of the rule
     * 
     */
    @Import(name="rulesYaml")
    private @Nullable Output<String> rulesYaml;

    /**
     * @return The policy YAML of the rule
     * 
     */
    public Optional<Output<String>> rulesYaml() {
        return Optional.ofNullable(this.rulesYaml);
    }

    private RuleState() {}

    private RuleState(RuleState $) {
        this.cloudProvider = $.cloudProvider;
        this.description = $.description;
        this.name = $.name;
        this.ruleId = $.ruleId;
        this.rulesYaml = $.rulesYaml;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RuleState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RuleState $;

        public Builder() {
            $ = new RuleState();
        }

        public Builder(RuleState defaults) {
            $ = new RuleState(Objects.requireNonNull(defaults));
        }

        /**
         * @param cloudProvider The cloud provider for the rule. It should be either AWS, AZURE or GCP.
         * 
         * @return builder
         * 
         */
        public Builder cloudProvider(@Nullable Output<String> cloudProvider) {
            $.cloudProvider = cloudProvider;
            return this;
        }

        /**
         * @param cloudProvider The cloud provider for the rule. It should be either AWS, AZURE or GCP.
         * 
         * @return builder
         * 
         */
        public Builder cloudProvider(String cloudProvider) {
            return cloudProvider(Output.of(cloudProvider));
        }

        /**
         * @param description Description for rule.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Description for rule.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param name Name of the rule.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of the rule.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param ruleId Id of the rule.
         * 
         * @return builder
         * 
         */
        public Builder ruleId(@Nullable Output<String> ruleId) {
            $.ruleId = ruleId;
            return this;
        }

        /**
         * @param ruleId Id of the rule.
         * 
         * @return builder
         * 
         */
        public Builder ruleId(String ruleId) {
            return ruleId(Output.of(ruleId));
        }

        /**
         * @param rulesYaml The policy YAML of the rule
         * 
         * @return builder
         * 
         */
        public Builder rulesYaml(@Nullable Output<String> rulesYaml) {
            $.rulesYaml = rulesYaml;
            return this;
        }

        /**
         * @param rulesYaml The policy YAML of the rule
         * 
         * @return builder
         * 
         */
        public Builder rulesYaml(String rulesYaml) {
            return rulesYaml(Output.of(rulesYaml));
        }

        public RuleState build() {
            return $;
        }
    }

}
