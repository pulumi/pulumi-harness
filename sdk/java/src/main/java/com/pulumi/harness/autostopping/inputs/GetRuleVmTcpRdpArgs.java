// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.autostopping.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetRuleVmTcpRdpArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetRuleVmTcpRdpArgs Empty = new GetRuleVmTcpRdpArgs();

    /**
     * Port to listen on the proxy
     * 
     */
    @Import(name="connectOn")
    private @Nullable Output<Integer> connectOn;

    /**
     * @return Port to listen on the proxy
     * 
     */
    public Optional<Output<Integer>> connectOn() {
        return Optional.ofNullable(this.connectOn);
    }

    /**
     * Port to listen on the vm
     * 
     */
    @Import(name="port")
    private @Nullable Output<Integer> port;

    /**
     * @return Port to listen on the vm
     * 
     */
    public Optional<Output<Integer>> port() {
        return Optional.ofNullable(this.port);
    }

    private GetRuleVmTcpRdpArgs() {}

    private GetRuleVmTcpRdpArgs(GetRuleVmTcpRdpArgs $) {
        this.connectOn = $.connectOn;
        this.port = $.port;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetRuleVmTcpRdpArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetRuleVmTcpRdpArgs $;

        public Builder() {
            $ = new GetRuleVmTcpRdpArgs();
        }

        public Builder(GetRuleVmTcpRdpArgs defaults) {
            $ = new GetRuleVmTcpRdpArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param connectOn Port to listen on the proxy
         * 
         * @return builder
         * 
         */
        public Builder connectOn(@Nullable Output<Integer> connectOn) {
            $.connectOn = connectOn;
            return this;
        }

        /**
         * @param connectOn Port to listen on the proxy
         * 
         * @return builder
         * 
         */
        public Builder connectOn(Integer connectOn) {
            return connectOn(Output.of(connectOn));
        }

        /**
         * @param port Port to listen on the vm
         * 
         * @return builder
         * 
         */
        public Builder port(@Nullable Output<Integer> port) {
            $.port = port;
            return this;
        }

        /**
         * @param port Port to listen on the vm
         * 
         * @return builder
         * 
         */
        public Builder port(Integer port) {
            return port(Output.of(port));
        }

        public GetRuleVmTcpRdpArgs build() {
            return $;
        }
    }

}