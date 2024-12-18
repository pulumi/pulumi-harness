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
    public sealed class GetGitopsApplicationsApplicationSpecSourceHelmFileParameterResult
    {
        /// <summary>
        /// Name of the GitOps application.
        /// </summary>
        public readonly string? Name;
        /// <summary>
        /// Path to the file containing the values of the helm parameter.
        /// </summary>
        public readonly string? Path;

        [OutputConstructor]
        private GetGitopsApplicationsApplicationSpecSourceHelmFileParameterResult(
            string? name,

            string? path)
        {
            Name = name;
            Path = path;
        }
    }
}
