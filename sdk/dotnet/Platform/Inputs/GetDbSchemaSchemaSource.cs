// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Harness.Platform.Inputs
{

    public sealed class GetDbSchemaSchemaSourceArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// If connector type is artifactory, path to the archive file which contains the changeLog
        /// </summary>
        [Input("archivePath", required: true)]
        public string ArchivePath { get; set; } = null!;

        /// <summary>
        /// Connector to repository at which to find details about the database schema
        /// </summary>
        [Input("connector", required: true)]
        public string Connector { get; set; } = null!;

        /// <summary>
        /// The path within the specified repository at which to find details about the database schema
        /// </summary>
        [Input("location", required: true)]
        public string Location { get; set; } = null!;

        /// <summary>
        /// If connector url is of account, which repository to connect to using the connector
        /// </summary>
        [Input("repo", required: true)]
        public string Repo { get; set; } = null!;

        public GetDbSchemaSchemaSourceArgs()
        {
        }
        public static new GetDbSchemaSchemaSourceArgs Empty => new GetDbSchemaSchemaSourceArgs();
    }
}
