// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.harness.platform.outputs.GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorPullRequestTemplateMetadata;
import com.pulumi.harness.platform.outputs.GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorPullRequestTemplateSpec;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorPullRequestTemplate {
    /**
     * @return Kubernetes object metadata for templated Application.
     * 
     */
    private @Nullable GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorPullRequestTemplateMetadata metadata;
    /**
     * @return The application specification.
     * 
     */
    private @Nullable GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorPullRequestTemplateSpec spec;

    private GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorPullRequestTemplate() {}
    /**
     * @return Kubernetes object metadata for templated Application.
     * 
     */
    public Optional<GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorPullRequestTemplateMetadata> metadata() {
        return Optional.ofNullable(this.metadata);
    }
    /**
     * @return The application specification.
     * 
     */
    public Optional<GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorPullRequestTemplateSpec> spec() {
        return Optional.ofNullable(this.spec);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorPullRequestTemplate defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorPullRequestTemplateMetadata metadata;
        private @Nullable GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorPullRequestTemplateSpec spec;
        public Builder() {}
        public Builder(GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorPullRequestTemplate defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.metadata = defaults.metadata;
    	      this.spec = defaults.spec;
        }

        @CustomType.Setter
        public Builder metadata(@Nullable GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorPullRequestTemplateMetadata metadata) {

            this.metadata = metadata;
            return this;
        }
        @CustomType.Setter
        public Builder spec(@Nullable GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorPullRequestTemplateSpec spec) {

            this.spec = spec;
            return this;
        }
        public GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorPullRequestTemplate build() {
            final var _resultValue = new GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorPullRequestTemplate();
            _resultValue.metadata = metadata;
            _resultValue.spec = spec;
            return _resultValue;
        }
    }
}
