// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class TemplateFiltersFilterProperties {
    /**
     * @return Corresponding Entity of the filters. Currently supported types are {TemplateSetup, TemplateExecution, Template}.
     * 
     */
    private String filterType;
    /**
     * @return Tags to associate with the resource. Tags should be in the form `name:value`.
     * 
     */
    private @Nullable List<String> tags;

    private TemplateFiltersFilterProperties() {}
    /**
     * @return Corresponding Entity of the filters. Currently supported types are {TemplateSetup, TemplateExecution, Template}.
     * 
     */
    public String filterType() {
        return this.filterType;
    }
    /**
     * @return Tags to associate with the resource. Tags should be in the form `name:value`.
     * 
     */
    public List<String> tags() {
        return this.tags == null ? List.of() : this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TemplateFiltersFilterProperties defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String filterType;
        private @Nullable List<String> tags;
        public Builder() {}
        public Builder(TemplateFiltersFilterProperties defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.filterType = defaults.filterType;
    	      this.tags = defaults.tags;
        }

        @CustomType.Setter
        public Builder filterType(String filterType) {
            if (filterType == null) {
              throw new MissingRequiredPropertyException("TemplateFiltersFilterProperties", "filterType");
            }
            this.filterType = filterType;
            return this;
        }
        @CustomType.Setter
        public Builder tags(@Nullable List<String> tags) {

            this.tags = tags;
            return this;
        }
        public Builder tags(String... tags) {
            return tags(List.of(tags));
        }
        public TemplateFiltersFilterProperties build() {
            final var _resultValue = new TemplateFiltersFilterProperties();
            _resultValue.filterType = filterType;
            _resultValue.tags = tags;
            return _resultValue;
        }
    }
}