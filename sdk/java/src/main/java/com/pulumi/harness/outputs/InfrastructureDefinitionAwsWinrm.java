// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class InfrastructureDefinitionAwsWinrm {
    /**
     * @return The name of the autoscaling group.
     * 
     */
    private String autoscalingGroupName;
    /**
     * @return The name of the cloud provider to connect with.
     * 
     */
    private String cloudProviderName;
    /**
     * @return The desired capacity of the autoscaling group.
     * 
     */
    private @Nullable Integer desiredCapacity;
    /**
     * @return The name of the host connection attributes to use.
     * 
     */
    private String hostConnectionAttrsName;
    /**
     * @return The type of host connection to use. Valid options are PRIVATE*DNS, PUBLIC*DNS, PRIVATE*IP, PUBLIC*IP
     * 
     */
    private String hostConnectionType;
    /**
     * @return The naming convention to use for the hostname. Defaults to ${host.ec2Instance.privateDnsName.split(&#39;.&#39;)[0]}
     * 
     */
    private @Nullable String hostnameConvention;
    /**
     * @return The name of the load balancer to use.
     * 
     */
    private @Nullable String loadbalancerName;
    /**
     * @return The region to deploy to.
     * 
     */
    private String region;

    private InfrastructureDefinitionAwsWinrm() {}
    /**
     * @return The name of the autoscaling group.
     * 
     */
    public String autoscalingGroupName() {
        return this.autoscalingGroupName;
    }
    /**
     * @return The name of the cloud provider to connect with.
     * 
     */
    public String cloudProviderName() {
        return this.cloudProviderName;
    }
    /**
     * @return The desired capacity of the autoscaling group.
     * 
     */
    public Optional<Integer> desiredCapacity() {
        return Optional.ofNullable(this.desiredCapacity);
    }
    /**
     * @return The name of the host connection attributes to use.
     * 
     */
    public String hostConnectionAttrsName() {
        return this.hostConnectionAttrsName;
    }
    /**
     * @return The type of host connection to use. Valid options are PRIVATE*DNS, PUBLIC*DNS, PRIVATE*IP, PUBLIC*IP
     * 
     */
    public String hostConnectionType() {
        return this.hostConnectionType;
    }
    /**
     * @return The naming convention to use for the hostname. Defaults to ${host.ec2Instance.privateDnsName.split(&#39;.&#39;)[0]}
     * 
     */
    public Optional<String> hostnameConvention() {
        return Optional.ofNullable(this.hostnameConvention);
    }
    /**
     * @return The name of the load balancer to use.
     * 
     */
    public Optional<String> loadbalancerName() {
        return Optional.ofNullable(this.loadbalancerName);
    }
    /**
     * @return The region to deploy to.
     * 
     */
    public String region() {
        return this.region;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InfrastructureDefinitionAwsWinrm defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String autoscalingGroupName;
        private String cloudProviderName;
        private @Nullable Integer desiredCapacity;
        private String hostConnectionAttrsName;
        private String hostConnectionType;
        private @Nullable String hostnameConvention;
        private @Nullable String loadbalancerName;
        private String region;
        public Builder() {}
        public Builder(InfrastructureDefinitionAwsWinrm defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoscalingGroupName = defaults.autoscalingGroupName;
    	      this.cloudProviderName = defaults.cloudProviderName;
    	      this.desiredCapacity = defaults.desiredCapacity;
    	      this.hostConnectionAttrsName = defaults.hostConnectionAttrsName;
    	      this.hostConnectionType = defaults.hostConnectionType;
    	      this.hostnameConvention = defaults.hostnameConvention;
    	      this.loadbalancerName = defaults.loadbalancerName;
    	      this.region = defaults.region;
        }

        @CustomType.Setter
        public Builder autoscalingGroupName(String autoscalingGroupName) {
            if (autoscalingGroupName == null) {
              throw new MissingRequiredPropertyException("InfrastructureDefinitionAwsWinrm", "autoscalingGroupName");
            }
            this.autoscalingGroupName = autoscalingGroupName;
            return this;
        }
        @CustomType.Setter
        public Builder cloudProviderName(String cloudProviderName) {
            if (cloudProviderName == null) {
              throw new MissingRequiredPropertyException("InfrastructureDefinitionAwsWinrm", "cloudProviderName");
            }
            this.cloudProviderName = cloudProviderName;
            return this;
        }
        @CustomType.Setter
        public Builder desiredCapacity(@Nullable Integer desiredCapacity) {

            this.desiredCapacity = desiredCapacity;
            return this;
        }
        @CustomType.Setter
        public Builder hostConnectionAttrsName(String hostConnectionAttrsName) {
            if (hostConnectionAttrsName == null) {
              throw new MissingRequiredPropertyException("InfrastructureDefinitionAwsWinrm", "hostConnectionAttrsName");
            }
            this.hostConnectionAttrsName = hostConnectionAttrsName;
            return this;
        }
        @CustomType.Setter
        public Builder hostConnectionType(String hostConnectionType) {
            if (hostConnectionType == null) {
              throw new MissingRequiredPropertyException("InfrastructureDefinitionAwsWinrm", "hostConnectionType");
            }
            this.hostConnectionType = hostConnectionType;
            return this;
        }
        @CustomType.Setter
        public Builder hostnameConvention(@Nullable String hostnameConvention) {

            this.hostnameConvention = hostnameConvention;
            return this;
        }
        @CustomType.Setter
        public Builder loadbalancerName(@Nullable String loadbalancerName) {

            this.loadbalancerName = loadbalancerName;
            return this;
        }
        @CustomType.Setter
        public Builder region(String region) {
            if (region == null) {
              throw new MissingRequiredPropertyException("InfrastructureDefinitionAwsWinrm", "region");
            }
            this.region = region;
            return this;
        }
        public InfrastructureDefinitionAwsWinrm build() {
            final var _resultValue = new InfrastructureDefinitionAwsWinrm();
            _resultValue.autoscalingGroupName = autoscalingGroupName;
            _resultValue.cloudProviderName = cloudProviderName;
            _resultValue.desiredCapacity = desiredCapacity;
            _resultValue.hostConnectionAttrsName = hostConnectionAttrsName;
            _resultValue.hostConnectionType = hostConnectionType;
            _resultValue.hostnameConvention = hostnameConvention;
            _resultValue.loadbalancerName = loadbalancerName;
            _resultValue.region = region;
            return _resultValue;
        }
    }
}
