// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Data source for retrieving a Harness ApiKey Token.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as harness from "@pulumi/harness";
 *
 * const test = harness.platform.getToken({
 *     identifier: "test_token",
 *     parentId: "apikey_parent_id",
 *     orgId: "org_id",
 *     projectId: "project_id",
 *     apikeyId: "apikey_id",
 *     apikeyType: "USER",
 * });
 * ```
 */
export function getToken(args: GetTokenArgs, opts?: pulumi.InvokeOptions): Promise<GetTokenResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("harness:platform/getToken:getToken", {
        "accountId": args.accountId,
        "apikeyId": args.apikeyId,
        "apikeyType": args.apikeyType,
        "description": args.description,
        "email": args.email,
        "encodedPassword": args.encodedPassword,
        "identifier": args.identifier,
        "name": args.name,
        "orgId": args.orgId,
        "parentId": args.parentId,
        "projectId": args.projectId,
        "scheduledExpireTime": args.scheduledExpireTime,
        "tags": args.tags,
        "username": args.username,
        "valid": args.valid,
        "validFrom": args.validFrom,
        "validTo": args.validTo,
    }, opts);
}

/**
 * A collection of arguments for invoking getToken.
 */
export interface GetTokenArgs {
    /**
     * Account Identifier for the Entity
     */
    accountId: string;
    /**
     * Identifier of the API Key
     */
    apikeyId: string;
    /**
     * Type of the API Key
     */
    apikeyType: string;
    /**
     * Description of the Token
     */
    description?: string;
    /**
     * Email Id of the user who created the Token
     */
    email?: string;
    /**
     * Encoded password of the Token
     */
    encodedPassword?: string;
    /**
     * Identifier of the Token
     */
    identifier: string;
    /**
     * Name of the Token
     */
    name: string;
    /**
     * Organization Identifier for the Entity
     */
    orgId?: string;
    /**
     * Parent Entity Identifier of the API Key
     */
    parentId: string;
    /**
     * Project Identifier for the Entity
     */
    projectId?: string;
    /**
     * Scheduled expiry time in milliseconds
     */
    scheduledExpireTime?: number;
    /**
     * Tags for the Token
     */
    tags?: {[key: string]: string};
    /**
     * Name of the user who created the Token
     */
    username?: string;
    /**
     * Boolean value to indicate if Token is valid or not.
     */
    valid?: boolean;
    /**
     * This is the time from which the Token is valid. The time is in milliseconds
     */
    validFrom?: number;
    /**
     * This is the time till which the Token is valid. The time is in milliseconds
     */
    validTo?: number;
}

/**
 * A collection of values returned by getToken.
 */
export interface GetTokenResult {
    /**
     * Account Identifier for the Entity
     */
    readonly accountId: string;
    /**
     * Identifier of the API Key
     */
    readonly apikeyId: string;
    /**
     * Type of the API Key
     */
    readonly apikeyType: string;
    /**
     * Description of the Token
     */
    readonly description?: string;
    /**
     * Email Id of the user who created the Token
     */
    readonly email?: string;
    /**
     * Encoded password of the Token
     */
    readonly encodedPassword?: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * Identifier of the Token
     */
    readonly identifier: string;
    /**
     * Name of the Token
     */
    readonly name: string;
    /**
     * Organization Identifier for the Entity
     */
    readonly orgId?: string;
    /**
     * Parent Entity Identifier of the API Key
     */
    readonly parentId: string;
    /**
     * Project Identifier for the Entity
     */
    readonly projectId?: string;
    /**
     * Scheduled expiry time in milliseconds
     */
    readonly scheduledExpireTime?: number;
    /**
     * Tags for the Token
     */
    readonly tags?: {[key: string]: string};
    /**
     * Name of the user who created the Token
     */
    readonly username?: string;
    /**
     * Boolean value to indicate if Token is valid or not.
     */
    readonly valid?: boolean;
    /**
     * This is the time from which the Token is valid. The time is in milliseconds
     */
    readonly validFrom?: number;
    /**
     * This is the time till which the Token is valid. The time is in milliseconds
     */
    readonly validTo?: number;
}
/**
 * Data source for retrieving a Harness ApiKey Token.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as harness from "@pulumi/harness";
 *
 * const test = harness.platform.getToken({
 *     identifier: "test_token",
 *     parentId: "apikey_parent_id",
 *     orgId: "org_id",
 *     projectId: "project_id",
 *     apikeyId: "apikey_id",
 *     apikeyType: "USER",
 * });
 * ```
 */
export function getTokenOutput(args: GetTokenOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetTokenResult> {
    return pulumi.output(args).apply((a: any) => getToken(a, opts))
}

/**
 * A collection of arguments for invoking getToken.
 */
export interface GetTokenOutputArgs {
    /**
     * Account Identifier for the Entity
     */
    accountId: pulumi.Input<string>;
    /**
     * Identifier of the API Key
     */
    apikeyId: pulumi.Input<string>;
    /**
     * Type of the API Key
     */
    apikeyType: pulumi.Input<string>;
    /**
     * Description of the Token
     */
    description?: pulumi.Input<string>;
    /**
     * Email Id of the user who created the Token
     */
    email?: pulumi.Input<string>;
    /**
     * Encoded password of the Token
     */
    encodedPassword?: pulumi.Input<string>;
    /**
     * Identifier of the Token
     */
    identifier: pulumi.Input<string>;
    /**
     * Name of the Token
     */
    name: pulumi.Input<string>;
    /**
     * Organization Identifier for the Entity
     */
    orgId?: pulumi.Input<string>;
    /**
     * Parent Entity Identifier of the API Key
     */
    parentId: pulumi.Input<string>;
    /**
     * Project Identifier for the Entity
     */
    projectId?: pulumi.Input<string>;
    /**
     * Scheduled expiry time in milliseconds
     */
    scheduledExpireTime?: pulumi.Input<number>;
    /**
     * Tags for the Token
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * Name of the user who created the Token
     */
    username?: pulumi.Input<string>;
    /**
     * Boolean value to indicate if Token is valid or not.
     */
    valid?: pulumi.Input<boolean>;
    /**
     * This is the time from which the Token is valid. The time is in milliseconds
     */
    validFrom?: pulumi.Input<number>;
    /**
     * This is the time till which the Token is valid. The time is in milliseconds
     */
    validTo?: pulumi.Input<number>;
}
