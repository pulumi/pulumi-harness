// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Harness.Outputs
{

    [OutputType]
    public sealed class SshCredentialSshAuthenticationServerPassword
    {
        /// <summary>
        /// The id of the encrypted secret
        /// </summary>
        public readonly string PasswordSecretId;

        [OutputConstructor]
        private SshCredentialSshAuthenticationServerPassword(string passwordSecretId)
        {
            PasswordSecretId = passwordSecretId;
        }
    }
}
