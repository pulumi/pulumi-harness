// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.harness.platform.inputs.GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMergeGeneratorPullRequestBitbucketServerArgs;
import com.pulumi.harness.platform.inputs.GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMergeGeneratorPullRequestFilterArgs;
import com.pulumi.harness.platform.inputs.GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMergeGeneratorPullRequestGiteaArgs;
import com.pulumi.harness.platform.inputs.GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMergeGeneratorPullRequestGithubArgs;
import com.pulumi.harness.platform.inputs.GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMergeGeneratorPullRequestGitlabArgs;
import com.pulumi.harness.platform.inputs.GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMergeGeneratorPullRequestTemplateArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMergeGeneratorPullRequestArgs extends com.pulumi.resources.ResourceArgs {

    public static final GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMergeGeneratorPullRequestArgs Empty = new GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMergeGeneratorPullRequestArgs();

    /**
     * Fetch pull requests from a repo hosted on a Bitbucket Server.
     * 
     */
    @Import(name="bitbucketServer")
    private @Nullable Output<GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMergeGeneratorPullRequestBitbucketServerArgs> bitbucketServer;

    /**
     * @return Fetch pull requests from a repo hosted on a Bitbucket Server.
     * 
     */
    public Optional<Output<GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMergeGeneratorPullRequestBitbucketServerArgs>> bitbucketServer() {
        return Optional.ofNullable(this.bitbucketServer);
    }

    /**
     * Filters allow selecting which pull requests to generate for.
     * 
     */
    @Import(name="filters")
    private @Nullable Output<List<GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMergeGeneratorPullRequestFilterArgs>> filters;

    /**
     * @return Filters allow selecting which pull requests to generate for.
     * 
     */
    public Optional<Output<List<GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMergeGeneratorPullRequestFilterArgs>>> filters() {
        return Optional.ofNullable(this.filters);
    }

    /**
     * Specify the repository from which to fetch the Gitea Pull requests.
     * 
     */
    @Import(name="gitea")
    private @Nullable Output<GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMergeGeneratorPullRequestGiteaArgs> gitea;

    /**
     * @return Specify the repository from which to fetch the Gitea Pull requests.
     * 
     */
    public Optional<Output<GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMergeGeneratorPullRequestGiteaArgs>> gitea() {
        return Optional.ofNullable(this.gitea);
    }

    /**
     * Specify the repository from which to fetch the GitHub Pull requests.
     * 
     */
    @Import(name="github")
    private @Nullable Output<GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMergeGeneratorPullRequestGithubArgs> github;

    /**
     * @return Specify the repository from which to fetch the GitHub Pull requests.
     * 
     */
    public Optional<Output<GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMergeGeneratorPullRequestGithubArgs>> github() {
        return Optional.ofNullable(this.github);
    }

    /**
     * Specify the project from which to fetch the GitLab merge requests.
     * 
     */
    @Import(name="gitlab")
    private @Nullable Output<GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMergeGeneratorPullRequestGitlabArgs> gitlab;

    /**
     * @return Specify the project from which to fetch the GitLab merge requests.
     * 
     */
    public Optional<Output<GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMergeGeneratorPullRequestGitlabArgs>> gitlab() {
        return Optional.ofNullable(this.gitlab);
    }

    /**
     * How often to check for changes (in seconds). Default: 30min.
     * 
     */
    @Import(name="requeueAfterSeconds")
    private @Nullable Output<String> requeueAfterSeconds;

    /**
     * @return How often to check for changes (in seconds). Default: 30min.
     * 
     */
    public Optional<Output<String>> requeueAfterSeconds() {
        return Optional.ofNullable(this.requeueAfterSeconds);
    }

    /**
     * Generator template. Used to override the values of the spec-level template.
     * 
     */
    @Import(name="template")
    private @Nullable Output<GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMergeGeneratorPullRequestTemplateArgs> template;

    /**
     * @return Generator template. Used to override the values of the spec-level template.
     * 
     */
    public Optional<Output<GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMergeGeneratorPullRequestTemplateArgs>> template() {
        return Optional.ofNullable(this.template);
    }

    private GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMergeGeneratorPullRequestArgs() {}

    private GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMergeGeneratorPullRequestArgs(GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMergeGeneratorPullRequestArgs $) {
        this.bitbucketServer = $.bitbucketServer;
        this.filters = $.filters;
        this.gitea = $.gitea;
        this.github = $.github;
        this.gitlab = $.gitlab;
        this.requeueAfterSeconds = $.requeueAfterSeconds;
        this.template = $.template;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMergeGeneratorPullRequestArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMergeGeneratorPullRequestArgs $;

        public Builder() {
            $ = new GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMergeGeneratorPullRequestArgs();
        }

        public Builder(GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMergeGeneratorPullRequestArgs defaults) {
            $ = new GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMergeGeneratorPullRequestArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param bitbucketServer Fetch pull requests from a repo hosted on a Bitbucket Server.
         * 
         * @return builder
         * 
         */
        public Builder bitbucketServer(@Nullable Output<GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMergeGeneratorPullRequestBitbucketServerArgs> bitbucketServer) {
            $.bitbucketServer = bitbucketServer;
            return this;
        }

        /**
         * @param bitbucketServer Fetch pull requests from a repo hosted on a Bitbucket Server.
         * 
         * @return builder
         * 
         */
        public Builder bitbucketServer(GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMergeGeneratorPullRequestBitbucketServerArgs bitbucketServer) {
            return bitbucketServer(Output.of(bitbucketServer));
        }

        /**
         * @param filters Filters allow selecting which pull requests to generate for.
         * 
         * @return builder
         * 
         */
        public Builder filters(@Nullable Output<List<GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMergeGeneratorPullRequestFilterArgs>> filters) {
            $.filters = filters;
            return this;
        }

        /**
         * @param filters Filters allow selecting which pull requests to generate for.
         * 
         * @return builder
         * 
         */
        public Builder filters(List<GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMergeGeneratorPullRequestFilterArgs> filters) {
            return filters(Output.of(filters));
        }

        /**
         * @param filters Filters allow selecting which pull requests to generate for.
         * 
         * @return builder
         * 
         */
        public Builder filters(GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMergeGeneratorPullRequestFilterArgs... filters) {
            return filters(List.of(filters));
        }

        /**
         * @param gitea Specify the repository from which to fetch the Gitea Pull requests.
         * 
         * @return builder
         * 
         */
        public Builder gitea(@Nullable Output<GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMergeGeneratorPullRequestGiteaArgs> gitea) {
            $.gitea = gitea;
            return this;
        }

        /**
         * @param gitea Specify the repository from which to fetch the Gitea Pull requests.
         * 
         * @return builder
         * 
         */
        public Builder gitea(GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMergeGeneratorPullRequestGiteaArgs gitea) {
            return gitea(Output.of(gitea));
        }

        /**
         * @param github Specify the repository from which to fetch the GitHub Pull requests.
         * 
         * @return builder
         * 
         */
        public Builder github(@Nullable Output<GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMergeGeneratorPullRequestGithubArgs> github) {
            $.github = github;
            return this;
        }

        /**
         * @param github Specify the repository from which to fetch the GitHub Pull requests.
         * 
         * @return builder
         * 
         */
        public Builder github(GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMergeGeneratorPullRequestGithubArgs github) {
            return github(Output.of(github));
        }

        /**
         * @param gitlab Specify the project from which to fetch the GitLab merge requests.
         * 
         * @return builder
         * 
         */
        public Builder gitlab(@Nullable Output<GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMergeGeneratorPullRequestGitlabArgs> gitlab) {
            $.gitlab = gitlab;
            return this;
        }

        /**
         * @param gitlab Specify the project from which to fetch the GitLab merge requests.
         * 
         * @return builder
         * 
         */
        public Builder gitlab(GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMergeGeneratorPullRequestGitlabArgs gitlab) {
            return gitlab(Output.of(gitlab));
        }

        /**
         * @param requeueAfterSeconds How often to check for changes (in seconds). Default: 30min.
         * 
         * @return builder
         * 
         */
        public Builder requeueAfterSeconds(@Nullable Output<String> requeueAfterSeconds) {
            $.requeueAfterSeconds = requeueAfterSeconds;
            return this;
        }

        /**
         * @param requeueAfterSeconds How often to check for changes (in seconds). Default: 30min.
         * 
         * @return builder
         * 
         */
        public Builder requeueAfterSeconds(String requeueAfterSeconds) {
            return requeueAfterSeconds(Output.of(requeueAfterSeconds));
        }

        /**
         * @param template Generator template. Used to override the values of the spec-level template.
         * 
         * @return builder
         * 
         */
        public Builder template(@Nullable Output<GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMergeGeneratorPullRequestTemplateArgs> template) {
            $.template = template;
            return this;
        }

        /**
         * @param template Generator template. Used to override the values of the spec-level template.
         * 
         * @return builder
         * 
         */
        public Builder template(GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMergeGeneratorPullRequestTemplateArgs template) {
            return template(Output.of(template));
        }

        public GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMergeGeneratorPullRequestArgs build() {
            return $;
        }
    }

}
