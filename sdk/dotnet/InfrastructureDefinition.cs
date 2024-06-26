// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Harness
{
    /// <summary>
    /// Resource for creating am infrastructure definition. This resource uses the config-as-code API's. When updating the `name` or `path` of this resource you should typically also set the `create_before_destroy = true` lifecycle setting.
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
    ///     // Creating a Kubernetes infrastructure definition
    ///     var dev = new Harness.Cloudprovider.Kubernetes("dev", new()
    ///     {
    ///         Name = "k8s-dev",
    ///         Authentication = new Harness.Cloudprovider.Inputs.KubernetesAuthenticationArgs
    ///         {
    ///             DelegateSelectors = new[]
    ///             {
    ///                 "k8s",
    ///             },
    ///         },
    ///     });
    /// 
    ///     var example = new Harness.Application("example", new()
    ///     {
    ///         Name = "example",
    ///     });
    /// 
    ///     var devEnvironment = new Harness.Environment("dev", new()
    ///     {
    ///         Name = "dev",
    ///         AppId = example.Id,
    ///         Type = "NON_PROD",
    ///     });
    /// 
    ///     // Creating a infrastructure of type KUBERNETES
    ///     var k8s = new Harness.InfrastructureDefinition("k8s", new()
    ///     {
    ///         Name = "k8s-eks-us-east-1",
    ///         AppId = example.Id,
    ///         EnvId = devEnvironment.Id,
    ///         CloudProviderType = "KUBERNETES_CLUSTER",
    ///         DeploymentType = "KUBERNETES",
    ///         Kubernetes = new Harness.Inputs.InfrastructureDefinitionKubernetesArgs
    ///         {
    ///             CloudProviderName = dev.Name,
    ///             Namespace = "dev",
    ///             ReleaseName = "${service.name}",
    ///         },
    ///     });
    /// 
    ///     // Creating a Deployment Template for CUSTOM infrastructure type
    ///     var exampleYaml = new Harness.YamlConfig("example_yaml", new()
    ///     {
    ///         Path = "Setup/Template Library/Example Folder/deployment_template.yaml",
    ///         Content = @"harnessApiVersion: '1.0'
    /// type: CUSTOM_DEPLOYMENT_TYPE
    /// fetchInstanceScript: |-
    ///   set -ex
    ///   curl http://${url}/${file_name} &gt; ${INSTANCE_OUTPUT_PATH}
    /// hostAttributes:
    ///   hostname: host
    /// hostObjectArrayPath: hosts
    /// variables:
    /// - name: url
    /// - name: file_name
    /// ",
    ///     });
    /// 
    ///     // Creating a infrastructure of type CUSTOM
    ///     var custom = new Harness.InfrastructureDefinition("custom", new()
    ///     {
    ///         Name = "custom-infra",
    ///         AppId = example.Id,
    ///         EnvId = devEnvironment.Id,
    ///         CloudProviderType = "CUSTOM",
    ///         DeploymentType = "CUSTOM",
    ///         DeploymentTemplateUri = exampleYaml.Name.Apply(name =&gt; $"Example Folder/{name}"),
    ///         Custom = new Harness.Inputs.InfrastructureDefinitionCustomArgs
    ///         {
    ///             DeploymentTypeTemplateVersion = "1",
    ///             Variables = new[]
    ///             {
    ///                 new Harness.Inputs.InfrastructureDefinitionCustomVariableArgs
    ///                 {
    ///                     Name = "url",
    ///                     Value = "localhost:8081",
    ///                 },
    ///                 new Harness.Inputs.InfrastructureDefinitionCustomVariableArgs
    ///                 {
    ///                     Name = "file_name",
    ///                     Value = "instances.json",
    ///                 },
    ///             },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Import using the Harness application id, environment id, and infrastructure definition id
    /// 
    /// ```sh
    /// $ pulumi import harness:index/infrastructureDefinition:InfrastructureDefinition example &lt;app_id&gt;/&lt;env_id&gt;/&lt;infradef_id&gt;
    /// ```
    /// </summary>
    [HarnessResourceType("harness:index/infrastructureDefinition:InfrastructureDefinition")]
    public partial class InfrastructureDefinition : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The id of the application the infrastructure definition belongs to.
        /// </summary>
        [Output("appId")]
        public Output<string> AppId { get; private set; } = null!;

        /// <summary>
        /// The configuration details for Aws AMI deployments.
        /// </summary>
        [Output("awsAmi")]
        public Output<Outputs.InfrastructureDefinitionAwsAmi?> AwsAmi { get; private set; } = null!;

        /// <summary>
        /// The configuration details for Aws AMI deployments.
        /// </summary>
        [Output("awsEcs")]
        public Output<Outputs.InfrastructureDefinitionAwsEcs?> AwsEcs { get; private set; } = null!;

        /// <summary>
        /// The configuration details for Aws Lambda deployments.
        /// </summary>
        [Output("awsLambda")]
        public Output<Outputs.InfrastructureDefinitionAwsLambda?> AwsLambda { get; private set; } = null!;

        /// <summary>
        /// The configuration details for AWS SSH deployments.
        /// </summary>
        [Output("awsSsh")]
        public Output<Outputs.InfrastructureDefinitionAwsSsh?> AwsSsh { get; private set; } = null!;

        /// <summary>
        /// The configuration details for AWS WinRM deployments.
        /// </summary>
        [Output("awsWinrm")]
        public Output<Outputs.InfrastructureDefinitionAwsWinrm?> AwsWinrm { get; private set; } = null!;

        /// <summary>
        /// The configuration details for Azure VMSS deployments.
        /// </summary>
        [Output("azureVmss")]
        public Output<Outputs.InfrastructureDefinitionAzureVmss?> AzureVmss { get; private set; } = null!;

        /// <summary>
        /// The configuration details for Azure WebApp deployments.
        /// </summary>
        [Output("azureWebapp")]
        public Output<Outputs.InfrastructureDefinitionAzureWebapp?> AzureWebapp { get; private set; } = null!;

        /// <summary>
        /// The type of the cloud provider to connect with. Valid options are AWS, AZURE, CUSTOM, PHYSICAL*DATA*CENTER, KUBERNETES*CLUSTER, PCF, SPOT*INST
        /// </summary>
        [Output("cloudProviderType")]
        public Output<string> CloudProviderType { get; private set; } = null!;

        /// <summary>
        /// The configuration details for Custom deployments.
        /// </summary>
        [Output("custom")]
        public Output<Outputs.InfrastructureDefinitionCustom?> Custom { get; private set; } = null!;

        /// <summary>
        /// The configuration details for SSH datacenter deployments.
        /// </summary>
        [Output("datacenterSsh")]
        public Output<Outputs.InfrastructureDefinitionDatacenterSsh?> DatacenterSsh { get; private set; } = null!;

        /// <summary>
        /// The configuration details for WinRM datacenter deployments.
        /// </summary>
        [Output("datacenterWinrm")]
        public Output<Outputs.InfrastructureDefinitionDatacenterWinrm?> DatacenterWinrm { get; private set; } = null!;

        /// <summary>
        /// The URI of the deployment template to use. Only used if deployment_type is `CUSTOM`.
        /// </summary>
        [Output("deploymentTemplateUri")]
        public Output<string?> DeploymentTemplateUri { get; private set; } = null!;

        /// <summary>
        /// The type of the deployment to use. Valid options are AMI, AWS*CODEDEPLOY, AWS*LAMBDA, AZURE*VMSS, AZURE*WEBAPP, CUSTOM, ECS, HELM, KUBERNETES, PCF, SSH, WINRM
        /// </summary>
        [Output("deploymentType")]
        public Output<string> DeploymentType { get; private set; } = null!;

        /// <summary>
        /// The id of the environment the infrastructure definition belongs to.
        /// </summary>
        [Output("envId")]
        public Output<string> EnvId { get; private set; } = null!;

        /// <summary>
        /// The configuration details for Kubernetes deployments.
        /// </summary>
        [Output("kubernetes")]
        public Output<Outputs.InfrastructureDefinitionKubernetes?> Kubernetes { get; private set; } = null!;

        /// <summary>
        /// The configuration details for Kubernetes on GCP deployments.
        /// </summary>
        [Output("kubernetesGcp")]
        public Output<Outputs.InfrastructureDefinitionKubernetesGcp?> KubernetesGcp { get; private set; } = null!;

        /// <summary>
        /// The name of the infrastructure definition
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// The name of the infrastructure provisioner to use.
        /// </summary>
        [Output("provisionerName")]
        public Output<string?> ProvisionerName { get; private set; } = null!;

        /// <summary>
        /// The list of service names to scope this infrastructure definition to.
        /// </summary>
        [Output("scopedServices")]
        public Output<ImmutableArray<string>> ScopedServices { get; private set; } = null!;

        /// <summary>
        /// The configuration details for PCF deployments.
        /// </summary>
        [Output("tanzu")]
        public Output<Outputs.InfrastructureDefinitionTanzu?> Tanzu { get; private set; } = null!;


        /// <summary>
        /// Create a InfrastructureDefinition resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public InfrastructureDefinition(string name, InfrastructureDefinitionArgs args, CustomResourceOptions? options = null)
            : base("harness:index/infrastructureDefinition:InfrastructureDefinition", name, args ?? new InfrastructureDefinitionArgs(), MakeResourceOptions(options, ""))
        {
        }

        private InfrastructureDefinition(string name, Input<string> id, InfrastructureDefinitionState? state = null, CustomResourceOptions? options = null)
            : base("harness:index/infrastructureDefinition:InfrastructureDefinition", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
                PluginDownloadURL = "github://api.github.com/pulumi",
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing InfrastructureDefinition resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static InfrastructureDefinition Get(string name, Input<string> id, InfrastructureDefinitionState? state = null, CustomResourceOptions? options = null)
        {
            return new InfrastructureDefinition(name, id, state, options);
        }
    }

    public sealed class InfrastructureDefinitionArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The id of the application the infrastructure definition belongs to.
        /// </summary>
        [Input("appId", required: true)]
        public Input<string> AppId { get; set; } = null!;

        /// <summary>
        /// The configuration details for Aws AMI deployments.
        /// </summary>
        [Input("awsAmi")]
        public Input<Inputs.InfrastructureDefinitionAwsAmiArgs>? AwsAmi { get; set; }

        /// <summary>
        /// The configuration details for Aws AMI deployments.
        /// </summary>
        [Input("awsEcs")]
        public Input<Inputs.InfrastructureDefinitionAwsEcsArgs>? AwsEcs { get; set; }

        /// <summary>
        /// The configuration details for Aws Lambda deployments.
        /// </summary>
        [Input("awsLambda")]
        public Input<Inputs.InfrastructureDefinitionAwsLambdaArgs>? AwsLambda { get; set; }

        /// <summary>
        /// The configuration details for AWS SSH deployments.
        /// </summary>
        [Input("awsSsh")]
        public Input<Inputs.InfrastructureDefinitionAwsSshArgs>? AwsSsh { get; set; }

        /// <summary>
        /// The configuration details for AWS WinRM deployments.
        /// </summary>
        [Input("awsWinrm")]
        public Input<Inputs.InfrastructureDefinitionAwsWinrmArgs>? AwsWinrm { get; set; }

        /// <summary>
        /// The configuration details for Azure VMSS deployments.
        /// </summary>
        [Input("azureVmss")]
        public Input<Inputs.InfrastructureDefinitionAzureVmssArgs>? AzureVmss { get; set; }

        /// <summary>
        /// The configuration details for Azure WebApp deployments.
        /// </summary>
        [Input("azureWebapp")]
        public Input<Inputs.InfrastructureDefinitionAzureWebappArgs>? AzureWebapp { get; set; }

        /// <summary>
        /// The type of the cloud provider to connect with. Valid options are AWS, AZURE, CUSTOM, PHYSICAL*DATA*CENTER, KUBERNETES*CLUSTER, PCF, SPOT*INST
        /// </summary>
        [Input("cloudProviderType", required: true)]
        public Input<string> CloudProviderType { get; set; } = null!;

        /// <summary>
        /// The configuration details for Custom deployments.
        /// </summary>
        [Input("custom")]
        public Input<Inputs.InfrastructureDefinitionCustomArgs>? Custom { get; set; }

        /// <summary>
        /// The configuration details for SSH datacenter deployments.
        /// </summary>
        [Input("datacenterSsh")]
        public Input<Inputs.InfrastructureDefinitionDatacenterSshArgs>? DatacenterSsh { get; set; }

        /// <summary>
        /// The configuration details for WinRM datacenter deployments.
        /// </summary>
        [Input("datacenterWinrm")]
        public Input<Inputs.InfrastructureDefinitionDatacenterWinrmArgs>? DatacenterWinrm { get; set; }

        /// <summary>
        /// The URI of the deployment template to use. Only used if deployment_type is `CUSTOM`.
        /// </summary>
        [Input("deploymentTemplateUri")]
        public Input<string>? DeploymentTemplateUri { get; set; }

        /// <summary>
        /// The type of the deployment to use. Valid options are AMI, AWS*CODEDEPLOY, AWS*LAMBDA, AZURE*VMSS, AZURE*WEBAPP, CUSTOM, ECS, HELM, KUBERNETES, PCF, SSH, WINRM
        /// </summary>
        [Input("deploymentType", required: true)]
        public Input<string> DeploymentType { get; set; } = null!;

        /// <summary>
        /// The id of the environment the infrastructure definition belongs to.
        /// </summary>
        [Input("envId", required: true)]
        public Input<string> EnvId { get; set; } = null!;

        /// <summary>
        /// The configuration details for Kubernetes deployments.
        /// </summary>
        [Input("kubernetes")]
        public Input<Inputs.InfrastructureDefinitionKubernetesArgs>? Kubernetes { get; set; }

        /// <summary>
        /// The configuration details for Kubernetes on GCP deployments.
        /// </summary>
        [Input("kubernetesGcp")]
        public Input<Inputs.InfrastructureDefinitionKubernetesGcpArgs>? KubernetesGcp { get; set; }

        /// <summary>
        /// The name of the infrastructure definition
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The name of the infrastructure provisioner to use.
        /// </summary>
        [Input("provisionerName")]
        public Input<string>? ProvisionerName { get; set; }

        [Input("scopedServices")]
        private InputList<string>? _scopedServices;

        /// <summary>
        /// The list of service names to scope this infrastructure definition to.
        /// </summary>
        public InputList<string> ScopedServices
        {
            get => _scopedServices ?? (_scopedServices = new InputList<string>());
            set => _scopedServices = value;
        }

        /// <summary>
        /// The configuration details for PCF deployments.
        /// </summary>
        [Input("tanzu")]
        public Input<Inputs.InfrastructureDefinitionTanzuArgs>? Tanzu { get; set; }

        public InfrastructureDefinitionArgs()
        {
        }
        public static new InfrastructureDefinitionArgs Empty => new InfrastructureDefinitionArgs();
    }

    public sealed class InfrastructureDefinitionState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The id of the application the infrastructure definition belongs to.
        /// </summary>
        [Input("appId")]
        public Input<string>? AppId { get; set; }

        /// <summary>
        /// The configuration details for Aws AMI deployments.
        /// </summary>
        [Input("awsAmi")]
        public Input<Inputs.InfrastructureDefinitionAwsAmiGetArgs>? AwsAmi { get; set; }

        /// <summary>
        /// The configuration details for Aws AMI deployments.
        /// </summary>
        [Input("awsEcs")]
        public Input<Inputs.InfrastructureDefinitionAwsEcsGetArgs>? AwsEcs { get; set; }

        /// <summary>
        /// The configuration details for Aws Lambda deployments.
        /// </summary>
        [Input("awsLambda")]
        public Input<Inputs.InfrastructureDefinitionAwsLambdaGetArgs>? AwsLambda { get; set; }

        /// <summary>
        /// The configuration details for AWS SSH deployments.
        /// </summary>
        [Input("awsSsh")]
        public Input<Inputs.InfrastructureDefinitionAwsSshGetArgs>? AwsSsh { get; set; }

        /// <summary>
        /// The configuration details for AWS WinRM deployments.
        /// </summary>
        [Input("awsWinrm")]
        public Input<Inputs.InfrastructureDefinitionAwsWinrmGetArgs>? AwsWinrm { get; set; }

        /// <summary>
        /// The configuration details for Azure VMSS deployments.
        /// </summary>
        [Input("azureVmss")]
        public Input<Inputs.InfrastructureDefinitionAzureVmssGetArgs>? AzureVmss { get; set; }

        /// <summary>
        /// The configuration details for Azure WebApp deployments.
        /// </summary>
        [Input("azureWebapp")]
        public Input<Inputs.InfrastructureDefinitionAzureWebappGetArgs>? AzureWebapp { get; set; }

        /// <summary>
        /// The type of the cloud provider to connect with. Valid options are AWS, AZURE, CUSTOM, PHYSICAL*DATA*CENTER, KUBERNETES*CLUSTER, PCF, SPOT*INST
        /// </summary>
        [Input("cloudProviderType")]
        public Input<string>? CloudProviderType { get; set; }

        /// <summary>
        /// The configuration details for Custom deployments.
        /// </summary>
        [Input("custom")]
        public Input<Inputs.InfrastructureDefinitionCustomGetArgs>? Custom { get; set; }

        /// <summary>
        /// The configuration details for SSH datacenter deployments.
        /// </summary>
        [Input("datacenterSsh")]
        public Input<Inputs.InfrastructureDefinitionDatacenterSshGetArgs>? DatacenterSsh { get; set; }

        /// <summary>
        /// The configuration details for WinRM datacenter deployments.
        /// </summary>
        [Input("datacenterWinrm")]
        public Input<Inputs.InfrastructureDefinitionDatacenterWinrmGetArgs>? DatacenterWinrm { get; set; }

        /// <summary>
        /// The URI of the deployment template to use. Only used if deployment_type is `CUSTOM`.
        /// </summary>
        [Input("deploymentTemplateUri")]
        public Input<string>? DeploymentTemplateUri { get; set; }

        /// <summary>
        /// The type of the deployment to use. Valid options are AMI, AWS*CODEDEPLOY, AWS*LAMBDA, AZURE*VMSS, AZURE*WEBAPP, CUSTOM, ECS, HELM, KUBERNETES, PCF, SSH, WINRM
        /// </summary>
        [Input("deploymentType")]
        public Input<string>? DeploymentType { get; set; }

        /// <summary>
        /// The id of the environment the infrastructure definition belongs to.
        /// </summary>
        [Input("envId")]
        public Input<string>? EnvId { get; set; }

        /// <summary>
        /// The configuration details for Kubernetes deployments.
        /// </summary>
        [Input("kubernetes")]
        public Input<Inputs.InfrastructureDefinitionKubernetesGetArgs>? Kubernetes { get; set; }

        /// <summary>
        /// The configuration details for Kubernetes on GCP deployments.
        /// </summary>
        [Input("kubernetesGcp")]
        public Input<Inputs.InfrastructureDefinitionKubernetesGcpGetArgs>? KubernetesGcp { get; set; }

        /// <summary>
        /// The name of the infrastructure definition
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The name of the infrastructure provisioner to use.
        /// </summary>
        [Input("provisionerName")]
        public Input<string>? ProvisionerName { get; set; }

        [Input("scopedServices")]
        private InputList<string>? _scopedServices;

        /// <summary>
        /// The list of service names to scope this infrastructure definition to.
        /// </summary>
        public InputList<string> ScopedServices
        {
            get => _scopedServices ?? (_scopedServices = new InputList<string>());
            set => _scopedServices = value;
        }

        /// <summary>
        /// The configuration details for PCF deployments.
        /// </summary>
        [Input("tanzu")]
        public Input<Inputs.InfrastructureDefinitionTanzuGetArgs>? Tanzu { get; set; }

        public InfrastructureDefinitionState()
        {
        }
        public static new InfrastructureDefinitionState Empty => new InfrastructureDefinitionState();
    }
}