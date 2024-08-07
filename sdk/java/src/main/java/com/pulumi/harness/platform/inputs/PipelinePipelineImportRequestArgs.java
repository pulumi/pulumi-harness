// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PipelinePipelineImportRequestArgs extends com.pulumi.resources.ResourceArgs {

    public static final PipelinePipelineImportRequestArgs Empty = new PipelinePipelineImportRequestArgs();

    /**
     * Description of the pipeline.
     * 
     */
    @Import(name="pipelineDescription")
    private @Nullable Output<String> pipelineDescription;

    /**
     * @return Description of the pipeline.
     * 
     */
    public Optional<Output<String>> pipelineDescription() {
        return Optional.ofNullable(this.pipelineDescription);
    }

    /**
     * Name of the pipeline.
     * 
     */
    @Import(name="pipelineName")
    private @Nullable Output<String> pipelineName;

    /**
     * @return Name of the pipeline.
     * 
     */
    public Optional<Output<String>> pipelineName() {
        return Optional.ofNullable(this.pipelineName);
    }

    private PipelinePipelineImportRequestArgs() {}

    private PipelinePipelineImportRequestArgs(PipelinePipelineImportRequestArgs $) {
        this.pipelineDescription = $.pipelineDescription;
        this.pipelineName = $.pipelineName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PipelinePipelineImportRequestArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PipelinePipelineImportRequestArgs $;

        public Builder() {
            $ = new PipelinePipelineImportRequestArgs();
        }

        public Builder(PipelinePipelineImportRequestArgs defaults) {
            $ = new PipelinePipelineImportRequestArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param pipelineDescription Description of the pipeline.
         * 
         * @return builder
         * 
         */
        public Builder pipelineDescription(@Nullable Output<String> pipelineDescription) {
            $.pipelineDescription = pipelineDescription;
            return this;
        }

        /**
         * @param pipelineDescription Description of the pipeline.
         * 
         * @return builder
         * 
         */
        public Builder pipelineDescription(String pipelineDescription) {
            return pipelineDescription(Output.of(pipelineDescription));
        }

        /**
         * @param pipelineName Name of the pipeline.
         * 
         * @return builder
         * 
         */
        public Builder pipelineName(@Nullable Output<String> pipelineName) {
            $.pipelineName = pipelineName;
            return this;
        }

        /**
         * @param pipelineName Name of the pipeline.
         * 
         * @return builder
         * 
         */
        public Builder pipelineName(String pipelineName) {
            return pipelineName(Output.of(pipelineName));
        }

        public PipelinePipelineImportRequestArgs build() {
            return $;
        }
    }

}
