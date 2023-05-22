// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;
using Pulumi;

namespace Lbrlabs.PulumiPackage.Harness.Platform
{
    /// <summary>
    /// Resource for creating a Harness Gitops Repositories Certificates.
    /// 
    /// ## Import
    /// 
    /// Import a Account level Gitops Repository Certificate
    /// 
    /// ```sh
    ///  $ pulumi import harness:platform/gitopsRepoCert:GitopsRepoCert example &lt;repocert_id&gt;
    /// ```
    /// </summary>
    [HarnessResourceType("harness:platform/gitopsRepoCert:GitopsRepoCert")]
    public partial class GitopsRepoCert : global::Pulumi.CustomResource
    {
        /// <summary>
        /// account identifier of the Repository Certificates.
        /// </summary>
        [Output("accountId")]
        public Output<string> AccountId { get; private set; } = null!;

        /// <summary>
        /// agent identifier of the Repository Certificates.
        /// </summary>
        [Output("agentId")]
        public Output<string> AgentId { get; private set; } = null!;

        /// <summary>
        /// organization identifier of the Repository Certificates.
        /// </summary>
        [Output("orgId")]
        public Output<string?> OrgId { get; private set; } = null!;

        /// <summary>
        /// project identifier of the Repository Certificates.
        /// </summary>
        [Output("projectId")]
        public Output<string?> ProjectId { get; private set; } = null!;

        /// <summary>
        /// Repository Certificates create/Update request.
        /// </summary>
        [Output("requests")]
        public Output<ImmutableArray<Outputs.GitopsRepoCertRequest>> Requests { get; private set; } = null!;


        /// <summary>
        /// Create a GitopsRepoCert resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public GitopsRepoCert(string name, GitopsRepoCertArgs args, CustomResourceOptions? options = null)
            : base("harness:platform/gitopsRepoCert:GitopsRepoCert", name, args ?? new GitopsRepoCertArgs(), MakeResourceOptions(options, ""))
        {
        }

        private GitopsRepoCert(string name, Input<string> id, GitopsRepoCertState? state = null, CustomResourceOptions? options = null)
            : base("harness:platform/gitopsRepoCert:GitopsRepoCert", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
                PluginDownloadURL = "github://api.github.com/lbrlabs",
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing GitopsRepoCert resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static GitopsRepoCert Get(string name, Input<string> id, GitopsRepoCertState? state = null, CustomResourceOptions? options = null)
        {
            return new GitopsRepoCert(name, id, state, options);
        }
    }

    public sealed class GitopsRepoCertArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// account identifier of the Repository Certificates.
        /// </summary>
        [Input("accountId", required: true)]
        public Input<string> AccountId { get; set; } = null!;

        /// <summary>
        /// agent identifier of the Repository Certificates.
        /// </summary>
        [Input("agentId", required: true)]
        public Input<string> AgentId { get; set; } = null!;

        /// <summary>
        /// organization identifier of the Repository Certificates.
        /// </summary>
        [Input("orgId")]
        public Input<string>? OrgId { get; set; }

        /// <summary>
        /// project identifier of the Repository Certificates.
        /// </summary>
        [Input("projectId")]
        public Input<string>? ProjectId { get; set; }

        [Input("requests", required: true)]
        private InputList<Inputs.GitopsRepoCertRequestArgs>? _requests;

        /// <summary>
        /// Repository Certificates create/Update request.
        /// </summary>
        public InputList<Inputs.GitopsRepoCertRequestArgs> Requests
        {
            get => _requests ?? (_requests = new InputList<Inputs.GitopsRepoCertRequestArgs>());
            set => _requests = value;
        }

        public GitopsRepoCertArgs()
        {
        }
        public static new GitopsRepoCertArgs Empty => new GitopsRepoCertArgs();
    }

    public sealed class GitopsRepoCertState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// account identifier of the Repository Certificates.
        /// </summary>
        [Input("accountId")]
        public Input<string>? AccountId { get; set; }

        /// <summary>
        /// agent identifier of the Repository Certificates.
        /// </summary>
        [Input("agentId")]
        public Input<string>? AgentId { get; set; }

        /// <summary>
        /// organization identifier of the Repository Certificates.
        /// </summary>
        [Input("orgId")]
        public Input<string>? OrgId { get; set; }

        /// <summary>
        /// project identifier of the Repository Certificates.
        /// </summary>
        [Input("projectId")]
        public Input<string>? ProjectId { get; set; }

        [Input("requests")]
        private InputList<Inputs.GitopsRepoCertRequestGetArgs>? _requests;

        /// <summary>
        /// Repository Certificates create/Update request.
        /// </summary>
        public InputList<Inputs.GitopsRepoCertRequestGetArgs> Requests
        {
            get => _requests ?? (_requests = new InputList<Inputs.GitopsRepoCertRequestGetArgs>());
            set => _requests = value;
        }

        public GitopsRepoCertState()
        {
        }
        public static new GitopsRepoCertState Empty => new GitopsRepoCertState();
    }
}