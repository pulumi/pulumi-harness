// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Harness.Platform.Inputs
{

    public sealed class AwsKmsConnectorCredentialsAssumeRoleGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The duration, in seconds, of the role session. The value can range from 900 seconds (15 minutes) to 3600 seconds (1 hour). By default, the value is set to 3600 seconds. An expiration can also be specified in the client request body. The minimum value is 1 hour.
        /// </summary>
        [Input("duration", required: true)]
        public Input<int> Duration { get; set; } = null!;

        /// <summary>
        /// If the administrator of the account to which the role belongs provided you with an external ID, then enter that value.
        /// </summary>
        [Input("externalId")]
        public Input<string>? ExternalId { get; set; }

        /// <summary>
        /// The ARN of the role to assume.
        /// </summary>
        [Input("roleArn", required: true)]
        public Input<string> RoleArn { get; set; } = null!;

        public AwsKmsConnectorCredentialsAssumeRoleGetArgs()
        {
        }
        public static new AwsKmsConnectorCredentialsAssumeRoleGetArgs Empty => new AwsKmsConnectorCredentialsAssumeRoleGetArgs();
    }
}
