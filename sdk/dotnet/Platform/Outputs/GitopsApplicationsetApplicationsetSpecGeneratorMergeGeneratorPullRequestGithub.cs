// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Harness.Platform.Outputs
{

    [OutputType]
    public sealed class GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorPullRequestGithub
    {
        /// <summary>
        /// The GitHub API URL to talk to. Default https://api.github.com/.
        /// </summary>
        public readonly string? Api;
        /// <summary>
        /// Reference to a GitHub App repo-creds secret with permission to access pull requests.
        /// </summary>
        public readonly string? AppSecretName;
        /// <summary>
        /// Labels is used to filter the PRs that you want to target.
        /// </summary>
        public readonly ImmutableArray<string> Labels;
        /// <summary>
        /// GitHub org or user to scan.
        /// </summary>
        public readonly string Owner;
        /// <summary>
        /// GitHub repo name to scan.
        /// </summary>
        public readonly string Repo;
        /// <summary>
        /// Authentication token reference.
        /// </summary>
        public readonly Outputs.GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorPullRequestGithubTokenRef? TokenRef;

        [OutputConstructor]
        private GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorPullRequestGithub(
            string? api,

            string? appSecretName,

            ImmutableArray<string> labels,

            string owner,

            string repo,

            Outputs.GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorPullRequestGithubTokenRef? tokenRef)
        {
            Api = api;
            AppSecretName = appSecretName;
            Labels = labels;
            Owner = owner;
            Repo = repo;
            TokenRef = tokenRef;
        }
    }
}
