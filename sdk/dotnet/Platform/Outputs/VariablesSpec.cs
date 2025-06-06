// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Harness.Platform.Outputs
{

    [OutputType]
    public sealed class VariablesSpec
    {
        /// <summary>
        /// FixedValue of the variable
        /// </summary>
        public readonly string FixedValue;
        /// <summary>
        /// Type of Value of the Variable. For now only FIXED is supported
        /// </summary>
        public readonly string ValueType;

        [OutputConstructor]
        private VariablesSpec(
            string fixedValue,

            string valueType)
        {
            FixedValue = fixedValue;
            ValueType = valueType;
        }
    }
}
