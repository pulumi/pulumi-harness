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


public final class GetDelegatetokenArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetDelegatetokenArgs Empty = new GetDelegatetokenArgs();

    /**
     * Account Identifier for the Entity
     * 
     */
    @Import(name="accountId", required=true)
    private Output<String> accountId;

    /**
     * @return Account Identifier for the Entity
     * 
     */
    public Output<String> accountId() {
        return this.accountId;
    }

    /**
     * Name of the delegate token
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return Name of the delegate token
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * Org Identifier for the Entity
     * 
     */
    @Import(name="orgId")
    private @Nullable Output<String> orgId;

    /**
     * @return Org Identifier for the Entity
     * 
     */
    public Optional<Output<String>> orgId() {
        return Optional.ofNullable(this.orgId);
    }

    /**
     * Project Identifier for the Entity
     * 
     */
    @Import(name="projectId")
    private @Nullable Output<String> projectId;

    /**
     * @return Project Identifier for the Entity
     * 
     */
    public Optional<Output<String>> projectId() {
        return Optional.ofNullable(this.projectId);
    }

    /**
     * Status of Delegate Token (ACTIVE or REVOKED). If left empty both active and revoked tokens will be assumed
     * 
     */
    @Import(name="tokenStatus")
    private @Nullable Output<String> tokenStatus;

    /**
     * @return Status of Delegate Token (ACTIVE or REVOKED). If left empty both active and revoked tokens will be assumed
     * 
     */
    public Optional<Output<String>> tokenStatus() {
        return Optional.ofNullable(this.tokenStatus);
    }

    private GetDelegatetokenArgs() {}

    private GetDelegatetokenArgs(GetDelegatetokenArgs $) {
        this.accountId = $.accountId;
        this.name = $.name;
        this.orgId = $.orgId;
        this.projectId = $.projectId;
        this.tokenStatus = $.tokenStatus;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetDelegatetokenArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetDelegatetokenArgs $;

        public Builder() {
            $ = new GetDelegatetokenArgs();
        }

        public Builder(GetDelegatetokenArgs defaults) {
            $ = new GetDelegatetokenArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accountId Account Identifier for the Entity
         * 
         * @return builder
         * 
         */
        public Builder accountId(Output<String> accountId) {
            $.accountId = accountId;
            return this;
        }

        /**
         * @param accountId Account Identifier for the Entity
         * 
         * @return builder
         * 
         */
        public Builder accountId(String accountId) {
            return accountId(Output.of(accountId));
        }

        /**
         * @param name Name of the delegate token
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of the delegate token
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param orgId Org Identifier for the Entity
         * 
         * @return builder
         * 
         */
        public Builder orgId(@Nullable Output<String> orgId) {
            $.orgId = orgId;
            return this;
        }

        /**
         * @param orgId Org Identifier for the Entity
         * 
         * @return builder
         * 
         */
        public Builder orgId(String orgId) {
            return orgId(Output.of(orgId));
        }

        /**
         * @param projectId Project Identifier for the Entity
         * 
         * @return builder
         * 
         */
        public Builder projectId(@Nullable Output<String> projectId) {
            $.projectId = projectId;
            return this;
        }

        /**
         * @param projectId Project Identifier for the Entity
         * 
         * @return builder
         * 
         */
        public Builder projectId(String projectId) {
            return projectId(Output.of(projectId));
        }

        /**
         * @param tokenStatus Status of Delegate Token (ACTIVE or REVOKED). If left empty both active and revoked tokens will be assumed
         * 
         * @return builder
         * 
         */
        public Builder tokenStatus(@Nullable Output<String> tokenStatus) {
            $.tokenStatus = tokenStatus;
            return this;
        }

        /**
         * @param tokenStatus Status of Delegate Token (ACTIVE or REVOKED). If left empty both active and revoked tokens will be assumed
         * 
         * @return builder
         * 
         */
        public Builder tokenStatus(String tokenStatus) {
            return tokenStatus(Output.of(tokenStatus));
        }

        public GetDelegatetokenArgs build() {
            if ($.accountId == null) {
                throw new MissingRequiredPropertyException("GetDelegatetokenArgs", "accountId");
            }
            if ($.name == null) {
                throw new MissingRequiredPropertyException("GetDelegatetokenArgs", "name");
            }
            return $;
        }
    }

}
