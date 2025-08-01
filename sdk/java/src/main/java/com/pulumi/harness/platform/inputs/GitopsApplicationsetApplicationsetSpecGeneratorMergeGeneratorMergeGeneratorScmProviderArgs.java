// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.harness.platform.inputs.GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMergeGeneratorScmProviderAzureDevopsArgs;
import com.pulumi.harness.platform.inputs.GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMergeGeneratorScmProviderBitbucketCloudArgs;
import com.pulumi.harness.platform.inputs.GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMergeGeneratorScmProviderBitbucketServerArgs;
import com.pulumi.harness.platform.inputs.GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMergeGeneratorScmProviderFilterArgs;
import com.pulumi.harness.platform.inputs.GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMergeGeneratorScmProviderGiteaArgs;
import com.pulumi.harness.platform.inputs.GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMergeGeneratorScmProviderGithubArgs;
import com.pulumi.harness.platform.inputs.GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMergeGeneratorScmProviderGitlabArgs;
import com.pulumi.harness.platform.inputs.GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMergeGeneratorScmProviderTemplateArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMergeGeneratorScmProviderArgs extends com.pulumi.resources.ResourceArgs {

    public static final GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMergeGeneratorScmProviderArgs Empty = new GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMergeGeneratorScmProviderArgs();

    /**
     * Uses the Azure DevOps API to look up eligible repositories based on a team project within an Azure DevOps organization.
     * 
     */
    @Import(name="azureDevops")
    private @Nullable Output<GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMergeGeneratorScmProviderAzureDevopsArgs> azureDevops;

    /**
     * @return Uses the Azure DevOps API to look up eligible repositories based on a team project within an Azure DevOps organization.
     * 
     */
    public Optional<Output<GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMergeGeneratorScmProviderAzureDevopsArgs>> azureDevops() {
        return Optional.ofNullable(this.azureDevops);
    }

    /**
     * Uses the Bitbucket API V2 to scan a workspace in bitbucket.org.
     * 
     */
    @Import(name="bitbucketCloud")
    private @Nullable Output<GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMergeGeneratorScmProviderBitbucketCloudArgs> bitbucketCloud;

    /**
     * @return Uses the Bitbucket API V2 to scan a workspace in bitbucket.org.
     * 
     */
    public Optional<Output<GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMergeGeneratorScmProviderBitbucketCloudArgs>> bitbucketCloud() {
        return Optional.ofNullable(this.bitbucketCloud);
    }

    /**
     * Use the Bitbucket Server API (1.0) to scan repos in a project.
     * 
     */
    @Import(name="bitbucketServer")
    private @Nullable Output<GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMergeGeneratorScmProviderBitbucketServerArgs> bitbucketServer;

    /**
     * @return Use the Bitbucket Server API (1.0) to scan repos in a project.
     * 
     */
    public Optional<Output<GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMergeGeneratorScmProviderBitbucketServerArgs>> bitbucketServer() {
        return Optional.ofNullable(this.bitbucketServer);
    }

    /**
     * Which protocol to use for the SCM URL. Default is provider-specific but ssh if possible. Not all providers necessarily support all protocols.
     * 
     */
    @Import(name="cloneProtocol")
    private @Nullable Output<String> cloneProtocol;

    /**
     * @return Which protocol to use for the SCM URL. Default is provider-specific but ssh if possible. Not all providers necessarily support all protocols.
     * 
     */
    public Optional<Output<String>> cloneProtocol() {
        return Optional.ofNullable(this.cloneProtocol);
    }

    /**
     * Filters for which repos should be considered.
     * 
     */
    @Import(name="filters")
    private @Nullable Output<List<GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMergeGeneratorScmProviderFilterArgs>> filters;

    /**
     * @return Filters for which repos should be considered.
     * 
     */
    public Optional<Output<List<GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMergeGeneratorScmProviderFilterArgs>>> filters() {
        return Optional.ofNullable(this.filters);
    }

    /**
     * Gitea mode uses the Gitea API to scan organizations in your instance.
     * 
     */
    @Import(name="gitea")
    private @Nullable Output<GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMergeGeneratorScmProviderGiteaArgs> gitea;

    /**
     * @return Gitea mode uses the Gitea API to scan organizations in your instance.
     * 
     */
    public Optional<Output<GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMergeGeneratorScmProviderGiteaArgs>> gitea() {
        return Optional.ofNullable(this.gitea);
    }

    /**
     * Uses the GitHub API to scan an organization in either github.com or GitHub Enterprise.
     * 
     */
    @Import(name="github")
    private @Nullable Output<GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMergeGeneratorScmProviderGithubArgs> github;

    /**
     * @return Uses the GitHub API to scan an organization in either github.com or GitHub Enterprise.
     * 
     */
    public Optional<Output<GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMergeGeneratorScmProviderGithubArgs>> github() {
        return Optional.ofNullable(this.github);
    }

    /**
     * Uses the GitLab API to scan and organization in either gitlab.com or self-hosted GitLab.
     * 
     */
    @Import(name="gitlab")
    private @Nullable Output<GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMergeGeneratorScmProviderGitlabArgs> gitlab;

    /**
     * @return Uses the GitLab API to scan and organization in either gitlab.com or self-hosted GitLab.
     * 
     */
    public Optional<Output<GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMergeGeneratorScmProviderGitlabArgs>> gitlab() {
        return Optional.ofNullable(this.gitlab);
    }

    /**
     * How often to check for changes (in seconds). Default: 3min.
     * 
     */
    @Import(name="requeueAfterSeconds")
    private @Nullable Output<String> requeueAfterSeconds;

    /**
     * @return How often to check for changes (in seconds). Default: 3min.
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
    private @Nullable Output<GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMergeGeneratorScmProviderTemplateArgs> template;

    /**
     * @return Generator template. Used to override the values of the spec-level template.
     * 
     */
    public Optional<Output<GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMergeGeneratorScmProviderTemplateArgs>> template() {
        return Optional.ofNullable(this.template);
    }

    private GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMergeGeneratorScmProviderArgs() {}

    private GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMergeGeneratorScmProviderArgs(GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMergeGeneratorScmProviderArgs $) {
        this.azureDevops = $.azureDevops;
        this.bitbucketCloud = $.bitbucketCloud;
        this.bitbucketServer = $.bitbucketServer;
        this.cloneProtocol = $.cloneProtocol;
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
    public static Builder builder(GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMergeGeneratorScmProviderArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMergeGeneratorScmProviderArgs $;

        public Builder() {
            $ = new GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMergeGeneratorScmProviderArgs();
        }

        public Builder(GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMergeGeneratorScmProviderArgs defaults) {
            $ = new GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMergeGeneratorScmProviderArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param azureDevops Uses the Azure DevOps API to look up eligible repositories based on a team project within an Azure DevOps organization.
         * 
         * @return builder
         * 
         */
        public Builder azureDevops(@Nullable Output<GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMergeGeneratorScmProviderAzureDevopsArgs> azureDevops) {
            $.azureDevops = azureDevops;
            return this;
        }

        /**
         * @param azureDevops Uses the Azure DevOps API to look up eligible repositories based on a team project within an Azure DevOps organization.
         * 
         * @return builder
         * 
         */
        public Builder azureDevops(GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMergeGeneratorScmProviderAzureDevopsArgs azureDevops) {
            return azureDevops(Output.of(azureDevops));
        }

        /**
         * @param bitbucketCloud Uses the Bitbucket API V2 to scan a workspace in bitbucket.org.
         * 
         * @return builder
         * 
         */
        public Builder bitbucketCloud(@Nullable Output<GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMergeGeneratorScmProviderBitbucketCloudArgs> bitbucketCloud) {
            $.bitbucketCloud = bitbucketCloud;
            return this;
        }

        /**
         * @param bitbucketCloud Uses the Bitbucket API V2 to scan a workspace in bitbucket.org.
         * 
         * @return builder
         * 
         */
        public Builder bitbucketCloud(GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMergeGeneratorScmProviderBitbucketCloudArgs bitbucketCloud) {
            return bitbucketCloud(Output.of(bitbucketCloud));
        }

        /**
         * @param bitbucketServer Use the Bitbucket Server API (1.0) to scan repos in a project.
         * 
         * @return builder
         * 
         */
        public Builder bitbucketServer(@Nullable Output<GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMergeGeneratorScmProviderBitbucketServerArgs> bitbucketServer) {
            $.bitbucketServer = bitbucketServer;
            return this;
        }

        /**
         * @param bitbucketServer Use the Bitbucket Server API (1.0) to scan repos in a project.
         * 
         * @return builder
         * 
         */
        public Builder bitbucketServer(GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMergeGeneratorScmProviderBitbucketServerArgs bitbucketServer) {
            return bitbucketServer(Output.of(bitbucketServer));
        }

        /**
         * @param cloneProtocol Which protocol to use for the SCM URL. Default is provider-specific but ssh if possible. Not all providers necessarily support all protocols.
         * 
         * @return builder
         * 
         */
        public Builder cloneProtocol(@Nullable Output<String> cloneProtocol) {
            $.cloneProtocol = cloneProtocol;
            return this;
        }

        /**
         * @param cloneProtocol Which protocol to use for the SCM URL. Default is provider-specific but ssh if possible. Not all providers necessarily support all protocols.
         * 
         * @return builder
         * 
         */
        public Builder cloneProtocol(String cloneProtocol) {
            return cloneProtocol(Output.of(cloneProtocol));
        }

        /**
         * @param filters Filters for which repos should be considered.
         * 
         * @return builder
         * 
         */
        public Builder filters(@Nullable Output<List<GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMergeGeneratorScmProviderFilterArgs>> filters) {
            $.filters = filters;
            return this;
        }

        /**
         * @param filters Filters for which repos should be considered.
         * 
         * @return builder
         * 
         */
        public Builder filters(List<GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMergeGeneratorScmProviderFilterArgs> filters) {
            return filters(Output.of(filters));
        }

        /**
         * @param filters Filters for which repos should be considered.
         * 
         * @return builder
         * 
         */
        public Builder filters(GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMergeGeneratorScmProviderFilterArgs... filters) {
            return filters(List.of(filters));
        }

        /**
         * @param gitea Gitea mode uses the Gitea API to scan organizations in your instance.
         * 
         * @return builder
         * 
         */
        public Builder gitea(@Nullable Output<GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMergeGeneratorScmProviderGiteaArgs> gitea) {
            $.gitea = gitea;
            return this;
        }

        /**
         * @param gitea Gitea mode uses the Gitea API to scan organizations in your instance.
         * 
         * @return builder
         * 
         */
        public Builder gitea(GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMergeGeneratorScmProviderGiteaArgs gitea) {
            return gitea(Output.of(gitea));
        }

        /**
         * @param github Uses the GitHub API to scan an organization in either github.com or GitHub Enterprise.
         * 
         * @return builder
         * 
         */
        public Builder github(@Nullable Output<GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMergeGeneratorScmProviderGithubArgs> github) {
            $.github = github;
            return this;
        }

        /**
         * @param github Uses the GitHub API to scan an organization in either github.com or GitHub Enterprise.
         * 
         * @return builder
         * 
         */
        public Builder github(GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMergeGeneratorScmProviderGithubArgs github) {
            return github(Output.of(github));
        }

        /**
         * @param gitlab Uses the GitLab API to scan and organization in either gitlab.com or self-hosted GitLab.
         * 
         * @return builder
         * 
         */
        public Builder gitlab(@Nullable Output<GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMergeGeneratorScmProviderGitlabArgs> gitlab) {
            $.gitlab = gitlab;
            return this;
        }

        /**
         * @param gitlab Uses the GitLab API to scan and organization in either gitlab.com or self-hosted GitLab.
         * 
         * @return builder
         * 
         */
        public Builder gitlab(GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMergeGeneratorScmProviderGitlabArgs gitlab) {
            return gitlab(Output.of(gitlab));
        }

        /**
         * @param requeueAfterSeconds How often to check for changes (in seconds). Default: 3min.
         * 
         * @return builder
         * 
         */
        public Builder requeueAfterSeconds(@Nullable Output<String> requeueAfterSeconds) {
            $.requeueAfterSeconds = requeueAfterSeconds;
            return this;
        }

        /**
         * @param requeueAfterSeconds How often to check for changes (in seconds). Default: 3min.
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
        public Builder template(@Nullable Output<GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMergeGeneratorScmProviderTemplateArgs> template) {
            $.template = template;
            return this;
        }

        /**
         * @param template Generator template. Used to override the values of the spec-level template.
         * 
         * @return builder
         * 
         */
        public Builder template(GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMergeGeneratorScmProviderTemplateArgs template) {
            return template(Output.of(template));
        }

        public GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMergeGeneratorScmProviderArgs build() {
            return $;
        }
    }

}
