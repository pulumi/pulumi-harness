// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Harness.Platform.Outputs
{

    [OutputType]
    public sealed class GithubConnectorCredentialsHttp
    {
        /// <summary>
        /// Reference to a secret containing the personal access to use for authentication. To reference a secret at the organization scope, prefix 'org' to the expression: org.{identifier}. To reference a secret at the account scope, prefix 'account` to the expression: account.{identifier}.
        /// </summary>
        public readonly string TokenRef;
        /// <summary>
        /// Username to use for authentication.
        /// </summary>
        public readonly string? Username;
        /// <summary>
        /// Reference to a secret containing the username to use for authentication. To reference a secret at the organization scope, prefix 'org' to the expression: org.{identifier}. To reference a secret at the account scope, prefix 'account` to the expression: account.{identifier}.
        /// </summary>
        public readonly string? UsernameRef;

        [OutputConstructor]
        private GithubConnectorCredentialsHttp(
            string tokenRef,

            string? username,

            string? usernameRef)
        {
            TokenRef = tokenRef;
            Username = username;
            UsernameRef = usernameRef;
        }
    }
}