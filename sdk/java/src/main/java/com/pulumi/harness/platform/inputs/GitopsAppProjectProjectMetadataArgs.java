// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.harness.platform.inputs.GitopsAppProjectProjectMetadataManagedFieldArgs;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GitopsAppProjectProjectMetadataArgs extends com.pulumi.resources.ResourceArgs {

    public static final GitopsAppProjectProjectMetadataArgs Empty = new GitopsAppProjectProjectMetadataArgs();

    /**
     * Annotations associated with the GitOps project.
     * 
     */
    @Import(name="annotations")
    private @Nullable Output<Map<String,String>> annotations;

    /**
     * @return Annotations associated with the GitOps project.
     * 
     */
    public Optional<Output<Map<String,String>>> annotations() {
        return Optional.ofNullable(this.annotations);
    }

    /**
     * Name of the cluster associated with the GitOps project.
     * 
     */
    @Import(name="clusterName")
    private @Nullable Output<String> clusterName;

    /**
     * @return Name of the cluster associated with the GitOps project.
     * 
     */
    public Optional<Output<String>> clusterName() {
        return Optional.ofNullable(this.clusterName);
    }

    /**
     * Finalizers associated with the GitOps project.
     * 
     */
    @Import(name="finalizers")
    private @Nullable Output<List<String>> finalizers;

    /**
     * @return Finalizers associated with the GitOps project.
     * 
     */
    public Optional<Output<List<String>>> finalizers() {
        return Optional.ofNullable(this.finalizers);
    }

    /**
     * Labels associated with the GitOps project.
     * 
     */
    @Import(name="labels")
    private @Nullable Output<Map<String,String>> labels;

    /**
     * @return Labels associated with the GitOps project.
     * 
     */
    public Optional<Output<Map<String,String>>> labels() {
        return Optional.ofNullable(this.labels);
    }

    /**
     * Managed fields associated with the GitOps project.
     * 
     */
    @Import(name="managedFields")
    private @Nullable Output<List<GitopsAppProjectProjectMetadataManagedFieldArgs>> managedFields;

    /**
     * @return Managed fields associated with the GitOps project.
     * 
     */
    public Optional<Output<List<GitopsAppProjectProjectMetadataManagedFieldArgs>>> managedFields() {
        return Optional.ofNullable(this.managedFields);
    }

    /**
     * Name of the GitOps project.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Name of the GitOps project.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Namespace of the GitOps project. This must be the same as the namespace where the agent is installed
     * 
     */
    @Import(name="namespace")
    private @Nullable Output<String> namespace;

    /**
     * @return Namespace of the GitOps project. This must be the same as the namespace where the agent is installed
     * 
     */
    public Optional<Output<String>> namespace() {
        return Optional.ofNullable(this.namespace);
    }

    /**
     * Resource Version for the GitOps project
     * 
     */
    @Import(name="resourceVersion")
    private @Nullable Output<String> resourceVersion;

    /**
     * @return Resource Version for the GitOps project
     * 
     */
    public Optional<Output<String>> resourceVersion() {
        return Optional.ofNullable(this.resourceVersion);
    }

    private GitopsAppProjectProjectMetadataArgs() {}

    private GitopsAppProjectProjectMetadataArgs(GitopsAppProjectProjectMetadataArgs $) {
        this.annotations = $.annotations;
        this.clusterName = $.clusterName;
        this.finalizers = $.finalizers;
        this.labels = $.labels;
        this.managedFields = $.managedFields;
        this.name = $.name;
        this.namespace = $.namespace;
        this.resourceVersion = $.resourceVersion;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GitopsAppProjectProjectMetadataArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GitopsAppProjectProjectMetadataArgs $;

        public Builder() {
            $ = new GitopsAppProjectProjectMetadataArgs();
        }

        public Builder(GitopsAppProjectProjectMetadataArgs defaults) {
            $ = new GitopsAppProjectProjectMetadataArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param annotations Annotations associated with the GitOps project.
         * 
         * @return builder
         * 
         */
        public Builder annotations(@Nullable Output<Map<String,String>> annotations) {
            $.annotations = annotations;
            return this;
        }

        /**
         * @param annotations Annotations associated with the GitOps project.
         * 
         * @return builder
         * 
         */
        public Builder annotations(Map<String,String> annotations) {
            return annotations(Output.of(annotations));
        }

        /**
         * @param clusterName Name of the cluster associated with the GitOps project.
         * 
         * @return builder
         * 
         */
        public Builder clusterName(@Nullable Output<String> clusterName) {
            $.clusterName = clusterName;
            return this;
        }

        /**
         * @param clusterName Name of the cluster associated with the GitOps project.
         * 
         * @return builder
         * 
         */
        public Builder clusterName(String clusterName) {
            return clusterName(Output.of(clusterName));
        }

        /**
         * @param finalizers Finalizers associated with the GitOps project.
         * 
         * @return builder
         * 
         */
        public Builder finalizers(@Nullable Output<List<String>> finalizers) {
            $.finalizers = finalizers;
            return this;
        }

        /**
         * @param finalizers Finalizers associated with the GitOps project.
         * 
         * @return builder
         * 
         */
        public Builder finalizers(List<String> finalizers) {
            return finalizers(Output.of(finalizers));
        }

        /**
         * @param finalizers Finalizers associated with the GitOps project.
         * 
         * @return builder
         * 
         */
        public Builder finalizers(String... finalizers) {
            return finalizers(List.of(finalizers));
        }

        /**
         * @param labels Labels associated with the GitOps project.
         * 
         * @return builder
         * 
         */
        public Builder labels(@Nullable Output<Map<String,String>> labels) {
            $.labels = labels;
            return this;
        }

        /**
         * @param labels Labels associated with the GitOps project.
         * 
         * @return builder
         * 
         */
        public Builder labels(Map<String,String> labels) {
            return labels(Output.of(labels));
        }

        /**
         * @param managedFields Managed fields associated with the GitOps project.
         * 
         * @return builder
         * 
         */
        public Builder managedFields(@Nullable Output<List<GitopsAppProjectProjectMetadataManagedFieldArgs>> managedFields) {
            $.managedFields = managedFields;
            return this;
        }

        /**
         * @param managedFields Managed fields associated with the GitOps project.
         * 
         * @return builder
         * 
         */
        public Builder managedFields(List<GitopsAppProjectProjectMetadataManagedFieldArgs> managedFields) {
            return managedFields(Output.of(managedFields));
        }

        /**
         * @param managedFields Managed fields associated with the GitOps project.
         * 
         * @return builder
         * 
         */
        public Builder managedFields(GitopsAppProjectProjectMetadataManagedFieldArgs... managedFields) {
            return managedFields(List.of(managedFields));
        }

        /**
         * @param name Name of the GitOps project.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of the GitOps project.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param namespace Namespace of the GitOps project. This must be the same as the namespace where the agent is installed
         * 
         * @return builder
         * 
         */
        public Builder namespace(@Nullable Output<String> namespace) {
            $.namespace = namespace;
            return this;
        }

        /**
         * @param namespace Namespace of the GitOps project. This must be the same as the namespace where the agent is installed
         * 
         * @return builder
         * 
         */
        public Builder namespace(String namespace) {
            return namespace(Output.of(namespace));
        }

        /**
         * @param resourceVersion Resource Version for the GitOps project
         * 
         * @return builder
         * 
         */
        public Builder resourceVersion(@Nullable Output<String> resourceVersion) {
            $.resourceVersion = resourceVersion;
            return this;
        }

        /**
         * @param resourceVersion Resource Version for the GitOps project
         * 
         * @return builder
         * 
         */
        public Builder resourceVersion(String resourceVersion) {
            return resourceVersion(Output.of(resourceVersion));
        }

        public GitopsAppProjectProjectMetadataArgs build() {
            return $;
        }
    }

}
