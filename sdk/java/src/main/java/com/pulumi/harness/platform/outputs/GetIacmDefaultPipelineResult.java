// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetIacmDefaultPipelineResult {
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return The operation associated with this default.
     * 
     */
    private String operation;
    /**
     * @return Organization identifier of the organization the default pipelines resides in.
     * 
     */
    private String orgId;
    /**
     * @return The pipeline associated with this default.
     * 
     */
    private String pipeline;
    /**
     * @return Project identifier of the project the default pipelines resides in.
     * 
     */
    private String projectId;
    /**
     * @return The provisioner associated with this default.
     * 
     */
    private String provisionerType;

    private GetIacmDefaultPipelineResult() {}
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The operation associated with this default.
     * 
     */
    public String operation() {
        return this.operation;
    }
    /**
     * @return Organization identifier of the organization the default pipelines resides in.
     * 
     */
    public String orgId() {
        return this.orgId;
    }
    /**
     * @return The pipeline associated with this default.
     * 
     */
    public String pipeline() {
        return this.pipeline;
    }
    /**
     * @return Project identifier of the project the default pipelines resides in.
     * 
     */
    public String projectId() {
        return this.projectId;
    }
    /**
     * @return The provisioner associated with this default.
     * 
     */
    public String provisionerType() {
        return this.provisionerType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetIacmDefaultPipelineResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String id;
        private String operation;
        private String orgId;
        private String pipeline;
        private String projectId;
        private String provisionerType;
        public Builder() {}
        public Builder(GetIacmDefaultPipelineResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.operation = defaults.operation;
    	      this.orgId = defaults.orgId;
    	      this.pipeline = defaults.pipeline;
    	      this.projectId = defaults.projectId;
    	      this.provisionerType = defaults.provisionerType;
        }

        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetIacmDefaultPipelineResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder operation(String operation) {
            if (operation == null) {
              throw new MissingRequiredPropertyException("GetIacmDefaultPipelineResult", "operation");
            }
            this.operation = operation;
            return this;
        }
        @CustomType.Setter
        public Builder orgId(String orgId) {
            if (orgId == null) {
              throw new MissingRequiredPropertyException("GetIacmDefaultPipelineResult", "orgId");
            }
            this.orgId = orgId;
            return this;
        }
        @CustomType.Setter
        public Builder pipeline(String pipeline) {
            if (pipeline == null) {
              throw new MissingRequiredPropertyException("GetIacmDefaultPipelineResult", "pipeline");
            }
            this.pipeline = pipeline;
            return this;
        }
        @CustomType.Setter
        public Builder projectId(String projectId) {
            if (projectId == null) {
              throw new MissingRequiredPropertyException("GetIacmDefaultPipelineResult", "projectId");
            }
            this.projectId = projectId;
            return this;
        }
        @CustomType.Setter
        public Builder provisionerType(String provisionerType) {
            if (provisionerType == null) {
              throw new MissingRequiredPropertyException("GetIacmDefaultPipelineResult", "provisionerType");
            }
            this.provisionerType = provisionerType;
            return this;
        }
        public GetIacmDefaultPipelineResult build() {
            final var _resultValue = new GetIacmDefaultPipelineResult();
            _resultValue.id = id;
            _resultValue.operation = operation;
            _resultValue.orgId = orgId;
            _resultValue.pipeline = pipeline;
            _resultValue.projectId = projectId;
            _resultValue.provisionerType = provisionerType;
            return _resultValue;
        }
    }
}