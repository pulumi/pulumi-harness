// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetEnvironmentClustersMappingResult {
    /**
     * @return environment identifier of the cluster.
     * 
     */
    private String envId;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return identifier of the cluster.
     * 
     */
    private String identifier;
    /**
     * @return org_id of the cluster.
     * 
     */
    private @Nullable String orgId;
    /**
     * @return project_id of the cluster.
     * 
     */
    private @Nullable String projectId;
    /**
     * @return scope at which the cluster exists in harness gitops
     * 
     */
    private String scope;

    private GetEnvironmentClustersMappingResult() {}
    /**
     * @return environment identifier of the cluster.
     * 
     */
    public String envId() {
        return this.envId;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return identifier of the cluster.
     * 
     */
    public String identifier() {
        return this.identifier;
    }
    /**
     * @return org_id of the cluster.
     * 
     */
    public Optional<String> orgId() {
        return Optional.ofNullable(this.orgId);
    }
    /**
     * @return project_id of the cluster.
     * 
     */
    public Optional<String> projectId() {
        return Optional.ofNullable(this.projectId);
    }
    /**
     * @return scope at which the cluster exists in harness gitops
     * 
     */
    public String scope() {
        return this.scope;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetEnvironmentClustersMappingResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String envId;
        private String id;
        private String identifier;
        private @Nullable String orgId;
        private @Nullable String projectId;
        private String scope;
        public Builder() {}
        public Builder(GetEnvironmentClustersMappingResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.envId = defaults.envId;
    	      this.id = defaults.id;
    	      this.identifier = defaults.identifier;
    	      this.orgId = defaults.orgId;
    	      this.projectId = defaults.projectId;
    	      this.scope = defaults.scope;
        }

        @CustomType.Setter
        public Builder envId(String envId) {
            if (envId == null) {
              throw new MissingRequiredPropertyException("GetEnvironmentClustersMappingResult", "envId");
            }
            this.envId = envId;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetEnvironmentClustersMappingResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder identifier(String identifier) {
            if (identifier == null) {
              throw new MissingRequiredPropertyException("GetEnvironmentClustersMappingResult", "identifier");
            }
            this.identifier = identifier;
            return this;
        }
        @CustomType.Setter
        public Builder orgId(@Nullable String orgId) {

            this.orgId = orgId;
            return this;
        }
        @CustomType.Setter
        public Builder projectId(@Nullable String projectId) {

            this.projectId = projectId;
            return this;
        }
        @CustomType.Setter
        public Builder scope(String scope) {
            if (scope == null) {
              throw new MissingRequiredPropertyException("GetEnvironmentClustersMappingResult", "scope");
            }
            this.scope = scope;
            return this;
        }
        public GetEnvironmentClustersMappingResult build() {
            final var _resultValue = new GetEnvironmentClustersMappingResult();
            _resultValue.envId = envId;
            _resultValue.id = id;
            _resultValue.identifier = identifier;
            _resultValue.orgId = orgId;
            _resultValue.projectId = projectId;
            _resultValue.scope = scope;
            return _resultValue;
        }
    }
}
