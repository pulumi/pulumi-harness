// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Harness.Platform.Inputs
{

    public sealed class AwsKmsConnectorCredentialsOidcAuthenticationArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ARN of the IAM role to assume.
        /// </summary>
        [Input("iamRoleArn", required: true)]
        public Input<string> IamRoleArn { get; set; } = null!;

        public AwsKmsConnectorCredentialsOidcAuthenticationArgs()
        {
        }
        public static new AwsKmsConnectorCredentialsOidcAuthenticationArgs Empty => new AwsKmsConnectorCredentialsOidcAuthenticationArgs();
    }
}
