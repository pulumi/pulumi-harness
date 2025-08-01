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
    'GetSecretSshkeyResult',
    'AwaitableGetSecretSshkeyResult',
    'get_secret_sshkey',
    'get_secret_sshkey_output',
]

@pulumi.output_type
class GetSecretSshkeyResult:
    """
    A collection of values returned by getSecretSshkey.
    """
    def __init__(__self__, description=None, id=None, identifier=None, kerberos=None, name=None, org_id=None, port=None, project_id=None, sshes=None, tags=None):
        if description and not isinstance(description, str):
            raise TypeError("Expected argument 'description' to be a str")
        pulumi.set(__self__, "description", description)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if identifier and not isinstance(identifier, str):
            raise TypeError("Expected argument 'identifier' to be a str")
        pulumi.set(__self__, "identifier", identifier)
        if kerberos and not isinstance(kerberos, list):
            raise TypeError("Expected argument 'kerberos' to be a list")
        pulumi.set(__self__, "kerberos", kerberos)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if org_id and not isinstance(org_id, str):
            raise TypeError("Expected argument 'org_id' to be a str")
        pulumi.set(__self__, "org_id", org_id)
        if port and not isinstance(port, int):
            raise TypeError("Expected argument 'port' to be a int")
        pulumi.set(__self__, "port", port)
        if project_id and not isinstance(project_id, str):
            raise TypeError("Expected argument 'project_id' to be a str")
        pulumi.set(__self__, "project_id", project_id)
        if sshes and not isinstance(sshes, list):
            raise TypeError("Expected argument 'sshes' to be a list")
        pulumi.set(__self__, "sshes", sshes)
        if tags and not isinstance(tags, list):
            raise TypeError("Expected argument 'tags' to be a list")
        pulumi.set(__self__, "tags", tags)

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
    def kerberos(self) -> Sequence['outputs.GetSecretSshkeyKerberoResult']:
        """
        Kerberos authentication scheme
        """
        return pulumi.get(self, "kerberos")

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
    @pulumi.getter
    def port(self) -> _builtins.int:
        """
        SSH port
        """
        return pulumi.get(self, "port")

    @_builtins.property
    @pulumi.getter(name="projectId")
    def project_id(self) -> Optional[_builtins.str]:
        """
        Unique identifier of the project.
        """
        return pulumi.get(self, "project_id")

    @_builtins.property
    @pulumi.getter
    def sshes(self) -> Sequence['outputs.GetSecretSshkeySshResult']:
        """
        Kerberos authentication scheme
        """
        return pulumi.get(self, "sshes")

    @_builtins.property
    @pulumi.getter
    def tags(self) -> Sequence[_builtins.str]:
        """
        Tags to associate with the resource.
        """
        return pulumi.get(self, "tags")


class AwaitableGetSecretSshkeyResult(GetSecretSshkeyResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetSecretSshkeyResult(
            description=self.description,
            id=self.id,
            identifier=self.identifier,
            kerberos=self.kerberos,
            name=self.name,
            org_id=self.org_id,
            port=self.port,
            project_id=self.project_id,
            sshes=self.sshes,
            tags=self.tags)


def get_secret_sshkey(identifier: Optional[_builtins.str] = None,
                      name: Optional[_builtins.str] = None,
                      org_id: Optional[_builtins.str] = None,
                      project_id: Optional[_builtins.str] = None,
                      opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetSecretSshkeyResult:
    """
    ## Example Usage

    ```python
    import pulumi
    import pulumi_harness as harness

    example = harness.platform.get_secret_sshkey(identifier="identifier")
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
    __ret__ = pulumi.runtime.invoke('harness:platform/getSecretSshkey:getSecretSshkey', __args__, opts=opts, typ=GetSecretSshkeyResult).value

    return AwaitableGetSecretSshkeyResult(
        description=pulumi.get(__ret__, 'description'),
        id=pulumi.get(__ret__, 'id'),
        identifier=pulumi.get(__ret__, 'identifier'),
        kerberos=pulumi.get(__ret__, 'kerberos'),
        name=pulumi.get(__ret__, 'name'),
        org_id=pulumi.get(__ret__, 'org_id'),
        port=pulumi.get(__ret__, 'port'),
        project_id=pulumi.get(__ret__, 'project_id'),
        sshes=pulumi.get(__ret__, 'sshes'),
        tags=pulumi.get(__ret__, 'tags'))
def get_secret_sshkey_output(identifier: Optional[pulumi.Input[_builtins.str]] = None,
                             name: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                             org_id: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                             project_id: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                             opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetSecretSshkeyResult]:
    """
    ## Example Usage

    ```python
    import pulumi
    import pulumi_harness as harness

    example = harness.platform.get_secret_sshkey(identifier="identifier")
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
    __ret__ = pulumi.runtime.invoke_output('harness:platform/getSecretSshkey:getSecretSshkey', __args__, opts=opts, typ=GetSecretSshkeyResult)
    return __ret__.apply(lambda __response__: GetSecretSshkeyResult(
        description=pulumi.get(__response__, 'description'),
        id=pulumi.get(__response__, 'id'),
        identifier=pulumi.get(__response__, 'identifier'),
        kerberos=pulumi.get(__response__, 'kerberos'),
        name=pulumi.get(__response__, 'name'),
        org_id=pulumi.get(__response__, 'org_id'),
        port=pulumi.get(__response__, 'port'),
        project_id=pulumi.get(__response__, 'project_id'),
        sshes=pulumi.get(__response__, 'sshes'),
        tags=pulumi.get(__response__, 'tags')))
