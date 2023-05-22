// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * Resource for creating a Harness CCM Filters.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as harness from "@lbrlabs/pulumi-harness";
 *
 * const test = new harness.platform.CcmFilters("test", {
 *     filterProperties: {
 *         filterType: "CCMRecommendation",
 *         tags: ["foo:bar"],
 *     },
 *     filterVisibility: "EveryOne",
 *     identifier: "identifier",
 *     orgId: "org_id",
 *     projectId: "project_id",
 *     type: "CCMRecommendation",
 * });
 * ```
 *
 * ## Import
 *
 * Import account level ccm filter
 *
 * ```sh
 *  $ pulumi import harness:platform/ccmFilters:CcmFilters example <filter_id>/<type>
 * ```
 *
 *  Import org level ccm filter
 *
 * ```sh
 *  $ pulumi import harness:platform/ccmFilters:CcmFilters example <ord_id>/<filter_id>/<type>
 * ```
 *
 *  Import project level ccm filter
 *
 * ```sh
 *  $ pulumi import harness:platform/ccmFilters:CcmFilters example <org_id>/<project_id>/<filter_id>/<type>
 * ```
 */
export class CcmFilters extends pulumi.CustomResource {
    /**
     * Get an existing CcmFilters resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: CcmFiltersState, opts?: pulumi.CustomResourceOptions): CcmFilters {
        return new CcmFilters(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'harness:platform/ccmFilters:CcmFilters';

    /**
     * Returns true if the given object is an instance of CcmFilters.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is CcmFilters {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === CcmFilters.__pulumiType;
    }

    /**
     * Properties of the filters entity defined in Harness.
     */
    public readonly filterProperties!: pulumi.Output<outputs.platform.CcmFiltersFilterProperties>;
    /**
     * This indicates visibility of filters. By default, everyone can view this filter..
     */
    public readonly filterVisibility!: pulumi.Output<string | undefined>;
    /**
     * Unique identifier of the resource.
     */
    public readonly identifier!: pulumi.Output<string>;
    /**
     * Name of the ccm filters.
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
     * Type of ccm filters.
     */
    public readonly type!: pulumi.Output<string>;

    /**
     * Create a CcmFilters resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: CcmFiltersArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: CcmFiltersArgs | CcmFiltersState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as CcmFiltersState | undefined;
            resourceInputs["filterProperties"] = state ? state.filterProperties : undefined;
            resourceInputs["filterVisibility"] = state ? state.filterVisibility : undefined;
            resourceInputs["identifier"] = state ? state.identifier : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["orgId"] = state ? state.orgId : undefined;
            resourceInputs["projectId"] = state ? state.projectId : undefined;
            resourceInputs["type"] = state ? state.type : undefined;
        } else {
            const args = argsOrState as CcmFiltersArgs | undefined;
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
        super(CcmFilters.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering CcmFilters resources.
 */
export interface CcmFiltersState {
    /**
     * Properties of the filters entity defined in Harness.
     */
    filterProperties?: pulumi.Input<inputs.platform.CcmFiltersFilterProperties>;
    /**
     * This indicates visibility of filters. By default, everyone can view this filter..
     */
    filterVisibility?: pulumi.Input<string>;
    /**
     * Unique identifier of the resource.
     */
    identifier?: pulumi.Input<string>;
    /**
     * Name of the ccm filters.
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
     * Type of ccm filters.
     */
    type?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a CcmFilters resource.
 */
export interface CcmFiltersArgs {
    /**
     * Properties of the filters entity defined in Harness.
     */
    filterProperties: pulumi.Input<inputs.platform.CcmFiltersFilterProperties>;
    /**
     * This indicates visibility of filters. By default, everyone can view this filter..
     */
    filterVisibility?: pulumi.Input<string>;
    /**
     * Unique identifier of the resource.
     */
    identifier: pulumi.Input<string>;
    /**
     * Name of the ccm filters.
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
     * Type of ccm filters.
     */
    type: pulumi.Input<string>;
}