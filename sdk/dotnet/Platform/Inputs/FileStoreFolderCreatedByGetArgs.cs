// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Harness.Platform.Inputs
{

    public sealed class FileStoreFolderCreatedByGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// User email
        /// </summary>
        [Input("email")]
        public Input<string>? Email { get; set; }

        /// <summary>
        /// User name
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        public FileStoreFolderCreatedByGetArgs()
        {
        }
        public static new FileStoreFolderCreatedByGetArgs Empty => new FileStoreFolderCreatedByGetArgs();
    }
}
