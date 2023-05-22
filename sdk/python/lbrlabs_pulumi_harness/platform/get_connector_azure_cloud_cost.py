# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities
from . import outputs

__all__ = [
    'GetConnectorAzureCloudCostResult',
    'AwaitableGetConnectorAzureCloudCostResult',
    'get_connector_azure_cloud_cost',
    'get_connector_azure_cloud_cost_output',
]

@pulumi.output_type
class GetConnectorAzureCloudCostResult:
    """
    A collection of values returned by getConnectorAzureCloudCost.
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

    @property
    @pulumi.getter(name="billingExportSpecs")
    def billing_export_specs(self) -> Sequence['outputs.GetConnectorAzureCloudCostBillingExportSpecResult']:
        """
        Returns billing details for the Azure account.
        """
        return pulumi.get(self, "billing_export_specs")

    @property
    @pulumi.getter
    def description(self) -> str:
        """
        Description of the resource.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter(name="featuresEnableds")
    def features_enableds(self) -> Sequence[str]:
        """
        Indicates which feature to enable among Billing, Optimization, and Visibility.
        """
        return pulumi.get(self, "features_enableds")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def identifier(self) -> str:
        """
        Unique identifier of the resource.
        """
        return pulumi.get(self, "identifier")

    @property
    @pulumi.getter
    def name(self) -> Optional[str]:
        """
        Name of the resource.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="orgId")
    def org_id(self) -> Optional[str]:
        """
        Unique identifier of the organization.
        """
        return pulumi.get(self, "org_id")

    @property
    @pulumi.getter(name="projectId")
    def project_id(self) -> Optional[str]:
        """
        Unique identifier of the project.
        """
        return pulumi.get(self, "project_id")

    @property
    @pulumi.getter(name="subscriptionId")
    def subscription_id(self) -> str:
        """
        Subsription id.
        """
        return pulumi.get(self, "subscription_id")

    @property
    @pulumi.getter
    def tags(self) -> Sequence[str]:
        """
        Tags to associate with the resource.
        """
        return pulumi.get(self, "tags")

    @property
    @pulumi.getter(name="tenantId")
    def tenant_id(self) -> str:
        """
        Tenant id.
        """
        return pulumi.get(self, "tenant_id")


class AwaitableGetConnectorAzureCloudCostResult(GetConnectorAzureCloudCostResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetConnectorAzureCloudCostResult(
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


def get_connector_azure_cloud_cost(identifier: Optional[str] = None,
                                   name: Optional[str] = None,
                                   org_id: Optional[str] = None,
                                   project_id: Optional[str] = None,
                                   opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetConnectorAzureCloudCostResult:
    """
    Datasource for looking up an Azure Cloud Cost Connector.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_harness as harness

    example = harness.platform.get_connector_azure_cloud_cost(identifier="identifier")
    ```


    :param str identifier: Unique identifier of the resource.
    :param str name: Name of the resource.
    :param str org_id: Unique identifier of the organization.
    :param str project_id: Unique identifier of the project.
    """
    __args__ = dict()
    __args__['identifier'] = identifier
    __args__['name'] = name
    __args__['orgId'] = org_id
    __args__['projectId'] = project_id
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('harness:platform/getConnectorAzureCloudCost:getConnectorAzureCloudCost', __args__, opts=opts, typ=GetConnectorAzureCloudCostResult).value

    return AwaitableGetConnectorAzureCloudCostResult(
        billing_export_specs=__ret__.billing_export_specs,
        description=__ret__.description,
        features_enableds=__ret__.features_enableds,
        id=__ret__.id,
        identifier=__ret__.identifier,
        name=__ret__.name,
        org_id=__ret__.org_id,
        project_id=__ret__.project_id,
        subscription_id=__ret__.subscription_id,
        tags=__ret__.tags,
        tenant_id=__ret__.tenant_id)


@_utilities.lift_output_func(get_connector_azure_cloud_cost)
def get_connector_azure_cloud_cost_output(identifier: Optional[pulumi.Input[str]] = None,
                                          name: Optional[pulumi.Input[Optional[str]]] = None,
                                          org_id: Optional[pulumi.Input[Optional[str]]] = None,
                                          project_id: Optional[pulumi.Input[Optional[str]]] = None,
                                          opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetConnectorAzureCloudCostResult]:
    """
    Datasource for looking up an Azure Cloud Cost Connector.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_harness as harness

    example = harness.platform.get_connector_azure_cloud_cost(identifier="identifier")
    ```


    :param str identifier: Unique identifier of the resource.
    :param str name: Name of the resource.
    :param str org_id: Unique identifier of the organization.
    :param str project_id: Unique identifier of the project.
    """
    ...