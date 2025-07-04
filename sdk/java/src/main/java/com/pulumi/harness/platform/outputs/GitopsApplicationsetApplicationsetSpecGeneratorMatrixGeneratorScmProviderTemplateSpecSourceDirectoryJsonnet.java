// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.harness.platform.outputs.GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorScmProviderTemplateSpecSourceDirectoryJsonnetExtVar;
import com.pulumi.harness.platform.outputs.GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorScmProviderTemplateSpecSourceDirectoryJsonnetTla;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorScmProviderTemplateSpecSourceDirectoryJsonnet {
    /**
     * @return List of Jsonnet External Variables.
     * 
     */
    private @Nullable List<GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorScmProviderTemplateSpecSourceDirectoryJsonnetExtVar> extVars;
    /**
     * @return Additional library search dirs.
     * 
     */
    private @Nullable List<String> libs;
    /**
     * @return List of Jsonnet Top-level Arguments
     * 
     */
    private @Nullable List<GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorScmProviderTemplateSpecSourceDirectoryJsonnetTla> tlas;

    private GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorScmProviderTemplateSpecSourceDirectoryJsonnet() {}
    /**
     * @return List of Jsonnet External Variables.
     * 
     */
    public List<GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorScmProviderTemplateSpecSourceDirectoryJsonnetExtVar> extVars() {
        return this.extVars == null ? List.of() : this.extVars;
    }
    /**
     * @return Additional library search dirs.
     * 
     */
    public List<String> libs() {
        return this.libs == null ? List.of() : this.libs;
    }
    /**
     * @return List of Jsonnet Top-level Arguments
     * 
     */
    public List<GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorScmProviderTemplateSpecSourceDirectoryJsonnetTla> tlas() {
        return this.tlas == null ? List.of() : this.tlas;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorScmProviderTemplateSpecSourceDirectoryJsonnet defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorScmProviderTemplateSpecSourceDirectoryJsonnetExtVar> extVars;
        private @Nullable List<String> libs;
        private @Nullable List<GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorScmProviderTemplateSpecSourceDirectoryJsonnetTla> tlas;
        public Builder() {}
        public Builder(GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorScmProviderTemplateSpecSourceDirectoryJsonnet defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.extVars = defaults.extVars;
    	      this.libs = defaults.libs;
    	      this.tlas = defaults.tlas;
        }

        @CustomType.Setter
        public Builder extVars(@Nullable List<GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorScmProviderTemplateSpecSourceDirectoryJsonnetExtVar> extVars) {

            this.extVars = extVars;
            return this;
        }
        public Builder extVars(GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorScmProviderTemplateSpecSourceDirectoryJsonnetExtVar... extVars) {
            return extVars(List.of(extVars));
        }
        @CustomType.Setter
        public Builder libs(@Nullable List<String> libs) {

            this.libs = libs;
            return this;
        }
        public Builder libs(String... libs) {
            return libs(List.of(libs));
        }
        @CustomType.Setter
        public Builder tlas(@Nullable List<GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorScmProviderTemplateSpecSourceDirectoryJsonnetTla> tlas) {

            this.tlas = tlas;
            return this;
        }
        public Builder tlas(GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorScmProviderTemplateSpecSourceDirectoryJsonnetTla... tlas) {
            return tlas(List.of(tlas));
        }
        public GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorScmProviderTemplateSpecSourceDirectoryJsonnet build() {
            final var _resultValue = new GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorScmProviderTemplateSpecSourceDirectoryJsonnet();
            _resultValue.extVars = extVars;
            _resultValue.libs = libs;
            _resultValue.tlas = tlas;
            return _resultValue;
        }
    }
}
