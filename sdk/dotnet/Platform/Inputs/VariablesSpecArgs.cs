// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Harness.Platform.Inputs
{

    public sealed class VariablesSpecArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// FixedValue of the variable
        /// </summary>
        [Input("fixedValue", required: true)]
        public Input<string> FixedValue { get; set; } = null!;

        /// <summary>
        /// Type of Value of the Variable. For now only FIXED is supported
        /// </summary>
        [Input("valueType", required: true)]
        public Input<string> ValueType { get; set; } = null!;

        public VariablesSpecArgs()
        {
        }
        public static new VariablesSpecArgs Empty => new VariablesSpecArgs();
    }
}
