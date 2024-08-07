// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetGitopsAgentMetadata {
    /**
     * @return Indicates if the agent is deployed in HA mode.
     * 
     */
    private Boolean highAvailability;
    /**
     * @return Indicates if the agent is namespaced.
     * 
     */
    private @Nullable Boolean isNamespaced;
    /**
     * @return The kubernetes namespace where the agent should be installed.
     * 
     */
    private String namespace;

    private GetGitopsAgentMetadata() {}
    /**
     * @return Indicates if the agent is deployed in HA mode.
     * 
     */
    public Boolean highAvailability() {
        return this.highAvailability;
    }
    /**
     * @return Indicates if the agent is namespaced.
     * 
     */
    public Optional<Boolean> isNamespaced() {
        return Optional.ofNullable(this.isNamespaced);
    }
    /**
     * @return The kubernetes namespace where the agent should be installed.
     * 
     */
    public String namespace() {
        return this.namespace;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetGitopsAgentMetadata defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Boolean highAvailability;
        private @Nullable Boolean isNamespaced;
        private String namespace;
        public Builder() {}
        public Builder(GetGitopsAgentMetadata defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.highAvailability = defaults.highAvailability;
    	      this.isNamespaced = defaults.isNamespaced;
    	      this.namespace = defaults.namespace;
        }

        @CustomType.Setter
        public Builder highAvailability(Boolean highAvailability) {
            if (highAvailability == null) {
              throw new MissingRequiredPropertyException("GetGitopsAgentMetadata", "highAvailability");
            }
            this.highAvailability = highAvailability;
            return this;
        }
        @CustomType.Setter
        public Builder isNamespaced(@Nullable Boolean isNamespaced) {

            this.isNamespaced = isNamespaced;
            return this;
        }
        @CustomType.Setter
        public Builder namespace(String namespace) {
            if (namespace == null) {
              throw new MissingRequiredPropertyException("GetGitopsAgentMetadata", "namespace");
            }
            this.namespace = namespace;
            return this;
        }
        public GetGitopsAgentMetadata build() {
            final var _resultValue = new GetGitopsAgentMetadata();
            _resultValue.highAvailability = highAvailability;
            _resultValue.isNamespaced = isNamespaced;
            _resultValue.namespace = namespace;
            return _resultValue;
        }
    }
}
