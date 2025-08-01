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
from . import _utilities

__all__ = ['ProviderArgs', 'Provider']

@pulumi.input_type
class ProviderArgs:
    def __init__(__self__, *,
                 account_id: Optional[pulumi.Input[_builtins.str]] = None,
                 api_key: Optional[pulumi.Input[_builtins.str]] = None,
                 endpoint: Optional[pulumi.Input[_builtins.str]] = None,
                 platform_api_key: Optional[pulumi.Input[_builtins.str]] = None):
        """
        The set of arguments for constructing a Provider resource.
        :param pulumi.Input[_builtins.str] account_id: The Harness account id. This can also be set using the `HARNESS_ACCOUNT_ID` environment variable.
        :param pulumi.Input[_builtins.str] api_key: The Harness API key. This can also be set using the `HARNESS_API_KEY` environment variable. For more information to
               create an API key in FirstGen, see https://docs.harness.io/article/smloyragsm-api-keys#create_an_api_key.
        :param pulumi.Input[_builtins.str] endpoint: The URL of the Harness API endpoint. The default is `https://app.harness.io/gateway`. This can also be set using the
               `HARNESS_ENDPOINT` environment variable.
        :param pulumi.Input[_builtins.str] platform_api_key: The API key for the Harness next gen platform. This can also be set using the `HARNESS_PLATFORM_API_KEY` environment
               variable. For more information to create an API key in NextGen, see
               https://docs.harness.io/article/tdoad7xrh9-add-and-manage-api-keys.
        """
        if account_id is None:
            account_id = _utilities.get_env('HARNESS_ACCOUNT_ID')
        if account_id is not None:
            pulumi.set(__self__, "account_id", account_id)
        if api_key is None:
            api_key = _utilities.get_env('HARNESS_API_KEY')
        if api_key is not None:
            pulumi.set(__self__, "api_key", api_key)
        if endpoint is None:
            endpoint = _utilities.get_env('HARNESS_ENDPOINT')
        if endpoint is not None:
            pulumi.set(__self__, "endpoint", endpoint)
        if platform_api_key is None:
            platform_api_key = _utilities.get_env('HARNESS_PLATFORM_API_KEY')
        if platform_api_key is not None:
            pulumi.set(__self__, "platform_api_key", platform_api_key)

    @_builtins.property
    @pulumi.getter(name="accountId")
    def account_id(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The Harness account id. This can also be set using the `HARNESS_ACCOUNT_ID` environment variable.
        """
        return pulumi.get(self, "account_id")

    @account_id.setter
    def account_id(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "account_id", value)

    @_builtins.property
    @pulumi.getter(name="apiKey")
    def api_key(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The Harness API key. This can also be set using the `HARNESS_API_KEY` environment variable. For more information to
        create an API key in FirstGen, see https://docs.harness.io/article/smloyragsm-api-keys#create_an_api_key.
        """
        return pulumi.get(self, "api_key")

    @api_key.setter
    def api_key(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "api_key", value)

    @_builtins.property
    @pulumi.getter
    def endpoint(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The URL of the Harness API endpoint. The default is `https://app.harness.io/gateway`. This can also be set using the
        `HARNESS_ENDPOINT` environment variable.
        """
        return pulumi.get(self, "endpoint")

    @endpoint.setter
    def endpoint(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "endpoint", value)

    @_builtins.property
    @pulumi.getter(name="platformApiKey")
    def platform_api_key(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The API key for the Harness next gen platform. This can also be set using the `HARNESS_PLATFORM_API_KEY` environment
        variable. For more information to create an API key in NextGen, see
        https://docs.harness.io/article/tdoad7xrh9-add-and-manage-api-keys.
        """
        return pulumi.get(self, "platform_api_key")

    @platform_api_key.setter
    def platform_api_key(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "platform_api_key", value)


@pulumi.type_token("pulumi:providers:harness")
class Provider(pulumi.ProviderResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 account_id: Optional[pulumi.Input[_builtins.str]] = None,
                 api_key: Optional[pulumi.Input[_builtins.str]] = None,
                 endpoint: Optional[pulumi.Input[_builtins.str]] = None,
                 platform_api_key: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        """
        The provider type for the harness package. By default, resources use package-wide configuration
        settings, however an explicit `Provider` instance may be created and passed during resource
        construction to achieve fine-grained programmatic control over provider settings. See the
        [documentation](https://www.pulumi.com/docs/reference/programming-model/#providers) for more information.

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] account_id: The Harness account id. This can also be set using the `HARNESS_ACCOUNT_ID` environment variable.
        :param pulumi.Input[_builtins.str] api_key: The Harness API key. This can also be set using the `HARNESS_API_KEY` environment variable. For more information to
               create an API key in FirstGen, see https://docs.harness.io/article/smloyragsm-api-keys#create_an_api_key.
        :param pulumi.Input[_builtins.str] endpoint: The URL of the Harness API endpoint. The default is `https://app.harness.io/gateway`. This can also be set using the
               `HARNESS_ENDPOINT` environment variable.
        :param pulumi.Input[_builtins.str] platform_api_key: The API key for the Harness next gen platform. This can also be set using the `HARNESS_PLATFORM_API_KEY` environment
               variable. For more information to create an API key in NextGen, see
               https://docs.harness.io/article/tdoad7xrh9-add-and-manage-api-keys.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: Optional[ProviderArgs] = None,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        The provider type for the harness package. By default, resources use package-wide configuration
        settings, however an explicit `Provider` instance may be created and passed during resource
        construction to achieve fine-grained programmatic control over provider settings. See the
        [documentation](https://www.pulumi.com/docs/reference/programming-model/#providers) for more information.

        :param str resource_name: The name of the resource.
        :param ProviderArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(ProviderArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 account_id: Optional[pulumi.Input[_builtins.str]] = None,
                 api_key: Optional[pulumi.Input[_builtins.str]] = None,
                 endpoint: Optional[pulumi.Input[_builtins.str]] = None,
                 platform_api_key: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = ProviderArgs.__new__(ProviderArgs)

            if account_id is None:
                account_id = _utilities.get_env('HARNESS_ACCOUNT_ID')
            __props__.__dict__["account_id"] = account_id
            if api_key is None:
                api_key = _utilities.get_env('HARNESS_API_KEY')
            __props__.__dict__["api_key"] = api_key
            if endpoint is None:
                endpoint = _utilities.get_env('HARNESS_ENDPOINT')
            __props__.__dict__["endpoint"] = endpoint
            if platform_api_key is None:
                platform_api_key = _utilities.get_env('HARNESS_PLATFORM_API_KEY')
            __props__.__dict__["platform_api_key"] = platform_api_key
        super(Provider, __self__).__init__(
            'harness',
            resource_name,
            __props__,
            opts)

    @_builtins.property
    @pulumi.getter(name="accountId")
    def account_id(self) -> pulumi.Output[Optional[_builtins.str]]:
        """
        The Harness account id. This can also be set using the `HARNESS_ACCOUNT_ID` environment variable.
        """
        return pulumi.get(self, "account_id")

    @_builtins.property
    @pulumi.getter(name="apiKey")
    def api_key(self) -> pulumi.Output[Optional[_builtins.str]]:
        """
        The Harness API key. This can also be set using the `HARNESS_API_KEY` environment variable. For more information to
        create an API key in FirstGen, see https://docs.harness.io/article/smloyragsm-api-keys#create_an_api_key.
        """
        return pulumi.get(self, "api_key")

    @_builtins.property
    @pulumi.getter
    def endpoint(self) -> pulumi.Output[Optional[_builtins.str]]:
        """
        The URL of the Harness API endpoint. The default is `https://app.harness.io/gateway`. This can also be set using the
        `HARNESS_ENDPOINT` environment variable.
        """
        return pulumi.get(self, "endpoint")

    @_builtins.property
    @pulumi.getter(name="platformApiKey")
    def platform_api_key(self) -> pulumi.Output[Optional[_builtins.str]]:
        """
        The API key for the Harness next gen platform. This can also be set using the `HARNESS_PLATFORM_API_KEY` environment
        variable. For more information to create an API key in NextGen, see
        https://docs.harness.io/article/tdoad7xrh9-add-and-manage-api-keys.
        """
        return pulumi.get(self, "platform_api_key")

    @pulumi.output_type
    class TerraformConfigResult:
        def __init__(__self__, result=None):
            if result and not isinstance(result, dict):
                raise TypeError("Expected argument 'result' to be a dict")
            pulumi.set(__self__, "result", result)

        @_builtins.property
        @pulumi.getter
        def result(self) -> Mapping[str, Any]:
            return pulumi.get(self, "result")

    def terraform_config(__self__) -> pulumi.Output['Provider.TerraformConfigResult']:
        """
        This function returns a Terraform config object with terraform-namecased keys,to be used with the Terraform Module Provider.
        """
        __args__ = dict()
        __args__['__self__'] = __self__
        return pulumi.runtime.call('pulumi:providers:harness/terraformConfig', __args__, res=__self__, typ=Provider.TerraformConfigResult)

