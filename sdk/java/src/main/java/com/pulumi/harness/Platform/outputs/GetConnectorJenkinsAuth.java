// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.harness.platform.outputs.GetConnectorJenkinsAuthJenkinsBearerToken;
import com.pulumi.harness.platform.outputs.GetConnectorJenkinsAuthJenkinsUserNamePassword;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetConnectorJenkinsAuth {
    private List<GetConnectorJenkinsAuthJenkinsBearerToken> jenkinsBearerTokens;
    private List<GetConnectorJenkinsAuthJenkinsUserNamePassword> jenkinsUserNamePasswords;
    private String type;

    private GetConnectorJenkinsAuth() {}
    public List<GetConnectorJenkinsAuthJenkinsBearerToken> jenkinsBearerTokens() {
        return this.jenkinsBearerTokens;
    }
    public List<GetConnectorJenkinsAuthJenkinsUserNamePassword> jenkinsUserNamePasswords() {
        return this.jenkinsUserNamePasswords;
    }
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetConnectorJenkinsAuth defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<GetConnectorJenkinsAuthJenkinsBearerToken> jenkinsBearerTokens;
        private List<GetConnectorJenkinsAuthJenkinsUserNamePassword> jenkinsUserNamePasswords;
        private String type;
        public Builder() {}
        public Builder(GetConnectorJenkinsAuth defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.jenkinsBearerTokens = defaults.jenkinsBearerTokens;
    	      this.jenkinsUserNamePasswords = defaults.jenkinsUserNamePasswords;
    	      this.type = defaults.type;
        }

        @CustomType.Setter
        public Builder jenkinsBearerTokens(List<GetConnectorJenkinsAuthJenkinsBearerToken> jenkinsBearerTokens) {
            this.jenkinsBearerTokens = Objects.requireNonNull(jenkinsBearerTokens);
            return this;
        }
        public Builder jenkinsBearerTokens(GetConnectorJenkinsAuthJenkinsBearerToken... jenkinsBearerTokens) {
            return jenkinsBearerTokens(List.of(jenkinsBearerTokens));
        }
        @CustomType.Setter
        public Builder jenkinsUserNamePasswords(List<GetConnectorJenkinsAuthJenkinsUserNamePassword> jenkinsUserNamePasswords) {
            this.jenkinsUserNamePasswords = Objects.requireNonNull(jenkinsUserNamePasswords);
            return this;
        }
        public Builder jenkinsUserNamePasswords(GetConnectorJenkinsAuthJenkinsUserNamePassword... jenkinsUserNamePasswords) {
            return jenkinsUserNamePasswords(List.of(jenkinsUserNamePasswords));
        }
        @CustomType.Setter
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GetConnectorJenkinsAuth build() {
            final var o = new GetConnectorJenkinsAuth();
            o.jenkinsBearerTokens = jenkinsBearerTokens;
            o.jenkinsUserNamePasswords = jenkinsUserNamePasswords;
            o.type = type;
            return o;
        }
    }
}