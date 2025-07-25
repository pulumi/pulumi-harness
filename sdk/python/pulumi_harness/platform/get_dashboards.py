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

__all__ = [
    'GetDashboardsResult',
    'AwaitableGetDashboardsResult',
    'get_dashboards',
    'get_dashboards_output',
]

@pulumi.output_type
class GetDashboardsResult:
    """
    A collection of values returned by getDashboards.
    """
    def __init__(__self__, created_at=None, dashboard_id=None, data_sources=None, description=None, folder_id=None, id=None, identifier=None, models=None, name=None, resource_identifier=None, tags=None, title=None, type=None, view_count=None):
        if created_at and not isinstance(created_at, str):
            raise TypeError("Expected argument 'created_at' to be a str")
        pulumi.set(__self__, "created_at", created_at)
        if dashboard_id and not isinstance(dashboard_id, str):
            raise TypeError("Expected argument 'dashboard_id' to be a str")
        pulumi.set(__self__, "dashboard_id", dashboard_id)
        if data_sources and not isinstance(data_sources, list):
            raise TypeError("Expected argument 'data_sources' to be a list")
        pulumi.set(__self__, "data_sources", data_sources)
        if description and not isinstance(description, str):
            raise TypeError("Expected argument 'description' to be a str")
        pulumi.set(__self__, "description", description)
        if folder_id and not isinstance(folder_id, str):
            raise TypeError("Expected argument 'folder_id' to be a str")
        pulumi.set(__self__, "folder_id", folder_id)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if identifier and not isinstance(identifier, str):
            raise TypeError("Expected argument 'identifier' to be a str")
        pulumi.set(__self__, "identifier", identifier)
        if models and not isinstance(models, list):
            raise TypeError("Expected argument 'models' to be a list")
        pulumi.set(__self__, "models", models)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if resource_identifier and not isinstance(resource_identifier, str):
            raise TypeError("Expected argument 'resource_identifier' to be a str")
        pulumi.set(__self__, "resource_identifier", resource_identifier)
        if tags and not isinstance(tags, list):
            raise TypeError("Expected argument 'tags' to be a list")
        pulumi.set(__self__, "tags", tags)
        if title and not isinstance(title, str):
            raise TypeError("Expected argument 'title' to be a str")
        pulumi.set(__self__, "title", title)
        if type and not isinstance(type, str):
            raise TypeError("Expected argument 'type' to be a str")
        pulumi.set(__self__, "type", type)
        if view_count and not isinstance(view_count, int):
            raise TypeError("Expected argument 'view_count' to be a int")
        pulumi.set(__self__, "view_count", view_count)

    @_builtins.property
    @pulumi.getter(name="createdAt")
    def created_at(self) -> _builtins.str:
        """
        Created at timestamp of the Dashboard.
        """
        return pulumi.get(self, "created_at")

    @_builtins.property
    @pulumi.getter(name="dashboardId")
    def dashboard_id(self) -> _builtins.str:
        """
        Unique identifier of the Dashboard.
        """
        return pulumi.get(self, "dashboard_id")

    @_builtins.property
    @pulumi.getter(name="dataSources")
    def data_sources(self) -> Sequence[_builtins.str]:
        """
        Data Sources within the Dashboard.
        """
        return pulumi.get(self, "data_sources")

    @_builtins.property
    @pulumi.getter
    def description(self) -> _builtins.str:
        """
        Description of the Dashboard.
        """
        return pulumi.get(self, "description")

    @_builtins.property
    @pulumi.getter(name="folderId")
    def folder_id(self) -> _builtins.str:
        """
        Unique identifier of the Folder.
        """
        return pulumi.get(self, "folder_id")

    @_builtins.property
    @pulumi.getter
    def id(self) -> _builtins.str:
        """
        Identifier of the dashboard.
        """
        return pulumi.get(self, "id")

    @_builtins.property
    @pulumi.getter
    def identifier(self) -> Optional[_builtins.str]:
        return pulumi.get(self, "identifier")

    @_builtins.property
    @pulumi.getter
    def models(self) -> Sequence[_builtins.str]:
        """
        Data Models within the Dashboard.
        """
        return pulumi.get(self, "models")

    @_builtins.property
    @pulumi.getter
    def name(self) -> Optional[_builtins.str]:
        """
        Name of the Dashboard.
        """
        return pulumi.get(self, "name")

    @_builtins.property
    @pulumi.getter(name="resourceIdentifier")
    def resource_identifier(self) -> _builtins.str:
        """
        Resource identifier of the dashboard.
        """
        return pulumi.get(self, "resource_identifier")

    @_builtins.property
    @pulumi.getter
    def tags(self) -> Sequence[_builtins.str]:
        return pulumi.get(self, "tags")

    @_builtins.property
    @pulumi.getter
    def title(self) -> _builtins.str:
        """
        Title of the Dashboard.
        """
        return pulumi.get(self, "title")

    @_builtins.property
    @pulumi.getter
    def type(self) -> _builtins.str:
        """
        Type of the dashboard.
        """
        return pulumi.get(self, "type")

    @_builtins.property
    @pulumi.getter(name="viewCount")
    def view_count(self) -> _builtins.int:
        """
        View count of the dashboard.
        """
        return pulumi.get(self, "view_count")


