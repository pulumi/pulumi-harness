// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Harness.Platform.Inputs
{

    public sealed class GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMatrixGeneratorGitArgs : global::Pulumi.ResourceArgs
    {
        [Input("directories")]
        private InputList<Inputs.GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMatrixGeneratorGitDirectoryArgs>? _directories;

        /// <summary>
        /// List of directories in the source repository to use when template the Application..
        /// </summary>
        public InputList<Inputs.GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMatrixGeneratorGitDirectoryArgs> Directories
        {
            get => _directories ?? (_directories = new InputList<Inputs.GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMatrixGeneratorGitDirectoryArgs>());
            set => _directories = value;
        }

        [Input("files")]
        private InputList<Inputs.GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMatrixGeneratorGitFileArgs>? _files;

        /// <summary>
        /// List of files in the source repository to use when template the Application.
        /// </summary>
        public InputList<Inputs.GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMatrixGeneratorGitFileArgs> Files
        {
            get => _files ?? (_files = new InputList<Inputs.GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMatrixGeneratorGitFileArgs>());
            set => _files = value;
        }

        /// <summary>
        /// Prefix for all path-related parameter names.
        /// </summary>
        [Input("pathParamPrefix")]
        public Input<string>? PathParamPrefix { get; set; }

        /// <summary>
        /// URL to the repository to use.
        /// </summary>
        [Input("repoUrl", required: true)]
        public Input<string> RepoUrl { get; set; } = null!;

        /// <summary>
        /// Revision of the source repository to use.
        /// </summary>
        [Input("revision")]
        public Input<string>? Revision { get; set; }

        /// <summary>
        /// Generator template. Used to override the values of the spec-level template.
        /// </summary>
        [Input("template")]
        public Input<Inputs.GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMatrixGeneratorGitTemplateArgs>? Template { get; set; }

        public GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMatrixGeneratorGitArgs()
        {
        }
        public static new GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMatrixGeneratorGitArgs Empty => new GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMatrixGeneratorGitArgs();
    }
}
