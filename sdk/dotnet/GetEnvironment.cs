// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Harness
{
    public static class GetEnvironment
    {
        /// <summary>
        /// Data source for retrieving a Harness service
        /// </summary>
        public static Task<GetEnvironmentResult> InvokeAsync(GetEnvironmentArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetEnvironmentResult>("harness:index/getEnvironment:getEnvironment", args ?? new GetEnvironmentArgs(), options.WithDefaults());

        /// <summary>
        /// Data source for retrieving a Harness service
        /// </summary>
        public static Output<GetEnvironmentResult> Invoke(GetEnvironmentInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetEnvironmentResult>("harness:index/getEnvironment:getEnvironment", args ?? new GetEnvironmentInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetEnvironmentArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The id of the application.
        /// </summary>
        [Input("appId", required: true)]
        public string AppId { get; set; } = null!;

        /// <summary>
        /// The id of the environment.
        /// </summary>
        [Input("environmentId")]
        public string? EnvironmentId { get; set; }

        /// <summary>
        /// The name of the environment.
        /// </summary>
        [Input("name")]
        public string? Name { get; set; }

        [Input("variableOverrides")]
        private List<Inputs.GetEnvironmentVariableOverrideArgs>? _variableOverrides;

        /// <summary>
        /// Override for a service variable
        /// </summary>
        public List<Inputs.GetEnvironmentVariableOverrideArgs> VariableOverrides
        {
            get => _variableOverrides ?? (_variableOverrides = new List<Inputs.GetEnvironmentVariableOverrideArgs>());
            set => _variableOverrides = value;
        }

        public GetEnvironmentArgs()
        {
        }
        public static new GetEnvironmentArgs Empty => new GetEnvironmentArgs();
    }

    public sealed class GetEnvironmentInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The id of the application.
        /// </summary>
        [Input("appId", required: true)]
        public Input<string> AppId { get; set; } = null!;

        /// <summary>
        /// The id of the environment.
        /// </summary>
        [Input("environmentId")]
        public Input<string>? EnvironmentId { get; set; }

        /// <summary>
        /// The name of the environment.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("variableOverrides")]
        private InputList<Inputs.GetEnvironmentVariableOverrideInputArgs>? _variableOverrides;

        /// <summary>
        /// Override for a service variable
        /// </summary>
        public InputList<Inputs.GetEnvironmentVariableOverrideInputArgs> VariableOverrides
        {
            get => _variableOverrides ?? (_variableOverrides = new InputList<Inputs.GetEnvironmentVariableOverrideInputArgs>());
            set => _variableOverrides = value;
        }

        public GetEnvironmentInvokeArgs()
        {
        }
        public static new GetEnvironmentInvokeArgs Empty => new GetEnvironmentInvokeArgs();
    }


    [OutputType]
    public sealed class GetEnvironmentResult
    {
        /// <summary>
        /// The id of the application.
        /// </summary>
        public readonly string AppId;
        /// <summary>
        /// The description of the environment.
        /// </summary>
        public readonly string Description;
        /// <summary>
        /// The id of the environment.
        /// </summary>
        public readonly string? EnvironmentId;
        /// <summary>
        /// The id of the environment.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// The name of the environment.
        /// </summary>
        public readonly string? Name;
        /// <summary>
        /// The type of the environment. Valid values are `PROD` and `NON_PROD`
        /// </summary>
        public readonly string Type;
        /// <summary>
        /// Override for a service variable
        /// </summary>
        public readonly ImmutableArray<Outputs.GetEnvironmentVariableOverrideResult> VariableOverrides;

        [OutputConstructor]
        private GetEnvironmentResult(
            string appId,

            string description,

            string? environmentId,

            string id,

            string? name,

            string type,

            ImmutableArray<Outputs.GetEnvironmentVariableOverrideResult> variableOverrides)
        {
            AppId = appId;
            Description = description;
            EnvironmentId = environmentId;
            Id = id;
            Name = name;
            Type = type;
            VariableOverrides = variableOverrides;
        }
    }
}