// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Harness.Cluster.Inputs
{

    public sealed class OrchestratorConfigBinpackingDisruptionBudgetScheduleGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Duration for disruption budget
        /// </summary>
        [Input("duration", required: true)]
        public Input<string> Duration { get; set; } = null!;

        /// <summary>
        /// Frequency for disruption budget
        /// </summary>
        [Input("frequency", required: true)]
        public Input<string> Frequency { get; set; } = null!;

        public OrchestratorConfigBinpackingDisruptionBudgetScheduleGetArgs()
        {
        }
        public static new OrchestratorConfigBinpackingDisruptionBudgetScheduleGetArgs Empty => new OrchestratorConfigBinpackingDisruptionBudgetScheduleGetArgs();
    }
}
