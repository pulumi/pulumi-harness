// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.harness.platform.inputs.RepoRuleBranchBypassArgs;
import com.pulumi.harness.platform.inputs.RepoRuleBranchPatternArgs;
import com.pulumi.harness.platform.inputs.RepoRuleBranchPolicyArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RepoRuleBranchState extends com.pulumi.resources.ResourceArgs {

    public static final RepoRuleBranchState Empty = new RepoRuleBranchState();

    /**
     * List of users who can bypass this rule.
     * 
     */
    @Import(name="bypasses")
    private @Nullable Output<List<RepoRuleBranchBypassArgs>> bypasses;

    /**
     * @return List of users who can bypass this rule.
     * 
     */
    public Optional<Output<List<RepoRuleBranchBypassArgs>>> bypasses() {
        return Optional.ofNullable(this.bypasses);
    }

    /**
     * Timestamp when the rule was created.
     * 
     */
    @Import(name="created")
    private @Nullable Output<Integer> created;

    /**
     * @return Timestamp when the rule was created.
     * 
     */
    public Optional<Output<Integer>> created() {
        return Optional.ofNullable(this.created);
    }

    /**
     * ID of the user who created the rule.
     * 
     */
    @Import(name="createdBy")
    private @Nullable Output<Integer> createdBy;

    /**
     * @return ID of the user who created the rule.
     * 
     */
    public Optional<Output<Integer>> createdBy() {
        return Optional.ofNullable(this.createdBy);
    }

    /**
     * Description of the rule.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return Description of the rule.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Identifier of the rule.
     * 
     */
    @Import(name="identifier")
    private @Nullable Output<String> identifier;

    /**
     * @return Identifier of the rule.
     * 
     */
    public Optional<Output<String>> identifier() {
        return Optional.ofNullable(this.identifier);
    }

    /**
     * Unique identifier of the organization.
     * 
     */
    @Import(name="orgId")
    private @Nullable Output<String> orgId;

    /**
     * @return Unique identifier of the organization.
     * 
     */
    public Optional<Output<String>> orgId() {
        return Optional.ofNullable(this.orgId);
    }

    /**
     * Pattern of branch to which rule will apply.
     * 
     */
    @Import(name="patterns")
    private @Nullable Output<List<RepoRuleBranchPatternArgs>> patterns;

    /**
     * @return Pattern of branch to which rule will apply.
     * 
     */
    public Optional<Output<List<RepoRuleBranchPatternArgs>>> patterns() {
        return Optional.ofNullable(this.patterns);
    }

    /**
     * Policies to be applied for this rule.
     * 
     */
    @Import(name="policies")
    private @Nullable Output<List<RepoRuleBranchPolicyArgs>> policies;

    /**
     * @return Policies to be applied for this rule.
     * 
     */
    public Optional<Output<List<RepoRuleBranchPolicyArgs>>> policies() {
        return Optional.ofNullable(this.policies);
    }

    /**
     * Unique identifier of the project.
     * 
     */
    @Import(name="projectId")
    private @Nullable Output<String> projectId;

    /**
     * @return Unique identifier of the project.
     * 
     */
    public Optional<Output<String>> projectId() {
        return Optional.ofNullable(this.projectId);
    }

    /**
     * Repo identifier of the repository.
     * 
     */
    @Import(name="repoIdentifier")
    private @Nullable Output<String> repoIdentifier;

    /**
     * @return Repo identifier of the repository.
     * 
     */
    public Optional<Output<String>> repoIdentifier() {
        return Optional.ofNullable(this.repoIdentifier);
    }

    /**
     * State of the rule (active, disable, monitor).
     * 
     */
    @Import(name="state")
    private @Nullable Output<String> state;

    /**
     * @return State of the rule (active, disable, monitor).
     * 
     */
    public Optional<Output<String>> state() {
        return Optional.ofNullable(this.state);
    }

    /**
     * Timestamp when the rule was updated.
     * 
     */
    @Import(name="updated")
    private @Nullable Output<Integer> updated;

    /**
     * @return Timestamp when the rule was updated.
     * 
     */
    public Optional<Output<Integer>> updated() {
        return Optional.ofNullable(this.updated);
    }

    /**
     * ID of the user who updated the rule.
     * 
     */
    @Import(name="updatedBy")
    private @Nullable Output<Integer> updatedBy;

    /**
     * @return ID of the user who updated the rule.
     * 
     */
    public Optional<Output<Integer>> updatedBy() {
        return Optional.ofNullable(this.updatedBy);
    }

    private RepoRuleBranchState() {}

    private RepoRuleBranchState(RepoRuleBranchState $) {
        this.bypasses = $.bypasses;
        this.created = $.created;
        this.createdBy = $.createdBy;
        this.description = $.description;
        this.identifier = $.identifier;
        this.orgId = $.orgId;
        this.patterns = $.patterns;
        this.policies = $.policies;
        this.projectId = $.projectId;
        this.repoIdentifier = $.repoIdentifier;
        this.state = $.state;
        this.updated = $.updated;
        this.updatedBy = $.updatedBy;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RepoRuleBranchState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RepoRuleBranchState $;

        public Builder() {
            $ = new RepoRuleBranchState();
        }

        public Builder(RepoRuleBranchState defaults) {
            $ = new RepoRuleBranchState(Objects.requireNonNull(defaults));
        }

        /**
         * @param bypasses List of users who can bypass this rule.
         * 
         * @return builder
         * 
         */
        public Builder bypasses(@Nullable Output<List<RepoRuleBranchBypassArgs>> bypasses) {
            $.bypasses = bypasses;
            return this;
        }

        /**
         * @param bypasses List of users who can bypass this rule.
         * 
         * @return builder
         * 
         */
        public Builder bypasses(List<RepoRuleBranchBypassArgs> bypasses) {
            return bypasses(Output.of(bypasses));
        }

        /**
         * @param bypasses List of users who can bypass this rule.
         * 
         * @return builder
         * 
         */
        public Builder bypasses(RepoRuleBranchBypassArgs... bypasses) {
            return bypasses(List.of(bypasses));
        }

        /**
         * @param created Timestamp when the rule was created.
         * 
         * @return builder
         * 
         */
        public Builder created(@Nullable Output<Integer> created) {
            $.created = created;
            return this;
        }

        /**
         * @param created Timestamp when the rule was created.
         * 
         * @return builder
         * 
         */
        public Builder created(Integer created) {
            return created(Output.of(created));
        }

        /**
         * @param createdBy ID of the user who created the rule.
         * 
         * @return builder
         * 
         */
        public Builder createdBy(@Nullable Output<Integer> createdBy) {
            $.createdBy = createdBy;
            return this;
        }

        /**
         * @param createdBy ID of the user who created the rule.
         * 
         * @return builder
         * 
         */
        public Builder createdBy(Integer createdBy) {
            return createdBy(Output.of(createdBy));
        }

        /**
         * @param description Description of the rule.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Description of the rule.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param identifier Identifier of the rule.
         * 
         * @return builder
         * 
         */
        public Builder identifier(@Nullable Output<String> identifier) {
            $.identifier = identifier;
            return this;
        }

        /**
         * @param identifier Identifier of the rule.
         * 
         * @return builder
         * 
         */
        public Builder identifier(String identifier) {
            return identifier(Output.of(identifier));
        }

        /**
         * @param orgId Unique identifier of the organization.
         * 
         * @return builder
         * 
         */
        public Builder orgId(@Nullable Output<String> orgId) {
            $.orgId = orgId;
            return this;
        }

        /**
         * @param orgId Unique identifier of the organization.
         * 
         * @return builder
         * 
         */
        public Builder orgId(String orgId) {
            return orgId(Output.of(orgId));
        }

        /**
         * @param patterns Pattern of branch to which rule will apply.
         * 
         * @return builder
         * 
         */
        public Builder patterns(@Nullable Output<List<RepoRuleBranchPatternArgs>> patterns) {
            $.patterns = patterns;
            return this;
        }

        /**
         * @param patterns Pattern of branch to which rule will apply.
         * 
         * @return builder
         * 
         */
        public Builder patterns(List<RepoRuleBranchPatternArgs> patterns) {
            return patterns(Output.of(patterns));
        }

        /**
         * @param patterns Pattern of branch to which rule will apply.
         * 
         * @return builder
         * 
         */
        public Builder patterns(RepoRuleBranchPatternArgs... patterns) {
            return patterns(List.of(patterns));
        }

        /**
         * @param policies Policies to be applied for this rule.
         * 
         * @return builder
         * 
         */
        public Builder policies(@Nullable Output<List<RepoRuleBranchPolicyArgs>> policies) {
            $.policies = policies;
            return this;
        }

        /**
         * @param policies Policies to be applied for this rule.
         * 
         * @return builder
         * 
         */
        public Builder policies(List<RepoRuleBranchPolicyArgs> policies) {
            return policies(Output.of(policies));
        }

        /**
         * @param policies Policies to be applied for this rule.
         * 
         * @return builder
         * 
         */
        public Builder policies(RepoRuleBranchPolicyArgs... policies) {
            return policies(List.of(policies));
        }

        /**
         * @param projectId Unique identifier of the project.
         * 
         * @return builder
         * 
         */
        public Builder projectId(@Nullable Output<String> projectId) {
            $.projectId = projectId;
            return this;
        }

        /**
         * @param projectId Unique identifier of the project.
         * 
         * @return builder
         * 
         */
        public Builder projectId(String projectId) {
            return projectId(Output.of(projectId));
        }

        /**
         * @param repoIdentifier Repo identifier of the repository.
         * 
         * @return builder
         * 
         */
        public Builder repoIdentifier(@Nullable Output<String> repoIdentifier) {
            $.repoIdentifier = repoIdentifier;
            return this;
        }

        /**
         * @param repoIdentifier Repo identifier of the repository.
         * 
         * @return builder
         * 
         */
        public Builder repoIdentifier(String repoIdentifier) {
            return repoIdentifier(Output.of(repoIdentifier));
        }

        /**
         * @param state State of the rule (active, disable, monitor).
         * 
         * @return builder
         * 
         */
        public Builder state(@Nullable Output<String> state) {
            $.state = state;
            return this;
        }

        /**
         * @param state State of the rule (active, disable, monitor).
         * 
         * @return builder
         * 
         */
        public Builder state(String state) {
            return state(Output.of(state));
        }

        /**
         * @param updated Timestamp when the rule was updated.
         * 
         * @return builder
         * 
         */
        public Builder updated(@Nullable Output<Integer> updated) {
            $.updated = updated;
            return this;
        }

        /**
         * @param updated Timestamp when the rule was updated.
         * 
         * @return builder
         * 
         */
        public Builder updated(Integer updated) {
            return updated(Output.of(updated));
        }

        /**
         * @param updatedBy ID of the user who updated the rule.
         * 
         * @return builder
         * 
         */
        public Builder updatedBy(@Nullable Output<Integer> updatedBy) {
            $.updatedBy = updatedBy;
            return this;
        }

        /**
         * @param updatedBy ID of the user who updated the rule.
         * 
         * @return builder
         * 
         */
        public Builder updatedBy(Integer updatedBy) {
            return updatedBy(Output.of(updatedBy));
        }

        public RepoRuleBranchState build() {
            return $;
        }
    }

}
