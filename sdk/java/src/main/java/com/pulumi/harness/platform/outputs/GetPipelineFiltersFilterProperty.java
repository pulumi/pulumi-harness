// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.harness.platform.outputs.GetPipelineFiltersFilterPropertyModuleProperties;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetPipelineFiltersFilterProperty {
    /**
     * @return description of the pipline filter.
     * 
     */
    private String description;
    /**
     * @return Corresponding Entity of the filters. Currently supported types are {Connector, DelegateProfile, Delegate, PipelineSetup, PipelineExecution, Deployment, Audit, Template, EnvironmentGroup, FileStore, CCMRecommendation, Anomaly, Environment}.
     * 
     */
    private String filterType;
    /**
     * @return module properties of the pipline filter.
     * 
     */
    private GetPipelineFiltersFilterPropertyModuleProperties moduleProperties;
    /**
     * @return Name of the pipeline filter.
     * 
     */
    private String name;
    /**
     * @return Pipeline identifiers to filter on.
     * 
     */
    private List<String> pipelineIdentifiers;
    /**
     * @return Tags to associate with the pipeline. tags should be in the form of `{key:key1, value:key1value}`
     * 
     */
    private List<Map<String,String>> pipelineTags;
    /**
     * @return Tags to associate with the resource. Tags should be in the form `name:value`.
     * 
     */
    private List<String> tags;

    private GetPipelineFiltersFilterProperty() {}
    /**
     * @return description of the pipline filter.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return Corresponding Entity of the filters. Currently supported types are {Connector, DelegateProfile, Delegate, PipelineSetup, PipelineExecution, Deployment, Audit, Template, EnvironmentGroup, FileStore, CCMRecommendation, Anomaly, Environment}.
     * 
     */
    public String filterType() {
        return this.filterType;
    }
    /**
     * @return module properties of the pipline filter.
     * 
     */
    public GetPipelineFiltersFilterPropertyModuleProperties moduleProperties() {
        return this.moduleProperties;
    }
    /**
     * @return Name of the pipeline filter.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Pipeline identifiers to filter on.
     * 
     */
    public List<String> pipelineIdentifiers() {
        return this.pipelineIdentifiers;
    }
    /**
     * @return Tags to associate with the pipeline. tags should be in the form of `{key:key1, value:key1value}`
     * 
     */
    public List<Map<String,String>> pipelineTags() {
        return this.pipelineTags;
    }
    /**
     * @return Tags to associate with the resource. Tags should be in the form `name:value`.
     * 
     */
    public List<String> tags() {
        return this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPipelineFiltersFilterProperty defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String description;
        private String filterType;
        private GetPipelineFiltersFilterPropertyModuleProperties moduleProperties;
        private String name;
        private List<String> pipelineIdentifiers;
        private List<Map<String,String>> pipelineTags;
        private List<String> tags;
        public Builder() {}
        public Builder(GetPipelineFiltersFilterProperty defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.filterType = defaults.filterType;
    	      this.moduleProperties = defaults.moduleProperties;
    	      this.name = defaults.name;
    	      this.pipelineIdentifiers = defaults.pipelineIdentifiers;
    	      this.pipelineTags = defaults.pipelineTags;
    	      this.tags = defaults.tags;
        }

        @CustomType.Setter
        public Builder description(String description) {
            if (description == null) {
              throw new MissingRequiredPropertyException("GetPipelineFiltersFilterProperty", "description");
            }
            this.description = description;
            return this;
        }
        @CustomType.Setter
        public Builder filterType(String filterType) {
            if (filterType == null) {
              throw new MissingRequiredPropertyException("GetPipelineFiltersFilterProperty", "filterType");
            }
            this.filterType = filterType;
            return this;
        }
        @CustomType.Setter
        public Builder moduleProperties(GetPipelineFiltersFilterPropertyModuleProperties moduleProperties) {
            if (moduleProperties == null) {
              throw new MissingRequiredPropertyException("GetPipelineFiltersFilterProperty", "moduleProperties");
            }
            this.moduleProperties = moduleProperties;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetPipelineFiltersFilterProperty", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder pipelineIdentifiers(List<String> pipelineIdentifiers) {
            if (pipelineIdentifiers == null) {
              throw new MissingRequiredPropertyException("GetPipelineFiltersFilterProperty", "pipelineIdentifiers");
            }
            this.pipelineIdentifiers = pipelineIdentifiers;
            return this;
        }
        public Builder pipelineIdentifiers(String... pipelineIdentifiers) {
            return pipelineIdentifiers(List.of(pipelineIdentifiers));
        }
        @CustomType.Setter
        public Builder pipelineTags(List<Map<String,String>> pipelineTags) {
            if (pipelineTags == null) {
              throw new MissingRequiredPropertyException("GetPipelineFiltersFilterProperty", "pipelineTags");
            }
            this.pipelineTags = pipelineTags;
            return this;
        }
        @CustomType.Setter
        public Builder tags(List<String> tags) {
            if (tags == null) {
              throw new MissingRequiredPropertyException("GetPipelineFiltersFilterProperty", "tags");
            }
            this.tags = tags;
            return this;
        }
        public Builder tags(String... tags) {
            return tags(List.of(tags));
        }
        public GetPipelineFiltersFilterProperty build() {
            final var _resultValue = new GetPipelineFiltersFilterProperty();
            _resultValue.description = description;
            _resultValue.filterType = filterType;
            _resultValue.moduleProperties = moduleProperties;
            _resultValue.name = name;
            _resultValue.pipelineIdentifiers = pipelineIdentifiers;
            _resultValue.pipelineTags = pipelineTags;
            _resultValue.tags = tags;
            return _resultValue;
        }
    }
}
