// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.autostopping.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.harness.autostopping.outputs.GetAzureProxyCertificates;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetAzureProxyResult {
    /**
     * @return Boolean value to indicate if proxy vm needs to have static IP
     * 
     */
    private @Nullable Boolean allocateStaticIp;
    /**
     * @return Harness NG API key
     * 
     */
    private String apiKey;
    private @Nullable String certificateId;
    private @Nullable GetAzureProxyCertificates certificates;
    /**
     * @return Id of the cloud connector
     * 
     */
    private String cloudConnectorId;
    private Boolean deleteCloudResourcesOnDestroy;
    /**
     * @return Hostname for the proxy
     * 
     */
    private String hostName;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return Unique identifier of the resource
     * 
     */
    private String identifier;
    /**
     * @return Name of SSH Key to be used for proxy VM
     * 
     */
    private String keypair;
    /**
     * @return Type of instance to be used for proxy
     * 
     */
    private String machineType;
    /**
     * @return Name of the proxy
     * 
     */
    private String name;
    /**
     * @return Region in which cloud resources are hosted
     * 
     */
    private String region;
    /**
     * @return Resource group in which cloud resources are hosted
     * 
     */
    private String resourceGroup;
    /**
     * @return Security Group to define the security rules that determine the inbound and outbound traffic
     * 
     */
    private @Nullable List<String> securityGroups;
    /**
     * @return Subnet in which cloud resources are hosted
     * 
     */
    private String subnetId;
    /**
     * @return VPC in which cloud resources are hosted
     * 
     */
    private String vpc;

    private GetAzureProxyResult() {}
    /**
     * @return Boolean value to indicate if proxy vm needs to have static IP
     * 
     */
    public Optional<Boolean> allocateStaticIp() {
        return Optional.ofNullable(this.allocateStaticIp);
    }
    /**
     * @return Harness NG API key
     * 
     */
    public String apiKey() {
        return this.apiKey;
    }
    public Optional<String> certificateId() {
        return Optional.ofNullable(this.certificateId);
    }
    public Optional<GetAzureProxyCertificates> certificates() {
        return Optional.ofNullable(this.certificates);
    }
    /**
     * @return Id of the cloud connector
     * 
     */
    public String cloudConnectorId() {
        return this.cloudConnectorId;
    }
    public Boolean deleteCloudResourcesOnDestroy() {
        return this.deleteCloudResourcesOnDestroy;
    }
    /**
     * @return Hostname for the proxy
     * 
     */
    public String hostName() {
        return this.hostName;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Unique identifier of the resource
     * 
     */
    public String identifier() {
        return this.identifier;
    }
    /**
     * @return Name of SSH Key to be used for proxy VM
     * 
     */
    public String keypair() {
        return this.keypair;
    }
    /**
     * @return Type of instance to be used for proxy
     * 
     */
    public String machineType() {
        return this.machineType;
    }
    /**
     * @return Name of the proxy
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Region in which cloud resources are hosted
     * 
     */
    public String region() {
        return this.region;
    }
    /**
     * @return Resource group in which cloud resources are hosted
     * 
     */
    public String resourceGroup() {
        return this.resourceGroup;
    }
    /**
     * @return Security Group to define the security rules that determine the inbound and outbound traffic
     * 
     */
    public List<String> securityGroups() {
        return this.securityGroups == null ? List.of() : this.securityGroups;
    }
    /**
     * @return Subnet in which cloud resources are hosted
     * 
     */
    public String subnetId() {
        return this.subnetId;
    }
    /**
     * @return VPC in which cloud resources are hosted
     * 
     */
    public String vpc() {
        return this.vpc;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAzureProxyResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean allocateStaticIp;
        private String apiKey;
        private @Nullable String certificateId;
        private @Nullable GetAzureProxyCertificates certificates;
        private String cloudConnectorId;
        private Boolean deleteCloudResourcesOnDestroy;
        private String hostName;
        private String id;
        private String identifier;
        private String keypair;
        private String machineType;
        private String name;
        private String region;
        private String resourceGroup;
        private @Nullable List<String> securityGroups;
        private String subnetId;
        private String vpc;
        public Builder() {}
        public Builder(GetAzureProxyResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allocateStaticIp = defaults.allocateStaticIp;
    	      this.apiKey = defaults.apiKey;
    	      this.certificateId = defaults.certificateId;
    	      this.certificates = defaults.certificates;
    	      this.cloudConnectorId = defaults.cloudConnectorId;
    	      this.deleteCloudResourcesOnDestroy = defaults.deleteCloudResourcesOnDestroy;
    	      this.hostName = defaults.hostName;
    	      this.id = defaults.id;
    	      this.identifier = defaults.identifier;
    	      this.keypair = defaults.keypair;
    	      this.machineType = defaults.machineType;
    	      this.name = defaults.name;
    	      this.region = defaults.region;
    	      this.resourceGroup = defaults.resourceGroup;
    	      this.securityGroups = defaults.securityGroups;
    	      this.subnetId = defaults.subnetId;
    	      this.vpc = defaults.vpc;
        }

        @CustomType.Setter
        public Builder allocateStaticIp(@Nullable Boolean allocateStaticIp) {

            this.allocateStaticIp = allocateStaticIp;
            return this;
        }
        @CustomType.Setter
        public Builder apiKey(String apiKey) {
            if (apiKey == null) {
              throw new MissingRequiredPropertyException("GetAzureProxyResult", "apiKey");
            }
            this.apiKey = apiKey;
            return this;
        }
        @CustomType.Setter
        public Builder certificateId(@Nullable String certificateId) {

            this.certificateId = certificateId;
            return this;
        }
        @CustomType.Setter
        public Builder certificates(@Nullable GetAzureProxyCertificates certificates) {

            this.certificates = certificates;
            return this;
        }
        @CustomType.Setter
        public Builder cloudConnectorId(String cloudConnectorId) {
            if (cloudConnectorId == null) {
              throw new MissingRequiredPropertyException("GetAzureProxyResult", "cloudConnectorId");
            }
            this.cloudConnectorId = cloudConnectorId;
            return this;
        }
        @CustomType.Setter
        public Builder deleteCloudResourcesOnDestroy(Boolean deleteCloudResourcesOnDestroy) {
            if (deleteCloudResourcesOnDestroy == null) {
              throw new MissingRequiredPropertyException("GetAzureProxyResult", "deleteCloudResourcesOnDestroy");
            }
            this.deleteCloudResourcesOnDestroy = deleteCloudResourcesOnDestroy;
            return this;
        }
        @CustomType.Setter
        public Builder hostName(String hostName) {
            if (hostName == null) {
              throw new MissingRequiredPropertyException("GetAzureProxyResult", "hostName");
            }
            this.hostName = hostName;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetAzureProxyResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder identifier(String identifier) {
            if (identifier == null) {
              throw new MissingRequiredPropertyException("GetAzureProxyResult", "identifier");
            }
            this.identifier = identifier;
            return this;
        }
        @CustomType.Setter
        public Builder keypair(String keypair) {
            if (keypair == null) {
              throw new MissingRequiredPropertyException("GetAzureProxyResult", "keypair");
            }
            this.keypair = keypair;
            return this;
        }
        @CustomType.Setter
        public Builder machineType(String machineType) {
            if (machineType == null) {
              throw new MissingRequiredPropertyException("GetAzureProxyResult", "machineType");
            }
            this.machineType = machineType;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetAzureProxyResult", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder region(String region) {
            if (region == null) {
              throw new MissingRequiredPropertyException("GetAzureProxyResult", "region");
            }
            this.region = region;
            return this;
        }
        @CustomType.Setter
        public Builder resourceGroup(String resourceGroup) {
            if (resourceGroup == null) {
              throw new MissingRequiredPropertyException("GetAzureProxyResult", "resourceGroup");
            }
            this.resourceGroup = resourceGroup;
            return this;
        }
        @CustomType.Setter
        public Builder securityGroups(@Nullable List<String> securityGroups) {

            this.securityGroups = securityGroups;
            return this;
        }
        public Builder securityGroups(String... securityGroups) {
            return securityGroups(List.of(securityGroups));
        }
        @CustomType.Setter
        public Builder subnetId(String subnetId) {
            if (subnetId == null) {
              throw new MissingRequiredPropertyException("GetAzureProxyResult", "subnetId");
            }
            this.subnetId = subnetId;
            return this;
        }
        @CustomType.Setter
        public Builder vpc(String vpc) {
            if (vpc == null) {
              throw new MissingRequiredPropertyException("GetAzureProxyResult", "vpc");
            }
            this.vpc = vpc;
            return this;
        }
        public GetAzureProxyResult build() {
            final var _resultValue = new GetAzureProxyResult();
            _resultValue.allocateStaticIp = allocateStaticIp;
            _resultValue.apiKey = apiKey;
            _resultValue.certificateId = certificateId;
            _resultValue.certificates = certificates;
            _resultValue.cloudConnectorId = cloudConnectorId;
            _resultValue.deleteCloudResourcesOnDestroy = deleteCloudResourcesOnDestroy;
            _resultValue.hostName = hostName;
            _resultValue.id = id;
            _resultValue.identifier = identifier;
            _resultValue.keypair = keypair;
            _resultValue.machineType = machineType;
            _resultValue.name = name;
            _resultValue.region = region;
            _resultValue.resourceGroup = resourceGroup;
            _resultValue.securityGroups = securityGroups;
            _resultValue.subnetId = subnetId;
            _resultValue.vpc = vpc;
            return _resultValue;
        }
    }
}
