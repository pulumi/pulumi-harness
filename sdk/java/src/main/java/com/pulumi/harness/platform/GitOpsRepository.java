// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.harness.Utilities;
import com.pulumi.harness.platform.GitOpsRepositoryArgs;
import com.pulumi.harness.platform.inputs.GitOpsRepositoryState;
import com.pulumi.harness.platform.outputs.GitOpsRepositoryEcrGen;
import com.pulumi.harness.platform.outputs.GitOpsRepositoryGcrGen;
import com.pulumi.harness.platform.outputs.GitOpsRepositoryRepo;
import com.pulumi.harness.platform.outputs.GitOpsRepositoryUpdateMask;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Resource for managing Harness Gitops Repository.
 * 
 * ## Import
 * 
 * Import an Account level Gitops Repository
 * 
 * ```sh
 * $ pulumi import harness:platform/gitOpsRepository:GitOpsRepository example &lt;agent_id&gt;/&lt;respository_id&gt;
 * ```
 * 
 * Import an Org level Gitops Repository
 * 
 * ```sh
 * $ pulumi import harness:platform/gitOpsRepository:GitOpsRepository example &lt;organization_id&gt;/&lt;agent_id&gt;/&lt;respository_id&gt;
 * ```
 * 
 * Import a Project level Gitops Repository
 * 
 * ```sh
 * $ pulumi import harness:platform/gitOpsRepository:GitOpsRepository example &lt;organization_id&gt;/&lt;project_id&gt;/&lt;agent_id&gt;/&lt;respository_id&gt;
 * ```
 * 
 */
@ResourceType(type="harness:platform/gitOpsRepository:GitOpsRepository")
public class GitOpsRepository extends com.pulumi.resources.CustomResource {
    /**
     * Account identifier of the GitOps repository.
     * 
     * @deprecated
     * This field is deprecated and will be removed in a future release.
     * 
     */
    @Deprecated /* This field is deprecated and will be removed in a future release. */
    @Export(name="accountId", refs={String.class}, tree="[0]")
    private Output<String> accountId;

    /**
     * @return Account identifier of the GitOps repository.
     * 
     */
    public Output<String> accountId() {
        return this.accountId;
    }
    /**
     * Agent identifier of the GitOps repository.
     * 
     */
    @Export(name="agentId", refs={String.class}, tree="[0]")
    private Output<String> agentId;

