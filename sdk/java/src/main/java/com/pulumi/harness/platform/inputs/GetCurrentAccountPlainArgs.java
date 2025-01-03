// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetCurrentAccountPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetCurrentAccountPlainArgs Empty = new GetCurrentAccountPlainArgs();

    /**
     * Id of the account.
     * 
     */
    @Import(name="id")
    private @Nullable String id;

    /**
     * @return Id of the account.
     * 
     */
    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }

    private GetCurrentAccountPlainArgs() {}

    private GetCurrentAccountPlainArgs(GetCurrentAccountPlainArgs $) {
        this.id = $.id;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetCurrentAccountPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetCurrentAccountPlainArgs $;

        public Builder() {
            $ = new GetCurrentAccountPlainArgs();
        }

        public Builder(GetCurrentAccountPlainArgs defaults) {
            $ = new GetCurrentAccountPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param id Id of the account.
         * 
         * @return builder
         * 
         */
        public Builder id(@Nullable String id) {
            $.id = id;
            return this;
        }

        public GetCurrentAccountPlainArgs build() {
            return $;
        }
    }

}
