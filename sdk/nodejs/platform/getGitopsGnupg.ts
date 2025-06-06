// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * Data source for fetching a Harness GitOps GPG public key.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as harness from "@pulumi/harness";
 *
 * const example = harness.platform.getGitopsGnupg({
 *     accountId: "account_id",
 *     agentId: "agent_id",
 *     identifier: "identifier",
 * });
 * ```
 */
export function getGitopsGnupg(args: GetGitopsGnupgArgs, opts?: pulumi.InvokeOptions): Promise<GetGitopsGnupgResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("harness:platform/getGitopsGnupg:getGitopsGnupg", {
        "accountId": args.accountId,
        "agentId": args.agentId,
        "identifier": args.identifier,
        "orgId": args.orgId,
        "projectId": args.projectId,
        "requests": args.requests,
    }, opts);
}

/**
 * A collection of arguments for invoking getGitopsGnupg.
 */
export interface GetGitopsGnupgArgs {
    /**
     * Account Identifier for the GnuPG Key.
     *
     * @deprecated This field is deprecated and will be removed in a future release.
     */
    accountId?: string;
    /**
     * Agent identifier for the GnuPG Key.
     */
    agentId: string;
    /**
     * Identifier for the GnuPG Key.
     */
    identifier: string;
    /**
     * Organization Identifier for the GnuPG Key.
     */
    orgId?: string;
    /**
     * Project Identifier for the GnuPG Key.
     */
    projectId?: string;
    /**
     * GnuPGPublicKey is a representation of a GnuPG public key
     */
    requests?: inputs.platform.GetGitopsGnupgRequest[];
}

/**
 * A collection of values returned by getGitopsGnupg.
 */
export interface GetGitopsGnupgResult {
    /**
     * Account Identifier for the GnuPG Key.
     *
     * @deprecated This field is deprecated and will be removed in a future release.
     */
    readonly accountId: string;
    /**
     * Agent identifier for the GnuPG Key.
     */
    readonly agentId: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * Identifier for the GnuPG Key.
     */
    readonly identifier: string;
    /**
     * Organization Identifier for the GnuPG Key.
     */
    readonly orgId?: string;
    /**
     * Project Identifier for the GnuPG Key.
     */
    readonly projectId?: string;
    /**
     * GnuPGPublicKey is a representation of a GnuPG public key
     */
    readonly requests: outputs.platform.GetGitopsGnupgRequest[];
}
/**
 * Data source for fetching a Harness GitOps GPG public key.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as harness from "@pulumi/harness";
 *
 * const example = harness.platform.getGitopsGnupg({
 *     accountId: "account_id",
 *     agentId: "agent_id",
 *     identifier: "identifier",
 * });
 * ```
 */
export function getGitopsGnupgOutput(args: GetGitopsGnupgOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetGitopsGnupgResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("harness:platform/getGitopsGnupg:getGitopsGnupg", {
        "accountId": args.accountId,
        "agentId": args.agentId,
        "identifier": args.identifier,
        "orgId": args.orgId,
        "projectId": args.projectId,
        "requests": args.requests,
    }, opts);
}

/**
 * A collection of arguments for invoking getGitopsGnupg.
 */
export interface GetGitopsGnupgOutputArgs {
    /**
     * Account Identifier for the GnuPG Key.
     *
     * @deprecated This field is deprecated and will be removed in a future release.
     */
    accountId?: pulumi.Input<string>;
    /**
     * Agent identifier for the GnuPG Key.
     */
    agentId: pulumi.Input<string>;
    /**
     * Identifier for the GnuPG Key.
     */
    identifier: pulumi.Input<string>;
    /**
     * Organization Identifier for the GnuPG Key.
     */
    orgId?: pulumi.Input<string>;
    /**
     * Project Identifier for the GnuPG Key.
     */
    projectId?: pulumi.Input<string>;
    /**
     * GnuPGPublicKey is a representation of a GnuPG public key
     */
    requests?: pulumi.Input<pulumi.Input<inputs.platform.GetGitopsGnupgRequestArgs>[]>;
}
