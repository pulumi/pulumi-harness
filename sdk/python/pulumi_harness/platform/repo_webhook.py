# coding=utf-8
# *** WARNING: this file was generated by pulumi-language-python. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import builtins as _builtins
import warnings
import sys
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
if sys.version_info >= (3, 11):
    from typing import NotRequired, TypedDict, TypeAlias
else:
    from typing_extensions import NotRequired, TypedDict, TypeAlias
from .. import _utilities

__all__ = ['RepoWebhookArgs', 'RepoWebhook']

@pulumi.input_type
class RepoWebhookArgs:
    def __init__(__self__, *,
                 enabled: pulumi.Input[_builtins.bool],
                 identifier: pulumi.Input[_builtins.str],
                 insecure: pulumi.Input[_builtins.bool],
                 repo_identifier: pulumi.Input[_builtins.str],
                 url: pulumi.Input[_builtins.str],
                 description: Optional[pulumi.Input[_builtins.str]] = None,
                 org_id: Optional[pulumi.Input[_builtins.str]] = None,
                 project_id: Optional[pulumi.Input[_builtins.str]] = None,
                 secret: Optional[pulumi.Input[_builtins.str]] = None,
                 triggers: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]] = None):
        """
        The set of arguments for constructing a RepoWebhook resource.
        :param pulumi.Input[_builtins.bool] enabled: Webhook enabled.
        :param pulumi.Input[_builtins.str] identifier: Identifier of the webhook.
        :param pulumi.Input[_builtins.bool] insecure: Allow insecure connections for provided webhook URL.
        :param pulumi.Input[_builtins.str] repo_identifier: Identifier of the repository.
        :param pulumi.Input[_builtins.str] url: URL that's called by the webhook.
        :param pulumi.Input[_builtins.str] description: Description of the webhook.
        :param pulumi.Input[_builtins.str] org_id: Unique identifier of the organization.
        :param pulumi.Input[_builtins.str] project_id: Unique identifier of the project.
        :param pulumi.Input[_builtins.str] secret: Webhook secret which will be used to sign the webhook payload.
        :param pulumi.Input[Sequence[pulumi.Input[_builtins.str]]] triggers: List of triggers of the webhook (keep empty for all triggers).
        """
        pulumi.set(__self__, "enabled", enabled)
        pulumi.set(__self__, "identifier", identifier)
        pulumi.set(__self__, "insecure", insecure)
        pulumi.set(__self__, "repo_identifier", repo_identifier)
        pulumi.set(__self__, "url", url)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if org_id is not None:
            pulumi.set(__self__, "org_id", org_id)
        if project_id is not None:
            pulumi.set(__self__, "project_id", project_id)
        if secret is not None:
            pulumi.set(__self__, "secret", secret)
        if triggers is not None:
            pulumi.set(__self__, "triggers", triggers)

    @_builtins.property
    @pulumi.getter
    def enabled(self) -> pulumi.Input[_builtins.bool]:
        """
        Webhook enabled.
        """
        return pulumi.get(self, "enabled")

    @enabled.setter
    def enabled(self, value: pulumi.Input[_builtins.bool]):
        pulumi.set(self, "enabled", value)

    @_builtins.property
    @pulumi.getter
    def identifier(self) -> pulumi.Input[_builtins.str]:
        """
        Identifier of the webhook.
        """
        return pulumi.get(self, "identifier")

    @identifier.setter
    def identifier(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "identifier", value)

    @_builtins.property
    @pulumi.getter
    def insecure(self) -> pulumi.Input[_builtins.bool]:
        """
        Allow insecure connections for provided webhook URL.
        """
        return pulumi.get(self, "insecure")

    @insecure.setter
    def insecure(self, value: pulumi.Input[_builtins.bool]):
        pulumi.set(self, "insecure", value)

    @_builtins.property
    @pulumi.getter(name="repoIdentifier")
    def repo_identifier(self) -> pulumi.Input[_builtins.str]:
        """
        Identifier of the repository.
        """
        return pulumi.get(self, "repo_identifier")

    @repo_identifier.setter
    def repo_identifier(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "repo_identifier", value)

    @_builtins.property
    @pulumi.getter
    def url(self) -> pulumi.Input[_builtins.str]:
        """
        URL that's called by the webhook.
        """
        return pulumi.get(self, "url")

    @url.setter
    def url(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "url", value)

    @_builtins.property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Description of the webhook.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "description", value)

    @_builtins.property
    @pulumi.getter(name="orgId")
    def org_id(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Unique identifier of the organization.
        """
        return pulumi.get(self, "org_id")

    @org_id.setter
    def org_id(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "org_id", value)

    @_builtins.property
    @pulumi.getter(name="projectId")
    def project_id(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Unique identifier of the project.
        """
        return pulumi.get(self, "project_id")

    @project_id.setter
    def project_id(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "project_id", value)

    @_builtins.property
    @pulumi.getter
    def secret(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Webhook secret which will be used to sign the webhook payload.
        """
        return pulumi.get(self, "secret")

    @secret.setter
    def secret(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "secret", value)

    @_builtins.property
    @pulumi.getter
    def triggers(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]]:
        """
        List of triggers of the webhook (keep empty for all triggers).
        """
        return pulumi.get(self, "triggers")

    @triggers.setter
    def triggers(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]]):
        pulumi.set(self, "triggers", value)


@pulumi.input_type
class _RepoWebhookState:
    def __init__(__self__, *,
                 created: Optional[pulumi.Input[_builtins.int]] = None,
                 created_by: Optional[pulumi.Input[_builtins.int]] = None,
                 description: Optional[pulumi.Input[_builtins.str]] = None,
                 enabled: Optional[pulumi.Input[_builtins.bool]] = None,
                 has_secret: Optional[pulumi.Input[_builtins.bool]] = None,
                 identifier: Optional[pulumi.Input[_builtins.str]] = None,
                 insecure: Optional[pulumi.Input[_builtins.bool]] = None,
                 org_id: Optional[pulumi.Input[_builtins.str]] = None,
                 project_id: Optional[pulumi.Input[_builtins.str]] = None,
                 repo_identifier: Optional[pulumi.Input[_builtins.str]] = None,
                 secret: Optional[pulumi.Input[_builtins.str]] = None,
                 triggers: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]] = None,
                 url: Optional[pulumi.Input[_builtins.str]] = None):
        """
        Input properties used for looking up and filtering RepoWebhook resources.
        :param pulumi.Input[_builtins.int] created: Timestamp when the webhook was created.
        :param pulumi.Input[_builtins.int] created_by: ID of the user who created the webhook.
        :param pulumi.Input[_builtins.str] description: Description of the webhook.
        :param pulumi.Input[_builtins.bool] enabled: Webhook enabled.
        :param pulumi.Input[_builtins.bool] has_secret: Created webhook has secret encoding.
        :param pulumi.Input[_builtins.str] identifier: Identifier of the webhook.
        :param pulumi.Input[_builtins.bool] insecure: Allow insecure connections for provided webhook URL.
        :param pulumi.Input[_builtins.str] org_id: Unique identifier of the organization.
        :param pulumi.Input[_builtins.str] project_id: Unique identifier of the project.
        :param pulumi.Input[_builtins.str] repo_identifier: Identifier of the repository.
        :param pulumi.Input[_builtins.str] secret: Webhook secret which will be used to sign the webhook payload.
        :param pulumi.Input[Sequence[pulumi.Input[_builtins.str]]] triggers: List of triggers of the webhook (keep empty for all triggers).
        :param pulumi.Input[_builtins.str] url: URL that's called by the webhook.
        """
        if created is not None:
            pulumi.set(__self__, "created", created)
        if created_by is not None:
            pulumi.set(__self__, "created_by", created_by)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if enabled is not None:
            pulumi.set(__self__, "enabled", enabled)
        if has_secret is not None:
            pulumi.set(__self__, "has_secret", has_secret)
        if identifier is not None:
            pulumi.set(__self__, "identifier", identifier)
        if insecure is not None:
            pulumi.set(__self__, "insecure", insecure)
        if org_id is not None:
            pulumi.set(__self__, "org_id", org_id)
        if project_id is not None:
            pulumi.set(__self__, "project_id", project_id)
        if repo_identifier is not None:
            pulumi.set(__self__, "repo_identifier", repo_identifier)
        if secret is not None:
            pulumi.set(__self__, "secret", secret)
        if triggers is not None:
            pulumi.set(__self__, "triggers", triggers)
        if url is not None:
            pulumi.set(__self__, "url", url)

    @_builtins.property
    @pulumi.getter
    def created(self) -> Optional[pulumi.Input[_builtins.int]]:
        """
        Timestamp when the webhook was created.
        """
        return pulumi.get(self, "created")

    @created.setter
    def created(self, value: Optional[pulumi.Input[_builtins.int]]):
        pulumi.set(self, "created", value)

    @_builtins.property
    @pulumi.getter(name="createdBy")
    def created_by(self) -> Optional[pulumi.Input[_builtins.int]]:
        """
        ID of the user who created the webhook.
        """
        return pulumi.get(self, "created_by")

    @created_by.setter
    def created_by(self, value: Optional[pulumi.Input[_builtins.int]]):
        pulumi.set(self, "created_by", value)

    @_builtins.property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Description of the webhook.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "description", value)

    @_builtins.property
    @pulumi.getter
    def enabled(self) -> Optional[pulumi.Input[_builtins.bool]]:
        """
        Webhook enabled.
        """
        return pulumi.get(self, "enabled")

    @enabled.setter
    def enabled(self, value: Optional[pulumi.Input[_builtins.bool]]):
        pulumi.set(self, "enabled", value)

    @_builtins.property
    @pulumi.getter(name="hasSecret")
    def has_secret(self) -> Optional[pulumi.Input[_builtins.bool]]:
        """
        Created webhook has secret encoding.
        """
        return pulumi.get(self, "has_secret")

    @has_secret.setter
    def has_secret(self, value: Optional[pulumi.Input[_builtins.bool]]):
        pulumi.set(self, "has_secret", value)

    @_builtins.property
    @pulumi.getter
    def identifier(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Identifier of the webhook.
        """
        return pulumi.get(self, "identifier")

    @identifier.setter
    def identifier(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "identifier", value)

    @_builtins.property
    @pulumi.getter
    def insecure(self) -> Optional[pulumi.Input[_builtins.bool]]:
        """
        Allow insecure connections for provided webhook URL.
        """
        return pulumi.get(self, "insecure")

    @insecure.setter
    def insecure(self, value: Optional[pulumi.Input[_builtins.bool]]):
        pulumi.set(self, "insecure", value)

    @_builtins.property
    @pulumi.getter(name="orgId")
    def org_id(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Unique identifier of the organization.
        """
        return pulumi.get(self, "org_id")

    @org_id.setter
    def org_id(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "org_id", value)

    @_builtins.property
    @pulumi.getter(name="projectId")
    def project_id(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Unique identifier of the project.
        """
        return pulumi.get(self, "project_id")

    @project_id.setter
    def project_id(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "project_id", value)

    @_builtins.property
    @pulumi.getter(name="repoIdentifier")
    def repo_identifier(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Identifier of the repository.
        """
        return pulumi.get(self, "repo_identifier")

    @repo_identifier.setter
    def repo_identifier(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "repo_identifier", value)

    @_builtins.property
    @pulumi.getter
    def secret(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Webhook secret which will be used to sign the webhook payload.
        """
        return pulumi.get(self, "secret")

    @secret.setter
    def secret(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "secret", value)

    @_builtins.property
    @pulumi.getter
    def triggers(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]]:
        """
        List of triggers of the webhook (keep empty for all triggers).
        """
        return pulumi.get(self, "triggers")

    @triggers.setter
    def triggers(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]]):
        pulumi.set(self, "triggers", value)

    @_builtins.property
    @pulumi.getter
    def url(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        URL that's called by the webhook.
        """
        return pulumi.get(self, "url")

    @url.setter
    def url(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "url", value)


@pulumi.type_token("harness:platform/repoWebhook:RepoWebhook")
class RepoWebhook(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 description: Optional[pulumi.Input[_builtins.str]] = None,
                 enabled: Optional[pulumi.Input[_builtins.bool]] = None,
                 identifier: Optional[pulumi.Input[_builtins.str]] = None,
                 insecure: Optional[pulumi.Input[_builtins.bool]] = None,
                 org_id: Optional[pulumi.Input[_builtins.str]] = None,
                 project_id: Optional[pulumi.Input[_builtins.str]] = None,
                 repo_identifier: Optional[pulumi.Input[_builtins.str]] = None,
                 secret: Optional[pulumi.Input[_builtins.str]] = None,
                 triggers: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]] = None,
                 url: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        """
        Resource for creating a Harness Repo Webhook.

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] description: Description of the webhook.
        :param pulumi.Input[_builtins.bool] enabled: Webhook enabled.
        :param pulumi.Input[_builtins.str] identifier: Identifier of the webhook.
        :param pulumi.Input[_builtins.bool] insecure: Allow insecure connections for provided webhook URL.
        :param pulumi.Input[_builtins.str] org_id: Unique identifier of the organization.
        :param pulumi.Input[_builtins.str] project_id: Unique identifier of the project.
        :param pulumi.Input[_builtins.str] repo_identifier: Identifier of the repository.
        :param pulumi.Input[_builtins.str] secret: Webhook secret which will be used to sign the webhook payload.
        :param pulumi.Input[Sequence[pulumi.Input[_builtins.str]]] triggers: List of triggers of the webhook (keep empty for all triggers).
        :param pulumi.Input[_builtins.str] url: URL that's called by the webhook.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: RepoWebhookArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Resource for creating a Harness Repo Webhook.

        :param str resource_name: The name of the resource.
        :param RepoWebhookArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(RepoWebhookArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 description: Optional[pulumi.Input[_builtins.str]] = None,
                 enabled: Optional[pulumi.Input[_builtins.bool]] = None,
                 identifier: Optional[pulumi.Input[_builtins.str]] = None,
                 insecure: Optional[pulumi.Input[_builtins.bool]] = None,
                 org_id: Optional[pulumi.Input[_builtins.str]] = None,
                 project_id: Optional[pulumi.Input[_builtins.str]] = None,
                 repo_identifier: Optional[pulumi.Input[_builtins.str]] = None,
                 secret: Optional[pulumi.Input[_builtins.str]] = None,
                 triggers: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]] = None,
                 url: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = RepoWebhookArgs.__new__(RepoWebhookArgs)

            __props__.__dict__["description"] = description
            if enabled is None and not opts.urn:
                raise TypeError("Missing required property 'enabled'")
            __props__.__dict__["enabled"] = enabled
            if identifier is None and not opts.urn:
                raise TypeError("Missing required property 'identifier'")
            __props__.__dict__["identifier"] = identifier
            if insecure is None and not opts.urn:
                raise TypeError("Missing required property 'insecure'")
            __props__.__dict__["insecure"] = insecure
            __props__.__dict__["org_id"] = org_id
            __props__.__dict__["project_id"] = project_id
            if repo_identifier is None and not opts.urn:
                raise TypeError("Missing required property 'repo_identifier'")
            __props__.__dict__["repo_identifier"] = repo_identifier
            __props__.__dict__["secret"] = None if secret is None else pulumi.Output.secret(secret)
            __props__.__dict__["triggers"] = triggers
            if url is None and not opts.urn:
                raise TypeError("Missing required property 'url'")
            __props__.__dict__["url"] = url
            __props__.__dict__["created"] = None
            __props__.__dict__["created_by"] = None
            __props__.__dict__["has_secret"] = None
        secret_opts = pulumi.ResourceOptions(additional_secret_outputs=["secret"])
        opts = pulumi.ResourceOptions.merge(opts, secret_opts)
        super(RepoWebhook, __self__).__init__(
            'harness:platform/repoWebhook:RepoWebhook',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            created: Optional[pulumi.Input[_builtins.int]] = None,
            created_by: Optional[pulumi.Input[_builtins.int]] = None,
            description: Optional[pulumi.Input[_builtins.str]] = None,
            enabled: Optional[pulumi.Input[_builtins.bool]] = None,
            has_secret: Optional[pulumi.Input[_builtins.bool]] = None,
            identifier: Optional[pulumi.Input[_builtins.str]] = None,
            insecure: Optional[pulumi.Input[_builtins.bool]] = None,
            org_id: Optional[pulumi.Input[_builtins.str]] = None,
            project_id: Optional[pulumi.Input[_builtins.str]] = None,
            repo_identifier: Optional[pulumi.Input[_builtins.str]] = None,
            secret: Optional[pulumi.Input[_builtins.str]] = None,
            triggers: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]] = None,
            url: Optional[pulumi.Input[_builtins.str]] = None) -> 'RepoWebhook':
        """
        Get an existing RepoWebhook resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.int] created: Timestamp when the webhook was created.
        :param pulumi.Input[_builtins.int] created_by: ID of the user who created the webhook.
        :param pulumi.Input[_builtins.str] description: Description of the webhook.
        :param pulumi.Input[_builtins.bool] enabled: Webhook enabled.
        :param pulumi.Input[_builtins.bool] has_secret: Created webhook has secret encoding.
        :param pulumi.Input[_builtins.str] identifier: Identifier of the webhook.
        :param pulumi.Input[_builtins.bool] insecure: Allow insecure connections for provided webhook URL.
        :param pulumi.Input[_builtins.str] org_id: Unique identifier of the organization.
        :param pulumi.Input[_builtins.str] project_id: Unique identifier of the project.
        :param pulumi.Input[_builtins.str] repo_identifier: Identifier of the repository.
        :param pulumi.Input[_builtins.str] secret: Webhook secret which will be used to sign the webhook payload.
        :param pulumi.Input[Sequence[pulumi.Input[_builtins.str]]] triggers: List of triggers of the webhook (keep empty for all triggers).
        :param pulumi.Input[_builtins.str] url: URL that's called by the webhook.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _RepoWebhookState.__new__(_RepoWebhookState)

        __props__.__dict__["created"] = created
        __props__.__dict__["created_by"] = created_by
        __props__.__dict__["description"] = description
        __props__.__dict__["enabled"] = enabled
        __props__.__dict__["has_secret"] = has_secret
        __props__.__dict__["identifier"] = identifier
        __props__.__dict__["insecure"] = insecure
        __props__.__dict__["org_id"] = org_id
        __props__.__dict__["project_id"] = project_id
        __props__.__dict__["repo_identifier"] = repo_identifier
        __props__.__dict__["secret"] = secret
        __props__.__dict__["triggers"] = triggers
        __props__.__dict__["url"] = url
        return RepoWebhook(resource_name, opts=opts, __props__=__props__)

    @_builtins.property
    @pulumi.getter
    def created(self) -> pulumi.Output[_builtins.int]:
        """
        Timestamp when the webhook was created.
        """
        return pulumi.get(self, "created")

    @_builtins.property
    @pulumi.getter(name="createdBy")
    def created_by(self) -> pulumi.Output[_builtins.int]:
        """
        ID of the user who created the webhook.
        """
        return pulumi.get(self, "created_by")

    @_builtins.property
    @pulumi.getter
    def description(self) -> pulumi.Output[Optional[_builtins.str]]:
        """
        Description of the webhook.
        """
        return pulumi.get(self, "description")

    @_builtins.property
    @pulumi.getter
    def enabled(self) -> pulumi.Output[_builtins.bool]:
        """
        Webhook enabled.
        """
        return pulumi.get(self, "enabled")

    @_builtins.property
    @pulumi.getter(name="hasSecret")
    def has_secret(self) -> pulumi.Output[_builtins.bool]:
        """
        Created webhook has secret encoding.
        """
        return pulumi.get(self, "has_secret")

    @_builtins.property
    @pulumi.getter
    def identifier(self) -> pulumi.Output[_builtins.str]:
        """
        Identifier of the webhook.
        """
        return pulumi.get(self, "identifier")

    @_builtins.property
    @pulumi.getter
    def insecure(self) -> pulumi.Output[_builtins.bool]:
        """
        Allow insecure connections for provided webhook URL.
        """
        return pulumi.get(self, "insecure")

    @_builtins.property
    @pulumi.getter(name="orgId")
    def org_id(self) -> pulumi.Output[Optional[_builtins.str]]:
        """
        Unique identifier of the organization.
        """
        return pulumi.get(self, "org_id")

    @_builtins.property
    @pulumi.getter(name="projectId")
    def project_id(self) -> pulumi.Output[Optional[_builtins.str]]:
        """
        Unique identifier of the project.
        """
        return pulumi.get(self, "project_id")

    @_builtins.property
    @pulumi.getter(name="repoIdentifier")
    def repo_identifier(self) -> pulumi.Output[_builtins.str]:
        """
        Identifier of the repository.
        """
        return pulumi.get(self, "repo_identifier")

    @_builtins.property
    @pulumi.getter
    def secret(self) -> pulumi.Output[Optional[_builtins.str]]:
        """
        Webhook secret which will be used to sign the webhook payload.
        """
        return pulumi.get(self, "secret")

    @_builtins.property
    @pulumi.getter
    def triggers(self) -> pulumi.Output[Optional[Sequence[_builtins.str]]]:
        """
        List of triggers of the webhook (keep empty for all triggers).
        """
        return pulumi.get(self, "triggers")

    @_builtins.property
    @pulumi.getter
    def url(self) -> pulumi.Output[_builtins.str]:
        """
        URL that's called by the webhook.
        """
        return pulumi.get(self, "url")

