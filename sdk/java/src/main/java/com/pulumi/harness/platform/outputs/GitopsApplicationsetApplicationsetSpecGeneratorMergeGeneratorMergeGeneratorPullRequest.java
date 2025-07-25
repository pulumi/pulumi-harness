// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.harness.platform.outputs.GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMergeGeneratorPullRequestBitbucketServer;
import com.pulumi.harness.platform.outputs.GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMergeGeneratorPullRequestFilter;
import com.pulumi.harness.platform.outputs.GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMergeGeneratorPullRequestGitea;
import com.pulumi.harness.platform.outputs.GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMergeGeneratorPullRequestGithub;
import com.pulumi.harness.platform.outputs.GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMergeGeneratorPullRequestGitlab;
import com.pulumi.harness.platform.outputs.GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMergeGeneratorPullRequestTemplate;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMergeGeneratorPullRequest {
    /**
     * @return Fetch pull requests from a repo hosted on a Bitbucket Server.
     * 
     */
    private @Nullable GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMergeGeneratorPullRequestBitbucketServer bitbucketServer;
    /**
     * @return Filters allow selecting which pull requests to generate for.
     * 
     */
    private @Nullable List<GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMergeGeneratorPullRequestFilter> filters;
    /**
     * @return Specify the repository from which to fetch the Gitea Pull requests.
     * 
     */
    private @Nullable GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMergeGeneratorPullRequestGitea gitea;
    /**
     * @return Specify the repository from which to fetch the GitHub Pull requests.
     * 
     */
    private @Nullable GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMergeGeneratorPullRequestGithub github;
    /**
     * @return Specify the project from which to fetch the GitLab merge requests.
     * 
     */
    private @Nullable GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMergeGeneratorPullRequestGitlab gitlab;
    /**
     * @return How often to check for changes (in seconds). Default: 30min.
     * 
     */
    private @Nullable String requeueAfterSeconds;
    /**
     * @return Generator template. Used to override the values of the spec-level template.
     * 
     */
    private @Nullable GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMergeGeneratorPullRequestTemplate template;

    private GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMergeGeneratorPullRequest() {}
    /**
     * @return Fetch pull requests from a repo hosted on a Bitbucket Server.
     * 
     */
    public Optional<GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMergeGeneratorPullRequestBitbucketServer> bitbucketServer() {
        return Optional.ofNullable(this.bitbucketServer);
    }
    /**
     * @return Filters allow selecting which pull requests to generate for.
     * 
     */
    public List<GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMergeGeneratorPullRequestFilter> filters() {
        return this.filters == null ? List.of() : this.filters;
    }
    /**
     * @return Specify the repository from which to fetch the Gitea Pull requests.
     * 
     */
    public Optional<GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMergeGeneratorPullRequestGitea> gitea() {
        return Optional.ofNullable(this.gitea);
    }
    /**
     * @return Specify the repository from which to fetch the GitHub Pull requests.
     * 
     */
    public Optional<GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMergeGeneratorPullRequestGithub> github() {
        return Optional.ofNullable(this.github);
    }
    /**
     * @return Specify the project from which to fetch the GitLab merge requests.
     * 
     */
    public Optional<GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMergeGeneratorPullRequestGitlab> gitlab() {
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
    public Optional<GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMergeGeneratorPullRequestTemplate> template() {
        return Optional.ofNullable(this.template);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMergeGeneratorPullRequest defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMergeGeneratorPullRequestBitbucketServer bitbucketServer;
        private @Nullable List<GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMergeGeneratorPullRequestFilter> filters;
        private @Nullable GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMergeGeneratorPullRequestGitea gitea;
        private @Nullable GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMergeGeneratorPullRequestGithub github;
        private @Nullable GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMergeGeneratorPullRequestGitlab gitlab;
        private @Nullable String requeueAfterSeconds;
        private @Nullable GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMergeGeneratorPullRequestTemplate template;
        public Builder() {}
        public Builder(GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMergeGeneratorPullRequest defaults) {
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
        public Builder bitbucketServer(@Nullable GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMergeGeneratorPullRequestBitbucketServer bitbucketServer) {

            this.bitbucketServer = bitbucketServer;
            return this;
        }
        @CustomType.Setter
        public Builder filters(@Nullable List<GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMergeGeneratorPullRequestFilter> filters) {

            this.filters = filters;
            return this;
        }
        public Builder filters(GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMergeGeneratorPullRequestFilter... filters) {
            return filters(List.of(filters));
        }
        @CustomType.Setter
        public Builder gitea(@Nullable GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMergeGeneratorPullRequestGitea gitea) {

            this.gitea = gitea;
            return this;
        }
        @CustomType.Setter
        public Builder github(@Nullable GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMergeGeneratorPullRequestGithub github) {

            this.github = github;
            return this;
        }
        @CustomType.Setter
        public Builder gitlab(@Nullable GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMergeGeneratorPullRequestGitlab gitlab) {

            this.gitlab = gitlab;
            return this;
        }
        @CustomType.Setter
        public Builder requeueAfterSeconds(@Nullable String requeueAfterSeconds) {

            this.requeueAfterSeconds = requeueAfterSeconds;
            return this;
        }
        @CustomType.Setter
        public Builder template(@Nullable GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMergeGeneratorPullRequestTemplate template) {

            this.template = template;
            return this;
        }
        public GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMergeGeneratorPullRequest build() {
            final var _resultValue = new GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMergeGeneratorPullRequest();
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
