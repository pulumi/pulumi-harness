// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.harness.platform.outputs.GitopsApplicationsetApplicationsetSpecGeneratorMatrixTemplateSpecSyncPolicyAutomated;
import com.pulumi.harness.platform.outputs.GitopsApplicationsetApplicationsetSpecGeneratorMatrixTemplateSpecSyncPolicyManagedNamespaceMetadata;
import com.pulumi.harness.platform.outputs.GitopsApplicationsetApplicationsetSpecGeneratorMatrixTemplateSpecSyncPolicyRetry;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GitopsApplicationsetApplicationsetSpecGeneratorMatrixTemplateSpecSyncPolicy {
    /**
     * @return Whether to automatically keep an application synced to the target revision.
     * 
     */
    private @Nullable GitopsApplicationsetApplicationsetSpecGeneratorMatrixTemplateSpecSyncPolicyAutomated automated;
    /**
     * @return Controls metadata in the given namespace (if `CreateNamespace=true`).
     * 
     */
    private @Nullable GitopsApplicationsetApplicationsetSpecGeneratorMatrixTemplateSpecSyncPolicyManagedNamespaceMetadata managedNamespaceMetadata;
    /**
     * @return Controls failed sync retry behavior.
     * 
     */
    private @Nullable GitopsApplicationsetApplicationsetSpecGeneratorMatrixTemplateSpecSyncPolicyRetry retry;
    /**
     * @return List of sync options. More info: https://argo-cd.readthedocs.io/en/stable/user-guide/sync-options/.
     * 
     */
    private @Nullable List<String> syncOptions;

    private GitopsApplicationsetApplicationsetSpecGeneratorMatrixTemplateSpecSyncPolicy() {}
    /**
     * @return Whether to automatically keep an application synced to the target revision.
     * 
     */
    public Optional<GitopsApplicationsetApplicationsetSpecGeneratorMatrixTemplateSpecSyncPolicyAutomated> automated() {
        return Optional.ofNullable(this.automated);
    }
    /**
     * @return Controls metadata in the given namespace (if `CreateNamespace=true`).
     * 
     */
    public Optional<GitopsApplicationsetApplicationsetSpecGeneratorMatrixTemplateSpecSyncPolicyManagedNamespaceMetadata> managedNamespaceMetadata() {
        return Optional.ofNullable(this.managedNamespaceMetadata);
    }
    /**
     * @return Controls failed sync retry behavior.
     * 
     */
    public Optional<GitopsApplicationsetApplicationsetSpecGeneratorMatrixTemplateSpecSyncPolicyRetry> retry() {
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

    public static Builder builder(GitopsApplicationsetApplicationsetSpecGeneratorMatrixTemplateSpecSyncPolicy defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable GitopsApplicationsetApplicationsetSpecGeneratorMatrixTemplateSpecSyncPolicyAutomated automated;
        private @Nullable GitopsApplicationsetApplicationsetSpecGeneratorMatrixTemplateSpecSyncPolicyManagedNamespaceMetadata managedNamespaceMetadata;
        private @Nullable GitopsApplicationsetApplicationsetSpecGeneratorMatrixTemplateSpecSyncPolicyRetry retry;
        private @Nullable List<String> syncOptions;
        public Builder() {}
        public Builder(GitopsApplicationsetApplicationsetSpecGeneratorMatrixTemplateSpecSyncPolicy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.automated = defaults.automated;
    	      this.managedNamespaceMetadata = defaults.managedNamespaceMetadata;
    	      this.retry = defaults.retry;
    	      this.syncOptions = defaults.syncOptions;
        }

        @CustomType.Setter
        public Builder automated(@Nullable GitopsApplicationsetApplicationsetSpecGeneratorMatrixTemplateSpecSyncPolicyAutomated automated) {

            this.automated = automated;
            return this;
        }
        @CustomType.Setter
        public Builder managedNamespaceMetadata(@Nullable GitopsApplicationsetApplicationsetSpecGeneratorMatrixTemplateSpecSyncPolicyManagedNamespaceMetadata managedNamespaceMetadata) {

            this.managedNamespaceMetadata = managedNamespaceMetadata;
            return this;
        }
        @CustomType.Setter
        public Builder retry(@Nullable GitopsApplicationsetApplicationsetSpecGeneratorMatrixTemplateSpecSyncPolicyRetry retry) {

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
        public GitopsApplicationsetApplicationsetSpecGeneratorMatrixTemplateSpecSyncPolicy build() {
            final var _resultValue = new GitopsApplicationsetApplicationsetSpecGeneratorMatrixTemplateSpecSyncPolicy();
            _resultValue.automated = automated;
            _resultValue.managedNamespaceMetadata = managedNamespaceMetadata;
            _resultValue.retry = retry;
            _resultValue.syncOptions = syncOptions;
            return _resultValue;
        }
    }
}
