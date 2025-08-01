// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.harness.platform.outputs.GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMatrixTemplateSpecSourcePluginEnv;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMatrixTemplateSpecSourcePlugin {
    /**
     * @return Environment variables passed to the plugin.
     * 
     */
    private @Nullable List<GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMatrixTemplateSpecSourcePluginEnv> envs;
    /**
     * @return Name of the plugin. Only set the plugin name if the plugin is defined in `argocd-cm`. If the plugin is defined as a sidecar, omit the name. The plugin will be automatically matched with the Application according to the plugin&#39;s discovery rules.
     * 
     */
    private @Nullable String name;

    private GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMatrixTemplateSpecSourcePlugin() {}
    /**
     * @return Environment variables passed to the plugin.
     * 
     */
    public List<GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMatrixTemplateSpecSourcePluginEnv> envs() {
        return this.envs == null ? List.of() : this.envs;
    }
    /**
     * @return Name of the plugin. Only set the plugin name if the plugin is defined in `argocd-cm`. If the plugin is defined as a sidecar, omit the name. The plugin will be automatically matched with the Application according to the plugin&#39;s discovery rules.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMatrixTemplateSpecSourcePlugin defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMatrixTemplateSpecSourcePluginEnv> envs;
        private @Nullable String name;
        public Builder() {}
        public Builder(GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMatrixTemplateSpecSourcePlugin defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.envs = defaults.envs;
    	      this.name = defaults.name;
        }

        @CustomType.Setter
        public Builder envs(@Nullable List<GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMatrixTemplateSpecSourcePluginEnv> envs) {

            this.envs = envs;
            return this;
        }
        public Builder envs(GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMatrixTemplateSpecSourcePluginEnv... envs) {
            return envs(List.of(envs));
        }
        @CustomType.Setter
        public Builder name(@Nullable String name) {

            this.name = name;
            return this;
        }
        public GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMatrixTemplateSpecSourcePlugin build() {
            final var _resultValue = new GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMatrixTemplateSpecSourcePlugin();
            _resultValue.envs = envs;
            _resultValue.name = name;
            return _resultValue;
        }
    }
}
