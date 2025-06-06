// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * Resource for managing Feature Flags.
 */
export class FeatureFlag extends pulumi.CustomResource {
    /**
     * Get an existing FeatureFlag resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: FeatureFlagState, opts?: pulumi.CustomResourceOptions): FeatureFlag {
        return new FeatureFlag(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'harness:platform/featureFlag:FeatureFlag';

    /**
     * Returns true if the given object is an instance of FeatureFlag.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is FeatureFlag {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === FeatureFlag.__pulumiType;
    }

    /**
     * Whether or not the flag is archived.
     */
    public readonly archived!: pulumi.Output<boolean | undefined>;
    /**
     * Which of the variations to use when the flag is toggled to off state
     */
    public readonly defaultOffVariation!: pulumi.Output<string>;
    /**
     * Which of the variations to use when the flag is toggled to on state
     */
    public readonly defaultOnVariation!: pulumi.Output<string>;
    /**
     * Description of the Feature Flag
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * Environment Identifier
     */
    public readonly environments!: pulumi.Output<outputs.platform.FeatureFlagEnvironment[] | undefined>;
    /**
     * Identifier of the Feature Flag
     */
    public readonly identifier!: pulumi.Output<string>;
    /**
     * The type of data the flag represents. Valid values are `boolean`, `int`, `string`, `json`
     */
    public readonly kind!: pulumi.Output<string>;
    /**
     * Name of the Feature Flag
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * Organization Identifier
     */
    public readonly orgId!: pulumi.Output<string>;
    /**
     * The owner of the flag
     */
    public readonly owner!: pulumi.Output<string | undefined>;
    /**
     * Whether or not the flag is permanent. If it is, it will never be flagged as stale
     */
    public readonly permanent!: pulumi.Output<boolean>;
    /**
     * Project Identifier
     */
    public readonly projectId!: pulumi.Output<string>;
    /**
     * The tags for the flag
     */
    public readonly tags!: pulumi.Output<outputs.platform.FeatureFlagTag[] | undefined>;
    /**
     * The options available for your flag
     */
    public readonly variations!: pulumi.Output<outputs.platform.FeatureFlagVariation[]>;

