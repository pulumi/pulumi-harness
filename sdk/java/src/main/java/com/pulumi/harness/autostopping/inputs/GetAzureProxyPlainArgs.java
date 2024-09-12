// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.autostopping.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.harness.autostopping.inputs.GetAzureProxyCertificates;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetAzureProxyPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetAzureProxyPlainArgs Empty = new GetAzureProxyPlainArgs();

    /**
     * Boolean value to indicate if proxy vm needs to have static IP
     * 
     */
    @Import(name="allocateStaticIp")
    private @Nullable Boolean allocateStaticIp;

    /**
     * @return Boolean value to indicate if proxy vm needs to have static IP
     * 
     */
    public Optional<Boolean> allocateStaticIp() {
        return Optional.ofNullable(this.allocateStaticIp);
    }

    /**
     * Harness NG API key
     * 
     */
    @Import(name="apiKey", required=true)
    private String apiKey;

    /**
     * @return Harness NG API key
     * 
     */
    public String apiKey() {
        return this.apiKey;
    }

    @Import(name="certificateId")
    private @Nullable String certificateId;

    public Optional<String> certificateId() {
        return Optional.ofNullable(this.certificateId);
    }

    @Import(name="certificates")
    private @Nullable GetAzureProxyCertificates certificates;

    public Optional<GetAzureProxyCertificates> certificates() {
        return Optional.ofNullable(this.certificates);
    }

    /**
     * Id of the cloud connector
     * 
     */
    @Import(name="cloudConnectorId", required=true)
    private String cloudConnectorId;

    /**
     * @return Id of the cloud connector
     * 
     */
    public String cloudConnectorId() {
        return this.cloudConnectorId;
    }

    @Import(name="deleteCloudResourcesOnDestroy", required=true)
    private Boolean deleteCloudResourcesOnDestroy;

    public Boolean deleteCloudResourcesOnDestroy() {
        return this.deleteCloudResourcesOnDestroy;
    }

    /**
     * Hostname for the proxy
     * 
     */
    @Import(name="hostName", required=true)
    private String hostName;

    /**
     * @return Hostname for the proxy
     * 
     */
    public String hostName() {
        return this.hostName;
    }

    /**
     * Name of SSH Key to be used for proxy VM
     * 
     */
    @Import(name="keypair", required=true)
    private String keypair;

    /**
     * @return Name of SSH Key to be used for proxy VM
     * 
     */
    public String keypair() {
        return this.keypair;
    }

    /**
     * Type of instance to be used for proxy
     * 
     */
    @Import(name="machineType", required=true)
    private String machineType;

    /**
     * @return Type of instance to be used for proxy
     * 
     */
    public String machineType() {
        return this.machineType;
    }

    /**
     * Name of the proxy
     * 
     */
    @Import(name="name", required=true)
    private String name;

    /**
     * @return Name of the proxy
     * 
     */
    public String name() {
        return this.name;
    }

    /**
     * Region in which cloud resources are hosted
     * 
     */
    @Import(name="region", required=true)
    private String region;

    /**
     * @return Region in which cloud resources are hosted
     * 
     */
    public String region() {
        return this.region;
    }

    /**
     * Resource group in which cloud resources are hosted
     * 
     */
    @Import(name="resourceGroup", required=true)
    private String resourceGroup;

    /**
     * @return Resource group in which cloud resources are hosted
     * 
     */
    public String resourceGroup() {
        return this.resourceGroup;
    }

    /**
     * Security Group to define the security rules that determine the inbound and outbound traffic
     * 
     */
    @Import(name="securityGroups")
    private @Nullable List<String> securityGroups;

    /**
     * @return Security Group to define the security rules that determine the inbound and outbound traffic
     * 
     */
    public Optional<List<String>> securityGroups() {
        return Optional.ofNullable(this.securityGroups);
    }

    /**
     * Subnet in which cloud resources are hosted
     * 
     */
    @Import(name="subnetId", required=true)
    private String subnetId;

    /**
     * @return Subnet in which cloud resources are hosted
     * 
     */
    public String subnetId() {
        return this.subnetId;
    }

    /**
     * VPC in which cloud resources are hosted
     * 
     */
    @Import(name="vpc", required=true)
    private String vpc;

    /**
     * @return VPC in which cloud resources are hosted
     * 
     */
    public String vpc() {
        return this.vpc;
    }

    private GetAzureProxyPlainArgs() {}

    private GetAzureProxyPlainArgs(GetAzureProxyPlainArgs $) {
        this.allocateStaticIp = $.allocateStaticIp;
        this.apiKey = $.apiKey;
        this.certificateId = $.certificateId;
        this.certificates = $.certificates;
        this.cloudConnectorId = $.cloudConnectorId;
        this.deleteCloudResourcesOnDestroy = $.deleteCloudResourcesOnDestroy;
        this.hostName = $.hostName;
        this.keypair = $.keypair;
        this.machineType = $.machineType;
        this.name = $.name;
        this.region = $.region;
        this.resourceGroup = $.resourceGroup;
        this.securityGroups = $.securityGroups;
        this.subnetId = $.subnetId;
        this.vpc = $.vpc;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetAzureProxyPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetAzureProxyPlainArgs $;

        public Builder() {
            $ = new GetAzureProxyPlainArgs();
        }

        public Builder(GetAzureProxyPlainArgs defaults) {
            $ = new GetAzureProxyPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param allocateStaticIp Boolean value to indicate if proxy vm needs to have static IP
         * 
         * @return builder
         * 
         */
        public Builder allocateStaticIp(@Nullable Boolean allocateStaticIp) {
            $.allocateStaticIp = allocateStaticIp;
            return this;
        }

        /**
         * @param apiKey Harness NG API key
         * 
         * @return builder
         * 
         */
        public Builder apiKey(String apiKey) {
            $.apiKey = apiKey;
            return this;
        }

        public Builder certificateId(@Nullable String certificateId) {
            $.certificateId = certificateId;
            return this;
        }

        public Builder certificates(@Nullable GetAzureProxyCertificates certificates) {
            $.certificates = certificates;
            return this;
        }

        /**
         * @param cloudConnectorId Id of the cloud connector
         * 
         * @return builder
         * 
         */
        public Builder cloudConnectorId(String cloudConnectorId) {
            $.cloudConnectorId = cloudConnectorId;
            return this;
        }

        public Builder deleteCloudResourcesOnDestroy(Boolean deleteCloudResourcesOnDestroy) {
            $.deleteCloudResourcesOnDestroy = deleteCloudResourcesOnDestroy;
            return this;
        }

        /**
         * @param hostName Hostname for the proxy
         * 
         * @return builder
         * 
         */
        public Builder hostName(String hostName) {
            $.hostName = hostName;
            return this;
        }

        /**
         * @param keypair Name of SSH Key to be used for proxy VM
         * 
         * @return builder
         * 
         */
        public Builder keypair(String keypair) {
            $.keypair = keypair;
            return this;
        }

        /**
         * @param machineType Type of instance to be used for proxy
         * 
         * @return builder
         * 
         */
        public Builder machineType(String machineType) {
            $.machineType = machineType;
            return this;
        }

        /**
         * @param name Name of the proxy
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            $.name = name;
            return this;
        }

        /**
         * @param region Region in which cloud resources are hosted
         * 
         * @return builder
         * 
         */
        public Builder region(String region) {
            $.region = region;
            return this;
        }

        /**
         * @param resourceGroup Resource group in which cloud resources are hosted
         * 
         * @return builder
         * 
         */
        public Builder resourceGroup(String resourceGroup) {
            $.resourceGroup = resourceGroup;
            return this;
        }

        /**
         * @param securityGroups Security Group to define the security rules that determine the inbound and outbound traffic
         * 
         * @return builder
         * 
         */
        public Builder securityGroups(@Nullable List<String> securityGroups) {
            $.securityGroups = securityGroups;
            return this;
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
         * @param subnetId Subnet in which cloud resources are hosted
         * 
         * @return builder
         * 
         */
        public Builder subnetId(String subnetId) {
            $.subnetId = subnetId;
            return this;
        }

        /**
         * @param vpc VPC in which cloud resources are hosted
         * 
         * @return builder
         * 
         */
        public Builder vpc(String vpc) {
            $.vpc = vpc;
            return this;
        }

        public GetAzureProxyPlainArgs build() {
            if ($.apiKey == null) {
                throw new MissingRequiredPropertyException("GetAzureProxyPlainArgs", "apiKey");
            }
            if ($.cloudConnectorId == null) {
                throw new MissingRequiredPropertyException("GetAzureProxyPlainArgs", "cloudConnectorId");
            }
            if ($.deleteCloudResourcesOnDestroy == null) {
                throw new MissingRequiredPropertyException("GetAzureProxyPlainArgs", "deleteCloudResourcesOnDestroy");
            }
            if ($.hostName == null) {
                throw new MissingRequiredPropertyException("GetAzureProxyPlainArgs", "hostName");
            }
            if ($.keypair == null) {
                throw new MissingRequiredPropertyException("GetAzureProxyPlainArgs", "keypair");
            }
            if ($.machineType == null) {
                throw new MissingRequiredPropertyException("GetAzureProxyPlainArgs", "machineType");
            }
            if ($.name == null) {
                throw new MissingRequiredPropertyException("GetAzureProxyPlainArgs", "name");
            }
            if ($.region == null) {
                throw new MissingRequiredPropertyException("GetAzureProxyPlainArgs", "region");
            }
            if ($.resourceGroup == null) {
                throw new MissingRequiredPropertyException("GetAzureProxyPlainArgs", "resourceGroup");
            }
            if ($.subnetId == null) {
                throw new MissingRequiredPropertyException("GetAzureProxyPlainArgs", "subnetId");
            }
            if ($.vpc == null) {
                throw new MissingRequiredPropertyException("GetAzureProxyPlainArgs", "vpc");
            }
            return $;
        }
    }

}