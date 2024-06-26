// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class KubernetesConnectorOpenidConnect {
    /**
     * @return Reference to the secret containing the client ID for the connector. To reference a secret at the organization scope, prefix &#39;org&#39; to the expression: org.{identifier}. To reference a secret at the account scope, prefix &#39;account` to the expression: account.{identifier}.
     * 
     */
    private String clientIdRef;
    /**
     * @return The URL of the OpenID Connect issuer.
     * 
     */
    private String issuerUrl;
    /**
     * @return The URL of the Kubernetes cluster.
     * 
     */
    private String masterUrl;
    /**
     * @return Reference to the secret containing the password for the connector. To reference a secret at the organization scope, prefix &#39;org&#39; to the expression: org.{identifier}. To reference a secret at the account scope, prefix &#39;account` to the expression: account.{identifier}.
     * 
     */
    private String passwordRef;
    /**
     * @return Scopes to request for the connector.
     * 
     */
    private @Nullable List<String> scopes;
    /**
     * @return Reference to the secret containing the client secret for the connector. To reference a secret at the organization scope, prefix &#39;org&#39; to the expression: org.{identifier}. To reference a secret at the account scope, prefix &#39;account` to the expression: account.{identifier}.
     * 
     */
    private @Nullable String secretRef;
    /**
     * @return Username for the connector.
     * 
     */
    private @Nullable String username;
    /**
     * @return Reference to the secret containing the username for the connector. To reference a secret at the organization scope, prefix &#39;org&#39; to the expression: org.{identifier}. To reference a secret at the account scope, prefix &#39;account` to the expression: account.{identifier}.
     * 
     */
    private @Nullable String usernameRef;

    private KubernetesConnectorOpenidConnect() {}
    /**
     * @return Reference to the secret containing the client ID for the connector. To reference a secret at the organization scope, prefix &#39;org&#39; to the expression: org.{identifier}. To reference a secret at the account scope, prefix &#39;account` to the expression: account.{identifier}.
     * 
     */
    public String clientIdRef() {
        return this.clientIdRef;
    }
    /**
     * @return The URL of the OpenID Connect issuer.
     * 
     */
    public String issuerUrl() {
        return this.issuerUrl;
    }
    /**
     * @return The URL of the Kubernetes cluster.
     * 
     */
    public String masterUrl() {
        return this.masterUrl;
    }
    /**
     * @return Reference to the secret containing the password for the connector. To reference a secret at the organization scope, prefix &#39;org&#39; to the expression: org.{identifier}. To reference a secret at the account scope, prefix &#39;account` to the expression: account.{identifier}.
     * 
     */
    public String passwordRef() {
        return this.passwordRef;
    }
    /**
     * @return Scopes to request for the connector.
     * 
     */
    public List<String> scopes() {
        return this.scopes == null ? List.of() : this.scopes;
    }
    /**
     * @return Reference to the secret containing the client secret for the connector. To reference a secret at the organization scope, prefix &#39;org&#39; to the expression: org.{identifier}. To reference a secret at the account scope, prefix &#39;account` to the expression: account.{identifier}.
     * 
     */
    public Optional<String> secretRef() {
        return Optional.ofNullable(this.secretRef);
    }
    /**
     * @return Username for the connector.
     * 
     */
    public Optional<String> username() {
        return Optional.ofNullable(this.username);
    }
    /**
     * @return Reference to the secret containing the username for the connector. To reference a secret at the organization scope, prefix &#39;org&#39; to the expression: org.{identifier}. To reference a secret at the account scope, prefix &#39;account` to the expression: account.{identifier}.
     * 
     */
    public Optional<String> usernameRef() {
        return Optional.ofNullable(this.usernameRef);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(KubernetesConnectorOpenidConnect defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String clientIdRef;
        private String issuerUrl;
        private String masterUrl;
        private String passwordRef;
        private @Nullable List<String> scopes;
        private @Nullable String secretRef;
        private @Nullable String username;
        private @Nullable String usernameRef;
        public Builder() {}
        public Builder(KubernetesConnectorOpenidConnect defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clientIdRef = defaults.clientIdRef;
    	      this.issuerUrl = defaults.issuerUrl;
    	      this.masterUrl = defaults.masterUrl;
    	      this.passwordRef = defaults.passwordRef;
    	      this.scopes = defaults.scopes;
    	      this.secretRef = defaults.secretRef;
    	      this.username = defaults.username;
    	      this.usernameRef = defaults.usernameRef;
        }

        @CustomType.Setter
        public Builder clientIdRef(String clientIdRef) {
            if (clientIdRef == null) {
              throw new MissingRequiredPropertyException("KubernetesConnectorOpenidConnect", "clientIdRef");
            }
            this.clientIdRef = clientIdRef;
            return this;
        }
        @CustomType.Setter
        public Builder issuerUrl(String issuerUrl) {
            if (issuerUrl == null) {
              throw new MissingRequiredPropertyException("KubernetesConnectorOpenidConnect", "issuerUrl");
            }
            this.issuerUrl = issuerUrl;
            return this;
        }
        @CustomType.Setter
        public Builder masterUrl(String masterUrl) {
            if (masterUrl == null) {
              throw new MissingRequiredPropertyException("KubernetesConnectorOpenidConnect", "masterUrl");
            }
            this.masterUrl = masterUrl;
            return this;
        }
        @CustomType.Setter
        public Builder passwordRef(String passwordRef) {
            if (passwordRef == null) {
              throw new MissingRequiredPropertyException("KubernetesConnectorOpenidConnect", "passwordRef");
            }
            this.passwordRef = passwordRef;
            return this;
        }
        @CustomType.Setter
        public Builder scopes(@Nullable List<String> scopes) {

            this.scopes = scopes;
            return this;
        }
        public Builder scopes(String... scopes) {
            return scopes(List.of(scopes));
        }
        @CustomType.Setter
        public Builder secretRef(@Nullable String secretRef) {

            this.secretRef = secretRef;
            return this;
        }
        @CustomType.Setter
        public Builder username(@Nullable String username) {

            this.username = username;
            return this;
        }
        @CustomType.Setter
        public Builder usernameRef(@Nullable String usernameRef) {

            this.usernameRef = usernameRef;
            return this;
        }
        public KubernetesConnectorOpenidConnect build() {
            final var _resultValue = new KubernetesConnectorOpenidConnect();
            _resultValue.clientIdRef = clientIdRef;
            _resultValue.issuerUrl = issuerUrl;
            _resultValue.masterUrl = masterUrl;
            _resultValue.passwordRef = passwordRef;
            _resultValue.scopes = scopes;
            _resultValue.secretRef = secretRef;
            _resultValue.username = username;
            _resultValue.usernameRef = usernameRef;
            return _resultValue;
        }
    }
}
