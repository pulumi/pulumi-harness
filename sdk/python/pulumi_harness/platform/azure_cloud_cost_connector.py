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

__all__ = ['AzureCloudCostConnectorArgs', 'AzureCloudCostConnector']

@pulumi.input_type
class AzureCloudCostConnectorArgs:
    def __init__(__self__, *,
                 features_enableds: pulumi.Input[Sequence[pulumi.Input[_builtins.str]]],
                 identifier: pulumi.Input[_builtins.str],
                 subscription_id: pulumi.Input[_builtins.str],
                 tenant_id: pulumi.Input[_builtins.str],
                 billing_export_spec: Optional[pulumi.Input['AzureCloudCostConnectorBillingExportSpecArgs']] = None,
                 description: Optional[pulumi.Input[_builtins.str]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 org_id: Optional[pulumi.Input[_builtins.str]] = None,
                 project_id: Optional[pulumi.Input[_builtins.str]] = None,
                 tags: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]] = None):
        """
        The set of arguments for constructing a AzureCloudCostConnector resource.
        :param pulumi.Input[Sequence[pulumi.Input[_builtins.str]]] features_enableds: Indicates which feature to enable among Billing, Optimization, Visibility and Governance.
        :param pulumi.Input[_builtins.str] identifier: Unique identifier of the resource.
        :param pulumi.Input[_builtins.str] subscription_id: Subsription id.
        :param pulumi.Input[_builtins.str] tenant_id: Tenant id.
        :param pulumi.Input['AzureCloudCostConnectorBillingExportSpecArgs'] billing_export_spec: Returns billing details for the Azure account.
        :param pulumi.Input[_builtins.str] description: Description of the resource.
        :param pulumi.Input[_builtins.str] name: Name of the resource.
        :param pulumi.Input[_builtins.str] org_id: Unique identifier of the organization.
        :param pulumi.Input[_builtins.str] project_id: Unique identifier of the project.
        :param pulumi.Input[Sequence[pulumi.Input[_builtins.str]]] tags: Tags to associate with the resource.
        """
        pulumi.set(__self__, "features_enableds", features_enableds)
        pulumi.set(__self__, "identifier", identifier)
        pulumi.set(__self__, "subscription_id", subscription_id)
        pulumi.set(__self__, "tenant_id", tenant_id)
        if billing_export_spec is not None:
            pulumi.set(__self__, "billing_export_spec", billing_export_spec)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if org_id is not None:
            pulumi.set(__self__, "org_id", org_id)
        if project_id is not None:
            pulumi.set(__self__, "project_id", project_id)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)

    @_builtins.property
    @pulumi.getter(name="featuresEnableds")
    def features_enableds(self) -> pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]:
        """
        Indicates which feature to enable among Billing, Optimization, Visibility and Governance.
        """
        return pulumi.get(self, "features_enableds")

    @features_enableds.setter
    def features_enableds(self, value: pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]):
        pulumi.set(self, "features_enableds", value)

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
    @pulumi.getter(name="subscriptionId")
    def subscription_id(self) -> pulumi.Input[_builtins.str]:
        """
        Subsription id.
        """
        return pulumi.get(self, "subscription_id")

    @subscription_id.setter
    def subscription_id(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "subscription_id", value)

    @_builtins.property
    @pulumi.getter(name="tenantId")
    def tenant_id(self) -> pulumi.Input[_builtins.str]:
        """
        Tenant id.
        """
        return pulumi.get(self, "tenant_id")

    @tenant_id.setter
    def tenant_id(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "tenant_id", value)

    @_builtins.property
    @pulumi.getter(name="billingExportSpec")
    def billing_export_spec(self) -> Optional[pulumi.Input['AzureCloudCostConnectorBillingExportSpecArgs']]:
        """
        Returns billing details for the Azure account.
        """
        return pulumi.get(self, "billing_export_spec")

    @billing_export_spec.setter
    def billing_export_spec(self, value: Optional[pulumi.Input['AzureCloudCostConnectorBillingExportSpecArgs']]):
        pulumi.set(self, "billing_export_spec", value)

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


