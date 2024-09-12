// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Harness.Autostopping
{
    /// <summary>
    /// Resource for creating an AWS Autostopping proxy
    /// 
    /// ## Example Usage
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Harness = Pulumi.Harness;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var test = new Harness.Autostopping.AwsProxy("test", new()
    ///     {
    ///         Name = "name",
    ///         CloudConnectorId = "cloud_connector_id",
    ///         HostName = "host_name",
    ///         Region = "region",
    ///         Vpc = "vpc",
    ///         SecurityGroups = new[]
    ///         {
    ///             "sg1",
    ///             "sg2",
    ///         },
    ///         Route53HostedZoneId = "/hostedzone/zone_id",
    ///         MachineType = "t2.medium",
    ///         ApiKey = "",
    ///         AllocateStaticIp = true,
    ///         DeleteCloudResourcesOnDestroy = true,
    ///     });
    /// 
    /// });
    /// ```
    /// </summary>
    [HarnessResourceType("harness:autostopping/awsProxy:AwsProxy")]
    public partial class AwsProxy : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Boolean value to indicate if proxy vm needs to have static IP
        /// </summary>
        [Output("allocateStaticIp")]
        public Output<bool?> AllocateStaticIp { get; private set; } = null!;

        /// <summary>
        /// Harness NG API key
        /// </summary>
        [Output("apiKey")]
        public Output<string> ApiKey { get; private set; } = null!;

        [Output("certificates")]
        public Output<Outputs.AwsProxyCertificates?> Certificates { get; private set; } = null!;

        /// <summary>
        /// Id of the cloud connector
        /// </summary>
        [Output("cloudConnectorId")]
        public Output<string> CloudConnectorId { get; private set; } = null!;

        [Output("deleteCloudResourcesOnDestroy")]
        public Output<bool> DeleteCloudResourcesOnDestroy { get; private set; } = null!;

        /// <summary>
        /// Hostname for the proxy
        /// </summary>
        [Output("hostName")]
        public Output<string> HostName { get; private set; } = null!;

        /// <summary>
        /// Unique identifier of the resource
        /// </summary>
        [Output("identifier")]
        public Output<string> Identifier { get; private set; } = null!;

        [Output("keypair")]
        public Output<string?> Keypair { get; private set; } = null!;

        /// <summary>
        /// Machine instance type
        /// </summary>
        [Output("machineType")]
        public Output<string> MachineType { get; private set; } = null!;

        /// <summary>
        /// Name of the proxy
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// Region in which cloud resources are hosted
        /// </summary>
        [Output("region")]
        public Output<string> Region { get; private set; } = null!;

        /// <summary>
        /// Route 53 hosted zone id
        /// </summary>
        [Output("route53HostedZoneId")]
        public Output<string?> Route53HostedZoneId { get; private set; } = null!;

        /// <summary>
        /// Security Group to define the security rules that determine the inbound and outbound traffic
        /// </summary>
        [Output("securityGroups")]
        public Output<ImmutableArray<string>> SecurityGroups { get; private set; } = null!;

        /// <summary>
        /// VPC in which cloud resources are hosted
        /// </summary>
        [Output("vpc")]
        public Output<string> Vpc { get; private set; } = null!;


        /// <summary>
        /// Create a AwsProxy resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public AwsProxy(string name, AwsProxyArgs args, CustomResourceOptions? options = null)
            : base("harness:autostopping/awsProxy:AwsProxy", name, args ?? new AwsProxyArgs(), MakeResourceOptions(options, ""))
        {
        }

        private AwsProxy(string name, Input<string> id, AwsProxyState? state = null, CustomResourceOptions? options = null)
            : base("harness:autostopping/awsProxy:AwsProxy", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
                PluginDownloadURL = "github://api.github.com/pulumi",
                AdditionalSecretOutputs =
                {
                    "apiKey",
                },
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing AwsProxy resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static AwsProxy Get(string name, Input<string> id, AwsProxyState? state = null, CustomResourceOptions? options = null)
        {
            return new AwsProxy(name, id, state, options);
        }
    }

    public sealed class AwsProxyArgs : global::Pulumi.ResourceArgs
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
        public Input<Inputs.AwsProxyCertificatesArgs>? Certificates { get; set; }

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

        [Input("keypair")]
        public Input<string>? Keypair { get; set; }

        /// <summary>
        /// Machine instance type
        /// </summary>
        [Input("machineType", required: true)]
        public Input<string> MachineType { get; set; } = null!;

        /// <summary>
        /// Name of the proxy
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Region in which cloud resources are hosted
        /// </summary>
        [Input("region", required: true)]
        public Input<string> Region { get; set; } = null!;

        /// <summary>
        /// Route 53 hosted zone id
        /// </summary>
        [Input("route53HostedZoneId")]
        public Input<string>? Route53HostedZoneId { get; set; }

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
        [Input("vpc", required: true)]
        public Input<string> Vpc { get; set; } = null!;

        public AwsProxyArgs()
        {
        }
        public static new AwsProxyArgs Empty => new AwsProxyArgs();
    }

    public sealed class AwsProxyState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Boolean value to indicate if proxy vm needs to have static IP
        /// </summary>
        [Input("allocateStaticIp")]
        public Input<bool>? AllocateStaticIp { get; set; }

        [Input("apiKey")]
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
        public Input<Inputs.AwsProxyCertificatesGetArgs>? Certificates { get; set; }

        /// <summary>
        /// Id of the cloud connector
        /// </summary>
        [Input("cloudConnectorId")]
        public Input<string>? CloudConnectorId { get; set; }

        [Input("deleteCloudResourcesOnDestroy")]
        public Input<bool>? DeleteCloudResourcesOnDestroy { get; set; }

        /// <summary>
        /// Hostname for the proxy
        /// </summary>
        [Input("hostName")]
        public Input<string>? HostName { get; set; }

        /// <summary>
        /// Unique identifier of the resource
        /// </summary>
        [Input("identifier")]
        public Input<string>? Identifier { get; set; }

        [Input("keypair")]
        public Input<string>? Keypair { get; set; }

        /// <summary>
        /// Machine instance type
        /// </summary>
        [Input("machineType")]
        public Input<string>? MachineType { get; set; }

        /// <summary>
        /// Name of the proxy
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Region in which cloud resources are hosted
        /// </summary>
        [Input("region")]
        public Input<string>? Region { get; set; }

        /// <summary>
        /// Route 53 hosted zone id
        /// </summary>
        [Input("route53HostedZoneId")]
        public Input<string>? Route53HostedZoneId { get; set; }

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
        [Input("vpc")]
        public Input<string>? Vpc { get; set; }

        public AwsProxyState()
        {
        }
        public static new AwsProxyState Empty => new AwsProxyState();
    }
}