// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.harness.platform.outputs.GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMatrixGeneratorClusterDecisionResourceTemplateSpecSyncPolicyAutomated;
import com.pulumi.harness.platform.outputs.GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMatrixGeneratorClusterDecisionResourceTemplateSpecSyncPolicyManagedNamespaceMetadata;
import com.pulumi.harness.platform.outputs.GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMatrixGeneratorClusterDecisionResourceTemplateSpecSyncPolicyRetry;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMatrixGeneratorClusterDecisionResourceTemplateSpecSyncPolicy {
    /**
     * @return Whether to automatically keep an application synced to the target revision.
     * 
     */
    private @Nullable GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMatrixGeneratorClusterDecisionResourceTemplateSpecSyncPolicyAutomated automated;
    /**
     * @return Controls metadata in the given namespace (if `CreateNamespace=true`).
     * 
     */
    private @Nullable GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMatrixGeneratorClusterDecisionResourceTemplateSpecSyncPolicyManagedNamespaceMetadata managedNamespaceMetadata;
    /**
     * @return Controls failed sync retry behavior.
     * 
     */
    private @Nullable GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMatrixGeneratorClusterDecisionResourceTemplateSpecSyncPolicyRetry retry;
    /**
     * @return List of sync options. More info: https://argo-cd.readthedocs.io/en/stable/user-guide/sync-options/.
     * 
     */
    private @Nullable List<String> syncOptions;

    private GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMatrixGeneratorClusterDecisionResourceTemplateSpecSyncPolicy() {}
    /**
     * @return Whether to automatically keep an application synced to the target revision.
     * 
     */
    public Optional<GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMatrixGeneratorClusterDecisionResourceTemplateSpecSyncPolicyAutomated> automated() {
        return Optional.ofNullable(this.automated);
    }
    /**
     * @return Controls metadata in the given namespace (if `CreateNamespace=true`).
     * 
     */
    public Optional<GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMatrixGeneratorClusterDecisionResourceTemplateSpecSyncPolicyManagedNamespaceMetadata> managedNamespaceMetadata() {
        return Optional.ofNullable(this.managedNamespaceMetadata);
    }
    /**
     * @return Controls failed sync retry behavior.
     * 
     */
    public Optional<GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMatrixGeneratorClusterDecisionResourceTemplateSpecSyncPolicyRetry> retry() {
        return Optional.ofNullable(this.retry);
    }
    /**
     * @return List of sync options. More info: https://argo-cd.readthedocs.io/en/stable/user-guide/sync-options/.
     * 
     */
    public List<String> syncOptions() {
        return this.syncOptions == null ? List.of() : this.syncOptions;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMatrixGeneratorClusterDecisionResourceTemplateSpecSyncPolicy defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMatrixGeneratorClusterDecisionResourceTemplateSpecSyncPolicyAutomated automated;
        private @Nullable GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMatrixGeneratorClusterDecisionResourceTemplateSpecSyncPolicyManagedNamespaceMetadata managedNamespaceMetadata;
        private @Nullable GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMatrixGeneratorClusterDecisionResourceTemplateSpecSyncPolicyRetry retry;
        private @Nullable List<String> syncOptions;
        public Builder() {}
        public Builder(GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMatrixGeneratorClusterDecisionResourceTemplateSpecSyncPolicy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.automated = defaults.automated;
    	      this.managedNamespaceMetadata = defaults.managedNamespaceMetadata;
    	      this.retry = defaults.retry;
    	      this.syncOptions = defaults.syncOptions;
        }

        @CustomType.Setter
        public Builder automated(@Nullable GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMatrixGeneratorClusterDecisionResourceTemplateSpecSyncPolicyAutomated automated) {

            this.automated = automated;
            return this;
        }
        @CustomType.Setter
        public Builder managedNamespaceMetadata(@Nullable GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMatrixGeneratorClusterDecisionResourceTemplateSpecSyncPolicyManagedNamespaceMetadata managedNamespaceMetadata) {

            this.managedNamespaceMetadata = managedNamespaceMetadata;
            return this;
        }
        @CustomType.Setter
        public Builder retry(@Nullable GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMatrixGeneratorClusterDecisionResourceTemplateSpecSyncPolicyRetry retry) {

            this.retry = retry;
            return this;
        }
        @CustomType.Setter
        public Builder syncOptions(@Nullable List<String> syncOptions) {

            this.syncOptions = syncOptions;
            return this;
        }
        public Builder syncOptions(String... syncOptions) {
            return syncOptions(List.of(syncOptions));
        }
        public GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMatrixGeneratorClusterDecisionResourceTemplateSpecSyncPolicy build() {
            final var _resultValue = new GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMatrixGeneratorClusterDecisionResourceTemplateSpecSyncPolicy();
            _resultValue.automated = automated;
            _resultValue.managedNamespaceMetadata = managedNamespaceMetadata;
            _resultValue.retry = retry;
            _resultValue.syncOptions = syncOptions;
            return _resultValue;
        }
    }
}
