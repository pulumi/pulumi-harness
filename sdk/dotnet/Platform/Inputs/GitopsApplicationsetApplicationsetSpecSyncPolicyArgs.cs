// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Harness.Platform.Inputs
{

    public sealed class GitopsApplicationsetApplicationsetSpecSyncPolicyArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Represents the policy applied on the generated applications. Possible values are create-only, create-update, create-delete, and sync.
        /// </summary>
        [Input("applicationsSync")]
        public Input<string>? ApplicationsSync { get; set; }

        /// <summary>
        /// Label selector used to narrow the scope of targeted clusters.
        /// </summary>
        [Input("preserveResourcesOnDeletion")]
        public Input<bool>? PreserveResourcesOnDeletion { get; set; }

        public GitopsApplicationsetApplicationsetSpecSyncPolicyArgs()
        {
        }
        public static new GitopsApplicationsetApplicationsetSpecSyncPolicyArgs Empty => new GitopsApplicationsetApplicationsetSpecSyncPolicyArgs();
    }
}
