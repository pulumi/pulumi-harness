// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetGitopsRepositoryArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetGitopsRepositoryArgs Empty = new GetGitopsRepositoryArgs();

    /**
     * Account identifier of the GitOps repository.
     * 
     * @deprecated
     * This field is deprecated and will be removed in a future release.
     * 
     */
    @Deprecated /* This field is deprecated and will be removed in a future release. */
    @Import(name="accountId")
    private @Nullable Output<String> accountId;

    /**
     * @return Account identifier of the GitOps repository.
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
     * Agent identifier of the GitOps repository.
     * 
     */
    @Import(name="agentId", required=true)
    private Output<String> agentId;

    /**
     * @return Agent identifier of the GitOps repository.
     * 
     */
    public Output<String> agentId() {
        return this.agentId;
    }

    /**
     * Identifier of the GitOps repository.
     * 
     */
    @Import(name="identifier", required=true)
    private Output<String> identifier;

    /**
     * @return Identifier of the GitOps repository.
     * 
     */
    public Output<String> identifier() {
        return this.identifier;
    }

    /**
     * Organization identifier of the GitOps repository.
     * 
     */
    @Import(name="orgId")
    private @Nullable Output<String> orgId;

    /**
     * @return Organization identifier of the GitOps repository.
     * 
     */
    public Optional<Output<String>> orgId() {
        return Optional.ofNullable(this.orgId);
    }

    /**
     * Project identifier of the GitOps repository.
     * 
     */
    @Import(name="projectId")
    private @Nullable Output<String> projectId;

    /**
     * @return Project identifier of the GitOps repository.
     * 
     */
    public Optional<Output<String>> projectId() {
        return Optional.ofNullable(this.projectId);
    }

    private GetGitopsRepositoryArgs() {}

    private GetGitopsRepositoryArgs(GetGitopsRepositoryArgs $) {
        this.accountId = $.accountId;
        this.agentId = $.agentId;
        this.identifier = $.identifier;
        this.orgId = $.orgId;
        this.projectId = $.projectId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetGitopsRepositoryArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetGitopsRepositoryArgs $;

        public Builder() {
            $ = new GetGitopsRepositoryArgs();
        }

        public Builder(GetGitopsRepositoryArgs defaults) {
            $ = new GetGitopsRepositoryArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accountId Account identifier of the GitOps repository.
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
         * @param accountId Account identifier of the GitOps repository.
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
         * @param agentId Agent identifier of the GitOps repository.
         * 
         * @return builder
         * 
         */
        public Builder agentId(Output<String> agentId) {
            $.agentId = agentId;
            return this;
        }

        /**
         * @param agentId Agent identifier of the GitOps repository.
         * 
         * @return builder
         * 
         */
        public Builder agentId(String agentId) {
            return agentId(Output.of(agentId));
        }

        /**
         * @param identifier Identifier of the GitOps repository.
         * 
         * @return builder
         * 
         */
        public Builder identifier(Output<String> identifier) {
            $.identifier = identifier;
            return this;
        }

        /**
         * @param identifier Identifier of the GitOps repository.
         * 
         * @return builder
         * 
         */
        public Builder identifier(String identifier) {
            return identifier(Output.of(identifier));
        }

        /**
         * @param orgId Organization identifier of the GitOps repository.
         * 
         * @return builder
         * 
         */
        public Builder orgId(@Nullable Output<String> orgId) {
            $.orgId = orgId;
            return this;
        }

        /**
         * @param orgId Organization identifier of the GitOps repository.
         * 
         * @return builder
         * 
         */
        public Builder orgId(String orgId) {
            return orgId(Output.of(orgId));
        }

        /**
         * @param projectId Project identifier of the GitOps repository.
         * 
         * @return builder
         * 
         */
        public Builder projectId(@Nullable Output<String> projectId) {
            $.projectId = projectId;
            return this;
        }

        /**
         * @param projectId Project identifier of the GitOps repository.
         * 
         * @return builder
         * 
         */
        public Builder projectId(String projectId) {
            return projectId(Output.of(projectId));
        }

        public GetGitopsRepositoryArgs build() {
            if ($.agentId == null) {
                throw new MissingRequiredPropertyException("GetGitopsRepositoryArgs", "agentId");
            }
            if ($.identifier == null) {
                throw new MissingRequiredPropertyException("GetGitopsRepositoryArgs", "identifier");
            }
            return $;
        }
    }

}
