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
    'GetRuleSetResult',
    'AwaitableGetRuleSetResult',
    'get_rule_set',
    'get_rule_set_output',
]

@pulumi.output_type
class GetRuleSetResult:
    """
    A collection of values returned by getRuleSet.
    """
    def __init__(__self__, cloud_provider=None, description=None, id=None, name=None, rule_ids=None, rule_set_id=None):
        if cloud_provider and not isinstance(cloud_provider, str):
            raise TypeError("Expected argument 'cloud_provider' to be a str")
        pulumi.set(__self__, "cloud_provider", cloud_provider)
        if description and not isinstance(description, str):
            raise TypeError("Expected argument 'description' to be a str")
        pulumi.set(__self__, "description", description)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if rule_ids and not isinstance(rule_ids, list):
            raise TypeError("Expected argument 'rule_ids' to be a list")
        pulumi.set(__self__, "rule_ids", rule_ids)
        if rule_set_id and not isinstance(rule_set_id, str):
            raise TypeError("Expected argument 'rule_set_id' to be a str")
        pulumi.set(__self__, "rule_set_id", rule_set_id)

    @_builtins.property
    @pulumi.getter(name="cloudProvider")
    def cloud_provider(self) -> _builtins.str:
        """
        The cloud provider for the rule set.
        """
        return pulumi.get(self, "cloud_provider")

    @_builtins.property
    @pulumi.getter
    def description(self) -> _builtins.str:
        """
        Description for rule set.
        """
        return pulumi.get(self, "description")

    @_builtins.property
    @pulumi.getter
    def id(self) -> _builtins.str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @_builtins.property
    @pulumi.getter
    def name(self) -> _builtins.str:
        """
        Name of the rule set.
        """
        return pulumi.get(self, "name")

    @_builtins.property
    @pulumi.getter(name="ruleIds")
    def rule_ids(self) -> Sequence[_builtins.str]:
        """
        List of target regions.
        """
        return pulumi.get(self, "rule_ids")

    @_builtins.property
    @pulumi.getter(name="ruleSetId")
    def rule_set_id(self) -> _builtins.str:
        """
        Id of rule set.
        """
        return pulumi.get(self, "rule_set_id")


class AwaitableGetRuleSetResult(GetRuleSetResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetRuleSetResult(
            cloud_provider=self.cloud_provider,
            description=self.description,
            id=self.id,
            name=self.name,
            rule_ids=self.rule_ids,
            rule_set_id=self.rule_set_id)


def get_rule_set(rule_set_id: Optional[_builtins.str] = None,
                 opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetRuleSetResult:
    """
    Datasource for looking up a rule.


    :param _builtins.str rule_set_id: Id of rule set.
    """
    __args__ = dict()
    __args__['ruleSetId'] = rule_set_id
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('harness:governance/getRuleSet:getRuleSet', __args__, opts=opts, typ=GetRuleSetResult).value

    return AwaitableGetRuleSetResult(
        cloud_provider=pulumi.get(__ret__, 'cloud_provider'),
        description=pulumi.get(__ret__, 'description'),
        id=pulumi.get(__ret__, 'id'),
        name=pulumi.get(__ret__, 'name'),
        rule_ids=pulumi.get(__ret__, 'rule_ids'),
        rule_set_id=pulumi.get(__ret__, 'rule_set_id'))
def get_rule_set_output(rule_set_id: Optional[pulumi.Input[_builtins.str]] = None,
                        opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetRuleSetResult]:
    """
    Datasource for looking up a rule.


    :param _builtins.str rule_set_id: Id of rule set.
    """
    __args__ = dict()
    __args__['ruleSetId'] = rule_set_id
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('harness:governance/getRuleSet:getRuleSet', __args__, opts=opts, typ=GetRuleSetResult)
    return __ret__.apply(lambda __response__: GetRuleSetResult(
        cloud_provider=pulumi.get(__response__, 'cloud_provider'),
        description=pulumi.get(__response__, 'description'),
        id=pulumi.get(__response__, 'id'),
        name=pulumi.get(__response__, 'name'),
        rule_ids=pulumi.get(__response__, 'rule_ids'),
        rule_set_id=pulumi.get(__response__, 'rule_set_id')))
