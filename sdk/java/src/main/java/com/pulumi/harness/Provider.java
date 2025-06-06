// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.harness.ProviderArgs;
import com.pulumi.harness.Utilities;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * The provider type for the harness package. By default, resources use package-wide configuration
 * settings, however an explicit `Provider` instance may be created and passed during resource
 * construction to achieve fine-grained programmatic control over provider settings. See the
 * [documentation](https://www.pulumi.com/docs/reference/programming-model/#providers) for more information.
 * 
 */
@ResourceType(type="pulumi:providers:harness")
public class Provider extends com.pulumi.resources.ProviderResource {
    /**
     * The Harness account id. This can also be set using the `HARNESS_ACCOUNT_ID` environment variable.
     * 
     */
    @Export(name="accountId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> accountId;

    /**
     * @return The Harness account id. This can also be set using the `HARNESS_ACCOUNT_ID` environment variable.
     * 
     */
    public Output<Optional<String>> accountId() {
        return Codegen.optional(this.accountId);
    }
    /**
     * The Harness API key. This can also be set using the `HARNESS_API_KEY` environment variable. For more information to
     * create an API key in FirstGen, see https://docs.harness.io/article/smloyragsm-api-keys#create_an_api_key.
     * 
     */
    @Export(name="apiKey", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> apiKey;

    /**
     * @return The Harness API key. This can also be set using the `HARNESS_API_KEY` environment variable. For more information to
     * create an API key in FirstGen, see https://docs.harness.io/article/smloyragsm-api-keys#create_an_api_key.
     * 
     */
    public Output<Optional<String>> apiKey() {
        return Codegen.optional(this.apiKey);
    }
    /**
     * The URL of the Harness API endpoint. The default is `https://app.harness.io/gateway`. This can also be set using the
     * `HARNESS_ENDPOINT` environment variable.
     * 
     */
    @Export(name="endpoint", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> endpoint;

    /**
     * @return The URL of the Harness API endpoint. The default is `https://app.harness.io/gateway`. This can also be set using the
     * `HARNESS_ENDPOINT` environment variable.
     * 
     */
    public Output<Optional<String>> endpoint() {
        return Codegen.optional(this.endpoint);
    }
    /**
     * The API key for the Harness next gen platform. This can also be set using the `HARNESS_PLATFORM_API_KEY` environment
     * variable. For more information to create an API key in NextGen, see
     * https://docs.harness.io/article/tdoad7xrh9-add-and-manage-api-keys.
     * 
     */
    @Export(name="platformApiKey", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> platformApiKey;

    /**
     * @return The API key for the Harness next gen platform. This can also be set using the `HARNESS_PLATFORM_API_KEY` environment
     * variable. For more information to create an API key in NextGen, see
     * https://docs.harness.io/article/tdoad7xrh9-add-and-manage-api-keys.
     * 
     */
    public Output<Optional<String>> platformApiKey() {
        return Codegen.optional(this.platformApiKey);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Provider(java.lang.String name) {
        this(name, ProviderArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Provider(java.lang.String name, @Nullable ProviderArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Provider(java.lang.String name, @Nullable ProviderArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("harness", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private static ProviderArgs makeArgs(@Nullable ProviderArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? ProviderArgs.Empty : args;
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<java.lang.String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .pluginDownloadURL("github://api.github.com/pulumi")
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

}
