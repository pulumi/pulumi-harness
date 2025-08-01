// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.harness.platform.outputs.GitopsApplicationsetApplicationsetSpecGeneratorScmProviderGithubTokenRef;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GitopsApplicationsetApplicationsetSpecGeneratorScmProviderGithub {
    /**
     * @return If true, scan every branch of every repository. If false, scan only the default branch.
     * 
     */
    private @Nullable Boolean allBranches;
    /**
     * @return The GitHub API URL to talk to. Default https://api.github.com/.
     * 
     */
    private @Nullable String api;
    /**
     * @return Reference to a GitHub App repo-creds secret. Uses a GitHub App to access the API instead of a PAT.
     * 
     */
    private @Nullable String appSecretName;
    /**
     * @return GitHub org to scan.
     * 
     */
    private String organization;
    /**
     * @return Authentication token reference.
     * 
     */
    private @Nullable GitopsApplicationsetApplicationsetSpecGeneratorScmProviderGithubTokenRef tokenRef;

    private GitopsApplicationsetApplicationsetSpecGeneratorScmProviderGithub() {}
    /**
     * @return If true, scan every branch of every repository. If false, scan only the default branch.
     * 
     */
    public Optional<Boolean> allBranches() {
        return Optional.ofNullable(this.allBranches);
    }
    /**
     * @return The GitHub API URL to talk to. Default https://api.github.com/.
     * 
     */
    public Optional<String> api() {
        return Optional.ofNullable(this.api);
    }
    /**
     * @return Reference to a GitHub App repo-creds secret. Uses a GitHub App to access the API instead of a PAT.
     * 
     */
    public Optional<String> appSecretName() {
        return Optional.ofNullable(this.appSecretName);
    }
    /**
     * @return GitHub org to scan.
     * 
     */
    public String organization() {
        return this.organization;
    }
    /**
     * @return Authentication token reference.
     * 
     */
    public Optional<GitopsApplicationsetApplicationsetSpecGeneratorScmProviderGithubTokenRef> tokenRef() {
        return Optional.ofNullable(this.tokenRef);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GitopsApplicationsetApplicationsetSpecGeneratorScmProviderGithub defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean allBranches;
        private @Nullable String api;
        private @Nullable String appSecretName;
        private String organization;
        private @Nullable GitopsApplicationsetApplicationsetSpecGeneratorScmProviderGithubTokenRef tokenRef;
        public Builder() {}
        public Builder(GitopsApplicationsetApplicationsetSpecGeneratorScmProviderGithub defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allBranches = defaults.allBranches;
    	      this.api = defaults.api;
    	      this.appSecretName = defaults.appSecretName;
    	      this.organization = defaults.organization;
    	      this.tokenRef = defaults.tokenRef;
        }

        @CustomType.Setter
        public Builder allBranches(@Nullable Boolean allBranches) {

            this.allBranches = allBranches;
            return this;
        }
        @CustomType.Setter
        public Builder api(@Nullable String api) {

            this.api = api;
            return this;
        }
        @CustomType.Setter
        public Builder appSecretName(@Nullable String appSecretName) {

            this.appSecretName = appSecretName;
            return this;
        }
        @CustomType.Setter
        public Builder organization(String organization) {
            if (organization == null) {
              throw new MissingRequiredPropertyException("GitopsApplicationsetApplicationsetSpecGeneratorScmProviderGithub", "organization");
            }
            this.organization = organization;
            return this;
        }
        @CustomType.Setter
        public Builder tokenRef(@Nullable GitopsApplicationsetApplicationsetSpecGeneratorScmProviderGithubTokenRef tokenRef) {

            this.tokenRef = tokenRef;
            return this;
        }
        public GitopsApplicationsetApplicationsetSpecGeneratorScmProviderGithub build() {
            final var _resultValue = new GitopsApplicationsetApplicationsetSpecGeneratorScmProviderGithub();
            _resultValue.allBranches = allBranches;
            _resultValue.api = api;
            _resultValue.appSecretName = appSecretName;
            _resultValue.organization = organization;
            _resultValue.tokenRef = tokenRef;
            return _resultValue;
        }
    }
}
