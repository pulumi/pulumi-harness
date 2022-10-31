// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class EnvironmentClustersMappingClusterArgs extends com.pulumi.resources.ResourceArgs {

    public static final EnvironmentClustersMappingClusterArgs Empty = new EnvironmentClustersMappingClusterArgs();

    /**
     * account Identifier of the account
     * 
     */
    @Import(name="identifier")
    private @Nullable Output<String> identifier;

    /**
     * @return account Identifier of the account
     * 
     */
    public Optional<Output<String>> identifier() {
        return Optional.ofNullable(this.identifier);
    }

    /**
     * name of the cluster
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return name of the cluster
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * scope at which the cluster exists in harness gitops, project vs org vs account
     * 
     */
    @Import(name="scope")
    private @Nullable Output<String> scope;

    /**
     * @return scope at which the cluster exists in harness gitops, project vs org vs account
     * 
     */
    public Optional<Output<String>> scope() {
        return Optional.ofNullable(this.scope);
    }

    private EnvironmentClustersMappingClusterArgs() {}

    private EnvironmentClustersMappingClusterArgs(EnvironmentClustersMappingClusterArgs $) {
        this.identifier = $.identifier;
        this.name = $.name;
        this.scope = $.scope;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EnvironmentClustersMappingClusterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EnvironmentClustersMappingClusterArgs $;

        public Builder() {
            $ = new EnvironmentClustersMappingClusterArgs();
        }

        public Builder(EnvironmentClustersMappingClusterArgs defaults) {
            $ = new EnvironmentClustersMappingClusterArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param identifier account Identifier of the account
         * 
         * @return builder
         * 
         */
        public Builder identifier(@Nullable Output<String> identifier) {
            $.identifier = identifier;
            return this;
        }

        /**
         * @param identifier account Identifier of the account
         * 
         * @return builder
         * 
         */
        public Builder identifier(String identifier) {
            return identifier(Output.of(identifier));
        }

        /**
         * @param name name of the cluster
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name name of the cluster
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param scope scope at which the cluster exists in harness gitops, project vs org vs account
         * 
         * @return builder
         * 
         */
        public Builder scope(@Nullable Output<String> scope) {
            $.scope = scope;
            return this;
        }

        /**
         * @param scope scope at which the cluster exists in harness gitops, project vs org vs account
         * 
         * @return builder
         * 
         */
        public Builder scope(String scope) {
            return scope(Output.of(scope));
        }

        public EnvironmentClustersMappingClusterArgs build() {
            return $;
        }
    }

}