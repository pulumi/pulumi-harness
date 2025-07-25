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
    'GetAzureCloudCostConnectorResult',
    'AwaitableGetAzureCloudCostConnectorResult',
    'get_azure_cloud_cost_connector',
    'get_azure_cloud_cost_connector_output',
]

@pulumi.output_type
class GetAzureCloudCostConnectorResult:
    """
    A collection of values returned by getAzureCloudCostConnector.
    """
    def __init__(__self__, billing_export_specs=None, description=None, features_enableds=None, id=None, identifier=None, name=None, org_id=None, project_id=None, subscription_id=None, tags=None, tenant_id=None):
        if billing_export_specs and not isinstance(billing_export_specs, list):
            raise TypeError("Expected argument 'billing_export_specs' to be a list")
        pulumi.set(__self__, "billing_export_specs", billing_export_specs)
        if description and not isinstance(description, str):
            raise TypeError("Expected argument 'description' to be a str")
        pulumi.set(__self__, "description", description)
        if features_enableds and not isinstance(features_enableds, list):
            raise TypeError("Expected argument 'features_enableds' to be a list")
        pulumi.set(__self__, "features_enableds", features_enableds)
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
        if project_id and not isinstance(project_id, str):
            raise TypeError("Expected argument 'project_id' to be a str")
        pulumi.set(__self__, "project_id", project_id)
        if subscription_id and not isinstance(subscription_id, str):
            raise TypeError("Expected argument 'subscription_id' to be a str")
        pulumi.set(__self__, "subscription_id", subscription_id)
        if tags and not isinstance(tags, list):
            raise TypeError("Expected argument 'tags' to be a list")
        pulumi.set(__self__, "tags", tags)
        if tenant_id and not isinstance(tenant_id, str):
            raise TypeError("Expected argument 'tenant_id' to be a str")
        pulumi.set(__self__, "tenant_id", tenant_id)

    @_builtins.property
    @pulumi.getter(name="billingExportSpecs")
    def billing_export_specs(self) -> Sequence['outputs.GetAzureCloudCostConnectorBillingExportSpecResult']:
        """
        Returns billing details for the Azure account.
        """
        return pulumi.get(self, "billing_export_specs")

    @_builtins.property
    @pulumi.getter
    def description(self) -> _builtins.str:
        """
        Description of the resource.
        """
        return pulumi.get(self, "description")

    @_builtins.property
    @pulumi.getter(name="featuresEnableds")
    def features_enableds(self) -> Sequence[_builtins.str]:
        """
        Indicates which feature to enable among Billing, Optimization, Visibility and Governance.
        """
        return pulumi.get(self, "features_enableds")

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
    @pulumi.getter(name="projectId")
    def project_id(self) -> Optional[_builtins.str]:
        """
        Unique identifier of the project.
        """
        return pulumi.get(self, "project_id")

    @_builtins.property
    @pulumi.getter(name="subscriptionId")
    def subscription_id(self) -> _builtins.str:
        """
        Subsription id.
        """
        return pulumi.get(self, "subscription_id")

    @_builtins.property
    @pulumi.getter
    def tags(self) -> Sequence[_builtins.str]:
        """
        Tags to associate with the resource.
        """
        return pulumi.get(self, "tags")

    @_builtins.property
    @pulumi.getter(name="tenantId")
    def tenant_id(self) -> _builtins.str:
        """
        Tenant id.
        """
        return pulumi.get(self, "tenant_id")


class AwaitableGetAzureCloudCostConnectorResult(GetAzureCloudCostConnectorResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetAzureCloudCostConnectorResult(
            billing_export_specs=self.billing_export_specs,
            description=self.description,
            features_enableds=self.features_enableds,
            id=self.id,
            identifier=self.identifier,
            name=self.name,
            org_id=self.org_id,
            project_id=self.project_id,
            subscription_id=self.subscription_id,
            tags=self.tags,
            tenant_id=self.tenant_id)


def get_azure_cloud_cost_connector(identifier: Optional[_builtins.str] = None,
                                   name: Optional[_builtins.str] = None,
                                   org_id: Optional[_builtins.str] = None,
                                   project_id: Optional[_builtins.str] = None,
                                   opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetAzureCloudCostConnectorResult:
    """
    Datasource for looking up an Azure Cloud Cost Connector.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_harness as harness

    example = harness.platform.get_azure_cloud_cost_connector(identifier="identifier")
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
    __ret__ = pulumi.runtime.invoke('harness:platform/getAzureCloudCostConnector:getAzureCloudCostConnector', __args__, opts=opts, typ=GetAzureCloudCostConnectorResult).value

    return AwaitableGetAzureCloudCostConnectorResult(
        billing_export_specs=pulumi.get(__ret__, 'billing_export_specs'),
        description=pulumi.get(__ret__, 'description'),
        features_enableds=pulumi.get(__ret__, 'features_enableds'),
        id=pulumi.get(__ret__, 'id'),
        identifier=pulumi.get(__ret__, 'identifier'),
        name=pulumi.get(__ret__, 'name'),
        org_id=pulumi.get(__ret__, 'org_id'),
        project_id=pulumi.get(__ret__, 'project_id'),
        subscription_id=pulumi.get(__ret__, 'subscription_id'),
        tags=pulumi.get(__ret__, 'tags'),
        tenant_id=pulumi.get(__ret__, 'tenant_id'))
def get_azure_cloud_cost_connector_output(identifier: Optional[pulumi.Input[_builtins.str]] = None,
                                          name: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                                          org_id: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                                          project_id: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                                          opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetAzureCloudCostConnectorResult]:
    """
    Datasource for looking up an Azure Cloud Cost Connector.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_harness as harness

    example = harness.platform.get_azure_cloud_cost_connector(identifier="identifier")
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
    __ret__ = pulumi.runtime.invoke_output('harness:platform/getAzureCloudCostConnector:getAzureCloudCostConnector', __args__, opts=opts, typ=GetAzureCloudCostConnectorResult)
    return __ret__.apply(lambda __response__: GetAzureCloudCostConnectorResult(
        billing_export_specs=pulumi.get(__response__, 'billing_export_specs'),
        description=pulumi.get(__response__, 'description'),
        features_enableds=pulumi.get(__response__, 'features_enableds'),
        id=pulumi.get(__response__, 'id'),
        identifier=pulumi.get(__response__, 'identifier'),
        name=pulumi.get(__response__, 'name'),
        org_id=pulumi.get(__response__, 'org_id'),
        project_id=pulumi.get(__response__, 'project_id'),
        subscription_id=pulumi.get(__response__, 'subscription_id'),
        tags=pulumi.get(__response__, 'tags'),
        tenant_id=pulumi.get(__response__, 'tenant_id')))
