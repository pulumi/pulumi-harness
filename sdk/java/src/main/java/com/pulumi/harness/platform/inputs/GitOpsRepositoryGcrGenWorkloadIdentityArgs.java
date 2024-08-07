// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.harness.platform.inputs.GitOpsRepositoryGcrGenWorkloadIdentityServiceAccountRefArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GitOpsRepositoryGcrGenWorkloadIdentityArgs extends com.pulumi.resources.ResourceArgs {

    public static final GitOpsRepositoryGcrGenWorkloadIdentityArgs Empty = new GitOpsRepositoryGcrGenWorkloadIdentityArgs();

    /**
     * Cluster location.
     * 
     */
    @Import(name="clusterLocation")
    private @Nullable Output<String> clusterLocation;

    /**
     * @return Cluster location.
     * 
     */
    public Optional<Output<String>> clusterLocation() {
        return Optional.ofNullable(this.clusterLocation);
    }

    /**
     * Cluster name.
     * 
     */
    @Import(name="clusterName")
    private @Nullable Output<String> clusterName;

    /**
     * @return Cluster name.
     * 
     */
    public Optional<Output<String>> clusterName() {
        return Optional.ofNullable(this.clusterName);
    }

    /**
     * Cluster project id.
     * 
     */
    @Import(name="clusterProjectId")
    private @Nullable Output<String> clusterProjectId;

    /**
     * @return Cluster project id.
     * 
     */
    public Optional<Output<String>> clusterProjectId() {
        return Optional.ofNullable(this.clusterProjectId);
    }

    /**
     * Service account reference.
     * 
     */
    @Import(name="serviceAccountRef")
    private @Nullable Output<GitOpsRepositoryGcrGenWorkloadIdentityServiceAccountRefArgs> serviceAccountRef;

    /**
     * @return Service account reference.
     * 
     */
    public Optional<Output<GitOpsRepositoryGcrGenWorkloadIdentityServiceAccountRefArgs>> serviceAccountRef() {
        return Optional.ofNullable(this.serviceAccountRef);
    }

    private GitOpsRepositoryGcrGenWorkloadIdentityArgs() {}

    private GitOpsRepositoryGcrGenWorkloadIdentityArgs(GitOpsRepositoryGcrGenWorkloadIdentityArgs $) {
        this.clusterLocation = $.clusterLocation;
        this.clusterName = $.clusterName;
        this.clusterProjectId = $.clusterProjectId;
        this.serviceAccountRef = $.serviceAccountRef;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GitOpsRepositoryGcrGenWorkloadIdentityArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GitOpsRepositoryGcrGenWorkloadIdentityArgs $;

        public Builder() {
            $ = new GitOpsRepositoryGcrGenWorkloadIdentityArgs();
        }

        public Builder(GitOpsRepositoryGcrGenWorkloadIdentityArgs defaults) {
            $ = new GitOpsRepositoryGcrGenWorkloadIdentityArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param clusterLocation Cluster location.
         * 
         * @return builder
         * 
         */
        public Builder clusterLocation(@Nullable Output<String> clusterLocation) {
            $.clusterLocation = clusterLocation;
            return this;
        }

        /**
         * @param clusterLocation Cluster location.
         * 
         * @return builder
         * 
         */
        public Builder clusterLocation(String clusterLocation) {
            return clusterLocation(Output.of(clusterLocation));
        }

        /**
         * @param clusterName Cluster name.
         * 
         * @return builder
         * 
         */
        public Builder clusterName(@Nullable Output<String> clusterName) {
            $.clusterName = clusterName;
            return this;
        }

        /**
         * @param clusterName Cluster name.
         * 
         * @return builder
         * 
         */
        public Builder clusterName(String clusterName) {
            return clusterName(Output.of(clusterName));
        }

        /**
         * @param clusterProjectId Cluster project id.
         * 
         * @return builder
         * 
         */
        public Builder clusterProjectId(@Nullable Output<String> clusterProjectId) {
            $.clusterProjectId = clusterProjectId;
            return this;
        }

        /**
         * @param clusterProjectId Cluster project id.
         * 
         * @return builder
         * 
         */
        public Builder clusterProjectId(String clusterProjectId) {
            return clusterProjectId(Output.of(clusterProjectId));
        }

        /**
         * @param serviceAccountRef Service account reference.
         * 
         * @return builder
         * 
         */
        public Builder serviceAccountRef(@Nullable Output<GitOpsRepositoryGcrGenWorkloadIdentityServiceAccountRefArgs> serviceAccountRef) {
            $.serviceAccountRef = serviceAccountRef;
            return this;
        }

        /**
         * @param serviceAccountRef Service account reference.
         * 
         * @return builder
         * 
         */
        public Builder serviceAccountRef(GitOpsRepositoryGcrGenWorkloadIdentityServiceAccountRefArgs serviceAccountRef) {
            return serviceAccountRef(Output.of(serviceAccountRef));
        }

        public GitOpsRepositoryGcrGenWorkloadIdentityArgs build() {
            return $;
        }
    }

}
