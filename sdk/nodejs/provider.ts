// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * The provider type for the harness package. By default, resources use package-wide configuration
 * settings, however an explicit `Provider` instance may be created and passed during resource
 * construction to achieve fine-grained programmatic control over provider settings. See the
 * [documentation](https://www.pulumi.com/docs/reference/programming-model/#providers) for more information.
 */
export class Provider extends pulumi.ProviderResource {
    /** @internal */
    public static readonly __pulumiType = 'harness';

    /**
     * Returns true if the given object is an instance of Provider.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Provider {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === "pulumi:providers:" + Provider.__pulumiType;
    }

    /**
     * The Harness account id. This can also be set using the `HARNESS_ACCOUNT_ID` environment variable.
     */
    public readonly accountId!: pulumi.Output<string | undefined>;
    /**
     * The Harness API key. This can also be set using the `HARNESS_API_KEY` environment variable. For more information to
     * create an API key in FirstGen, see https://docs.harness.io/article/smloyragsm-api-keys#create_an_api_key.
     */
    public readonly apiKey!: pulumi.Output<string | undefined>;
    /**
     * The URL of the Harness API endpoint. The default is `https://app.harness.io/gateway`. This can also be set using the
     * `HARNESS_ENDPOINT` environment variable.
     */
    public readonly endpoint!: pulumi.Output<string | undefined>;
    /**
     * The API key for the Harness next gen platform. This can also be set using the `HARNESS_PLATFORM_API_KEY` environment
     * variable. For more information to create an API key in NextGen, see
     * https://docs.harness.io/article/tdoad7xrh9-add-and-manage-api-keys.
     */
    public readonly platformApiKey!: pulumi.Output<string | undefined>;

    /**
     * Create a Provider resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args?: ProviderArgs, opts?: pulumi.ResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        {
            resourceInputs["accountId"] = (args ? args.accountId : undefined) ?? utilities.getEnv("HARNESS_ACCOUNT_ID");
            resourceInputs["apiKey"] = (args ? args.apiKey : undefined) ?? utilities.getEnv("HARNESS_API_KEY");
            resourceInputs["endpoint"] = (args ? args.endpoint : undefined) ?? utilities.getEnv("HARNESS_ENDPOINT");
            resourceInputs["platformApiKey"] = (args ? args.platformApiKey : undefined) ?? utilities.getEnv("HARNESS_PLATFORM_API_KEY");
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(Provider.__pulumiType, name, resourceInputs, opts);
    }

    /**
     * This function returns a Terraform config object with terraform-namecased keys,to be used with the Terraform Module Provider.
     */
    terraformConfig(): pulumi.Output<Provider.TerraformConfigResult> {
        return pulumi.runtime.call("pulumi:providers:harness/terraformConfig", {
            "__self__": this,
        }, this);
    }
}

/**
 * The set of arguments for constructing a Provider resource.
 */
export interface ProviderArgs {
    /**
     * The Harness account id. This can also be set using the `HARNESS_ACCOUNT_ID` environment variable.
     */
    accountId?: pulumi.Input<string>;
    /**
     * The Harness API key. This can also be set using the `HARNESS_API_KEY` environment variable. For more information to
     * create an API key in FirstGen, see https://docs.harness.io/article/smloyragsm-api-keys#create_an_api_key.
     */
    apiKey?: pulumi.Input<string>;
    /**
     * The URL of the Harness API endpoint. The default is `https://app.harness.io/gateway`. This can also be set using the
     * `HARNESS_ENDPOINT` environment variable.
     */
    endpoint?: pulumi.Input<string>;
    /**
     * The API key for the Harness next gen platform. This can also be set using the `HARNESS_PLATFORM_API_KEY` environment
     * variable. For more information to create an API key in NextGen, see
     * https://docs.harness.io/article/tdoad7xrh9-add-and-manage-api-keys.
     */
    platformApiKey?: pulumi.Input<string>;
}

export namespace Provider {
    /**
     * The results of the Provider.terraformConfig method.
     */
    export interface TerraformConfigResult {
        readonly result: {[key: string]: any};
    }

}
