// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.harness.platform.outputs.GetRoleAssignmentsPrincipal;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetRoleAssignmentsResult {
    /**
     * @return The `disabled` attribute in the role assignment resource controls the status of the role assignment. Setting `disabled` to `false` activates the role and its permissions, enabling the assigned entity to perform allowed actions. Conversely, setting `disabled` to `true` deactivates the role, revoking the entity&#39;s permissions and action capabilities. Default value should be `false`.
     * 
     */
    private Boolean disabled;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return Identifier for role assignment.
     * 
     */
    private String identifier;
    /**
     * @return Specifies whether the role assignment is managed by Harness. Setting managed to `true` means that Harness will manage the lifecycle of the role assignment, including its creation, updates, and deletion. Conversely, setting it to `false` indicates that the role assignment is not managed by Harness, and thus Harness will not perform actions on it. Default value should be `false`.
     * 
     */
    private Boolean managed;
    /**
     * @return Org identifier.
     * 
     */
    private @Nullable String orgId;
    /**
     * @return Principal.
     * 
     */
    private List<GetRoleAssignmentsPrincipal> principals;
    /**
     * @return Project Identifier
     * 
     */
    private @Nullable String projectId;
    /**
     * @return Resource group identifier.
     * 
     */
    private String resourceGroupIdentifier;
    /**
     * @return Role identifier.
     * 
     */
    private String roleIdentifier;

    private GetRoleAssignmentsResult() {}
    /**
     * @return The `disabled` attribute in the role assignment resource controls the status of the role assignment. Setting `disabled` to `false` activates the role and its permissions, enabling the assigned entity to perform allowed actions. Conversely, setting `disabled` to `true` deactivates the role, revoking the entity&#39;s permissions and action capabilities. Default value should be `false`.
     * 
     */
    public Boolean disabled() {
        return this.disabled;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Identifier for role assignment.
     * 
     */
    public String identifier() {
        return this.identifier;
    }
    /**
     * @return Specifies whether the role assignment is managed by Harness. Setting managed to `true` means that Harness will manage the lifecycle of the role assignment, including its creation, updates, and deletion. Conversely, setting it to `false` indicates that the role assignment is not managed by Harness, and thus Harness will not perform actions on it. Default value should be `false`.
     * 
     */
    public Boolean managed() {
        return this.managed;
    }
    /**
     * @return Org identifier.
     * 
     */
    public Optional<String> orgId() {
        return Optional.ofNullable(this.orgId);
    }
    /**
     * @return Principal.
     * 
     */
    public List<GetRoleAssignmentsPrincipal> principals() {
        return this.principals;
    }
    /**
     * @return Project Identifier
     * 
     */
    public Optional<String> projectId() {
        return Optional.ofNullable(this.projectId);
    }
    /**
     * @return Resource group identifier.
     * 
     */
    public String resourceGroupIdentifier() {
        return this.resourceGroupIdentifier;
    }
    /**
     * @return Role identifier.
     * 
     */
    public String roleIdentifier() {
        return this.roleIdentifier;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRoleAssignmentsResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Boolean disabled;
        private String id;
        private String identifier;
        private Boolean managed;
        private @Nullable String orgId;
        private List<GetRoleAssignmentsPrincipal> principals;
        private @Nullable String projectId;
        private String resourceGroupIdentifier;
        private String roleIdentifier;
        public Builder() {}
        public Builder(GetRoleAssignmentsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.disabled = defaults.disabled;
    	      this.id = defaults.id;
    	      this.identifier = defaults.identifier;
    	      this.managed = defaults.managed;
    	      this.orgId = defaults.orgId;
    	      this.principals = defaults.principals;
    	      this.projectId = defaults.projectId;
    	      this.resourceGroupIdentifier = defaults.resourceGroupIdentifier;
    	      this.roleIdentifier = defaults.roleIdentifier;
        }

        @CustomType.Setter
        public Builder disabled(Boolean disabled) {
            if (disabled == null) {
              throw new MissingRequiredPropertyException("GetRoleAssignmentsResult", "disabled");
            }
            this.disabled = disabled;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetRoleAssignmentsResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder identifier(String identifier) {
            if (identifier == null) {
              throw new MissingRequiredPropertyException("GetRoleAssignmentsResult", "identifier");
            }
            this.identifier = identifier;
            return this;
        }
        @CustomType.Setter
        public Builder managed(Boolean managed) {
            if (managed == null) {
              throw new MissingRequiredPropertyException("GetRoleAssignmentsResult", "managed");
            }
            this.managed = managed;
            return this;
        }
        @CustomType.Setter
        public Builder orgId(@Nullable String orgId) {

            this.orgId = orgId;
            return this;
        }
        @CustomType.Setter
        public Builder principals(List<GetRoleAssignmentsPrincipal> principals) {
            if (principals == null) {
              throw new MissingRequiredPropertyException("GetRoleAssignmentsResult", "principals");
            }
            this.principals = principals;
            return this;
        }
        public Builder principals(GetRoleAssignmentsPrincipal... principals) {
            return principals(List.of(principals));
        }
        @CustomType.Setter
        public Builder projectId(@Nullable String projectId) {

            this.projectId = projectId;
            return this;
        }
        @CustomType.Setter
        public Builder resourceGroupIdentifier(String resourceGroupIdentifier) {
            if (resourceGroupIdentifier == null) {
              throw new MissingRequiredPropertyException("GetRoleAssignmentsResult", "resourceGroupIdentifier");
            }
            this.resourceGroupIdentifier = resourceGroupIdentifier;
            return this;
        }
        @CustomType.Setter
        public Builder roleIdentifier(String roleIdentifier) {
            if (roleIdentifier == null) {
              throw new MissingRequiredPropertyException("GetRoleAssignmentsResult", "roleIdentifier");
            }
            this.roleIdentifier = roleIdentifier;
            return this;
        }
        public GetRoleAssignmentsResult build() {
            final var _resultValue = new GetRoleAssignmentsResult();
            _resultValue.disabled = disabled;
            _resultValue.id = id;
            _resultValue.identifier = identifier;
            _resultValue.managed = managed;
            _resultValue.orgId = orgId;
            _resultValue.principals = principals;
            _resultValue.projectId = projectId;
            _resultValue.resourceGroupIdentifier = resourceGroupIdentifier;
            _resultValue.roleIdentifier = roleIdentifier;
            return _resultValue;
        }
    }
}