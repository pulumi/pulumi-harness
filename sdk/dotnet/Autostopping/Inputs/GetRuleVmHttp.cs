// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Harness.Autostopping.Inputs
{

    public sealed class GetRuleVmHttpArgs : global::Pulumi.InvokeArgs
    {
        [Input("healths")]
        private List<Inputs.GetRuleVmHttpHealthArgs>? _healths;

        /// <summary>
        /// Health Check Details
        /// </summary>
        public List<Inputs.GetRuleVmHttpHealthArgs> Healths
        {
            get => _healths ?? (_healths = new List<Inputs.GetRuleVmHttpHealthArgs>());
            set => _healths = value;
        }

        /// <summary>
        /// Id of the proxy
        /// </summary>
        [Input("proxyId", required: true)]
        public string ProxyId { get; set; } = null!;

        [Input("routings")]
        private List<Inputs.GetRuleVmHttpRoutingArgs>? _routings;

        /// <summary>
        /// Routing configuration used to access the instances
        /// </summary>
        public List<Inputs.GetRuleVmHttpRoutingArgs> Routings
        {
            get => _routings ?? (_routings = new List<Inputs.GetRuleVmHttpRoutingArgs>());
            set => _routings = value;
        }

        public GetRuleVmHttpArgs()
        {
        }
        public static new GetRuleVmHttpArgs Empty => new GetRuleVmHttpArgs();
    }
}
