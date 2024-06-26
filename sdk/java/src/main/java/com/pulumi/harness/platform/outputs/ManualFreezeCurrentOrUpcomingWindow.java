// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ManualFreezeCurrentOrUpcomingWindow {
    /**
     * @return End time of the freeze
     * 
     */
    private @Nullable Integer endTime;
    /**
     * @return Start time of the freeze
     * 
     */
    private @Nullable Integer startTime;

    private ManualFreezeCurrentOrUpcomingWindow() {}
    /**
     * @return End time of the freeze
     * 
     */
    public Optional<Integer> endTime() {
        return Optional.ofNullable(this.endTime);
    }
    /**
     * @return Start time of the freeze
     * 
     */
    public Optional<Integer> startTime() {
        return Optional.ofNullable(this.startTime);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManualFreezeCurrentOrUpcomingWindow defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Integer endTime;
        private @Nullable Integer startTime;
        public Builder() {}
        public Builder(ManualFreezeCurrentOrUpcomingWindow defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endTime = defaults.endTime;
    	      this.startTime = defaults.startTime;
        }

        @CustomType.Setter
        public Builder endTime(@Nullable Integer endTime) {

            this.endTime = endTime;
            return this;
        }
        @CustomType.Setter
        public Builder startTime(@Nullable Integer startTime) {

            this.startTime = startTime;
            return this;
        }
        public ManualFreezeCurrentOrUpcomingWindow build() {
            final var _resultValue = new ManualFreezeCurrentOrUpcomingWindow();
            _resultValue.endTime = endTime;
            _resultValue.startTime = startTime;
            return _resultValue;
        }
    }
}
