// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.harness.Utilities;
import com.pulumi.harness.platform.HarRegistryArgs;
import com.pulumi.harness.platform.inputs.HarRegistryState;
import com.pulumi.harness.platform.outputs.HarRegistryConfig;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Resource for creating and managing Harness Registries.
 * 
 * ## Example Usage
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.harness.platform.HarRegistry;
 * import com.pulumi.harness.platform.HarRegistryArgs;
 * import com.pulumi.harness.platform.inputs.HarRegistryConfigArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         // Example of a Virtual Registry
 *         var virtualRegistry = new HarRegistry("virtualRegistry", HarRegistryArgs.builder()
 *             .identifier("virtual_docker_registry")
 *             .description("Virtual Docker Registry")
 *             .spaceRef("accountId/orgId/projectId")
 *             .packageType("DOCKER")
 *             .configs(HarRegistryConfigArgs.builder()
 *                 .type("VIRTUAL")
 *                 .upstreamProxies(                
 *                     "registry1",
 *                     "registry2")
 *                 .build())
 *             .parentRef("accountId/orgId/projectId")
 *             .build());
 * 
 *         // Example of an Upstream Registry with Authentication
 *         var upstreamRegistry = new HarRegistry("upstreamRegistry", HarRegistryArgs.builder()
 *             .identifier("upstream_helm_registry")
 *             .description("Upstream Helm Registry")
 *             .spaceRef("accountId/orgId/projectId")
 *             .packageType("HELM")
 *             .configs(HarRegistryConfigArgs.builder()
 *                 .type("UPSTREAM")
 *                 .source("CUSTOM")
 *                 .url("https://helm.sh")
 *                 .auths(HarRegistryConfigAuthArgs.builder()
 *                     .authType("UserPassword")
 *                     .userName("registry_user")
 *                     .secretIdentifier("registry_password")
 *                     .secretSpacePath("accountId/orgId/projectId")
 *                     .build())
 *                 .build())
 *             .parentRef("accountId/orgId/projectId")
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 */
@ResourceType(type="harness:platform/harRegistry:HarRegistry")
public class HarRegistry extends com.pulumi.resources.CustomResource {
    /**
     * Allowed pattern for the registry
     * 
     */
    @Export(name="allowedPatterns", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> allowedPatterns;

    /**
     * @return Allowed pattern for the registry
     * 
     */
    public Output<Optional<List<String>>> allowedPatterns() {
        return Codegen.optional(this.allowedPatterns);
    }
    /**
     * Blocked pattern for the registry
     * 
     */
    @Export(name="blockedPatterns", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> blockedPatterns;

    /**
     * @return Blocked pattern for the registry
     * 
     */
    public Output<Optional<List<String>>> blockedPatterns() {
        return Codegen.optional(this.blockedPatterns);
    }
    /**
     * Configuration for the registry
     * 
     */
    @Export(name="configs", refs={List.class,HarRegistryConfig.class}, tree="[0,1]")
    private Output<List<HarRegistryConfig>> configs;

    /**
     * @return Configuration for the registry
     * 
     */
    public Output<List<HarRegistryConfig>> configs() {
        return this.configs;
    }
    /**
     * Timestamp when the registry was created
     * 
     */
    @Export(name="createdAt", refs={String.class}, tree="[0]")
    private Output<String> createdAt;

    /**
     * @return Timestamp when the registry was created
     * 
     */
    public Output<String> createdAt() {
        return this.createdAt;
    }
    /**
     * Description of the registry
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    /**
     * @return Description of the registry
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * Unique identifier of the registry
     * 
     */
    @Export(name="identifier", refs={String.class}, tree="[0]")
    private Output<String> identifier;

    /**
     * @return Unique identifier of the registry
     * 
     */
    public Output<String> identifier() {
        return this.identifier;
    }
    /**
     * Type of package (DOCKER, HELM, etc.)
     * 
     */
    @Export(name="packageType", refs={String.class}, tree="[0]")
    private Output<String> packageType;

    /**
     * @return Type of package (DOCKER, HELM, etc.)
     * 
     */
    public Output<String> packageType() {
        return this.packageType;
    }
    /**
     * Parent reference for the registry
     * 
     */
    @Export(name="parentRef", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> parentRef;

    /**
     * @return Parent reference for the registry
     * 
     */
    public Output<Optional<String>> parentRef() {
        return Codegen.optional(this.parentRef);
    }
    /**
     * Space reference for the registry
     * 
     */
    @Export(name="spaceRef", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> spaceRef;

    /**
     * @return Space reference for the registry
     * 
     */
    public Output<Optional<String>> spaceRef() {
        return Codegen.optional(this.spaceRef);
    }
    /**
     * URL of the registry
     * 
     */
    @Export(name="url", refs={String.class}, tree="[0]")
    private Output<String> url;

    /**
     * @return URL of the registry
     * 
     */
    public Output<String> url() {
        return this.url;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public HarRegistry(java.lang.String name) {
        this(name, HarRegistryArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public HarRegistry(java.lang.String name, HarRegistryArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public HarRegistry(java.lang.String name, HarRegistryArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("harness:platform/harRegistry:HarRegistry", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private HarRegistry(java.lang.String name, Output<java.lang.String> id, @Nullable HarRegistryState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("harness:platform/harRegistry:HarRegistry", name, state, makeResourceOptions(options, id), false);
    }

    private static HarRegistryArgs makeArgs(HarRegistryArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? HarRegistryArgs.Empty : args;
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
    public static HarRegistry get(java.lang.String name, Output<java.lang.String> id, @Nullable HarRegistryState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new HarRegistry(name, id, state, options);
    }
}
