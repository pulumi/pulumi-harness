// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.harness.Utilities;
import com.pulumi.harness.platform.TokenArgs;
import com.pulumi.harness.platform.inputs.TokenState;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * ## Example Usage
 * 
 * ## Import
 * 
 * Import account level token
 * 
 * ```sh
 * $ pulumi import harness:platform/token:Token harness_platform_token &lt;parent_id&gt;/&lt;apikey_id&gt;/&lt;apikey_type&gt;/&lt;token_id&gt;
 * ```
 * 
 * Import org level token
 * 
 * ```sh
 * $ pulumi import harness:platform/token:Token harness_platform_token &lt;org_id&gt;/&lt;parent_id&gt;/&lt;apikey_id&gt;/&lt;apikey_type&gt;/&lt;token_id&gt;
 * ```
 * 
 * Import project level token
 * 
 * ```sh
 * $ pulumi import harness:platform/token:Token harness_platform_token &lt;org_id&gt;/&lt;project_id&gt;/&lt;parent_id&gt;/&lt;apikey_id&gt;/&lt;apikey_type&gt;/&lt;token_id&gt;
 * ```
 * 
 */
@ResourceType(type="harness:platform/token:Token")
public class Token extends com.pulumi.resources.CustomResource {
    /**
     * Account Identifier for the Entity
     * 
     */
    @Export(name="accountId", refs={String.class}, tree="[0]")
    private Output<String> accountId;

    /**
     * @return Account Identifier for the Entity
     * 
     */
    public Output<String> accountId() {
        return this.accountId;
    }
    /**
     * Identifier of the API Key
     * 
     */
    @Export(name="apikeyId", refs={String.class}, tree="[0]")
    private Output<String> apikeyId;

    /**
     * @return Identifier of the API Key
     * 
     */
    public Output<String> apikeyId() {
        return this.apikeyId;
    }
    /**
     * Type of the API Key
     * 
     */
    @Export(name="apikeyType", refs={String.class}, tree="[0]")
    private Output<String> apikeyType;

    /**
     * @return Type of the API Key
     * 
     */
    public Output<String> apikeyType() {
        return this.apikeyType;
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
     * Email Id of the user who created the Token
     * 
     */
    @Export(name="email", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> email;

    /**
     * @return Email Id of the user who created the Token
     * 
     */
    public Output<Optional<String>> email() {
        return Codegen.optional(this.email);
    }
    /**
     * Encoded password of the Token
     * 
     */
    @Export(name="encodedPassword", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> encodedPassword;

    /**
     * @return Encoded password of the Token
     * 
     */
    public Output<Optional<String>> encodedPassword() {
        return Codegen.optional(this.encodedPassword);
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
     * Parent Entity Identifier of the API Key
     * 
     */
    @Export(name="parentId", refs={String.class}, tree="[0]")
    private Output<String> parentId;

    /**
     * @return Parent Entity Identifier of the API Key
     * 
     */
    public Output<String> parentId() {
        return this.parentId;
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
     * Scheduled expiry time in milliseconds
     * 
     */
    @Export(name="scheduledExpireTime", refs={Integer.class}, tree="[0]")
    private Output<Integer> scheduledExpireTime;

    /**
     * @return Scheduled expiry time in milliseconds
     * 
     */
    public Output<Integer> scheduledExpireTime() {
        return this.scheduledExpireTime;
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
     * Name of the user who created the Token
     * 
     */
    @Export(name="username", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> username;

    /**
     * @return Name of the user who created the Token
     * 
     */
    public Output<Optional<String>> username() {
        return Codegen.optional(this.username);
    }
    /**
     * Boolean value to indicate if Token is valid or not.
     * 
     */
    @Export(name="valid", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> valid;

    /**
     * @return Boolean value to indicate if Token is valid or not.
     * 
     */
    public Output<Boolean> valid() {
        return this.valid;
    }
    /**
     * This is the time from which the Token is valid. The time is in milliseconds
     * 
     */
    @Export(name="validFrom", refs={Integer.class}, tree="[0]")
    private Output<Integer> validFrom;

    /**
     * @return This is the time from which the Token is valid. The time is in milliseconds
     * 
     */
    public Output<Integer> validFrom() {
        return this.validFrom;
    }
    /**
     * This is the time till which the Token is valid. The time is in milliseconds
     * 
     */
    @Export(name="validTo", refs={Integer.class}, tree="[0]")
    private Output<Integer> validTo;

    /**
     * @return This is the time till which the Token is valid. The time is in milliseconds
     * 
     */
    public Output<Integer> validTo() {
        return this.validTo;
    }
    /**
     * Value of the Token
     * 
     */
    @Export(name="value", refs={String.class}, tree="[0]")
    private Output<String> value;

    /**
     * @return Value of the Token
     * 
     */
    public Output<String> value() {
        return this.value;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Token(java.lang.String name) {
        this(name, TokenArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Token(java.lang.String name, TokenArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Token(java.lang.String name, TokenArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("harness:platform/token:Token", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private Token(java.lang.String name, Output<java.lang.String> id, @Nullable TokenState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("harness:platform/token:Token", name, state, makeResourceOptions(options, id), false);
    }

    private static TokenArgs makeArgs(TokenArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? TokenArgs.Empty : args;
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<java.lang.String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .pluginDownloadURL("github://api.github.com/pulumi")
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
    public static Token get(java.lang.String name, Output<java.lang.String> id, @Nullable TokenState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Token(name, id, state, options);
    }
}
