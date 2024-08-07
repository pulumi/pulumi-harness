// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.autostopping.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetRuleRdsDepend {
    /**
     * @return Number of seconds the rule should wait after warming up the dependent rule
     * 
     */
    private @Nullable Integer delayInSec;
    /**
     * @return Rule id of the dependent rule
     * 
     */
    private Integer ruleId;

    private GetRuleRdsDepend() {}
    /**
     * @return Number of seconds the rule should wait after warming up the dependent rule
     * 
     */
    public Optional<Integer> delayInSec() {
        return Optional.ofNullable(this.delayInSec);
    }
    /**
     * @return Rule id of the dependent rule
     * 
     */
    public Integer ruleId() {
        return this.ruleId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRuleRdsDepend defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Integer delayInSec;
        private Integer ruleId;
        public Builder() {}
        public Builder(GetRuleRdsDepend defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.delayInSec = defaults.delayInSec;
    	      this.ruleId = defaults.ruleId;
        }

        @CustomType.Setter
        public Builder delayInSec(@Nullable Integer delayInSec) {

            this.delayInSec = delayInSec;
            return this;
        }
        @CustomType.Setter
        public Builder ruleId(Integer ruleId) {
            if (ruleId == null) {
              throw new MissingRequiredPropertyException("GetRuleRdsDepend", "ruleId");
            }
            this.ruleId = ruleId;
            return this;
        }
        public GetRuleRdsDepend build() {
            final var _resultValue = new GetRuleRdsDepend();
            _resultValue.delayInSec = delayInSec;
            _resultValue.ruleId = ruleId;
            return _resultValue;
        }
    }
}
