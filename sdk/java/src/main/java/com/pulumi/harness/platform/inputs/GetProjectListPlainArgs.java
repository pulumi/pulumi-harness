// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetProjectListPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetProjectListPlainArgs Empty = new GetProjectListPlainArgs();

    @Import(name="identifier")
    private @Nullable String identifier;

    public Optional<String> identifier() {
        return Optional.ofNullable(this.identifier);
    }

    /**
     * Optional pagination parameter indicating the maximum number of entities to retrieve per page.
     * 
     */
    @Import(name="limit")
    private @Nullable Integer limit;

    /**
     * @return Optional pagination parameter indicating the maximum number of entities to retrieve per page.
     * 
     */
    public Optional<Integer> limit() {
        return Optional.ofNullable(this.limit);
    }

    @Import(name="name")
    private @Nullable String name;

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
     * Optional pagination parameter indicating the page number when retrieving entities.
     * 
     */
    @Import(name="page")
    private @Nullable Integer page;

    /**
     * @return Optional pagination parameter indicating the page number when retrieving entities.
     * 
     */
    public Optional<Integer> page() {
        return Optional.ofNullable(this.page);
    }

    private GetProjectListPlainArgs() {}

    private GetProjectListPlainArgs(GetProjectListPlainArgs $) {
        this.identifier = $.identifier;
        this.limit = $.limit;
        this.name = $.name;
        this.orgId = $.orgId;
        this.page = $.page;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetProjectListPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetProjectListPlainArgs $;

        public Builder() {
            $ = new GetProjectListPlainArgs();
        }

        public Builder(GetProjectListPlainArgs defaults) {
            $ = new GetProjectListPlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder identifier(@Nullable String identifier) {
            $.identifier = identifier;
            return this;
        }

        /**
         * @param limit Optional pagination parameter indicating the maximum number of entities to retrieve per page.
         * 
         * @return builder
         * 
         */
        public Builder limit(@Nullable Integer limit) {
            $.limit = limit;
            return this;
        }

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
         * @param page Optional pagination parameter indicating the page number when retrieving entities.
         * 
         * @return builder
         * 
         */
        public Builder page(@Nullable Integer page) {
            $.page = page;
            return this;
        }

        public GetProjectListPlainArgs build() {
            if ($.orgId == null) {
                throw new MissingRequiredPropertyException("GetProjectListPlainArgs", "orgId");
            }
            return $;
        }
    }

}