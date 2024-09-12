// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.autostopping.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetSchedulePlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetSchedulePlainArgs Empty = new GetSchedulePlainArgs();

    /**
     * Type of the schedule. Valid values are `uptime` and `downtime`
     * 
     */
    @Import(name="scheduleType", required=true)
    private String scheduleType;

    /**
     * @return Type of the schedule. Valid values are `uptime` and `downtime`
     * 
     */
    public String scheduleType() {
        return this.scheduleType;
    }

    private GetSchedulePlainArgs() {}

    private GetSchedulePlainArgs(GetSchedulePlainArgs $) {
        this.scheduleType = $.scheduleType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetSchedulePlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetSchedulePlainArgs $;

        public Builder() {
            $ = new GetSchedulePlainArgs();
        }

        public Builder(GetSchedulePlainArgs defaults) {
            $ = new GetSchedulePlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param scheduleType Type of the schedule. Valid values are `uptime` and `downtime`
         * 
         * @return builder
         * 
         */
        public Builder scheduleType(String scheduleType) {
            $.scheduleType = scheduleType;
            return this;
        }

        public GetSchedulePlainArgs build() {
            if ($.scheduleType == null) {
                throw new MissingRequiredPropertyException("GetSchedulePlainArgs", "scheduleType");
            }
            return $;
        }
    }

}