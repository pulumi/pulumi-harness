// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.harness.Utilities;
import com.pulumi.harness.platform.UsergroupArgs;
import com.pulumi.harness.platform.inputs.UsergroupState;
import com.pulumi.harness.platform.outputs.UsergroupNotificationConfig;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * ## Example Usage
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.harness.platform.Usergroup;
 * import com.pulumi.harness.platform.UsergroupArgs;
 * import com.pulumi.harness.platform.inputs.UsergroupNotificationConfigArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App }{{@code
 *     public static void main(String[] args) }{{@code
 *         Pulumi.run(App::stack);
 *     }}{@code
 * 
 *     public static void stack(Context ctx) }{{@code
 *         var ssoTypeSaml = new Usergroup("ssoTypeSaml", UsergroupArgs.builder()
 *             .identifier("identifier")
 *             .name("name")
 *             .orgId("org_id")
 *             .projectId("project_id")
 *             .linkedSsoId("linked_sso_id")
 *             .externallyManaged(false)
 *             .users("user_id")
 *             .notificationConfigs(            
 *                 UsergroupNotificationConfigArgs.builder()
 *                     .type("SLACK")
 *                     .slackWebhookUrl("https://google.com")
 *                     .build(),
 *                 UsergroupNotificationConfigArgs.builder()
 *                     .type("EMAIL")
 *                     .groupEmail("email}{@literal @}{@code email.com")
 *                     .sendEmailToAllUsers(true)
 *                     .build(),
 *                 UsergroupNotificationConfigArgs.builder()
 *                     .type("MSTEAMS")
 *                     .microsoftTeamsWebhookUrl("https://google.com")
 *                     .build(),
 *                 UsergroupNotificationConfigArgs.builder()
 *                     .type("PAGERDUTY")
 *                     .pagerDutyKey("pagerDutyKey")
 *                     .build())
 *             .linkedSsoDisplayName("linked_sso_display_name")
 *             .ssoGroupId("sso_group_name")
 *             .ssoGroupName("sso_group_name")
 *             .linkedSsoType("SAML")
 *             .ssoLinked(true)
 *             .build());
 * 
 *         var ssoTypeLdap = new Usergroup("ssoTypeLdap", UsergroupArgs.builder()
 *             .identifier("identifier")
 *             .name("name")
 *             .orgId("org_id")
 *             .projectId("project_id")
 *             .linkedSsoId("linked_sso_id")
 *             .externallyManaged(false)
 *             .users("user_id")
 *             .notificationConfigs(            
 *                 UsergroupNotificationConfigArgs.builder()
 *                     .type("SLACK")
 *                     .slackWebhookUrl("https://google.com")
 *                     .build(),
 *                 UsergroupNotificationConfigArgs.builder()
 *                     .type("EMAIL")
 *                     .groupEmail("email}{@literal @}{@code email.com")
 *                     .sendEmailToAllUsers(true)
 *                     .build(),
 *                 UsergroupNotificationConfigArgs.builder()
 *                     .type("MSTEAMS")
 *                     .microsoftTeamsWebhookUrl("https://google.com")
 *                     .build(),
 *                 UsergroupNotificationConfigArgs.builder()
 *                     .type("PAGERDUTY")
 *                     .pagerDutyKey("pagerDutyKey")
 *                     .build())
 *             .linkedSsoDisplayName("linked_sso_display_name")
 *             .ssoGroupId("sso_group_id")
 *             .ssoGroupName("sso_group_name")
 *             .linkedSsoType("LDAP")
 *             .ssoLinked(true)
 *             .build());
 * 
 *         // Create user group by adding user emails
 *         var example = new Usergroup("example", UsergroupArgs.builder()
 *             .identifier("identifier")
 *             .name("name")
 *             .orgId("org_id")
 *             .projectId("project_id")
 *             .linkedSsoId("linked_sso_id")
 *             .externallyManaged(false)
 *             .userEmails("user}{@literal @}{@code email.com")
 *             .notificationConfigs(            
 *                 UsergroupNotificationConfigArgs.builder()
 *                     .type("SLACK")
 *                     .slackWebhookUrl("https://google.com")
 *                     .build(),
 *                 UsergroupNotificationConfigArgs.builder()
 *                     .type("EMAIL")
 *                     .groupEmail("email}{@literal @}{@code email.com")
 *                     .sendEmailToAllUsers(true)
 *                     .build(),
 *                 UsergroupNotificationConfigArgs.builder()
 *                     .type("MSTEAMS")
 *                     .microsoftTeamsWebhookUrl("https://google.com")
 *                     .build(),
 *                 UsergroupNotificationConfigArgs.builder()
 *                     .type("PAGERDUTY")
 *                     .pagerDutyKey("pagerDutyKey")
 *                     .build())
 *             .linkedSsoDisplayName("linked_sso_display_name")
 *             .ssoGroupId("sso_group_name")
 *             .ssoGroupName("sso_group_name")
 *             .linkedSsoType("SAML")
 *             .ssoLinked(true)
 *             .build());
 * 
 *     }}{@code
 * }}{@code
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * Import account level user group
 * 
 * ```sh
 * $ pulumi import harness:platform/usergroup:Usergroup example &lt;usergroup_id&gt;
 * ```
 * 
 * Import org level user group
 * 
 * ```sh
 * $ pulumi import harness:platform/usergroup:Usergroup example &lt;ord_id&gt;/&lt;usergroup_id&gt;
 * ```
 * 
 * Import project level user group
 * 
 * ```sh
 * $ pulumi import harness:platform/usergroup:Usergroup example &lt;org_id&gt;/&lt;project_id&gt;/&lt;usergroup_id&gt;
 * ```
 * 
 */
@ResourceType(type="harness:platform/usergroup:Usergroup")
public class Usergroup extends com.pulumi.resources.CustomResource {
    /**
     * Description of the resource.
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    /**
     * @return Description of the resource.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * Whether the user group is externally managed.
     * 
     */
    @Export(name="externallyManaged", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> externallyManaged;

    /**
     * @return Whether the user group is externally managed.
     * 
     */
    public Output<Optional<Boolean>> externallyManaged() {
        return Codegen.optional(this.externallyManaged);
    }
    /**
     * Unique identifier of the resource.
     * 
     */
    @Export(name="identifier", refs={String.class}, tree="[0]")
    private Output<String> identifier;

    /**
     * @return Unique identifier of the resource.
     * 
     */
    public Output<String> identifier() {
        return this.identifier;
    }
    /**
     * Name of the linked SSO.
     * 
     */
    @Export(name="linkedSsoDisplayName", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> linkedSsoDisplayName;

    /**
     * @return Name of the linked SSO.
     * 
     */
    public Output<Optional<String>> linkedSsoDisplayName() {
        return Codegen.optional(this.linkedSsoDisplayName);
    }
    /**
     * The SSO account ID that the user group is linked to.
     * 
     */
    @Export(name="linkedSsoId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> linkedSsoId;

    /**
     * @return The SSO account ID that the user group is linked to.
     * 
     */
    public Output<Optional<String>> linkedSsoId() {
        return Codegen.optional(this.linkedSsoId);
    }
    /**
     * Type of linked SSO.
     * 
     */
    @Export(name="linkedSsoType", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> linkedSsoType;

    /**
     * @return Type of linked SSO.
     * 
     */
    public Output<Optional<String>> linkedSsoType() {
        return Codegen.optional(this.linkedSsoType);
    }
    /**
     * Name of the resource.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Name of the resource.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * List of notification settings.
     * 
     */
    @Export(name="notificationConfigs", refs={List.class,UsergroupNotificationConfig.class}, tree="[0,1]")
    private Output</* @Nullable */ List<UsergroupNotificationConfig>> notificationConfigs;

    /**
     * @return List of notification settings.
     * 
     */
    public Output<Optional<List<UsergroupNotificationConfig>>> notificationConfigs() {
        return Codegen.optional(this.notificationConfigs);
    }
    /**
     * Unique identifier of the organization.
     * 
     */
    @Export(name="orgId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> orgId;

    /**
     * @return Unique identifier of the organization.
     * 
     */
    public Output<Optional<String>> orgId() {
        return Codegen.optional(this.orgId);
    }
    /**
     * Unique identifier of the project.
     * 
     */
    @Export(name="projectId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> projectId;

    /**
     * @return Unique identifier of the project.
     * 
     */
    public Output<Optional<String>> projectId() {
        return Codegen.optional(this.projectId);
    }
    /**
     * Identifier of the userGroup in SSO.
     * 
     */
    @Export(name="ssoGroupId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> ssoGroupId;

    /**
     * @return Identifier of the userGroup in SSO.
     * 
     */
    public Output<Optional<String>> ssoGroupId() {
        return Codegen.optional(this.ssoGroupId);
    }
    /**
     * Name of the SSO userGroup.
     * 
     */
    @Export(name="ssoGroupName", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> ssoGroupName;

    /**
     * @return Name of the SSO userGroup.
     * 
     */
    public Output<Optional<String>> ssoGroupName() {
        return Codegen.optional(this.ssoGroupName);
    }
    /**
     * Whether sso is linked or not.
     * 
     */
    @Export(name="ssoLinked", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> ssoLinked;

    /**
     * @return Whether sso is linked or not.
     * 
     */
    public Output<Boolean> ssoLinked() {
        return this.ssoLinked;
    }
    /**
     * Tags to associate with the resource.
     * 
     */
    @Export(name="tags", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> tags;

    /**
     * @return Tags to associate with the resource.
     * 
     */
    public Output<Optional<List<String>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * List of user emails in the UserGroup. Either provide list of users or list of user emails.
     * 
     */
    @Export(name="userEmails", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> userEmails;

    /**
     * @return List of user emails in the UserGroup. Either provide list of users or list of user emails.
     * 
     */
    public Output<Optional<List<String>>> userEmails() {
        return Codegen.optional(this.userEmails);
    }
    /**
     * List of users in the UserGroup. Either provide list of users or list of user emails.
     * 
     */
    @Export(name="users", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> users;

    /**
     * @return List of users in the UserGroup. Either provide list of users or list of user emails.
     * 
     */
    public Output<Optional<List<String>>> users() {
        return Codegen.optional(this.users);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Usergroup(java.lang.String name) {
        this(name, UsergroupArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Usergroup(java.lang.String name, UsergroupArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Usergroup(java.lang.String name, UsergroupArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("harness:platform/usergroup:Usergroup", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private Usergroup(java.lang.String name, Output<java.lang.String> id, @Nullable UsergroupState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("harness:platform/usergroup:Usergroup", name, state, makeResourceOptions(options, id), false);
    }

    private static UsergroupArgs makeArgs(UsergroupArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? UsergroupArgs.Empty : args;
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<java.lang.String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static Usergroup get(java.lang.String name, Output<java.lang.String> id, @Nullable UsergroupState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Usergroup(name, id, state, options);
    }
}