// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Harness.Platform.Inputs
{

    public sealed class GithubConnectorCredentialsHttpGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("anonymouses")]
        private InputList<Inputs.GithubConnectorCredentialsHttpAnonymouseGetArgs>? _anonymouses;

        /// <summary>
        /// Configuration for using the http anonymous github for interacting with the github api.
        /// </summary>
        public InputList<Inputs.GithubConnectorCredentialsHttpAnonymouseGetArgs> Anonymouses
        {
            get => _anonymouses ?? (_anonymouses = new InputList<Inputs.GithubConnectorCredentialsHttpAnonymouseGetArgs>());
            set => _anonymouses = value;
        }

        /// <summary>
        /// Configuration for using the github app for interacting with the github api.
        /// </summary>
        [Input("githubApp")]
        public Input<Inputs.GithubConnectorCredentialsHttpGithubAppGetArgs>? GithubApp { get; set; }

        /// <summary>
        /// Reference to a secret containing the personal access to use for authentication. To reference a secret at the organization scope, prefix 'org' to the expression: org.{identifier}. To reference a secret at the account scope, prefix 'account` to the expression: account.{identifier}.
        /// </summary>
        [Input("tokenRef")]
        public Input<string>? TokenRef { get; set; }

        /// <summary>
        /// Username to use for authentication.
        /// </summary>
        [Input("username")]
        public Input<string>? Username { get; set; }

        /// <summary>
        /// Reference to a secret containing the username to use for authentication. To reference a secret at the organization scope, prefix 'org' to the expression: org.{identifier}. To reference a secret at the account scope, prefix 'account` to the expression: account.{identifier}.
        /// </summary>
        [Input("usernameRef")]
        public Input<string>? UsernameRef { get; set; }

        public GithubConnectorCredentialsHttpGetArgs()
        {
        }
        public static new GithubConnectorCredentialsHttpGetArgs Empty => new GithubConnectorCredentialsHttpGetArgs();
    }
}
