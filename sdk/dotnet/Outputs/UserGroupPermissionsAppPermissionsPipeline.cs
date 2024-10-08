// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Harness.Outputs
{

    [OutputType]
    public sealed class UserGroupPermissionsAppPermissionsPipeline
    {
        /// <summary>
        /// The actions allowed to be performed. Valid options are [CREATE READ UPDATE DELETE]
        /// </summary>
        public readonly ImmutableArray<string> Actions;
        /// <summary>
        /// The application IDs to which the permission applies. Leave empty to apply to all applications.
        /// </summary>
        public readonly ImmutableArray<string> AppIds;
        /// <summary>
        /// The environment IDs to which the permission applies. Leave empty to apply to all environments.
        /// </summary>
        public readonly ImmutableArray<string> EnvIds;
        /// <summary>
        /// The filters to apply to the action. Valid options are: NON*PRODUCTION*PIPELINES, PRODUCTION_PIPELINES.
        /// </summary>
        public readonly ImmutableArray<string> Filters;

        [OutputConstructor]
        private UserGroupPermissionsAppPermissionsPipeline(
            ImmutableArray<string> actions,

            ImmutableArray<string> appIds,

            ImmutableArray<string> envIds,

            ImmutableArray<string> filters)
        {
            Actions = actions;
            AppIds = appIds;
            EnvIds = envIds;
            Filters = filters;
        }
    }
}