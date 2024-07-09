// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class FileStoreFileArgs extends com.pulumi.resources.ResourceArgs {

    public static final FileStoreFileArgs Empty = new FileStoreFileArgs();

    /**
     * File content stored on Harness File Store
     * 
     */
    @Import(name="content")
    private @Nullable Output<String> content;

    /**
     * @return File content stored on Harness File Store
     * 
     */
    public Optional<Output<String>> content() {
        return Optional.ofNullable(this.content);
    }

    /**
     * Description of the resource.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return Description of the resource.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * File content path to be upladed on Harness File Store
     * 
     */
    @Import(name="fileContentPath")
    private @Nullable Output<String> fileContentPath;

    /**
     * @return File content path to be upladed on Harness File Store
     * 
     */
    public Optional<Output<String>> fileContentPath() {
        return Optional.ofNullable(this.fileContentPath);
    }

    /**
     * File usage. Valid options are ManifestFile, Config, Script
     * 
     */
    @Import(name="fileUsage")
    private @Nullable Output<String> fileUsage;

    /**
     * @return File usage. Valid options are ManifestFile, Config, Script
     * 
     */
    public Optional<Output<String>> fileUsage() {
        return Optional.ofNullable(this.fileUsage);
    }

    /**
     * Unique identifier of the resource.
     * 
     */
    @Import(name="identifier", required=true)
    private Output<String> identifier;

    /**
     * @return Unique identifier of the resource.
     * 
     */
    public Output<String> identifier() {
        return this.identifier;
    }

    /**
     * File mime type
     * 
     */
    @Import(name="mimeType")
    private @Nullable Output<String> mimeType;

    /**
     * @return File mime type
     * 
     */
    public Optional<Output<String>> mimeType() {
        return Optional.ofNullable(this.mimeType);
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
     * File parent identifier on Harness File Store
     * 
     */
    @Import(name="parentIdentifier", required=true)
    private Output<String> parentIdentifier;

    /**
     * @return File parent identifier on Harness File Store
     * 
     */
    public Output<String> parentIdentifier() {
        return this.parentIdentifier;
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
     * Tags to associate with the resource.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<List<String>> tags;

    /**
     * @return Tags to associate with the resource.
     * 
     */
    public Optional<Output<List<String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private FileStoreFileArgs() {}

    private FileStoreFileArgs(FileStoreFileArgs $) {
        this.content = $.content;
        this.description = $.description;
        this.fileContentPath = $.fileContentPath;
        this.fileUsage = $.fileUsage;
        this.identifier = $.identifier;
        this.mimeType = $.mimeType;
        this.name = $.name;
        this.orgId = $.orgId;
        this.parentIdentifier = $.parentIdentifier;
        this.projectId = $.projectId;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FileStoreFileArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FileStoreFileArgs $;

        public Builder() {
            $ = new FileStoreFileArgs();
        }

        public Builder(FileStoreFileArgs defaults) {
            $ = new FileStoreFileArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param content File content stored on Harness File Store
         * 
         * @return builder
         * 
         */
        public Builder content(@Nullable Output<String> content) {
            $.content = content;
            return this;
        }

        /**
         * @param content File content stored on Harness File Store
         * 
         * @return builder
         * 
         */
        public Builder content(String content) {
            return content(Output.of(content));
        }

        /**
         * @param description Description of the resource.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Description of the resource.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param fileContentPath File content path to be upladed on Harness File Store
         * 
         * @return builder
         * 
         */
        public Builder fileContentPath(@Nullable Output<String> fileContentPath) {
            $.fileContentPath = fileContentPath;
            return this;
        }

        /**
         * @param fileContentPath File content path to be upladed on Harness File Store
         * 
         * @return builder
         * 
         */
        public Builder fileContentPath(String fileContentPath) {
            return fileContentPath(Output.of(fileContentPath));
        }

        /**
         * @param fileUsage File usage. Valid options are ManifestFile, Config, Script
         * 
         * @return builder
         * 
         */
        public Builder fileUsage(@Nullable Output<String> fileUsage) {
            $.fileUsage = fileUsage;
            return this;
        }

        /**
         * @param fileUsage File usage. Valid options are ManifestFile, Config, Script
         * 
         * @return builder
         * 
         */
        public Builder fileUsage(String fileUsage) {
            return fileUsage(Output.of(fileUsage));
        }

        /**
         * @param identifier Unique identifier of the resource.
         * 
         * @return builder
         * 
         */
        public Builder identifier(Output<String> identifier) {
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
         * @param mimeType File mime type
         * 
         * @return builder
         * 
         */
        public Builder mimeType(@Nullable Output<String> mimeType) {
            $.mimeType = mimeType;
            return this;
        }

        /**
         * @param mimeType File mime type
         * 
         * @return builder
         * 
         */
        public Builder mimeType(String mimeType) {
            return mimeType(Output.of(mimeType));
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
         * @param parentIdentifier File parent identifier on Harness File Store
         * 
         * @return builder
         * 
         */
        public Builder parentIdentifier(Output<String> parentIdentifier) {
            $.parentIdentifier = parentIdentifier;
            return this;
        }

        /**
         * @param parentIdentifier File parent identifier on Harness File Store
         * 
         * @return builder
         * 
         */
        public Builder parentIdentifier(String parentIdentifier) {
            return parentIdentifier(Output.of(parentIdentifier));
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
         * @param tags Tags to associate with the resource.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<List<String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags Tags to associate with the resource.
         * 
         * @return builder
         * 
         */
        public Builder tags(List<String> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param tags Tags to associate with the resource.
         * 
         * @return builder
         * 
         */
        public Builder tags(String... tags) {
            return tags(List.of(tags));
        }

        public FileStoreFileArgs build() {
            if ($.identifier == null) {
                throw new MissingRequiredPropertyException("FileStoreFileArgs", "identifier");
            }
            if ($.parentIdentifier == null) {
                throw new MissingRequiredPropertyException("FileStoreFileArgs", "parentIdentifier");
            }
            return $;
        }
    }

}