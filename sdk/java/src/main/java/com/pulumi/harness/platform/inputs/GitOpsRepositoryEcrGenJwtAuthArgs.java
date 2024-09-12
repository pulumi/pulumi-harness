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


public final class GitOpsRepositoryEcrGenJwtAuthArgs extends com.pulumi.resources.ResourceArgs {

    public static final GitOpsRepositoryEcrGenJwtAuthArgs Empty = new GitOpsRepositoryEcrGenJwtAuthArgs();

    /**
     * Audience specifies the `aud` claim for the service account token If the service account uses a well-known annotation for e.g. IRSA or GCP Workload Identity then this audiences will be appended to the list
     * 
     */
    @Import(name="audiences")
    private @Nullable Output<List<String>> audiences;

    /**
     * @return Audience specifies the `aud` claim for the service account token If the service account uses a well-known annotation for e.g. IRSA or GCP Workload Identity then this audiences will be appended to the list
     * 
     */
    public Optional<Output<List<String>>> audiences() {
        return Optional.ofNullable(this.audiences);
    }

    /**
     * The name of the ServiceAccount resource being referred to.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the ServiceAccount resource being referred to.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Namespace of the resource being referred to. Ignored if referent is not cluster-scoped. cluster-scoped defaults to the namespace of the referent.
     * 
     */
    @Import(name="namespace")
    private @Nullable Output<String> namespace;

    /**
     * @return Namespace of the resource being referred to. Ignored if referent is not cluster-scoped. cluster-scoped defaults to the namespace of the referent.
     * 
     */
    public Optional<Output<String>> namespace() {
        return Optional.ofNullable(this.namespace);
    }

    private GitOpsRepositoryEcrGenJwtAuthArgs() {}

    private GitOpsRepositoryEcrGenJwtAuthArgs(GitOpsRepositoryEcrGenJwtAuthArgs $) {
        this.audiences = $.audiences;
        this.name = $.name;
        this.namespace = $.namespace;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GitOpsRepositoryEcrGenJwtAuthArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GitOpsRepositoryEcrGenJwtAuthArgs $;

        public Builder() {
            $ = new GitOpsRepositoryEcrGenJwtAuthArgs();
        }

        public Builder(GitOpsRepositoryEcrGenJwtAuthArgs defaults) {
            $ = new GitOpsRepositoryEcrGenJwtAuthArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param audiences Audience specifies the `aud` claim for the service account token If the service account uses a well-known annotation for e.g. IRSA or GCP Workload Identity then this audiences will be appended to the list
         * 
         * @return builder
         * 
         */
        public Builder audiences(@Nullable Output<List<String>> audiences) {
            $.audiences = audiences;
            return this;
        }

        /**
         * @param audiences Audience specifies the `aud` claim for the service account token If the service account uses a well-known annotation for e.g. IRSA or GCP Workload Identity then this audiences will be appended to the list
         * 
         * @return builder
         * 
         */
        public Builder audiences(List<String> audiences) {
            return audiences(Output.of(audiences));
        }

        /**
         * @param audiences Audience specifies the `aud` claim for the service account token If the service account uses a well-known annotation for e.g. IRSA or GCP Workload Identity then this audiences will be appended to the list
         * 
         * @return builder
         * 
         */
        public Builder audiences(String... audiences) {
            return audiences(List.of(audiences));
        }

        /**
         * @param name The name of the ServiceAccount resource being referred to.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the ServiceAccount resource being referred to.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param namespace Namespace of the resource being referred to. Ignored if referent is not cluster-scoped. cluster-scoped defaults to the namespace of the referent.
         * 
         * @return builder
         * 
         */
        public Builder namespace(@Nullable Output<String> namespace) {
            $.namespace = namespace;
            return this;
        }

        /**
         * @param namespace Namespace of the resource being referred to. Ignored if referent is not cluster-scoped. cluster-scoped defaults to the namespace of the referent.
         * 
         * @return builder
         * 
         */
        public Builder namespace(String namespace) {
            return namespace(Output.of(namespace));
        }

        public GitOpsRepositoryEcrGenJwtAuthArgs build() {
            return $;
        }
    }

}