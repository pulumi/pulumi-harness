// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GitOpsApplicationsApplicationSpecSourceKustomizeArgs extends com.pulumi.resources.ResourceArgs {

    public static final GitOpsApplicationsApplicationSpecSourceKustomizeArgs Empty = new GitOpsApplicationsApplicationSpecSourceKustomizeArgs();

    /**
     * List of additional annotations to add to rendered manifests.
     * 
     */
    @Import(name="commonAnnotations")
    private @Nullable Output<Map<String,String>> commonAnnotations;

    /**
     * @return List of additional annotations to add to rendered manifests.
     * 
     */
    public Optional<Output<Map<String,String>>> commonAnnotations() {
        return Optional.ofNullable(this.commonAnnotations);
    }

    /**
     * List of additional labels to add to rendered manifests.
     * 
     */
    @Import(name="commonLabels")
    private @Nullable Output<Map<String,String>> commonLabels;

    /**
     * @return List of additional labels to add to rendered manifests.
     * 
     */
    public Optional<Output<Map<String,String>>> commonLabels() {
        return Optional.ofNullable(this.commonLabels);
    }

    /**
     * Indicates if to force applying common annotations to resources for kustomize apps.
     * 
     */
    @Import(name="forceCommonAnnotations")
    private @Nullable Output<Boolean> forceCommonAnnotations;

    /**
     * @return Indicates if to force applying common annotations to resources for kustomize apps.
     * 
     */
    public Optional<Output<Boolean>> forceCommonAnnotations() {
        return Optional.ofNullable(this.forceCommonAnnotations);
    }

    /**
     * Indicates if to force apply common labels to resources for kustomize apps.
     * 
     */
    @Import(name="forceCommonLabels")
    private @Nullable Output<Boolean> forceCommonLabels;

    /**
     * @return Indicates if to force apply common labels to resources for kustomize apps.
     * 
     */
    public Optional<Output<Boolean>> forceCommonLabels() {
        return Optional.ofNullable(this.forceCommonLabels);
    }

    /**
     * List of kustomize image override specifications.
     * 
     */
    @Import(name="images")
    private @Nullable Output<List<String>> images;

    /**
     * @return List of kustomize image override specifications.
     * 
     */
    public Optional<Output<List<String>>> images() {
        return Optional.ofNullable(this.images);
    }

    /**
     * Prefix prepended to resources for kustomize apps.
     * 
     */
    @Import(name="namePrefix")
    private @Nullable Output<String> namePrefix;

    /**
     * @return Prefix prepended to resources for kustomize apps.
     * 
     */
    public Optional<Output<String>> namePrefix() {
        return Optional.ofNullable(this.namePrefix);
    }

    /**
     * Suffix appended to resources for kustomize apps.
     * 
     */
    @Import(name="nameSuffix")
    private @Nullable Output<String> nameSuffix;

    /**
     * @return Suffix appended to resources for kustomize apps.
     * 
     */
    public Optional<Output<String>> nameSuffix() {
        return Optional.ofNullable(this.nameSuffix);
    }

    /**
     * Version of kustomize to use for rendering manifests.
     * 
     */
    @Import(name="version")
    private @Nullable Output<String> version;

    /**
     * @return Version of kustomize to use for rendering manifests.
     * 
     */
    public Optional<Output<String>> version() {
        return Optional.ofNullable(this.version);
    }

    private GitOpsApplicationsApplicationSpecSourceKustomizeArgs() {}

    private GitOpsApplicationsApplicationSpecSourceKustomizeArgs(GitOpsApplicationsApplicationSpecSourceKustomizeArgs $) {
        this.commonAnnotations = $.commonAnnotations;
        this.commonLabels = $.commonLabels;
        this.forceCommonAnnotations = $.forceCommonAnnotations;
        this.forceCommonLabels = $.forceCommonLabels;
        this.images = $.images;
        this.namePrefix = $.namePrefix;
        this.nameSuffix = $.nameSuffix;
        this.version = $.version;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GitOpsApplicationsApplicationSpecSourceKustomizeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GitOpsApplicationsApplicationSpecSourceKustomizeArgs $;

        public Builder() {
            $ = new GitOpsApplicationsApplicationSpecSourceKustomizeArgs();
        }

        public Builder(GitOpsApplicationsApplicationSpecSourceKustomizeArgs defaults) {
            $ = new GitOpsApplicationsApplicationSpecSourceKustomizeArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param commonAnnotations List of additional annotations to add to rendered manifests.
         * 
         * @return builder
         * 
         */
        public Builder commonAnnotations(@Nullable Output<Map<String,String>> commonAnnotations) {
            $.commonAnnotations = commonAnnotations;
            return this;
        }

        /**
         * @param commonAnnotations List of additional annotations to add to rendered manifests.
         * 
         * @return builder
         * 
         */
        public Builder commonAnnotations(Map<String,String> commonAnnotations) {
            return commonAnnotations(Output.of(commonAnnotations));
        }

        /**
         * @param commonLabels List of additional labels to add to rendered manifests.
         * 
         * @return builder
         * 
         */
        public Builder commonLabels(@Nullable Output<Map<String,String>> commonLabels) {
            $.commonLabels = commonLabels;
            return this;
        }

        /**
         * @param commonLabels List of additional labels to add to rendered manifests.
         * 
         * @return builder
         * 
         */
        public Builder commonLabels(Map<String,String> commonLabels) {
            return commonLabels(Output.of(commonLabels));
        }

        /**
         * @param forceCommonAnnotations Indicates if to force applying common annotations to resources for kustomize apps.
         * 
         * @return builder
         * 
         */
        public Builder forceCommonAnnotations(@Nullable Output<Boolean> forceCommonAnnotations) {
            $.forceCommonAnnotations = forceCommonAnnotations;
            return this;
        }

        /**
         * @param forceCommonAnnotations Indicates if to force applying common annotations to resources for kustomize apps.
         * 
         * @return builder
         * 
         */
        public Builder forceCommonAnnotations(Boolean forceCommonAnnotations) {
            return forceCommonAnnotations(Output.of(forceCommonAnnotations));
        }

        /**
         * @param forceCommonLabels Indicates if to force apply common labels to resources for kustomize apps.
         * 
         * @return builder
         * 
         */
        public Builder forceCommonLabels(@Nullable Output<Boolean> forceCommonLabels) {
            $.forceCommonLabels = forceCommonLabels;
            return this;
        }

        /**
         * @param forceCommonLabels Indicates if to force apply common labels to resources for kustomize apps.
         * 
         * @return builder
         * 
         */
        public Builder forceCommonLabels(Boolean forceCommonLabels) {
            return forceCommonLabels(Output.of(forceCommonLabels));
        }

        /**
         * @param images List of kustomize image override specifications.
         * 
         * @return builder
         * 
         */
        public Builder images(@Nullable Output<List<String>> images) {
            $.images = images;
            return this;
        }

        /**
         * @param images List of kustomize image override specifications.
         * 
         * @return builder
         * 
         */
        public Builder images(List<String> images) {
            return images(Output.of(images));
        }

        /**
         * @param images List of kustomize image override specifications.
         * 
         * @return builder
         * 
         */
        public Builder images(String... images) {
            return images(List.of(images));
        }

        /**
         * @param namePrefix Prefix prepended to resources for kustomize apps.
         * 
         * @return builder
         * 
         */
        public Builder namePrefix(@Nullable Output<String> namePrefix) {
            $.namePrefix = namePrefix;
            return this;
        }

        /**
         * @param namePrefix Prefix prepended to resources for kustomize apps.
         * 
         * @return builder
         * 
         */
        public Builder namePrefix(String namePrefix) {
            return namePrefix(Output.of(namePrefix));
        }

        /**
         * @param nameSuffix Suffix appended to resources for kustomize apps.
         * 
         * @return builder
         * 
         */
        public Builder nameSuffix(@Nullable Output<String> nameSuffix) {
            $.nameSuffix = nameSuffix;
            return this;
        }

        /**
         * @param nameSuffix Suffix appended to resources for kustomize apps.
         * 
         * @return builder
         * 
         */
        public Builder nameSuffix(String nameSuffix) {
            return nameSuffix(Output.of(nameSuffix));
        }

        /**
         * @param version Version of kustomize to use for rendering manifests.
         * 
         * @return builder
         * 
         */
        public Builder version(@Nullable Output<String> version) {
            $.version = version;
            return this;
        }

        /**
         * @param version Version of kustomize to use for rendering manifests.
         * 
         * @return builder
         * 
         */
        public Builder version(String version) {
            return version(Output.of(version));
        }

        public GitOpsApplicationsApplicationSpecSourceKustomizeArgs build() {
            return $;
        }
    }

}
