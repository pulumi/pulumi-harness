// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Harness.Platform.Inputs
{

    public sealed class JenkinsConnectorAuthGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Authenticate to App Dynamics using bearer token.
        /// </summary>
        [Input("jenkinsBearerToken")]
        public Input<Inputs.JenkinsConnectorAuthJenkinsBearerTokenGetArgs>? JenkinsBearerToken { get; set; }

        /// <summary>
        /// Authenticate to App Dynamics using user name and password.
        /// </summary>
        [Input("jenkinsUserNamePassword")]
        public Input<Inputs.JenkinsConnectorAuthJenkinsUserNamePasswordGetArgs>? JenkinsUserNamePassword { get; set; }

        /// <summary>
        /// Can be one of UsernamePassword, Anonymous, Bearer Token(HTTP Header)
        /// </summary>
        [Input("type", required: true)]
        public Input<string> Type { get; set; } = null!;

        public JenkinsConnectorAuthGetArgs()
        {
        }
        public static new JenkinsConnectorAuthGetArgs Empty => new JenkinsConnectorAuthGetArgs();
    }
}
