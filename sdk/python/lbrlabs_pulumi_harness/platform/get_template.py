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
from ._inputs import *

__all__ = [
    'GetTemplateResult',
    'AwaitableGetTemplateResult',
    'get_template',
    'get_template_output',
]

@pulumi.output_type
class GetTemplateResult:
    """
    A collection of values returned by getTemplate.
    """
    def __init__(__self__, branch_name=None, child_type=None, connector_ref=None, description=None, git_details=None, id=None, identifier=None, is_stable=None, name=None, org_id=None, project_id=None, scope=None, store_type=None, tags=None, template_yaml=None, version=None):
        if branch_name and not isinstance(branch_name, str):
            raise TypeError("Expected argument 'branch_name' to be a str")
        pulumi.set(__self__, "branch_name", branch_name)
        if child_type and not isinstance(child_type, str):
            raise TypeError("Expected argument 'child_type' to be a str")
        pulumi.set(__self__, "child_type", child_type)
        if connector_ref and not isinstance(connector_ref, str):
            raise TypeError("Expected argument 'connector_ref' to be a str")
        pulumi.set(__self__, "connector_ref", connector_ref)
        if description and not isinstance(description, str):
            raise TypeError("Expected argument 'description' to be a str")
        pulumi.set(__self__, "description", description)
        if git_details and not isinstance(git_details, dict):
            raise TypeError("Expected argument 'git_details' to be a dict")
        pulumi.set(__self__, "git_details", git_details)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if identifier and not isinstance(identifier, str):
            raise TypeError("Expected argument 'identifier' to be a str")
        pulumi.set(__self__, "identifier", identifier)
        if is_stable and not isinstance(is_stable, bool):
            raise TypeError("Expected argument 'is_stable' to be a bool")
        pulumi.set(__self__, "is_stable", is_stable)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if org_id and not isinstance(org_id, str):
            raise TypeError("Expected argument 'org_id' to be a str")
        pulumi.set(__self__, "org_id", org_id)
        if project_id and not isinstance(project_id, str):
            raise TypeError("Expected argument 'project_id' to be a str")
        pulumi.set(__self__, "project_id", project_id)
        if scope and not isinstance(scope, str):
            raise TypeError("Expected argument 'scope' to be a str")
        pulumi.set(__self__, "scope", scope)
        if store_type and not isinstance(store_type, str):
            raise TypeError("Expected argument 'store_type' to be a str")
        pulumi.set(__self__, "store_type", store_type)
        if tags and not isinstance(tags, list):
            raise TypeError("Expected argument 'tags' to be a list")
        pulumi.set(__self__, "tags", tags)
        if template_yaml and not isinstance(template_yaml, str):
            raise TypeError("Expected argument 'template_yaml' to be a str")
        pulumi.set(__self__, "template_yaml", template_yaml)
        if version and not isinstance(version, str):
            raise TypeError("Expected argument 'version' to be a str")
        pulumi.set(__self__, "version", version)

    @property
    @pulumi.getter(name="branchName")
    def branch_name(self) -> Optional[str]:
        """
        Version Label for Template.
        """
        return pulumi.get(self, "branch_name")

    @property
    @pulumi.getter(name="childType")
    def child_type(self) -> Optional[str]:
        """
        Defines child template type.
        """
        return pulumi.get(self, "child_type")

    @property
    @pulumi.getter(name="connectorRef")
    def connector_ref(self) -> str:
        """
        Identifier of the Harness Connector used for CRUD operations on the Entity.
        """
        return pulumi.get(self, "connector_ref")

    @property
    @pulumi.getter
    def description(self) -> str:
        """
        Description of the resource.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter(name="gitDetails")
    def git_details(self) -> Optional['outputs.GetTemplateGitDetailsResult']:
        """
        Contains parameters related to creating an Entity for Git Experience.
        """
        return pulumi.get(self, "git_details")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def identifier(self) -> Optional[str]:
        """
        Unique identifier of the resource.
        """
        return pulumi.get(self, "identifier")

    @property
    @pulumi.getter(name="isStable")
    def is_stable(self) -> Optional[bool]:
        """
        True if given version for template to be set as stable.
        """
        return pulumi.get(self, "is_stable")

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
    @pulumi.getter
    def scope(self) -> Optional[str]:
        """
        Scope of template.
        """
        return pulumi.get(self, "scope")

    @property
    @pulumi.getter(name="storeType")
    def store_type(self) -> str:
        """
        Specifies whether the Entity is to be stored in Git or not. Possible values: INLINE, REMOTE.
        """
        return pulumi.get(self, "store_type")

    @property
    @pulumi.getter
    def tags(self) -> Sequence[str]:
        """
        Tags to associate with the resource.
        """
        return pulumi.get(self, "tags")

    @property
    @pulumi.getter(name="templateYaml")
    def template_yaml(self) -> str:
        """
        Yaml for creating new Template.
        """
        return pulumi.get(self, "template_yaml")

    @property
    @pulumi.getter
    def version(self) -> Optional[str]:
        """
        Version Label for Template.
        """
        return pulumi.get(self, "version")


class AwaitableGetTemplateResult(GetTemplateResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetTemplateResult(
            branch_name=self.branch_name,
            child_type=self.child_type,
            connector_ref=self.connector_ref,
            description=self.description,
            git_details=self.git_details,
            id=self.id,
            identifier=self.identifier,
            is_stable=self.is_stable,
            name=self.name,
            org_id=self.org_id,
            project_id=self.project_id,
            scope=self.scope,
            store_type=self.store_type,
            tags=self.tags,
            template_yaml=self.template_yaml,
            version=self.version)


def get_template(branch_name: Optional[str] = None,
                 child_type: Optional[str] = None,
                 git_details: Optional[pulumi.InputType['GetTemplateGitDetailsArgs']] = None,
                 identifier: Optional[str] = None,
                 is_stable: Optional[bool] = None,
                 name: Optional[str] = None,
                 org_id: Optional[str] = None,
                 project_id: Optional[str] = None,
                 scope: Optional[str] = None,
                 version: Optional[str] = None,
                 opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetTemplateResult:
    """
    Data source for retrieving a Harness pipeline.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_harness as harness

    example = harness.platform.get_template(identifier="identifier",
        version="version")
    example1 = harness.platform.get_template(identifier="identifier",
        org_id="org_id",
        version="version")
    example2 = harness.platform.get_template(identifier="identifier",
        org_id="org_id",
        project_id="project_id",
        version="version")
    ```


    :param str branch_name: Version Label for Template.
    :param str child_type: Defines child template type.
    :param pulumi.InputType['GetTemplateGitDetailsArgs'] git_details: Contains parameters related to creating an Entity for Git Experience.
    :param str identifier: Unique identifier of the resource.
    :param bool is_stable: True if given version for template to be set as stable.
    :param str name: Name of the resource.
    :param str org_id: Unique identifier of the organization.
    :param str project_id: Unique identifier of the project.
    :param str scope: Scope of template.
    :param str version: Version Label for Template.
    """
    __args__ = dict()
    __args__['branchName'] = branch_name
    __args__['childType'] = child_type
    __args__['gitDetails'] = git_details
    __args__['identifier'] = identifier
    __args__['isStable'] = is_stable
    __args__['name'] = name
    __args__['orgId'] = org_id
    __args__['projectId'] = project_id
    __args__['scope'] = scope
    __args__['version'] = version
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('harness:platform/getTemplate:getTemplate', __args__, opts=opts, typ=GetTemplateResult).value

    return AwaitableGetTemplateResult(
        branch_name=__ret__.branch_name,
        child_type=__ret__.child_type,
        connector_ref=__ret__.connector_ref,
        description=__ret__.description,
        git_details=__ret__.git_details,
        id=__ret__.id,
        identifier=__ret__.identifier,
        is_stable=__ret__.is_stable,
        name=__ret__.name,
        org_id=__ret__.org_id,
        project_id=__ret__.project_id,
        scope=__ret__.scope,
        store_type=__ret__.store_type,
        tags=__ret__.tags,
        template_yaml=__ret__.template_yaml,
        version=__ret__.version)


@_utilities.lift_output_func(get_template)
def get_template_output(branch_name: Optional[pulumi.Input[Optional[str]]] = None,
                        child_type: Optional[pulumi.Input[Optional[str]]] = None,
                        git_details: Optional[pulumi.Input[Optional[pulumi.InputType['GetTemplateGitDetailsArgs']]]] = None,
                        identifier: Optional[pulumi.Input[Optional[str]]] = None,
                        is_stable: Optional[pulumi.Input[Optional[bool]]] = None,
                        name: Optional[pulumi.Input[Optional[str]]] = None,
                        org_id: Optional[pulumi.Input[Optional[str]]] = None,
                        project_id: Optional[pulumi.Input[Optional[str]]] = None,
                        scope: Optional[pulumi.Input[Optional[str]]] = None,
                        version: Optional[pulumi.Input[Optional[str]]] = None,
                        opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetTemplateResult]:
    """
    Data source for retrieving a Harness pipeline.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_harness as harness

    example = harness.platform.get_template(identifier="identifier",
        version="version")
    example1 = harness.platform.get_template(identifier="identifier",
        org_id="org_id",
        version="version")
    example2 = harness.platform.get_template(identifier="identifier",
        org_id="org_id",
        project_id="project_id",
        version="version")
    ```


    :param str branch_name: Version Label for Template.
    :param str child_type: Defines child template type.
    :param pulumi.InputType['GetTemplateGitDetailsArgs'] git_details: Contains parameters related to creating an Entity for Git Experience.
    :param str identifier: Unique identifier of the resource.
    :param bool is_stable: True if given version for template to be set as stable.
    :param str name: Name of the resource.
    :param str org_id: Unique identifier of the organization.
    :param str project_id: Unique identifier of the project.
    :param str scope: Scope of template.
    :param str version: Version Label for Template.
    """
    ...