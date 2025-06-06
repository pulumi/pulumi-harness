// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class PipelineGitDetails {
    /**
     * @return Name of the default branch (this checks out a new branch titled by branch_name).
     * 
     */
    private @Nullable String baseBranch;
    /**
     * @return Name of the branch.
     * 
     */
    private @Nullable String branchName;
    /**
     * @return Commit message used for the merge commit.
     * 
     */
    private @Nullable String commitMessage;
    /**
     * @return Identifier of the Harness Connector used for CRUD operations on the Entity. To reference a connector at the organization scope, prefix &#39;org&#39; to the expression: org.{identifier}. To reference a connector at the account scope, prefix &#39;account` to the expression: account.{identifier}.
     * 
     */
    private @Nullable String connectorRef;
    /**
     * @return File path of the Entity in the repository.
     * 
     */
    private @Nullable String filePath;
    /**
     * @return If the repo is harness code.
     * 
     */
    private @Nullable Boolean isHarnessCodeRepo;
    /**
     * @return Last commit identifier (for Git Repositories other than Github). To be provided only when updating Pipeline.
     * 
     */
    private @Nullable String lastCommitId;
    /**
     * @return Last object identifier (for Github). To be provided only when updating Pipeline.
     * 
     */
    private @Nullable String lastObjectId;
    /**
     * @return Name of the repository.
     * 
     */
    private @Nullable String repoName;
    /**
     * @return Specifies whether the Entity is to be stored in Git or not. Possible values: INLINE, REMOTE.
     * 
     */
    private @Nullable String storeType;

    private PipelineGitDetails() {}
    /**
     * @return Name of the default branch (this checks out a new branch titled by branch_name).
     * 
     */
    public Optional<String> baseBranch() {
        return Optional.ofNullable(this.baseBranch);
    }
    /**
     * @return Name of the branch.
     * 
     */
    public Optional<String> branchName() {
        return Optional.ofNullable(this.branchName);
    }
    /**
     * @return Commit message used for the merge commit.
     * 
     */
    public Optional<String> commitMessage() {
        return Optional.ofNullable(this.commitMessage);
    }
    /**
     * @return Identifier of the Harness Connector used for CRUD operations on the Entity. To reference a connector at the organization scope, prefix &#39;org&#39; to the expression: org.{identifier}. To reference a connector at the account scope, prefix &#39;account` to the expression: account.{identifier}.
     * 
     */
    public Optional<String> connectorRef() {
        return Optional.ofNullable(this.connectorRef);
    }
    /**
     * @return File path of the Entity in the repository.
     * 
     */
    public Optional<String> filePath() {
        return Optional.ofNullable(this.filePath);
    }
    /**
     * @return If the repo is harness code.
     * 
     */
    public Optional<Boolean> isHarnessCodeRepo() {
        return Optional.ofNullable(this.isHarnessCodeRepo);
    }
    /**
     * @return Last commit identifier (for Git Repositories other than Github). To be provided only when updating Pipeline.
     * 
     */
    public Optional<String> lastCommitId() {
        return Optional.ofNullable(this.lastCommitId);
    }
    /**
     * @return Last object identifier (for Github). To be provided only when updating Pipeline.
     * 
     */
    public Optional<String> lastObjectId() {
        return Optional.ofNullable(this.lastObjectId);
    }
    /**
     * @return Name of the repository.
     * 
     */
    public Optional<String> repoName() {
        return Optional.ofNullable(this.repoName);
    }
    /**
     * @return Specifies whether the Entity is to be stored in Git or not. Possible values: INLINE, REMOTE.
     * 
     */
    public Optional<String> storeType() {
        return Optional.ofNullable(this.storeType);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PipelineGitDetails defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String baseBranch;
        private @Nullable String branchName;
        private @Nullable String commitMessage;
        private @Nullable String connectorRef;
        private @Nullable String filePath;
        private @Nullable Boolean isHarnessCodeRepo;
        private @Nullable String lastCommitId;
        private @Nullable String lastObjectId;
        private @Nullable String repoName;
        private @Nullable String storeType;
        public Builder() {}
        public Builder(PipelineGitDetails defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.baseBranch = defaults.baseBranch;
    	      this.branchName = defaults.branchName;
    	      this.commitMessage = defaults.commitMessage;
    	      this.connectorRef = defaults.connectorRef;
    	      this.filePath = defaults.filePath;
    	      this.isHarnessCodeRepo = defaults.isHarnessCodeRepo;
    	      this.lastCommitId = defaults.lastCommitId;
    	      this.lastObjectId = defaults.lastObjectId;
    	      this.repoName = defaults.repoName;
    	      this.storeType = defaults.storeType;
        }

        @CustomType.Setter
        public Builder baseBranch(@Nullable String baseBranch) {

            this.baseBranch = baseBranch;
            return this;
        }
        @CustomType.Setter
        public Builder branchName(@Nullable String branchName) {

            this.branchName = branchName;
            return this;
        }
        @CustomType.Setter
        public Builder commitMessage(@Nullable String commitMessage) {

            this.commitMessage = commitMessage;
            return this;
        }
        @CustomType.Setter
        public Builder connectorRef(@Nullable String connectorRef) {

            this.connectorRef = connectorRef;
            return this;
        }
        @CustomType.Setter
        public Builder filePath(@Nullable String filePath) {

            this.filePath = filePath;
            return this;
        }
        @CustomType.Setter
        public Builder isHarnessCodeRepo(@Nullable Boolean isHarnessCodeRepo) {

            this.isHarnessCodeRepo = isHarnessCodeRepo;
            return this;
        }
        @CustomType.Setter
        public Builder lastCommitId(@Nullable String lastCommitId) {

            this.lastCommitId = lastCommitId;
            return this;
        }
        @CustomType.Setter
        public Builder lastObjectId(@Nullable String lastObjectId) {

            this.lastObjectId = lastObjectId;
            return this;
        }
        @CustomType.Setter
        public Builder repoName(@Nullable String repoName) {

            this.repoName = repoName;
            return this;
        }
        @CustomType.Setter
        public Builder storeType(@Nullable String storeType) {

            this.storeType = storeType;
            return this;
        }
        public PipelineGitDetails build() {
            final var _resultValue = new PipelineGitDetails();
            _resultValue.baseBranch = baseBranch;
            _resultValue.branchName = branchName;
            _resultValue.commitMessage = commitMessage;
            _resultValue.connectorRef = connectorRef;
            _resultValue.filePath = filePath;
            _resultValue.isHarnessCodeRepo = isHarnessCodeRepo;
            _resultValue.lastCommitId = lastCommitId;
            _resultValue.lastObjectId = lastObjectId;
            _resultValue.repoName = repoName;
            _resultValue.storeType = storeType;
            return _resultValue;
        }
    }
}
