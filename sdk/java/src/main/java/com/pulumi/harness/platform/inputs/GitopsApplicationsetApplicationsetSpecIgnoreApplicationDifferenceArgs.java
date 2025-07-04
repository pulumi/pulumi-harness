// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GitopsApplicationsetApplicationsetSpecIgnoreApplicationDifferenceArgs extends com.pulumi.resources.ResourceArgs {

    public static final GitopsApplicationsetApplicationsetSpecIgnoreApplicationDifferenceArgs Empty = new GitopsApplicationsetApplicationsetSpecIgnoreApplicationDifferenceArgs();

    /**
     * jq path to ignore differences
     * 
     */
    @Import(name="jqPathExpressions")
    private @Nullable Output<List<String>> jqPathExpressions;

    /**
     * @return jq path to ignore differences
     * 
     */
    public Optional<Output<List<String>>> jqPathExpressions() {
        return Optional.ofNullable(this.jqPathExpressions);
    }

    /**
     * Json pointers to ignore differences
     * 
     */
    @Import(name="jsonPointers")
    private @Nullable Output<List<String>> jsonPointers;

    /**
     * @return Json pointers to ignore differences
     * 
     */
    public Optional<Output<List<String>>> jsonPointers() {
        return Optional.ofNullable(this.jsonPointers);
    }

    /**
     * name
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return name
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    private GitopsApplicationsetApplicationsetSpecIgnoreApplicationDifferenceArgs() {}

    private GitopsApplicationsetApplicationsetSpecIgnoreApplicationDifferenceArgs(GitopsApplicationsetApplicationsetSpecIgnoreApplicationDifferenceArgs $) {
        this.jqPathExpressions = $.jqPathExpressions;
        this.jsonPointers = $.jsonPointers;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GitopsApplicationsetApplicationsetSpecIgnoreApplicationDifferenceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GitopsApplicationsetApplicationsetSpecIgnoreApplicationDifferenceArgs $;

        public Builder() {
            $ = new GitopsApplicationsetApplicationsetSpecIgnoreApplicationDifferenceArgs();
        }

        public Builder(GitopsApplicationsetApplicationsetSpecIgnoreApplicationDifferenceArgs defaults) {
            $ = new GitopsApplicationsetApplicationsetSpecIgnoreApplicationDifferenceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param jqPathExpressions jq path to ignore differences
         * 
         * @return builder
         * 
         */
        public Builder jqPathExpressions(@Nullable Output<List<String>> jqPathExpressions) {
            $.jqPathExpressions = jqPathExpressions;
            return this;
        }

        /**
         * @param jqPathExpressions jq path to ignore differences
         * 
         * @return builder
         * 
         */
        public Builder jqPathExpressions(List<String> jqPathExpressions) {
            return jqPathExpressions(Output.of(jqPathExpressions));
        }

        /**
         * @param jqPathExpressions jq path to ignore differences
         * 
         * @return builder
         * 
         */
        public Builder jqPathExpressions(String... jqPathExpressions) {
            return jqPathExpressions(List.of(jqPathExpressions));
        }

        /**
         * @param jsonPointers Json pointers to ignore differences
         * 
         * @return builder
         * 
         */
        public Builder jsonPointers(@Nullable Output<List<String>> jsonPointers) {
            $.jsonPointers = jsonPointers;
            return this;
        }

        /**
         * @param jsonPointers Json pointers to ignore differences
         * 
         * @return builder
         * 
         */
        public Builder jsonPointers(List<String> jsonPointers) {
            return jsonPointers(Output.of(jsonPointers));
        }

        /**
         * @param jsonPointers Json pointers to ignore differences
         * 
         * @return builder
         * 
         */
        public Builder jsonPointers(String... jsonPointers) {
            return jsonPointers(List.of(jsonPointers));
        }

        /**
         * @param name name
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name name
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public GitopsApplicationsetApplicationsetSpecIgnoreApplicationDifferenceArgs build() {
            return $;
        }
    }

}
