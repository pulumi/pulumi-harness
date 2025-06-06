// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * Data source for retrieving an SSH credential.
 */
export function getSshCredential(args?: GetSshCredentialArgs, opts?: pulumi.InvokeOptions): Promise<GetSshCredentialResult> {
    args = args || {};
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("harness:index/getSshCredential:getSshCredential", {
        "id": args.id,
        "name": args.name,
        "usageScopes": args.usageScopes,
    }, opts);
}

/**
 * A collection of arguments for invoking getSshCredential.
 */
export interface GetSshCredentialArgs {
    /**
     * Unique identifier of the secret manager
     */
    id?: string;
    /**
     * The name of the secret manager
     */
    name?: string;
    /**
     * This block is used for scoping the resource to a specific set of applications or environments.
     */
    usageScopes?: inputs.GetSshCredentialUsageScope[];
}

/**
 * A collection of values returned by getSshCredential.
 */
export interface GetSshCredentialResult {
    /**
     * Unique identifier of the secret manager
     */
    readonly id?: string;
    /**
     * The name of the secret manager
     */
    readonly name?: string;
    /**
     * This block is used for scoping the resource to a specific set of applications or environments.
     */
    readonly usageScopes?: outputs.GetSshCredentialUsageScope[];
}
/**
 * Data source for retrieving an SSH credential.
 */
export function getSshCredentialOutput(args?: GetSshCredentialOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetSshCredentialResult> {
    args = args || {};
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("harness:index/getSshCredential:getSshCredential", {
        "id": args.id,
        "name": args.name,
        "usageScopes": args.usageScopes,
    }, opts);
}

/**
 * A collection of arguments for invoking getSshCredential.
 */
export interface GetSshCredentialOutputArgs {
    /**
     * Unique identifier of the secret manager
     */
    id?: pulumi.Input<string>;
    /**
     * The name of the secret manager
     */
    name?: pulumi.Input<string>;
    /**
     * This block is used for scoping the resource to a specific set of applications or environments.
     */
    usageScopes?: pulumi.Input<pulumi.Input<inputs.GetSshCredentialUsageScopeArgs>[]>;
}
