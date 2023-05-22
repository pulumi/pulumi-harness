// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;
using Pulumi;

namespace Lbrlabs.PulumiPackage.Harness.Platform.Inputs
{

    public sealed class GetPolicysetPolicyArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Account Identifier of the account
        /// </summary>
        [Input("identifier", required: true)]
        public string Identifier { get; set; } = null!;

        /// <summary>
        /// Organization Identifier
        /// </summary>
        [Input("severity", required: true)]
        public string Severity { get; set; } = null!;

        public GetPolicysetPolicyArgs()
        {
        }
        public static new GetPolicysetPolicyArgs Empty => new GetPolicysetPolicyArgs();
    }
}