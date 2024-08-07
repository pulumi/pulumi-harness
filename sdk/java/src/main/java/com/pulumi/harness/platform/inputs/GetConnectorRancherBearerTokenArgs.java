// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetConnectorRancherBearerTokenArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetConnectorRancherBearerTokenArgs Empty = new GetConnectorRancherBearerTokenArgs();

    /**
     * Reference to the secret containing the bearer token for the rancher cluster. To reference a secret at the organization scope, prefix &#39;org&#39; to the expression: org.{identifier}. To reference a secret at the account scope, prefix &#39;account` to the expression: account.{identifier}.
     * 
     */
    @Import(name="passwordRef", required=true)
    private Output<String> passwordRef;

    /**
     * @return Reference to the secret containing the bearer token for the rancher cluster. To reference a secret at the organization scope, prefix &#39;org&#39; to the expression: org.{identifier}. To reference a secret at the account scope, prefix &#39;account` to the expression: account.{identifier}.
     * 
     */
    public Output<String> passwordRef() {
        return this.passwordRef;
    }

    /**
     * The URL of the Rancher cluster.
     * 
     */
    @Import(name="rancherUrl", required=true)
    private Output<String> rancherUrl;

    /**
     * @return The URL of the Rancher cluster.
     * 
     */
    public Output<String> rancherUrl() {
        return this.rancherUrl;
    }

    private GetConnectorRancherBearerTokenArgs() {}

    private GetConnectorRancherBearerTokenArgs(GetConnectorRancherBearerTokenArgs $) {
        this.passwordRef = $.passwordRef;
        this.rancherUrl = $.rancherUrl;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetConnectorRancherBearerTokenArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetConnectorRancherBearerTokenArgs $;

        public Builder() {
            $ = new GetConnectorRancherBearerTokenArgs();
        }

        public Builder(GetConnectorRancherBearerTokenArgs defaults) {
            $ = new GetConnectorRancherBearerTokenArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param passwordRef Reference to the secret containing the bearer token for the rancher cluster. To reference a secret at the organization scope, prefix &#39;org&#39; to the expression: org.{identifier}. To reference a secret at the account scope, prefix &#39;account` to the expression: account.{identifier}.
         * 
         * @return builder
         * 
         */
        public Builder passwordRef(Output<String> passwordRef) {
            $.passwordRef = passwordRef;
            return this;
        }

        /**
         * @param passwordRef Reference to the secret containing the bearer token for the rancher cluster. To reference a secret at the organization scope, prefix &#39;org&#39; to the expression: org.{identifier}. To reference a secret at the account scope, prefix &#39;account` to the expression: account.{identifier}.
         * 
         * @return builder
         * 
         */
        public Builder passwordRef(String passwordRef) {
            return passwordRef(Output.of(passwordRef));
        }

        /**
         * @param rancherUrl The URL of the Rancher cluster.
         * 
         * @return builder
         * 
         */
        public Builder rancherUrl(Output<String> rancherUrl) {
            $.rancherUrl = rancherUrl;
            return this;
        }

        /**
         * @param rancherUrl The URL of the Rancher cluster.
         * 
         * @return builder
         * 
         */
        public Builder rancherUrl(String rancherUrl) {
            return rancherUrl(Output.of(rancherUrl));
        }

        public GetConnectorRancherBearerTokenArgs build() {
            if ($.passwordRef == null) {
                throw new MissingRequiredPropertyException("GetConnectorRancherBearerTokenArgs", "passwordRef");
            }
            if ($.rancherUrl == null) {
                throw new MissingRequiredPropertyException("GetConnectorRancherBearerTokenArgs", "rancherUrl");
            }
            return $;
        }
    }

}
