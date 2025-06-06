// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Resource for creating a Harness user
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as harness from "@pulumi/harness";
 *
 * const johnDoe = new harness.User("john_doe", {
 *     name: "John Doe",
 *     email: "john.doe@example.com",
 * });
 * ```
 *
 * ## Import
 *
 * Import using the email address of the user
 *
 * ```sh
 * $ pulumi import harness:index/user:User john_doe john.doe@example.com
 * ```
 */
export class User extends pulumi.CustomResource {
    /**
     * Get an existing User resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: UserState, opts?: pulumi.CustomResourceOptions): User {
        return new User(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'harness:index/user:User';

    /**
     * Returns true if the given object is an instance of User.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is User {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === User.__pulumiType;
    }

    /**
     * The email of the user.
     */
    public readonly email!: pulumi.Output<string>;
    /**
     * The groups the user belongs to. This is only used during the creation of the user. The groups are not updated after the user is created. When using this option you should also set `lifecycle = { ignoreChanges = ["groupIds"] }`.
     */
    public readonly groupIds!: pulumi.Output<string[] | undefined>;
    /**
     * Flag indicating whether or not the users email has been verified.
     */
    public /*out*/ readonly isEmailVerified!: pulumi.Output<boolean>;
    /**
     * Flag indicating whether or not the user was imported from an identity provider.
     */
    public /*out*/ readonly isImportedFromIdentityProvider!: pulumi.Output<boolean>;
    /**
     * Flag indicating whether or not the users password has expired.
     */
    public /*out*/ readonly isPasswordExpired!: pulumi.Output<boolean>;
    /**
     * Flag indicating whether or not two-factor authentication is enabled for the user.
     */
    public /*out*/ readonly isTwoFactorAuthEnabled!: pulumi.Output<boolean>;
    /**
     * Flag indicating whether or not the user is locked out.
     */
    public /*out*/ readonly isUserLocked!: pulumi.Output<boolean>;
    /**
     * The name of the user.
     */
    public readonly name!: pulumi.Output<string>;

    /**
     * Create a User resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: UserArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: UserArgs | UserState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as UserState | undefined;
            resourceInputs["email"] = state ? state.email : undefined;
            resourceInputs["groupIds"] = state ? state.groupIds : undefined;
            resourceInputs["isEmailVerified"] = state ? state.isEmailVerified : undefined;
            resourceInputs["isImportedFromIdentityProvider"] = state ? state.isImportedFromIdentityProvider : undefined;
            resourceInputs["isPasswordExpired"] = state ? state.isPasswordExpired : undefined;
            resourceInputs["isTwoFactorAuthEnabled"] = state ? state.isTwoFactorAuthEnabled : undefined;
            resourceInputs["isUserLocked"] = state ? state.isUserLocked : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
        } else {
            const args = argsOrState as UserArgs | undefined;
            if ((!args || args.email === undefined) && !opts.urn) {
                throw new Error("Missing required property 'email'");
            }
            resourceInputs["email"] = args ? args.email : undefined;
            resourceInputs["groupIds"] = args ? args.groupIds : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["isEmailVerified"] = undefined /*out*/;
            resourceInputs["isImportedFromIdentityProvider"] = undefined /*out*/;
            resourceInputs["isPasswordExpired"] = undefined /*out*/;
            resourceInputs["isTwoFactorAuthEnabled"] = undefined /*out*/;
            resourceInputs["isUserLocked"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(User.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering User resources.
 */
export interface UserState {
    /**
     * The email of the user.
     */
    email?: pulumi.Input<string>;
    /**
     * The groups the user belongs to. This is only used during the creation of the user. The groups are not updated after the user is created. When using this option you should also set `lifecycle = { ignoreChanges = ["groupIds"] }`.
     */
    groupIds?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Flag indicating whether or not the users email has been verified.
     */
    isEmailVerified?: pulumi.Input<boolean>;
    /**
     * Flag indicating whether or not the user was imported from an identity provider.
     */
    isImportedFromIdentityProvider?: pulumi.Input<boolean>;
    /**
     * Flag indicating whether or not the users password has expired.
     */
    isPasswordExpired?: pulumi.Input<boolean>;
    /**
     * Flag indicating whether or not two-factor authentication is enabled for the user.
     */
    isTwoFactorAuthEnabled?: pulumi.Input<boolean>;
    /**
     * Flag indicating whether or not the user is locked out.
     */
    isUserLocked?: pulumi.Input<boolean>;
    /**
     * The name of the user.
     */
    name?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a User resource.
 */
export interface UserArgs {
    /**
     * The email of the user.
     */
    email: pulumi.Input<string>;
    /**
     * The groups the user belongs to. This is only used during the creation of the user. The groups are not updated after the user is created. When using this option you should also set `lifecycle = { ignoreChanges = ["groupIds"] }`.
     */
    groupIds?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The name of the user.
     */
    name?: pulumi.Input<string>;
}
