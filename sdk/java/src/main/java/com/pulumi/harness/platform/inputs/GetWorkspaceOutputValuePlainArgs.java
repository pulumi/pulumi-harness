// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetWorkspaceOutputValuePlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetWorkspaceOutputValuePlainArgs Empty = new GetWorkspaceOutputValuePlainArgs();

    /**
     * Identifier of the Workspace.
     * 
     */
    @Import(name="identifier", required=true)
    private String identifier;

    /**
     * @return Identifier of the Workspace.
     * 
     */
    public String identifier() {
        return this.identifier;
    }

    /**
     * Organization identifier of the organization the workspace resides in.
     * 
     */
    @Import(name="orgId", required=true)
    private String orgId;

    /**
     * @return Organization identifier of the organization the workspace resides in.
     * 
     */
    public String orgId() {
        return this.orgId;
    }

    /**
     * Project identifier of the project the workspace resides in.
     * 
     */
    @Import(name="projectId", required=true)
    private String projectId;

    /**
     * @return Project identifier of the project the workspace resides in.
     * 
     */
    public String projectId() {
        return this.projectId;
    }

    private GetWorkspaceOutputValuePlainArgs() {}

    private GetWorkspaceOutputValuePlainArgs(GetWorkspaceOutputValuePlainArgs $) {
        this.identifier = $.identifier;
        this.orgId = $.orgId;
        this.projectId = $.projectId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetWorkspaceOutputValuePlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetWorkspaceOutputValuePlainArgs $;

        public Builder() {
            $ = new GetWorkspaceOutputValuePlainArgs();
        }

        public Builder(GetWorkspaceOutputValuePlainArgs defaults) {
            $ = new GetWorkspaceOutputValuePlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param identifier Identifier of the Workspace.
         * 
         * @return builder
         * 
         */
        public Builder identifier(String identifier) {
            $.identifier = identifier;
            return this;
        }

        /**
         * @param orgId Organization identifier of the organization the workspace resides in.
         * 
         * @return builder
         * 
         */
        public Builder orgId(String orgId) {
            $.orgId = orgId;
            return this;
        }

        /**
         * @param projectId Project identifier of the project the workspace resides in.
         * 
         * @return builder
         * 
         */
        public Builder projectId(String projectId) {
            $.projectId = projectId;
            return this;
        }

        public GetWorkspaceOutputValuePlainArgs build() {
            if ($.identifier == null) {
                throw new MissingRequiredPropertyException("GetWorkspaceOutputValuePlainArgs", "identifier");
            }
            if ($.orgId == null) {
                throw new MissingRequiredPropertyException("GetWorkspaceOutputValuePlainArgs", "orgId");
            }
            if ($.projectId == null) {
                throw new MissingRequiredPropertyException("GetWorkspaceOutputValuePlainArgs", "projectId");
            }
            return $;
        }
    }

}
