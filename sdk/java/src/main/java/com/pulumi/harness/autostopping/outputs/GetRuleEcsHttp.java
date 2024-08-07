// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.autostopping.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetRuleEcsHttp {
    /**
     * @return Id of the proxy
     * 
     */
    private String proxyId;

    private GetRuleEcsHttp() {}
    /**
     * @return Id of the proxy
     * 
     */
    public String proxyId() {
        return this.proxyId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRuleEcsHttp defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String proxyId;
        public Builder() {}
        public Builder(GetRuleEcsHttp defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.proxyId = defaults.proxyId;
        }

        @CustomType.Setter
        public Builder proxyId(String proxyId) {
            if (proxyId == null) {
              throw new MissingRequiredPropertyException("GetRuleEcsHttp", "proxyId");
            }
            this.proxyId = proxyId;
            return this;
        }
        public GetRuleEcsHttp build() {
            final var _resultValue = new GetRuleEcsHttp();
            _resultValue.proxyId = proxyId;
            return _resultValue;
        }
    }
}
