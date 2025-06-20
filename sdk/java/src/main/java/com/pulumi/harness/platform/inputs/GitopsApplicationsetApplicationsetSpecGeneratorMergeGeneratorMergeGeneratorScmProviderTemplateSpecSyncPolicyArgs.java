// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.harness.platform.inputs.GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMergeGeneratorScmProviderTemplateSpecSyncPolicyAutomatedArgs;
import com.pulumi.harness.platform.inputs.GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMergeGeneratorScmProviderTemplateSpecSyncPolicyManagedNamespaceMetadataArgs;
import com.pulumi.harness.platform.inputs.GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMergeGeneratorScmProviderTemplateSpecSyncPolicyRetryArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMergeGeneratorScmProviderTemplateSpecSyncPolicyArgs extends com.pulumi.resources.ResourceArgs {

    public static final GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMergeGeneratorScmProviderTemplateSpecSyncPolicyArgs Empty = new GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMergeGeneratorScmProviderTemplateSpecSyncPolicyArgs();

    /**
     * Whether to automatically keep an application synced to the target revision.
     * 
     */
    @Import(name="automated")
    private @Nullable Output<GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMergeGeneratorScmProviderTemplateSpecSyncPolicyAutomatedArgs> automated;

    /**
     * @return Whether to automatically keep an application synced to the target revision.
     * 
     */
    public Optional<Output<GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMergeGeneratorScmProviderTemplateSpecSyncPolicyAutomatedArgs>> automated() {
        return Optional.ofNullable(this.automated);
    }

    /**
     * Controls metadata in the given namespace (if `CreateNamespace=true`).
     * 
     */
    @Import(name="managedNamespaceMetadata")
    private @Nullable Output<GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMergeGeneratorScmProviderTemplateSpecSyncPolicyManagedNamespaceMetadataArgs> managedNamespaceMetadata;

    /**
     * @return Controls metadata in the given namespace (if `CreateNamespace=true`).
     * 
     */
    public Optional<Output<GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMergeGeneratorScmProviderTemplateSpecSyncPolicyManagedNamespaceMetadataArgs>> managedNamespaceMetadata() {
        return Optional.ofNullable(this.managedNamespaceMetadata);
    }

    /**
     * Controls failed sync retry behavior.
     * 
     */
    @Import(name="retry")
    private @Nullable Output<GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMergeGeneratorScmProviderTemplateSpecSyncPolicyRetryArgs> retry;

    /**
     * @return Controls failed sync retry behavior.
     * 
     */
    public Optional<Output<GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMergeGeneratorScmProviderTemplateSpecSyncPolicyRetryArgs>> retry() {
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

    private GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMergeGeneratorScmProviderTemplateSpecSyncPolicyArgs() {}

    private GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMergeGeneratorScmProviderTemplateSpecSyncPolicyArgs(GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMergeGeneratorScmProviderTemplateSpecSyncPolicyArgs $) {
        this.automated = $.automated;
        this.managedNamespaceMetadata = $.managedNamespaceMetadata;
        this.retry = $.retry;
        this.syncOptions = $.syncOptions;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMergeGeneratorScmProviderTemplateSpecSyncPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMergeGeneratorScmProviderTemplateSpecSyncPolicyArgs $;

        public Builder() {
            $ = new GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMergeGeneratorScmProviderTemplateSpecSyncPolicyArgs();
        }

        public Builder(GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMergeGeneratorScmProviderTemplateSpecSyncPolicyArgs defaults) {
            $ = new GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMergeGeneratorScmProviderTemplateSpecSyncPolicyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param automated Whether to automatically keep an application synced to the target revision.
         * 
         * @return builder
         * 
         */
        public Builder automated(@Nullable Output<GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMergeGeneratorScmProviderTemplateSpecSyncPolicyAutomatedArgs> automated) {
            $.automated = automated;
            return this;
        }

        /**
         * @param automated Whether to automatically keep an application synced to the target revision.
         * 
         * @return builder
         * 
         */
        public Builder automated(GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMergeGeneratorScmProviderTemplateSpecSyncPolicyAutomatedArgs automated) {
            return automated(Output.of(automated));
        }

        /**
         * @param managedNamespaceMetadata Controls metadata in the given namespace (if `CreateNamespace=true`).
         * 
         * @return builder
         * 
         */
        public Builder managedNamespaceMetadata(@Nullable Output<GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMergeGeneratorScmProviderTemplateSpecSyncPolicyManagedNamespaceMetadataArgs> managedNamespaceMetadata) {
            $.managedNamespaceMetadata = managedNamespaceMetadata;
            return this;
        }

        /**
         * @param managedNamespaceMetadata Controls metadata in the given namespace (if `CreateNamespace=true`).
         * 
         * @return builder
         * 
         */
        public Builder managedNamespaceMetadata(GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMergeGeneratorScmProviderTemplateSpecSyncPolicyManagedNamespaceMetadataArgs managedNamespaceMetadata) {
            return managedNamespaceMetadata(Output.of(managedNamespaceMetadata));
        }

        /**
         * @param retry Controls failed sync retry behavior.
         * 
         * @return builder
         * 
         */
        public Builder retry(@Nullable Output<GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMergeGeneratorScmProviderTemplateSpecSyncPolicyRetryArgs> retry) {
            $.retry = retry;
            return this;
        }

        /**
         * @param retry Controls failed sync retry behavior.
         * 
         * @return builder
         * 
         */
        public Builder retry(GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMergeGeneratorScmProviderTemplateSpecSyncPolicyRetryArgs retry) {
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

        public GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMergeGeneratorScmProviderTemplateSpecSyncPolicyArgs build() {
            return $;
        }
    }

}
