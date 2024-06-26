// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Harness.Platform.Outputs
{

    [OutputType]
    public sealed class GitOpsGnupgRequestPublickey
    {
        /// <summary>
        /// Fingerprint is the fingerprint of the key
        /// </summary>
        public readonly string? Fingerprint;
        /// <summary>
        /// KeyData holds the raw key data, in base64 encoded format
        /// </summary>
        public readonly string KeyData;
        /// <summary>
        /// KeyID specifies the key ID, in hexadecimal string format.
        /// </summary>
        public readonly string? KeyId;
        /// <summary>
        /// Owner holds the owner identification, e.g. a name and e-mail address
        /// </summary>
        public readonly string? Owner;
        /// <summary>
        /// SubType holds the key's sub type
        /// </summary>
        public readonly string? SubType;
        /// <summary>
        /// Trust holds the level of trust assigned to this key
        /// </summary>
        public readonly string? Trust;

        [OutputConstructor]
        private GitOpsGnupgRequestPublickey(
            string? fingerprint,

            string keyData,

            string? keyId,

            string? owner,

            string? subType,

            string? trust)
        {
            Fingerprint = fingerprint;
            KeyData = keyData;
            KeyId = keyId;
            Owner = owner;
            SubType = subType;
            Trust = trust;
        }
    }
}