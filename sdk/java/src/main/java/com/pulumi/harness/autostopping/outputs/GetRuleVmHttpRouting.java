// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.autostopping.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetRuleVmHttpRouting {
    /**
     * @return Organization Identifier for the Entity
     * 
     */
    private @Nullable String action;
    /**
     * @return Port on the proxy
     * 
     */
    private @Nullable Integer sourcePort;
    /**
     * @return Source protocol of the proxy can be http or https
     * 
     */
    private String sourceProtocol;
    /**
     * @return Port on the VM
     * 
     */
    private @Nullable Integer targetPort;
    /**
     * @return Target protocol of the instance can be http or https
     * 
     */
    private String targetProtocol;

    private GetRuleVmHttpRouting() {}
    /**
     * @return Organization Identifier for the Entity
     * 
     */
    public Optional<String> action() {
        return Optional.ofNullable(this.action);
    }
    /**
     * @return Port on the proxy
     * 
     */
    public Optional<Integer> sourcePort() {
        return Optional.ofNullable(this.sourcePort);
    }
    /**
     * @return Source protocol of the proxy can be http or https
     * 
     */
    public String sourceProtocol() {
        return this.sourceProtocol;
    }
    /**
     * @return Port on the VM
     * 
     */
    public Optional<Integer> targetPort() {
        return Optional.ofNullable(this.targetPort);
    }
    /**
     * @return Target protocol of the instance can be http or https
     * 
     */
    public String targetProtocol() {
        return this.targetProtocol;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRuleVmHttpRouting defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String action;
        private @Nullable Integer sourcePort;
        private String sourceProtocol;
        private @Nullable Integer targetPort;
        private String targetProtocol;
        public Builder() {}
        public Builder(GetRuleVmHttpRouting defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.action = defaults.action;
    	      this.sourcePort = defaults.sourcePort;
    	      this.sourceProtocol = defaults.sourceProtocol;
    	      this.targetPort = defaults.targetPort;
    	      this.targetProtocol = defaults.targetProtocol;
        }

        @CustomType.Setter
        public Builder action(@Nullable String action) {

            this.action = action;
            return this;
        }
        @CustomType.Setter
        public Builder sourcePort(@Nullable Integer sourcePort) {

            this.sourcePort = sourcePort;
            return this;
        }
        @CustomType.Setter
        public Builder sourceProtocol(String sourceProtocol) {
            if (sourceProtocol == null) {
              throw new MissingRequiredPropertyException("GetRuleVmHttpRouting", "sourceProtocol");
            }
            this.sourceProtocol = sourceProtocol;
            return this;
        }
        @CustomType.Setter
        public Builder targetPort(@Nullable Integer targetPort) {

            this.targetPort = targetPort;
            return this;
        }
        @CustomType.Setter
        public Builder targetProtocol(String targetProtocol) {
            if (targetProtocol == null) {
              throw new MissingRequiredPropertyException("GetRuleVmHttpRouting", "targetProtocol");
            }
            this.targetProtocol = targetProtocol;
            return this;
        }
        public GetRuleVmHttpRouting build() {
            final var _resultValue = new GetRuleVmHttpRouting();
            _resultValue.action = action;
            _resultValue.sourcePort = sourcePort;
            _resultValue.sourceProtocol = sourceProtocol;
            _resultValue.targetPort = targetPort;
            _resultValue.targetProtocol = targetProtocol;
            return _resultValue;
        }
    }
}
