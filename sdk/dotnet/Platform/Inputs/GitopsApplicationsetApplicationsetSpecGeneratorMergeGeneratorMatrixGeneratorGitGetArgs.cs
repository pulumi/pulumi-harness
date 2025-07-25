// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Harness.Platform.Inputs
{

    public sealed class GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMatrixGeneratorGitGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("directories")]
        private InputList<Inputs.GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMatrixGeneratorGitDirectoryGetArgs>? _directories;

        /// <summary>
        /// List of directories in the source repository to use when template the Application..
        /// </summary>
        public InputList<Inputs.GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMatrixGeneratorGitDirectoryGetArgs> Directories
        {
            get => _directories ?? (_directories = new InputList<Inputs.GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMatrixGeneratorGitDirectoryGetArgs>());
            set => _directories = value;
        }

        [Input("files")]
        private InputList<Inputs.GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMatrixGeneratorGitFileGetArgs>? _files;

        /// <summary>
        /// List of files in the source repository to use when template the Application.
        /// </summary>
        public InputList<Inputs.GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMatrixGeneratorGitFileGetArgs> Files
        {
            get => _files ?? (_files = new InputList<Inputs.GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMatrixGeneratorGitFileGetArgs>());
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
        public Input<Inputs.GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMatrixGeneratorGitTemplateGetArgs>? Template { get; set; }

        public GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMatrixGeneratorGitGetArgs()
        {
        }
        public static new GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMatrixGeneratorGitGetArgs Empty => new GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMatrixGeneratorGitGetArgs();
    }
}
