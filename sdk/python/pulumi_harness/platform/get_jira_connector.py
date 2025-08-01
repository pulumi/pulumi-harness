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

__all__ = [
    'GetJiraConnectorResult',
    'AwaitableGetJiraConnectorResult',
    'get_jira_connector',
    'get_jira_connector_output',
]

@pulumi.output_type
class GetJiraConnectorResult:
    """
    A collection of values returned by getJiraConnector.
    """
    def __init__(__self__, auths=None, delegate_selectors=None, description=None, id=None, identifier=None, name=None, org_id=None, password_ref=None, project_id=None, tags=None, url=None, username=None, username_ref=None):
        if auths and not isinstance(auths, list):
            raise TypeError("Expected argument 'auths' to be a list")
        pulumi.set(__self__, "auths", auths)
        if delegate_selectors and not isinstance(delegate_selectors, list):
            raise TypeError("Expected argument 'delegate_selectors' to be a list")
        pulumi.set(__self__, "delegate_selectors", delegate_selectors)
        if description and not isinstance(description, str):
            raise TypeError("Expected argument 'description' to be a str")
        pulumi.set(__self__, "description", description)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if identifier and not isinstance(identifier, str):
            raise TypeError("Expected argument 'identifier' to be a str")
        pulumi.set(__self__, "identifier", identifier)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if org_id and not isinstance(org_id, str):
            raise TypeError("Expected argument 'org_id' to be a str")
        pulumi.set(__self__, "org_id", org_id)
        if password_ref and not isinstance(password_ref, str):
            raise TypeError("Expected argument 'password_ref' to be a str")
        pulumi.set(__self__, "password_ref", password_ref)
        if project_id and not isinstance(project_id, str):
            raise TypeError("Expected argument 'project_id' to be a str")
        pulumi.set(__self__, "project_id", project_id)
        if tags and not isinstance(tags, list):
            raise TypeError("Expected argument 'tags' to be a list")
        pulumi.set(__self__, "tags", tags)
        if url and not isinstance(url, str):
            raise TypeError("Expected argument 'url' to be a str")
        pulumi.set(__self__, "url", url)
        if username and not isinstance(username, str):
            raise TypeError("Expected argument 'username' to be a str")
        pulumi.set(__self__, "username", username)
        if username_ref and not isinstance(username_ref, str):
            raise TypeError("Expected argument 'username_ref' to be a str")
        pulumi.set(__self__, "username_ref", username_ref)

    @_builtins.property
    @pulumi.getter
    def auths(self) -> Sequence['outputs.GetJiraConnectorAuthResult']:
        """
        The credentials to use for the jira authentication.
        """
        return pulumi.get(self, "auths")

    @_builtins.property
    @pulumi.getter(name="delegateSelectors")
    def delegate_selectors(self) -> Sequence[_builtins.str]:
        """
        Tags to filter delegates for connection.
        """
        return pulumi.get(self, "delegate_selectors")

    @_builtins.property
    @pulumi.getter
    def description(self) -> _builtins.str:
        """
        Description of the resource.
        """
        return pulumi.get(self, "description")

    @_builtins.property
    @pulumi.getter
    def id(self) -> _builtins.str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @_builtins.property
    @pulumi.getter
    def identifier(self) -> _builtins.str:
        """
        Unique identifier of the resource.
        """
        return pulumi.get(self, "identifier")

    @_builtins.property
    @pulumi.getter
    def name(self) -> Optional[_builtins.str]:
        """
        Name of the resource.
        """
        return pulumi.get(self, "name")

    @_builtins.property
    @pulumi.getter(name="orgId")
    def org_id(self) -> Optional[_builtins.str]:
        """
        Unique identifier of the organization.
        """
        return pulumi.get(self, "org_id")

    @_builtins.property
    @pulumi.getter(name="passwordRef")
    def password_ref(self) -> _builtins.str:
        """
        Reference to a secret containing the password to use for authentication. To reference a secret at the organization scope, prefix 'org' to the expression: org.{identifier}. To reference a secret at the account scope, prefix 'account` to the expression: account.{identifier}.
        """
        return pulumi.get(self, "password_ref")

    @_builtins.property
    @pulumi.getter(name="projectId")
    def project_id(self) -> Optional[_builtins.str]:
        """
        Unique identifier of the project.
        """
        return pulumi.get(self, "project_id")

    @_builtins.property
    @pulumi.getter
    def tags(self) -> Sequence[_builtins.str]:
        """
        Tags to associate with the resource.
        """
        return pulumi.get(self, "tags")

    @_builtins.property
    @pulumi.getter
    def url(self) -> _builtins.str:
        """
        URL of the Jira server.
        """
        return pulumi.get(self, "url")

    @_builtins.property
    @pulumi.getter
    def username(self) -> _builtins.str:
        """
        Username to use for authentication.
        """
        return pulumi.get(self, "username")

    @_builtins.property
    @pulumi.getter(name="usernameRef")
    def username_ref(self) -> _builtins.str:
        """
        Reference to a secret containing the username to use for authentication. To reference a secret at the organization scope, prefix 'org' to the expression: org.{identifier}. To reference a secret at the account scope, prefix 'account` to the expression: account.{identifier}.
        """
        return pulumi.get(self, "username_ref")


