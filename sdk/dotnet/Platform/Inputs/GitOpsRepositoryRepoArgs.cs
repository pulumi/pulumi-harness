// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Harness.Platform.Inputs
{

    public sealed class GitOpsRepositoryRepoArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Identifies the authentication method used to connect to the repository. Possible values: "HTTPS" "SSH" "GITHUB" "HTTPS*ANONYMOUS*CONNECTION_TYPE"
        /// </summary>
        [Input("connectionType", required: true)]
        public Input<string> ConnectionType { get; set; } = null!;

        /// <summary>
        /// Indicates if git-lfs support must be enabled for this repo. This is valid only for Git repositories.
        /// </summary>
        [Input("enableLfs")]
        public Input<bool>? EnableLfs { get; set; }

        /// <summary>
        /// Indicates if helm-oci support must be enabled for this repo.
        /// </summary>
        [Input("enableOci")]
        public Input<bool>? EnableOci { get; set; }

        /// <summary>
        /// Base URL of GitHub Enterprise installation. If left empty, this defaults to https://api.github.com.
        /// </summary>
        [Input("githubAppEnterpriseBaseUrl")]
        public Input<string>? GithubAppEnterpriseBaseUrl { get; set; }

        /// <summary>
        /// Id of the GitHub app used to access the repo.
        /// </summary>
        [Input("githubAppId")]
        public Input<string>? GithubAppId { get; set; }

        /// <summary>
        /// Installation id of the GitHub app used to access the repo.
        /// </summary>
        [Input("githubAppInstallationId")]
        public Input<string>? GithubAppInstallationId { get; set; }

        /// <summary>
        /// GitHub app private key PEM data.
        /// </summary>
        [Input("githubAppPrivateKey")]
        public Input<string>? GithubAppPrivateKey { get; set; }

        /// <summary>
        /// Indicates if the credentials were inherited from a repository credential.
        /// </summary>
        [Input("inheritedCreds")]
        public Input<bool>? InheritedCreds { get; set; }

        /// <summary>
        /// Indicates if the connection to the repository ignores any errors when verifying TLS certificates or SSH host keys.
        /// </summary>
        [Input("insecure")]
        public Input<bool>? Insecure { get; set; }

        /// <summary>
        /// Indicates if InsecureIgnoreHostKey should be used. Insecure is favored used only for git repos. Deprecated.
        /// </summary>
        [Input("insecureIgnoreHostKey")]
        public Input<bool>? InsecureIgnoreHostKey { get; set; }

        /// <summary>
        /// Name to be used for this repo. Only used with Helm repos.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Password or PAT to be used for authenticating the remote repository.
        /// </summary>
        [Input("password")]
        public Input<string>? Password { get; set; }

        /// <summary>
        /// The ArgoCD project name corresponding to this GitOps repository. An empty string means that the GitOps repository belongs to the default project created by Harness.
        /// </summary>
        [Input("project")]
        public Input<string>? Project { get; set; }

        /// <summary>
        /// The HTTP/HTTPS proxy used to access the repo.
        /// </summary>
        [Input("proxy")]
        public Input<string>? Proxy { get; set; }

        /// <summary>
        /// URL to the remote repository.
        /// </summary>
        [Input("repo", required: true)]
        public Input<string> Repo { get; set; } = null!;

        /// <summary>
        /// SSH Key in PEM format for authenticating the repository. Used only for Git repository.
        /// </summary>
        [Input("sshPrivateKey")]
        public Input<string>? SshPrivateKey { get; set; }

        /// <summary>
        /// Certificate in PEM format for authenticating at the repo server. This is used for mTLS. The value should be base64 encoded.
        /// </summary>
        [Input("tlsClientCertData")]
        public Input<string>? TlsClientCertData { get; set; }

        /// <summary>
        /// Private key in PEM format for authenticating at the repo server. This is used for mTLS. The value should be base64 encoded.
        /// </summary>
        [Input("tlsClientCertKey")]
        public Input<string>? TlsClientCertKey { get; set; }

        /// <summary>
        /// Type specifies the type of the repo. Can be either "git" or "helm. "git" is assumed if empty or absent.
        /// </summary>
        [Input("type_")]
        public Input<string>? Type_ { get; set; }

        /// <summary>
        /// Username to be used for authenticating the remote repository.
        /// </summary>
        [Input("username")]
        public Input<string>? Username { get; set; }

        public GitOpsRepositoryRepoArgs()
        {
        }
        public static new GitOpsRepositoryRepoArgs Empty => new GitOpsRepositoryRepoArgs();
    }
}
