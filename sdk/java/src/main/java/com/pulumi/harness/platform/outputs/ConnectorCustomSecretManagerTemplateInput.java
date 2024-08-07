// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.harness.platform.outputs.ConnectorCustomSecretManagerTemplateInputEnvironmentVariable;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class ConnectorCustomSecretManagerTemplateInput {
    private @Nullable List<ConnectorCustomSecretManagerTemplateInputEnvironmentVariable> environmentVariables;

    private ConnectorCustomSecretManagerTemplateInput() {}
    public List<ConnectorCustomSecretManagerTemplateInputEnvironmentVariable> environmentVariables() {
        return this.environmentVariables == null ? List.of() : this.environmentVariables;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectorCustomSecretManagerTemplateInput defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<ConnectorCustomSecretManagerTemplateInputEnvironmentVariable> environmentVariables;
        public Builder() {}
        public Builder(ConnectorCustomSecretManagerTemplateInput defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.environmentVariables = defaults.environmentVariables;
        }

        @CustomType.Setter
        public Builder environmentVariables(@Nullable List<ConnectorCustomSecretManagerTemplateInputEnvironmentVariable> environmentVariables) {

            this.environmentVariables = environmentVariables;
            return this;
        }
        public Builder environmentVariables(ConnectorCustomSecretManagerTemplateInputEnvironmentVariable... environmentVariables) {
            return environmentVariables(List.of(environmentVariables));
        }
        public ConnectorCustomSecretManagerTemplateInput build() {
            final var _resultValue = new ConnectorCustomSecretManagerTemplateInput();
            _resultValue.environmentVariables = environmentVariables;
            return _resultValue;
        }
    }
}
