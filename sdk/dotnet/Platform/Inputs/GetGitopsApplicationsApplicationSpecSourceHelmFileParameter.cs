// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Harness.Platform.Inputs
{

    public sealed class GetGitopsApplicationsApplicationSpecSourceHelmFileParameterArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Name of the helm parameter.
        /// </summary>
        [Input("name")]
        public string? Name { get; set; }

        /// <summary>
        /// Path to the file containing the values of the helm parameter.
        /// </summary>
        [Input("path")]
        public string? Path { get; set; }

        public GetGitopsApplicationsApplicationSpecSourceHelmFileParameterArgs()
        {
        }
        public static new GetGitopsApplicationsApplicationSpecSourceHelmFileParameterArgs Empty => new GetGitopsApplicationsApplicationSpecSourceHelmFileParameterArgs();
    }
}
