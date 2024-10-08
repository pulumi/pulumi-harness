// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;


public final class GetEnvironmentGitDetailsArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetEnvironmentGitDetailsArgs Empty = new GetEnvironmentGitDetailsArgs();

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
     * Load environment yaml from fallback branch
     * 
     */
    @Import(name="loadFromFallbackBranch", required=true)
    private Output<Boolean> loadFromFallbackBranch;

    /**
     * @return Load environment yaml from fallback branch
     * 
     */
    public Output<Boolean> loadFromFallbackBranch() {
        return this.loadFromFallbackBranch;
    }

    /**
     * Repo name of remote environment
     * 
     */
    @Import(name="repoName", required=true)
    private Output<String> repoName;

    /**
     * @return Repo name of remote environment
     * 
     */
    public Output<String> repoName() {
        return this.repoName;
    }

    private GetEnvironmentGitDetailsArgs() {}

    private GetEnvironmentGitDetailsArgs(GetEnvironmentGitDetailsArgs $) {
        this.branch = $.branch;
        this.loadFromFallbackBranch = $.loadFromFallbackBranch;
        this.repoName = $.repoName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetEnvironmentGitDetailsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetEnvironmentGitDetailsArgs $;

        public Builder() {
            $ = new GetEnvironmentGitDetailsArgs();
        }

        public Builder(GetEnvironmentGitDetailsArgs defaults) {
            $ = new GetEnvironmentGitDetailsArgs(Objects.requireNonNull(defaults));
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
         * @param loadFromFallbackBranch Load environment yaml from fallback branch
         * 
         * @return builder
         * 
         */
        public Builder loadFromFallbackBranch(Output<Boolean> loadFromFallbackBranch) {
            $.loadFromFallbackBranch = loadFromFallbackBranch;
            return this;
        }

        /**
         * @param loadFromFallbackBranch Load environment yaml from fallback branch
         * 
         * @return builder
         * 
         */
        public Builder loadFromFallbackBranch(Boolean loadFromFallbackBranch) {
            return loadFromFallbackBranch(Output.of(loadFromFallbackBranch));
        }

        /**
         * @param repoName Repo name of remote environment
         * 
         * @return builder
         * 
         */
        public Builder repoName(Output<String> repoName) {
            $.repoName = repoName;
            return this;
        }

        /**
         * @param repoName Repo name of remote environment
         * 
         * @return builder
         * 
         */
        public Builder repoName(String repoName) {
            return repoName(Output.of(repoName));
        }

        public GetEnvironmentGitDetailsArgs build() {
            if ($.branch == null) {
                throw new MissingRequiredPropertyException("GetEnvironmentGitDetailsArgs", "branch");
            }
            if ($.loadFromFallbackBranch == null) {
                throw new MissingRequiredPropertyException("GetEnvironmentGitDetailsArgs", "loadFromFallbackBranch");
            }
            if ($.repoName == null) {
                throw new MissingRequiredPropertyException("GetEnvironmentGitDetailsArgs", "repoName");
            }
            return $;
        }
    }

}