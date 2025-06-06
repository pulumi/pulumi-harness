// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Harness.Platform.Inputs
{

    public sealed class GetGitopsRepoCredCredInputArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Specifies whether helm-oci support should be enabled for this repo.
        /// </summary>
        [Input("enableOci", required: true)]
        public Input<bool> EnableOci { get; set; } = null!;

        /// <summary>
        /// Specifies the GitHub API URL for GitHub app authentication.
        /// </summary>
        [Input("githubAppEnterpriseBaseUrl", required: true)]
        public Input<string> GithubAppEnterpriseBaseUrl { get; set; } = null!;

        /// <summary>
        /// Specifies the Github App ID of the app used to access the repo for GitHub app authentication.
        /// </summary>
        [Input("githubAppId", required: true)]
        public Input<string> GithubAppId { get; set; } = null!;

        /// <summary>
        /// Specifies the ID of the installed GitHub App for GitHub app authentication.
        /// </summary>
        [Input("githubAppInstallationId", required: true)]
        public Input<string> GithubAppInstallationId { get; set; } = null!;

        [Input("githubAppPrivateKey", required: true)]
        private Input<string>? _githubAppPrivateKey;

        /// <summary>
        /// github*app*private_key specifies the private key PEM data for authentication via GitHub app.
        /// </summary>
        public Input<string>? GithubAppPrivateKey
        {
            get => _githubAppPrivateKey;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _githubAppPrivateKey = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        [Input("password", required: true)]
        private Input<string>? _password;

        /// <summary>
        /// Password or PAT to be used for authenticating the remote repository.
        /// </summary>
        public Input<string>? Password
        {
            get => _password;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _password = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        [Input("sshPrivateKey", required: true)]
        private Input<string>? _sshPrivateKey;

        /// <summary>
        /// SSH Key in PEM format for authenticating the repository. Used only for Git repository.
        /// </summary>
        public Input<string>? SshPrivateKey
        {
            get => _sshPrivateKey;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _sshPrivateKey = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        [Input("tlsClientCertData", required: true)]
        private Input<string>? _tlsClientCertData;

        /// <summary>
        /// Certificate in PEM format for authenticating at the repo server. This is used for mTLS.
        /// </summary>
        public Input<string>? TlsClientCertData
        {
            get => _tlsClientCertData;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _tlsClientCertData = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        [Input("tlsClientCertKey", required: true)]
        private Input<string>? _tlsClientCertKey;

        /// <summary>
        /// Private key in PEM format for authenticating at the repo server. This is used for mTLS.
        /// </summary>
        public Input<string>? TlsClientCertKey
        {
            get => _tlsClientCertKey;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _tlsClientCertKey = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// Type specifies the type of the repoCreds.Can be either 'git' or 'helm. 'git' is assumed if empty or absent
        /// </summary>
        [Input("type", required: true)]
        public Input<string> Type { get; set; } = null!;

        /// <summary>
        /// URL of the remote repository. Make sure you pass at least an org, this will not work if you just provide the host, for eg. "https://github.com"
        /// </summary>
        [Input("url", required: true)]
        public Input<string> Url { get; set; } = null!;

        [Input("username", required: true)]
        private Input<string>? _username;

        /// <summary>
        /// Username to be used for authenticating the remote repository.
        /// </summary>
        public Input<string>? Username
        {
            get => _username;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _username = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        public GetGitopsRepoCredCredInputArgs()
        {
        }
        public static new GetGitopsRepoCredCredInputArgs Empty => new GetGitopsRepoCredCredInputArgs();
    }
}
