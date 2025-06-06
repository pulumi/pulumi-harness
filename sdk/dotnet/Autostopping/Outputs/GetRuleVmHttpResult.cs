// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Harness.Autostopping.Outputs
{

    [OutputType]
    public sealed class GetRuleVmHttpResult
    {
        /// <summary>
        /// Health Check Details
        /// </summary>
        public readonly ImmutableArray<Outputs.GetRuleVmHttpHealthResult> Healths;
        /// <summary>
        /// Id of the proxy
        /// </summary>
        public readonly string ProxyId;
        /// <summary>
        /// Routing configuration used to access the instances
        /// </summary>
        public readonly ImmutableArray<Outputs.GetRuleVmHttpRoutingResult> Routings;

        [OutputConstructor]
        private GetRuleVmHttpResult(
            ImmutableArray<Outputs.GetRuleVmHttpHealthResult> healths,

            string proxyId,

            ImmutableArray<Outputs.GetRuleVmHttpRoutingResult> routings)
        {
            Healths = healths;
            ProxyId = proxyId;
            Routings = routings;
        }
    }
}
