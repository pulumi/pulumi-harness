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
    public sealed class GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMatrixGeneratorScmProviderTemplateSpecSourceDirectoryJsonnet
    {
        /// <summary>
        /// List of Jsonnet External Variables.
        /// </summary>
        public readonly ImmutableArray<Outputs.GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMatrixGeneratorScmProviderTemplateSpecSourceDirectoryJsonnetExtVar> ExtVars;
        /// <summary>
        /// Additional library search dirs.
        /// </summary>
        public readonly ImmutableArray<string> Libs;
        /// <summary>
        /// List of Jsonnet Top-level Arguments
        /// </summary>
        public readonly ImmutableArray<Outputs.GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMatrixGeneratorScmProviderTemplateSpecSourceDirectoryJsonnetTla> Tlas;

        [OutputConstructor]
        private GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMatrixGeneratorScmProviderTemplateSpecSourceDirectoryJsonnet(
            ImmutableArray<Outputs.GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMatrixGeneratorScmProviderTemplateSpecSourceDirectoryJsonnetExtVar> extVars,

            ImmutableArray<string> libs,

            ImmutableArray<Outputs.GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMatrixGeneratorScmProviderTemplateSpecSourceDirectoryJsonnetTla> tlas)
        {
            ExtVars = extVars;
            Libs = libs;
            Tlas = tlas;
        }
    }
}
