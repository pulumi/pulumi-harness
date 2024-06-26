// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.harness.platform.outputs.GetSecretSshkeyKerbero;
import com.pulumi.harness.platform.outputs.GetSecretSshkeySsh;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetSecretSshkeyResult {
    /**
     * @return Description of the resource.
     * 
     */
    private String description;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return Unique identifier of the resource.
     * 
     */
    private String identifier;
    /**
     * @return Kerberos authentication scheme
     * 
     */
    private List<GetSecretSshkeyKerbero> kerberos;
    /**
     * @return Name of the resource.
     * 
     */
    private @Nullable String name;
    /**
     * @return Unique identifier of the organization.
     * 
     */
    private @Nullable String orgId;
    /**
     * @return SSH port
     * 
     */
    private Integer port;
    /**
     * @return Unique identifier of the project.
     * 
     */
    private @Nullable String projectId;
    /**
     * @return Kerberos authentication scheme
     * 
     */
    private List<GetSecretSshkeySsh> sshes;
    /**
     * @return Tags to associate with the resource.
     * 
     */
    private List<String> tags;

    private GetSecretSshkeyResult() {}
    /**
     * @return Description of the resource.
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
     * @return Unique identifier of the resource.
     * 
     */
    public String identifier() {
        return this.identifier;
    }
    /**
     * @return Kerberos authentication scheme
     * 
     */
    public List<GetSecretSshkeyKerbero> kerberos() {
        return this.kerberos;
    }
    /**
     * @return Name of the resource.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    /**
     * @return Unique identifier of the organization.
     * 
     */
    public Optional<String> orgId() {
        return Optional.ofNullable(this.orgId);
    }
    /**
     * @return SSH port
     * 
     */
    public Integer port() {
        return this.port;
    }
    /**
     * @return Unique identifier of the project.
     * 
     */
    public Optional<String> projectId() {
        return Optional.ofNullable(this.projectId);
    }
    /**
     * @return Kerberos authentication scheme
     * 
     */
    public List<GetSecretSshkeySsh> sshes() {
        return this.sshes;
    }
    /**
     * @return Tags to associate with the resource.
     * 
     */
    public List<String> tags() {
        return this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSecretSshkeyResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String description;
        private String id;
        private String identifier;
        private List<GetSecretSshkeyKerbero> kerberos;
        private @Nullable String name;
        private @Nullable String orgId;
        private Integer port;
        private @Nullable String projectId;
        private List<GetSecretSshkeySsh> sshes;
        private List<String> tags;
        public Builder() {}
        public Builder(GetSecretSshkeyResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.id = defaults.id;
    	      this.identifier = defaults.identifier;
    	      this.kerberos = defaults.kerberos;
    	      this.name = defaults.name;
    	      this.orgId = defaults.orgId;
    	      this.port = defaults.port;
    	      this.projectId = defaults.projectId;
    	      this.sshes = defaults.sshes;
    	      this.tags = defaults.tags;
        }

        @CustomType.Setter
        public Builder description(String description) {
            if (description == null) {
              throw new MissingRequiredPropertyException("GetSecretSshkeyResult", "description");
            }
            this.description = description;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetSecretSshkeyResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder identifier(String identifier) {
            if (identifier == null) {
              throw new MissingRequiredPropertyException("GetSecretSshkeyResult", "identifier");
            }
            this.identifier = identifier;
            return this;
        }
        @CustomType.Setter
        public Builder kerberos(List<GetSecretSshkeyKerbero> kerberos) {
            if (kerberos == null) {
              throw new MissingRequiredPropertyException("GetSecretSshkeyResult", "kerberos");
            }
            this.kerberos = kerberos;
            return this;
        }
        public Builder kerberos(GetSecretSshkeyKerbero... kerberos) {
            return kerberos(List.of(kerberos));
        }
        @CustomType.Setter
        public Builder name(@Nullable String name) {

            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder orgId(@Nullable String orgId) {

            this.orgId = orgId;
            return this;
        }
        @CustomType.Setter
        public Builder port(Integer port) {
            if (port == null) {
              throw new MissingRequiredPropertyException("GetSecretSshkeyResult", "port");
            }
            this.port = port;
            return this;
        }
        @CustomType.Setter
        public Builder projectId(@Nullable String projectId) {

            this.projectId = projectId;
            return this;
        }
        @CustomType.Setter
        public Builder sshes(List<GetSecretSshkeySsh> sshes) {
            if (sshes == null) {
              throw new MissingRequiredPropertyException("GetSecretSshkeyResult", "sshes");
            }
            this.sshes = sshes;
            return this;
        }
        public Builder sshes(GetSecretSshkeySsh... sshes) {
            return sshes(List.of(sshes));
        }
        @CustomType.Setter
        public Builder tags(List<String> tags) {
            if (tags == null) {
              throw new MissingRequiredPropertyException("GetSecretSshkeyResult", "tags");
            }
            this.tags = tags;
            return this;
        }
        public Builder tags(String... tags) {
            return tags(List.of(tags));
        }
        public GetSecretSshkeyResult build() {
            final var _resultValue = new GetSecretSshkeyResult();
            _resultValue.description = description;
            _resultValue.id = id;
            _resultValue.identifier = identifier;
            _resultValue.kerberos = kerberos;
            _resultValue.name = name;
            _resultValue.orgId = orgId;
            _resultValue.port = port;
            _resultValue.projectId = projectId;
            _resultValue.sshes = sshes;
            _resultValue.tags = tags;
            return _resultValue;
        }
    }
}
