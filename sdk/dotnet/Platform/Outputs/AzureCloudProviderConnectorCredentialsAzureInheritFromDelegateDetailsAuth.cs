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
    public sealed class AzureCloudProviderConnectorCredentialsAzureInheritFromDelegateDetailsAuth
    {
        /// <summary>
        /// Azure UserAssigned MSI auth details.
        /// </summary>
        public readonly Outputs.AzureCloudProviderConnectorCredentialsAzureInheritFromDelegateDetailsAuthAzureMsiAuthUa? AzureMsiAuthUa;
        /// <summary>
        /// Type can either be SystemAssignedManagedIdentity or UserAssignedManagedIdentity.
        /// </summary>
        public readonly string Type;

        [OutputConstructor]
        private AzureCloudProviderConnectorCredentialsAzureInheritFromDelegateDetailsAuth(
            Outputs.AzureCloudProviderConnectorCredentialsAzureInheritFromDelegateDetailsAuthAzureMsiAuthUa? azureMsiAuthUa,

            string type)
        {
            AzureMsiAuthUa = azureMsiAuthUa;
            Type = type;
        }
    }
}
