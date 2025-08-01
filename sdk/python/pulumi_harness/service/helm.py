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

__all__ = ['HelmArgs', 'Helm']

@pulumi.input_type
class HelmArgs:
    def __init__(__self__, *,
                 app_id: pulumi.Input[_builtins.str],
                 description: Optional[pulumi.Input[_builtins.str]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 variables: Optional[pulumi.Input[Sequence[pulumi.Input['HelmVariableArgs']]]] = None):
        """
        The set of arguments for constructing a Helm resource.
        :param pulumi.Input[_builtins.str] app_id: The id of the application the service belongs to
        :param pulumi.Input[_builtins.str] description: Description of th service
        :param pulumi.Input[_builtins.str] name: Name of the service
        :param pulumi.Input[Sequence[pulumi.Input['HelmVariableArgs']]] variables: Variables to be used in the service
        """
        pulumi.set(__self__, "app_id", app_id)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if variables is not None:
            pulumi.set(__self__, "variables", variables)

    @_builtins.property
    @pulumi.getter(name="appId")
    def app_id(self) -> pulumi.Input[_builtins.str]:
        """
        The id of the application the service belongs to
        """
        return pulumi.get(self, "app_id")

    @app_id.setter
    def app_id(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "app_id", value)

    @_builtins.property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Description of th service
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "description", value)

    @_builtins.property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Name of the service
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "name", value)

    @_builtins.property
    @pulumi.getter
    def variables(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['HelmVariableArgs']]]]:
        """
        Variables to be used in the service
        """
        return pulumi.get(self, "variables")

    @variables.setter
    def variables(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['HelmVariableArgs']]]]):
        pulumi.set(self, "variables", value)


@pulumi.input_type
class _HelmState:
    def __init__(__self__, *,
                 app_id: Optional[pulumi.Input[_builtins.str]] = None,
                 description: Optional[pulumi.Input[_builtins.str]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 variables: Optional[pulumi.Input[Sequence[pulumi.Input['HelmVariableArgs']]]] = None):
        """
        Input properties used for looking up and filtering Helm resources.
        :param pulumi.Input[_builtins.str] app_id: The id of the application the service belongs to
        :param pulumi.Input[_builtins.str] description: Description of th service
        :param pulumi.Input[_builtins.str] name: Name of the service
        :param pulumi.Input[Sequence[pulumi.Input['HelmVariableArgs']]] variables: Variables to be used in the service
        """
        if app_id is not None:
            pulumi.set(__self__, "app_id", app_id)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if variables is not None:
            pulumi.set(__self__, "variables", variables)

    @_builtins.property
    @pulumi.getter(name="appId")
    def app_id(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The id of the application the service belongs to
        """
        return pulumi.get(self, "app_id")

    @app_id.setter
    def app_id(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "app_id", value)

    @_builtins.property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Description of th service
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "description", value)

    @_builtins.property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Name of the service
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "name", value)

    @_builtins.property
    @pulumi.getter
    def variables(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['HelmVariableArgs']]]]:
        """
        Variables to be used in the service
        """
        return pulumi.get(self, "variables")

    @variables.setter
    def variables(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['HelmVariableArgs']]]]):
        pulumi.set(self, "variables", value)


@pulumi.type_token("harness:service/helm:Helm")
class Helm(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 app_id: Optional[pulumi.Input[_builtins.str]] = None,
                 description: Optional[pulumi.Input[_builtins.str]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 variables: Optional[pulumi.Input[Sequence[pulumi.Input[Union['HelmVariableArgs', 'HelmVariableArgsDict']]]]] = None,
                 __props__=None):
        """
        Resource for creating a Kubernetes Helm service. This resource uses the config-as-code API's. When updating the `name` or `path` of this resource you should typically also set the `create_before_destroy = true` lifecycle setting.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_harness as harness

        example = harness.Application("example", name="example")
        example_helm = harness.service.Helm("example",
            app_id=example.id,
            name="helm-example-service",
            description="Service for deploying native Helm application.s")
        ```

        ## Import

        Import using the Harness application id and service id

        ```sh
        $ pulumi import harness:service/helm:Helm example <app_id>/<svc_id>
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] app_id: The id of the application the service belongs to
        :param pulumi.Input[_builtins.str] description: Description of th service
        :param pulumi.Input[_builtins.str] name: Name of the service
        :param pulumi.Input[Sequence[pulumi.Input[Union['HelmVariableArgs', 'HelmVariableArgsDict']]]] variables: Variables to be used in the service
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: HelmArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Resource for creating a Kubernetes Helm service. This resource uses the config-as-code API's. When updating the `name` or `path` of this resource you should typically also set the `create_before_destroy = true` lifecycle setting.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_harness as harness

        example = harness.Application("example", name="example")
        example_helm = harness.service.Helm("example",
            app_id=example.id,
            name="helm-example-service",
            description="Service for deploying native Helm application.s")
        ```

        ## Import

        Import using the Harness application id and service id

        ```sh
        $ pulumi import harness:service/helm:Helm example <app_id>/<svc_id>
        ```

        :param str resource_name: The name of the resource.
        :param HelmArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(HelmArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 app_id: Optional[pulumi.Input[_builtins.str]] = None,
                 description: Optional[pulumi.Input[_builtins.str]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 variables: Optional[pulumi.Input[Sequence[pulumi.Input[Union['HelmVariableArgs', 'HelmVariableArgsDict']]]]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = HelmArgs.__new__(HelmArgs)

            if app_id is None and not opts.urn:
                raise TypeError("Missing required property 'app_id'")
            __props__.__dict__["app_id"] = app_id
            __props__.__dict__["description"] = description
            __props__.__dict__["name"] = name
            __props__.__dict__["variables"] = variables
        super(Helm, __self__).__init__(
            'harness:service/helm:Helm',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            app_id: Optional[pulumi.Input[_builtins.str]] = None,
            description: Optional[pulumi.Input[_builtins.str]] = None,
            name: Optional[pulumi.Input[_builtins.str]] = None,
            variables: Optional[pulumi.Input[Sequence[pulumi.Input[Union['HelmVariableArgs', 'HelmVariableArgsDict']]]]] = None) -> 'Helm':
        """
        Get an existing Helm resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] app_id: The id of the application the service belongs to
        :param pulumi.Input[_builtins.str] description: Description of th service
        :param pulumi.Input[_builtins.str] name: Name of the service
        :param pulumi.Input[Sequence[pulumi.Input[Union['HelmVariableArgs', 'HelmVariableArgsDict']]]] variables: Variables to be used in the service
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _HelmState.__new__(_HelmState)

        __props__.__dict__["app_id"] = app_id
        __props__.__dict__["description"] = description
        __props__.__dict__["name"] = name
        __props__.__dict__["variables"] = variables
        return Helm(resource_name, opts=opts, __props__=__props__)

    @_builtins.property
    @pulumi.getter(name="appId")
    def app_id(self) -> pulumi.Output[_builtins.str]:
        """
        The id of the application the service belongs to
        """
        return pulumi.get(self, "app_id")

    @_builtins.property
    @pulumi.getter
    def description(self) -> pulumi.Output[Optional[_builtins.str]]:
        """
        Description of th service
        """
        return pulumi.get(self, "description")

    @_builtins.property
    @pulumi.getter
    def name(self) -> pulumi.Output[_builtins.str]:
        """
        Name of the service
        """
        return pulumi.get(self, "name")

    @_builtins.property
    @pulumi.getter
    def variables(self) -> pulumi.Output[Optional[Sequence['outputs.HelmVariable']]]:
        """
        Variables to be used in the service
        """
        return pulumi.get(self, "variables")

