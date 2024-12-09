// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as harness from "@pulumi/harness";
 *
 * const example = new harness.platform.InfraModule("example", {
 *     description: "example",
 *     name: "name",
 *     system: "provider",
 *     repository: "https://github.com/org/repo",
 *     repositoryBranch: "main",
 *     repositoryPath: "tf/aws/basic",
 *     repositoryConnector: test.id,
 * });
 * ```
 *
 * ## Import
 *
 * ```sh
 * $ pulumi import harness:platform/infraModule:InfraModule example <org_id>/<module_id>
 * ```
 */
export class InfraModule extends pulumi.CustomResource {
    /**
     * Get an existing InfraModule resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: InfraModuleState, opts?: pulumi.CustomResourceOptions): InfraModule {
        return new InfraModule(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'harness:platform/infraModule:InfraModule';

    /**
     * Returns true if the given object is an instance of InfraModule.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is InfraModule {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === InfraModule.__pulumiType;
    }

    /**
     * Timestamp when the module was created.
     */
    public readonly created!: pulumi.Output<number>;
    /**
     * Description of the module.
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * Name of the module.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * For account connectors, the repository where the module can be found
     */
    public readonly repository!: pulumi.Output<string | undefined>;
    /**
     * Name of the branch to fetch the code from. This cannot be set if repository commit is set.
     */
    public readonly repositoryBranch!: pulumi.Output<string | undefined>;
    /**
     * Tag to fetch the code from. This cannot be set if repository branch is set.
     */
    public readonly repositoryCommit!: pulumi.Output<string | undefined>;
    /**
     * Reference to the connector to be used to fetch the code.
     */
    public readonly repositoryConnector!: pulumi.Output<string | undefined>;
    /**
     * Path to the module within the repository.
     */
    public readonly repositoryPath!: pulumi.Output<string | undefined>;
    /**
     * URL of the repository where the module is stored.
     */
    public readonly repositoryUrl!: pulumi.Output<string>;
    /**
     * Timestamp when the module was last synced.
     */
    public readonly synced!: pulumi.Output<number>;
    /**
     * Provider of the module.
     */
    public readonly system!: pulumi.Output<string>;
    /**
     * Git tags associated with the module.
     */
    public readonly tags!: pulumi.Output<string>;
    /**
     * List of versions of the module.
     */
    public readonly versions!: pulumi.Output<string[]>;

    /**
     * Create a InfraModule resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: InfraModuleArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: InfraModuleArgs | InfraModuleState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as InfraModuleState | undefined;
            resourceInputs["created"] = state ? state.created : undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["repository"] = state ? state.repository : undefined;
            resourceInputs["repositoryBranch"] = state ? state.repositoryBranch : undefined;
            resourceInputs["repositoryCommit"] = state ? state.repositoryCommit : undefined;
            resourceInputs["repositoryConnector"] = state ? state.repositoryConnector : undefined;
            resourceInputs["repositoryPath"] = state ? state.repositoryPath : undefined;
            resourceInputs["repositoryUrl"] = state ? state.repositoryUrl : undefined;
            resourceInputs["synced"] = state ? state.synced : undefined;
            resourceInputs["system"] = state ? state.system : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
            resourceInputs["versions"] = state ? state.versions : undefined;
        } else {
            const args = argsOrState as InfraModuleArgs | undefined;
            if ((!args || args.system === undefined) && !opts.urn) {
                throw new Error("Missing required property 'system'");
            }
            resourceInputs["created"] = args ? args.created : undefined;
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["repository"] = args ? args.repository : undefined;
            resourceInputs["repositoryBranch"] = args ? args.repositoryBranch : undefined;
            resourceInputs["repositoryCommit"] = args ? args.repositoryCommit : undefined;
            resourceInputs["repositoryConnector"] = args ? args.repositoryConnector : undefined;
            resourceInputs["repositoryPath"] = args ? args.repositoryPath : undefined;
            resourceInputs["repositoryUrl"] = args ? args.repositoryUrl : undefined;
            resourceInputs["synced"] = args ? args.synced : undefined;
            resourceInputs["system"] = args ? args.system : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
            resourceInputs["versions"] = args ? args.versions : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(InfraModule.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering InfraModule resources.
 */
export interface InfraModuleState {
    /**
     * Timestamp when the module was created.
     */
    created?: pulumi.Input<number>;
    /**
     * Description of the module.
     */
    description?: pulumi.Input<string>;
    /**
     * Name of the module.
     */
    name?: pulumi.Input<string>;
    /**
     * For account connectors, the repository where the module can be found
     */
    repository?: pulumi.Input<string>;
    /**
     * Name of the branch to fetch the code from. This cannot be set if repository commit is set.
     */
    repositoryBranch?: pulumi.Input<string>;
    /**
     * Tag to fetch the code from. This cannot be set if repository branch is set.
     */
    repositoryCommit?: pulumi.Input<string>;
    /**
     * Reference to the connector to be used to fetch the code.
     */
    repositoryConnector?: pulumi.Input<string>;
    /**
     * Path to the module within the repository.
     */
    repositoryPath?: pulumi.Input<string>;
    /**
     * URL of the repository where the module is stored.
     */
    repositoryUrl?: pulumi.Input<string>;
    /**
     * Timestamp when the module was last synced.
     */
    synced?: pulumi.Input<number>;
    /**
     * Provider of the module.
     */
    system?: pulumi.Input<string>;
    /**
     * Git tags associated with the module.
     */
    tags?: pulumi.Input<string>;
    /**
     * List of versions of the module.
     */
    versions?: pulumi.Input<pulumi.Input<string>[]>;
}

/**
 * The set of arguments for constructing a InfraModule resource.
 */
export interface InfraModuleArgs {
    /**
     * Timestamp when the module was created.
     */
    created?: pulumi.Input<number>;
    /**
     * Description of the module.
     */
    description?: pulumi.Input<string>;
    /**
     * Name of the module.
     */
    name?: pulumi.Input<string>;
    /**
     * For account connectors, the repository where the module can be found
     */
    repository?: pulumi.Input<string>;
    /**
     * Name of the branch to fetch the code from. This cannot be set if repository commit is set.
     */
    repositoryBranch?: pulumi.Input<string>;
    /**
     * Tag to fetch the code from. This cannot be set if repository branch is set.
     */
    repositoryCommit?: pulumi.Input<string>;
    /**
     * Reference to the connector to be used to fetch the code.
     */
    repositoryConnector?: pulumi.Input<string>;
    /**
     * Path to the module within the repository.
     */
    repositoryPath?: pulumi.Input<string>;
    /**
     * URL of the repository where the module is stored.
     */
    repositoryUrl?: pulumi.Input<string>;
    /**
     * Timestamp when the module was last synced.
     */
    synced?: pulumi.Input<number>;
    /**
     * Provider of the module.
     */
    system: pulumi.Input<string>;
    /**
     * Git tags associated with the module.
     */
    tags?: pulumi.Input<string>;
    /**
     * List of versions of the module.
     */
    versions?: pulumi.Input<pulumi.Input<string>[]>;
}