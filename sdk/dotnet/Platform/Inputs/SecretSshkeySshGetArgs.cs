// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Harness.Platform.Inputs
{

    public sealed class SecretSshkeySshGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// This specifies SSH credential type as Password, KeyPath or KeyReference
        /// </summary>
        [Input("credentialType", required: true)]
        public Input<string> CredentialType { get; set; } = null!;

        /// <summary>
        /// SSH credential of type keyReference
        /// </summary>
        [Input("sshPasswordCredential")]
        public Input<Inputs.SecretSshkeySshSshPasswordCredentialGetArgs>? SshPasswordCredential { get; set; }

        /// <summary>
        /// SSH credential of type keyPath
        /// </summary>
        [Input("sshkeyPathCredential")]
        public Input<Inputs.SecretSshkeySshSshkeyPathCredentialGetArgs>? SshkeyPathCredential { get; set; }

        /// <summary>
        /// SSH credential of type keyReference
        /// </summary>
        [Input("sshkeyReferenceCredential")]
        public Input<Inputs.SecretSshkeySshSshkeyReferenceCredentialGetArgs>? SshkeyReferenceCredential { get; set; }

        public SecretSshkeySshGetArgs()
        {
        }
        public static new SecretSshkeySshGetArgs Empty => new SecretSshkeySshGetArgs();
    }
}
