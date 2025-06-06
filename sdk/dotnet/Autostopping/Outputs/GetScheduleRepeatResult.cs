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
    public sealed class GetScheduleRepeatResult
    {
        /// <summary>
        /// List of days on which schedule need to be active. Valid values are SUN, MON, TUE, WED, THU, FRI and SAT.
        /// </summary>
        public readonly ImmutableArray<string> Days;
        /// <summary>
        /// Ending time of schedule action on the day. Accepted format is HH:MM. Eg : 20:00 for 8pm
        /// </summary>
        public readonly string EndTime;
        /// <summary>
        /// Starting time of schedule action on the day. Accepted format is HH:MM. Eg : 13:15 for 01:15pm
        /// </summary>
        public readonly string StartTime;

        [OutputConstructor]
        private GetScheduleRepeatResult(
            ImmutableArray<string> days,

            string endTime,

            string startTime)
        {
            Days = days;
            EndTime = endTime;
            StartTime = startTime;
        }
    }
}
