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
    public sealed class HarRegistryConfigAuth
    {
        /// <summary>
        /// Type of authentication (UserPassword, Anonymous)
        /// </summary>
        public readonly string AuthType;
        /// <summary>
        /// Secret identifier for UserPassword auth type
        /// </summary>
        public readonly string? SecretIdentifier;
        /// <summary>
        /// Secret space path for UserPassword auth type
        /// </summary>
        public readonly string? SecretSpacePath;
        /// <summary>
        /// User name for UserPassword auth type
        /// </summary>
        public readonly string? UserName;

        [OutputConstructor]
        private HarRegistryConfigAuth(
            string authType,

            string? secretIdentifier,

            string? secretSpacePath,

            string? userName)
        {
            AuthType = authType;
            SecretIdentifier = secretIdentifier;
            SecretSpacePath = secretSpacePath;
            UserName = userName;
        }
    }
}
