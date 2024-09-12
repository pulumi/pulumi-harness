// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.harness.outputs.GetEnvironmentVariableOverride;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetEnvironmentResult {
    /**
     * @return The id of the application.
     * 
     */
    private String appId;
    /**
     * @return The description of the environment.
     * 
     */
    private String description;
    /**
     * @return The id of the environment.
     * 
     */
    private @Nullable String environmentId;
    /**
     * @return The id of the environment.
     * 
     */
    private String id;
    /**
     * @return The name of the environment.
     * 
     */
    private @Nullable String name;
    /**
     * @return The type of the environment. Valid values are `PROD` and `NON_PROD`
     * 
     */
    private String type;
    /**
     * @return Override for a service variable
     * 
     */
    private List<GetEnvironmentVariableOverride> variableOverrides;

    private GetEnvironmentResult() {}
    /**
     * @return The id of the application.
     * 
     */
    public String appId() {
        return this.appId;
    }
    /**
     * @return The description of the environment.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return The id of the environment.
     * 
     */
    public Optional<String> environmentId() {
        return Optional.ofNullable(this.environmentId);
    }
    /**
     * @return The id of the environment.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The name of the environment.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    /**
     * @return The type of the environment. Valid values are `PROD` and `NON_PROD`
     * 
     */
    public String type() {
        return this.type;
    }
    /**
     * @return Override for a service variable
     * 
     */
    public List<GetEnvironmentVariableOverride> variableOverrides() {
        return this.variableOverrides;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetEnvironmentResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String appId;
        private String description;
        private @Nullable String environmentId;
        private String id;
        private @Nullable String name;
        private String type;
        private List<GetEnvironmentVariableOverride> variableOverrides;
        public Builder() {}
        public Builder(GetEnvironmentResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.appId = defaults.appId;
    	      this.description = defaults.description;
    	      this.environmentId = defaults.environmentId;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.type = defaults.type;
    	      this.variableOverrides = defaults.variableOverrides;
        }

        @CustomType.Setter
        public Builder appId(String appId) {
            if (appId == null) {
              throw new MissingRequiredPropertyException("GetEnvironmentResult", "appId");
            }
            this.appId = appId;
            return this;
        }
        @CustomType.Setter
        public Builder description(String description) {
            if (description == null) {
              throw new MissingRequiredPropertyException("GetEnvironmentResult", "description");
            }
            this.description = description;
            return this;
        }
        @CustomType.Setter
        public Builder environmentId(@Nullable String environmentId) {

            this.environmentId = environmentId;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetEnvironmentResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder name(@Nullable String name) {

            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder type(String type) {
            if (type == null) {
              throw new MissingRequiredPropertyException("GetEnvironmentResult", "type");
            }
            this.type = type;
            return this;
        }
        @CustomType.Setter
        public Builder variableOverrides(List<GetEnvironmentVariableOverride> variableOverrides) {
            if (variableOverrides == null) {
              throw new MissingRequiredPropertyException("GetEnvironmentResult", "variableOverrides");
            }
            this.variableOverrides = variableOverrides;
            return this;
        }
        public Builder variableOverrides(GetEnvironmentVariableOverride... variableOverrides) {
            return variableOverrides(List.of(variableOverrides));
        }
        public GetEnvironmentResult build() {
            final var _resultValue = new GetEnvironmentResult();
            _resultValue.appId = appId;
            _resultValue.description = description;
            _resultValue.environmentId = environmentId;
            _resultValue.id = id;
            _resultValue.name = name;
            _resultValue.type = type;
            _resultValue.variableOverrides = variableOverrides;
            return _resultValue;
        }
    }
}