// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Harness.Platform.Outputs
{

    [OutputType]
    public sealed class GetBitbucketConnectorApiAuthenticationResult
    {
        /// <summary>
        /// Personal access token for interacting with the BitBucket api. To reference a secret at the organization scope, prefix 'org' to the expression: org.{identifier}. To reference a secret at the account scope, prefix 'account` to the expression: account.{identifier}.
        /// </summary>
        public readonly string TokenRef;
        /// <summary>
        /// The username used for connecting to the api.
        /// </summary>
        public readonly string Username;
        /// <summary>
        /// The name of the Harness secret containing the username. To reference a secret at the organization scope, prefix 'org' to the expression: org.{identifier}. To reference a secret at the account scope, prefix 'account` to the expression: account.{identifier}.
        /// </summary>
        public readonly string UsernameRef;

        [OutputConstructor]
        private GetBitbucketConnectorApiAuthenticationResult(
            string tokenRef,

            string username,

            string usernameRef)
        {
            TokenRef = tokenRef;
            Username = username;
            UsernameRef = usernameRef;
        }
    }
}
