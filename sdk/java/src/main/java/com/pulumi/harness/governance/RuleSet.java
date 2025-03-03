// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.governance;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.harness.Utilities;
import com.pulumi.harness.governance.RuleSetArgs;
import com.pulumi.harness.governance.inputs.RuleSetState;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Resource for creating, updating, and managing rule.
 * 
 */
@ResourceType(type="harness:governance/ruleSet:RuleSet")
public class RuleSet extends com.pulumi.resources.CustomResource {
    /**
     * The cloud provider for the rule set. It should be either AWS, AZURE or GCP.
     * 
     */
    @Export(name="cloudProvider", refs={String.class}, tree="[0]")
    private Output<String> cloudProvider;

    /**
     * @return The cloud provider for the rule set. It should be either AWS, AZURE or GCP.
     * 
     */
    public Output<String> cloudProvider() {
        return this.cloudProvider;
    }
    /**
     * Description for rule set.
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    /**
     * @return Description for rule set.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * Name of the rule set.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Name of the rule set.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * List of rule IDs
     * 
     */
    @Export(name="ruleIds", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> ruleIds;

    /**
     * @return List of rule IDs
     * 
     */
    public Output<List<String>> ruleIds() {
        return this.ruleIds;
    }
    /**
     * Id of the rule.
     * 
     */
    @Export(name="ruleSetId", refs={String.class}, tree="[0]")
    private Output<String> ruleSetId;

    /**
     * @return Id of the rule.
     * 
     */
    public Output<String> ruleSetId() {
        return this.ruleSetId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public RuleSet(java.lang.String name) {
        this(name, RuleSetArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public RuleSet(java.lang.String name, RuleSetArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public RuleSet(java.lang.String name, RuleSetArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("harness:governance/ruleSet:RuleSet", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private RuleSet(java.lang.String name, Output<java.lang.String> id, @Nullable RuleSetState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("harness:governance/ruleSet:RuleSet", name, state, makeResourceOptions(options, id), false);
    }

    private static RuleSetArgs makeArgs(RuleSetArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? RuleSetArgs.Empty : args;
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
    public static RuleSet get(java.lang.String name, Output<java.lang.String> id, @Nullable RuleSetState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new RuleSet(name, id, state, options);
    }
}
