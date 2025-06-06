// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.cluster.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetOrchestratorConfigDistribution {
    /**
     * @return Number of minimum ondemand replicas required for workloads
     * 
     */
    private @Nullable Integer baseOndemandCapacity;
    /**
     * @return Percentage of on-demand replicas required for workloads
     * 
     */
    private Double ondemandReplicaPercentage;
    /**
     * @return Selector for choosing workloads for distribution
     * 
     */
    private @Nullable String selector;
    /**
     * @return Strategy for choosing spot nodes for cluster
     * 
     */
    private @Nullable String strategy;

    private GetOrchestratorConfigDistribution() {}
    /**
     * @return Number of minimum ondemand replicas required for workloads
     * 
     */
    public Optional<Integer> baseOndemandCapacity() {
        return Optional.ofNullable(this.baseOndemandCapacity);
    }
    /**
     * @return Percentage of on-demand replicas required for workloads
     * 
     */
    public Double ondemandReplicaPercentage() {
        return this.ondemandReplicaPercentage;
    }
    /**
     * @return Selector for choosing workloads for distribution
     * 
     */
    public Optional<String> selector() {
        return Optional.ofNullable(this.selector);
    }
    /**
     * @return Strategy for choosing spot nodes for cluster
     * 
     */
    public Optional<String> strategy() {
        return Optional.ofNullable(this.strategy);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetOrchestratorConfigDistribution defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Integer baseOndemandCapacity;
        private Double ondemandReplicaPercentage;
        private @Nullable String selector;
        private @Nullable String strategy;
        public Builder() {}
        public Builder(GetOrchestratorConfigDistribution defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.baseOndemandCapacity = defaults.baseOndemandCapacity;
    	      this.ondemandReplicaPercentage = defaults.ondemandReplicaPercentage;
    	      this.selector = defaults.selector;
    	      this.strategy = defaults.strategy;
        }

        @CustomType.Setter
        public Builder baseOndemandCapacity(@Nullable Integer baseOndemandCapacity) {

            this.baseOndemandCapacity = baseOndemandCapacity;
            return this;
        }
        @CustomType.Setter
        public Builder ondemandReplicaPercentage(Double ondemandReplicaPercentage) {
            if (ondemandReplicaPercentage == null) {
              throw new MissingRequiredPropertyException("GetOrchestratorConfigDistribution", "ondemandReplicaPercentage");
            }
            this.ondemandReplicaPercentage = ondemandReplicaPercentage;
            return this;
        }
        @CustomType.Setter
        public Builder selector(@Nullable String selector) {

            this.selector = selector;
            return this;
        }
        @CustomType.Setter
        public Builder strategy(@Nullable String strategy) {

            this.strategy = strategy;
            return this;
        }
        public GetOrchestratorConfigDistribution build() {
            final var _resultValue = new GetOrchestratorConfigDistribution();
            _resultValue.baseOndemandCapacity = baseOndemandCapacity;
            _resultValue.ondemandReplicaPercentage = ondemandReplicaPercentage;
            _resultValue.selector = selector;
            _resultValue.strategy = strategy;
            return _resultValue;
        }
    }
}
