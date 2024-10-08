// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetTemplateFiltersPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetTemplateFiltersPlainArgs Empty = new GetTemplateFiltersPlainArgs();

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
     * Organization Identifier for the Entity.
     * 
     */
    @Import(name="orgId")
    private @Nullable String orgId;

    /**
     * @return Organization Identifier for the Entity.
     * 
     */
    public Optional<String> orgId() {
        return Optional.ofNullable(this.orgId);
    }

    /**
     * Project Identifier for the Entity.
     * 
     */
    @Import(name="projectId")
    private @Nullable String projectId;

    /**
     * @return Project Identifier for the Entity.
     * 
     */
    public Optional<String> projectId() {
        return Optional.ofNullable(this.projectId);
    }

    /**
     * Type of filter. Currently supported types are {TemplateSetup, TemplateExecution, Deployment, Template, EnvironmentGroup, Environment}.
     * 
     */
    @Import(name="type", required=true)
    private String type;

    /**
     * @return Type of filter. Currently supported types are {TemplateSetup, TemplateExecution, Deployment, Template, EnvironmentGroup, Environment}.
     * 
     */
    public String type() {
        return this.type;
    }

    private GetTemplateFiltersPlainArgs() {}

    private GetTemplateFiltersPlainArgs(GetTemplateFiltersPlainArgs $) {
        this.identifier = $.identifier;
        this.orgId = $.orgId;
        this.projectId = $.projectId;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetTemplateFiltersPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetTemplateFiltersPlainArgs $;

        public Builder() {
            $ = new GetTemplateFiltersPlainArgs();
        }

        public Builder(GetTemplateFiltersPlainArgs defaults) {
            $ = new GetTemplateFiltersPlainArgs(Objects.requireNonNull(defaults));
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
         * @param orgId Organization Identifier for the Entity.
         * 
         * @return builder
         * 
         */
        public Builder orgId(@Nullable String orgId) {
            $.orgId = orgId;
            return this;
        }

        /**
         * @param projectId Project Identifier for the Entity.
         * 
         * @return builder
         * 
         */
        public Builder projectId(@Nullable String projectId) {
            $.projectId = projectId;
            return this;
        }

        /**
         * @param type Type of filter. Currently supported types are {TemplateSetup, TemplateExecution, Deployment, Template, EnvironmentGroup, Environment}.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            $.type = type;
            return this;
        }

        public GetTemplateFiltersPlainArgs build() {
            if ($.identifier == null) {
                throw new MissingRequiredPropertyException("GetTemplateFiltersPlainArgs", "identifier");
            }
            if ($.type == null) {
                throw new MissingRequiredPropertyException("GetTemplateFiltersPlainArgs", "type");
            }
            return $;
        }
    }

}