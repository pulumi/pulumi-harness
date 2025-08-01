// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMatrixGeneratorScmProviderTemplateSpecIgnoreDifference {
    /**
     * @return The Kubernetes resource Group to match for.
     * 
     */
    private @Nullable String group;
    /**
     * @return List of JQ path expression strings targeting the field(s) to ignore.
     * 
     */
    private @Nullable List<String> jqPathExpressions;
    /**
     * @return List of JSONPaths strings targeting the field(s) to ignore.
     * 
     */
    private @Nullable List<String> jsonPointers;
    /**
     * @return The Kubernetes resource Kind to match for.
     * 
     */
    private @Nullable String kind;
    /**
     * @return The Kubernetes resource Name to match for.
     * 
     */
    private @Nullable String name;
    /**
     * @return The Kubernetes resource Namespace to match for.
     * 
     */
    private @Nullable String namespace;

    private GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMatrixGeneratorScmProviderTemplateSpecIgnoreDifference() {}
    /**
     * @return The Kubernetes resource Group to match for.
     * 
     */
    public Optional<String> group() {
        return Optional.ofNullable(this.group);
    }
    /**
     * @return List of JQ path expression strings targeting the field(s) to ignore.
     * 
     */
    public List<String> jqPathExpressions() {
        return this.jqPathExpressions == null ? List.of() : this.jqPathExpressions;
    }
    /**
     * @return List of JSONPaths strings targeting the field(s) to ignore.
     * 
     */
    public List<String> jsonPointers() {
        return this.jsonPointers == null ? List.of() : this.jsonPointers;
    }
    /**
     * @return The Kubernetes resource Kind to match for.
     * 
     */
    public Optional<String> kind() {
        return Optional.ofNullable(this.kind);
    }
    /**
     * @return The Kubernetes resource Name to match for.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    /**
     * @return The Kubernetes resource Namespace to match for.
     * 
     */
    public Optional<String> namespace() {
        return Optional.ofNullable(this.namespace);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMatrixGeneratorScmProviderTemplateSpecIgnoreDifference defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String group;
        private @Nullable List<String> jqPathExpressions;
        private @Nullable List<String> jsonPointers;
        private @Nullable String kind;
        private @Nullable String name;
        private @Nullable String namespace;
        public Builder() {}
        public Builder(GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMatrixGeneratorScmProviderTemplateSpecIgnoreDifference defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.group = defaults.group;
    	      this.jqPathExpressions = defaults.jqPathExpressions;
    	      this.jsonPointers = defaults.jsonPointers;
    	      this.kind = defaults.kind;
    	      this.name = defaults.name;
    	      this.namespace = defaults.namespace;
        }

        @CustomType.Setter
        public Builder group(@Nullable String group) {

            this.group = group;
            return this;
        }
        @CustomType.Setter
        public Builder jqPathExpressions(@Nullable List<String> jqPathExpressions) {

            this.jqPathExpressions = jqPathExpressions;
            return this;
        }
        public Builder jqPathExpressions(String... jqPathExpressions) {
            return jqPathExpressions(List.of(jqPathExpressions));
        }
        @CustomType.Setter
        public Builder jsonPointers(@Nullable List<String> jsonPointers) {

            this.jsonPointers = jsonPointers;
            return this;
        }
        public Builder jsonPointers(String... jsonPointers) {
            return jsonPointers(List.of(jsonPointers));
        }
        @CustomType.Setter
        public Builder kind(@Nullable String kind) {

            this.kind = kind;
            return this;
        }
        @CustomType.Setter
        public Builder name(@Nullable String name) {

            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder namespace(@Nullable String namespace) {

            this.namespace = namespace;
            return this;
        }
        public GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMatrixGeneratorScmProviderTemplateSpecIgnoreDifference build() {
            final var _resultValue = new GitopsApplicationsetApplicationsetSpecGeneratorMatrixGeneratorMatrixGeneratorScmProviderTemplateSpecIgnoreDifference();
            _resultValue.group = group;
            _resultValue.jqPathExpressions = jqPathExpressions;
            _resultValue.jsonPointers = jsonPointers;
            _resultValue.kind = kind;
            _resultValue.name = name;
            _resultValue.namespace = namespace;
            return _resultValue;
        }
    }
}
