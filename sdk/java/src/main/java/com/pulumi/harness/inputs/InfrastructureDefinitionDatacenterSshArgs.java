// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class InfrastructureDefinitionDatacenterSshArgs extends com.pulumi.resources.ResourceArgs {

    public static final InfrastructureDefinitionDatacenterSshArgs Empty = new InfrastructureDefinitionDatacenterSshArgs();

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
     * The name of the SSH connection attributes to use.
     * 
     */
    @Import(name="hostConnectionAttributesName", required=true)
    private Output<String> hostConnectionAttributesName;

    /**
     * @return The name of the SSH connection attributes to use.
     * 
     */
    public Output<String> hostConnectionAttributesName() {
        return this.hostConnectionAttributesName;
    }

    /**
     * A list of hosts to deploy to.
     * 
     */
    @Import(name="hostnames", required=true)
    private Output<List<String>> hostnames;

    /**
     * @return A list of hosts to deploy to.
     * 
     */
    public Output<List<String>> hostnames() {
        return this.hostnames;
    }

    private InfrastructureDefinitionDatacenterSshArgs() {}

    private InfrastructureDefinitionDatacenterSshArgs(InfrastructureDefinitionDatacenterSshArgs $) {
        this.cloudProviderName = $.cloudProviderName;
        this.hostConnectionAttributesName = $.hostConnectionAttributesName;
        this.hostnames = $.hostnames;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(InfrastructureDefinitionDatacenterSshArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private InfrastructureDefinitionDatacenterSshArgs $;

        public Builder() {
            $ = new InfrastructureDefinitionDatacenterSshArgs();
        }

        public Builder(InfrastructureDefinitionDatacenterSshArgs defaults) {
            $ = new InfrastructureDefinitionDatacenterSshArgs(Objects.requireNonNull(defaults));
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
         * @param hostConnectionAttributesName The name of the SSH connection attributes to use.
         * 
         * @return builder
         * 
         */
        public Builder hostConnectionAttributesName(Output<String> hostConnectionAttributesName) {
            $.hostConnectionAttributesName = hostConnectionAttributesName;
            return this;
        }

        /**
         * @param hostConnectionAttributesName The name of the SSH connection attributes to use.
         * 
         * @return builder
         * 
         */
        public Builder hostConnectionAttributesName(String hostConnectionAttributesName) {
            return hostConnectionAttributesName(Output.of(hostConnectionAttributesName));
        }

        /**
         * @param hostnames A list of hosts to deploy to.
         * 
         * @return builder
         * 
         */
        public Builder hostnames(Output<List<String>> hostnames) {
            $.hostnames = hostnames;
            return this;
        }

        /**
         * @param hostnames A list of hosts to deploy to.
         * 
         * @return builder
         * 
         */
        public Builder hostnames(List<String> hostnames) {
            return hostnames(Output.of(hostnames));
        }

        /**
         * @param hostnames A list of hosts to deploy to.
         * 
         * @return builder
         * 
         */
        public Builder hostnames(String... hostnames) {
            return hostnames(List.of(hostnames));
        }

        public InfrastructureDefinitionDatacenterSshArgs build() {
            if ($.cloudProviderName == null) {
                throw new MissingRequiredPropertyException("InfrastructureDefinitionDatacenterSshArgs", "cloudProviderName");
            }
            if ($.hostConnectionAttributesName == null) {
                throw new MissingRequiredPropertyException("InfrastructureDefinitionDatacenterSshArgs", "hostConnectionAttributesName");
            }
            if ($.hostnames == null) {
                throw new MissingRequiredPropertyException("InfrastructureDefinitionDatacenterSshArgs", "hostnames");
            }
            return $;
        }
    }

}
