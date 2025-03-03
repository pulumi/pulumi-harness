// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.harness.platform.outputs.GetAwsKmsConnectorCredentialAssumeRole;
import com.pulumi.harness.platform.outputs.GetAwsKmsConnectorCredentialManual;
import com.pulumi.harness.platform.outputs.GetAwsKmsConnectorCredentialOidcAuthentication;
import java.lang.Boolean;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetAwsKmsConnectorCredential {
    /**
     * @return Connect using STS assume role.
     * 
     */
    private List<GetAwsKmsConnectorCredentialAssumeRole> assumeRoles;
    /**
     * @return Inherit the credentials from from the delegate.
     * 
     */
    private Boolean inheritFromDelegate;
    /**
     * @return Specify the AWS key and secret used for authenticating.
     * 
     */
    private List<GetAwsKmsConnectorCredentialManual> manuals;
    /**
     * @return Authentication using OIDC.
     * 
     */
    private List<GetAwsKmsConnectorCredentialOidcAuthentication> oidcAuthentications;

    private GetAwsKmsConnectorCredential() {}
    /**
     * @return Connect using STS assume role.
     * 
     */
    public List<GetAwsKmsConnectorCredentialAssumeRole> assumeRoles() {
        return this.assumeRoles;
    }
    /**
     * @return Inherit the credentials from from the delegate.
     * 
     */
    public Boolean inheritFromDelegate() {
        return this.inheritFromDelegate;
    }
    /**
     * @return Specify the AWS key and secret used for authenticating.
     * 
     */
    public List<GetAwsKmsConnectorCredentialManual> manuals() {
        return this.manuals;
    }
    /**
     * @return Authentication using OIDC.
     * 
     */
    public List<GetAwsKmsConnectorCredentialOidcAuthentication> oidcAuthentications() {
        return this.oidcAuthentications;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAwsKmsConnectorCredential defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<GetAwsKmsConnectorCredentialAssumeRole> assumeRoles;
        private Boolean inheritFromDelegate;
        private List<GetAwsKmsConnectorCredentialManual> manuals;
        private List<GetAwsKmsConnectorCredentialOidcAuthentication> oidcAuthentications;
        public Builder() {}
        public Builder(GetAwsKmsConnectorCredential defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.assumeRoles = defaults.assumeRoles;
    	      this.inheritFromDelegate = defaults.inheritFromDelegate;
    	      this.manuals = defaults.manuals;
    	      this.oidcAuthentications = defaults.oidcAuthentications;
        }

        @CustomType.Setter
        public Builder assumeRoles(List<GetAwsKmsConnectorCredentialAssumeRole> assumeRoles) {
            if (assumeRoles == null) {
              throw new MissingRequiredPropertyException("GetAwsKmsConnectorCredential", "assumeRoles");
            }
            this.assumeRoles = assumeRoles;
            return this;
        }
        public Builder assumeRoles(GetAwsKmsConnectorCredentialAssumeRole... assumeRoles) {
            return assumeRoles(List.of(assumeRoles));
        }
        @CustomType.Setter
        public Builder inheritFromDelegate(Boolean inheritFromDelegate) {
            if (inheritFromDelegate == null) {
              throw new MissingRequiredPropertyException("GetAwsKmsConnectorCredential", "inheritFromDelegate");
            }
            this.inheritFromDelegate = inheritFromDelegate;
            return this;
        }
        @CustomType.Setter
        public Builder manuals(List<GetAwsKmsConnectorCredentialManual> manuals) {
            if (manuals == null) {
              throw new MissingRequiredPropertyException("GetAwsKmsConnectorCredential", "manuals");
            }
            this.manuals = manuals;
            return this;
        }
        public Builder manuals(GetAwsKmsConnectorCredentialManual... manuals) {
            return manuals(List.of(manuals));
        }
        @CustomType.Setter
        public Builder oidcAuthentications(List<GetAwsKmsConnectorCredentialOidcAuthentication> oidcAuthentications) {
            if (oidcAuthentications == null) {
              throw new MissingRequiredPropertyException("GetAwsKmsConnectorCredential", "oidcAuthentications");
            }
            this.oidcAuthentications = oidcAuthentications;
            return this;
        }
        public Builder oidcAuthentications(GetAwsKmsConnectorCredentialOidcAuthentication... oidcAuthentications) {
            return oidcAuthentications(List.of(oidcAuthentications));
        }
        public GetAwsKmsConnectorCredential build() {
            final var _resultValue = new GetAwsKmsConnectorCredential();
            _resultValue.assumeRoles = assumeRoles;
            _resultValue.inheritFromDelegate = inheritFromDelegate;
            _resultValue.manuals = manuals;
            _resultValue.oidcAuthentications = oidcAuthentications;
            return _resultValue;
        }
    }
}
