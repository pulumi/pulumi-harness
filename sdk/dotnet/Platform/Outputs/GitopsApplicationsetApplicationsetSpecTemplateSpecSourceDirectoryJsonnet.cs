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
    public sealed class GitopsApplicationsetApplicationsetSpecTemplateSpecSourceDirectoryJsonnet
    {
        /// <summary>
        /// List of Jsonnet External Variables.
        /// </summary>
        public readonly ImmutableArray<Outputs.GitopsApplicationsetApplicationsetSpecTemplateSpecSourceDirectoryJsonnetExtVar> ExtVars;
        /// <summary>
        /// Additional library search dirs.
        /// </summary>
        public readonly ImmutableArray<string> Libs;
        /// <summary>
        /// List of Jsonnet Top-level Arguments
        /// </summary>
        public readonly ImmutableArray<Outputs.GitopsApplicationsetApplicationsetSpecTemplateSpecSourceDirectoryJsonnetTla> Tlas;

        [OutputConstructor]
        private GitopsApplicationsetApplicationsetSpecTemplateSpecSourceDirectoryJsonnet(
            ImmutableArray<Outputs.GitopsApplicationsetApplicationsetSpecTemplateSpecSourceDirectoryJsonnetExtVar> extVars,

            ImmutableArray<string> libs,

            ImmutableArray<Outputs.GitopsApplicationsetApplicationsetSpecTemplateSpecSourceDirectoryJsonnetTla> tlas)
        {
            ExtVars = extVars;
            Libs = libs;
            Tlas = tlas;
        }
    }
}
