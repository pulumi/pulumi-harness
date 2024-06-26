// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetTriggersArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetTriggersArgs Empty = new GetTriggersArgs();

    /**
     * Unique identifier of the resource.
     * 
     */
    @Import(name="identifier")
    private @Nullable Output<String> identifier;

    /**
     * @return Unique identifier of the resource.
     * 
     */
    public Optional<Output<String>> identifier() {
        return Optional.ofNullable(this.identifier);
    }

    /**
     * ignore error default false
     * 
     */
    @Import(name="ignoreError")
    private @Nullable Output<Boolean> ignoreError;

    /**
     * @return ignore error default false
     * 
     */
    public Optional<Output<Boolean>> ignoreError() {
        return Optional.ofNullable(this.ignoreError);
    }

    /**
     * Name of the resource.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Name of the resource.
     * 
     */
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

    /**
     * Identifier of the target pipeline
     * 
     */
    @Import(name="targetId", required=true)
    private Output<String> targetId;

    /**
     * @return Identifier of the target pipeline
     * 
     */
    public Output<String> targetId() {
        return this.targetId;
    }

    private GetTriggersArgs() {}

    private GetTriggersArgs(GetTriggersArgs $) {
        this.identifier = $.identifier;
        this.ignoreError = $.ignoreError;
        this.name = $.name;
        this.orgId = $.orgId;
        this.projectId = $.projectId;
        this.targetId = $.targetId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetTriggersArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetTriggersArgs $;

        public Builder() {
            $ = new GetTriggersArgs();
        }

        public Builder(GetTriggersArgs defaults) {
            $ = new GetTriggersArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param identifier Unique identifier of the resource.
         * 
         * @return builder
         * 
         */
        public Builder identifier(@Nullable Output<String> identifier) {
            $.identifier = identifier;
            return this;
        }

        /**
         * @param identifier Unique identifier of the resource.
         * 
         * @return builder
         * 
         */
        public Builder identifier(String identifier) {
            return identifier(Output.of(identifier));
        }

        /**
         * @param ignoreError ignore error default false
         * 
         * @return builder
         * 
         */
        public Builder ignoreError(@Nullable Output<Boolean> ignoreError) {
            $.ignoreError = ignoreError;
            return this;
        }

        /**
         * @param ignoreError ignore error default false
         * 
         * @return builder
         * 
         */
        public Builder ignoreError(Boolean ignoreError) {
            return ignoreError(Output.of(ignoreError));
        }

        /**
         * @param name Name of the resource.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of the resource.
         * 
         * @return builder
         * 
         */
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

        /**
         * @param targetId Identifier of the target pipeline
         * 
         * @return builder
         * 
         */
        public Builder targetId(Output<String> targetId) {
            $.targetId = targetId;
            return this;
        }

        /**
         * @param targetId Identifier of the target pipeline
         * 
         * @return builder
         * 
         */
        public Builder targetId(String targetId) {
            return targetId(Output.of(targetId));
        }

        public GetTriggersArgs build() {
            if ($.orgId == null) {
                throw new MissingRequiredPropertyException("GetTriggersArgs", "orgId");
            }
            if ($.projectId == null) {
                throw new MissingRequiredPropertyException("GetTriggersArgs", "projectId");
            }
            if ($.targetId == null) {
                throw new MissingRequiredPropertyException("GetTriggersArgs", "targetId");
            }
            return $;
        }
    }

}
