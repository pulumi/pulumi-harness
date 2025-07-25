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
    public sealed class GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMergeGeneratorGit
    {
        /// <summary>
        /// List of directories in the source repository to use when template the Application..
        /// </summary>
        public readonly ImmutableArray<Outputs.GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMergeGeneratorGitDirectory> Directories;
        /// <summary>
        /// List of files in the source repository to use when template the Application.
        /// </summary>
        public readonly ImmutableArray<Outputs.GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMergeGeneratorGitFile> Files;
        /// <summary>
        /// Prefix for all path-related parameter names.
        /// </summary>
        public readonly string? PathParamPrefix;
        /// <summary>
        /// URL to the repository to use.
        /// </summary>
        public readonly string RepoUrl;
        /// <summary>
        /// Revision of the source repository to use.
        /// </summary>
        public readonly string? Revision;
        /// <summary>
        /// Generator template. Used to override the values of the spec-level template.
        /// </summary>
        public readonly Outputs.GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMergeGeneratorGitTemplate? Template;

        [OutputConstructor]
        private GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMergeGeneratorGit(
            ImmutableArray<Outputs.GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMergeGeneratorGitDirectory> directories,

            ImmutableArray<Outputs.GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMergeGeneratorGitFile> files,

            string? pathParamPrefix,

            string repoUrl,

            string? revision,

            Outputs.GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMergeGeneratorGitTemplate? template)
        {
            Directories = directories;
            Files = files;
            PathParamPrefix = pathParamPrefix;
            RepoUrl = repoUrl;
            Revision = revision;
            Template = template;
        }
    }
}
