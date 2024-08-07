// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetPipelineListArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetPipelineListArgs Empty = new GetPipelineListArgs();

    @Import(name="identifier")
    private @Nullable Output<String> identifier;

    public Optional<Output<String>> identifier() {
        return Optional.ofNullable(this.identifier);
    }

    /**
     * Optional pagination parameter indicating the maximum number of entities to retrieve per page.
     * 
     */
    @Import(name="limit")
    private @Nullable Output<Integer> limit;

    /**
     * @return Optional pagination parameter indicating the maximum number of entities to retrieve per page.
     * 
     */
    public Optional<Output<Integer>> limit() {
        return Optional.ofNullable(this.limit);
    }

    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Unique identifier of the organization.
     * 
     */
    @Import(name="orgId", required=true)
    private Output<String> orgId;

    /**
     * @return Unique identifier of the organization.
     * 
     */
    public Output<String> orgId() {
        return this.orgId;
    }

    /**
     * Optional pagination parameter indicating the page number when retrieving entities.
     * 
     */
    @Import(name="page")
    private @Nullable Output<Integer> page;

    /**
     * @return Optional pagination parameter indicating the page number when retrieving entities.
     * 
     */
    public Optional<Output<Integer>> page() {
        return Optional.ofNullable(this.page);
    }

    /**
     * Unique identifier of the project.
     * 
     */
    @Import(name="projectId", required=true)
    private Output<String> projectId;

    /**
     * @return Unique identifier of the project.
     * 
     */
    public Output<String> projectId() {
        return this.projectId;
    }

    private GetPipelineListArgs() {}

    private GetPipelineListArgs(GetPipelineListArgs $) {
        this.identifier = $.identifier;
        this.limit = $.limit;
        this.name = $.name;
        this.orgId = $.orgId;
        this.page = $.page;
        this.projectId = $.projectId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPipelineListArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPipelineListArgs $;

        public Builder() {
            $ = new GetPipelineListArgs();
        }

        public Builder(GetPipelineListArgs defaults) {
            $ = new GetPipelineListArgs(Objects.requireNonNull(defaults));
        }

        public Builder identifier(@Nullable Output<String> identifier) {
            $.identifier = identifier;
            return this;
        }

        public Builder identifier(String identifier) {
            return identifier(Output.of(identifier));
        }

        /**
         * @param limit Optional pagination parameter indicating the maximum number of entities to retrieve per page.
         * 
         * @return builder
         * 
         */
        public Builder limit(@Nullable Output<Integer> limit) {
            $.limit = limit;
            return this;
        }

        /**
         * @param limit Optional pagination parameter indicating the maximum number of entities to retrieve per page.
         * 
         * @return builder
         * 
         */
        public Builder limit(Integer limit) {
            return limit(Output.of(limit));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param orgId Unique identifier of the organization.
         * 
         * @return builder
         * 
         */
        public Builder orgId(Output<String> orgId) {
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
         * @param page Optional pagination parameter indicating the page number when retrieving entities.
         * 
         * @return builder
         * 
         */
        public Builder page(@Nullable Output<Integer> page) {
            $.page = page;
            return this;
        }

        /**
         * @param page Optional pagination parameter indicating the page number when retrieving entities.
         * 
         * @return builder
         * 
         */
        public Builder page(Integer page) {
            return page(Output.of(page));
        }

        /**
         * @param projectId Unique identifier of the project.
         * 
         * @return builder
         * 
         */
        public Builder projectId(Output<String> projectId) {
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

        public GetPipelineListArgs build() {
            if ($.orgId == null) {
                throw new MissingRequiredPropertyException("GetPipelineListArgs", "orgId");
            }
            if ($.projectId == null) {
                throw new MissingRequiredPropertyException("GetPipelineListArgs", "projectId");
            }
            return $;
        }
    }

}
