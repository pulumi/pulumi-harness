// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Harness.Platform
{
    /// <summary>
    /// Resource for creating an AWS Cloud Cost connector.
    /// 
    /// ## Example Usage
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Harness = Pulumi.Harness;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var test = new Harness.Platform.AwsCCConnector("test", new()
    ///     {
    ///         Identifier = "identifier",
    ///         Name = "name",
    ///         Description = "test",
    ///         Tags = new[]
    ///         {
    ///             "foo:bar",
    ///         },
    ///         AccountId = "account_id",
    ///         ReportName = "report_name",
    ///         S3Bucket = "s3bucket",
    ///         FeaturesEnableds = new[]
    ///         {
    ///             "OPTIMIZATION",
    ///             "VISIBILITY",
    ///             "BILLING",
    ///         },
    ///         CrossAccountAccess = new Harness.Platform.Inputs.AwsCCConnectorCrossAccountAccessArgs
    ///         {
    ///             RoleArn = "role_arn",
    ///             ExternalId = "external_id",
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Import account level aws cloud cost connector
    /// 
    /// ```sh
    /// $ pulumi import harness:platform/awsCCConnector:AwsCCConnector example &lt;connector_id&gt;
    /// ```
    /// 
    /// Import org level aws cloud cost connector
    /// 
    /// ```sh
    /// $ pulumi import harness:platform/awsCCConnector:AwsCCConnector example &lt;ord_id&gt;/&lt;connector_id&gt;
    /// ```
    /// 
    /// Import project level aws cloud cost connector
    /// 
    /// ```sh
    /// $ pulumi import harness:platform/awsCCConnector:AwsCCConnector example &lt;org_id&gt;/&lt;project_id&gt;/&lt;connector_id&gt;
    /// ```
    /// </summary>
    [HarnessResourceType("harness:platform/awsCCConnector:AwsCCConnector")]
    public partial class AwsCCConnector : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The AWS account id.
        /// </summary>
        [Output("accountId")]
        public Output<string> AccountId { get; private set; } = null!;

        /// <summary>
        /// Harness uses the secure cross-account role to access your AWS account. The role includes a restricted policy to access the cost and usage reports and resources for the sole purpose of cost analysis and cost optimization.
        /// </summary>
        [Output("crossAccountAccess")]
        public Output<Outputs.AwsCCConnectorCrossAccountAccess> CrossAccountAccess { get; private set; } = null!;

        /// <summary>
        /// Description of the resource.
        /// </summary>
        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        /// <summary>
        /// The features enabled for the connector. Valid values are BILLING, OPTIMIZATION, VISIBILITY, GOVERNANCE.
        /// </summary>
        [Output("featuresEnableds")]
        public Output<ImmutableArray<string>> FeaturesEnableds { get; private set; } = null!;

        /// <summary>
        /// Unique identifier of the resource.
        /// </summary>
        [Output("identifier")]
        public Output<string> Identifier { get; private set; } = null!;

        /// <summary>
        /// Name of the resource.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// Unique identifier of the organization.
        /// </summary>
        [Output("orgId")]
        public Output<string?> OrgId { get; private set; } = null!;

        /// <summary>
        /// Unique identifier of the project.
        /// </summary>
        [Output("projectId")]
        public Output<string?> ProjectId { get; private set; } = null!;

        /// <summary>
        /// The cost and usage report name. Provided in the delivery options when the template is opened in the AWS console.
        /// </summary>
        [Output("reportName")]
        public Output<string?> ReportName { get; private set; } = null!;

        /// <summary>
        /// The name of s3 bucket.
        /// </summary>
        [Output("s3Bucket")]
        public Output<string?> S3Bucket { get; private set; } = null!;

        /// <summary>
        /// Tags to associate with the resource.
        /// </summary>
        [Output("tags")]
        public Output<ImmutableArray<string>> Tags { get; private set; } = null!;


        /// <summary>
        /// Create a AwsCCConnector resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public AwsCCConnector(string name, AwsCCConnectorArgs args, CustomResourceOptions? options = null)
            : base("harness:platform/awsCCConnector:AwsCCConnector", name, args ?? new AwsCCConnectorArgs(), MakeResourceOptions(options, ""))
        {
        }

        private AwsCCConnector(string name, Input<string> id, AwsCCConnectorState? state = null, CustomResourceOptions? options = null)
            : base("harness:platform/awsCCConnector:AwsCCConnector", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
                PluginDownloadURL = "github://api.github.com/pulumi",
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing AwsCCConnector resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static AwsCCConnector Get(string name, Input<string> id, AwsCCConnectorState? state = null, CustomResourceOptions? options = null)
        {
            return new AwsCCConnector(name, id, state, options);
        }
    }

    public sealed class AwsCCConnectorArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The AWS account id.
        /// </summary>
        [Input("accountId", required: true)]
        public Input<string> AccountId { get; set; } = null!;

        /// <summary>
        /// Harness uses the secure cross-account role to access your AWS account. The role includes a restricted policy to access the cost and usage reports and resources for the sole purpose of cost analysis and cost optimization.
        /// </summary>
        [Input("crossAccountAccess", required: true)]
        public Input<Inputs.AwsCCConnectorCrossAccountAccessArgs> CrossAccountAccess { get; set; } = null!;

        /// <summary>
        /// Description of the resource.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        [Input("featuresEnableds", required: true)]
        private InputList<string>? _featuresEnableds;

        /// <summary>
        /// The features enabled for the connector. Valid values are BILLING, OPTIMIZATION, VISIBILITY, GOVERNANCE.
        /// </summary>
        public InputList<string> FeaturesEnableds
        {
            get => _featuresEnableds ?? (_featuresEnableds = new InputList<string>());
            set => _featuresEnableds = value;
        }

        /// <summary>
        /// Unique identifier of the resource.
        /// </summary>
        [Input("identifier", required: true)]
        public Input<string> Identifier { get; set; } = null!;

        /// <summary>
        /// Name of the resource.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Unique identifier of the organization.
        /// </summary>
        [Input("orgId")]
        public Input<string>? OrgId { get; set; }

        /// <summary>
        /// Unique identifier of the project.
        /// </summary>
        [Input("projectId")]
        public Input<string>? ProjectId { get; set; }

        /// <summary>
        /// The cost and usage report name. Provided in the delivery options when the template is opened in the AWS console.
        /// </summary>
        [Input("reportName")]
        public Input<string>? ReportName { get; set; }

        /// <summary>
        /// The name of s3 bucket.
        /// </summary>
        [Input("s3Bucket")]
        public Input<string>? S3Bucket { get; set; }

        [Input("tags")]
        private InputList<string>? _tags;

        /// <summary>
        /// Tags to associate with the resource.
        /// </summary>
        public InputList<string> Tags
        {
            get => _tags ?? (_tags = new InputList<string>());
            set => _tags = value;
        }

        public AwsCCConnectorArgs()
        {
        }
        public static new AwsCCConnectorArgs Empty => new AwsCCConnectorArgs();
    }

    public sealed class AwsCCConnectorState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The AWS account id.
        /// </summary>
        [Input("accountId")]
        public Input<string>? AccountId { get; set; }

        /// <summary>
        /// Harness uses the secure cross-account role to access your AWS account. The role includes a restricted policy to access the cost and usage reports and resources for the sole purpose of cost analysis and cost optimization.
        /// </summary>
        [Input("crossAccountAccess")]
        public Input<Inputs.AwsCCConnectorCrossAccountAccessGetArgs>? CrossAccountAccess { get; set; }

        /// <summary>
        /// Description of the resource.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        [Input("featuresEnableds")]
        private InputList<string>? _featuresEnableds;

        /// <summary>
        /// The features enabled for the connector. Valid values are BILLING, OPTIMIZATION, VISIBILITY, GOVERNANCE.
        /// </summary>
        public InputList<string> FeaturesEnableds
        {
            get => _featuresEnableds ?? (_featuresEnableds = new InputList<string>());
            set => _featuresEnableds = value;
        }

        /// <summary>
        /// Unique identifier of the resource.
        /// </summary>
        [Input("identifier")]
        public Input<string>? Identifier { get; set; }

        /// <summary>
        /// Name of the resource.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Unique identifier of the organization.
        /// </summary>
        [Input("orgId")]
        public Input<string>? OrgId { get; set; }

        /// <summary>
        /// Unique identifier of the project.
        /// </summary>
        [Input("projectId")]
        public Input<string>? ProjectId { get; set; }

        /// <summary>
        /// The cost and usage report name. Provided in the delivery options when the template is opened in the AWS console.
        /// </summary>
        [Input("reportName")]
        public Input<string>? ReportName { get; set; }

        /// <summary>
        /// The name of s3 bucket.
        /// </summary>
        [Input("s3Bucket")]
        public Input<string>? S3Bucket { get; set; }

        [Input("tags")]
        private InputList<string>? _tags;

        /// <summary>
        /// Tags to associate with the resource.
        /// </summary>
        public InputList<string> Tags
        {
            get => _tags ?? (_tags = new InputList<string>());
            set => _tags = value;
        }

        public AwsCCConnectorState()
        {
        }
        public static new AwsCCConnectorState Empty => new AwsCCConnectorState();
    }
}
