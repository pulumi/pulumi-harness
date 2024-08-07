// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Harness.Platform.Outputs
{

    [OutputType]
    public sealed class GetPipelineFiltersFilterPropertyModulePropertiesCiCiExecutionInfoPullRequestResult
    {
        /// <summary>
        /// Source branch of the pull request.
        /// </summary>
        public readonly string SourceBranch;
        /// <summary>
        /// Target branch of the pull request.
        /// </summary>
        public readonly string TargetBranch;

        [OutputConstructor]
        private GetPipelineFiltersFilterPropertyModulePropertiesCiCiExecutionInfoPullRequestResult(
            string sourceBranch,

            string targetBranch)
        {
            SourceBranch = sourceBranch;
            TargetBranch = targetBranch;
        }
    }
}
