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
    def __init__(__self__, account_id=None, agent_id=None, applications=None, cluster_id=None, id=None, identifier=None, kind=None, name=None, options_remove_existing_finalizers=None, org_id=None, project=None, project_id=None, query_project=None, query_refresh=None, query_repo=None, query_resource_version=None, query_selector=None, repo_id=None, request_cascade=None, request_name=None, request_propagation_policy=None, upsert=None, validate=None):
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
        if query_project and not isinstance(query_project, str):
            raise TypeError("Expected argument 'query_project' to be a str")
        pulumi.set(__self__, "query_project", query_project)
        if query_refresh and not isinstance(query_refresh, str):
            raise TypeError("Expected argument 'query_refresh' to be a str")
        pulumi.set(__self__, "query_refresh", query_refresh)
        if query_repo and not isinstance(query_repo, str):
            raise TypeError("Expected argument 'query_repo' to be a str")
        pulumi.set(__self__, "query_repo", query_repo)
        if query_resource_version and not isinstance(query_resource_version, str):
            raise TypeError("Expected argument 'query_resource_version' to be a str")
        pulumi.set(__self__, "query_resource_version", query_resource_version)
        if query_selector and not isinstance(query_selector, str):
            raise TypeError("Expected argument 'query_selector' to be a str")
        pulumi.set(__self__, "query_selector", query_selector)
        if repo_id and not isinstance(repo_id, str):
            raise TypeError("Expected argument 'repo_id' to be a str")
        pulumi.set(__self__, "repo_id", repo_id)
        if request_cascade and not isinstance(request_cascade, bool):
            raise TypeError("Expected argument 'request_cascade' to be a bool")
        pulumi.set(__self__, "request_cascade", request_cascade)
        if request_name and not isinstance(request_name, str):
            raise TypeError("Expected argument 'request_name' to be a str")
        pulumi.set(__self__, "request_name", request_name)
        if request_propagation_policy and not isinstance(request_propagation_policy, str):
            raise TypeError("Expected argument 'request_propagation_policy' to be a str")
        pulumi.set(__self__, "request_propagation_policy", request_propagation_policy)
        if upsert and not isinstance(upsert, bool):
            raise TypeError("Expected argument 'upsert' to be a bool")
        pulumi.set(__self__, "upsert", upsert)
        if validate and not isinstance(validate, bool):
            raise TypeError("Expected argument 'validate' to be a bool")
        pulumi.set(__self__, "validate", validate)

    @property
    @pulumi.getter(name="accountId")
    def account_id(self) -> str:
        """
        Account identifier of the GitOps application.
        """
        return pulumi.get(self, "account_id")

    @property
    @pulumi.getter(name="agentId")
    def agent_id(self) -> str:
        """
        Agent identifier of the GitOps application.
        """
        return pulumi.get(self, "agent_id")

    @property
    @pulumi.getter
    def applications(self) -> Optional[Sequence['outputs.GetGitopsApplicationsApplicationResult']]:
        """
        Definition of the GitOps application resource.
        """
        return pulumi.get(self, "applications")

    @property
    @pulumi.getter(name="clusterId")
    def cluster_id(self) -> Optional[str]:
        """
        Cluster identifier of the GitOps application.
        """
        return pulumi.get(self, "cluster_id")

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
        Identifier of the GitOps application.
        """
        return pulumi.get(self, "identifier")

    @property
    @pulumi.getter
    def kind(self) -> Optional[str]:
        """
        Kind of the GitOps application.
        """
        return pulumi.get(self, "kind")

    @property
    @pulumi.getter
    def name(self) -> str:
        """
        Name of the GitOps application.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="optionsRemoveExistingFinalizers")
    def options_remove_existing_finalizers(self) -> Optional[bool]:
        """
        Options to remove existing finalizers to delete the GitOps application.
        """
        return pulumi.get(self, "options_remove_existing_finalizers")

    @property
    @pulumi.getter(name="orgId")
    def org_id(self) -> str:
        """
        Organization identifier of the GitOps application.
        """
        return pulumi.get(self, "org_id")

    @property
    @pulumi.getter
    def project(self) -> Optional[str]:
        """
        Reference to the project corresponding to this GitOps application. An empty string means that the GitOps application belongs to the 'default' project.
        """
        return pulumi.get(self, "project")

    @property
    @pulumi.getter(name="projectId")
    def project_id(self) -> str:
        """
        Project identifier of the GitOps application.
        """
        return pulumi.get(self, "project_id")

    @property
    @pulumi.getter(name="queryProject")
    def query_project(self) -> Optional[str]:
        """
        Project names to filter the corresponding GitOps applications.
        """
        return pulumi.get(self, "query_project")

    @property
    @pulumi.getter(name="queryRefresh")
    def query_refresh(self) -> Optional[str]:
        """
        Forces the GitOps application to reconcile when set to true.
        """
        return pulumi.get(self, "query_refresh")

    @property
    @pulumi.getter(name="queryRepo")
    def query_repo(self) -> Optional[str]:
        """
        Repo URL to restrict returned list applications.
        """
        return pulumi.get(self, "query_repo")

    @property
    @pulumi.getter(name="queryResourceVersion")
    def query_resource_version(self) -> Optional[str]:
        """
        Shows modifications after a version that is specified with a watch call.
        """
        return pulumi.get(self, "query_resource_version")

    @property
    @pulumi.getter(name="querySelector")
    def query_selector(self) -> Optional[str]:
        """
        Filters GitOps applications corresponding to the labels.
        """
        return pulumi.get(self, "query_selector")

    @property
    @pulumi.getter(name="repoId")
    def repo_id(self) -> str:
        """
        Repository identifier of the GitOps application.
        """
        return pulumi.get(self, "repo_id")

    @property
    @pulumi.getter(name="requestCascade")
    def request_cascade(self) -> Optional[bool]:
        """
        Request cascade to delete the GitOps application.
        """
        return pulumi.get(self, "request_cascade")

    @property
    @pulumi.getter(name="requestName")
    def request_name(self) -> Optional[str]:
        """
        Request name to delete the GitOps application.
        """
        return pulumi.get(self, "request_name")

    @property
    @pulumi.getter(name="requestPropagationPolicy")
    def request_propagation_policy(self) -> Optional[str]:
        """
        Request propagation policy to delete the GitOps application.
        """
        return pulumi.get(self, "request_propagation_policy")

    @property
    @pulumi.getter
    def upsert(self) -> Optional[bool]:
        """
        Indicates if the GitOps application should be updated if existing and inserted if not.
        """
        return pulumi.get(self, "upsert")

    @property
    @pulumi.getter
    def validate(self) -> Optional[bool]:
        """
        Indicates if the GitOps application has to be validated.
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
            query_project=self.query_project,
            query_refresh=self.query_refresh,
            query_repo=self.query_repo,
            query_resource_version=self.query_resource_version,
            query_selector=self.query_selector,
            repo_id=self.repo_id,
            request_cascade=self.request_cascade,
            request_name=self.request_name,
            request_propagation_policy=self.request_propagation_policy,
            upsert=self.upsert,
            validate=self.validate)


def get_gitops_applications(account_id: Optional[str] = None,
                            agent_id: Optional[str] = None,
                            applications: Optional[Sequence[pulumi.InputType['GetGitopsApplicationsApplicationArgs']]] = None,
                            cluster_id: Optional[str] = None,
                            identifier: Optional[str] = None,
                            kind: Optional[str] = None,
                            name: Optional[str] = None,
                            options_remove_existing_finalizers: Optional[bool] = None,
                            org_id: Optional[str] = None,
                            project: Optional[str] = None,
                            project_id: Optional[str] = None,
                            query_project: Optional[str] = None,
                            query_refresh: Optional[str] = None,
                            query_repo: Optional[str] = None,
                            query_resource_version: Optional[str] = None,
                            query_selector: Optional[str] = None,
                            repo_id: Optional[str] = None,
                            request_cascade: Optional[bool] = None,
                            request_name: Optional[str] = None,
                            request_propagation_policy: Optional[str] = None,
                            upsert: Optional[bool] = None,
                            validate: Optional[bool] = None,
                            opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetGitopsApplicationsResult:
    """
    Datasource for fetching a Harness GitOps Application.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_harness as harness

    example = harness.platform.get_gitops_applications(identifier="identifier",
        account_id="account_id",
        project_id="project_id",
        org_id="org_id",
        agent_id="agent_id",
        repo_id="repo_id")
    ```


    :param str account_id: Account identifier of the GitOps application.
    :param str agent_id: Agent identifier of the GitOps application.
    :param Sequence[pulumi.InputType['GetGitopsApplicationsApplicationArgs']] applications: Definition of the GitOps application resource.
    :param str cluster_id: Cluster identifier of the GitOps application.
    :param str identifier: Identifier of the GitOps application.
    :param str kind: Kind of the GitOps application.
    :param str name: Name of the GitOps application.
    :param bool options_remove_existing_finalizers: Options to remove existing finalizers to delete the GitOps application.
    :param str org_id: Organization identifier of the GitOps application.
    :param str project: Reference to the project corresponding to this GitOps application. An empty string means that the GitOps application belongs to the 'default' project.
    :param str project_id: Project identifier of the GitOps application.
    :param str query_project: Project names to filter the corresponding GitOps applications.
    :param str query_refresh: Forces the GitOps application to reconcile when set to true.
    :param str query_repo: Repo URL to restrict returned list applications.
    :param str query_resource_version: Shows modifications after a version that is specified with a watch call.
    :param str query_selector: Filters GitOps applications corresponding to the labels.
    :param str repo_id: Repository identifier of the GitOps application.
    :param bool request_cascade: Request cascade to delete the GitOps application.
    :param str request_name: Request name to delete the GitOps application.
    :param str request_propagation_policy: Request propagation policy to delete the GitOps application.
    :param bool upsert: Indicates if the GitOps application should be updated if existing and inserted if not.
    :param bool validate: Indicates if the GitOps application has to be validated.
    """
    __args__ = dict()
    __args__['accountId'] = account_id
    __args__['agentId'] = agent_id
    __args__['applications'] = applications
    __args__['clusterId'] = cluster_id
    __args__['identifier'] = identifier
    __args__['kind'] = kind
    __args__['name'] = name
    __args__['optionsRemoveExistingFinalizers'] = options_remove_existing_finalizers
    __args__['orgId'] = org_id
    __args__['project'] = project
    __args__['projectId'] = project_id
    __args__['queryProject'] = query_project
    __args__['queryRefresh'] = query_refresh
    __args__['queryRepo'] = query_repo
    __args__['queryResourceVersion'] = query_resource_version
    __args__['querySelector'] = query_selector
    __args__['repoId'] = repo_id
    __args__['requestCascade'] = request_cascade
    __args__['requestName'] = request_name
    __args__['requestPropagationPolicy'] = request_propagation_policy
    __args__['upsert'] = upsert
    __args__['validate'] = validate
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
        query_project=pulumi.get(__ret__, 'query_project'),
        query_refresh=pulumi.get(__ret__, 'query_refresh'),
        query_repo=pulumi.get(__ret__, 'query_repo'),
        query_resource_version=pulumi.get(__ret__, 'query_resource_version'),
        query_selector=pulumi.get(__ret__, 'query_selector'),
        repo_id=pulumi.get(__ret__, 'repo_id'),
        request_cascade=pulumi.get(__ret__, 'request_cascade'),
        request_name=pulumi.get(__ret__, 'request_name'),
        request_propagation_policy=pulumi.get(__ret__, 'request_propagation_policy'),
        upsert=pulumi.get(__ret__, 'upsert'),
        validate=pulumi.get(__ret__, 'validate'))


@_utilities.lift_output_func(get_gitops_applications)
def get_gitops_applications_output(account_id: Optional[pulumi.Input[str]] = None,
                                   agent_id: Optional[pulumi.Input[str]] = None,
                                   applications: Optional[pulumi.Input[Optional[Sequence[pulumi.InputType['GetGitopsApplicationsApplicationArgs']]]]] = None,
                                   cluster_id: Optional[pulumi.Input[Optional[str]]] = None,
                                   identifier: Optional[pulumi.Input[Optional[str]]] = None,
                                   kind: Optional[pulumi.Input[Optional[str]]] = None,
                                   name: Optional[pulumi.Input[str]] = None,
                                   options_remove_existing_finalizers: Optional[pulumi.Input[Optional[bool]]] = None,
                                   org_id: Optional[pulumi.Input[str]] = None,
                                   project: Optional[pulumi.Input[Optional[str]]] = None,
                                   project_id: Optional[pulumi.Input[str]] = None,
                                   query_project: Optional[pulumi.Input[Optional[str]]] = None,
                                   query_refresh: Optional[pulumi.Input[Optional[str]]] = None,
                                   query_repo: Optional[pulumi.Input[Optional[str]]] = None,
                                   query_resource_version: Optional[pulumi.Input[Optional[str]]] = None,
                                   query_selector: Optional[pulumi.Input[Optional[str]]] = None,
                                   repo_id: Optional[pulumi.Input[str]] = None,
                                   request_cascade: Optional[pulumi.Input[Optional[bool]]] = None,
                                   request_name: Optional[pulumi.Input[Optional[str]]] = None,
                                   request_propagation_policy: Optional[pulumi.Input[Optional[str]]] = None,
                                   upsert: Optional[pulumi.Input[Optional[bool]]] = None,
                                   validate: Optional[pulumi.Input[Optional[bool]]] = None,
                                   opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetGitopsApplicationsResult]:
    """
    Datasource for fetching a Harness GitOps Application.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_harness as harness

    example = harness.platform.get_gitops_applications(identifier="identifier",
        account_id="account_id",
        project_id="project_id",
        org_id="org_id",
        agent_id="agent_id",
        repo_id="repo_id")
    ```


    :param str account_id: Account identifier of the GitOps application.
    :param str agent_id: Agent identifier of the GitOps application.
    :param Sequence[pulumi.InputType['GetGitopsApplicationsApplicationArgs']] applications: Definition of the GitOps application resource.
    :param str cluster_id: Cluster identifier of the GitOps application.
    :param str identifier: Identifier of the GitOps application.
    :param str kind: Kind of the GitOps application.
    :param str name: Name of the GitOps application.
    :param bool options_remove_existing_finalizers: Options to remove existing finalizers to delete the GitOps application.
    :param str org_id: Organization identifier of the GitOps application.
    :param str project: Reference to the project corresponding to this GitOps application. An empty string means that the GitOps application belongs to the 'default' project.
    :param str project_id: Project identifier of the GitOps application.
    :param str query_project: Project names to filter the corresponding GitOps applications.
    :param str query_refresh: Forces the GitOps application to reconcile when set to true.
    :param str query_repo: Repo URL to restrict returned list applications.
    :param str query_resource_version: Shows modifications after a version that is specified with a watch call.
    :param str query_selector: Filters GitOps applications corresponding to the labels.
    :param str repo_id: Repository identifier of the GitOps application.
    :param bool request_cascade: Request cascade to delete the GitOps application.
    :param str request_name: Request name to delete the GitOps application.
    :param str request_propagation_policy: Request propagation policy to delete the GitOps application.
    :param bool upsert: Indicates if the GitOps application should be updated if existing and inserted if not.
    :param bool validate: Indicates if the GitOps application has to be validated.
    """
    ...
