// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Harness.Platform.Outputs
{

    [OutputType]
    public sealed class GetSecretSshkeyKerberoTgtKeyTabFilePathSpecResult
    {
        /// <summary>
        /// key path
        /// </summary>
        public readonly string KeyPath;

        [OutputConstructor]
        private GetSecretSshkeyKerberoTgtKeyTabFilePathSpecResult(string keyPath)
        {
            KeyPath = keyPath;
        }
    }
}
