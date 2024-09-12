// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.harness.outputs.UserGroupPermissionsAppPermissions;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class UserGroupPermissions {
    /**
     * @return The account permissions of the user group. Valid options are ADMINISTER*OTHER*ACCOUNT*FUNCTIONS, CREATE*AND*DELETE*APPLICATION, CREATE*CUSTOM*DASHBOARDS, MANAGE*ALERT*NOTIFICATION*RULES, MANAGE*API*KEYS, MANAGE*APPLICATION*STACKS, MANAGE*AUTHENTICATION*SETTINGS, MANAGE*CLOUD*PROVIDERS, MANAGE*CONFIG*AS*CODE, MANAGE*CONNECTORS, MANAGE*CUSTOM*DASHBOARDS, MANAGE*DELEGATE*PROFILES, MANAGE*DELEGATES, MANAGE*DEPLOYMENT*FREEZES, MANAGE*IP*WHITELIST, MANAGE*PIPELINE*GOVERNANCE*STANDARDS, MANAGE*RESTRICTED*ACCESS, MANAGE*SECRET*MANAGERS, MANAGE*SECRETS, MANAGE*SSH*AND*WINRM, MANAGE*TAGS, MANAGE*TEMPLATE*LIBRARY, MANAGE*USER*AND*USER*GROUPS*AND*API*KEYS, MANAGE*USERS*AND*GROUPS, READ*USERS*AND*GROUPS, VIEW*AUDITS, VIEW*USER*AND*USER*GROUPS*AND*API_KEYS
     * 
     */
    private @Nullable List<String> accountPermissions;
    /**
     * @return Application specific permissions
     * 
     */
    private @Nullable UserGroupPermissionsAppPermissions appPermissions;

    private UserGroupPermissions() {}
    /**
     * @return The account permissions of the user group. Valid options are ADMINISTER*OTHER*ACCOUNT*FUNCTIONS, CREATE*AND*DELETE*APPLICATION, CREATE*CUSTOM*DASHBOARDS, MANAGE*ALERT*NOTIFICATION*RULES, MANAGE*API*KEYS, MANAGE*APPLICATION*STACKS, MANAGE*AUTHENTICATION*SETTINGS, MANAGE*CLOUD*PROVIDERS, MANAGE*CONFIG*AS*CODE, MANAGE*CONNECTORS, MANAGE*CUSTOM*DASHBOARDS, MANAGE*DELEGATE*PROFILES, MANAGE*DELEGATES, MANAGE*DEPLOYMENT*FREEZES, MANAGE*IP*WHITELIST, MANAGE*PIPELINE*GOVERNANCE*STANDARDS, MANAGE*RESTRICTED*ACCESS, MANAGE*SECRET*MANAGERS, MANAGE*SECRETS, MANAGE*SSH*AND*WINRM, MANAGE*TAGS, MANAGE*TEMPLATE*LIBRARY, MANAGE*USER*AND*USER*GROUPS*AND*API*KEYS, MANAGE*USERS*AND*GROUPS, READ*USERS*AND*GROUPS, VIEW*AUDITS, VIEW*USER*AND*USER*GROUPS*AND*API_KEYS
     * 
     */
    public List<String> accountPermissions() {
        return this.accountPermissions == null ? List.of() : this.accountPermissions;
    }
    /**
     * @return Application specific permissions
     * 
     */
    public Optional<UserGroupPermissionsAppPermissions> appPermissions() {
        return Optional.ofNullable(this.appPermissions);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UserGroupPermissions defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<String> accountPermissions;
        private @Nullable UserGroupPermissionsAppPermissions appPermissions;
        public Builder() {}
        public Builder(UserGroupPermissions defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountPermissions = defaults.accountPermissions;
    	      this.appPermissions = defaults.appPermissions;
        }

        @CustomType.Setter
        public Builder accountPermissions(@Nullable List<String> accountPermissions) {

            this.accountPermissions = accountPermissions;
            return this;
        }
        public Builder accountPermissions(String... accountPermissions) {
            return accountPermissions(List.of(accountPermissions));
        }
        @CustomType.Setter
        public Builder appPermissions(@Nullable UserGroupPermissionsAppPermissions appPermissions) {

            this.appPermissions = appPermissions;
            return this;
        }
        public UserGroupPermissions build() {
            final var _resultValue = new UserGroupPermissions();
            _resultValue.accountPermissions = accountPermissions;
            _resultValue.appPermissions = appPermissions;
            return _resultValue;
        }
    }
}