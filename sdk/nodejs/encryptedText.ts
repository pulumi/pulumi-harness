// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * Resource for creating an encrypted text secret
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as harness from "@pulumi/harness";
 *
 * const _default = harness.getSecretManager({
 *     "default": true,
 * });
 * const example = new harness.EncryptedText("example", {
 *     name: "example-secret",
 *     value: "someval",
 *     secretManagerId: _default.then(_default => _default.id),
 *     usageScopes: [
 *         {
 *             environmentFilterType: "PRODUCTION_ENVIRONMENTS",
 *         },
 *         {
 *             environmentFilterType: "NON_PRODUCTION_ENVIRONMENTS",
 *         },
 *     ],
 * });
 * ```
 *
 * ## Import
 *
 * Import using the Harness encrypted text format.
 *
 * NOTE: The secret value cannot be decrypted and imported.
 *
 * ```sh
 * $ pulumi import harness:index/encryptedText:EncryptedText example <secret_id>
 * ```
 */
export class EncryptedText extends pulumi.CustomResource {
    /**
     * Get an existing EncryptedText resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: EncryptedTextState, opts?: pulumi.CustomResourceOptions): EncryptedText {
        return new EncryptedText(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'harness:index/encryptedText:EncryptedText';

    /**
     * Returns true if the given object is an instance of EncryptedText.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is EncryptedText {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === EncryptedText.__pulumiType;
    }

    /**
     * Boolean that indicates whether or not to inherit the usage scopes from the secret manager
     */
    public readonly inheritScopesFromSecretManager!: pulumi.Output<boolean | undefined>;
    /**
     * Name of the encrypted text secret
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * Boolean that indicates whether or not the secret is scoped to the account
     */
    public readonly scopedToAccount!: pulumi.Output<boolean | undefined>;
    /**
     * The id of the secret manager to associate the secret with. Once set, this field cannot be changed.
     */
    public readonly secretManagerId!: pulumi.Output<string>;
    /**
     * Name of the existing secret. If you already have secrets created in a secrets manager such as HashiCorp Vault or AWS Secrets Manager, you do not need to re-create the existing secrets in Harness.
     */
    public readonly secretReference!: pulumi.Output<string | undefined>;
    /**
     * This block is used for scoping the resource to a specific set of applications or environments.
     */
    public readonly usageScopes!: pulumi.Output<outputs.EncryptedTextUsageScope[] | undefined>;
    /**
     * The value of the secret.
     */
    public readonly value!: pulumi.Output<string | undefined>;

    /**
     * Create a EncryptedText resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: EncryptedTextArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: EncryptedTextArgs | EncryptedTextState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as EncryptedTextState | undefined;
            resourceInputs["inheritScopesFromSecretManager"] = state ? state.inheritScopesFromSecretManager : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["scopedToAccount"] = state ? state.scopedToAccount : undefined;
            resourceInputs["secretManagerId"] = state ? state.secretManagerId : undefined;
            resourceInputs["secretReference"] = state ? state.secretReference : undefined;
            resourceInputs["usageScopes"] = state ? state.usageScopes : undefined;
            resourceInputs["value"] = state ? state.value : undefined;
        } else {
            const args = argsOrState as EncryptedTextArgs | undefined;
            if ((!args || args.secretManagerId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'secretManagerId'");
            }
            resourceInputs["inheritScopesFromSecretManager"] = args ? args.inheritScopesFromSecretManager : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["scopedToAccount"] = args ? args.scopedToAccount : undefined;
            resourceInputs["secretManagerId"] = args ? args.secretManagerId : undefined;
            resourceInputs["secretReference"] = args ? args.secretReference : undefined;
            resourceInputs["usageScopes"] = args ? args.usageScopes : undefined;
            resourceInputs["value"] = args?.value ? pulumi.secret(args.value) : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        const secretOpts = { additionalSecretOutputs: ["value"] };
        opts = pulumi.mergeOptions(opts, secretOpts);
        super(EncryptedText.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering EncryptedText resources.
 */
export interface EncryptedTextState {
    /**
     * Boolean that indicates whether or not to inherit the usage scopes from the secret manager
     */
    inheritScopesFromSecretManager?: pulumi.Input<boolean>;
    /**
     * Name of the encrypted text secret
     */
    name?: pulumi.Input<string>;
    /**
     * Boolean that indicates whether or not the secret is scoped to the account
     */
    scopedToAccount?: pulumi.Input<boolean>;
    /**
     * The id of the secret manager to associate the secret with. Once set, this field cannot be changed.
     */
    secretManagerId?: pulumi.Input<string>;
    /**
     * Name of the existing secret. If you already have secrets created in a secrets manager such as HashiCorp Vault or AWS Secrets Manager, you do not need to re-create the existing secrets in Harness.
     */
    secretReference?: pulumi.Input<string>;
    /**
     * This block is used for scoping the resource to a specific set of applications or environments.
     */
    usageScopes?: pulumi.Input<pulumi.Input<inputs.EncryptedTextUsageScope>[]>;
    /**
     * The value of the secret.
     */
    value?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a EncryptedText resource.
 */
export interface EncryptedTextArgs {
    /**
     * Boolean that indicates whether or not to inherit the usage scopes from the secret manager
     */
    inheritScopesFromSecretManager?: pulumi.Input<boolean>;
    /**
     * Name of the encrypted text secret
     */
    name?: pulumi.Input<string>;
    /**
     * Boolean that indicates whether or not the secret is scoped to the account
     */
    scopedToAccount?: pulumi.Input<boolean>;
    /**
     * The id of the secret manager to associate the secret with. Once set, this field cannot be changed.
     */
    secretManagerId: pulumi.Input<string>;
    /**
     * Name of the existing secret. If you already have secrets created in a secrets manager such as HashiCorp Vault or AWS Secrets Manager, you do not need to re-create the existing secrets in Harness.
     */
    secretReference?: pulumi.Input<string>;
    /**
     * This block is used for scoping the resource to a specific set of applications or environments.
     */
    usageScopes?: pulumi.Input<pulumi.Input<inputs.EncryptedTextUsageScope>[]>;
    /**
     * The value of the secret.
     */
    value?: pulumi.Input<string>;
}
