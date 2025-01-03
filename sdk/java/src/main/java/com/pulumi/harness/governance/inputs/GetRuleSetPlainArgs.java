// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.governance.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetRuleSetPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetRuleSetPlainArgs Empty = new GetRuleSetPlainArgs();

    /**
     * Id of rule set.
     * 
     */
    @Import(name="ruleSetId", required=true)
    private String ruleSetId;

    /**
     * @return Id of rule set.
     * 
     */
    public String ruleSetId() {
        return this.ruleSetId;
    }

    private GetRuleSetPlainArgs() {}

    private GetRuleSetPlainArgs(GetRuleSetPlainArgs $) {
        this.ruleSetId = $.ruleSetId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetRuleSetPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetRuleSetPlainArgs $;

        public Builder() {
            $ = new GetRuleSetPlainArgs();
        }

        public Builder(GetRuleSetPlainArgs defaults) {
            $ = new GetRuleSetPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param ruleSetId Id of rule set.
         * 
         * @return builder
         * 
         */
        public Builder ruleSetId(String ruleSetId) {
            $.ruleSetId = ruleSetId;
            return this;
        }

        public GetRuleSetPlainArgs build() {
            if ($.ruleSetId == null) {
                throw new MissingRequiredPropertyException("GetRuleSetPlainArgs", "ruleSetId");
            }
            return $;
        }
    }

}
