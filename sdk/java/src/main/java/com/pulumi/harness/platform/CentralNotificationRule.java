// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.harness.Utilities;
import com.pulumi.harness.platform.CentralNotificationRuleArgs;
import com.pulumi.harness.platform.inputs.CentralNotificationRuleState;
import com.pulumi.harness.platform.outputs.CentralNotificationRuleCustomNotificationTemplateRef;
import com.pulumi.harness.platform.outputs.CentralNotificationRuleNotificationCondition;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Resource for creating a Harness Notification Rule
 * 
 */
@ResourceType(type="harness:platform/centralNotificationRule:CentralNotificationRule")
public class CentralNotificationRule extends com.pulumi.resources.CustomResource {
    /**
     * Account identifier associated with this notification channel.
     * 
     */
    @Export(name="account", refs={String.class}, tree="[0]")
    private Output<String> account;

    /**
     * @return Account identifier associated with this notification channel.
     * 
     */
    public Output<String> account() {
        return this.account;
    }
    /**
     * Timestamp when the notification rule was created.
     * 
     */
    @Export(name="created", refs={Integer.class}, tree="[0]")
    private Output<Integer> created;

    /**
     * @return Timestamp when the notification rule was created.
     * 
     */
    public Output<Integer> created() {
        return this.created;
    }
    @Export(name="customNotificationTemplateRef", refs={CentralNotificationRuleCustomNotificationTemplateRef.class}, tree="[0]")
    private Output</* @Nullable */ CentralNotificationRuleCustomNotificationTemplateRef> customNotificationTemplateRef;

    public Output<Optional<CentralNotificationRuleCustomNotificationTemplateRef>> customNotificationTemplateRef() {
        return Codegen.optional(this.customNotificationTemplateRef);
    }
    @Export(name="identifier", refs={String.class}, tree="[0]")
    private Output<String> identifier;

    public Output<String> identifier() {
        return this.identifier;
    }
    /**
     * Timestamp when the notification rule was last modified.
     * 
     */
    @Export(name="lastModified", refs={Integer.class}, tree="[0]")
    private Output<Integer> lastModified;

    /**
     * @return Timestamp when the notification rule was last modified.
     * 
     */
    public Output<Integer> lastModified() {
        return this.lastModified;
    }
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    public Output<String> name() {
        return this.name;
    }
    @Export(name="notificationChannelRefs", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> notificationChannelRefs;

    public Output<List<String>> notificationChannelRefs() {
        return this.notificationChannelRefs;
    }
    @Export(name="notificationConditions", refs={List.class,CentralNotificationRuleNotificationCondition.class}, tree="[0,1]")
    private Output<List<CentralNotificationRuleNotificationCondition>> notificationConditions;

    public Output<List<CentralNotificationRuleNotificationCondition>> notificationConditions() {
        return this.notificationConditions;
    }
    @Export(name="org", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> org;

    public Output<Optional<String>> org() {
        return Codegen.optional(this.org);
    }
    @Export(name="project", refs={String.class}, tree="[0]")
    private Output<String> project;

    public Output<String> project() {
        return this.project;
    }
    @Export(name="status", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> status;

    public Output<Optional<String>> status() {
        return Codegen.optional(this.status);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public CentralNotificationRule(java.lang.String name) {
        this(name, CentralNotificationRuleArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public CentralNotificationRule(java.lang.String name, CentralNotificationRuleArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public CentralNotificationRule(java.lang.String name, CentralNotificationRuleArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("harness:platform/centralNotificationRule:CentralNotificationRule", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private CentralNotificationRule(java.lang.String name, Output<java.lang.String> id, @Nullable CentralNotificationRuleState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("harness:platform/centralNotificationRule:CentralNotificationRule", name, state, makeResourceOptions(options, id), false);
    }

    private static CentralNotificationRuleArgs makeArgs(CentralNotificationRuleArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? CentralNotificationRuleArgs.Empty : args;
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<java.lang.String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .pluginDownloadURL("github://api.github.com/pulumi")
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
    public static CentralNotificationRule get(java.lang.String name, Output<java.lang.String> id, @Nullable CentralNotificationRuleState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new CentralNotificationRule(name, id, state, options);
    }
}
