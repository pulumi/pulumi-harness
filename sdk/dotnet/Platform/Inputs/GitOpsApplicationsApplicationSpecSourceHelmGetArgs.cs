// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Harness.Platform.Inputs
{

    public sealed class GitOpsApplicationsApplicationSpecSourceHelmGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("fileParameters")]
        private InputList<Inputs.GitOpsApplicationsApplicationSpecSourceHelmFileParameterGetArgs>? _fileParameters;

        /// <summary>
        /// File parameters to the helm template.
        /// </summary>
        public InputList<Inputs.GitOpsApplicationsApplicationSpecSourceHelmFileParameterGetArgs> FileParameters
        {
            get => _fileParameters ?? (_fileParameters = new InputList<Inputs.GitOpsApplicationsApplicationSpecSourceHelmFileParameterGetArgs>());
            set => _fileParameters = value;
        }

        /// <summary>
        /// Prevents 'helm template' from failing when value_files do not exist locally.
        /// </summary>
        [Input("ignoreMissingValueFiles")]
        public Input<bool>? IgnoreMissingValueFiles { get; set; }

        [Input("parameters")]
        private InputList<Inputs.GitOpsApplicationsApplicationSpecSourceHelmParameterGetArgs>? _parameters;

        /// <summary>
        /// List of helm parameters which are passed to the helm template command upon manifest generation.
        /// </summary>
        public InputList<Inputs.GitOpsApplicationsApplicationSpecSourceHelmParameterGetArgs> Parameters
        {
            get => _parameters ?? (_parameters = new InputList<Inputs.GitOpsApplicationsApplicationSpecSourceHelmParameterGetArgs>());
            set => _parameters = value;
        }

        /// <summary>
        /// Indicates if to pass credentials to all domains (helm's --pass-credentials)
        /// </summary>
        [Input("passCredentials")]
        public Input<bool>? PassCredentials { get; set; }

        /// <summary>
        /// Helm release name to use. If omitted it will use the GitOps application name.
        /// </summary>
        [Input("releaseName")]
        public Input<string>? ReleaseName { get; set; }

        /// <summary>
        /// Indicates if to skip CRDs during helm template. Corresponds to helm --skip-crds
        /// </summary>
        [Input("skipCrds")]
        public Input<bool>? SkipCrds { get; set; }

        /// <summary>
        /// Indicates if to skip schema validation during helm template. Corresponds to helm --skip-schema-validation
        /// </summary>
        [Input("skipSchemaValidation")]
        public Input<bool>? SkipSchemaValidation { get; set; }

        /// <summary>
        /// Indicates if to skip tests during helm template. Corresponds to helm --skip-tests
        /// </summary>
        [Input("skipTests")]
        public Input<bool>? SkipTests { get; set; }

        [Input("valueFiles")]
        private InputList<string>? _valueFiles;

        /// <summary>
        /// List of helm value files to use when generating a template.
        /// </summary>
        public InputList<string> ValueFiles
        {
            get => _valueFiles ?? (_valueFiles = new InputList<string>());
            set => _valueFiles = value;
        }

        /// <summary>
        /// Helm values to be passed to helm template, typically defined as a block.
        /// </summary>
        [Input("values")]
        public Input<string>? Values { get; set; }

        /// <summary>
        /// Helm version to use for templating (either "2" or "3")
        /// </summary>
        [Input("version")]
        public Input<string>? Version { get; set; }

        public GitOpsApplicationsApplicationSpecSourceHelmGetArgs()
        {
        }
        public static new GitOpsApplicationsApplicationSpecSourceHelmGetArgs Empty => new GitOpsApplicationsApplicationSpecSourceHelmGetArgs();
    }
}
