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
    public sealed class GitopsAppProjectProjectSpecRoleJwtToken
    {
        /// <summary>
        /// Expiration time of the JWT token.
        /// </summary>
        public readonly string? Exp;
        /// <summary>
        /// Issued At time of the JWT token.
        /// </summary>
        public readonly string? Iat;
        /// <summary>
        /// ID of the JWT token.
        /// </summary>
        public readonly string? Id;

        [OutputConstructor]
        private GitopsAppProjectProjectSpecRoleJwtToken(
            string? exp,

            string? iat,

            string? id)
        {
            Exp = exp;
            Iat = iat;
            Id = id;
        }
    }
}
