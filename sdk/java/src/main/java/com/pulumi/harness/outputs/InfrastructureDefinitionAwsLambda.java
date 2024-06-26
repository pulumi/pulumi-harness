// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class InfrastructureDefinitionAwsLambda {
    /**
     * @return The name of the cloud provider to connect with.
     * 
     */
    private String cloudProviderName;
    /**
     * @return The IAM role to use.
     * 
     */
    private @Nullable String iamRole;
    /**
     * @return The region to deploy to.
     * 
     */
    private String region;
    /**
     * @return The security group ids to apply to the ecs service.
     * 
     */
    private @Nullable List<String> securityGroupIds;
    /**
     * @return The subnet ids to apply to the ecs service.
     * 
     */
    private @Nullable List<String> subnetIds;
    /**
     * @return The VPC ids to use when selecting the instances.
     * 
     */
    private @Nullable String vpcId;

    private InfrastructureDefinitionAwsLambda() {}
    /**
     * @return The name of the cloud provider to connect with.
     * 
     */
    public String cloudProviderName() {
        return this.cloudProviderName;
    }
    /**
     * @return The IAM role to use.
     * 
     */
    public Optional<String> iamRole() {
        return Optional.ofNullable(this.iamRole);
    }
    /**
     * @return The region to deploy to.
     * 
     */
    public String region() {
        return this.region;
    }
    /**
     * @return The security group ids to apply to the ecs service.
     * 
     */
    public List<String> securityGroupIds() {
        return this.securityGroupIds == null ? List.of() : this.securityGroupIds;
    }
    /**
     * @return The subnet ids to apply to the ecs service.
     * 
     */
    public List<String> subnetIds() {
        return this.subnetIds == null ? List.of() : this.subnetIds;
    }
    /**
     * @return The VPC ids to use when selecting the instances.
     * 
     */
    public Optional<String> vpcId() {
        return Optional.ofNullable(this.vpcId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InfrastructureDefinitionAwsLambda defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String cloudProviderName;
        private @Nullable String iamRole;
        private String region;
        private @Nullable List<String> securityGroupIds;
        private @Nullable List<String> subnetIds;
        private @Nullable String vpcId;
        public Builder() {}
        public Builder(InfrastructureDefinitionAwsLambda defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cloudProviderName = defaults.cloudProviderName;
    	      this.iamRole = defaults.iamRole;
    	      this.region = defaults.region;
    	      this.securityGroupIds = defaults.securityGroupIds;
    	      this.subnetIds = defaults.subnetIds;
    	      this.vpcId = defaults.vpcId;
        }

        @CustomType.Setter
        public Builder cloudProviderName(String cloudProviderName) {
            if (cloudProviderName == null) {
              throw new MissingRequiredPropertyException("InfrastructureDefinitionAwsLambda", "cloudProviderName");
            }
            this.cloudProviderName = cloudProviderName;
            return this;
        }
        @CustomType.Setter
        public Builder iamRole(@Nullable String iamRole) {

            this.iamRole = iamRole;
            return this;
        }
        @CustomType.Setter
        public Builder region(String region) {
            if (region == null) {
              throw new MissingRequiredPropertyException("InfrastructureDefinitionAwsLambda", "region");
            }
            this.region = region;
            return this;
        }
        @CustomType.Setter
        public Builder securityGroupIds(@Nullable List<String> securityGroupIds) {

            this.securityGroupIds = securityGroupIds;
            return this;
        }
        public Builder securityGroupIds(String... securityGroupIds) {
            return securityGroupIds(List.of(securityGroupIds));
        }
        @CustomType.Setter
        public Builder subnetIds(@Nullable List<String> subnetIds) {

            this.subnetIds = subnetIds;
            return this;
        }
        public Builder subnetIds(String... subnetIds) {
            return subnetIds(List.of(subnetIds));
        }
        @CustomType.Setter
        public Builder vpcId(@Nullable String vpcId) {

            this.vpcId = vpcId;
            return this;
        }
        public InfrastructureDefinitionAwsLambda build() {
            final var _resultValue = new InfrastructureDefinitionAwsLambda();
            _resultValue.cloudProviderName = cloudProviderName;
            _resultValue.iamRole = iamRole;
            _resultValue.region = region;
            _resultValue.securityGroupIds = securityGroupIds;
            _resultValue.subnetIds = subnetIds;
            _resultValue.vpcId = vpcId;
            return _resultValue;
        }
    }
}
