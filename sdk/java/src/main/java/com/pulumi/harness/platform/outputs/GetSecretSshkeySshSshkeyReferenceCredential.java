// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetSecretSshkeySshSshkeyReferenceCredential {
    /**
     * @return Encrypted Passphrase
     * 
     */
    private String encryptedAssphrase;
    /**
     * @return SSH key.
     * 
     */
    private String key;
    /**
     * @return SSH Username.
     * 
     */
    private String userName;

    private GetSecretSshkeySshSshkeyReferenceCredential() {}
    /**
     * @return Encrypted Passphrase
     * 
     */
    public String encryptedAssphrase() {
        return this.encryptedAssphrase;
    }
    /**
     * @return SSH key.
     * 
     */
    public String key() {
        return this.key;
    }
    /**
     * @return SSH Username.
     * 
     */
    public String userName() {
        return this.userName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSecretSshkeySshSshkeyReferenceCredential defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String encryptedAssphrase;
        private String key;
        private String userName;
        public Builder() {}
        public Builder(GetSecretSshkeySshSshkeyReferenceCredential defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.encryptedAssphrase = defaults.encryptedAssphrase;
    	      this.key = defaults.key;
    	      this.userName = defaults.userName;
        }

        @CustomType.Setter
        public Builder encryptedAssphrase(String encryptedAssphrase) {
            if (encryptedAssphrase == null) {
              throw new MissingRequiredPropertyException("GetSecretSshkeySshSshkeyReferenceCredential", "encryptedAssphrase");
            }
            this.encryptedAssphrase = encryptedAssphrase;
            return this;
        }
        @CustomType.Setter
        public Builder key(String key) {
            if (key == null) {
              throw new MissingRequiredPropertyException("GetSecretSshkeySshSshkeyReferenceCredential", "key");
            }
            this.key = key;
            return this;
        }
        @CustomType.Setter
        public Builder userName(String userName) {
            if (userName == null) {
              throw new MissingRequiredPropertyException("GetSecretSshkeySshSshkeyReferenceCredential", "userName");
            }
            this.userName = userName;
            return this;
        }
        public GetSecretSshkeySshSshkeyReferenceCredential build() {
            final var _resultValue = new GetSecretSshkeySshSshkeyReferenceCredential();
            _resultValue.encryptedAssphrase = encryptedAssphrase;
            _resultValue.key = key;
            _resultValue.userName = userName;
            return _resultValue;
        }
    }
}
