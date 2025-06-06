// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * Resource for managing a Harness Gitops Repository Credentials.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as harness from "@pulumi/harness";
 *
 * const test = new harness.platform.GitOpsRepoCred("test", {
 *     identifier: "identifier",
 *     accountId: "account_id",
 *     agentId: "agent_id",
 *     projectId: "project_id",
 *     orgId: "org_id",
 *     creds: [{
 *         type: "git",
 *         url: "git@github.com:yourorg",
 *         sshPrivateKey: `----- BEGIN OPENSSH PRIVATE KEY-----
 * XXXXX
 * XXXXX
 * XXXXX
 * -----END OPENSSH PRIVATE KEY -----
 * `,
 *     }],
 * });
 * ```
 *
 * ## Import
 *
 * Import an Account level Gitops Repository Credentials
 *
 * ```sh
 * $ pulumi import harness:platform/gitOpsRepoCred:GitOpsRepoCred example <agent_id>/<repocred_id>
 * ```
 *
 * Import an Org level Gitops Repository Credentials
 *
 * ```sh
 * $ pulumi import harness:platform/gitOpsRepoCred:GitOpsRepoCred example <organization_id>/<agent_id>/<repocred_id>
 * ```
 *
 * Import a Project level Gitops Repository Credentials
 *
 * ```sh
 * $ pulumi import harness:platform/gitOpsRepoCred:GitOpsRepoCred example <organization_id>/<project_id>/<agent_id>/<repocred_id>
 * ```
 */
export class GitOpsRepoCred extends pulumi.CustomResource {
    /**
     * Get an existing GitOpsRepoCred resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: GitOpsRepoCredState, opts?: pulumi.CustomResourceOptions): GitOpsRepoCred {
        return new GitOpsRepoCred(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'harness:platform/gitOpsRepoCred:GitOpsRepoCred';

    /**
     * Returns true if the given object is an instance of GitOpsRepoCred.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is GitOpsRepoCred {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === GitOpsRepoCred.__pulumiType;
    }

    /**
     * Account identifier of the Repository Credentials.
     *
     * @deprecated This field is deprecated and will be removed in a future release.
     */
    public readonly accountId!: pulumi.Output<string>;
    /**
     * Agent identifier of the Repository Credentials.
     */
    public readonly agentId!: pulumi.Output<string>;
    /**
     * credential details.
     */
    public readonly creds!: pulumi.Output<outputs.platform.GitOpsRepoCredCred[]>;
    /**
     * Identifier of the Repository Credentials.
     */
    public readonly identifier!: pulumi.Output<string>;
    /**
     * Organization identifier of the Repository Credentials.
     */
    public readonly orgId!: pulumi.Output<string | undefined>;
    /**
     * Project identifier of the Repository Credentials.
     */
    public readonly projectId!: pulumi.Output<string | undefined>;
    /**
     * Indicates if the GitOps repository credential should be updated if existing and inserted if not.
     */
    public readonly upsert!: pulumi.Output<boolean | undefined>;

    /**
     * Create a GitOpsRepoCred resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: GitOpsRepoCredArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: GitOpsRepoCredArgs | GitOpsRepoCredState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as GitOpsRepoCredState | undefined;
            resourceInputs["accountId"] = state ? state.accountId : undefined;
            resourceInputs["agentId"] = state ? state.agentId : undefined;
            resourceInputs["creds"] = state ? state.creds : undefined;
            resourceInputs["identifier"] = state ? state.identifier : undefined;
            resourceInputs["orgId"] = state ? state.orgId : undefined;
            resourceInputs["projectId"] = state ? state.projectId : undefined;
            resourceInputs["upsert"] = state ? state.upsert : undefined;
        } else {
            const args = argsOrState as GitOpsRepoCredArgs | undefined;
            if ((!args || args.agentId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'agentId'");
            }
            if ((!args || args.identifier === undefined) && !opts.urn) {
                throw new Error("Missing required property 'identifier'");
            }
            resourceInputs["accountId"] = args ? args.accountId : undefined;
            resourceInputs["agentId"] = args ? args.agentId : undefined;
            resourceInputs["creds"] = args ? args.creds : undefined;
            resourceInputs["identifier"] = args ? args.identifier : undefined;
            resourceInputs["orgId"] = args ? args.orgId : undefined;
            resourceInputs["projectId"] = args ? args.projectId : undefined;
            resourceInputs["upsert"] = args ? args.upsert : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(GitOpsRepoCred.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering GitOpsRepoCred resources.
 */
export interface GitOpsRepoCredState {
    /**
     * Account identifier of the Repository Credentials.
     *
     * @deprecated This field is deprecated and will be removed in a future release.
     */
    accountId?: pulumi.Input<string>;
    /**
     * Agent identifier of the Repository Credentials.
     */
    agentId?: pulumi.Input<string>;
    /**
     * credential details.
     */
    creds?: pulumi.Input<pulumi.Input<inputs.platform.GitOpsRepoCredCred>[]>;
    /**
     * Identifier of the Repository Credentials.
     */
    identifier?: pulumi.Input<string>;
    /**
     * Organization identifier of the Repository Credentials.
     */
    orgId?: pulumi.Input<string>;
    /**
     * Project identifier of the Repository Credentials.
     */
    projectId?: pulumi.Input<string>;
    /**
     * Indicates if the GitOps repository credential should be updated if existing and inserted if not.
     */
    upsert?: pulumi.Input<boolean>;
}

/**
 * The set of arguments for constructing a GitOpsRepoCred resource.
 */
export interface GitOpsRepoCredArgs {
    /**
     * Account identifier of the Repository Credentials.
     *
     * @deprecated This field is deprecated and will be removed in a future release.
     */
    accountId?: pulumi.Input<string>;
    /**
     * Agent identifier of the Repository Credentials.
     */
    agentId: pulumi.Input<string>;
    /**
     * credential details.
     */
    creds?: pulumi.Input<pulumi.Input<inputs.platform.GitOpsRepoCredCred>[]>;
    /**
     * Identifier of the Repository Credentials.
     */
    identifier: pulumi.Input<string>;
    /**
     * Organization identifier of the Repository Credentials.
     */
    orgId?: pulumi.Input<string>;
    /**
     * Project identifier of the Repository Credentials.
     */
    projectId?: pulumi.Input<string>;
    /**
     * Indicates if the GitOps repository credential should be updated if existing and inserted if not.
     */
    upsert?: pulumi.Input<boolean>;
}
