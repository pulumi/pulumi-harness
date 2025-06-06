// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Harness.Autostopping
{
    public static class GetSchedule
    {
        /// <summary>
        /// Data source for retrieving a fixed schedule for Harness AutoStopping rule
        /// </summary>
        public static Task<GetScheduleResult> InvokeAsync(GetScheduleArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetScheduleResult>("harness:autostopping/getSchedule:getSchedule", args ?? new GetScheduleArgs(), options.WithDefaults());

        /// <summary>
        /// Data source for retrieving a fixed schedule for Harness AutoStopping rule
        /// </summary>
        public static Output<GetScheduleResult> Invoke(GetScheduleInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetScheduleResult>("harness:autostopping/getSchedule:getSchedule", args ?? new GetScheduleInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// Data source for retrieving a fixed schedule for Harness AutoStopping rule
        /// </summary>
        public static Output<GetScheduleResult> Invoke(GetScheduleInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetScheduleResult>("harness:autostopping/getSchedule:getSchedule", args ?? new GetScheduleInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetScheduleArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Type of the schedule. Valid values are `uptime` and `downtime`
        /// </summary>
        [Input("scheduleType", required: true)]
        public string ScheduleType { get; set; } = null!;

        public GetScheduleArgs()
        {
        }
        public static new GetScheduleArgs Empty => new GetScheduleArgs();
    }

    public sealed class GetScheduleInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Type of the schedule. Valid values are `uptime` and `downtime`
        /// </summary>
        [Input("scheduleType", required: true)]
        public Input<string> ScheduleType { get; set; } = null!;

        public GetScheduleInvokeArgs()
        {
        }
        public static new GetScheduleInvokeArgs Empty => new GetScheduleInvokeArgs();
    }


    [OutputType]
    public sealed class GetScheduleResult
    {
        /// <summary>
        /// Time until which schedule will be active. Need to be in YYYY-MM-DD HH:mm:SS format. Eg 2006-01-02 15:04:05
        /// </summary>
        public readonly string EndingOn;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// Unique identifier of the schedule
        /// </summary>
        public readonly double Identifier;
        /// <summary>
        /// Name of the schedule
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// For defining periodic schedule. Periodic nature will be applicable from the time of creation of schedule, unless specific 'time_period' is specified
        /// </summary>
        public readonly ImmutableArray<Outputs.GetScheduleRepeatResult> Repeats;
        /// <summary>
        /// ID of AutoStopping rules on which the schedule applies
        /// </summary>
        public readonly ImmutableArray<double> Rules;
        /// <summary>
        /// Type of the schedule. Valid values are `uptime` and `downtime`
        /// </summary>
        public readonly string ScheduleType;
        /// <summary>
        /// Time from which schedule will be active. Schedule will take immediate effect if starting_from is not specified. Need to be in YYYY-MM-DD HH:mm:SS format. Eg 2006-01-02 15:04:05
        /// </summary>
        public readonly string StartingFrom;
        /// <summary>
        /// Time zone in which schedule needs to be executed
        /// </summary>
        public readonly string TimeZone;

        [OutputConstructor]
        private GetScheduleResult(
            string endingOn,

            string id,

            double identifier,

            string name,

            ImmutableArray<Outputs.GetScheduleRepeatResult> repeats,

            ImmutableArray<double> rules,

            string scheduleType,

            string startingFrom,

            string timeZone)
        {
            EndingOn = endingOn;
            Id = id;
            Identifier = identifier;
            Name = name;
            Repeats = repeats;
            Rules = rules;
            ScheduleType = scheduleType;
            StartingFrom = startingFrom;
            TimeZone = timeZone;
        }
    }
}
