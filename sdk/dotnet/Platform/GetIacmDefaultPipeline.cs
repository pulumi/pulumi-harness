// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Harness.Platform
{
    public static class GetIacmDefaultPipeline
    {
        /// <summary>
        /// Data source for retrieving IACM default pipelines.
        /// </summary>
        public static Task<GetIacmDefaultPipelineResult> InvokeAsync(GetIacmDefaultPipelineArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetIacmDefaultPipelineResult>("harness:platform/getIacmDefaultPipeline:getIacmDefaultPipeline", args ?? new GetIacmDefaultPipelineArgs(), options.WithDefaults());

        /// <summary>
        /// Data source for retrieving IACM default pipelines.
        /// </summary>
        public static Output<GetIacmDefaultPipelineResult> Invoke(GetIacmDefaultPipelineInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetIacmDefaultPipelineResult>("harness:platform/getIacmDefaultPipeline:getIacmDefaultPipeline", args ?? new GetIacmDefaultPipelineInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// Data source for retrieving IACM default pipelines.
        /// </summary>
        public static Output<GetIacmDefaultPipelineResult> Invoke(GetIacmDefaultPipelineInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetIacmDefaultPipelineResult>("harness:platform/getIacmDefaultPipeline:getIacmDefaultPipeline", args ?? new GetIacmDefaultPipelineInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetIacmDefaultPipelineArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The operation associated with this default.
        /// </summary>
        [Input("operation", required: true)]
        public string Operation { get; set; } = null!;

        /// <summary>
        /// Organization identifier of the organization the default pipelines resides in.
        /// </summary>
        [Input("orgId", required: true)]
        public string OrgId { get; set; } = null!;

        /// <summary>
        /// Project identifier of the project the default pipelines resides in.
        /// </summary>
        [Input("projectId", required: true)]
        public string ProjectId { get; set; } = null!;

        /// <summary>
        /// The provisioner associated with this default.
        /// </summary>
        [Input("provisionerType", required: true)]
        public string ProvisionerType { get; set; } = null!;

        public GetIacmDefaultPipelineArgs()
        {
        }
        public static new GetIacmDefaultPipelineArgs Empty => new GetIacmDefaultPipelineArgs();
    }

    public sealed class GetIacmDefaultPipelineInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The operation associated with this default.
        /// </summary>
        [Input("operation", required: true)]
        public Input<string> Operation { get; set; } = null!;

        /// <summary>
        /// Organization identifier of the organization the default pipelines resides in.
        /// </summary>
        [Input("orgId", required: true)]
        public Input<string> OrgId { get; set; } = null!;

        /// <summary>
        /// Project identifier of the project the default pipelines resides in.
        /// </summary>
        [Input("projectId", required: true)]
        public Input<string> ProjectId { get; set; } = null!;

        /// <summary>
        /// The provisioner associated with this default.
        /// </summary>
        [Input("provisionerType", required: true)]
        public Input<string> ProvisionerType { get; set; } = null!;

        public GetIacmDefaultPipelineInvokeArgs()
        {
        }
        public static new GetIacmDefaultPipelineInvokeArgs Empty => new GetIacmDefaultPipelineInvokeArgs();
    }


    [OutputType]
    public sealed class GetIacmDefaultPipelineResult
    {
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// The operation associated with this default.
        /// </summary>
        public readonly string Operation;
        /// <summary>
        /// Organization identifier of the organization the default pipelines resides in.
        /// </summary>
        public readonly string OrgId;
        /// <summary>
        /// The pipeline associated with this default.
        /// </summary>
        public readonly string Pipeline;
        /// <summary>
        /// Project identifier of the project the default pipelines resides in.
        /// </summary>
        public readonly string ProjectId;
        /// <summary>
        /// The provisioner associated with this default.
        /// </summary>
        public readonly string ProvisionerType;

        [OutputConstructor]
        private GetIacmDefaultPipelineResult(
            string id,

            string operation,

            string orgId,

            string pipeline,

            string projectId,

            string provisionerType)
        {
            Id = id;
            Operation = operation;
            OrgId = orgId;
            Pipeline = pipeline;
            ProjectId = projectId;
            ProvisionerType = provisionerType;
        }
    }
}
