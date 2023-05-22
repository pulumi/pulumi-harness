// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.harness.platform.inputs.GetGitopsApplicationsApplicationSpecSourceDirectory;
import com.pulumi.harness.platform.inputs.GetGitopsApplicationsApplicationSpecSourceHelm;
import com.pulumi.harness.platform.inputs.GetGitopsApplicationsApplicationSpecSourceKsonnet;
import com.pulumi.harness.platform.inputs.GetGitopsApplicationsApplicationSpecSourceKustomize;
import com.pulumi.harness.platform.inputs.GetGitopsApplicationsApplicationSpecSourcePlugin;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetGitopsApplicationsApplicationSpecSource extends com.pulumi.resources.InvokeArgs {

    public static final GetGitopsApplicationsApplicationSpecSource Empty = new GetGitopsApplicationsApplicationSpecSource();

    @Import(name="chart")
    private @Nullable String chart;

    public Optional<String> chart() {
        return Optional.ofNullable(this.chart);
    }

    @Import(name="directories")
    private @Nullable List<GetGitopsApplicationsApplicationSpecSourceDirectory> directories;

    public Optional<List<GetGitopsApplicationsApplicationSpecSourceDirectory>> directories() {
        return Optional.ofNullable(this.directories);
    }

    @Import(name="helms")
    private @Nullable List<GetGitopsApplicationsApplicationSpecSourceHelm> helms;

    public Optional<List<GetGitopsApplicationsApplicationSpecSourceHelm>> helms() {
        return Optional.ofNullable(this.helms);
    }

    @Import(name="ksonnets")
    private @Nullable List<GetGitopsApplicationsApplicationSpecSourceKsonnet> ksonnets;

    public Optional<List<GetGitopsApplicationsApplicationSpecSourceKsonnet>> ksonnets() {
        return Optional.ofNullable(this.ksonnets);
    }

    @Import(name="kustomizes")
    private @Nullable List<GetGitopsApplicationsApplicationSpecSourceKustomize> kustomizes;

    public Optional<List<GetGitopsApplicationsApplicationSpecSourceKustomize>> kustomizes() {
        return Optional.ofNullable(this.kustomizes);
    }

    @Import(name="path")
    private @Nullable String path;

    public Optional<String> path() {
        return Optional.ofNullable(this.path);
    }

    @Import(name="plugins")
    private @Nullable List<GetGitopsApplicationsApplicationSpecSourcePlugin> plugins;

    public Optional<List<GetGitopsApplicationsApplicationSpecSourcePlugin>> plugins() {
        return Optional.ofNullable(this.plugins);
    }

    @Import(name="repoUrl")
    private @Nullable String repoUrl;

    public Optional<String> repoUrl() {
        return Optional.ofNullable(this.repoUrl);
    }

    @Import(name="targetRevision")
    private @Nullable String targetRevision;

    public Optional<String> targetRevision() {
        return Optional.ofNullable(this.targetRevision);
    }

    private GetGitopsApplicationsApplicationSpecSource() {}

    private GetGitopsApplicationsApplicationSpecSource(GetGitopsApplicationsApplicationSpecSource $) {
        this.chart = $.chart;
        this.directories = $.directories;
        this.helms = $.helms;
        this.ksonnets = $.ksonnets;
        this.kustomizes = $.kustomizes;
        this.path = $.path;
        this.plugins = $.plugins;
        this.repoUrl = $.repoUrl;
        this.targetRevision = $.targetRevision;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetGitopsApplicationsApplicationSpecSource defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetGitopsApplicationsApplicationSpecSource $;

        public Builder() {
            $ = new GetGitopsApplicationsApplicationSpecSource();
        }

        public Builder(GetGitopsApplicationsApplicationSpecSource defaults) {
            $ = new GetGitopsApplicationsApplicationSpecSource(Objects.requireNonNull(defaults));
        }

        public Builder chart(@Nullable String chart) {
            $.chart = chart;
            return this;
        }

        public Builder directories(@Nullable List<GetGitopsApplicationsApplicationSpecSourceDirectory> directories) {
            $.directories = directories;
            return this;
        }

        public Builder directories(GetGitopsApplicationsApplicationSpecSourceDirectory... directories) {
            return directories(List.of(directories));
        }

        public Builder helms(@Nullable List<GetGitopsApplicationsApplicationSpecSourceHelm> helms) {
            $.helms = helms;
            return this;
        }

        public Builder helms(GetGitopsApplicationsApplicationSpecSourceHelm... helms) {
            return helms(List.of(helms));
        }

        public Builder ksonnets(@Nullable List<GetGitopsApplicationsApplicationSpecSourceKsonnet> ksonnets) {
            $.ksonnets = ksonnets;
            return this;
        }

        public Builder ksonnets(GetGitopsApplicationsApplicationSpecSourceKsonnet... ksonnets) {
            return ksonnets(List.of(ksonnets));
        }

        public Builder kustomizes(@Nullable List<GetGitopsApplicationsApplicationSpecSourceKustomize> kustomizes) {
            $.kustomizes = kustomizes;
            return this;
        }

        public Builder kustomizes(GetGitopsApplicationsApplicationSpecSourceKustomize... kustomizes) {
            return kustomizes(List.of(kustomizes));
        }

        public Builder path(@Nullable String path) {
            $.path = path;
            return this;
        }

        public Builder plugins(@Nullable List<GetGitopsApplicationsApplicationSpecSourcePlugin> plugins) {
            $.plugins = plugins;
            return this;
        }

        public Builder plugins(GetGitopsApplicationsApplicationSpecSourcePlugin... plugins) {
            return plugins(List.of(plugins));
        }

        public Builder repoUrl(@Nullable String repoUrl) {
            $.repoUrl = repoUrl;
            return this;
        }

        public Builder targetRevision(@Nullable String targetRevision) {
            $.targetRevision = targetRevision;
            return this;
        }

        public GetGitopsApplicationsApplicationSpecSource build() {
            return $;
        }
    }

}