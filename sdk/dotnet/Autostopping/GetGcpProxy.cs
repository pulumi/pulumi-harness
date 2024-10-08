// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Harness.Autostopping
{
    public static class GetGcpProxy
    {
        /// <summary>
        /// Data source for GCP Autostopping proxy
        /// </summary>
        public static Task<GetGcpProxyResult> InvokeAsync(GetGcpProxyArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetGcpProxyResult>("harness:autostopping/getGcpProxy:getGcpProxy", args ?? new GetGcpProxyArgs(), options.WithDefaults());

        /// <summary>
        /// Data source for GCP Autostopping proxy
        /// </summary>
        public static Output<GetGcpProxyResult> Invoke(GetGcpProxyInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetGcpProxyResult>("harness:autostopping/getGcpProxy:getGcpProxy", args ?? new GetGcpProxyInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetGcpProxyArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Boolean value to indicate if proxy vm needs to have static IP
        /// </summary>
        [Input("allocateStaticIp")]
        public bool? AllocateStaticIp { get; set; }

        [Input("apiKey", required: true)]
        private string? _apiKey;

        /// <summary>
        /// Harness NG API key
        /// </summary>
        public string? ApiKey
        {
            get => _apiKey;
            set => _apiKey = value;
        }

        [Input("certificates")]
        public Inputs.GetGcpProxyCertificatesArgs? Certificates { get; set; }

        /// <summary>
        /// Id of the cloud connector
        /// </summary>
        [Input("cloudConnectorId", required: true)]
        public string CloudConnectorId { get; set; } = null!;

        [Input("deleteCloudResourcesOnDestroy", required: true)]
        public bool DeleteCloudResourcesOnDestroy { get; set; }

        /// <summary>
        /// Hostname for the proxy
        /// </summary>
        [Input("hostName", required: true)]
        public string HostName { get; set; } = null!;

        /// <summary>
        /// Machine instance type
        /// </summary>
        [Input("machineType", required: true)]
        public string MachineType { get; set; } = null!;

        /// <summary>
        /// Name of the proxy
        /// </summary>
        [Input("name", required: true)]
        public string Name { get; set; } = null!;

        /// <summary>
        /// Region in which cloud resources are hosted
        /// </summary>
        [Input("region", required: true)]
        public string Region { get; set; } = null!;

        [Input("securityGroups")]
        private List<string>? _securityGroups;

        /// <summary>
        /// Security Group to define the security rules that determine the inbound and outbound traffic
        /// </summary>
        public List<string> SecurityGroups
        {
            get => _securityGroups ?? (_securityGroups = new List<string>());
            set => _securityGroups = value;
        }

        /// <summary>
        /// VPC in which cloud resources are hosted
        /// </summary>
        [Input("subnetId", required: true)]
        public string SubnetId { get; set; } = null!;

        /// <summary>
        /// VPC in which cloud resources are hosted
        /// </summary>
        [Input("vpc", required: true)]
        public string Vpc { get; set; } = null!;

        /// <summary>
        /// Zone in which cloud resources are hosted
        /// </summary>
        [Input("zone", required: true)]
        public string Zone { get; set; } = null!;

        public GetGcpProxyArgs()
        {
        }
        public static new GetGcpProxyArgs Empty => new GetGcpProxyArgs();
    }

    public sealed class GetGcpProxyInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Boolean value to indicate if proxy vm needs to have static IP
        /// </summary>
        [Input("allocateStaticIp")]
        public Input<bool>? AllocateStaticIp { get; set; }

        [Input("apiKey", required: true)]
        private Input<string>? _apiKey;

        /// <summary>
        /// Harness NG API key
        /// </summary>
        public Input<string>? ApiKey
        {
            get => _apiKey;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _apiKey = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        [Input("certificates")]
        public Input<Inputs.GetGcpProxyCertificatesInputArgs>? Certificates { get; set; }

        /// <summary>
        /// Id of the cloud connector
        /// </summary>
        [Input("cloudConnectorId", required: true)]
        public Input<string> CloudConnectorId { get; set; } = null!;

        [Input("deleteCloudResourcesOnDestroy", required: true)]
        public Input<bool> DeleteCloudResourcesOnDestroy { get; set; } = null!;

        /// <summary>
        /// Hostname for the proxy
        /// </summary>
        [Input("hostName", required: true)]
        public Input<string> HostName { get; set; } = null!;

        /// <summary>
        /// Machine instance type
        /// </summary>
        [Input("machineType", required: true)]
        public Input<string> MachineType { get; set; } = null!;

        /// <summary>
        /// Name of the proxy
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        /// <summary>
        /// Region in which cloud resources are hosted
        /// </summary>
        [Input("region", required: true)]
        public Input<string> Region { get; set; } = null!;

        [Input("securityGroups")]
        private InputList<string>? _securityGroups;

        /// <summary>
        /// Security Group to define the security rules that determine the inbound and outbound traffic
        /// </summary>
        public InputList<string> SecurityGroups
        {
            get => _securityGroups ?? (_securityGroups = new InputList<string>());
            set => _securityGroups = value;
        }

        /// <summary>
        /// VPC in which cloud resources are hosted
        /// </summary>
        [Input("subnetId", required: true)]
        public Input<string> SubnetId { get; set; } = null!;

        /// <summary>
        /// VPC in which cloud resources are hosted
        /// </summary>
        [Input("vpc", required: true)]
        public Input<string> Vpc { get; set; } = null!;

        /// <summary>
        /// Zone in which cloud resources are hosted
        /// </summary>
        [Input("zone", required: true)]
        public Input<string> Zone { get; set; } = null!;

        public GetGcpProxyInvokeArgs()
        {
        }
        public static new GetGcpProxyInvokeArgs Empty => new GetGcpProxyInvokeArgs();
    }


    [OutputType]
    public sealed class GetGcpProxyResult
    {
        /// <summary>
        /// Boolean value to indicate if proxy vm needs to have static IP
        /// </summary>
        public readonly bool? AllocateStaticIp;
        /// <summary>
        /// Harness NG API key
        /// </summary>
        public readonly string ApiKey;
        public readonly Outputs.GetGcpProxyCertificatesResult? Certificates;
        /// <summary>
        /// Id of the cloud connector
        /// </summary>
        public readonly string CloudConnectorId;
        public readonly bool DeleteCloudResourcesOnDestroy;
        /// <summary>
        /// Hostname for the proxy
        /// </summary>
        public readonly string HostName;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// Unique identifier of the resource
        /// </summary>
        public readonly string Identifier;
        /// <summary>
        /// Machine instance type
        /// </summary>
        public readonly string MachineType;
        /// <summary>
        /// Name of the proxy
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// Region in which cloud resources are hosted
        /// </summary>
        public readonly string Region;
        /// <summary>
        /// Security Group to define the security rules that determine the inbound and outbound traffic
        /// </summary>
        public readonly ImmutableArray<string> SecurityGroups;
        /// <summary>
        /// VPC in which cloud resources are hosted
        /// </summary>
        public readonly string SubnetId;
        /// <summary>
        /// VPC in which cloud resources are hosted
        /// </summary>
        public readonly string Vpc;
        /// <summary>
        /// Zone in which cloud resources are hosted
        /// </summary>
        public readonly string Zone;

        [OutputConstructor]
        private GetGcpProxyResult(
            bool? allocateStaticIp,

            string apiKey,

            Outputs.GetGcpProxyCertificatesResult? certificates,

            string cloudConnectorId,

            bool deleteCloudResourcesOnDestroy,

            string hostName,

            string id,

            string identifier,

            string machineType,

            string name,

            string region,

            ImmutableArray<string> securityGroups,

            string subnetId,

            string vpc,

            string zone)
        {
            AllocateStaticIp = allocateStaticIp;
            ApiKey = apiKey;
            Certificates = certificates;
            CloudConnectorId = cloudConnectorId;
            DeleteCloudResourcesOnDestroy = deleteCloudResourcesOnDestroy;
            HostName = hostName;
            Id = id;
            Identifier = identifier;
            MachineType = machineType;
            Name = name;
            Region = region;
            SecurityGroups = securityGroups;
            SubnetId = subnetId;
            Vpc = vpc;
            Zone = zone;
        }
    }
}