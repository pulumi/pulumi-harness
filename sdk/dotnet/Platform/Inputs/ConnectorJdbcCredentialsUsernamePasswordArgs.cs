// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Harness.Platform.Inputs
{

    public sealed class ConnectorJdbcCredentialsUsernamePasswordArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Reference to a secret containing the password to use for authentication. To reference a secret at the organization scope, prefix 'org' to the expression: org.{identifier}. To reference a secret at the account scope, prefix 'account` to the expression: account.{identifier}.
        /// </summary>
        [Input("passwordRef", required: true)]
        public Input<string> PasswordRef { get; set; } = null!;

        /// <summary>
        /// Username to use for authentication.
        /// </summary>
        [Input("username")]
        public Input<string>? Username { get; set; }

        /// <summary>
        /// Reference to a secret containing the username to use for authentication. To reference a secret at the organization scope, prefix 'org' to the expression: org.{identifier}. To reference a secret at the account scope, prefix 'account` to the expression: account.{identifier}.
        /// </summary>
        [Input("usernameRef")]
        public Input<string>? UsernameRef { get; set; }

        public ConnectorJdbcCredentialsUsernamePasswordArgs()
        {
        }
        public static new ConnectorJdbcCredentialsUsernamePasswordArgs Empty => new ConnectorJdbcCredentialsUsernamePasswordArgs();
    }
}
