// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Harness.Platform
{
    public static class GetCurrentAccount
    {
        public static Task<GetCurrentAccountResult> InvokeAsync(GetCurrentAccountArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetCurrentAccountResult>("harness:platform/getCurrentAccount:getCurrentAccount", args ?? new GetCurrentAccountArgs(), options.WithDefaults());

        public static Output<GetCurrentAccountResult> Invoke(GetCurrentAccountInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetCurrentAccountResult>("harness:platform/getCurrentAccount:getCurrentAccount", args ?? new GetCurrentAccountInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetCurrentAccountArgs : global::Pulumi.InvokeArgs
    {
        [Input("id")]
        public string? Id { get; set; }

        public GetCurrentAccountArgs()
        {
        }
        public static new GetCurrentAccountArgs Empty => new GetCurrentAccountArgs();
    }

    public sealed class GetCurrentAccountInvokeArgs : global::Pulumi.InvokeArgs
    {
        [Input("id")]
        public Input<string>? Id { get; set; }

        public GetCurrentAccountInvokeArgs()
        {
        }
        public static new GetCurrentAccountInvokeArgs Empty => new GetCurrentAccountInvokeArgs();
    }


    [OutputType]
    public sealed class GetCurrentAccountResult
    {
        public readonly string AccountId;
        public readonly string Endpoint;
        public readonly string? Id;

        [OutputConstructor]
        private GetCurrentAccountResult(
            string accountId,

            string endpoint,

            string? id)
        {
            AccountId = accountId;
            Endpoint = endpoint;
            Id = id;
        }
    }
}
