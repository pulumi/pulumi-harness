// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.harness.platform.outputs.GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorScmProviderGitlabTokenRef;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorScmProviderGitlab {
    /**
     * @return If true, scan every branch of every repository. If false, scan only the default branch.
     * 
     */
    private @Nullable Boolean allBranches;
    /**
     * @return The Gitlab API URL to talk to.
     * 
     */
    private @Nullable String api;
    /**
     * @return Gitlab group to scan. You can use either the project id (recommended) or the full namespaced path.
     * 
     */
    private String group;
    /**
     * @return Recurse through subgroups (true) or scan only the base group (false). Defaults to `false`.
     * 
     */
    private @Nullable Boolean includeSubgroups;
    /**
     * @return Authentication token reference.
     * 
     */
    private @Nullable GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorScmProviderGitlabTokenRef tokenRef;

    private GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorScmProviderGitlab() {}
    /**
     * @return If true, scan every branch of every repository. If false, scan only the default branch.
     * 
     */
    public Optional<Boolean> allBranches() {
        return Optional.ofNullable(this.allBranches);
    }
    /**
     * @return The Gitlab API URL to talk to.
     * 
     */
    public Optional<String> api() {
        return Optional.ofNullable(this.api);
    }
    /**
     * @return Gitlab group to scan. You can use either the project id (recommended) or the full namespaced path.
     * 
     */
    public String group() {
        return this.group;
    }
    /**
     * @return Recurse through subgroups (true) or scan only the base group (false). Defaults to `false`.
     * 
     */
    public Optional<Boolean> includeSubgroups() {
        return Optional.ofNullable(this.includeSubgroups);
    }
    /**
     * @return Authentication token reference.
     * 
     */
    public Optional<GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorScmProviderGitlabTokenRef> tokenRef() {
        return Optional.ofNullable(this.tokenRef);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorScmProviderGitlab defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean allBranches;
        private @Nullable String api;
        private String group;
        private @Nullable Boolean includeSubgroups;
        private @Nullable GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorScmProviderGitlabTokenRef tokenRef;
        public Builder() {}
        public Builder(GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorScmProviderGitlab defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allBranches = defaults.allBranches;
    	      this.api = defaults.api;
    	      this.group = defaults.group;
    	      this.includeSubgroups = defaults.includeSubgroups;
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
        public Builder group(String group) {
            if (group == null) {
              throw new MissingRequiredPropertyException("GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorScmProviderGitlab", "group");
            }
            this.group = group;
            return this;
        }
        @CustomType.Setter
        public Builder includeSubgroups(@Nullable Boolean includeSubgroups) {

            this.includeSubgroups = includeSubgroups;
            return this;
        }
        @CustomType.Setter
        public Builder tokenRef(@Nullable GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorScmProviderGitlabTokenRef tokenRef) {

            this.tokenRef = tokenRef;
            return this;
        }
        public GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorScmProviderGitlab build() {
            final var _resultValue = new GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorScmProviderGitlab();
            _resultValue.allBranches = allBranches;
            _resultValue.api = api;
            _resultValue.group = group;
            _resultValue.includeSubgroups = includeSubgroups;
            _resultValue.tokenRef = tokenRef;
            return _resultValue;
        }
    }
}
