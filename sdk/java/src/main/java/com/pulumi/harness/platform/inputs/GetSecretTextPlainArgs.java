// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.harness.platform.inputs.GetSecretTextAdditionalMetadata;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetSecretTextPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetSecretTextPlainArgs Empty = new GetSecretTextPlainArgs();

    /**
     * Additional Metadata for the Secret
     * 
     */
    @Import(name="additionalMetadatas")
    private @Nullable List<GetSecretTextAdditionalMetadata> additionalMetadatas;

    /**
     * @return Additional Metadata for the Secret
     * 
     */
    public Optional<List<GetSecretTextAdditionalMetadata>> additionalMetadatas() {
        return Optional.ofNullable(this.additionalMetadatas);
    }

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
    @Import(name="orgId")
    private @Nullable String orgId;

    /**
     * @return Unique identifier of the organization.
     * 
     */
    public Optional<String> orgId() {
        return Optional.ofNullable(this.orgId);
    }

    /**
     * Unique identifier of the project.
     * 
     */
    @Import(name="projectId")
    private @Nullable String projectId;

    /**
     * @return Unique identifier of the project.
     * 
     */
    public Optional<String> projectId() {
        return Optional.ofNullable(this.projectId);
    }

    private GetSecretTextPlainArgs() {}

    private GetSecretTextPlainArgs(GetSecretTextPlainArgs $) {
        this.additionalMetadatas = $.additionalMetadatas;
        this.identifier = $.identifier;
        this.name = $.name;
        this.orgId = $.orgId;
        this.projectId = $.projectId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetSecretTextPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetSecretTextPlainArgs $;

        public Builder() {
            $ = new GetSecretTextPlainArgs();
        }

        public Builder(GetSecretTextPlainArgs defaults) {
            $ = new GetSecretTextPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param additionalMetadatas Additional Metadata for the Secret
         * 
         * @return builder
         * 
         */
        public Builder additionalMetadatas(@Nullable List<GetSecretTextAdditionalMetadata> additionalMetadatas) {
            $.additionalMetadatas = additionalMetadatas;
            return this;
        }

        /**
         * @param additionalMetadatas Additional Metadata for the Secret
         * 
         * @return builder
         * 
         */
        public Builder additionalMetadatas(GetSecretTextAdditionalMetadata... additionalMetadatas) {
            return additionalMetadatas(List.of(additionalMetadatas));
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
        public Builder orgId(@Nullable String orgId) {
            $.orgId = orgId;
            return this;
        }

        /**
         * @param projectId Unique identifier of the project.
         * 
         * @return builder
         * 
         */
        public Builder projectId(@Nullable String projectId) {
            $.projectId = projectId;
            return this;
        }

        public GetSecretTextPlainArgs build() {
            if ($.identifier == null) {
                throw new MissingRequiredPropertyException("GetSecretTextPlainArgs", "identifier");
            }
            return $;
        }
    }

}