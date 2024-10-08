// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ConnectorCustomSecretManagerTemplateInputEnvironmentVariable {
    private @Nullable Boolean default_;
    /**
     * @return : Name of the resource.
     * 
     */
    private String name;
    /**
     * @return : Type of the custom secrets manager, typically set to `CustomSecretManager`.
     * 
     */
    private String type;
    private String value;

    private ConnectorCustomSecretManagerTemplateInputEnvironmentVariable() {}
    public Optional<Boolean> default_() {
        return Optional.ofNullable(this.default_);
    }
    /**
     * @return : Name of the resource.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return : Type of the custom secrets manager, typically set to `CustomSecretManager`.
     * 
     */
    public String type() {
        return this.type;
    }
    public String value() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectorCustomSecretManagerTemplateInputEnvironmentVariable defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean default_;
        private String name;
        private String type;
        private String value;
        public Builder() {}
        public Builder(ConnectorCustomSecretManagerTemplateInputEnvironmentVariable defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.default_ = defaults.default_;
    	      this.name = defaults.name;
    	      this.type = defaults.type;
    	      this.value = defaults.value;
        }

        @CustomType.Setter("default")
        public Builder default_(@Nullable Boolean default_) {

            this.default_ = default_;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("ConnectorCustomSecretManagerTemplateInputEnvironmentVariable", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder type(String type) {
            if (type == null) {
              throw new MissingRequiredPropertyException("ConnectorCustomSecretManagerTemplateInputEnvironmentVariable", "type");
            }
            this.type = type;
            return this;
        }
        @CustomType.Setter
        public Builder value(String value) {
            if (value == null) {
              throw new MissingRequiredPropertyException("ConnectorCustomSecretManagerTemplateInputEnvironmentVariable", "value");
            }
            this.value = value;
            return this;
        }
        public ConnectorCustomSecretManagerTemplateInputEnvironmentVariable build() {
            final var _resultValue = new ConnectorCustomSecretManagerTemplateInputEnvironmentVariable();
            _resultValue.default_ = default_;
            _resultValue.name = name;
            _resultValue.type = type;
            _resultValue.value = value;
            return _resultValue;
        }
    }
}