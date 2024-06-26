// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Harness.Platform.Inputs
{

    public sealed class GetGitopsApplicationsApplicationSpecSourceKsonnetParameterArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Component of the parameter of the ksonnet application.
        /// </summary>
        [Input("component")]
        public string? Component { get; set; }

        /// <summary>
        /// Name of the parameter of the ksonnet application.
        /// </summary>
        [Input("name")]
        public string? Name { get; set; }

        /// <summary>
        /// Value of the parameter of the ksonnet application.
        /// </summary>
        [Input("value")]
        public string? Value { get; set; }

        public GetGitopsApplicationsApplicationSpecSourceKsonnetParameterArgs()
        {
        }
        public static new GetGitopsApplicationsApplicationSpecSourceKsonnetParameterArgs Empty => new GetGitopsApplicationsApplicationSpecSourceKsonnetParameterArgs();
    }
}
