// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.autostopping.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.harness.autostopping.outputs.RuleVmTcpForwardRule;
import com.pulumi.harness.autostopping.outputs.RuleVmTcpRdp;
import com.pulumi.harness.autostopping.outputs.RuleVmTcpSsh;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class RuleVmTcp {
    /**
     * @return Additional tcp forwarding rules
     * 
     */
    private @Nullable List<RuleVmTcpForwardRule> forwardRules;
    /**
     * @return Id of the Proxy
     * 
     */
    private String proxyId;
    /**
     * @return RDP configuration
     * 
     */
    private @Nullable List<RuleVmTcpRdp> rdps;
    /**
     * @return SSH configuration
     * 
     */
    private @Nullable List<RuleVmTcpSsh> sshes;

    private RuleVmTcp() {}
    /**
     * @return Additional tcp forwarding rules
     * 
     */
    public List<RuleVmTcpForwardRule> forwardRules() {
        return this.forwardRules == null ? List.of() : this.forwardRules;
    }
    /**
     * @return Id of the Proxy
     * 
     */
    public String proxyId() {
        return this.proxyId;
    }
    /**
     * @return RDP configuration
     * 
     */
    public List<RuleVmTcpRdp> rdps() {
        return this.rdps == null ? List.of() : this.rdps;
    }
    /**
     * @return SSH configuration
     * 
     */
    public List<RuleVmTcpSsh> sshes() {
        return this.sshes == null ? List.of() : this.sshes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleVmTcp defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<RuleVmTcpForwardRule> forwardRules;
        private String proxyId;
        private @Nullable List<RuleVmTcpRdp> rdps;
        private @Nullable List<RuleVmTcpSsh> sshes;
        public Builder() {}
        public Builder(RuleVmTcp defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.forwardRules = defaults.forwardRules;
    	      this.proxyId = defaults.proxyId;
    	      this.rdps = defaults.rdps;
    	      this.sshes = defaults.sshes;
        }

        @CustomType.Setter
        public Builder forwardRules(@Nullable List<RuleVmTcpForwardRule> forwardRules) {

            this.forwardRules = forwardRules;
            return this;
        }
        public Builder forwardRules(RuleVmTcpForwardRule... forwardRules) {
            return forwardRules(List.of(forwardRules));
        }
        @CustomType.Setter
        public Builder proxyId(String proxyId) {
            if (proxyId == null) {
              throw new MissingRequiredPropertyException("RuleVmTcp", "proxyId");
            }
            this.proxyId = proxyId;
            return this;
        }
        @CustomType.Setter
        public Builder rdps(@Nullable List<RuleVmTcpRdp> rdps) {

            this.rdps = rdps;
            return this;
        }
        public Builder rdps(RuleVmTcpRdp... rdps) {
            return rdps(List.of(rdps));
        }
        @CustomType.Setter
        public Builder sshes(@Nullable List<RuleVmTcpSsh> sshes) {

            this.sshes = sshes;
            return this;
        }
        public Builder sshes(RuleVmTcpSsh... sshes) {
            return sshes(List.of(sshes));
        }
        public RuleVmTcp build() {
            final var _resultValue = new RuleVmTcp();
            _resultValue.forwardRules = forwardRules;
            _resultValue.proxyId = proxyId;
            _resultValue.rdps = rdps;
            _resultValue.sshes = sshes;
            return _resultValue;
        }
    }
}