// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Harness.Platform.Inputs
{

    public sealed class DockerConnectorCredentialsArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The reference to the Harness secret containing the password to use for the docker registry. To reference a secret at the organization scope, prefix 'org' to the expression: org.{identifier}. To reference a secret at the account scope, prefix 'account` to the expression: account.{identifier}. To reference a secret at the project scope, use directly without any prefix.
        /// </summary>
        [Input("passwordRef", required: true)]
        public Input<string> PasswordRef { get; set; } = null!;

        /// <summary>
        /// The username to use for the docker registry.
        /// </summary>
        [Input("username")]
        public Input<string>? Username { get; set; }

        /// <summary>
        /// The reference to the Harness secret containing the username to use for the docker registry. To reference a secret at the organization scope, prefix 'org' to the expression: org.{identifier}. To reference a secret at the account scope, prefix 'account` to the expression: account.{identifier}.
        /// </summary>
        [Input("usernameRef")]
        public Input<string>? UsernameRef { get; set; }

        public DockerConnectorCredentialsArgs()
        {
        }
        public static new DockerConnectorCredentialsArgs Empty => new DockerConnectorCredentialsArgs();
    }
}
