// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class RoleAssignmentsPrincipal {
    /**
     * @return Identifier.
     * 
     */
    private @Nullable String identifier;
    /**
     * @return Scope level.
     * 
     */
    private @Nullable String scopeLevel;
    /**
     * @return Type.
     * 
     */
    private String type;

    private RoleAssignmentsPrincipal() {}
    /**
     * @return Identifier.
     * 
     */
    public Optional<String> identifier() {
        return Optional.ofNullable(this.identifier);
    }
    /**
     * @return Scope level.
     * 
     */
    public Optional<String> scopeLevel() {
        return Optional.ofNullable(this.scopeLevel);
    }
    /**
     * @return Type.
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RoleAssignmentsPrincipal defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String identifier;
        private @Nullable String scopeLevel;
        private String type;
        public Builder() {}
        public Builder(RoleAssignmentsPrincipal defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.identifier = defaults.identifier;
    	      this.scopeLevel = defaults.scopeLevel;
    	      this.type = defaults.type;
        }

        @CustomType.Setter
        public Builder identifier(@Nullable String identifier) {

            this.identifier = identifier;
            return this;
        }
        @CustomType.Setter
        public Builder scopeLevel(@Nullable String scopeLevel) {

            this.scopeLevel = scopeLevel;
            return this;
        }
        @CustomType.Setter
        public Builder type(String type) {
            if (type == null) {
              throw new MissingRequiredPropertyException("RoleAssignmentsPrincipal", "type");
            }
            this.type = type;
            return this;
        }
        public RoleAssignmentsPrincipal build() {
            final var _resultValue = new RoleAssignmentsPrincipal();
            _resultValue.identifier = identifier;
            _resultValue.scopeLevel = scopeLevel;
            _resultValue.type = type;
            return _resultValue;
        }
    }
}
