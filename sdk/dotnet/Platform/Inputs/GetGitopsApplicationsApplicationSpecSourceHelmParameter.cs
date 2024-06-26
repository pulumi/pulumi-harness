// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Harness.Platform.Inputs
{

    public sealed class GetGitopsApplicationsApplicationSpecSourceHelmParameterArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Indicates if helm should interpret booleans and numbers as strings.
        /// </summary>
        [Input("forceString")]
        public bool? ForceString { get; set; }

        /// <summary>
        /// Name of the helm parameter.
        /// </summary>
        [Input("name")]
        public string? Name { get; set; }

        /// <summary>
        /// Value of the helm parameter.
        /// </summary>
        [Input("value")]
        public string? Value { get; set; }

        public GetGitopsApplicationsApplicationSpecSourceHelmParameterArgs()
        {
        }
        public static new GetGitopsApplicationsApplicationSpecSourceHelmParameterArgs Empty => new GetGitopsApplicationsApplicationSpecSourceHelmParameterArgs();
    }
}
