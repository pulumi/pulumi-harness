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
    public sealed class GetRuleVmTcpResult
    {
        /// <summary>
        /// Additional tcp forwarding rules
        /// </summary>
        public readonly ImmutableArray<Outputs.GetRuleVmTcpForwardRuleResult> ForwardRules;
        /// <summary>
        /// Id of the Proxy
        /// </summary>
        public readonly string ProxyId;
        /// <summary>
        /// RDP configuration
        /// </summary>
        public readonly ImmutableArray<Outputs.GetRuleVmTcpRdpResult> Rdps;
        /// <summary>
        /// SSH configuration
        /// </summary>
        public readonly ImmutableArray<Outputs.GetRuleVmTcpSshResult> Sshes;

        [OutputConstructor]
        private GetRuleVmTcpResult(
            ImmutableArray<Outputs.GetRuleVmTcpForwardRuleResult> forwardRules,

            string proxyId,

            ImmutableArray<Outputs.GetRuleVmTcpRdpResult> rdps,

            ImmutableArray<Outputs.GetRuleVmTcpSshResult> sshes)
        {
            ForwardRules = forwardRules;
            ProxyId = proxyId;
            Rdps = rdps;
            Sshes = sshes;
        }
    }
}
