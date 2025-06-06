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
    public sealed class GitopsAppProjectProjectSpecOrphanedResource
    {
        /// <summary>
        /// List of ignored orphaned resources.
        /// </summary>
        public readonly ImmutableArray<Outputs.GitopsAppProjectProjectSpecOrphanedResourceIgnore> Ignores;
        /// <summary>
        /// Whether to warn about orphaned resources.
        /// </summary>
        public readonly bool? Warn;

        [OutputConstructor]
        private GitopsAppProjectProjectSpecOrphanedResource(
            ImmutableArray<Outputs.GitopsAppProjectProjectSpecOrphanedResourceIgnore> ignores,

            bool? warn)
        {
            Ignores = ignores;
            Warn = warn;
        }
    }
}
