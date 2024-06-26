// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.harness.platform.inputs.SecretSshkeyKerberosTgtKeyTabFilePathSpecArgs;
import com.pulumi.harness.platform.inputs.SecretSshkeyKerberosTgtPasswordSpecArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SecretSshkeyKerberosArgs extends com.pulumi.resources.ResourceArgs {

    public static final SecretSshkeyKerberosArgs Empty = new SecretSshkeyKerberosArgs();

    /**
     * Username to use for authentication.
     * 
     */
    @Import(name="principal", required=true)
    private Output<String> principal;

    /**
     * @return Username to use for authentication.
     * 
     */
    public Output<String> principal() {
        return this.principal;
    }

    /**
     * Reference to a secret containing the password to use for authentication.
     * 
     */
    @Import(name="realm", required=true)
    private Output<String> realm;

    /**
     * @return Reference to a secret containing the password to use for authentication.
     * 
     */
    public Output<String> realm() {
        return this.realm;
    }

    /**
     * Method to generate tgt
     * 
     */
    @Import(name="tgtGenerationMethod")
    private @Nullable Output<String> tgtGenerationMethod;

    /**
     * @return Method to generate tgt
     * 
     */
    public Optional<Output<String>> tgtGenerationMethod() {
        return Optional.ofNullable(this.tgtGenerationMethod);
    }

    /**
     * Authenticate to App Dynamics using username and password.
     * 
     */
    @Import(name="tgtKeyTabFilePathSpec")
    private @Nullable Output<SecretSshkeyKerberosTgtKeyTabFilePathSpecArgs> tgtKeyTabFilePathSpec;

    /**
     * @return Authenticate to App Dynamics using username and password.
     * 
     */
    public Optional<Output<SecretSshkeyKerberosTgtKeyTabFilePathSpecArgs>> tgtKeyTabFilePathSpec() {
        return Optional.ofNullable(this.tgtKeyTabFilePathSpec);
    }

    /**
     * Authenticate to App Dynamics using username and password.
     * 
     */
    @Import(name="tgtPasswordSpec")
    private @Nullable Output<SecretSshkeyKerberosTgtPasswordSpecArgs> tgtPasswordSpec;

    /**
     * @return Authenticate to App Dynamics using username and password.
     * 
     */
    public Optional<Output<SecretSshkeyKerberosTgtPasswordSpecArgs>> tgtPasswordSpec() {
        return Optional.ofNullable(this.tgtPasswordSpec);
    }

    private SecretSshkeyKerberosArgs() {}

    private SecretSshkeyKerberosArgs(SecretSshkeyKerberosArgs $) {
        this.principal = $.principal;
        this.realm = $.realm;
        this.tgtGenerationMethod = $.tgtGenerationMethod;
        this.tgtKeyTabFilePathSpec = $.tgtKeyTabFilePathSpec;
        this.tgtPasswordSpec = $.tgtPasswordSpec;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SecretSshkeyKerberosArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SecretSshkeyKerberosArgs $;

        public Builder() {
            $ = new SecretSshkeyKerberosArgs();
        }

        public Builder(SecretSshkeyKerberosArgs defaults) {
            $ = new SecretSshkeyKerberosArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param principal Username to use for authentication.
         * 
         * @return builder
         * 
         */
        public Builder principal(Output<String> principal) {
            $.principal = principal;
            return this;
        }

        /**
         * @param principal Username to use for authentication.
         * 
         * @return builder
         * 
         */
        public Builder principal(String principal) {
            return principal(Output.of(principal));
        }

        /**
         * @param realm Reference to a secret containing the password to use for authentication.
         * 
         * @return builder
         * 
         */
        public Builder realm(Output<String> realm) {
            $.realm = realm;
            return this;
        }

        /**
         * @param realm Reference to a secret containing the password to use for authentication.
         * 
         * @return builder
         * 
         */
        public Builder realm(String realm) {
            return realm(Output.of(realm));
        }

        /**
         * @param tgtGenerationMethod Method to generate tgt
         * 
         * @return builder
         * 
         */
        public Builder tgtGenerationMethod(@Nullable Output<String> tgtGenerationMethod) {
            $.tgtGenerationMethod = tgtGenerationMethod;
            return this;
        }

        /**
         * @param tgtGenerationMethod Method to generate tgt
         * 
         * @return builder
         * 
         */
        public Builder tgtGenerationMethod(String tgtGenerationMethod) {
            return tgtGenerationMethod(Output.of(tgtGenerationMethod));
        }

        /**
         * @param tgtKeyTabFilePathSpec Authenticate to App Dynamics using username and password.
         * 
         * @return builder
         * 
         */
        public Builder tgtKeyTabFilePathSpec(@Nullable Output<SecretSshkeyKerberosTgtKeyTabFilePathSpecArgs> tgtKeyTabFilePathSpec) {
            $.tgtKeyTabFilePathSpec = tgtKeyTabFilePathSpec;
            return this;
        }

        /**
         * @param tgtKeyTabFilePathSpec Authenticate to App Dynamics using username and password.
         * 
         * @return builder
         * 
         */
        public Builder tgtKeyTabFilePathSpec(SecretSshkeyKerberosTgtKeyTabFilePathSpecArgs tgtKeyTabFilePathSpec) {
            return tgtKeyTabFilePathSpec(Output.of(tgtKeyTabFilePathSpec));
        }

        /**
         * @param tgtPasswordSpec Authenticate to App Dynamics using username and password.
         * 
         * @return builder
         * 
         */
        public Builder tgtPasswordSpec(@Nullable Output<SecretSshkeyKerberosTgtPasswordSpecArgs> tgtPasswordSpec) {
            $.tgtPasswordSpec = tgtPasswordSpec;
            return this;
        }

        /**
         * @param tgtPasswordSpec Authenticate to App Dynamics using username and password.
         * 
         * @return builder
         * 
         */
        public Builder tgtPasswordSpec(SecretSshkeyKerberosTgtPasswordSpecArgs tgtPasswordSpec) {
            return tgtPasswordSpec(Output.of(tgtPasswordSpec));
        }

        public SecretSshkeyKerberosArgs build() {
            if ($.principal == null) {
                throw new MissingRequiredPropertyException("SecretSshkeyKerberosArgs", "principal");
            }
            if ($.realm == null) {
                throw new MissingRequiredPropertyException("SecretSshkeyKerberosArgs", "realm");
            }
            return $;
        }
    }

}
