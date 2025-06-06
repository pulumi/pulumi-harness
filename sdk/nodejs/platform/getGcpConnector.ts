// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * Datasource for looking up a Gcp connector.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as harness from "@pulumi/harness";
 *
 * const example = harness.platform.getGcpConnector({
 *     identifier: "identifier",
 * });
 * ```
 */
export function getGcpConnector(args: GetGcpConnectorArgs, opts?: pulumi.InvokeOptions): Promise<GetGcpConnectorResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("harness:platform/getGcpConnector:getGcpConnector", {
        "identifier": args.identifier,
        "name": args.name,
        "orgId": args.orgId,
        "projectId": args.projectId,
    }, opts);
}

/**
 * A collection of arguments for invoking getGcpConnector.
 */
export interface GetGcpConnectorArgs {
    /**
     * Unique identifier of the resource.
     */
    identifier: string;
    /**
     * Name of the resource.
     */
    name?: string;
    /**
     * Unique identifier of the organization.
     */
    orgId?: string;
    /**
     * Unique identifier of the project.
     */
    projectId?: string;
}

/**
 * A collection of values returned by getGcpConnector.
 */
export interface GetGcpConnectorResult {
    /**
     * Description of the resource.
     */
    readonly description: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * Unique identifier of the resource.
     */
    readonly identifier: string;
    /**
     * Inherit configuration from delegate.
     */
    readonly inheritFromDelegates: outputs.platform.GetGcpConnectorInheritFromDelegate[];
    /**
     * Manual credential configuration.
     */
    readonly manuals: outputs.platform.GetGcpConnectorManual[];
    /**
     * Name of the resource.
     */
    readonly name?: string;
    /**
     * Authentication using harness oidc.
     */
    readonly oidcAuthentications: outputs.platform.GetGcpConnectorOidcAuthentication[];
    /**
     * Unique identifier of the organization.
     */
    readonly orgId?: string;
    /**
     * Unique identifier of the project.
     */
    readonly projectId?: string;
    /**
     * Tags to associate with the resource.
     */
    readonly tags: string[];
}
/**
 * Datasource for looking up a Gcp connector.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as harness from "@pulumi/harness";
 *
 * const example = harness.platform.getGcpConnector({
 *     identifier: "identifier",
 * });
 * ```
 */
export function getGcpConnectorOutput(args: GetGcpConnectorOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetGcpConnectorResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("harness:platform/getGcpConnector:getGcpConnector", {
        "identifier": args.identifier,
        "name": args.name,
        "orgId": args.orgId,
        "projectId": args.projectId,
    }, opts);
}

/**
 * A collection of arguments for invoking getGcpConnector.
 */
export interface GetGcpConnectorOutputArgs {
    /**
     * Unique identifier of the resource.
     */
    identifier: pulumi.Input<string>;
    /**
     * Name of the resource.
     */
    name?: pulumi.Input<string>;
    /**
     * Unique identifier of the organization.
     */
    orgId?: pulumi.Input<string>;
    /**
     * Unique identifier of the project.
     */
    projectId?: pulumi.Input<string>;
}
