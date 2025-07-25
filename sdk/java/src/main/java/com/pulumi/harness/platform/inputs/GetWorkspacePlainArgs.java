// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.harness.platform.inputs.GetWorkspaceConnector;
import com.pulumi.harness.platform.inputs.GetWorkspaceEnvironmentVariable;
import com.pulumi.harness.platform.inputs.GetWorkspaceTerraformVariable;
import com.pulumi.harness.platform.inputs.GetWorkspaceTerraformVariableFile;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetWorkspacePlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetWorkspacePlainArgs Empty = new GetWorkspacePlainArgs();

    /**
     * Provider connector configured on the workspace
     * 
     */
    @Import(name="connectors")
    private @Nullable List<GetWorkspaceConnector> connectors;

    /**
     * @return Provider connector configured on the workspace
     * 
     */
    public Optional<List<GetWorkspaceConnector>> connectors() {
        return Optional.ofNullable(this.connectors);
    }

    /**
     * Description of the Workspace
     * 
     */
    @Import(name="description")
    private @Nullable String description;

    /**
     * @return Description of the Workspace
     * 
     */
    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Environment variables configured on the workspace
     * 
     */
    @Import(name="environmentVariables")
    private @Nullable List<GetWorkspaceEnvironmentVariable> environmentVariables;

    /**
     * @return Environment variables configured on the workspace
     * 
     */
    public Optional<List<GetWorkspaceEnvironmentVariable>> environmentVariables() {
        return Optional.ofNullable(this.environmentVariables);
    }

    /**
     * Identifier of the Workspace
     * 
     */
    @Import(name="identifier", required=true)
    private String identifier;

    /**
     * @return Identifier of the Workspace
     * 
     */
    public String identifier() {
        return this.identifier;
    }

    /**
     * Organization Identifier
     * 
     */
    @Import(name="orgId", required=true)
    private String orgId;

    /**
     * @return Organization Identifier
     * 
     */
    public String orgId() {
        return this.orgId;
    }

    /**
     * Project Identifier
     * 
     */
    @Import(name="projectId", required=true)
    private String projectId;

    /**
     * @return Project Identifier
     * 
     */
    public String projectId() {
        return this.projectId;
    }

    /**
     * Repository Branch in which the code should be accessed
     * 
     */
    @Import(name="repositoryBranch")
    private @Nullable String repositoryBranch;

    /**
     * @return Repository Branch in which the code should be accessed
     * 
     */
    public Optional<String> repositoryBranch() {
        return Optional.ofNullable(this.repositoryBranch);
    }

    /**
     * Repository Tag in which the code should be accessed
     * 
     */
    @Import(name="repositoryCommit")
    private @Nullable String repositoryCommit;

    /**
     * @return Repository Tag in which the code should be accessed
     * 
     */
    public Optional<String> repositoryCommit() {
        return Optional.ofNullable(this.repositoryCommit);
    }

    /**
     * Repository Commit SHA in which the code should be accessed
     * 
     */
    @Import(name="repositorySha")
    private @Nullable String repositorySha;

    /**
     * @return Repository Commit SHA in which the code should be accessed
     * 
     */
    public Optional<String> repositorySha() {
        return Optional.ofNullable(this.repositorySha);
    }

    @Import(name="tags")
    private @Nullable List<String> tags;

    public Optional<List<String>> tags() {
        return Optional.ofNullable(this.tags);
    }

    @Import(name="terraformVariableFiles")
    private @Nullable List<GetWorkspaceTerraformVariableFile> terraformVariableFiles;

    public Optional<List<GetWorkspaceTerraformVariableFile>> terraformVariableFiles() {
        return Optional.ofNullable(this.terraformVariableFiles);
    }

    @Import(name="terraformVariables")
    private @Nullable List<GetWorkspaceTerraformVariable> terraformVariables;

    public Optional<List<GetWorkspaceTerraformVariable>> terraformVariables() {
        return Optional.ofNullable(this.terraformVariables);
    }

    /**
     * Variable sets to use.
     * 
     */
    @Import(name="variableSets")
    private @Nullable List<String> variableSets;

    /**
     * @return Variable sets to use.
     * 
     */
    public Optional<List<String>> variableSets() {
        return Optional.ofNullable(this.variableSets);
    }

    private GetWorkspacePlainArgs() {}

    private GetWorkspacePlainArgs(GetWorkspacePlainArgs $) {
        this.connectors = $.connectors;
        this.description = $.description;
        this.environmentVariables = $.environmentVariables;
        this.identifier = $.identifier;
        this.orgId = $.orgId;
        this.projectId = $.projectId;
        this.repositoryBranch = $.repositoryBranch;
        this.repositoryCommit = $.repositoryCommit;
        this.repositorySha = $.repositorySha;
        this.tags = $.tags;
        this.terraformVariableFiles = $.terraformVariableFiles;
        this.terraformVariables = $.terraformVariables;
        this.variableSets = $.variableSets;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetWorkspacePlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetWorkspacePlainArgs $;

        public Builder() {
            $ = new GetWorkspacePlainArgs();
        }

        public Builder(GetWorkspacePlainArgs defaults) {
            $ = new GetWorkspacePlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param connectors Provider connector configured on the workspace
         * 
         * @return builder
         * 
         */
        public Builder connectors(@Nullable List<GetWorkspaceConnector> connectors) {
            $.connectors = connectors;
            return this;
        }

        /**
         * @param connectors Provider connector configured on the workspace
         * 
         * @return builder
         * 
         */
        public Builder connectors(GetWorkspaceConnector... connectors) {
            return connectors(List.of(connectors));
        }

        /**
         * @param description Description of the Workspace
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable String description) {
            $.description = description;
            return this;
        }

        /**
         * @param environmentVariables Environment variables configured on the workspace
         * 
         * @return builder
         * 
         */
        public Builder environmentVariables(@Nullable List<GetWorkspaceEnvironmentVariable> environmentVariables) {
            $.environmentVariables = environmentVariables;
            return this;
        }

        /**
         * @param environmentVariables Environment variables configured on the workspace
         * 
         * @return builder
         * 
         */
        public Builder environmentVariables(GetWorkspaceEnvironmentVariable... environmentVariables) {
            return environmentVariables(List.of(environmentVariables));
        }

        /**
         * @param identifier Identifier of the Workspace
         * 
         * @return builder
         * 
         */
        public Builder identifier(String identifier) {
            $.identifier = identifier;
            return this;
        }

        /**
         * @param orgId Organization Identifier
         * 
         * @return builder
         * 
         */
        public Builder orgId(String orgId) {
            $.orgId = orgId;
            return this;
        }

        /**
         * @param projectId Project Identifier
         * 
         * @return builder
         * 
         */
        public Builder projectId(String projectId) {
            $.projectId = projectId;
            return this;
        }

        /**
         * @param repositoryBranch Repository Branch in which the code should be accessed
         * 
         * @return builder
         * 
         */
        public Builder repositoryBranch(@Nullable String repositoryBranch) {
            $.repositoryBranch = repositoryBranch;
            return this;
        }

        /**
         * @param repositoryCommit Repository Tag in which the code should be accessed
         * 
         * @return builder
         * 
         */
        public Builder repositoryCommit(@Nullable String repositoryCommit) {
            $.repositoryCommit = repositoryCommit;
            return this;
        }

        /**
         * @param repositorySha Repository Commit SHA in which the code should be accessed
         * 
         * @return builder
         * 
         */
        public Builder repositorySha(@Nullable String repositorySha) {
            $.repositorySha = repositorySha;
            return this;
        }

        public Builder tags(@Nullable List<String> tags) {
            $.tags = tags;
            return this;
        }

        public Builder tags(String... tags) {
            return tags(List.of(tags));
        }

        public Builder terraformVariableFiles(@Nullable List<GetWorkspaceTerraformVariableFile> terraformVariableFiles) {
            $.terraformVariableFiles = terraformVariableFiles;
            return this;
        }

        public Builder terraformVariableFiles(GetWorkspaceTerraformVariableFile... terraformVariableFiles) {
            return terraformVariableFiles(List.of(terraformVariableFiles));
        }

        public Builder terraformVariables(@Nullable List<GetWorkspaceTerraformVariable> terraformVariables) {
            $.terraformVariables = terraformVariables;
            return this;
        }

        public Builder terraformVariables(GetWorkspaceTerraformVariable... terraformVariables) {
            return terraformVariables(List.of(terraformVariables));
        }

        /**
         * @param variableSets Variable sets to use.
         * 
         * @return builder
         * 
         */
        public Builder variableSets(@Nullable List<String> variableSets) {
            $.variableSets = variableSets;
            return this;
        }

        /**
         * @param variableSets Variable sets to use.
         * 
         * @return builder
         * 
         */
        public Builder variableSets(String... variableSets) {
            return variableSets(List.of(variableSets));
        }

        public GetWorkspacePlainArgs build() {
            if ($.identifier == null) {
                throw new MissingRequiredPropertyException("GetWorkspacePlainArgs", "identifier");
            }
            if ($.orgId == null) {
                throw new MissingRequiredPropertyException("GetWorkspacePlainArgs", "orgId");
            }
            if ($.projectId == null) {
                throw new MissingRequiredPropertyException("GetWorkspacePlainArgs", "projectId");
            }
            return $;
        }
    }

}
