// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class InfrastructureDefinitionCustomVariableArgs extends com.pulumi.resources.ResourceArgs {

    public static final InfrastructureDefinitionCustomVariableArgs Empty = new InfrastructureDefinitionCustomVariableArgs();

    /**
     * Name of the variable
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return Name of the variable
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * Value of the variable
     * 
     */
    @Import(name="value", required=true)
    private Output<String> value;

    /**
     * @return Value of the variable
     * 
     */
    public Output<String> value() {
        return this.value;
    }

    private InfrastructureDefinitionCustomVariableArgs() {}

    private InfrastructureDefinitionCustomVariableArgs(InfrastructureDefinitionCustomVariableArgs $) {
        this.name = $.name;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(InfrastructureDefinitionCustomVariableArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private InfrastructureDefinitionCustomVariableArgs $;

        public Builder() {
            $ = new InfrastructureDefinitionCustomVariableArgs();
        }

        public Builder(InfrastructureDefinitionCustomVariableArgs defaults) {
            $ = new InfrastructureDefinitionCustomVariableArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name Name of the variable
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of the variable
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param value Value of the variable
         * 
         * @return builder
         * 
         */
        public Builder value(Output<String> value) {
            $.value = value;
            return this;
        }

        /**
         * @param value Value of the variable
         * 
         * @return builder
         * 
         */
        public Builder value(String value) {
            return value(Output.of(value));
        }

        public InfrastructureDefinitionCustomVariableArgs build() {
            if ($.name == null) {
                throw new MissingRequiredPropertyException("InfrastructureDefinitionCustomVariableArgs", "name");
            }
            if ($.value == null) {
                throw new MissingRequiredPropertyException("InfrastructureDefinitionCustomVariableArgs", "value");
            }
            return $;
        }
    }

}
