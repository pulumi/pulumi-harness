// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.harness.platform.inputs.AzureCloudProviderConnectorCredentialsAzureInheritFromDelegateDetailsArgs;
import com.pulumi.harness.platform.inputs.AzureCloudProviderConnectorCredentialsAzureManualDetailsArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AzureCloudProviderConnectorCredentialsArgs extends com.pulumi.resources.ResourceArgs {

    public static final AzureCloudProviderConnectorCredentialsArgs Empty = new AzureCloudProviderConnectorCredentialsArgs();

    /**
     * Authenticate to Azure Cloud Provider using details inheriting from delegate.
     * 
     */
    @Import(name="azureInheritFromDelegateDetails")
    private @Nullable Output<AzureCloudProviderConnectorCredentialsAzureInheritFromDelegateDetailsArgs> azureInheritFromDelegateDetails;

    /**
     * @return Authenticate to Azure Cloud Provider using details inheriting from delegate.
     * 
     */
    public Optional<Output<AzureCloudProviderConnectorCredentialsAzureInheritFromDelegateDetailsArgs>> azureInheritFromDelegateDetails() {
        return Optional.ofNullable(this.azureInheritFromDelegateDetails);
    }

    /**
     * Authenticate to Azure Cloud Provider using manual details.
     * 
     */
    @Import(name="azureManualDetails")
    private @Nullable Output<AzureCloudProviderConnectorCredentialsAzureManualDetailsArgs> azureManualDetails;

    /**
     * @return Authenticate to Azure Cloud Provider using manual details.
     * 
     */
    public Optional<Output<AzureCloudProviderConnectorCredentialsAzureManualDetailsArgs>> azureManualDetails() {
        return Optional.ofNullable(this.azureManualDetails);
    }

    /**
     * Type can either be InheritFromDelegate or ManualConfig.
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    /**
     * @return Type can either be InheritFromDelegate or ManualConfig.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    private AzureCloudProviderConnectorCredentialsArgs() {}

    private AzureCloudProviderConnectorCredentialsArgs(AzureCloudProviderConnectorCredentialsArgs $) {
        this.azureInheritFromDelegateDetails = $.azureInheritFromDelegateDetails;
        this.azureManualDetails = $.azureManualDetails;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AzureCloudProviderConnectorCredentialsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AzureCloudProviderConnectorCredentialsArgs $;

        public Builder() {
            $ = new AzureCloudProviderConnectorCredentialsArgs();
        }

        public Builder(AzureCloudProviderConnectorCredentialsArgs defaults) {
            $ = new AzureCloudProviderConnectorCredentialsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param azureInheritFromDelegateDetails Authenticate to Azure Cloud Provider using details inheriting from delegate.
         * 
         * @return builder
         * 
         */
        public Builder azureInheritFromDelegateDetails(@Nullable Output<AzureCloudProviderConnectorCredentialsAzureInheritFromDelegateDetailsArgs> azureInheritFromDelegateDetails) {
            $.azureInheritFromDelegateDetails = azureInheritFromDelegateDetails;
            return this;
        }

        /**
         * @param azureInheritFromDelegateDetails Authenticate to Azure Cloud Provider using details inheriting from delegate.
         * 
         * @return builder
         * 
         */
        public Builder azureInheritFromDelegateDetails(AzureCloudProviderConnectorCredentialsAzureInheritFromDelegateDetailsArgs azureInheritFromDelegateDetails) {
            return azureInheritFromDelegateDetails(Output.of(azureInheritFromDelegateDetails));
        }

        /**
         * @param azureManualDetails Authenticate to Azure Cloud Provider using manual details.
         * 
         * @return builder
         * 
         */
        public Builder azureManualDetails(@Nullable Output<AzureCloudProviderConnectorCredentialsAzureManualDetailsArgs> azureManualDetails) {
            $.azureManualDetails = azureManualDetails;
            return this;
        }

        /**
         * @param azureManualDetails Authenticate to Azure Cloud Provider using manual details.
         * 
         * @return builder
         * 
         */
        public Builder azureManualDetails(AzureCloudProviderConnectorCredentialsAzureManualDetailsArgs azureManualDetails) {
            return azureManualDetails(Output.of(azureManualDetails));
        }

        /**
         * @param type Type can either be InheritFromDelegate or ManualConfig.
         * 
         * @return builder
         * 
         */
        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type Type can either be InheritFromDelegate or ManualConfig.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public AzureCloudProviderConnectorCredentialsArgs build() {
            if ($.type == null) {
                throw new MissingRequiredPropertyException("AzureCloudProviderConnectorCredentialsArgs", "type");
            }
            return $;
        }
    }

}
