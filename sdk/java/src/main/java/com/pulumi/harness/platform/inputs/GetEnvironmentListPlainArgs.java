// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetEnvironmentListPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetEnvironmentListPlainArgs Empty = new GetEnvironmentListPlainArgs();

    @Import(name="orgId")
    private @Nullable String orgId;

    public Optional<String> orgId() {
        return Optional.ofNullable(this.orgId);
    }

    @Import(name="projectId")
    private @Nullable String projectId;

    public Optional<String> projectId() {
        return Optional.ofNullable(this.projectId);
    }

    private GetEnvironmentListPlainArgs() {}

    private GetEnvironmentListPlainArgs(GetEnvironmentListPlainArgs $) {
        this.orgId = $.orgId;
        this.projectId = $.projectId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetEnvironmentListPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetEnvironmentListPlainArgs $;

        public Builder() {
            $ = new GetEnvironmentListPlainArgs();
        }

        public Builder(GetEnvironmentListPlainArgs defaults) {
            $ = new GetEnvironmentListPlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder orgId(@Nullable String orgId) {
            $.orgId = orgId;
            return this;
        }

        public Builder projectId(@Nullable String projectId) {
            $.projectId = projectId;
            return this;
        }

        public GetEnvironmentListPlainArgs build() {
            return $;
        }
    }

}
