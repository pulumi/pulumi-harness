// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Data source for retrieving an SSO providers
 */
export function getSsoProvider(args?: GetSsoProviderArgs, opts?: pulumi.InvokeOptions): Promise<GetSsoProviderResult> {
    args = args || {};
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("harness:index/getSsoProvider:getSsoProvider", {
        "id": args.id,
        "name": args.name,
    }, opts);
}

/**
 * A collection of arguments for invoking getSsoProvider.
 */
export interface GetSsoProviderArgs {
    /**
     * Unique identifier of the SSO provider.
     */
    id?: string;
    /**
     * The name of the SSO provider.
     */
    name?: string;
}

/**
 * A collection of values returned by getSsoProvider.
 */
export interface GetSsoProviderResult {
    /**
     * Unique identifier of the SSO provider.
     */
    readonly id?: string;
    /**
     * The name of the SSO provider.
     */
    readonly name?: string;
    /**
     * The type of SSO provider.
     */
    readonly type: string;
}
/**
 * Data source for retrieving an SSO providers
 */
export function getSsoProviderOutput(args?: GetSsoProviderOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetSsoProviderResult> {
    args = args || {};
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("harness:index/getSsoProvider:getSsoProvider", {
        "id": args.id,
        "name": args.name,
    }, opts);
}

/**
 * A collection of arguments for invoking getSsoProvider.
 */
export interface GetSsoProviderOutputArgs {
    /**
     * Unique identifier of the SSO provider.
     */
    id?: pulumi.Input<string>;
    /**
     * The name of the SSO provider.
     */
    name?: pulumi.Input<string>;
}
