// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ConnectorJdbcCredentialsUsernamePasswordArgs extends com.pulumi.resources.ResourceArgs {

    public static final ConnectorJdbcCredentialsUsernamePasswordArgs Empty = new ConnectorJdbcCredentialsUsernamePasswordArgs();

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
    @Import(name="username")
    private @Nullable Output<String> username;

    /**
     * @return Username to use for authentication.
     * 
     */
    public Optional<Output<String>> username() {
        return Optional.ofNullable(this.username);
    }

    /**
     * Reference to a secret containing the username to use for authentication. To reference a secret at the organization scope, prefix &#39;org&#39; to the expression: org.{identifier}. To reference a secret at the account scope, prefix &#39;account` to the expression: account.{identifier}.
     * 
     */
    @Import(name="usernameRef")
    private @Nullable Output<String> usernameRef;

    /**
     * @return Reference to a secret containing the username to use for authentication. To reference a secret at the organization scope, prefix &#39;org&#39; to the expression: org.{identifier}. To reference a secret at the account scope, prefix &#39;account` to the expression: account.{identifier}.
     * 
     */
    public Optional<Output<String>> usernameRef() {
        return Optional.ofNullable(this.usernameRef);
    }

    private ConnectorJdbcCredentialsUsernamePasswordArgs() {}

    private ConnectorJdbcCredentialsUsernamePasswordArgs(ConnectorJdbcCredentialsUsernamePasswordArgs $) {
        this.passwordRef = $.passwordRef;
        this.username = $.username;
        this.usernameRef = $.usernameRef;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ConnectorJdbcCredentialsUsernamePasswordArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ConnectorJdbcCredentialsUsernamePasswordArgs $;

        public Builder() {
            $ = new ConnectorJdbcCredentialsUsernamePasswordArgs();
        }

        public Builder(ConnectorJdbcCredentialsUsernamePasswordArgs defaults) {
            $ = new ConnectorJdbcCredentialsUsernamePasswordArgs(Objects.requireNonNull(defaults));
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
        public Builder username(@Nullable Output<String> username) {
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

        /**
         * @param usernameRef Reference to a secret containing the username to use for authentication. To reference a secret at the organization scope, prefix &#39;org&#39; to the expression: org.{identifier}. To reference a secret at the account scope, prefix &#39;account` to the expression: account.{identifier}.
         * 
         * @return builder
         * 
         */
        public Builder usernameRef(@Nullable Output<String> usernameRef) {
            $.usernameRef = usernameRef;
            return this;
        }

        /**
         * @param usernameRef Reference to a secret containing the username to use for authentication. To reference a secret at the organization scope, prefix &#39;org&#39; to the expression: org.{identifier}. To reference a secret at the account scope, prefix &#39;account` to the expression: account.{identifier}.
         * 
         * @return builder
         * 
         */
        public Builder usernameRef(String usernameRef) {
            return usernameRef(Output.of(usernameRef));
        }

        public ConnectorJdbcCredentialsUsernamePasswordArgs build() {
            if ($.passwordRef == null) {
                throw new MissingRequiredPropertyException("ConnectorJdbcCredentialsUsernamePasswordArgs", "passwordRef");
            }
            return $;
        }
    }

}
