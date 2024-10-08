// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.governance.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetRuleEnforcementArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetRuleEnforcementArgs Empty = new GetRuleEnforcementArgs();

    /**
     * Id of rule enforcement.
     * 
     */
    @Import(name="enforcementId", required=true)
    private Output<String> enforcementId;

    /**
     * @return Id of rule enforcement.
     * 
     */
    public Output<String> enforcementId() {
        return this.enforcementId;
    }

    private GetRuleEnforcementArgs() {}

    private GetRuleEnforcementArgs(GetRuleEnforcementArgs $) {
        this.enforcementId = $.enforcementId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetRuleEnforcementArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetRuleEnforcementArgs $;

        public Builder() {
            $ = new GetRuleEnforcementArgs();
        }

        public Builder(GetRuleEnforcementArgs defaults) {
            $ = new GetRuleEnforcementArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param enforcementId Id of rule enforcement.
         * 
         * @return builder
         * 
         */
        public Builder enforcementId(Output<String> enforcementId) {
            $.enforcementId = enforcementId;
            return this;
        }

        /**
         * @param enforcementId Id of rule enforcement.
         * 
         * @return builder
         * 
         */
        public Builder enforcementId(String enforcementId) {
            return enforcementId(Output.of(enforcementId));
        }

        public GetRuleEnforcementArgs build() {
            if ($.enforcementId == null) {
                throw new MissingRequiredPropertyException("GetRuleEnforcementArgs", "enforcementId");
            }
            return $;
        }
    }

}
