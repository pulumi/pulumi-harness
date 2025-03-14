// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.harness.Utilities;
import com.pulumi.harness.platform.ManualFreezeArgs;
import com.pulumi.harness.platform.inputs.ManualFreezeState;
import com.pulumi.harness.platform.outputs.ManualFreezeCurrentOrUpcomingWindow;
import com.pulumi.harness.platform.outputs.ManualFreezeFreezeWindow;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Resource for Manual Deployment Freeze Window.
 * ## Example to create Manual Freeze at different levels (Org, Project, Account)
 * 
 * ### Account Level
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.harness.platform.ManualFreeze;
 * import com.pulumi.harness.platform.ManualFreezeArgs;
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
 *         var example = new ManualFreeze("example", ManualFreezeArgs.builder()
 *             .identifier("identifier")
 *             .orgId("orgIdentifier")
 *             .projectId("projectIdentifier")
 *             .accountId("accountIdentifier")
 *             .yaml("""
 * freeze:
 *   name: freezeName
 *   identifier: identifier
 *   entityConfigs:
 *     - name: r1
 *       entities:
 *         - filterType: All
 *           type: Org
 *         - filterType: All
 *           type: Project
 *         - filterType: All
 *           type: Service
 *         - filterType: All
 *           type: EnvType
 *   status: Disabled
 *   description: hi
 *   windows:
 *   - timeZone: Asia/Calcutta
 *     startTime: 2023-05-03 04:16 PM
 *     duration: 30m
 *     recurrence:
 *       type: Daily
 *   notificationRules: []
 *   tags: {}
 *             """)
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ### Org Level
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.harness.platform.ManualFreeze;
 * import com.pulumi.harness.platform.ManualFreezeArgs;
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
 *         var example = new ManualFreeze("example", ManualFreezeArgs.builder()
 *             .identifier("identifier")
 *             .orgId("orgIdentifier")
 *             .accountId("accountIdentifier")
 *             .yaml("""
 * freeze:
 *   name: freezeName
 *   identifier: identifier
 *   entityConfigs:
 *     - name: r1
 *       entities:
 *         - filterType: All
 *           type: Org
 *         - filterType: All
 *           type: Project
 *         - filterType: All
 *           type: Service
 *         - filterType: All
 *           type: EnvType
 *   status: Disabled
 *   description: hi
 *   windows:
 *   - timeZone: Asia/Calcutta
 *     startTime: 2023-05-03 04:16 PM
 *     duration: 30m
 *     recurrence:
 *       type: Daily
 *   notificationRules: []
 *   tags: {}
 *             """)
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ### Project Level
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.harness.platform.ManualFreeze;
 * import com.pulumi.harness.platform.ManualFreezeArgs;
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
 *         var example = new ManualFreeze("example", ManualFreezeArgs.builder()
 *             .identifier("identifier")
 *             .orgId("orgIdentifier")
 *             .projectId("projectIdentifier")
 *             .accountId("accountIdentifier")
 *             .yaml("""
 * freeze:
 *   name: freezeName
 *   identifier: identifier
 *   entityConfigs:
 *     - name: r1
 *       entities:
 *         - filterType: All
 *           type: Org
 *         - filterType: All
 *           type: Project
 *         - filterType: All
 *           type: Service
 *         - filterType: All
 *           type: EnvType
 *   status: Disabled
 *   description: hi
 *   windows:
 *   - timeZone: Asia/Calcutta
 *     startTime: 2023-05-03 04:16 PM
 *     duration: 30m
 *     recurrence:
 *       type: Daily
 *   notificationRules: []
 *   tags: {}
 *             """)
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
 * Import an account level freeze
 * 
 * ```sh
 * $ pulumi import harness:platform/manualFreeze:ManualFreeze example &lt;freeze_id&gt;
 * ```
 * 
 * Import an organization level freeze
 * 
 * ```sh
 * $ pulumi import harness:platform/manualFreeze:ManualFreeze example &lt;org_id&gt;/&lt;freeze_id&gt;
 * ```
 * 
 * Import project level freeze
 * 
 * ```sh
 * $ pulumi import harness:platform/manualFreeze:ManualFreeze example &lt;org_id&gt;/&lt;project_id&gt;/&lt;freeze_id&gt;
 * ```
 * 
 */
@ResourceType(type="harness:platform/manualFreeze:ManualFreeze")
public class ManualFreeze extends com.pulumi.resources.CustomResource {
    /**
     * Account Identifier of the freeze
     * 
     */
    @Export(name="accountId", refs={String.class}, tree="[0]")
    private Output<String> accountId;

    /**
     * @return Account Identifier of the freeze
     * 
     */
    public Output<String> accountId() {
        return this.accountId;
    }
    /**
     * Current or upcoming windows
     * 
     */
    @Export(name="currentOrUpcomingWindows", refs={List.class,ManualFreezeCurrentOrUpcomingWindow.class}, tree="[0,1]")
    private Output<List<ManualFreezeCurrentOrUpcomingWindow>> currentOrUpcomingWindows;

    /**
     * @return Current or upcoming windows
     * 
     */
    public Output<List<ManualFreezeCurrentOrUpcomingWindow>> currentOrUpcomingWindows() {
        return this.currentOrUpcomingWindows;
    }
    /**
     * Description of the freeze
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output<String> description;

    /**
     * @return Description of the freeze
     * 
     */
    public Output<String> description() {
        return this.description;
    }
    /**
     * Freeze windows in the freeze response
     * 
     */
    @Export(name="freezeWindows", refs={List.class,ManualFreezeFreezeWindow.class}, tree="[0,1]")
    private Output<List<ManualFreezeFreezeWindow>> freezeWindows;

    /**
     * @return Freeze windows in the freeze response
     * 
     */
    public Output<List<ManualFreezeFreezeWindow>> freezeWindows() {
        return this.freezeWindows;
    }
    /**
     * Identifier of the freeze
     * 
     */
    @Export(name="identifier", refs={String.class}, tree="[0]")
    private Output<String> identifier;

    /**
     * @return Identifier of the freeze
     * 
     */
    public Output<String> identifier() {
        return this.identifier;
    }
    /**
     * Name of the freeze
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Name of the freeze
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Organization identifier of the freeze
     * 
     */
    @Export(name="orgId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> orgId;

    /**
     * @return Organization identifier of the freeze
     * 
     */
    public Output<Optional<String>> orgId() {
        return Codegen.optional(this.orgId);
    }
    /**
     * Project identifier of the freeze
     * 
     */
    @Export(name="projectId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> projectId;

    /**
     * @return Project identifier of the freeze
     * 
     */
    public Output<Optional<String>> projectId() {
        return Codegen.optional(this.projectId);
    }
    /**
     * Scope of the freeze
     * 
     */
    @Export(name="scope", refs={String.class}, tree="[0]")
    private Output<String> scope;

    /**
     * @return Scope of the freeze
     * 
     */
    public Output<String> scope() {
        return this.scope;
    }
    /**
     * Status of the freeze
     * 
     */
    @Export(name="status", refs={String.class}, tree="[0]")
    private Output<String> status;

    /**
     * @return Status of the freeze
     * 
     */
    public Output<String> status() {
        return this.status;
    }
    /**
     * Tags associated with the freeze
     * 
     */
    @Export(name="tags", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> tags;

    /**
     * @return Tags associated with the freeze
     * 
     */
    public Output<List<String>> tags() {
        return this.tags;
    }
    /**
     * Type of freeze
     * 
     */
    @Export(name="type", refs={String.class}, tree="[0]")
    private Output<String> type;

    /**
     * @return Type of freeze
     * 
     */
    public Output<String> type() {
        return this.type;
    }
    /**
     * Yaml of the freeze
     * 
     */
    @Export(name="yaml", refs={String.class}, tree="[0]")
    private Output<String> yaml;

    /**
     * @return Yaml of the freeze
     * 
     */
    public Output<String> yaml() {
        return this.yaml;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ManualFreeze(java.lang.String name) {
        this(name, ManualFreezeArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ManualFreeze(java.lang.String name, ManualFreezeArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ManualFreeze(java.lang.String name, ManualFreezeArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("harness:platform/manualFreeze:ManualFreeze", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private ManualFreeze(java.lang.String name, Output<java.lang.String> id, @Nullable ManualFreezeState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("harness:platform/manualFreeze:ManualFreeze", name, state, makeResourceOptions(options, id), false);
    }

    private static ManualFreezeArgs makeArgs(ManualFreezeArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? ManualFreezeArgs.Empty : args;
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
    public static ManualFreeze get(java.lang.String name, Output<java.lang.String> id, @Nullable ManualFreezeState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ManualFreeze(name, id, state, options);
    }
}
