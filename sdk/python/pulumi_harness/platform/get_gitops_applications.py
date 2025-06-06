# coding=utf-8
# *** WARNING: this file was generated by pulumi-language-python. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import builtins
import copy
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
    'GetGitopsApplicationsResult',
    'AwaitableGetGitopsApplicationsResult',
    'get_gitops_applications',
    'get_gitops_applications_output',
]

@pulumi.output_type
class GetGitopsApplicationsResult:
    """
    A collection of values returned by getGitopsApplications.
    """
    def __init__(__self__, account_id=None, agent_id=None, applications=None, cluster_id=None, id=None, identifier=None, kind=None, name=None, options_remove_existing_finalizers=None, org_id=None, project=None, project_id=None, repo_id=None, repo_ids=None, request_cascade=None, request_propagation_policy=None, skip_repo_validation=None, upsert=None, validate=None):
        if account_id and not isinstance(account_id, str):
            raise TypeError("Expected argument 'account_id' to be a str")
        pulumi.set(__self__, "account_id", account_id)
        if agent_id and not isinstance(agent_id, str):
            raise TypeError("Expected argument 'agent_id' to be a str")
        pulumi.set(__self__, "agent_id", agent_id)
        if applications and not isinstance(applications, list):
            raise TypeError("Expected argument 'applications' to be a list")
        pulumi.set(__self__, "applications", applications)
        if cluster_id and not isinstance(cluster_id, str):
            raise TypeError("Expected argument 'cluster_id' to be a str")
        pulumi.set(__self__, "cluster_id", cluster_id)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if identifier and not isinstance(identifier, str):
            raise TypeError("Expected argument 'identifier' to be a str")
        pulumi.set(__self__, "identifier", identifier)
        if kind and not isinstance(kind, str):
            raise TypeError("Expected argument 'kind' to be a str")
        pulumi.set(__self__, "kind", kind)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if options_remove_existing_finalizers and not isinstance(options_remove_existing_finalizers, bool):
            raise TypeError("Expected argument 'options_remove_existing_finalizers' to be a bool")
        pulumi.set(__self__, "options_remove_existing_finalizers", options_remove_existing_finalizers)
        if org_id and not isinstance(org_id, str):
            raise TypeError("Expected argument 'org_id' to be a str")
        pulumi.set(__self__, "org_id", org_id)
        if project and not isinstance(project, str):
            raise TypeError("Expected argument 'project' to be a str")
        pulumi.set(__self__, "project", project)
        if project_id and not isinstance(project_id, str):
            raise TypeError("Expected argument 'project_id' to be a str")
        pulumi.set(__self__, "project_id", project_id)
        if repo_id and not isinstance(repo_id, str):
            raise TypeError("Expected argument 'repo_id' to be a str")
        pulumi.set(__self__, "repo_id", repo_id)
        if repo_ids and not isinstance(repo_ids, list):
            raise TypeError("Expected argument 'repo_ids' to be a list")
        pulumi.set(__self__, "repo_ids", repo_ids)
        if request_cascade and not isinstance(request_cascade, bool):
            raise TypeError("Expected argument 'request_cascade' to be a bool")
        pulumi.set(__self__, "request_cascade", request_cascade)
        if request_propagation_policy and not isinstance(request_propagation_policy, str):
            raise TypeError("Expected argument 'request_propagation_policy' to be a str")
        pulumi.set(__self__, "request_propagation_policy", request_propagation_policy)
        if skip_repo_validation and not isinstance(skip_repo_validation, bool):
            raise TypeError("Expected argument 'skip_repo_validation' to be a bool")
        pulumi.set(__self__, "skip_repo_validation", skip_repo_validation)
        if upsert and not isinstance(upsert, bool):
            raise TypeError("Expected argument 'upsert' to be a bool")
        pulumi.set(__self__, "upsert", upsert)
        if validate and not isinstance(validate, bool):
            raise TypeError("Expected argument 'validate' to be a bool")
        pulumi.set(__self__, "validate", validate)

    @property
    @pulumi.getter(name="accountId")
    @_utilities.deprecated("""This field is deprecated and will be removed in a future release.""")
    def account_id(self) -> builtins.str:
        return pulumi.get(self, "account_id")

    @property
    @pulumi.getter(name="agentId")
    def agent_id(self) -> builtins.str:
        """
        Agent identifier of the GitOps application.
        """
        return pulumi.get(self, "agent_id")

    @property
    @pulumi.getter
    def applications(self) -> Sequence['outputs.GetGitopsApplicationsApplicationResult']:
        """
        Definition of the GitOps application resource.
        """
        return pulumi.get(self, "applications")

    @property
    @pulumi.getter(name="clusterId")
    def cluster_id(self) -> builtins.str:
        """
        Cluster identifier of the GitOps application.
        """
        return pulumi.get(self, "cluster_id")

    @property
    @pulumi.getter
    def id(self) -> builtins.str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    @_utilities.deprecated("""This field is deprecated and will be removed in a future release.""")
    def identifier(self) -> Optional[builtins.str]:
        """
        Identifier of the GitOps application.
        """
        return pulumi.get(self, "identifier")

    @property
    @pulumi.getter
    def kind(self) -> builtins.str:
        """
        Kind of the GitOps application.
        """
        return pulumi.get(self, "kind")

    @property
    @pulumi.getter
    def name(self) -> builtins.str:
        """
        Name of the GitOps application.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="optionsRemoveExistingFinalizers")
    def options_remove_existing_finalizers(self) -> builtins.bool:
        """
        Options to remove existing finalizers to delete the GitOps application.
        """
        return pulumi.get(self, "options_remove_existing_finalizers")

    @property
    @pulumi.getter(name="orgId")
    def org_id(self) -> builtins.str:
        """
        Organization identifier of the GitOps application.
        """
        return pulumi.get(self, "org_id")

    @property
    @pulumi.getter
    def project(self) -> builtins.str:
        """
        The ArgoCD project name corresponding to this GitOps application. An empty string means that the GitOps application belongs to the default project created by Harness.
        """
        return pulumi.get(self, "project")

    @property
    @pulumi.getter(name="projectId")
    def project_id(self) -> builtins.str:
        """
        Project identifier of the GitOps application.
        """
        return pulumi.get(self, "project_id")

    @property
    @pulumi.getter(name="repoId")
    def repo_id(self) -> builtins.str:
        """
        Repository identifier of the GitOps application.
        """
        return pulumi.get(self, "repo_id")

    @property
    @pulumi.getter(name="repoIds")
    def repo_ids(self) -> Sequence[builtins.str]:
        return pulumi.get(self, "repo_ids")

    @property
    @pulumi.getter(name="requestCascade")
    def request_cascade(self) -> builtins.bool:
        """
        Request cascade to delete the GitOps application.
        """
        return pulumi.get(self, "request_cascade")

    @property
    @pulumi.getter(name="requestPropagationPolicy")
    def request_propagation_policy(self) -> builtins.str:
        """
        Request propagation policy to delete the GitOps application.
        """
        return pulumi.get(self, "request_propagation_policy")

    @property
    @pulumi.getter(name="skipRepoValidation")
    def skip_repo_validation(self) -> builtins.bool:
        """
        Indicates if the GitOps application should skip validate repository definition exists.
        """
        return pulumi.get(self, "skip_repo_validation")

    @property
    @pulumi.getter
    def upsert(self) -> builtins.bool:
        """
        Indicates if the GitOps application should be updated if existing and inserted if not.
        """
        return pulumi.get(self, "upsert")

    @property
    @pulumi.getter
    def validate(self) -> builtins.bool:
        """
        Indicates if the GitOps application yaml has to be validated.
        """
        return pulumi.get(self, "validate")


class AwaitableGetGitopsApplicationsResult(GetGitopsApplicationsResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetGitopsApplicationsResult(
            account_id=self.account_id,
            agent_id=self.agent_id,
            applications=self.applications,
            cluster_id=self.cluster_id,
            id=self.id,
            identifier=self.identifier,
            kind=self.kind,
            name=self.name,
            options_remove_existing_finalizers=self.options_remove_existing_finalizers,
            org_id=self.org_id,
            project=self.project,
            project_id=self.project_id,
            repo_id=self.repo_id,
            repo_ids=self.repo_ids,
            request_cascade=self.request_cascade,
            request_propagation_policy=self.request_propagation_policy,
            skip_repo_validation=self.skip_repo_validation,
            upsert=self.upsert,
            validate=self.validate)


def get_gitops_applications(account_id: Optional[builtins.str] = None,
                            agent_id: Optional[builtins.str] = None,
                            identifier: Optional[builtins.str] = None,
                            name: Optional[builtins.str] = None,
                            org_id: Optional[builtins.str] = None,
                            project_id: Optional[builtins.str] = None,
                            opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetGitopsApplicationsResult:
    """
    Datasource for fetching a Harness GitOps Application.


    :param builtins.str agent_id: Agent identifier of the GitOps application.
    :param builtins.str identifier: Identifier of the GitOps application.
    :param builtins.str name: Name of the GitOps application.
    :param builtins.str org_id: Organization identifier of the GitOps application.
    :param builtins.str project_id: Project identifier of the GitOps application.
    """
    __args__ = dict()
    __args__['accountId'] = account_id
    __args__['agentId'] = agent_id
    __args__['identifier'] = identifier
    __args__['name'] = name
    __args__['orgId'] = org_id
    __args__['projectId'] = project_id
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('harness:platform/getGitopsApplications:getGitopsApplications', __args__, opts=opts, typ=GetGitopsApplicationsResult).value

    return AwaitableGetGitopsApplicationsResult(
        account_id=pulumi.get(__ret__, 'account_id'),
        agent_id=pulumi.get(__ret__, 'agent_id'),
        applications=pulumi.get(__ret__, 'applications'),
        cluster_id=pulumi.get(__ret__, 'cluster_id'),
        id=pulumi.get(__ret__, 'id'),
        identifier=pulumi.get(__ret__, 'identifier'),
        kind=pulumi.get(__ret__, 'kind'),
        name=pulumi.get(__ret__, 'name'),
        options_remove_existing_finalizers=pulumi.get(__ret__, 'options_remove_existing_finalizers'),
        org_id=pulumi.get(__ret__, 'org_id'),
        project=pulumi.get(__ret__, 'project'),
        project_id=pulumi.get(__ret__, 'project_id'),
        repo_id=pulumi.get(__ret__, 'repo_id'),
        repo_ids=pulumi.get(__ret__, 'repo_ids'),
        request_cascade=pulumi.get(__ret__, 'request_cascade'),
        request_propagation_policy=pulumi.get(__ret__, 'request_propagation_policy'),
        skip_repo_validation=pulumi.get(__ret__, 'skip_repo_validation'),
        upsert=pulumi.get(__ret__, 'upsert'),
        validate=pulumi.get(__ret__, 'validate'))
def get_gitops_applications_output(account_id: Optional[pulumi.Input[Optional[builtins.str]]] = None,
                                   agent_id: Optional[pulumi.Input[builtins.str]] = None,
                                   identifier: Optional[pulumi.Input[Optional[builtins.str]]] = None,
                                   name: Optional[pulumi.Input[builtins.str]] = None,
                                   org_id: Optional[pulumi.Input[builtins.str]] = None,
                                   project_id: Optional[pulumi.Input[builtins.str]] = None,
                                   opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetGitopsApplicationsResult]:
    """
    Datasource for fetching a Harness GitOps Application.


    :param builtins.str agent_id: Agent identifier of the GitOps application.
    :param builtins.str identifier: Identifier of the GitOps application.
    :param builtins.str name: Name of the GitOps application.
    :param builtins.str org_id: Organization identifier of the GitOps application.
    :param builtins.str project_id: Project identifier of the GitOps application.
    """
    __args__ = dict()
    __args__['accountId'] = account_id
    __args__['agentId'] = agent_id
    __args__['identifier'] = identifier
    __args__['name'] = name
    __args__['orgId'] = org_id
    __args__['projectId'] = project_id
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('harness:platform/getGitopsApplications:getGitopsApplications', __args__, opts=opts, typ=GetGitopsApplicationsResult)
    return __ret__.apply(lambda __response__: GetGitopsApplicationsResult(
        account_id=pulumi.get(__response__, 'account_id'),
        agent_id=pulumi.get(__response__, 'agent_id'),
        applications=pulumi.get(__response__, 'applications'),
        cluster_id=pulumi.get(__response__, 'cluster_id'),
        id=pulumi.get(__response__, 'id'),
        identifier=pulumi.get(__response__, 'identifier'),
        kind=pulumi.get(__response__, 'kind'),
        name=pulumi.get(__response__, 'name'),
        options_remove_existing_finalizers=pulumi.get(__response__, 'options_remove_existing_finalizers'),
        org_id=pulumi.get(__response__, 'org_id'),
        project=pulumi.get(__response__, 'project'),
        project_id=pulumi.get(__response__, 'project_id'),
        repo_id=pulumi.get(__response__, 'repo_id'),
        repo_ids=pulumi.get(__response__, 'repo_ids'),
        request_cascade=pulumi.get(__response__, 'request_cascade'),
        request_propagation_policy=pulumi.get(__response__, 'request_propagation_policy'),
        skip_repo_validation=pulumi.get(__response__, 'skip_repo_validation'),
        upsert=pulumi.get(__response__, 'upsert'),
        validate=pulumi.get(__response__, 'validate')))
