// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.harness.platform.inputs.GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMergeTemplateSpecSyncPolicyAutomatedArgs;
import com.pulumi.harness.platform.inputs.GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMergeTemplateSpecSyncPolicyManagedNamespaceMetadataArgs;
import com.pulumi.harness.platform.inputs.GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMergeTemplateSpecSyncPolicyRetryArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMergeTemplateSpecSyncPolicyArgs extends com.pulumi.resources.ResourceArgs {

    public static final GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMergeTemplateSpecSyncPolicyArgs Empty = new GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMergeTemplateSpecSyncPolicyArgs();

    /**
     * Whether to automatically keep an application synced to the target revision.
     * 
     */
    @Import(name="automated")
    private @Nullable Output<GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMergeTemplateSpecSyncPolicyAutomatedArgs> automated;

    /**
     * @return Whether to automatically keep an application synced to the target revision.
     * 
     */
    public Optional<Output<GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMergeTemplateSpecSyncPolicyAutomatedArgs>> automated() {
        return Optional.ofNullable(this.automated);
    }

    /**
     * Controls metadata in the given namespace (if `CreateNamespace=true`).
     * 
     */
    @Import(name="managedNamespaceMetadata")
    private @Nullable Output<GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMergeTemplateSpecSyncPolicyManagedNamespaceMetadataArgs> managedNamespaceMetadata;

    /**
     * @return Controls metadata in the given namespace (if `CreateNamespace=true`).
     * 
     */
    public Optional<Output<GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMergeTemplateSpecSyncPolicyManagedNamespaceMetadataArgs>> managedNamespaceMetadata() {
        return Optional.ofNullable(this.managedNamespaceMetadata);
    }

    /**
     * Controls failed sync retry behavior.
     * 
     */
    @Import(name="retry")
    private @Nullable Output<GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMergeTemplateSpecSyncPolicyRetryArgs> retry;

    /**
     * @return Controls failed sync retry behavior.
     * 
     */
    public Optional<Output<GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMergeTemplateSpecSyncPolicyRetryArgs>> retry() {
        return Optional.ofNullable(this.retry);
    }

    /**
     * List of sync options. More info: https://argo-cd.readthedocs.io/en/stable/user-guide/sync-options/.
     * 
     */
    @Import(name="syncOptions")
    private @Nullable Output<List<String>> syncOptions;

    /**
     * @return List of sync options. More info: https://argo-cd.readthedocs.io/en/stable/user-guide/sync-options/.
     * 
     */
    public Optional<Output<List<String>>> syncOptions() {
        return Optional.ofNullable(this.syncOptions);
    }

    private GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMergeTemplateSpecSyncPolicyArgs() {}

    private GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMergeTemplateSpecSyncPolicyArgs(GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMergeTemplateSpecSyncPolicyArgs $) {
        this.automated = $.automated;
        this.managedNamespaceMetadata = $.managedNamespaceMetadata;
        this.retry = $.retry;
        this.syncOptions = $.syncOptions;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMergeTemplateSpecSyncPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMergeTemplateSpecSyncPolicyArgs $;

        public Builder() {
            $ = new GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMergeTemplateSpecSyncPolicyArgs();
        }

        public Builder(GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMergeTemplateSpecSyncPolicyArgs defaults) {
            $ = new GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMergeTemplateSpecSyncPolicyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param automated Whether to automatically keep an application synced to the target revision.
         * 
         * @return builder
         * 
         */
        public Builder automated(@Nullable Output<GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMergeTemplateSpecSyncPolicyAutomatedArgs> automated) {
            $.automated = automated;
            return this;
        }

        /**
         * @param automated Whether to automatically keep an application synced to the target revision.
         * 
         * @return builder
         * 
         */
        public Builder automated(GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMergeTemplateSpecSyncPolicyAutomatedArgs automated) {
            return automated(Output.of(automated));
        }

        /**
         * @param managedNamespaceMetadata Controls metadata in the given namespace (if `CreateNamespace=true`).
         * 
         * @return builder
         * 
         */
        public Builder managedNamespaceMetadata(@Nullable Output<GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMergeTemplateSpecSyncPolicyManagedNamespaceMetadataArgs> managedNamespaceMetadata) {
            $.managedNamespaceMetadata = managedNamespaceMetadata;
            return this;
        }

        /**
         * @param managedNamespaceMetadata Controls metadata in the given namespace (if `CreateNamespace=true`).
         * 
         * @return builder
         * 
         */
        public Builder managedNamespaceMetadata(GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMergeTemplateSpecSyncPolicyManagedNamespaceMetadataArgs managedNamespaceMetadata) {
            return managedNamespaceMetadata(Output.of(managedNamespaceMetadata));
        }

        /**
         * @param retry Controls failed sync retry behavior.
         * 
         * @return builder
         * 
         */
        public Builder retry(@Nullable Output<GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMergeTemplateSpecSyncPolicyRetryArgs> retry) {
            $.retry = retry;
            return this;
        }

        /**
         * @param retry Controls failed sync retry behavior.
         * 
         * @return builder
         * 
         */
        public Builder retry(GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMergeTemplateSpecSyncPolicyRetryArgs retry) {
            return retry(Output.of(retry));
        }

        /**
         * @param syncOptions List of sync options. More info: https://argo-cd.readthedocs.io/en/stable/user-guide/sync-options/.
         * 
         * @return builder
         * 
         */
        public Builder syncOptions(@Nullable Output<List<String>> syncOptions) {
            $.syncOptions = syncOptions;
            return this;
        }

        /**
         * @param syncOptions List of sync options. More info: https://argo-cd.readthedocs.io/en/stable/user-guide/sync-options/.
         * 
         * @return builder
         * 
         */
        public Builder syncOptions(List<String> syncOptions) {
            return syncOptions(Output.of(syncOptions));
        }

        /**
         * @param syncOptions List of sync options. More info: https://argo-cd.readthedocs.io/en/stable/user-guide/sync-options/.
         * 
         * @return builder
         * 
         */
        public Builder syncOptions(String... syncOptions) {
            return syncOptions(List.of(syncOptions));
        }

        public GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMergeTemplateSpecSyncPolicyArgs build() {
            return $;
        }
    }

}
