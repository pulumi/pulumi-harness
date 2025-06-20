// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.harness.platform.outputs.GitopsApplicationsetApplicationsetSpecGeneratorPullRequestBitbucketServerBasicAuth;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GitopsApplicationsetApplicationsetSpecGeneratorPullRequestBitbucketServer {
    /**
     * @return The Bitbucket REST API URL to talk to e.g. https://bitbucket.org/rest.
     * 
     */
    private String api;
    /**
     * @return Credentials for Basic auth.
     * 
     */
    private @Nullable GitopsApplicationsetApplicationsetSpecGeneratorPullRequestBitbucketServerBasicAuth basicAuth;
    /**
     * @return Project to scan.
     * 
     */
    private String project;
    /**
     * @return Repo name to scan.
     * 
     */
    private String repo;

    private GitopsApplicationsetApplicationsetSpecGeneratorPullRequestBitbucketServer() {}
    /**
     * @return The Bitbucket REST API URL to talk to e.g. https://bitbucket.org/rest.
     * 
     */
    public String api() {
        return this.api;
    }
    /**
     * @return Credentials for Basic auth.
     * 
     */
    public Optional<GitopsApplicationsetApplicationsetSpecGeneratorPullRequestBitbucketServerBasicAuth> basicAuth() {
        return Optional.ofNullable(this.basicAuth);
    }
    /**
     * @return Project to scan.
     * 
     */
    public String project() {
        return this.project;
    }
    /**
     * @return Repo name to scan.
     * 
     */
    public String repo() {
        return this.repo;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GitopsApplicationsetApplicationsetSpecGeneratorPullRequestBitbucketServer defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String api;
        private @Nullable GitopsApplicationsetApplicationsetSpecGeneratorPullRequestBitbucketServerBasicAuth basicAuth;
        private String project;
        private String repo;
        public Builder() {}
        public Builder(GitopsApplicationsetApplicationsetSpecGeneratorPullRequestBitbucketServer defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.api = defaults.api;
    	      this.basicAuth = defaults.basicAuth;
    	      this.project = defaults.project;
    	      this.repo = defaults.repo;
        }

        @CustomType.Setter
        public Builder api(String api) {
            if (api == null) {
              throw new MissingRequiredPropertyException("GitopsApplicationsetApplicationsetSpecGeneratorPullRequestBitbucketServer", "api");
            }
            this.api = api;
            return this;
        }
        @CustomType.Setter
        public Builder basicAuth(@Nullable GitopsApplicationsetApplicationsetSpecGeneratorPullRequestBitbucketServerBasicAuth basicAuth) {

            this.basicAuth = basicAuth;
            return this;
        }
        @CustomType.Setter
        public Builder project(String project) {
            if (project == null) {
              throw new MissingRequiredPropertyException("GitopsApplicationsetApplicationsetSpecGeneratorPullRequestBitbucketServer", "project");
            }
            this.project = project;
            return this;
        }
        @CustomType.Setter
        public Builder repo(String repo) {
            if (repo == null) {
              throw new MissingRequiredPropertyException("GitopsApplicationsetApplicationsetSpecGeneratorPullRequestBitbucketServer", "repo");
            }
            this.repo = repo;
            return this;
        }
        public GitopsApplicationsetApplicationsetSpecGeneratorPullRequestBitbucketServer build() {
            final var _resultValue = new GitopsApplicationsetApplicationsetSpecGeneratorPullRequestBitbucketServer();
            _resultValue.api = api;
            _resultValue.basicAuth = basicAuth;
            _resultValue.project = project;
            _resultValue.repo = repo;
            return _resultValue;
        }
    }
}
