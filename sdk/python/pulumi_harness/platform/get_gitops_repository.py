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
    'GetGitopsRepositoryResult',
    'AwaitableGetGitopsRepositoryResult',
    'get_gitops_repository',
    'get_gitops_repository_output',
]

@pulumi.output_type
class GetGitopsRepositoryResult:
    """
    A collection of values returned by getGitopsRepository.
    """
    def __init__(__self__, account_id=None, agent_id=None, creds_only=None, id=None, identifier=None, org_id=None, project_id=None, query_force_refresh=None, query_project=None, query_repo=None, repos=None, update_masks=None, upsert=None):
        if account_id and not isinstance(account_id, str):
            raise TypeError("Expected argument 'account_id' to be a str")
        pulumi.set(__self__, "account_id", account_id)
        if agent_id and not isinstance(agent_id, str):
            raise TypeError("Expected argument 'agent_id' to be a str")
        pulumi.set(__self__, "agent_id", agent_id)
        if creds_only and not isinstance(creds_only, bool):
            raise TypeError("Expected argument 'creds_only' to be a bool")
        pulumi.set(__self__, "creds_only", creds_only)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if identifier and not isinstance(identifier, str):
            raise TypeError("Expected argument 'identifier' to be a str")
        pulumi.set(__self__, "identifier", identifier)
        if org_id and not isinstance(org_id, str):
            raise TypeError("Expected argument 'org_id' to be a str")
        pulumi.set(__self__, "org_id", org_id)
        if project_id and not isinstance(project_id, str):
            raise TypeError("Expected argument 'project_id' to be a str")
        pulumi.set(__self__, "project_id", project_id)
        if query_force_refresh and not isinstance(query_force_refresh, bool):
            raise TypeError("Expected argument 'query_force_refresh' to be a bool")
        pulumi.set(__self__, "query_force_refresh", query_force_refresh)
        if query_project and not isinstance(query_project, str):
            raise TypeError("Expected argument 'query_project' to be a str")
        pulumi.set(__self__, "query_project", query_project)
        if query_repo and not isinstance(query_repo, str):
            raise TypeError("Expected argument 'query_repo' to be a str")
        pulumi.set(__self__, "query_repo", query_repo)
        if repos and not isinstance(repos, list):
            raise TypeError("Expected argument 'repos' to be a list")
        pulumi.set(__self__, "repos", repos)
        if update_masks and not isinstance(update_masks, list):
            raise TypeError("Expected argument 'update_masks' to be a list")
        pulumi.set(__self__, "update_masks", update_masks)
        if upsert and not isinstance(upsert, bool):
            raise TypeError("Expected argument 'upsert' to be a bool")
        pulumi.set(__self__, "upsert", upsert)

    @property
    @pulumi.getter(name="accountId")
    def account_id(self) -> str:
        """
        Account identifier of the GitOps repository.
        """
        return pulumi.get(self, "account_id")

    @property
    @pulumi.getter(name="agentId")
    def agent_id(self) -> str:
        """
        Agent identifier of the GitOps repository.
        """
        return pulumi.get(self, "agent_id")

    @property
    @pulumi.getter(name="credsOnly")
    def creds_only(self) -> Optional[bool]:
        """
        Indicates if to operate on credential set instead of repository.
        """
        return pulumi.get(self, "creds_only")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def identifier(self) -> str:
        """
        Identifier of the GitOps repository.
        """
        return pulumi.get(self, "identifier")

    @property
    @pulumi.getter(name="orgId")
    def org_id(self) -> Optional[str]:
        """
        Organization identifier of the GitOps repository.
        """
        return pulumi.get(self, "org_id")

    @property
    @pulumi.getter(name="projectId")
    def project_id(self) -> Optional[str]:
        """
        Project identifier of the GitOps repository.
        """
        return pulumi.get(self, "project_id")

    @property
    @pulumi.getter(name="queryForceRefresh")
    def query_force_refresh(self) -> Optional[bool]:
        """
        Indicates to force refresh query for repository.
        """
        return pulumi.get(self, "query_force_refresh")

    @property
    @pulumi.getter(name="queryProject")
    def query_project(self) -> Optional[str]:
        """
        Project to query for the GitOps repo.
        """
        return pulumi.get(self, "query_project")

    @property
    @pulumi.getter(name="queryRepo")
    def query_repo(self) -> Optional[str]:
        """
        GitOps repository to query.
        """
        return pulumi.get(self, "query_repo")

    @property
    @pulumi.getter
    def repos(self) -> Sequence['outputs.GetGitopsRepositoryRepoResult']:
        """
        Repo details holding application configurations.
        """
        return pulumi.get(self, "repos")

    @property
    @pulumi.getter(name="updateMasks")
    def update_masks(self) -> Optional[Sequence['outputs.GetGitopsRepositoryUpdateMaskResult']]:
        """
        Update mask of the repository.
        """
        return pulumi.get(self, "update_masks")

    @property
    @pulumi.getter
    def upsert(self) -> Optional[bool]:
        """
        Indicates if the GitOps repository should be updated if existing and inserted if not.
        """
        return pulumi.get(self, "upsert")


