// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.autostopping;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AwsAlbArgs extends com.pulumi.resources.ResourceArgs {

    public static final AwsAlbArgs Empty = new AwsAlbArgs();

    /**
     * Arn of AWS ALB to be imported. Required only for importing existing ALB
     * 
     */
    @Import(name="albArn")
    private @Nullable Output<String> albArn;

    /**
     * @return Arn of AWS ALB to be imported. Required only for importing existing ALB
     * 
     */
    public Optional<Output<String>> albArn() {
        return Optional.ofNullable(this.albArn);
    }

    @Import(name="certificateId")
    private @Nullable Output<String> certificateId;

    public Optional<Output<String>> certificateId() {
        return Optional.ofNullable(this.certificateId);
    }

    /**
     * Id of the cloud connector
     * 
     */
    @Import(name="cloudConnectorId", required=true)
    private Output<String> cloudConnectorId;

    /**
     * @return Id of the cloud connector
     * 
     */
    public Output<String> cloudConnectorId() {
        return this.cloudConnectorId;
    }

    @Import(name="deleteCloudResourcesOnDestroy", required=true)
    private Output<Boolean> deleteCloudResourcesOnDestroy;

    public Output<Boolean> deleteCloudResourcesOnDestroy() {
        return this.deleteCloudResourcesOnDestroy;
    }

    /**
     * Hostname for the proxy
     * 
     */
    @Import(name="hostName", required=true)
    private Output<String> hostName;

    /**
     * @return Hostname for the proxy
     * 
     */
    public Output<String> hostName() {
        return this.hostName;
    }

    /**
     * Name of the proxy
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Name of the proxy
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Region in which cloud resources are hosted
     * 
     */
    @Import(name="region", required=true)
    private Output<String> region;

    /**
     * @return Region in which cloud resources are hosted
     * 
     */
    public Output<String> region() {
        return this.region;
    }

    /**
     * Route 53 hosted zone id
     * 
     */
    @Import(name="route53HostedZoneId")
    private @Nullable Output<String> route53HostedZoneId;

    /**
     * @return Route 53 hosted zone id
     * 
     */
    public Optional<Output<String>> route53HostedZoneId() {
        return Optional.ofNullable(this.route53HostedZoneId);
    }

    /**
     * Security Group to define the security rules that determine the inbound and outbound traffic
     * 
     */
    @Import(name="securityGroups")
    private @Nullable Output<List<String>> securityGroups;

    /**
     * @return Security Group to define the security rules that determine the inbound and outbound traffic
     * 
     */
    public Optional<Output<List<String>>> securityGroups() {
        return Optional.ofNullable(this.securityGroups);
    }

    /**
     * VPC in which cloud resources are hosted
     * 
     */
    @Import(name="vpc", required=true)
    private Output<String> vpc;

    /**
     * @return VPC in which cloud resources are hosted
     * 
     */
    public Output<String> vpc() {
        return this.vpc;
    }

    private AwsAlbArgs() {}

    private AwsAlbArgs(AwsAlbArgs $) {
        this.albArn = $.albArn;
        this.certificateId = $.certificateId;
        this.cloudConnectorId = $.cloudConnectorId;
        this.deleteCloudResourcesOnDestroy = $.deleteCloudResourcesOnDestroy;
        this.hostName = $.hostName;
        this.name = $.name;
        this.region = $.region;
        this.route53HostedZoneId = $.route53HostedZoneId;
        this.securityGroups = $.securityGroups;
        this.vpc = $.vpc;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AwsAlbArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AwsAlbArgs $;

        public Builder() {
            $ = new AwsAlbArgs();
        }

        public Builder(AwsAlbArgs defaults) {
            $ = new AwsAlbArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param albArn Arn of AWS ALB to be imported. Required only for importing existing ALB
         * 
         * @return builder
         * 
         */
        public Builder albArn(@Nullable Output<String> albArn) {
            $.albArn = albArn;
            return this;
        }

        /**
         * @param albArn Arn of AWS ALB to be imported. Required only for importing existing ALB
         * 
         * @return builder
         * 
         */
        public Builder albArn(String albArn) {
            return albArn(Output.of(albArn));
        }

        public Builder certificateId(@Nullable Output<String> certificateId) {
            $.certificateId = certificateId;
            return this;
        }

        public Builder certificateId(String certificateId) {
            return certificateId(Output.of(certificateId));
        }

        /**
         * @param cloudConnectorId Id of the cloud connector
         * 
         * @return builder
         * 
         */
        public Builder cloudConnectorId(Output<String> cloudConnectorId) {
            $.cloudConnectorId = cloudConnectorId;
            return this;
        }

        /**
         * @param cloudConnectorId Id of the cloud connector
         * 
         * @return builder
         * 
         */
        public Builder cloudConnectorId(String cloudConnectorId) {
            return cloudConnectorId(Output.of(cloudConnectorId));
        }

        public Builder deleteCloudResourcesOnDestroy(Output<Boolean> deleteCloudResourcesOnDestroy) {
            $.deleteCloudResourcesOnDestroy = deleteCloudResourcesOnDestroy;
            return this;
        }

        public Builder deleteCloudResourcesOnDestroy(Boolean deleteCloudResourcesOnDestroy) {
            return deleteCloudResourcesOnDestroy(Output.of(deleteCloudResourcesOnDestroy));
        }

        /**
         * @param hostName Hostname for the proxy
         * 
         * @return builder
         * 
         */
        public Builder hostName(Output<String> hostName) {
            $.hostName = hostName;
            return this;
        }

        /**
         * @param hostName Hostname for the proxy
         * 
         * @return builder
         * 
         */
        public Builder hostName(String hostName) {
            return hostName(Output.of(hostName));
        }

        /**
         * @param name Name of the proxy
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of the proxy
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param region Region in which cloud resources are hosted
         * 
         * @return builder
         * 
         */
        public Builder region(Output<String> region) {
            $.region = region;
            return this;
        }

        /**
         * @param region Region in which cloud resources are hosted
         * 
         * @return builder
         * 
         */
        public Builder region(String region) {
            return region(Output.of(region));
        }

        /**
         * @param route53HostedZoneId Route 53 hosted zone id
         * 
         * @return builder
         * 
         */
        public Builder route53HostedZoneId(@Nullable Output<String> route53HostedZoneId) {
            $.route53HostedZoneId = route53HostedZoneId;
            return this;
        }

        /**
         * @param route53HostedZoneId Route 53 hosted zone id
         * 
         * @return builder
         * 
         */
        public Builder route53HostedZoneId(String route53HostedZoneId) {
            return route53HostedZoneId(Output.of(route53HostedZoneId));
        }

        /**
         * @param securityGroups Security Group to define the security rules that determine the inbound and outbound traffic
         * 
         * @return builder
         * 
         */
        public Builder securityGroups(@Nullable Output<List<String>> securityGroups) {
            $.securityGroups = securityGroups;
            return this;
        }

        /**
         * @param securityGroups Security Group to define the security rules that determine the inbound and outbound traffic
         * 
         * @return builder
         * 
         */
        public Builder securityGroups(List<String> securityGroups) {
            return securityGroups(Output.of(securityGroups));
        }

        /**
         * @param securityGroups Security Group to define the security rules that determine the inbound and outbound traffic
         * 
         * @return builder
         * 
         */
        public Builder securityGroups(String... securityGroups) {
            return securityGroups(List.of(securityGroups));
        }

        /**
         * @param vpc VPC in which cloud resources are hosted
         * 
         * @return builder
         * 
         */
        public Builder vpc(Output<String> vpc) {
            $.vpc = vpc;
            return this;
        }

        /**
         * @param vpc VPC in which cloud resources are hosted
         * 
         * @return builder
         * 
         */
        public Builder vpc(String vpc) {
            return vpc(Output.of(vpc));
        }

        public AwsAlbArgs build() {
            if ($.cloudConnectorId == null) {
                throw new MissingRequiredPropertyException("AwsAlbArgs", "cloudConnectorId");
            }
            if ($.deleteCloudResourcesOnDestroy == null) {
                throw new MissingRequiredPropertyException("AwsAlbArgs", "deleteCloudResourcesOnDestroy");
            }
            if ($.hostName == null) {
                throw new MissingRequiredPropertyException("AwsAlbArgs", "hostName");
            }
            if ($.region == null) {
                throw new MissingRequiredPropertyException("AwsAlbArgs", "region");
            }
            if ($.vpc == null) {
                throw new MissingRequiredPropertyException("AwsAlbArgs", "vpc");
            }
            return $;
        }
    }

}
