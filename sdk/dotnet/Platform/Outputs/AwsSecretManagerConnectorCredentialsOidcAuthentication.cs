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
    public sealed class AwsSecretManagerConnectorCredentialsOidcAuthentication
    {
        /// <summary>
        /// The IAM role ARN.
        /// </summary>
        public readonly string IamRoleArn;

        [OutputConstructor]
        private AwsSecretManagerConnectorCredentialsOidcAuthentication(string iamRoleArn)
        {
            IamRoleArn = iamRoleArn;
        }
    }
}
