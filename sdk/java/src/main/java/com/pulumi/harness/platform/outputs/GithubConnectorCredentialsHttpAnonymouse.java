// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.outputs;

import com.pulumi.core.annotations.CustomType;
import java.util.Objects;

@CustomType
public final class GithubConnectorCredentialsHttpAnonymouse {
    private GithubConnectorCredentialsHttpAnonymouse() {}

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GithubConnectorCredentialsHttpAnonymouse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        public Builder() {}
        public Builder(GithubConnectorCredentialsHttpAnonymouse defaults) {
    	      Objects.requireNonNull(defaults);
        }

        public GithubConnectorCredentialsHttpAnonymouse build() {
            final var _resultValue = new GithubConnectorCredentialsHttpAnonymouse();
            return _resultValue;
        }
    }
}
