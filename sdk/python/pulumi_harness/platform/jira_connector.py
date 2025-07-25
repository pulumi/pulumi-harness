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
from . import outputs
from ._inputs import *

__all__ = ['JiraConnectorArgs', 'JiraConnector']

@pulumi.input_type
class JiraConnectorArgs:
    def __init__(__self__, *,
                 auth: pulumi.Input['JiraConnectorAuthArgs'],
                 identifier: pulumi.Input[_builtins.str],
                 url: pulumi.Input[_builtins.str],
                 delegate_selectors: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]] = None,
                 description: Optional[pulumi.Input[_builtins.str]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 org_id: Optional[pulumi.Input[_builtins.str]] = None,
                 password_ref: Optional[pulumi.Input[_builtins.str]] = None,
                 project_id: Optional[pulumi.Input[_builtins.str]] = None,
                 tags: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]] = None,
                 username: Optional[pulumi.Input[_builtins.str]] = None,
                 username_ref: Optional[pulumi.Input[_builtins.str]] = None):
        """
        The set of arguments for constructing a JiraConnector resource.
        :param pulumi.Input['JiraConnectorAuthArgs'] auth: The credentials to use for the jira authentication.
        :param pulumi.Input[_builtins.str] identifier: Unique identifier of the resource.
        :param pulumi.Input[_builtins.str] url: URL of the Jira server.
        :param pulumi.Input[Sequence[pulumi.Input[_builtins.str]]] delegate_selectors: Tags to filter delegates for connection.
        :param pulumi.Input[_builtins.str] description: Description of the resource.
        :param pulumi.Input[_builtins.str] name: Name of the resource.
        :param pulumi.Input[_builtins.str] org_id: Unique identifier of the organization.
        :param pulumi.Input[_builtins.str] password_ref: Reference to a secret containing the password to use for authentication. To reference a secret at the organization scope, prefix 'org' to the expression: org.{identifier}. To reference a secret at the account scope, prefix 'account` to the expression: account.{identifier}.
        :param pulumi.Input[_builtins.str] project_id: Unique identifier of the project.
        :param pulumi.Input[Sequence[pulumi.Input[_builtins.str]]] tags: Tags to associate with the resource.
        :param pulumi.Input[_builtins.str] username: Username to use for authentication.
        :param pulumi.Input[_builtins.str] username_ref: Reference to a secret containing the username to use for authentication. To reference a secret at the organization scope, prefix 'org' to the expression: org.{identifier}. To reference a secret at the account scope, prefix 'account` to the expression: account.{identifier}.
        """
        pulumi.set(__self__, "auth", auth)
        pulumi.set(__self__, "identifier", identifier)
        pulumi.set(__self__, "url", url)
        if delegate_selectors is not None:
            pulumi.set(__self__, "delegate_selectors", delegate_selectors)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if org_id is not None:
            pulumi.set(__self__, "org_id", org_id)
        if password_ref is not None:
            pulumi.set(__self__, "password_ref", password_ref)
        if project_id is not None:
            pulumi.set(__self__, "project_id", project_id)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)
        if username is not None:
            pulumi.set(__self__, "username", username)
        if username_ref is not None:
            pulumi.set(__self__, "username_ref", username_ref)

    @_builtins.property
    @pulumi.getter
    def auth(self) -> pulumi.Input['JiraConnectorAuthArgs']:
        """
        The credentials to use for the jira authentication.
        """
        return pulumi.get(self, "auth")

    @auth.setter
    def auth(self, value: pulumi.Input['JiraConnectorAuthArgs']):
        pulumi.set(self, "auth", value)

    @_builtins.property
    @pulumi.getter
    def identifier(self) -> pulumi.Input[_builtins.str]:
        """
        Unique identifier of the resource.
        """
        return pulumi.get(self, "identifier")

    @identifier.setter
    def identifier(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "identifier", value)

    @_builtins.property
    @pulumi.getter
    def url(self) -> pulumi.Input[_builtins.str]:
        """
        URL of the Jira server.
        """
        return pulumi.get(self, "url")

    @url.setter
    def url(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "url", value)

    @_builtins.property
    @pulumi.getter(name="delegateSelectors")
    def delegate_selectors(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]]:
        """
        Tags to filter delegates for connection.
        """
        return pulumi.get(self, "delegate_selectors")

    @delegate_selectors.setter
    def delegate_selectors(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]]):
        pulumi.set(self, "delegate_selectors", value)

    @_builtins.property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Description of the resource.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "description", value)

    @_builtins.property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Name of the resource.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "name", value)

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
    @pulumi.getter(name="passwordRef")
    def password_ref(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Reference to a secret containing the password to use for authentication. To reference a secret at the organization scope, prefix 'org' to the expression: org.{identifier}. To reference a secret at the account scope, prefix 'account` to the expression: account.{identifier}.
        """
        return pulumi.get(self, "password_ref")

    @password_ref.setter
    def password_ref(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "password_ref", value)

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
    def tags(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]]:
        """
        Tags to associate with the resource.
        """
        return pulumi.get(self, "tags")

    @tags.setter
    def tags(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]]):
        pulumi.set(self, "tags", value)

    @_builtins.property
    @pulumi.getter
    def username(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Username to use for authentication.
        """
        return pulumi.get(self, "username")

    @username.setter
    def username(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "username", value)

    @_builtins.property
    @pulumi.getter(name="usernameRef")
    def username_ref(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Reference to a secret containing the username to use for authentication. To reference a secret at the organization scope, prefix 'org' to the expression: org.{identifier}. To reference a secret at the account scope, prefix 'account` to the expression: account.{identifier}.
        """
        return pulumi.get(self, "username_ref")

    @username_ref.setter
    def username_ref(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "username_ref", value)


@pulumi.input_type
class _JiraConnectorState:
    def __init__(__self__, *,
                 auth: Optional[pulumi.Input['JiraConnectorAuthArgs']] = None,
                 delegate_selectors: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]] = None,
                 description: Optional[pulumi.Input[_builtins.str]] = None,
                 identifier: Optional[pulumi.Input[_builtins.str]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 org_id: Optional[pulumi.Input[_builtins.str]] = None,
                 password_ref: Optional[pulumi.Input[_builtins.str]] = None,
                 project_id: Optional[pulumi.Input[_builtins.str]] = None,
                 tags: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]] = None,
                 url: Optional[pulumi.Input[_builtins.str]] = None,
                 username: Optional[pulumi.Input[_builtins.str]] = None,
                 username_ref: Optional[pulumi.Input[_builtins.str]] = None):
        """
        Input properties used for looking up and filtering JiraConnector resources.
        :param pulumi.Input['JiraConnectorAuthArgs'] auth: The credentials to use for the jira authentication.
        :param pulumi.Input[Sequence[pulumi.Input[_builtins.str]]] delegate_selectors: Tags to filter delegates for connection.
        :param pulumi.Input[_builtins.str] description: Description of the resource.
        :param pulumi.Input[_builtins.str] identifier: Unique identifier of the resource.
        :param pulumi.Input[_builtins.str] name: Name of the resource.
        :param pulumi.Input[_builtins.str] org_id: Unique identifier of the organization.
        :param pulumi.Input[_builtins.str] password_ref: Reference to a secret containing the password to use for authentication. To reference a secret at the organization scope, prefix 'org' to the expression: org.{identifier}. To reference a secret at the account scope, prefix 'account` to the expression: account.{identifier}.
        :param pulumi.Input[_builtins.str] project_id: Unique identifier of the project.
        :param pulumi.Input[Sequence[pulumi.Input[_builtins.str]]] tags: Tags to associate with the resource.
        :param pulumi.Input[_builtins.str] url: URL of the Jira server.
        :param pulumi.Input[_builtins.str] username: Username to use for authentication.
        :param pulumi.Input[_builtins.str] username_ref: Reference to a secret containing the username to use for authentication. To reference a secret at the organization scope, prefix 'org' to the expression: org.{identifier}. To reference a secret at the account scope, prefix 'account` to the expression: account.{identifier}.
        """
        if auth is not None:
            pulumi.set(__self__, "auth", auth)
        if delegate_selectors is not None:
            pulumi.set(__self__, "delegate_selectors", delegate_selectors)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if identifier is not None:
            pulumi.set(__self__, "identifier", identifier)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if org_id is not None:
            pulumi.set(__self__, "org_id", org_id)
        if password_ref is not None:
            pulumi.set(__self__, "password_ref", password_ref)
        if project_id is not None:
            pulumi.set(__self__, "project_id", project_id)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)
        if url is not None:
            pulumi.set(__self__, "url", url)
        if username is not None:
            pulumi.set(__self__, "username", username)
        if username_ref is not None:
            pulumi.set(__self__, "username_ref", username_ref)

    @_builtins.property
    @pulumi.getter
    def auth(self) -> Optional[pulumi.Input['JiraConnectorAuthArgs']]:
        """
        The credentials to use for the jira authentication.
        """
        return pulumi.get(self, "auth")

    @auth.setter
    def auth(self, value: Optional[pulumi.Input['JiraConnectorAuthArgs']]):
        pulumi.set(self, "auth", value)

    @_builtins.property
    @pulumi.getter(name="delegateSelectors")
    def delegate_selectors(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]]:
        """
        Tags to filter delegates for connection.
        """
        return pulumi.get(self, "delegate_selectors")

    @delegate_selectors.setter
    def delegate_selectors(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]]):
        pulumi.set(self, "delegate_selectors", value)

    @_builtins.property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Description of the resource.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "description", value)

    @_builtins.property
    @pulumi.getter
    def identifier(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Unique identifier of the resource.
        """
        return pulumi.get(self, "identifier")

    @identifier.setter
    def identifier(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "identifier", value)

    @_builtins.property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Name of the resource.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "name", value)

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
    @pulumi.getter(name="passwordRef")
    def password_ref(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Reference to a secret containing the password to use for authentication. To reference a secret at the organization scope, prefix 'org' to the expression: org.{identifier}. To reference a secret at the account scope, prefix 'account` to the expression: account.{identifier}.
        """
        return pulumi.get(self, "password_ref")

    @password_ref.setter
    def password_ref(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "password_ref", value)

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
    def tags(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]]:
        """
        Tags to associate with the resource.
        """
        return pulumi.get(self, "tags")

    @tags.setter
    def tags(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]]):
        pulumi.set(self, "tags", value)

    @_builtins.property
    @pulumi.getter
    def url(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        URL of the Jira server.
        """
        return pulumi.get(self, "url")

    @url.setter
    def url(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "url", value)

    @_builtins.property
    @pulumi.getter
    def username(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Username to use for authentication.
        """
        return pulumi.get(self, "username")

    @username.setter
    def username(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "username", value)

    @_builtins.property
    @pulumi.getter(name="usernameRef")
    def username_ref(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Reference to a secret containing the username to use for authentication. To reference a secret at the organization scope, prefix 'org' to the expression: org.{identifier}. To reference a secret at the account scope, prefix 'account` to the expression: account.{identifier}.
        """
        return pulumi.get(self, "username_ref")

    @username_ref.setter
    def username_ref(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "username_ref", value)


@pulumi.type_token("harness:platform/jiraConnector:JiraConnector")
class JiraConnector(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 auth: Optional[pulumi.Input[Union['JiraConnectorAuthArgs', 'JiraConnectorAuthArgsDict']]] = None,
                 delegate_selectors: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]] = None,
                 description: Optional[pulumi.Input[_builtins.str]] = None,
                 identifier: Optional[pulumi.Input[_builtins.str]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 org_id: Optional[pulumi.Input[_builtins.str]] = None,
                 password_ref: Optional[pulumi.Input[_builtins.str]] = None,
                 project_id: Optional[pulumi.Input[_builtins.str]] = None,
                 tags: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]] = None,
                 url: Optional[pulumi.Input[_builtins.str]] = None,
                 username: Optional[pulumi.Input[_builtins.str]] = None,
                 username_ref: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        """
        Resource for creating a Jira connector.
        ## Example to create Jira Connector at different levels (Org, Project, Account)

        ## Import

        Import account level jira connector

        ```sh
        $ pulumi import harness:platform/jiraConnector:JiraConnector example <connector_id>
        ```

        Import org level jira connector

        ```sh
        $ pulumi import harness:platform/jiraConnector:JiraConnector example <ord_id>/<connector_id>
        ```

        Import project level jira connector

        ```sh
        $ pulumi import harness:platform/jiraConnector:JiraConnector example <org_id>/<project_id>/<connector_id>
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Union['JiraConnectorAuthArgs', 'JiraConnectorAuthArgsDict']] auth: The credentials to use for the jira authentication.
        :param pulumi.Input[Sequence[pulumi.Input[_builtins.str]]] delegate_selectors: Tags to filter delegates for connection.
        :param pulumi.Input[_builtins.str] description: Description of the resource.
        :param pulumi.Input[_builtins.str] identifier: Unique identifier of the resource.
        :param pulumi.Input[_builtins.str] name: Name of the resource.
        :param pulumi.Input[_builtins.str] org_id: Unique identifier of the organization.
        :param pulumi.Input[_builtins.str] password_ref: Reference to a secret containing the password to use for authentication. To reference a secret at the organization scope, prefix 'org' to the expression: org.{identifier}. To reference a secret at the account scope, prefix 'account` to the expression: account.{identifier}.
        :param pulumi.Input[_builtins.str] project_id: Unique identifier of the project.
        :param pulumi.Input[Sequence[pulumi.Input[_builtins.str]]] tags: Tags to associate with the resource.
        :param pulumi.Input[_builtins.str] url: URL of the Jira server.
        :param pulumi.Input[_builtins.str] username: Username to use for authentication.
        :param pulumi.Input[_builtins.str] username_ref: Reference to a secret containing the username to use for authentication. To reference a secret at the organization scope, prefix 'org' to the expression: org.{identifier}. To reference a secret at the account scope, prefix 'account` to the expression: account.{identifier}.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: JiraConnectorArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Resource for creating a Jira connector.
        ## Example to create Jira Connector at different levels (Org, Project, Account)

        ## Import

        Import account level jira connector

        ```sh
        $ pulumi import harness:platform/jiraConnector:JiraConnector example <connector_id>
        ```

        Import org level jira connector

        ```sh
        $ pulumi import harness:platform/jiraConnector:JiraConnector example <ord_id>/<connector_id>
        ```

        Import project level jira connector

        ```sh
        $ pulumi import harness:platform/jiraConnector:JiraConnector example <org_id>/<project_id>/<connector_id>
        ```

        :param str resource_name: The name of the resource.
        :param JiraConnectorArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(JiraConnectorArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 auth: Optional[pulumi.Input[Union['JiraConnectorAuthArgs', 'JiraConnectorAuthArgsDict']]] = None,
                 delegate_selectors: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]] = None,
                 description: Optional[pulumi.Input[_builtins.str]] = None,
                 identifier: Optional[pulumi.Input[_builtins.str]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 org_id: Optional[pulumi.Input[_builtins.str]] = None,
                 password_ref: Optional[pulumi.Input[_builtins.str]] = None,
                 project_id: Optional[pulumi.Input[_builtins.str]] = None,
                 tags: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]] = None,
                 url: Optional[pulumi.Input[_builtins.str]] = None,
                 username: Optional[pulumi.Input[_builtins.str]] = None,
                 username_ref: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = JiraConnectorArgs.__new__(JiraConnectorArgs)

            if auth is None and not opts.urn:
                raise TypeError("Missing required property 'auth'")
            __props__.__dict__["auth"] = auth
            __props__.__dict__["delegate_selectors"] = delegate_selectors
            __props__.__dict__["description"] = description
            if identifier is None and not opts.urn:
                raise TypeError("Missing required property 'identifier'")
            __props__.__dict__["identifier"] = identifier
            __props__.__dict__["name"] = name
            __props__.__dict__["org_id"] = org_id
            __props__.__dict__["password_ref"] = password_ref
            __props__.__dict__["project_id"] = project_id
            __props__.__dict__["tags"] = tags
            if url is None and not opts.urn:
                raise TypeError("Missing required property 'url'")
            __props__.__dict__["url"] = url
            __props__.__dict__["username"] = username
            __props__.__dict__["username_ref"] = username_ref
        super(JiraConnector, __self__).__init__(
            'harness:platform/jiraConnector:JiraConnector',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            auth: Optional[pulumi.Input[Union['JiraConnectorAuthArgs', 'JiraConnectorAuthArgsDict']]] = None,
            delegate_selectors: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]] = None,
            description: Optional[pulumi.Input[_builtins.str]] = None,
            identifier: Optional[pulumi.Input[_builtins.str]] = None,
            name: Optional[pulumi.Input[_builtins.str]] = None,
            org_id: Optional[pulumi.Input[_builtins.str]] = None,
            password_ref: Optional[pulumi.Input[_builtins.str]] = None,
            project_id: Optional[pulumi.Input[_builtins.str]] = None,
            tags: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]] = None,
            url: Optional[pulumi.Input[_builtins.str]] = None,
            username: Optional[pulumi.Input[_builtins.str]] = None,
            username_ref: Optional[pulumi.Input[_builtins.str]] = None) -> 'JiraConnector':
        """
        Get an existing JiraConnector resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Union['JiraConnectorAuthArgs', 'JiraConnectorAuthArgsDict']] auth: The credentials to use for the jira authentication.
        :param pulumi.Input[Sequence[pulumi.Input[_builtins.str]]] delegate_selectors: Tags to filter delegates for connection.
        :param pulumi.Input[_builtins.str] description: Description of the resource.
        :param pulumi.Input[_builtins.str] identifier: Unique identifier of the resource.
        :param pulumi.Input[_builtins.str] name: Name of the resource.
        :param pulumi.Input[_builtins.str] org_id: Unique identifier of the organization.
        :param pulumi.Input[_builtins.str] password_ref: Reference to a secret containing the password to use for authentication. To reference a secret at the organization scope, prefix 'org' to the expression: org.{identifier}. To reference a secret at the account scope, prefix 'account` to the expression: account.{identifier}.
        :param pulumi.Input[_builtins.str] project_id: Unique identifier of the project.
        :param pulumi.Input[Sequence[pulumi.Input[_builtins.str]]] tags: Tags to associate with the resource.
        :param pulumi.Input[_builtins.str] url: URL of the Jira server.
        :param pulumi.Input[_builtins.str] username: Username to use for authentication.
        :param pulumi.Input[_builtins.str] username_ref: Reference to a secret containing the username to use for authentication. To reference a secret at the organization scope, prefix 'org' to the expression: org.{identifier}. To reference a secret at the account scope, prefix 'account` to the expression: account.{identifier}.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _JiraConnectorState.__new__(_JiraConnectorState)

        __props__.__dict__["auth"] = auth
        __props__.__dict__["delegate_selectors"] = delegate_selectors
        __props__.__dict__["description"] = description
        __props__.__dict__["identifier"] = identifier
        __props__.__dict__["name"] = name
        __props__.__dict__["org_id"] = org_id
        __props__.__dict__["password_ref"] = password_ref
        __props__.__dict__["project_id"] = project_id
        __props__.__dict__["tags"] = tags
        __props__.__dict__["url"] = url
        __props__.__dict__["username"] = username
        __props__.__dict__["username_ref"] = username_ref
        return JiraConnector(resource_name, opts=opts, __props__=__props__)

    @_builtins.property
    @pulumi.getter
    def auth(self) -> pulumi.Output['outputs.JiraConnectorAuth']:
        """
        The credentials to use for the jira authentication.
        """
        return pulumi.get(self, "auth")

    @_builtins.property
    @pulumi.getter(name="delegateSelectors")
    def delegate_selectors(self) -> pulumi.Output[Optional[Sequence[_builtins.str]]]:
        """
        Tags to filter delegates for connection.
        """
        return pulumi.get(self, "delegate_selectors")

    @_builtins.property
    @pulumi.getter
    def description(self) -> pulumi.Output[Optional[_builtins.str]]:
        """
        Description of the resource.
        """
        return pulumi.get(self, "description")

    @_builtins.property
    @pulumi.getter
    def identifier(self) -> pulumi.Output[_builtins.str]:
        """
        Unique identifier of the resource.
        """
        return pulumi.get(self, "identifier")

    @_builtins.property
    @pulumi.getter
    def name(self) -> pulumi.Output[_builtins.str]:
        """
        Name of the resource.
        """
        return pulumi.get(self, "name")

    @_builtins.property
    @pulumi.getter(name="orgId")
    def org_id(self) -> pulumi.Output[Optional[_builtins.str]]:
        """
        Unique identifier of the organization.
        """
        return pulumi.get(self, "org_id")

    @_builtins.property
    @pulumi.getter(name="passwordRef")
    def password_ref(self) -> pulumi.Output[_builtins.str]:
        """
        Reference to a secret containing the password to use for authentication. To reference a secret at the organization scope, prefix 'org' to the expression: org.{identifier}. To reference a secret at the account scope, prefix 'account` to the expression: account.{identifier}.
        """
        return pulumi.get(self, "password_ref")

    @_builtins.property
    @pulumi.getter(name="projectId")
    def project_id(self) -> pulumi.Output[Optional[_builtins.str]]:
        """
        Unique identifier of the project.
        """
        return pulumi.get(self, "project_id")

    @_builtins.property
    @pulumi.getter
    def tags(self) -> pulumi.Output[Optional[Sequence[_builtins.str]]]:
        """
        Tags to associate with the resource.
        """
        return pulumi.get(self, "tags")

    @_builtins.property
    @pulumi.getter
    def url(self) -> pulumi.Output[_builtins.str]:
        """
        URL of the Jira server.
        """
        return pulumi.get(self, "url")

    @_builtins.property
    @pulumi.getter
    def username(self) -> pulumi.Output[_builtins.str]:
        """
        Username to use for authentication.
        """
        return pulumi.get(self, "username")

    @_builtins.property
    @pulumi.getter(name="usernameRef")
    def username_ref(self) -> pulumi.Output[_builtins.str]:
        """
        Reference to a secret containing the username to use for authentication. To reference a secret at the organization scope, prefix 'org' to the expression: org.{identifier}. To reference a secret at the account scope, prefix 'account` to the expression: account.{identifier}.
        """
        return pulumi.get(self, "username_ref")

