// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.harness.platform.inputs.GitOpsApplicationsApplicationSpecSyncPolicyAutomatedArgs;
import com.pulumi.harness.platform.inputs.GitOpsApplicationsApplicationSpecSyncPolicyRetryArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GitOpsApplicationsApplicationSpecSyncPolicyArgs extends com.pulumi.resources.ResourceArgs {

    public static final GitOpsApplicationsApplicationSpecSyncPolicyArgs Empty = new GitOpsApplicationsApplicationSpecSyncPolicyArgs();

    /**
     * Controls the behavior of an automated sync.
     * 
     */
    @Import(name="automateds")
    private @Nullable Output<List<GitOpsApplicationsApplicationSpecSyncPolicyAutomatedArgs>> automateds;

    /**
     * @return Controls the behavior of an automated sync.
     * 
     */
    public Optional<Output<List<GitOpsApplicationsApplicationSpecSyncPolicyAutomatedArgs>>> automateds() {
        return Optional.ofNullable(this.automateds);
    }

    /**
     * Contains information about the strategy to apply when a sync failed.
     * 
     */
    @Import(name="retries")
    private @Nullable Output<List<GitOpsApplicationsApplicationSpecSyncPolicyRetryArgs>> retries;

    /**
     * @return Contains information about the strategy to apply when a sync failed.
     * 
     */
    public Optional<Output<List<GitOpsApplicationsApplicationSpecSyncPolicyRetryArgs>>> retries() {
        return Optional.ofNullable(this.retries);
    }

    /**
     * Options allow you to specify whole app sync-options.
     * 
     */
    @Import(name="syncOptions")
    private @Nullable Output<List<String>> syncOptions;

    /**
     * @return Options allow you to specify whole app sync-options.
     * 
     */
    public Optional<Output<List<String>>> syncOptions() {
        return Optional.ofNullable(this.syncOptions);
    }

    private GitOpsApplicationsApplicationSpecSyncPolicyArgs() {}

    private GitOpsApplicationsApplicationSpecSyncPolicyArgs(GitOpsApplicationsApplicationSpecSyncPolicyArgs $) {
        this.automateds = $.automateds;
        this.retries = $.retries;
        this.syncOptions = $.syncOptions;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GitOpsApplicationsApplicationSpecSyncPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GitOpsApplicationsApplicationSpecSyncPolicyArgs $;

        public Builder() {
            $ = new GitOpsApplicationsApplicationSpecSyncPolicyArgs();
        }

        public Builder(GitOpsApplicationsApplicationSpecSyncPolicyArgs defaults) {
            $ = new GitOpsApplicationsApplicationSpecSyncPolicyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param automateds Controls the behavior of an automated sync.
         * 
         * @return builder
         * 
         */
        public Builder automateds(@Nullable Output<List<GitOpsApplicationsApplicationSpecSyncPolicyAutomatedArgs>> automateds) {
            $.automateds = automateds;
            return this;
        }

        /**
         * @param automateds Controls the behavior of an automated sync.
         * 
         * @return builder
         * 
         */
        public Builder automateds(List<GitOpsApplicationsApplicationSpecSyncPolicyAutomatedArgs> automateds) {
            return automateds(Output.of(automateds));
        }

        /**
         * @param automateds Controls the behavior of an automated sync.
         * 
         * @return builder
         * 
         */
        public Builder automateds(GitOpsApplicationsApplicationSpecSyncPolicyAutomatedArgs... automateds) {
            return automateds(List.of(automateds));
        }

        /**
         * @param retries Contains information about the strategy to apply when a sync failed.
         * 
         * @return builder
         * 
         */
        public Builder retries(@Nullable Output<List<GitOpsApplicationsApplicationSpecSyncPolicyRetryArgs>> retries) {
            $.retries = retries;
            return this;
        }

        /**
         * @param retries Contains information about the strategy to apply when a sync failed.
         * 
         * @return builder
         * 
         */
        public Builder retries(List<GitOpsApplicationsApplicationSpecSyncPolicyRetryArgs> retries) {
            return retries(Output.of(retries));
        }

        /**
         * @param retries Contains information about the strategy to apply when a sync failed.
         * 
         * @return builder
         * 
         */
        public Builder retries(GitOpsApplicationsApplicationSpecSyncPolicyRetryArgs... retries) {
            return retries(List.of(retries));
        }

        /**
         * @param syncOptions Options allow you to specify whole app sync-options.
         * 
         * @return builder
         * 
         */
        public Builder syncOptions(@Nullable Output<List<String>> syncOptions) {
            $.syncOptions = syncOptions;
            return this;
        }

        /**
         * @param syncOptions Options allow you to specify whole app sync-options.
         * 
         * @return builder
         * 
         */
        public Builder syncOptions(List<String> syncOptions) {
            return syncOptions(Output.of(syncOptions));
        }

        /**
         * @param syncOptions Options allow you to specify whole app sync-options.
         * 
         * @return builder
         * 
         */
        public Builder syncOptions(String... syncOptions) {
            return syncOptions(List.of(syncOptions));
        }

        public GitOpsApplicationsApplicationSpecSyncPolicyArgs build() {
            return $;
        }
    }

}
