// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GitlabConnectorApiAuthenticationArgs extends com.pulumi.resources.ResourceArgs {

    public static final GitlabConnectorApiAuthenticationArgs Empty = new GitlabConnectorApiAuthenticationArgs();

    /**
     * Personal access token for interacting with the gitlab api. To reference a secret at the organization scope, prefix &#39;org&#39; to the expression: org.{identifier}. To reference a secret at the account scope, prefix &#39;account` to the expression: account.{identifier}.
     * 
     */
    @Import(name="tokenRef", required=true)
    private Output<String> tokenRef;

    /**
     * @return Personal access token for interacting with the gitlab api. To reference a secret at the organization scope, prefix &#39;org&#39; to the expression: org.{identifier}. To reference a secret at the account scope, prefix &#39;account` to the expression: account.{identifier}.
     * 
     */
    public Output<String> tokenRef() {
        return this.tokenRef;
    }

    private GitlabConnectorApiAuthenticationArgs() {}

    private GitlabConnectorApiAuthenticationArgs(GitlabConnectorApiAuthenticationArgs $) {
        this.tokenRef = $.tokenRef;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GitlabConnectorApiAuthenticationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GitlabConnectorApiAuthenticationArgs $;

        public Builder() {
            $ = new GitlabConnectorApiAuthenticationArgs();
        }

        public Builder(GitlabConnectorApiAuthenticationArgs defaults) {
            $ = new GitlabConnectorApiAuthenticationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param tokenRef Personal access token for interacting with the gitlab api. To reference a secret at the organization scope, prefix &#39;org&#39; to the expression: org.{identifier}. To reference a secret at the account scope, prefix &#39;account` to the expression: account.{identifier}.
         * 
         * @return builder
         * 
         */
        public Builder tokenRef(Output<String> tokenRef) {
            $.tokenRef = tokenRef;
            return this;
        }

        /**
         * @param tokenRef Personal access token for interacting with the gitlab api. To reference a secret at the organization scope, prefix &#39;org&#39; to the expression: org.{identifier}. To reference a secret at the account scope, prefix &#39;account` to the expression: account.{identifier}.
         * 
         * @return builder
         * 
         */
        public Builder tokenRef(String tokenRef) {
            return tokenRef(Output.of(tokenRef));
        }

        public GitlabConnectorApiAuthenticationArgs build() {
            if ($.tokenRef == null) {
                throw new MissingRequiredPropertyException("GitlabConnectorApiAuthenticationArgs", "tokenRef");
            }
            return $;
        }
    }

}
