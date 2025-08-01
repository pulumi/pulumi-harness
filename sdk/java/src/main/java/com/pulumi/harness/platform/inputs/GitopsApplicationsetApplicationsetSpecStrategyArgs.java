// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.harness.platform.inputs.GitopsApplicationsetApplicationsetSpecStrategyRollingSyncArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GitopsApplicationsetApplicationsetSpecStrategyArgs extends com.pulumi.resources.ResourceArgs {

    public static final GitopsApplicationsetApplicationsetSpecStrategyArgs Empty = new GitopsApplicationsetApplicationsetSpecStrategyArgs();

    /**
     * Strategy allowing you to group Applications by labels present on the generated Application resources. When the ApplicationSet changes, the changes will be applied to each group of Application resources sequentially.
     * 
     */
    @Import(name="rollingSyncs")
    private @Nullable Output<List<GitopsApplicationsetApplicationsetSpecStrategyRollingSyncArgs>> rollingSyncs;

    /**
     * @return Strategy allowing you to group Applications by labels present on the generated Application resources. When the ApplicationSet changes, the changes will be applied to each group of Application resources sequentially.
     * 
     */
    public Optional<Output<List<GitopsApplicationsetApplicationsetSpecStrategyRollingSyncArgs>>> rollingSyncs() {
        return Optional.ofNullable(this.rollingSyncs);
    }

    /**
     * Type of progressive sync.
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    /**
     * @return Type of progressive sync.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    private GitopsApplicationsetApplicationsetSpecStrategyArgs() {}

    private GitopsApplicationsetApplicationsetSpecStrategyArgs(GitopsApplicationsetApplicationsetSpecStrategyArgs $) {
        this.rollingSyncs = $.rollingSyncs;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GitopsApplicationsetApplicationsetSpecStrategyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GitopsApplicationsetApplicationsetSpecStrategyArgs $;

        public Builder() {
            $ = new GitopsApplicationsetApplicationsetSpecStrategyArgs();
        }

        public Builder(GitopsApplicationsetApplicationsetSpecStrategyArgs defaults) {
            $ = new GitopsApplicationsetApplicationsetSpecStrategyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param rollingSyncs Strategy allowing you to group Applications by labels present on the generated Application resources. When the ApplicationSet changes, the changes will be applied to each group of Application resources sequentially.
         * 
         * @return builder
         * 
         */
        public Builder rollingSyncs(@Nullable Output<List<GitopsApplicationsetApplicationsetSpecStrategyRollingSyncArgs>> rollingSyncs) {
            $.rollingSyncs = rollingSyncs;
            return this;
        }

        /**
         * @param rollingSyncs Strategy allowing you to group Applications by labels present on the generated Application resources. When the ApplicationSet changes, the changes will be applied to each group of Application resources sequentially.
         * 
         * @return builder
         * 
         */
        public Builder rollingSyncs(List<GitopsApplicationsetApplicationsetSpecStrategyRollingSyncArgs> rollingSyncs) {
            return rollingSyncs(Output.of(rollingSyncs));
        }

        /**
         * @param rollingSyncs Strategy allowing you to group Applications by labels present on the generated Application resources. When the ApplicationSet changes, the changes will be applied to each group of Application resources sequentially.
         * 
         * @return builder
         * 
         */
        public Builder rollingSyncs(GitopsApplicationsetApplicationsetSpecStrategyRollingSyncArgs... rollingSyncs) {
            return rollingSyncs(List.of(rollingSyncs));
        }

        /**
         * @param type Type of progressive sync.
         * 
         * @return builder
         * 
         */
        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type Type of progressive sync.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public GitopsApplicationsetApplicationsetSpecStrategyArgs build() {
            if ($.type == null) {
                throw new MissingRequiredPropertyException("GitopsApplicationsetApplicationsetSpecStrategyArgs", "type");
            }
            return $;
        }
    }

}
