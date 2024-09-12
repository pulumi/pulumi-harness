// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.harness.Utilities;
import com.pulumi.harness.platform.SecretTextArgs;
import com.pulumi.harness.platform.inputs.SecretTextState;
import com.pulumi.harness.platform.outputs.SecretTextAdditionalMetadata;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Resource for creating secret of type secret text
 * 
 * ## Import
 * 
 * Import account level secret text
 * 
 * ```sh
 * $ pulumi import harness:platform/secretText:SecretText example &lt;secret_text_id&gt;
 * ```
 * 
 * Import org level secret text
 * 
 * ```sh
 * $ pulumi import harness:platform/secretText:SecretText example &lt;ord_id&gt;/&lt;secret_text_id&gt;
 * ```
 * 
 * Import project level secret text
 * 
 * ```sh
 * $ pulumi import harness:platform/secretText:SecretText example &lt;org_id&gt;/&lt;project_id&gt;/&lt;secret_text_id&gt;
 * ```
 * 
 */
@ResourceType(type="harness:platform/secretText:SecretText")
public class SecretText extends com.pulumi.resources.CustomResource {
    /**
     * Additional Metadata for the Secret
     * 
     */
    @Export(name="additionalMetadatas", refs={List.class,SecretTextAdditionalMetadata.class}, tree="[0,1]")
    private Output</* @Nullable */ List<SecretTextAdditionalMetadata>> additionalMetadatas;

    /**
     * @return Additional Metadata for the Secret
     * 
     */
    public Output<Optional<List<SecretTextAdditionalMetadata>>> additionalMetadatas() {
        return Codegen.optional(this.additionalMetadatas);
    }
    /**
     * Description of the resource.
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    /**
     * @return Description of the resource.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * Unique identifier of the resource.
     * 
     */
    @Export(name="identifier", refs={String.class}, tree="[0]")
    private Output<String> identifier;

    /**
     * @return Unique identifier of the resource.
     * 
     */
    public Output<String> identifier() {
        return this.identifier;
    }
    /**
     * Name of the resource.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Name of the resource.
     * 
     */
    public Output<String> name() {
        return this.name;
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
     * Identifier of the Secret Manager used to manage the secret.
     * 
     */
    @Export(name="secretManagerIdentifier", refs={String.class}, tree="[0]")
    private Output<String> secretManagerIdentifier;

    /**
     * @return Identifier of the Secret Manager used to manage the secret.
     * 
     */
    public Output<String> secretManagerIdentifier() {
        return this.secretManagerIdentifier;
    }
    /**
     * Tags to associate with the resource.
     * 
     */
    @Export(name="tags", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> tags;

    /**
     * @return Tags to associate with the resource.
     * 
     */
    public Output<Optional<List<String>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * Value of the Secret
     * 
     */
    @Export(name="value", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> value;

    /**
     * @return Value of the Secret
     * 
     */
    public Output<Optional<String>> value() {
        return Codegen.optional(this.value);
    }
    /**
     * This has details to specify if the secret value is Inline or Reference.
     * 
     */
    @Export(name="valueType", refs={String.class}, tree="[0]")
    private Output<String> valueType;

    /**
     * @return This has details to specify if the secret value is Inline or Reference.
     * 
     */
    public Output<String> valueType() {
        return this.valueType;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public SecretText(java.lang.String name) {
        this(name, SecretTextArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public SecretText(java.lang.String name, SecretTextArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public SecretText(java.lang.String name, SecretTextArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("harness:platform/secretText:SecretText", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private SecretText(java.lang.String name, Output<java.lang.String> id, @Nullable SecretTextState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("harness:platform/secretText:SecretText", name, state, makeResourceOptions(options, id), false);
    }

    private static SecretTextArgs makeArgs(SecretTextArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? SecretTextArgs.Empty : args;
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<java.lang.String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .additionalSecretOutputs(List.of(
                "value"
            ))
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
    public static SecretText get(java.lang.String name, Output<java.lang.String> id, @Nullable SecretTextState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new SecretText(name, id, state, options);
    }
}