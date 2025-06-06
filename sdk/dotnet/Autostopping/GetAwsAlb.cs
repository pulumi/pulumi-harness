// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Harness.Autostopping
{
    public static class GetAwsAlb
    {
        /// <summary>
        /// Data source for AWS Autostopping proxy
        /// </summary>
        public static Task<GetAwsAlbResult> InvokeAsync(GetAwsAlbArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetAwsAlbResult>("harness:autostopping/getAwsAlb:getAwsAlb", args ?? new GetAwsAlbArgs(), options.WithDefaults());

        /// <summary>
        /// Data source for AWS Autostopping proxy
        /// </summary>
        public static Output<GetAwsAlbResult> Invoke(GetAwsAlbInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetAwsAlbResult>("harness:autostopping/getAwsAlb:getAwsAlb", args ?? new GetAwsAlbInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// Data source for AWS Autostopping proxy
        /// </summary>
        public static Output<GetAwsAlbResult> Invoke(GetAwsAlbInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetAwsAlbResult>("harness:autostopping/getAwsAlb:getAwsAlb", args ?? new GetAwsAlbInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetAwsAlbArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Arn of AWS ALB to be imported. Required only for importing existing ALB
        /// </summary>
        [Input("albArn")]
        public string? AlbArn { get; set; }

        [Input("certificateId")]
        public string? CertificateId { get; set; }

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
        /// Name of the proxy
        /// </summary>
        [Input("name", required: true)]
        public string Name { get; set; } = null!;

        /// <summary>
        /// Region in which cloud resources are hosted
        /// </summary>
        [Input("region", required: true)]
        public string Region { get; set; } = null!;

        /// <summary>
        /// Route 53 hosted zone id
        /// </summary>
        [Input("route53HostedZoneId")]
        public string? Route53HostedZoneId { get; set; }

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
        [Input("vpc", required: true)]
        public string Vpc { get; set; } = null!;

        public GetAwsAlbArgs()
        {
        }
        public static new GetAwsAlbArgs Empty => new GetAwsAlbArgs();
    }

    public sealed class GetAwsAlbInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Arn of AWS ALB to be imported. Required only for importing existing ALB
        /// </summary>
        [Input("albArn")]
        public Input<string>? AlbArn { get; set; }

        [Input("certificateId")]
        public Input<string>? CertificateId { get; set; }

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
        /// Name of the proxy
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

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

        public GetAwsAlbInvokeArgs()
        {
        }
        public static new GetAwsAlbInvokeArgs Empty => new GetAwsAlbInvokeArgs();
    }


    [OutputType]
    public sealed class GetAwsAlbResult
    {
        /// <summary>
        /// Arn of AWS ALB to be imported. Required only for importing existing ALB
        /// </summary>
        public readonly string? AlbArn;
        public readonly string? CertificateId;
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
        /// Name of the proxy
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// Region in which cloud resources are hosted
        /// </summary>
        public readonly string Region;
        /// <summary>
        /// Route 53 hosted zone id
        /// </summary>
        public readonly string? Route53HostedZoneId;
        /// <summary>
        /// Security Group to define the security rules that determine the inbound and outbound traffic
        /// </summary>
        public readonly ImmutableArray<string> SecurityGroups;
        /// <summary>
        /// VPC in which cloud resources are hosted
        /// </summary>
        public readonly string Vpc;

        [OutputConstructor]
        private GetAwsAlbResult(
            string? albArn,

            string? certificateId,

            string cloudConnectorId,

            bool deleteCloudResourcesOnDestroy,

            string hostName,

            string id,

            string identifier,

            string name,

            string region,

            string? route53HostedZoneId,

            ImmutableArray<string> securityGroups,

            string vpc)
        {
            AlbArn = albArn;
            CertificateId = certificateId;
            CloudConnectorId = cloudConnectorId;
            DeleteCloudResourcesOnDestroy = deleteCloudResourcesOnDestroy;
            HostName = hostName;
            Id = id;
            Identifier = identifier;
            Name = name;
            Region = region;
            Route53HostedZoneId = route53HostedZoneId;
            SecurityGroups = securityGroups;
            Vpc = vpc;
        }
    }
}
