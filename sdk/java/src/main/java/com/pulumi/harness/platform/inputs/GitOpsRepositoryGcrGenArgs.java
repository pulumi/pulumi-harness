// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.harness.platform.inputs.GitOpsRepositoryGcrGenWorkloadIdentityArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GitOpsRepositoryGcrGenArgs extends com.pulumi.resources.ResourceArgs {

    public static final GitOpsRepositoryGcrGenArgs Empty = new GitOpsRepositoryGcrGenArgs();

    /**
     * GCP access key.
     * 
     */
    @Import(name="accessKey")
    private @Nullable Output<String> accessKey;

    /**
     * @return GCP access key.
     * 
     */
    public Optional<Output<String>> accessKey() {
        return Optional.ofNullable(this.accessKey);
    }

    /**
     * GCP project id.
     * 
     */
    @Import(name="projectId")
    private @Nullable Output<String> projectId;

    /**
     * @return GCP project id.
     * 
     */
    public Optional<Output<String>> projectId() {
        return Optional.ofNullable(this.projectId);
    }

    /**
     * GCP workload identity.
     * 
     */
    @Import(name="workloadIdentity")
    private @Nullable Output<GitOpsRepositoryGcrGenWorkloadIdentityArgs> workloadIdentity;

    /**
     * @return GCP workload identity.
     * 
     */
    public Optional<Output<GitOpsRepositoryGcrGenWorkloadIdentityArgs>> workloadIdentity() {
        return Optional.ofNullable(this.workloadIdentity);
    }

    private GitOpsRepositoryGcrGenArgs() {}

    private GitOpsRepositoryGcrGenArgs(GitOpsRepositoryGcrGenArgs $) {
        this.accessKey = $.accessKey;
        this.projectId = $.projectId;
        this.workloadIdentity = $.workloadIdentity;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GitOpsRepositoryGcrGenArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GitOpsRepositoryGcrGenArgs $;

        public Builder() {
            $ = new GitOpsRepositoryGcrGenArgs();
        }

        public Builder(GitOpsRepositoryGcrGenArgs defaults) {
            $ = new GitOpsRepositoryGcrGenArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accessKey GCP access key.
         * 
         * @return builder
         * 
         */
        public Builder accessKey(@Nullable Output<String> accessKey) {
            $.accessKey = accessKey;
            return this;
        }

        /**
         * @param accessKey GCP access key.
         * 
         * @return builder
         * 
         */
        public Builder accessKey(String accessKey) {
            return accessKey(Output.of(accessKey));
        }

        /**
         * @param projectId GCP project id.
         * 
         * @return builder
         * 
         */
        public Builder projectId(@Nullable Output<String> projectId) {
            $.projectId = projectId;
            return this;
        }

        /**
         * @param projectId GCP project id.
         * 
         * @return builder
         * 
         */
        public Builder projectId(String projectId) {
            return projectId(Output.of(projectId));
        }

        /**
         * @param workloadIdentity GCP workload identity.
         * 
         * @return builder
         * 
         */
        public Builder workloadIdentity(@Nullable Output<GitOpsRepositoryGcrGenWorkloadIdentityArgs> workloadIdentity) {
            $.workloadIdentity = workloadIdentity;
            return this;
        }

        /**
         * @param workloadIdentity GCP workload identity.
         * 
         * @return builder
         * 
         */
        public Builder workloadIdentity(GitOpsRepositoryGcrGenWorkloadIdentityArgs workloadIdentity) {
            return workloadIdentity(Output.of(workloadIdentity));
        }

        public GitOpsRepositoryGcrGenArgs build() {
            return $;
        }
    }

}
