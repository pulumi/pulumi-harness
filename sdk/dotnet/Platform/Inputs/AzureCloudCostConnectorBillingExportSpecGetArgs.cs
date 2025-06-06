// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Harness.Platform.Inputs
{

    public sealed class AzureCloudCostConnectorBillingExportSpecGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Name of the container.
        /// </summary>
        [Input("containerName", required: true)]
        public Input<string> ContainerName { get; set; } = null!;

        /// <summary>
        /// Name of the directory.
        /// </summary>
        [Input("directoryName", required: true)]
        public Input<string> DirectoryName { get; set; } = null!;

        /// <summary>
        /// Name of the report.
        /// </summary>
        [Input("reportName", required: true)]
        public Input<string> ReportName { get; set; } = null!;

        /// <summary>
        /// Name of the storage account.
        /// </summary>
        [Input("storageAccountName", required: true)]
        public Input<string> StorageAccountName { get; set; } = null!;

        /// <summary>
        /// Subsription Id.
        /// </summary>
        [Input("subscriptionId", required: true)]
        public Input<string> SubscriptionId { get; set; } = null!;

        public AzureCloudCostConnectorBillingExportSpecGetArgs()
        {
        }
        public static new AzureCloudCostConnectorBillingExportSpecGetArgs Empty => new AzureCloudCostConnectorBillingExportSpecGetArgs();
    }
}
