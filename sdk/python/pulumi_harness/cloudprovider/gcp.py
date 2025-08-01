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

__all__ = ['GcpArgs', 'Gcp']

@pulumi.input_type
class GcpArgs:
    def __init__(__self__, *,
                 delegate_selectors: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 secret_file_id: Optional[pulumi.Input[_builtins.str]] = None,
                 skip_validation: Optional[pulumi.Input[_builtins.bool]] = None,
                 usage_scopes: Optional[pulumi.Input[Sequence[pulumi.Input['GcpUsageScopeArgs']]]] = None):
        """
        The set of arguments for constructing a Gcp resource.
        :param pulumi.Input[Sequence[pulumi.Input[_builtins.str]]] delegate_selectors: Delegate selectors to use for this provider.
        :param pulumi.Input[_builtins.str] name: The name of the cloud provider.
        :param pulumi.Input[_builtins.str] secret_file_id: The id of the secret containing the GCP credentials
        :param pulumi.Input[_builtins.bool] skip_validation: Skip validation of GCP configuration.
        :param pulumi.Input[Sequence[pulumi.Input['GcpUsageScopeArgs']]] usage_scopes: This block is used for scoping the resource to a specific set of applications or environments.
        """
        if delegate_selectors is not None:
            pulumi.set(__self__, "delegate_selectors", delegate_selectors)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if secret_file_id is not None:
            pulumi.set(__self__, "secret_file_id", secret_file_id)
        if skip_validation is not None:
            pulumi.set(__self__, "skip_validation", skip_validation)
        if usage_scopes is not None:
            pulumi.set(__self__, "usage_scopes", usage_scopes)

    @_builtins.property
    @pulumi.getter(name="delegateSelectors")
    def delegate_selectors(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]]:
        """
        Delegate selectors to use for this provider.
        """
        return pulumi.get(self, "delegate_selectors")

    @delegate_selectors.setter
    def delegate_selectors(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]]):
        pulumi.set(self, "delegate_selectors", value)

    @_builtins.property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The name of the cloud provider.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "name", value)

    @_builtins.property
    @pulumi.getter(name="secretFileId")
    def secret_file_id(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The id of the secret containing the GCP credentials
        """
        return pulumi.get(self, "secret_file_id")

    @secret_file_id.setter
    def secret_file_id(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "secret_file_id", value)

    @_builtins.property
    @pulumi.getter(name="skipValidation")
    def skip_validation(self) -> Optional[pulumi.Input[_builtins.bool]]:
        """
        Skip validation of GCP configuration.
        """
        return pulumi.get(self, "skip_validation")

    @skip_validation.setter
    def skip_validation(self, value: Optional[pulumi.Input[_builtins.bool]]):
        pulumi.set(self, "skip_validation", value)

    @_builtins.property
    @pulumi.getter(name="usageScopes")
    def usage_scopes(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['GcpUsageScopeArgs']]]]:
        """
        This block is used for scoping the resource to a specific set of applications or environments.
        """
        return pulumi.get(self, "usage_scopes")

    @usage_scopes.setter
    def usage_scopes(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['GcpUsageScopeArgs']]]]):
        pulumi.set(self, "usage_scopes", value)


@pulumi.input_type
class _GcpState:
    def __init__(__self__, *,
                 delegate_selectors: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 secret_file_id: Optional[pulumi.Input[_builtins.str]] = None,
                 skip_validation: Optional[pulumi.Input[_builtins.bool]] = None,
                 usage_scopes: Optional[pulumi.Input[Sequence[pulumi.Input['GcpUsageScopeArgs']]]] = None):
        """
        Input properties used for looking up and filtering Gcp resources.
        :param pulumi.Input[Sequence[pulumi.Input[_builtins.str]]] delegate_selectors: Delegate selectors to use for this provider.
        :param pulumi.Input[_builtins.str] name: The name of the cloud provider.
        :param pulumi.Input[_builtins.str] secret_file_id: The id of the secret containing the GCP credentials
        :param pulumi.Input[_builtins.bool] skip_validation: Skip validation of GCP configuration.
        :param pulumi.Input[Sequence[pulumi.Input['GcpUsageScopeArgs']]] usage_scopes: This block is used for scoping the resource to a specific set of applications or environments.
        """
        if delegate_selectors is not None:
            pulumi.set(__self__, "delegate_selectors", delegate_selectors)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if secret_file_id is not None:
            pulumi.set(__self__, "secret_file_id", secret_file_id)
        if skip_validation is not None:
            pulumi.set(__self__, "skip_validation", skip_validation)
        if usage_scopes is not None:
            pulumi.set(__self__, "usage_scopes", usage_scopes)

    @_builtins.property
    @pulumi.getter(name="delegateSelectors")
    def delegate_selectors(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]]:
        """
        Delegate selectors to use for this provider.
        """
        return pulumi.get(self, "delegate_selectors")

    @delegate_selectors.setter
    def delegate_selectors(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]]):
        pulumi.set(self, "delegate_selectors", value)

    @_builtins.property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The name of the cloud provider.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "name", value)

    @_builtins.property
    @pulumi.getter(name="secretFileId")
    def secret_file_id(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The id of the secret containing the GCP credentials
        """
        return pulumi.get(self, "secret_file_id")

    @secret_file_id.setter
    def secret_file_id(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "secret_file_id", value)

    @_builtins.property
    @pulumi.getter(name="skipValidation")
    def skip_validation(self) -> Optional[pulumi.Input[_builtins.bool]]:
        """
        Skip validation of GCP configuration.
        """
        return pulumi.get(self, "skip_validation")

    @skip_validation.setter
    def skip_validation(self, value: Optional[pulumi.Input[_builtins.bool]]):
        pulumi.set(self, "skip_validation", value)

    @_builtins.property
    @pulumi.getter(name="usageScopes")
    def usage_scopes(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['GcpUsageScopeArgs']]]]:
        """
        This block is used for scoping the resource to a specific set of applications or environments.
        """
        return pulumi.get(self, "usage_scopes")

    @usage_scopes.setter
    def usage_scopes(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['GcpUsageScopeArgs']]]]):
        pulumi.set(self, "usage_scopes", value)


