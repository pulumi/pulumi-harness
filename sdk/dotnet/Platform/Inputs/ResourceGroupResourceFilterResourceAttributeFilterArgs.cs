// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Harness.Platform.Inputs
{

    public sealed class ResourceGroupResourceFilterResourceAttributeFilterArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Name of the attribute. Valid values are `category`, `type`, `labels`, `tag` or `tags`.
        /// </summary>
        [Input("attributeName")]
        public Input<string>? AttributeName { get; set; }

        [Input("attributeValues")]
        private InputList<string>? _attributeValues;

        /// <summary>
        /// Value of the attributes.Valid values for `category` are [ARTIFACTORY,CLOUD*COST,CLOUD*PROVIDER,CODE*REPO,MONITORING,SECRET*MANAGER,TICKETING], for `type` are [Production,PreProduction], for `labels`, it can be using the syntax 'label:value', for `tag` or `tags` it can be any string.
        /// </summary>
        public InputList<string> AttributeValues
        {
            get => _attributeValues ?? (_attributeValues = new InputList<string>());
            set => _attributeValues = value;
        }

        public ResourceGroupResourceFilterResourceAttributeFilterArgs()
        {
        }
        public static new ResourceGroupResourceFilterResourceAttributeFilterArgs Empty => new ResourceGroupResourceFilterResourceAttributeFilterArgs();
    }
}
