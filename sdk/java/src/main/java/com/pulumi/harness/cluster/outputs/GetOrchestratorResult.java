// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.cluster.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetOrchestratorResult {
    /**
     * @return Endpoint of the k8s cluster being onboarded under the orchestrator
     * 
     */
    private String clusterEndpoint;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return ID of the Harness Kubernetes Connector Being used
     * 
     */
    private @Nullable String k8sConnectorId;
    /**
     * @return Name of the Orchestrator
     * 
     */
    private String name;

    private GetOrchestratorResult() {}
    /**
     * @return Endpoint of the k8s cluster being onboarded under the orchestrator
     * 
     */
    public String clusterEndpoint() {
        return this.clusterEndpoint;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return ID of the Harness Kubernetes Connector Being used
     * 
     */
    public Optional<String> k8sConnectorId() {
        return Optional.ofNullable(this.k8sConnectorId);
    }
    /**
     * @return Name of the Orchestrator
     * 
     */
    public String name() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetOrchestratorResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String clusterEndpoint;
        private String id;
        private @Nullable String k8sConnectorId;
        private String name;
        public Builder() {}
        public Builder(GetOrchestratorResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clusterEndpoint = defaults.clusterEndpoint;
    	      this.id = defaults.id;
    	      this.k8sConnectorId = defaults.k8sConnectorId;
    	      this.name = defaults.name;
        }

        @CustomType.Setter
        public Builder clusterEndpoint(String clusterEndpoint) {
            if (clusterEndpoint == null) {
              throw new MissingRequiredPropertyException("GetOrchestratorResult", "clusterEndpoint");
            }
            this.clusterEndpoint = clusterEndpoint;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetOrchestratorResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder k8sConnectorId(@Nullable String k8sConnectorId) {

            this.k8sConnectorId = k8sConnectorId;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetOrchestratorResult", "name");
            }
            this.name = name;
            return this;
        }
        public GetOrchestratorResult build() {
            final var _resultValue = new GetOrchestratorResult();
            _resultValue.clusterEndpoint = clusterEndpoint;
            _resultValue.id = id;
            _resultValue.k8sConnectorId = k8sConnectorId;
            _resultValue.name = name;
            return _resultValue;
        }
    }
}
