// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Harness.Platform.Inputs
{

    public sealed class GitOpsRepositoryEcrGenGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// JWT authentication specific configuration.
        /// </summary>
        [Input("jwtAuth")]
        public Input<Inputs.GitOpsRepositoryEcrGenJwtAuthGetArgs>? JwtAuth { get; set; }

        /// <summary>
        /// AWS region.
        /// </summary>
        [Input("region")]
        public Input<string>? Region { get; set; }

        /// <summary>
        /// Secret reference to the AWS credentials.
        /// </summary>
        [Input("secretRef")]
        public Input<Inputs.GitOpsRepositoryEcrGenSecretRefGetArgs>? SecretRef { get; set; }

        public GitOpsRepositoryEcrGenGetArgs()
        {
        }
        public static new GitOpsRepositoryEcrGenGetArgs Empty => new GitOpsRepositoryEcrGenGetArgs();
    }
}
