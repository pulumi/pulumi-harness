// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Harness.Platform.Inputs
{

    public sealed class GitopsApplicationsetApplicationsetSpecTemplateSpecGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Reference to the Kubernetes server and namespace in which the application will be deployed.
        /// </summary>
        [Input("destination", required: true)]
        public Input<Inputs.GitopsApplicationsetApplicationsetSpecTemplateSpecDestinationGetArgs> Destination { get; set; } = null!;

        [Input("ignoreDifferences")]
        private InputList<Inputs.GitopsApplicationsetApplicationsetSpecTemplateSpecIgnoreDifferenceGetArgs>? _ignoreDifferences;

        /// <summary>
        /// Resources and their fields which should be ignored during comparison. More info: https://argo-cd.readthedocs.io/en/stable/user-guide/diffing/#application-level-configuration.
        /// </summary>
        public InputList<Inputs.GitopsApplicationsetApplicationsetSpecTemplateSpecIgnoreDifferenceGetArgs> IgnoreDifferences
        {
            get => _ignoreDifferences ?? (_ignoreDifferences = new InputList<Inputs.GitopsApplicationsetApplicationsetSpecTemplateSpecIgnoreDifferenceGetArgs>());
            set => _ignoreDifferences = value;
        }

        [Input("infos")]
        private InputList<Inputs.GitopsApplicationsetApplicationsetSpecTemplateSpecInfoGetArgs>? _infos;

        /// <summary>
        /// List of information (URLs, email addresses, and plain text) that relates to the application.
        /// </summary>
        public InputList<Inputs.GitopsApplicationsetApplicationsetSpecTemplateSpecInfoGetArgs> Infos
        {
            get => _infos ?? (_infos = new InputList<Inputs.GitopsApplicationsetApplicationsetSpecTemplateSpecInfoGetArgs>());
            set => _infos = value;
        }

        /// <summary>
        /// The project the application belongs to.
        /// </summary>
        [Input("project")]
        public Input<string>? Project { get; set; }

        /// <summary>
        /// Limits the number of items kept in the application's revision history, which is used for informational purposes as well as for rollbacks to previous versions. This should only be changed in exceptional circumstances. Setting to zero will store no history. This will reduce storage used. Increasing will increase the space used to store the history, so we do not recommend increasing it. Default is 10.
        /// </summary>
        [Input("revisionHistoryLimit")]
        public Input<int>? RevisionHistoryLimit { get; set; }

        [Input("source", required: true)]
        private InputList<Inputs.GitopsApplicationsetApplicationsetSpecTemplateSpecSourceGetArgs>? _source;

        /// <summary>
        /// Location of the application's manifests or chart.
        /// </summary>
        public InputList<Inputs.GitopsApplicationsetApplicationsetSpecTemplateSpecSourceGetArgs> Source
        {
            get => _source ?? (_source = new InputList<Inputs.GitopsApplicationsetApplicationsetSpecTemplateSpecSourceGetArgs>());
            set => _source = value;
        }

        [Input("sources")]
        private InputList<Inputs.GitopsApplicationsetApplicationsetSpecTemplateSpecSourceGetArgs>? _sources;

        /// <summary>
        /// Location of the application's manifests or chart. Use when specifying multiple fields
        /// </summary>
        public InputList<Inputs.GitopsApplicationsetApplicationsetSpecTemplateSpecSourceGetArgs> Sources
        {
            get => _sources ?? (_sources = new InputList<Inputs.GitopsApplicationsetApplicationsetSpecTemplateSpecSourceGetArgs>());
            set => _sources = value;
        }

        /// <summary>
        /// Controls when and how a sync will be performed.
        /// </summary>
        [Input("syncPolicy")]
        public Input<Inputs.GitopsApplicationsetApplicationsetSpecTemplateSpecSyncPolicyGetArgs>? SyncPolicy { get; set; }

        public GitopsApplicationsetApplicationsetSpecTemplateSpecGetArgs()
        {
        }
        public static new GitopsApplicationsetApplicationsetSpecTemplateSpecGetArgs Empty => new GitopsApplicationsetApplicationsetSpecTemplateSpecGetArgs();
    }
}
