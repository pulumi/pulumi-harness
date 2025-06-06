// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * Resource for creating a Harness environment.
 *
 * ## Example to create Environment at different levels (Org, Project, Account)
 *
 * ### Account Level
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as harness from "@pulumi/harness";
 *
 * const example = new harness.platform.Environment("example", {
 *     identifier: "identifier",
 *     name: "name",
 *     tags: [
 *         "foo:bar",
 *         "bar:foo",
 *     ],
 *     type: "PreProduction",
 *     description: "env description",
 *     yaml: `environment:
 *    name: name
 *    identifier: identifier
 *    type: PreProduction
 *    tags:
 *      foo: bar
 *      bar: foo
 *    variables:
 *      - name: envVar1
 *        type: String
 *        value: v1
 *        description: ""
 *      - name: envVar2
 *        type: String
 *        value: v2
 *        description: ""
 *    overrides:
 *      manifests:
 *        - manifest:
 *            identifier: manifestEnv
 *            type: Values
 *            spec:
 *              store:
 *                type: Git
 *                spec:
 *                  connectorRef: <+input>
 *                  gitFetchType: Branch
 *                  paths:
 *                    - file1
 *                  repoName: <+input>
 *                  branch: master
 *      configFiles:
 *        - configFile:
 *            identifier: configFileEnv
 *            spec:
 *              store:
 *                type: Harness
 *                spec:
 *                  files:
 *                    - account:/Add-ons/svcOverrideTest
 *                  secretFiles: []
 * `,
 * });
 * ```
 *
 * ### Org Level
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as harness from "@pulumi/harness";
 *
 * const example = new harness.platform.Environment("example", {
 *     identifier: "identifier",
 *     name: "name",
 *     orgId: "org_id",
 *     tags: [
 *         "foo:bar",
 *         "bar:foo",
 *     ],
 *     type: "PreProduction",
 *     description: "env description",
 *     yaml: `environment:
 *    name: name
 *    identifier: identifier
 *    orgIdentifier: org_id
 *    type: PreProduction
 *    tags:
 *      foo: bar
 *      bar: foo
 *    variables:
 *      - name: envVar1
 *        type: String
 *        value: v1
 *        description: ""
 *      - name: envVar2
 *        type: String
 *        value: v2
 *        description: ""
 *    overrides:
 *      manifests:
 *        - manifest:
 *            identifier: manifestEnv
 *            type: Values
 *            spec:
 *              store:
 *                type: Git
 *                spec:
 *                  connectorRef: <+input>
 *                  gitFetchType: Branch
 *                  paths:
 *                    - file1
 *                  repoName: <+input>
 *                  branch: master
 *      configFiles:
 *        - configFile:
 *            identifier: configFileEnv
 *            spec:
 *              store:
 *                type: Harness
 *                spec:
 *                  files:
 *                    - account:/Add-ons/svcOverrideTest
 *                  secretFiles: []
 * `,
 * });
 * ```
 *
 * ### Project Level
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as harness from "@pulumi/harness";
 *
 * const example = new harness.platform.Environment("example", {
 *     identifier: "identifier",
 *     name: "name",
 *     orgId: "org_id",
 *     projectId: "project_id",
 *     tags: [
 *         "foo:bar",
 *         "bar:foo",
 *     ],
 *     type: "PreProduction",
 *     description: "env description",
 *     yaml: `environment:
 *    name: name
 *    identifier: identifier
 *    orgIdentifier: org_id
 *    projectIdentifier: project_id
 *    type: PreProduction
 *    tags:
 *      foo: bar
 *      bar: foo
 *    variables:
 *      - name: envVar1
 *        type: String
 *        value: v1
 *        description: ""
 *      - name: envVar2
 *        type: String
 *        value: v2
 *        description: ""
 *    overrides:
 *      manifests:
 *        - manifest:
 *            identifier: manifestEnv
 *            type: Values
 *            spec:
 *              store:
 *                type: Git
 *                spec:
 *                  connectorRef: <+input>
 *                  gitFetchType: Branch
 *                  paths:
 *                    - file1
 *                  repoName: <+input>
 *                  branch: master
 *      configFiles:
 *        - configFile:
 *            identifier: configFileEnv
 *            spec:
 *              store:
 *                type: Harness
 *                spec:
 *                  files:
 *                    - account:/Add-ons/svcOverrideTest
 *                  secretFiles: []
 * `,
 * });
 * ```
 *
 * ### Creating Remote Environment
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as harness from "@pulumi/harness";
 *
 * const example = new harness.platform.Environment("example", {
 *     identifier: "identifier",
 *     name: "name",
 *     description: "test",
 *     orgId: "org_id",
 *     projectId: "project_id",
 *     gitDetails: {
 *         storeType: "REMOTE",
 *         connectorRef: "connector_ref",
 *         repoName: "repo_name",
 *         filePath: "file_path",
 *         branch: "branch",
 *     },
 *     yaml: `environment:
 *   name: env
 *   identifier: env
 *   tags:
 *     test: ""
 *   type: PreProduction
 *   orgIdentifier: default
 *   projectIdentifier: proj1
 *   variables:
 *     - name: var1
 *       type: String
 *       value: abc
 *       description: ""
 *       required: false
 *   overrides:
 *     manifests:
 *       - manifest:
 *           identifier: Manifest1
 *           type: Values
 *           spec:
 *             store:
 *               type: Github
 *               spec:
 *                 connectorRef: <+input>
 *                 gitFetchType: Branch
 *                 paths:
 *                   - .harness/
 *                 repoName: <+input>
 *                 branch: <+input>
 * `,
 * });
 * ```
 *
 * ### Importing Environment From Git
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as harness from "@pulumi/harness";
 *
 * const example = new harness.platform.Environment("example", {
 *     identifier: "identifier",
 *     name: "name",
 *     type: "PreProduction",
 *     gitDetails: {
 *         storeType: "REMOTE",
 *         connectorRef: "connector_ref",
 *         repoName: "repo_name",
 *         filePath: "file_path",
 *         branch: "branch",
 *         importFromGit: true,
 *     },
 * });
 * ```
 *
 * ## Import
 *
 * Import account level environment id
 *
 * ```sh
 * $ pulumi import harness:platform/environment:Environment example <environment_id>
 * ```
 *
 * Import org level environment id
 *
 * ```sh
 * $ pulumi import harness:platform/environment:Environment example <org_id>/<environment_id>
 * ```
 *
 * Import project level environment id
 *
 * ```sh
 * $ pulumi import harness:platform/environment:Environment example <org_id>/<project_id>/<environment_id>
 * ```
 */
export class Environment extends pulumi.CustomResource {
    /**
     * Get an existing Environment resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: EnvironmentState, opts?: pulumi.CustomResourceOptions): Environment {
        return new Environment(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'harness:platform/environment:Environment';

    /**
     * Returns true if the given object is an instance of Environment.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Environment {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Environment.__pulumiType;
    }

    /**
     * Color of the environment.
     */
    public readonly color!: pulumi.Output<string>;
    /**
     * Description of the resource.
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * When set to true, enables force deletion of environments.
     */
    public readonly forceDelete!: pulumi.Output<boolean>;
    /**
     * Contains Git Information for remote entities from Git for Create/Update/Import
     */
    public readonly gitDetails!: pulumi.Output<outputs.platform.EnvironmentGitDetails>;
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
    public readonly orgId!: pulumi.Output<string | undefined>;
    /**
     * Unique identifier of the project.
     */
    public readonly projectId!: pulumi.Output<string | undefined>;
    /**
     * Tags to associate with the resource.
     */
    public readonly tags!: pulumi.Output<string[] | undefined>;
    /**
     * The type of environment. Valid values are PreProduction, Production
     */
    public readonly type!: pulumi.Output<string>;
    /**
     * Environment YAML. In YAML, to reference an entity at the organization scope, prefix 'org' to the expression: org.{identifier}. To reference an entity at the account scope, prefix 'account` to the expression: account.{identifier}. For eg, to reference a connector with identifier 'connectorId' at the organization scope in a stage mention it as connectorRef: org.
     * connectorId.
     */
    public readonly yaml!: pulumi.Output<string | undefined>;

    /**
     * Create a Environment resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: EnvironmentArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: EnvironmentArgs | EnvironmentState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as EnvironmentState | undefined;
            resourceInputs["color"] = state ? state.color : undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["forceDelete"] = state ? state.forceDelete : undefined;
            resourceInputs["gitDetails"] = state ? state.gitDetails : undefined;
            resourceInputs["identifier"] = state ? state.identifier : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["orgId"] = state ? state.orgId : undefined;
            resourceInputs["projectId"] = state ? state.projectId : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
            resourceInputs["type"] = state ? state.type : undefined;
            resourceInputs["yaml"] = state ? state.yaml : undefined;
        } else {
            const args = argsOrState as EnvironmentArgs | undefined;
            if ((!args || args.identifier === undefined) && !opts.urn) {
                throw new Error("Missing required property 'identifier'");
            }
            if ((!args || args.type === undefined) && !opts.urn) {
                throw new Error("Missing required property 'type'");
            }
            resourceInputs["color"] = args ? args.color : undefined;
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["forceDelete"] = args ? args.forceDelete : undefined;
            resourceInputs["gitDetails"] = args ? args.gitDetails : undefined;
            resourceInputs["identifier"] = args ? args.identifier : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["orgId"] = args ? args.orgId : undefined;
            resourceInputs["projectId"] = args ? args.projectId : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
            resourceInputs["type"] = args ? args.type : undefined;
            resourceInputs["yaml"] = args ? args.yaml : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(Environment.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Environment resources.
 */
