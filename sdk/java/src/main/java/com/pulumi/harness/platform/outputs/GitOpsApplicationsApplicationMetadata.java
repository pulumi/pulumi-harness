// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.harness.platform.outputs.GitOpsApplicationsApplicationMetadataOwnerReference;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GitOpsApplicationsApplicationMetadata {
    /**
     * @return Annotations are unstructured key value pairs corresponding to a resource. External tools set these to store and retrieve arbitrary metadata.
     * 
     */
    private @Nullable Map<String,String> annotations;
    /**
     * @return Name of the cluster corresponding to the object. API server ignores this if set in any create or update request.
     * 
     */
    private @Nullable String clusterName;
    /**
     * @return Before the object is removed from the register, it must be empty. Each element serves as a unique identifier for the component that is accountable for removing that entry from the list. Entries in this list can only be removed if the object&#39;s deletionTimestamp is not null. The processing and removal of finalizers can happen in any sequence. No order is enforced as it may block the finalizers. Finalizers is a shared field that can be reordered by any actor with authority. If the finalizer list is processed in order, this could result in a scenario where the component in charge of the list&#39;s first finalizer is waiting for a signal (generated by a field value, an external system, or another) produced by a component in charge of the list&#39;s later finalizer.
     * 
     */
    private @Nullable List<String> finalizers;
    /**
     * @return An optional prefix that the server will only apply if the Name field is empty to create a unique name. The name returned to the client will differ from the name passed if this field is used. A unique suffix will be added to this value as well. The supplied value must adhere to the same validation guidelines as the Name field and may be reduced by the suffix length necessary to ensure that it is unique on the server. The server will NOT return a 409 if this field is supplied and the created name already exists; instead, it will either return 201 Created or 500 with Reason ServerTimeout, indicating that a unique name could not be found in the allotted time and the client should try again later.
     * 
     */
    private @Nullable String generateName;
    /**
     * @return A sequence number representing a specific generation of the desired state. This is a read-only value populated by the system.
     * 
     */
    private @Nullable String generation;
    /**
     * @return Map of string keys and values that can be used to organize and categorize (scope and select) objects. May match selectors of replication controllers and services.
     * 
     */
    private @Nullable Map<String,String> labels;
    /**
     * @return Name must be unique within a namespace. It is required when creating resources, although some resources may allow a client to request the generation of an appropriate name automatically. Name is primarily intended for creation idempotence and configuration definition. Name cannot be updated.
     * 
     */
    private @Nullable String name;
    /**
     * @return Namespace of the GitOps application. An empty namespace is equivalent to the namespace of the GitOps agent.
     * 
     */
    private @Nullable String namespace;
    /**
     * @return List of objects depended by this object. If ALL objects in the list have been deleted, this object will be garbage collected. If this object is managed by a controller, then an entry in this list will point to this controller, with the controller field set to true. There cannot be more than one managing controller.
     * 
     */
    private @Nullable List<GitOpsApplicationsApplicationMetadataOwnerReference> ownerReferences;
    /**
     * @return UID is the unique identifier in time and space value for this object. It is generated by the server on successful creation of a resource and is not allowed to change on PUT operations.
     * 
     */
    private @Nullable String uid;

    private GitOpsApplicationsApplicationMetadata() {}
    /**
     * @return Annotations are unstructured key value pairs corresponding to a resource. External tools set these to store and retrieve arbitrary metadata.
     * 
     */
    public Map<String,String> annotations() {
        return this.annotations == null ? Map.of() : this.annotations;
    }
    /**
     * @return Name of the cluster corresponding to the object. API server ignores this if set in any create or update request.
     * 
     */
    public Optional<String> clusterName() {
        return Optional.ofNullable(this.clusterName);
    }
    /**
     * @return Before the object is removed from the register, it must be empty. Each element serves as a unique identifier for the component that is accountable for removing that entry from the list. Entries in this list can only be removed if the object&#39;s deletionTimestamp is not null. The processing and removal of finalizers can happen in any sequence. No order is enforced as it may block the finalizers. Finalizers is a shared field that can be reordered by any actor with authority. If the finalizer list is processed in order, this could result in a scenario where the component in charge of the list&#39;s first finalizer is waiting for a signal (generated by a field value, an external system, or another) produced by a component in charge of the list&#39;s later finalizer.
     * 
     */
    public List<String> finalizers() {
        return this.finalizers == null ? List.of() : this.finalizers;
    }
    /**
     * @return An optional prefix that the server will only apply if the Name field is empty to create a unique name. The name returned to the client will differ from the name passed if this field is used. A unique suffix will be added to this value as well. The supplied value must adhere to the same validation guidelines as the Name field and may be reduced by the suffix length necessary to ensure that it is unique on the server. The server will NOT return a 409 if this field is supplied and the created name already exists; instead, it will either return 201 Created or 500 with Reason ServerTimeout, indicating that a unique name could not be found in the allotted time and the client should try again later.
     * 
     */
    public Optional<String> generateName() {
        return Optional.ofNullable(this.generateName);
    }
    /**
     * @return A sequence number representing a specific generation of the desired state. This is a read-only value populated by the system.
     * 
     */
    public Optional<String> generation() {
        return Optional.ofNullable(this.generation);
    }
    /**
     * @return Map of string keys and values that can be used to organize and categorize (scope and select) objects. May match selectors of replication controllers and services.
     * 
     */
    public Map<String,String> labels() {
        return this.labels == null ? Map.of() : this.labels;
    }
    /**
     * @return Name must be unique within a namespace. It is required when creating resources, although some resources may allow a client to request the generation of an appropriate name automatically. Name is primarily intended for creation idempotence and configuration definition. Name cannot be updated.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    /**
     * @return Namespace of the GitOps application. An empty namespace is equivalent to the namespace of the GitOps agent.
     * 
     */
    public Optional<String> namespace() {
        return Optional.ofNullable(this.namespace);
    }
    /**
     * @return List of objects depended by this object. If ALL objects in the list have been deleted, this object will be garbage collected. If this object is managed by a controller, then an entry in this list will point to this controller, with the controller field set to true. There cannot be more than one managing controller.
     * 
     */
    public List<GitOpsApplicationsApplicationMetadataOwnerReference> ownerReferences() {
        return this.ownerReferences == null ? List.of() : this.ownerReferences;
    }
    /**
     * @return UID is the unique identifier in time and space value for this object. It is generated by the server on successful creation of a resource and is not allowed to change on PUT operations.
     * 
     */
    public Optional<String> uid() {
        return Optional.ofNullable(this.uid);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GitOpsApplicationsApplicationMetadata defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Map<String,String> annotations;
        private @Nullable String clusterName;
        private @Nullable List<String> finalizers;
        private @Nullable String generateName;
        private @Nullable String generation;
        private @Nullable Map<String,String> labels;
        private @Nullable String name;
        private @Nullable String namespace;
        private @Nullable List<GitOpsApplicationsApplicationMetadataOwnerReference> ownerReferences;
        private @Nullable String uid;
        public Builder() {}
        public Builder(GitOpsApplicationsApplicationMetadata defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.annotations = defaults.annotations;
    	      this.clusterName = defaults.clusterName;
    	      this.finalizers = defaults.finalizers;
    	      this.generateName = defaults.generateName;
    	      this.generation = defaults.generation;
    	      this.labels = defaults.labels;
    	      this.name = defaults.name;
    	      this.namespace = defaults.namespace;
    	      this.ownerReferences = defaults.ownerReferences;
    	      this.uid = defaults.uid;
        }

        @CustomType.Setter
        public Builder annotations(@Nullable Map<String,String> annotations) {

            this.annotations = annotations;
            return this;
        }
        @CustomType.Setter
        public Builder clusterName(@Nullable String clusterName) {

            this.clusterName = clusterName;
            return this;
        }
        @CustomType.Setter
        public Builder finalizers(@Nullable List<String> finalizers) {

            this.finalizers = finalizers;
            return this;
        }
        public Builder finalizers(String... finalizers) {
            return finalizers(List.of(finalizers));
        }
        @CustomType.Setter
        public Builder generateName(@Nullable String generateName) {

            this.generateName = generateName;
            return this;
        }
        @CustomType.Setter
        public Builder generation(@Nullable String generation) {

            this.generation = generation;
            return this;
        }
        @CustomType.Setter
        public Builder labels(@Nullable Map<String,String> labels) {

            this.labels = labels;
            return this;
        }
        @CustomType.Setter
        public Builder name(@Nullable String name) {

            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder namespace(@Nullable String namespace) {

            this.namespace = namespace;
            return this;
        }
        @CustomType.Setter
        public Builder ownerReferences(@Nullable List<GitOpsApplicationsApplicationMetadataOwnerReference> ownerReferences) {

            this.ownerReferences = ownerReferences;
            return this;
        }
        public Builder ownerReferences(GitOpsApplicationsApplicationMetadataOwnerReference... ownerReferences) {
            return ownerReferences(List.of(ownerReferences));
        }
        @CustomType.Setter
        public Builder uid(@Nullable String uid) {

            this.uid = uid;
            return this;
        }
        public GitOpsApplicationsApplicationMetadata build() {
            final var _resultValue = new GitOpsApplicationsApplicationMetadata();
            _resultValue.annotations = annotations;
            _resultValue.clusterName = clusterName;
            _resultValue.finalizers = finalizers;
            _resultValue.generateName = generateName;
            _resultValue.generation = generation;
            _resultValue.labels = labels;
            _resultValue.name = name;
            _resultValue.namespace = namespace;
            _resultValue.ownerReferences = ownerReferences;
            _resultValue.uid = uid;
            return _resultValue;
        }
    }
}
