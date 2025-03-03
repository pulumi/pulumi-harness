// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.harness.platform.inputs.PipelineFiltersFilterPropertiesModulePropertiesArgs;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PipelineFiltersFilterPropertiesArgs extends com.pulumi.resources.ResourceArgs {

    public static final PipelineFiltersFilterPropertiesArgs Empty = new PipelineFiltersFilterPropertiesArgs();

    /**
     * description of the pipline filter.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return description of the pipline filter.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Corresponding Entity of the filters. Currently supported types are {Connector, DelegateProfile, Delegate, PipelineSetup, PipelineExecution, Deployment, Audit, Template, EnvironmentGroup, FileStore, CCMRecommendation, Anomaly, Environment}.
     * 
     */
    @Import(name="filterType", required=true)
    private Output<String> filterType;

    /**
     * @return Corresponding Entity of the filters. Currently supported types are {Connector, DelegateProfile, Delegate, PipelineSetup, PipelineExecution, Deployment, Audit, Template, EnvironmentGroup, FileStore, CCMRecommendation, Anomaly, Environment}.
     * 
     */
    public Output<String> filterType() {
        return this.filterType;
    }

    /**
     * module properties of the pipline filter.
     * 
     */
    @Import(name="moduleProperties")
    private @Nullable Output<PipelineFiltersFilterPropertiesModulePropertiesArgs> moduleProperties;

    /**
     * @return module properties of the pipline filter.
     * 
     */
    public Optional<Output<PipelineFiltersFilterPropertiesModulePropertiesArgs>> moduleProperties() {
        return Optional.ofNullable(this.moduleProperties);
    }

    /**
     * Name of the pipeline filter.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Name of the pipeline filter.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Pipeline identifiers to filter on.
     * 
     */
    @Import(name="pipelineIdentifiers")
    private @Nullable Output<List<String>> pipelineIdentifiers;

    /**
     * @return Pipeline identifiers to filter on.
     * 
     */
    public Optional<Output<List<String>>> pipelineIdentifiers() {
        return Optional.ofNullable(this.pipelineIdentifiers);
    }

    /**
     * Name of the pipeline execution filter.
     * 
     */
    @Import(name="pipelineName")
    private @Nullable Output<String> pipelineName;

    /**
     * @return Name of the pipeline execution filter.
     * 
     */
    public Optional<Output<String>> pipelineName() {
        return Optional.ofNullable(this.pipelineName);
    }

    /**
     * Tags to associate with the pipeline. tags should be in the form of `{key:key1, value:key1value}`
     * 
     */
    @Import(name="pipelineTags")
    private @Nullable Output<List<Map<String,String>>> pipelineTags;

    /**
     * @return Tags to associate with the pipeline. tags should be in the form of `{key:key1, value:key1value}`
     * 
     */
    public Optional<Output<List<Map<String,String>>>> pipelineTags() {
        return Optional.ofNullable(this.pipelineTags);
    }

    /**
     * Tags to associate with the resource. Tags should be in the form `name:value`.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<List<String>> tags;

    /**
     * @return Tags to associate with the resource. Tags should be in the form `name:value`.
     * 
     */
    public Optional<Output<List<String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private PipelineFiltersFilterPropertiesArgs() {}

    private PipelineFiltersFilterPropertiesArgs(PipelineFiltersFilterPropertiesArgs $) {
        this.description = $.description;
        this.filterType = $.filterType;
        this.moduleProperties = $.moduleProperties;
        this.name = $.name;
        this.pipelineIdentifiers = $.pipelineIdentifiers;
        this.pipelineName = $.pipelineName;
        this.pipelineTags = $.pipelineTags;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PipelineFiltersFilterPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PipelineFiltersFilterPropertiesArgs $;

        public Builder() {
            $ = new PipelineFiltersFilterPropertiesArgs();
        }

        public Builder(PipelineFiltersFilterPropertiesArgs defaults) {
            $ = new PipelineFiltersFilterPropertiesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param description description of the pipline filter.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description description of the pipline filter.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param filterType Corresponding Entity of the filters. Currently supported types are {Connector, DelegateProfile, Delegate, PipelineSetup, PipelineExecution, Deployment, Audit, Template, EnvironmentGroup, FileStore, CCMRecommendation, Anomaly, Environment}.
         * 
         * @return builder
         * 
         */
        public Builder filterType(Output<String> filterType) {
            $.filterType = filterType;
            return this;
        }

        /**
         * @param filterType Corresponding Entity of the filters. Currently supported types are {Connector, DelegateProfile, Delegate, PipelineSetup, PipelineExecution, Deployment, Audit, Template, EnvironmentGroup, FileStore, CCMRecommendation, Anomaly, Environment}.
         * 
         * @return builder
         * 
         */
        public Builder filterType(String filterType) {
            return filterType(Output.of(filterType));
        }

        /**
         * @param moduleProperties module properties of the pipline filter.
         * 
         * @return builder
         * 
         */
        public Builder moduleProperties(@Nullable Output<PipelineFiltersFilterPropertiesModulePropertiesArgs> moduleProperties) {
            $.moduleProperties = moduleProperties;
            return this;
        }

        /**
         * @param moduleProperties module properties of the pipline filter.
         * 
         * @return builder
         * 
         */
        public Builder moduleProperties(PipelineFiltersFilterPropertiesModulePropertiesArgs moduleProperties) {
            return moduleProperties(Output.of(moduleProperties));
        }

        /**
         * @param name Name of the pipeline filter.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of the pipeline filter.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param pipelineIdentifiers Pipeline identifiers to filter on.
         * 
         * @return builder
         * 
         */
        public Builder pipelineIdentifiers(@Nullable Output<List<String>> pipelineIdentifiers) {
            $.pipelineIdentifiers = pipelineIdentifiers;
            return this;
        }

        /**
         * @param pipelineIdentifiers Pipeline identifiers to filter on.
         * 
         * @return builder
         * 
         */
        public Builder pipelineIdentifiers(List<String> pipelineIdentifiers) {
            return pipelineIdentifiers(Output.of(pipelineIdentifiers));
        }

        /**
         * @param pipelineIdentifiers Pipeline identifiers to filter on.
         * 
         * @return builder
         * 
         */
        public Builder pipelineIdentifiers(String... pipelineIdentifiers) {
            return pipelineIdentifiers(List.of(pipelineIdentifiers));
        }

        /**
         * @param pipelineName Name of the pipeline execution filter.
         * 
         * @return builder
         * 
         */
        public Builder pipelineName(@Nullable Output<String> pipelineName) {
            $.pipelineName = pipelineName;
            return this;
        }

        /**
         * @param pipelineName Name of the pipeline execution filter.
         * 
         * @return builder
         * 
         */
        public Builder pipelineName(String pipelineName) {
            return pipelineName(Output.of(pipelineName));
        }

        /**
         * @param pipelineTags Tags to associate with the pipeline. tags should be in the form of `{key:key1, value:key1value}`
         * 
         * @return builder
         * 
         */
        public Builder pipelineTags(@Nullable Output<List<Map<String,String>>> pipelineTags) {
            $.pipelineTags = pipelineTags;
            return this;
        }

        /**
         * @param pipelineTags Tags to associate with the pipeline. tags should be in the form of `{key:key1, value:key1value}`
         * 
         * @return builder
         * 
         */
        public Builder pipelineTags(List<Map<String,String>> pipelineTags) {
            return pipelineTags(Output.of(pipelineTags));
        }

        /**
         * @param pipelineTags Tags to associate with the pipeline. tags should be in the form of `{key:key1, value:key1value}`
         * 
         * @return builder
         * 
         */
        public Builder pipelineTags(Map<String,String>... pipelineTags) {
            return pipelineTags(List.of(pipelineTags));
        }

        /**
         * @param tags Tags to associate with the resource. Tags should be in the form `name:value`.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<List<String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags Tags to associate with the resource. Tags should be in the form `name:value`.
         * 
         * @return builder
         * 
         */
        public Builder tags(List<String> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param tags Tags to associate with the resource. Tags should be in the form `name:value`.
         * 
         * @return builder
         * 
         */
        public Builder tags(String... tags) {
            return tags(List.of(tags));
        }

        public PipelineFiltersFilterPropertiesArgs build() {
            if ($.filterType == null) {
                throw new MissingRequiredPropertyException("PipelineFiltersFilterPropertiesArgs", "filterType");
            }
            return $;
        }
    }

}
