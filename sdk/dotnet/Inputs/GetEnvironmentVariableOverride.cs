// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Harness.Inputs
{

    public sealed class GetEnvironmentVariableOverrideArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The name of the variable
        /// </summary>
        [Input("name", required: true)]
        public string Name { get; set; } = null!;

        /// <summary>
        /// The name of the service
        /// </summary>
        [Input("serviceName", required: true)]
        public string ServiceName { get; set; } = null!;

        /// <summary>
        /// The type of the service variable. Valid values are `TEXT` and `ENCRYPTED_TEXT`
        /// </summary>
        [Input("type", required: true)]
        public string Type { get; set; } = null!;

        /// <summary>
        /// The value of the service variable
        /// </summary>
        [Input("value", required: true)]
        public string Value { get; set; } = null!;

        public GetEnvironmentVariableOverrideArgs()
        {
        }
        public static new GetEnvironmentVariableOverrideArgs Empty => new GetEnvironmentVariableOverrideArgs();
    }
}
