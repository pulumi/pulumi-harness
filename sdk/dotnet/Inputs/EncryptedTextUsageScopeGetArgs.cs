// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Harness.Inputs
{

    public sealed class EncryptedTextUsageScopeGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Id of the application to scope to. If empty then this scope applies to all applications.
        /// </summary>
        [Input("applicationId")]
        public Input<string>? ApplicationId { get; set; }

        /// <summary>
        /// Type of environment filter applied. Cannot be used with `environment_id`. Valid options are NON*PRODUCTION*ENVIRONMENTS, PRODUCTION_ENVIRONMENTS.
        /// </summary>
        [Input("environmentFilterType")]
        public Input<string>? EnvironmentFilterType { get; set; }

        /// <summary>
        /// Id of the id of the specific environment to scope to. Cannot be used with `environment_filter_type`.
        /// </summary>
        [Input("environmentId")]
        public Input<string>? EnvironmentId { get; set; }

        public EncryptedTextUsageScopeGetArgs()
        {
        }
        public static new EncryptedTextUsageScopeGetArgs Empty => new EncryptedTextUsageScopeGetArgs();
    }
}
