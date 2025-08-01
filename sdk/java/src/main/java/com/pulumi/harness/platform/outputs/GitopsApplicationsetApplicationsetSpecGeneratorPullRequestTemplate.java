// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.harness.platform.outputs.GitopsApplicationsetApplicationsetSpecGeneratorPullRequestTemplateMetadata;
import com.pulumi.harness.platform.outputs.GitopsApplicationsetApplicationsetSpecGeneratorPullRequestTemplateSpec;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GitopsApplicationsetApplicationsetSpecGeneratorPullRequestTemplate {
    /**
     * @return Kubernetes object metadata for templated Application.
     * 
     */
    private @Nullable GitopsApplicationsetApplicationsetSpecGeneratorPullRequestTemplateMetadata metadata;
    /**
     * @return The application specification.
     * 
     */
    private @Nullable GitopsApplicationsetApplicationsetSpecGeneratorPullRequestTemplateSpec spec;

    private GitopsApplicationsetApplicationsetSpecGeneratorPullRequestTemplate() {}
    /**
     * @return Kubernetes object metadata for templated Application.
     * 
     */
    public Optional<GitopsApplicationsetApplicationsetSpecGeneratorPullRequestTemplateMetadata> metadata() {
        return Optional.ofNullable(this.metadata);
    }
    /**
     * @return The application specification.
     * 
     */
    public Optional<GitopsApplicationsetApplicationsetSpecGeneratorPullRequestTemplateSpec> spec() {
        return Optional.ofNullable(this.spec);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GitopsApplicationsetApplicationsetSpecGeneratorPullRequestTemplate defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable GitopsApplicationsetApplicationsetSpecGeneratorPullRequestTemplateMetadata metadata;
        private @Nullable GitopsApplicationsetApplicationsetSpecGeneratorPullRequestTemplateSpec spec;
        public Builder() {}
        public Builder(GitopsApplicationsetApplicationsetSpecGeneratorPullRequestTemplate defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.metadata = defaults.metadata;
    	      this.spec = defaults.spec;
        }

        @CustomType.Setter
        public Builder metadata(@Nullable GitopsApplicationsetApplicationsetSpecGeneratorPullRequestTemplateMetadata metadata) {

            this.metadata = metadata;
            return this;
        }
        @CustomType.Setter
        public Builder spec(@Nullable GitopsApplicationsetApplicationsetSpecGeneratorPullRequestTemplateSpec spec) {

            this.spec = spec;
            return this;
        }
        public GitopsApplicationsetApplicationsetSpecGeneratorPullRequestTemplate build() {
            final var _resultValue = new GitopsApplicationsetApplicationsetSpecGeneratorPullRequestTemplate();
            _resultValue.metadata = metadata;
            _resultValue.spec = spec;
            return _resultValue;
        }
    }
}
