// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class WorkspaceTerraformVariableArgs extends com.pulumi.resources.ResourceArgs {

    public static final WorkspaceTerraformVariableArgs Empty = new WorkspaceTerraformVariableArgs();

    /**
     * Key is the identifier for the variable. Must be unique within the workspace.
     * 
     */
    @Import(name="key", required=true)
    private Output<String> key;

    /**
     * @return Key is the identifier for the variable. Must be unique within the workspace.
     * 
     */
    public Output<String> key() {
        return this.key;
    }

    /**
     * Value is the value of the variable. For string value types this field should contain the value of the variable. For secret value types this should contain a reference to a valid harness secret.
     * 
     */
    @Import(name="value", required=true)
    private Output<String> value;

    /**
     * @return Value is the value of the variable. For string value types this field should contain the value of the variable. For secret value types this should contain a reference to a valid harness secret.
     * 
     */
    public Output<String> value() {
        return this.value;
    }

    /**
     * Value type indicates the value type of the variable. Currently we support string and secret.
     * 
     */
    @Import(name="valueType", required=true)
    private Output<String> valueType;

    /**
     * @return Value type indicates the value type of the variable. Currently we support string and secret.
     * 
     */
    public Output<String> valueType() {
        return this.valueType;
    }

    private WorkspaceTerraformVariableArgs() {}

    private WorkspaceTerraformVariableArgs(WorkspaceTerraformVariableArgs $) {
        this.key = $.key;
        this.value = $.value;
        this.valueType = $.valueType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WorkspaceTerraformVariableArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WorkspaceTerraformVariableArgs $;

        public Builder() {
            $ = new WorkspaceTerraformVariableArgs();
        }

        public Builder(WorkspaceTerraformVariableArgs defaults) {
            $ = new WorkspaceTerraformVariableArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param key Key is the identifier for the variable. Must be unique within the workspace.
         * 
         * @return builder
         * 
         */
        public Builder key(Output<String> key) {
            $.key = key;
            return this;
        }

        /**
         * @param key Key is the identifier for the variable. Must be unique within the workspace.
         * 
         * @return builder
         * 
         */
        public Builder key(String key) {
            return key(Output.of(key));
        }

        /**
         * @param value Value is the value of the variable. For string value types this field should contain the value of the variable. For secret value types this should contain a reference to a valid harness secret.
         * 
         * @return builder
         * 
         */
        public Builder value(Output<String> value) {
            $.value = value;
            return this;
        }

        /**
         * @param value Value is the value of the variable. For string value types this field should contain the value of the variable. For secret value types this should contain a reference to a valid harness secret.
         * 
         * @return builder
         * 
         */
        public Builder value(String value) {
            return value(Output.of(value));
        }

        /**
         * @param valueType Value type indicates the value type of the variable. Currently we support string and secret.
         * 
         * @return builder
         * 
         */
        public Builder valueType(Output<String> valueType) {
            $.valueType = valueType;
            return this;
        }

        /**
         * @param valueType Value type indicates the value type of the variable. Currently we support string and secret.
         * 
         * @return builder
         * 
         */
        public Builder valueType(String valueType) {
            return valueType(Output.of(valueType));
        }

        public WorkspaceTerraformVariableArgs build() {
            if ($.key == null) {
                throw new MissingRequiredPropertyException("WorkspaceTerraformVariableArgs", "key");
            }
            if ($.value == null) {
                throw new MissingRequiredPropertyException("WorkspaceTerraformVariableArgs", "value");
            }
            if ($.valueType == null) {
                throw new MissingRequiredPropertyException("WorkspaceTerraformVariableArgs", "valueType");
            }
            return $;
        }
    }

}