// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;
using Pulumi;

namespace Lbrlabs.PulumiPackage.Harness.Platform.Outputs
{

    [OutputType]
    public sealed class ConnectorTasCredentialsTasManualDetails
    {
        public readonly string EndpointUrl;
        public readonly string PasswordRef;
        public readonly string? Username;
        public readonly string? UsernameRef;

        [OutputConstructor]
        private ConnectorTasCredentialsTasManualDetails(
            string endpointUrl,

            string passwordRef,

            string? username,

            string? usernameRef)
        {
            EndpointUrl = endpointUrl;
            PasswordRef = passwordRef;
            Username = username;
            UsernameRef = usernameRef;
        }
    }
}