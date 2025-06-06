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
    public sealed class GitOpsAgentMetadata
    {
        /// <summary>
        /// Indicates if the agent is deployed in HA mode.
        /// </summary>
        public readonly bool? HighAvailability;
        /// <summary>
        /// Indicates if the agent is namespaced.
        /// </summary>
        public readonly bool? IsNamespaced;
        /// <summary>
        /// The kubernetes namespace where the agent should be installed.
        /// </summary>
        public readonly string? Namespace;

        [OutputConstructor]
        private GitOpsAgentMetadata(
            bool? highAvailability,

            bool? isNamespaced,

            string? @namespace)
        {
            HighAvailability = highAvailability;
            IsNamespaced = isNamespaced;
            Namespace = @namespace;
        }
    }
}
