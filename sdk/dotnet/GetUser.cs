// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Harness
{
    public static class GetUser
    {
        /// <summary>
        /// Data source for retrieving a Harness user
        /// </summary>
        public static Task<GetUserResult> InvokeAsync(GetUserArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetUserResult>("harness:index/getUser:getUser", args ?? new GetUserArgs(), options.WithDefaults());

        /// <summary>
        /// Data source for retrieving a Harness user
        /// </summary>
        public static Output<GetUserResult> Invoke(GetUserInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetUserResult>("harness:index/getUser:getUser", args ?? new GetUserInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetUserArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The email of the user.
        /// </summary>
        [Input("email")]
        public string? Email { get; set; }

        /// <summary>
        /// Unique identifier of the user
        /// </summary>
        [Input("id")]
        public string? Id { get; set; }

        public GetUserArgs()
        {
        }
        public static new GetUserArgs Empty => new GetUserArgs();
    }

    public sealed class GetUserInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The email of the user.
        /// </summary>
        [Input("email")]
        public Input<string>? Email { get; set; }

        /// <summary>
        /// Unique identifier of the user
        /// </summary>
        [Input("id")]
        public Input<string>? Id { get; set; }

        public GetUserInvokeArgs()
        {
        }
        public static new GetUserInvokeArgs Empty => new GetUserInvokeArgs();
    }


    [OutputType]
    public sealed class GetUserResult
    {
        /// <summary>
        /// The email of the user.
        /// </summary>
        public readonly string? Email;
        /// <summary>
        /// Unique identifier of the user
        /// </summary>
        public readonly string? Id;
        /// <summary>
        /// Flag indicating whether or not the users email has been verified.
        /// </summary>
        public readonly bool IsEmailVerified;
        /// <summary>
        /// Flag indicating whether or not the user was imported from an identity provider.
        /// </summary>
        public readonly bool IsImportedFromIdentityProvider;
        /// <summary>
        /// Flag indicating whether or not the users password has expired.
        /// </summary>
        public readonly bool IsPasswordExpired;
        /// <summary>
        /// Flag indicating whether or not two-factor authentication is enabled for the user.
        /// </summary>
        public readonly bool IsTwoFactorAuthEnabled;
        /// <summary>
        /// Flag indicating whether or not the user is locked out.
        /// </summary>
        public readonly bool IsUserLocked;
        /// <summary>
        /// The name of the user.
        /// </summary>
        public readonly string Name;

        [OutputConstructor]
        private GetUserResult(
            string? email,

            string? id,

            bool isEmailVerified,

            bool isImportedFromIdentityProvider,

            bool isPasswordExpired,

            bool isTwoFactorAuthEnabled,

            bool isUserLocked,

            string name)
        {
            Email = email;
            Id = id;
            IsEmailVerified = isEmailVerified;
            IsImportedFromIdentityProvider = isImportedFromIdentityProvider;
            IsPasswordExpired = isPasswordExpired;
            IsTwoFactorAuthEnabled = isTwoFactorAuthEnabled;
            IsUserLocked = isUserLocked;
            Name = name;
        }
    }
}