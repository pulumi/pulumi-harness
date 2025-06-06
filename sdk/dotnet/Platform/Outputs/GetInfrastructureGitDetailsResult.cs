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
    public sealed class GetInfrastructureGitDetailsResult
    {
        /// <summary>
        /// Name of the branch.
        /// </summary>
        public readonly string Branch;
        /// <summary>
        /// If the Entity is to be fetched from cache
        /// </summary>
        public readonly string LoadFromCache;
        /// <summary>
        /// Load Infrastructure yaml from fallback branch
        /// </summary>
        public readonly bool LoadFromFallbackBranch;
        /// <summary>
        /// Repo name of remote Infrastructure
        /// </summary>
        public readonly string RepoName;

        [OutputConstructor]
        private GetInfrastructureGitDetailsResult(
            string branch,

            string loadFromCache,

            bool loadFromFallbackBranch,

            string repoName)
        {
            Branch = branch;
            LoadFromCache = loadFromCache;
            LoadFromFallbackBranch = loadFromFallbackBranch;
            RepoName = repoName;
        }
    }
}
