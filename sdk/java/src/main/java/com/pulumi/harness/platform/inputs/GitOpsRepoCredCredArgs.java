// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GitOpsRepoCredCredArgs extends com.pulumi.resources.ResourceArgs {

    public static final GitOpsRepoCredCredArgs Empty = new GitOpsRepoCredCredArgs();

    /**
     * Specifies whether helm-oci support should be enabled for this repo.
     * 
     */
    @Import(name="enableOci")
    private @Nullable Output<Boolean> enableOci;

    /**
     * @return Specifies whether helm-oci support should be enabled for this repo.
     * 
     */
    public Optional<Output<Boolean>> enableOci() {
        return Optional.ofNullable(this.enableOci);
    }

    /**
     * Specifies the GitHub API URL for GitHub app authentication.
     * 
     */
    @Import(name="githubAppEnterpriseBaseUrl")
    private @Nullable Output<String> githubAppEnterpriseBaseUrl;

    /**
     * @return Specifies the GitHub API URL for GitHub app authentication.
     * 
     */
    public Optional<Output<String>> githubAppEnterpriseBaseUrl() {
        return Optional.ofNullable(this.githubAppEnterpriseBaseUrl);
    }

    /**
     * Specifies the Github App ID of the app used to access the repo for GitHub app authentication.
     * 
     */
    @Import(name="githubAppId")
    private @Nullable Output<String> githubAppId;

    /**
     * @return Specifies the Github App ID of the app used to access the repo for GitHub app authentication.
     * 
     */
    public Optional<Output<String>> githubAppId() {
        return Optional.ofNullable(this.githubAppId);
    }

    /**
     * Specifies the ID of the installed GitHub App for GitHub app authentication.
     * 
     */
    @Import(name="githubAppInstallationId")
    private @Nullable Output<String> githubAppInstallationId;

    /**
     * @return Specifies the ID of the installed GitHub App for GitHub app authentication.
     * 
     */
    public Optional<Output<String>> githubAppInstallationId() {
        return Optional.ofNullable(this.githubAppInstallationId);
    }

    /**
     * github*app*private_key specifies the private key PEM data for authentication via GitHub app.
     * 
     */
    @Import(name="githubAppPrivateKey")
    private @Nullable Output<String> githubAppPrivateKey;

    /**
     * @return github*app*private_key specifies the private key PEM data for authentication via GitHub app.
     * 
     */
    public Optional<Output<String>> githubAppPrivateKey() {
        return Optional.ofNullable(this.githubAppPrivateKey);
    }

    /**
     * Password or PAT to be used for authenticating the remote repository.
     * 
     */
    @Import(name="password")
    private @Nullable Output<String> password;

    /**
     * @return Password or PAT to be used for authenticating the remote repository.
     * 
     */
    public Optional<Output<String>> password() {
        return Optional.ofNullable(this.password);
    }

    /**
     * SSH Key in PEM format for authenticating the repository. Used only for Git repository.
     * 
     */
    @Import(name="sshPrivateKey")
    private @Nullable Output<String> sshPrivateKey;

    /**
     * @return SSH Key in PEM format for authenticating the repository. Used only for Git repository.
     * 
     */
    public Optional<Output<String>> sshPrivateKey() {
        return Optional.ofNullable(this.sshPrivateKey);
    }

    /**
     * Certificate in PEM format for authenticating at the repo server. This is used for mTLS.
     * 
     */
    @Import(name="tlsClientCertData")
    private @Nullable Output<String> tlsClientCertData;

    /**
     * @return Certificate in PEM format for authenticating at the repo server. This is used for mTLS.
     * 
     */
    public Optional<Output<String>> tlsClientCertData() {
        return Optional.ofNullable(this.tlsClientCertData);
    }

    /**
     * Private key in PEM format for authenticating at the repo server. This is used for mTLS.
     * 
     */
    @Import(name="tlsClientCertKey")
    private @Nullable Output<String> tlsClientCertKey;

    /**
     * @return Private key in PEM format for authenticating at the repo server. This is used for mTLS.
     * 
     */
    public Optional<Output<String>> tlsClientCertKey() {
        return Optional.ofNullable(this.tlsClientCertKey);
    }

    /**
     * Type specifies the type of the repoCreds.Can be either &#39;git&#39; or &#39;helm. &#39;git&#39; is assumed if empty or absent
     * 
     */
    @Import(name="type")
    private @Nullable Output<String> type;

    /**
     * @return Type specifies the type of the repoCreds.Can be either &#39;git&#39; or &#39;helm. &#39;git&#39; is assumed if empty or absent
     * 
     */
    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    /**
     * URL of the remote repository. Make sure you pass at least an org, this will not work if you just provide the host, for eg. &#34;https://github.com&#34;
     * 
     */
    @Import(name="url")
    private @Nullable Output<String> url;

    /**
     * @return URL of the remote repository. Make sure you pass at least an org, this will not work if you just provide the host, for eg. &#34;https://github.com&#34;
     * 
     */
    public Optional<Output<String>> url() {
        return Optional.ofNullable(this.url);
    }

    /**
     * Username to be used for authenticating the remote repository.
     * 
     */
    @Import(name="username")
    private @Nullable Output<String> username;

    /**
     * @return Username to be used for authenticating the remote repository.
     * 
     */
    public Optional<Output<String>> username() {
        return Optional.ofNullable(this.username);
    }

    private GitOpsRepoCredCredArgs() {}

    private GitOpsRepoCredCredArgs(GitOpsRepoCredCredArgs $) {
        this.enableOci = $.enableOci;
        this.githubAppEnterpriseBaseUrl = $.githubAppEnterpriseBaseUrl;
        this.githubAppId = $.githubAppId;
        this.githubAppInstallationId = $.githubAppInstallationId;
        this.githubAppPrivateKey = $.githubAppPrivateKey;
        this.password = $.password;
        this.sshPrivateKey = $.sshPrivateKey;
        this.tlsClientCertData = $.tlsClientCertData;
        this.tlsClientCertKey = $.tlsClientCertKey;
        this.type = $.type;
        this.url = $.url;
        this.username = $.username;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GitOpsRepoCredCredArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GitOpsRepoCredCredArgs $;

        public Builder() {
            $ = new GitOpsRepoCredCredArgs();
        }

        public Builder(GitOpsRepoCredCredArgs defaults) {
            $ = new GitOpsRepoCredCredArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param enableOci Specifies whether helm-oci support should be enabled for this repo.
         * 
         * @return builder
         * 
         */
        public Builder enableOci(@Nullable Output<Boolean> enableOci) {
            $.enableOci = enableOci;
            return this;
        }

        /**
         * @param enableOci Specifies whether helm-oci support should be enabled for this repo.
         * 
         * @return builder
         * 
         */
        public Builder enableOci(Boolean enableOci) {
            return enableOci(Output.of(enableOci));
        }

        /**
         * @param githubAppEnterpriseBaseUrl Specifies the GitHub API URL for GitHub app authentication.
         * 
         * @return builder
         * 
         */
        public Builder githubAppEnterpriseBaseUrl(@Nullable Output<String> githubAppEnterpriseBaseUrl) {
            $.githubAppEnterpriseBaseUrl = githubAppEnterpriseBaseUrl;
            return this;
        }

        /**
         * @param githubAppEnterpriseBaseUrl Specifies the GitHub API URL for GitHub app authentication.
         * 
         * @return builder
         * 
         */
        public Builder githubAppEnterpriseBaseUrl(String githubAppEnterpriseBaseUrl) {
            return githubAppEnterpriseBaseUrl(Output.of(githubAppEnterpriseBaseUrl));
        }

        /**
         * @param githubAppId Specifies the Github App ID of the app used to access the repo for GitHub app authentication.
         * 
         * @return builder
         * 
         */
        public Builder githubAppId(@Nullable Output<String> githubAppId) {
            $.githubAppId = githubAppId;
            return this;
        }

        /**
         * @param githubAppId Specifies the Github App ID of the app used to access the repo for GitHub app authentication.
         * 
         * @return builder
         * 
         */
        public Builder githubAppId(String githubAppId) {
            return githubAppId(Output.of(githubAppId));
        }

        /**
         * @param githubAppInstallationId Specifies the ID of the installed GitHub App for GitHub app authentication.
         * 
         * @return builder
         * 
         */
        public Builder githubAppInstallationId(@Nullable Output<String> githubAppInstallationId) {
            $.githubAppInstallationId = githubAppInstallationId;
            return this;
        }

        /**
         * @param githubAppInstallationId Specifies the ID of the installed GitHub App for GitHub app authentication.
         * 
         * @return builder
         * 
         */
        public Builder githubAppInstallationId(String githubAppInstallationId) {
            return githubAppInstallationId(Output.of(githubAppInstallationId));
        }

        /**
         * @param githubAppPrivateKey github*app*private_key specifies the private key PEM data for authentication via GitHub app.
         * 
         * @return builder
         * 
         */
        public Builder githubAppPrivateKey(@Nullable Output<String> githubAppPrivateKey) {
            $.githubAppPrivateKey = githubAppPrivateKey;
            return this;
        }

        /**
         * @param githubAppPrivateKey github*app*private_key specifies the private key PEM data for authentication via GitHub app.
         * 
         * @return builder
         * 
         */
        public Builder githubAppPrivateKey(String githubAppPrivateKey) {
            return githubAppPrivateKey(Output.of(githubAppPrivateKey));
        }

        /**
         * @param password Password or PAT to be used for authenticating the remote repository.
         * 
         * @return builder
         * 
         */
        public Builder password(@Nullable Output<String> password) {
            $.password = password;
            return this;
        }

        /**
         * @param password Password or PAT to be used for authenticating the remote repository.
         * 
         * @return builder
         * 
         */
        public Builder password(String password) {
            return password(Output.of(password));
        }

        /**
         * @param sshPrivateKey SSH Key in PEM format for authenticating the repository. Used only for Git repository.
         * 
         * @return builder
         * 
         */
        public Builder sshPrivateKey(@Nullable Output<String> sshPrivateKey) {
            $.sshPrivateKey = sshPrivateKey;
            return this;
        }

        /**
         * @param sshPrivateKey SSH Key in PEM format for authenticating the repository. Used only for Git repository.
         * 
         * @return builder
         * 
         */
        public Builder sshPrivateKey(String sshPrivateKey) {
            return sshPrivateKey(Output.of(sshPrivateKey));
        }

        /**
         * @param tlsClientCertData Certificate in PEM format for authenticating at the repo server. This is used for mTLS.
         * 
         * @return builder
         * 
         */
        public Builder tlsClientCertData(@Nullable Output<String> tlsClientCertData) {
            $.tlsClientCertData = tlsClientCertData;
            return this;
        }

        /**
         * @param tlsClientCertData Certificate in PEM format for authenticating at the repo server. This is used for mTLS.
         * 
         * @return builder
         * 
         */
        public Builder tlsClientCertData(String tlsClientCertData) {
            return tlsClientCertData(Output.of(tlsClientCertData));
        }

        /**
         * @param tlsClientCertKey Private key in PEM format for authenticating at the repo server. This is used for mTLS.
         * 
         * @return builder
         * 
         */
        public Builder tlsClientCertKey(@Nullable Output<String> tlsClientCertKey) {
            $.tlsClientCertKey = tlsClientCertKey;
            return this;
        }

        /**
         * @param tlsClientCertKey Private key in PEM format for authenticating at the repo server. This is used for mTLS.
         * 
         * @return builder
         * 
         */
        public Builder tlsClientCertKey(String tlsClientCertKey) {
            return tlsClientCertKey(Output.of(tlsClientCertKey));
        }

        /**
         * @param type Type specifies the type of the repoCreds.Can be either &#39;git&#39; or &#39;helm. &#39;git&#39; is assumed if empty or absent
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type Type specifies the type of the repoCreds.Can be either &#39;git&#39; or &#39;helm. &#39;git&#39; is assumed if empty or absent
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        /**
         * @param url URL of the remote repository. Make sure you pass at least an org, this will not work if you just provide the host, for eg. &#34;https://github.com&#34;
         * 
         * @return builder
         * 
         */
        public Builder url(@Nullable Output<String> url) {
            $.url = url;
            return this;
        }

        /**
         * @param url URL of the remote repository. Make sure you pass at least an org, this will not work if you just provide the host, for eg. &#34;https://github.com&#34;
         * 
         * @return builder
         * 
         */
        public Builder url(String url) {
            return url(Output.of(url));
        }

        /**
         * @param username Username to be used for authenticating the remote repository.
         * 
         * @return builder
         * 
         */
        public Builder username(@Nullable Output<String> username) {
            $.username = username;
            return this;
        }

        /**
         * @param username Username to be used for authenticating the remote repository.
         * 
         * @return builder
         * 
         */
        public Builder username(String username) {
            return username(Output.of(username));
        }

        public GitOpsRepoCredCredArgs build() {
            return $;
        }
    }

}
