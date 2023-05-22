// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.harness.platform.inputs.GitopsApplicationsApplicationSpecDestinationArgs;
import com.pulumi.harness.platform.inputs.GitopsApplicationsApplicationSpecSourceArgs;
import com.pulumi.harness.platform.inputs.GitopsApplicationsApplicationSpecSyncPolicyArgs;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GitopsApplicationsApplicationSpecArgs extends com.pulumi.resources.ResourceArgs {

    public static final GitopsApplicationsApplicationSpecArgs Empty = new GitopsApplicationsApplicationSpecArgs();

    @Import(name="destinations")
    private @Nullable Output<List<GitopsApplicationsApplicationSpecDestinationArgs>> destinations;

    public Optional<Output<List<GitopsApplicationsApplicationSpecDestinationArgs>>> destinations() {
        return Optional.ofNullable(this.destinations);
    }

    @Import(name="sources")
    private @Nullable Output<List<GitopsApplicationsApplicationSpecSourceArgs>> sources;

    public Optional<Output<List<GitopsApplicationsApplicationSpecSourceArgs>>> sources() {
        return Optional.ofNullable(this.sources);
    }

    @Import(name="syncPolicies")
    private @Nullable Output<List<GitopsApplicationsApplicationSpecSyncPolicyArgs>> syncPolicies;

    public Optional<Output<List<GitopsApplicationsApplicationSpecSyncPolicyArgs>>> syncPolicies() {
        return Optional.ofNullable(this.syncPolicies);
    }

    private GitopsApplicationsApplicationSpecArgs() {}

    private GitopsApplicationsApplicationSpecArgs(GitopsApplicationsApplicationSpecArgs $) {
        this.destinations = $.destinations;
        this.sources = $.sources;
        this.syncPolicies = $.syncPolicies;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GitopsApplicationsApplicationSpecArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GitopsApplicationsApplicationSpecArgs $;

        public Builder() {
            $ = new GitopsApplicationsApplicationSpecArgs();
        }

        public Builder(GitopsApplicationsApplicationSpecArgs defaults) {
            $ = new GitopsApplicationsApplicationSpecArgs(Objects.requireNonNull(defaults));
        }

        public Builder destinations(@Nullable Output<List<GitopsApplicationsApplicationSpecDestinationArgs>> destinations) {
            $.destinations = destinations;
            return this;
        }

        public Builder destinations(List<GitopsApplicationsApplicationSpecDestinationArgs> destinations) {
            return destinations(Output.of(destinations));
        }

        public Builder destinations(GitopsApplicationsApplicationSpecDestinationArgs... destinations) {
            return destinations(List.of(destinations));
        }

        public Builder sources(@Nullable Output<List<GitopsApplicationsApplicationSpecSourceArgs>> sources) {
            $.sources = sources;
            return this;
        }

        public Builder sources(List<GitopsApplicationsApplicationSpecSourceArgs> sources) {
            return sources(Output.of(sources));
        }

        public Builder sources(GitopsApplicationsApplicationSpecSourceArgs... sources) {
            return sources(List.of(sources));
        }

        public Builder syncPolicies(@Nullable Output<List<GitopsApplicationsApplicationSpecSyncPolicyArgs>> syncPolicies) {
            $.syncPolicies = syncPolicies;
            return this;
        }

        public Builder syncPolicies(List<GitopsApplicationsApplicationSpecSyncPolicyArgs> syncPolicies) {
            return syncPolicies(Output.of(syncPolicies));
        }

        public Builder syncPolicies(GitopsApplicationsApplicationSpecSyncPolicyArgs... syncPolicies) {
            return syncPolicies(List.of(syncPolicies));
        }

        public GitopsApplicationsApplicationSpecArgs build() {
            return $;
        }
    }

}