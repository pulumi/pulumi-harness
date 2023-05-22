// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ConnectorAzureCloudProviderCredentialsAzureInheritFromDelegateDetailsAuthAzureMsiAuthUaArgs extends com.pulumi.resources.ResourceArgs {

    public static final ConnectorAzureCloudProviderCredentialsAzureInheritFromDelegateDetailsAuthAzureMsiAuthUaArgs Empty = new ConnectorAzureCloudProviderCredentialsAzureInheritFromDelegateDetailsAuthAzureMsiAuthUaArgs();

    @Import(name="clientId")
    private @Nullable Output<String> clientId;

    public Optional<Output<String>> clientId() {
        return Optional.ofNullable(this.clientId);
    }

    private ConnectorAzureCloudProviderCredentialsAzureInheritFromDelegateDetailsAuthAzureMsiAuthUaArgs() {}

    private ConnectorAzureCloudProviderCredentialsAzureInheritFromDelegateDetailsAuthAzureMsiAuthUaArgs(ConnectorAzureCloudProviderCredentialsAzureInheritFromDelegateDetailsAuthAzureMsiAuthUaArgs $) {
        this.clientId = $.clientId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ConnectorAzureCloudProviderCredentialsAzureInheritFromDelegateDetailsAuthAzureMsiAuthUaArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ConnectorAzureCloudProviderCredentialsAzureInheritFromDelegateDetailsAuthAzureMsiAuthUaArgs $;

        public Builder() {
            $ = new ConnectorAzureCloudProviderCredentialsAzureInheritFromDelegateDetailsAuthAzureMsiAuthUaArgs();
        }

        public Builder(ConnectorAzureCloudProviderCredentialsAzureInheritFromDelegateDetailsAuthAzureMsiAuthUaArgs defaults) {
            $ = new ConnectorAzureCloudProviderCredentialsAzureInheritFromDelegateDetailsAuthAzureMsiAuthUaArgs(Objects.requireNonNull(defaults));
        }

        public Builder clientId(@Nullable Output<String> clientId) {
            $.clientId = clientId;
            return this;
        }

        public Builder clientId(String clientId) {
            return clientId(Output.of(clientId));
        }

        public ConnectorAzureCloudProviderCredentialsAzureInheritFromDelegateDetailsAuthAzureMsiAuthUaArgs build() {
            return $;
        }
    }

}