// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AwsConnectorIrsa {
    /**
     * @return The delegates to inherit the credentials from.
     * 
     */
    private List<String> delegateSelectors;
    /**
     * @return Test Region to perform Connection test of AWS Connector.
     * 
     */
    private @Nullable String region;

    private AwsConnectorIrsa() {}
    /**
     * @return The delegates to inherit the credentials from.
     * 
     */
    public List<String> delegateSelectors() {
        return this.delegateSelectors;
    }
    /**
     * @return Test Region to perform Connection test of AWS Connector.
     * 
     */
    public Optional<String> region() {
        return Optional.ofNullable(this.region);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AwsConnectorIrsa defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<String> delegateSelectors;
        private @Nullable String region;
        public Builder() {}
        public Builder(AwsConnectorIrsa defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.delegateSelectors = defaults.delegateSelectors;
    	      this.region = defaults.region;
        }

        @CustomType.Setter
        public Builder delegateSelectors(List<String> delegateSelectors) {
            if (delegateSelectors == null) {
              throw new MissingRequiredPropertyException("AwsConnectorIrsa", "delegateSelectors");
            }
            this.delegateSelectors = delegateSelectors;
            return this;
        }
        public Builder delegateSelectors(String... delegateSelectors) {
            return delegateSelectors(List.of(delegateSelectors));
        }
        @CustomType.Setter
        public Builder region(@Nullable String region) {

            this.region = region;
            return this;
        }
        public AwsConnectorIrsa build() {
            final var _resultValue = new AwsConnectorIrsa();
            _resultValue.delegateSelectors = delegateSelectors;
            _resultValue.region = region;
            return _resultValue;
        }
    }
}
