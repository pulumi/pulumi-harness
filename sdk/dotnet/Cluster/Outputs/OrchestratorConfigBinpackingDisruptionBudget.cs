// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Harness.Cluster.Outputs
{

    [OutputType]
    public sealed class OrchestratorConfigBinpackingDisruptionBudget
    {
        /// <summary>
        /// Number or percentage of Nodes to consider for disruption
        /// </summary>
        public readonly string Nodes;
        /// <summary>
        /// Reasons for disruption
        /// </summary>
        public readonly ImmutableArray<string> Reasons;
        /// <summary>
        /// Schedule for disruption budget
        /// </summary>
        public readonly Outputs.OrchestratorConfigBinpackingDisruptionBudgetSchedule? Schedule;

        [OutputConstructor]
        private OrchestratorConfigBinpackingDisruptionBudget(
            string nodes,

            ImmutableArray<string> reasons,

            Outputs.OrchestratorConfigBinpackingDisruptionBudgetSchedule? schedule)
        {
            Nodes = nodes;
            Reasons = reasons;
            Schedule = schedule;
        }
    }
}
