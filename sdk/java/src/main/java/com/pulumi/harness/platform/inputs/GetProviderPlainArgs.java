// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetProviderPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetProviderPlainArgs Empty = new GetProviderPlainArgs();

    @Import(name="identifier", required=true)
    private String identifier;

    public String identifier() {
        return this.identifier;
    }

    private GetProviderPlainArgs() {}

    private GetProviderPlainArgs(GetProviderPlainArgs $) {
        this.identifier = $.identifier;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetProviderPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetProviderPlainArgs $;

        public Builder() {
            $ = new GetProviderPlainArgs();
        }

        public Builder(GetProviderPlainArgs defaults) {
            $ = new GetProviderPlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder identifier(String identifier) {
            $.identifier = identifier;
            return this;
        }

        public GetProviderPlainArgs build() {
            if ($.identifier == null) {
                throw new MissingRequiredPropertyException("GetProviderPlainArgs", "identifier");
            }
            return $;
        }
    }

}