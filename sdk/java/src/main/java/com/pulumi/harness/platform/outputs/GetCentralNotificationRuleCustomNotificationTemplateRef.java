// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.harness.platform.outputs.GetCentralNotificationRuleCustomNotificationTemplateRefVariable;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class GetCentralNotificationRuleCustomNotificationTemplateRef {
    private String templateRef;
    private @Nullable List<GetCentralNotificationRuleCustomNotificationTemplateRefVariable> variables;
    private String versionLabel;

    private GetCentralNotificationRuleCustomNotificationTemplateRef() {}
    public String templateRef() {
        return this.templateRef;
    }
    public List<GetCentralNotificationRuleCustomNotificationTemplateRefVariable> variables() {
        return this.variables == null ? List.of() : this.variables;
    }
    public String versionLabel() {
        return this.versionLabel;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetCentralNotificationRuleCustomNotificationTemplateRef defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String templateRef;
        private @Nullable List<GetCentralNotificationRuleCustomNotificationTemplateRefVariable> variables;
        private String versionLabel;
        public Builder() {}
        public Builder(GetCentralNotificationRuleCustomNotificationTemplateRef defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.templateRef = defaults.templateRef;
    	      this.variables = defaults.variables;
    	      this.versionLabel = defaults.versionLabel;
        }

        @CustomType.Setter
        public Builder templateRef(String templateRef) {
            if (templateRef == null) {
              throw new MissingRequiredPropertyException("GetCentralNotificationRuleCustomNotificationTemplateRef", "templateRef");
            }
            this.templateRef = templateRef;
            return this;
        }
        @CustomType.Setter
        public Builder variables(@Nullable List<GetCentralNotificationRuleCustomNotificationTemplateRefVariable> variables) {

            this.variables = variables;
            return this;
        }
        public Builder variables(GetCentralNotificationRuleCustomNotificationTemplateRefVariable... variables) {
            return variables(List.of(variables));
        }
        @CustomType.Setter
        public Builder versionLabel(String versionLabel) {
            if (versionLabel == null) {
              throw new MissingRequiredPropertyException("GetCentralNotificationRuleCustomNotificationTemplateRef", "versionLabel");
            }
            this.versionLabel = versionLabel;
            return this;
        }
        public GetCentralNotificationRuleCustomNotificationTemplateRef build() {
            final var _resultValue = new GetCentralNotificationRuleCustomNotificationTemplateRef();
            _resultValue.templateRef = templateRef;
            _resultValue.variables = variables;
            _resultValue.versionLabel = versionLabel;
            return _resultValue;
        }
    }
}
