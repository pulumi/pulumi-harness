// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.cloudprovider.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class KubernetesAuthenticationUsernamePasswordArgs extends com.pulumi.resources.ResourceArgs {

    public static final KubernetesAuthenticationUsernamePasswordArgs Empty = new KubernetesAuthenticationUsernamePasswordArgs();

    /**
     * URL of the Kubernetes master to connect to.
     * 
     */
    @Import(name="masterUrl", required=true)
    private Output<String> masterUrl;

    /**
     * @return URL of the Kubernetes master to connect to.
     * 
     */
    public Output<String> masterUrl() {
        return this.masterUrl;
    }

    /**
     * Name of the Harness secret containing the password for the cluster.
     * 
     */
    @Import(name="passwordSecretName", required=true)
    private Output<String> passwordSecretName;

    /**
     * @return Name of the Harness secret containing the password for the cluster.
     * 
     */
    public Output<String> passwordSecretName() {
        return this.passwordSecretName;
    }

    /**
     * Username for authentication to the cluster
     * 
     */
    @Import(name="username")
    private @Nullable Output<String> username;

    /**
     * @return Username for authentication to the cluster
     * 
     */
    public Optional<Output<String>> username() {
        return Optional.ofNullable(this.username);
    }

    /**
     * Name of the Harness secret containing the username for authentication to the cluster
     * 
     */
    @Import(name="usernameSecretName")
    private @Nullable Output<String> usernameSecretName;

    /**
     * @return Name of the Harness secret containing the username for authentication to the cluster
     * 
     */
    public Optional<Output<String>> usernameSecretName() {
        return Optional.ofNullable(this.usernameSecretName);
    }

    private KubernetesAuthenticationUsernamePasswordArgs() {}

    private KubernetesAuthenticationUsernamePasswordArgs(KubernetesAuthenticationUsernamePasswordArgs $) {
        this.masterUrl = $.masterUrl;
        this.passwordSecretName = $.passwordSecretName;
        this.username = $.username;
        this.usernameSecretName = $.usernameSecretName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(KubernetesAuthenticationUsernamePasswordArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private KubernetesAuthenticationUsernamePasswordArgs $;

        public Builder() {
            $ = new KubernetesAuthenticationUsernamePasswordArgs();
        }

        public Builder(KubernetesAuthenticationUsernamePasswordArgs defaults) {
            $ = new KubernetesAuthenticationUsernamePasswordArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param masterUrl URL of the Kubernetes master to connect to.
         * 
         * @return builder
         * 
         */
        public Builder masterUrl(Output<String> masterUrl) {
            $.masterUrl = masterUrl;
            return this;
        }

        /**
         * @param masterUrl URL of the Kubernetes master to connect to.
         * 
         * @return builder
         * 
         */
        public Builder masterUrl(String masterUrl) {
            return masterUrl(Output.of(masterUrl));
        }

        /**
         * @param passwordSecretName Name of the Harness secret containing the password for the cluster.
         * 
         * @return builder
         * 
         */
        public Builder passwordSecretName(Output<String> passwordSecretName) {
            $.passwordSecretName = passwordSecretName;
            return this;
        }

        /**
         * @param passwordSecretName Name of the Harness secret containing the password for the cluster.
         * 
         * @return builder
         * 
         */
        public Builder passwordSecretName(String passwordSecretName) {
            return passwordSecretName(Output.of(passwordSecretName));
        }

        /**
         * @param username Username for authentication to the cluster
         * 
         * @return builder
         * 
         */
        public Builder username(@Nullable Output<String> username) {
            $.username = username;
            return this;
        }

        /**
         * @param username Username for authentication to the cluster
         * 
         * @return builder
         * 
         */
        public Builder username(String username) {
            return username(Output.of(username));
        }

        /**
         * @param usernameSecretName Name of the Harness secret containing the username for authentication to the cluster
         * 
         * @return builder
         * 
         */
        public Builder usernameSecretName(@Nullable Output<String> usernameSecretName) {
            $.usernameSecretName = usernameSecretName;
            return this;
        }

        /**
         * @param usernameSecretName Name of the Harness secret containing the username for authentication to the cluster
         * 
         * @return builder
         * 
         */
        public Builder usernameSecretName(String usernameSecretName) {
            return usernameSecretName(Output.of(usernameSecretName));
        }

        public KubernetesAuthenticationUsernamePasswordArgs build() {
            if ($.masterUrl == null) {
                throw new MissingRequiredPropertyException("KubernetesAuthenticationUsernamePasswordArgs", "masterUrl");
            }
            if ($.passwordSecretName == null) {
                throw new MissingRequiredPropertyException("KubernetesAuthenticationUsernamePasswordArgs", "passwordSecretName");
            }
            return $;
        }
    }

}
