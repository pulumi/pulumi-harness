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
    public sealed class GetServiceGitDetailsResult
    {
        /// <summary>
        /// Name of the branch.
        /// </summary>
        public readonly string Branch;
        /// <summary>
        /// Load service yaml from fallback branch
        /// </summary>
        public readonly bool LoadFromFallbackBranch;
        /// <summary>
        /// Repo name of remote service
        /// </summary>
        public readonly string RepoName;

        [OutputConstructor]
        private GetServiceGitDetailsResult(
            string branch,

            bool loadFromFallbackBranch,

            string repoName)
        {
            Branch = branch;
            LoadFromFallbackBranch = loadFromFallbackBranch;
            RepoName = repoName;
        }
    }
}
