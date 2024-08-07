// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SecretTextAdditionalMetadataValueArgs extends com.pulumi.resources.ResourceArgs {

    public static final SecretTextAdditionalMetadataValueArgs Empty = new SecretTextAdditionalMetadataValueArgs();

    @Import(name="version")
    private @Nullable Output<String> version;

    public Optional<Output<String>> version() {
        return Optional.ofNullable(this.version);
    }

    private SecretTextAdditionalMetadataValueArgs() {}

    private SecretTextAdditionalMetadataValueArgs(SecretTextAdditionalMetadataValueArgs $) {
        this.version = $.version;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SecretTextAdditionalMetadataValueArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SecretTextAdditionalMetadataValueArgs $;

        public Builder() {
            $ = new SecretTextAdditionalMetadataValueArgs();
        }

        public Builder(SecretTextAdditionalMetadataValueArgs defaults) {
            $ = new SecretTextAdditionalMetadataValueArgs(Objects.requireNonNull(defaults));
        }

        public Builder version(@Nullable Output<String> version) {
            $.version = version;
            return this;
        }

        public Builder version(String version) {
            return version(Output.of(version));
        }

        public SecretTextAdditionalMetadataValueArgs build() {
            return $;
        }
    }

}
