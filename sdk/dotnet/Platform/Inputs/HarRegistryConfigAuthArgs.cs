// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Harness.Platform.Inputs
{

    public sealed class HarRegistryConfigAuthArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Type of authentication (UserPassword, Anonymous)
        /// </summary>
        [Input("authType", required: true)]
        public Input<string> AuthType { get; set; } = null!;

        /// <summary>
        /// User password authentication details
        /// </summary>
        [Input("userPassword")]
        public Input<Inputs.HarRegistryConfigAuthUserPasswordArgs>? UserPassword { get; set; }

        public HarRegistryConfigAuthArgs()
        {
        }
        public static new HarRegistryConfigAuthArgs Empty => new HarRegistryConfigAuthArgs();
    }
}
