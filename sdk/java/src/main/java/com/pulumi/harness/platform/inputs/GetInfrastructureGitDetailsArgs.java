// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;


public final class GetInfrastructureGitDetailsArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetInfrastructureGitDetailsArgs Empty = new GetInfrastructureGitDetailsArgs();

    /**
     * Name of the branch.
     * 
     */
    @Import(name="branch", required=true)
    private Output<String> branch;

    /**
     * @return Name of the branch.
     * 
     */
    public Output<String> branch() {
        return this.branch;
    }

    /**
     * If the Entity is to be fetched from cache
     * 
     */
    @Import(name="loadFromCache", required=true)
    private Output<String> loadFromCache;

    /**
     * @return If the Entity is to be fetched from cache
     * 
     */
    public Output<String> loadFromCache() {
        return this.loadFromCache;
    }

    /**
     * Load Infrastructure yaml from fallback branch
     * 
     */
    @Import(name="loadFromFallbackBranch", required=true)
    private Output<Boolean> loadFromFallbackBranch;

    /**
     * @return Load Infrastructure yaml from fallback branch
     * 
     */
    public Output<Boolean> loadFromFallbackBranch() {
        return this.loadFromFallbackBranch;
    }

    /**
     * Repo name of remote Infrastructure
     * 
     */
    @Import(name="repoName", required=true)
    private Output<String> repoName;

    /**
     * @return Repo name of remote Infrastructure
     * 
     */
    public Output<String> repoName() {
        return this.repoName;
    }

    private GetInfrastructureGitDetailsArgs() {}

    private GetInfrastructureGitDetailsArgs(GetInfrastructureGitDetailsArgs $) {
        this.branch = $.branch;
        this.loadFromCache = $.loadFromCache;
        this.loadFromFallbackBranch = $.loadFromFallbackBranch;
        this.repoName = $.repoName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetInfrastructureGitDetailsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetInfrastructureGitDetailsArgs $;

        public Builder() {
            $ = new GetInfrastructureGitDetailsArgs();
        }

        public Builder(GetInfrastructureGitDetailsArgs defaults) {
            $ = new GetInfrastructureGitDetailsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param branch Name of the branch.
         * 
         * @return builder
         * 
         */
        public Builder branch(Output<String> branch) {
            $.branch = branch;
            return this;
        }

        /**
         * @param branch Name of the branch.
         * 
         * @return builder
         * 
         */
        public Builder branch(String branch) {
            return branch(Output.of(branch));
        }

        /**
         * @param loadFromCache If the Entity is to be fetched from cache
         * 
         * @return builder
         * 
         */
        public Builder loadFromCache(Output<String> loadFromCache) {
            $.loadFromCache = loadFromCache;
            return this;
        }

        /**
         * @param loadFromCache If the Entity is to be fetched from cache
         * 
         * @return builder
         * 
         */
        public Builder loadFromCache(String loadFromCache) {
            return loadFromCache(Output.of(loadFromCache));
        }

        /**
         * @param loadFromFallbackBranch Load Infrastructure yaml from fallback branch
         * 
         * @return builder
         * 
         */
        public Builder loadFromFallbackBranch(Output<Boolean> loadFromFallbackBranch) {
            $.loadFromFallbackBranch = loadFromFallbackBranch;
            return this;
        }

        /**
         * @param loadFromFallbackBranch Load Infrastructure yaml from fallback branch
         * 
         * @return builder
         * 
         */
        public Builder loadFromFallbackBranch(Boolean loadFromFallbackBranch) {
            return loadFromFallbackBranch(Output.of(loadFromFallbackBranch));
        }

        /**
         * @param repoName Repo name of remote Infrastructure
         * 
         * @return builder
         * 
         */
        public Builder repoName(Output<String> repoName) {
            $.repoName = repoName;
            return this;
        }

        /**
         * @param repoName Repo name of remote Infrastructure
         * 
         * @return builder
         * 
         */
        public Builder repoName(String repoName) {
            return repoName(Output.of(repoName));
        }

        public GetInfrastructureGitDetailsArgs build() {
            if ($.branch == null) {
                throw new MissingRequiredPropertyException("GetInfrastructureGitDetailsArgs", "branch");
            }
            if ($.loadFromCache == null) {
                throw new MissingRequiredPropertyException("GetInfrastructureGitDetailsArgs", "loadFromCache");
            }
            if ($.loadFromFallbackBranch == null) {
                throw new MissingRequiredPropertyException("GetInfrastructureGitDetailsArgs", "loadFromFallbackBranch");
            }
            if ($.repoName == null) {
                throw new MissingRequiredPropertyException("GetInfrastructureGitDetailsArgs", "repoName");
            }
            return $;
        }
    }

}
