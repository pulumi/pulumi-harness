// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.harness.Utilities;
import com.pulumi.harness.platform.ConnectorJdbcArgs;
import com.pulumi.harness.platform.inputs.ConnectorJdbcState;
import com.pulumi.harness.platform.outputs.ConnectorJdbcCredentials;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Resource for creating a JDBC connector.
 * 
 * ## Import
 * 
 * Import account level jdbc connector
 * 
 * ```sh
 * $ pulumi import harness:platform/connectorJdbc:ConnectorJdbc example &lt;connector_id&gt;
 * ```
 * 
 * Import org level jdbc connector
 * 
 * ```sh
 * $ pulumi import harness:platform/connectorJdbc:ConnectorJdbc example &lt;ord_id&gt;/&lt;connector_id&gt;
 * ```
 * 
 * Import project level jdbc connector
 * 
 * ```sh
 * $ pulumi import harness:platform/connectorJdbc:ConnectorJdbc example &lt;org_id&gt;/&lt;project_id&gt;/&lt;connector_id&gt;
 * ```
 * 
 */
@ResourceType(type="harness:platform/connectorJdbc:ConnectorJdbc")
public class ConnectorJdbc extends com.pulumi.resources.CustomResource {
    /**
     * The credentials to use for the database server.
     * 
     */
    @Export(name="credentials", refs={ConnectorJdbcCredentials.class}, tree="[0]")
    private Output<ConnectorJdbcCredentials> credentials;

    /**
     * @return The credentials to use for the database server.
     * 
     */
    public Output<ConnectorJdbcCredentials> credentials() {
        return this.credentials;
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
     * The URL of the database server.
     * 
     */
    @Export(name="url", refs={String.class}, tree="[0]")
    private Output<String> url;

    /**
     * @return The URL of the database server.
     * 
     */
    public Output<String> url() {
        return this.url;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ConnectorJdbc(java.lang.String name) {
        this(name, ConnectorJdbcArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ConnectorJdbc(java.lang.String name, ConnectorJdbcArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ConnectorJdbc(java.lang.String name, ConnectorJdbcArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("harness:platform/connectorJdbc:ConnectorJdbc", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private ConnectorJdbc(java.lang.String name, Output<java.lang.String> id, @Nullable ConnectorJdbcState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("harness:platform/connectorJdbc:ConnectorJdbc", name, state, makeResourceOptions(options, id), false);
    }

    private static ConnectorJdbcArgs makeArgs(ConnectorJdbcArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? ConnectorJdbcArgs.Empty : args;
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
    public static ConnectorJdbc get(java.lang.String name, Output<java.lang.String> id, @Nullable ConnectorJdbcState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ConnectorJdbc(name, id, state, options);
    }
}
