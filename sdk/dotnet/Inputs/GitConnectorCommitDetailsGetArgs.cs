// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Harness.Inputs
{

    public sealed class GitConnectorCommitDetailsGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The email id of the author
        /// </summary>
        [Input("authorEmailId")]
        public Input<string>? AuthorEmailId { get; set; }

        /// <summary>
        /// The name of the author
        /// </summary>
        [Input("authorName")]
        public Input<string>? AuthorName { get; set; }

        /// <summary>
        /// Commit message
        /// </summary>
        [Input("message")]
        public Input<string>? Message { get; set; }

        public GitConnectorCommitDetailsGetArgs()
        {
        }
        public static new GitConnectorCommitDetailsGetArgs Empty => new GitConnectorCommitDetailsGetArgs();
    }
}