class AwaitableGetJiraConnectorResult(GetJiraConnectorResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetJiraConnectorResult(
            auths=self.auths,
            delegate_selectors=self.delegate_selectors,
            description=self.description,
            id=self.id,
            identifier=self.identifier,
            name=self.name,
            org_id=self.org_id,
            password_ref=self.password_ref,
            project_id=self.project_id,
            tags=self.tags,
            url=self.url,
            username=self.username,
            username_ref=self.username_ref)


def get_jira_connector(identifier: Optional[_builtins.str] = None,
                       name: Optional[_builtins.str] = None,
                       org_id: Optional[_builtins.str] = None,
                       project_id: Optional[_builtins.str] = None,
                       opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetJiraConnectorResult:
    """
    Datasource for looking up a Jira connector.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_harness as harness

    example = harness.platform.get_jira_connector(identifier="identifier")
    ```


    :param _builtins.str identifier: Unique identifier of the resource.
    :param _builtins.str name: Name of the resource.
    :param _builtins.str org_id: Unique identifier of the organization.
    :param _builtins.str project_id: Unique identifier of the project.
    """
    __args__ = dict()
    __args__['identifier'] = identifier
    __args__['name'] = name
    __args__['orgId'] = org_id
    __args__['projectId'] = project_id
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('harness:platform/getJiraConnector:getJiraConnector', __args__, opts=opts, typ=GetJiraConnectorResult).value

    return AwaitableGetJiraConnectorResult(
        auths=pulumi.get(__ret__, 'auths'),
        delegate_selectors=pulumi.get(__ret__, 'delegate_selectors'),
        description=pulumi.get(__ret__, 'description'),
        id=pulumi.get(__ret__, 'id'),
        identifier=pulumi.get(__ret__, 'identifier'),
        name=pulumi.get(__ret__, 'name'),
        org_id=pulumi.get(__ret__, 'org_id'),
        password_ref=pulumi.get(__ret__, 'password_ref'),
        project_id=pulumi.get(__ret__, 'project_id'),
        tags=pulumi.get(__ret__, 'tags'),
        url=pulumi.get(__ret__, 'url'),
        username=pulumi.get(__ret__, 'username'),
        username_ref=pulumi.get(__ret__, 'username_ref'))
def get_jira_connector_output(identifier: Optional[pulumi.Input[_builtins.str]] = None,
                              name: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                              org_id: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                              project_id: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                              opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetJiraConnectorResult]:
    """
    Datasource for looking up a Jira connector.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_harness as harness

    example = harness.platform.get_jira_connector(identifier="identifier")
    ```


    :param _builtins.str identifier: Unique identifier of the resource.
    :param _builtins.str name: Name of the resource.
    :param _builtins.str org_id: Unique identifier of the organization.
    :param _builtins.str project_id: Unique identifier of the project.
    """
    __args__ = dict()
    __args__['identifier'] = identifier
    __args__['name'] = name
    __args__['orgId'] = org_id
    __args__['projectId'] = project_id
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('harness:platform/getJiraConnector:getJiraConnector', __args__, opts=opts, typ=GetJiraConnectorResult)
    return __ret__.apply(lambda __response__: GetJiraConnectorResult(
        auths=pulumi.get(__response__, 'auths'),
        delegate_selectors=pulumi.get(__response__, 'delegate_selectors'),
        description=pulumi.get(__response__, 'description'),
        id=pulumi.get(__response__, 'id'),
        identifier=pulumi.get(__response__, 'identifier'),
        name=pulumi.get(__response__, 'name'),
        org_id=pulumi.get(__response__, 'org_id'),
        password_ref=pulumi.get(__response__, 'password_ref'),
        project_id=pulumi.get(__response__, 'project_id'),
        tags=pulumi.get(__response__, 'tags'),
        url=pulumi.get(__response__, 'url'),
        username=pulumi.get(__response__, 'username'),
        username_ref=pulumi.get(__response__, 'username_ref')))