export interface EnvironmentState {
    /**
     * Color of the environment.
     */
    color?: pulumi.Input<string>;
    /**
     * Description of the resource.
     */
    description?: pulumi.Input<string>;
    /**
     * When set to true, enables force deletion of environments.
     */
    forceDelete?: pulumi.Input<boolean>;
    /**
     * Contains Git Information for remote entities from Git for Create/Update/Import
     */
    gitDetails?: pulumi.Input<inputs.platform.EnvironmentGitDetails>;
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
     * Tags to associate with the resource.
     */
    tags?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The type of environment. Valid values are PreProduction, Production
     */
    type?: pulumi.Input<string>;
    /**
     * Environment YAML. In YAML, to reference an entity at the organization scope, prefix 'org' to the expression: org.{identifier}. To reference an entity at the account scope, prefix 'account` to the expression: account.{identifier}. For eg, to reference a connector with identifier 'connectorId' at the organization scope in a stage mention it as connectorRef: org.
     * connectorId.
     */
    yaml?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a Environment resource.
 */
export interface EnvironmentArgs {
    /**
     * Color of the environment.
     */
    color?: pulumi.Input<string>;
    /**
     * Description of the resource.
     */
    description?: pulumi.Input<string>;
    /**
     * When set to true, enables force deletion of environments.
     */
    forceDelete?: pulumi.Input<boolean>;
    /**
     * Contains Git Information for remote entities from Git for Create/Update/Import
     */
    gitDetails?: pulumi.Input<inputs.platform.EnvironmentGitDetails>;
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
    /**
     * Tags to associate with the resource.
     */
    tags?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The type of environment. Valid values are PreProduction, Production
     */
    type: pulumi.Input<string>;
    /**
     * Environment YAML. In YAML, to reference an entity at the organization scope, prefix 'org' to the expression: org.{identifier}. To reference an entity at the account scope, prefix 'account` to the expression: account.{identifier}. For eg, to reference a connector with identifier 'connectorId' at the organization scope in a stage mention it as connectorRef: org.
     * connectorId.
     */
    yaml?: pulumi.Input<string>;
}
