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
    public sealed class GetJiraConnectorAuthResult
    {
        /// <summary>
        /// Authentication types for Jira connector
        /// </summary>
        public readonly string AuthType;
        /// <summary>
        /// Authenticate using personal access token.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetJiraConnectorAuthPersonalAccessTokenResult> PersonalAccessTokens;
        /// <summary>
        /// Authenticate using username password.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetJiraConnectorAuthUsernamePasswordResult> UsernamePasswords;

        [OutputConstructor]
        private GetJiraConnectorAuthResult(
            string authType,

            ImmutableArray<Outputs.GetJiraConnectorAuthPersonalAccessTokenResult> personalAccessTokens,

            ImmutableArray<Outputs.GetJiraConnectorAuthUsernamePasswordResult> usernamePasswords)
        {
            AuthType = authType;
            PersonalAccessTokens = personalAccessTokens;
            UsernamePasswords = usernamePasswords;
        }
    }
}
