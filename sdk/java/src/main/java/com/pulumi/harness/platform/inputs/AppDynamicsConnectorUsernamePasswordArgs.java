// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class AppDynamicsConnectorUsernamePasswordArgs extends com.pulumi.resources.ResourceArgs {

    public static final AppDynamicsConnectorUsernamePasswordArgs Empty = new AppDynamicsConnectorUsernamePasswordArgs();

    /**
     * Reference to a secret containing the password to use for authentication. To reference a secret at the organization scope, prefix &#39;org&#39; to the expression: org.{identifier}. To reference a secret at the account scope, prefix &#39;account` to the expression: account.{identifier}.
     * 
     */
    @Import(name="passwordRef", required=true)
    private Output<String> passwordRef;

    /**
     * @return Reference to a secret containing the password to use for authentication. To reference a secret at the organization scope, prefix &#39;org&#39; to the expression: org.{identifier}. To reference a secret at the account scope, prefix &#39;account` to the expression: account.{identifier}.
     * 
     */
    public Output<String> passwordRef() {
        return this.passwordRef;
    }

    /**
     * Username to use for authentication.
     * 
     */
    @Import(name="username", required=true)
    private Output<String> username;

    /**
     * @return Username to use for authentication.
     * 
     */
    public Output<String> username() {
        return this.username;
    }

    private AppDynamicsConnectorUsernamePasswordArgs() {}

    private AppDynamicsConnectorUsernamePasswordArgs(AppDynamicsConnectorUsernamePasswordArgs $) {
        this.passwordRef = $.passwordRef;
        this.username = $.username;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AppDynamicsConnectorUsernamePasswordArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AppDynamicsConnectorUsernamePasswordArgs $;

        public Builder() {
            $ = new AppDynamicsConnectorUsernamePasswordArgs();
        }

        public Builder(AppDynamicsConnectorUsernamePasswordArgs defaults) {
            $ = new AppDynamicsConnectorUsernamePasswordArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param passwordRef Reference to a secret containing the password to use for authentication. To reference a secret at the organization scope, prefix &#39;org&#39; to the expression: org.{identifier}. To reference a secret at the account scope, prefix &#39;account` to the expression: account.{identifier}.
         * 
         * @return builder
         * 
         */
        public Builder passwordRef(Output<String> passwordRef) {
            $.passwordRef = passwordRef;
            return this;
        }

        /**
         * @param passwordRef Reference to a secret containing the password to use for authentication. To reference a secret at the organization scope, prefix &#39;org&#39; to the expression: org.{identifier}. To reference a secret at the account scope, prefix &#39;account` to the expression: account.{identifier}.
         * 
         * @return builder
         * 
         */
        public Builder passwordRef(String passwordRef) {
            return passwordRef(Output.of(passwordRef));
        }

        /**
         * @param username Username to use for authentication.
         * 
         * @return builder
         * 
         */
        public Builder username(Output<String> username) {
            $.username = username;
            return this;
        }

        /**
         * @param username Username to use for authentication.
         * 
         * @return builder
         * 
         */
        public Builder username(String username) {
            return username(Output.of(username));
        }

        public AppDynamicsConnectorUsernamePasswordArgs build() {
            if ($.passwordRef == null) {
                throw new MissingRequiredPropertyException("AppDynamicsConnectorUsernamePasswordArgs", "passwordRef");
            }
            if ($.username == null) {
                throw new MissingRequiredPropertyException("AppDynamicsConnectorUsernamePasswordArgs", "username");
            }
            return $;
        }
    }

}