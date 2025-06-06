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
    public sealed class GetPolicySetPolicyResult
    {
        /// <summary>
        /// Account Identifier of the account
        /// </summary>
        public readonly string Identifier;
        /// <summary>
        /// Policy failure response - 'warning' for continuation, 'error' for exit
        /// </summary>
        public readonly string Severity;

        [OutputConstructor]
        private GetPolicySetPolicyResult(
            string identifier,

            string severity)
        {
            Identifier = identifier;
            Severity = severity;
        }
    }
}
