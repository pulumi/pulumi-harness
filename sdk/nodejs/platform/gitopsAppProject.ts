// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * ## Example Usage
 *
 * ## Import
 *
 * Import gitOps project with account level agent
 *
 * ```sh
 * $ pulumi import harness:platform/gitopsAppProject:GitopsAppProject example <agent_id>/<app_proj_name>
 * ```
 *
 * Import gitOps project with org level agent
 *
 * ```sh
 * $ pulumi import harness:platform/gitopsAppProject:GitopsAppProject example <organization_id>/<agent_id>/<app_proj_name>
 * ```
 *
 * Import gitOps project with project level agent
 *
 * ```sh
 * $ pulumi import harness:platform/gitopsAppProject:GitopsAppProject example <organization_id>/<project_id>/<agent_id>/<app_proj_name>
 * ```
 */
export class GitopsAppProject extends pulumi.CustomResource {
    /**
     * Get an existing GitopsAppProject resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: GitopsAppProjectState, opts?: pulumi.CustomResourceOptions): GitopsAppProject {
        return new GitopsAppProject(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'harness:platform/gitopsAppProject:GitopsAppProject';

    /**
     * Returns true if the given object is an instance of GitopsAppProject.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is GitopsAppProject {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === GitopsAppProject.__pulumiType;
    }

    /**
     * Account identifier of the GitOps Agent where argo project will exist.
     *
     * @deprecated This field is deprecated and will be removed in a future release.
     */
    public readonly accountId!: pulumi.Output<string>;
    /**
     * Agent identifier of the agent where argo project will exist (include scope prefix)
     */
    public readonly agentId!: pulumi.Output<string>;
    /**
     * Org identifier of the GitOps Agent where argo project is to be created.
     */
    public readonly orgId!: pulumi.Output<string | undefined>;
    /**
     * Project identifier of the Gitops Agent where argo project is to be created.
     */
    public readonly projectId!: pulumi.Output<string | undefined>;
    /**
     * GitOps project configuration.
     */
    public readonly projects!: pulumi.Output<outputs.platform.GitopsAppProjectProject[]>;
    /**
     * Identifier for the GitOps Argo project.
     */
    public readonly queryName!: pulumi.Output<string>;
    /**
     * Indicates if the argo project should be updated if existing and inserted if not.
     */
    public readonly upsert!: pulumi.Output<boolean | undefined>;

    /**
     * Create a GitopsAppProject resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: GitopsAppProjectArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: GitopsAppProjectArgs | GitopsAppProjectState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as GitopsAppProjectState | undefined;
            resourceInputs["accountId"] = state ? state.accountId : undefined;
            resourceInputs["agentId"] = state ? state.agentId : undefined;
            resourceInputs["orgId"] = state ? state.orgId : undefined;
            resourceInputs["projectId"] = state ? state.projectId : undefined;
            resourceInputs["projects"] = state ? state.projects : undefined;
            resourceInputs["queryName"] = state ? state.queryName : undefined;
            resourceInputs["upsert"] = state ? state.upsert : undefined;
        } else {
            const args = argsOrState as GitopsAppProjectArgs | undefined;
            if ((!args || args.agentId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'agentId'");
            }
            if ((!args || args.projects === undefined) && !opts.urn) {
                throw new Error("Missing required property 'projects'");
            }
            resourceInputs["accountId"] = args ? args.accountId : undefined;
            resourceInputs["agentId"] = args ? args.agentId : undefined;
            resourceInputs["orgId"] = args ? args.orgId : undefined;
            resourceInputs["projectId"] = args ? args.projectId : undefined;
            resourceInputs["projects"] = args ? args.projects : undefined;
            resourceInputs["queryName"] = args ? args.queryName : undefined;
            resourceInputs["upsert"] = args ? args.upsert : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(GitopsAppProject.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering GitopsAppProject resources.
 */
export interface GitopsAppProjectState {
    /**
     * Account identifier of the GitOps Agent where argo project will exist.
     *
     * @deprecated This field is deprecated and will be removed in a future release.
     */
    accountId?: pulumi.Input<string>;
    /**
     * Agent identifier of the agent where argo project will exist (include scope prefix)
     */
    agentId?: pulumi.Input<string>;
    /**
     * Org identifier of the GitOps Agent where argo project is to be created.
     */
    orgId?: pulumi.Input<string>;
    /**
     * Project identifier of the Gitops Agent where argo project is to be created.
     */
    projectId?: pulumi.Input<string>;
    /**
     * GitOps project configuration.
     */
    projects?: pulumi.Input<pulumi.Input<inputs.platform.GitopsAppProjectProject>[]>;
    /**
     * Identifier for the GitOps Argo project.
     */
    queryName?: pulumi.Input<string>;
    /**
     * Indicates if the argo project should be updated if existing and inserted if not.
     */
    upsert?: pulumi.Input<boolean>;
}

/**
 * The set of arguments for constructing a GitopsAppProject resource.
 */
export interface GitopsAppProjectArgs {
    /**
     * Account identifier of the GitOps Agent where argo project will exist.
     *
     * @deprecated This field is deprecated and will be removed in a future release.
     */
    accountId?: pulumi.Input<string>;
    /**
     * Agent identifier of the agent where argo project will exist (include scope prefix)
     */
    agentId: pulumi.Input<string>;
    /**
     * Org identifier of the GitOps Agent where argo project is to be created.
     */
    orgId?: pulumi.Input<string>;
    /**
     * Project identifier of the Gitops Agent where argo project is to be created.
     */
    projectId?: pulumi.Input<string>;
    /**
     * GitOps project configuration.
     */
    projects: pulumi.Input<pulumi.Input<inputs.platform.GitopsAppProjectProject>[]>;
    /**
     * Identifier for the GitOps Argo project.
     */
    queryName?: pulumi.Input<string>;
    /**
     * Indicates if the argo project should be updated if existing and inserted if not.
     */
    upsert?: pulumi.Input<boolean>;
}
