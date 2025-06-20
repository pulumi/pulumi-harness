// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Harness.Platform.Inputs
{

    public sealed class GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorPullRequestTemplateSpecSourceDirectoryJsonnetArgs : global::Pulumi.ResourceArgs
    {
        [Input("extVars")]
        private InputList<Inputs.GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorPullRequestTemplateSpecSourceDirectoryJsonnetExtVarArgs>? _extVars;

        /// <summary>
        /// List of Jsonnet External Variables.
        /// </summary>
        public InputList<Inputs.GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorPullRequestTemplateSpecSourceDirectoryJsonnetExtVarArgs> ExtVars
        {
            get => _extVars ?? (_extVars = new InputList<Inputs.GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorPullRequestTemplateSpecSourceDirectoryJsonnetExtVarArgs>());
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
        private InputList<Inputs.GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorPullRequestTemplateSpecSourceDirectoryJsonnetTlaArgs>? _tlas;

        /// <summary>
        /// List of Jsonnet Top-level Arguments
        /// </summary>
        public InputList<Inputs.GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorPullRequestTemplateSpecSourceDirectoryJsonnetTlaArgs> Tlas
        {
            get => _tlas ?? (_tlas = new InputList<Inputs.GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorPullRequestTemplateSpecSourceDirectoryJsonnetTlaArgs>());
            set => _tlas = value;
        }

        public GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorPullRequestTemplateSpecSourceDirectoryJsonnetArgs()
        {
        }
        public static new GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorPullRequestTemplateSpecSourceDirectoryJsonnetArgs Empty => new GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorPullRequestTemplateSpecSourceDirectoryJsonnetArgs();
    }
}
