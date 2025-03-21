// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.harness.platform.inputs.GetHarRegistryConfigAuthUserPassword;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetHarRegistryConfigAuth extends com.pulumi.resources.InvokeArgs {

    public static final GetHarRegistryConfigAuth Empty = new GetHarRegistryConfigAuth();

    /**
     * Type of authentication (UserPassword, Anonymous)
     * 
     */
    @Import(name="authType", required=true)
    private String authType;

    /**
     * @return Type of authentication (UserPassword, Anonymous)
     * 
     */
    public String authType() {
        return this.authType;
    }

    /**
     * User password authentication details
     * 
     */
    @Import(name="userPassword")
    private @Nullable GetHarRegistryConfigAuthUserPassword userPassword;

    /**
     * @return User password authentication details
     * 
     */
    public Optional<GetHarRegistryConfigAuthUserPassword> userPassword() {
        return Optional.ofNullable(this.userPassword);
    }

    private GetHarRegistryConfigAuth() {}

    private GetHarRegistryConfigAuth(GetHarRegistryConfigAuth $) {
        this.authType = $.authType;
        this.userPassword = $.userPassword;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetHarRegistryConfigAuth defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetHarRegistryConfigAuth $;

        public Builder() {
            $ = new GetHarRegistryConfigAuth();
        }

        public Builder(GetHarRegistryConfigAuth defaults) {
            $ = new GetHarRegistryConfigAuth(Objects.requireNonNull(defaults));
        }

        /**
         * @param authType Type of authentication (UserPassword, Anonymous)
         * 
         * @return builder
         * 
         */
        public Builder authType(String authType) {
            $.authType = authType;
            return this;
        }

        /**
         * @param userPassword User password authentication details
         * 
         * @return builder
         * 
         */
        public Builder userPassword(@Nullable GetHarRegistryConfigAuthUserPassword userPassword) {
            $.userPassword = userPassword;
            return this;
        }

        public GetHarRegistryConfigAuth build() {
            if ($.authType == null) {
                throw new MissingRequiredPropertyException("GetHarRegistryConfigAuth", "authType");
            }
            return $;
        }
    }

}
