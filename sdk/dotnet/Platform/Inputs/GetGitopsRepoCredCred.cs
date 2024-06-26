// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Harness.Platform.Inputs
{

    public sealed class GetGitopsRepoCredCredArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Specifies whether helm-oci support should be enabled for this repo.
        /// </summary>
        [Input("enableOci")]
        public bool? EnableOci { get; set; }

        /// <summary>
        /// Specifies the GitHub API URL for GitHub app authentication.
        /// </summary>
        [Input("githubAppEnterpriseBaseUrl")]
        public string? GithubAppEnterpriseBaseUrl { get; set; }

        /// <summary>
        /// Specifies the Github App ID of the app used to access the repo for GitHub app authentication.
        /// </summary>
        [Input("githubAppId")]
        public string? GithubAppId { get; set; }

        /// <summary>
        /// Specifies the ID of the installed GitHub App for GitHub app authentication.
        /// </summary>
        [Input("githubAppInstallationId")]
        public string? GithubAppInstallationId { get; set; }

        /// <summary>
        /// github*app*private_key specifies the private key PEM data for authentication via GitHub app.
        /// </summary>
        [Input("githubAppPrivateKey")]
        public string? GithubAppPrivateKey { get; set; }

        /// <summary>
        /// Password for authenticating at the repo server.
        /// </summary>
        [Input("password")]
        public string? Password { get; set; }

        /// <summary>
        /// Contains the private key data for authenticating at the repo server using SSH (only Git repos).
        /// </summary>
        [Input("sshPrivateKey")]
        public string? SshPrivateKey { get; set; }

        /// <summary>
        /// Specifies the TLS client cert data for authenticating at the repo server.
        /// </summary>
        [Input("tlsClientCertData")]
        public string? TlsClientCertData { get; set; }

        /// <summary>
        /// Specifies the TLS client cert key for authenticating at the repo server.
        /// </summary>
        [Input("tlsClientCertKey")]
        public string? TlsClientCertKey { get; set; }

        /// <summary>
        /// Type specifies the type of the repoCreds.Can be either 'git' or 'helm. 'git' is assumed if empty or absent
        /// </summary>
        [Input("type")]
        public string? Type { get; set; }

        /// <summary>
        /// url representing this object.
        /// </summary>
        [Input("url")]
        public string? Url { get; set; }

        /// <summary>
        /// Username for authenticating at the repo server.
        /// </summary>
        [Input("username")]
        public string? Username { get; set; }

        public GetGitopsRepoCredCredArgs()
        {
        }
        public static new GetGitopsRepoCredCredArgs Empty => new GetGitopsRepoCredCredArgs();
    }
}
