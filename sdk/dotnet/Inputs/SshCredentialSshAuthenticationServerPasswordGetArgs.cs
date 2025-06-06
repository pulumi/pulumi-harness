// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Harness.Inputs
{

    public sealed class SshCredentialSshAuthenticationServerPasswordGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The id of the encrypted secret
        /// </summary>
        [Input("passwordSecretId", required: true)]
        public Input<string> PasswordSecretId { get; set; } = null!;

        public SshCredentialSshAuthenticationServerPasswordGetArgs()
        {
        }
        public static new SshCredentialSshAuthenticationServerPasswordGetArgs Empty => new SshCredentialSshAuthenticationServerPasswordGetArgs();
    }
}
