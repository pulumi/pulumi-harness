// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetDashboardFoldersArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetDashboardFoldersArgs Empty = new GetDashboardFoldersArgs();

    /**
     * Identifier of the folder.
     * 
     */
    @Import(name="id", required=true)
    private Output<String> id;

    /**
     * @return Identifier of the folder.
     * 
     */
    public Output<String> id() {
        return this.id;
    }

    @Import(name="identifier")
    private @Nullable Output<String> identifier;

    public Optional<Output<String>> identifier() {
        return Optional.ofNullable(this.identifier);
    }

    /**
     * Name of the folder.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Name of the folder.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    private GetDashboardFoldersArgs() {}

    private GetDashboardFoldersArgs(GetDashboardFoldersArgs $) {
        this.id = $.id;
        this.identifier = $.identifier;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetDashboardFoldersArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetDashboardFoldersArgs $;

        public Builder() {
            $ = new GetDashboardFoldersArgs();
        }

        public Builder(GetDashboardFoldersArgs defaults) {
            $ = new GetDashboardFoldersArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param id Identifier of the folder.
         * 
         * @return builder
         * 
         */
        public Builder id(Output<String> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id Identifier of the folder.
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            return id(Output.of(id));
        }

        public Builder identifier(@Nullable Output<String> identifier) {
            $.identifier = identifier;
            return this;
        }

        public Builder identifier(String identifier) {
            return identifier(Output.of(identifier));
        }

        /**
         * @param name Name of the folder.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of the folder.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public GetDashboardFoldersArgs build() {
            if ($.id == null) {
                throw new MissingRequiredPropertyException("GetDashboardFoldersArgs", "id");
            }
            return $;
        }
    }

}
