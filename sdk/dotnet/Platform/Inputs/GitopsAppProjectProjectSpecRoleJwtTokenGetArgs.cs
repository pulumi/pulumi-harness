// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Harness.Platform.Inputs
{

    public sealed class GitopsAppProjectProjectSpecRoleJwtTokenGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Expiration time of the JWT token.
        /// </summary>
        [Input("exp")]
        public Input<string>? Exp { get; set; }

        /// <summary>
        /// Issued At time of the JWT token.
        /// </summary>
        [Input("iat")]
        public Input<string>? Iat { get; set; }

        /// <summary>
        /// ID of the JWT token.
        /// </summary>
        [Input("id")]
        public Input<string>? Id { get; set; }

        public GitopsAppProjectProjectSpecRoleJwtTokenGetArgs()
        {
        }
        public static new GitopsAppProjectProjectSpecRoleJwtTokenGetArgs Empty => new GitopsAppProjectProjectSpecRoleJwtTokenGetArgs();
    }
}