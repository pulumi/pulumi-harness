// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Harness.Platform.Inputs
{

    public sealed class GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMergeGeneratorClusterDecisionResourceTemplateSpecSourceDirectoryJsonnetArgs : global::Pulumi.ResourceArgs
    {
        [Input("extVars")]
        private InputList<Inputs.GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMergeGeneratorClusterDecisionResourceTemplateSpecSourceDirectoryJsonnetExtVarArgs>? _extVars;

        /// <summary>
        /// List of Jsonnet External Variables.
        /// </summary>
        public InputList<Inputs.GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMergeGeneratorClusterDecisionResourceTemplateSpecSourceDirectoryJsonnetExtVarArgs> ExtVars
        {
            get => _extVars ?? (_extVars = new InputList<Inputs.GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMergeGeneratorClusterDecisionResourceTemplateSpecSourceDirectoryJsonnetExtVarArgs>());
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
        private InputList<Inputs.GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMergeGeneratorClusterDecisionResourceTemplateSpecSourceDirectoryJsonnetTlaArgs>? _tlas;

        /// <summary>
        /// List of Jsonnet Top-level Arguments
        /// </summary>
        public InputList<Inputs.GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMergeGeneratorClusterDecisionResourceTemplateSpecSourceDirectoryJsonnetTlaArgs> Tlas
        {
            get => _tlas ?? (_tlas = new InputList<Inputs.GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMergeGeneratorClusterDecisionResourceTemplateSpecSourceDirectoryJsonnetTlaArgs>());
            set => _tlas = value;
        }

        public GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMergeGeneratorClusterDecisionResourceTemplateSpecSourceDirectoryJsonnetArgs()
        {
        }
        public static new GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMergeGeneratorClusterDecisionResourceTemplateSpecSourceDirectoryJsonnetArgs Empty => new GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMergeGeneratorClusterDecisionResourceTemplateSpecSourceDirectoryJsonnetArgs();
    }
}
