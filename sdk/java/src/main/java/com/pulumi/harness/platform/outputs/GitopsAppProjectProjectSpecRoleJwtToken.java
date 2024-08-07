// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GitopsAppProjectProjectSpecRoleJwtToken {
    /**
     * @return Expiration time of the JWT token.
     * 
     */
    private @Nullable String exp;
    /**
     * @return Issued At time of the JWT token.
     * 
     */
    private @Nullable String iat;
    /**
     * @return ID of the JWT token.
     * 
     */
    private @Nullable String id;

    private GitopsAppProjectProjectSpecRoleJwtToken() {}
    /**
     * @return Expiration time of the JWT token.
     * 
     */
    public Optional<String> exp() {
        return Optional.ofNullable(this.exp);
    }
    /**
     * @return Issued At time of the JWT token.
     * 
     */
    public Optional<String> iat() {
        return Optional.ofNullable(this.iat);
    }
    /**
     * @return ID of the JWT token.
     * 
     */
    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GitopsAppProjectProjectSpecRoleJwtToken defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String exp;
        private @Nullable String iat;
        private @Nullable String id;
        public Builder() {}
        public Builder(GitopsAppProjectProjectSpecRoleJwtToken defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.exp = defaults.exp;
    	      this.iat = defaults.iat;
    	      this.id = defaults.id;
        }

        @CustomType.Setter
        public Builder exp(@Nullable String exp) {

            this.exp = exp;
            return this;
        }
        @CustomType.Setter
        public Builder iat(@Nullable String iat) {

            this.iat = iat;
            return this;
        }
        @CustomType.Setter
        public Builder id(@Nullable String id) {

            this.id = id;
            return this;
        }
        public GitopsAppProjectProjectSpecRoleJwtToken build() {
            final var _resultValue = new GitopsAppProjectProjectSpecRoleJwtToken();
            _resultValue.exp = exp;
            _resultValue.iat = iat;
            _resultValue.id = id;
            return _resultValue;
        }
    }
}
