// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Harness.Platform.Inputs
{

    public sealed class GetGitopsApplicationsApplicationSpecSyncPolicyRetryBackoffArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Amount to back off. Default unit is seconds, but could also be a duration (e.g. "2m", "1h").
        /// </summary>
        [Input("duration")]
        public string? Duration { get; set; }

        /// <summary>
        /// Factor to multiply the base duration after each failed retry.
        /// </summary>
        [Input("factor")]
        public string? Factor { get; set; }

        /// <summary>
        /// Maximum amount of time allowed of the backoff strategy.
        /// </summary>
        [Input("maxDuration")]
        public string? MaxDuration { get; set; }

        public GetGitopsApplicationsApplicationSpecSyncPolicyRetryBackoffArgs()
        {
        }
        public static new GetGitopsApplicationsApplicationSpecSyncPolicyRetryBackoffArgs Empty => new GetGitopsApplicationsApplicationSpecSyncPolicyRetryBackoffArgs();
    }
}