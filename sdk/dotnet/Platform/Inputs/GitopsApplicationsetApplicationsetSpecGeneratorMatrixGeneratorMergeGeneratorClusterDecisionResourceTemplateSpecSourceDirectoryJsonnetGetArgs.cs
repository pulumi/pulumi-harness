// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Harness.Platform.Inputs
{

    public sealed class GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMergeGeneratorClusterDecisionResourceTemplateSpecSourceDirectoryJsonnetGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("extVars")]
        private InputList<Inputs.GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMergeGeneratorClusterDecisionResourceTemplateSpecSourceDirectoryJsonnetExtVarGetArgs>? _extVars;

        /// <summary>
        /// List of Jsonnet External Variables.
        /// </summary>
        public InputList<Inputs.GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMergeGeneratorClusterDecisionResourceTemplateSpecSourceDirectoryJsonnetExtVarGetArgs> ExtVars
        {
            get => _extVars ?? (_extVars = new InputList<Inputs.GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMergeGeneratorClusterDecisionResourceTemplateSpecSourceDirectoryJsonnetExtVarGetArgs>());
            set => _extVars = value;
        }

        [Input("libs")]
        private InputList<string>? _libs;

        /// <summary>
        /// Additional library search dirs.
        /// </summary>
        public InputList<string> Libs
        {
            get => _libs ?? (_libs = new InputList<string>());
            set => _libs = value;
        }

        [Input("tlas")]
        private InputList<Inputs.GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMergeGeneratorClusterDecisionResourceTemplateSpecSourceDirectoryJsonnetTlaGetArgs>? _tlas;

        /// <summary>
        /// List of Jsonnet Top-level Arguments
        /// </summary>
        public InputList<Inputs.GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMergeGeneratorClusterDecisionResourceTemplateSpecSourceDirectoryJsonnetTlaGetArgs> Tlas
        {
            get => _tlas ?? (_tlas = new InputList<Inputs.GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMergeGeneratorClusterDecisionResourceTemplateSpecSourceDirectoryJsonnetTlaGetArgs>());
            set => _tlas = value;
        }

        public GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMergeGeneratorClusterDecisionResourceTemplateSpecSourceDirectoryJsonnetGetArgs()
        {
        }
        public static new GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMergeGeneratorClusterDecisionResourceTemplateSpecSourceDirectoryJsonnetGetArgs Empty => new GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMergeGeneratorClusterDecisionResourceTemplateSpecSourceDirectoryJsonnetGetArgs();
    }
}
