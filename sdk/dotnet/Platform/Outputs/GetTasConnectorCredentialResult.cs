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
    public sealed class GetTasConnectorCredentialResult
    {
        /// <summary>
        /// Authenticate to Tas using manual details.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetTasConnectorCredentialTasManualDetailResult> TasManualDetails;
        /// <summary>
        /// Type can be ManualConfig.
        /// </summary>
        public readonly string Type;

        [OutputConstructor]
        private GetTasConnectorCredentialResult(
            ImmutableArray<Outputs.GetTasConnectorCredentialTasManualDetailResult> tasManualDetails,

            string type)
        {
            TasManualDetails = tasManualDetails;
            Type = type;
        }
    }
}