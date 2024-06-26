// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetGitopsApplicationsApplicationSpecSourceKustomize extends com.pulumi.resources.InvokeArgs {

    public static final GetGitopsApplicationsApplicationSpecSourceKustomize Empty = new GetGitopsApplicationsApplicationSpecSourceKustomize();

    /**
     * List of additional annotations to add to rendered manifests.
     * 
     */
    @Import(name="commonAnnotations")
    private @Nullable Map<String,String> commonAnnotations;

    /**
     * @return List of additional annotations to add to rendered manifests.
     * 
     */
    public Optional<Map<String,String>> commonAnnotations() {
        return Optional.ofNullable(this.commonAnnotations);
    }

    /**
     * List of additional labels to add to rendered manifests.
     * 
     */
    @Import(name="commonLabels")
    private @Nullable Map<String,String> commonLabels;

    /**
     * @return List of additional labels to add to rendered manifests.
     * 
     */
    public Optional<Map<String,String>> commonLabels() {
        return Optional.ofNullable(this.commonLabels);
    }

    /**
     * Indicates if to force applying common annotations to resources for kustomize apps.
     * 
     */
    @Import(name="forceCommonAnnotations")
    private @Nullable Boolean forceCommonAnnotations;

    /**
     * @return Indicates if to force applying common annotations to resources for kustomize apps.
     * 
     */
    public Optional<Boolean> forceCommonAnnotations() {
        return Optional.ofNullable(this.forceCommonAnnotations);
    }

    /**
     * Indicates if to force apply common labels to resources for kustomize apps.
     * 
     */
    @Import(name="forceCommonLabels")
    private @Nullable Boolean forceCommonLabels;

    /**
     * @return Indicates if to force apply common labels to resources for kustomize apps.
     * 
     */
    public Optional<Boolean> forceCommonLabels() {
        return Optional.ofNullable(this.forceCommonLabels);
    }

    /**
     * List of kustomize image override specifications.
     * 
     */
    @Import(name="images")
    private @Nullable List<String> images;

    /**
     * @return List of kustomize image override specifications.
     * 
     */
    public Optional<List<String>> images() {
        return Optional.ofNullable(this.images);
    }

    /**
     * Prefix prepended to resources for kustomize apps.
     * 
     */
    @Import(name="namePrefix")
    private @Nullable String namePrefix;

    /**
     * @return Prefix prepended to resources for kustomize apps.
     * 
     */
    public Optional<String> namePrefix() {
        return Optional.ofNullable(this.namePrefix);
    }

    /**
     * Suffix appended to resources for kustomize apps.
     * 
     */
    @Import(name="nameSuffix")
    private @Nullable String nameSuffix;

    /**
     * @return Suffix appended to resources for kustomize apps.
     * 
     */
    public Optional<String> nameSuffix() {
        return Optional.ofNullable(this.nameSuffix);
    }

    /**
     * Version of kustomize to use for rendering manifests.
     * 
     */
    @Import(name="version")
    private @Nullable String version;

    /**
     * @return Version of kustomize to use for rendering manifests.
     * 
     */
    public Optional<String> version() {
        return Optional.ofNullable(this.version);
    }

    private GetGitopsApplicationsApplicationSpecSourceKustomize() {}

    private GetGitopsApplicationsApplicationSpecSourceKustomize(GetGitopsApplicationsApplicationSpecSourceKustomize $) {
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
    public static Builder builder(GetGitopsApplicationsApplicationSpecSourceKustomize defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetGitopsApplicationsApplicationSpecSourceKustomize $;

        public Builder() {
            $ = new GetGitopsApplicationsApplicationSpecSourceKustomize();
        }

        public Builder(GetGitopsApplicationsApplicationSpecSourceKustomize defaults) {
            $ = new GetGitopsApplicationsApplicationSpecSourceKustomize(Objects.requireNonNull(defaults));
        }

        /**
         * @param commonAnnotations List of additional annotations to add to rendered manifests.
         * 
         * @return builder
         * 
         */
        public Builder commonAnnotations(@Nullable Map<String,String> commonAnnotations) {
            $.commonAnnotations = commonAnnotations;
            return this;
        }

        /**
         * @param commonLabels List of additional labels to add to rendered manifests.
         * 
         * @return builder
         * 
         */
        public Builder commonLabels(@Nullable Map<String,String> commonLabels) {
            $.commonLabels = commonLabels;
            return this;
        }

        /**
         * @param forceCommonAnnotations Indicates if to force applying common annotations to resources for kustomize apps.
         * 
         * @return builder
         * 
         */
        public Builder forceCommonAnnotations(@Nullable Boolean forceCommonAnnotations) {
            $.forceCommonAnnotations = forceCommonAnnotations;
            return this;
        }

        /**
         * @param forceCommonLabels Indicates if to force apply common labels to resources for kustomize apps.
         * 
         * @return builder
         * 
         */
        public Builder forceCommonLabels(@Nullable Boolean forceCommonLabels) {
            $.forceCommonLabels = forceCommonLabels;
            return this;
        }

        /**
         * @param images List of kustomize image override specifications.
         * 
         * @return builder
         * 
         */
        public Builder images(@Nullable List<String> images) {
            $.images = images;
            return this;
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
        public Builder namePrefix(@Nullable String namePrefix) {
            $.namePrefix = namePrefix;
            return this;
        }

        /**
         * @param nameSuffix Suffix appended to resources for kustomize apps.
         * 
         * @return builder
         * 
         */
        public Builder nameSuffix(@Nullable String nameSuffix) {
            $.nameSuffix = nameSuffix;
            return this;
        }

        /**
         * @param version Version of kustomize to use for rendering manifests.
         * 
         * @return builder
         * 
         */
        public Builder version(@Nullable String version) {
            $.version = version;
            return this;
        }

        public GetGitopsApplicationsApplicationSpecSourceKustomize build() {
            return $;
        }
    }

}