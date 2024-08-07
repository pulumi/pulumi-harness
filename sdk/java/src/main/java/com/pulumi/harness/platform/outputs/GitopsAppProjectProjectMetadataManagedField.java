// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GitopsAppProjectProjectMetadataManagedField {
    /**
     * @return API version of the operation performed.
     * 
     */
    private @Nullable String apiVersion;
    /**
     * @return Type of the fields in the GitOps project.
     * 
     */
    private @Nullable String fieldsType;
    /**
     * @return Raw fields associated with the GitOps project.
     * 
     */
    private @Nullable Map<String,String> fieldsV1;
    /**
     * @return Manager responsible for the operation.
     * 
     */
    private @Nullable String manager;
    /**
     * @return Operation type performed on the GitOps project.
     * 
     */
    private @Nullable String operation;
    /**
     * @return Subresource associated with the GitOps project.
     * 
     */
    private @Nullable String subresource;
    /**
     * @return Timestamp of the operation.
     * 
     */
    private @Nullable Map<String,String> time;

    private GitopsAppProjectProjectMetadataManagedField() {}
    /**
     * @return API version of the operation performed.
     * 
     */
    public Optional<String> apiVersion() {
        return Optional.ofNullable(this.apiVersion);
    }
    /**
     * @return Type of the fields in the GitOps project.
     * 
     */
    public Optional<String> fieldsType() {
        return Optional.ofNullable(this.fieldsType);
    }
    /**
     * @return Raw fields associated with the GitOps project.
     * 
     */
    public Map<String,String> fieldsV1() {
        return this.fieldsV1 == null ? Map.of() : this.fieldsV1;
    }
    /**
     * @return Manager responsible for the operation.
     * 
     */
    public Optional<String> manager() {
        return Optional.ofNullable(this.manager);
    }
    /**
     * @return Operation type performed on the GitOps project.
     * 
     */
    public Optional<String> operation() {
        return Optional.ofNullable(this.operation);
    }
    /**
     * @return Subresource associated with the GitOps project.
     * 
     */
    public Optional<String> subresource() {
        return Optional.ofNullable(this.subresource);
    }
    /**
     * @return Timestamp of the operation.
     * 
     */
    public Map<String,String> time() {
        return this.time == null ? Map.of() : this.time;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GitopsAppProjectProjectMetadataManagedField defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String apiVersion;
        private @Nullable String fieldsType;
        private @Nullable Map<String,String> fieldsV1;
        private @Nullable String manager;
        private @Nullable String operation;
        private @Nullable String subresource;
        private @Nullable Map<String,String> time;
        public Builder() {}
        public Builder(GitopsAppProjectProjectMetadataManagedField defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiVersion = defaults.apiVersion;
    	      this.fieldsType = defaults.fieldsType;
    	      this.fieldsV1 = defaults.fieldsV1;
    	      this.manager = defaults.manager;
    	      this.operation = defaults.operation;
    	      this.subresource = defaults.subresource;
    	      this.time = defaults.time;
        }

        @CustomType.Setter
        public Builder apiVersion(@Nullable String apiVersion) {

            this.apiVersion = apiVersion;
            return this;
        }
        @CustomType.Setter
        public Builder fieldsType(@Nullable String fieldsType) {

            this.fieldsType = fieldsType;
            return this;
        }
        @CustomType.Setter
        public Builder fieldsV1(@Nullable Map<String,String> fieldsV1) {

            this.fieldsV1 = fieldsV1;
            return this;
        }
        @CustomType.Setter
        public Builder manager(@Nullable String manager) {

            this.manager = manager;
            return this;
        }
        @CustomType.Setter
        public Builder operation(@Nullable String operation) {

            this.operation = operation;
            return this;
        }
        @CustomType.Setter
        public Builder subresource(@Nullable String subresource) {

            this.subresource = subresource;
            return this;
        }
        @CustomType.Setter
        public Builder time(@Nullable Map<String,String> time) {

            this.time = time;
            return this;
        }
        public GitopsAppProjectProjectMetadataManagedField build() {
            final var _resultValue = new GitopsAppProjectProjectMetadataManagedField();
            _resultValue.apiVersion = apiVersion;
            _resultValue.fieldsType = fieldsType;
            _resultValue.fieldsV1 = fieldsV1;
            _resultValue.manager = manager;
            _resultValue.operation = operation;
            _resultValue.subresource = subresource;
            _resultValue.time = time;
            return _resultValue;
        }
    }
}
