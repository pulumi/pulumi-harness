// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.harness.platform.outputs.GetFileStoreFolderCreatedBy;
import com.pulumi.harness.platform.outputs.GetFileStoreFolderLastModifiedBy;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetFileStoreFolderResult {
    /**
     * @return Created by
     * 
     */
    private List<GetFileStoreFolderCreatedBy> createdBies;
    /**
     * @return Description of the resource.
     * 
     */
    private String description;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return Unique identifier of the resource.
     * 
     */
    private String identifier;
    /**
     * @return Last modified at
     * 
     */
    private Integer lastModifiedAt;
    /**
     * @return Last modified by
     * 
     */
    private List<GetFileStoreFolderLastModifiedBy> lastModifiedBies;
    /**
     * @return Name of the resource.
     * 
     */
    private @Nullable String name;
    /**
     * @return Unique identifier of the organization.
     * 
     */
    private @Nullable String orgId;
    /**
     * @return Folder parent identifier on Harness File Store
     * 
     */
    private String parentIdentifier;
    /**
     * @return Harness File Store folder path
     * 
     */
    private String path;
    /**
     * @return Unique identifier of the project.
     * 
     */
    private @Nullable String projectId;
    /**
     * @return Tags to associate with the resource.
     * 
     */
    private List<String> tags;

    private GetFileStoreFolderResult() {}
    /**
     * @return Created by
     * 
     */
    public List<GetFileStoreFolderCreatedBy> createdBies() {
        return this.createdBies;
    }
    /**
     * @return Description of the resource.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Unique identifier of the resource.
     * 
     */
    public String identifier() {
        return this.identifier;
    }
    /**
     * @return Last modified at
     * 
     */
    public Integer lastModifiedAt() {
        return this.lastModifiedAt;
    }
    /**
     * @return Last modified by
     * 
     */
    public List<GetFileStoreFolderLastModifiedBy> lastModifiedBies() {
        return this.lastModifiedBies;
    }
    /**
     * @return Name of the resource.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    /**
     * @return Unique identifier of the organization.
     * 
     */
    public Optional<String> orgId() {
        return Optional.ofNullable(this.orgId);
    }
    /**
     * @return Folder parent identifier on Harness File Store
     * 
     */
    public String parentIdentifier() {
        return this.parentIdentifier;
    }
    /**
     * @return Harness File Store folder path
     * 
     */
    public String path() {
        return this.path;
    }
    /**
     * @return Unique identifier of the project.
     * 
     */
    public Optional<String> projectId() {
        return Optional.ofNullable(this.projectId);
    }
    /**
     * @return Tags to associate with the resource.
     * 
     */
    public List<String> tags() {
        return this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetFileStoreFolderResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<GetFileStoreFolderCreatedBy> createdBies;
        private String description;
        private String id;
        private String identifier;
        private Integer lastModifiedAt;
        private List<GetFileStoreFolderLastModifiedBy> lastModifiedBies;
        private @Nullable String name;
        private @Nullable String orgId;
        private String parentIdentifier;
        private String path;
        private @Nullable String projectId;
        private List<String> tags;
        public Builder() {}
        public Builder(GetFileStoreFolderResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createdBies = defaults.createdBies;
    	      this.description = defaults.description;
    	      this.id = defaults.id;
    	      this.identifier = defaults.identifier;
    	      this.lastModifiedAt = defaults.lastModifiedAt;
    	      this.lastModifiedBies = defaults.lastModifiedBies;
    	      this.name = defaults.name;
    	      this.orgId = defaults.orgId;
    	      this.parentIdentifier = defaults.parentIdentifier;
    	      this.path = defaults.path;
    	      this.projectId = defaults.projectId;
    	      this.tags = defaults.tags;
        }

        @CustomType.Setter
        public Builder createdBies(List<GetFileStoreFolderCreatedBy> createdBies) {
            if (createdBies == null) {
              throw new MissingRequiredPropertyException("GetFileStoreFolderResult", "createdBies");
            }
            this.createdBies = createdBies;
            return this;
        }
        public Builder createdBies(GetFileStoreFolderCreatedBy... createdBies) {
            return createdBies(List.of(createdBies));
        }
        @CustomType.Setter
        public Builder description(String description) {
            if (description == null) {
              throw new MissingRequiredPropertyException("GetFileStoreFolderResult", "description");
            }
            this.description = description;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetFileStoreFolderResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder identifier(String identifier) {
            if (identifier == null) {
              throw new MissingRequiredPropertyException("GetFileStoreFolderResult", "identifier");
            }
            this.identifier = identifier;
            return this;
        }
        @CustomType.Setter
        public Builder lastModifiedAt(Integer lastModifiedAt) {
            if (lastModifiedAt == null) {
              throw new MissingRequiredPropertyException("GetFileStoreFolderResult", "lastModifiedAt");
            }
            this.lastModifiedAt = lastModifiedAt;
            return this;
        }
        @CustomType.Setter
        public Builder lastModifiedBies(List<GetFileStoreFolderLastModifiedBy> lastModifiedBies) {
            if (lastModifiedBies == null) {
              throw new MissingRequiredPropertyException("GetFileStoreFolderResult", "lastModifiedBies");
            }
            this.lastModifiedBies = lastModifiedBies;
            return this;
        }
        public Builder lastModifiedBies(GetFileStoreFolderLastModifiedBy... lastModifiedBies) {
            return lastModifiedBies(List.of(lastModifiedBies));
        }
        @CustomType.Setter
        public Builder name(@Nullable String name) {

            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder orgId(@Nullable String orgId) {

            this.orgId = orgId;
            return this;
        }
        @CustomType.Setter
        public Builder parentIdentifier(String parentIdentifier) {
            if (parentIdentifier == null) {
              throw new MissingRequiredPropertyException("GetFileStoreFolderResult", "parentIdentifier");
            }
            this.parentIdentifier = parentIdentifier;
            return this;
        }
        @CustomType.Setter
        public Builder path(String path) {
            if (path == null) {
              throw new MissingRequiredPropertyException("GetFileStoreFolderResult", "path");
            }
            this.path = path;
            return this;
        }
        @CustomType.Setter
        public Builder projectId(@Nullable String projectId) {

            this.projectId = projectId;
            return this;
        }
        @CustomType.Setter
        public Builder tags(List<String> tags) {
            if (tags == null) {
              throw new MissingRequiredPropertyException("GetFileStoreFolderResult", "tags");
            }
            this.tags = tags;
            return this;
        }
        public Builder tags(String... tags) {
            return tags(List.of(tags));
        }
        public GetFileStoreFolderResult build() {
            final var _resultValue = new GetFileStoreFolderResult();
            _resultValue.createdBies = createdBies;
            _resultValue.description = description;
            _resultValue.id = id;
            _resultValue.identifier = identifier;
            _resultValue.lastModifiedAt = lastModifiedAt;
            _resultValue.lastModifiedBies = lastModifiedBies;
            _resultValue.name = name;
            _resultValue.orgId = orgId;
            _resultValue.parentIdentifier = parentIdentifier;
            _resultValue.path = path;
            _resultValue.projectId = projectId;
            _resultValue.tags = tags;
            return _resultValue;
        }
    }
}
