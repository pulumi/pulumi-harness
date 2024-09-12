// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * Resource for creating Harness Pipeline Filters.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as harness from "@pulumi/harness";
 *
 * const test = new harness.platform.PipelineFilters("test", {
 *     identifier: "identifier",
 *     name: "name",
 *     orgId: "org_id",
 *     projectId: "project_id",
 *     type: "PipelineSetup",
 *     filterProperties: {
 *         name: "pipeline_name",
 *         description: "pipeline_description",
 *         pipelineIdentifiers: [
 *             "id1",
 *             "id2",
 *         ],
 *         filterType: "PipelineSetup",
 *     },
 *     filterVisibility: "EveryOne",
 * });
 * // pipeline filter with tags
 * const exampleWithTags = new harness.platform.PipelineFilters("example_with_tags", {
 *     identifier: "identifier",
 *     name: "name",
 *     orgId: "org_id",
 *     projectId: "project_id",
 *     type: "PipelineSetup",
 *     filterProperties: {
 *         filterType: "PipelineSetup",
 *         pipelineTags: [
 *             {
 *                 key: "tag1",
 *                 value: "123",
 *             },
 *             {
 *                 key: "tag2",
 *                 value: "456",
 *             },
 *         ],
 *         moduleProperties: {
 *             cd: {
 *                 deploymentTypes: "Kubernetes",
 *                 serviceNames: [
 *                     "service1",
 *                     "service2",
 *                 ],
 *                 environmentNames: [
 *                     "env1",
 *                     "env2",
 *                 ],
 *                 artifactDisplayNames: [
 *                     "artificatname1",
 *                     "artifact2",
 *                 ],
 *             },
 *             ci: {
 *                 buildType: "branch",
 *                 branch: "branch123",
 *                 repoNames: "repo1234",
 *             },
 *         },
 *     },
 * });
 * ```
 *
 * ## Import
 *
 * Import account level pipeline filter
 *
 * ```sh
 * $ pulumi import harness:platform/pipelineFilters:PipelineFilters example <filter_id>/<type>
 * ```
 *
 * Import org level pipeline filter
 *
 * ```sh
 * $ pulumi import harness:platform/pipelineFilters:PipelineFilters example <ord_id>/<filter_id>/<type>
 * ```
 *
 * Import project level pipeline filter
 *
 * ```sh
 * $ pulumi import harness:platform/pipelineFilters:PipelineFilters example <org_id>/<project_id>/<filter_id>/<type>
 * ```
 */
export class PipelineFilters extends pulumi.CustomResource {
    /**
     * Get an existing PipelineFilters resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: PipelineFiltersState, opts?: pulumi.CustomResourceOptions): PipelineFilters {
        return new PipelineFilters(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'harness:platform/pipelineFilters:PipelineFilters';

    /**
     * Returns true if the given object is an instance of PipelineFilters.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is PipelineFilters {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === PipelineFilters.__pulumiType;
    }

    /**
     * Properties of the filters entity defined in Harness.
     */
    public readonly filterProperties!: pulumi.Output<outputs.platform.PipelineFiltersFilterProperties>;
    /**
     * This indicates visibility of filters. By default, everyone can view this filter.
     */
    public readonly filterVisibility!: pulumi.Output<string>;
    /**
     * Unique identifier of the resource.
     */
    public readonly identifier!: pulumi.Output<string>;
    /**
     * Name of the pipeline filters.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * Organization Identifier for the Entity.
     */
    public readonly orgId!: pulumi.Output<string | undefined>;
    /**
     * Project Identifier for the Entity.
     */
    public readonly projectId!: pulumi.Output<string | undefined>;
    /**
     * Type of pipeline filters. Currently supported types are {PipelineSetup, PipelineExecution, Deployment, Template, EnvironmentGroup, Environment}
     */
    public readonly type!: pulumi.Output<string>;

    /**
     * Create a PipelineFilters resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: PipelineFiltersArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: PipelineFiltersArgs | PipelineFiltersState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as PipelineFiltersState | undefined;
            resourceInputs["filterProperties"] = state ? state.filterProperties : undefined;
            resourceInputs["filterVisibility"] = state ? state.filterVisibility : undefined;
            resourceInputs["identifier"] = state ? state.identifier : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["orgId"] = state ? state.orgId : undefined;
            resourceInputs["projectId"] = state ? state.projectId : undefined;
            resourceInputs["type"] = state ? state.type : undefined;
        } else {
            const args = argsOrState as PipelineFiltersArgs | undefined;
            if ((!args || args.filterProperties === undefined) && !opts.urn) {
                throw new Error("Missing required property 'filterProperties'");
            }
            if ((!args || args.identifier === undefined) && !opts.urn) {
                throw new Error("Missing required property 'identifier'");
            }
            if ((!args || args.type === undefined) && !opts.urn) {
                throw new Error("Missing required property 'type'");
            }
            resourceInputs["filterProperties"] = args ? args.filterProperties : undefined;
            resourceInputs["filterVisibility"] = args ? args.filterVisibility : undefined;
            resourceInputs["identifier"] = args ? args.identifier : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["orgId"] = args ? args.orgId : undefined;
            resourceInputs["projectId"] = args ? args.projectId : undefined;
            resourceInputs["type"] = args ? args.type : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(PipelineFilters.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering PipelineFilters resources.
 */
export interface PipelineFiltersState {
    /**
     * Properties of the filters entity defined in Harness.
     */
    filterProperties?: pulumi.Input<inputs.platform.PipelineFiltersFilterProperties>;
    /**
     * This indicates visibility of filters. By default, everyone can view this filter.
     */
    filterVisibility?: pulumi.Input<string>;
    /**
     * Unique identifier of the resource.
     */
    identifier?: pulumi.Input<string>;
    /**
     * Name of the pipeline filters.
     */
    name?: pulumi.Input<string>;
    /**
     * Organization Identifier for the Entity.
     */
    orgId?: pulumi.Input<string>;
    /**
     * Project Identifier for the Entity.
     */
    projectId?: pulumi.Input<string>;
    /**
     * Type of pipeline filters. Currently supported types are {PipelineSetup, PipelineExecution, Deployment, Template, EnvironmentGroup, Environment}
     */
    type?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a PipelineFilters resource.
 */
export interface PipelineFiltersArgs {
    /**
     * Properties of the filters entity defined in Harness.
     */
    filterProperties: pulumi.Input<inputs.platform.PipelineFiltersFilterProperties>;
    /**
     * This indicates visibility of filters. By default, everyone can view this filter.
     */
    filterVisibility?: pulumi.Input<string>;
    /**
     * Unique identifier of the resource.
     */
    identifier: pulumi.Input<string>;
    /**
     * Name of the pipeline filters.
     */
    name?: pulumi.Input<string>;
    /**
     * Organization Identifier for the Entity.
     */
    orgId?: pulumi.Input<string>;
    /**
     * Project Identifier for the Entity.
     */
    projectId?: pulumi.Input<string>;
    /**
     * Type of pipeline filters. Currently supported types are {PipelineSetup, PipelineExecution, Deployment, Template, EnvironmentGroup, Environment}
     */
    type: pulumi.Input<string>;
}