@pulumi.type_token("harness:cloudprovider/gcp:Gcp")
class Gcp(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 delegate_selectors: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 secret_file_id: Optional[pulumi.Input[_builtins.str]] = None,
                 skip_validation: Optional[pulumi.Input[_builtins.bool]] = None,
                 usage_scopes: Optional[pulumi.Input[Sequence[pulumi.Input[Union['GcpUsageScopeArgs', 'GcpUsageScopeArgsDict']]]]] = None,
                 __props__=None):
        """
        Resource for creating a GCP cloud provider. This resource uses the config-as-code API's. When updating the `name` or `path` of this resource you should typically also set the `create_before_destroy = true` lifecycle setting.

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Sequence[pulumi.Input[_builtins.str]]] delegate_selectors: Delegate selectors to use for this provider.
        :param pulumi.Input[_builtins.str] name: The name of the cloud provider.
        :param pulumi.Input[_builtins.str] secret_file_id: The id of the secret containing the GCP credentials
        :param pulumi.Input[_builtins.bool] skip_validation: Skip validation of GCP configuration.
        :param pulumi.Input[Sequence[pulumi.Input[Union['GcpUsageScopeArgs', 'GcpUsageScopeArgsDict']]]] usage_scopes: This block is used for scoping the resource to a specific set of applications or environments.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: Optional[GcpArgs] = None,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Resource for creating a GCP cloud provider. This resource uses the config-as-code API's. When updating the `name` or `path` of this resource you should typically also set the `create_before_destroy = true` lifecycle setting.

        :param str resource_name: The name of the resource.
        :param GcpArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(GcpArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 delegate_selectors: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 secret_file_id: Optional[pulumi.Input[_builtins.str]] = None,
                 skip_validation: Optional[pulumi.Input[_builtins.bool]] = None,
                 usage_scopes: Optional[pulumi.Input[Sequence[pulumi.Input[Union['GcpUsageScopeArgs', 'GcpUsageScopeArgsDict']]]]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = GcpArgs.__new__(GcpArgs)

            __props__.__dict__["delegate_selectors"] = delegate_selectors
            __props__.__dict__["name"] = name
            __props__.__dict__["secret_file_id"] = secret_file_id
            __props__.__dict__["skip_validation"] = skip_validation
            __props__.__dict__["usage_scopes"] = usage_scopes
        super(Gcp, __self__).__init__(
            'harness:cloudprovider/gcp:Gcp',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            delegate_selectors: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]] = None,
            name: Optional[pulumi.Input[_builtins.str]] = None,
            secret_file_id: Optional[pulumi.Input[_builtins.str]] = None,
            skip_validation: Optional[pulumi.Input[_builtins.bool]] = None,
            usage_scopes: Optional[pulumi.Input[Sequence[pulumi.Input[Union['GcpUsageScopeArgs', 'GcpUsageScopeArgsDict']]]]] = None) -> 'Gcp':
        """
        Get an existing Gcp resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Sequence[pulumi.Input[_builtins.str]]] delegate_selectors: Delegate selectors to use for this provider.
        :param pulumi.Input[_builtins.str] name: The name of the cloud provider.
        :param pulumi.Input[_builtins.str] secret_file_id: The id of the secret containing the GCP credentials
        :param pulumi.Input[_builtins.bool] skip_validation: Skip validation of GCP configuration.
        :param pulumi.Input[Sequence[pulumi.Input[Union['GcpUsageScopeArgs', 'GcpUsageScopeArgsDict']]]] usage_scopes: This block is used for scoping the resource to a specific set of applications or environments.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _GcpState.__new__(_GcpState)

        __props__.__dict__["delegate_selectors"] = delegate_selectors
        __props__.__dict__["name"] = name
        __props__.__dict__["secret_file_id"] = secret_file_id
        __props__.__dict__["skip_validation"] = skip_validation
        __props__.__dict__["usage_scopes"] = usage_scopes
        return Gcp(resource_name, opts=opts, __props__=__props__)

    @_builtins.property
    @pulumi.getter(name="delegateSelectors")
    def delegate_selectors(self) -> pulumi.Output[Optional[Sequence[_builtins.str]]]:
        """
        Delegate selectors to use for this provider.
        """
        return pulumi.get(self, "delegate_selectors")

    @_builtins.property
    @pulumi.getter
    def name(self) -> pulumi.Output[_builtins.str]:
        """
        The name of the cloud provider.
        """
        return pulumi.get(self, "name")

    @_builtins.property
    @pulumi.getter(name="secretFileId")
    def secret_file_id(self) -> pulumi.Output[Optional[_builtins.str]]:
        """
        The id of the secret containing the GCP credentials
        """
        return pulumi.get(self, "secret_file_id")

    @_builtins.property
    @pulumi.getter(name="skipValidation")
    def skip_validation(self) -> pulumi.Output[Optional[_builtins.bool]]:
        """
        Skip validation of GCP configuration.
        """
        return pulumi.get(self, "skip_validation")

    @_builtins.property
    @pulumi.getter(name="usageScopes")
    def usage_scopes(self) -> pulumi.Output[Optional[Sequence['outputs.GcpUsageScope']]]:
        """
        This block is used for scoping the resource to a specific set of applications or environments.
        """
        return pulumi.get(self, "usage_scopes")

