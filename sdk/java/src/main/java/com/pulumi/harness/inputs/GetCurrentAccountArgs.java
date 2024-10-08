// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetCurrentAccountArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetCurrentAccountArgs Empty = new GetCurrentAccountArgs();

    /**
     * Account Identifier of the current account.
     * 
     */
    @Import(name="id")
    private @Nullable Output<String> id;

    /**
     * @return Account Identifier of the current account.
     * 
     */
    public Optional<Output<String>> id() {
        return Optional.ofNullable(this.id);
    }

    private GetCurrentAccountArgs() {}

    private GetCurrentAccountArgs(GetCurrentAccountArgs $) {
        this.id = $.id;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetCurrentAccountArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetCurrentAccountArgs $;

        public Builder() {
            $ = new GetCurrentAccountArgs();
        }

        public Builder(GetCurrentAccountArgs defaults) {
            $ = new GetCurrentAccountArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param id Account Identifier of the current account.
         * 
         * @return builder
         * 
         */
        public Builder id(@Nullable Output<String> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id Account Identifier of the current account.
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            return id(Output.of(id));
        }

        public GetCurrentAccountArgs build() {
            return $;
        }
    }

}
