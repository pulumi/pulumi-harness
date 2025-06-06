// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Harness.Platform.Inputs
{

    public sealed class GetWorkspaceTerraformVariableArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Key is the identifier for the variable`
        /// </summary>
        [Input("key", required: true)]
        public string Key { get; set; } = null!;

        /// <summary>
        /// value is the value of the variable
        /// </summary>
        [Input("value", required: true)]
        public string Value { get; set; } = null!;

        /// <summary>
        /// Value type indicates the value type of the variable, text or secret
        /// </summary>
        [Input("valueType", required: true)]
        public string ValueType { get; set; } = null!;

        public GetWorkspaceTerraformVariableArgs()
        {
        }
        public static new GetWorkspaceTerraformVariableArgs Empty => new GetWorkspaceTerraformVariableArgs();
    }
}
