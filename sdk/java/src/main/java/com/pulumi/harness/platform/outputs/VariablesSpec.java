// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class VariablesSpec {
    /**
     * @return FixedValue of the variable
     * 
     */
    private String fixedValue;
    /**
     * @return Type of Value of the Variable. For now only FIXED is supported
     * 
     */
    private String valueType;

    private VariablesSpec() {}
    /**
     * @return FixedValue of the variable
     * 
     */
    public String fixedValue() {
        return this.fixedValue;
    }
    /**
     * @return Type of Value of the Variable. For now only FIXED is supported
     * 
     */
    public String valueType() {
        return this.valueType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VariablesSpec defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String fixedValue;
        private String valueType;
        public Builder() {}
        public Builder(VariablesSpec defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fixedValue = defaults.fixedValue;
    	      this.valueType = defaults.valueType;
        }

        @CustomType.Setter
        public Builder fixedValue(String fixedValue) {
            if (fixedValue == null) {
              throw new MissingRequiredPropertyException("VariablesSpec", "fixedValue");
            }
            this.fixedValue = fixedValue;
            return this;
        }
        @CustomType.Setter
        public Builder valueType(String valueType) {
            if (valueType == null) {
              throw new MissingRequiredPropertyException("VariablesSpec", "valueType");
            }
            this.valueType = valueType;
            return this;
        }
        public VariablesSpec build() {
            final var _resultValue = new VariablesSpec();
            _resultValue.fixedValue = fixedValue;
            _resultValue.valueType = valueType;
            return _resultValue;
        }
    }
}
