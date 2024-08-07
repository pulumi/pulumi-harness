// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.harness.platform.inputs.EnvironmentClustersMappingClusterArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class EnvironmentClustersMappingState extends com.pulumi.resources.ResourceArgs {

    public static final EnvironmentClustersMappingState Empty = new EnvironmentClustersMappingState();

    /**
     * list of cluster identifiers and names
     * 
     */
    @Import(name="clusters")
    private @Nullable Output<List<EnvironmentClustersMappingClusterArgs>> clusters;

    /**
     * @return list of cluster identifiers and names
     * 
     */
    public Optional<Output<List<EnvironmentClustersMappingClusterArgs>>> clusters() {
        return Optional.ofNullable(this.clusters);
    }

    /**
     * environment identifier.
     * 
     */
    @Import(name="envId")
    private @Nullable Output<String> envId;

    /**
     * @return environment identifier.
     * 
     */
    public Optional<Output<String>> envId() {
        return Optional.ofNullable(this.envId);
    }

    /**
     * identifier for the cluster mapping(can be given any value).
     * 
     */
    @Import(name="identifier")
    private @Nullable Output<String> identifier;

    /**
     * @return identifier for the cluster mapping(can be given any value).
     * 
     */
    public Optional<Output<String>> identifier() {
        return Optional.ofNullable(this.identifier);
    }

    /**
     * org_id of the environment.
     * 
     */
    @Import(name="orgId")
    private @Nullable Output<String> orgId;

    /**
     * @return org_id of the environment.
     * 
     */
    public Optional<Output<String>> orgId() {
        return Optional.ofNullable(this.orgId);
    }

    /**
     * project_id of the environment.
     * 
     */
    @Import(name="projectId")
    private @Nullable Output<String> projectId;

    /**
     * @return project_id of the environment.
     * 
     */
    public Optional<Output<String>> projectId() {
        return Optional.ofNullable(this.projectId);
    }

    /**
     * scope at which the environment exists in harness.
     * 
     */
    @Import(name="scope")
    private @Nullable Output<String> scope;

    /**
     * @return scope at which the environment exists in harness.
     * 
     */
    public Optional<Output<String>> scope() {
        return Optional.ofNullable(this.scope);
    }

    private EnvironmentClustersMappingState() {}

    private EnvironmentClustersMappingState(EnvironmentClustersMappingState $) {
        this.clusters = $.clusters;
        this.envId = $.envId;
        this.identifier = $.identifier;
        this.orgId = $.orgId;
        this.projectId = $.projectId;
        this.scope = $.scope;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EnvironmentClustersMappingState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EnvironmentClustersMappingState $;

        public Builder() {
            $ = new EnvironmentClustersMappingState();
        }

        public Builder(EnvironmentClustersMappingState defaults) {
            $ = new EnvironmentClustersMappingState(Objects.requireNonNull(defaults));
        }

        /**
         * @param clusters list of cluster identifiers and names
         * 
         * @return builder
         * 
         */
        public Builder clusters(@Nullable Output<List<EnvironmentClustersMappingClusterArgs>> clusters) {
            $.clusters = clusters;
            return this;
        }

        /**
         * @param clusters list of cluster identifiers and names
         * 
         * @return builder
         * 
         */
        public Builder clusters(List<EnvironmentClustersMappingClusterArgs> clusters) {
            return clusters(Output.of(clusters));
        }

        /**
         * @param clusters list of cluster identifiers and names
         * 
         * @return builder
         * 
         */
        public Builder clusters(EnvironmentClustersMappingClusterArgs... clusters) {
            return clusters(List.of(clusters));
        }

        /**
         * @param envId environment identifier.
         * 
         * @return builder
         * 
         */
        public Builder envId(@Nullable Output<String> envId) {
            $.envId = envId;
            return this;
        }

        /**
         * @param envId environment identifier.
         * 
         * @return builder
         * 
         */
        public Builder envId(String envId) {
            return envId(Output.of(envId));
        }

        /**
         * @param identifier identifier for the cluster mapping(can be given any value).
         * 
         * @return builder
         * 
         */
        public Builder identifier(@Nullable Output<String> identifier) {
            $.identifier = identifier;
            return this;
        }

        /**
         * @param identifier identifier for the cluster mapping(can be given any value).
         * 
         * @return builder
         * 
         */
        public Builder identifier(String identifier) {
            return identifier(Output.of(identifier));
        }

        /**
         * @param orgId org_id of the environment.
         * 
         * @return builder
         * 
         */
        public Builder orgId(@Nullable Output<String> orgId) {
            $.orgId = orgId;
            return this;
        }

        /**
         * @param orgId org_id of the environment.
         * 
         * @return builder
         * 
         */
        public Builder orgId(String orgId) {
            return orgId(Output.of(orgId));
        }

        /**
         * @param projectId project_id of the environment.
         * 
         * @return builder
         * 
         */
        public Builder projectId(@Nullable Output<String> projectId) {
            $.projectId = projectId;
            return this;
        }

        /**
         * @param projectId project_id of the environment.
         * 
         * @return builder
         * 
         */
        public Builder projectId(String projectId) {
            return projectId(Output.of(projectId));
        }

        /**
         * @param scope scope at which the environment exists in harness.
         * 
         * @return builder
         * 
         */
        public Builder scope(@Nullable Output<String> scope) {
            $.scope = scope;
            return this;
        }

        /**
         * @param scope scope at which the environment exists in harness.
         * 
         * @return builder
         * 
         */
        public Builder scope(String scope) {
            return scope(Output.of(scope));
        }

        public EnvironmentClustersMappingState build() {
            return $;
        }
    }

}
