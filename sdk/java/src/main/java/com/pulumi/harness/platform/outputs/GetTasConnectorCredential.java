// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.harness.platform.outputs.GetTasConnectorCredentialTasManualDetail;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetTasConnectorCredential {
    /**
     * @return Authenticate to Tas using manual details.
     * 
     */
    private List<GetTasConnectorCredentialTasManualDetail> tasManualDetails;
    /**
     * @return Type can be ManualConfig.
     * 
     */
    private String type;

    private GetTasConnectorCredential() {}
    /**
     * @return Authenticate to Tas using manual details.
     * 
     */
    public List<GetTasConnectorCredentialTasManualDetail> tasManualDetails() {
        return this.tasManualDetails;
    }
    /**
     * @return Type can be ManualConfig.
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetTasConnectorCredential defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<GetTasConnectorCredentialTasManualDetail> tasManualDetails;
        private String type;
        public Builder() {}
        public Builder(GetTasConnectorCredential defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.tasManualDetails = defaults.tasManualDetails;
    	      this.type = defaults.type;
        }

        @CustomType.Setter
        public Builder tasManualDetails(List<GetTasConnectorCredentialTasManualDetail> tasManualDetails) {
            if (tasManualDetails == null) {
              throw new MissingRequiredPropertyException("GetTasConnectorCredential", "tasManualDetails");
            }
            this.tasManualDetails = tasManualDetails;
            return this;
        }
        public Builder tasManualDetails(GetTasConnectorCredentialTasManualDetail... tasManualDetails) {
            return tasManualDetails(List.of(tasManualDetails));
        }
        @CustomType.Setter
        public Builder type(String type) {
            if (type == null) {
              throw new MissingRequiredPropertyException("GetTasConnectorCredential", "type");
            }
            this.type = type;
            return this;
        }
        public GetTasConnectorCredential build() {
            final var _resultValue = new GetTasConnectorCredential();
            _resultValue.tasManualDetails = tasManualDetails;
            _resultValue.type = type;
            return _resultValue;
        }
    }
}
