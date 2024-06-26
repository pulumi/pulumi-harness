// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.cloudprovider;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.harness.Utilities;
import com.pulumi.harness.cloudprovider.TanzuArgs;
import com.pulumi.harness.cloudprovider.inputs.TanzuState;
import java.lang.Boolean;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Resource for creating a Tanzu cloud provider. This resource uses the config-as-code API&#39;s. When updating the `name` or `path` of this resource you should typically also set the `create_before_destroy = true` lifecycle setting.
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
 * import com.pulumi.harness.HarnessFunctions;
 * import com.pulumi.harness.inputs.GetSecretManagerArgs;
 * import com.pulumi.harness.EncryptedText;
 * import com.pulumi.harness.EncryptedTextArgs;
 * import com.pulumi.harness.cloudprovider.Tanzu;
 * import com.pulumi.harness.cloudprovider.TanzuArgs;
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
 *         final var default = HarnessFunctions.getSecretManager(GetSecretManagerArgs.builder()
 *             .default_(true)
 *             .build());
 * 
 *         var tanzuPassword = new EncryptedText("tanzuPassword", EncryptedTextArgs.builder()
 *             .name("tanzu_password")
 *             .value("<PASSWORD>")
 *             .secretManagerId(default_.id())
 *             .build());
 * 
 *         var example = new Tanzu("example", TanzuArgs.builder()
 *             .name("example")
 *             .endpoint("https://endpoint.com")
 *             .skipValidation(true)
 *             .username("<USERNAME>")
 *             .passwordSecretName(tanzuPassword.name())
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
 * Import using the Harness Tanzu cloud provider id.
 * 
 * ```sh
 * $ pulumi import harness:cloudprovider/tanzu:Tanzu example &lt;provider_id&gt;
 * ```
 * 
 */
@ResourceType(type="harness:cloudprovider/tanzu:Tanzu")
public class Tanzu extends com.pulumi.resources.CustomResource {
    /**
     * The url of the Tanzu platform.
     * 
     */
    @Export(name="endpoint", refs={String.class}, tree="[0]")
    private Output<String> endpoint;

    /**
     * @return The url of the Tanzu platform.
     * 
     */
    public Output<String> endpoint() {
        return this.endpoint;
    }
    /**
     * The name of the cloud provider.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The name of the cloud provider.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The name of the Harness secret containing the password to use to authenticate to Tanzu.
     * 
     */
    @Export(name="passwordSecretName", refs={String.class}, tree="[0]")
    private Output<String> passwordSecretName;

    /**
     * @return The name of the Harness secret containing the password to use to authenticate to Tanzu.
     * 
     */
    public Output<String> passwordSecretName() {
        return this.passwordSecretName;
    }
    /**
     * Skip validation of Tanzu configuration.
     * 
     */
    @Export(name="skipValidation", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> skipValidation;

    /**
     * @return Skip validation of Tanzu configuration.
     * 
     */
    public Output<Optional<Boolean>> skipValidation() {
        return Codegen.optional(this.skipValidation);
    }
    /**
     * The username to use to authenticate to Tanzu.
     * 
     */
    @Export(name="username", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> username;

    /**
     * @return The username to use to authenticate to Tanzu.
     * 
     */
    public Output<Optional<String>> username() {
        return Codegen.optional(this.username);
    }
    /**
     * The name of the Harness secret containing the username to authenticate to Tanzu with.
     * 
     */
    @Export(name="usernameSecretName", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> usernameSecretName;

    /**
     * @return The name of the Harness secret containing the username to authenticate to Tanzu with.
     * 
     */
    public Output<Optional<String>> usernameSecretName() {
        return Codegen.optional(this.usernameSecretName);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Tanzu(String name) {
        this(name, TanzuArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Tanzu(String name, TanzuArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Tanzu(String name, TanzuArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("harness:cloudprovider/tanzu:Tanzu", name, args == null ? TanzuArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Tanzu(String name, Output<String> id, @Nullable TanzuState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("harness:cloudprovider/tanzu:Tanzu", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
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
    public static Tanzu get(String name, Output<String> id, @Nullable TanzuState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Tanzu(name, id, state, options);
    }
}