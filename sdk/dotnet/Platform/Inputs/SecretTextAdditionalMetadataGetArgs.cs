// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Harness.Platform.Inputs
{

    public sealed class SecretTextAdditionalMetadataGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("values")]
        private InputList<Inputs.SecretTextAdditionalMetadataValueGetArgs>? _values;
        public InputList<Inputs.SecretTextAdditionalMetadataValueGetArgs> Values
        {
            get => _values ?? (_values = new InputList<Inputs.SecretTextAdditionalMetadataValueGetArgs>());
            set => _values = value;
        }

        public SecretTextAdditionalMetadataGetArgs()
        {
        }
        public static new SecretTextAdditionalMetadataGetArgs Empty => new SecretTextAdditionalMetadataGetArgs();
    }
}
