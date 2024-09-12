// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.harness.inputs.SshCredentialKerberosAuthenticationArgs;
import com.pulumi.harness.inputs.SshCredentialSshAuthenticationArgs;
import com.pulumi.harness.inputs.SshCredentialUsageScopeArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SshCredentialArgs extends com.pulumi.resources.ResourceArgs {

    public static final SshCredentialArgs Empty = new SshCredentialArgs();

    /**
     * Kerberos authentication for SSH. Cannot be used if ssh*authentication is specified
     * 
     */
    @Import(name="kerberosAuthentication")
    private @Nullable Output<SshCredentialKerberosAuthenticationArgs> kerberosAuthentication;

    /**
     * @return Kerberos authentication for SSH. Cannot be used if ssh*authentication is specified
     * 
     */
    public Optional<Output<SshCredentialKerberosAuthenticationArgs>> kerberosAuthentication() {
        return Optional.ofNullable(this.kerberosAuthentication);
    }

    /**
     * Name of the encrypted text secret
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Name of the encrypted text secret
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Authentication method for SSH. Cannot be used if kerberos*authentication is specified. Only one of `inline_ssh`, `server_password`, or `ssh_key_file` should be set
     * 
     */
    @Import(name="sshAuthentication")
    private @Nullable Output<SshCredentialSshAuthenticationArgs> sshAuthentication;

    /**
     * @return Authentication method for SSH. Cannot be used if kerberos*authentication is specified. Only one of `inline_ssh`, `server_password`, or `ssh_key_file` should be set
     * 
     */
    public Optional<Output<SshCredentialSshAuthenticationArgs>> sshAuthentication() {
        return Optional.ofNullable(this.sshAuthentication);
    }

    /**
     * This block is used for scoping the resource to a specific set of applications or environments.
     * 
     */
    @Import(name="usageScopes")
    private @Nullable Output<List<SshCredentialUsageScopeArgs>> usageScopes;

    /**
     * @return This block is used for scoping the resource to a specific set of applications or environments.
     * 
     */
    public Optional<Output<List<SshCredentialUsageScopeArgs>>> usageScopes() {
        return Optional.ofNullable(this.usageScopes);
    }

    private SshCredentialArgs() {}

    private SshCredentialArgs(SshCredentialArgs $) {
        this.kerberosAuthentication = $.kerberosAuthentication;
        this.name = $.name;
        this.sshAuthentication = $.sshAuthentication;
        this.usageScopes = $.usageScopes;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SshCredentialArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SshCredentialArgs $;

        public Builder() {
            $ = new SshCredentialArgs();
        }

        public Builder(SshCredentialArgs defaults) {
            $ = new SshCredentialArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param kerberosAuthentication Kerberos authentication for SSH. Cannot be used if ssh*authentication is specified
         * 
         * @return builder
         * 
         */
        public Builder kerberosAuthentication(@Nullable Output<SshCredentialKerberosAuthenticationArgs> kerberosAuthentication) {
            $.kerberosAuthentication = kerberosAuthentication;
            return this;
        }

        /**
         * @param kerberosAuthentication Kerberos authentication for SSH. Cannot be used if ssh*authentication is specified
         * 
         * @return builder
         * 
         */
        public Builder kerberosAuthentication(SshCredentialKerberosAuthenticationArgs kerberosAuthentication) {
            return kerberosAuthentication(Output.of(kerberosAuthentication));
        }

        /**
         * @param name Name of the encrypted text secret
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of the encrypted text secret
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param sshAuthentication Authentication method for SSH. Cannot be used if kerberos*authentication is specified. Only one of `inline_ssh`, `server_password`, or `ssh_key_file` should be set
         * 
         * @return builder
         * 
         */
        public Builder sshAuthentication(@Nullable Output<SshCredentialSshAuthenticationArgs> sshAuthentication) {
            $.sshAuthentication = sshAuthentication;
            return this;
        }

        /**
         * @param sshAuthentication Authentication method for SSH. Cannot be used if kerberos*authentication is specified. Only one of `inline_ssh`, `server_password`, or `ssh_key_file` should be set
         * 
         * @return builder
         * 
         */
        public Builder sshAuthentication(SshCredentialSshAuthenticationArgs sshAuthentication) {
            return sshAuthentication(Output.of(sshAuthentication));
        }

        /**
         * @param usageScopes This block is used for scoping the resource to a specific set of applications or environments.
         * 
         * @return builder
         * 
         */
        public Builder usageScopes(@Nullable Output<List<SshCredentialUsageScopeArgs>> usageScopes) {
            $.usageScopes = usageScopes;
            return this;
        }

        /**
         * @param usageScopes This block is used for scoping the resource to a specific set of applications or environments.
         * 
         * @return builder
         * 
         */
        public Builder usageScopes(List<SshCredentialUsageScopeArgs> usageScopes) {
            return usageScopes(Output.of(usageScopes));
        }

        /**
         * @param usageScopes This block is used for scoping the resource to a specific set of applications or environments.
         * 
         * @return builder
         * 
         */
        public Builder usageScopes(SshCredentialUsageScopeArgs... usageScopes) {
            return usageScopes(List.of(usageScopes));
        }

        public SshCredentialArgs build() {
            return $;
        }
    }

}