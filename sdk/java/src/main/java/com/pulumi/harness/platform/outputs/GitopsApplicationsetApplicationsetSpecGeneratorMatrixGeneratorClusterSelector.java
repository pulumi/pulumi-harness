// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.harness.platform.outputs.GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorClusterSelectorMatchExpression;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorClusterSelector {
    /**
     * @return A list of label selector requirements. The requirements are ANDed.
     * 
     */
    private @Nullable List<GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorClusterSelectorMatchExpression> matchExpressions;
    /**
     * @return A map of {key,value} pairs. A single {key,value} in the matchLabels map is equivalent to an element of `match_expressions`, whose key field is &#34;key&#34;, the operator is &#34;In&#34;, and the values array contains only &#34;value&#34;. The requirements are ANDed.
     * 
     */
    private @Nullable Map<String,String> matchLabels;

    private GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorClusterSelector() {}
    /**
     * @return A list of label selector requirements. The requirements are ANDed.
     * 
     */
    public List<GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorClusterSelectorMatchExpression> matchExpressions() {
        return this.matchExpressions == null ? List.of() : this.matchExpressions;
    }
    /**
     * @return A map of {key,value} pairs. A single {key,value} in the matchLabels map is equivalent to an element of `match_expressions`, whose key field is &#34;key&#34;, the operator is &#34;In&#34;, and the values array contains only &#34;value&#34;. The requirements are ANDed.
     * 
     */
    public Map<String,String> matchLabels() {
        return this.matchLabels == null ? Map.of() : this.matchLabels;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorClusterSelector defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorClusterSelectorMatchExpression> matchExpressions;
        private @Nullable Map<String,String> matchLabels;
        public Builder() {}
        public Builder(GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorClusterSelector defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.matchExpressions = defaults.matchExpressions;
    	      this.matchLabels = defaults.matchLabels;
        }

        @CustomType.Setter
        public Builder matchExpressions(@Nullable List<GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorClusterSelectorMatchExpression> matchExpressions) {

            this.matchExpressions = matchExpressions;
            return this;
        }
        public Builder matchExpressions(GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorClusterSelectorMatchExpression... matchExpressions) {
            return matchExpressions(List.of(matchExpressions));
        }
        @CustomType.Setter
        public Builder matchLabels(@Nullable Map<String,String> matchLabels) {

            this.matchLabels = matchLabels;
            return this;
        }
        public GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorClusterSelector build() {
            final var _resultValue = new GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorClusterSelector();
            _resultValue.matchExpressions = matchExpressions;
            _resultValue.matchLabels = matchLabels;
            return _resultValue;
        }
    }
}
