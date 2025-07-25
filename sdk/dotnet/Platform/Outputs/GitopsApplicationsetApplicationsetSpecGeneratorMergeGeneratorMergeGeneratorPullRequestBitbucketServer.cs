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
    public sealed class GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMergeGeneratorPullRequestBitbucketServer
    {
        /// <summary>
        /// The Bitbucket REST API URL to talk to e.g. https://bitbucket.org/rest.
        /// </summary>
        public readonly string Api;
        /// <summary>
        /// Credentials for Basic auth.
        /// </summary>
        public readonly Outputs.GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMergeGeneratorPullRequestBitbucketServerBasicAuth? BasicAuth;
        /// <summary>
        /// Project to scan.
        /// </summary>
        public readonly string Project;
        /// <summary>
        /// Repo name to scan.
        /// </summary>
        public readonly string Repo;

        [OutputConstructor]
        private GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMergeGeneratorPullRequestBitbucketServer(
            string api,

            Outputs.GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMergeGeneratorPullRequestBitbucketServerBasicAuth? basicAuth,

            string project,

            string repo)
        {
            Api = api;
            BasicAuth = basicAuth;
            Project = project;
            Repo = repo;
        }
    }
}
