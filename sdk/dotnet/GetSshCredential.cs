// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Harness
{
    public static class GetSshCredential
    {
        /// <summary>
        /// Data source for retrieving an SSH credential.
        /// </summary>
        public static Task<GetSshCredentialResult> InvokeAsync(GetSshCredentialArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetSshCredentialResult>("harness:index/getSshCredential:getSshCredential", args ?? new GetSshCredentialArgs(), options.WithDefaults());

        /// <summary>
        /// Data source for retrieving an SSH credential.
        /// </summary>
        public static Output<GetSshCredentialResult> Invoke(GetSshCredentialInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetSshCredentialResult>("harness:index/getSshCredential:getSshCredential", args ?? new GetSshCredentialInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// Data source for retrieving an SSH credential.
        /// </summary>
        public static Output<GetSshCredentialResult> Invoke(GetSshCredentialInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetSshCredentialResult>("harness:index/getSshCredential:getSshCredential", args ?? new GetSshCredentialInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetSshCredentialArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Unique identifier of the secret manager
        /// </summary>
        [Input("id")]
        public string? Id { get; set; }

        /// <summary>
        /// The name of the secret manager
        /// </summary>
        [Input("name")]
        public string? Name { get; set; }

        [Input("usageScopes")]
        private List<Inputs.GetSshCredentialUsageScopeArgs>? _usageScopes;

        /// <summary>
        /// This block is used for scoping the resource to a specific set of applications or environments.
        /// </summary>
        public List<Inputs.GetSshCredentialUsageScopeArgs> UsageScopes
        {
            get => _usageScopes ?? (_usageScopes = new List<Inputs.GetSshCredentialUsageScopeArgs>());
            set => _usageScopes = value;
        }

        public GetSshCredentialArgs()
        {
        }
        public static new GetSshCredentialArgs Empty => new GetSshCredentialArgs();
    }

    public sealed class GetSshCredentialInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Unique identifier of the secret manager
        /// </summary>
        [Input("id")]
        public Input<string>? Id { get; set; }

        /// <summary>
        /// The name of the secret manager
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("usageScopes")]
        private InputList<Inputs.GetSshCredentialUsageScopeInputArgs>? _usageScopes;

        /// <summary>
        /// This block is used for scoping the resource to a specific set of applications or environments.
        /// </summary>
        public InputList<Inputs.GetSshCredentialUsageScopeInputArgs> UsageScopes
        {
            get => _usageScopes ?? (_usageScopes = new InputList<Inputs.GetSshCredentialUsageScopeInputArgs>());
            set => _usageScopes = value;
        }

        public GetSshCredentialInvokeArgs()
        {
        }
        public static new GetSshCredentialInvokeArgs Empty => new GetSshCredentialInvokeArgs();
    }


    [OutputType]
    public sealed class GetSshCredentialResult
    {
        /// <summary>
        /// Unique identifier of the secret manager
        /// </summary>
        public readonly string? Id;
        /// <summary>
        /// The name of the secret manager
        /// </summary>
        public readonly string? Name;
        /// <summary>
        /// This block is used for scoping the resource to a specific set of applications or environments.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetSshCredentialUsageScopeResult> UsageScopes;

        [OutputConstructor]
        private GetSshCredentialResult(
            string? id,

            string? name,

            ImmutableArray<Outputs.GetSshCredentialUsageScopeResult> usageScopes)
        {
            Id = id;
            Name = name;
            UsageScopes = usageScopes;
        }
    }
}
