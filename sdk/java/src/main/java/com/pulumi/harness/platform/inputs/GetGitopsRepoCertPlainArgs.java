// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetGitopsRepoCertPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetGitopsRepoCertPlainArgs Empty = new GetGitopsRepoCertPlainArgs();

    /**
     * Account identifier of the GitOps repository certificate.
     * 
     * @deprecated
     * This field is deprecated and will be removed in a future release.
     * 
     */
    @Deprecated /* This field is deprecated and will be removed in a future release. */
    @Import(name="accountId")
    private @Nullable String accountId;

    /**
     * @return Account identifier of the GitOps repository certificate.
     * 
     * @deprecated
     * This field is deprecated and will be removed in a future release.
     * 
     */
    @Deprecated /* This field is deprecated and will be removed in a future release. */
    public Optional<String> accountId() {
        return Optional.ofNullable(this.accountId);
    }

    /**
     * Agent identifier of the GitOps repository certificate.
     * 
     */
    @Import(name="agentId", required=true)
    private String agentId;

    /**
     * @return Agent identifier of the GitOps repository certificate.
     * 
     */
    public String agentId() {
        return this.agentId;
    }

    /**
     * Organization identifier of the GitOps repository certificate.
     * 
     */
    @Import(name="orgId")
    private @Nullable String orgId;

    /**
     * @return Organization identifier of the GitOps repository certificate.
     * 
     */
    public Optional<String> orgId() {
        return Optional.ofNullable(this.orgId);
    }

    /**
     * Project identifier of the GitOps repository certificate.
     * 
     */
    @Import(name="projectId")
    private @Nullable String projectId;

    /**
     * @return Project identifier of the GitOps repository certificate.
     * 
     */
    public Optional<String> projectId() {
        return Optional.ofNullable(this.projectId);
    }

    private GetGitopsRepoCertPlainArgs() {}

    private GetGitopsRepoCertPlainArgs(GetGitopsRepoCertPlainArgs $) {
        this.accountId = $.accountId;
        this.agentId = $.agentId;
        this.orgId = $.orgId;
        this.projectId = $.projectId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetGitopsRepoCertPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetGitopsRepoCertPlainArgs $;

        public Builder() {
            $ = new GetGitopsRepoCertPlainArgs();
        }

        public Builder(GetGitopsRepoCertPlainArgs defaults) {
            $ = new GetGitopsRepoCertPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accountId Account identifier of the GitOps repository certificate.
         * 
         * @return builder
         * 
         * @deprecated
         * This field is deprecated and will be removed in a future release.
         * 
         */
        @Deprecated /* This field is deprecated and will be removed in a future release. */
        public Builder accountId(@Nullable String accountId) {
            $.accountId = accountId;
            return this;
        }

        /**
         * @param agentId Agent identifier of the GitOps repository certificate.
         * 
         * @return builder
         * 
         */
        public Builder agentId(String agentId) {
            $.agentId = agentId;
            return this;
        }

        /**
         * @param orgId Organization identifier of the GitOps repository certificate.
         * 
         * @return builder
         * 
         */
        public Builder orgId(@Nullable String orgId) {
            $.orgId = orgId;
            return this;
        }

        /**
         * @param projectId Project identifier of the GitOps repository certificate.
         * 
         * @return builder
         * 
         */
        public Builder projectId(@Nullable String projectId) {
            $.projectId = projectId;
            return this;
        }

        public GetGitopsRepoCertPlainArgs build() {
            if ($.agentId == null) {
                throw new MissingRequiredPropertyException("GetGitopsRepoCertPlainArgs", "agentId");
            }
            return $;
        }
    }

}
