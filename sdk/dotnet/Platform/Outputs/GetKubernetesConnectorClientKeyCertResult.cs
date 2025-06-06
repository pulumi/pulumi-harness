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
    public sealed class GetKubernetesConnectorClientKeyCertResult
    {
        /// <summary>
        /// Reference to the secret containing the CA certificate for the connector. To reference a secret at the organization scope, prefix 'org' to the expression: org.{identifier}. To reference a secret at the account scope, prefix 'account` to the expression: account.{identifier}.
        /// </summary>
        public readonly string CaCertRef;
        /// <summary>
        /// Reference to the secret containing the client certificate for the connector. To reference a secret at the organization scope, prefix 'org' to the expression: org.{identifier}. To reference a secret at the account scope, prefix 'account` to the expression: account.{identifier}.
        /// </summary>
        public readonly string ClientCertRef;
        /// <summary>
        /// The algorithm used to generate the client key for the connector. Valid values are RSA, EC
        /// </summary>
        public readonly string ClientKeyAlgorithm;
        /// <summary>
        /// Reference to the secret containing the client key passphrase for the connector. To reference a secret at the organization scope, prefix 'org' to the expression: org.{identifier}. To reference a secret at the account scope, prefix 'account` to the expression: account.{identifier}.
        /// </summary>
        public readonly string ClientKeyPassphraseRef;
        /// <summary>
        /// Reference to the secret containing the client key for the connector. To reference a secret at the organization scope, prefix 'org' to the expression: org.{identifier}. To reference a secret at the account scope, prefix 'account` to the expression: account.{identifier}.
        /// </summary>
        public readonly string ClientKeyRef;
        /// <summary>
        /// The URL of the Kubernetes cluster.
        /// </summary>
        public readonly string MasterUrl;

        [OutputConstructor]
        private GetKubernetesConnectorClientKeyCertResult(
            string caCertRef,

            string clientCertRef,

            string clientKeyAlgorithm,

            string clientKeyPassphraseRef,

            string clientKeyRef,

            string masterUrl)
        {
            CaCertRef = caCertRef;
            ClientCertRef = clientCertRef;
            ClientKeyAlgorithm = clientKeyAlgorithm;
            ClientKeyPassphraseRef = clientKeyPassphraseRef;
            ClientKeyRef = clientKeyRef;
            MasterUrl = masterUrl;
        }
    }
}
