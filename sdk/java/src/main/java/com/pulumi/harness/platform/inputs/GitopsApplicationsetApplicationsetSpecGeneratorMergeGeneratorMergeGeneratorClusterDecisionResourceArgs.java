// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.harness.platform.inputs.GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMergeGeneratorClusterDecisionResourceLabelSelectorArgs;
import com.pulumi.harness.platform.inputs.GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMergeGeneratorClusterDecisionResourceTemplateArgs;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMergeGeneratorClusterDecisionResourceArgs extends com.pulumi.resources.ResourceArgs {

    public static final GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMergeGeneratorClusterDecisionResourceArgs Empty = new GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMergeGeneratorClusterDecisionResourceArgs();

    /**
     * ConfigMap with the duck type definitions needed to retrieve the data this includes apiVersion(group/version), kind, matchKey and validation settings.
     * 
     */
    @Import(name="configMapRef", required=true)
    private Output<String> configMapRef;

    /**
     * @return ConfigMap with the duck type definitions needed to retrieve the data this includes apiVersion(group/version), kind, matchKey and validation settings.
     * 
     */
    public Output<String> configMapRef() {
        return this.configMapRef;
    }

    /**
     * Label selector used to find the resource defined in the `config_map_ref`. Alternative to `name`.
     * 
     */
    @Import(name="labelSelector")
    private @Nullable Output<GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMergeGeneratorClusterDecisionResourceLabelSelectorArgs> labelSelector;

    /**
     * @return Label selector used to find the resource defined in the `config_map_ref`. Alternative to `name`.
     * 
     */
    public Optional<Output<GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMergeGeneratorClusterDecisionResourceLabelSelectorArgs>> labelSelector() {
        return Optional.ofNullable(this.labelSelector);
    }

    /**
     * Resource name of the kind, group and version, defined in the `config_map_ref`.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Resource name of the kind, group and version, defined in the `config_map_ref`.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * How often to check for changes (in seconds). Default: 3min.
     * 
     */
    @Import(name="requeueAfterSeconds")
    private @Nullable Output<String> requeueAfterSeconds;

    /**
     * @return How often to check for changes (in seconds). Default: 3min.
     * 
     */
    public Optional<Output<String>> requeueAfterSeconds() {
        return Optional.ofNullable(this.requeueAfterSeconds);
    }

    /**
     * Generator template. Used to override the values of the spec-level template.
     * 
     */
    @Import(name="template")
    private @Nullable Output<GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMergeGeneratorClusterDecisionResourceTemplateArgs> template;

    /**
     * @return Generator template. Used to override the values of the spec-level template.
     * 
     */
    public Optional<Output<GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMergeGeneratorClusterDecisionResourceTemplateArgs>> template() {
        return Optional.ofNullable(this.template);
    }

    /**
     * Arbitrary string key-value pairs which are passed directly as parameters to the template.
     * 
     */
    @Import(name="values")
    private @Nullable Output<Map<String,String>> values;

    /**
     * @return Arbitrary string key-value pairs which are passed directly as parameters to the template.
     * 
     */
    public Optional<Output<Map<String,String>>> values() {
        return Optional.ofNullable(this.values);
    }

    private GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMergeGeneratorClusterDecisionResourceArgs() {}

    private GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMergeGeneratorClusterDecisionResourceArgs(GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMergeGeneratorClusterDecisionResourceArgs $) {
        this.configMapRef = $.configMapRef;
        this.labelSelector = $.labelSelector;
        this.name = $.name;
        this.requeueAfterSeconds = $.requeueAfterSeconds;
        this.template = $.template;
        this.values = $.values;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMergeGeneratorClusterDecisionResourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMergeGeneratorClusterDecisionResourceArgs $;

        public Builder() {
            $ = new GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMergeGeneratorClusterDecisionResourceArgs();
        }

        public Builder(GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMergeGeneratorClusterDecisionResourceArgs defaults) {
            $ = new GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMergeGeneratorClusterDecisionResourceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param configMapRef ConfigMap with the duck type definitions needed to retrieve the data this includes apiVersion(group/version), kind, matchKey and validation settings.
         * 
         * @return builder
         * 
         */
        public Builder configMapRef(Output<String> configMapRef) {
            $.configMapRef = configMapRef;
            return this;
        }

        /**
         * @param configMapRef ConfigMap with the duck type definitions needed to retrieve the data this includes apiVersion(group/version), kind, matchKey and validation settings.
         * 
         * @return builder
         * 
         */
        public Builder configMapRef(String configMapRef) {
            return configMapRef(Output.of(configMapRef));
        }

        /**
         * @param labelSelector Label selector used to find the resource defined in the `config_map_ref`. Alternative to `name`.
         * 
         * @return builder
         * 
         */
        public Builder labelSelector(@Nullable Output<GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMergeGeneratorClusterDecisionResourceLabelSelectorArgs> labelSelector) {
            $.labelSelector = labelSelector;
            return this;
        }

        /**
         * @param labelSelector Label selector used to find the resource defined in the `config_map_ref`. Alternative to `name`.
         * 
         * @return builder
         * 
         */
        public Builder labelSelector(GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMergeGeneratorClusterDecisionResourceLabelSelectorArgs labelSelector) {
            return labelSelector(Output.of(labelSelector));
        }

        /**
         * @param name Resource name of the kind, group and version, defined in the `config_map_ref`.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Resource name of the kind, group and version, defined in the `config_map_ref`.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param requeueAfterSeconds How often to check for changes (in seconds). Default: 3min.
         * 
         * @return builder
         * 
         */
        public Builder requeueAfterSeconds(@Nullable Output<String> requeueAfterSeconds) {
            $.requeueAfterSeconds = requeueAfterSeconds;
            return this;
        }

        /**
         * @param requeueAfterSeconds How often to check for changes (in seconds). Default: 3min.
         * 
         * @return builder
         * 
         */
        public Builder requeueAfterSeconds(String requeueAfterSeconds) {
            return requeueAfterSeconds(Output.of(requeueAfterSeconds));
        }

        /**
         * @param template Generator template. Used to override the values of the spec-level template.
         * 
         * @return builder
         * 
         */
        public Builder template(@Nullable Output<GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMergeGeneratorClusterDecisionResourceTemplateArgs> template) {
            $.template = template;
            return this;
        }

        /**
         * @param template Generator template. Used to override the values of the spec-level template.
         * 
         * @return builder
         * 
         */
        public Builder template(GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMergeGeneratorClusterDecisionResourceTemplateArgs template) {
            return template(Output.of(template));
        }

        /**
         * @param values Arbitrary string key-value pairs which are passed directly as parameters to the template.
         * 
         * @return builder
         * 
         */
        public Builder values(@Nullable Output<Map<String,String>> values) {
            $.values = values;
            return this;
        }

        /**
         * @param values Arbitrary string key-value pairs which are passed directly as parameters to the template.
         * 
         * @return builder
         * 
         */
        public Builder values(Map<String,String> values) {
            return values(Output.of(values));
        }

        public GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMergeGeneratorClusterDecisionResourceArgs build() {
            if ($.configMapRef == null) {
                throw new MissingRequiredPropertyException("GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMergeGeneratorClusterDecisionResourceArgs", "configMapRef");
            }
            return $;
        }
    }

}
