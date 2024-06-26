// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * Data source for retrieving a GitOps RepoCred.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as harness from "@pulumi/harness";
 *
 * const test = harness.platform.getGitopsRepoCred({
 *     identifier: "identifier",
 *     accountId: "account_id",
 *     projectId: "project_id",
 *     orgId: "org_id",
 *     agentId: "agent_id",
 * });
 * ```
 */
export function getGitopsRepoCred(args: GetGitopsRepoCredArgs, opts?: pulumi.InvokeOptions): Promise<GetGitopsRepoCredResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("harness:platform/getGitopsRepoCred:getGitopsRepoCred", {
        "accountId": args.accountId,
        "agentId": args.agentId,
        "creds": args.creds,
        "identifier": args.identifier,
        "orgId": args.orgId,
        "projectId": args.projectId,
        "upsert": args.upsert,
    }, opts);
}

/**
 * A collection of arguments for invoking getGitopsRepoCred.
 */
export interface GetGitopsRepoCredArgs {
    /**
     * account identifier of the Repository Credentials.
     */
    accountId: string;
    /**
     * agent identifier of the Repository Credentials.
     */
    agentId: string;
    /**
     * credential details.
     */
    creds?: inputs.platform.GetGitopsRepoCredCred[];
    /**
     * Identifier of the Repository Credentials.
     */
    identifier: string;
    /**
     * Organization identifier of the Repository Credential.
     */
    orgId?: string;
    /**
     * Project identifier of the Repository Credential.
     */
    projectId?: string;
    /**
     * if the Repository credential should be upserted.
     */
    upsert?: boolean;
}

/**
 * A collection of values returned by getGitopsRepoCred.
 */
export interface GetGitopsRepoCredResult {
    /**
     * account identifier of the Repository Credentials.
     */
    readonly accountId: string;
    /**
     * agent identifier of the Repository Credentials.
     */
    readonly agentId: string;
    /**
     * credential details.
     */
    readonly creds: outputs.platform.GetGitopsRepoCredCred[];
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * Identifier of the Repository Credentials.
     */
    readonly identifier: string;
    /**
     * Organization identifier of the Repository Credential.
     */
    readonly orgId?: string;
    /**
     * Project identifier of the Repository Credential.
     */
    readonly projectId?: string;
    /**
     * if the Repository credential should be upserted.
     */
    readonly upsert?: boolean;
}
/**
 * Data source for retrieving a GitOps RepoCred.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as harness from "@pulumi/harness";
 *
 * const test = harness.platform.getGitopsRepoCred({
 *     identifier: "identifier",
 *     accountId: "account_id",
 *     projectId: "project_id",
 *     orgId: "org_id",
 *     agentId: "agent_id",
 * });
 * ```
 */
export function getGitopsRepoCredOutput(args: GetGitopsRepoCredOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetGitopsRepoCredResult> {
    return pulumi.output(args).apply((a: any) => getGitopsRepoCred(a, opts))
}

/**
 * A collection of arguments for invoking getGitopsRepoCred.
 */
export interface GetGitopsRepoCredOutputArgs {
    /**
     * account identifier of the Repository Credentials.
     */
    accountId: pulumi.Input<string>;
    /**
     * agent identifier of the Repository Credentials.
     */
    agentId: pulumi.Input<string>;
    /**
     * credential details.
     */
    creds?: pulumi.Input<pulumi.Input<inputs.platform.GetGitopsRepoCredCredArgs>[]>;
    /**
     * Identifier of the Repository Credentials.
     */
    identifier: pulumi.Input<string>;
    /**
     * Organization identifier of the Repository Credential.
     */
    orgId?: pulumi.Input<string>;
    /**
     * Project identifier of the Repository Credential.
     */
    projectId?: pulumi.Input<string>;
    /**
     * if the Repository credential should be upserted.
     */
    upsert?: pulumi.Input<boolean>;
}
