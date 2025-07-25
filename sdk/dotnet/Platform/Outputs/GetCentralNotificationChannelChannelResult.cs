// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Harness.Platform.Outputs
{

    [OutputType]
    public sealed class GetCentralNotificationChannelChannelResult
    {
        /// <summary>
        /// API key for the webhook or integration.
        /// </summary>
        public readonly string? ApiKey;
        /// <summary>
        /// List of Datadog webhook URLs.
        /// </summary>
        public readonly ImmutableArray<string> DatadogUrls;
        /// <summary>
        /// List of delegate selectors to use for sending notifications.
        /// </summary>
        public readonly ImmutableArray<string> DelegateSelectors;
        /// <summary>
        /// List of email addresses to notify.
        /// </summary>
        public readonly ImmutableArray<string> EmailIds;
        /// <summary>
        /// Whether to execute the notification logic on delegate.
        /// </summary>
        public readonly bool? ExecuteOnDelegate;
        /// <summary>
        /// Custom HTTP headers to include in webhook requests.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetCentralNotificationChannelChannelHeaderResult> Headers;
        /// <summary>
        /// List of Microsoft Teams integration keys.
        /// </summary>
        public readonly ImmutableArray<string> MsTeamKeys;
        /// <summary>
        /// List of PagerDuty integration keys.
        /// </summary>
        public readonly ImmutableArray<string> PagerDutyIntegrationKeys;
        /// <summary>
        /// List of Slack webhook URLs to send notifications to.
        /// </summary>
        public readonly ImmutableArray<string> SlackWebhookUrls;
        /// <summary>
        /// List of user groups to notify.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetCentralNotificationChannelChannelUserGroupResult> UserGroups;
        /// <summary>
        /// List of generic webhook URLs.
        /// </summary>
        public readonly ImmutableArray<string> WebhookUrls;

        [OutputConstructor]
        private GetCentralNotificationChannelChannelResult(
            string? apiKey,

            ImmutableArray<string> datadogUrls,

            ImmutableArray<string> delegateSelectors,

            ImmutableArray<string> emailIds,

            bool? executeOnDelegate,

            ImmutableArray<Outputs.GetCentralNotificationChannelChannelHeaderResult> headers,

            ImmutableArray<string> msTeamKeys,

            ImmutableArray<string> pagerDutyIntegrationKeys,

            ImmutableArray<string> slackWebhookUrls,

            ImmutableArray<Outputs.GetCentralNotificationChannelChannelUserGroupResult> userGroups,

            ImmutableArray<string> webhookUrls)
        {
            ApiKey = apiKey;
            DatadogUrls = datadogUrls;
            DelegateSelectors = delegateSelectors;
            EmailIds = emailIds;
            ExecuteOnDelegate = executeOnDelegate;
            Headers = headers;
            MsTeamKeys = msTeamKeys;
            PagerDutyIntegrationKeys = pagerDutyIntegrationKeys;
            SlackWebhookUrls = slackWebhookUrls;
            UserGroups = userGroups;
            WebhookUrls = webhookUrls;
        }
    }
}