    /**
     * @return Agent identifier of the GitOps repository.
     * 
     */
    public Output<String> agentId() {
        return this.agentId;
    }
    /**
     * Indicates if to operate on credential set instead of repository.
     * 
     */
    @Export(name="credsOnly", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> credsOnly;

    /**
     * @return Indicates if to operate on credential set instead of repository.
     * 
     */
    public Output<Optional<Boolean>> credsOnly() {
        return Codegen.optional(this.credsOnly);
    }
    /**
     * ECR access token generator specific configuration.
     * 
     */
    @Export(name="ecrGen", refs={GitOpsRepositoryEcrGen.class}, tree="[0]")
    private Output</* @Nullable */ GitOpsRepositoryEcrGen> ecrGen;

    /**
     * @return ECR access token generator specific configuration.
     * 
     */
    public Output<Optional<GitOpsRepositoryEcrGen>> ecrGen() {
        return Codegen.optional(this.ecrGen);
    }
    /**
     * Indicates if the repository should be deleted forcefully, regardless of existing applications using that repo.
     * 
     */
    @Export(name="forceDelete", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> forceDelete;

    /**
     * @return Indicates if the repository should be deleted forcefully, regardless of existing applications using that repo.
     * 
     */
    public Output<Optional<Boolean>> forceDelete() {
        return Codegen.optional(this.forceDelete);
    }
    /**
     * GCR access token generator specific configuration.
     * 
     */
    @Export(name="gcrGen", refs={GitOpsRepositoryGcrGen.class}, tree="[0]")
    private Output</* @Nullable */ GitOpsRepositoryGcrGen> gcrGen;

    /**
     * @return GCR access token generator specific configuration.
     * 
     */
    public Output<Optional<GitOpsRepositoryGcrGen>> gcrGen() {
        return Codegen.optional(this.gcrGen);
    }
    /**
     * Default: &#34;UNSET&#34;
     * Enum: &#34;UNSET&#34; &#34;AWS*ECR&#34; &#34;GOOGLE*GCR&#34;
     * 
     */
    @Export(name="genType", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> genType;

    /**
     * @return Default: &#34;UNSET&#34;
     * Enum: &#34;UNSET&#34; &#34;AWS*ECR&#34; &#34;GOOGLE*GCR&#34;
     * 
     */
    public Output<Optional<String>> genType() {
        return Codegen.optional(this.genType);
    }
    /**
     * Identifier of the GitOps repository.
     * 
     */
    @Export(name="identifier", refs={String.class}, tree="[0]")
    private Output<String> identifier;

    /**
     * @return Identifier of the GitOps repository.
     * 
     */
    public Output<String> identifier() {
        return this.identifier;
    }
    /**
     * Organization identifier of the GitOps repository.
     * 
     */
    @Export(name="orgId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> orgId;

    /**
     * @return Organization identifier of the GitOps repository.
     * 
     */
    public Output<Optional<String>> orgId() {
        return Codegen.optional(this.orgId);
    }
    /**
     * Project identifier of the GitOps repository.
     * 
     */
    @Export(name="projectId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> projectId;

    /**
     * @return Project identifier of the GitOps repository.
     * 
     */
    public Output<Optional<String>> projectId() {
        return Codegen.optional(this.projectId);
    }
    /**
     * For OCI repos, this is the interval to refresh the token to access the registry.
     * 
     */
    @Export(name="refreshInterval", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> refreshInterval;

    /**
     * @return For OCI repos, this is the interval to refresh the token to access the registry.
     * 
     */
    public Output<Optional<String>> refreshInterval() {
        return Codegen.optional(this.refreshInterval);
    }
    /**
     * Repo details holding application configurations.
     * 
     */
    @Export(name="repos", refs={List.class,GitOpsRepositoryRepo.class}, tree="[0,1]")
    private Output<List<GitOpsRepositoryRepo>> repos;

    /**
     * @return Repo details holding application configurations.
     * 
     */
    public Output<List<GitOpsRepositoryRepo>> repos() {
        return this.repos;
    }
    /**
     * Update mask of the repository.
     * 
     * @deprecated
     * This field is deprecated and will be removed in a future release.
     * 
     */
    @Deprecated /* This field is deprecated and will be removed in a future release. */
    @Export(name="updateMasks", refs={List.class,GitOpsRepositoryUpdateMask.class}, tree="[0,1]")
    private Output</* @Nullable */ List<GitOpsRepositoryUpdateMask>> updateMasks;

    /**
     * @return Update mask of the repository.
     * 
     */
    public Output<Optional<List<GitOpsRepositoryUpdateMask>>> updateMasks() {
        return Codegen.optional(this.updateMasks);
    }
    /**
     * Indicates if the GitOps repository should be updated if existing and inserted if not.
     * 
     */
    @Export(name="upsert", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> upsert;

    /**
     * @return Indicates if the GitOps repository should be updated if existing and inserted if not.
     * 
     */
    public Output<Optional<Boolean>> upsert() {
        return Codegen.optional(this.upsert);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public GitOpsRepository(java.lang.String name) {
        this(name, GitOpsRepositoryArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public GitOpsRepository(java.lang.String name, GitOpsRepositoryArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public GitOpsRepository(java.lang.String name, GitOpsRepositoryArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("harness:platform/gitOpsRepository:GitOpsRepository", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private GitOpsRepository(java.lang.String name, Output<java.lang.String> id, @Nullable GitOpsRepositoryState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("harness:platform/gitOpsRepository:GitOpsRepository", name, state, makeResourceOptions(options, id), false);
    }

    private static GitOpsRepositoryArgs makeArgs(GitOpsRepositoryArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? GitOpsRepositoryArgs.Empty : args;
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<java.lang.String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .pluginDownloadURL("github://api.github.com/pulumi")
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static GitOpsRepository get(java.lang.String name, Output<java.lang.String> id, @Nullable GitOpsRepositoryState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new GitOpsRepository(name, id, state, options);
    }
}
