// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Harness.Platform.Inputs
{

    public sealed class GetCentralNotificationRuleNotificationConditionNotificationEventConfigArgs : global::Pulumi.InvokeArgs
    {
        [Input("notificationEntity", required: true)]
        public string NotificationEntity { get; set; } = null!;

        [Input("notificationEvent", required: true)]
        public string NotificationEvent { get; set; } = null!;

        [Input("notificationEventData")]
        private Dictionary<string, string>? _notificationEventData;
        public Dictionary<string, string> NotificationEventData
        {
            get => _notificationEventData ?? (_notificationEventData = new Dictionary<string, string>());
            set => _notificationEventData = value;
        }

        public GetCentralNotificationRuleNotificationConditionNotificationEventConfigArgs()
        {
        }
        public static new GetCentralNotificationRuleNotificationConditionNotificationEventConfigArgs Empty => new GetCentralNotificationRuleNotificationConditionNotificationEventConfigArgs();
    }
}
