// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Harness.Platform.Inputs
{

    public sealed class GitConnectorCredentialsGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Authenticate using Username and password over http(s) for the connection.
        /// </summary>
        [Input("http")]
        public Input<Inputs.GitConnectorCredentialsHttpGetArgs>? Http { get; set; }

        /// <summary>
        /// Authenticate using SSH for the connection.
        /// </summary>
        [Input("ssh")]
        public Input<Inputs.GitConnectorCredentialsSshGetArgs>? Ssh { get; set; }

        public GitConnectorCredentialsGetArgs()
        {
        }
        public static new GitConnectorCredentialsGetArgs Empty => new GitConnectorCredentialsGetArgs();
    }
}
