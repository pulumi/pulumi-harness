// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AzureCloudProviderConnectorCredentialsAzureManualDetailsAuthAzureClientSecretKeyArgs extends com.pulumi.resources.ResourceArgs {

    public static final AzureCloudProviderConnectorCredentialsAzureManualDetailsAuthAzureClientSecretKeyArgs Empty = new AzureCloudProviderConnectorCredentialsAzureManualDetailsAuthAzureClientSecretKeyArgs();

    /**
     * Reference of the secret for the secret key. To reference a secret at the organization scope, prefix &#39;org&#39; to the expression: org.{identifier}. To reference a secret at the account scope, prefix &#39;account` to the expression: account.{identifier}.
     * 
     */
    @Import(name="secretRef")
    private @Nullable Output<String> secretRef;

    /**
     * @return Reference of the secret for the secret key. To reference a secret at the organization scope, prefix &#39;org&#39; to the expression: org.{identifier}. To reference a secret at the account scope, prefix &#39;account` to the expression: account.{identifier}.
     * 
     */
    public Optional<Output<String>> secretRef() {
        return Optional.ofNullable(this.secretRef);
    }

    private AzureCloudProviderConnectorCredentialsAzureManualDetailsAuthAzureClientSecretKeyArgs() {}

    private AzureCloudProviderConnectorCredentialsAzureManualDetailsAuthAzureClientSecretKeyArgs(AzureCloudProviderConnectorCredentialsAzureManualDetailsAuthAzureClientSecretKeyArgs $) {
        this.secretRef = $.secretRef;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AzureCloudProviderConnectorCredentialsAzureManualDetailsAuthAzureClientSecretKeyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AzureCloudProviderConnectorCredentialsAzureManualDetailsAuthAzureClientSecretKeyArgs $;

        public Builder() {
            $ = new AzureCloudProviderConnectorCredentialsAzureManualDetailsAuthAzureClientSecretKeyArgs();
        }

        public Builder(AzureCloudProviderConnectorCredentialsAzureManualDetailsAuthAzureClientSecretKeyArgs defaults) {
            $ = new AzureCloudProviderConnectorCredentialsAzureManualDetailsAuthAzureClientSecretKeyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param secretRef Reference of the secret for the secret key. To reference a secret at the organization scope, prefix &#39;org&#39; to the expression: org.{identifier}. To reference a secret at the account scope, prefix &#39;account` to the expression: account.{identifier}.
         * 
         * @return builder
         * 
         */
        public Builder secretRef(@Nullable Output<String> secretRef) {
            $.secretRef = secretRef;
            return this;
        }

        /**
         * @param secretRef Reference of the secret for the secret key. To reference a secret at the organization scope, prefix &#39;org&#39; to the expression: org.{identifier}. To reference a secret at the account scope, prefix &#39;account` to the expression: account.{identifier}.
         * 
         * @return builder
         * 
         */
        public Builder secretRef(String secretRef) {
            return secretRef(Output.of(secretRef));
        }

        public AzureCloudProviderConnectorCredentialsAzureManualDetailsAuthAzureClientSecretKeyArgs build() {
            return $;
        }
    }

}