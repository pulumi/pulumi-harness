// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;
using Pulumi;

namespace Lbrlabs.PulumiPackage.Harness.Platform.Inputs
{

    public sealed class GetGitopsApplicationsApplicationSpecSourceArgs : global::Pulumi.InvokeArgs
    {
        [Input("chart")]
        public string? Chart { get; set; }

        [Input("directories")]
        private List<Inputs.GetGitopsApplicationsApplicationSpecSourceDirectoryArgs>? _directories;
        public List<Inputs.GetGitopsApplicationsApplicationSpecSourceDirectoryArgs> Directories
        {
            get => _directories ?? (_directories = new List<Inputs.GetGitopsApplicationsApplicationSpecSourceDirectoryArgs>());
            set => _directories = value;
        }

        [Input("helms")]
        private List<Inputs.GetGitopsApplicationsApplicationSpecSourceHelmArgs>? _helms;
        public List<Inputs.GetGitopsApplicationsApplicationSpecSourceHelmArgs> Helms
        {
            get => _helms ?? (_helms = new List<Inputs.GetGitopsApplicationsApplicationSpecSourceHelmArgs>());
            set => _helms = value;
        }

        [Input("ksonnets")]
        private List<Inputs.GetGitopsApplicationsApplicationSpecSourceKsonnetArgs>? _ksonnets;
        public List<Inputs.GetGitopsApplicationsApplicationSpecSourceKsonnetArgs> Ksonnets
        {
            get => _ksonnets ?? (_ksonnets = new List<Inputs.GetGitopsApplicationsApplicationSpecSourceKsonnetArgs>());
            set => _ksonnets = value;
        }

        [Input("kustomizes")]
        private List<Inputs.GetGitopsApplicationsApplicationSpecSourceKustomizeArgs>? _kustomizes;
        public List<Inputs.GetGitopsApplicationsApplicationSpecSourceKustomizeArgs> Kustomizes
        {
            get => _kustomizes ?? (_kustomizes = new List<Inputs.GetGitopsApplicationsApplicationSpecSourceKustomizeArgs>());
            set => _kustomizes = value;
        }

        [Input("path")]
        public string? Path { get; set; }

        [Input("plugins")]
        private List<Inputs.GetGitopsApplicationsApplicationSpecSourcePluginArgs>? _plugins;
        public List<Inputs.GetGitopsApplicationsApplicationSpecSourcePluginArgs> Plugins
        {
            get => _plugins ?? (_plugins = new List<Inputs.GetGitopsApplicationsApplicationSpecSourcePluginArgs>());
            set => _plugins = value;
        }

        [Input("repoUrl")]
        public string? RepoUrl { get; set; }

        [Input("targetRevision")]
        public string? TargetRevision { get; set; }

        public GetGitopsApplicationsApplicationSpecSourceArgs()
        {
        }
        public static new GetGitopsApplicationsApplicationSpecSourceArgs Empty => new GetGitopsApplicationsApplicationSpecSourceArgs();
    }
}