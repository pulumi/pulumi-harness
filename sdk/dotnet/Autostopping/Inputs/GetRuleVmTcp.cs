// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Harness.Autostopping.Inputs
{

    public sealed class GetRuleVmTcpArgs : global::Pulumi.InvokeArgs
    {
        [Input("forwardRules")]
        private List<Inputs.GetRuleVmTcpForwardRuleArgs>? _forwardRules;

        /// <summary>
        /// Additional tcp forwarding rules
        /// </summary>
        public List<Inputs.GetRuleVmTcpForwardRuleArgs> ForwardRules
        {
            get => _forwardRules ?? (_forwardRules = new List<Inputs.GetRuleVmTcpForwardRuleArgs>());
            set => _forwardRules = value;
        }

        /// <summary>
        /// Id of the Proxy
        /// </summary>
        [Input("proxyId", required: true)]
        public string ProxyId { get; set; } = null!;

        [Input("rdps")]
        private List<Inputs.GetRuleVmTcpRdpArgs>? _rdps;

        /// <summary>
        /// RDP configuration
        /// </summary>
        public List<Inputs.GetRuleVmTcpRdpArgs> Rdps
        {
            get => _rdps ?? (_rdps = new List<Inputs.GetRuleVmTcpRdpArgs>());
            set => _rdps = value;
        }

        [Input("sshes")]
        private List<Inputs.GetRuleVmTcpSshArgs>? _sshes;

        /// <summary>
        /// SSH configuration
        /// </summary>
        public List<Inputs.GetRuleVmTcpSshArgs> Sshes
        {
            get => _sshes ?? (_sshes = new List<Inputs.GetRuleVmTcpSshArgs>());
            set => _sshes = value;
        }

        public GetRuleVmTcpArgs()
        {
        }
        public static new GetRuleVmTcpArgs Empty => new GetRuleVmTcpArgs();
    }
}
