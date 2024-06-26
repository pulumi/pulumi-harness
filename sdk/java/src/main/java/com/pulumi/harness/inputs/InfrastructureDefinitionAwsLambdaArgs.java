// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class InfrastructureDefinitionAwsLambdaArgs extends com.pulumi.resources.ResourceArgs {

    public static final InfrastructureDefinitionAwsLambdaArgs Empty = new InfrastructureDefinitionAwsLambdaArgs();

    /**
     * The name of the cloud provider to connect with.
     * 
     */
    @Import(name="cloudProviderName", required=true)
    private Output<String> cloudProviderName;

    /**
     * @return The name of the cloud provider to connect with.
     * 
     */
    public Output<String> cloudProviderName() {
        return this.cloudProviderName;
    }

    /**
     * The IAM role to use.
     * 
     */
    @Import(name="iamRole")
    private @Nullable Output<String> iamRole;

    /**
     * @return The IAM role to use.
     * 
     */
    public Optional<Output<String>> iamRole() {
        return Optional.ofNullable(this.iamRole);
    }

    /**
     * The region to deploy to.
     * 
     */
    @Import(name="region", required=true)
    private Output<String> region;

    /**
     * @return The region to deploy to.
     * 
     */
    public Output<String> region() {
        return this.region;
    }

    /**
     * The security group ids to apply to the ecs service.
     * 
     */
    @Import(name="securityGroupIds")
    private @Nullable Output<List<String>> securityGroupIds;

    /**
     * @return The security group ids to apply to the ecs service.
     * 
     */
    public Optional<Output<List<String>>> securityGroupIds() {
        return Optional.ofNullable(this.securityGroupIds);
    }

    /**
     * The subnet ids to apply to the ecs service.
     * 
     */
    @Import(name="subnetIds")
    private @Nullable Output<List<String>> subnetIds;

    /**
     * @return The subnet ids to apply to the ecs service.
     * 
     */
    public Optional<Output<List<String>>> subnetIds() {
        return Optional.ofNullable(this.subnetIds);
    }

    /**
     * The VPC ids to use when selecting the instances.
     * 
     */
    @Import(name="vpcId")
    private @Nullable Output<String> vpcId;

    /**
     * @return The VPC ids to use when selecting the instances.
     * 
     */
    public Optional<Output<String>> vpcId() {
        return Optional.ofNullable(this.vpcId);
    }

    private InfrastructureDefinitionAwsLambdaArgs() {}

    private InfrastructureDefinitionAwsLambdaArgs(InfrastructureDefinitionAwsLambdaArgs $) {
        this.cloudProviderName = $.cloudProviderName;
        this.iamRole = $.iamRole;
        this.region = $.region;
        this.securityGroupIds = $.securityGroupIds;
        this.subnetIds = $.subnetIds;
        this.vpcId = $.vpcId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(InfrastructureDefinitionAwsLambdaArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private InfrastructureDefinitionAwsLambdaArgs $;

        public Builder() {
            $ = new InfrastructureDefinitionAwsLambdaArgs();
        }

        public Builder(InfrastructureDefinitionAwsLambdaArgs defaults) {
            $ = new InfrastructureDefinitionAwsLambdaArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param cloudProviderName The name of the cloud provider to connect with.
         * 
         * @return builder
         * 
         */
        public Builder cloudProviderName(Output<String> cloudProviderName) {
            $.cloudProviderName = cloudProviderName;
            return this;
        }

        /**
         * @param cloudProviderName The name of the cloud provider to connect with.
         * 
         * @return builder
         * 
         */
        public Builder cloudProviderName(String cloudProviderName) {
            return cloudProviderName(Output.of(cloudProviderName));
        }

        /**
         * @param iamRole The IAM role to use.
         * 
         * @return builder
         * 
         */
        public Builder iamRole(@Nullable Output<String> iamRole) {
            $.iamRole = iamRole;
            return this;
        }

        /**
         * @param iamRole The IAM role to use.
         * 
         * @return builder
         * 
         */
        public Builder iamRole(String iamRole) {
            return iamRole(Output.of(iamRole));
        }

        /**
         * @param region The region to deploy to.
         * 
         * @return builder
         * 
         */
        public Builder region(Output<String> region) {
            $.region = region;
            return this;
        }

        /**
         * @param region The region to deploy to.
         * 
         * @return builder
         * 
         */
        public Builder region(String region) {
            return region(Output.of(region));
        }

        /**
         * @param securityGroupIds The security group ids to apply to the ecs service.
         * 
         * @return builder
         * 
         */
        public Builder securityGroupIds(@Nullable Output<List<String>> securityGroupIds) {
            $.securityGroupIds = securityGroupIds;
            return this;
        }

        /**
         * @param securityGroupIds The security group ids to apply to the ecs service.
         * 
         * @return builder
         * 
         */
        public Builder securityGroupIds(List<String> securityGroupIds) {
            return securityGroupIds(Output.of(securityGroupIds));
        }

        /**
         * @param securityGroupIds The security group ids to apply to the ecs service.
         * 
         * @return builder
         * 
         */
        public Builder securityGroupIds(String... securityGroupIds) {
            return securityGroupIds(List.of(securityGroupIds));
        }

        /**
         * @param subnetIds The subnet ids to apply to the ecs service.
         * 
         * @return builder
         * 
         */
        public Builder subnetIds(@Nullable Output<List<String>> subnetIds) {
            $.subnetIds = subnetIds;
            return this;
        }

        /**
         * @param subnetIds The subnet ids to apply to the ecs service.
         * 
         * @return builder
         * 
         */
        public Builder subnetIds(List<String> subnetIds) {
            return subnetIds(Output.of(subnetIds));
        }

        /**
         * @param subnetIds The subnet ids to apply to the ecs service.
         * 
         * @return builder
         * 
         */
        public Builder subnetIds(String... subnetIds) {
            return subnetIds(List.of(subnetIds));
        }

        /**
         * @param vpcId The VPC ids to use when selecting the instances.
         * 
         * @return builder
         * 
         */
        public Builder vpcId(@Nullable Output<String> vpcId) {
            $.vpcId = vpcId;
            return this;
        }

        /**
         * @param vpcId The VPC ids to use when selecting the instances.
         * 
         * @return builder
         * 
         */
        public Builder vpcId(String vpcId) {
            return vpcId(Output.of(vpcId));
        }

        public InfrastructureDefinitionAwsLambdaArgs build() {
            if ($.cloudProviderName == null) {
                throw new MissingRequiredPropertyException("InfrastructureDefinitionAwsLambdaArgs", "cloudProviderName");
            }
            if ($.region == null) {
                throw new MissingRequiredPropertyException("InfrastructureDefinitionAwsLambdaArgs", "region");
            }
            return $;
        }
    }

}
