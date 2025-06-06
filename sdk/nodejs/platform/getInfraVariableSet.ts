// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * Data source for retrieving Variable Sets.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as harness from "@pulumi/harness";
 *
 * const test = harness.platform.getInfraVariableSet({
 *     identifier: "identifier",
 *     orgId: "org_id",
 *     projectId: "project_id",
 * });
 * ```
 */
export function getInfraVariableSet(args: GetInfraVariableSetArgs, opts?: pulumi.InvokeOptions): Promise<GetInfraVariableSetResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("harness:platform/getInfraVariableSet:getInfraVariableSet", {
        "connectors": args.connectors,
        "environmentVariables": args.environmentVariables,
        "identifier": args.identifier,
        "name": args.name,
        "orgId": args.orgId,
        "projectId": args.projectId,
        "terraformVariableFiles": args.terraformVariableFiles,
        "terraformVariables": args.terraformVariables,
    }, opts);
}

/**
 * A collection of arguments for invoking getInfraVariableSet.
 */
export interface GetInfraVariableSetArgs {
    /**
     * Provider connector configured on the variable set
     */
    connectors?: inputs.platform.GetInfraVariableSetConnector[];
    /**
     * Environment variables configured on the variable set
     */
    environmentVariables?: inputs.platform.GetInfraVariableSetEnvironmentVariable[];
    /**
     * Identifier of the Variable Set
     */
    identifier: string;
    /**
     * Name of the Variable Set
     */
    name?: string;
    /**
     * Organization Identifier
     */
    orgId?: string;
    /**
     * Project Identifier
     */
    projectId?: string;
    terraformVariableFiles?: inputs.platform.GetInfraVariableSetTerraformVariableFile[];
    terraformVariables?: inputs.platform.GetInfraVariableSetTerraformVariable[];
}

/**
 * A collection of values returned by getInfraVariableSet.
 */
export interface GetInfraVariableSetResult {
    /**
     * Provider connector configured on the variable set
     */
    readonly connectors: outputs.platform.GetInfraVariableSetConnector[];
    /**
     * Description of the Variable Set
     */
    readonly description: string;
    /**
     * Environment variables configured on the variable set
     */
    readonly environmentVariables: outputs.platform.GetInfraVariableSetEnvironmentVariable[];
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * Identifier of the Variable Set
     */
    readonly identifier: string;
    /**
     * Name of the Variable Set
     */
    readonly name?: string;
    /**
     * Organization Identifier
     */
    readonly orgId?: string;
    /**
     * Project Identifier
     */
    readonly projectId?: string;
    readonly tags: string[];
    readonly terraformVariableFiles: outputs.platform.GetInfraVariableSetTerraformVariableFile[];
    readonly terraformVariables: outputs.platform.GetInfraVariableSetTerraformVariable[];
}
/**
 * Data source for retrieving Variable Sets.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as harness from "@pulumi/harness";
 *
 * const test = harness.platform.getInfraVariableSet({
 *     identifier: "identifier",
 *     orgId: "org_id",
 *     projectId: "project_id",
 * });
 * ```
 */
export function getInfraVariableSetOutput(args: GetInfraVariableSetOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetInfraVariableSetResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("harness:platform/getInfraVariableSet:getInfraVariableSet", {
        "connectors": args.connectors,
        "environmentVariables": args.environmentVariables,
        "identifier": args.identifier,
        "name": args.name,
        "orgId": args.orgId,
        "projectId": args.projectId,
        "terraformVariableFiles": args.terraformVariableFiles,
        "terraformVariables": args.terraformVariables,
    }, opts);
}

/**
 * A collection of arguments for invoking getInfraVariableSet.
 */
export interface GetInfraVariableSetOutputArgs {
    /**
     * Provider connector configured on the variable set
     */
    connectors?: pulumi.Input<pulumi.Input<inputs.platform.GetInfraVariableSetConnectorArgs>[]>;
    /**
     * Environment variables configured on the variable set
     */
    environmentVariables?: pulumi.Input<pulumi.Input<inputs.platform.GetInfraVariableSetEnvironmentVariableArgs>[]>;
    /**
     * Identifier of the Variable Set
     */
    identifier: pulumi.Input<string>;
    /**
     * Name of the Variable Set
     */
    name?: pulumi.Input<string>;
    /**
     * Organization Identifier
     */
    orgId?: pulumi.Input<string>;
    /**
     * Project Identifier
     */
    projectId?: pulumi.Input<string>;
    terraformVariableFiles?: pulumi.Input<pulumi.Input<inputs.platform.GetInfraVariableSetTerraformVariableFileArgs>[]>;
    terraformVariables?: pulumi.Input<pulumi.Input<inputs.platform.GetInfraVariableSetTerraformVariableArgs>[]>;
}
