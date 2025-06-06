// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Harness
{
    /// <summary>
    /// Resource for creating an encrypted text secret
    /// 
    /// ## Example Usage
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Harness = Pulumi.Harness;
    /// using Tls = Pulumi.Tls;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var harnessDeployKey = new Tls.Index.PrivateKey("harness_deploy_key", new()
    ///     {
    ///         Algorithm = "RSA",
    ///         RsaBits = 4096,
    ///     });
    /// 
    ///     var secretManager = Harness.GetSecretManager.Invoke(new()
    ///     {
    ///         Default = true,
    ///     });
    /// 
    ///     var mySecret = new Harness.EncryptedText("my_secret", new()
    ///     {
    ///         Name = "my_secret",
    ///         Value = harnessDeployKey.PrivateKeyPem,
    ///         SecretManagerId = secretManager.Apply(getSecretManagerResult =&gt; getSecretManagerResult.Id),
    ///     });
    /// 
    ///     var sshCreds = new Harness.SshCredential("ssh_creds", new()
    ///     {
    ///         Name = "ssh-test",
    ///         SshAuthentication = new Harness.Inputs.SshCredentialSshAuthenticationArgs
    ///         {
    ///             Port = 22,
    ///             Username = "git",
    ///             InlineSsh = new Harness.Inputs.SshCredentialSshAuthenticationInlineSshArgs
    ///             {
    ///                 SshKeyFileId = mySecret.Id,
    ///             },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Import using the Harness ssh credential id
    /// 
    /// ```sh
    /// $ pulumi import harness:index/sshCredential:SshCredential example &lt;credential_id&gt;
    /// ```
    /// </summary>
    [HarnessResourceType("harness:index/sshCredential:SshCredential")]
    public partial class SshCredential : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Kerberos authentication for SSH. Cannot be used if ssh*authentication is specified
        /// </summary>
        [Output("kerberosAuthentication")]
        public Output<Outputs.SshCredentialKerberosAuthentication?> KerberosAuthentication { get; private set; } = null!;

        /// <summary>
        /// Name of the encrypted text secret
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// Authentication method for SSH. Cannot be used if kerberos*authentication is specified. Only one of `inline_ssh`, `server_password`, or `ssh_key_file` should be set
        /// </summary>
        [Output("sshAuthentication")]
        public Output<Outputs.SshCredentialSshAuthentication?> SshAuthentication { get; private set; } = null!;

        /// <summary>
        /// This block is used for scoping the resource to a specific set of applications or environments.
        /// </summary>
        [Output("usageScopes")]
        public Output<ImmutableArray<Outputs.SshCredentialUsageScope>> UsageScopes { get; private set; } = null!;


        /// <summary>
        /// Create a SshCredential resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public SshCredential(string name, SshCredentialArgs? args = null, CustomResourceOptions? options = null)
            : base("harness:index/sshCredential:SshCredential", name, args ?? new SshCredentialArgs(), MakeResourceOptions(options, ""))
        {
        }

        private SshCredential(string name, Input<string> id, SshCredentialState? state = null, CustomResourceOptions? options = null)
            : base("harness:index/sshCredential:SshCredential", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing SshCredential resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static SshCredential Get(string name, Input<string> id, SshCredentialState? state = null, CustomResourceOptions? options = null)
        {
            return new SshCredential(name, id, state, options);
        }
    }

    public sealed class SshCredentialArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Kerberos authentication for SSH. Cannot be used if ssh*authentication is specified
        /// </summary>
        [Input("kerberosAuthentication")]
        public Input<Inputs.SshCredentialKerberosAuthenticationArgs>? KerberosAuthentication { get; set; }

        /// <summary>
        /// Name of the encrypted text secret
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Authentication method for SSH. Cannot be used if kerberos*authentication is specified. Only one of `inline_ssh`, `server_password`, or `ssh_key_file` should be set
        /// </summary>
        [Input("sshAuthentication")]
        public Input<Inputs.SshCredentialSshAuthenticationArgs>? SshAuthentication { get; set; }

        [Input("usageScopes")]
        private InputList<Inputs.SshCredentialUsageScopeArgs>? _usageScopes;

        /// <summary>
        /// This block is used for scoping the resource to a specific set of applications or environments.
        /// </summary>
        public InputList<Inputs.SshCredentialUsageScopeArgs> UsageScopes
        {
            get => _usageScopes ?? (_usageScopes = new InputList<Inputs.SshCredentialUsageScopeArgs>());
            set => _usageScopes = value;
        }

        public SshCredentialArgs()
        {
        }
        public static new SshCredentialArgs Empty => new SshCredentialArgs();
    }

    public sealed class SshCredentialState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Kerberos authentication for SSH. Cannot be used if ssh*authentication is specified
        /// </summary>
        [Input("kerberosAuthentication")]
        public Input<Inputs.SshCredentialKerberosAuthenticationGetArgs>? KerberosAuthentication { get; set; }

        /// <summary>
        /// Name of the encrypted text secret
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Authentication method for SSH. Cannot be used if kerberos*authentication is specified. Only one of `inline_ssh`, `server_password`, or `ssh_key_file` should be set
        /// </summary>
        [Input("sshAuthentication")]
        public Input<Inputs.SshCredentialSshAuthenticationGetArgs>? SshAuthentication { get; set; }

        [Input("usageScopes")]
        private InputList<Inputs.SshCredentialUsageScopeGetArgs>? _usageScopes;

        /// <summary>
        /// This block is used for scoping the resource to a specific set of applications or environments.
        /// </summary>
        public InputList<Inputs.SshCredentialUsageScopeGetArgs> UsageScopes
        {
            get => _usageScopes ?? (_usageScopes = new InputList<Inputs.SshCredentialUsageScopeGetArgs>());
            set => _usageScopes = value;
        }

        public SshCredentialState()
        {
        }
        public static new SshCredentialState Empty => new SshCredentialState();
    }
}
