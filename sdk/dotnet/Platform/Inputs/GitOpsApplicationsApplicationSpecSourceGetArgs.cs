// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Harness.Platform.Inputs
{

    public sealed class GitOpsApplicationsApplicationSpecSourceGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Helm chart name, and must be specified for the GitOps applications sourced from a helm repo.
        /// </summary>
        [Input("chart")]
        public Input<string>? Chart { get; set; }

        [Input("directories")]
        private InputList<Inputs.GitOpsApplicationsApplicationSpecSourceDirectoryGetArgs>? _directories;

        /// <summary>
        /// Options for applications of type plain YAML or Jsonnet.
        /// </summary>
        public InputList<Inputs.GitOpsApplicationsApplicationSpecSourceDirectoryGetArgs> Directories
        {
            get => _directories ?? (_directories = new InputList<Inputs.GitOpsApplicationsApplicationSpecSourceDirectoryGetArgs>());
            set => _directories = value;
        }

        [Input("helms")]
        private InputList<Inputs.GitOpsApplicationsApplicationSpecSourceHelmGetArgs>? _helms;

        /// <summary>
        /// Holds helm specific options.
        /// </summary>
        public InputList<Inputs.GitOpsApplicationsApplicationSpecSourceHelmGetArgs> Helms
        {
            get => _helms ?? (_helms = new InputList<Inputs.GitOpsApplicationsApplicationSpecSourceHelmGetArgs>());
            set => _helms = value;
        }

        [Input("ksonnets")]
        private InputList<Inputs.GitOpsApplicationsApplicationSpecSourceKsonnetGetArgs>? _ksonnets;

        /// <summary>
        /// Ksonnet specific options.
        /// </summary>
        public InputList<Inputs.GitOpsApplicationsApplicationSpecSourceKsonnetGetArgs> Ksonnets
        {
            get => _ksonnets ?? (_ksonnets = new InputList<Inputs.GitOpsApplicationsApplicationSpecSourceKsonnetGetArgs>());
            set => _ksonnets = value;
        }

        [Input("kustomizes")]
        private InputList<Inputs.GitOpsApplicationsApplicationSpecSourceKustomizeGetArgs>? _kustomizes;

        /// <summary>
        /// Options specific to a GitOps application source specific to Kustomize.
        /// </summary>
        public InputList<Inputs.GitOpsApplicationsApplicationSpecSourceKustomizeGetArgs> Kustomizes
        {
            get => _kustomizes ?? (_kustomizes = new InputList<Inputs.GitOpsApplicationsApplicationSpecSourceKustomizeGetArgs>());
            set => _kustomizes = value;
        }

        /// <summary>
        /// Directory path within the git repository, and is only valid for the GitOps applications sourced from git.
        /// </summary>
        [Input("path")]
        public Input<string>? Path { get; set; }

        [Input("plugins")]
        private InputList<Inputs.GitOpsApplicationsApplicationSpecSourcePluginGetArgs>? _plugins;

        /// <summary>
        /// Options specific to config management plugins.
        /// </summary>
        public InputList<Inputs.GitOpsApplicationsApplicationSpecSourcePluginGetArgs> Plugins
        {
            get => _plugins ?? (_plugins = new InputList<Inputs.GitOpsApplicationsApplicationSpecSourcePluginGetArgs>());
            set => _plugins = value;
        }

        /// <summary>
        /// Reference name to be used in other source spec, used for multi-source applications.
        /// </summary>
        [Input("ref")]
        public Input<string>? Ref { get; set; }

        /// <summary>
        /// URL to the repository (git or helm) that contains the GitOps application manifests.
        /// </summary>
        [Input("repoUrl", required: true)]
        public Input<string> RepoUrl { get; set; } = null!;

        /// <summary>
        /// Revision of the source to sync the GitOps application to. In case of git, this can be commit, tag, or branch. If omitted, will equal to HEAD. In case of Helm, this is a semver tag of the chart's version.
        /// </summary>
        [Input("targetRevision", required: true)]
        public Input<string> TargetRevision { get; set; } = null!;

        public GitOpsApplicationsApplicationSpecSourceGetArgs()
        {
        }
        public static new GitOpsApplicationsApplicationSpecSourceGetArgs Empty => new GitOpsApplicationsApplicationSpecSourceGetArgs();
    }
}
