// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Harness.Platform.Inputs
{

    public sealed class GitOpsApplicationsApplicationSpecSourceDirectoryJsonnetTlaArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Code of the TLAS of the jsonnet application.
        /// </summary>
        [Input("code")]
        public Input<bool>? Code { get; set; }

        /// <summary>
        /// Name of the TLAS of the jsonnet application.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Value of the TLAS of the jsonnet application.
        /// </summary>
        [Input("value")]
        public Input<string>? Value { get; set; }

        public GitOpsApplicationsApplicationSpecSourceDirectoryJsonnetTlaArgs()
        {
        }
        public static new GitOpsApplicationsApplicationSpecSourceDirectoryJsonnetTlaArgs Empty => new GitOpsApplicationsApplicationSpecSourceDirectoryJsonnetTlaArgs();
    }
}
