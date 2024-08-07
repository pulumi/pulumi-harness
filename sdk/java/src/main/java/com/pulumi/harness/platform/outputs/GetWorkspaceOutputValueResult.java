// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.harness.platform.outputs.GetWorkspaceOutputValueOutputValue;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetWorkspaceOutputValueResult {
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return Identifier of the Workspace.
     * 
     */
    private String identifier;
    /**
     * @return Organization identifier of the organization the workspace resides in.
     * 
     */
    private String orgId;
    private List<GetWorkspaceOutputValueOutputValue> outputValues;
    /**
     * @return Project identifier of the project the workspace resides in.
     * 
     */
    private String projectId;

    private GetWorkspaceOutputValueResult() {}
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Identifier of the Workspace.
     * 
     */
    public String identifier() {
        return this.identifier;
    }
    /**
     * @return Organization identifier of the organization the workspace resides in.
     * 
     */
    public String orgId() {
        return this.orgId;
    }
    public List<GetWorkspaceOutputValueOutputValue> outputValues() {
        return this.outputValues;
    }
    /**
     * @return Project identifier of the project the workspace resides in.
     * 
     */
    public String projectId() {
        return this.projectId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetWorkspaceOutputValueResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String id;
        private String identifier;
        private String orgId;
        private List<GetWorkspaceOutputValueOutputValue> outputValues;
        private String projectId;
        public Builder() {}
        public Builder(GetWorkspaceOutputValueResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.identifier = defaults.identifier;
    	      this.orgId = defaults.orgId;
    	      this.outputValues = defaults.outputValues;
    	      this.projectId = defaults.projectId;
        }

        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetWorkspaceOutputValueResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder identifier(String identifier) {
            if (identifier == null) {
              throw new MissingRequiredPropertyException("GetWorkspaceOutputValueResult", "identifier");
            }
            this.identifier = identifier;
            return this;
        }
        @CustomType.Setter
        public Builder orgId(String orgId) {
            if (orgId == null) {
              throw new MissingRequiredPropertyException("GetWorkspaceOutputValueResult", "orgId");
            }
            this.orgId = orgId;
            return this;
        }
        @CustomType.Setter
        public Builder outputValues(List<GetWorkspaceOutputValueOutputValue> outputValues) {
            if (outputValues == null) {
              throw new MissingRequiredPropertyException("GetWorkspaceOutputValueResult", "outputValues");
            }
            this.outputValues = outputValues;
            return this;
        }
        public Builder outputValues(GetWorkspaceOutputValueOutputValue... outputValues) {
            return outputValues(List.of(outputValues));
        }
        @CustomType.Setter
        public Builder projectId(String projectId) {
            if (projectId == null) {
              throw new MissingRequiredPropertyException("GetWorkspaceOutputValueResult", "projectId");
            }
            this.projectId = projectId;
            return this;
        }
        public GetWorkspaceOutputValueResult build() {
            final var _resultValue = new GetWorkspaceOutputValueResult();
            _resultValue.id = id;
            _resultValue.identifier = identifier;
            _resultValue.orgId = orgId;
            _resultValue.outputValues = outputValues;
            _resultValue.projectId = projectId;
            return _resultValue;
        }
    }
}
