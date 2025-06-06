// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Harness.Platform.Outputs
{

    [OutputType]
    public sealed class GetGitopsApplicationsApplicationSpecSourceKsonnetResult
    {
        /// <summary>
        /// Ksonnet application environment name.
        /// </summary>
        public readonly string? Environment;
        /// <summary>
        /// List of ksonnet component parameter override values.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetGitopsApplicationsApplicationSpecSourceKsonnetParameterResult> Parameters;

        [OutputConstructor]
        private GetGitopsApplicationsApplicationSpecSourceKsonnetResult(
            string? environment,

            ImmutableArray<Outputs.GetGitopsApplicationsApplicationSpecSourceKsonnetParameterResult> parameters)
        {
            Environment = environment;
            Parameters = parameters;
        }
    }
}