class AwaitableGetDashboardsResult(GetDashboardsResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetDashboardsResult(
            created_at=self.created_at,
            dashboard_id=self.dashboard_id,
            data_sources=self.data_sources,
            description=self.description,
            folder_id=self.folder_id,
            id=self.id,
            identifier=self.identifier,
            models=self.models,
            name=self.name,
            resource_identifier=self.resource_identifier,
            tags=self.tags,
            title=self.title,
            type=self.type,
            view_count=self.view_count)


def get_dashboards(id: Optional[_builtins.str] = None,
                   identifier: Optional[_builtins.str] = None,
                   name: Optional[_builtins.str] = None,
                   opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetDashboardsResult:
    """
    Data source for retrieving a Harness Dashboard.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_harness as harness

    example = harness.platform.get_dashboards(id="48525")
    ```


    :param _builtins.str id: Identifier of the dashboard.
    :param _builtins.str name: Name of the Dashboard.
    """
    __args__ = dict()
    __args__['id'] = id
    __args__['identifier'] = identifier
    __args__['name'] = name
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('harness:platform/getDashboards:getDashboards', __args__, opts=opts, typ=GetDashboardsResult).value

    return AwaitableGetDashboardsResult(
        created_at=pulumi.get(__ret__, 'created_at'),
        dashboard_id=pulumi.get(__ret__, 'dashboard_id'),
        data_sources=pulumi.get(__ret__, 'data_sources'),
        description=pulumi.get(__ret__, 'description'),
        folder_id=pulumi.get(__ret__, 'folder_id'),
        id=pulumi.get(__ret__, 'id'),
        identifier=pulumi.get(__ret__, 'identifier'),
        models=pulumi.get(__ret__, 'models'),
        name=pulumi.get(__ret__, 'name'),
        resource_identifier=pulumi.get(__ret__, 'resource_identifier'),
        tags=pulumi.get(__ret__, 'tags'),
        title=pulumi.get(__ret__, 'title'),
        type=pulumi.get(__ret__, 'type'),
        view_count=pulumi.get(__ret__, 'view_count'))
def get_dashboards_output(id: Optional[pulumi.Input[_builtins.str]] = None,
                          identifier: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                          name: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                          opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetDashboardsResult]:
    """
    Data source for retrieving a Harness Dashboard.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_harness as harness

    example = harness.platform.get_dashboards(id="48525")
    ```


    :param _builtins.str id: Identifier of the dashboard.
    :param _builtins.str name: Name of the Dashboard.
    """
    __args__ = dict()
    __args__['id'] = id
    __args__['identifier'] = identifier
    __args__['name'] = name
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('harness:platform/getDashboards:getDashboards', __args__, opts=opts, typ=GetDashboardsResult)
    return __ret__.apply(lambda __response__: GetDashboardsResult(
        created_at=pulumi.get(__response__, 'created_at'),
        dashboard_id=pulumi.get(__response__, 'dashboard_id'),
        data_sources=pulumi.get(__response__, 'data_sources'),
        description=pulumi.get(__response__, 'description'),
        folder_id=pulumi.get(__response__, 'folder_id'),
        id=pulumi.get(__response__, 'id'),
        identifier=pulumi.get(__response__, 'identifier'),
        models=pulumi.get(__response__, 'models'),
        name=pulumi.get(__response__, 'name'),
        resource_identifier=pulumi.get(__response__, 'resource_identifier'),
        tags=pulumi.get(__response__, 'tags'),
        title=pulumi.get(__response__, 'title'),
        type=pulumi.get(__response__, 'type'),
        view_count=pulumi.get(__response__, 'view_count')))
