// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Harness.Platform.Inputs
{

    public sealed class GetGitopsApplicationsApplicationSpecSourceKsonnetArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Ksonnet application environment name.
        /// </summary>
        [Input("environment")]
        public string? Environment { get; set; }

        [Input("parameters")]
        private List<Inputs.GetGitopsApplicationsApplicationSpecSourceKsonnetParameterArgs>? _parameters;

        /// <summary>
        /// List of ksonnet component parameter override values.
        /// </summary>
        public List<Inputs.GetGitopsApplicationsApplicationSpecSourceKsonnetParameterArgs> Parameters
        {
            get => _parameters ?? (_parameters = new List<Inputs.GetGitopsApplicationsApplicationSpecSourceKsonnetParameterArgs>());
            set => _parameters = value;
        }

        public GetGitopsApplicationsApplicationSpecSourceKsonnetArgs()
        {
        }
        public static new GetGitopsApplicationsApplicationSpecSourceKsonnetArgs Empty => new GetGitopsApplicationsApplicationSpecSourceKsonnetArgs();
    }
}
