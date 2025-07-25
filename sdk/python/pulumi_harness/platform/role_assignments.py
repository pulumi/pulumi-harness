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

__all__ = ['RoleAssignmentsArgs', 'RoleAssignments']

@pulumi.input_type
class RoleAssignmentsArgs:
    def __init__(__self__, *,
                 principals: pulumi.Input[Sequence[pulumi.Input['RoleAssignmentsPrincipalArgs']]],
                 resource_group_identifier: pulumi.Input[_builtins.str],
                 role_identifier: pulumi.Input[_builtins.str],
                 disabled: Optional[pulumi.Input[_builtins.bool]] = None,
                 identifier: Optional[pulumi.Input[_builtins.str]] = None,
                 managed: Optional[pulumi.Input[_builtins.bool]] = None,
                 org_id: Optional[pulumi.Input[_builtins.str]] = None,
                 project_id: Optional[pulumi.Input[_builtins.str]] = None):
        """
        The set of arguments for constructing a RoleAssignments resource.
        :param pulumi.Input[Sequence[pulumi.Input['RoleAssignmentsPrincipalArgs']]] principals: Principal.
        :param pulumi.Input[_builtins.str] resource_group_identifier: Resource group identifier.
        :param pulumi.Input[_builtins.str] role_identifier: Role identifier.
        :param pulumi.Input[_builtins.bool] disabled: The `disabled` attribute in the role assignment resource controls the status of the role assignment. Setting `disabled` to `false` activates the role and its permissions, enabling the assigned entity to perform allowed actions. Conversely, setting `disabled` to `true` deactivates the role, revoking the entity's permissions and action capabilities. Default value should be `false`.
        :param pulumi.Input[_builtins.str] identifier: Identifier for role assignment.
        :param pulumi.Input[_builtins.bool] managed: Specifies whether the role assignment is managed by Harness. Setting managed to `true` means that Harness will manage the lifecycle of the role assignment, including its creation, updates, and deletion. Conversely, setting it to `false` indicates that the role assignment is not managed by Harness, and thus Harness will not perform actions on it. Default value should be `false`.
        :param pulumi.Input[_builtins.str] org_id: Org identifier.
        :param pulumi.Input[_builtins.str] project_id: Project Identifier
        """
        pulumi.set(__self__, "principals", principals)
        pulumi.set(__self__, "resource_group_identifier", resource_group_identifier)
        pulumi.set(__self__, "role_identifier", role_identifier)
        if disabled is not None:
            pulumi.set(__self__, "disabled", disabled)
        if identifier is not None:
            pulumi.set(__self__, "identifier", identifier)
        if managed is not None:
            pulumi.set(__self__, "managed", managed)
        if org_id is not None:
            pulumi.set(__self__, "org_id", org_id)
        if project_id is not None:
            pulumi.set(__self__, "project_id", project_id)

    @_builtins.property
    @pulumi.getter
    def principals(self) -> pulumi.Input[Sequence[pulumi.Input['RoleAssignmentsPrincipalArgs']]]:
        """
        Principal.
        """
        return pulumi.get(self, "principals")

    @principals.setter
    def principals(self, value: pulumi.Input[Sequence[pulumi.Input['RoleAssignmentsPrincipalArgs']]]):
        pulumi.set(self, "principals", value)

    @_builtins.property
    @pulumi.getter(name="resourceGroupIdentifier")
    def resource_group_identifier(self) -> pulumi.Input[_builtins.str]:
        """
        Resource group identifier.
        """
        return pulumi.get(self, "resource_group_identifier")

    @resource_group_identifier.setter
    def resource_group_identifier(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "resource_group_identifier", value)

    @_builtins.property
    @pulumi.getter(name="roleIdentifier")
    def role_identifier(self) -> pulumi.Input[_builtins.str]:
        """
        Role identifier.
        """
        return pulumi.get(self, "role_identifier")

    @role_identifier.setter
    def role_identifier(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "role_identifier", value)

    @_builtins.property
    @pulumi.getter
    def disabled(self) -> Optional[pulumi.Input[_builtins.bool]]:
        """
        The `disabled` attribute in the role assignment resource controls the status of the role assignment. Setting `disabled` to `false` activates the role and its permissions, enabling the assigned entity to perform allowed actions. Conversely, setting `disabled` to `true` deactivates the role, revoking the entity's permissions and action capabilities. Default value should be `false`.
        """
        return pulumi.get(self, "disabled")

    @disabled.setter
    def disabled(self, value: Optional[pulumi.Input[_builtins.bool]]):
        pulumi.set(self, "disabled", value)

    @_builtins.property
    @pulumi.getter
    def identifier(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Identifier for role assignment.
        """
        return pulumi.get(self, "identifier")

    @identifier.setter
    def identifier(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "identifier", value)

    @_builtins.property
    @pulumi.getter
    def managed(self) -> Optional[pulumi.Input[_builtins.bool]]:
        """
        Specifies whether the role assignment is managed by Harness. Setting managed to `true` means that Harness will manage the lifecycle of the role assignment, including its creation, updates, and deletion. Conversely, setting it to `false` indicates that the role assignment is not managed by Harness, and thus Harness will not perform actions on it. Default value should be `false`.
        """
        return pulumi.get(self, "managed")

    @managed.setter
    def managed(self, value: Optional[pulumi.Input[_builtins.bool]]):
        pulumi.set(self, "managed", value)

    @_builtins.property
    @pulumi.getter(name="orgId")
    def org_id(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Org identifier.
        """
        return pulumi.get(self, "org_id")

    @org_id.setter
    def org_id(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "org_id", value)

    @_builtins.property
    @pulumi.getter(name="projectId")
    def project_id(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Project Identifier
        """
        return pulumi.get(self, "project_id")

    @project_id.setter
    def project_id(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "project_id", value)


@pulumi.input_type
class _RoleAssignmentsState:
    def __init__(__self__, *,
                 disabled: Optional[pulumi.Input[_builtins.bool]] = None,
                 identifier: Optional[pulumi.Input[_builtins.str]] = None,
                 managed: Optional[pulumi.Input[_builtins.bool]] = None,
                 org_id: Optional[pulumi.Input[_builtins.str]] = None,
                 principals: Optional[pulumi.Input[Sequence[pulumi.Input['RoleAssignmentsPrincipalArgs']]]] = None,
                 project_id: Optional[pulumi.Input[_builtins.str]] = None,
                 resource_group_identifier: Optional[pulumi.Input[_builtins.str]] = None,
                 role_identifier: Optional[pulumi.Input[_builtins.str]] = None):
        """
        Input properties used for looking up and filtering RoleAssignments resources.
        :param pulumi.Input[_builtins.bool] disabled: The `disabled` attribute in the role assignment resource controls the status of the role assignment. Setting `disabled` to `false` activates the role and its permissions, enabling the assigned entity to perform allowed actions. Conversely, setting `disabled` to `true` deactivates the role, revoking the entity's permissions and action capabilities. Default value should be `false`.
        :param pulumi.Input[_builtins.str] identifier: Identifier for role assignment.
        :param pulumi.Input[_builtins.bool] managed: Specifies whether the role assignment is managed by Harness. Setting managed to `true` means that Harness will manage the lifecycle of the role assignment, including its creation, updates, and deletion. Conversely, setting it to `false` indicates that the role assignment is not managed by Harness, and thus Harness will not perform actions on it. Default value should be `false`.
        :param pulumi.Input[_builtins.str] org_id: Org identifier.
        :param pulumi.Input[Sequence[pulumi.Input['RoleAssignmentsPrincipalArgs']]] principals: Principal.
        :param pulumi.Input[_builtins.str] project_id: Project Identifier
        :param pulumi.Input[_builtins.str] resource_group_identifier: Resource group identifier.
        :param pulumi.Input[_builtins.str] role_identifier: Role identifier.
        """
        if disabled is not None:
            pulumi.set(__self__, "disabled", disabled)
        if identifier is not None:
            pulumi.set(__self__, "identifier", identifier)
        if managed is not None:
            pulumi.set(__self__, "managed", managed)
        if org_id is not None:
            pulumi.set(__self__, "org_id", org_id)
        if principals is not None:
            pulumi.set(__self__, "principals", principals)
        if project_id is not None:
            pulumi.set(__self__, "project_id", project_id)
        if resource_group_identifier is not None:
            pulumi.set(__self__, "resource_group_identifier", resource_group_identifier)
        if role_identifier is not None:
            pulumi.set(__self__, "role_identifier", role_identifier)

    @_builtins.property
    @pulumi.getter
    def disabled(self) -> Optional[pulumi.Input[_builtins.bool]]:
        """
        The `disabled` attribute in the role assignment resource controls the status of the role assignment. Setting `disabled` to `false` activates the role and its permissions, enabling the assigned entity to perform allowed actions. Conversely, setting `disabled` to `true` deactivates the role, revoking the entity's permissions and action capabilities. Default value should be `false`.
        """
        return pulumi.get(self, "disabled")

    @disabled.setter
    def disabled(self, value: Optional[pulumi.Input[_builtins.bool]]):
        pulumi.set(self, "disabled", value)

    @_builtins.property
    @pulumi.getter
    def identifier(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Identifier for role assignment.
        """
        return pulumi.get(self, "identifier")

    @identifier.setter
    def identifier(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "identifier", value)

    @_builtins.property
    @pulumi.getter
    def managed(self) -> Optional[pulumi.Input[_builtins.bool]]:
        """
        Specifies whether the role assignment is managed by Harness. Setting managed to `true` means that Harness will manage the lifecycle of the role assignment, including its creation, updates, and deletion. Conversely, setting it to `false` indicates that the role assignment is not managed by Harness, and thus Harness will not perform actions on it. Default value should be `false`.
        """
        return pulumi.get(self, "managed")

    @managed.setter
    def managed(self, value: Optional[pulumi.Input[_builtins.bool]]):
        pulumi.set(self, "managed", value)

    @_builtins.property
    @pulumi.getter(name="orgId")
    def org_id(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Org identifier.
        """
        return pulumi.get(self, "org_id")

    @org_id.setter
    def org_id(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "org_id", value)

    @_builtins.property
    @pulumi.getter
    def principals(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['RoleAssignmentsPrincipalArgs']]]]:
        """
        Principal.
        """
        return pulumi.get(self, "principals")

    @principals.setter
    def principals(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['RoleAssignmentsPrincipalArgs']]]]):
        pulumi.set(self, "principals", value)

    @_builtins.property
    @pulumi.getter(name="projectId")
    def project_id(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Project Identifier
        """
        return pulumi.get(self, "project_id")

    @project_id.setter
    def project_id(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "project_id", value)

    @_builtins.property
    @pulumi.getter(name="resourceGroupIdentifier")
    def resource_group_identifier(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Resource group identifier.
        """
        return pulumi.get(self, "resource_group_identifier")

    @resource_group_identifier.setter
    def resource_group_identifier(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "resource_group_identifier", value)

    @_builtins.property
    @pulumi.getter(name="roleIdentifier")
    def role_identifier(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Role identifier.
        """
        return pulumi.get(self, "role_identifier")

    @role_identifier.setter
    def role_identifier(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "role_identifier", value)


@pulumi.type_token("harness:platform/roleAssignments:RoleAssignments")
class RoleAssignments(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 disabled: Optional[pulumi.Input[_builtins.bool]] = None,
                 identifier: Optional[pulumi.Input[_builtins.str]] = None,
                 managed: Optional[pulumi.Input[_builtins.bool]] = None,
                 org_id: Optional[pulumi.Input[_builtins.str]] = None,
                 principals: Optional[pulumi.Input[Sequence[pulumi.Input[Union['RoleAssignmentsPrincipalArgs', 'RoleAssignmentsPrincipalArgsDict']]]]] = None,
                 project_id: Optional[pulumi.Input[_builtins.str]] = None,
                 resource_group_identifier: Optional[pulumi.Input[_builtins.str]] = None,
                 role_identifier: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        """
        ## Example Usage

        ## Import

        Import account level role assignments

        ```sh
        $ pulumi import harness:platform/roleAssignments:RoleAssignments example <role_assignments_id>
        ```

        Import org level role assignments

        ```sh
        $ pulumi import harness:platform/roleAssignments:RoleAssignments example <ord_id>/<role_assignments_id>
        ```

        Import project level role assignments

        ```sh
        $ pulumi import harness:platform/roleAssignments:RoleAssignments example <org_id>/<project_id>/<role_assignments_id>
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.bool] disabled: The `disabled` attribute in the role assignment resource controls the status of the role assignment. Setting `disabled` to `false` activates the role and its permissions, enabling the assigned entity to perform allowed actions. Conversely, setting `disabled` to `true` deactivates the role, revoking the entity's permissions and action capabilities. Default value should be `false`.
        :param pulumi.Input[_builtins.str] identifier: Identifier for role assignment.
        :param pulumi.Input[_builtins.bool] managed: Specifies whether the role assignment is managed by Harness. Setting managed to `true` means that Harness will manage the lifecycle of the role assignment, including its creation, updates, and deletion. Conversely, setting it to `false` indicates that the role assignment is not managed by Harness, and thus Harness will not perform actions on it. Default value should be `false`.
        :param pulumi.Input[_builtins.str] org_id: Org identifier.
        :param pulumi.Input[Sequence[pulumi.Input[Union['RoleAssignmentsPrincipalArgs', 'RoleAssignmentsPrincipalArgsDict']]]] principals: Principal.
        :param pulumi.Input[_builtins.str] project_id: Project Identifier
        :param pulumi.Input[_builtins.str] resource_group_identifier: Resource group identifier.
        :param pulumi.Input[_builtins.str] role_identifier: Role identifier.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: RoleAssignmentsArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        ## Example Usage

        ## Import

        Import account level role assignments

        ```sh
        $ pulumi import harness:platform/roleAssignments:RoleAssignments example <role_assignments_id>
        ```

        Import org level role assignments

        ```sh
        $ pulumi import harness:platform/roleAssignments:RoleAssignments example <ord_id>/<role_assignments_id>
        ```

        Import project level role assignments

        ```sh
        $ pulumi import harness:platform/roleAssignments:RoleAssignments example <org_id>/<project_id>/<role_assignments_id>
        ```

        :param str resource_name: The name of the resource.
        :param RoleAssignmentsArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(RoleAssignmentsArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 disabled: Optional[pulumi.Input[_builtins.bool]] = None,
                 identifier: Optional[pulumi.Input[_builtins.str]] = None,
                 managed: Optional[pulumi.Input[_builtins.bool]] = None,
                 org_id: Optional[pulumi.Input[_builtins.str]] = None,
                 principals: Optional[pulumi.Input[Sequence[pulumi.Input[Union['RoleAssignmentsPrincipalArgs', 'RoleAssignmentsPrincipalArgsDict']]]]] = None,
                 project_id: Optional[pulumi.Input[_builtins.str]] = None,
                 resource_group_identifier: Optional[pulumi.Input[_builtins.str]] = None,
                 role_identifier: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = RoleAssignmentsArgs.__new__(RoleAssignmentsArgs)

            __props__.__dict__["disabled"] = disabled
            __props__.__dict__["identifier"] = identifier
            __props__.__dict__["managed"] = managed
            __props__.__dict__["org_id"] = org_id
            if principals is None and not opts.urn:
                raise TypeError("Missing required property 'principals'")
            __props__.__dict__["principals"] = principals
            __props__.__dict__["project_id"] = project_id
            if resource_group_identifier is None and not opts.urn:
                raise TypeError("Missing required property 'resource_group_identifier'")
            __props__.__dict__["resource_group_identifier"] = resource_group_identifier
            if role_identifier is None and not opts.urn:
                raise TypeError("Missing required property 'role_identifier'")
            __props__.__dict__["role_identifier"] = role_identifier
        super(RoleAssignments, __self__).__init__(
            'harness:platform/roleAssignments:RoleAssignments',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            disabled: Optional[pulumi.Input[_builtins.bool]] = None,
            identifier: Optional[pulumi.Input[_builtins.str]] = None,
            managed: Optional[pulumi.Input[_builtins.bool]] = None,
            org_id: Optional[pulumi.Input[_builtins.str]] = None,
            principals: Optional[pulumi.Input[Sequence[pulumi.Input[Union['RoleAssignmentsPrincipalArgs', 'RoleAssignmentsPrincipalArgsDict']]]]] = None,
            project_id: Optional[pulumi.Input[_builtins.str]] = None,
            resource_group_identifier: Optional[pulumi.Input[_builtins.str]] = None,
            role_identifier: Optional[pulumi.Input[_builtins.str]] = None) -> 'RoleAssignments':
        """
        Get an existing RoleAssignments resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.bool] disabled: The `disabled` attribute in the role assignment resource controls the status of the role assignment. Setting `disabled` to `false` activates the role and its permissions, enabling the assigned entity to perform allowed actions. Conversely, setting `disabled` to `true` deactivates the role, revoking the entity's permissions and action capabilities. Default value should be `false`.
        :param pulumi.Input[_builtins.str] identifier: Identifier for role assignment.
        :param pulumi.Input[_builtins.bool] managed: Specifies whether the role assignment is managed by Harness. Setting managed to `true` means that Harness will manage the lifecycle of the role assignment, including its creation, updates, and deletion. Conversely, setting it to `false` indicates that the role assignment is not managed by Harness, and thus Harness will not perform actions on it. Default value should be `false`.
        :param pulumi.Input[_builtins.str] org_id: Org identifier.
        :param pulumi.Input[Sequence[pulumi.Input[Union['RoleAssignmentsPrincipalArgs', 'RoleAssignmentsPrincipalArgsDict']]]] principals: Principal.
        :param pulumi.Input[_builtins.str] project_id: Project Identifier
        :param pulumi.Input[_builtins.str] resource_group_identifier: Resource group identifier.
        :param pulumi.Input[_builtins.str] role_identifier: Role identifier.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _RoleAssignmentsState.__new__(_RoleAssignmentsState)

        __props__.__dict__["disabled"] = disabled
        __props__.__dict__["identifier"] = identifier
        __props__.__dict__["managed"] = managed
        __props__.__dict__["org_id"] = org_id
        __props__.__dict__["principals"] = principals
        __props__.__dict__["project_id"] = project_id
        __props__.__dict__["resource_group_identifier"] = resource_group_identifier
        __props__.__dict__["role_identifier"] = role_identifier
        return RoleAssignments(resource_name, opts=opts, __props__=__props__)

    @_builtins.property
    @pulumi.getter
    def disabled(self) -> pulumi.Output[Optional[_builtins.bool]]:
        """
        The `disabled` attribute in the role assignment resource controls the status of the role assignment. Setting `disabled` to `false` activates the role and its permissions, enabling the assigned entity to perform allowed actions. Conversely, setting `disabled` to `true` deactivates the role, revoking the entity's permissions and action capabilities. Default value should be `false`.
        """
        return pulumi.get(self, "disabled")

    @_builtins.property
    @pulumi.getter
    def identifier(self) -> pulumi.Output[_builtins.str]:
        """
        Identifier for role assignment.
        """
        return pulumi.get(self, "identifier")

    @_builtins.property
    @pulumi.getter
    def managed(self) -> pulumi.Output[Optional[_builtins.bool]]:
        """
        Specifies whether the role assignment is managed by Harness. Setting managed to `true` means that Harness will manage the lifecycle of the role assignment, including its creation, updates, and deletion. Conversely, setting it to `false` indicates that the role assignment is not managed by Harness, and thus Harness will not perform actions on it. Default value should be `false`.
        """
        return pulumi.get(self, "managed")

    @_builtins.property
    @pulumi.getter(name="orgId")
    def org_id(self) -> pulumi.Output[Optional[_builtins.str]]:
        """
        Org identifier.
        """
        return pulumi.get(self, "org_id")

    @_builtins.property
    @pulumi.getter
    def principals(self) -> pulumi.Output[Sequence['outputs.RoleAssignmentsPrincipal']]:
        """
        Principal.
        """
        return pulumi.get(self, "principals")

    @_builtins.property
    @pulumi.getter(name="projectId")
    def project_id(self) -> pulumi.Output[Optional[_builtins.str]]:
        """
        Project Identifier
        """
        return pulumi.get(self, "project_id")

    @_builtins.property
    @pulumi.getter(name="resourceGroupIdentifier")
    def resource_group_identifier(self) -> pulumi.Output[_builtins.str]:
        """
        Resource group identifier.
        """
        return pulumi.get(self, "resource_group_identifier")

    @_builtins.property
    @pulumi.getter(name="roleIdentifier")
    def role_identifier(self) -> pulumi.Output[_builtins.str]:
        """
        Role identifier.
        """
        return pulumi.get(self, "role_identifier")

