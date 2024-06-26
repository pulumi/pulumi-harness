// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.cloudprovider.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class KubernetesAuthenticationUsernamePassword {
    /**
     * @return URL of the Kubernetes master to connect to.
     * 
     */
    private String masterUrl;
    /**
     * @return Name of the Harness secret containing the password for the cluster.
     * 
     */
    private String passwordSecretName;
    /**
     * @return Username for authentication to the cluster
     * 
     */
    private @Nullable String username;
    /**
     * @return Name of the Harness secret containing the username for authentication to the cluster
     * 
     */
    private @Nullable String usernameSecretName;

    private KubernetesAuthenticationUsernamePassword() {}
    /**
     * @return URL of the Kubernetes master to connect to.
     * 
     */
    public String masterUrl() {
        return this.masterUrl;
    }
    /**
     * @return Name of the Harness secret containing the password for the cluster.
     * 
     */
    public String passwordSecretName() {
        return this.passwordSecretName;
    }
    /**
     * @return Username for authentication to the cluster
     * 
     */
    public Optional<String> username() {
        return Optional.ofNullable(this.username);
    }
    /**
     * @return Name of the Harness secret containing the username for authentication to the cluster
     * 
     */
    public Optional<String> usernameSecretName() {
        return Optional.ofNullable(this.usernameSecretName);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(KubernetesAuthenticationUsernamePassword defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String masterUrl;
        private String passwordSecretName;
        private @Nullable String username;
        private @Nullable String usernameSecretName;
        public Builder() {}
        public Builder(KubernetesAuthenticationUsernamePassword defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.masterUrl = defaults.masterUrl;
    	      this.passwordSecretName = defaults.passwordSecretName;
    	      this.username = defaults.username;
    	      this.usernameSecretName = defaults.usernameSecretName;
        }

        @CustomType.Setter
        public Builder masterUrl(String masterUrl) {
            if (masterUrl == null) {
              throw new MissingRequiredPropertyException("KubernetesAuthenticationUsernamePassword", "masterUrl");
            }
            this.masterUrl = masterUrl;
            return this;
        }
        @CustomType.Setter
        public Builder passwordSecretName(String passwordSecretName) {
            if (passwordSecretName == null) {
              throw new MissingRequiredPropertyException("KubernetesAuthenticationUsernamePassword", "passwordSecretName");
            }
            this.passwordSecretName = passwordSecretName;
            return this;
        }
        @CustomType.Setter
        public Builder username(@Nullable String username) {

            this.username = username;
            return this;
        }
        @CustomType.Setter
        public Builder usernameSecretName(@Nullable String usernameSecretName) {

            this.usernameSecretName = usernameSecretName;
            return this;
        }
        public KubernetesAuthenticationUsernamePassword build() {
            final var _resultValue = new KubernetesAuthenticationUsernamePassword();
            _resultValue.masterUrl = masterUrl;
            _resultValue.passwordSecretName = passwordSecretName;
            _resultValue.username = username;
            _resultValue.usernameSecretName = usernameSecretName;
            return _resultValue;
        }
    }
}
