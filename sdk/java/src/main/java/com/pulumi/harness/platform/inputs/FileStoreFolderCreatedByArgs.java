// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class FileStoreFolderCreatedByArgs extends com.pulumi.resources.ResourceArgs {

    public static final FileStoreFolderCreatedByArgs Empty = new FileStoreFolderCreatedByArgs();

    /**
     * User email
     * 
     */
    @Import(name="email")
    private @Nullable Output<String> email;

    /**
     * @return User email
     * 
     */
    public Optional<Output<String>> email() {
        return Optional.ofNullable(this.email);
    }

    /**
     * User name
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return User name
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    private FileStoreFolderCreatedByArgs() {}

    private FileStoreFolderCreatedByArgs(FileStoreFolderCreatedByArgs $) {
        this.email = $.email;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FileStoreFolderCreatedByArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FileStoreFolderCreatedByArgs $;

        public Builder() {
            $ = new FileStoreFolderCreatedByArgs();
        }

        public Builder(FileStoreFolderCreatedByArgs defaults) {
            $ = new FileStoreFolderCreatedByArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param email User email
         * 
         * @return builder
         * 
         */
        public Builder email(@Nullable Output<String> email) {
            $.email = email;
            return this;
        }

        /**
         * @param email User email
         * 
         * @return builder
         * 
         */
        public Builder email(String email) {
            return email(Output.of(email));
        }

        /**
         * @param name User name
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name User name
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public FileStoreFolderCreatedByArgs build() {
            return $;
        }
    }

}
