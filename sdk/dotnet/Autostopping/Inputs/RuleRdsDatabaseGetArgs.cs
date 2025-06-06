// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Harness.Autostopping.Inputs
{

    public sealed class RuleRdsDatabaseGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// ID of the database
        /// </summary>
        [Input("id", required: true)]
        public Input<string> Id { get; set; } = null!;

        /// <summary>
        /// Region to which database belong to
        /// </summary>
        [Input("region", required: true)]
        public Input<string> Region { get; set; } = null!;

        public RuleRdsDatabaseGetArgs()
        {
        }
        public static new RuleRdsDatabaseGetArgs Empty => new RuleRdsDatabaseGetArgs();
    }
}
