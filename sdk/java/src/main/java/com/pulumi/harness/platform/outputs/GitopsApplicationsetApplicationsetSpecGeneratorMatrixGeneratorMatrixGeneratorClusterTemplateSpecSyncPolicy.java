// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.harness.platform.outputs.GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMatrixGeneratorClusterTemplateSpecSyncPolicyAutomated;
import com.pulumi.harness.platform.outputs.GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMatrixGeneratorClusterTemplateSpecSyncPolicyManagedNamespaceMetadata;
import com.pulumi.harness.platform.outputs.GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMatrixGeneratorClusterTemplateSpecSyncPolicyRetry;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMatrixGeneratorClusterTemplateSpecSyncPolicy {
    /**
     * @return Whether to automatically keep an application synced to the target revision.
     * 
     */
    private @Nullable GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMatrixGeneratorClusterTemplateSpecSyncPolicyAutomated automated;
    /**
     * @return Controls metadata in the given namespace (if `CreateNamespace=true`).
     * 
     */
    private @Nullable GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMatrixGeneratorClusterTemplateSpecSyncPolicyManagedNamespaceMetadata managedNamespaceMetadata;
    /**
     * @return Controls failed sync retry behavior.
     * 
     */
    private @Nullable GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMatrixGeneratorClusterTemplateSpecSyncPolicyRetry retry;
    /**
     * @return List of sync options. More info: https://argo-cd.readthedocs.io/en/stable/user-guide/sync-options/.
     * 
     */
    private @Nullable List<String> syncOptions;

    private GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMatrixGeneratorClusterTemplateSpecSyncPolicy() {}
    /**
     * @return Whether to automatically keep an application synced to the target revision.
     * 
     */
    public Optional<GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMatrixGeneratorClusterTemplateSpecSyncPolicyAutomated> automated() {
        return Optional.ofNullable(this.automated);
    }
    /**
     * @return Controls metadata in the given namespace (if `CreateNamespace=true`).
     * 
     */
    public Optional<GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMatrixGeneratorClusterTemplateSpecSyncPolicyManagedNamespaceMetadata> managedNamespaceMetadata() {
        return Optional.ofNullable(this.managedNamespaceMetadata);
    }
    /**
     * @return Controls failed sync retry behavior.
     * 
     */
    public Optional<GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMatrixGeneratorClusterTemplateSpecSyncPolicyRetry> retry() {
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

    public static Builder builder(GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMatrixGeneratorClusterTemplateSpecSyncPolicy defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMatrixGeneratorClusterTemplateSpecSyncPolicyAutomated automated;
        private @Nullable GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMatrixGeneratorClusterTemplateSpecSyncPolicyManagedNamespaceMetadata managedNamespaceMetadata;
        private @Nullable GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMatrixGeneratorClusterTemplateSpecSyncPolicyRetry retry;
        private @Nullable List<String> syncOptions;
        public Builder() {}
        public Builder(GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMatrixGeneratorClusterTemplateSpecSyncPolicy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.automated = defaults.automated;
    	      this.managedNamespaceMetadata = defaults.managedNamespaceMetadata;
    	      this.retry = defaults.retry;
    	      this.syncOptions = defaults.syncOptions;
        }

        @CustomType.Setter
        public Builder automated(@Nullable GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMatrixGeneratorClusterTemplateSpecSyncPolicyAutomated automated) {

            this.automated = automated;
            return this;
        }
        @CustomType.Setter
        public Builder managedNamespaceMetadata(@Nullable GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMatrixGeneratorClusterTemplateSpecSyncPolicyManagedNamespaceMetadata managedNamespaceMetadata) {

            this.managedNamespaceMetadata = managedNamespaceMetadata;
            return this;
        }
        @CustomType.Setter
        public Builder retry(@Nullable GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMatrixGeneratorClusterTemplateSpecSyncPolicyRetry retry) {

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
        public GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMatrixGeneratorClusterTemplateSpecSyncPolicy build() {
            final var _resultValue = new GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMatrixGeneratorClusterTemplateSpecSyncPolicy();
            _resultValue.automated = automated;
            _resultValue.managedNamespaceMetadata = managedNamespaceMetadata;
            _resultValue.retry = retry;
            _resultValue.syncOptions = syncOptions;
            return _resultValue;
        }
    }
}
