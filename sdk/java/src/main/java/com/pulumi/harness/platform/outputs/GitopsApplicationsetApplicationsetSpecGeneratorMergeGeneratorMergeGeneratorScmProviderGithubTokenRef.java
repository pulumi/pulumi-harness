// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMergeGeneratorScmProviderGithubTokenRef {
    /**
     * @return Key containing information in Kubernetes `Secret`.
     * 
     */
    private String key;
    /**
     * @return Name of Kubernetes `Secret`.
     * 
     */
    private String secretName;

    private GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMergeGeneratorScmProviderGithubTokenRef() {}
    /**
     * @return Key containing information in Kubernetes `Secret`.
     * 
     */
    public String key() {
        return this.key;
    }
    /**
     * @return Name of Kubernetes `Secret`.
     * 
     */
    public String secretName() {
        return this.secretName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMergeGeneratorScmProviderGithubTokenRef defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String key;
        private String secretName;
        public Builder() {}
        public Builder(GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMergeGeneratorScmProviderGithubTokenRef defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.key = defaults.key;
    	      this.secretName = defaults.secretName;
        }

        @CustomType.Setter
        public Builder key(String key) {
            if (key == null) {
              throw new MissingRequiredPropertyException("GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMergeGeneratorScmProviderGithubTokenRef", "key");
            }
            this.key = key;
            return this;
        }
        @CustomType.Setter
        public Builder secretName(String secretName) {
            if (secretName == null) {
              throw new MissingRequiredPropertyException("GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMergeGeneratorScmProviderGithubTokenRef", "secretName");
            }
            this.secretName = secretName;
            return this;
        }
        public GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMergeGeneratorScmProviderGithubTokenRef build() {
            final var _resultValue = new GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMergeGeneratorScmProviderGithubTokenRef();
            _resultValue.key = key;
            _resultValue.secretName = secretName;
            return _resultValue;
        }
    }
}
