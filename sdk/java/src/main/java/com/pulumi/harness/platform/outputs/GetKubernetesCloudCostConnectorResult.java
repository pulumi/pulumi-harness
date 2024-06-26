// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetKubernetesCloudCostConnectorResult {
    /**
     * @return Reference of the Connector.
     * 
     */
    private String connectorRef;
    /**
     * @return Description of the resource.
     * 
     */
    private String description;
    /**
     * @return Indicates which feature to enable among Billing, Optimization, and Visibility.
     * 
     */
    private List<String> featuresEnableds;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return Unique identifier of the resource.
     * 
     */
    private String identifier;
    /**
     * @return Name of the resource.
     * 
     */
    private @Nullable String name;
    /**
     * @return Unique identifier of the organization.
     * 
     */
    private @Nullable String orgId;
    /**
     * @return Unique identifier of the project.
     * 
     */
    private @Nullable String projectId;
    /**
     * @return Tags to associate with the resource.
     * 
     */
    private List<String> tags;

    private GetKubernetesCloudCostConnectorResult() {}
    /**
     * @return Reference of the Connector.
     * 
     */
    public String connectorRef() {
        return this.connectorRef;
    }
    /**
     * @return Description of the resource.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return Indicates which feature to enable among Billing, Optimization, and Visibility.
     * 
     */
    public List<String> featuresEnableds() {
        return this.featuresEnableds;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Unique identifier of the resource.
     * 
     */
    public String identifier() {
        return this.identifier;
    }
    /**
     * @return Name of the resource.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    /**
     * @return Unique identifier of the organization.
     * 
     */
    public Optional<String> orgId() {
        return Optional.ofNullable(this.orgId);
    }
    /**
     * @return Unique identifier of the project.
     * 
     */
    public Optional<String> projectId() {
        return Optional.ofNullable(this.projectId);
    }
    /**
     * @return Tags to associate with the resource.
     * 
     */
    public List<String> tags() {
        return this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetKubernetesCloudCostConnectorResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String connectorRef;
        private String description;
        private List<String> featuresEnableds;
        private String id;
        private String identifier;
        private @Nullable String name;
        private @Nullable String orgId;
        private @Nullable String projectId;
        private List<String> tags;
        public Builder() {}
        public Builder(GetKubernetesCloudCostConnectorResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.connectorRef = defaults.connectorRef;
    	      this.description = defaults.description;
    	      this.featuresEnableds = defaults.featuresEnableds;
    	      this.id = defaults.id;
    	      this.identifier = defaults.identifier;
    	      this.name = defaults.name;
    	      this.orgId = defaults.orgId;
    	      this.projectId = defaults.projectId;
    	      this.tags = defaults.tags;
        }

        @CustomType.Setter
        public Builder connectorRef(String connectorRef) {
            if (connectorRef == null) {
              throw new MissingRequiredPropertyException("GetKubernetesCloudCostConnectorResult", "connectorRef");
            }
            this.connectorRef = connectorRef;
            return this;
        }
        @CustomType.Setter
        public Builder description(String description) {
            if (description == null) {
              throw new MissingRequiredPropertyException("GetKubernetesCloudCostConnectorResult", "description");
            }
            this.description = description;
            return this;
        }
        @CustomType.Setter
        public Builder featuresEnableds(List<String> featuresEnableds) {
            if (featuresEnableds == null) {
              throw new MissingRequiredPropertyException("GetKubernetesCloudCostConnectorResult", "featuresEnableds");
            }
            this.featuresEnableds = featuresEnableds;
            return this;
        }
        public Builder featuresEnableds(String... featuresEnableds) {
            return featuresEnableds(List.of(featuresEnableds));
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetKubernetesCloudCostConnectorResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder identifier(String identifier) {
            if (identifier == null) {
              throw new MissingRequiredPropertyException("GetKubernetesCloudCostConnectorResult", "identifier");
            }
            this.identifier = identifier;
            return this;
        }
        @CustomType.Setter
        public Builder name(@Nullable String name) {

            this.name = name;
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
        public Builder tags(List<String> tags) {
            if (tags == null) {
              throw new MissingRequiredPropertyException("GetKubernetesCloudCostConnectorResult", "tags");
            }
            this.tags = tags;
            return this;
        }
        public Builder tags(String... tags) {
            return tags(List.of(tags));
        }
        public GetKubernetesCloudCostConnectorResult build() {
            final var _resultValue = new GetKubernetesCloudCostConnectorResult();
            _resultValue.connectorRef = connectorRef;
            _resultValue.description = description;
            _resultValue.featuresEnableds = featuresEnableds;
            _resultValue.id = id;
            _resultValue.identifier = identifier;
            _resultValue.name = name;
            _resultValue.orgId = orgId;
            _resultValue.projectId = projectId;
            _resultValue.tags = tags;
            return _resultValue;
        }
    }
}
