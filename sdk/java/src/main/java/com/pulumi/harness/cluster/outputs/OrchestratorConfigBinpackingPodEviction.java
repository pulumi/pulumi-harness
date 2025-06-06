// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.cluster.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.harness.cluster.outputs.OrchestratorConfigBinpackingPodEvictionThreshold;
import java.util.Objects;

@CustomType
public final class OrchestratorConfigBinpackingPodEviction {
    /**
     * @return Minimum Threshold for considering a node as underutilized
     * 
     */
    private OrchestratorConfigBinpackingPodEvictionThreshold threshold;

    private OrchestratorConfigBinpackingPodEviction() {}
    /**
     * @return Minimum Threshold for considering a node as underutilized
     * 
     */
    public OrchestratorConfigBinpackingPodEvictionThreshold threshold() {
        return this.threshold;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OrchestratorConfigBinpackingPodEviction defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private OrchestratorConfigBinpackingPodEvictionThreshold threshold;
        public Builder() {}
        public Builder(OrchestratorConfigBinpackingPodEviction defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.threshold = defaults.threshold;
        }

        @CustomType.Setter
        public Builder threshold(OrchestratorConfigBinpackingPodEvictionThreshold threshold) {
            if (threshold == null) {
              throw new MissingRequiredPropertyException("OrchestratorConfigBinpackingPodEviction", "threshold");
            }
            this.threshold = threshold;
            return this;
        }
        public OrchestratorConfigBinpackingPodEviction build() {
            final var _resultValue = new OrchestratorConfigBinpackingPodEviction();
            _resultValue.threshold = threshold;
            return _resultValue;
        }
    }
}
