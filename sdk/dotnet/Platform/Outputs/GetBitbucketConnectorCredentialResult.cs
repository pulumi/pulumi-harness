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
    public sealed class GetBitbucketConnectorCredentialResult
    {
        /// <summary>
        /// Authenticate using Username and password over http(s) for the connection.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetBitbucketConnectorCredentialHttpResult> Https;
        /// <summary>
        /// Authenticate using SSH for the connection.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetBitbucketConnectorCredentialSshResult> Sshes;

        [OutputConstructor]
        private GetBitbucketConnectorCredentialResult(
            ImmutableArray<Outputs.GetBitbucketConnectorCredentialHttpResult> https,

            ImmutableArray<Outputs.GetBitbucketConnectorCredentialSshResult> sshes)
        {
            Https = https;
            Sshes = sshes;
        }
    }
}
