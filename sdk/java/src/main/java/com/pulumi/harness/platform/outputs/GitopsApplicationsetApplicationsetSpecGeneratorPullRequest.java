// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.harness.platform.outputs.GitopsApplicationsetApplicationsetSpecGeneratorPullRequestBitbucketServer;
import com.pulumi.harness.platform.outputs.GitopsApplicationsetApplicationsetSpecGeneratorPullRequestFilter;
import com.pulumi.harness.platform.outputs.GitopsApplicationsetApplicationsetSpecGeneratorPullRequestGitea;
import com.pulumi.harness.platform.outputs.GitopsApplicationsetApplicationsetSpecGeneratorPullRequestGithub;
import com.pulumi.harness.platform.outputs.GitopsApplicationsetApplicationsetSpecGeneratorPullRequestGitlab;
import com.pulumi.harness.platform.outputs.GitopsApplicationsetApplicationsetSpecGeneratorPullRequestTemplate;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GitopsApplicationsetApplicationsetSpecGeneratorPullRequest {
    /**
     * @return Fetch pull requests from a repo hosted on a Bitbucket Server.
     * 
     */
    private @Nullable GitopsApplicationsetApplicationsetSpecGeneratorPullRequestBitbucketServer bitbucketServer;
    /**
     * @return Filters allow selecting which pull requests to generate for.
     * 
     */
    private @Nullable List<GitopsApplicationsetApplicationsetSpecGeneratorPullRequestFilter> filters;
    /**
     * @return Specify the repository from which to fetch the Gitea Pull requests.
     * 
     */
    private @Nullable GitopsApplicationsetApplicationsetSpecGeneratorPullRequestGitea gitea;
    /**
     * @return Specify the repository from which to fetch the GitHub Pull requests.
     * 
     */
    private @Nullable GitopsApplicationsetApplicationsetSpecGeneratorPullRequestGithub github;
    /**
     * @return Specify the project from which to fetch the GitLab merge requests.
     * 
     */
    private @Nullable GitopsApplicationsetApplicationsetSpecGeneratorPullRequestGitlab gitlab;
    /**
     * @return How often to check for changes (in seconds). Default: 30min.
     * 
     */
    private @Nullable String requeueAfterSeconds;
    /**
     * @return Generator template. Used to override the values of the spec-level template.
     * 
     */
    private @Nullable GitopsApplicationsetApplicationsetSpecGeneratorPullRequestTemplate template;

    private GitopsApplicationsetApplicationsetSpecGeneratorPullRequest() {}
    /**
     * @return Fetch pull requests from a repo hosted on a Bitbucket Server.
     * 
     */
    public Optional<GitopsApplicationsetApplicationsetSpecGeneratorPullRequestBitbucketServer> bitbucketServer() {
        return Optional.ofNullable(this.bitbucketServer);
    }
    /**
     * @return Filters allow selecting which pull requests to generate for.
     * 
     */
    public List<GitopsApplicationsetApplicationsetSpecGeneratorPullRequestFilter> filters() {
        return this.filters == null ? List.of() : this.filters;
    }
    /**
     * @return Specify the repository from which to fetch the Gitea Pull requests.
     * 
     */
    public Optional<GitopsApplicationsetApplicationsetSpecGeneratorPullRequestGitea> gitea() {
        return Optional.ofNullable(this.gitea);
    }
    /**
     * @return Specify the repository from which to fetch the GitHub Pull requests.
     * 
     */
    public Optional<GitopsApplicationsetApplicationsetSpecGeneratorPullRequestGithub> github() {
        return Optional.ofNullable(this.github);
    }
    /**
     * @return Specify the project from which to fetch the GitLab merge requests.
     * 
     */
    public Optional<GitopsApplicationsetApplicationsetSpecGeneratorPullRequestGitlab> gitlab() {
        return Optional.ofNullable(this.gitlab);
    }
    /**
     * @return How often to check for changes (in seconds). Default: 30min.
     * 
     */
    public Optional<String> requeueAfterSeconds() {
        return Optional.ofNullable(this.requeueAfterSeconds);
    }
    /**
     * @return Generator template. Used to override the values of the spec-level template.
     * 
     */
    public Optional<GitopsApplicationsetApplicationsetSpecGeneratorPullRequestTemplate> template() {
        return Optional.ofNullable(this.template);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GitopsApplicationsetApplicationsetSpecGeneratorPullRequest defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable GitopsApplicationsetApplicationsetSpecGeneratorPullRequestBitbucketServer bitbucketServer;
        private @Nullable List<GitopsApplicationsetApplicationsetSpecGeneratorPullRequestFilter> filters;
        private @Nullable GitopsApplicationsetApplicationsetSpecGeneratorPullRequestGitea gitea;
        private @Nullable GitopsApplicationsetApplicationsetSpecGeneratorPullRequestGithub github;
        private @Nullable GitopsApplicationsetApplicationsetSpecGeneratorPullRequestGitlab gitlab;
        private @Nullable String requeueAfterSeconds;
        private @Nullable GitopsApplicationsetApplicationsetSpecGeneratorPullRequestTemplate template;
        public Builder() {}
        public Builder(GitopsApplicationsetApplicationsetSpecGeneratorPullRequest defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bitbucketServer = defaults.bitbucketServer;
    	      this.filters = defaults.filters;
    	      this.gitea = defaults.gitea;
    	      this.github = defaults.github;
    	      this.gitlab = defaults.gitlab;
    	      this.requeueAfterSeconds = defaults.requeueAfterSeconds;
    	      this.template = defaults.template;
        }

        @CustomType.Setter
        public Builder bitbucketServer(@Nullable GitopsApplicationsetApplicationsetSpecGeneratorPullRequestBitbucketServer bitbucketServer) {

            this.bitbucketServer = bitbucketServer;
            return this;
        }
        @CustomType.Setter
        public Builder filters(@Nullable List<GitopsApplicationsetApplicationsetSpecGeneratorPullRequestFilter> filters) {

            this.filters = filters;
            return this;
        }
        public Builder filters(GitopsApplicationsetApplicationsetSpecGeneratorPullRequestFilter... filters) {
            return filters(List.of(filters));
        }
        @CustomType.Setter
        public Builder gitea(@Nullable GitopsApplicationsetApplicationsetSpecGeneratorPullRequestGitea gitea) {

            this.gitea = gitea;
            return this;
        }
        @CustomType.Setter
        public Builder github(@Nullable GitopsApplicationsetApplicationsetSpecGeneratorPullRequestGithub github) {

            this.github = github;
            return this;
        }
        @CustomType.Setter
        public Builder gitlab(@Nullable GitopsApplicationsetApplicationsetSpecGeneratorPullRequestGitlab gitlab) {

            this.gitlab = gitlab;
            return this;
        }
        @CustomType.Setter
        public Builder requeueAfterSeconds(@Nullable String requeueAfterSeconds) {

            this.requeueAfterSeconds = requeueAfterSeconds;
            return this;
        }
        @CustomType.Setter
        public Builder template(@Nullable GitopsApplicationsetApplicationsetSpecGeneratorPullRequestTemplate template) {

            this.template = template;
            return this;
        }
        public GitopsApplicationsetApplicationsetSpecGeneratorPullRequest build() {
            final var _resultValue = new GitopsApplicationsetApplicationsetSpecGeneratorPullRequest();
            _resultValue.bitbucketServer = bitbucketServer;
            _resultValue.filters = filters;
            _resultValue.gitea = gitea;
            _resultValue.github = github;
            _resultValue.gitlab = gitlab;
            _resultValue.requeueAfterSeconds = requeueAfterSeconds;
            _resultValue.template = template;
            return _resultValue;
        }
    }
}
