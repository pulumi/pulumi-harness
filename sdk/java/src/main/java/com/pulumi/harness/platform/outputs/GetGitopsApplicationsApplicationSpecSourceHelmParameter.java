// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetGitopsApplicationsApplicationSpecSourceHelmParameter {
    /**
     * @return Indicates if helm should interpret booleans and numbers as strings.
     * 
     */
    private Boolean forceString;
    /**
     * @return Name of the helm parameter.
     * 
     */
    private String name;
    /**
     * @return Value of the helm parameter.
     * 
     */
    private String value;

    private GetGitopsApplicationsApplicationSpecSourceHelmParameter() {}
    /**
     * @return Indicates if helm should interpret booleans and numbers as strings.
     * 
     */
    public Boolean forceString() {
        return this.forceString;
    }
    /**
     * @return Name of the helm parameter.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Value of the helm parameter.
     * 
     */
    public String value() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetGitopsApplicationsApplicationSpecSourceHelmParameter defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Boolean forceString;
        private String name;
        private String value;
        public Builder() {}
        public Builder(GetGitopsApplicationsApplicationSpecSourceHelmParameter defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.forceString = defaults.forceString;
    	      this.name = defaults.name;
    	      this.value = defaults.value;
        }

        @CustomType.Setter
        public Builder forceString(Boolean forceString) {
            if (forceString == null) {
              throw new MissingRequiredPropertyException("GetGitopsApplicationsApplicationSpecSourceHelmParameter", "forceString");
            }
            this.forceString = forceString;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetGitopsApplicationsApplicationSpecSourceHelmParameter", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder value(String value) {
            if (value == null) {
              throw new MissingRequiredPropertyException("GetGitopsApplicationsApplicationSpecSourceHelmParameter", "value");
            }
            this.value = value;
            return this;
        }
        public GetGitopsApplicationsApplicationSpecSourceHelmParameter build() {
            final var _resultValue = new GetGitopsApplicationsApplicationSpecSourceHelmParameter();
            _resultValue.forceString = forceString;
            _resultValue.name = name;
            _resultValue.value = value;
            return _resultValue;
        }
    }
}
