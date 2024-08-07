// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.harness.platform.inputs.FeatureFlagTargetGroupRuleArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class FeatureFlagTargetGroupState extends com.pulumi.resources.ResourceArgs {

    public static final FeatureFlagTargetGroupState Empty = new FeatureFlagTargetGroupState();

    /**
     * Account Identifier
     * 
     */
    @Import(name="accountId")
    private @Nullable Output<String> accountId;

    /**
     * @return Account Identifier
     * 
     */
    public Optional<Output<String>> accountId() {
        return Optional.ofNullable(this.accountId);
    }

    /**
     * Environment Identifier
     * 
     */
    @Import(name="environment")
    private @Nullable Output<String> environment;

    /**
     * @return Environment Identifier
     * 
     */
    public Optional<Output<String>> environment() {
        return Optional.ofNullable(this.environment);
    }

    /**
     * A list of targets to exclude from the target group
     * 
     */
    @Import(name="excludeds")
    private @Nullable Output<List<String>> excludeds;

    /**
     * @return A list of targets to exclude from the target group
     * 
     */
    public Optional<Output<List<String>>> excludeds() {
        return Optional.ofNullable(this.excludeds);
    }

    /**
     * The unique identifier of the feature flag target group.
     * 
     */
    @Import(name="identifier")
    private @Nullable Output<String> identifier;

    /**
     * @return The unique identifier of the feature flag target group.
     * 
     */
    public Optional<Output<String>> identifier() {
        return Optional.ofNullable(this.identifier);
    }

    /**
     * A list of targets to include in the target group
     * 
     */
    @Import(name="includeds")
    private @Nullable Output<List<String>> includeds;

    /**
     * @return A list of targets to include in the target group
     * 
     */
    public Optional<Output<List<String>>> includeds() {
        return Optional.ofNullable(this.includeds);
    }

    /**
     * The name of the feature flag target group.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the feature flag target group.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Organization Identifier
     * 
     */
    @Import(name="orgId")
    private @Nullable Output<String> orgId;

    /**
     * @return Organization Identifier
     * 
     */
    public Optional<Output<String>> orgId() {
        return Optional.ofNullable(this.orgId);
    }

    /**
     * Project Identifier
     * 
     */
    @Import(name="projectId")
    private @Nullable Output<String> projectId;

    /**
     * @return Project Identifier
     * 
     */
    public Optional<Output<String>> projectId() {
        return Optional.ofNullable(this.projectId);
    }

    /**
     * The list of rules used to include targets in the target group.
     * 
     */
    @Import(name="rules")
    private @Nullable Output<List<FeatureFlagTargetGroupRuleArgs>> rules;

    /**
     * @return The list of rules used to include targets in the target group.
     * 
     */
    public Optional<Output<List<FeatureFlagTargetGroupRuleArgs>>> rules() {
        return Optional.ofNullable(this.rules);
    }

    private FeatureFlagTargetGroupState() {}

    private FeatureFlagTargetGroupState(FeatureFlagTargetGroupState $) {
        this.accountId = $.accountId;
        this.environment = $.environment;
        this.excludeds = $.excludeds;
        this.identifier = $.identifier;
        this.includeds = $.includeds;
        this.name = $.name;
        this.orgId = $.orgId;
        this.projectId = $.projectId;
        this.rules = $.rules;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FeatureFlagTargetGroupState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FeatureFlagTargetGroupState $;

        public Builder() {
            $ = new FeatureFlagTargetGroupState();
        }

        public Builder(FeatureFlagTargetGroupState defaults) {
            $ = new FeatureFlagTargetGroupState(Objects.requireNonNull(defaults));
        }

        /**
         * @param accountId Account Identifier
         * 
         * @return builder
         * 
         */
        public Builder accountId(@Nullable Output<String> accountId) {
            $.accountId = accountId;
            return this;
        }

        /**
         * @param accountId Account Identifier
         * 
         * @return builder
         * 
         */
        public Builder accountId(String accountId) {
            return accountId(Output.of(accountId));
        }

        /**
         * @param environment Environment Identifier
         * 
         * @return builder
         * 
         */
        public Builder environment(@Nullable Output<String> environment) {
            $.environment = environment;
            return this;
        }

        /**
         * @param environment Environment Identifier
         * 
         * @return builder
         * 
         */
        public Builder environment(String environment) {
            return environment(Output.of(environment));
        }

        /**
         * @param excludeds A list of targets to exclude from the target group
         * 
         * @return builder
         * 
         */
        public Builder excludeds(@Nullable Output<List<String>> excludeds) {
            $.excludeds = excludeds;
            return this;
        }

        /**
         * @param excludeds A list of targets to exclude from the target group
         * 
         * @return builder
         * 
         */
        public Builder excludeds(List<String> excludeds) {
            return excludeds(Output.of(excludeds));
        }

        /**
         * @param excludeds A list of targets to exclude from the target group
         * 
         * @return builder
         * 
         */
        public Builder excludeds(String... excludeds) {
            return excludeds(List.of(excludeds));
        }

        /**
         * @param identifier The unique identifier of the feature flag target group.
         * 
         * @return builder
         * 
         */
        public Builder identifier(@Nullable Output<String> identifier) {
            $.identifier = identifier;
            return this;
        }

        /**
         * @param identifier The unique identifier of the feature flag target group.
         * 
         * @return builder
         * 
         */
        public Builder identifier(String identifier) {
            return identifier(Output.of(identifier));
        }

        /**
         * @param includeds A list of targets to include in the target group
         * 
         * @return builder
         * 
         */
        public Builder includeds(@Nullable Output<List<String>> includeds) {
            $.includeds = includeds;
            return this;
        }

        /**
         * @param includeds A list of targets to include in the target group
         * 
         * @return builder
         * 
         */
        public Builder includeds(List<String> includeds) {
            return includeds(Output.of(includeds));
        }

        /**
         * @param includeds A list of targets to include in the target group
         * 
         * @return builder
         * 
         */
        public Builder includeds(String... includeds) {
            return includeds(List.of(includeds));
        }

        /**
         * @param name The name of the feature flag target group.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the feature flag target group.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param orgId Organization Identifier
         * 
         * @return builder
         * 
         */
        public Builder orgId(@Nullable Output<String> orgId) {
            $.orgId = orgId;
            return this;
        }

        /**
         * @param orgId Organization Identifier
         * 
         * @return builder
         * 
         */
        public Builder orgId(String orgId) {
            return orgId(Output.of(orgId));
        }

        /**
         * @param projectId Project Identifier
         * 
         * @return builder
         * 
         */
        public Builder projectId(@Nullable Output<String> projectId) {
            $.projectId = projectId;
            return this;
        }

        /**
         * @param projectId Project Identifier
         * 
         * @return builder
         * 
         */
        public Builder projectId(String projectId) {
            return projectId(Output.of(projectId));
        }

        /**
         * @param rules The list of rules used to include targets in the target group.
         * 
         * @return builder
         * 
         */
        public Builder rules(@Nullable Output<List<FeatureFlagTargetGroupRuleArgs>> rules) {
            $.rules = rules;
            return this;
        }

        /**
         * @param rules The list of rules used to include targets in the target group.
         * 
         * @return builder
         * 
         */
        public Builder rules(List<FeatureFlagTargetGroupRuleArgs> rules) {
            return rules(Output.of(rules));
        }

        /**
         * @param rules The list of rules used to include targets in the target group.
         * 
         * @return builder
         * 
         */
        public Builder rules(FeatureFlagTargetGroupRuleArgs... rules) {
            return rules(List.of(rules));
        }

        public FeatureFlagTargetGroupState build() {
            return $;
        }
    }

}
