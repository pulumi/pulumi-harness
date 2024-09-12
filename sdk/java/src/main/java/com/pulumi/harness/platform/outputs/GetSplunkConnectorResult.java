// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetSplunkConnectorResult {
    /**
     * @return Splunk account id.
     * 
     */
    private String accountId;
    /**
     * @return Tags to filter delegates for connection.
     * 
     */
    private List<String> delegateSelectors;
    /**
     * @return Description of the resource.
     * 
     */
    private String description;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return Unique identifier of the resource.
     * 
     */
    private String identifier;
    /**
     * @return Name of the resource.
     * 
     */
    private @Nullable String name;
    /**
     * @return Unique identifier of the organization.
     * 
     */
    private @Nullable String orgId;
    /**
     * @return The reference to the Harness secret containing the Splunk password. To reference a secret at the organization scope, prefix &#39;org&#39; to the expression: org.{identifier}. To reference a secret at the account scope, prefix &#39;account` to the expression: account.{identifier}.
     * 
     */
    private String passwordRef;
    /**
     * @return Unique identifier of the project.
     * 
     */
    private @Nullable String projectId;
    /**
     * @return Tags to associate with the resource.
     * 
     */
    private List<String> tags;
    /**
     * @return URL of the Splunk server.
     * 
     */
    private String url;
    /**
     * @return The username used for connecting to Splunk.
     * 
     */
    private String username;

    private GetSplunkConnectorResult() {}
    /**
     * @return Splunk account id.
     * 
     */
    public String accountId() {
        return this.accountId;
    }
    /**
     * @return Tags to filter delegates for connection.
     * 
     */
    public List<String> delegateSelectors() {
        return this.delegateSelectors;
    }
    /**
     * @return Description of the resource.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Unique identifier of the resource.
     * 
     */
    public String identifier() {
        return this.identifier;
    }
    /**
     * @return Name of the resource.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    /**
     * @return Unique identifier of the organization.
     * 
     */
    public Optional<String> orgId() {
        return Optional.ofNullable(this.orgId);
    }
    /**
     * @return The reference to the Harness secret containing the Splunk password. To reference a secret at the organization scope, prefix &#39;org&#39; to the expression: org.{identifier}. To reference a secret at the account scope, prefix &#39;account` to the expression: account.{identifier}.
     * 
     */
    public String passwordRef() {
        return this.passwordRef;
    }
    /**
     * @return Unique identifier of the project.
     * 
     */
    public Optional<String> projectId() {
        return Optional.ofNullable(this.projectId);
    }
    /**
     * @return Tags to associate with the resource.
     * 
     */
    public List<String> tags() {
        return this.tags;
    }
    /**
     * @return URL of the Splunk server.
     * 
     */
    public String url() {
        return this.url;
    }
    /**
     * @return The username used for connecting to Splunk.
     * 
     */
    public String username() {
        return this.username;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSplunkConnectorResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String accountId;
        private List<String> delegateSelectors;
        private String description;
        private String id;
        private String identifier;
        private @Nullable String name;
        private @Nullable String orgId;
        private String passwordRef;
        private @Nullable String projectId;
        private List<String> tags;
        private String url;
        private String username;
        public Builder() {}
        public Builder(GetSplunkConnectorResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountId = defaults.accountId;
    	      this.delegateSelectors = defaults.delegateSelectors;
    	      this.description = defaults.description;
    	      this.id = defaults.id;
    	      this.identifier = defaults.identifier;
    	      this.name = defaults.name;
    	      this.orgId = defaults.orgId;
    	      this.passwordRef = defaults.passwordRef;
    	      this.projectId = defaults.projectId;
    	      this.tags = defaults.tags;
    	      this.url = defaults.url;
    	      this.username = defaults.username;
        }

        @CustomType.Setter
        public Builder accountId(String accountId) {
            if (accountId == null) {
              throw new MissingRequiredPropertyException("GetSplunkConnectorResult", "accountId");
            }
            this.accountId = accountId;
            return this;
        }
        @CustomType.Setter
        public Builder delegateSelectors(List<String> delegateSelectors) {
            if (delegateSelectors == null) {
              throw new MissingRequiredPropertyException("GetSplunkConnectorResult", "delegateSelectors");
            }
            this.delegateSelectors = delegateSelectors;
            return this;
        }
        public Builder delegateSelectors(String... delegateSelectors) {
            return delegateSelectors(List.of(delegateSelectors));
        }
        @CustomType.Setter
        public Builder description(String description) {
            if (description == null) {
              throw new MissingRequiredPropertyException("GetSplunkConnectorResult", "description");
            }
            this.description = description;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetSplunkConnectorResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder identifier(String identifier) {
            if (identifier == null) {
              throw new MissingRequiredPropertyException("GetSplunkConnectorResult", "identifier");
            }
            this.identifier = identifier;
            return this;
        }
        @CustomType.Setter
        public Builder name(@Nullable String name) {

            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder orgId(@Nullable String orgId) {

            this.orgId = orgId;
            return this;
        }
        @CustomType.Setter
        public Builder passwordRef(String passwordRef) {
            if (passwordRef == null) {
              throw new MissingRequiredPropertyException("GetSplunkConnectorResult", "passwordRef");
            }
            this.passwordRef = passwordRef;
            return this;
        }
        @CustomType.Setter
        public Builder projectId(@Nullable String projectId) {

            this.projectId = projectId;
            return this;
        }
        @CustomType.Setter
        public Builder tags(List<String> tags) {
            if (tags == null) {
              throw new MissingRequiredPropertyException("GetSplunkConnectorResult", "tags");
            }
            this.tags = tags;
            return this;
        }
        public Builder tags(String... tags) {
            return tags(List.of(tags));
        }
        @CustomType.Setter
        public Builder url(String url) {
            if (url == null) {
              throw new MissingRequiredPropertyException("GetSplunkConnectorResult", "url");
            }
            this.url = url;
            return this;
        }
        @CustomType.Setter
        public Builder username(String username) {
            if (username == null) {
              throw new MissingRequiredPropertyException("GetSplunkConnectorResult", "username");
            }
            this.username = username;
            return this;
        }
        public GetSplunkConnectorResult build() {
            final var _resultValue = new GetSplunkConnectorResult();
            _resultValue.accountId = accountId;
            _resultValue.delegateSelectors = delegateSelectors;
            _resultValue.description = description;
            _resultValue.id = id;
            _resultValue.identifier = identifier;
            _resultValue.name = name;
            _resultValue.orgId = orgId;
            _resultValue.passwordRef = passwordRef;
            _resultValue.projectId = projectId;
            _resultValue.tags = tags;
            _resultValue.url = url;
            _resultValue.username = username;
            return _resultValue;
        }
    }
}