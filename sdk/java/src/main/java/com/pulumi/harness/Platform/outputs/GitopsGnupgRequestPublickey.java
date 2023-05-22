// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GitopsGnupgRequestPublickey {
    private @Nullable String fingerprint;
    private String keyData;
    private @Nullable String keyId;
    private @Nullable String owner;
    private @Nullable String subType;
    private @Nullable String trust;

    private GitopsGnupgRequestPublickey() {}
    public Optional<String> fingerprint() {
        return Optional.ofNullable(this.fingerprint);
    }
    public String keyData() {
        return this.keyData;
    }
    public Optional<String> keyId() {
        return Optional.ofNullable(this.keyId);
    }
    public Optional<String> owner() {
        return Optional.ofNullable(this.owner);
    }
    public Optional<String> subType() {
        return Optional.ofNullable(this.subType);
    }
    public Optional<String> trust() {
        return Optional.ofNullable(this.trust);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GitopsGnupgRequestPublickey defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String fingerprint;
        private String keyData;
        private @Nullable String keyId;
        private @Nullable String owner;
        private @Nullable String subType;
        private @Nullable String trust;
        public Builder() {}
        public Builder(GitopsGnupgRequestPublickey defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fingerprint = defaults.fingerprint;
    	      this.keyData = defaults.keyData;
    	      this.keyId = defaults.keyId;
    	      this.owner = defaults.owner;
    	      this.subType = defaults.subType;
    	      this.trust = defaults.trust;
        }

        @CustomType.Setter
        public Builder fingerprint(@Nullable String fingerprint) {
            this.fingerprint = fingerprint;
            return this;
        }
        @CustomType.Setter
        public Builder keyData(String keyData) {
            this.keyData = Objects.requireNonNull(keyData);
            return this;
        }
        @CustomType.Setter
        public Builder keyId(@Nullable String keyId) {
            this.keyId = keyId;
            return this;
        }
        @CustomType.Setter
        public Builder owner(@Nullable String owner) {
            this.owner = owner;
            return this;
        }
        @CustomType.Setter
        public Builder subType(@Nullable String subType) {
            this.subType = subType;
            return this;
        }
        @CustomType.Setter
        public Builder trust(@Nullable String trust) {
            this.trust = trust;
            return this;
        }
        public GitopsGnupgRequestPublickey build() {
            final var o = new GitopsGnupgRequestPublickey();
            o.fingerprint = fingerprint;
            o.keyData = keyData;
            o.keyId = keyId;
            o.owner = owner;
            o.subType = subType;
            o.trust = trust;
            return o;
        }
    }
}