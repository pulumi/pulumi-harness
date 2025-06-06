// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetGitopsAgentOperatorYamlProxyArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetGitopsAgentOperatorYamlProxyArgs Empty = new GetGitopsAgentOperatorYamlProxyArgs();

    /**
     * HTTP proxy settings for the GitOps agent.
     * 
     */
    @Import(name="http")
    private @Nullable Output<String> http;

    /**
     * @return HTTP proxy settings for the GitOps agent.
     * 
     */
    public Optional<Output<String>> http() {
        return Optional.ofNullable(this.http);
    }

    /**
     * HTTPS proxy settings for the GitOps agent.
     * 
     */
    @Import(name="https")
    private @Nullable Output<String> https;

    /**
     * @return HTTPS proxy settings for the GitOps agent.
     * 
     */
    public Optional<Output<String>> https() {
        return Optional.ofNullable(this.https);
    }

    /**
     * Password for the proxy.
     * 
     */
    @Import(name="password")
    private @Nullable Output<String> password;

    /**
     * @return Password for the proxy.
     * 
     */
    public Optional<Output<String>> password() {
        return Optional.ofNullable(this.password);
    }

    /**
     * Username for the proxy.
     * 
     */
    @Import(name="username")
    private @Nullable Output<String> username;

    /**
     * @return Username for the proxy.
     * 
     */
    public Optional<Output<String>> username() {
        return Optional.ofNullable(this.username);
    }

    private GetGitopsAgentOperatorYamlProxyArgs() {}

    private GetGitopsAgentOperatorYamlProxyArgs(GetGitopsAgentOperatorYamlProxyArgs $) {
        this.http = $.http;
        this.https = $.https;
        this.password = $.password;
        this.username = $.username;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetGitopsAgentOperatorYamlProxyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetGitopsAgentOperatorYamlProxyArgs $;

        public Builder() {
            $ = new GetGitopsAgentOperatorYamlProxyArgs();
        }

        public Builder(GetGitopsAgentOperatorYamlProxyArgs defaults) {
            $ = new GetGitopsAgentOperatorYamlProxyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param http HTTP proxy settings for the GitOps agent.
         * 
         * @return builder
         * 
         */
        public Builder http(@Nullable Output<String> http) {
            $.http = http;
            return this;
        }

        /**
         * @param http HTTP proxy settings for the GitOps agent.
         * 
         * @return builder
         * 
         */
        public Builder http(String http) {
            return http(Output.of(http));
        }

        /**
         * @param https HTTPS proxy settings for the GitOps agent.
         * 
         * @return builder
         * 
         */
        public Builder https(@Nullable Output<String> https) {
            $.https = https;
            return this;
        }

        /**
         * @param https HTTPS proxy settings for the GitOps agent.
         * 
         * @return builder
         * 
         */
        public Builder https(String https) {
            return https(Output.of(https));
        }

        /**
         * @param password Password for the proxy.
         * 
         * @return builder
         * 
         */
        public Builder password(@Nullable Output<String> password) {
            $.password = password;
            return this;
        }

        /**
         * @param password Password for the proxy.
         * 
         * @return builder
         * 
         */
        public Builder password(String password) {
            return password(Output.of(password));
        }

        /**
         * @param username Username for the proxy.
         * 
         * @return builder
         * 
         */
        public Builder username(@Nullable Output<String> username) {
            $.username = username;
            return this;
        }

        /**
         * @param username Username for the proxy.
         * 
         * @return builder
         * 
         */
        public Builder username(String username) {
            return username(Output.of(username));
        }

        public GetGitopsAgentOperatorYamlProxyArgs build() {
            return $;
        }
    }

}
