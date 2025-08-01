// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorGitFile {
    /**
     * @return Path to the file in the repository.
     * 
     */
    private String path;

    private GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorGitFile() {}
    /**
     * @return Path to the file in the repository.
     * 
     */
    public String path() {
        return this.path;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorGitFile defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String path;
        public Builder() {}
        public Builder(GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorGitFile defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.path = defaults.path;
        }

        @CustomType.Setter
        public Builder path(String path) {
            if (path == null) {
              throw new MissingRequiredPropertyException("GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorGitFile", "path");
            }
            this.path = path;
            return this;
        }
        public GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorGitFile build() {
            final var _resultValue = new GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorGitFile();
            _resultValue.path = path;
            return _resultValue;
        }
    }
}
