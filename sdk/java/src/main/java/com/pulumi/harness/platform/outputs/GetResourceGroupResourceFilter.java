// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.harness.platform.outputs.GetResourceGroupResourceFilterResource;
import java.lang.Boolean;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetResourceGroupResourceFilter {
    /**
     * @return Include all resource or not
     * 
     */
    private Boolean includeAllResources;
    /**
     * @return Resources for a resource group
     * 
     */
    private List<GetResourceGroupResourceFilterResource> resources;

    private GetResourceGroupResourceFilter() {}
    /**
     * @return Include all resource or not
     * 
     */
    public Boolean includeAllResources() {
        return this.includeAllResources;
    }
    /**
     * @return Resources for a resource group
     * 
     */
    public List<GetResourceGroupResourceFilterResource> resources() {
        return this.resources;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetResourceGroupResourceFilter defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Boolean includeAllResources;
        private List<GetResourceGroupResourceFilterResource> resources;
        public Builder() {}
        public Builder(GetResourceGroupResourceFilter defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.includeAllResources = defaults.includeAllResources;
    	      this.resources = defaults.resources;
        }

        @CustomType.Setter
        public Builder includeAllResources(Boolean includeAllResources) {
            if (includeAllResources == null) {
              throw new MissingRequiredPropertyException("GetResourceGroupResourceFilter", "includeAllResources");
            }
            this.includeAllResources = includeAllResources;
            return this;
        }
        @CustomType.Setter
        public Builder resources(List<GetResourceGroupResourceFilterResource> resources) {
            if (resources == null) {
              throw new MissingRequiredPropertyException("GetResourceGroupResourceFilter", "resources");
            }
            this.resources = resources;
            return this;
        }
        public Builder resources(GetResourceGroupResourceFilterResource... resources) {
            return resources(List.of(resources));
        }
        public GetResourceGroupResourceFilter build() {
            final var _resultValue = new GetResourceGroupResourceFilter();
            _resultValue.includeAllResources = includeAllResources;
            _resultValue.resources = resources;
            return _resultValue;
        }
    }
}