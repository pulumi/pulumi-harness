// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class PolicysetPolicy {
    /**
     * @return Account Identifier of the account
     * 
     */
    private String identifier;
    /**
     * @return Organization Identifier
     * 
     */
    private String severity;

    private PolicysetPolicy() {}
    /**
     * @return Account Identifier of the account
     * 
     */
    public String identifier() {
        return this.identifier;
    }
    /**
     * @return Organization Identifier
     * 
     */
    public String severity() {
        return this.severity;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PolicysetPolicy defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String identifier;
        private String severity;
        public Builder() {}
        public Builder(PolicysetPolicy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.identifier = defaults.identifier;
    	      this.severity = defaults.severity;
        }

        @CustomType.Setter
        public Builder identifier(String identifier) {
            this.identifier = Objects.requireNonNull(identifier);
            return this;
        }
        @CustomType.Setter
        public Builder severity(String severity) {
            this.severity = Objects.requireNonNull(severity);
            return this;
        }
        public PolicysetPolicy build() {
            final var o = new PolicysetPolicy();
            o.identifier = identifier;
            o.severity = severity;
            return o;
        }
    }
}