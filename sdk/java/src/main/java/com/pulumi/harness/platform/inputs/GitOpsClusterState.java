// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.harness.platform.inputs.GitOpsClusterRequestArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GitOpsClusterState extends com.pulumi.resources.ResourceArgs {

    public static final GitOpsClusterState Empty = new GitOpsClusterState();

    /**
     * Account identifier of the GitOps cluster.
     * 
     * @deprecated
     * This field is deprecated and will be removed in a future release.
     * 
     */
    @Deprecated /* This field is deprecated and will be removed in a future release. */
    @Import(name="accountId")
    private @Nullable Output<String> accountId;

    /**
     * @return Account identifier of the GitOps cluster.
     * 
     * @deprecated
     * This field is deprecated and will be removed in a future release.
     * 
     */
    @Deprecated /* This field is deprecated and will be removed in a future release. */
    public Optional<Output<String>> accountId() {
        return Optional.ofNullable(this.accountId);
    }

    /**
     * Agent identifier of the GitOps cluster. (include scope prefix)
     * 
     */
    @Import(name="agentId")
    private @Nullable Output<String> agentId;

    /**
     * @return Agent identifier of the GitOps cluster. (include scope prefix)
     * 
     */
    public Optional<Output<String>> agentId() {
        return Optional.ofNullable(this.agentId);
    }

    /**
     * Indicates if the cluster should be deleted forcefully, regardless of existing applications using that cluster.
     * 
     */
    @Import(name="forceDelete")
    private @Nullable Output<Boolean> forceDelete;

    /**
     * @return Indicates if the cluster should be deleted forcefully, regardless of existing applications using that cluster.
     * 
     */
    public Optional<Output<Boolean>> forceDelete() {
        return Optional.ofNullable(this.forceDelete);
    }

    /**
     * Identifier of the GitOps cluster.
     * 
     */
    @Import(name="identifier")
    private @Nullable Output<String> identifier;

    /**
     * @return Identifier of the GitOps cluster.
     * 
     */
    public Optional<Output<String>> identifier() {
        return Optional.ofNullable(this.identifier);
    }

    /**
     * Organization identifier of the cluster.
     * 
     */
    @Import(name="orgId")
    private @Nullable Output<String> orgId;

    /**
     * @return Organization identifier of the cluster.
     * 
     */
    public Optional<Output<String>> orgId() {
        return Optional.ofNullable(this.orgId);
    }

    /**
     * Project identifier of the GitOps cluster.
     * 
     */
    @Import(name="projectId")
    private @Nullable Output<String> projectId;

    /**
     * @return Project identifier of the GitOps cluster.
     * 
     */
    public Optional<Output<String>> projectId() {
        return Optional.ofNullable(this.projectId);
    }

    /**
     * Cluster create or update request.
     * 
     */
    @Import(name="requests")
    private @Nullable Output<List<GitOpsClusterRequestArgs>> requests;

    /**
     * @return Cluster create or update request.
     * 
     */
    public Optional<Output<List<GitOpsClusterRequestArgs>>> requests() {
        return Optional.ofNullable(this.requests);
    }

    private GitOpsClusterState() {}

    private GitOpsClusterState(GitOpsClusterState $) {
        this.accountId = $.accountId;
        this.agentId = $.agentId;
        this.forceDelete = $.forceDelete;
        this.identifier = $.identifier;
        this.orgId = $.orgId;
        this.projectId = $.projectId;
        this.requests = $.requests;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GitOpsClusterState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GitOpsClusterState $;

        public Builder() {
            $ = new GitOpsClusterState();
        }

        public Builder(GitOpsClusterState defaults) {
            $ = new GitOpsClusterState(Objects.requireNonNull(defaults));
        }

        /**
         * @param accountId Account identifier of the GitOps cluster.
         * 
         * @return builder
         * 
         * @deprecated
         * This field is deprecated and will be removed in a future release.
         * 
         */
        @Deprecated /* This field is deprecated and will be removed in a future release. */
        public Builder accountId(@Nullable Output<String> accountId) {
            $.accountId = accountId;
            return this;
        }

        /**
         * @param accountId Account identifier of the GitOps cluster.
         * 
         * @return builder
         * 
         * @deprecated
         * This field is deprecated and will be removed in a future release.
         * 
         */
        @Deprecated /* This field is deprecated and will be removed in a future release. */
        public Builder accountId(String accountId) {
            return accountId(Output.of(accountId));
        }

        /**
         * @param agentId Agent identifier of the GitOps cluster. (include scope prefix)
         * 
         * @return builder
         * 
         */
        public Builder agentId(@Nullable Output<String> agentId) {
            $.agentId = agentId;
            return this;
        }

        /**
         * @param agentId Agent identifier of the GitOps cluster. (include scope prefix)
         * 
         * @return builder
         * 
         */
        public Builder agentId(String agentId) {
            return agentId(Output.of(agentId));
        }

        /**
         * @param forceDelete Indicates if the cluster should be deleted forcefully, regardless of existing applications using that cluster.
         * 
         * @return builder
         * 
         */
        public Builder forceDelete(@Nullable Output<Boolean> forceDelete) {
            $.forceDelete = forceDelete;
            return this;
        }

        /**
         * @param forceDelete Indicates if the cluster should be deleted forcefully, regardless of existing applications using that cluster.
         * 
         * @return builder
         * 
         */
        public Builder forceDelete(Boolean forceDelete) {
            return forceDelete(Output.of(forceDelete));
        }

        /**
         * @param identifier Identifier of the GitOps cluster.
         * 
         * @return builder
         * 
         */
        public Builder identifier(@Nullable Output<String> identifier) {
            $.identifier = identifier;
            return this;
        }

        /**
         * @param identifier Identifier of the GitOps cluster.
         * 
         * @return builder
         * 
         */
        public Builder identifier(String identifier) {
            return identifier(Output.of(identifier));
        }

        /**
         * @param orgId Organization identifier of the cluster.
         * 
         * @return builder
         * 
         */
        public Builder orgId(@Nullable Output<String> orgId) {
            $.orgId = orgId;
            return this;
        }

        /**
         * @param orgId Organization identifier of the cluster.
         * 
         * @return builder
         * 
         */
        public Builder orgId(String orgId) {
            return orgId(Output.of(orgId));
        }

        /**
         * @param projectId Project identifier of the GitOps cluster.
         * 
         * @return builder
         * 
         */
        public Builder projectId(@Nullable Output<String> projectId) {
            $.projectId = projectId;
            return this;
        }

        /**
         * @param projectId Project identifier of the GitOps cluster.
         * 
         * @return builder
         * 
         */
        public Builder projectId(String projectId) {
            return projectId(Output.of(projectId));
        }

        /**
         * @param requests Cluster create or update request.
         * 
         * @return builder
         * 
         */
        public Builder requests(@Nullable Output<List<GitOpsClusterRequestArgs>> requests) {
            $.requests = requests;
            return this;
        }

        /**
         * @param requests Cluster create or update request.
         * 
         * @return builder
         * 
         */
        public Builder requests(List<GitOpsClusterRequestArgs> requests) {
            return requests(Output.of(requests));
        }

        /**
         * @param requests Cluster create or update request.
         * 
         * @return builder
         * 
         */
        public Builder requests(GitOpsClusterRequestArgs... requests) {
            return requests(List.of(requests));
        }

        public GitOpsClusterState build() {
            return $;
        }
    }

}
