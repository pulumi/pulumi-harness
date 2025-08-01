// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.harness.platform.inputs.GitopsApplicationsetApplicationsetSpecGeneratorListTemplateSpecSourceHelmFileParameterArgs;
import com.pulumi.harness.platform.inputs.GitopsApplicationsetApplicationsetSpecGeneratorListTemplateSpecSourceHelmParameterArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GitopsApplicationsetApplicationsetSpecGeneratorListTemplateSpecSourceHelmArgs extends com.pulumi.resources.ResourceArgs {

    public static final GitopsApplicationsetApplicationsetSpecGeneratorListTemplateSpecSourceHelmArgs Empty = new GitopsApplicationsetApplicationsetSpecGeneratorListTemplateSpecSourceHelmArgs();

    /**
     * File parameters for the helm template.
     * 
     */
    @Import(name="fileParameters")
    private @Nullable Output<List<GitopsApplicationsetApplicationsetSpecGeneratorListTemplateSpecSourceHelmFileParameterArgs>> fileParameters;

    /**
     * @return File parameters for the helm template.
     * 
     */
    public Optional<Output<List<GitopsApplicationsetApplicationsetSpecGeneratorListTemplateSpecSourceHelmFileParameterArgs>>> fileParameters() {
        return Optional.ofNullable(this.fileParameters);
    }

    /**
     * Prevents &#39;helm template&#39; from failing when `value_files` do not exist locally by not appending them to &#39;helm template --values&#39;.
     * 
     */
    @Import(name="ignoreMissingValueFiles")
    private @Nullable Output<Boolean> ignoreMissingValueFiles;

    /**
     * @return Prevents &#39;helm template&#39; from failing when `value_files` do not exist locally by not appending them to &#39;helm template --values&#39;.
     * 
     */
    public Optional<Output<Boolean>> ignoreMissingValueFiles() {
        return Optional.ofNullable(this.ignoreMissingValueFiles);
    }

    /**
     * Helm parameters which are passed to the helm template command upon manifest generation.
     * 
     */
    @Import(name="parameters")
    private @Nullable Output<List<GitopsApplicationsetApplicationsetSpecGeneratorListTemplateSpecSourceHelmParameterArgs>> parameters;

    /**
     * @return Helm parameters which are passed to the helm template command upon manifest generation.
     * 
     */
    public Optional<Output<List<GitopsApplicationsetApplicationsetSpecGeneratorListTemplateSpecSourceHelmParameterArgs>>> parameters() {
        return Optional.ofNullable(this.parameters);
    }

    /**
     * If true then adds &#39;--pass-credentials&#39; to Helm commands to pass credentials to all domains.
     * 
     */
    @Import(name="passCredentials")
    private @Nullable Output<Boolean> passCredentials;

    /**
     * @return If true then adds &#39;--pass-credentials&#39; to Helm commands to pass credentials to all domains.
     * 
     */
    public Optional<Output<Boolean>> passCredentials() {
        return Optional.ofNullable(this.passCredentials);
    }

    /**
     * Helm release name. If omitted it will use the application name.
     * 
     */
    @Import(name="releaseName")
    private @Nullable Output<String> releaseName;

    /**
     * @return Helm release name. If omitted it will use the application name.
     * 
     */
    public Optional<Output<String>> releaseName() {
        return Optional.ofNullable(this.releaseName);
    }

    /**
     * Whether to skip custom resource definition installation step (Helm&#39;s [--skip-crds](https://helm.sh/docs/chart_best_practices/custom_resource_definitions/)).
     * 
     */
    @Import(name="skipCrds")
    private @Nullable Output<Boolean> skipCrds;

    /**
     * @return Whether to skip custom resource definition installation step (Helm&#39;s [--skip-crds](https://helm.sh/docs/chart_best_practices/custom_resource_definitions/)).
     * 
     */
    public Optional<Output<Boolean>> skipCrds() {
        return Optional.ofNullable(this.skipCrds);
    }

    /**
     * List of Helm value files to use when generating a template.
     * 
     */
    @Import(name="valueFiles")
    private @Nullable Output<List<String>> valueFiles;

    /**
     * @return List of Helm value files to use when generating a template.
     * 
     */
    public Optional<Output<List<String>>> valueFiles() {
        return Optional.ofNullable(this.valueFiles);
    }

    /**
     * Helm values to be passed to &#39;helm template&#39;, typically defined as a block.
     * 
     */
    @Import(name="values")
    private @Nullable Output<String> values;

    /**
     * @return Helm values to be passed to &#39;helm template&#39;, typically defined as a block.
     * 
     */
    public Optional<Output<String>> values() {
        return Optional.ofNullable(this.values);
    }

    private GitopsApplicationsetApplicationsetSpecGeneratorListTemplateSpecSourceHelmArgs() {}

    private GitopsApplicationsetApplicationsetSpecGeneratorListTemplateSpecSourceHelmArgs(GitopsApplicationsetApplicationsetSpecGeneratorListTemplateSpecSourceHelmArgs $) {
        this.fileParameters = $.fileParameters;
        this.ignoreMissingValueFiles = $.ignoreMissingValueFiles;
        this.parameters = $.parameters;
        this.passCredentials = $.passCredentials;
        this.releaseName = $.releaseName;
        this.skipCrds = $.skipCrds;
        this.valueFiles = $.valueFiles;
        this.values = $.values;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GitopsApplicationsetApplicationsetSpecGeneratorListTemplateSpecSourceHelmArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GitopsApplicationsetApplicationsetSpecGeneratorListTemplateSpecSourceHelmArgs $;

        public Builder() {
            $ = new GitopsApplicationsetApplicationsetSpecGeneratorListTemplateSpecSourceHelmArgs();
        }

        public Builder(GitopsApplicationsetApplicationsetSpecGeneratorListTemplateSpecSourceHelmArgs defaults) {
            $ = new GitopsApplicationsetApplicationsetSpecGeneratorListTemplateSpecSourceHelmArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param fileParameters File parameters for the helm template.
         * 
         * @return builder
         * 
         */
        public Builder fileParameters(@Nullable Output<List<GitopsApplicationsetApplicationsetSpecGeneratorListTemplateSpecSourceHelmFileParameterArgs>> fileParameters) {
            $.fileParameters = fileParameters;
            return this;
        }

        /**
         * @param fileParameters File parameters for the helm template.
         * 
         * @return builder
         * 
         */
        public Builder fileParameters(List<GitopsApplicationsetApplicationsetSpecGeneratorListTemplateSpecSourceHelmFileParameterArgs> fileParameters) {
            return fileParameters(Output.of(fileParameters));
        }

        /**
         * @param fileParameters File parameters for the helm template.
         * 
         * @return builder
         * 
         */
        public Builder fileParameters(GitopsApplicationsetApplicationsetSpecGeneratorListTemplateSpecSourceHelmFileParameterArgs... fileParameters) {
            return fileParameters(List.of(fileParameters));
        }

        /**
         * @param ignoreMissingValueFiles Prevents &#39;helm template&#39; from failing when `value_files` do not exist locally by not appending them to &#39;helm template --values&#39;.
         * 
         * @return builder
         * 
         */
        public Builder ignoreMissingValueFiles(@Nullable Output<Boolean> ignoreMissingValueFiles) {
            $.ignoreMissingValueFiles = ignoreMissingValueFiles;
            return this;
        }

        /**
         * @param ignoreMissingValueFiles Prevents &#39;helm template&#39; from failing when `value_files` do not exist locally by not appending them to &#39;helm template --values&#39;.
         * 
         * @return builder
         * 
         */
        public Builder ignoreMissingValueFiles(Boolean ignoreMissingValueFiles) {
            return ignoreMissingValueFiles(Output.of(ignoreMissingValueFiles));
        }

        /**
         * @param parameters Helm parameters which are passed to the helm template command upon manifest generation.
         * 
         * @return builder
         * 
         */
        public Builder parameters(@Nullable Output<List<GitopsApplicationsetApplicationsetSpecGeneratorListTemplateSpecSourceHelmParameterArgs>> parameters) {
            $.parameters = parameters;
            return this;
        }

        /**
         * @param parameters Helm parameters which are passed to the helm template command upon manifest generation.
         * 
         * @return builder
         * 
         */
        public Builder parameters(List<GitopsApplicationsetApplicationsetSpecGeneratorListTemplateSpecSourceHelmParameterArgs> parameters) {
            return parameters(Output.of(parameters));
        }

        /**
         * @param parameters Helm parameters which are passed to the helm template command upon manifest generation.
         * 
         * @return builder
         * 
         */
        public Builder parameters(GitopsApplicationsetApplicationsetSpecGeneratorListTemplateSpecSourceHelmParameterArgs... parameters) {
            return parameters(List.of(parameters));
        }

        /**
         * @param passCredentials If true then adds &#39;--pass-credentials&#39; to Helm commands to pass credentials to all domains.
         * 
         * @return builder
         * 
         */
        public Builder passCredentials(@Nullable Output<Boolean> passCredentials) {
            $.passCredentials = passCredentials;
            return this;
        }

        /**
         * @param passCredentials If true then adds &#39;--pass-credentials&#39; to Helm commands to pass credentials to all domains.
         * 
         * @return builder
         * 
         */
        public Builder passCredentials(Boolean passCredentials) {
            return passCredentials(Output.of(passCredentials));
        }

        /**
         * @param releaseName Helm release name. If omitted it will use the application name.
         * 
         * @return builder
         * 
         */
        public Builder releaseName(@Nullable Output<String> releaseName) {
            $.releaseName = releaseName;
            return this;
        }

        /**
         * @param releaseName Helm release name. If omitted it will use the application name.
         * 
         * @return builder
         * 
         */
        public Builder releaseName(String releaseName) {
            return releaseName(Output.of(releaseName));
        }

        /**
         * @param skipCrds Whether to skip custom resource definition installation step (Helm&#39;s [--skip-crds](https://helm.sh/docs/chart_best_practices/custom_resource_definitions/)).
         * 
         * @return builder
         * 
         */
        public Builder skipCrds(@Nullable Output<Boolean> skipCrds) {
            $.skipCrds = skipCrds;
            return this;
        }

        /**
         * @param skipCrds Whether to skip custom resource definition installation step (Helm&#39;s [--skip-crds](https://helm.sh/docs/chart_best_practices/custom_resource_definitions/)).
         * 
         * @return builder
         * 
         */
        public Builder skipCrds(Boolean skipCrds) {
            return skipCrds(Output.of(skipCrds));
        }

        /**
         * @param valueFiles List of Helm value files to use when generating a template.
         * 
         * @return builder
         * 
         */
        public Builder valueFiles(@Nullable Output<List<String>> valueFiles) {
            $.valueFiles = valueFiles;
            return this;
        }

        /**
         * @param valueFiles List of Helm value files to use when generating a template.
         * 
         * @return builder
         * 
         */
        public Builder valueFiles(List<String> valueFiles) {
            return valueFiles(Output.of(valueFiles));
        }

        /**
         * @param valueFiles List of Helm value files to use when generating a template.
         * 
         * @return builder
         * 
         */
        public Builder valueFiles(String... valueFiles) {
            return valueFiles(List.of(valueFiles));
        }

        /**
         * @param values Helm values to be passed to &#39;helm template&#39;, typically defined as a block.
         * 
         * @return builder
         * 
         */
        public Builder values(@Nullable Output<String> values) {
            $.values = values;
            return this;
        }

        /**
         * @param values Helm values to be passed to &#39;helm template&#39;, typically defined as a block.
         * 
         * @return builder
         * 
         */
        public Builder values(String values) {
            return values(Output.of(values));
        }

        public GitopsApplicationsetApplicationsetSpecGeneratorListTemplateSpecSourceHelmArgs build() {
            return $;
        }
    }

}
