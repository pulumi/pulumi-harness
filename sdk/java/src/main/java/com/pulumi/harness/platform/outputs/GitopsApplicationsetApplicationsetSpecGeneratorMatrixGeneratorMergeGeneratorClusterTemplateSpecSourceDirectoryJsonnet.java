// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.harness.platform.outputs.GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMergeGeneratorClusterTemplateSpecSourceDirectoryJsonnetExtVar;
import com.pulumi.harness.platform.outputs.GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMergeGeneratorClusterTemplateSpecSourceDirectoryJsonnetTla;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMergeGeneratorClusterTemplateSpecSourceDirectoryJsonnet {
    /**
     * @return List of Jsonnet External Variables.
     * 
     */
    private @Nullable List<GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMergeGeneratorClusterTemplateSpecSourceDirectoryJsonnetExtVar> extVars;
    /**
     * @return Additional library search dirs.
     * 
     */
    private @Nullable List<String> libs;
    /**
     * @return List of Jsonnet Top-level Arguments
     * 
     */
    private @Nullable List<GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMergeGeneratorClusterTemplateSpecSourceDirectoryJsonnetTla> tlas;

    private GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMergeGeneratorClusterTemplateSpecSourceDirectoryJsonnet() {}
    /**
     * @return List of Jsonnet External Variables.
     * 
     */
    public List<GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMergeGeneratorClusterTemplateSpecSourceDirectoryJsonnetExtVar> extVars() {
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
    public List<GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMergeGeneratorClusterTemplateSpecSourceDirectoryJsonnetTla> tlas() {
        return this.tlas == null ? List.of() : this.tlas;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMergeGeneratorClusterTemplateSpecSourceDirectoryJsonnet defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMergeGeneratorClusterTemplateSpecSourceDirectoryJsonnetExtVar> extVars;
        private @Nullable List<String> libs;
        private @Nullable List<GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMergeGeneratorClusterTemplateSpecSourceDirectoryJsonnetTla> tlas;
        public Builder() {}
        public Builder(GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMergeGeneratorClusterTemplateSpecSourceDirectoryJsonnet defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.extVars = defaults.extVars;
    	      this.libs = defaults.libs;
    	      this.tlas = defaults.tlas;
        }

        @CustomType.Setter
        public Builder extVars(@Nullable List<GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMergeGeneratorClusterTemplateSpecSourceDirectoryJsonnetExtVar> extVars) {

            this.extVars = extVars;
            return this;
        }
        public Builder extVars(GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMergeGeneratorClusterTemplateSpecSourceDirectoryJsonnetExtVar... extVars) {
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
        public Builder tlas(@Nullable List<GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMergeGeneratorClusterTemplateSpecSourceDirectoryJsonnetTla> tlas) {

            this.tlas = tlas;
            return this;
        }
        public Builder tlas(GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMergeGeneratorClusterTemplateSpecSourceDirectoryJsonnetTla... tlas) {
            return tlas(List.of(tlas));
        }
        public GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMergeGeneratorClusterTemplateSpecSourceDirectoryJsonnet build() {
            final var _resultValue = new GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMergeGeneratorClusterTemplateSpecSourceDirectoryJsonnet();
            _resultValue.extVars = extVars;
            _resultValue.libs = libs;
            _resultValue.tlas = tlas;
            return _resultValue;
        }
    }
}
