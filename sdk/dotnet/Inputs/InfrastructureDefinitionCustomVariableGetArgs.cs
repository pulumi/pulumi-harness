// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Harness.Inputs
{

    public sealed class InfrastructureDefinitionCustomVariableGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Name of the variable
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        /// <summary>
        /// Value of the variable
        /// </summary>
        [Input("value", required: true)]
        public Input<string> Value { get; set; } = null!;

        public InfrastructureDefinitionCustomVariableGetArgs()
        {
        }
        public static new InfrastructureDefinitionCustomVariableGetArgs Empty => new InfrastructureDefinitionCustomVariableGetArgs();
    }
}