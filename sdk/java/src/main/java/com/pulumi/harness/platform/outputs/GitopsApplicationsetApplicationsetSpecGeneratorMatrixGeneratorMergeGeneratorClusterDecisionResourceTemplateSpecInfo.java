// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMergeGeneratorClusterDecisionResourceTemplateSpecInfo {
    /**
     * @return Name of the information.
     * 
     */
    private @Nullable String name;
    /**
     * @return Value of the information.
     * 
     */
    private @Nullable String value;

    private GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMergeGeneratorClusterDecisionResourceTemplateSpecInfo() {}
    /**
     * @return Name of the information.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    /**
     * @return Value of the information.
     * 
     */
    public Optional<String> value() {
        return Optional.ofNullable(this.value);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMergeGeneratorClusterDecisionResourceTemplateSpecInfo defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String name;
        private @Nullable String value;
        public Builder() {}
        public Builder(GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMergeGeneratorClusterDecisionResourceTemplateSpecInfo defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.value = defaults.value;
        }

        @CustomType.Setter
        public Builder name(@Nullable String name) {

            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder value(@Nullable String value) {

            this.value = value;
            return this;
        }
        public GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMergeGeneratorClusterDecisionResourceTemplateSpecInfo build() {
            final var _resultValue = new GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMergeGeneratorClusterDecisionResourceTemplateSpecInfo();
            _resultValue.name = name;
            _resultValue.value = value;
            return _resultValue;
        }
    }
}
