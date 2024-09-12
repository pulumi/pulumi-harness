// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Harness.Platform.Outputs
{

    [OutputType]
    public sealed class GetGitopsGnupgRequestResult
    {
        /// <summary>
        /// Public key details.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetGitopsGnupgRequestPublickeyResult> Publickeys;
        /// <summary>
        /// Indicates if the GnuPG Key should be inserted if not present or updated if present.
        /// </summary>
        public readonly bool? Upsert;

        [OutputConstructor]
        private GetGitopsGnupgRequestResult(
            ImmutableArray<Outputs.GetGitopsGnupgRequestPublickeyResult> publickeys,

            bool? upsert)
        {
            Publickeys = publickeys;
            Upsert = upsert;
        }
    }
}