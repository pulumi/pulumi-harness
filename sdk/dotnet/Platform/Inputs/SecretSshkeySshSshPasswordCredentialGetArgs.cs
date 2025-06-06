// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Harness.Platform.Inputs
{

    public sealed class SecretSshkeySshSshPasswordCredentialGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// SSH Password. To reference a password at the organization scope, prefix 'org' to the expression: org.{identifier}. To reference a password at the account scope, prefix 'account` to the expression: account.{identifier}
        /// </summary>
        [Input("password", required: true)]
        public Input<string> Password { get; set; } = null!;

        /// <summary>
        /// SSH Username.
        /// </summary>
        [Input("userName", required: true)]
        public Input<string> UserName { get; set; } = null!;

        public SecretSshkeySshSshPasswordCredentialGetArgs()
        {
        }
        public static new SecretSshkeySshSshPasswordCredentialGetArgs Empty => new SecretSshkeySshSshPasswordCredentialGetArgs();
    }
}
