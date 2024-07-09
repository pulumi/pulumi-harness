// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.autostopping.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RuleVmHttpHealthArgs extends com.pulumi.resources.ResourceArgs {

    public static final RuleVmHttpHealthArgs Empty = new RuleVmHttpHealthArgs();

    /**
     * API path to use for health check
     * 
     */
    @Import(name="path")
    private @Nullable Output<String> path;

    /**
     * @return API path to use for health check
     * 
     */
    public Optional<Output<String>> path() {
        return Optional.ofNullable(this.path);
    }

    /**
     * Health check port on the VM
     * 
     */
    @Import(name="port", required=true)
    private Output<Integer> port;

    /**
     * @return Health check port on the VM
     * 
     */
    public Output<Integer> port() {
        return this.port;
    }

    /**
     * Protocol can be http or https
     * 
     */
    @Import(name="protocol", required=true)
    private Output<String> protocol;

    /**
     * @return Protocol can be http or https
     * 
     */
    public Output<String> protocol() {
        return this.protocol;
    }

    /**
     * Lower limit for acceptable status code
     * 
     */
    @Import(name="statusCodeFrom")
    private @Nullable Output<Integer> statusCodeFrom;

    /**
     * @return Lower limit for acceptable status code
     * 
     */
    public Optional<Output<Integer>> statusCodeFrom() {
        return Optional.ofNullable(this.statusCodeFrom);
    }

    /**
     * Upper limit for acceptable status code
     * 
     */
    @Import(name="statusCodeTo")
    private @Nullable Output<Integer> statusCodeTo;

    /**
     * @return Upper limit for acceptable status code
     * 
     */
    public Optional<Output<Integer>> statusCodeTo() {
        return Optional.ofNullable(this.statusCodeTo);
    }

    /**
     * Health check timeout
     * 
     */
    @Import(name="timeout")
    private @Nullable Output<Integer> timeout;

    /**
     * @return Health check timeout
     * 
     */
    public Optional<Output<Integer>> timeout() {
        return Optional.ofNullable(this.timeout);
    }

    private RuleVmHttpHealthArgs() {}

    private RuleVmHttpHealthArgs(RuleVmHttpHealthArgs $) {
        this.path = $.path;
        this.port = $.port;
        this.protocol = $.protocol;
        this.statusCodeFrom = $.statusCodeFrom;
        this.statusCodeTo = $.statusCodeTo;
        this.timeout = $.timeout;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RuleVmHttpHealthArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RuleVmHttpHealthArgs $;

        public Builder() {
            $ = new RuleVmHttpHealthArgs();
        }

        public Builder(RuleVmHttpHealthArgs defaults) {
            $ = new RuleVmHttpHealthArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param path API path to use for health check
         * 
         * @return builder
         * 
         */
        public Builder path(@Nullable Output<String> path) {
            $.path = path;
            return this;
        }

        /**
         * @param path API path to use for health check
         * 
         * @return builder
         * 
         */
        public Builder path(String path) {
            return path(Output.of(path));
        }

        /**
         * @param port Health check port on the VM
         * 
         * @return builder
         * 
         */
        public Builder port(Output<Integer> port) {
            $.port = port;
            return this;
        }

        /**
         * @param port Health check port on the VM
         * 
         * @return builder
         * 
         */
        public Builder port(Integer port) {
            return port(Output.of(port));
        }

        /**
         * @param protocol Protocol can be http or https
         * 
         * @return builder
         * 
         */
        public Builder protocol(Output<String> protocol) {
            $.protocol = protocol;
            return this;
        }

        /**
         * @param protocol Protocol can be http or https
         * 
         * @return builder
         * 
         */
        public Builder protocol(String protocol) {
            return protocol(Output.of(protocol));
        }

        /**
         * @param statusCodeFrom Lower limit for acceptable status code
         * 
         * @return builder
         * 
         */
        public Builder statusCodeFrom(@Nullable Output<Integer> statusCodeFrom) {
            $.statusCodeFrom = statusCodeFrom;
            return this;
        }

        /**
         * @param statusCodeFrom Lower limit for acceptable status code
         * 
         * @return builder
         * 
         */
        public Builder statusCodeFrom(Integer statusCodeFrom) {
            return statusCodeFrom(Output.of(statusCodeFrom));
        }

        /**
         * @param statusCodeTo Upper limit for acceptable status code
         * 
         * @return builder
         * 
         */
        public Builder statusCodeTo(@Nullable Output<Integer> statusCodeTo) {
            $.statusCodeTo = statusCodeTo;
            return this;
        }

        /**
         * @param statusCodeTo Upper limit for acceptable status code
         * 
         * @return builder
         * 
         */
        public Builder statusCodeTo(Integer statusCodeTo) {
            return statusCodeTo(Output.of(statusCodeTo));
        }

        /**
         * @param timeout Health check timeout
         * 
         * @return builder
         * 
         */
        public Builder timeout(@Nullable Output<Integer> timeout) {
            $.timeout = timeout;
            return this;
        }

        /**
         * @param timeout Health check timeout
         * 
         * @return builder
         * 
         */
        public Builder timeout(Integer timeout) {
            return timeout(Output.of(timeout));
        }

        public RuleVmHttpHealthArgs build() {
            if ($.port == null) {
                throw new MissingRequiredPropertyException("RuleVmHttpHealthArgs", "port");
            }
            if ($.protocol == null) {
                throw new MissingRequiredPropertyException("RuleVmHttpHealthArgs", "protocol");
            }
            return $;
        }
    }

}