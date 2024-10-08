// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

export function getCurrentAccount(args?: GetCurrentAccountArgs, opts?: pulumi.InvokeOptions): Promise<GetCurrentAccountResult> {
    args = args || {};
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("harness:platform/getCurrentAccount:getCurrentAccount", {
        "id": args.id,
    }, opts);
}

/**
 * A collection of arguments for invoking getCurrentAccount.
 */
export interface GetCurrentAccountArgs {
    id?: string;
}

/**
 * A collection of values returned by getCurrentAccount.
 */
export interface GetCurrentAccountResult {
    readonly accountId: string;
    readonly endpoint: string;
    readonly id?: string;
}
export function getCurrentAccountOutput(args?: GetCurrentAccountOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetCurrentAccountResult> {
    args = args || {};
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("harness:platform/getCurrentAccount:getCurrentAccount", {
        "id": args.id,
    }, opts);
}

/**
 * A collection of arguments for invoking getCurrentAccount.
 */
export interface GetCurrentAccountOutputArgs {
    id?: pulumi.Input<string>;
}
