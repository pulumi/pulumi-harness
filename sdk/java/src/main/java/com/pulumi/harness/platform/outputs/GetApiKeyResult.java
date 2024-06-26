// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetApiKeyResult {
    private String accountId;
    private String apikeyType;
    private @Nullable Integer defaultTimeToExpireToken;
    private @Nullable String description;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private String identifier;
    private String name;
    private @Nullable String orgId;
    private String parentId;
    private @Nullable String projectId;
    private @Nullable Map<String,String> tags;

    private GetApiKeyResult() {}
    public String accountId() {
        return this.accountId;
    }
    public String apikeyType() {
        return this.apikeyType;
    }
    public Optional<Integer> defaultTimeToExpireToken() {
        return Optional.ofNullable(this.defaultTimeToExpireToken);
    }
    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public String identifier() {
        return this.identifier;
    }
    public String name() {
        return this.name;
    }
    public Optional<String> orgId() {
        return Optional.ofNullable(this.orgId);
    }
    public String parentId() {
        return this.parentId;
    }
    public Optional<String> projectId() {
        return Optional.ofNullable(this.projectId);
    }
    public Map<String,String> tags() {
        return this.tags == null ? Map.of() : this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetApiKeyResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String accountId;
        private String apikeyType;
        private @Nullable Integer defaultTimeToExpireToken;
        private @Nullable String description;
        private String id;
        private String identifier;
        private String name;
        private @Nullable String orgId;
        private String parentId;
        private @Nullable String projectId;
        private @Nullable Map<String,String> tags;
        public Builder() {}
        public Builder(GetApiKeyResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountId = defaults.accountId;
    	      this.apikeyType = defaults.apikeyType;
    	      this.defaultTimeToExpireToken = defaults.defaultTimeToExpireToken;
    	      this.description = defaults.description;
    	      this.id = defaults.id;
    	      this.identifier = defaults.identifier;
    	      this.name = defaults.name;
    	      this.orgId = defaults.orgId;
    	      this.parentId = defaults.parentId;
    	      this.projectId = defaults.projectId;
    	      this.tags = defaults.tags;
        }

        @CustomType.Setter
        public Builder accountId(String accountId) {
            if (accountId == null) {
              throw new MissingRequiredPropertyException("GetApiKeyResult", "accountId");
            }
            this.accountId = accountId;
            return this;
        }
        @CustomType.Setter
        public Builder apikeyType(String apikeyType) {
            if (apikeyType == null) {
              throw new MissingRequiredPropertyException("GetApiKeyResult", "apikeyType");
            }
            this.apikeyType = apikeyType;
            return this;
        }
        @CustomType.Setter
        public Builder defaultTimeToExpireToken(@Nullable Integer defaultTimeToExpireToken) {

            this.defaultTimeToExpireToken = defaultTimeToExpireToken;
            return this;
        }
        @CustomType.Setter
        public Builder description(@Nullable String description) {

            this.description = description;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetApiKeyResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder identifier(String identifier) {
            if (identifier == null) {
              throw new MissingRequiredPropertyException("GetApiKeyResult", "identifier");
            }
            this.identifier = identifier;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetApiKeyResult", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder orgId(@Nullable String orgId) {

            this.orgId = orgId;
            return this;
        }
        @CustomType.Setter
        public Builder parentId(String parentId) {
            if (parentId == null) {
              throw new MissingRequiredPropertyException("GetApiKeyResult", "parentId");
            }
            this.parentId = parentId;
            return this;
        }
        @CustomType.Setter
        public Builder projectId(@Nullable String projectId) {

            this.projectId = projectId;
            return this;
        }
        @CustomType.Setter
        public Builder tags(@Nullable Map<String,String> tags) {

            this.tags = tags;
            return this;
        }
        public GetApiKeyResult build() {
            final var _resultValue = new GetApiKeyResult();
            _resultValue.accountId = accountId;
            _resultValue.apikeyType = apikeyType;
            _resultValue.defaultTimeToExpireToken = defaultTimeToExpireToken;
            _resultValue.description = description;
            _resultValue.id = id;
            _resultValue.identifier = identifier;
            _resultValue.name = name;
            _resultValue.orgId = orgId;
            _resultValue.parentId = parentId;
            _resultValue.projectId = projectId;
            _resultValue.tags = tags;
            return _resultValue;
        }
    }
}
