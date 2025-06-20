// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.harness.platform.outputs.GitopsApplicationsetApplicationsetMetadata;
import com.pulumi.harness.platform.outputs.GitopsApplicationsetApplicationsetSpec;
import java.util.Objects;

@CustomType
public final class GitopsApplicationsetApplicationset {
    /**
     * @return Standard Kubernetes object metadata.
     * 
     */
    private GitopsApplicationsetApplicationsetMetadata metadata;
    /**
     * @return Spec of the GitOps applicationset. Includes the generators and template.
     * 
     */
    private GitopsApplicationsetApplicationsetSpec spec;

    private GitopsApplicationsetApplicationset() {}
    /**
     * @return Standard Kubernetes object metadata.
     * 
     */
    public GitopsApplicationsetApplicationsetMetadata metadata() {
        return this.metadata;
    }
    /**
     * @return Spec of the GitOps applicationset. Includes the generators and template.
     * 
     */
    public GitopsApplicationsetApplicationsetSpec spec() {
        return this.spec;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GitopsApplicationsetApplicationset defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private GitopsApplicationsetApplicationsetMetadata metadata;
        private GitopsApplicationsetApplicationsetSpec spec;
        public Builder() {}
        public Builder(GitopsApplicationsetApplicationset defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.metadata = defaults.metadata;
    	      this.spec = defaults.spec;
        }

        @CustomType.Setter
        public Builder metadata(GitopsApplicationsetApplicationsetMetadata metadata) {
            if (metadata == null) {
              throw new MissingRequiredPropertyException("GitopsApplicationsetApplicationset", "metadata");
            }
            this.metadata = metadata;
            return this;
        }
        @CustomType.Setter
        public Builder spec(GitopsApplicationsetApplicationsetSpec spec) {
            if (spec == null) {
              throw new MissingRequiredPropertyException("GitopsApplicationsetApplicationset", "spec");
            }
            this.spec = spec;
            return this;
        }
        public GitopsApplicationsetApplicationset build() {
            final var _resultValue = new GitopsApplicationsetApplicationset();
            _resultValue.metadata = metadata;
            _resultValue.spec = spec;
            return _resultValue;
        }
    }
}
