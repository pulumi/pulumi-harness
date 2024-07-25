// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Resource for creating a Harness DBDevOps Instance.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as harness from "@pulumi/harness";
 *
 * const test = new harness.platform.DbInstance("test", {
 *     identifier: "identifier",
 *     orgId: "org_id",
 *     projectId: "project_id",
 *     name: "name",
 *     tags: [
 *         "foo:bar",
 *         "bar:foo",
 *     ],
 *     schema: "schema1",
 *     branch: "main",
 *     connector: "jdbcConnector",
 *     context: "ctx",
 * });
 * ```
 *
 * ## Import
 *
 * Import project level db instance
 *
 * ```sh
 * $ pulumi import harness:platform/dbInstance:DbInstance example <org_id>/<project_id>/<db_schema_id>/<db_instance_id>
 * ```
 */
export class DbInstance extends pulumi.CustomResource {
    /**
     * Get an existing DbInstance resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: DbInstanceState, opts?: pulumi.CustomResourceOptions): DbInstance {
        return new DbInstance(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'harness:platform/dbInstance:DbInstance';

    /**
     * Returns true if the given object is an instance of DbInstance.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is DbInstance {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === DbInstance.__pulumiType;
    }

    /**
     * The branch of changeSet repository
     */
    public readonly branch!: pulumi.Output<string | undefined>;
    /**
     * The connector to database
     */
    public readonly connector!: pulumi.Output<string>;
    /**
     * The liquibase context
     */
    public readonly context!: pulumi.Output<string | undefined>;
    /**
     * Description of the resource.
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * Unique identifier of the resource.
     */
    public readonly identifier!: pulumi.Output<string>;
    /**
     * Name of the resource.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * Unique identifier of the organization.
     */
    public readonly orgId!: pulumi.Output<string>;
    /**
     * Unique identifier of the project.
     */
    public readonly projectId!: pulumi.Output<string>;
    /**
     * The identifier of the parent database schema
     */
    public readonly schema!: pulumi.Output<string>;
    /**
     * Tags to associate with the resource.
     */
    public readonly tags!: pulumi.Output<string[] | undefined>;

    /**
     * Create a DbInstance resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: DbInstanceArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: DbInstanceArgs | DbInstanceState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as DbInstanceState | undefined;
            resourceInputs["branch"] = state ? state.branch : undefined;
            resourceInputs["connector"] = state ? state.connector : undefined;
            resourceInputs["context"] = state ? state.context : undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["identifier"] = state ? state.identifier : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["orgId"] = state ? state.orgId : undefined;
            resourceInputs["projectId"] = state ? state.projectId : undefined;
            resourceInputs["schema"] = state ? state.schema : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
        } else {
            const args = argsOrState as DbInstanceArgs | undefined;
            if ((!args || args.connector === undefined) && !opts.urn) {
                throw new Error("Missing required property 'connector'");
            }
            if ((!args || args.identifier === undefined) && !opts.urn) {
                throw new Error("Missing required property 'identifier'");
            }
            if ((!args || args.orgId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'orgId'");
            }
            if ((!args || args.projectId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'projectId'");
            }
            if ((!args || args.schema === undefined) && !opts.urn) {
                throw new Error("Missing required property 'schema'");
            }
            resourceInputs["branch"] = args ? args.branch : undefined;
            resourceInputs["connector"] = args ? args.connector : undefined;
            resourceInputs["context"] = args ? args.context : undefined;
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["identifier"] = args ? args.identifier : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["orgId"] = args ? args.orgId : undefined;
            resourceInputs["projectId"] = args ? args.projectId : undefined;
            resourceInputs["schema"] = args ? args.schema : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(DbInstance.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering DbInstance resources.
 */
export interface DbInstanceState {
    /**
     * The branch of changeSet repository
     */
    branch?: pulumi.Input<string>;
    /**
     * The connector to database
     */
    connector?: pulumi.Input<string>;
    /**
     * The liquibase context
     */
    context?: pulumi.Input<string>;
    /**
     * Description of the resource.
     */
    description?: pulumi.Input<string>;
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
    orgId?: pulumi.Input<string>;
    /**
     * Unique identifier of the project.
     */
    projectId?: pulumi.Input<string>;
    /**
     * The identifier of the parent database schema
     */
    schema?: pulumi.Input<string>;
    /**
     * Tags to associate with the resource.
     */
    tags?: pulumi.Input<pulumi.Input<string>[]>;
}

/**
 * The set of arguments for constructing a DbInstance resource.
 */
export interface DbInstanceArgs {
    /**
     * The branch of changeSet repository
     */
    branch?: pulumi.Input<string>;
    /**
     * The connector to database
     */
    connector: pulumi.Input<string>;
    /**
     * The liquibase context
     */
    context?: pulumi.Input<string>;
    /**
     * Description of the resource.
     */
    description?: pulumi.Input<string>;
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
    orgId: pulumi.Input<string>;
    /**
     * Unique identifier of the project.
     */
    projectId: pulumi.Input<string>;
    /**
     * The identifier of the parent database schema
     */
    schema: pulumi.Input<string>;
    /**
     * Tags to associate with the resource.
     */
    tags?: pulumi.Input<pulumi.Input<string>[]>;
}