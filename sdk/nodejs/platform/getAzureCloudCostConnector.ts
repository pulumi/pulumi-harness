// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * Datasource for looking up an Azure Cloud Cost Connector.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as harness from "@pulumi/harness";
 *
 * const example = harness.platform.getAzureCloudCostConnector({
 *     identifier: "identifier",
 * });
 * ```
 */
export function getAzureCloudCostConnector(args: GetAzureCloudCostConnectorArgs, opts?: pulumi.InvokeOptions): Promise<GetAzureCloudCostConnectorResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("harness:platform/getAzureCloudCostConnector:getAzureCloudCostConnector", {
        "identifier": args.identifier,
        "name": args.name,
        "orgId": args.orgId,
        "projectId": args.projectId,
    }, opts);
}

/**
 * A collection of arguments for invoking getAzureCloudCostConnector.
 */
export interface GetAzureCloudCostConnectorArgs {
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
 * A collection of values returned by getAzureCloudCostConnector.
 */
export interface GetAzureCloudCostConnectorResult {
    /**
     * Returns billing details for the Azure account.
     */
    readonly billingExportSpecs: outputs.platform.GetAzureCloudCostConnectorBillingExportSpec[];
    /**
     * Description of the resource.
     */
    readonly description: string;
    /**
     * Indicates which feature to enable among Billing, Optimization, and Visibility.
     */
    readonly featuresEnableds: string[];
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * Unique identifier of the resource.
     */
    readonly identifier: string;
    /**
     * Name of the resource.
     */
    readonly name?: string;
    /**
     * Unique identifier of the organization.
     */
    readonly orgId?: string;
    /**
     * Unique identifier of the project.
     */
    readonly projectId?: string;
    /**
     * Subsription id.
     */
    readonly subscriptionId: string;
    /**
     * Tags to associate with the resource.
     */
    readonly tags: string[];
    /**
     * Tenant id.
     */
    readonly tenantId: string;
}
/**
 * Datasource for looking up an Azure Cloud Cost Connector.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as harness from "@pulumi/harness";
 *
 * const example = harness.platform.getAzureCloudCostConnector({
 *     identifier: "identifier",
 * });
 * ```
 */
export function getAzureCloudCostConnectorOutput(args: GetAzureCloudCostConnectorOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetAzureCloudCostConnectorResult> {
    return pulumi.output(args).apply((a: any) => getAzureCloudCostConnector(a, opts))
}

/**
 * A collection of arguments for invoking getAzureCloudCostConnector.
 */
export interface GetAzureCloudCostConnectorOutputArgs {
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