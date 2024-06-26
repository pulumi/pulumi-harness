// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.harness.platform.inputs.ServiceNowConnectorAuthAdfsArgs;
import com.pulumi.harness.platform.inputs.ServiceNowConnectorAuthUsernamePasswordArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ServiceNowConnectorAuthArgs extends com.pulumi.resources.ResourceArgs {

    public static final ServiceNowConnectorAuthArgs Empty = new ServiceNowConnectorAuthArgs();

    /**
     * Authenticate using adfs client credentials with certificate.
     * 
     */
    @Import(name="adfs")
    private @Nullable Output<ServiceNowConnectorAuthAdfsArgs> adfs;

    /**
     * @return Authenticate using adfs client credentials with certificate.
     * 
     */
    public Optional<Output<ServiceNowConnectorAuthAdfsArgs>> adfs() {
        return Optional.ofNullable(this.adfs);
    }

    /**
     * Authentication types for Jira connector
     * 
     */
    @Import(name="authType", required=true)
    private Output<String> authType;

    /**
     * @return Authentication types for Jira connector
     * 
     */
    public Output<String> authType() {
        return this.authType;
    }

    /**
     * Authenticate using username password.
     * 
     */
    @Import(name="usernamePassword")
    private @Nullable Output<ServiceNowConnectorAuthUsernamePasswordArgs> usernamePassword;

    /**
     * @return Authenticate using username password.
     * 
     */
    public Optional<Output<ServiceNowConnectorAuthUsernamePasswordArgs>> usernamePassword() {
        return Optional.ofNullable(this.usernamePassword);
    }

    private ServiceNowConnectorAuthArgs() {}

    private ServiceNowConnectorAuthArgs(ServiceNowConnectorAuthArgs $) {
        this.adfs = $.adfs;
        this.authType = $.authType;
        this.usernamePassword = $.usernamePassword;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServiceNowConnectorAuthArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServiceNowConnectorAuthArgs $;

        public Builder() {
            $ = new ServiceNowConnectorAuthArgs();
        }

        public Builder(ServiceNowConnectorAuthArgs defaults) {
            $ = new ServiceNowConnectorAuthArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param adfs Authenticate using adfs client credentials with certificate.
         * 
         * @return builder
         * 
         */
        public Builder adfs(@Nullable Output<ServiceNowConnectorAuthAdfsArgs> adfs) {
            $.adfs = adfs;
            return this;
        }

        /**
         * @param adfs Authenticate using adfs client credentials with certificate.
         * 
         * @return builder
         * 
         */
        public Builder adfs(ServiceNowConnectorAuthAdfsArgs adfs) {
            return adfs(Output.of(adfs));
        }

        /**
         * @param authType Authentication types for Jira connector
         * 
         * @return builder
         * 
         */
        public Builder authType(Output<String> authType) {
            $.authType = authType;
            return this;
        }

        /**
         * @param authType Authentication types for Jira connector
         * 
         * @return builder
         * 
         */
        public Builder authType(String authType) {
            return authType(Output.of(authType));
        }

        /**
         * @param usernamePassword Authenticate using username password.
         * 
         * @return builder
         * 
         */
        public Builder usernamePassword(@Nullable Output<ServiceNowConnectorAuthUsernamePasswordArgs> usernamePassword) {
            $.usernamePassword = usernamePassword;
            return this;
        }

        /**
         * @param usernamePassword Authenticate using username password.
         * 
         * @return builder
         * 
         */
        public Builder usernamePassword(ServiceNowConnectorAuthUsernamePasswordArgs usernamePassword) {
            return usernamePassword(Output.of(usernamePassword));
        }

        public ServiceNowConnectorAuthArgs build() {
            if ($.authType == null) {
                throw new MissingRequiredPropertyException("ServiceNowConnectorAuthArgs", "authType");
            }
            return $;
        }
    }

}
