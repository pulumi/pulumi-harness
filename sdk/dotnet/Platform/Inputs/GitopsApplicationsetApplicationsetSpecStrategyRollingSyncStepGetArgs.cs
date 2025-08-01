// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Harness.Platform.Inputs
{

    public sealed class GitopsApplicationsetApplicationsetSpecStrategyRollingSyncStepGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("matchExpressions")]
        private InputList<Inputs.GitopsApplicationsetApplicationsetSpecStrategyRollingSyncStepMatchExpressionGetArgs>? _matchExpressions;

        /// <summary>
        /// A list of label selector requirements. The requirements are ANDed.
        /// </summary>
        public InputList<Inputs.GitopsApplicationsetApplicationsetSpecStrategyRollingSyncStepMatchExpressionGetArgs> MatchExpressions
        {
            get => _matchExpressions ?? (_matchExpressions = new InputList<Inputs.GitopsApplicationsetApplicationsetSpecStrategyRollingSyncStepMatchExpressionGetArgs>());
            set => _matchExpressions = value;
        }

        /// <summary>
        /// Maximum number of simultaneous Application updates in a group. Supports both integer and percentage string values (rounds down, but floored at 1 Application for &gt;0%). Default is 100%, unbounded.
        /// </summary>
        [Input("maxUpdate")]
        public Input<string>? MaxUpdate { get; set; }

        public GitopsApplicationsetApplicationsetSpecStrategyRollingSyncStepGetArgs()
        {
        }
        public static new GitopsApplicationsetApplicationsetSpecStrategyRollingSyncStepGetArgs Empty => new GitopsApplicationsetApplicationsetSpecStrategyRollingSyncStepGetArgs();
    }
}
