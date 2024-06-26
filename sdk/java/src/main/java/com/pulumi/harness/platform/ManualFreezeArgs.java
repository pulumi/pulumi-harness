// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ManualFreezeArgs extends com.pulumi.resources.ResourceArgs {

    public static final ManualFreezeArgs Empty = new ManualFreezeArgs();

    /**
     * Account Identifier of the freeze
     * 
     */
    @Import(name="accountId", required=true)
    private Output<String> accountId;

    /**
     * @return Account Identifier of the freeze
     * 
     */
    public Output<String> accountId() {
        return this.accountId;
    }

    /**
     * Identifier of the freeze
     * 
     */
    @Import(name="identifier", required=true)
    private Output<String> identifier;

    /**
     * @return Identifier of the freeze
     * 
     */
    public Output<String> identifier() {
        return this.identifier;
    }

    /**
     * Organization identifier of the freeze
     * 
     */
    @Import(name="orgId")
    private @Nullable Output<String> orgId;

    /**
     * @return Organization identifier of the freeze
     * 
     */
    public Optional<Output<String>> orgId() {
        return Optional.ofNullable(this.orgId);
    }

    /**
     * Project identifier of the freeze
     * 
     */
    @Import(name="projectId")
    private @Nullable Output<String> projectId;

    /**
     * @return Project identifier of the freeze
     * 
     */
    public Optional<Output<String>> projectId() {
        return Optional.ofNullable(this.projectId);
    }

    /**
     * Yaml of the freeze
     * 
     */
    @Import(name="yaml", required=true)
    private Output<String> yaml;

    /**
     * @return Yaml of the freeze
     * 
     */
    public Output<String> yaml() {
        return this.yaml;
    }

    private ManualFreezeArgs() {}

    private ManualFreezeArgs(ManualFreezeArgs $) {
        this.accountId = $.accountId;
        this.identifier = $.identifier;
        this.orgId = $.orgId;
        this.projectId = $.projectId;
        this.yaml = $.yaml;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ManualFreezeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ManualFreezeArgs $;

        public Builder() {
            $ = new ManualFreezeArgs();
        }

        public Builder(ManualFreezeArgs defaults) {
            $ = new ManualFreezeArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accountId Account Identifier of the freeze
         * 
         * @return builder
         * 
         */
        public Builder accountId(Output<String> accountId) {
            $.accountId = accountId;
            return this;
        }

        /**
         * @param accountId Account Identifier of the freeze
         * 
         * @return builder
         * 
         */
        public Builder accountId(String accountId) {
            return accountId(Output.of(accountId));
        }

        /**
         * @param identifier Identifier of the freeze
         * 
         * @return builder
         * 
         */
        public Builder identifier(Output<String> identifier) {
            $.identifier = identifier;
            return this;
        }

        /**
         * @param identifier Identifier of the freeze
         * 
         * @return builder
         * 
         */
        public Builder identifier(String identifier) {
            return identifier(Output.of(identifier));
        }

        /**
         * @param orgId Organization identifier of the freeze
         * 
         * @return builder
         * 
         */
        public Builder orgId(@Nullable Output<String> orgId) {
            $.orgId = orgId;
            return this;
        }

        /**
         * @param orgId Organization identifier of the freeze
         * 
         * @return builder
         * 
         */
        public Builder orgId(String orgId) {
            return orgId(Output.of(orgId));
        }

        /**
         * @param projectId Project identifier of the freeze
         * 
         * @return builder
         * 
         */
        public Builder projectId(@Nullable Output<String> projectId) {
            $.projectId = projectId;
            return this;
        }

        /**
         * @param projectId Project identifier of the freeze
         * 
         * @return builder
         * 
         */
        public Builder projectId(String projectId) {
            return projectId(Output.of(projectId));
        }

        /**
         * @param yaml Yaml of the freeze
         * 
         * @return builder
         * 
         */
        public Builder yaml(Output<String> yaml) {
            $.yaml = yaml;
            return this;
        }

        /**
         * @param yaml Yaml of the freeze
         * 
         * @return builder
         * 
         */
        public Builder yaml(String yaml) {
            return yaml(Output.of(yaml));
        }

        public ManualFreezeArgs build() {
            if ($.accountId == null) {
                throw new MissingRequiredPropertyException("ManualFreezeArgs", "accountId");
            }
            if ($.identifier == null) {
                throw new MissingRequiredPropertyException("ManualFreezeArgs", "identifier");
            }
            if ($.yaml == null) {
                throw new MissingRequiredPropertyException("ManualFreezeArgs", "yaml");
            }
            return $;
        }
    }

}
