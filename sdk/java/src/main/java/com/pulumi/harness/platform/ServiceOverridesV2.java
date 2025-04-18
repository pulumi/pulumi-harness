// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.harness.Utilities;
import com.pulumi.harness.platform.ServiceOverridesV2Args;
import com.pulumi.harness.platform.inputs.ServiceOverridesV2State;
import com.pulumi.harness.platform.outputs.ServiceOverridesV2GitDetails;
import java.lang.Boolean;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Resource for creating a Harness service override V2.
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
 * import com.pulumi.harness.platform.ServiceOverridesV2;
 * import com.pulumi.harness.platform.ServiceOverridesV2Args;
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
 *         var test = new ServiceOverridesV2("test", ServiceOverridesV2Args.builder()
 *             .orgId("orgIdentifier")
 *             .projectId("projectIdentifier")
 *             .envId("environmentIdentifier")
 *             .serviceId("serviceIdentifier")
 *             .infraId("infraIdentifier")
 *             .type("INFRA_SERVICE_OVERRIDE")
 *             .yaml("""
 * variables:
 *   - name: var1
 *     type: String
 *     value: val1
 * configFiles:
 *   - configFile:
 *       identifier: sampleConfigFile
 *       spec:
 *         store:
 *           type: Harness
 *           spec:
 *             files:
 *               - account:/configFile1
 * manifests:
 *   - manifest:
 *       identifier: sampleManifestFile
 *       type: Values
 *       spec:
 *         store:
 *           type: Harness
 *           spec:
 *             files:
 *               - account:/manifestFile1
 *             """)
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ### Creating Remote Service Override
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.harness.platform.ServiceOverridesV2;
 * import com.pulumi.harness.platform.ServiceOverridesV2Args;
 * import com.pulumi.harness.platform.inputs.ServiceOverridesV2GitDetailsArgs;
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
 *         var test = new ServiceOverridesV2("test", ServiceOverridesV2Args.builder()
 *             .orgId("orgIdentifier")
 *             .projectId("projectIdentifier")
 *             .envId("environmentIdentifier")
 *             .serviceId("serviceIdentifier")
 *             .infraId("infraIdentifier")
 *             .type("INFRA_SERVICE_OVERRIDE")
 *             .gitDetails(ServiceOverridesV2GitDetailsArgs.builder()
 *                 .storeType("REMOTE")
 *                 .connectorRef("connector_ref")
 *                 .repoName("repo_name")
 *                 .filePath("file_path")
 *                 .branch("branch")
 *                 .build())
 *             .yaml("""
 * variables:
 *   - name: v1
 *     type: String
 *     value: val1
 * manifests:
 *   - manifest:
 *       identifier: manifest1
 *       type: Values
 *       spec:
 *         store:
 *           type: Github
 *           spec:
 *             connectorRef: "<+input>"
 *             gitFetchType: Branch
 *             paths:
 *               - path-updated
 *             repoName: "<+input>"
 *             branch: master
 *         skipResourceVersioning: false
 *             """)
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ### Importing Service Override From Git
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.harness.platform.ServiceOverridesV2;
 * import com.pulumi.harness.platform.ServiceOverridesV2Args;
 * import com.pulumi.harness.platform.inputs.ServiceOverridesV2GitDetailsArgs;
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
 *         var test = new ServiceOverridesV2("test", ServiceOverridesV2Args.builder()
 *             .orgId("orgIdentifier")
 *             .projectId("projectIdentifier")
 *             .envId("environmentIdentifier")
 *             .serviceId("serviceIdentifier")
 *             .infraId("infraIdentifier")
 *             .type("INFRA_SERVICE_OVERRIDE")
 *             .importFromGit(true)
 *             .gitDetails(ServiceOverridesV2GitDetailsArgs.builder()
 *                 .storeType("REMOTE")
 *                 .connectorRef("connector_ref")
 *                 .repoName("repo_name")
 *                 .filePath("file_path")
 *                 .branch("branch")
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * Import account level service override
 * 
 * ```sh
 * $ pulumi import harness:platform/serviceOverridesV2:ServiceOverridesV2 example &lt;override_id&gt;
 * ```
 * 
 * Import org level service override
 * 
 * ```sh
 * $ pulumi import harness:platform/serviceOverridesV2:ServiceOverridesV2 example &lt;org_id&gt;/&lt;override_id&gt;
 * ```
 * 
 * Import project level service override
 * 
 * ```sh
 * $ pulumi import harness:platform/serviceOverridesV2:ServiceOverridesV2 example &lt;org_id&gt;/&lt;project_id&gt;/&lt;override_id&gt;
 * ```
 * 
 */
@ResourceType(type="harness:platform/serviceOverridesV2:ServiceOverridesV2")
public class ServiceOverridesV2 extends com.pulumi.resources.CustomResource {
    /**
     * The cluster ID to which the overrides are associated.
     * 
     */
    @Export(name="clusterId", refs={String.class}, tree="[0]")
    private Output<String> clusterId;

    /**
     * @return The cluster ID to which the overrides are associated.
     * 
     */
    public Output<String> clusterId() {
        return this.clusterId;
    }
    /**
     * The environment ID to which the overrides are associated.
     * 
     */
    @Export(name="envId", refs={String.class}, tree="[0]")
    private Output<String> envId;

    /**
     * @return The environment ID to which the overrides are associated.
     * 
     */
    public Output<String> envId() {
        return this.envId;
    }
    /**
     * Contains parameters related to creating an Entity for Git Experience.
     * 
     */
    @Export(name="gitDetails", refs={ServiceOverridesV2GitDetails.class}, tree="[0]")
    private Output<ServiceOverridesV2GitDetails> gitDetails;

    /**
     * @return Contains parameters related to creating an Entity for Git Experience.
     * 
     */
    public Output<ServiceOverridesV2GitDetails> gitDetails() {
        return this.gitDetails;
    }
    /**
     * The identifier of the override entity.
     * 
     */
    @Export(name="identifier", refs={String.class}, tree="[0]")
    private Output<String> identifier;

    /**
     * @return The identifier of the override entity.
     * 
     */
    public Output<String> identifier() {
        return this.identifier;
    }
    /**
     * import override from git
     * 
     */
    @Export(name="importFromGit", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> importFromGit;

    /**
     * @return import override from git
     * 
     */
    public Output<Boolean> importFromGit() {
        return this.importFromGit;
    }
    /**
     * The infrastructure ID to which the overrides are associated.
     * 
     */
    @Export(name="infraId", refs={String.class}, tree="[0]")
    private Output<String> infraId;

    /**
     * @return The infrastructure ID to which the overrides are associated.
     * 
     */
    public Output<String> infraId() {
        return this.infraId;
    }
    /**
     * force import override from remote even if same file path already exist
     * 
     */
    @Export(name="isForceImport", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> isForceImport;

    /**
     * @return force import override from remote even if same file path already exist
     * 
     */
    public Output<Boolean> isForceImport() {
        return this.isForceImport;
    }
    /**
     * Unique identifier of the organization.
     * 
     */
    @Export(name="orgId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> orgId;

    /**
     * @return Unique identifier of the organization.
     * 
     */
    public Output<Optional<String>> orgId() {
        return Codegen.optional(this.orgId);
    }
    /**
     * Unique identifier of the project.
     * 
     */
    @Export(name="projectId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> projectId;

    /**
     * @return Unique identifier of the project.
     * 
     */
    public Output<Optional<String>> projectId() {
        return Codegen.optional(this.projectId);
    }
    /**
     * The service ID to which the overrides applies.
     * 
     */
    @Export(name="serviceId", refs={String.class}, tree="[0]")
    private Output<String> serviceId;

    /**
     * @return The service ID to which the overrides applies.
     * 
     */
    public Output<String> serviceId() {
        return this.serviceId;
    }
    /**
     * The type of the overrides.
     * 
     */
    @Export(name="type", refs={String.class}, tree="[0]")
    private Output<String> type;

    /**
     * @return The type of the overrides.
     * 
     */
    public Output<String> type() {
        return this.type;
    }
    /**
     * The yaml of the overrides spec object.
     * 
     */
    @Export(name="yaml", refs={String.class}, tree="[0]")
    private Output<String> yaml;

    /**
     * @return The yaml of the overrides spec object.
     * 
     */
    public Output<String> yaml() {
        return this.yaml;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ServiceOverridesV2(java.lang.String name) {
        this(name, ServiceOverridesV2Args.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ServiceOverridesV2(java.lang.String name, ServiceOverridesV2Args args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ServiceOverridesV2(java.lang.String name, ServiceOverridesV2Args args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("harness:platform/serviceOverridesV2:ServiceOverridesV2", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private ServiceOverridesV2(java.lang.String name, Output<java.lang.String> id, @Nullable ServiceOverridesV2State state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("harness:platform/serviceOverridesV2:ServiceOverridesV2", name, state, makeResourceOptions(options, id), false);
    }

    private static ServiceOverridesV2Args makeArgs(ServiceOverridesV2Args args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? ServiceOverridesV2Args.Empty : args;
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
    public static ServiceOverridesV2 get(java.lang.String name, Output<java.lang.String> id, @Nullable ServiceOverridesV2State state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ServiceOverridesV2(name, id, state, options);
    }
}
