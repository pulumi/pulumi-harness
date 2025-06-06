// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Harness.Platform.Inputs
{

    public sealed class RepoRuleBranchPolicyArgs : global::Pulumi.ResourceArgs
    {
        [Input("allowMergeStrategies")]
        private InputList<string>? _allowMergeStrategies;

        /// <summary>
        /// Limit which merge strategies are available to merge a pull request(Any of squash, rebase, merge).
        /// </summary>
        public InputList<string> AllowMergeStrategies
        {
            get => _allowMergeStrategies ?? (_allowMergeStrategies = new InputList<string>());
            set => _allowMergeStrategies = value;
        }

        /// <summary>
        /// Only allow users with bypass permission to create matching branches.
        /// </summary>
        [Input("blockBranchCreation")]
        public Input<bool>? BlockBranchCreation { get; set; }

        /// <summary>
        /// Only allow users with bypass permission to delete matching branches.
        /// </summary>
        [Input("blockBranchDeletion")]
        public Input<bool>? BlockBranchDeletion { get; set; }

        /// <summary>
        /// Automatically delete the source branch of a pull request after it is merged.
        /// </summary>
        [Input("deleteBranchOnMerge")]
        public Input<bool>? DeleteBranchOnMerge { get; set; }

        /// <summary>
        /// Require approval on pull requests from one reviewer for each codeowner rule.
        /// </summary>
        [Input("requireCodeOwners")]
        public Input<bool>? RequireCodeOwners { get; set; }

        /// <summary>
        /// Require re-approval when there are new changes in the pull request.
        /// </summary>
        [Input("requireLatestCommitApproval")]
        public Input<bool>? RequireLatestCommitApproval { get; set; }

        /// <summary>
        /// Require approval on pull requests from a minimum number of reviewers.
        /// </summary>
        [Input("requireMinimumApprovalCount")]
        public Input<int>? RequireMinimumApprovalCount { get; set; }

        /// <summary>
        /// Require all request for changes have been resolved.
        /// </summary>
        [Input("requireNoChangeRequest")]
        public Input<bool>? RequireNoChangeRequest { get; set; }

        /// <summary>
        /// Do not allow any changes to matching branches without a pull request.
        /// </summary>
        [Input("requirePullRequest")]
        public Input<bool>? RequirePullRequest { get; set; }

        /// <summary>
        /// All comments on a pull request must be resolved before it can be merged.
        /// </summary>
        [Input("requireResolveAllComments")]
        public Input<bool>? RequireResolveAllComments { get; set; }

        [Input("requireStatusChecks")]
        private InputList<string>? _requireStatusChecks;

        /// <summary>
        /// Selected status checks must pass before a pull request can be merged.
        /// </summary>
        public InputList<string> RequireStatusChecks
        {
            get => _requireStatusChecks ?? (_requireStatusChecks = new InputList<string>());
            set => _requireStatusChecks = value;
        }

        public RepoRuleBranchPolicyArgs()
        {
        }
        public static new RepoRuleBranchPolicyArgs Empty => new RepoRuleBranchPolicyArgs();
    }
}
