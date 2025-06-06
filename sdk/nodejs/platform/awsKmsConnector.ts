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
 * Import account level awskms connector
 *
 * ```sh
 * $ pulumi import harness:platform/awsKmsConnector:AwsKmsConnector example <connector_id>
 * ```
 *
 * Import org level awskms connector
 *
 * ```sh
 * $ pulumi import harness:platform/awsKmsConnector:AwsKmsConnector example <ord_id>/<connector_id>
 * ```
 *
 * Import project level awskms connector
 *
 * ```sh
 * $ pulumi import harness:platform/awsKmsConnector:AwsKmsConnector example <org_id>/<project_id>/<connector_id>
 * ```
 */
export class AwsKmsConnector extends pulumi.CustomResource {
    /**
     * Get an existing AwsKmsConnector resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: AwsKmsConnectorState, opts?: pulumi.CustomResourceOptions): AwsKmsConnector {
        return new AwsKmsConnector(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'harness:platform/awsKmsConnector:AwsKmsConnector';

    /**
     * Returns true if the given object is an instance of AwsKmsConnector.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is AwsKmsConnector {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === AwsKmsConnector.__pulumiType;
    }

    /**
     * A reference to the Harness secret containing the ARN of the AWS KMS. To reference a secret at the organization scope, prefix 'org' to the expression: org.{identifier}. To reference a secret at the account scope, prefix 'account` to the expression: account.{identifier}.
     */
    public readonly arnRef!: pulumi.Output<string>;
    /**
     * Credentials to connect to AWS.
     */
    public readonly credentials!: pulumi.Output<outputs.platform.AwsKmsConnectorCredentials>;
    /**
     * Set this connector as the default for all the services.
     */
    public readonly default!: pulumi.Output<boolean | undefined>;
    /**
     * Tags to filter delegates for connection.
     */
    public readonly delegateSelectors!: pulumi.Output<string[] | undefined>;
    /**
     * Description of the resource.
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * Execute the command on the delegate.
     */
    public readonly executeOnDelegate!: pulumi.Output<boolean | undefined>;
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
     * The AWS region where the AWS Secret Manager is.
     */
    public readonly region!: pulumi.Output<string>;
    /**
     * Tags to associate with the resource.
     */
    public readonly tags!: pulumi.Output<string[] | undefined>;

    /**
     * Create a AwsKmsConnector resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: AwsKmsConnectorArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: AwsKmsConnectorArgs | AwsKmsConnectorState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as AwsKmsConnectorState | undefined;
            resourceInputs["arnRef"] = state ? state.arnRef : undefined;
            resourceInputs["credentials"] = state ? state.credentials : undefined;
            resourceInputs["default"] = state ? state.default : undefined;
            resourceInputs["delegateSelectors"] = state ? state.delegateSelectors : undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["executeOnDelegate"] = state ? state.executeOnDelegate : undefined;
            resourceInputs["identifier"] = state ? state.identifier : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["orgId"] = state ? state.orgId : undefined;
            resourceInputs["projectId"] = state ? state.projectId : undefined;
            resourceInputs["region"] = state ? state.region : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
        } else {
            const args = argsOrState as AwsKmsConnectorArgs | undefined;
            if ((!args || args.arnRef === undefined) && !opts.urn) {
                throw new Error("Missing required property 'arnRef'");
            }
            if ((!args || args.credentials === undefined) && !opts.urn) {
                throw new Error("Missing required property 'credentials'");
            }
            if ((!args || args.identifier === undefined) && !opts.urn) {
                throw new Error("Missing required property 'identifier'");
            }
            if ((!args || args.region === undefined) && !opts.urn) {
                throw new Error("Missing required property 'region'");
            }
            resourceInputs["arnRef"] = args ? args.arnRef : undefined;
            resourceInputs["credentials"] = args ? args.credentials : undefined;
            resourceInputs["default"] = args ? args.default : undefined;
            resourceInputs["delegateSelectors"] = args ? args.delegateSelectors : undefined;
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["executeOnDelegate"] = args ? args.executeOnDelegate : undefined;
            resourceInputs["identifier"] = args ? args.identifier : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["orgId"] = args ? args.orgId : undefined;
            resourceInputs["projectId"] = args ? args.projectId : undefined;
            resourceInputs["region"] = args ? args.region : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(AwsKmsConnector.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering AwsKmsConnector resources.
 */
export interface AwsKmsConnectorState {
    /**
     * A reference to the Harness secret containing the ARN of the AWS KMS. To reference a secret at the organization scope, prefix 'org' to the expression: org.{identifier}. To reference a secret at the account scope, prefix 'account` to the expression: account.{identifier}.
     */
    arnRef?: pulumi.Input<string>;
    /**
     * Credentials to connect to AWS.
     */
    credentials?: pulumi.Input<inputs.platform.AwsKmsConnectorCredentials>;
    /**
     * Set this connector as the default for all the services.
     */
    default?: pulumi.Input<boolean>;
    /**
     * Tags to filter delegates for connection.
     */
    delegateSelectors?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Description of the resource.
     */
    description?: pulumi.Input<string>;
    /**
     * Execute the command on the delegate.
     */
    executeOnDelegate?: pulumi.Input<boolean>;
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
     * The AWS region where the AWS Secret Manager is.
     */
    region?: pulumi.Input<string>;
    /**
     * Tags to associate with the resource.
     */
    tags?: pulumi.Input<pulumi.Input<string>[]>;
}

/**
 * The set of arguments for constructing a AwsKmsConnector resource.
 */
export interface AwsKmsConnectorArgs {
    /**
     * A reference to the Harness secret containing the ARN of the AWS KMS. To reference a secret at the organization scope, prefix 'org' to the expression: org.{identifier}. To reference a secret at the account scope, prefix 'account` to the expression: account.{identifier}.
     */
    arnRef: pulumi.Input<string>;
    /**
     * Credentials to connect to AWS.
     */
    credentials: pulumi.Input<inputs.platform.AwsKmsConnectorCredentials>;
    /**
     * Set this connector as the default for all the services.
     */
    default?: pulumi.Input<boolean>;
    /**
     * Tags to filter delegates for connection.
     */
    delegateSelectors?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Description of the resource.
     */
    description?: pulumi.Input<string>;
    /**
     * Execute the command on the delegate.
     */
    executeOnDelegate?: pulumi.Input<boolean>;
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
     * The AWS region where the AWS Secret Manager is.
     */
    region: pulumi.Input<string>;
    /**
     * Tags to associate with the resource.
     */
    tags?: pulumi.Input<pulumi.Input<string>[]>;
}
