// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.harness.outputs.InfrastructureDefinitionCustomVariable;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class InfrastructureDefinitionCustom {
    /**
     * @return The template version
     * 
     */
    private String deploymentTypeTemplateVersion;
    /**
     * @return Variables to be used in the service
     * 
     */
    private @Nullable List<InfrastructureDefinitionCustomVariable> variables;

    private InfrastructureDefinitionCustom() {}
    /**
     * @return The template version
     * 
     */
    public String deploymentTypeTemplateVersion() {
        return this.deploymentTypeTemplateVersion;
    }
    /**
     * @return Variables to be used in the service
     * 
     */
    public List<InfrastructureDefinitionCustomVariable> variables() {
        return this.variables == null ? List.of() : this.variables;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InfrastructureDefinitionCustom defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String deploymentTypeTemplateVersion;
        private @Nullable List<InfrastructureDefinitionCustomVariable> variables;
        public Builder() {}
        public Builder(InfrastructureDefinitionCustom defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deploymentTypeTemplateVersion = defaults.deploymentTypeTemplateVersion;
    	      this.variables = defaults.variables;
        }

        @CustomType.Setter
        public Builder deploymentTypeTemplateVersion(String deploymentTypeTemplateVersion) {
            if (deploymentTypeTemplateVersion == null) {
              throw new MissingRequiredPropertyException("InfrastructureDefinitionCustom", "deploymentTypeTemplateVersion");
            }
            this.deploymentTypeTemplateVersion = deploymentTypeTemplateVersion;
            return this;
        }
        @CustomType.Setter
        public Builder variables(@Nullable List<InfrastructureDefinitionCustomVariable> variables) {

            this.variables = variables;
            return this;
        }
        public Builder variables(InfrastructureDefinitionCustomVariable... variables) {
            return variables(List.of(variables));
        }
        public InfrastructureDefinitionCustom build() {
            final var _resultValue = new InfrastructureDefinitionCustom();
            _resultValue.deploymentTypeTemplateVersion = deploymentTypeTemplateVersion;
            _resultValue.variables = variables;
            return _resultValue;
        }
    }
}
