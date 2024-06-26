// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class UserGroupPermissionsAppPermissionsDeploymentArgs extends com.pulumi.resources.ResourceArgs {

    public static final UserGroupPermissionsAppPermissionsDeploymentArgs Empty = new UserGroupPermissionsAppPermissionsDeploymentArgs();

    /**
     * The actions allowed to be performed. Valid options are READ, EXECUTE*WORKFLOW, EXECUTE*PIPELINE, ROLLBACK*WORKFLOW, ABORT*WORKFLOW
     * 
     */
    @Import(name="actions", required=true)
    private Output<List<String>> actions;

    /**
     * @return The actions allowed to be performed. Valid options are READ, EXECUTE*WORKFLOW, EXECUTE*PIPELINE, ROLLBACK*WORKFLOW, ABORT*WORKFLOW
     * 
     */
    public Output<List<String>> actions() {
        return this.actions;
    }

    /**
     * The application IDs to which the permission applies. Leave empty to apply to all applications.
     * 
     */
    @Import(name="appIds")
    private @Nullable Output<List<String>> appIds;

    /**
     * @return The application IDs to which the permission applies. Leave empty to apply to all applications.
     * 
     */
    public Optional<Output<List<String>>> appIds() {
        return Optional.ofNullable(this.appIds);
    }

    /**
     * The environment IDs to which the permission applies. Leave empty to apply to all environments.
     * 
     */
    @Import(name="envIds")
    private @Nullable Output<List<String>> envIds;

    /**
     * @return The environment IDs to which the permission applies. Leave empty to apply to all environments.
     * 
     */
    public Optional<Output<List<String>>> envIds() {
        return Optional.ofNullable(this.envIds);
    }

    /**
     * The filters to apply to the action. Valid options are: NON*PRODUCTION*ENVIRONMENTS, PRODUCTION_ENVIRONMENTS.
     * 
     */
    @Import(name="filters")
    private @Nullable Output<List<String>> filters;

    /**
     * @return The filters to apply to the action. Valid options are: NON*PRODUCTION*ENVIRONMENTS, PRODUCTION_ENVIRONMENTS.
     * 
     */
    public Optional<Output<List<String>>> filters() {
        return Optional.ofNullable(this.filters);
    }

    private UserGroupPermissionsAppPermissionsDeploymentArgs() {}

    private UserGroupPermissionsAppPermissionsDeploymentArgs(UserGroupPermissionsAppPermissionsDeploymentArgs $) {
        this.actions = $.actions;
        this.appIds = $.appIds;
        this.envIds = $.envIds;
        this.filters = $.filters;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(UserGroupPermissionsAppPermissionsDeploymentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private UserGroupPermissionsAppPermissionsDeploymentArgs $;

        public Builder() {
            $ = new UserGroupPermissionsAppPermissionsDeploymentArgs();
        }

        public Builder(UserGroupPermissionsAppPermissionsDeploymentArgs defaults) {
            $ = new UserGroupPermissionsAppPermissionsDeploymentArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param actions The actions allowed to be performed. Valid options are READ, EXECUTE*WORKFLOW, EXECUTE*PIPELINE, ROLLBACK*WORKFLOW, ABORT*WORKFLOW
         * 
         * @return builder
         * 
         */
        public Builder actions(Output<List<String>> actions) {
            $.actions = actions;
            return this;
        }

        /**
         * @param actions The actions allowed to be performed. Valid options are READ, EXECUTE*WORKFLOW, EXECUTE*PIPELINE, ROLLBACK*WORKFLOW, ABORT*WORKFLOW
         * 
         * @return builder
         * 
         */
        public Builder actions(List<String> actions) {
            return actions(Output.of(actions));
        }

        /**
         * @param actions The actions allowed to be performed. Valid options are READ, EXECUTE*WORKFLOW, EXECUTE*PIPELINE, ROLLBACK*WORKFLOW, ABORT*WORKFLOW
         * 
         * @return builder
         * 
         */
        public Builder actions(String... actions) {
            return actions(List.of(actions));
        }

        /**
         * @param appIds The application IDs to which the permission applies. Leave empty to apply to all applications.
         * 
         * @return builder
         * 
         */
        public Builder appIds(@Nullable Output<List<String>> appIds) {
            $.appIds = appIds;
            return this;
        }

        /**
         * @param appIds The application IDs to which the permission applies. Leave empty to apply to all applications.
         * 
         * @return builder
         * 
         */
        public Builder appIds(List<String> appIds) {
            return appIds(Output.of(appIds));
        }

        /**
         * @param appIds The application IDs to which the permission applies. Leave empty to apply to all applications.
         * 
         * @return builder
         * 
         */
        public Builder appIds(String... appIds) {
            return appIds(List.of(appIds));
        }

        /**
         * @param envIds The environment IDs to which the permission applies. Leave empty to apply to all environments.
         * 
         * @return builder
         * 
         */
        public Builder envIds(@Nullable Output<List<String>> envIds) {
            $.envIds = envIds;
            return this;
        }

        /**
         * @param envIds The environment IDs to which the permission applies. Leave empty to apply to all environments.
         * 
         * @return builder
         * 
         */
        public Builder envIds(List<String> envIds) {
            return envIds(Output.of(envIds));
        }

        /**
         * @param envIds The environment IDs to which the permission applies. Leave empty to apply to all environments.
         * 
         * @return builder
         * 
         */
        public Builder envIds(String... envIds) {
            return envIds(List.of(envIds));
        }

        /**
         * @param filters The filters to apply to the action. Valid options are: NON*PRODUCTION*ENVIRONMENTS, PRODUCTION_ENVIRONMENTS.
         * 
         * @return builder
         * 
         */
        public Builder filters(@Nullable Output<List<String>> filters) {
            $.filters = filters;
            return this;
        }

        /**
         * @param filters The filters to apply to the action. Valid options are: NON*PRODUCTION*ENVIRONMENTS, PRODUCTION_ENVIRONMENTS.
         * 
         * @return builder
         * 
         */
        public Builder filters(List<String> filters) {
            return filters(Output.of(filters));
        }

        /**
         * @param filters The filters to apply to the action. Valid options are: NON*PRODUCTION*ENVIRONMENTS, PRODUCTION_ENVIRONMENTS.
         * 
         * @return builder
         * 
         */
        public Builder filters(String... filters) {
            return filters(List.of(filters));
        }

        public UserGroupPermissionsAppPermissionsDeploymentArgs build() {
            if ($.actions == null) {
                throw new MissingRequiredPropertyException("UserGroupPermissionsAppPermissionsDeploymentArgs", "actions");
            }
            return $;
        }
    }

}
