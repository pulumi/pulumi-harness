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
    public sealed class GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorScmProviderTemplateSpecSourceHelm
    {
        /// <summary>
        /// File parameters for the helm template.
        /// </summary>
        public readonly ImmutableArray<Outputs.GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorScmProviderTemplateSpecSourceHelmFileParameter> FileParameters;
        /// <summary>
        /// Prevents 'helm template' from failing when `value_files` do not exist locally by not appending them to 'helm template --values'.
        /// </summary>
        public readonly bool? IgnoreMissingValueFiles;
        /// <summary>
        /// Helm parameters which are passed to the helm template command upon manifest generation.
        /// </summary>
        public readonly ImmutableArray<Outputs.GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorScmProviderTemplateSpecSourceHelmParameter> Parameters;
        /// <summary>
        /// If true then adds '--pass-credentials' to Helm commands to pass credentials to all domains.
        /// </summary>
        public readonly bool? PassCredentials;
        /// <summary>
        /// Helm release name. If omitted it will use the application name.
        /// </summary>
        public readonly string? ReleaseName;
        /// <summary>
        /// Whether to skip custom resource definition installation step (Helm's [--skip-crds](https://helm.sh/docs/chart_best_practices/custom_resource_definitions/)).
        /// </summary>
        public readonly bool? SkipCrds;
        /// <summary>
        /// List of Helm value files to use when generating a template.
        /// </summary>
        public readonly ImmutableArray<string> ValueFiles;
        /// <summary>
        /// Helm values to be passed to 'helm template', typically defined as a block.
        /// </summary>
        public readonly string? Values;

        [OutputConstructor]
        private GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorScmProviderTemplateSpecSourceHelm(
            ImmutableArray<Outputs.GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorScmProviderTemplateSpecSourceHelmFileParameter> fileParameters,

            bool? ignoreMissingValueFiles,

            ImmutableArray<Outputs.GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorScmProviderTemplateSpecSourceHelmParameter> parameters,

            bool? passCredentials,

            string? releaseName,

            bool? skipCrds,

            ImmutableArray<string> valueFiles,

            string? values)
        {
            FileParameters = fileParameters;
            IgnoreMissingValueFiles = ignoreMissingValueFiles;
            Parameters = parameters;
            PassCredentials = passCredentials;
            ReleaseName = releaseName;
            SkipCrds = skipCrds;
            ValueFiles = valueFiles;
            Values = values;
        }
    }
}
