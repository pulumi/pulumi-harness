// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetSloResult {
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return Identifier of the SLO.
     * 
     */
    private String identifier;
    /**
     * @return Identifier of the organization in which the SLO is configured.
     * 
     */
    private String orgId;
    /**
     * @return Identifier of the project in which the SLO is configured.
     * 
     */
    private String projectId;

    private GetSloResult() {}
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Identifier of the SLO.
     * 
     */
    public String identifier() {
        return this.identifier;
    }
    /**
     * @return Identifier of the organization in which the SLO is configured.
     * 
     */
    public String orgId() {
        return this.orgId;
    }
    /**
     * @return Identifier of the project in which the SLO is configured.
     * 
     */
    public String projectId() {
        return this.projectId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSloResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String id;
        private String identifier;
        private String orgId;
        private String projectId;
        public Builder() {}
        public Builder(GetSloResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.identifier = defaults.identifier;
    	      this.orgId = defaults.orgId;
    	      this.projectId = defaults.projectId;
        }

        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetSloResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder identifier(String identifier) {
            if (identifier == null) {
              throw new MissingRequiredPropertyException("GetSloResult", "identifier");
            }
            this.identifier = identifier;
            return this;
        }
        @CustomType.Setter
        public Builder orgId(String orgId) {
            if (orgId == null) {
              throw new MissingRequiredPropertyException("GetSloResult", "orgId");
            }
            this.orgId = orgId;
            return this;
        }
        @CustomType.Setter
        public Builder projectId(String projectId) {
            if (projectId == null) {
              throw new MissingRequiredPropertyException("GetSloResult", "projectId");
            }
            this.projectId = projectId;
            return this;
        }
        public GetSloResult build() {
            final var _resultValue = new GetSloResult();
            _resultValue.id = id;
            _resultValue.identifier = identifier;
            _resultValue.orgId = orgId;
            _resultValue.projectId = projectId;
            return _resultValue;
        }
    }
}
