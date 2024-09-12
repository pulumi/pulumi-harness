# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['PolicyArgs', 'Policy']

@pulumi.input_type
class PolicyArgs:
    def __init__(__self__, *,
                 identifier: pulumi.Input[str],
                 rego: pulumi.Input[str],
                 description: Optional[pulumi.Input[str]] = None,
                 git_base_branch: Optional[pulumi.Input[str]] = None,
                 git_branch: Optional[pulumi.Input[str]] = None,
                 git_commit_msg: Optional[pulumi.Input[str]] = None,
                 git_commit_sha: Optional[pulumi.Input[str]] = None,
                 git_connector_ref: Optional[pulumi.Input[str]] = None,
                 git_file_id: Optional[pulumi.Input[str]] = None,
                 git_import: Optional[pulumi.Input[bool]] = None,
                 git_is_new_branch: Optional[pulumi.Input[bool]] = None,
                 git_path: Optional[pulumi.Input[str]] = None,
                 git_repo: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 org_id: Optional[pulumi.Input[str]] = None,
                 project_id: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None):
        """
        The set of arguments for constructing a Policy resource.
        :param pulumi.Input[str] identifier: Unique identifier of the resource.
        :param pulumi.Input[str] rego: Rego code for the policy.
        :param pulumi.Input[str] description: Description of the resource.
        :param pulumi.Input[str] git_base_branch: Base branch for the new git branch.
        :param pulumi.Input[str] git_branch: Git branch for the policy.
        :param pulumi.Input[str] git_commit_msg: Git commit message for the policy.
        :param pulumi.Input[str] git_commit_sha: The existing commit sha of the file being updated
        :param pulumi.Input[str] git_connector_ref: Git connector reference for the policy.
        :param pulumi.Input[str] git_file_id: The existing file id of the file being updated, not required for bitbucket files
        :param pulumi.Input[bool] git_import: Flag to import the policy from git.
        :param pulumi.Input[bool] git_is_new_branch: Flag to create a new branch for the policy.
        :param pulumi.Input[str] git_path: Git path for the policy.
        :param pulumi.Input[str] git_repo: Git repository for the policy.
        :param pulumi.Input[str] name: Name of the resource.
        :param pulumi.Input[str] org_id: Unique identifier of the organization.
        :param pulumi.Input[str] project_id: Unique identifier of the project.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] tags: Tags to associate with the resource.
        """
        pulumi.set(__self__, "identifier", identifier)
        pulumi.set(__self__, "rego", rego)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if git_base_branch is not None:
            pulumi.set(__self__, "git_base_branch", git_base_branch)
        if git_branch is not None:
            pulumi.set(__self__, "git_branch", git_branch)
        if git_commit_msg is not None:
            pulumi.set(__self__, "git_commit_msg", git_commit_msg)
        if git_commit_sha is not None:
            pulumi.set(__self__, "git_commit_sha", git_commit_sha)
        if git_connector_ref is not None:
            pulumi.set(__self__, "git_connector_ref", git_connector_ref)
        if git_file_id is not None:
            pulumi.set(__self__, "git_file_id", git_file_id)
        if git_import is not None:
            pulumi.set(__self__, "git_import", git_import)
        if git_is_new_branch is not None:
            pulumi.set(__self__, "git_is_new_branch", git_is_new_branch)
        if git_path is not None:
            pulumi.set(__self__, "git_path", git_path)
        if git_repo is not None:
            pulumi.set(__self__, "git_repo", git_repo)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if org_id is not None:
            pulumi.set(__self__, "org_id", org_id)
        if project_id is not None:
            pulumi.set(__self__, "project_id", project_id)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)

    @property
    @pulumi.getter
    def identifier(self) -> pulumi.Input[str]:
        """
        Unique identifier of the resource.
        """
        return pulumi.get(self, "identifier")

    @identifier.setter
    def identifier(self, value: pulumi.Input[str]):
        pulumi.set(self, "identifier", value)

    @property
    @pulumi.getter
    def rego(self) -> pulumi.Input[str]:
        """
        Rego code for the policy.
        """
        return pulumi.get(self, "rego")

    @rego.setter
    def rego(self, value: pulumi.Input[str]):
        pulumi.set(self, "rego", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        Description of the resource.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter(name="gitBaseBranch")
    def git_base_branch(self) -> Optional[pulumi.Input[str]]:
        """
        Base branch for the new git branch.
        """
        return pulumi.get(self, "git_base_branch")

    @git_base_branch.setter
    def git_base_branch(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "git_base_branch", value)

    @property
    @pulumi.getter(name="gitBranch")
    def git_branch(self) -> Optional[pulumi.Input[str]]:
        """
        Git branch for the policy.
        """
        return pulumi.get(self, "git_branch")

    @git_branch.setter
    def git_branch(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "git_branch", value)

    @property
    @pulumi.getter(name="gitCommitMsg")
    def git_commit_msg(self) -> Optional[pulumi.Input[str]]:
        """
        Git commit message for the policy.
        """
        return pulumi.get(self, "git_commit_msg")

    @git_commit_msg.setter
    def git_commit_msg(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "git_commit_msg", value)

    @property
    @pulumi.getter(name="gitCommitSha")
    def git_commit_sha(self) -> Optional[pulumi.Input[str]]:
        """
        The existing commit sha of the file being updated
        """
        return pulumi.get(self, "git_commit_sha")

    @git_commit_sha.setter
    def git_commit_sha(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "git_commit_sha", value)

    @property
    @pulumi.getter(name="gitConnectorRef")
    def git_connector_ref(self) -> Optional[pulumi.Input[str]]:
        """
        Git connector reference for the policy.
        """
        return pulumi.get(self, "git_connector_ref")

    @git_connector_ref.setter
    def git_connector_ref(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "git_connector_ref", value)

    @property
    @pulumi.getter(name="gitFileId")
    def git_file_id(self) -> Optional[pulumi.Input[str]]:
        """
        The existing file id of the file being updated, not required for bitbucket files
        """
        return pulumi.get(self, "git_file_id")

    @git_file_id.setter
    def git_file_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "git_file_id", value)

    @property
    @pulumi.getter(name="gitImport")
    def git_import(self) -> Optional[pulumi.Input[bool]]:
        """
        Flag to import the policy from git.
        """
        return pulumi.get(self, "git_import")

    @git_import.setter
    def git_import(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "git_import", value)

    @property
    @pulumi.getter(name="gitIsNewBranch")
    def git_is_new_branch(self) -> Optional[pulumi.Input[bool]]:
        """
        Flag to create a new branch for the policy.
        """
        return pulumi.get(self, "git_is_new_branch")

    @git_is_new_branch.setter
    def git_is_new_branch(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "git_is_new_branch", value)

    @property
    @pulumi.getter(name="gitPath")
    def git_path(self) -> Optional[pulumi.Input[str]]:
        """
        Git path for the policy.
        """
        return pulumi.get(self, "git_path")

    @git_path.setter
    def git_path(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "git_path", value)

    @property
    @pulumi.getter(name="gitRepo")
    def git_repo(self) -> Optional[pulumi.Input[str]]:
        """
        Git repository for the policy.
        """
        return pulumi.get(self, "git_repo")

    @git_repo.setter
    def git_repo(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "git_repo", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Name of the resource.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="orgId")
    def org_id(self) -> Optional[pulumi.Input[str]]:
        """
        Unique identifier of the organization.
        """
        return pulumi.get(self, "org_id")

    @org_id.setter
    def org_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "org_id", value)

    @property
    @pulumi.getter(name="projectId")
    def project_id(self) -> Optional[pulumi.Input[str]]:
        """
        Unique identifier of the project.
        """
        return pulumi.get(self, "project_id")

    @project_id.setter
    def project_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "project_id", value)

    @property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        Tags to associate with the resource.
        """
        return pulumi.get(self, "tags")

    @tags.setter
    def tags(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "tags", value)


@pulumi.input_type
class _PolicyState:
    def __init__(__self__, *,
                 description: Optional[pulumi.Input[str]] = None,
                 git_base_branch: Optional[pulumi.Input[str]] = None,
                 git_branch: Optional[pulumi.Input[str]] = None,
                 git_commit_msg: Optional[pulumi.Input[str]] = None,
                 git_commit_sha: Optional[pulumi.Input[str]] = None,
                 git_connector_ref: Optional[pulumi.Input[str]] = None,
                 git_file_id: Optional[pulumi.Input[str]] = None,
                 git_import: Optional[pulumi.Input[bool]] = None,
                 git_is_new_branch: Optional[pulumi.Input[bool]] = None,
                 git_path: Optional[pulumi.Input[str]] = None,
                 git_repo: Optional[pulumi.Input[str]] = None,
                 identifier: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 org_id: Optional[pulumi.Input[str]] = None,
                 project_id: Optional[pulumi.Input[str]] = None,
                 rego: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None):
        """
        Input properties used for looking up and filtering Policy resources.
        :param pulumi.Input[str] description: Description of the resource.
        :param pulumi.Input[str] git_base_branch: Base branch for the new git branch.
        :param pulumi.Input[str] git_branch: Git branch for the policy.
        :param pulumi.Input[str] git_commit_msg: Git commit message for the policy.
        :param pulumi.Input[str] git_commit_sha: The existing commit sha of the file being updated
        :param pulumi.Input[str] git_connector_ref: Git connector reference for the policy.
        :param pulumi.Input[str] git_file_id: The existing file id of the file being updated, not required for bitbucket files
        :param pulumi.Input[bool] git_import: Flag to import the policy from git.
        :param pulumi.Input[bool] git_is_new_branch: Flag to create a new branch for the policy.
        :param pulumi.Input[str] git_path: Git path for the policy.
        :param pulumi.Input[str] git_repo: Git repository for the policy.
        :param pulumi.Input[str] identifier: Unique identifier of the resource.
        :param pulumi.Input[str] name: Name of the resource.
        :param pulumi.Input[str] org_id: Unique identifier of the organization.
        :param pulumi.Input[str] project_id: Unique identifier of the project.
        :param pulumi.Input[str] rego: Rego code for the policy.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] tags: Tags to associate with the resource.
        """
        if description is not None:
            pulumi.set(__self__, "description", description)
        if git_base_branch is not None:
            pulumi.set(__self__, "git_base_branch", git_base_branch)
        if git_branch is not None:
            pulumi.set(__self__, "git_branch", git_branch)
        if git_commit_msg is not None:
            pulumi.set(__self__, "git_commit_msg", git_commit_msg)
        if git_commit_sha is not None:
            pulumi.set(__self__, "git_commit_sha", git_commit_sha)
        if git_connector_ref is not None:
            pulumi.set(__self__, "git_connector_ref", git_connector_ref)
        if git_file_id is not None:
            pulumi.set(__self__, "git_file_id", git_file_id)
        if git_import is not None:
            pulumi.set(__self__, "git_import", git_import)
        if git_is_new_branch is not None:
            pulumi.set(__self__, "git_is_new_branch", git_is_new_branch)
        if git_path is not None:
            pulumi.set(__self__, "git_path", git_path)
        if git_repo is not None:
            pulumi.set(__self__, "git_repo", git_repo)
        if identifier is not None:
            pulumi.set(__self__, "identifier", identifier)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if org_id is not None:
            pulumi.set(__self__, "org_id", org_id)
        if project_id is not None:
            pulumi.set(__self__, "project_id", project_id)
        if rego is not None:
            pulumi.set(__self__, "rego", rego)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        Description of the resource.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter(name="gitBaseBranch")
    def git_base_branch(self) -> Optional[pulumi.Input[str]]:
        """
        Base branch for the new git branch.
        """
        return pulumi.get(self, "git_base_branch")

    @git_base_branch.setter
    def git_base_branch(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "git_base_branch", value)

    @property
    @pulumi.getter(name="gitBranch")
    def git_branch(self) -> Optional[pulumi.Input[str]]:
        """
        Git branch for the policy.
        """
        return pulumi.get(self, "git_branch")

    @git_branch.setter
    def git_branch(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "git_branch", value)

    @property
    @pulumi.getter(name="gitCommitMsg")
    def git_commit_msg(self) -> Optional[pulumi.Input[str]]:
        """
        Git commit message for the policy.
        """
        return pulumi.get(self, "git_commit_msg")

    @git_commit_msg.setter
    def git_commit_msg(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "git_commit_msg", value)

    @property
    @pulumi.getter(name="gitCommitSha")
    def git_commit_sha(self) -> Optional[pulumi.Input[str]]:
        """
        The existing commit sha of the file being updated
        """
        return pulumi.get(self, "git_commit_sha")

    @git_commit_sha.setter
    def git_commit_sha(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "git_commit_sha", value)

    @property
    @pulumi.getter(name="gitConnectorRef")
    def git_connector_ref(self) -> Optional[pulumi.Input[str]]:
        """
        Git connector reference for the policy.
        """
        return pulumi.get(self, "git_connector_ref")

    @git_connector_ref.setter
    def git_connector_ref(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "git_connector_ref", value)

    @property
    @pulumi.getter(name="gitFileId")
    def git_file_id(self) -> Optional[pulumi.Input[str]]:
        """
        The existing file id of the file being updated, not required for bitbucket files
        """
        return pulumi.get(self, "git_file_id")

    @git_file_id.setter
    def git_file_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "git_file_id", value)

    @property
    @pulumi.getter(name="gitImport")
    def git_import(self) -> Optional[pulumi.Input[bool]]:
        """
        Flag to import the policy from git.
        """
        return pulumi.get(self, "git_import")

    @git_import.setter
    def git_import(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "git_import", value)

    @property
    @pulumi.getter(name="gitIsNewBranch")
    def git_is_new_branch(self) -> Optional[pulumi.Input[bool]]:
        """
        Flag to create a new branch for the policy.
        """
        return pulumi.get(self, "git_is_new_branch")

    @git_is_new_branch.setter
    def git_is_new_branch(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "git_is_new_branch", value)

    @property
    @pulumi.getter(name="gitPath")
    def git_path(self) -> Optional[pulumi.Input[str]]:
        """
        Git path for the policy.
        """
        return pulumi.get(self, "git_path")

    @git_path.setter
    def git_path(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "git_path", value)

    @property
    @pulumi.getter(name="gitRepo")
    def git_repo(self) -> Optional[pulumi.Input[str]]:
        """
        Git repository for the policy.
        """
        return pulumi.get(self, "git_repo")

    @git_repo.setter
    def git_repo(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "git_repo", value)

    @property
    @pulumi.getter
    def identifier(self) -> Optional[pulumi.Input[str]]:
        """
        Unique identifier of the resource.
        """
        return pulumi.get(self, "identifier")

    @identifier.setter
    def identifier(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "identifier", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Name of the resource.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="orgId")
    def org_id(self) -> Optional[pulumi.Input[str]]:
        """
        Unique identifier of the organization.
        """
        return pulumi.get(self, "org_id")

    @org_id.setter
    def org_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "org_id", value)

    @property
    @pulumi.getter(name="projectId")
    def project_id(self) -> Optional[pulumi.Input[str]]:
        """
        Unique identifier of the project.
        """
        return pulumi.get(self, "project_id")

    @project_id.setter
    def project_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "project_id", value)

    @property
    @pulumi.getter
    def rego(self) -> Optional[pulumi.Input[str]]:
        """
        Rego code for the policy.
        """
        return pulumi.get(self, "rego")

    @rego.setter
    def rego(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "rego", value)

    @property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        Tags to associate with the resource.
        """
        return pulumi.get(self, "tags")

    @tags.setter
    def tags(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "tags", value)


