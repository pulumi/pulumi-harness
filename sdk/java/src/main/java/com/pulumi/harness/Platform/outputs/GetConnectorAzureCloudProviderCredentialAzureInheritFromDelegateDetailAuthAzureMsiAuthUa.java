// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetConnectorAzureCloudProviderCredentialAzureInheritFromDelegateDetailAuthAzureMsiAuthUa {
    private String clientId;

    private GetConnectorAzureCloudProviderCredentialAzureInheritFromDelegateDetailAuthAzureMsiAuthUa() {}
    public String clientId() {
        return this.clientId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetConnectorAzureCloudProviderCredentialAzureInheritFromDelegateDetailAuthAzureMsiAuthUa defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String clientId;
        public Builder() {}
        public Builder(GetConnectorAzureCloudProviderCredentialAzureInheritFromDelegateDetailAuthAzureMsiAuthUa defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clientId = defaults.clientId;
        }

        @CustomType.Setter
        public Builder clientId(String clientId) {
            this.clientId = Objects.requireNonNull(clientId);
            return this;
        }
        public GetConnectorAzureCloudProviderCredentialAzureInheritFromDelegateDetailAuthAzureMsiAuthUa build() {
            final var o = new GetConnectorAzureCloudProviderCredentialAzureInheritFromDelegateDetailAuthAzureMsiAuthUa();
            o.clientId = clientId;
            return o;
        }
    }
}