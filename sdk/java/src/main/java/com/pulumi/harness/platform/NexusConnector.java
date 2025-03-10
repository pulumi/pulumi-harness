// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.harness.Utilities;
import com.pulumi.harness.platform.NexusConnectorArgs;
import com.pulumi.harness.platform.inputs.NexusConnectorState;
import com.pulumi.harness.platform.outputs.NexusConnectorCredentials;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Resource for creating a Nexus connector.
 * 
 * ## Example to create Nexus Connector at different levels (Org, Project, Account)
 * 
 * ## Import
 * 
 * Import account level nexus connector
 * 
 * ```sh
 * $ pulumi import harness:platform/nexusConnector:NexusConnector example &lt;connector_id&gt;
 * ```
 * 
 * Import org level nexus connector
 * 
 * ```sh
 * $ pulumi import harness:platform/nexusConnector:NexusConnector example &lt;ord_id&gt;/&lt;connector_id&gt;
 * ```
 * 
 * Import project level nexus connector
 * 
 * ```sh
 * $ pulumi import harness:platform/nexusConnector:NexusConnector example &lt;org_id&gt;/&lt;project_id&gt;/&lt;connector_id&gt;
 * ```
 * 
 */
@ResourceType(type="harness:platform/nexusConnector:NexusConnector")
public class NexusConnector extends com.pulumi.resources.CustomResource {
    /**
     * Credentials to use for authentication.
     * 
     */
    @Export(name="credentials", refs={NexusConnectorCredentials.class}, tree="[0]")
    private Output</* @Nullable */ NexusConnectorCredentials> credentials;

    /**
     * @return Credentials to use for authentication.
     * 
     */
    public Output<Optional<NexusConnectorCredentials>> credentials() {
        return Codegen.optional(this.credentials);
    }
    /**
     * Tags to filter delegates for connection.
     * 
     */
    @Export(name="delegateSelectors", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> delegateSelectors;

    /**
     * @return Tags to filter delegates for connection.
     * 
     */
    public Output<Optional<List<String>>> delegateSelectors() {
        return Codegen.optional(this.delegateSelectors);
    }
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
     * URL of the Nexus server.
     * 
     */
    @Export(name="url", refs={String.class}, tree="[0]")
    private Output<String> url;

    /**
     * @return URL of the Nexus server.
     * 
     */
    public Output<String> url() {
        return this.url;
    }
    /**
     * Version of the Nexus server. Valid values are 2.x, 3.x
     * 
     */
    @Export(name="version", refs={String.class}, tree="[0]")
    private Output<String> version;

    /**
     * @return Version of the Nexus server. Valid values are 2.x, 3.x
     * 
     */
    public Output<String> version() {
        return this.version;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public NexusConnector(java.lang.String name) {
        this(name, NexusConnectorArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public NexusConnector(java.lang.String name, NexusConnectorArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public NexusConnector(java.lang.String name, NexusConnectorArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("harness:platform/nexusConnector:NexusConnector", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private NexusConnector(java.lang.String name, Output<java.lang.String> id, @Nullable NexusConnectorState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("harness:platform/nexusConnector:NexusConnector", name, state, makeResourceOptions(options, id), false);
    }

    private static NexusConnectorArgs makeArgs(NexusConnectorArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? NexusConnectorArgs.Empty : args;
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
    public static NexusConnector get(java.lang.String name, Output<java.lang.String> id, @Nullable NexusConnectorState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new NexusConnector(name, id, state, options);
    }
}
