// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Harness.Platform.Inputs
{

    public sealed class GithubConnectorCredentialsGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Authenticate using Username and password over http(s) for the connection.
        /// </summary>
        [Input("http")]
        public Input<Inputs.GithubConnectorCredentialsHttpGetArgs>? Http { get; set; }

        /// <summary>
        /// Authenticate using SSH for the connection.
        /// </summary>
        [Input("ssh")]
        public Input<Inputs.GithubConnectorCredentialsSshGetArgs>? Ssh { get; set; }

        public GithubConnectorCredentialsGetArgs()
        {
        }
        public static new GithubConnectorCredentialsGetArgs Empty => new GithubConnectorCredentialsGetArgs();
    }
}
