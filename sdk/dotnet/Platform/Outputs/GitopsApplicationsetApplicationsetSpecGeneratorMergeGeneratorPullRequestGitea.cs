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
    public sealed class GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorPullRequestGitea
    {
        /// <summary>
        /// The Gitea API URL to talk to.
        /// </summary>
        public readonly string Api;
        /// <summary>
        /// Allow insecure tls, for self-signed certificates; default: false.
        /// </summary>
        public readonly bool? Insecure;
        /// <summary>
        /// Gitea org or user to scan.
        /// </summary>
        public readonly string Owner;
        /// <summary>
        /// Gitea repo name to scan.
        /// </summary>
        public readonly string Repo;
        /// <summary>
        /// Authentication token reference.
        /// </summary>
        public readonly Outputs.GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorPullRequestGiteaTokenRef? TokenRef;

        [OutputConstructor]
        private GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorPullRequestGitea(
            string api,

            bool? insecure,

            string owner,

            string repo,

            Outputs.GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorPullRequestGiteaTokenRef? tokenRef)
        {
            Api = api;
            Insecure = insecure;
            Owner = owner;
            Repo = repo;
            TokenRef = tokenRef;
        }
    }
}
