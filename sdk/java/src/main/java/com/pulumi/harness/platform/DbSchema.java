// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.harness.Utilities;
import com.pulumi.harness.platform.DbSchemaArgs;
import com.pulumi.harness.platform.inputs.DbSchemaState;
import com.pulumi.harness.platform.outputs.DbSchemaSchemaSource;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Resource for creating a Harness DBDevOps Schema.
 * 
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
 * import com.pulumi.harness.platform.DbSchema;
 * import com.pulumi.harness.platform.DbSchemaArgs;
 * import com.pulumi.harness.platform.inputs.DbSchemaSchemaSourceArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var test = new DbSchema("test", DbSchemaArgs.builder()
 *             .identifier("identifier")
 *             .orgId("org_id")
 *             .projectId("project_id")
 *             .name("name")
 *             .service("service1")
 *             .tags(            
 *                 "foo:bar",
 *                 "bar:foo")
 *             .schemaSource(DbSchemaSchemaSourceArgs.builder()
 *                 .connector("gitConnector")
 *                 .repo("TestRepo")
 *                 .location("db/example-changelog.yaml")
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * Import project level db schema
 * 
 * ```sh
 * $ pulumi import harness:platform/dbSchema:DbSchema example &lt;org_id&gt;/&lt;project_id&gt;/&lt;db_schema_id&gt;
 * ```
 * 
 */
@ResourceType(type="harness:platform/dbSchema:DbSchema")
public class DbSchema extends com.pulumi.resources.CustomResource {
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
    private Output<String> orgId;

    /**
     * @return Unique identifier of the organization.
     * 
     */
    public Output<String> orgId() {
        return this.orgId;
    }
    /**
     * Unique identifier of the project.
     * 
     */
    @Export(name="projectId", refs={String.class}, tree="[0]")
    private Output<String> projectId;

    /**
     * @return Unique identifier of the project.
     * 
     */
    public Output<String> projectId() {
        return this.projectId;
    }
    /**
     * Provides a connector and path at which to find the database schema representation
     * 
     */
    @Export(name="schemaSource", refs={DbSchemaSchemaSource.class}, tree="[0]")
    private Output<DbSchemaSchemaSource> schemaSource;

    /**
     * @return Provides a connector and path at which to find the database schema representation
     * 
     */
    public Output<DbSchemaSchemaSource> schemaSource() {
        return this.schemaSource;
    }
    /**
     * The service associated with schema
     * 
     */
    @Export(name="service", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> service;

    /**
     * @return The service associated with schema
     * 
     */
    public Output<Optional<String>> service() {
        return Codegen.optional(this.service);
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
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public DbSchema(java.lang.String name) {
        this(name, DbSchemaArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public DbSchema(java.lang.String name, DbSchemaArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public DbSchema(java.lang.String name, DbSchemaArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("harness:platform/dbSchema:DbSchema", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private DbSchema(java.lang.String name, Output<java.lang.String> id, @Nullable DbSchemaState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("harness:platform/dbSchema:DbSchema", name, state, makeResourceOptions(options, id), false);
    }

    private static DbSchemaArgs makeArgs(DbSchemaArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? DbSchemaArgs.Empty : args;
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
    public static DbSchema get(java.lang.String name, Output<java.lang.String> id, @Nullable DbSchemaState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new DbSchema(name, id, state, options);
    }
}
