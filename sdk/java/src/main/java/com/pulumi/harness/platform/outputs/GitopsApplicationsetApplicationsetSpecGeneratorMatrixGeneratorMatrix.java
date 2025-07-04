// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.harness.platform.outputs.GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMatrixGenerator;
import com.pulumi.harness.platform.outputs.GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMatrixTemplate;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMatrix {
    /**
     * @return Child generator. Generators are responsible for generating parameters, which are then combined by the parent matrix generator into the template fields of the ApplicationSet resource.
     * 
     */
    private List<GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMatrixGenerator> generators;
    /**
     * @return Generator template. Used to override the values of the spec-level template.
     * 
     */
    private @Nullable GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMatrixTemplate template;

    private GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMatrix() {}
    /**
     * @return Child generator. Generators are responsible for generating parameters, which are then combined by the parent matrix generator into the template fields of the ApplicationSet resource.
     * 
     */
    public List<GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMatrixGenerator> generators() {
        return this.generators;
    }
    /**
     * @return Generator template. Used to override the values of the spec-level template.
     * 
     */
    public Optional<GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMatrixTemplate> template() {
        return Optional.ofNullable(this.template);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMatrix defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMatrixGenerator> generators;
        private @Nullable GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMatrixTemplate template;
        public Builder() {}
        public Builder(GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMatrix defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.generators = defaults.generators;
    	      this.template = defaults.template;
        }

        @CustomType.Setter
        public Builder generators(List<GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMatrixGenerator> generators) {
            if (generators == null) {
              throw new MissingRequiredPropertyException("GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMatrix", "generators");
            }
            this.generators = generators;
            return this;
        }
        public Builder generators(GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMatrixGenerator... generators) {
            return generators(List.of(generators));
        }
        @CustomType.Setter
        public Builder template(@Nullable GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMatrixTemplate template) {

            this.template = template;
            return this;
        }
        public GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMatrix build() {
            final var _resultValue = new GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMatrix();
            _resultValue.generators = generators;
            _resultValue.template = template;
            return _resultValue;
        }
    }
}