class AwaitableGetGitopsRepositoryResult(GetGitopsRepositoryResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetGitopsRepositoryResult(
            account_id=self.account_id,
            agent_id=self.agent_id,
            creds_only=self.creds_only,
            id=self.id,
            identifier=self.identifier,
            org_id=self.org_id,
            project_id=self.project_id,
            query_force_refresh=self.query_force_refresh,
            query_project=self.query_project,
            query_repo=self.query_repo,
            repos=self.repos,
            update_masks=self.update_masks,
            upsert=self.upsert)


def get_gitops_repository(account_id: Optional[str] = None,
                          agent_id: Optional[str] = None,
                          creds_only: Optional[bool] = None,
                          identifier: Optional[str] = None,
                          org_id: Optional[str] = None,
                          project_id: Optional[str] = None,
                          query_force_refresh: Optional[bool] = None,
                          query_project: Optional[str] = None,
                          query_repo: Optional[str] = None,
                          update_masks: Optional[Sequence[pulumi.InputType['GetGitopsRepositoryUpdateMaskArgs']]] = None,
                          upsert: Optional[bool] = None,
                          opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetGitopsRepositoryResult:
    """
    Data Source for fetching a Harness GitOps Repository.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_harness as harness

    example = harness.platform.get_gitops_repository(identifier="identifier",
        account_id="account_id",
        project_id="project_id",
        org_id="org_id",
        agent_id="agent_id")
    ```


    :param str account_id: Account identifier of the GitOps repository.
    :param str agent_id: Agent identifier of the GitOps repository.
    :param bool creds_only: Indicates if to operate on credential set instead of repository.
    :param str identifier: Identifier of the GitOps repository.
    :param str org_id: Organization identifier of the GitOps repository.
    :param str project_id: Project identifier of the GitOps repository.
    :param bool query_force_refresh: Indicates to force refresh query for repository.
    :param str query_project: Project to query for the GitOps repo.
    :param str query_repo: GitOps repository to query.
    :param Sequence[pulumi.InputType['GetGitopsRepositoryUpdateMaskArgs']] update_masks: Update mask of the repository.
    :param bool upsert: Indicates if the GitOps repository should be updated if existing and inserted if not.
    """
    __args__ = dict()
    __args__['accountId'] = account_id
    __args__['agentId'] = agent_id
    __args__['credsOnly'] = creds_only
    __args__['identifier'] = identifier
    __args__['orgId'] = org_id
    __args__['projectId'] = project_id
    __args__['queryForceRefresh'] = query_force_refresh
    __args__['queryProject'] = query_project
    __args__['queryRepo'] = query_repo
    __args__['updateMasks'] = update_masks
    __args__['upsert'] = upsert
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('harness:platform/getGitopsRepository:getGitopsRepository', __args__, opts=opts, typ=GetGitopsRepositoryResult).value

    return AwaitableGetGitopsRepositoryResult(
        account_id=pulumi.get(__ret__, 'account_id'),
        agent_id=pulumi.get(__ret__, 'agent_id'),
        creds_only=pulumi.get(__ret__, 'creds_only'),
        id=pulumi.get(__ret__, 'id'),
        identifier=pulumi.get(__ret__, 'identifier'),
        org_id=pulumi.get(__ret__, 'org_id'),
        project_id=pulumi.get(__ret__, 'project_id'),
        query_force_refresh=pulumi.get(__ret__, 'query_force_refresh'),
        query_project=pulumi.get(__ret__, 'query_project'),
        query_repo=pulumi.get(__ret__, 'query_repo'),
        repos=pulumi.get(__ret__, 'repos'),
        update_masks=pulumi.get(__ret__, 'update_masks'),
        upsert=pulumi.get(__ret__, 'upsert'))


@_utilities.lift_output_func(get_gitops_repository)
def get_gitops_repository_output(account_id: Optional[pulumi.Input[str]] = None,
                                 agent_id: Optional[pulumi.Input[str]] = None,
                                 creds_only: Optional[pulumi.Input[Optional[bool]]] = None,
                                 identifier: Optional[pulumi.Input[str]] = None,
                                 org_id: Optional[pulumi.Input[Optional[str]]] = None,
                                 project_id: Optional[pulumi.Input[Optional[str]]] = None,
                                 query_force_refresh: Optional[pulumi.Input[Optional[bool]]] = None,
                                 query_project: Optional[pulumi.Input[Optional[str]]] = None,
                                 query_repo: Optional[pulumi.Input[Optional[str]]] = None,
                                 update_masks: Optional[pulumi.Input[Optional[Sequence[pulumi.InputType['GetGitopsRepositoryUpdateMaskArgs']]]]] = None,
                                 upsert: Optional[pulumi.Input[Optional[bool]]] = None,
                                 opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetGitopsRepositoryResult]:
    """
    Data Source for fetching a Harness GitOps Repository.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_harness as harness

    example = harness.platform.get_gitops_repository(identifier="identifier",
        account_id="account_id",
        project_id="project_id",
        org_id="org_id",
        agent_id="agent_id")
    ```


    :param str account_id: Account identifier of the GitOps repository.
    :param str agent_id: Agent identifier of the GitOps repository.
    :param bool creds_only: Indicates if to operate on credential set instead of repository.
    :param str identifier: Identifier of the GitOps repository.
    :param str org_id: Organization identifier of the GitOps repository.
    :param str project_id: Project identifier of the GitOps repository.
    :param bool query_force_refresh: Indicates to force refresh query for repository.
    :param str query_project: Project to query for the GitOps repo.
    :param str query_repo: GitOps repository to query.
    :param Sequence[pulumi.InputType['GetGitopsRepositoryUpdateMaskArgs']] update_masks: Update mask of the repository.
    :param bool upsert: Indicates if the GitOps repository should be updated if existing and inserted if not.
    """
    ...
