// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Harness.Autostopping.Inputs
{

    public sealed class RuleVmTcpArgs : global::Pulumi.ResourceArgs
    {
        [Input("forwardRules")]
        private InputList<Inputs.RuleVmTcpForwardRuleArgs>? _forwardRules;

        /// <summary>
        /// Additional tcp forwarding rules
        /// </summary>
        public InputList<Inputs.RuleVmTcpForwardRuleArgs> ForwardRules
        {
            get => _forwardRules ?? (_forwardRules = new InputList<Inputs.RuleVmTcpForwardRuleArgs>());
            set => _forwardRules = value;
        }

        /// <summary>
        /// Id of the Proxy
        /// </summary>
        [Input("proxyId", required: true)]
        public Input<string> ProxyId { get; set; } = null!;

        [Input("rdps")]
        private InputList<Inputs.RuleVmTcpRdpArgs>? _rdps;

        /// <summary>
        /// RDP configuration
        /// </summary>
        public InputList<Inputs.RuleVmTcpRdpArgs> Rdps
        {
            get => _rdps ?? (_rdps = new InputList<Inputs.RuleVmTcpRdpArgs>());
            set => _rdps = value;
        }

        [Input("sshes")]
        private InputList<Inputs.RuleVmTcpSshArgs>? _sshes;

        /// <summary>
        /// SSH configuration
        /// </summary>
        public InputList<Inputs.RuleVmTcpSshArgs> Sshes
        {
            get => _sshes ?? (_sshes = new InputList<Inputs.RuleVmTcpSshArgs>());
            set => _sshes = value;
        }

        public RuleVmTcpArgs()
        {
        }
        public static new RuleVmTcpArgs Empty => new RuleVmTcpArgs();
    }
}