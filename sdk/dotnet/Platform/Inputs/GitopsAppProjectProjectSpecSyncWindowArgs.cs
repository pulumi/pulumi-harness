// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Harness.Platform.Inputs
{

    public sealed class GitopsAppProjectProjectSpecSyncWindowArgs : global::Pulumi.ResourceArgs
    {
        [Input("applications")]
        private InputList<string>? _applications;

        /// <summary>
        /// Applications associated with synchronization window.
        /// </summary>
        public InputList<string> Applications
        {
            get => _applications ?? (_applications = new InputList<string>());
            set => _applications = value;
        }

        [Input("clusters")]
        private InputList<string>? _clusters;

        /// <summary>
        /// Clusters associated with synchronization window.
        /// </summary>
        public InputList<string> Clusters
        {
            get => _clusters ?? (_clusters = new InputList<string>());
            set => _clusters = value;
        }

        /// <summary>
        /// Duration of synchronization window.
        /// </summary>
        [Input("duration")]
        public Input<string>? Duration { get; set; }

        /// <summary>
        /// Kind of synchronization window.
        /// </summary>
        [Input("kind")]
        public Input<string>? Kind { get; set; }

        /// <summary>
        /// Whether manual synchronization is enabled.
        /// </summary>
        [Input("manualSync")]
        public Input<bool>? ManualSync { get; set; }

        [Input("namespaces")]
        private InputList<string>? _namespaces;

        /// <summary>
        /// Namespaces associated with synchronization window.
        /// </summary>
        public InputList<string> Namespaces
        {
            get => _namespaces ?? (_namespaces = new InputList<string>());
            set => _namespaces = value;
        }

        /// <summary>
        /// Schedule of synchronization window.
        /// </summary>
        [Input("schedule")]
        public Input<string>? Schedule { get; set; }

        /// <summary>
        /// Time zone of synchronization window.
        /// </summary>
        [Input("timeZone")]
        public Input<string>? TimeZone { get; set; }

        public GitopsAppProjectProjectSpecSyncWindowArgs()
        {
        }
        public static new GitopsAppProjectProjectSpecSyncWindowArgs Empty => new GitopsAppProjectProjectSpecSyncWindowArgs();
    }
}
