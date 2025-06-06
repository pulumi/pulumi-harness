// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Harness.Platform
{
    public static class GetInputSet
    {
        /// <summary>
        /// Data source for retrieving a Harness input set.
        /// </summary>
        public static Task<GetInputSetResult> InvokeAsync(GetInputSetArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetInputSetResult>("harness:platform/getInputSet:getInputSet", args ?? new GetInputSetArgs(), options.WithDefaults());

        /// <summary>
        /// Data source for retrieving a Harness input set.
        /// </summary>
        public static Output<GetInputSetResult> Invoke(GetInputSetInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetInputSetResult>("harness:platform/getInputSet:getInputSet", args ?? new GetInputSetInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// Data source for retrieving a Harness input set.
        /// </summary>
        public static Output<GetInputSetResult> Invoke(GetInputSetInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetInputSetResult>("harness:platform/getInputSet:getInputSet", args ?? new GetInputSetInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetInputSetArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Contains parameters related to creating an Entity for Git Experience.
        /// </summary>
        [Input("gitDetails")]
        public Inputs.GetInputSetGitDetailsArgs? GitDetails { get; set; }

        /// <summary>
        /// Unique identifier of the resource.
        /// </summary>
        [Input("identifier")]
        public string? Identifier { get; set; }

        /// <summary>
        /// Name of the resource.
        /// </summary>
        [Input("name")]
        public string? Name { get; set; }

        /// <summary>
        /// Unique identifier of the organization.
        /// </summary>
        [Input("orgId", required: true)]
        public string OrgId { get; set; } = null!;

        /// <summary>
        /// Identifier of the pipeline
        /// </summary>
        [Input("pipelineId", required: true)]
        public string PipelineId { get; set; } = null!;

        /// <summary>
        /// Unique identifier of the project.
        /// </summary>
        [Input("projectId", required: true)]
        public string ProjectId { get; set; } = null!;

        public GetInputSetArgs()
        {
        }
        public static new GetInputSetArgs Empty => new GetInputSetArgs();
    }

    public sealed class GetInputSetInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Contains parameters related to creating an Entity for Git Experience.
        /// </summary>
        [Input("gitDetails")]
        public Input<Inputs.GetInputSetGitDetailsInputArgs>? GitDetails { get; set; }

        /// <summary>
        /// Unique identifier of the resource.
        /// </summary>
        [Input("identifier")]
        public Input<string>? Identifier { get; set; }

        /// <summary>
        /// Name of the resource.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Unique identifier of the organization.
        /// </summary>
        [Input("orgId", required: true)]
        public Input<string> OrgId { get; set; } = null!;

        /// <summary>
        /// Identifier of the pipeline
        /// </summary>
        [Input("pipelineId", required: true)]
        public Input<string> PipelineId { get; set; } = null!;

        /// <summary>
        /// Unique identifier of the project.
        /// </summary>
        [Input("projectId", required: true)]
        public Input<string> ProjectId { get; set; } = null!;

        public GetInputSetInvokeArgs()
        {
        }
        public static new GetInputSetInvokeArgs Empty => new GetInputSetInvokeArgs();
    }


    [OutputType]
    public sealed class GetInputSetResult
    {
        /// <summary>
        /// Description of the resource.
        /// </summary>
        public readonly string Description;
        /// <summary>
        /// Contains parameters related to creating an Entity for Git Experience.
        /// </summary>
        public readonly Outputs.GetInputSetGitDetailsResult? GitDetails;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// Unique identifier of the resource.
        /// </summary>
        public readonly string? Identifier;
        /// <summary>
        /// Name of the resource.
        /// </summary>
        public readonly string? Name;
        /// <summary>
        /// Unique identifier of the organization.
        /// </summary>
        public readonly string OrgId;
        /// <summary>
        /// Identifier of the pipeline
        /// </summary>
        public readonly string PipelineId;
        /// <summary>
        /// Unique identifier of the project.
        /// </summary>
        public readonly string ProjectId;
        /// <summary>
        /// Tags to associate with the resource.
        /// </summary>
        public readonly ImmutableArray<string> Tags;
        /// <summary>
        /// Input Set YAML
        /// </summary>
        public readonly string Yaml;

        [OutputConstructor]
        private GetInputSetResult(
            string description,

            Outputs.GetInputSetGitDetailsResult? gitDetails,

            string id,

            string? identifier,

            string? name,

            string orgId,

            string pipelineId,

            string projectId,

            ImmutableArray<string> tags,

            string yaml)
        {
            Description = description;
            GitDetails = gitDetails;
            Id = id;
            Identifier = identifier;
            Name = name;
            OrgId = orgId;
            PipelineId = pipelineId;
            ProjectId = projectId;
            Tags = tags;
            Yaml = yaml;
        }
    }
}
