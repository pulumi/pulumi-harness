// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.harness.platform.inputs.AwsSecretManagerConnectorCredentialsAssumeRoleArgs;
import com.pulumi.harness.platform.inputs.AwsSecretManagerConnectorCredentialsManualArgs;
import com.pulumi.harness.platform.inputs.AwsSecretManagerConnectorCredentialsOidcAuthenticationArgs;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AwsSecretManagerConnectorCredentialsArgs extends com.pulumi.resources.ResourceArgs {

    public static final AwsSecretManagerConnectorCredentialsArgs Empty = new AwsSecretManagerConnectorCredentialsArgs();

    /**
     * Connect using STS assume role.
     * 
     */
    @Import(name="assumeRole")
    private @Nullable Output<AwsSecretManagerConnectorCredentialsAssumeRoleArgs> assumeRole;

    /**
     * @return Connect using STS assume role.
     * 
     */
    public Optional<Output<AwsSecretManagerConnectorCredentialsAssumeRoleArgs>> assumeRole() {
        return Optional.ofNullable(this.assumeRole);
    }

    /**
     * Inherit the credentials from from the delegate.
     * 
     */
    @Import(name="inheritFromDelegate")
    private @Nullable Output<Boolean> inheritFromDelegate;

    /**
     * @return Inherit the credentials from from the delegate.
     * 
     */
    public Optional<Output<Boolean>> inheritFromDelegate() {
        return Optional.ofNullable(this.inheritFromDelegate);
    }

    /**
     * Specify the AWS key and secret used for authenticating.
     * 
     */
    @Import(name="manual")
    private @Nullable Output<AwsSecretManagerConnectorCredentialsManualArgs> manual;

    /**
     * @return Specify the AWS key and secret used for authenticating.
     * 
     */
    public Optional<Output<AwsSecretManagerConnectorCredentialsManualArgs>> manual() {
        return Optional.ofNullable(this.manual);
    }

    /**
     * Authentication using harness oidc.
     * 
     */
    @Import(name="oidcAuthentication")
    private @Nullable Output<AwsSecretManagerConnectorCredentialsOidcAuthenticationArgs> oidcAuthentication;

    /**
     * @return Authentication using harness oidc.
     * 
     */
    public Optional<Output<AwsSecretManagerConnectorCredentialsOidcAuthenticationArgs>> oidcAuthentication() {
        return Optional.ofNullable(this.oidcAuthentication);
    }

    private AwsSecretManagerConnectorCredentialsArgs() {}

    private AwsSecretManagerConnectorCredentialsArgs(AwsSecretManagerConnectorCredentialsArgs $) {
        this.assumeRole = $.assumeRole;
        this.inheritFromDelegate = $.inheritFromDelegate;
        this.manual = $.manual;
        this.oidcAuthentication = $.oidcAuthentication;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AwsSecretManagerConnectorCredentialsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AwsSecretManagerConnectorCredentialsArgs $;

        public Builder() {
            $ = new AwsSecretManagerConnectorCredentialsArgs();
        }

        public Builder(AwsSecretManagerConnectorCredentialsArgs defaults) {
            $ = new AwsSecretManagerConnectorCredentialsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param assumeRole Connect using STS assume role.
         * 
         * @return builder
         * 
         */
        public Builder assumeRole(@Nullable Output<AwsSecretManagerConnectorCredentialsAssumeRoleArgs> assumeRole) {
            $.assumeRole = assumeRole;
            return this;
        }

        /**
         * @param assumeRole Connect using STS assume role.
         * 
         * @return builder
         * 
         */
        public Builder assumeRole(AwsSecretManagerConnectorCredentialsAssumeRoleArgs assumeRole) {
            return assumeRole(Output.of(assumeRole));
        }

        /**
         * @param inheritFromDelegate Inherit the credentials from from the delegate.
         * 
         * @return builder
         * 
         */
        public Builder inheritFromDelegate(@Nullable Output<Boolean> inheritFromDelegate) {
            $.inheritFromDelegate = inheritFromDelegate;
            return this;
        }

        /**
         * @param inheritFromDelegate Inherit the credentials from from the delegate.
         * 
         * @return builder
         * 
         */
        public Builder inheritFromDelegate(Boolean inheritFromDelegate) {
            return inheritFromDelegate(Output.of(inheritFromDelegate));
        }

        /**
         * @param manual Specify the AWS key and secret used for authenticating.
         * 
         * @return builder
         * 
         */
        public Builder manual(@Nullable Output<AwsSecretManagerConnectorCredentialsManualArgs> manual) {
            $.manual = manual;
            return this;
        }

        /**
         * @param manual Specify the AWS key and secret used for authenticating.
         * 
         * @return builder
         * 
         */
        public Builder manual(AwsSecretManagerConnectorCredentialsManualArgs manual) {
            return manual(Output.of(manual));
        }

        /**
         * @param oidcAuthentication Authentication using harness oidc.
         * 
         * @return builder
         * 
         */
        public Builder oidcAuthentication(@Nullable Output<AwsSecretManagerConnectorCredentialsOidcAuthenticationArgs> oidcAuthentication) {
            $.oidcAuthentication = oidcAuthentication;
            return this;
        }

        /**
         * @param oidcAuthentication Authentication using harness oidc.
         * 
         * @return builder
         * 
         */
        public Builder oidcAuthentication(AwsSecretManagerConnectorCredentialsOidcAuthenticationArgs oidcAuthentication) {
            return oidcAuthentication(Output.of(oidcAuthentication));
        }

        public AwsSecretManagerConnectorCredentialsArgs build() {
            return $;
        }
    }

}
