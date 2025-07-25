// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Harness.Platform
{
    /// <summary>
    /// Resource for managing Harness Notification Channels.
    /// </summary>
    [HarnessResourceType("harness:platform/centralNotificationChannel:CentralNotificationChannel")]
    public partial class CentralNotificationChannel : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Account identifier associated with this notification channel.
        /// </summary>
        [Output("account")]
        public Output<string> Account { get; private set; } = null!;

        [Output("channel")]
        public Output<Outputs.CentralNotificationChannelChannel> Channel { get; private set; } = null!;

        /// <summary>
        /// Timestamp when the notification channel was created.
        /// </summary>
        [Output("created")]
        public Output<int> Created { get; private set; } = null!;

        [Output("identifier")]
        public Output<string> Identifier { get; private set; } = null!;

        /// <summary>
        /// Timestamp when the notification channel was last modified.
        /// </summary>
        [Output("lastModified")]
        public Output<int> LastModified { get; private set; } = null!;

        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        [Output("notificationChannelType")]
        public Output<string> NotificationChannelType { get; private set; } = null!;

        [Output("org")]
        public Output<string?> Org { get; private set; } = null!;

        [Output("project")]
        public Output<string?> Project { get; private set; } = null!;

        [Output("status")]
        public Output<string?> Status { get; private set; } = null!;


        /// <summary>
        /// Create a CentralNotificationChannel resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public CentralNotificationChannel(string name, CentralNotificationChannelArgs args, CustomResourceOptions? options = null)
            : base("harness:platform/centralNotificationChannel:CentralNotificationChannel", name, args ?? new CentralNotificationChannelArgs(), MakeResourceOptions(options, ""))
        {
        }

        private CentralNotificationChannel(string name, Input<string> id, CentralNotificationChannelState? state = null, CustomResourceOptions? options = null)
            : base("harness:platform/centralNotificationChannel:CentralNotificationChannel", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
                PluginDownloadURL = "github://api.github.com/pulumi",
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing CentralNotificationChannel resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static CentralNotificationChannel Get(string name, Input<string> id, CentralNotificationChannelState? state = null, CustomResourceOptions? options = null)
        {
            return new CentralNotificationChannel(name, id, state, options);
        }
    }

    public sealed class CentralNotificationChannelArgs : global::Pulumi.ResourceArgs
    {
        [Input("channel", required: true)]
        public Input<Inputs.CentralNotificationChannelChannelArgs> Channel { get; set; } = null!;

        [Input("identifier", required: true)]
        public Input<string> Identifier { get; set; } = null!;

        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("notificationChannelType", required: true)]
        public Input<string> NotificationChannelType { get; set; } = null!;

        [Input("org")]
        public Input<string>? Org { get; set; }

        [Input("project")]
        public Input<string>? Project { get; set; }

        [Input("status")]
        public Input<string>? Status { get; set; }

        public CentralNotificationChannelArgs()
        {
        }
        public static new CentralNotificationChannelArgs Empty => new CentralNotificationChannelArgs();
    }

    public sealed class CentralNotificationChannelState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Account identifier associated with this notification channel.
        /// </summary>
        [Input("account")]
        public Input<string>? Account { get; set; }

        [Input("channel")]
        public Input<Inputs.CentralNotificationChannelChannelGetArgs>? Channel { get; set; }

        /// <summary>
        /// Timestamp when the notification channel was created.
        /// </summary>
        [Input("created")]
        public Input<int>? Created { get; set; }

        [Input("identifier")]
        public Input<string>? Identifier { get; set; }

        /// <summary>
        /// Timestamp when the notification channel was last modified.
        /// </summary>
        [Input("lastModified")]
        public Input<int>? LastModified { get; set; }

        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("notificationChannelType")]
        public Input<string>? NotificationChannelType { get; set; }

        [Input("org")]
        public Input<string>? Org { get; set; }

        [Input("project")]
        public Input<string>? Project { get; set; }

        [Input("status")]
        public Input<string>? Status { get; set; }

        public CentralNotificationChannelState()
        {
        }
        public static new CentralNotificationChannelState Empty => new CentralNotificationChannelState();
    }
}
