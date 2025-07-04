// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorPullRequestFilterArgs extends com.pulumi.resources.ResourceArgs {

    public static final GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorPullRequestFilterArgs Empty = new GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorPullRequestFilterArgs();

    /**
     * A regex which must match the branch name.
     * 
     */
    @Import(name="branchMatch")
    private @Nullable Output<String> branchMatch;

    /**
     * @return A regex which must match the branch name.
     * 
     */
    public Optional<Output<String>> branchMatch() {
        return Optional.ofNullable(this.branchMatch);
    }

    private GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorPullRequestFilterArgs() {}

    private GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorPullRequestFilterArgs(GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorPullRequestFilterArgs $) {
        this.branchMatch = $.branchMatch;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorPullRequestFilterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorPullRequestFilterArgs $;

        public Builder() {
            $ = new GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorPullRequestFilterArgs();
        }

        public Builder(GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorPullRequestFilterArgs defaults) {
            $ = new GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorPullRequestFilterArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param branchMatch A regex which must match the branch name.
         * 
         * @return builder
         * 
         */
        public Builder branchMatch(@Nullable Output<String> branchMatch) {
            $.branchMatch = branchMatch;
            return this;
        }

        /**
         * @param branchMatch A regex which must match the branch name.
         * 
         * @return builder
         * 
         */
        public Builder branchMatch(String branchMatch) {
            return branchMatch(Output.of(branchMatch));
        }

        public GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorPullRequestFilterArgs build() {
            return $;
        }
    }

}
