// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.autostopping.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetRuleVmHttpRouting extends com.pulumi.resources.InvokeArgs {

    public static final GetRuleVmHttpRouting Empty = new GetRuleVmHttpRouting();

    /**
     * Organization Identifier for the Entity
     * 
     */
    @Import(name="action")
    private @Nullable String action;

    /**
     * @return Organization Identifier for the Entity
     * 
     */
    public Optional<String> action() {
        return Optional.ofNullable(this.action);
    }

    /**
     * Port on the proxy
     * 
     */
    @Import(name="sourcePort")
    private @Nullable Integer sourcePort;

    /**
     * @return Port on the proxy
     * 
     */
    public Optional<Integer> sourcePort() {
        return Optional.ofNullable(this.sourcePort);
    }

    /**
     * Source protocol of the proxy can be http or https
     * 
     */
    @Import(name="sourceProtocol", required=true)
    private String sourceProtocol;

    /**
     * @return Source protocol of the proxy can be http or https
     * 
     */
    public String sourceProtocol() {
        return this.sourceProtocol;
    }

    /**
     * Port on the VM
     * 
     */
    @Import(name="targetPort")
    private @Nullable Integer targetPort;

    /**
     * @return Port on the VM
     * 
     */
    public Optional<Integer> targetPort() {
        return Optional.ofNullable(this.targetPort);
    }

    /**
     * Target protocol of the instance can be http or https
     * 
     */
    @Import(name="targetProtocol", required=true)
    private String targetProtocol;

    /**
     * @return Target protocol of the instance can be http or https
     * 
     */
    public String targetProtocol() {
        return this.targetProtocol;
    }

    private GetRuleVmHttpRouting() {}

    private GetRuleVmHttpRouting(GetRuleVmHttpRouting $) {
        this.action = $.action;
        this.sourcePort = $.sourcePort;
        this.sourceProtocol = $.sourceProtocol;
        this.targetPort = $.targetPort;
        this.targetProtocol = $.targetProtocol;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetRuleVmHttpRouting defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetRuleVmHttpRouting $;

        public Builder() {
            $ = new GetRuleVmHttpRouting();
        }

        public Builder(GetRuleVmHttpRouting defaults) {
            $ = new GetRuleVmHttpRouting(Objects.requireNonNull(defaults));
        }

        /**
         * @param action Organization Identifier for the Entity
         * 
         * @return builder
         * 
         */
        public Builder action(@Nullable String action) {
            $.action = action;
            return this;
        }

        /**
         * @param sourcePort Port on the proxy
         * 
         * @return builder
         * 
         */
        public Builder sourcePort(@Nullable Integer sourcePort) {
            $.sourcePort = sourcePort;
            return this;
        }

        /**
         * @param sourceProtocol Source protocol of the proxy can be http or https
         * 
         * @return builder
         * 
         */
        public Builder sourceProtocol(String sourceProtocol) {
            $.sourceProtocol = sourceProtocol;
            return this;
        }

        /**
         * @param targetPort Port on the VM
         * 
         * @return builder
         * 
         */
        public Builder targetPort(@Nullable Integer targetPort) {
            $.targetPort = targetPort;
            return this;
        }

        /**
         * @param targetProtocol Target protocol of the instance can be http or https
         * 
         * @return builder
         * 
         */
        public Builder targetProtocol(String targetProtocol) {
            $.targetProtocol = targetProtocol;
            return this;
        }

        public GetRuleVmHttpRouting build() {
            if ($.sourceProtocol == null) {
                throw new MissingRequiredPropertyException("GetRuleVmHttpRouting", "sourceProtocol");
            }
            if ($.targetProtocol == null) {
                throw new MissingRequiredPropertyException("GetRuleVmHttpRouting", "targetProtocol");
            }
            return $;
        }
    }

}
