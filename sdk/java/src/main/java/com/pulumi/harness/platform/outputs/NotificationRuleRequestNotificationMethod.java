// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class NotificationRuleRequestNotificationMethod {
    /**
     * @return Specification of the notification method. Depends on the type of the notification method.
     * 
     */
    private @Nullable String spec;
    /**
     * @return Type of the Notification Method.
     * 
     */
    private String type;

    private NotificationRuleRequestNotificationMethod() {}
    /**
     * @return Specification of the notification method. Depends on the type of the notification method.
     * 
     */
    public Optional<String> spec() {
        return Optional.ofNullable(this.spec);
    }
    /**
     * @return Type of the Notification Method.
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NotificationRuleRequestNotificationMethod defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String spec;
        private String type;
        public Builder() {}
        public Builder(NotificationRuleRequestNotificationMethod defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.spec = defaults.spec;
    	      this.type = defaults.type;
        }

        @CustomType.Setter
        public Builder spec(@Nullable String spec) {

            this.spec = spec;
            return this;
        }
        @CustomType.Setter
        public Builder type(String type) {
            if (type == null) {
              throw new MissingRequiredPropertyException("NotificationRuleRequestNotificationMethod", "type");
            }
            this.type = type;
            return this;
        }
        public NotificationRuleRequestNotificationMethod build() {
            final var _resultValue = new NotificationRuleRequestNotificationMethod();
            _resultValue.spec = spec;
            _resultValue.type = type;
            return _resultValue;
        }
    }
}
