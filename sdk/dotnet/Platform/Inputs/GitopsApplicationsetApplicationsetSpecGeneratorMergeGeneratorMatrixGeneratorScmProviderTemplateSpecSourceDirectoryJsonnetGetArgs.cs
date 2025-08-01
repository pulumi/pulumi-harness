// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Harness.Platform.Inputs
{

    public sealed class GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMatrixGeneratorScmProviderTemplateSpecSourceDirectoryJsonnetGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("extVars")]
        private InputList<Inputs.GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMatrixGeneratorScmProviderTemplateSpecSourceDirectoryJsonnetExtVarGetArgs>? _extVars;

        /// <summary>
        /// List of Jsonnet External Variables.
        /// </summary>
        public InputList<Inputs.GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMatrixGeneratorScmProviderTemplateSpecSourceDirectoryJsonnetExtVarGetArgs> ExtVars
        {
            get => _extVars ?? (_extVars = new InputList<Inputs.GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMatrixGeneratorScmProviderTemplateSpecSourceDirectoryJsonnetExtVarGetArgs>());
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
        private InputList<Inputs.GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMatrixGeneratorScmProviderTemplateSpecSourceDirectoryJsonnetTlaGetArgs>? _tlas;

        /// <summary>
        /// List of Jsonnet Top-level Arguments
        /// </summary>
        public InputList<Inputs.GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMatrixGeneratorScmProviderTemplateSpecSourceDirectoryJsonnetTlaGetArgs> Tlas
        {
            get => _tlas ?? (_tlas = new InputList<Inputs.GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMatrixGeneratorScmProviderTemplateSpecSourceDirectoryJsonnetTlaGetArgs>());
            set => _tlas = value;
        }

        public GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMatrixGeneratorScmProviderTemplateSpecSourceDirectoryJsonnetGetArgs()
        {
        }
        public static new GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMatrixGeneratorScmProviderTemplateSpecSourceDirectoryJsonnetGetArgs Empty => new GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMatrixGeneratorScmProviderTemplateSpecSourceDirectoryJsonnetGetArgs();
    }
}
