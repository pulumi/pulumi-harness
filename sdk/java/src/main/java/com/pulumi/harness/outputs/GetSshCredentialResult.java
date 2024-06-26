// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.harness.outputs.GetSshCredentialUsageScope;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetSshCredentialResult {
    /**
     * @return Unique identifier of the secret manager
     * 
     */
    private @Nullable String id;
    /**
     * @return The name of the secret manager
     * 
     */
    private @Nullable String name;
    /**
     * @return This block is used for scoping the resource to a specific set of applications or environments.
     * 
     */
    private @Nullable List<GetSshCredentialUsageScope> usageScopes;

    private GetSshCredentialResult() {}
    /**
     * @return Unique identifier of the secret manager
     * 
     */
    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }
    /**
     * @return The name of the secret manager
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    /**
     * @return This block is used for scoping the resource to a specific set of applications or environments.
     * 
     */
    public List<GetSshCredentialUsageScope> usageScopes() {
        return this.usageScopes == null ? List.of() : this.usageScopes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSshCredentialResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String id;
        private @Nullable String name;
        private @Nullable List<GetSshCredentialUsageScope> usageScopes;
        public Builder() {}
        public Builder(GetSshCredentialResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.usageScopes = defaults.usageScopes;
        }

        @CustomType.Setter
        public Builder id(@Nullable String id) {

            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder name(@Nullable String name) {

            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder usageScopes(@Nullable List<GetSshCredentialUsageScope> usageScopes) {

            this.usageScopes = usageScopes;
            return this;
        }
        public Builder usageScopes(GetSshCredentialUsageScope... usageScopes) {
            return usageScopes(List.of(usageScopes));
        }
        public GetSshCredentialResult build() {
            final var _resultValue = new GetSshCredentialResult();
            _resultValue.id = id;
            _resultValue.name = name;
            _resultValue.usageScopes = usageScopes;
            return _resultValue;
        }
    }
}
