// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.harness.platform.inputs.GetGitopsApplicationsApplicationMetadataOwnerReference;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetGitopsApplicationsApplicationMetadata extends com.pulumi.resources.InvokeArgs {

    public static final GetGitopsApplicationsApplicationMetadata Empty = new GetGitopsApplicationsApplicationMetadata();

    /**
     * Annotations are unstructured key value pairs corresponding to a resource. External tools set these to store and retrieve arbitrary metadata.
     * 
     */
    @Import(name="annotations", required=true)
    private Map<String,String> annotations;

    /**
     * @return Annotations are unstructured key value pairs corresponding to a resource. External tools set these to store and retrieve arbitrary metadata.
     * 
     */
    public Map<String,String> annotations() {
        return this.annotations;
    }

    /**
     * Name of the cluster corresponding to the object. API server ignores this if set in any create or update request.
     * 
     */
    @Import(name="clusterName")
    private @Nullable String clusterName;

    /**
     * @return Name of the cluster corresponding to the object. API server ignores this if set in any create or update request.
     * 
     */
    public Optional<String> clusterName() {
        return Optional.ofNullable(this.clusterName);
    }

    /**
     * Before the object is removed from the register, it must be empty. Each element serves as a unique identifier for the component that is accountable for removing that entry from the list. Entries in this list can only be removed if the object&#39;s deletionTimestamp is not null. The processing and removal of finalizers can happen in any sequence. No order is enforced as it may block the finalizers. Finalizers is a shared field that can be reordered by any actor with authority. If the finalizer list is processed in order, this could result in a scenario where the component in charge of the list&#39;s first finalizer is waiting for a signal (generated by a field value, an external system, or another) produced by a component in charge of the list&#39;s later finalizer.
     * 
     */
    @Import(name="finalizers", required=true)
    private List<String> finalizers;

    /**
     * @return Before the object is removed from the register, it must be empty. Each element serves as a unique identifier for the component that is accountable for removing that entry from the list. Entries in this list can only be removed if the object&#39;s deletionTimestamp is not null. The processing and removal of finalizers can happen in any sequence. No order is enforced as it may block the finalizers. Finalizers is a shared field that can be reordered by any actor with authority. If the finalizer list is processed in order, this could result in a scenario where the component in charge of the list&#39;s first finalizer is waiting for a signal (generated by a field value, an external system, or another) produced by a component in charge of the list&#39;s later finalizer.
     * 
     */
    public List<String> finalizers() {
        return this.finalizers;
    }

    /**
     * An optional prefix that the server will only apply if the Name field is empty to create a unique name. The name returned to the client will differ from the name passed if this field is used. A unique suffix will be added to this value as well. The supplied value must adhere to the same validation guidelines as the Name field and may be reduced by the suffix length necessary to ensure that it is unique on the server. The server will NOT return a 409 if this field is supplied and the created name already exists; instead, it will either return 201 Created or 500 with Reason ServerTimeout, indicating that a unique name could not be found in the allotted time and the client should try again later.
     * 
     */
    @Import(name="generateName")
    private @Nullable String generateName;

    /**
     * @return An optional prefix that the server will only apply if the Name field is empty to create a unique name. The name returned to the client will differ from the name passed if this field is used. A unique suffix will be added to this value as well. The supplied value must adhere to the same validation guidelines as the Name field and may be reduced by the suffix length necessary to ensure that it is unique on the server. The server will NOT return a 409 if this field is supplied and the created name already exists; instead, it will either return 201 Created or 500 with Reason ServerTimeout, indicating that a unique name could not be found in the allotted time and the client should try again later.
     * 
     */
    public Optional<String> generateName() {
        return Optional.ofNullable(this.generateName);
    }

    /**
     * A sequence number representing a specific generation of the desired state. This is a read-only value populated by the system.
     * 
     */
    @Import(name="generation", required=true)
    private String generation;

    /**
     * @return A sequence number representing a specific generation of the desired state. This is a read-only value populated by the system.
     * 
     */
    public String generation() {
        return this.generation;
    }

    /**
     * Map of string keys and values that can be used to organize and categorize (scope and select) objects. May match selectors of replication controllers and services.
     * 
     */
    @Import(name="labels", required=true)
    private Map<String,String> labels;

    /**
     * @return Map of string keys and values that can be used to organize and categorize (scope and select) objects. May match selectors of replication controllers and services.
     * 
     */
    public Map<String,String> labels() {
        return this.labels;
    }

    /**
     * Name must be unique within a namespace. Is required when creating resources, although some resources may allow a client to request the generation of an appropriate name automatically. Name is primarily intended for creation idempotence and configuration definition. Name cannot be updated.
     * 
     */
    @Import(name="name")
    private @Nullable String name;

    /**
     * @return Name must be unique within a namespace. Is required when creating resources, although some resources may allow a client to request the generation of an appropriate name automatically. Name is primarily intended for creation idempotence and configuration definition. Name cannot be updated.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Namespace of the GitOps application. An empty namespace is equivalent to the &#34;default&#34; namespace.
     * 
     */
    @Import(name="namespace", required=true)
    private String namespace;

    /**
     * @return Namespace of the GitOps application. An empty namespace is equivalent to the &#34;default&#34; namespace.
     * 
     */
    public String namespace() {
        return this.namespace;
    }

    /**
     * List of objects depended by this object. If ALL objects in the list have been deleted, this object will be garbage collected. If this object is managed by a controller, then an entry in this list will point to this controller, with the controller field set to true. There cannot be more than one managing controller.
     * 
     */
    @Import(name="ownerReferences")
    private @Nullable List<GetGitopsApplicationsApplicationMetadataOwnerReference> ownerReferences;

    /**
     * @return List of objects depended by this object. If ALL objects in the list have been deleted, this object will be garbage collected. If this object is managed by a controller, then an entry in this list will point to this controller, with the controller field set to true. There cannot be more than one managing controller.
     * 
     */
    public Optional<List<GetGitopsApplicationsApplicationMetadataOwnerReference>> ownerReferences() {
        return Optional.ofNullable(this.ownerReferences);
    }

    /**
     * UID is the unique in time and space value for this object. It is typically generated by the server on successful creation of a resource and is not allowed to change on PUT operations.
     * 
     */
    @Import(name="uid", required=true)
    private String uid;

    /**
     * @return UID is the unique in time and space value for this object. It is typically generated by the server on successful creation of a resource and is not allowed to change on PUT operations.
     * 
     */
    public String uid() {
        return this.uid;
    }

    private GetGitopsApplicationsApplicationMetadata() {}

    private GetGitopsApplicationsApplicationMetadata(GetGitopsApplicationsApplicationMetadata $) {
        this.annotations = $.annotations;
        this.clusterName = $.clusterName;
        this.finalizers = $.finalizers;
        this.generateName = $.generateName;
        this.generation = $.generation;
        this.labels = $.labels;
        this.name = $.name;
        this.namespace = $.namespace;
        this.ownerReferences = $.ownerReferences;
        this.uid = $.uid;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetGitopsApplicationsApplicationMetadata defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetGitopsApplicationsApplicationMetadata $;

        public Builder() {
            $ = new GetGitopsApplicationsApplicationMetadata();
        }

        public Builder(GetGitopsApplicationsApplicationMetadata defaults) {
            $ = new GetGitopsApplicationsApplicationMetadata(Objects.requireNonNull(defaults));
        }

        /**
         * @param annotations Annotations are unstructured key value pairs corresponding to a resource. External tools set these to store and retrieve arbitrary metadata.
         * 
         * @return builder
         * 
         */
        public Builder annotations(Map<String,String> annotations) {
            $.annotations = annotations;
            return this;
        }

        /**
         * @param clusterName Name of the cluster corresponding to the object. API server ignores this if set in any create or update request.
         * 
         * @return builder
         * 
         */
        public Builder clusterName(@Nullable String clusterName) {
            $.clusterName = clusterName;
            return this;
        }

        /**
         * @param finalizers Before the object is removed from the register, it must be empty. Each element serves as a unique identifier for the component that is accountable for removing that entry from the list. Entries in this list can only be removed if the object&#39;s deletionTimestamp is not null. The processing and removal of finalizers can happen in any sequence. No order is enforced as it may block the finalizers. Finalizers is a shared field that can be reordered by any actor with authority. If the finalizer list is processed in order, this could result in a scenario where the component in charge of the list&#39;s first finalizer is waiting for a signal (generated by a field value, an external system, or another) produced by a component in charge of the list&#39;s later finalizer.
         * 
         * @return builder
         * 
         */
        public Builder finalizers(List<String> finalizers) {
            $.finalizers = finalizers;
            return this;
        }

        /**
         * @param finalizers Before the object is removed from the register, it must be empty. Each element serves as a unique identifier for the component that is accountable for removing that entry from the list. Entries in this list can only be removed if the object&#39;s deletionTimestamp is not null. The processing and removal of finalizers can happen in any sequence. No order is enforced as it may block the finalizers. Finalizers is a shared field that can be reordered by any actor with authority. If the finalizer list is processed in order, this could result in a scenario where the component in charge of the list&#39;s first finalizer is waiting for a signal (generated by a field value, an external system, or another) produced by a component in charge of the list&#39;s later finalizer.
         * 
         * @return builder
         * 
         */
        public Builder finalizers(String... finalizers) {
            return finalizers(List.of(finalizers));
        }

        /**
         * @param generateName An optional prefix that the server will only apply if the Name field is empty to create a unique name. The name returned to the client will differ from the name passed if this field is used. A unique suffix will be added to this value as well. The supplied value must adhere to the same validation guidelines as the Name field and may be reduced by the suffix length necessary to ensure that it is unique on the server. The server will NOT return a 409 if this field is supplied and the created name already exists; instead, it will either return 201 Created or 500 with Reason ServerTimeout, indicating that a unique name could not be found in the allotted time and the client should try again later.
         * 
         * @return builder
         * 
         */
        public Builder generateName(@Nullable String generateName) {
            $.generateName = generateName;
            return this;
        }

        /**
         * @param generation A sequence number representing a specific generation of the desired state. This is a read-only value populated by the system.
         * 
         * @return builder
         * 
         */
        public Builder generation(String generation) {
            $.generation = generation;
            return this;
        }

        /**
         * @param labels Map of string keys and values that can be used to organize and categorize (scope and select) objects. May match selectors of replication controllers and services.
         * 
         * @return builder
         * 
         */
        public Builder labels(Map<String,String> labels) {
            $.labels = labels;
            return this;
        }

        /**
         * @param name Name must be unique within a namespace. Is required when creating resources, although some resources may allow a client to request the generation of an appropriate name automatically. Name is primarily intended for creation idempotence and configuration definition. Name cannot be updated.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable String name) {
            $.name = name;
            return this;
        }

        /**
         * @param namespace Namespace of the GitOps application. An empty namespace is equivalent to the &#34;default&#34; namespace.
         * 
         * @return builder
         * 
         */
        public Builder namespace(String namespace) {
            $.namespace = namespace;
            return this;
        }

        /**
         * @param ownerReferences List of objects depended by this object. If ALL objects in the list have been deleted, this object will be garbage collected. If this object is managed by a controller, then an entry in this list will point to this controller, with the controller field set to true. There cannot be more than one managing controller.
         * 
         * @return builder
         * 
         */
        public Builder ownerReferences(@Nullable List<GetGitopsApplicationsApplicationMetadataOwnerReference> ownerReferences) {
            $.ownerReferences = ownerReferences;
            return this;
        }

        /**
         * @param ownerReferences List of objects depended by this object. If ALL objects in the list have been deleted, this object will be garbage collected. If this object is managed by a controller, then an entry in this list will point to this controller, with the controller field set to true. There cannot be more than one managing controller.
         * 
         * @return builder
         * 
         */
        public Builder ownerReferences(GetGitopsApplicationsApplicationMetadataOwnerReference... ownerReferences) {
            return ownerReferences(List.of(ownerReferences));
        }

        /**
         * @param uid UID is the unique in time and space value for this object. It is typically generated by the server on successful creation of a resource and is not allowed to change on PUT operations.
         * 
         * @return builder
         * 
         */
        public Builder uid(String uid) {
            $.uid = uid;
            return this;
        }

        public GetGitopsApplicationsApplicationMetadata build() {
            if ($.annotations == null) {
                throw new MissingRequiredPropertyException("GetGitopsApplicationsApplicationMetadata", "annotations");
            }
            if ($.finalizers == null) {
                throw new MissingRequiredPropertyException("GetGitopsApplicationsApplicationMetadata", "finalizers");
            }
            if ($.generation == null) {
                throw new MissingRequiredPropertyException("GetGitopsApplicationsApplicationMetadata", "generation");
            }
            if ($.labels == null) {
                throw new MissingRequiredPropertyException("GetGitopsApplicationsApplicationMetadata", "labels");
            }
            if ($.namespace == null) {
                throw new MissingRequiredPropertyException("GetGitopsApplicationsApplicationMetadata", "namespace");
            }
            if ($.uid == null) {
                throw new MissingRequiredPropertyException("GetGitopsApplicationsApplicationMetadata", "uid");
            }
            return $;
        }
    }

}
