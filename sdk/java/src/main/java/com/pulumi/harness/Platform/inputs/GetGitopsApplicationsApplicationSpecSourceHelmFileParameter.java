// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetGitopsApplicationsApplicationSpecSourceHelmFileParameter extends com.pulumi.resources.InvokeArgs {

    public static final GetGitopsApplicationsApplicationSpecSourceHelmFileParameter Empty = new GetGitopsApplicationsApplicationSpecSourceHelmFileParameter();

    /**
     * Name of the GitOps application.
     * 
     */
    @Import(name="name")
    private @Nullable String name;

    /**
     * @return Name of the GitOps application.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }

    @Import(name="path")
    private @Nullable String path;

    public Optional<String> path() {
        return Optional.ofNullable(this.path);
    }

    private GetGitopsApplicationsApplicationSpecSourceHelmFileParameter() {}

    private GetGitopsApplicationsApplicationSpecSourceHelmFileParameter(GetGitopsApplicationsApplicationSpecSourceHelmFileParameter $) {
        this.name = $.name;
        this.path = $.path;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetGitopsApplicationsApplicationSpecSourceHelmFileParameter defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetGitopsApplicationsApplicationSpecSourceHelmFileParameter $;

        public Builder() {
            $ = new GetGitopsApplicationsApplicationSpecSourceHelmFileParameter();
        }

        public Builder(GetGitopsApplicationsApplicationSpecSourceHelmFileParameter defaults) {
            $ = new GetGitopsApplicationsApplicationSpecSourceHelmFileParameter(Objects.requireNonNull(defaults));
        }

        /**
         * @param name Name of the GitOps application.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable String name) {
            $.name = name;
            return this;
        }

        public Builder path(@Nullable String path) {
            $.path = path;
            return this;
        }

        public GetGitopsApplicationsApplicationSpecSourceHelmFileParameter build() {
            return $;
        }
    }

}