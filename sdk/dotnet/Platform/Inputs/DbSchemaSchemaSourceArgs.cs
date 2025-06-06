// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Harness.Platform.Inputs
{

    public sealed class DbSchemaSchemaSourceArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// If connector type is artifactory, path to the archive file which contains the changeLog
        /// </summary>
        [Input("archivePath")]
        public Input<string>? ArchivePath { get; set; }

        /// <summary>
        /// Connector to repository at which to find details about the database schema
        /// </summary>
        [Input("connector", required: true)]
        public Input<string> Connector { get; set; } = null!;

        /// <summary>
        /// The path within the specified repository at which to find details about the database schema
        /// </summary>
        [Input("location", required: true)]
        public Input<string> Location { get; set; } = null!;

        /// <summary>
        /// If connector url is of account, which repository to connect to using the connector
        /// </summary>
        [Input("repo")]
        public Input<string>? Repo { get; set; }

        public DbSchemaSchemaSourceArgs()
        {
        }
        public static new DbSchemaSchemaSourceArgs Empty => new DbSchemaSchemaSourceArgs();
    }
}
