// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class UserRoleBinding {
    /**
     * @return Managed Role of the user.
     * 
     */
    private @Nullable Boolean managedRole;
    /**
     * @return Resource Group Identifier of the user.
     * 
     */
    private @Nullable String resourceGroupIdentifier;
    /**
     * @return Resource Group Name of the user.
     * 
     */
    private @Nullable String resourceGroupName;
    /**
     * @return Role Identifier of the user.
     * 
     */
    private @Nullable String roleIdentifier;
    /**
     * @return Role Name Identifier of the user.
     * 
     */
    private @Nullable String roleName;

    private UserRoleBinding() {}
    /**
     * @return Managed Role of the user.
     * 
     */
    public Optional<Boolean> managedRole() {
        return Optional.ofNullable(this.managedRole);
    }
    /**
     * @return Resource Group Identifier of the user.
     * 
     */
    public Optional<String> resourceGroupIdentifier() {
        return Optional.ofNullable(this.resourceGroupIdentifier);
    }
    /**
     * @return Resource Group Name of the user.
     * 
     */
    public Optional<String> resourceGroupName() {
        return Optional.ofNullable(this.resourceGroupName);
    }
    /**
     * @return Role Identifier of the user.
     * 
     */
    public Optional<String> roleIdentifier() {
        return Optional.ofNullable(this.roleIdentifier);
    }
    /**
     * @return Role Name Identifier of the user.
     * 
     */
    public Optional<String> roleName() {
        return Optional.ofNullable(this.roleName);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UserRoleBinding defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean managedRole;
        private @Nullable String resourceGroupIdentifier;
        private @Nullable String resourceGroupName;
        private @Nullable String roleIdentifier;
        private @Nullable String roleName;
        public Builder() {}
        public Builder(UserRoleBinding defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.managedRole = defaults.managedRole;
    	      this.resourceGroupIdentifier = defaults.resourceGroupIdentifier;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.roleIdentifier = defaults.roleIdentifier;
    	      this.roleName = defaults.roleName;
        }

        @CustomType.Setter
        public Builder managedRole(@Nullable Boolean managedRole) {

            this.managedRole = managedRole;
            return this;
        }
        @CustomType.Setter
        public Builder resourceGroupIdentifier(@Nullable String resourceGroupIdentifier) {

            this.resourceGroupIdentifier = resourceGroupIdentifier;
            return this;
        }
        @CustomType.Setter
        public Builder resourceGroupName(@Nullable String resourceGroupName) {

            this.resourceGroupName = resourceGroupName;
            return this;
        }
        @CustomType.Setter
        public Builder roleIdentifier(@Nullable String roleIdentifier) {

            this.roleIdentifier = roleIdentifier;
            return this;
        }
        @CustomType.Setter
        public Builder roleName(@Nullable String roleName) {

            this.roleName = roleName;
            return this;
        }
        public UserRoleBinding build() {
            final var _resultValue = new UserRoleBinding();
            _resultValue.managedRole = managedRole;
            _resultValue.resourceGroupIdentifier = resourceGroupIdentifier;
            _resultValue.resourceGroupName = resourceGroupName;
            _resultValue.roleIdentifier = roleIdentifier;
            _resultValue.roleName = roleName;
            return _resultValue;
        }
    }
}
