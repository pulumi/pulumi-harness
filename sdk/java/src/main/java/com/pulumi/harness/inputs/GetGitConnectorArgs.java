// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetGitConnectorArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetGitConnectorArgs Empty = new GetGitConnectorArgs();

    /**
     * Id of the git connector.
     * 
     */
    @Import(name="id")
    private @Nullable Output<String> id;

    /**
     * @return Id of the git connector.
     * 
     */
    public Optional<Output<String>> id() {
        return Optional.ofNullable(this.id);
    }

    /**
     * The name of the git connector.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the git connector.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    private GetGitConnectorArgs() {}

    private GetGitConnectorArgs(GetGitConnectorArgs $) {
        this.id = $.id;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetGitConnectorArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetGitConnectorArgs $;

        public Builder() {
            $ = new GetGitConnectorArgs();
        }

        public Builder(GetGitConnectorArgs defaults) {
            $ = new GetGitConnectorArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param id Id of the git connector.
         * 
         * @return builder
         * 
         */
        public Builder id(@Nullable Output<String> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id Id of the git connector.
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            return id(Output.of(id));
        }

        /**
         * @param name The name of the git connector.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the git connector.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public GetGitConnectorArgs build() {
            return $;
        }
    }

}