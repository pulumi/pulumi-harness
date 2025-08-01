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

__all__ = ['PagerdutyConnectorArgs', 'PagerdutyConnector']

@pulumi.input_type
class PagerdutyConnectorArgs:
    def __init__(__self__, *,
                 api_token_ref: pulumi.Input[_builtins.str],
                 identifier: pulumi.Input[_builtins.str],
                 delegate_selectors: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]] = None,
                 description: Optional[pulumi.Input[_builtins.str]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 org_id: Optional[pulumi.Input[_builtins.str]] = None,
                 project_id: Optional[pulumi.Input[_builtins.str]] = None,
                 tags: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]] = None):
        """
        The set of arguments for constructing a PagerdutyConnector resource.
        :param pulumi.Input[_builtins.str] api_token_ref: Reference to the Harness secret containing the api token. To reference a secret at the organization scope, prefix 'org' to the expression: org.{identifier}. To reference a secret at the account scope, prefix 'account` to the expression: account.{identifier}.
        :param pulumi.Input[_builtins.str] identifier: Unique identifier of the resource.
        :param pulumi.Input[Sequence[pulumi.Input[_builtins.str]]] delegate_selectors: Tags to filter delegates for connection.
        :param pulumi.Input[_builtins.str] description: Description of the resource.
        :param pulumi.Input[_builtins.str] name: Name of the resource.
        :param pulumi.Input[_builtins.str] org_id: Unique identifier of the organization.
        :param pulumi.Input[_builtins.str] project_id: Unique identifier of the project.
        :param pulumi.Input[Sequence[pulumi.Input[_builtins.str]]] tags: Tags to associate with the resource.
        """
        pulumi.set(__self__, "api_token_ref", api_token_ref)
        pulumi.set(__self__, "identifier", identifier)
        if delegate_selectors is not None:
            pulumi.set(__self__, "delegate_selectors", delegate_selectors)
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
    @pulumi.getter(name="apiTokenRef")
    def api_token_ref(self) -> pulumi.Input[_builtins.str]:
        """
        Reference to the Harness secret containing the api token. To reference a secret at the organization scope, prefix 'org' to the expression: org.{identifier}. To reference a secret at the account scope, prefix 'account` to the expression: account.{identifier}.
        """
        return pulumi.get(self, "api_token_ref")

    @api_token_ref.setter
    def api_token_ref(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "api_token_ref", value)

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
class _PagerdutyConnectorState:
    def __init__(__self__, *,
                 api_token_ref: Optional[pulumi.Input[_builtins.str]] = None,
                 delegate_selectors: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]] = None,
                 description: Optional[pulumi.Input[_builtins.str]] = None,
                 identifier: Optional[pulumi.Input[_builtins.str]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 org_id: Optional[pulumi.Input[_builtins.str]] = None,
                 project_id: Optional[pulumi.Input[_builtins.str]] = None,
                 tags: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]] = None):
        """
        Input properties used for looking up and filtering PagerdutyConnector resources.
        :param pulumi.Input[_builtins.str] api_token_ref: Reference to the Harness secret containing the api token. To reference a secret at the organization scope, prefix 'org' to the expression: org.{identifier}. To reference a secret at the account scope, prefix 'account` to the expression: account.{identifier}.
        :param pulumi.Input[Sequence[pulumi.Input[_builtins.str]]] delegate_selectors: Tags to filter delegates for connection.
        :param pulumi.Input[_builtins.str] description: Description of the resource.
        :param pulumi.Input[_builtins.str] identifier: Unique identifier of the resource.
        :param pulumi.Input[_builtins.str] name: Name of the resource.
        :param pulumi.Input[_builtins.str] org_id: Unique identifier of the organization.
        :param pulumi.Input[_builtins.str] project_id: Unique identifier of the project.
        :param pulumi.Input[Sequence[pulumi.Input[_builtins.str]]] tags: Tags to associate with the resource.
        """
        if api_token_ref is not None:
            pulumi.set(__self__, "api_token_ref", api_token_ref)
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
        if project_id is not None:
            pulumi.set(__self__, "project_id", project_id)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)

    @_builtins.property
    @pulumi.getter(name="apiTokenRef")
    def api_token_ref(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Reference to the Harness secret containing the api token. To reference a secret at the organization scope, prefix 'org' to the expression: org.{identifier}. To reference a secret at the account scope, prefix 'account` to the expression: account.{identifier}.
        """
        return pulumi.get(self, "api_token_ref")

    @api_token_ref.setter
    def api_token_ref(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "api_token_ref", value)

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


@pulumi.type_token("harness:platform/pagerdutyConnector:PagerdutyConnector")
class PagerdutyConnector(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 api_token_ref: Optional[pulumi.Input[_builtins.str]] = None,
                 delegate_selectors: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]] = None,
                 description: Optional[pulumi.Input[_builtins.str]] = None,
                 identifier: Optional[pulumi.Input[_builtins.str]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 org_id: Optional[pulumi.Input[_builtins.str]] = None,
                 project_id: Optional[pulumi.Input[_builtins.str]] = None,
                 tags: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]] = None,
                 __props__=None):
        """
        ## Example Usage

        ```python
        import pulumi
        import pulumi_harness as harness

        test = harness.platform.PagerdutyConnector("test",
            identifier="identifier",
            name="name",
            description="test",
            tags=["foo:bar"],
            delegate_selectors=["harness-delegate"],
            api_token_ref="account.secret_id")
        ```

        ## Import

        Import account level pagerduty connector

        ```sh
        $ pulumi import harness:platform/pagerdutyConnector:PagerdutyConnector example <connector_id>
        ```

        Import org level pagerduty connector

        ```sh
        $ pulumi import harness:platform/pagerdutyConnector:PagerdutyConnector example <ord_id>/<connector_id>
        ```

        Import project level pagerduty connector

        ```sh
        $ pulumi import harness:platform/pagerdutyConnector:PagerdutyConnector example <org_id>/<project_id>/<connector_id>
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] api_token_ref: Reference to the Harness secret containing the api token. To reference a secret at the organization scope, prefix 'org' to the expression: org.{identifier}. To reference a secret at the account scope, prefix 'account` to the expression: account.{identifier}.
        :param pulumi.Input[Sequence[pulumi.Input[_builtins.str]]] delegate_selectors: Tags to filter delegates for connection.
        :param pulumi.Input[_builtins.str] description: Description of the resource.
        :param pulumi.Input[_builtins.str] identifier: Unique identifier of the resource.
        :param pulumi.Input[_builtins.str] name: Name of the resource.
        :param pulumi.Input[_builtins.str] org_id: Unique identifier of the organization.
        :param pulumi.Input[_builtins.str] project_id: Unique identifier of the project.
        :param pulumi.Input[Sequence[pulumi.Input[_builtins.str]]] tags: Tags to associate with the resource.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: PagerdutyConnectorArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        ## Example Usage

        ```python
        import pulumi
        import pulumi_harness as harness

        test = harness.platform.PagerdutyConnector("test",
            identifier="identifier",
            name="name",
            description="test",
            tags=["foo:bar"],
            delegate_selectors=["harness-delegate"],
            api_token_ref="account.secret_id")
        ```

        ## Import

        Import account level pagerduty connector

        ```sh
        $ pulumi import harness:platform/pagerdutyConnector:PagerdutyConnector example <connector_id>
        ```

        Import org level pagerduty connector

        ```sh
        $ pulumi import harness:platform/pagerdutyConnector:PagerdutyConnector example <ord_id>/<connector_id>
        ```

        Import project level pagerduty connector

        ```sh
        $ pulumi import harness:platform/pagerdutyConnector:PagerdutyConnector example <org_id>/<project_id>/<connector_id>
        ```

        :param str resource_name: The name of the resource.
        :param PagerdutyConnectorArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(PagerdutyConnectorArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 api_token_ref: Optional[pulumi.Input[_builtins.str]] = None,
                 delegate_selectors: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]] = None,
                 description: Optional[pulumi.Input[_builtins.str]] = None,
                 identifier: Optional[pulumi.Input[_builtins.str]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 org_id: Optional[pulumi.Input[_builtins.str]] = None,
                 project_id: Optional[pulumi.Input[_builtins.str]] = None,
                 tags: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = PagerdutyConnectorArgs.__new__(PagerdutyConnectorArgs)

            if api_token_ref is None and not opts.urn:
                raise TypeError("Missing required property 'api_token_ref'")
            __props__.__dict__["api_token_ref"] = api_token_ref
            __props__.__dict__["delegate_selectors"] = delegate_selectors
            __props__.__dict__["description"] = description
            if identifier is None and not opts.urn:
                raise TypeError("Missing required property 'identifier'")
            __props__.__dict__["identifier"] = identifier
            __props__.__dict__["name"] = name
            __props__.__dict__["org_id"] = org_id
            __props__.__dict__["project_id"] = project_id
            __props__.__dict__["tags"] = tags
        super(PagerdutyConnector, __self__).__init__(
            'harness:platform/pagerdutyConnector:PagerdutyConnector',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            api_token_ref: Optional[pulumi.Input[_builtins.str]] = None,
            delegate_selectors: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]] = None,
            description: Optional[pulumi.Input[_builtins.str]] = None,
            identifier: Optional[pulumi.Input[_builtins.str]] = None,
            name: Optional[pulumi.Input[_builtins.str]] = None,
            org_id: Optional[pulumi.Input[_builtins.str]] = None,
            project_id: Optional[pulumi.Input[_builtins.str]] = None,
            tags: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]] = None) -> 'PagerdutyConnector':
        """
        Get an existing PagerdutyConnector resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] api_token_ref: Reference to the Harness secret containing the api token. To reference a secret at the organization scope, prefix 'org' to the expression: org.{identifier}. To reference a secret at the account scope, prefix 'account` to the expression: account.{identifier}.
        :param pulumi.Input[Sequence[pulumi.Input[_builtins.str]]] delegate_selectors: Tags to filter delegates for connection.
        :param pulumi.Input[_builtins.str] description: Description of the resource.
        :param pulumi.Input[_builtins.str] identifier: Unique identifier of the resource.
        :param pulumi.Input[_builtins.str] name: Name of the resource.
        :param pulumi.Input[_builtins.str] org_id: Unique identifier of the organization.
        :param pulumi.Input[_builtins.str] project_id: Unique identifier of the project.
        :param pulumi.Input[Sequence[pulumi.Input[_builtins.str]]] tags: Tags to associate with the resource.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _PagerdutyConnectorState.__new__(_PagerdutyConnectorState)

        __props__.__dict__["api_token_ref"] = api_token_ref
        __props__.__dict__["delegate_selectors"] = delegate_selectors
        __props__.__dict__["description"] = description
        __props__.__dict__["identifier"] = identifier
        __props__.__dict__["name"] = name
        __props__.__dict__["org_id"] = org_id
        __props__.__dict__["project_id"] = project_id
        __props__.__dict__["tags"] = tags
        return PagerdutyConnector(resource_name, opts=opts, __props__=__props__)

    @_builtins.property
    @pulumi.getter(name="apiTokenRef")
    def api_token_ref(self) -> pulumi.Output[_builtins.str]:
        """
        Reference to the Harness secret containing the api token. To reference a secret at the organization scope, prefix 'org' to the expression: org.{identifier}. To reference a secret at the account scope, prefix 'account` to the expression: account.{identifier}.
        """
        return pulumi.get(self, "api_token_ref")

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

