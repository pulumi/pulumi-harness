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
    'GetServiceListResult',
    'AwaitableGetServiceListResult',
    'get_service_list',
    'get_service_list_output',
]

@pulumi.output_type
class GetServiceListResult:
    """
    A collection of values returned by getServiceList.
    """
    def __init__(__self__, id=None, org_id=None, page=None, project_id=None, services=None, size=None):
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if org_id and not isinstance(org_id, str):
            raise TypeError("Expected argument 'org_id' to be a str")
        pulumi.set(__self__, "org_id", org_id)
        if page and not isinstance(page, int):
            raise TypeError("Expected argument 'page' to be a int")
        pulumi.set(__self__, "page", page)
        if project_id and not isinstance(project_id, str):
            raise TypeError("Expected argument 'project_id' to be a str")
        pulumi.set(__self__, "project_id", project_id)
        if services and not isinstance(services, list):
            raise TypeError("Expected argument 'services' to be a list")
        pulumi.set(__self__, "services", services)
        if size and not isinstance(size, int):
            raise TypeError("Expected argument 'size' to be a int")
        pulumi.set(__self__, "size", size)

    @_builtins.property
    @pulumi.getter
    def id(self) -> _builtins.str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @_builtins.property
    @pulumi.getter(name="orgId")
    def org_id(self) -> Optional[_builtins.str]:
        return pulumi.get(self, "org_id")

    @_builtins.property
    @pulumi.getter
    def page(self) -> Optional[_builtins.int]:
        return pulumi.get(self, "page")

    @_builtins.property
    @pulumi.getter(name="projectId")
    def project_id(self) -> Optional[_builtins.str]:
        return pulumi.get(self, "project_id")

    @_builtins.property
    @pulumi.getter
    def services(self) -> Sequence['outputs.GetServiceListServiceResult']:
        return pulumi.get(self, "services")

    @_builtins.property
    @pulumi.getter
    def size(self) -> Optional[_builtins.int]:
        return pulumi.get(self, "size")


class AwaitableGetServiceListResult(GetServiceListResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetServiceListResult(
            id=self.id,
            org_id=self.org_id,
            page=self.page,
            project_id=self.project_id,
            services=self.services,
            size=self.size)


def get_service_list(org_id: Optional[_builtins.str] = None,
                     page: Optional[_builtins.int] = None,
                     project_id: Optional[_builtins.str] = None,
                     size: Optional[_builtins.int] = None,
                     opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetServiceListResult:
    """
    Data source for retrieving Harness service list.

    ## Example Usage

    ### Project Level Service List

    ```python
    import pulumi
    import pulumi_harness as harness

    example = harness.platform.get_service_list(org_id="org_id",
        project_id="project_id")
    ```

    ### Organisation Level Service List

    ```python
    import pulumi
    import pulumi_harness as harness

    example = harness.platform.get_service_list(org_id="org_id")
    ```

    ### Account Level Service List

    ```python
    import pulumi
    import pulumi_harness as harness

    example = harness.platform.get_service_list()
    ```
    """
    __args__ = dict()
    __args__['orgId'] = org_id
    __args__['page'] = page
    __args__['projectId'] = project_id
    __args__['size'] = size
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('harness:platform/getServiceList:getServiceList', __args__, opts=opts, typ=GetServiceListResult).value

    return AwaitableGetServiceListResult(
        id=pulumi.get(__ret__, 'id'),
        org_id=pulumi.get(__ret__, 'org_id'),
        page=pulumi.get(__ret__, 'page'),
        project_id=pulumi.get(__ret__, 'project_id'),
        services=pulumi.get(__ret__, 'services'),
        size=pulumi.get(__ret__, 'size'))
def get_service_list_output(org_id: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                            page: Optional[pulumi.Input[Optional[_builtins.int]]] = None,
                            project_id: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                            size: Optional[pulumi.Input[Optional[_builtins.int]]] = None,
                            opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetServiceListResult]:
    """
    Data source for retrieving Harness service list.

    ## Example Usage

    ### Project Level Service List

    ```python
    import pulumi
    import pulumi_harness as harness

    example = harness.platform.get_service_list(org_id="org_id",
        project_id="project_id")
    ```

    ### Organisation Level Service List

    ```python
    import pulumi
    import pulumi_harness as harness

    example = harness.platform.get_service_list(org_id="org_id")
    ```

    ### Account Level Service List

    ```python
    import pulumi
    import pulumi_harness as harness

    example = harness.platform.get_service_list()
    ```
    """
    __args__ = dict()
    __args__['orgId'] = org_id
    __args__['page'] = page
    __args__['projectId'] = project_id
    __args__['size'] = size
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('harness:platform/getServiceList:getServiceList', __args__, opts=opts, typ=GetServiceListResult)
    return __ret__.apply(lambda __response__: GetServiceListResult(
        id=pulumi.get(__response__, 'id'),
        org_id=pulumi.get(__response__, 'org_id'),
        page=pulumi.get(__response__, 'page'),
        project_id=pulumi.get(__response__, 'project_id'),
        services=pulumi.get(__response__, 'services'),
        size=pulumi.get(__response__, 'size')))
