// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Harness.Platform.Inputs
{

    public sealed class AzureCloudProviderConnectorCredentialsAzureManualDetailsAuthArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Azure client key certificate details.
        /// </summary>
        [Input("azureClientKeyCert")]
        public Input<Inputs.AzureCloudProviderConnectorCredentialsAzureManualDetailsAuthAzureClientKeyCertArgs>? AzureClientKeyCert { get; set; }

        /// <summary>
        /// Azure Client Secret Key details.
        /// </summary>
        [Input("azureClientSecretKey")]
        public Input<Inputs.AzureCloudProviderConnectorCredentialsAzureManualDetailsAuthAzureClientSecretKeyArgs>? AzureClientSecretKey { get; set; }

        /// <summary>
        /// Type can either be Certificate or Secret.
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        public AzureCloudProviderConnectorCredentialsAzureManualDetailsAuthArgs()
        {
        }
        public static new AzureCloudProviderConnectorCredentialsAzureManualDetailsAuthArgs Empty => new AzureCloudProviderConnectorCredentialsAzureManualDetailsAuthArgs();
    }
}
