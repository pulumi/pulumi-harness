// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetKubernetesConnectorClientKeyCert {
    /**
     * @return Reference to the secret containing the CA certificate for the connector. To reference a secret at the organization scope, prefix &#39;org&#39; to the expression: org.{identifier}. To reference a secret at the account scope, prefix &#39;account` to the expression: account.{identifier}.
     * 
     */
    private String caCertRef;
    /**
     * @return Reference to the secret containing the client certificate for the connector. To reference a secret at the organization scope, prefix &#39;org&#39; to the expression: org.{identifier}. To reference a secret at the account scope, prefix &#39;account` to the expression: account.{identifier}.
     * 
     */
    private String clientCertRef;
    /**
     * @return The algorithm used to generate the client key for the connector. Valid values are RSA, EC
     * 
     */
    private String clientKeyAlgorithm;
    /**
     * @return Reference to the secret containing the client key passphrase for the connector. To reference a secret at the organization scope, prefix &#39;org&#39; to the expression: org.{identifier}. To reference a secret at the account scope, prefix &#39;account` to the expression: account.{identifier}.
     * 
     */
    private String clientKeyPassphraseRef;
    /**
     * @return Reference to the secret containing the client key for the connector. To reference a secret at the organization scope, prefix &#39;org&#39; to the expression: org.{identifier}. To reference a secret at the account scope, prefix &#39;account` to the expression: account.{identifier}.
     * 
     */
    private String clientKeyRef;
    /**
     * @return The URL of the Kubernetes cluster.
     * 
     */
    private String masterUrl;

    private GetKubernetesConnectorClientKeyCert() {}
    /**
     * @return Reference to the secret containing the CA certificate for the connector. To reference a secret at the organization scope, prefix &#39;org&#39; to the expression: org.{identifier}. To reference a secret at the account scope, prefix &#39;account` to the expression: account.{identifier}.
     * 
     */
    public String caCertRef() {
        return this.caCertRef;
    }
    /**
     * @return Reference to the secret containing the client certificate for the connector. To reference a secret at the organization scope, prefix &#39;org&#39; to the expression: org.{identifier}. To reference a secret at the account scope, prefix &#39;account` to the expression: account.{identifier}.
     * 
     */
    public String clientCertRef() {
        return this.clientCertRef;
    }
    /**
     * @return The algorithm used to generate the client key for the connector. Valid values are RSA, EC
     * 
     */
    public String clientKeyAlgorithm() {
        return this.clientKeyAlgorithm;
    }
    /**
     * @return Reference to the secret containing the client key passphrase for the connector. To reference a secret at the organization scope, prefix &#39;org&#39; to the expression: org.{identifier}. To reference a secret at the account scope, prefix &#39;account` to the expression: account.{identifier}.
     * 
     */
    public String clientKeyPassphraseRef() {
        return this.clientKeyPassphraseRef;
    }
    /**
     * @return Reference to the secret containing the client key for the connector. To reference a secret at the organization scope, prefix &#39;org&#39; to the expression: org.{identifier}. To reference a secret at the account scope, prefix &#39;account` to the expression: account.{identifier}.
     * 
     */
    public String clientKeyRef() {
        return this.clientKeyRef;
    }
    /**
     * @return The URL of the Kubernetes cluster.
     * 
     */
    public String masterUrl() {
        return this.masterUrl;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetKubernetesConnectorClientKeyCert defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String caCertRef;
        private String clientCertRef;
        private String clientKeyAlgorithm;
        private String clientKeyPassphraseRef;
        private String clientKeyRef;
        private String masterUrl;
        public Builder() {}
        public Builder(GetKubernetesConnectorClientKeyCert defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.caCertRef = defaults.caCertRef;
    	      this.clientCertRef = defaults.clientCertRef;
    	      this.clientKeyAlgorithm = defaults.clientKeyAlgorithm;
    	      this.clientKeyPassphraseRef = defaults.clientKeyPassphraseRef;
    	      this.clientKeyRef = defaults.clientKeyRef;
    	      this.masterUrl = defaults.masterUrl;
        }

        @CustomType.Setter
        public Builder caCertRef(String caCertRef) {
            if (caCertRef == null) {
              throw new MissingRequiredPropertyException("GetKubernetesConnectorClientKeyCert", "caCertRef");
            }
            this.caCertRef = caCertRef;
            return this;
        }
        @CustomType.Setter
        public Builder clientCertRef(String clientCertRef) {
            if (clientCertRef == null) {
              throw new MissingRequiredPropertyException("GetKubernetesConnectorClientKeyCert", "clientCertRef");
            }
            this.clientCertRef = clientCertRef;
            return this;
        }
        @CustomType.Setter
        public Builder clientKeyAlgorithm(String clientKeyAlgorithm) {
            if (clientKeyAlgorithm == null) {
              throw new MissingRequiredPropertyException("GetKubernetesConnectorClientKeyCert", "clientKeyAlgorithm");
            }
            this.clientKeyAlgorithm = clientKeyAlgorithm;
            return this;
        }
        @CustomType.Setter
        public Builder clientKeyPassphraseRef(String clientKeyPassphraseRef) {
            if (clientKeyPassphraseRef == null) {
              throw new MissingRequiredPropertyException("GetKubernetesConnectorClientKeyCert", "clientKeyPassphraseRef");
            }
            this.clientKeyPassphraseRef = clientKeyPassphraseRef;
            return this;
        }
        @CustomType.Setter
        public Builder clientKeyRef(String clientKeyRef) {
            if (clientKeyRef == null) {
              throw new MissingRequiredPropertyException("GetKubernetesConnectorClientKeyCert", "clientKeyRef");
            }
            this.clientKeyRef = clientKeyRef;
            return this;
        }
        @CustomType.Setter
        public Builder masterUrl(String masterUrl) {
            if (masterUrl == null) {
              throw new MissingRequiredPropertyException("GetKubernetesConnectorClientKeyCert", "masterUrl");
            }
            this.masterUrl = masterUrl;
            return this;
        }
        public GetKubernetesConnectorClientKeyCert build() {
            final var _resultValue = new GetKubernetesConnectorClientKeyCert();
            _resultValue.caCertRef = caCertRef;
            _resultValue.clientCertRef = clientCertRef;
            _resultValue.clientKeyAlgorithm = clientKeyAlgorithm;
            _resultValue.clientKeyPassphraseRef = clientKeyPassphraseRef;
            _resultValue.clientKeyRef = clientKeyRef;
            _resultValue.masterUrl = masterUrl;
            return _resultValue;
        }
    }
}