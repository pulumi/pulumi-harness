// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

export function getOverrides(args: GetOverridesArgs, opts?: pulumi.InvokeOptions): Promise<GetOverridesResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("harness:platform/getOverrides:getOverrides", {
        "gitDetails": args.gitDetails,
        "identifier": args.identifier,
        "orgId": args.orgId,
        "projectId": args.projectId,
    }, opts);
}

/**
 * A collection of arguments for invoking getOverrides.
 */
export interface GetOverridesArgs {
    gitDetails?: inputs.platform.GetOverridesGitDetails;
    identifier: string;
    orgId?: string;
    projectId?: string;
}

/**
 * A collection of values returned by getOverrides.
 */
export interface GetOverridesResult {
    readonly clusterId: string;
    readonly envId: string;
    readonly gitDetails: outputs.platform.GetOverridesGitDetails;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly identifier: string;
    readonly infraId: string;
    readonly orgId?: string;
    readonly projectId?: string;
    readonly serviceId: string;
    readonly type: string;
    readonly yaml: string;
}
export function getOverridesOutput(args: GetOverridesOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetOverridesResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("harness:platform/getOverrides:getOverrides", {
        "gitDetails": args.gitDetails,
        "identifier": args.identifier,
        "orgId": args.orgId,
        "projectId": args.projectId,
    }, opts);
}

/**
 * A collection of arguments for invoking getOverrides.
 */
export interface GetOverridesOutputArgs {
    gitDetails?: pulumi.Input<inputs.platform.GetOverridesGitDetailsArgs>;
    identifier: pulumi.Input<string>;
    orgId?: pulumi.Input<string>;
    projectId?: pulumi.Input<string>;
}
