// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Harness.Platform.Inputs
{

    public sealed class GetTemplateGitDetailsInputArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Name of the branch.
        /// </summary>
        [Input("branchName")]
        public Input<string>? BranchName { get; set; }

        /// <summary>
        /// File path of the Entity in the repository.
        /// </summary>
        [Input("filePath")]
        public Input<string>? FilePath { get; set; }

        /// <summary>
        /// File url of the Entity in the repository.
        /// </summary>
        [Input("fileUrl")]
        public Input<string>? FileUrl { get; set; }

        /// <summary>
        /// Last commit identifier (for Git Repositories other than Github). To be provided only when updating Pipeline.
        /// </summary>
        [Input("lastCommitId", required: true)]
        public Input<string> LastCommitId { get; set; } = null!;

        /// <summary>
        /// Last object identifier (for Github). To be provided only when updating Pipeline.
        /// </summary>
        [Input("lastObjectId", required: true)]
        public Input<string> LastObjectId { get; set; } = null!;

        /// <summary>
        /// Name of the repository.
        /// </summary>
        [Input("repoName")]
        public Input<string>? RepoName { get; set; }

        /// <summary>
        /// Repo url of the Entity in the repository.
        /// </summary>
        [Input("repoUrl")]
        public Input<string>? RepoUrl { get; set; }

        public GetTemplateGitDetailsInputArgs()
        {
        }
        public static new GetTemplateGitDetailsInputArgs Empty => new GetTemplateGitDetailsInputArgs();
    }
}
