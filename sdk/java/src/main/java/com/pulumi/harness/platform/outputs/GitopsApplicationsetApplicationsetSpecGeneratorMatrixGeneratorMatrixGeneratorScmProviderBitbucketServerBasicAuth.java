// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.harness.platform.outputs.GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMatrixGeneratorScmProviderBitbucketServerBasicAuthPasswordRef;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMatrixGeneratorScmProviderBitbucketServerBasicAuth {
    /**
     * @return Password (or personal access token) reference.
     * 
     */
    private @Nullable GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMatrixGeneratorScmProviderBitbucketServerBasicAuthPasswordRef passwordRef;
    /**
     * @return Username for Basic auth.
     * 
     */
    private @Nullable String username;

    private GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMatrixGeneratorScmProviderBitbucketServerBasicAuth() {}
    /**
     * @return Password (or personal access token) reference.
     * 
     */
    public Optional<GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMatrixGeneratorScmProviderBitbucketServerBasicAuthPasswordRef> passwordRef() {
        return Optional.ofNullable(this.passwordRef);
    }
    /**
     * @return Username for Basic auth.
     * 
     */
    public Optional<String> username() {
        return Optional.ofNullable(this.username);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMatrixGeneratorScmProviderBitbucketServerBasicAuth defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMatrixGeneratorScmProviderBitbucketServerBasicAuthPasswordRef passwordRef;
        private @Nullable String username;
        public Builder() {}
        public Builder(GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMatrixGeneratorScmProviderBitbucketServerBasicAuth defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.passwordRef = defaults.passwordRef;
    	      this.username = defaults.username;
        }

        @CustomType.Setter
        public Builder passwordRef(@Nullable GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMatrixGeneratorScmProviderBitbucketServerBasicAuthPasswordRef passwordRef) {

            this.passwordRef = passwordRef;
            return this;
        }
        @CustomType.Setter
        public Builder username(@Nullable String username) {

            this.username = username;
            return this;
        }
        public GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMatrixGeneratorScmProviderBitbucketServerBasicAuth build() {
            final var _resultValue = new GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMatrixGeneratorScmProviderBitbucketServerBasicAuth();
            _resultValue.passwordRef = passwordRef;
            _resultValue.username = username;
            return _resultValue;
        }
    }
}
