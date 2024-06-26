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


public final class GetGitopsRepoCertArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetGitopsRepoCertArgs Empty = new GetGitopsRepoCertArgs();

    /**
     * account identifier of the Repository Certificates.
     * 
     */
    @Import(name="accountId", required=true)
    private Output<String> accountId;

    /**
     * @return account identifier of the Repository Certificates.
     * 
     */
    public Output<String> accountId() {
        return this.accountId;
    }

    /**
     * agent identifier of the Repository Certificates.
     * 
     */
    @Import(name="agentId")
    private @Nullable Output<String> agentId;

    /**
     * @return agent identifier of the Repository Certificates.
     * 
     */
    public Optional<Output<String>> agentId() {
        return Optional.ofNullable(this.agentId);
    }

    /**
     * organization identifier of the Repository Certificates.
     * 
     */
    @Import(name="orgId")
    private @Nullable Output<String> orgId;

    /**
     * @return organization identifier of the Repository Certificates.
     * 
     */
    public Optional<Output<String>> orgId() {
        return Optional.ofNullable(this.orgId);
    }

    /**
     * project identifier of the Repository Certificates.
     * 
     */
    @Import(name="projectId")
    private @Nullable Output<String> projectId;

    /**
     * @return project identifier of the Repository Certificates.
     * 
     */
    public Optional<Output<String>> projectId() {
        return Optional.ofNullable(this.projectId);
    }

    private GetGitopsRepoCertArgs() {}

    private GetGitopsRepoCertArgs(GetGitopsRepoCertArgs $) {
        this.accountId = $.accountId;
        this.agentId = $.agentId;
        this.orgId = $.orgId;
        this.projectId = $.projectId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetGitopsRepoCertArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetGitopsRepoCertArgs $;

        public Builder() {
            $ = new GetGitopsRepoCertArgs();
        }

        public Builder(GetGitopsRepoCertArgs defaults) {
            $ = new GetGitopsRepoCertArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accountId account identifier of the Repository Certificates.
         * 
         * @return builder
         * 
         */
        public Builder accountId(Output<String> accountId) {
            $.accountId = accountId;
            return this;
        }

        /**
         * @param accountId account identifier of the Repository Certificates.
         * 
         * @return builder
         * 
         */
        public Builder accountId(String accountId) {
            return accountId(Output.of(accountId));
        }

        /**
         * @param agentId agent identifier of the Repository Certificates.
         * 
         * @return builder
         * 
         */
        public Builder agentId(@Nullable Output<String> agentId) {
            $.agentId = agentId;
            return this;
        }

        /**
         * @param agentId agent identifier of the Repository Certificates.
         * 
         * @return builder
         * 
         */
        public Builder agentId(String agentId) {
            return agentId(Output.of(agentId));
        }

        /**
         * @param orgId organization identifier of the Repository Certificates.
         * 
         * @return builder
         * 
         */
        public Builder orgId(@Nullable Output<String> orgId) {
            $.orgId = orgId;
            return this;
        }

        /**
         * @param orgId organization identifier of the Repository Certificates.
         * 
         * @return builder
         * 
         */
        public Builder orgId(String orgId) {
            return orgId(Output.of(orgId));
        }

        /**
         * @param projectId project identifier of the Repository Certificates.
         * 
         * @return builder
         * 
         */
        public Builder projectId(@Nullable Output<String> projectId) {
            $.projectId = projectId;
            return this;
        }

        /**
         * @param projectId project identifier of the Repository Certificates.
         * 
         * @return builder
         * 
         */
        public Builder projectId(String projectId) {
            return projectId(Output.of(projectId));
        }

        public GetGitopsRepoCertArgs build() {
            if ($.accountId == null) {
                throw new MissingRequiredPropertyException("GetGitopsRepoCertArgs", "accountId");
            }
            return $;
        }
    }

}