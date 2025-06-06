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
    public sealed class InputSetGitDetails
    {
        /// <summary>
        /// Name of the default branch (this checks out a new branch titled by branch_name).
        /// </summary>
        public readonly string? BaseBranch;
        /// <summary>
        /// Name of the branch.
        /// </summary>
        public readonly string? BranchName;
        /// <summary>
        /// Commit message used for the merge commit.
        /// </summary>
        public readonly string? CommitMessage;
        /// <summary>
        /// Identifier of the Harness Connector used for CRUD operations on the Entity. To reference a connector at the organization scope, prefix 'org' to the expression: org.{identifier}. To reference a connector at the account scope, prefix 'account` to the expression: account.{identifier}.
        /// </summary>
        public readonly string? ConnectorRef;
        /// <summary>
        /// File path of the Entity in the repository.
        /// </summary>
        public readonly string? FilePath;
        /// <summary>
        /// If the repo is harness code.
        /// </summary>
        public readonly bool? IsHarnessCodeRepo;
        /// <summary>
        /// Last commit identifier (for Git Repositories other than Github). To be provided only when updating Pipeline.
        /// </summary>
        public readonly string? LastCommitId;
        /// <summary>
        /// Last object identifier (for Github). To be provided only when updating Pipeline.
        /// </summary>
        public readonly string? LastObjectId;
        /// <summary>
        /// Connector reference for Parent Entity (Pipeline). To reference a connector at the organization scope, prefix 'org' to the expression: org.{identifier}. To reference a connector at the account scope, prefix 'account` to the expression: account.{identifier}.
        /// </summary>
        public readonly string? ParentEntityConnectorRef;
        /// <summary>
        /// Repository name for Parent Entity (Pipeline).
        /// </summary>
        public readonly string? ParentEntityRepoName;
        /// <summary>
        /// Name of the repository.
        /// </summary>
        public readonly string? RepoName;
        /// <summary>
        /// Specifies whether the Entity is to be stored in Git or not. Possible values: INLINE, REMOTE.
        /// </summary>
        public readonly string? StoreType;

        [OutputConstructor]
        private InputSetGitDetails(
            string? baseBranch,

            string? branchName,

            string? commitMessage,

            string? connectorRef,

            string? filePath,

            bool? isHarnessCodeRepo,

            string? lastCommitId,

            string? lastObjectId,

            string? parentEntityConnectorRef,

            string? parentEntityRepoName,

            string? repoName,

            string? storeType)
        {
            BaseBranch = baseBranch;
            BranchName = branchName;
            CommitMessage = commitMessage;
            ConnectorRef = connectorRef;
            FilePath = filePath;
            IsHarnessCodeRepo = isHarnessCodeRepo;
            LastCommitId = lastCommitId;
            LastObjectId = lastObjectId;
            ParentEntityConnectorRef = parentEntityConnectorRef;
            ParentEntityRepoName = parentEntityRepoName;
            RepoName = repoName;
            StoreType = storeType;
        }
    }
}
