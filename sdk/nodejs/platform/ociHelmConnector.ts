// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * Resource for creating a OCI Helm connector.
 *
 * ## Import
 *
 * Import account level helm connector
 *
 * ```sh
 * $ pulumi import harness:platform/ociHelmConnector:OciHelmConnector example <connector_id>
 * ```
 *
 * Import org level helm connector
 *
 * ```sh
 * $ pulumi import harness:platform/ociHelmConnector:OciHelmConnector example <ord_id>/<connector_id>
 * ```
 *
 * Import project level helm connector
 *
 * ```sh
 * $ pulumi import harness:platform/ociHelmConnector:OciHelmConnector example <org_id>/<project_id>/<connector_id>
 * ```
 */
export class OciHelmConnector extends pulumi.CustomResource {
    /**
     * Get an existing OciHelmConnector resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: OciHelmConnectorState, opts?: pulumi.CustomResourceOptions): OciHelmConnector {
        return new OciHelmConnector(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'harness:platform/ociHelmConnector:OciHelmConnector';

    /**
     * Returns true if the given object is an instance of OciHelmConnector.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is OciHelmConnector {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === OciHelmConnector.__pulumiType;
    }

    /**
     * Credentials to use for authentication.
     */
    public readonly credentials!: pulumi.Output<outputs.platform.OciHelmConnectorCredentials | undefined>;
    /**
     * Tags to filter delegates for connection.
     */
    public readonly delegateSelectors!: pulumi.Output<string[] | undefined>;
    /**
     * Description of the resource.
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * Enable this flag for force deletion of connector
     */
    public readonly forceDelete!: pulumi.Output<boolean>;
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
     * URL of the helm server.
     */
    public readonly url!: pulumi.Output<string>;

    /**
     * Create a OciHelmConnector resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: OciHelmConnectorArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: OciHelmConnectorArgs | OciHelmConnectorState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as OciHelmConnectorState | undefined;
            resourceInputs["credentials"] = state ? state.credentials : undefined;
            resourceInputs["delegateSelectors"] = state ? state.delegateSelectors : undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["forceDelete"] = state ? state.forceDelete : undefined;
            resourceInputs["identifier"] = state ? state.identifier : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["orgId"] = state ? state.orgId : undefined;
            resourceInputs["projectId"] = state ? state.projectId : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
            resourceInputs["url"] = state ? state.url : undefined;
        } else {
            const args = argsOrState as OciHelmConnectorArgs | undefined;
            if ((!args || args.identifier === undefined) && !opts.urn) {
                throw new Error("Missing required property 'identifier'");
            }
            if ((!args || args.url === undefined) && !opts.urn) {
                throw new Error("Missing required property 'url'");
            }
            resourceInputs["credentials"] = args ? args.credentials : undefined;
            resourceInputs["delegateSelectors"] = args ? args.delegateSelectors : undefined;
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["forceDelete"] = args ? args.forceDelete : undefined;
            resourceInputs["identifier"] = args ? args.identifier : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["orgId"] = args ? args.orgId : undefined;
            resourceInputs["projectId"] = args ? args.projectId : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
            resourceInputs["url"] = args ? args.url : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(OciHelmConnector.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering OciHelmConnector resources.
 */
export interface OciHelmConnectorState {
    /**
     * Credentials to use for authentication.
     */
    credentials?: pulumi.Input<inputs.platform.OciHelmConnectorCredentials>;
    /**
     * Tags to filter delegates for connection.
     */
    delegateSelectors?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Description of the resource.
     */
    description?: pulumi.Input<string>;
    /**
     * Enable this flag for force deletion of connector
     */
    forceDelete?: pulumi.Input<boolean>;
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
     * URL of the helm server.
     */
    url?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a OciHelmConnector resource.
 */
export interface OciHelmConnectorArgs {
    /**
     * Credentials to use for authentication.
     */
    credentials?: pulumi.Input<inputs.platform.OciHelmConnectorCredentials>;
    /**
     * Tags to filter delegates for connection.
     */
    delegateSelectors?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Description of the resource.
     */
    description?: pulumi.Input<string>;
    /**
     * Enable this flag for force deletion of connector
     */
    forceDelete?: pulumi.Input<boolean>;
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
     * URL of the helm server.
     */
    url: pulumi.Input<string>;
}
