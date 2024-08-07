// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PipelineFiltersFilterPropertiesModulePropertiesCiCiExecutionInfoPullRequestArgs extends com.pulumi.resources.ResourceArgs {

    public static final PipelineFiltersFilterPropertiesModulePropertiesCiCiExecutionInfoPullRequestArgs Empty = new PipelineFiltersFilterPropertiesModulePropertiesCiCiExecutionInfoPullRequestArgs();

    /**
     * Source branch of the pull request.
     * 
     */
    @Import(name="sourceBranch")
    private @Nullable Output<String> sourceBranch;

    /**
     * @return Source branch of the pull request.
     * 
     */
    public Optional<Output<String>> sourceBranch() {
        return Optional.ofNullable(this.sourceBranch);
    }

    /**
     * Target branch of the pull request.
     * 
     */
    @Import(name="targetBranch")
    private @Nullable Output<String> targetBranch;

    /**
     * @return Target branch of the pull request.
     * 
     */
    public Optional<Output<String>> targetBranch() {
        return Optional.ofNullable(this.targetBranch);
    }

    private PipelineFiltersFilterPropertiesModulePropertiesCiCiExecutionInfoPullRequestArgs() {}

    private PipelineFiltersFilterPropertiesModulePropertiesCiCiExecutionInfoPullRequestArgs(PipelineFiltersFilterPropertiesModulePropertiesCiCiExecutionInfoPullRequestArgs $) {
        this.sourceBranch = $.sourceBranch;
        this.targetBranch = $.targetBranch;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PipelineFiltersFilterPropertiesModulePropertiesCiCiExecutionInfoPullRequestArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PipelineFiltersFilterPropertiesModulePropertiesCiCiExecutionInfoPullRequestArgs $;

        public Builder() {
            $ = new PipelineFiltersFilterPropertiesModulePropertiesCiCiExecutionInfoPullRequestArgs();
        }

        public Builder(PipelineFiltersFilterPropertiesModulePropertiesCiCiExecutionInfoPullRequestArgs defaults) {
            $ = new PipelineFiltersFilterPropertiesModulePropertiesCiCiExecutionInfoPullRequestArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param sourceBranch Source branch of the pull request.
         * 
         * @return builder
         * 
         */
        public Builder sourceBranch(@Nullable Output<String> sourceBranch) {
            $.sourceBranch = sourceBranch;
            return this;
        }

        /**
         * @param sourceBranch Source branch of the pull request.
         * 
         * @return builder
         * 
         */
        public Builder sourceBranch(String sourceBranch) {
            return sourceBranch(Output.of(sourceBranch));
        }

        /**
         * @param targetBranch Target branch of the pull request.
         * 
         * @return builder
         * 
         */
        public Builder targetBranch(@Nullable Output<String> targetBranch) {
            $.targetBranch = targetBranch;
            return this;
        }

        /**
         * @param targetBranch Target branch of the pull request.
         * 
         * @return builder
         * 
         */
        public Builder targetBranch(String targetBranch) {
            return targetBranch(Output.of(targetBranch));
        }

        public PipelineFiltersFilterPropertiesModulePropertiesCiCiExecutionInfoPullRequestArgs build() {
            return $;
        }
    }

}
