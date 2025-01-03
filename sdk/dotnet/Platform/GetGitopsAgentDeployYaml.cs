// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Harness.Platform
{
    public static class GetGitopsAgentDeployYaml
    {
        /// <summary>
        /// Datasource for fetching a Harness Gitops Agent deployment manifest YAML.
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
        ///     var example = Harness.Platform.GetGitopsAgentDeployYaml.Invoke(new()
        ///     {
        ///         Identifier = "identifier",
        ///         AccountId = "account_id",
        ///         ProjectId = "project_id",
        ///         OrgId = "org_id",
        ///         Namespace = "namespace",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Task<GetGitopsAgentDeployYamlResult> InvokeAsync(GetGitopsAgentDeployYamlArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetGitopsAgentDeployYamlResult>("harness:platform/getGitopsAgentDeployYaml:getGitopsAgentDeployYaml", args ?? new GetGitopsAgentDeployYamlArgs(), options.WithDefaults());

        /// <summary>
        /// Datasource for fetching a Harness Gitops Agent deployment manifest YAML.
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
        ///     var example = Harness.Platform.GetGitopsAgentDeployYaml.Invoke(new()
        ///     {
        ///         Identifier = "identifier",
        ///         AccountId = "account_id",
        ///         ProjectId = "project_id",
        ///         OrgId = "org_id",
        ///         Namespace = "namespace",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetGitopsAgentDeployYamlResult> Invoke(GetGitopsAgentDeployYamlInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetGitopsAgentDeployYamlResult>("harness:platform/getGitopsAgentDeployYaml:getGitopsAgentDeployYaml", args ?? new GetGitopsAgentDeployYamlInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// Datasource for fetching a Harness Gitops Agent deployment manifest YAML.
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
        ///     var example = Harness.Platform.GetGitopsAgentDeployYaml.Invoke(new()
        ///     {
        ///         Identifier = "identifier",
        ///         AccountId = "account_id",
        ///         ProjectId = "project_id",
        ///         OrgId = "org_id",
        ///         Namespace = "namespace",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetGitopsAgentDeployYamlResult> Invoke(GetGitopsAgentDeployYamlInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetGitopsAgentDeployYamlResult>("harness:platform/getGitopsAgentDeployYaml:getGitopsAgentDeployYaml", args ?? new GetGitopsAgentDeployYamlInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetGitopsAgentDeployYamlArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Account identifier of the GitOps agent.
        /// </summary>
        [Input("accountId")]
        public string? AccountId { get; set; }

        /// <summary>
        /// CA data of the GitOps agent, base64 encoded content of ca chain.
        /// </summary>
        [Input("caData")]
        public string? CaData { get; set; }

        /// <summary>
        /// Identifier of the GitOps agent.
        /// </summary>
        [Input("identifier", required: true)]
        public string Identifier { get; set; } = null!;

        /// <summary>
        /// The kubernetes namespace where the agent is installed.
        /// </summary>
        [Input("namespace", required: true)]
        public string Namespace { get; set; } = null!;

        /// <summary>
        /// Organization identifier of the GitOps agent.
        /// </summary>
        [Input("orgId")]
        public string? OrgId { get; set; }

        /// <summary>
        /// Project identifier of the GitOps agent.
        /// </summary>
        [Input("projectId")]
        public string? ProjectId { get; set; }

        [Input("proxies")]
        private List<Inputs.GetGitopsAgentDeployYamlProxyArgs>? _proxies;

        /// <summary>
        /// Proxy settings for the GitOps agent.
        /// </summary>
        public List<Inputs.GetGitopsAgentDeployYamlProxyArgs> Proxies
        {
            get => _proxies ?? (_proxies = new List<Inputs.GetGitopsAgentDeployYamlProxyArgs>());
            set => _proxies = value;
        }

        public GetGitopsAgentDeployYamlArgs()
        {
        }
        public static new GetGitopsAgentDeployYamlArgs Empty => new GetGitopsAgentDeployYamlArgs();
    }

    public sealed class GetGitopsAgentDeployYamlInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Account identifier of the GitOps agent.
        /// </summary>
        [Input("accountId")]
        public Input<string>? AccountId { get; set; }

        /// <summary>
        /// CA data of the GitOps agent, base64 encoded content of ca chain.
        /// </summary>
        [Input("caData")]
        public Input<string>? CaData { get; set; }

        /// <summary>
        /// Identifier of the GitOps agent.
        /// </summary>
        [Input("identifier", required: true)]
        public Input<string> Identifier { get; set; } = null!;

        /// <summary>
        /// The kubernetes namespace where the agent is installed.
        /// </summary>
        [Input("namespace", required: true)]
        public Input<string> Namespace { get; set; } = null!;

        /// <summary>
        /// Organization identifier of the GitOps agent.
        /// </summary>
        [Input("orgId")]
        public Input<string>? OrgId { get; set; }

        /// <summary>
        /// Project identifier of the GitOps agent.
        /// </summary>
        [Input("projectId")]
        public Input<string>? ProjectId { get; set; }

        [Input("proxies")]
        private InputList<Inputs.GetGitopsAgentDeployYamlProxyInputArgs>? _proxies;

        /// <summary>
        /// Proxy settings for the GitOps agent.
        /// </summary>
        public InputList<Inputs.GetGitopsAgentDeployYamlProxyInputArgs> Proxies
        {
            get => _proxies ?? (_proxies = new InputList<Inputs.GetGitopsAgentDeployYamlProxyInputArgs>());
            set => _proxies = value;
        }

        public GetGitopsAgentDeployYamlInvokeArgs()
        {
        }
        public static new GetGitopsAgentDeployYamlInvokeArgs Empty => new GetGitopsAgentDeployYamlInvokeArgs();
    }


    [OutputType]
    public sealed class GetGitopsAgentDeployYamlResult
    {
        /// <summary>
        /// Account identifier of the GitOps agent.
        /// </summary>
        public readonly string AccountId;
        /// <summary>
        /// CA data of the GitOps agent, base64 encoded content of ca chain.
        /// </summary>
        public readonly string? CaData;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// Identifier of the GitOps agent.
        /// </summary>
        public readonly string Identifier;
        /// <summary>
        /// The kubernetes namespace where the agent is installed.
        /// </summary>
        public readonly string Namespace;
        /// <summary>
        /// Organization identifier of the GitOps agent.
        /// </summary>
        public readonly string? OrgId;
        /// <summary>
        /// Project identifier of the GitOps agent.
        /// </summary>
        public readonly string? ProjectId;
        /// <summary>
        /// Proxy settings for the GitOps agent.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetGitopsAgentDeployYamlProxyResult> Proxies;
        /// <summary>
        /// The deployment manifest YAML of the GitOps agent.
        /// </summary>
        public readonly string Yaml;

        [OutputConstructor]
        private GetGitopsAgentDeployYamlResult(
            string accountId,

            string? caData,

            string id,

            string identifier,

            string @namespace,

            string? orgId,

            string? projectId,

            ImmutableArray<Outputs.GetGitopsAgentDeployYamlProxyResult> proxies,

            string yaml)
        {
            AccountId = accountId;
            CaData = caData;
            Id = id;
            Identifier = identifier;
            Namespace = @namespace;
            OrgId = orgId;
            ProjectId = projectId;
            Proxies = proxies;
            Yaml = yaml;
        }
    }
}
