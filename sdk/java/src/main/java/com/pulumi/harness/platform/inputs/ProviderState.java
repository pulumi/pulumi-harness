// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.harness.platform.inputs.ProviderSpecArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ProviderState extends com.pulumi.resources.ResourceArgs {

    public static final ProviderState Empty = new ProviderState();

    /**
     * The description of the provider entity.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return The description of the provider entity.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The identifier of the provider entity.
     * 
     */
    @Import(name="identifier")
    private @Nullable Output<String> identifier;

    /**
     * @return The identifier of the provider entity.
     * 
     */
    public Optional<Output<String>> identifier() {
        return Optional.ofNullable(this.identifier);
    }

    /**
     * The last modified time of the provider entity.
     * 
     */
    @Import(name="lastModifiedAt")
    private @Nullable Output<Integer> lastModifiedAt;

    /**
     * @return The last modified time of the provider entity.
     * 
     */
    public Optional<Output<Integer>> lastModifiedAt() {
        return Optional.ofNullable(this.lastModifiedAt);
    }

    /**
     * The name of the provider entity.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the provider entity.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Contains parameters related to the provider entity.
     * 
     */
    @Import(name="spec")
    private @Nullable Output<ProviderSpecArgs> spec;

    /**
     * @return Contains parameters related to the provider entity.
     * 
     */
    public Optional<Output<ProviderSpecArgs>> spec() {
        return Optional.ofNullable(this.spec);
    }

    /**
     * The type of the provider entity.
     * 
     */
    @Import(name="type")
    private @Nullable Output<String> type;

    /**
     * @return The type of the provider entity.
     * 
     */
    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    private ProviderState() {}

    private ProviderState(ProviderState $) {
        this.description = $.description;
        this.identifier = $.identifier;
        this.lastModifiedAt = $.lastModifiedAt;
        this.name = $.name;
        this.spec = $.spec;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ProviderState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ProviderState $;

        public Builder() {
            $ = new ProviderState();
        }

        public Builder(ProviderState defaults) {
            $ = new ProviderState(Objects.requireNonNull(defaults));
        }

        /**
         * @param description The description of the provider entity.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description The description of the provider entity.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param identifier The identifier of the provider entity.
         * 
         * @return builder
         * 
         */
        public Builder identifier(@Nullable Output<String> identifier) {
            $.identifier = identifier;
            return this;
        }

        /**
         * @param identifier The identifier of the provider entity.
         * 
         * @return builder
         * 
         */
        public Builder identifier(String identifier) {
            return identifier(Output.of(identifier));
        }

        /**
         * @param lastModifiedAt The last modified time of the provider entity.
         * 
         * @return builder
         * 
         */
        public Builder lastModifiedAt(@Nullable Output<Integer> lastModifiedAt) {
            $.lastModifiedAt = lastModifiedAt;
            return this;
        }

        /**
         * @param lastModifiedAt The last modified time of the provider entity.
         * 
         * @return builder
         * 
         */
        public Builder lastModifiedAt(Integer lastModifiedAt) {
            return lastModifiedAt(Output.of(lastModifiedAt));
        }

        /**
         * @param name The name of the provider entity.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the provider entity.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param spec Contains parameters related to the provider entity.
         * 
         * @return builder
         * 
         */
        public Builder spec(@Nullable Output<ProviderSpecArgs> spec) {
            $.spec = spec;
            return this;
        }

        /**
         * @param spec Contains parameters related to the provider entity.
         * 
         * @return builder
         * 
         */
        public Builder spec(ProviderSpecArgs spec) {
            return spec(Output.of(spec));
        }

        /**
         * @param type The type of the provider entity.
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type The type of the provider entity.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public ProviderState build() {
            return $;
        }
    }

}
