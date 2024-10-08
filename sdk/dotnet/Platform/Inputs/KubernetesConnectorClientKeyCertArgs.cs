// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Harness.Platform.Inputs
{

    public sealed class KubernetesConnectorClientKeyCertArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Reference to the secret containing the CA certificate for the connector. To reference a secret at the organization scope, prefix 'org' to the expression: org.{identifier}. To reference a secret at the account scope, prefix 'account` to the expression: account.{identifier}.
        /// </summary>
        [Input("caCertRef")]
        public Input<string>? CaCertRef { get; set; }

        /// <summary>
        /// Reference to the secret containing the client certificate for the connector. To reference a secret at the organization scope, prefix 'org' to the expression: org.{identifier}. To reference a secret at the account scope, prefix 'account` to the expression: account.{identifier}.
        /// </summary>
        [Input("clientCertRef", required: true)]
        public Input<string> ClientCertRef { get; set; } = null!;

        /// <summary>
        /// The algorithm used to generate the client key for the connector. Valid values are RSA, EC
        /// </summary>
        [Input("clientKeyAlgorithm", required: true)]
        public Input<string> ClientKeyAlgorithm { get; set; } = null!;

        /// <summary>
        /// Reference to the secret containing the client key passphrase for the connector. To reference a secret at the organization scope, prefix 'org' to the expression: org.{identifier}. To reference a secret at the account scope, prefix 'account` to the expression: account.{identifier}.
        /// </summary>
        [Input("clientKeyPassphraseRef")]
        public Input<string>? ClientKeyPassphraseRef { get; set; }

        /// <summary>
        /// Reference to the secret containing the client key for the connector. To reference a secret at the organization scope, prefix 'org' to the expression: org.{identifier}. To reference a secret at the account scope, prefix 'account` to the expression: account.{identifier}.
        /// </summary>
        [Input("clientKeyRef", required: true)]
        public Input<string> ClientKeyRef { get; set; } = null!;

        /// <summary>
        /// The URL of the Kubernetes cluster.
        /// </summary>
        [Input("masterUrl", required: true)]
        public Input<string> MasterUrl { get; set; } = null!;

        public KubernetesConnectorClientKeyCertArgs()
        {
        }
        public static new KubernetesConnectorClientKeyCertArgs Empty => new KubernetesConnectorClientKeyCertArgs();
    }
}