// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Harness.Inputs
{

    public sealed class InfrastructureDefinitionCustomArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The template version
        /// </summary>
        [Input("deploymentTypeTemplateVersion", required: true)]
        public Input<string> DeploymentTypeTemplateVersion { get; set; } = null!;

        [Input("variables")]
        private InputList<Inputs.InfrastructureDefinitionCustomVariableArgs>? _variables;

        /// <summary>
        /// Variables to be used in the service
        /// </summary>
        public InputList<Inputs.InfrastructureDefinitionCustomVariableArgs> Variables
        {
            get => _variables ?? (_variables = new InputList<Inputs.InfrastructureDefinitionCustomVariableArgs>());
            set => _variables = value;
        }

        public InfrastructureDefinitionCustomArgs()
        {
        }
        public static new InfrastructureDefinitionCustomArgs Empty => new InfrastructureDefinitionCustomArgs();
    }
}
