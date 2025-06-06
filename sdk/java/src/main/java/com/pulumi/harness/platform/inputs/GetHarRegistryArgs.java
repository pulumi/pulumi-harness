// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.harness.platform.inputs.GetHarRegistryConfigArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetHarRegistryArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetHarRegistryArgs Empty = new GetHarRegistryArgs();

    @Import(name="allowedPatterns")
    private @Nullable Output<List<String>> allowedPatterns;

    public Optional<Output<List<String>>> allowedPatterns() {
        return Optional.ofNullable(this.allowedPatterns);
    }

    @Import(name="blockedPatterns")
    private @Nullable Output<List<String>> blockedPatterns;

    public Optional<Output<List<String>>> blockedPatterns() {
        return Optional.ofNullable(this.blockedPatterns);
    }

    @Import(name="configs")
    private @Nullable Output<List<GetHarRegistryConfigArgs>> configs;

    public Optional<Output<List<GetHarRegistryConfigArgs>>> configs() {
        return Optional.ofNullable(this.configs);
    }

    @Import(name="description")
    private @Nullable Output<String> description;

    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Unique identifier of the resource.
     * 
     */
    @Import(name="identifier", required=true)
    private Output<String> identifier;

    /**
     * @return Unique identifier of the resource.
     * 
     */
    public Output<String> identifier() {
        return this.identifier;
    }

    @Import(name="packageType")
    private @Nullable Output<String> packageType;

    public Optional<Output<String>> packageType() {
        return Optional.ofNullable(this.packageType);
    }

    @Import(name="parentRef")
    private @Nullable Output<String> parentRef;

    public Optional<Output<String>> parentRef() {
        return Optional.ofNullable(this.parentRef);
    }

    /**
     * Reference of the space.
     * 
     */
    @Import(name="spaceRef", required=true)
    private Output<String> spaceRef;

    /**
     * @return Reference of the space.
     * 
     */
    public Output<String> spaceRef() {
        return this.spaceRef;
    }

    private GetHarRegistryArgs() {}

    private GetHarRegistryArgs(GetHarRegistryArgs $) {
        this.allowedPatterns = $.allowedPatterns;
        this.blockedPatterns = $.blockedPatterns;
        this.configs = $.configs;
        this.description = $.description;
        this.identifier = $.identifier;
        this.packageType = $.packageType;
        this.parentRef = $.parentRef;
        this.spaceRef = $.spaceRef;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetHarRegistryArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetHarRegistryArgs $;

        public Builder() {
            $ = new GetHarRegistryArgs();
        }

        public Builder(GetHarRegistryArgs defaults) {
            $ = new GetHarRegistryArgs(Objects.requireNonNull(defaults));
        }

        public Builder allowedPatterns(@Nullable Output<List<String>> allowedPatterns) {
            $.allowedPatterns = allowedPatterns;
            return this;
        }

        public Builder allowedPatterns(List<String> allowedPatterns) {
            return allowedPatterns(Output.of(allowedPatterns));
        }

        public Builder allowedPatterns(String... allowedPatterns) {
            return allowedPatterns(List.of(allowedPatterns));
        }

        public Builder blockedPatterns(@Nullable Output<List<String>> blockedPatterns) {
            $.blockedPatterns = blockedPatterns;
            return this;
        }

        public Builder blockedPatterns(List<String> blockedPatterns) {
            return blockedPatterns(Output.of(blockedPatterns));
        }

        public Builder blockedPatterns(String... blockedPatterns) {
            return blockedPatterns(List.of(blockedPatterns));
        }

        public Builder configs(@Nullable Output<List<GetHarRegistryConfigArgs>> configs) {
            $.configs = configs;
            return this;
        }

        public Builder configs(List<GetHarRegistryConfigArgs> configs) {
            return configs(Output.of(configs));
        }

        public Builder configs(GetHarRegistryConfigArgs... configs) {
            return configs(List.of(configs));
        }

        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param identifier Unique identifier of the resource.
         * 
         * @return builder
         * 
         */
        public Builder identifier(Output<String> identifier) {
            $.identifier = identifier;
            return this;
        }

        /**
         * @param identifier Unique identifier of the resource.
         * 
         * @return builder
         * 
         */
        public Builder identifier(String identifier) {
            return identifier(Output.of(identifier));
        }

        public Builder packageType(@Nullable Output<String> packageType) {
            $.packageType = packageType;
            return this;
        }

        public Builder packageType(String packageType) {
            return packageType(Output.of(packageType));
        }

        public Builder parentRef(@Nullable Output<String> parentRef) {
            $.parentRef = parentRef;
            return this;
        }

        public Builder parentRef(String parentRef) {
            return parentRef(Output.of(parentRef));
        }

        /**
         * @param spaceRef Reference of the space.
         * 
         * @return builder
         * 
         */
        public Builder spaceRef(Output<String> spaceRef) {
            $.spaceRef = spaceRef;
            return this;
        }

        /**
         * @param spaceRef Reference of the space.
         * 
         * @return builder
         * 
         */
        public Builder spaceRef(String spaceRef) {
            return spaceRef(Output.of(spaceRef));
        }

        public GetHarRegistryArgs build() {
            if ($.identifier == null) {
                throw new MissingRequiredPropertyException("GetHarRegistryArgs", "identifier");
            }
            if ($.spaceRef == null) {
                throw new MissingRequiredPropertyException("GetHarRegistryArgs", "spaceRef");
            }
            return $;
        }
    }

}
