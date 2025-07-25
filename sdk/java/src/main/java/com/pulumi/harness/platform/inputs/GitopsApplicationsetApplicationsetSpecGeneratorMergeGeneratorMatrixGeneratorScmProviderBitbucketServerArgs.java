// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.harness.platform.inputs.GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMatrixGeneratorScmProviderBitbucketServerBasicAuthArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMatrixGeneratorScmProviderBitbucketServerArgs extends com.pulumi.resources.ResourceArgs {

    public static final GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMatrixGeneratorScmProviderBitbucketServerArgs Empty = new GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMatrixGeneratorScmProviderBitbucketServerArgs();

    /**
     * Scan all branches instead of just the default branch.
     * 
     */
    @Import(name="allBranches")
    private @Nullable Output<Boolean> allBranches;

    /**
     * @return Scan all branches instead of just the default branch.
     * 
     */
    public Optional<Output<Boolean>> allBranches() {
        return Optional.ofNullable(this.allBranches);
    }

    /**
     * The Bitbucket REST API URL to talk to e.g. https://bitbucket.org/rest.
     * 
     */
    @Import(name="api", required=true)
    private Output<String> api;

    /**
     * @return The Bitbucket REST API URL to talk to e.g. https://bitbucket.org/rest.
     * 
     */
    public Output<String> api() {
        return this.api;
    }

    /**
     * Credentials for Basic auth.
     * 
     */
    @Import(name="basicAuth")
    private @Nullable Output<GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMatrixGeneratorScmProviderBitbucketServerBasicAuthArgs> basicAuth;

    /**
     * @return Credentials for Basic auth.
     * 
     */
    public Optional<Output<GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMatrixGeneratorScmProviderBitbucketServerBasicAuthArgs>> basicAuth() {
        return Optional.ofNullable(this.basicAuth);
    }

    /**
     * Project to scan.
     * 
     */
    @Import(name="project", required=true)
    private Output<String> project;

    /**
     * @return Project to scan.
     * 
     */
    public Output<String> project() {
        return this.project;
    }

    private GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMatrixGeneratorScmProviderBitbucketServerArgs() {}

    private GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMatrixGeneratorScmProviderBitbucketServerArgs(GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMatrixGeneratorScmProviderBitbucketServerArgs $) {
        this.allBranches = $.allBranches;
        this.api = $.api;
        this.basicAuth = $.basicAuth;
        this.project = $.project;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMatrixGeneratorScmProviderBitbucketServerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMatrixGeneratorScmProviderBitbucketServerArgs $;

        public Builder() {
            $ = new GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMatrixGeneratorScmProviderBitbucketServerArgs();
        }

        public Builder(GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMatrixGeneratorScmProviderBitbucketServerArgs defaults) {
            $ = new GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMatrixGeneratorScmProviderBitbucketServerArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param allBranches Scan all branches instead of just the default branch.
         * 
         * @return builder
         * 
         */
        public Builder allBranches(@Nullable Output<Boolean> allBranches) {
            $.allBranches = allBranches;
            return this;
        }

        /**
         * @param allBranches Scan all branches instead of just the default branch.
         * 
         * @return builder
         * 
         */
        public Builder allBranches(Boolean allBranches) {
            return allBranches(Output.of(allBranches));
        }

        /**
         * @param api The Bitbucket REST API URL to talk to e.g. https://bitbucket.org/rest.
         * 
         * @return builder
         * 
         */
        public Builder api(Output<String> api) {
            $.api = api;
            return this;
        }

        /**
         * @param api The Bitbucket REST API URL to talk to e.g. https://bitbucket.org/rest.
         * 
         * @return builder
         * 
         */
        public Builder api(String api) {
            return api(Output.of(api));
        }

        /**
         * @param basicAuth Credentials for Basic auth.
         * 
         * @return builder
         * 
         */
        public Builder basicAuth(@Nullable Output<GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMatrixGeneratorScmProviderBitbucketServerBasicAuthArgs> basicAuth) {
            $.basicAuth = basicAuth;
            return this;
        }

        /**
         * @param basicAuth Credentials for Basic auth.
         * 
         * @return builder
         * 
         */
        public Builder basicAuth(GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMatrixGeneratorScmProviderBitbucketServerBasicAuthArgs basicAuth) {
            return basicAuth(Output.of(basicAuth));
        }

        /**
         * @param project Project to scan.
         * 
         * @return builder
         * 
         */
        public Builder project(Output<String> project) {
            $.project = project;
            return this;
        }

        /**
         * @param project Project to scan.
         * 
         * @return builder
         * 
         */
        public Builder project(String project) {
            return project(Output.of(project));
        }

        public GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMatrixGeneratorScmProviderBitbucketServerArgs build() {
            if ($.api == null) {
                throw new MissingRequiredPropertyException("GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMatrixGeneratorScmProviderBitbucketServerArgs", "api");
            }
            if ($.project == null) {
                throw new MissingRequiredPropertyException("GitopsApplicationsetApplicationsetSpecGeneratorMergeGeneratorMatrixGeneratorScmProviderBitbucketServerArgs", "project");
            }
            return $;
        }
    }

}
