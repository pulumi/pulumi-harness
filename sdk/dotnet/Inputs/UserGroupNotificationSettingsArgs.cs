// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Harness.Inputs
{

    public sealed class UserGroupNotificationSettingsArgs : global::Pulumi.ResourceArgs
    {
        [Input("groupEmailAddresses")]
        private InputList<string>? _groupEmailAddresses;

        /// <summary>
        /// The email addresses of the user group.
        /// </summary>
        public InputList<string> GroupEmailAddresses
        {
            get => _groupEmailAddresses ?? (_groupEmailAddresses = new InputList<string>());
            set => _groupEmailAddresses = value;
        }

        /// <summary>
        /// The Microsoft Teams webhook URL of the user group.
        /// </summary>
        [Input("microsoftTeamsWebhookUrl")]
        public Input<string>? MicrosoftTeamsWebhookUrl { get; set; }

        /// <summary>
        /// Indicates whether an email is sent when a new user is added to the group.
        /// </summary>
        [Input("sendMailToNewMembers")]
        public Input<bool>? SendMailToNewMembers { get; set; }

        /// <summary>
        /// Enable this setting to have notifications sent to the members of this group.
        /// </summary>
        [Input("sendNotificationsToMembers")]
        public Input<bool>? SendNotificationsToMembers { get; set; }

        /// <summary>
        /// The Slack channel to send notifications to.
        /// </summary>
        [Input("slackChannel")]
        public Input<string>? SlackChannel { get; set; }

        /// <summary>
        /// The Slack webhook URL to send notifications to.
        /// </summary>
        [Input("slackWebhookUrl")]
        public Input<string>? SlackWebhookUrl { get; set; }

        public UserGroupNotificationSettingsArgs()
        {
        }
        public static new UserGroupNotificationSettingsArgs Empty => new UserGroupNotificationSettingsArgs();
    }
}
