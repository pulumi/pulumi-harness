// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Harness.Inputs
{

    public sealed class InfrastructureDefinitionAwsAmiArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ami deployment type to use. Valid options are AWS_ASG, SPOTINST
        /// </summary>
        [Input("amiDeploymentType", required: true)]
        public Input<string> AmiDeploymentType { get; set; } = null!;

        /// <summary>
        /// Flag to indicate whether the autoscaling group identifies the workload.
        /// </summary>
        [Input("asgIdentifiesWorkload")]
        public Input<bool>? AsgIdentifiesWorkload { get; set; }

        /// <summary>
        /// The name of the autoscaling group.
        /// </summary>
        [Input("autoscalingGroupName")]
        public Input<string>? AutoscalingGroupName { get; set; }

        [Input("classicLoadbalancers")]
        private InputList<string>? _classicLoadbalancers;

        /// <summary>
        /// The classic load balancers to use.
        /// </summary>
        public InputList<string> ClassicLoadbalancers
        {
            get => _classicLoadbalancers ?? (_classicLoadbalancers = new InputList<string>());
            set => _classicLoadbalancers = value;
        }

        /// <summary>
        /// The name of the cloud provider to connect with.
        /// </summary>
        [Input("cloudProviderName", required: true)]
        public Input<string> CloudProviderName { get; set; } = null!;

        /// <summary>
        /// The naming convention to use for the hostname. Defaults to ${host.ec2Instance.privateDnsName.split('.')[0]}
        /// </summary>
        [Input("hostnameConvention")]
        public Input<string>? HostnameConvention { get; set; }

        /// <summary>
        /// The region to deploy to.
        /// </summary>
        [Input("region", required: true)]
        public Input<string> Region { get; set; } = null!;

        /// <summary>
        /// The name of the SpotInst cloud provider to connect with.
        /// </summary>
        [Input("spotinstCloudProviderName")]
        public Input<string>? SpotinstCloudProviderName { get; set; }

        /// <summary>
        /// The SpotInst configuration to use.
        /// </summary>
        [Input("spotinstConfigJson")]
        public Input<string>? SpotinstConfigJson { get; set; }

        [Input("stageClassicLoadbalancers")]
        private InputList<string>? _stageClassicLoadbalancers;

        /// <summary>
        /// The staging classic load balancers to use.
        /// </summary>
        public InputList<string> StageClassicLoadbalancers
        {
            get => _stageClassicLoadbalancers ?? (_stageClassicLoadbalancers = new InputList<string>());
            set => _stageClassicLoadbalancers = value;
        }

        [Input("stageTargetGroupArns")]
        private InputList<string>? _stageTargetGroupArns;

        /// <summary>
        /// The staging classic load balancers to use.
        /// </summary>
        public InputList<string> StageTargetGroupArns
        {
            get => _stageTargetGroupArns ?? (_stageTargetGroupArns = new InputList<string>());
            set => _stageTargetGroupArns = value;
        }

        [Input("targetGroupArns")]
        private InputList<string>? _targetGroupArns;

        /// <summary>
        /// The ARN's of the target groups.
        /// </summary>
        public InputList<string> TargetGroupArns
        {
            get => _targetGroupArns ?? (_targetGroupArns = new InputList<string>());
            set => _targetGroupArns = value;
        }

        /// <summary>
        /// Flag to enable traffic shifting.
        /// </summary>
        [Input("useTrafficShift")]
        public Input<bool>? UseTrafficShift { get; set; }

        public InfrastructureDefinitionAwsAmiArgs()
        {
        }
        public static new InfrastructureDefinitionAwsAmiArgs Empty => new InfrastructureDefinitionAwsAmiArgs();
    }
}