@pulumi.input_type
class _AzureCloudCostConnectorState:
    def __init__(__self__, *,
                 billing_export_spec: Optional[pulumi.Input['AzureCloudCostConnectorBillingExportSpecArgs']] = None,
                 description: Optional[pulumi.Input[_builtins.str]] = None,
                 features_enableds: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]] = None,
                 identifier: Optional[pulumi.Input[_builtins.str]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 org_id: Optional[pulumi.Input[_builtins.str]] = None,
                 project_id: Optional[pulumi.Input[_builtins.str]] = None,
                 subscription_id: Optional[pulumi.Input[_builtins.str]] = None,
                 tags: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]] = None,
                 tenant_id: Optional[pulumi.Input[_builtins.str]] = None):
        """
        Input properties used for looking up and filtering AzureCloudCostConnector resources.
        :param pulumi.Input['AzureCloudCostConnectorBillingExportSpecArgs'] billing_export_spec: Returns billing details for the Azure account.
        :param pulumi.Input[_builtins.str] description: Description of the resource.
        :param pulumi.Input[Sequence[pulumi.Input[_builtins.str]]] features_enableds: Indicates which feature to enable among Billing, Optimization, Visibility and Governance.
        :param pulumi.Input[_builtins.str] identifier: Unique identifier of the resource.
        :param pulumi.Input[_builtins.str] name: Name of the resource.
        :param pulumi.Input[_builtins.str] org_id: Unique identifier of the organization.
        :param pulumi.Input[_builtins.str] project_id: Unique identifier of the project.
        :param pulumi.Input[_builtins.str] subscription_id: Subsription id.
        :param pulumi.Input[Sequence[pulumi.Input[_builtins.str]]] tags: Tags to associate with the resource.
        :param pulumi.Input[_builtins.str] tenant_id: Tenant id.
        """
        if billing_export_spec is not None:
            pulumi.set(__self__, "billing_export_spec", billing_export_spec)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if features_enableds is not None:
            pulumi.set(__self__, "features_enableds", features_enableds)
        if identifier is not None:
            pulumi.set(__self__, "identifier", identifier)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if org_id is not None:
            pulumi.set(__self__, "org_id", org_id)
        if project_id is not None:
            pulumi.set(__self__, "project_id", project_id)
        if subscription_id is not None:
            pulumi.set(__self__, "subscription_id", subscription_id)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)
        if tenant_id is not None:
            pulumi.set(__self__, "tenant_id", tenant_id)

    @_builtins.property
    @pulumi.getter(name="billingExportSpec")
    def billing_export_spec(self) -> Optional[pulumi.Input['AzureCloudCostConnectorBillingExportSpecArgs']]:
        """
        Returns billing details for the Azure account.
        """
        return pulumi.get(self, "billing_export_spec")

    @billing_export_spec.setter
    def billing_export_spec(self, value: Optional[pulumi.Input['AzureCloudCostConnectorBillingExportSpecArgs']]):
        pulumi.set(self, "billing_export_spec", value)

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
    @pulumi.getter(name="featuresEnableds")
    def features_enableds(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]]:
        """
        Indicates which feature to enable among Billing, Optimization, Visibility and Governance.
        """
        return pulumi.get(self, "features_enableds")

    @features_enableds.setter
    def features_enableds(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]]):
        pulumi.set(self, "features_enableds", value)

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
    @pulumi.getter(name="subscriptionId")
    def subscription_id(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Subsription id.
        """
        return pulumi.get(self, "subscription_id")

    @subscription_id.setter
    def subscription_id(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "subscription_id", value)

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
    @pulumi.getter(name="tenantId")
    def tenant_id(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Tenant id.
        """
        return pulumi.get(self, "tenant_id")

    @tenant_id.setter
    def tenant_id(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "tenant_id", value)


@pulumi.type_token("harness:platform/azureCloudCostConnector:AzureCloudCostConnector")
class AzureCloudCostConnector(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 billing_export_spec: Optional[pulumi.Input[Union['AzureCloudCostConnectorBillingExportSpecArgs', 'AzureCloudCostConnectorBillingExportSpecArgsDict']]] = None,
                 description: Optional[pulumi.Input[_builtins.str]] = None,
                 features_enableds: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]] = None,
                 identifier: Optional[pulumi.Input[_builtins.str]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 org_id: Optional[pulumi.Input[_builtins.str]] = None,
                 project_id: Optional[pulumi.Input[_builtins.str]] = None,
                 subscription_id: Optional[pulumi.Input[_builtins.str]] = None,
                 tags: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]] = None,
                 tenant_id: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        """
        Resource for creating an Azure Cloud Cost connector in Harness.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_harness as harness

        example = harness.platform.AzureCloudCostConnector("example",
            identifier="identifier",
            name="name",
            description="example",
            tags=["foo:bar"],
            features_enableds=[
                "BILLING",
                "VISIBILITY",
                "OPTIMIZATION",
                "GOVERNANCE",
            ],
            tenant_id="tenant_id",
            subscription_id="subscription_id",
            billing_export_spec={
                "storage_account_name": "storage_account_name",
                "container_name": "container_name",
                "directory_name": "directory_name",
                "report_name": "report_name",
                "subscription_id": "subscription_id",
            })
        ```

        ## Import

        Import account level azure cloud cost connector

        ```sh
        $ pulumi import harness:platform/azureCloudCostConnector:AzureCloudCostConnector example <connector_id>
        ```

        Import org level azure cloud cost connector

        ```sh
        $ pulumi import harness:platform/azureCloudCostConnector:AzureCloudCostConnector example <ord_id>/<connector_id>
        ```

        Import project level azure cloud cost connector

        ```sh
        $ pulumi import harness:platform/azureCloudCostConnector:AzureCloudCostConnector example <org_id>/<project_id>/<connector_id>
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Union['AzureCloudCostConnectorBillingExportSpecArgs', 'AzureCloudCostConnectorBillingExportSpecArgsDict']] billing_export_spec: Returns billing details for the Azure account.
        :param pulumi.Input[_builtins.str] description: Description of the resource.
        :param pulumi.Input[Sequence[pulumi.Input[_builtins.str]]] features_enableds: Indicates which feature to enable among Billing, Optimization, Visibility and Governance.
        :param pulumi.Input[_builtins.str] identifier: Unique identifier of the resource.
        :param pulumi.Input[_builtins.str] name: Name of the resource.
        :param pulumi.Input[_builtins.str] org_id: Unique identifier of the organization.
        :param pulumi.Input[_builtins.str] project_id: Unique identifier of the project.
        :param pulumi.Input[_builtins.str] subscription_id: Subsription id.
        :param pulumi.Input[Sequence[pulumi.Input[_builtins.str]]] tags: Tags to associate with the resource.
        :param pulumi.Input[_builtins.str] tenant_id: Tenant id.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: AzureCloudCostConnectorArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Resource for creating an Azure Cloud Cost connector in Harness.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_harness as harness

        example = harness.platform.AzureCloudCostConnector("example",
            identifier="identifier",
            name="name",
            description="example",
            tags=["foo:bar"],
            features_enableds=[
                "BILLING",
                "VISIBILITY",
                "OPTIMIZATION",
                "GOVERNANCE",
            ],
            tenant_id="tenant_id",
            subscription_id="subscription_id",
            billing_export_spec={
                "storage_account_name": "storage_account_name",
                "container_name": "container_name",
                "directory_name": "directory_name",
                "report_name": "report_name",
                "subscription_id": "subscription_id",
            })
        ```

        ## Import

        Import account level azure cloud cost connector

        ```sh
        $ pulumi import harness:platform/azureCloudCostConnector:AzureCloudCostConnector example <connector_id>
        ```

        Import org level azure cloud cost connector

        ```sh
        $ pulumi import harness:platform/azureCloudCostConnector:AzureCloudCostConnector example <ord_id>/<connector_id>
        ```

        Import project level azure cloud cost connector

        ```sh
        $ pulumi import harness:platform/azureCloudCostConnector:AzureCloudCostConnector example <org_id>/<project_id>/<connector_id>
        ```

        :param str resource_name: The name of the resource.
        :param AzureCloudCostConnectorArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(AzureCloudCostConnectorArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 billing_export_spec: Optional[pulumi.Input[Union['AzureCloudCostConnectorBillingExportSpecArgs', 'AzureCloudCostConnectorBillingExportSpecArgsDict']]] = None,
                 description: Optional[pulumi.Input[_builtins.str]] = None,
                 features_enableds: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]] = None,
                 identifier: Optional[pulumi.Input[_builtins.str]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 org_id: Optional[pulumi.Input[_builtins.str]] = None,
                 project_id: Optional[pulumi.Input[_builtins.str]] = None,
                 subscription_id: Optional[pulumi.Input[_builtins.str]] = None,
                 tags: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]] = None,
                 tenant_id: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = AzureCloudCostConnectorArgs.__new__(AzureCloudCostConnectorArgs)

            __props__.__dict__["billing_export_spec"] = billing_export_spec
            __props__.__dict__["description"] = description
            if features_enableds is None and not opts.urn:
                raise TypeError("Missing required property 'features_enableds'")
            __props__.__dict__["features_enableds"] = features_enableds
            if identifier is None and not opts.urn:
                raise TypeError("Missing required property 'identifier'")
            __props__.__dict__["identifier"] = identifier
            __props__.__dict__["name"] = name
            __props__.__dict__["org_id"] = org_id
            __props__.__dict__["project_id"] = project_id
            if subscription_id is None and not opts.urn:
                raise TypeError("Missing required property 'subscription_id'")
            __props__.__dict__["subscription_id"] = subscription_id
            __props__.__dict__["tags"] = tags
            if tenant_id is None and not opts.urn:
                raise TypeError("Missing required property 'tenant_id'")
            __props__.__dict__["tenant_id"] = tenant_id
        super(AzureCloudCostConnector, __self__).__init__(
            'harness:platform/azureCloudCostConnector:AzureCloudCostConnector',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            billing_export_spec: Optional[pulumi.Input[Union['AzureCloudCostConnectorBillingExportSpecArgs', 'AzureCloudCostConnectorBillingExportSpecArgsDict']]] = None,
            description: Optional[pulumi.Input[_builtins.str]] = None,
            features_enableds: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]] = None,
            identifier: Optional[pulumi.Input[_builtins.str]] = None,
            name: Optional[pulumi.Input[_builtins.str]] = None,
            org_id: Optional[pulumi.Input[_builtins.str]] = None,
            project_id: Optional[pulumi.Input[_builtins.str]] = None,
            subscription_id: Optional[pulumi.Input[_builtins.str]] = None,
            tags: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]] = None,
            tenant_id: Optional[pulumi.Input[_builtins.str]] = None) -> 'AzureCloudCostConnector':
        """
        Get an existing AzureCloudCostConnector resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Union['AzureCloudCostConnectorBillingExportSpecArgs', 'AzureCloudCostConnectorBillingExportSpecArgsDict']] billing_export_spec: Returns billing details for the Azure account.
        :param pulumi.Input[_builtins.str] description: Description of the resource.
        :param pulumi.Input[Sequence[pulumi.Input[_builtins.str]]] features_enableds: Indicates which feature to enable among Billing, Optimization, Visibility and Governance.
        :param pulumi.Input[_builtins.str] identifier: Unique identifier of the resource.
        :param pulumi.Input[_builtins.str] name: Name of the resource.
        :param pulumi.Input[_builtins.str] org_id: Unique identifier of the organization.
        :param pulumi.Input[_builtins.str] project_id: Unique identifier of the project.
        :param pulumi.Input[_builtins.str] subscription_id: Subsription id.
        :param pulumi.Input[Sequence[pulumi.Input[_builtins.str]]] tags: Tags to associate with the resource.
        :param pulumi.Input[_builtins.str] tenant_id: Tenant id.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _AzureCloudCostConnectorState.__new__(_AzureCloudCostConnectorState)

        __props__.__dict__["billing_export_spec"] = billing_export_spec
        __props__.__dict__["description"] = description
        __props__.__dict__["features_enableds"] = features_enableds
        __props__.__dict__["identifier"] = identifier
        __props__.__dict__["name"] = name
        __props__.__dict__["org_id"] = org_id
        __props__.__dict__["project_id"] = project_id
        __props__.__dict__["subscription_id"] = subscription_id
        __props__.__dict__["tags"] = tags
        __props__.__dict__["tenant_id"] = tenant_id
        return AzureCloudCostConnector(resource_name, opts=opts, __props__=__props__)

    @_builtins.property
    @pulumi.getter(name="billingExportSpec")
    def billing_export_spec(self) -> pulumi.Output[Optional['outputs.AzureCloudCostConnectorBillingExportSpec']]:
        """
        Returns billing details for the Azure account.
        """
        return pulumi.get(self, "billing_export_spec")

    @_builtins.property
    @pulumi.getter
    def description(self) -> pulumi.Output[Optional[_builtins.str]]:
        """
        Description of the resource.
        """
        return pulumi.get(self, "description")

    @_builtins.property
    @pulumi.getter(name="featuresEnableds")
    def features_enableds(self) -> pulumi.Output[Sequence[_builtins.str]]:
        """
        Indicates which feature to enable among Billing, Optimization, Visibility and Governance.
        """
        return pulumi.get(self, "features_enableds")

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
    @pulumi.getter(name="projectId")
    def project_id(self) -> pulumi.Output[Optional[_builtins.str]]:
        """
        Unique identifier of the project.
        """
        return pulumi.get(self, "project_id")

    @_builtins.property
    @pulumi.getter(name="subscriptionId")
    def subscription_id(self) -> pulumi.Output[_builtins.str]:
        """
        Subsription id.
        """
        return pulumi.get(self, "subscription_id")

    @_builtins.property
    @pulumi.getter
    def tags(self) -> pulumi.Output[Optional[Sequence[_builtins.str]]]:
        """
        Tags to associate with the resource.
        """
        return pulumi.get(self, "tags")

    @_builtins.property
    @pulumi.getter(name="tenantId")
    def tenant_id(self) -> pulumi.Output[_builtins.str]:
        """
        Tenant id.
        """
        return pulumi.get(self, "tenant_id")

