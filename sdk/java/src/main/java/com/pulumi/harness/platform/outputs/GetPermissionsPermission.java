// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetPermissionsPermission {
    /**
     * @return Action performed by the permission
     * 
     */
    private String action;
    /**
     * @return The scope levels at which this resource group can be used
     * 
     */
    private List<String> allowedScopeLevels;
    /**
     * @return Identifier of the permission
     * 
     */
    private String identifier;
    /**
     * @return Is included in all roles
     * 
     */
    private Boolean includeInAllRoles;
    /**
     * @return Name of the permission
     * 
     */
    private String name;
    /**
     * @return Resource type for the given permission
     * 
     */
    private String resourceType;
    /**
     * @return Status of the permission
     * 
     */
    private String status;

    private GetPermissionsPermission() {}
    /**
     * @return Action performed by the permission
     * 
     */
    public String action() {
        return this.action;
    }
    /**
     * @return The scope levels at which this resource group can be used
     * 
     */
    public List<String> allowedScopeLevels() {
        return this.allowedScopeLevels;
    }
    /**
     * @return Identifier of the permission
     * 
     */
    public String identifier() {
        return this.identifier;
    }
    /**
     * @return Is included in all roles
     * 
     */
    public Boolean includeInAllRoles() {
        return this.includeInAllRoles;
    }
    /**
     * @return Name of the permission
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Resource type for the given permission
     * 
     */
    public String resourceType() {
        return this.resourceType;
    }
    /**
     * @return Status of the permission
     * 
     */
    public String status() {
        return this.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPermissionsPermission defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String action;
        private List<String> allowedScopeLevels;
        private String identifier;
        private Boolean includeInAllRoles;
        private String name;
        private String resourceType;
        private String status;
        public Builder() {}
        public Builder(GetPermissionsPermission defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.action = defaults.action;
    	      this.allowedScopeLevels = defaults.allowedScopeLevels;
    	      this.identifier = defaults.identifier;
    	      this.includeInAllRoles = defaults.includeInAllRoles;
    	      this.name = defaults.name;
    	      this.resourceType = defaults.resourceType;
    	      this.status = defaults.status;
        }

        @CustomType.Setter
        public Builder action(String action) {
            if (action == null) {
              throw new MissingRequiredPropertyException("GetPermissionsPermission", "action");
            }
            this.action = action;
            return this;
        }
        @CustomType.Setter
        public Builder allowedScopeLevels(List<String> allowedScopeLevels) {
            if (allowedScopeLevels == null) {
              throw new MissingRequiredPropertyException("GetPermissionsPermission", "allowedScopeLevels");
            }
            this.allowedScopeLevels = allowedScopeLevels;
            return this;
        }
        public Builder allowedScopeLevels(String... allowedScopeLevels) {
            return allowedScopeLevels(List.of(allowedScopeLevels));
        }
        @CustomType.Setter
        public Builder identifier(String identifier) {
            if (identifier == null) {
              throw new MissingRequiredPropertyException("GetPermissionsPermission", "identifier");
            }
            this.identifier = identifier;
            return this;
        }
        @CustomType.Setter
        public Builder includeInAllRoles(Boolean includeInAllRoles) {
            if (includeInAllRoles == null) {
              throw new MissingRequiredPropertyException("GetPermissionsPermission", "includeInAllRoles");
            }
            this.includeInAllRoles = includeInAllRoles;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetPermissionsPermission", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder resourceType(String resourceType) {
            if (resourceType == null) {
              throw new MissingRequiredPropertyException("GetPermissionsPermission", "resourceType");
            }
            this.resourceType = resourceType;
            return this;
        }
        @CustomType.Setter
        public Builder status(String status) {
            if (status == null) {
              throw new MissingRequiredPropertyException("GetPermissionsPermission", "status");
            }
            this.status = status;
            return this;
        }
        public GetPermissionsPermission build() {
            final var _resultValue = new GetPermissionsPermission();
            _resultValue.action = action;
            _resultValue.allowedScopeLevels = allowedScopeLevels;
            _resultValue.identifier = identifier;
            _resultValue.includeInAllRoles = includeInAllRoles;
            _resultValue.name = name;
            _resultValue.resourceType = resourceType;
            _resultValue.status = status;
            return _resultValue;
        }
    }
}
