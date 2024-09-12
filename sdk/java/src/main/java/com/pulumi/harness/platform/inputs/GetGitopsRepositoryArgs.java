// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.harness.platform.inputs.GetGitopsRepositoryUpdateMaskArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetGitopsRepositoryArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetGitopsRepositoryArgs Empty = new GetGitopsRepositoryArgs();

    /**
     * Account identifier of the GitOps repository.
     * 
     */
    @Import(name="accountId", required=true)
    private Output<String> accountId;

    /**
     * @return Account identifier of the GitOps repository.
     * 
     */
    public Output<String> accountId() {
        return this.accountId;
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
     * Indicates if helm-oci support must be enabled for this repo.
     * 
     */
    @Import(name="enableOci")
    private @Nullable Output<Boolean> enableOci;

    /**
     * @return Indicates if helm-oci support must be enabled for this repo.
     * 
     */
    public Optional<Output<Boolean>> enableOci() {
        return Optional.ofNullable(this.enableOci);
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

    /**
     * Update mask of the repository.
     * 
     */
    @Import(name="updateMasks")
    private @Nullable Output<List<GetGitopsRepositoryUpdateMaskArgs>> updateMasks;

    /**
     * @return Update mask of the repository.
     * 
     */
    public Optional<Output<List<GetGitopsRepositoryUpdateMaskArgs>>> updateMasks() {
        return Optional.ofNullable(this.updateMasks);
    }

    private GetGitopsRepositoryArgs() {}

    private GetGitopsRepositoryArgs(GetGitopsRepositoryArgs $) {
        this.accountId = $.accountId;
        this.agentId = $.agentId;
        this.enableOci = $.enableOci;
        this.identifier = $.identifier;
        this.orgId = $.orgId;
        this.projectId = $.projectId;
        this.updateMasks = $.updateMasks;
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
         */
        public Builder accountId(Output<String> accountId) {
            $.accountId = accountId;
            return this;
        }

        /**
         * @param accountId Account identifier of the GitOps repository.
         * 
         * @return builder
         * 
         */
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
         * @param enableOci Indicates if helm-oci support must be enabled for this repo.
         * 
         * @return builder
         * 
         */
        public Builder enableOci(@Nullable Output<Boolean> enableOci) {
            $.enableOci = enableOci;
            return this;
        }

        /**
         * @param enableOci Indicates if helm-oci support must be enabled for this repo.
         * 
         * @return builder
         * 
         */
        public Builder enableOci(Boolean enableOci) {
            return enableOci(Output.of(enableOci));
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

        /**
         * @param updateMasks Update mask of the repository.
         * 
         * @return builder
         * 
         */
        public Builder updateMasks(@Nullable Output<List<GetGitopsRepositoryUpdateMaskArgs>> updateMasks) {
            $.updateMasks = updateMasks;
            return this;
        }

        /**
         * @param updateMasks Update mask of the repository.
         * 
         * @return builder
         * 
         */
        public Builder updateMasks(List<GetGitopsRepositoryUpdateMaskArgs> updateMasks) {
            return updateMasks(Output.of(updateMasks));
        }

        /**
         * @param updateMasks Update mask of the repository.
         * 
         * @return builder
         * 
         */
        public Builder updateMasks(GetGitopsRepositoryUpdateMaskArgs... updateMasks) {
            return updateMasks(List.of(updateMasks));
        }

        public GetGitopsRepositoryArgs build() {
            if ($.accountId == null) {
                throw new MissingRequiredPropertyException("GetGitopsRepositoryArgs", "accountId");
            }
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