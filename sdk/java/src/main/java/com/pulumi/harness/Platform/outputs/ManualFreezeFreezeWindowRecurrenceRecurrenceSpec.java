// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ManualFreezeFreezeWindowRecurrenceRecurrenceSpec {
    private @Nullable String until;
    private @Nullable Integer value;

    private ManualFreezeFreezeWindowRecurrenceRecurrenceSpec() {}
    public Optional<String> until() {
        return Optional.ofNullable(this.until);
    }
    public Optional<Integer> value() {
        return Optional.ofNullable(this.value);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManualFreezeFreezeWindowRecurrenceRecurrenceSpec defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String until;
        private @Nullable Integer value;
        public Builder() {}
        public Builder(ManualFreezeFreezeWindowRecurrenceRecurrenceSpec defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.until = defaults.until;
    	      this.value = defaults.value;
        }

        @CustomType.Setter
        public Builder until(@Nullable String until) {
            this.until = until;
            return this;
        }
        @CustomType.Setter
        public Builder value(@Nullable Integer value) {
            this.value = value;
            return this;
        }
        public ManualFreezeFreezeWindowRecurrenceRecurrenceSpec build() {
            final var o = new ManualFreezeFreezeWindowRecurrenceRecurrenceSpec();
            o.until = until;
            o.value = value;
            return o;
        }
    }
}