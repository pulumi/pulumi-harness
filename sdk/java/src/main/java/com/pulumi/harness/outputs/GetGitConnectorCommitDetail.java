// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetGitConnectorCommitDetail {
    /**
     * @return The email id of the author.
     * 
     */
    private String authorEmailId;
    /**
     * @return The name of the author.
     * 
     */
    private String authorName;
    /**
     * @return Commit message.
     * 
     */
    private String message;

    private GetGitConnectorCommitDetail() {}
    /**
     * @return The email id of the author.
     * 
     */
    public String authorEmailId() {
        return this.authorEmailId;
    }
    /**
     * @return The name of the author.
     * 
     */
    public String authorName() {
        return this.authorName;
    }
    /**
     * @return Commit message.
     * 
     */
    public String message() {
        return this.message;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetGitConnectorCommitDetail defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String authorEmailId;
        private String authorName;
        private String message;
        public Builder() {}
        public Builder(GetGitConnectorCommitDetail defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authorEmailId = defaults.authorEmailId;
    	      this.authorName = defaults.authorName;
    	      this.message = defaults.message;
        }

        @CustomType.Setter
        public Builder authorEmailId(String authorEmailId) {
            if (authorEmailId == null) {
              throw new MissingRequiredPropertyException("GetGitConnectorCommitDetail", "authorEmailId");
            }
            this.authorEmailId = authorEmailId;
            return this;
        }
        @CustomType.Setter
        public Builder authorName(String authorName) {
            if (authorName == null) {
              throw new MissingRequiredPropertyException("GetGitConnectorCommitDetail", "authorName");
            }
            this.authorName = authorName;
            return this;
        }
        @CustomType.Setter
        public Builder message(String message) {
            if (message == null) {
              throw new MissingRequiredPropertyException("GetGitConnectorCommitDetail", "message");
            }
            this.message = message;
            return this;
        }
        public GetGitConnectorCommitDetail build() {
            final var _resultValue = new GetGitConnectorCommitDetail();
            _resultValue.authorEmailId = authorEmailId;
            _resultValue.authorName = authorName;
            _resultValue.message = message;
            return _resultValue;
        }
    }
}