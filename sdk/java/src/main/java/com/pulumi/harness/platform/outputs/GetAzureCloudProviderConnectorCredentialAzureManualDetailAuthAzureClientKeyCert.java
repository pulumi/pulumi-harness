// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetAzureCloudProviderConnectorCredentialAzureManualDetailAuthAzureClientKeyCert {
    /**
     * @return Reference of the secret for the certificate.
     * 
     */
    private String certificateRef;

    private GetAzureCloudProviderConnectorCredentialAzureManualDetailAuthAzureClientKeyCert() {}
    /**
     * @return Reference of the secret for the certificate.
     * 
     */
    public String certificateRef() {
        return this.certificateRef;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAzureCloudProviderConnectorCredentialAzureManualDetailAuthAzureClientKeyCert defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String certificateRef;
        public Builder() {}
        public Builder(GetAzureCloudProviderConnectorCredentialAzureManualDetailAuthAzureClientKeyCert defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.certificateRef = defaults.certificateRef;
        }

        @CustomType.Setter
        public Builder certificateRef(String certificateRef) {
            if (certificateRef == null) {
              throw new MissingRequiredPropertyException("GetAzureCloudProviderConnectorCredentialAzureManualDetailAuthAzureClientKeyCert", "certificateRef");
            }
            this.certificateRef = certificateRef;
            return this;
        }
        public GetAzureCloudProviderConnectorCredentialAzureManualDetailAuthAzureClientKeyCert build() {
            final var _resultValue = new GetAzureCloudProviderConnectorCredentialAzureManualDetailAuthAzureClientKeyCert();
            _resultValue.certificateRef = certificateRef;
            return _resultValue;
        }
    }
}