class Policy(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 git_base_branch: Optional[pulumi.Input[str]] = None,
                 git_branch: Optional[pulumi.Input[str]] = None,
                 git_commit_msg: Optional[pulumi.Input[str]] = None,
                 git_commit_sha: Optional[pulumi.Input[str]] = None,
                 git_connector_ref: Optional[pulumi.Input[str]] = None,
                 git_file_id: Optional[pulumi.Input[str]] = None,
                 git_import: Optional[pulumi.Input[bool]] = None,
                 git_is_new_branch: Optional[pulumi.Input[bool]] = None,
                 git_path: Optional[pulumi.Input[str]] = None,
                 git_repo: Optional[pulumi.Input[str]] = None,
                 identifier: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 org_id: Optional[pulumi.Input[str]] = None,
                 project_id: Optional[pulumi.Input[str]] = None,
                 rego: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 __props__=None):
        """
        Resource for creating a Harness Policy.

        ## Import

        Import using the organization id

        ```sh
        $ pulumi import harness:platform/policy:Policy example <organization_id>
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] description: Description of the resource.
        :param pulumi.Input[str] git_base_branch: Base branch for the new git branch.
        :param pulumi.Input[str] git_branch: Git branch for the policy.
        :param pulumi.Input[str] git_commit_msg: Git commit message for the policy.
        :param pulumi.Input[str] git_commit_sha: The existing commit sha of the file being updated
        :param pulumi.Input[str] git_connector_ref: Git connector reference for the policy.
        :param pulumi.Input[str] git_file_id: The existing file id of the file being updated, not required for bitbucket files
        :param pulumi.Input[bool] git_import: Flag to import the policy from git.
        :param pulumi.Input[bool] git_is_new_branch: Flag to create a new branch for the policy.
        :param pulumi.Input[str] git_path: Git path for the policy.
        :param pulumi.Input[str] git_repo: Git repository for the policy.
        :param pulumi.Input[str] identifier: Unique identifier of the resource.
        :param pulumi.Input[str] name: Name of the resource.
        :param pulumi.Input[str] org_id: Unique identifier of the organization.
        :param pulumi.Input[str] project_id: Unique identifier of the project.
        :param pulumi.Input[str] rego: Rego code for the policy.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] tags: Tags to associate with the resource.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: PolicyArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Resource for creating a Harness Policy.

        ## Import

        Import using the organization id

        ```sh
        $ pulumi import harness:platform/policy:Policy example <organization_id>
        ```

        :param str resource_name: The name of the resource.
        :param PolicyArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(PolicyArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 git_base_branch: Optional[pulumi.Input[str]] = None,
                 git_branch: Optional[pulumi.Input[str]] = None,
                 git_commit_msg: Optional[pulumi.Input[str]] = None,
                 git_commit_sha: Optional[pulumi.Input[str]] = None,
                 git_connector_ref: Optional[pulumi.Input[str]] = None,
                 git_file_id: Optional[pulumi.Input[str]] = None,
                 git_import: Optional[pulumi.Input[bool]] = None,
                 git_is_new_branch: Optional[pulumi.Input[bool]] = None,
                 git_path: Optional[pulumi.Input[str]] = None,
                 git_repo: Optional[pulumi.Input[str]] = None,
                 identifier: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 org_id: Optional[pulumi.Input[str]] = None,
                 project_id: Optional[pulumi.Input[str]] = None,
                 rego: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = PolicyArgs.__new__(PolicyArgs)

            __props__.__dict__["description"] = description
            __props__.__dict__["git_base_branch"] = git_base_branch
            __props__.__dict__["git_branch"] = git_branch
            __props__.__dict__["git_commit_msg"] = git_commit_msg
            __props__.__dict__["git_commit_sha"] = git_commit_sha
            __props__.__dict__["git_connector_ref"] = git_connector_ref
            __props__.__dict__["git_file_id"] = git_file_id
            __props__.__dict__["git_import"] = git_import
            __props__.__dict__["git_is_new_branch"] = git_is_new_branch
            __props__.__dict__["git_path"] = git_path
            __props__.__dict__["git_repo"] = git_repo
            if identifier is None and not opts.urn:
                raise TypeError("Missing required property 'identifier'")
            __props__.__dict__["identifier"] = identifier
            __props__.__dict__["name"] = name
            __props__.__dict__["org_id"] = org_id
            __props__.__dict__["project_id"] = project_id
            if rego is None and not opts.urn:
                raise TypeError("Missing required property 'rego'")
            __props__.__dict__["rego"] = rego
            __props__.__dict__["tags"] = tags
        super(Policy, __self__).__init__(
            'harness:platform/policy:Policy',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            description: Optional[pulumi.Input[str]] = None,
            git_base_branch: Optional[pulumi.Input[str]] = None,
            git_branch: Optional[pulumi.Input[str]] = None,
            git_commit_msg: Optional[pulumi.Input[str]] = None,
            git_commit_sha: Optional[pulumi.Input[str]] = None,
            git_connector_ref: Optional[pulumi.Input[str]] = None,
            git_file_id: Optional[pulumi.Input[str]] = None,
            git_import: Optional[pulumi.Input[bool]] = None,
            git_is_new_branch: Optional[pulumi.Input[bool]] = None,
            git_path: Optional[pulumi.Input[str]] = None,
            git_repo: Optional[pulumi.Input[str]] = None,
            identifier: Optional[pulumi.Input[str]] = None,
            name: Optional[pulumi.Input[str]] = None,
            org_id: Optional[pulumi.Input[str]] = None,
            project_id: Optional[pulumi.Input[str]] = None,
            rego: Optional[pulumi.Input[str]] = None,
            tags: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None) -> 'Policy':
        """
        Get an existing Policy resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] description: Description of the resource.
        :param pulumi.Input[str] git_base_branch: Base branch for the new git branch.
        :param pulumi.Input[str] git_branch: Git branch for the policy.
        :param pulumi.Input[str] git_commit_msg: Git commit message for the policy.
        :param pulumi.Input[str] git_commit_sha: The existing commit sha of the file being updated
        :param pulumi.Input[str] git_connector_ref: Git connector reference for the policy.
        :param pulumi.Input[str] git_file_id: The existing file id of the file being updated, not required for bitbucket files
        :param pulumi.Input[bool] git_import: Flag to import the policy from git.
        :param pulumi.Input[bool] git_is_new_branch: Flag to create a new branch for the policy.
        :param pulumi.Input[str] git_path: Git path for the policy.
        :param pulumi.Input[str] git_repo: Git repository for the policy.
        :param pulumi.Input[str] identifier: Unique identifier of the resource.
        :param pulumi.Input[str] name: Name of the resource.
        :param pulumi.Input[str] org_id: Unique identifier of the organization.
        :param pulumi.Input[str] project_id: Unique identifier of the project.
        :param pulumi.Input[str] rego: Rego code for the policy.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] tags: Tags to associate with the resource.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _PolicyState.__new__(_PolicyState)

        __props__.__dict__["description"] = description
        __props__.__dict__["git_base_branch"] = git_base_branch
        __props__.__dict__["git_branch"] = git_branch
        __props__.__dict__["git_commit_msg"] = git_commit_msg
        __props__.__dict__["git_commit_sha"] = git_commit_sha
        __props__.__dict__["git_connector_ref"] = git_connector_ref
        __props__.__dict__["git_file_id"] = git_file_id
        __props__.__dict__["git_import"] = git_import
        __props__.__dict__["git_is_new_branch"] = git_is_new_branch
        __props__.__dict__["git_path"] = git_path
        __props__.__dict__["git_repo"] = git_repo
        __props__.__dict__["identifier"] = identifier
        __props__.__dict__["name"] = name
        __props__.__dict__["org_id"] = org_id
        __props__.__dict__["project_id"] = project_id
        __props__.__dict__["rego"] = rego
        __props__.__dict__["tags"] = tags
        return Policy(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def description(self) -> pulumi.Output[Optional[str]]:
        """
        Description of the resource.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter(name="gitBaseBranch")
    def git_base_branch(self) -> pulumi.Output[Optional[str]]:
        """
        Base branch for the new git branch.
        """
        return pulumi.get(self, "git_base_branch")

    @property
    @pulumi.getter(name="gitBranch")
    def git_branch(self) -> pulumi.Output[Optional[str]]:
        """
        Git branch for the policy.
        """
        return pulumi.get(self, "git_branch")

    @property
    @pulumi.getter(name="gitCommitMsg")
    def git_commit_msg(self) -> pulumi.Output[Optional[str]]:
        """
        Git commit message for the policy.
        """
        return pulumi.get(self, "git_commit_msg")

    @property
    @pulumi.getter(name="gitCommitSha")
    def git_commit_sha(self) -> pulumi.Output[str]:
        """
        The existing commit sha of the file being updated
        """
        return pulumi.get(self, "git_commit_sha")

    @property
    @pulumi.getter(name="gitConnectorRef")
    def git_connector_ref(self) -> pulumi.Output[Optional[str]]:
        """
        Git connector reference for the policy.
        """
        return pulumi.get(self, "git_connector_ref")

    @property
    @pulumi.getter(name="gitFileId")
    def git_file_id(self) -> pulumi.Output[str]:
        """
        The existing file id of the file being updated, not required for bitbucket files
        """
        return pulumi.get(self, "git_file_id")

    @property
    @pulumi.getter(name="gitImport")
    def git_import(self) -> pulumi.Output[Optional[bool]]:
        """
        Flag to import the policy from git.
        """
        return pulumi.get(self, "git_import")

    @property
    @pulumi.getter(name="gitIsNewBranch")
    def git_is_new_branch(self) -> pulumi.Output[Optional[bool]]:
        """
        Flag to create a new branch for the policy.
        """
        return pulumi.get(self, "git_is_new_branch")

    @property
    @pulumi.getter(name="gitPath")
    def git_path(self) -> pulumi.Output[Optional[str]]:
        """
        Git path for the policy.
        """
        return pulumi.get(self, "git_path")

    @property
    @pulumi.getter(name="gitRepo")
    def git_repo(self) -> pulumi.Output[Optional[str]]:
        """
        Git repository for the policy.
        """
        return pulumi.get(self, "git_repo")

    @property
    @pulumi.getter
    def identifier(self) -> pulumi.Output[str]:
        """
        Unique identifier of the resource.
        """
        return pulumi.get(self, "identifier")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        Name of the resource.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="orgId")
    def org_id(self) -> pulumi.Output[Optional[str]]:
        """
        Unique identifier of the organization.
        """
        return pulumi.get(self, "org_id")

    @property
    @pulumi.getter(name="projectId")
    def project_id(self) -> pulumi.Output[Optional[str]]:
        """
        Unique identifier of the project.
        """
        return pulumi.get(self, "project_id")

    @property
    @pulumi.getter
    def rego(self) -> pulumi.Output[str]:
        """
        Rego code for the policy.
        """
        return pulumi.get(self, "rego")

    @property
    @pulumi.getter
    def tags(self) -> pulumi.Output[Optional[Sequence[str]]]:
        """
        Tags to associate with the resource.
        """
        return pulumi.get(self, "tags")
