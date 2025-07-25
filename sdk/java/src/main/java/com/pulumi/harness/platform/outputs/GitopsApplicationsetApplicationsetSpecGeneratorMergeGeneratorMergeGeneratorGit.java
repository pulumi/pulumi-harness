// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.harness.platform.outputs.GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMergeGeneratorGitDirectory;
import com.pulumi.harness.platform.outputs.GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMergeGeneratorGitFile;
import com.pulumi.harness.platform.outputs.GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMergeGeneratorGitTemplate;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMergeGeneratorGit {
    /**
     * @return List of directories in the source repository to use when template the Application..
     * 
     */
    private @Nullable List<GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMergeGeneratorGitDirectory> directories;
    /**
     * @return List of files in the source repository to use when template the Application.
     * 
     */
    private @Nullable List<GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMergeGeneratorGitFile> files;
    /**
     * @return Prefix for all path-related parameter names.
     * 
     */
    private @Nullable String pathParamPrefix;
    /**
     * @return URL to the repository to use.
     * 
     */
    private String repoUrl;
    /**
     * @return Revision of the source repository to use.
     * 
     */
    private @Nullable String revision;
    /**
     * @return Generator template. Used to override the values of the spec-level template.
     * 
     */
    private @Nullable GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMergeGeneratorGitTemplate template;

    private GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMergeGeneratorGit() {}
    /**
     * @return List of directories in the source repository to use when template the Application..
     * 
     */
    public List<GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMergeGeneratorGitDirectory> directories() {
        return this.directories == null ? List.of() : this.directories;
    }
    /**
     * @return List of files in the source repository to use when template the Application.
     * 
     */
    public List<GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMergeGeneratorGitFile> files() {
        return this.files == null ? List.of() : this.files;
    }
    /**
     * @return Prefix for all path-related parameter names.
     * 
     */
    public Optional<String> pathParamPrefix() {
        return Optional.ofNullable(this.pathParamPrefix);
    }
    /**
     * @return URL to the repository to use.
     * 
     */
    public String repoUrl() {
        return this.repoUrl;
    }
    /**
     * @return Revision of the source repository to use.
     * 
     */
    public Optional<String> revision() {
        return Optional.ofNullable(this.revision);
    }
    /**
     * @return Generator template. Used to override the values of the spec-level template.
     * 
     */
    public Optional<GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMergeGeneratorGitTemplate> template() {
        return Optional.ofNullable(this.template);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMergeGeneratorGit defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMergeGeneratorGitDirectory> directories;
        private @Nullable List<GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMergeGeneratorGitFile> files;
        private @Nullable String pathParamPrefix;
        private String repoUrl;
        private @Nullable String revision;
        private @Nullable GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMergeGeneratorGitTemplate template;
        public Builder() {}
        public Builder(GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMergeGeneratorGit defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.directories = defaults.directories;
    	      this.files = defaults.files;
    	      this.pathParamPrefix = defaults.pathParamPrefix;
    	      this.repoUrl = defaults.repoUrl;
    	      this.revision = defaults.revision;
    	      this.template = defaults.template;
        }

        @CustomType.Setter
        public Builder directories(@Nullable List<GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMergeGeneratorGitDirectory> directories) {

            this.directories = directories;
            return this;
        }
        public Builder directories(GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMergeGeneratorGitDirectory... directories) {
            return directories(List.of(directories));
        }
        @CustomType.Setter
        public Builder files(@Nullable List<GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMergeGeneratorGitFile> files) {

            this.files = files;
            return this;
        }
        public Builder files(GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMergeGeneratorGitFile... files) {
            return files(List.of(files));
        }
        @CustomType.Setter
        public Builder pathParamPrefix(@Nullable String pathParamPrefix) {

            this.pathParamPrefix = pathParamPrefix;
            return this;
        }
        @CustomType.Setter
        public Builder repoUrl(String repoUrl) {
            if (repoUrl == null) {
              throw new MissingRequiredPropertyException("GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMergeGeneratorGit", "repoUrl");
            }
            this.repoUrl = repoUrl;
            return this;
        }
        @CustomType.Setter
        public Builder revision(@Nullable String revision) {

            this.revision = revision;
            return this;
        }
        @CustomType.Setter
        public Builder template(@Nullable GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMergeGeneratorGitTemplate template) {

            this.template = template;
            return this;
        }
        public GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMergeGeneratorGit build() {
            final var _resultValue = new GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMergeGeneratorGit();
            _resultValue.directories = directories;
            _resultValue.files = files;
            _resultValue.pathParamPrefix = pathParamPrefix;
            _resultValue.repoUrl = repoUrl;
            _resultValue.revision = revision;
            _resultValue.template = template;
            return _resultValue;
        }
    }
}
