// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Harness.Platform.Inputs
{

    public sealed class GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMergeGeneratorPullRequestBitbucketServerGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The Bitbucket REST API URL to talk to e.g. https://bitbucket.org/rest.
        /// </summary>
        [Input("api", required: true)]
        public Input<string> Api { get; set; } = null!;

        /// <summary>
        /// Credentials for Basic auth.
        /// </summary>
        [Input("basicAuth")]
        public Input<Inputs.GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMergeGeneratorPullRequestBitbucketServerBasicAuthGetArgs>? BasicAuth { get; set; }

        /// <summary>
        /// Project to scan.
        /// </summary>
        [Input("project", required: true)]
        public Input<string> Project { get; set; } = null!;

        /// <summary>
        /// Repo name to scan.
        /// </summary>
        [Input("repo", required: true)]
        public Input<string> Repo { get; set; } = null!;

        public GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMergeGeneratorPullRequestBitbucketServerGetArgs()
        {
        }
        public static new GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMergeGeneratorPullRequestBitbucketServerGetArgs Empty => new GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMergeGeneratorPullRequestBitbucketServerGetArgs();
    }
}
