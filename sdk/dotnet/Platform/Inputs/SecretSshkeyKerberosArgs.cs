// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Harness.Platform.Inputs
{

    public sealed class SecretSshkeyKerberosArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Username to use for authentication.
        /// </summary>
        [Input("principal", required: true)]
        public Input<string> Principal { get; set; } = null!;

        /// <summary>
        /// Reference to a secret containing the password to use for authentication.
        /// </summary>
        [Input("realm", required: true)]
        public Input<string> Realm { get; set; } = null!;

        /// <summary>
        /// Method to generate tgt
        /// </summary>
        [Input("tgtGenerationMethod")]
        public Input<string>? TgtGenerationMethod { get; set; }

        /// <summary>
        /// Authenticate to App Dynamics using username and password.
        /// </summary>
        [Input("tgtKeyTabFilePathSpec")]
        public Input<Inputs.SecretSshkeyKerberosTgtKeyTabFilePathSpecArgs>? TgtKeyTabFilePathSpec { get; set; }

        /// <summary>
        /// Authenticate to App Dynamics using username and password.
        /// </summary>
        [Input("tgtPasswordSpec")]
        public Input<Inputs.SecretSshkeyKerberosTgtPasswordSpecArgs>? TgtPasswordSpec { get; set; }

        public SecretSshkeyKerberosArgs()
        {
        }
        public static new SecretSshkeyKerberosArgs Empty => new SecretSshkeyKerberosArgs();
    }
}
