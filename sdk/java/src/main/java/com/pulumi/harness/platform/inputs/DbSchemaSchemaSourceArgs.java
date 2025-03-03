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


public final class DbSchemaSchemaSourceArgs extends com.pulumi.resources.ResourceArgs {

    public static final DbSchemaSchemaSourceArgs Empty = new DbSchemaSchemaSourceArgs();

    /**
     * If connector type is artifactory, path to the archive file which contains the changeLog
     * 
     */
    @Import(name="archivePath")
    private @Nullable Output<String> archivePath;

    /**
     * @return If connector type is artifactory, path to the archive file which contains the changeLog
     * 
     */
    public Optional<Output<String>> archivePath() {
        return Optional.ofNullable(this.archivePath);
    }

    /**
     * Connector to repository at which to find details about the database schema
     * 
     */
    @Import(name="connector", required=true)
    private Output<String> connector;

    /**
     * @return Connector to repository at which to find details about the database schema
     * 
     */
    public Output<String> connector() {
        return this.connector;
    }

    /**
     * The path within the specified repository at which to find details about the database schema
     * 
     */
    @Import(name="location", required=true)
    private Output<String> location;

    /**
     * @return The path within the specified repository at which to find details about the database schema
     * 
     */
    public Output<String> location() {
        return this.location;
    }

    /**
     * If connector url is of account, which repository to connect to using the connector
     * 
     */
    @Import(name="repo")
    private @Nullable Output<String> repo;

    /**
     * @return If connector url is of account, which repository to connect to using the connector
     * 
     */
    public Optional<Output<String>> repo() {
        return Optional.ofNullable(this.repo);
    }

    private DbSchemaSchemaSourceArgs() {}

    private DbSchemaSchemaSourceArgs(DbSchemaSchemaSourceArgs $) {
        this.archivePath = $.archivePath;
        this.connector = $.connector;
        this.location = $.location;
        this.repo = $.repo;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DbSchemaSchemaSourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DbSchemaSchemaSourceArgs $;

        public Builder() {
            $ = new DbSchemaSchemaSourceArgs();
        }

        public Builder(DbSchemaSchemaSourceArgs defaults) {
            $ = new DbSchemaSchemaSourceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param archivePath If connector type is artifactory, path to the archive file which contains the changeLog
         * 
         * @return builder
         * 
         */
        public Builder archivePath(@Nullable Output<String> archivePath) {
            $.archivePath = archivePath;
            return this;
        }

        /**
         * @param archivePath If connector type is artifactory, path to the archive file which contains the changeLog
         * 
         * @return builder
         * 
         */
        public Builder archivePath(String archivePath) {
            return archivePath(Output.of(archivePath));
        }

        /**
         * @param connector Connector to repository at which to find details about the database schema
         * 
         * @return builder
         * 
         */
        public Builder connector(Output<String> connector) {
            $.connector = connector;
            return this;
        }

        /**
         * @param connector Connector to repository at which to find details about the database schema
         * 
         * @return builder
         * 
         */
        public Builder connector(String connector) {
            return connector(Output.of(connector));
        }

        /**
         * @param location The path within the specified repository at which to find details about the database schema
         * 
         * @return builder
         * 
         */
        public Builder location(Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location The path within the specified repository at which to find details about the database schema
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param repo If connector url is of account, which repository to connect to using the connector
         * 
         * @return builder
         * 
         */
        public Builder repo(@Nullable Output<String> repo) {
            $.repo = repo;
            return this;
        }

        /**
         * @param repo If connector url is of account, which repository to connect to using the connector
         * 
         * @return builder
         * 
         */
        public Builder repo(String repo) {
            return repo(Output.of(repo));
        }

        public DbSchemaSchemaSourceArgs build() {
            if ($.connector == null) {
                throw new MissingRequiredPropertyException("DbSchemaSchemaSourceArgs", "connector");
            }
            if ($.location == null) {
                throw new MissingRequiredPropertyException("DbSchemaSchemaSourceArgs", "location");
            }
            return $;
        }
    }

}
