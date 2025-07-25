// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.harness.platform.outputs.GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMergeGeneratorClusterSelector;
import com.pulumi.harness.platform.outputs.GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMergeGeneratorClusterTemplate;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMergeGeneratorCluster {
    /**
     * @return Boolean value defaulting to `true` to indicate that this block has been added thereby allowing all other attributes to be optional.
     * 
     */
    private Boolean enabled;
    /**
     * @return Label selector used to narrow the scope of targeted clusters.
     * 
     */
    private @Nullable GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMergeGeneratorClusterSelector selector;
    /**
     * @return Generator template. Used to override the values of the spec-level template.
     * 
     */
    private @Nullable GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMergeGeneratorClusterTemplate template;
    /**
     * @return Arbitrary string key-value pairs to pass to the template via the values field of the cluster generator.
     * 
     */
    private @Nullable Map<String,String> values;

    private GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMergeGeneratorCluster() {}
    /**
     * @return Boolean value defaulting to `true` to indicate that this block has been added thereby allowing all other attributes to be optional.
     * 
     */
    public Boolean enabled() {
        return this.enabled;
    }
    /**
     * @return Label selector used to narrow the scope of targeted clusters.
     * 
     */
    public Optional<GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMergeGeneratorClusterSelector> selector() {
        return Optional.ofNullable(this.selector);
    }
    /**
     * @return Generator template. Used to override the values of the spec-level template.
     * 
     */
    public Optional<GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMergeGeneratorClusterTemplate> template() {
        return Optional.ofNullable(this.template);
    }
    /**
     * @return Arbitrary string key-value pairs to pass to the template via the values field of the cluster generator.
     * 
     */
    public Map<String,String> values() {
        return this.values == null ? Map.of() : this.values;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMergeGeneratorCluster defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Boolean enabled;
        private @Nullable GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMergeGeneratorClusterSelector selector;
        private @Nullable GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMergeGeneratorClusterTemplate template;
        private @Nullable Map<String,String> values;
        public Builder() {}
        public Builder(GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMergeGeneratorCluster defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.selector = defaults.selector;
    	      this.template = defaults.template;
    	      this.values = defaults.values;
        }

        @CustomType.Setter
        public Builder enabled(Boolean enabled) {
            if (enabled == null) {
              throw new MissingRequiredPropertyException("GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMergeGeneratorCluster", "enabled");
            }
            this.enabled = enabled;
            return this;
        }
        @CustomType.Setter
        public Builder selector(@Nullable GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMergeGeneratorClusterSelector selector) {

            this.selector = selector;
            return this;
        }
        @CustomType.Setter
        public Builder template(@Nullable GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMergeGeneratorClusterTemplate template) {

            this.template = template;
            return this;
        }
        @CustomType.Setter
        public Builder values(@Nullable Map<String,String> values) {

            this.values = values;
            return this;
        }
        public GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMergeGeneratorCluster build() {
            final var _resultValue = new GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMergeGeneratorCluster();
            _resultValue.enabled = enabled;
            _resultValue.selector = selector;
            _resultValue.template = template;
            _resultValue.values = values;
            return _resultValue;
        }
    }
}
