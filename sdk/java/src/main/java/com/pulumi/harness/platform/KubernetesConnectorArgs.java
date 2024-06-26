// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.harness.platform.inputs.KubernetesConnectorClientKeyCertArgs;
import com.pulumi.harness.platform.inputs.KubernetesConnectorInheritFromDelegateArgs;
import com.pulumi.harness.platform.inputs.KubernetesConnectorOpenidConnectArgs;
import com.pulumi.harness.platform.inputs.KubernetesConnectorServiceAccountArgs;
import com.pulumi.harness.platform.inputs.KubernetesConnectorUsernamePasswordArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class KubernetesConnectorArgs extends com.pulumi.resources.ResourceArgs {

    public static final KubernetesConnectorArgs Empty = new KubernetesConnectorArgs();

    /**
     * Client key and certificate config for the connector.
     * 
     */
    @Import(name="clientKeyCert")
    private @Nullable Output<KubernetesConnectorClientKeyCertArgs> clientKeyCert;

    /**
     * @return Client key and certificate config for the connector.
     * 
     */
    public Optional<Output<KubernetesConnectorClientKeyCertArgs>> clientKeyCert() {
        return Optional.ofNullable(this.clientKeyCert);
    }

    /**
     * Selectors to use for the delegate.
     * 
     */
    @Import(name="delegateSelectors")
    private @Nullable Output<List<String>> delegateSelectors;

    /**
     * @return Selectors to use for the delegate.
     * 
     */
    public Optional<Output<List<String>>> delegateSelectors() {
        return Optional.ofNullable(this.delegateSelectors);
    }

    /**
     * Description of the resource.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return Description of the resource.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Unique identifier of the resource.
     * 
     */
    @Import(name="identifier", required=true)
    private Output<String> identifier;

    /**
     * @return Unique identifier of the resource.
     * 
     */
    public Output<String> identifier() {
        return this.identifier;
    }

    /**
     * Credentials are inherited from the delegate.
     * 
     */
    @Import(name="inheritFromDelegate")
    private @Nullable Output<KubernetesConnectorInheritFromDelegateArgs> inheritFromDelegate;

    /**
     * @return Credentials are inherited from the delegate.
     * 
     */
    public Optional<Output<KubernetesConnectorInheritFromDelegateArgs>> inheritFromDelegate() {
        return Optional.ofNullable(this.inheritFromDelegate);
    }

    /**
     * Name of the resource.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Name of the resource.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * OpenID configuration for the connector.
     * 
     */
    @Import(name="openidConnect")
    private @Nullable Output<KubernetesConnectorOpenidConnectArgs> openidConnect;

    /**
     * @return OpenID configuration for the connector.
     * 
     */
    public Optional<Output<KubernetesConnectorOpenidConnectArgs>> openidConnect() {
        return Optional.ofNullable(this.openidConnect);
    }

    /**
     * Unique identifier of the organization.
     * 
     */
    @Import(name="orgId")
    private @Nullable Output<String> orgId;

    /**
     * @return Unique identifier of the organization.
     * 
     */
    public Optional<Output<String>> orgId() {
        return Optional.ofNullable(this.orgId);
    }

    /**
     * Unique identifier of the project.
     * 
     */
    @Import(name="projectId")
    private @Nullable Output<String> projectId;

    /**
     * @return Unique identifier of the project.
     * 
     */
    public Optional<Output<String>> projectId() {
        return Optional.ofNullable(this.projectId);
    }

    /**
     * Service account for the connector.
     * 
     */
    @Import(name="serviceAccount")
    private @Nullable Output<KubernetesConnectorServiceAccountArgs> serviceAccount;

    /**
     * @return Service account for the connector.
     * 
     */
    public Optional<Output<KubernetesConnectorServiceAccountArgs>> serviceAccount() {
        return Optional.ofNullable(this.serviceAccount);
    }

    /**
     * Tags to associate with the resource.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<List<String>> tags;

    /**
     * @return Tags to associate with the resource.
     * 
     */
    public Optional<Output<List<String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * Username and password for the connector.
     * 
     */
    @Import(name="usernamePassword")
    private @Nullable Output<KubernetesConnectorUsernamePasswordArgs> usernamePassword;

    /**
     * @return Username and password for the connector.
     * 
     */
    public Optional<Output<KubernetesConnectorUsernamePasswordArgs>> usernamePassword() {
        return Optional.ofNullable(this.usernamePassword);
    }

    private KubernetesConnectorArgs() {}

    private KubernetesConnectorArgs(KubernetesConnectorArgs $) {
        this.clientKeyCert = $.clientKeyCert;
        this.delegateSelectors = $.delegateSelectors;
        this.description = $.description;
        this.identifier = $.identifier;
        this.inheritFromDelegate = $.inheritFromDelegate;
        this.name = $.name;
        this.openidConnect = $.openidConnect;
        this.orgId = $.orgId;
        this.projectId = $.projectId;
        this.serviceAccount = $.serviceAccount;
        this.tags = $.tags;
        this.usernamePassword = $.usernamePassword;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(KubernetesConnectorArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private KubernetesConnectorArgs $;

        public Builder() {
            $ = new KubernetesConnectorArgs();
        }

        public Builder(KubernetesConnectorArgs defaults) {
            $ = new KubernetesConnectorArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param clientKeyCert Client key and certificate config for the connector.
         * 
         * @return builder
         * 
         */
        public Builder clientKeyCert(@Nullable Output<KubernetesConnectorClientKeyCertArgs> clientKeyCert) {
            $.clientKeyCert = clientKeyCert;
            return this;
        }

        /**
         * @param clientKeyCert Client key and certificate config for the connector.
         * 
         * @return builder
         * 
         */
        public Builder clientKeyCert(KubernetesConnectorClientKeyCertArgs clientKeyCert) {
            return clientKeyCert(Output.of(clientKeyCert));
        }

        /**
         * @param delegateSelectors Selectors to use for the delegate.
         * 
         * @return builder
         * 
         */
        public Builder delegateSelectors(@Nullable Output<List<String>> delegateSelectors) {
            $.delegateSelectors = delegateSelectors;
            return this;
        }

        /**
         * @param delegateSelectors Selectors to use for the delegate.
         * 
         * @return builder
         * 
         */
        public Builder delegateSelectors(List<String> delegateSelectors) {
            return delegateSelectors(Output.of(delegateSelectors));
        }

        /**
         * @param delegateSelectors Selectors to use for the delegate.
         * 
         * @return builder
         * 
         */
        public Builder delegateSelectors(String... delegateSelectors) {
            return delegateSelectors(List.of(delegateSelectors));
        }

        /**
         * @param description Description of the resource.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Description of the resource.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param identifier Unique identifier of the resource.
         * 
         * @return builder
         * 
         */
        public Builder identifier(Output<String> identifier) {
            $.identifier = identifier;
            return this;
        }

        /**
         * @param identifier Unique identifier of the resource.
         * 
         * @return builder
         * 
         */
        public Builder identifier(String identifier) {
            return identifier(Output.of(identifier));
        }

        /**
         * @param inheritFromDelegate Credentials are inherited from the delegate.
         * 
         * @return builder
         * 
         */
        public Builder inheritFromDelegate(@Nullable Output<KubernetesConnectorInheritFromDelegateArgs> inheritFromDelegate) {
            $.inheritFromDelegate = inheritFromDelegate;
            return this;
        }

        /**
         * @param inheritFromDelegate Credentials are inherited from the delegate.
         * 
         * @return builder
         * 
         */
        public Builder inheritFromDelegate(KubernetesConnectorInheritFromDelegateArgs inheritFromDelegate) {
            return inheritFromDelegate(Output.of(inheritFromDelegate));
        }

        /**
         * @param name Name of the resource.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of the resource.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param openidConnect OpenID configuration for the connector.
         * 
         * @return builder
         * 
         */
        public Builder openidConnect(@Nullable Output<KubernetesConnectorOpenidConnectArgs> openidConnect) {
            $.openidConnect = openidConnect;
            return this;
        }

        /**
         * @param openidConnect OpenID configuration for the connector.
         * 
         * @return builder
         * 
         */
        public Builder openidConnect(KubernetesConnectorOpenidConnectArgs openidConnect) {
            return openidConnect(Output.of(openidConnect));
        }

        /**
         * @param orgId Unique identifier of the organization.
         * 
         * @return builder
         * 
         */
        public Builder orgId(@Nullable Output<String> orgId) {
            $.orgId = orgId;
            return this;
        }

        /**
         * @param orgId Unique identifier of the organization.
         * 
         * @return builder
         * 
         */
        public Builder orgId(String orgId) {
            return orgId(Output.of(orgId));
        }

        /**
         * @param projectId Unique identifier of the project.
         * 
         * @return builder
         * 
         */
        public Builder projectId(@Nullable Output<String> projectId) {
            $.projectId = projectId;
            return this;
        }

        /**
         * @param projectId Unique identifier of the project.
         * 
         * @return builder
         * 
         */
        public Builder projectId(String projectId) {
            return projectId(Output.of(projectId));
        }

        /**
         * @param serviceAccount Service account for the connector.
         * 
         * @return builder
         * 
         */
        public Builder serviceAccount(@Nullable Output<KubernetesConnectorServiceAccountArgs> serviceAccount) {
            $.serviceAccount = serviceAccount;
            return this;
        }

        /**
         * @param serviceAccount Service account for the connector.
         * 
         * @return builder
         * 
         */
        public Builder serviceAccount(KubernetesConnectorServiceAccountArgs serviceAccount) {
            return serviceAccount(Output.of(serviceAccount));
        }

        /**
         * @param tags Tags to associate with the resource.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<List<String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags Tags to associate with the resource.
         * 
         * @return builder
         * 
         */
        public Builder tags(List<String> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param tags Tags to associate with the resource.
         * 
         * @return builder
         * 
         */
        public Builder tags(String... tags) {
            return tags(List.of(tags));
        }

        /**
         * @param usernamePassword Username and password for the connector.
         * 
         * @return builder
         * 
         */
        public Builder usernamePassword(@Nullable Output<KubernetesConnectorUsernamePasswordArgs> usernamePassword) {
            $.usernamePassword = usernamePassword;
            return this;
        }

        /**
         * @param usernamePassword Username and password for the connector.
         * 
         * @return builder
         * 
         */
        public Builder usernamePassword(KubernetesConnectorUsernamePasswordArgs usernamePassword) {
            return usernamePassword(Output.of(usernamePassword));
        }

        public KubernetesConnectorArgs build() {
            if ($.identifier == null) {
                throw new MissingRequiredPropertyException("KubernetesConnectorArgs", "identifier");
            }
            return $;
        }
    }

}