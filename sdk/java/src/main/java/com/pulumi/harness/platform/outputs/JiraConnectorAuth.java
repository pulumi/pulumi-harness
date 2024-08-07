// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.harness.platform.outputs.JiraConnectorAuthPersonalAccessToken;
import com.pulumi.harness.platform.outputs.JiraConnectorAuthUsernamePassword;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class JiraConnectorAuth {
    /**
     * @return Authentication types for Jira connector
     * 
     */
    private String authType;
    /**
     * @return Authenticate using personal access token.
     * 
     */
    private @Nullable JiraConnectorAuthPersonalAccessToken personalAccessToken;
    /**
     * @return Authenticate using username password.
     * 
     */
    private @Nullable JiraConnectorAuthUsernamePassword usernamePassword;

    private JiraConnectorAuth() {}
    /**
     * @return Authentication types for Jira connector
     * 
     */
    public String authType() {
        return this.authType;
    }
    /**
     * @return Authenticate using personal access token.
     * 
     */
    public Optional<JiraConnectorAuthPersonalAccessToken> personalAccessToken() {
        return Optional.ofNullable(this.personalAccessToken);
    }
    /**
     * @return Authenticate using username password.
     * 
     */
    public Optional<JiraConnectorAuthUsernamePassword> usernamePassword() {
        return Optional.ofNullable(this.usernamePassword);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JiraConnectorAuth defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String authType;
        private @Nullable JiraConnectorAuthPersonalAccessToken personalAccessToken;
        private @Nullable JiraConnectorAuthUsernamePassword usernamePassword;
        public Builder() {}
        public Builder(JiraConnectorAuth defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authType = defaults.authType;
    	      this.personalAccessToken = defaults.personalAccessToken;
    	      this.usernamePassword = defaults.usernamePassword;
        }

        @CustomType.Setter
        public Builder authType(String authType) {
            if (authType == null) {
              throw new MissingRequiredPropertyException("JiraConnectorAuth", "authType");
            }
            this.authType = authType;
            return this;
        }
        @CustomType.Setter
        public Builder personalAccessToken(@Nullable JiraConnectorAuthPersonalAccessToken personalAccessToken) {

            this.personalAccessToken = personalAccessToken;
            return this;
        }
        @CustomType.Setter
        public Builder usernamePassword(@Nullable JiraConnectorAuthUsernamePassword usernamePassword) {

            this.usernamePassword = usernamePassword;
            return this;
        }
        public JiraConnectorAuth build() {
            final var _resultValue = new JiraConnectorAuth();
            _resultValue.authType = authType;
            _resultValue.personalAccessToken = personalAccessToken;
            _resultValue.usernamePassword = usernamePassword;
            return _resultValue;
        }
    }
}
