// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.harness.Utilities;
import com.pulumi.harness.platform.SloArgs;
import com.pulumi.harness.platform.inputs.SloState;
import com.pulumi.harness.platform.outputs.SloRequest;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Resource for creating an SLO.
 * 
 * ## Example Usage
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * Import account level SLO
 * 
 * ```sh
 * $ pulumi import harness:platform/slo:Slo example &lt;slo_id&gt;
 * ```
 * 
 * Import organization level SLO
 * 
 * ```sh
 * $ pulumi import harness:platform/slo:Slo example &lt;org_id&gt;/&lt;slo_id&gt;
 * ```
 * 
 * Import project level SLO
 * 
 * ```sh
 * $ pulumi import harness:platform/slo:Slo example &lt;org_id&gt;/&lt;project_id&gt;/&lt;slo_id&gt;
 * ```
 * 
 */
@ResourceType(type="harness:platform/slo:Slo")
public class Slo extends com.pulumi.resources.CustomResource {
    /**
     * Identifier of the SLO.
     * 
     */
    @Export(name="identifier", refs={String.class}, tree="[0]")
    private Output<String> identifier;

    /**
     * @return Identifier of the SLO.
     * 
     */
    public Output<String> identifier() {
        return this.identifier;
    }
    /**
     * Identifier of the organization in which the SLO is configured.
     * 
     */
    @Export(name="orgId", refs={String.class}, tree="[0]")
    private Output<String> orgId;

    /**
     * @return Identifier of the organization in which the SLO is configured.
     * 
     */
    public Output<String> orgId() {
        return this.orgId;
    }
    /**
     * Identifier of the project in which the SLO is configured.
     * 
     */
    @Export(name="projectId", refs={String.class}, tree="[0]")
    private Output<String> projectId;

    /**
     * @return Identifier of the project in which the SLO is configured.
     * 
     */
    public Output<String> projectId() {
        return this.projectId;
    }
    /**
     * Request for creating or updating SLO.
     * 
     */
    @Export(name="request", refs={SloRequest.class}, tree="[0]")
    private Output</* @Nullable */ SloRequest> request;

    /**
     * @return Request for creating or updating SLO.
     * 
     */
    public Output<Optional<SloRequest>> request() {
        return Codegen.optional(this.request);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Slo(String name) {
        this(name, SloArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Slo(String name, SloArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Slo(String name, SloArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("harness:platform/slo:Slo", name, args == null ? SloArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Slo(String name, Output<String> id, @Nullable SloState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("harness:platform/slo:Slo", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
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
    public static Slo get(String name, Output<String> id, @Nullable SloState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Slo(name, id, state, options);
    }
}
