// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetDbSchemaPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetDbSchemaPlainArgs Empty = new GetDbSchemaPlainArgs();

    /**
     * Unique identifier of the resource.
     * 
     */
    @Import(name="identifier", required=true)
    private String identifier;

    /**
     * @return Unique identifier of the resource.
     * 
     */
    public String identifier() {
        return this.identifier;
    }

    /**
     * Name of the resource.
     * 
     */
    @Import(name="name")
    private @Nullable String name;

    /**
     * @return Name of the resource.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Unique identifier of the organization.
     * 
     */
    @Import(name="orgId", required=true)
    private String orgId;

    /**
     * @return Unique identifier of the organization.
     * 
     */
    public String orgId() {
        return this.orgId;
    }

    /**
     * Unique identifier of the project.
     * 
     */
    @Import(name="projectId", required=true)
    private String projectId;

    /**
     * @return Unique identifier of the project.
     * 
     */
    public String projectId() {
        return this.projectId;
    }

    private GetDbSchemaPlainArgs() {}

    private GetDbSchemaPlainArgs(GetDbSchemaPlainArgs $) {
        this.identifier = $.identifier;
        this.name = $.name;
        this.orgId = $.orgId;
        this.projectId = $.projectId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetDbSchemaPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetDbSchemaPlainArgs $;

        public Builder() {
            $ = new GetDbSchemaPlainArgs();
        }

        public Builder(GetDbSchemaPlainArgs defaults) {
            $ = new GetDbSchemaPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param identifier Unique identifier of the resource.
         * 
         * @return builder
         * 
         */
        public Builder identifier(String identifier) {
            $.identifier = identifier;
            return this;
        }

        /**
         * @param name Name of the resource.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable String name) {
            $.name = name;
            return this;
        }

        /**
         * @param orgId Unique identifier of the organization.
         * 
         * @return builder
         * 
         */
        public Builder orgId(String orgId) {
            $.orgId = orgId;
            return this;
        }

        /**
         * @param projectId Unique identifier of the project.
         * 
         * @return builder
         * 
         */
        public Builder projectId(String projectId) {
            $.projectId = projectId;
            return this;
        }

        public GetDbSchemaPlainArgs build() {
            if ($.identifier == null) {
                throw new MissingRequiredPropertyException("GetDbSchemaPlainArgs", "identifier");
            }
            if ($.orgId == null) {
                throw new MissingRequiredPropertyException("GetDbSchemaPlainArgs", "orgId");
            }
            if ($.projectId == null) {
                throw new MissingRequiredPropertyException("GetDbSchemaPlainArgs", "projectId");
            }
            return $;
        }
    }

}
