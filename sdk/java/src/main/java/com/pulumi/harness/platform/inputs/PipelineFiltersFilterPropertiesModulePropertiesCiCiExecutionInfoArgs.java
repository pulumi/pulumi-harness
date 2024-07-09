// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.harness.platform.inputs.PipelineFiltersFilterPropertiesModulePropertiesCiCiExecutionInfoPullRequestArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PipelineFiltersFilterPropertiesModulePropertiesCiCiExecutionInfoArgs extends com.pulumi.resources.ResourceArgs {

    public static final PipelineFiltersFilterPropertiesModulePropertiesCiCiExecutionInfoArgs Empty = new PipelineFiltersFilterPropertiesModulePropertiesCiCiExecutionInfoArgs();

    /**
     * Event for the ci execution, Possible values: pullRequest.
     * 
     */
    @Import(name="event")
    private @Nullable Output<String> event;

    /**
     * @return Event for the ci execution, Possible values: pullRequest.
     * 
     */
    public Optional<Output<String>> event() {
        return Optional.ofNullable(this.event);
    }

    /**
     * The pull request details of the CI pipeline.
     * 
     */
    @Import(name="pullRequest")
    private @Nullable Output<PipelineFiltersFilterPropertiesModulePropertiesCiCiExecutionInfoPullRequestArgs> pullRequest;

    /**
     * @return The pull request details of the CI pipeline.
     * 
     */
    public Optional<Output<PipelineFiltersFilterPropertiesModulePropertiesCiCiExecutionInfoPullRequestArgs>> pullRequest() {
        return Optional.ofNullable(this.pullRequest);
    }

    private PipelineFiltersFilterPropertiesModulePropertiesCiCiExecutionInfoArgs() {}

    private PipelineFiltersFilterPropertiesModulePropertiesCiCiExecutionInfoArgs(PipelineFiltersFilterPropertiesModulePropertiesCiCiExecutionInfoArgs $) {
        this.event = $.event;
        this.pullRequest = $.pullRequest;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PipelineFiltersFilterPropertiesModulePropertiesCiCiExecutionInfoArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PipelineFiltersFilterPropertiesModulePropertiesCiCiExecutionInfoArgs $;

        public Builder() {
            $ = new PipelineFiltersFilterPropertiesModulePropertiesCiCiExecutionInfoArgs();
        }

        public Builder(PipelineFiltersFilterPropertiesModulePropertiesCiCiExecutionInfoArgs defaults) {
            $ = new PipelineFiltersFilterPropertiesModulePropertiesCiCiExecutionInfoArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param event Event for the ci execution, Possible values: pullRequest.
         * 
         * @return builder
         * 
         */
        public Builder event(@Nullable Output<String> event) {
            $.event = event;
            return this;
        }

        /**
         * @param event Event for the ci execution, Possible values: pullRequest.
         * 
         * @return builder
         * 
         */
        public Builder event(String event) {
            return event(Output.of(event));
        }

        /**
         * @param pullRequest The pull request details of the CI pipeline.
         * 
         * @return builder
         * 
         */
        public Builder pullRequest(@Nullable Output<PipelineFiltersFilterPropertiesModulePropertiesCiCiExecutionInfoPullRequestArgs> pullRequest) {
            $.pullRequest = pullRequest;
            return this;
        }

        /**
         * @param pullRequest The pull request details of the CI pipeline.
         * 
         * @return builder
         * 
         */
        public Builder pullRequest(PipelineFiltersFilterPropertiesModulePropertiesCiCiExecutionInfoPullRequestArgs pullRequest) {
            return pullRequest(Output.of(pullRequest));
        }

        public PipelineFiltersFilterPropertiesModulePropertiesCiCiExecutionInfoArgs build() {
            return $;
        }
    }

}