// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMergeGeneratorPullRequestTemplateSpecSyncPolicyAutomated {
    /**
     * @return Allows apps have zero live resources.
     * 
     */
    private @Nullable Boolean allowEmpty;
    /**
     * @return Whether to delete resources from the cluster that are not found in the sources anymore as part of automated sync.
     * 
     */
    private @Nullable Boolean prune;
    /**
     * @return Whether to revert resources back to their desired state upon modification in the cluster.
     * 
     */
    private @Nullable Boolean selfHeal;

    private GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMergeGeneratorPullRequestTemplateSpecSyncPolicyAutomated() {}
    /**
     * @return Allows apps have zero live resources.
     * 
     */
    public Optional<Boolean> allowEmpty() {
        return Optional.ofNullable(this.allowEmpty);
    }
    /**
     * @return Whether to delete resources from the cluster that are not found in the sources anymore as part of automated sync.
     * 
     */
    public Optional<Boolean> prune() {
        return Optional.ofNullable(this.prune);
    }
    /**
     * @return Whether to revert resources back to their desired state upon modification in the cluster.
     * 
     */
    public Optional<Boolean> selfHeal() {
        return Optional.ofNullable(this.selfHeal);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMergeGeneratorPullRequestTemplateSpecSyncPolicyAutomated defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean allowEmpty;
        private @Nullable Boolean prune;
        private @Nullable Boolean selfHeal;
        public Builder() {}
        public Builder(GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMergeGeneratorPullRequestTemplateSpecSyncPolicyAutomated defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowEmpty = defaults.allowEmpty;
    	      this.prune = defaults.prune;
    	      this.selfHeal = defaults.selfHeal;
        }

        @CustomType.Setter
        public Builder allowEmpty(@Nullable Boolean allowEmpty) {

            this.allowEmpty = allowEmpty;
            return this;
        }
        @CustomType.Setter
        public Builder prune(@Nullable Boolean prune) {

            this.prune = prune;
            return this;
        }
        @CustomType.Setter
        public Builder selfHeal(@Nullable Boolean selfHeal) {

            this.selfHeal = selfHeal;
            return this;
        }
        public GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMergeGeneratorPullRequestTemplateSpecSyncPolicyAutomated build() {
            final var _resultValue = new GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMergeGeneratorPullRequestTemplateSpecSyncPolicyAutomated();
            _resultValue.allowEmpty = allowEmpty;
            _resultValue.prune = prune;
            _resultValue.selfHeal = selfHeal;
            return _resultValue;
        }
    }
}
