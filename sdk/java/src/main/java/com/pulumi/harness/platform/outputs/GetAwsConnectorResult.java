// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.harness.platform.outputs.GetAwsConnectorCrossAccountAccess;
import com.pulumi.harness.platform.outputs.GetAwsConnectorEqualJitterBackoffStrategy;
import com.pulumi.harness.platform.outputs.GetAwsConnectorFixedDelayBackoffStrategy;
import com.pulumi.harness.platform.outputs.GetAwsConnectorFullJitterBackoffStrategy;
import com.pulumi.harness.platform.outputs.GetAwsConnectorInheritFromDelegate;
import com.pulumi.harness.platform.outputs.GetAwsConnectorIrsa;
import com.pulumi.harness.platform.outputs.GetAwsConnectorManual;
import com.pulumi.harness.platform.outputs.GetAwsConnectorOidcAuthentication;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetAwsConnectorResult {
    /**
     * @return Select this option if you want to use one AWS account for the connection, but you want to deploy or build in a different AWS account. In this scenario, the AWS account used for AWS access in Credentials will assume the IAM role you specify in Cross-account role ARN setting. This option uses the AWS Security Token Service (STS) feature.
     * 
     */
    private List<GetAwsConnectorCrossAccountAccess> crossAccountAccesses;
    /**
     * @return Description of the resource.
     * 
     */
    private String description;
    /**
     * @return Equal Jitter BackOff Strategy.
     * 
     */
    private List<GetAwsConnectorEqualJitterBackoffStrategy> equalJitterBackoffStrategies;
    /**
     * @return Execute on delegate or not.
     * 
     */
    private Boolean executeOnDelegate;
    /**
     * @return Fixed Delay BackOff Strategy.
     * 
     */
    private List<GetAwsConnectorFixedDelayBackoffStrategy> fixedDelayBackoffStrategies;
    /**
     * @return Full Jitter BackOff Strategy.
     * 
     */
    private List<GetAwsConnectorFullJitterBackoffStrategy> fullJitterBackoffStrategies;
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
     * @return Inherit credentials from the delegate.
     * 
     */
    private List<GetAwsConnectorInheritFromDelegate> inheritFromDelegates;
    /**
     * @return Use IAM role for service accounts.
     * 
     */
    private List<GetAwsConnectorIrsa> irsas;
    /**
     * @return Use IAM role for service accounts.
     * 
     */
    private List<GetAwsConnectorManual> manuals;
    /**
     * @return Name of the resource.
     * 
     */
    private @Nullable String name;
    /**
     * @return Authentication using harness oidc.
     * 
     */
    private List<GetAwsConnectorOidcAuthentication> oidcAuthentications;
    /**
     * @return Unique identifier of the organization.
     * 
     */
    private @Nullable String orgId;
    /**
     * @return Unique identifier of the project.
     * 
     */
    private @Nullable String projectId;
    /**
     * @return Tags to associate with the resource.
     * 
     */
    private List<String> tags;

    private GetAwsConnectorResult() {}
    /**
     * @return Select this option if you want to use one AWS account for the connection, but you want to deploy or build in a different AWS account. In this scenario, the AWS account used for AWS access in Credentials will assume the IAM role you specify in Cross-account role ARN setting. This option uses the AWS Security Token Service (STS) feature.
     * 
     */
    public List<GetAwsConnectorCrossAccountAccess> crossAccountAccesses() {
        return this.crossAccountAccesses;
    }
    /**
     * @return Description of the resource.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return Equal Jitter BackOff Strategy.
     * 
     */
    public List<GetAwsConnectorEqualJitterBackoffStrategy> equalJitterBackoffStrategies() {
        return this.equalJitterBackoffStrategies;
    }
    /**
     * @return Execute on delegate or not.
     * 
     */
    public Boolean executeOnDelegate() {
        return this.executeOnDelegate;
    }
    /**
     * @return Fixed Delay BackOff Strategy.
     * 
     */
    public List<GetAwsConnectorFixedDelayBackoffStrategy> fixedDelayBackoffStrategies() {
        return this.fixedDelayBackoffStrategies;
    }
    /**
     * @return Full Jitter BackOff Strategy.
     * 
     */
    public List<GetAwsConnectorFullJitterBackoffStrategy> fullJitterBackoffStrategies() {
        return this.fullJitterBackoffStrategies;
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
     * @return Inherit credentials from the delegate.
     * 
     */
    public List<GetAwsConnectorInheritFromDelegate> inheritFromDelegates() {
        return this.inheritFromDelegates;
    }
    /**
     * @return Use IAM role for service accounts.
     * 
     */
    public List<GetAwsConnectorIrsa> irsas() {
        return this.irsas;
    }
    /**
     * @return Use IAM role for service accounts.
     * 
     */
    public List<GetAwsConnectorManual> manuals() {
        return this.manuals;
    }
    /**
     * @return Name of the resource.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    /**
     * @return Authentication using harness oidc.
     * 
     */
    public List<GetAwsConnectorOidcAuthentication> oidcAuthentications() {
        return this.oidcAuthentications;
    }
    /**
     * @return Unique identifier of the organization.
     * 
     */
    public Optional<String> orgId() {
        return Optional.ofNullable(this.orgId);
    }
    /**
     * @return Unique identifier of the project.
     * 
     */
    public Optional<String> projectId() {
        return Optional.ofNullable(this.projectId);
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

    public static Builder builder(GetAwsConnectorResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<GetAwsConnectorCrossAccountAccess> crossAccountAccesses;
        private String description;
        private List<GetAwsConnectorEqualJitterBackoffStrategy> equalJitterBackoffStrategies;
        private Boolean executeOnDelegate;
        private List<GetAwsConnectorFixedDelayBackoffStrategy> fixedDelayBackoffStrategies;
        private List<GetAwsConnectorFullJitterBackoffStrategy> fullJitterBackoffStrategies;
        private String id;
        private String identifier;
        private List<GetAwsConnectorInheritFromDelegate> inheritFromDelegates;
        private List<GetAwsConnectorIrsa> irsas;
        private List<GetAwsConnectorManual> manuals;
        private @Nullable String name;
        private List<GetAwsConnectorOidcAuthentication> oidcAuthentications;
        private @Nullable String orgId;
        private @Nullable String projectId;
        private List<String> tags;
        public Builder() {}
        public Builder(GetAwsConnectorResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.crossAccountAccesses = defaults.crossAccountAccesses;
    	      this.description = defaults.description;
    	      this.equalJitterBackoffStrategies = defaults.equalJitterBackoffStrategies;
    	      this.executeOnDelegate = defaults.executeOnDelegate;
    	      this.fixedDelayBackoffStrategies = defaults.fixedDelayBackoffStrategies;
    	      this.fullJitterBackoffStrategies = defaults.fullJitterBackoffStrategies;
    	      this.id = defaults.id;
    	      this.identifier = defaults.identifier;
    	      this.inheritFromDelegates = defaults.inheritFromDelegates;
    	      this.irsas = defaults.irsas;
    	      this.manuals = defaults.manuals;
    	      this.name = defaults.name;
    	      this.oidcAuthentications = defaults.oidcAuthentications;
    	      this.orgId = defaults.orgId;
    	      this.projectId = defaults.projectId;
    	      this.tags = defaults.tags;
        }

        @CustomType.Setter
        public Builder crossAccountAccesses(List<GetAwsConnectorCrossAccountAccess> crossAccountAccesses) {
            if (crossAccountAccesses == null) {
              throw new MissingRequiredPropertyException("GetAwsConnectorResult", "crossAccountAccesses");
            }
            this.crossAccountAccesses = crossAccountAccesses;
            return this;
        }
        public Builder crossAccountAccesses(GetAwsConnectorCrossAccountAccess... crossAccountAccesses) {
            return crossAccountAccesses(List.of(crossAccountAccesses));
        }
        @CustomType.Setter
        public Builder description(String description) {
            if (description == null) {
              throw new MissingRequiredPropertyException("GetAwsConnectorResult", "description");
            }
            this.description = description;
            return this;
        }
        @CustomType.Setter
        public Builder equalJitterBackoffStrategies(List<GetAwsConnectorEqualJitterBackoffStrategy> equalJitterBackoffStrategies) {
            if (equalJitterBackoffStrategies == null) {
              throw new MissingRequiredPropertyException("GetAwsConnectorResult", "equalJitterBackoffStrategies");
            }
            this.equalJitterBackoffStrategies = equalJitterBackoffStrategies;
            return this;
        }
        public Builder equalJitterBackoffStrategies(GetAwsConnectorEqualJitterBackoffStrategy... equalJitterBackoffStrategies) {
            return equalJitterBackoffStrategies(List.of(equalJitterBackoffStrategies));
        }
        @CustomType.Setter
        public Builder executeOnDelegate(Boolean executeOnDelegate) {
            if (executeOnDelegate == null) {
              throw new MissingRequiredPropertyException("GetAwsConnectorResult", "executeOnDelegate");
            }
            this.executeOnDelegate = executeOnDelegate;
            return this;
        }
        @CustomType.Setter
        public Builder fixedDelayBackoffStrategies(List<GetAwsConnectorFixedDelayBackoffStrategy> fixedDelayBackoffStrategies) {
            if (fixedDelayBackoffStrategies == null) {
              throw new MissingRequiredPropertyException("GetAwsConnectorResult", "fixedDelayBackoffStrategies");
            }
            this.fixedDelayBackoffStrategies = fixedDelayBackoffStrategies;
            return this;
        }
        public Builder fixedDelayBackoffStrategies(GetAwsConnectorFixedDelayBackoffStrategy... fixedDelayBackoffStrategies) {
            return fixedDelayBackoffStrategies(List.of(fixedDelayBackoffStrategies));
        }
        @CustomType.Setter
        public Builder fullJitterBackoffStrategies(List<GetAwsConnectorFullJitterBackoffStrategy> fullJitterBackoffStrategies) {
            if (fullJitterBackoffStrategies == null) {
              throw new MissingRequiredPropertyException("GetAwsConnectorResult", "fullJitterBackoffStrategies");
            }
            this.fullJitterBackoffStrategies = fullJitterBackoffStrategies;
            return this;
        }
        public Builder fullJitterBackoffStrategies(GetAwsConnectorFullJitterBackoffStrategy... fullJitterBackoffStrategies) {
            return fullJitterBackoffStrategies(List.of(fullJitterBackoffStrategies));
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetAwsConnectorResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder identifier(String identifier) {
            if (identifier == null) {
              throw new MissingRequiredPropertyException("GetAwsConnectorResult", "identifier");
            }
            this.identifier = identifier;
            return this;
        }
        @CustomType.Setter
        public Builder inheritFromDelegates(List<GetAwsConnectorInheritFromDelegate> inheritFromDelegates) {
            if (inheritFromDelegates == null) {
              throw new MissingRequiredPropertyException("GetAwsConnectorResult", "inheritFromDelegates");
            }
            this.inheritFromDelegates = inheritFromDelegates;
            return this;
        }
        public Builder inheritFromDelegates(GetAwsConnectorInheritFromDelegate... inheritFromDelegates) {
            return inheritFromDelegates(List.of(inheritFromDelegates));
        }
        @CustomType.Setter
        public Builder irsas(List<GetAwsConnectorIrsa> irsas) {
            if (irsas == null) {
              throw new MissingRequiredPropertyException("GetAwsConnectorResult", "irsas");
            }
            this.irsas = irsas;
            return this;
        }
        public Builder irsas(GetAwsConnectorIrsa... irsas) {
            return irsas(List.of(irsas));
        }
        @CustomType.Setter
        public Builder manuals(List<GetAwsConnectorManual> manuals) {
            if (manuals == null) {
              throw new MissingRequiredPropertyException("GetAwsConnectorResult", "manuals");
            }
            this.manuals = manuals;
            return this;
        }
        public Builder manuals(GetAwsConnectorManual... manuals) {
            return manuals(List.of(manuals));
        }
        @CustomType.Setter
        public Builder name(@Nullable String name) {

            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder oidcAuthentications(List<GetAwsConnectorOidcAuthentication> oidcAuthentications) {
            if (oidcAuthentications == null) {
              throw new MissingRequiredPropertyException("GetAwsConnectorResult", "oidcAuthentications");
            }
            this.oidcAuthentications = oidcAuthentications;
            return this;
        }
        public Builder oidcAuthentications(GetAwsConnectorOidcAuthentication... oidcAuthentications) {
            return oidcAuthentications(List.of(oidcAuthentications));
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
        public Builder tags(List<String> tags) {
            if (tags == null) {
              throw new MissingRequiredPropertyException("GetAwsConnectorResult", "tags");
            }
            this.tags = tags;
            return this;
        }
        public Builder tags(String... tags) {
            return tags(List.of(tags));
        }
        public GetAwsConnectorResult build() {
            final var _resultValue = new GetAwsConnectorResult();
            _resultValue.crossAccountAccesses = crossAccountAccesses;
            _resultValue.description = description;
            _resultValue.equalJitterBackoffStrategies = equalJitterBackoffStrategies;
            _resultValue.executeOnDelegate = executeOnDelegate;
            _resultValue.fixedDelayBackoffStrategies = fixedDelayBackoffStrategies;
            _resultValue.fullJitterBackoffStrategies = fullJitterBackoffStrategies;
            _resultValue.id = id;
            _resultValue.identifier = identifier;
            _resultValue.inheritFromDelegates = inheritFromDelegates;
            _resultValue.irsas = irsas;
            _resultValue.manuals = manuals;
            _resultValue.name = name;
            _resultValue.oidcAuthentications = oidcAuthentications;
            _resultValue.orgId = orgId;
            _resultValue.projectId = projectId;
            _resultValue.tags = tags;
            return _resultValue;
        }
    }
}
