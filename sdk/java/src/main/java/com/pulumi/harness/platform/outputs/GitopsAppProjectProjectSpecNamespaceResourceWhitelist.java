// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GitopsAppProjectProjectSpecNamespaceResourceWhitelist {
    /**
     * @return Group of the namespace resource whitelist.
     * 
     */
    private @Nullable String group;
    /**
     * @return Kind of the namespace resource whitelist.
     * 
     */
    private @Nullable String kind;

    private GitopsAppProjectProjectSpecNamespaceResourceWhitelist() {}
    /**
     * @return Group of the namespace resource whitelist.
     * 
     */
    public Optional<String> group() {
        return Optional.ofNullable(this.group);
    }
    /**
     * @return Kind of the namespace resource whitelist.
     * 
     */
    public Optional<String> kind() {
        return Optional.ofNullable(this.kind);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GitopsAppProjectProjectSpecNamespaceResourceWhitelist defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String group;
        private @Nullable String kind;
        public Builder() {}
        public Builder(GitopsAppProjectProjectSpecNamespaceResourceWhitelist defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.group = defaults.group;
    	      this.kind = defaults.kind;
        }

        @CustomType.Setter
        public Builder group(@Nullable String group) {

            this.group = group;
            return this;
        }
        @CustomType.Setter
        public Builder kind(@Nullable String kind) {

            this.kind = kind;
            return this;
        }
        public GitopsAppProjectProjectSpecNamespaceResourceWhitelist build() {
            final var _resultValue = new GitopsAppProjectProjectSpecNamespaceResourceWhitelist();
            _resultValue.group = group;
            _resultValue.kind = kind;
            return _resultValue;
        }
    }
}
