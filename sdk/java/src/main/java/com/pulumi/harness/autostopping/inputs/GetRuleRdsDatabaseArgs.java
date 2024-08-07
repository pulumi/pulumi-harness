// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.autostopping.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetRuleRdsDatabaseArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetRuleRdsDatabaseArgs Empty = new GetRuleRdsDatabaseArgs();

    /**
     * ID of the database
     * 
     */
    @Import(name="id", required=true)
    private Output<String> id;

    /**
     * @return ID of the database
     * 
     */
    public Output<String> id() {
        return this.id;
    }

    /**
     * Region to which database belong to
     * 
     */
    @Import(name="region", required=true)
    private Output<String> region;

    /**
     * @return Region to which database belong to
     * 
     */
    public Output<String> region() {
        return this.region;
    }

    private GetRuleRdsDatabaseArgs() {}

    private GetRuleRdsDatabaseArgs(GetRuleRdsDatabaseArgs $) {
        this.id = $.id;
        this.region = $.region;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetRuleRdsDatabaseArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetRuleRdsDatabaseArgs $;

        public Builder() {
            $ = new GetRuleRdsDatabaseArgs();
        }

        public Builder(GetRuleRdsDatabaseArgs defaults) {
            $ = new GetRuleRdsDatabaseArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param id ID of the database
         * 
         * @return builder
         * 
         */
        public Builder id(Output<String> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id ID of the database
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            return id(Output.of(id));
        }

        /**
         * @param region Region to which database belong to
         * 
         * @return builder
         * 
         */
        public Builder region(Output<String> region) {
            $.region = region;
            return this;
        }

        /**
         * @param region Region to which database belong to
         * 
         * @return builder
         * 
         */
        public Builder region(String region) {
            return region(Output.of(region));
        }

        public GetRuleRdsDatabaseArgs build() {
            if ($.id == null) {
                throw new MissingRequiredPropertyException("GetRuleRdsDatabaseArgs", "id");
            }
            if ($.region == null) {
                throw new MissingRequiredPropertyException("GetRuleRdsDatabaseArgs", "region");
            }
            return $;
        }
    }

}
