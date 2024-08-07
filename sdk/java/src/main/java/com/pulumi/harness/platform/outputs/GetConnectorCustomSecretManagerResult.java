// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.harness.platform.outputs.GetConnectorCustomSecretManagerTemplateInput;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetConnectorCustomSecretManagerResult {
    /**
     * @return Tags to filter delegates for connection.
     * 
     */
    private @Nullable List<String> delegateSelectors;
    /**
     * @return : A brief description of what the resource does or is used for.
     * 
     */
    private String description;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return : Unique identifier of the resource.
     * 
     */
    private String identifier;
    /**
     * @return : Name of the resource.
     * 
     */
    private @Nullable String name;
    /**
     * @return : Specifies whether the secrets manager runs on a Harness delegate.
     * 
     */
    private Boolean onDelegate;
    private @Nullable String orgId;
    private @Nullable String projectId;
    /**
     * @return : Reference to the Harness secret containing SSH credentials for the target host. Required if `on_delegate` is set to false.
     * 
     */
    private String sshSecretRef;
    /**
     * @return : Tags to associate with the resource.
     * 
     */
    private List<String> tags;
    /**
     * @return : Host address where secrets will be managed. Required if `on_delegate` is set to false.
     * 
     */
    private String targetHost;
    private List<GetConnectorCustomSecretManagerTemplateInput> templateInputs;
    /**
     * @return : Reference to the template used for managing secrets.
     * 
     */
    private String templateRef;
    /**
     * @return : Timeout in seconds for secrets management operations.
     * 
     */
    private Integer timeout;
    /**
     * @return : Type of the custom secrets manager, typically set to `CustomSecretManager`.
     * 
     */
    private String type;
    /**
     * @return : Version identifier of the secrets management template.
     * 
     */
    private String versionLabel;
    /**
     * @return : Directory path on the target host where secrets management tasks are performed. Required if `on_delegate` is set to false.
     * 
     */
    private String workingDirectory;

    private GetConnectorCustomSecretManagerResult() {}
    /**
     * @return Tags to filter delegates for connection.
     * 
     */
    public List<String> delegateSelectors() {
        return this.delegateSelectors == null ? List.of() : this.delegateSelectors;
    }
    /**
     * @return : A brief description of what the resource does or is used for.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return : Unique identifier of the resource.
     * 
     */
    public String identifier() {
        return this.identifier;
    }
    /**
     * @return : Name of the resource.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    /**
     * @return : Specifies whether the secrets manager runs on a Harness delegate.
     * 
     */
    public Boolean onDelegate() {
        return this.onDelegate;
    }
    public Optional<String> orgId() {
        return Optional.ofNullable(this.orgId);
    }
    public Optional<String> projectId() {
        return Optional.ofNullable(this.projectId);
    }
    /**
     * @return : Reference to the Harness secret containing SSH credentials for the target host. Required if `on_delegate` is set to false.
     * 
     */
    public String sshSecretRef() {
        return this.sshSecretRef;
    }
    /**
     * @return : Tags to associate with the resource.
     * 
     */
    public List<String> tags() {
        return this.tags;
    }
    /**
     * @return : Host address where secrets will be managed. Required if `on_delegate` is set to false.
     * 
     */
    public String targetHost() {
        return this.targetHost;
    }
    public List<GetConnectorCustomSecretManagerTemplateInput> templateInputs() {
        return this.templateInputs;
    }
    /**
     * @return : Reference to the template used for managing secrets.
     * 
     */
    public String templateRef() {
        return this.templateRef;
    }
    /**
     * @return : Timeout in seconds for secrets management operations.
     * 
     */
    public Integer timeout() {
        return this.timeout;
    }
    /**
     * @return : Type of the custom secrets manager, typically set to `CustomSecretManager`.
     * 
     */
    public String type() {
        return this.type;
    }
    /**
     * @return : Version identifier of the secrets management template.
     * 
     */
    public String versionLabel() {
        return this.versionLabel;
    }
    /**
     * @return : Directory path on the target host where secrets management tasks are performed. Required if `on_delegate` is set to false.
     * 
     */
    public String workingDirectory() {
        return this.workingDirectory;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetConnectorCustomSecretManagerResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<String> delegateSelectors;
        private String description;
        private String id;
        private String identifier;
        private @Nullable String name;
        private Boolean onDelegate;
        private @Nullable String orgId;
        private @Nullable String projectId;
        private String sshSecretRef;
        private List<String> tags;
        private String targetHost;
        private List<GetConnectorCustomSecretManagerTemplateInput> templateInputs;
        private String templateRef;
        private Integer timeout;
        private String type;
        private String versionLabel;
        private String workingDirectory;
        public Builder() {}
        public Builder(GetConnectorCustomSecretManagerResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.delegateSelectors = defaults.delegateSelectors;
    	      this.description = defaults.description;
    	      this.id = defaults.id;
    	      this.identifier = defaults.identifier;
    	      this.name = defaults.name;
    	      this.onDelegate = defaults.onDelegate;
    	      this.orgId = defaults.orgId;
    	      this.projectId = defaults.projectId;
    	      this.sshSecretRef = defaults.sshSecretRef;
    	      this.tags = defaults.tags;
    	      this.targetHost = defaults.targetHost;
    	      this.templateInputs = defaults.templateInputs;
    	      this.templateRef = defaults.templateRef;
    	      this.timeout = defaults.timeout;
    	      this.type = defaults.type;
    	      this.versionLabel = defaults.versionLabel;
    	      this.workingDirectory = defaults.workingDirectory;
        }

        @CustomType.Setter
        public Builder delegateSelectors(@Nullable List<String> delegateSelectors) {

            this.delegateSelectors = delegateSelectors;
            return this;
        }
        public Builder delegateSelectors(String... delegateSelectors) {
            return delegateSelectors(List.of(delegateSelectors));
        }
        @CustomType.Setter
        public Builder description(String description) {
            if (description == null) {
              throw new MissingRequiredPropertyException("GetConnectorCustomSecretManagerResult", "description");
            }
            this.description = description;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetConnectorCustomSecretManagerResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder identifier(String identifier) {
            if (identifier == null) {
              throw new MissingRequiredPropertyException("GetConnectorCustomSecretManagerResult", "identifier");
            }
            this.identifier = identifier;
            return this;
        }
        @CustomType.Setter
        public Builder name(@Nullable String name) {

            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder onDelegate(Boolean onDelegate) {
            if (onDelegate == null) {
              throw new MissingRequiredPropertyException("GetConnectorCustomSecretManagerResult", "onDelegate");
            }
            this.onDelegate = onDelegate;
            return this;
        }
        @CustomType.Setter
        public Builder orgId(@Nullable String orgId) {

            this.orgId = orgId;
            return this;
        }
        @CustomType.Setter
        public Builder projectId(@Nullable String projectId) {

            this.projectId = projectId;
            return this;
        }
        @CustomType.Setter
        public Builder sshSecretRef(String sshSecretRef) {
            if (sshSecretRef == null) {
              throw new MissingRequiredPropertyException("GetConnectorCustomSecretManagerResult", "sshSecretRef");
            }
            this.sshSecretRef = sshSecretRef;
            return this;
        }
        @CustomType.Setter
        public Builder tags(List<String> tags) {
            if (tags == null) {
              throw new MissingRequiredPropertyException("GetConnectorCustomSecretManagerResult", "tags");
            }
            this.tags = tags;
            return this;
        }
        public Builder tags(String... tags) {
            return tags(List.of(tags));
        }
        @CustomType.Setter
        public Builder targetHost(String targetHost) {
            if (targetHost == null) {
              throw new MissingRequiredPropertyException("GetConnectorCustomSecretManagerResult", "targetHost");
            }
            this.targetHost = targetHost;
            return this;
        }
        @CustomType.Setter
        public Builder templateInputs(List<GetConnectorCustomSecretManagerTemplateInput> templateInputs) {
            if (templateInputs == null) {
              throw new MissingRequiredPropertyException("GetConnectorCustomSecretManagerResult", "templateInputs");
            }
            this.templateInputs = templateInputs;
            return this;
        }
        public Builder templateInputs(GetConnectorCustomSecretManagerTemplateInput... templateInputs) {
            return templateInputs(List.of(templateInputs));
        }
        @CustomType.Setter
        public Builder templateRef(String templateRef) {
            if (templateRef == null) {
              throw new MissingRequiredPropertyException("GetConnectorCustomSecretManagerResult", "templateRef");
            }
            this.templateRef = templateRef;
            return this;
        }
        @CustomType.Setter
        public Builder timeout(Integer timeout) {
            if (timeout == null) {
              throw new MissingRequiredPropertyException("GetConnectorCustomSecretManagerResult", "timeout");
            }
            this.timeout = timeout;
            return this;
        }
        @CustomType.Setter
        public Builder type(String type) {
            if (type == null) {
              throw new MissingRequiredPropertyException("GetConnectorCustomSecretManagerResult", "type");
            }
            this.type = type;
            return this;
        }
        @CustomType.Setter
        public Builder versionLabel(String versionLabel) {
            if (versionLabel == null) {
              throw new MissingRequiredPropertyException("GetConnectorCustomSecretManagerResult", "versionLabel");
            }
            this.versionLabel = versionLabel;
            return this;
        }
        @CustomType.Setter
        public Builder workingDirectory(String workingDirectory) {
            if (workingDirectory == null) {
              throw new MissingRequiredPropertyException("GetConnectorCustomSecretManagerResult", "workingDirectory");
            }
            this.workingDirectory = workingDirectory;
            return this;
        }
        public GetConnectorCustomSecretManagerResult build() {
            final var _resultValue = new GetConnectorCustomSecretManagerResult();
            _resultValue.delegateSelectors = delegateSelectors;
            _resultValue.description = description;
            _resultValue.id = id;
            _resultValue.identifier = identifier;
            _resultValue.name = name;
            _resultValue.onDelegate = onDelegate;
            _resultValue.orgId = orgId;
            _resultValue.projectId = projectId;
            _resultValue.sshSecretRef = sshSecretRef;
            _resultValue.tags = tags;
            _resultValue.targetHost = targetHost;
            _resultValue.templateInputs = templateInputs;
            _resultValue.templateRef = templateRef;
            _resultValue.timeout = timeout;
            _resultValue.type = type;
            _resultValue.versionLabel = versionLabel;
            _resultValue.workingDirectory = workingDirectory;
            return _resultValue;
        }
    }
}
