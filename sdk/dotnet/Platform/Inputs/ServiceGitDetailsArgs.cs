// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Harness.Platform.Inputs
{

    public sealed class ServiceGitDetailsArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Name of the default branch (this checks out a new branch titled by branch_name).
        /// </summary>
        [Input("baseBranch")]
        public Input<string>? BaseBranch { get; set; }

        /// <summary>
        /// Name of the branch.
        /// </summary>
        [Input("branch")]
        public Input<string>? Branch { get; set; }

        /// <summary>
        /// Commit message used for the merge commit.
        /// </summary>
        [Input("commitMessage")]
        public Input<string>? CommitMessage { get; set; }

        /// <summary>
        /// Identifier of the Harness Connector used for CRUD operations on the Entity. To reference a connector at the organization scope, prefix 'org' to the expression: org.{identifier}. To reference a connector at the account scope, prefix 'account` to the expression: account.{identifier}.
        /// </summary>
        [Input("connectorRef")]
        public Input<string>? ConnectorRef { get; set; }

        /// <summary>
        /// File path of the Entity in the repository.
        /// </summary>
        [Input("filePath")]
        public Input<string>? FilePath { get; set; }

        /// <summary>
        /// If the repo is in harness code
        /// </summary>
        [Input("isHarnessCodeRepo")]
        public Input<bool>? IsHarnessCodeRepo { get; set; }

        /// <summary>
        /// If the branch being created is new
        /// </summary>
        [Input("isNewBranch")]
        public Input<bool>? IsNewBranch { get; set; }

        /// <summary>
        /// Last commit identifier (for Git Repositories other than Github). To be provided only when updating Pipeline.
        /// </summary>
        [Input("lastCommitId")]
        public Input<string>? LastCommitId { get; set; }

        /// <summary>
        /// Last object identifier (for Github). To be provided only when updating Pipeline.
        /// </summary>
        [Input("lastObjectId")]
        public Input<string>? LastObjectId { get; set; }

        /// <summary>
        /// Load service yaml from catch
        /// </summary>
        [Input("loadFromCache")]
        public Input<bool>? LoadFromCache { get; set; }

        /// <summary>
        /// Load service yaml from fallback branch
        /// </summary>
        [Input("loadFromFallbackBranch")]
        public Input<bool>? LoadFromFallbackBranch { get; set; }

        /// <summary>
        /// Name of the repository.
        /// </summary>
        [Input("repoName")]
        public Input<string>? RepoName { get; set; }

        /// <summary>
        /// Specifies whether the Entity is to be stored in Git or not. Possible values: INLINE, REMOTE.
        /// </summary>
        [Input("storeType")]
        public Input<string>? StoreType { get; set; }

        public ServiceGitDetailsArgs()
        {
        }
        public static new ServiceGitDetailsArgs Empty => new ServiceGitDetailsArgs();
    }
}