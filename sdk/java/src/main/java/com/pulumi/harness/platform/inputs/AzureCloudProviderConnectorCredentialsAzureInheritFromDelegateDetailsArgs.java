// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.harness.platform.inputs.AzureCloudProviderConnectorCredentialsAzureInheritFromDelegateDetailsAuthArgs;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AzureCloudProviderConnectorCredentialsAzureInheritFromDelegateDetailsArgs extends com.pulumi.resources.ResourceArgs {

    public static final AzureCloudProviderConnectorCredentialsAzureInheritFromDelegateDetailsArgs Empty = new AzureCloudProviderConnectorCredentialsAzureInheritFromDelegateDetailsArgs();

    /**
     * Auth to authenticate to Azure Cloud Provider using details inheriting from delegate.
     * 
     */
    @Import(name="auth")
    private @Nullable Output<AzureCloudProviderConnectorCredentialsAzureInheritFromDelegateDetailsAuthArgs> auth;

    /**
     * @return Auth to authenticate to Azure Cloud Provider using details inheriting from delegate.
     * 
     */
    public Optional<Output<AzureCloudProviderConnectorCredentialsAzureInheritFromDelegateDetailsAuthArgs>> auth() {
        return Optional.ofNullable(this.auth);
    }

    private AzureCloudProviderConnectorCredentialsAzureInheritFromDelegateDetailsArgs() {}

    private AzureCloudProviderConnectorCredentialsAzureInheritFromDelegateDetailsArgs(AzureCloudProviderConnectorCredentialsAzureInheritFromDelegateDetailsArgs $) {
        this.auth = $.auth;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AzureCloudProviderConnectorCredentialsAzureInheritFromDelegateDetailsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AzureCloudProviderConnectorCredentialsAzureInheritFromDelegateDetailsArgs $;

        public Builder() {
            $ = new AzureCloudProviderConnectorCredentialsAzureInheritFromDelegateDetailsArgs();
        }

        public Builder(AzureCloudProviderConnectorCredentialsAzureInheritFromDelegateDetailsArgs defaults) {
            $ = new AzureCloudProviderConnectorCredentialsAzureInheritFromDelegateDetailsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param auth Auth to authenticate to Azure Cloud Provider using details inheriting from delegate.
         * 
         * @return builder
         * 
         */
        public Builder auth(@Nullable Output<AzureCloudProviderConnectorCredentialsAzureInheritFromDelegateDetailsAuthArgs> auth) {
            $.auth = auth;
            return this;
        }

        /**
         * @param auth Auth to authenticate to Azure Cloud Provider using details inheriting from delegate.
         * 
         * @return builder
         * 
         */
        public Builder auth(AzureCloudProviderConnectorCredentialsAzureInheritFromDelegateDetailsAuthArgs auth) {
            return auth(Output.of(auth));
        }

        public AzureCloudProviderConnectorCredentialsAzureInheritFromDelegateDetailsArgs build() {
            return $;
        }
    }

}
