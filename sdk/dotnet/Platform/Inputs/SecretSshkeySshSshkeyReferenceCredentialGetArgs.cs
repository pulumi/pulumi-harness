// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Harness.Platform.Inputs
{

    public sealed class SecretSshkeySshSshkeyReferenceCredentialGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Encrypted Passphrase. To reference a encryptedPassphrase at the organization scope, prefix 'org' to the expression: org.{identifier}. To reference a encryptedPassPhrase at the account scope, prefix 'account` to the expression: account.{identifier}
        /// </summary>
        [Input("encryptedPassphrase")]
        public Input<string>? EncryptedPassphrase { get; set; }

        /// <summary>
        /// SSH key. To reference a key at the organization scope, prefix 'org' to the expression: org.{identifier}. To reference a key at the account scope, prefix 'account` to the expression: account.{identifier}
        /// </summary>
        [Input("key", required: true)]
        public Input<string> Key { get; set; } = null!;

        /// <summary>
        /// SSH Username.
        /// </summary>
        [Input("userName", required: true)]
        public Input<string> UserName { get; set; } = null!;

        public SecretSshkeySshSshkeyReferenceCredentialGetArgs()
        {
        }
        public static new SecretSshkeySshSshkeyReferenceCredentialGetArgs Empty => new SecretSshkeySshSshkeyReferenceCredentialGetArgs();
    }
}
