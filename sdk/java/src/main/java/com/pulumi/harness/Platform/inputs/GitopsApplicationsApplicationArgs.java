// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.harness.platform.inputs.GitopsApplicationsApplicationMetadataArgs;
import com.pulumi.harness.platform.inputs.GitopsApplicationsApplicationSpecArgs;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GitopsApplicationsApplicationArgs extends com.pulumi.resources.ResourceArgs {

    public static final GitopsApplicationsApplicationArgs Empty = new GitopsApplicationsApplicationArgs();

    /**
     * Metadata corresponding to the resources. This includes all the objects a user must create.
     * 
     */
    @Import(name="metadatas", required=true)
    private Output<List<GitopsApplicationsApplicationMetadataArgs>> metadatas;

    /**
     * @return Metadata corresponding to the resources. This includes all the objects a user must create.
     * 
     */
    public Output<List<GitopsApplicationsApplicationMetadataArgs>> metadatas() {
        return this.metadatas;
    }

    /**
     * Specifications of the GitOps application. This includes the repository URL, application definition, source, destination and sync policy.
     * 
     */
    @Import(name="specs")
    private @Nullable Output<List<GitopsApplicationsApplicationSpecArgs>> specs;

    /**
     * @return Specifications of the GitOps application. This includes the repository URL, application definition, source, destination and sync policy.
     * 
     */
    public Optional<Output<List<GitopsApplicationsApplicationSpecArgs>>> specs() {
        return Optional.ofNullable(this.specs);
    }

    private GitopsApplicationsApplicationArgs() {}

    private GitopsApplicationsApplicationArgs(GitopsApplicationsApplicationArgs $) {
        this.metadatas = $.metadatas;
        this.specs = $.specs;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GitopsApplicationsApplicationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GitopsApplicationsApplicationArgs $;

        public Builder() {
            $ = new GitopsApplicationsApplicationArgs();
        }

        public Builder(GitopsApplicationsApplicationArgs defaults) {
            $ = new GitopsApplicationsApplicationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param metadatas Metadata corresponding to the resources. This includes all the objects a user must create.
         * 
         * @return builder
         * 
         */
        public Builder metadatas(Output<List<GitopsApplicationsApplicationMetadataArgs>> metadatas) {
            $.metadatas = metadatas;
            return this;
        }

        /**
         * @param metadatas Metadata corresponding to the resources. This includes all the objects a user must create.
         * 
         * @return builder
         * 
         */
        public Builder metadatas(List<GitopsApplicationsApplicationMetadataArgs> metadatas) {
            return metadatas(Output.of(metadatas));
        }

        /**
         * @param metadatas Metadata corresponding to the resources. This includes all the objects a user must create.
         * 
         * @return builder
         * 
         */
        public Builder metadatas(GitopsApplicationsApplicationMetadataArgs... metadatas) {
            return metadatas(List.of(metadatas));
        }

        /**
         * @param specs Specifications of the GitOps application. This includes the repository URL, application definition, source, destination and sync policy.
         * 
         * @return builder
         * 
         */
        public Builder specs(@Nullable Output<List<GitopsApplicationsApplicationSpecArgs>> specs) {
            $.specs = specs;
            return this;
        }

        /**
         * @param specs Specifications of the GitOps application. This includes the repository URL, application definition, source, destination and sync policy.
         * 
         * @return builder
         * 
         */
        public Builder specs(List<GitopsApplicationsApplicationSpecArgs> specs) {
            return specs(Output.of(specs));
        }

        /**
         * @param specs Specifications of the GitOps application. This includes the repository URL, application definition, source, destination and sync policy.
         * 
         * @return builder
         * 
         */
        public Builder specs(GitopsApplicationsApplicationSpecArgs... specs) {
            return specs(List.of(specs));
        }

        public GitopsApplicationsApplicationArgs build() {
            $.metadatas = Objects.requireNonNull($.metadatas, "expected parameter 'metadatas' to be non-null");
            return $;
        }
    }

}