// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Harness.Platform
{
    public static class GetGitopsGnupg
    {
        /// <summary>
        /// Data source for fetching a Harness GitOps GPG public key.
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
        ///     var example = Harness.Platform.GetGitopsGnupg.Invoke(new()
        ///     {
        ///         AccountId = "account_id",
        ///         AgentId = "agent_id",
        ///         Identifier = "identifier",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Task<GetGitopsGnupgResult> InvokeAsync(GetGitopsGnupgArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetGitopsGnupgResult>("harness:platform/getGitopsGnupg:getGitopsGnupg", args ?? new GetGitopsGnupgArgs(), options.WithDefaults());

        /// <summary>
        /// Data source for fetching a Harness GitOps GPG public key.
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
        ///     var example = Harness.Platform.GetGitopsGnupg.Invoke(new()
        ///     {
        ///         AccountId = "account_id",
        ///         AgentId = "agent_id",
        ///         Identifier = "identifier",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetGitopsGnupgResult> Invoke(GetGitopsGnupgInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetGitopsGnupgResult>("harness:platform/getGitopsGnupg:getGitopsGnupg", args ?? new GetGitopsGnupgInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// Data source for fetching a Harness GitOps GPG public key.
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
        ///     var example = Harness.Platform.GetGitopsGnupg.Invoke(new()
        ///     {
        ///         AccountId = "account_id",
        ///         AgentId = "agent_id",
        ///         Identifier = "identifier",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetGitopsGnupgResult> Invoke(GetGitopsGnupgInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetGitopsGnupgResult>("harness:platform/getGitopsGnupg:getGitopsGnupg", args ?? new GetGitopsGnupgInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetGitopsGnupgArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Account Identifier for the GnuPG Key.
        /// </summary>
        [Input("accountId")]
        public string? AccountId { get; set; }

        /// <summary>
        /// Agent identifier for the GnuPG Key.
        /// </summary>
        [Input("agentId", required: true)]
        public string AgentId { get; set; } = null!;

        /// <summary>
        /// Identifier for the GnuPG Key.
        /// </summary>
        [Input("identifier", required: true)]
        public string Identifier { get; set; } = null!;

        /// <summary>
        /// Organization Identifier for the GnuPG Key.
        /// </summary>
        [Input("orgId")]
        public string? OrgId { get; set; }

        /// <summary>
        /// Project Identifier for the GnuPG Key.
        /// </summary>
        [Input("projectId")]
        public string? ProjectId { get; set; }

        [Input("requests")]
        private List<Inputs.GetGitopsGnupgRequestArgs>? _requests;

        /// <summary>
        /// GnuPGPublicKey is a representation of a GnuPG public key
        /// </summary>
        public List<Inputs.GetGitopsGnupgRequestArgs> Requests
        {
            get => _requests ?? (_requests = new List<Inputs.GetGitopsGnupgRequestArgs>());
            set => _requests = value;
        }

        public GetGitopsGnupgArgs()
        {
        }
        public static new GetGitopsGnupgArgs Empty => new GetGitopsGnupgArgs();
    }

    public sealed class GetGitopsGnupgInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Account Identifier for the GnuPG Key.
        /// </summary>
        [Input("accountId")]
        public Input<string>? AccountId { get; set; }

        /// <summary>
        /// Agent identifier for the GnuPG Key.
        /// </summary>
        [Input("agentId", required: true)]
        public Input<string> AgentId { get; set; } = null!;

        /// <summary>
        /// Identifier for the GnuPG Key.
        /// </summary>
        [Input("identifier", required: true)]
        public Input<string> Identifier { get; set; } = null!;

        /// <summary>
        /// Organization Identifier for the GnuPG Key.
        /// </summary>
        [Input("orgId")]
        public Input<string>? OrgId { get; set; }

        /// <summary>
        /// Project Identifier for the GnuPG Key.
        /// </summary>
        [Input("projectId")]
        public Input<string>? ProjectId { get; set; }

        [Input("requests")]
        private InputList<Inputs.GetGitopsGnupgRequestInputArgs>? _requests;

        /// <summary>
        /// GnuPGPublicKey is a representation of a GnuPG public key
        /// </summary>
        public InputList<Inputs.GetGitopsGnupgRequestInputArgs> Requests
        {
            get => _requests ?? (_requests = new InputList<Inputs.GetGitopsGnupgRequestInputArgs>());
            set => _requests = value;
        }

        public GetGitopsGnupgInvokeArgs()
        {
        }
        public static new GetGitopsGnupgInvokeArgs Empty => new GetGitopsGnupgInvokeArgs();
    }


    [OutputType]
    public sealed class GetGitopsGnupgResult
    {
        /// <summary>
        /// Account Identifier for the GnuPG Key.
        /// </summary>
        public readonly string AccountId;
        /// <summary>
        /// Agent identifier for the GnuPG Key.
        /// </summary>
        public readonly string AgentId;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// Identifier for the GnuPG Key.
        /// </summary>
        public readonly string Identifier;
        /// <summary>
        /// Organization Identifier for the GnuPG Key.
        /// </summary>
        public readonly string? OrgId;
        /// <summary>
        /// Project Identifier for the GnuPG Key.
        /// </summary>
        public readonly string? ProjectId;
        /// <summary>
        /// GnuPGPublicKey is a representation of a GnuPG public key
        /// </summary>
        public readonly ImmutableArray<Outputs.GetGitopsGnupgRequestResult> Requests;

        [OutputConstructor]
        private GetGitopsGnupgResult(
            string accountId,

            string agentId,

            string id,

            string identifier,

            string? orgId,

            string? projectId,

            ImmutableArray<Outputs.GetGitopsGnupgRequestResult> requests)
        {
            AccountId = accountId;
            AgentId = agentId;
            Id = id;
            Identifier = identifier;
            OrgId = orgId;
            ProjectId = projectId;
            Requests = requests;
        }
    }
}