    /**
     * Create a FeatureFlag resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: FeatureFlagArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: FeatureFlagArgs | FeatureFlagState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as FeatureFlagState | undefined;
            resourceInputs["archived"] = state ? state.archived : undefined;
            resourceInputs["defaultOffVariation"] = state ? state.defaultOffVariation : undefined;
            resourceInputs["defaultOnVariation"] = state ? state.defaultOnVariation : undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["environments"] = state ? state.environments : undefined;
            resourceInputs["identifier"] = state ? state.identifier : undefined;
            resourceInputs["kind"] = state ? state.kind : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["orgId"] = state ? state.orgId : undefined;
            resourceInputs["owner"] = state ? state.owner : undefined;
            resourceInputs["permanent"] = state ? state.permanent : undefined;
            resourceInputs["projectId"] = state ? state.projectId : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
            resourceInputs["variations"] = state ? state.variations : undefined;
        } else {
            const args = argsOrState as FeatureFlagArgs | undefined;
            if ((!args || args.defaultOffVariation === undefined) && !opts.urn) {
                throw new Error("Missing required property 'defaultOffVariation'");
            }
            if ((!args || args.defaultOnVariation === undefined) && !opts.urn) {
                throw new Error("Missing required property 'defaultOnVariation'");
            }
            if ((!args || args.identifier === undefined) && !opts.urn) {
                throw new Error("Missing required property 'identifier'");
            }
            if ((!args || args.kind === undefined) && !opts.urn) {
                throw new Error("Missing required property 'kind'");
            }
            if ((!args || args.orgId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'orgId'");
            }
            if ((!args || args.permanent === undefined) && !opts.urn) {
                throw new Error("Missing required property 'permanent'");
            }
            if ((!args || args.projectId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'projectId'");
            }
            if ((!args || args.variations === undefined) && !opts.urn) {
                throw new Error("Missing required property 'variations'");
            }
            resourceInputs["archived"] = args ? args.archived : undefined;
            resourceInputs["defaultOffVariation"] = args ? args.defaultOffVariation : undefined;
            resourceInputs["defaultOnVariation"] = args ? args.defaultOnVariation : undefined;
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["environments"] = args ? args.environments : undefined;
            resourceInputs["identifier"] = args ? args.identifier : undefined;
            resourceInputs["kind"] = args ? args.kind : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["orgId"] = args ? args.orgId : undefined;
            resourceInputs["owner"] = args ? args.owner : undefined;
            resourceInputs["permanent"] = args ? args.permanent : undefined;
            resourceInputs["projectId"] = args ? args.projectId : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
            resourceInputs["variations"] = args ? args.variations : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(FeatureFlag.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering FeatureFlag resources.
 */
export interface FeatureFlagState {
    /**
     * Whether or not the flag is archived.
     */
    archived?: pulumi.Input<boolean>;
    /**
     * Which of the variations to use when the flag is toggled to off state
     */
    defaultOffVariation?: pulumi.Input<string>;
    /**
     * Which of the variations to use when the flag is toggled to on state
     */
    defaultOnVariation?: pulumi.Input<string>;
    /**
     * Description of the Feature Flag
     */
    description?: pulumi.Input<string>;
    /**
     * Environment Identifier
     */
    environments?: pulumi.Input<pulumi.Input<inputs.platform.FeatureFlagEnvironment>[]>;
    /**
     * Identifier of the Feature Flag
     */
    identifier?: pulumi.Input<string>;
    /**
     * The type of data the flag represents. Valid values are `boolean`, `int`, `string`, `json`
     */
    kind?: pulumi.Input<string>;
    /**
     * Name of the Feature Flag
     */
    name?: pulumi.Input<string>;
    /**
     * Organization Identifier
     */
    orgId?: pulumi.Input<string>;
    /**
     * The owner of the flag
     */
    owner?: pulumi.Input<string>;
    /**
     * Whether or not the flag is permanent. If it is, it will never be flagged as stale
     */
    permanent?: pulumi.Input<boolean>;
    /**
     * Project Identifier
     */
    projectId?: pulumi.Input<string>;
    /**
     * The tags for the flag
     */
    tags?: pulumi.Input<pulumi.Input<inputs.platform.FeatureFlagTag>[]>;
    /**
     * The options available for your flag
     */
    variations?: pulumi.Input<pulumi.Input<inputs.platform.FeatureFlagVariation>[]>;
}

/**
 * The set of arguments for constructing a FeatureFlag resource.
 */
export interface FeatureFlagArgs {
    /**
     * Whether or not the flag is archived.
     */
    archived?: pulumi.Input<boolean>;
    /**
     * Which of the variations to use when the flag is toggled to off state
     */
    defaultOffVariation: pulumi.Input<string>;
    /**
     * Which of the variations to use when the flag is toggled to on state
     */
    defaultOnVariation: pulumi.Input<string>;
    /**
     * Description of the Feature Flag
     */
    description?: pulumi.Input<string>;
    /**
     * Environment Identifier
     */
    environments?: pulumi.Input<pulumi.Input<inputs.platform.FeatureFlagEnvironment>[]>;
    /**
     * Identifier of the Feature Flag
     */
    identifier: pulumi.Input<string>;
    /**
     * The type of data the flag represents. Valid values are `boolean`, `int`, `string`, `json`
     */
    kind: pulumi.Input<string>;
    /**
     * Name of the Feature Flag
     */
    name?: pulumi.Input<string>;
    /**
     * Organization Identifier
     */
    orgId: pulumi.Input<string>;
    /**
     * The owner of the flag
     */
    owner?: pulumi.Input<string>;
    /**
     * Whether or not the flag is permanent. If it is, it will never be flagged as stale
     */
    permanent: pulumi.Input<boolean>;
    /**
     * Project Identifier
     */
    projectId: pulumi.Input<string>;
    /**
     * The tags for the flag
     */
    tags?: pulumi.Input<pulumi.Input<inputs.platform.FeatureFlagTag>[]>;
    /**
     * The options available for your flag
     */
    variations: pulumi.Input<pulumi.Input<inputs.platform.FeatureFlagVariation>[]>;
}
