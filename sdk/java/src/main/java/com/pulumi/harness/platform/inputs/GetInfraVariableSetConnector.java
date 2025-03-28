// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetInfraVariableSetConnector extends com.pulumi.resources.InvokeArgs {

    public static final GetInfraVariableSetConnector Empty = new GetInfraVariableSetConnector();

    /**
     * Unique identifier of the connector.
     * 
     */
    @Import(name="connectorRef", required=true)
    private String connectorRef;

    /**
     * @return Unique identifier of the connector.
     * 
     */
    public String connectorRef() {
        return this.connectorRef;
    }

    /**
     * Type indicates the type of the connector. Currently we support aws, azure, gcp.
     * 
     */
    @Import(name="type", required=true)
    private String type;

    /**
     * @return Type indicates the type of the connector. Currently we support aws, azure, gcp.
     * 
     */
    public String type() {
        return this.type;
    }

    private GetInfraVariableSetConnector() {}

    private GetInfraVariableSetConnector(GetInfraVariableSetConnector $) {
        this.connectorRef = $.connectorRef;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetInfraVariableSetConnector defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetInfraVariableSetConnector $;

        public Builder() {
            $ = new GetInfraVariableSetConnector();
        }

        public Builder(GetInfraVariableSetConnector defaults) {
            $ = new GetInfraVariableSetConnector(Objects.requireNonNull(defaults));
        }

        /**
         * @param connectorRef Unique identifier of the connector.
         * 
         * @return builder
         * 
         */
        public Builder connectorRef(String connectorRef) {
            $.connectorRef = connectorRef;
            return this;
        }

        /**
         * @param type Type indicates the type of the connector. Currently we support aws, azure, gcp.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            $.type = type;
            return this;
        }

        public GetInfraVariableSetConnector build() {
            if ($.connectorRef == null) {
                throw new MissingRequiredPropertyException("GetInfraVariableSetConnector", "connectorRef");
            }
            if ($.type == null) {
                throw new MissingRequiredPropertyException("GetInfraVariableSetConnector", "type");
            }
            return $;
        }
    }

}
