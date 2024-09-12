// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * Data source for retrieving a Harness pipeline.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as harness from "@pulumi/harness";
 *
 * const example = harness.platform.getPipeline({
 *     identifier: "identifier",
 *     orgId: "org_id",
 *     projectId: "project_id",
 * });
 * ```
 */
export function getPipeline(args: GetPipelineArgs, opts?: pulumi.InvokeOptions): Promise<GetPipelineResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("harness:platform/getPipeline:getPipeline", {
        "gitDetails": args.gitDetails,
        "identifier": args.identifier,
        "name": args.name,
        "orgId": args.orgId,
        "projectId": args.projectId,
    }, opts);
}

/**
 * A collection of arguments for invoking getPipeline.
 */
export interface GetPipelineArgs {
    /**
     * Contains parameters related to creating an Entity for Git Experience.
     */
    gitDetails?: inputs.platform.GetPipelineGitDetails;
    /**
     * Unique identifier of the resource.
     */
    identifier?: string;
    /**
     * Name of the resource.
     */
    name?: string;
    /**
     * Unique identifier of the organization.
     */
    orgId: string;
    /**
     * Unique identifier of the project.
     */
    projectId: string;
}

/**
 * A collection of values returned by getPipeline.
 */
export interface GetPipelineResult {
    /**
     * Description of the resource.
     */
    readonly description: string;
    /**
     * Contains parameters related to creating an Entity for Git Experience.
     */
    readonly gitDetails?: outputs.platform.GetPipelineGitDetails;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * Unique identifier of the resource.
     */
    readonly identifier?: string;
    /**
     * Name of the resource.
     */
    readonly name?: string;
    /**
     * Unique identifier of the organization.
     */
    readonly orgId: string;
    /**
     * Unique identifier of the project.
     */
    readonly projectId: string;
    /**
     * Tags to associate with the resource.
     */
    readonly tags: string[];
    /**
     * If true, returns Pipeline YAML with Templates applied on it.
     */
    readonly templateApplied: boolean;
    /**
     * Pipeline YAML after resolving Templates (returned as a String).
     */
    readonly templateAppliedPipelineYaml: string;
    /**
     * YAML of the pipeline.
     */
    readonly yaml: string;
}
/**
 * Data source for retrieving a Harness pipeline.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as harness from "@pulumi/harness";
 *
 * const example = harness.platform.getPipeline({
 *     identifier: "identifier",
 *     orgId: "org_id",
 *     projectId: "project_id",
 * });
 * ```
 */
export function getPipelineOutput(args: GetPipelineOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetPipelineResult> {
    return pulumi.output(args).apply((a: any) => getPipeline(a, opts))
}

/**
 * A collection of arguments for invoking getPipeline.
 */
export interface GetPipelineOutputArgs {
    /**
     * Contains parameters related to creating an Entity for Git Experience.
     */
    gitDetails?: pulumi.Input<inputs.platform.GetPipelineGitDetailsArgs>;
    /**
     * Unique identifier of the resource.
     */
    identifier?: pulumi.Input<string>;
    /**
     * Name of the resource.
     */
    name?: pulumi.Input<string>;
    /**
     * Unique identifier of the organization.
     */
    orgId: pulumi.Input<string>;
    /**
     * Unique identifier of the project.
     */
    projectId: pulumi.Input<string>;
}