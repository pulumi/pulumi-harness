// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class JiraConnectorAuthPersonalAccessToken {
    /**
     * @return Reference to a secret containing the personal access token to use for authentication. To reference a secret at the organization scope, prefix &#39;org&#39; to the expression: org.{identifier}. To reference a secret at the account scope, prefix &#39;account` to the expression: account.{identifier}.
     * 
     */
    private String patRef;

    private JiraConnectorAuthPersonalAccessToken() {}
    /**
     * @return Reference to a secret containing the personal access token to use for authentication. To reference a secret at the organization scope, prefix &#39;org&#39; to the expression: org.{identifier}. To reference a secret at the account scope, prefix &#39;account` to the expression: account.{identifier}.
     * 
     */
    public String patRef() {
        return this.patRef;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JiraConnectorAuthPersonalAccessToken defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String patRef;
        public Builder() {}
        public Builder(JiraConnectorAuthPersonalAccessToken defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.patRef = defaults.patRef;
        }

        @CustomType.Setter
        public Builder patRef(String patRef) {
            if (patRef == null) {
              throw new MissingRequiredPropertyException("JiraConnectorAuthPersonalAccessToken", "patRef");
            }
            this.patRef = patRef;
            return this;
        }
        public JiraConnectorAuthPersonalAccessToken build() {
            final var _resultValue = new JiraConnectorAuthPersonalAccessToken();
            _resultValue.patRef = patRef;
            return _resultValue;
        }
    }
}
