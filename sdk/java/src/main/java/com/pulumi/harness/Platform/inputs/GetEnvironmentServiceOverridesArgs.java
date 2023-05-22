// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetEnvironmentServiceOverridesArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetEnvironmentServiceOverridesArgs Empty = new GetEnvironmentServiceOverridesArgs();

    /**
     * The env ID to which the overrides associated.
     * 
     */
    @Import(name="envId", required=true)
    private Output<String> envId;

    /**
     * @return The env ID to which the overrides associated.
     * 
     */
    public Output<String> envId() {
        return this.envId;
    }

    /**
     * identifier of the service overrides.
     * 
     */
    @Import(name="identifier")
    private @Nullable Output<String> identifier;

    /**
     * @return identifier of the service overrides.
     * 
     */
    public Optional<Output<String>> identifier() {
        return Optional.ofNullable(this.identifier);
    }

    /**
     * Unique identifier of the organization.
     * 
     */
    @Import(name="orgId")
    private @Nullable Output<String> orgId;

    /**
     * @return Unique identifier of the organization.
     * 
     */
    public Optional<Output<String>> orgId() {
        return Optional.ofNullable(this.orgId);
    }

    /**
     * Unique identifier of the project.
     * 
     */
    @Import(name="projectId")
    private @Nullable Output<String> projectId;

    /**
     * @return Unique identifier of the project.
     * 
     */
    public Optional<Output<String>> projectId() {
        return Optional.ofNullable(this.projectId);
    }

    /**
     * The service ID to which the overrides applies.
     * 
     */
    @Import(name="serviceId")
    private @Nullable Output<String> serviceId;

    /**
     * @return The service ID to which the overrides applies.
     * 
     */
    public Optional<Output<String>> serviceId() {
        return Optional.ofNullable(this.serviceId);
    }

    private GetEnvironmentServiceOverridesArgs() {}

    private GetEnvironmentServiceOverridesArgs(GetEnvironmentServiceOverridesArgs $) {
        this.envId = $.envId;
        this.identifier = $.identifier;
        this.orgId = $.orgId;
        this.projectId = $.projectId;
        this.serviceId = $.serviceId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetEnvironmentServiceOverridesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetEnvironmentServiceOverridesArgs $;

        public Builder() {
            $ = new GetEnvironmentServiceOverridesArgs();
        }

        public Builder(GetEnvironmentServiceOverridesArgs defaults) {
            $ = new GetEnvironmentServiceOverridesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param envId The env ID to which the overrides associated.
         * 
         * @return builder
         * 
         */
        public Builder envId(Output<String> envId) {
            $.envId = envId;
            return this;
        }

        /**
         * @param envId The env ID to which the overrides associated.
         * 
         * @return builder
         * 
         */
        public Builder envId(String envId) {
            return envId(Output.of(envId));
        }

        /**
         * @param identifier identifier of the service overrides.
         * 
         * @return builder
         * 
         */
        public Builder identifier(@Nullable Output<String> identifier) {
            $.identifier = identifier;
            return this;
        }

        /**
         * @param identifier identifier of the service overrides.
         * 
         * @return builder
         * 
         */
        public Builder identifier(String identifier) {
            return identifier(Output.of(identifier));
        }

        /**
         * @param orgId Unique identifier of the organization.
         * 
         * @return builder
         * 
         */
        public Builder orgId(@Nullable Output<String> orgId) {
            $.orgId = orgId;
            return this;
        }

        /**
         * @param orgId Unique identifier of the organization.
         * 
         * @return builder
         * 
         */
        public Builder orgId(String orgId) {
            return orgId(Output.of(orgId));
        }

        /**
         * @param projectId Unique identifier of the project.
         * 
         * @return builder
         * 
         */
        public Builder projectId(@Nullable Output<String> projectId) {
            $.projectId = projectId;
            return this;
        }

        /**
         * @param projectId Unique identifier of the project.
         * 
         * @return builder
         * 
         */
        public Builder projectId(String projectId) {
            return projectId(Output.of(projectId));
        }

        /**
         * @param serviceId The service ID to which the overrides applies.
         * 
         * @return builder
         * 
         */
        public Builder serviceId(@Nullable Output<String> serviceId) {
            $.serviceId = serviceId;
            return this;
        }

        /**
         * @param serviceId The service ID to which the overrides applies.
         * 
         * @return builder
         * 
         */
        public Builder serviceId(String serviceId) {
            return serviceId(Output.of(serviceId));
        }

        public GetEnvironmentServiceOverridesArgs build() {
            $.envId = Objects.requireNonNull($.envId, "expected parameter 'envId' to be non-null");
            return $;
        }
    }

}