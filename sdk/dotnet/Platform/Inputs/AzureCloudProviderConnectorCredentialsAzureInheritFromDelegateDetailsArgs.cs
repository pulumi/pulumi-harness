// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Harness.Platform.Inputs
{

    public sealed class AzureCloudProviderConnectorCredentialsAzureInheritFromDelegateDetailsArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Auth to authenticate to Azure Cloud Provider using details inheriting from delegate.
        /// </summary>
        [Input("auth")]
        public Input<Inputs.AzureCloudProviderConnectorCredentialsAzureInheritFromDelegateDetailsAuthArgs>? Auth { get; set; }

        public AzureCloudProviderConnectorCredentialsAzureInheritFromDelegateDetailsArgs()
        {
        }
        public static new AzureCloudProviderConnectorCredentialsAzureInheritFromDelegateDetailsArgs Empty => new AzureCloudProviderConnectorCredentialsAzureInheritFromDelegateDetailsArgs();
    }
}
