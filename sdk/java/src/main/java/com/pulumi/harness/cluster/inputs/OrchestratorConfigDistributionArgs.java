// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.cluster.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class OrchestratorConfigDistributionArgs extends com.pulumi.resources.ResourceArgs {

    public static final OrchestratorConfigDistributionArgs Empty = new OrchestratorConfigDistributionArgs();

    /**
     * Number of minimum ondemand replicas required for workloads
     * 
     */
    @Import(name="baseOndemandCapacity")
    private @Nullable Output<Integer> baseOndemandCapacity;

    /**
     * @return Number of minimum ondemand replicas required for workloads
     * 
     */
    public Optional<Output<Integer>> baseOndemandCapacity() {
        return Optional.ofNullable(this.baseOndemandCapacity);
    }

    /**
     * Percentage of on-demand replicas required for workloads
     * 
     */
    @Import(name="ondemandReplicaPercentage", required=true)
    private Output<Double> ondemandReplicaPercentage;

    /**
     * @return Percentage of on-demand replicas required for workloads
     * 
     */
    public Output<Double> ondemandReplicaPercentage() {
        return this.ondemandReplicaPercentage;
    }

    /**
     * Selector for choosing workloads for distribution
     * 
     */
    @Import(name="selector")
    private @Nullable Output<String> selector;

    /**
     * @return Selector for choosing workloads for distribution
     * 
     */
    public Optional<Output<String>> selector() {
        return Optional.ofNullable(this.selector);
    }

    /**
     * Strategy for choosing spot nodes for cluster
     * 
     */
    @Import(name="strategy")
    private @Nullable Output<String> strategy;

    /**
     * @return Strategy for choosing spot nodes for cluster
     * 
     */
    public Optional<Output<String>> strategy() {
        return Optional.ofNullable(this.strategy);
    }

    private OrchestratorConfigDistributionArgs() {}

    private OrchestratorConfigDistributionArgs(OrchestratorConfigDistributionArgs $) {
        this.baseOndemandCapacity = $.baseOndemandCapacity;
        this.ondemandReplicaPercentage = $.ondemandReplicaPercentage;
        this.selector = $.selector;
        this.strategy = $.strategy;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OrchestratorConfigDistributionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OrchestratorConfigDistributionArgs $;

        public Builder() {
            $ = new OrchestratorConfigDistributionArgs();
        }

        public Builder(OrchestratorConfigDistributionArgs defaults) {
            $ = new OrchestratorConfigDistributionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param baseOndemandCapacity Number of minimum ondemand replicas required for workloads
         * 
         * @return builder
         * 
         */
        public Builder baseOndemandCapacity(@Nullable Output<Integer> baseOndemandCapacity) {
            $.baseOndemandCapacity = baseOndemandCapacity;
            return this;
        }

        /**
         * @param baseOndemandCapacity Number of minimum ondemand replicas required for workloads
         * 
         * @return builder
         * 
         */
        public Builder baseOndemandCapacity(Integer baseOndemandCapacity) {
            return baseOndemandCapacity(Output.of(baseOndemandCapacity));
        }

        /**
         * @param ondemandReplicaPercentage Percentage of on-demand replicas required for workloads
         * 
         * @return builder
         * 
         */
        public Builder ondemandReplicaPercentage(Output<Double> ondemandReplicaPercentage) {
            $.ondemandReplicaPercentage = ondemandReplicaPercentage;
            return this;
        }

        /**
         * @param ondemandReplicaPercentage Percentage of on-demand replicas required for workloads
         * 
         * @return builder
         * 
         */
        public Builder ondemandReplicaPercentage(Double ondemandReplicaPercentage) {
            return ondemandReplicaPercentage(Output.of(ondemandReplicaPercentage));
        }

        /**
         * @param selector Selector for choosing workloads for distribution
         * 
         * @return builder
         * 
         */
        public Builder selector(@Nullable Output<String> selector) {
            $.selector = selector;
            return this;
        }

        /**
         * @param selector Selector for choosing workloads for distribution
         * 
         * @return builder
         * 
         */
        public Builder selector(String selector) {
            return selector(Output.of(selector));
        }

        /**
         * @param strategy Strategy for choosing spot nodes for cluster
         * 
         * @return builder
         * 
         */
        public Builder strategy(@Nullable Output<String> strategy) {
            $.strategy = strategy;
            return this;
        }

        /**
         * @param strategy Strategy for choosing spot nodes for cluster
         * 
         * @return builder
         * 
         */
        public Builder strategy(String strategy) {
            return strategy(Output.of(strategy));
        }

        public OrchestratorConfigDistributionArgs build() {
            if ($.ondemandReplicaPercentage == null) {
                throw new MissingRequiredPropertyException("OrchestratorConfigDistributionArgs", "ondemandReplicaPercentage");
            }
            return $;
        }
    }

}
