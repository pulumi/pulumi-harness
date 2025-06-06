// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Harness.Platform.Inputs
{

    public sealed class AzureCloudProviderConnectorCredentialsAzureManualDetailsArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Application ID of the Azure App.
        /// </summary>
        [Input("applicationId")]
        public Input<string>? ApplicationId { get; set; }

        /// <summary>
        /// Contains Azure auth details.
        /// </summary>
        [Input("auth")]
        public Input<Inputs.AzureCloudProviderConnectorCredentialsAzureManualDetailsAuthArgs>? Auth { get; set; }

        /// <summary>
        /// The Azure Active Directory (AAD) directory ID where you created your application.
        /// </summary>
        [Input("tenantId")]
        public Input<string>? TenantId { get; set; }

        public AzureCloudProviderConnectorCredentialsAzureManualDetailsArgs()
        {
        }
        public static new AzureCloudProviderConnectorCredentialsAzureManualDetailsArgs Empty => new AzureCloudProviderConnectorCredentialsAzureManualDetailsArgs();
    }
}
