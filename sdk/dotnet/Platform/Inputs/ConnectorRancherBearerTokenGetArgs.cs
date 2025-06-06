// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Harness.Platform.Inputs
{

    public sealed class ConnectorRancherBearerTokenGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Reference to the secret containing the bearer token for the rancher cluster. To reference a secret at the organization scope, prefix 'org' to the expression: org.{identifier}. To reference a secret at the account scope, prefix 'account` to the expression: account.{identifier}.
        /// </summary>
        [Input("bearerTokenRef", required: true)]
        public Input<string> BearerTokenRef { get; set; } = null!;

        public ConnectorRancherBearerTokenGetArgs()
        {
        }
        public static new ConnectorRancherBearerTokenGetArgs Empty => new ConnectorRancherBearerTokenGetArgs();
    }
}
