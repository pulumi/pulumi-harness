// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.autostopping.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.harness.autostopping.outputs.GetRuleVmHttpHealth;
import com.pulumi.harness.autostopping.outputs.GetRuleVmHttpRouting;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class GetRuleVmHttp {
    /**
     * @return Health Check Details
     * 
     */
    private @Nullable List<GetRuleVmHttpHealth> healths;
    /**
     * @return Id of the proxy
     * 
     */
    private String proxyId;
    /**
     * @return Routing configuration used to access the instances
     * 
     */
    private @Nullable List<GetRuleVmHttpRouting> routings;

    private GetRuleVmHttp() {}
    /**
     * @return Health Check Details
     * 
     */
    public List<GetRuleVmHttpHealth> healths() {
        return this.healths == null ? List.of() : this.healths;
    }
    /**
     * @return Id of the proxy
     * 
     */
    public String proxyId() {
        return this.proxyId;
    }
    /**
     * @return Routing configuration used to access the instances
     * 
     */
    public List<GetRuleVmHttpRouting> routings() {
        return this.routings == null ? List.of() : this.routings;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRuleVmHttp defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<GetRuleVmHttpHealth> healths;
        private String proxyId;
        private @Nullable List<GetRuleVmHttpRouting> routings;
        public Builder() {}
        public Builder(GetRuleVmHttp defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.healths = defaults.healths;
    	      this.proxyId = defaults.proxyId;
    	      this.routings = defaults.routings;
        }

        @CustomType.Setter
        public Builder healths(@Nullable List<GetRuleVmHttpHealth> healths) {

            this.healths = healths;
            return this;
        }
        public Builder healths(GetRuleVmHttpHealth... healths) {
            return healths(List.of(healths));
        }
        @CustomType.Setter
        public Builder proxyId(String proxyId) {
            if (proxyId == null) {
              throw new MissingRequiredPropertyException("GetRuleVmHttp", "proxyId");
            }
            this.proxyId = proxyId;
            return this;
        }
        @CustomType.Setter
        public Builder routings(@Nullable List<GetRuleVmHttpRouting> routings) {

            this.routings = routings;
            return this;
        }
        public Builder routings(GetRuleVmHttpRouting... routings) {
            return routings(List.of(routings));
        }
        public GetRuleVmHttp build() {
            final var _resultValue = new GetRuleVmHttp();
            _resultValue.healths = healths;
            _resultValue.proxyId = proxyId;
            _resultValue.routings = routings;
            return _resultValue;
        }
    }
}
