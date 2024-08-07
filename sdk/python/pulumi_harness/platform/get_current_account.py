# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = [
    'GetCurrentAccountResult',
    'AwaitableGetCurrentAccountResult',
    'get_current_account',
    'get_current_account_output',
]

@pulumi.output_type
class GetCurrentAccountResult:
    """
    A collection of values returned by getCurrentAccount.
    """
    def __init__(__self__, account_id=None, endpoint=None, id=None):
        if account_id and not isinstance(account_id, str):
            raise TypeError("Expected argument 'account_id' to be a str")
        pulumi.set(__self__, "account_id", account_id)
        if endpoint and not isinstance(endpoint, str):
            raise TypeError("Expected argument 'endpoint' to be a str")
        pulumi.set(__self__, "endpoint", endpoint)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)

    @property
    @pulumi.getter(name="accountId")
    def account_id(self) -> str:
        return pulumi.get(self, "account_id")

    @property
    @pulumi.getter
    def endpoint(self) -> str:
        return pulumi.get(self, "endpoint")

    @property
    @pulumi.getter
    def id(self) -> Optional[str]:
        return pulumi.get(self, "id")


class AwaitableGetCurrentAccountResult(GetCurrentAccountResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetCurrentAccountResult(
            account_id=self.account_id,
            endpoint=self.endpoint,
            id=self.id)


def get_current_account(id: Optional[str] = None,
                        opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetCurrentAccountResult:
    """
    Use this data source to access information about an existing resource.
    """
    __args__ = dict()
    __args__['id'] = id
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('harness:platform/getCurrentAccount:getCurrentAccount', __args__, opts=opts, typ=GetCurrentAccountResult).value

    return AwaitableGetCurrentAccountResult(
        account_id=pulumi.get(__ret__, 'account_id'),
        endpoint=pulumi.get(__ret__, 'endpoint'),
        id=pulumi.get(__ret__, 'id'))


@_utilities.lift_output_func(get_current_account)
def get_current_account_output(id: Optional[pulumi.Input[Optional[str]]] = None,
                               opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetCurrentAccountResult]:
    """
    Use this data source to access information about an existing resource.
    """
    ...
