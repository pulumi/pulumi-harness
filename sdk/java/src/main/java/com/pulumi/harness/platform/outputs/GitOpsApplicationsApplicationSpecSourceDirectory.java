// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.harness.platform.outputs.GitOpsApplicationsApplicationSpecSourceDirectoryJsonnet;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GitOpsApplicationsApplicationSpecSourceDirectory {
    /**
     * @return Glob pattern to match paths against that should be explicitly excluded from being used during manifest generation.
     * 
     */
    private @Nullable String exclude;
    /**
     * @return Glob pattern to match paths against that should be explicitly included during manifest generation.
     * 
     */
    private @Nullable String include;
    /**
     * @return Options specific to applications of type Jsonnet.
     * 
     */
    private @Nullable List<GitOpsApplicationsApplicationSpecSourceDirectoryJsonnet> jsonnets;
    /**
     * @return Indicates to scan a directory recursively for manifests.
     * 
     */
    private @Nullable Boolean recurse;

    private GitOpsApplicationsApplicationSpecSourceDirectory() {}
    /**
     * @return Glob pattern to match paths against that should be explicitly excluded from being used during manifest generation.
     * 
     */
    public Optional<String> exclude() {
        return Optional.ofNullable(this.exclude);
    }
    /**
     * @return Glob pattern to match paths against that should be explicitly included during manifest generation.
     * 
     */
    public Optional<String> include() {
        return Optional.ofNullable(this.include);
    }
    /**
     * @return Options specific to applications of type Jsonnet.
     * 
     */
    public List<GitOpsApplicationsApplicationSpecSourceDirectoryJsonnet> jsonnets() {
        return this.jsonnets == null ? List.of() : this.jsonnets;
    }
    /**
     * @return Indicates to scan a directory recursively for manifests.
     * 
     */
    public Optional<Boolean> recurse() {
        return Optional.ofNullable(this.recurse);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GitOpsApplicationsApplicationSpecSourceDirectory defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String exclude;
        private @Nullable String include;
        private @Nullable List<GitOpsApplicationsApplicationSpecSourceDirectoryJsonnet> jsonnets;
        private @Nullable Boolean recurse;
        public Builder() {}
        public Builder(GitOpsApplicationsApplicationSpecSourceDirectory defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.exclude = defaults.exclude;
    	      this.include = defaults.include;
    	      this.jsonnets = defaults.jsonnets;
    	      this.recurse = defaults.recurse;
        }

        @CustomType.Setter
        public Builder exclude(@Nullable String exclude) {

            this.exclude = exclude;
            return this;
        }
        @CustomType.Setter
        public Builder include(@Nullable String include) {

            this.include = include;
            return this;
        }
        @CustomType.Setter
        public Builder jsonnets(@Nullable List<GitOpsApplicationsApplicationSpecSourceDirectoryJsonnet> jsonnets) {

            this.jsonnets = jsonnets;
            return this;
        }
        public Builder jsonnets(GitOpsApplicationsApplicationSpecSourceDirectoryJsonnet... jsonnets) {
            return jsonnets(List.of(jsonnets));
        }
        @CustomType.Setter
        public Builder recurse(@Nullable Boolean recurse) {

            this.recurse = recurse;
            return this;
        }
        public GitOpsApplicationsApplicationSpecSourceDirectory build() {
            final var _resultValue = new GitOpsApplicationsApplicationSpecSourceDirectory();
            _resultValue.exclude = exclude;
            _resultValue.include = include;
            _resultValue.jsonnets = jsonnets;
            _resultValue.recurse = recurse;
            return _resultValue;
        }
    }
}
