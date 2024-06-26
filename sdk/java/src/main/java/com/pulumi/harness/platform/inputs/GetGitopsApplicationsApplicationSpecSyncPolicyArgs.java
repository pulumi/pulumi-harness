// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.harness.platform.inputs.GetGitopsApplicationsApplicationSpecSyncPolicyAutomatedArgs;
import com.pulumi.harness.platform.inputs.GetGitopsApplicationsApplicationSpecSyncPolicyRetryArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetGitopsApplicationsApplicationSpecSyncPolicyArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetGitopsApplicationsApplicationSpecSyncPolicyArgs Empty = new GetGitopsApplicationsApplicationSpecSyncPolicyArgs();

    /**
     * Controls the behavior of an automated sync.
     * 
     */
    @Import(name="automateds")
    private @Nullable Output<List<GetGitopsApplicationsApplicationSpecSyncPolicyAutomatedArgs>> automateds;

    /**
     * @return Controls the behavior of an automated sync.
     * 
     */
    public Optional<Output<List<GetGitopsApplicationsApplicationSpecSyncPolicyAutomatedArgs>>> automateds() {
        return Optional.ofNullable(this.automateds);
    }

    /**
     * Contains information about the strategy to apply when a sync failed.
     * 
     */
    @Import(name="retries")
    private @Nullable Output<List<GetGitopsApplicationsApplicationSpecSyncPolicyRetryArgs>> retries;

    /**
     * @return Contains information about the strategy to apply when a sync failed.
     * 
     */
    public Optional<Output<List<GetGitopsApplicationsApplicationSpecSyncPolicyRetryArgs>>> retries() {
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

    private GetGitopsApplicationsApplicationSpecSyncPolicyArgs() {}

    private GetGitopsApplicationsApplicationSpecSyncPolicyArgs(GetGitopsApplicationsApplicationSpecSyncPolicyArgs $) {
        this.automateds = $.automateds;
        this.retries = $.retries;
        this.syncOptions = $.syncOptions;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetGitopsApplicationsApplicationSpecSyncPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetGitopsApplicationsApplicationSpecSyncPolicyArgs $;

        public Builder() {
            $ = new GetGitopsApplicationsApplicationSpecSyncPolicyArgs();
        }

        public Builder(GetGitopsApplicationsApplicationSpecSyncPolicyArgs defaults) {
            $ = new GetGitopsApplicationsApplicationSpecSyncPolicyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param automateds Controls the behavior of an automated sync.
         * 
         * @return builder
         * 
         */
        public Builder automateds(@Nullable Output<List<GetGitopsApplicationsApplicationSpecSyncPolicyAutomatedArgs>> automateds) {
            $.automateds = automateds;
            return this;
        }

        /**
         * @param automateds Controls the behavior of an automated sync.
         * 
         * @return builder
         * 
         */
        public Builder automateds(List<GetGitopsApplicationsApplicationSpecSyncPolicyAutomatedArgs> automateds) {
            return automateds(Output.of(automateds));
        }

        /**
         * @param automateds Controls the behavior of an automated sync.
         * 
         * @return builder
         * 
         */
        public Builder automateds(GetGitopsApplicationsApplicationSpecSyncPolicyAutomatedArgs... automateds) {
            return automateds(List.of(automateds));
        }

        /**
         * @param retries Contains information about the strategy to apply when a sync failed.
         * 
         * @return builder
         * 
         */
        public Builder retries(@Nullable Output<List<GetGitopsApplicationsApplicationSpecSyncPolicyRetryArgs>> retries) {
            $.retries = retries;
            return this;
        }

        /**
         * @param retries Contains information about the strategy to apply when a sync failed.
         * 
         * @return builder
         * 
         */
        public Builder retries(List<GetGitopsApplicationsApplicationSpecSyncPolicyRetryArgs> retries) {
            return retries(Output.of(retries));
        }

        /**
         * @param retries Contains information about the strategy to apply when a sync failed.
         * 
         * @return builder
         * 
         */
        public Builder retries(GetGitopsApplicationsApplicationSpecSyncPolicyRetryArgs... retries) {
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

        public GetGitopsApplicationsApplicationSpecSyncPolicyArgs build() {
            return $;
        }
    }

}
