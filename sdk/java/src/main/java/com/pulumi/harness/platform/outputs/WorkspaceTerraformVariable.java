// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class WorkspaceTerraformVariable {
    /**
     * @return Key is the identifier for the variable. Must be unique within the workspace.
     * 
     */
    private String key;
    /**
     * @return Value is the value of the variable. For string value types this field should contain the value of the variable. For secret value types this should contain a reference to a valid harness secret.
     * 
     */
    private String value;
    /**
     * @return Value type indicates the value type of the variable. Currently we support string and secret.
     * 
     */
    private String valueType;

    private WorkspaceTerraformVariable() {}
    /**
     * @return Key is the identifier for the variable. Must be unique within the workspace.
     * 
     */
    public String key() {
        return this.key;
    }
    /**
     * @return Value is the value of the variable. For string value types this field should contain the value of the variable. For secret value types this should contain a reference to a valid harness secret.
     * 
     */
    public String value() {
        return this.value;
    }
    /**
     * @return Value type indicates the value type of the variable. Currently we support string and secret.
     * 
     */
    public String valueType() {
        return this.valueType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkspaceTerraformVariable defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String key;
        private String value;
        private String valueType;
        public Builder() {}
        public Builder(WorkspaceTerraformVariable defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.key = defaults.key;
    	      this.value = defaults.value;
    	      this.valueType = defaults.valueType;
        }

        @CustomType.Setter
        public Builder key(String key) {
            if (key == null) {
              throw new MissingRequiredPropertyException("WorkspaceTerraformVariable", "key");
            }
            this.key = key;
            return this;
        }
        @CustomType.Setter
        public Builder value(String value) {
            if (value == null) {
              throw new MissingRequiredPropertyException("WorkspaceTerraformVariable", "value");
            }
            this.value = value;
            return this;
        }
        @CustomType.Setter
        public Builder valueType(String valueType) {
            if (valueType == null) {
              throw new MissingRequiredPropertyException("WorkspaceTerraformVariable", "valueType");
            }
            this.valueType = valueType;
            return this;
        }
        public WorkspaceTerraformVariable build() {
            final var _resultValue = new WorkspaceTerraformVariable();
            _resultValue.key = key;
            _resultValue.value = value;
            _resultValue.valueType = valueType;
            return _resultValue;
        }
    }
}