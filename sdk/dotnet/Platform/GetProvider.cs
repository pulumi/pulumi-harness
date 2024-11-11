// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Harness.Platform
{
    public static class GetProvider
    {
        public static Task<GetProviderResult> InvokeAsync(GetProviderArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetProviderResult>("harness:platform/getProvider:getProvider", args ?? new GetProviderArgs(), options.WithDefaults());

        public static Output<GetProviderResult> Invoke(GetProviderInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetProviderResult>("harness:platform/getProvider:getProvider", args ?? new GetProviderInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetProviderArgs : global::Pulumi.InvokeArgs
    {
        [Input("identifier", required: true)]
        public string Identifier { get; set; } = null!;

        public GetProviderArgs()
        {
        }
        public static new GetProviderArgs Empty => new GetProviderArgs();
    }

    public sealed class GetProviderInvokeArgs : global::Pulumi.InvokeArgs
    {
        [Input("identifier", required: true)]
        public Input<string> Identifier { get; set; } = null!;

        public GetProviderInvokeArgs()
        {
        }
        public static new GetProviderInvokeArgs Empty => new GetProviderInvokeArgs();
    }


    [OutputType]
    public sealed class GetProviderResult
    {
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly string Identifier;

        [OutputConstructor]
        private GetProviderResult(
            string id,

            string identifier)
        {
            Id = id;
            Identifier = identifier;
        }
    }
}