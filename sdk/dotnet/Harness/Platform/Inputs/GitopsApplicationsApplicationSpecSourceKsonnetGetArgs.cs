// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;
using Pulumi;

namespace Lbrlabs.PulumiPackage.Harness.Platform.Inputs
{

    public sealed class GitopsApplicationsApplicationSpecSourceKsonnetGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("environment")]
        public Input<string>? Environment { get; set; }

        [Input("parameters")]
        private InputList<Inputs.GitopsApplicationsApplicationSpecSourceKsonnetParameterGetArgs>? _parameters;
        public InputList<Inputs.GitopsApplicationsApplicationSpecSourceKsonnetParameterGetArgs> Parameters
        {
            get => _parameters ?? (_parameters = new InputList<Inputs.GitopsApplicationsApplicationSpecSourceKsonnetParameterGetArgs>());
            set => _parameters = value;
        }

        public GitopsApplicationsApplicationSpecSourceKsonnetGetArgs()
        {
        }
        public static new GitopsApplicationsApplicationSpecSourceKsonnetGetArgs Empty => new GitopsApplicationsApplicationSpecSourceKsonnetGetArgs();
    }
}