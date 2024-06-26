// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.harness.platform.outputs.GetTerraformCloudConnectorCredentialApiToken;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetTerraformCloudConnectorCredential {
    /**
     * @return API token credentials to use for authentication.
     * 
     */
    private List<GetTerraformCloudConnectorCredentialApiToken> apiTokens;

    private GetTerraformCloudConnectorCredential() {}
    /**
     * @return API token credentials to use for authentication.
     * 
     */
    public List<GetTerraformCloudConnectorCredentialApiToken> apiTokens() {
        return this.apiTokens;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetTerraformCloudConnectorCredential defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<GetTerraformCloudConnectorCredentialApiToken> apiTokens;
        public Builder() {}
        public Builder(GetTerraformCloudConnectorCredential defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiTokens = defaults.apiTokens;
        }

        @CustomType.Setter
        public Builder apiTokens(List<GetTerraformCloudConnectorCredentialApiToken> apiTokens) {
            if (apiTokens == null) {
              throw new MissingRequiredPropertyException("GetTerraformCloudConnectorCredential", "apiTokens");
            }
            this.apiTokens = apiTokens;
            return this;
        }
        public Builder apiTokens(GetTerraformCloudConnectorCredentialApiToken... apiTokens) {
            return apiTokens(List.of(apiTokens));
        }
        public GetTerraformCloudConnectorCredential build() {
            final var _resultValue = new GetTerraformCloudConnectorCredential();
            _resultValue.apiTokens = apiTokens;
            return _resultValue;
        }
    }
}
