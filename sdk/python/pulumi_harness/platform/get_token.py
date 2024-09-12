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
    'GetTokenResult',
    'AwaitableGetTokenResult',
    'get_token',
    'get_token_output',
]

@pulumi.output_type
class GetTokenResult:
    """
    A collection of values returned by getToken.
    """
    def __init__(__self__, account_id=None, apikey_id=None, apikey_type=None, description=None, email=None, encoded_password=None, id=None, identifier=None, name=None, org_id=None, parent_id=None, project_id=None, scheduled_expire_time=None, tags=None, username=None, valid=None, valid_from=None, valid_to=None):
        if account_id and not isinstance(account_id, str):
            raise TypeError("Expected argument 'account_id' to be a str")
        pulumi.set(__self__, "account_id", account_id)
        if apikey_id and not isinstance(apikey_id, str):
            raise TypeError("Expected argument 'apikey_id' to be a str")
        pulumi.set(__self__, "apikey_id", apikey_id)
        if apikey_type and not isinstance(apikey_type, str):
            raise TypeError("Expected argument 'apikey_type' to be a str")
        pulumi.set(__self__, "apikey_type", apikey_type)
        if description and not isinstance(description, str):
            raise TypeError("Expected argument 'description' to be a str")
        pulumi.set(__self__, "description", description)
        if email and not isinstance(email, str):
            raise TypeError("Expected argument 'email' to be a str")
        pulumi.set(__self__, "email", email)
        if encoded_password and not isinstance(encoded_password, str):
            raise TypeError("Expected argument 'encoded_password' to be a str")
        pulumi.set(__self__, "encoded_password", encoded_password)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if identifier and not isinstance(identifier, str):
            raise TypeError("Expected argument 'identifier' to be a str")
        pulumi.set(__self__, "identifier", identifier)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if org_id and not isinstance(org_id, str):
            raise TypeError("Expected argument 'org_id' to be a str")
        pulumi.set(__self__, "org_id", org_id)
        if parent_id and not isinstance(parent_id, str):
            raise TypeError("Expected argument 'parent_id' to be a str")
        pulumi.set(__self__, "parent_id", parent_id)
        if project_id and not isinstance(project_id, str):
            raise TypeError("Expected argument 'project_id' to be a str")
        pulumi.set(__self__, "project_id", project_id)
        if scheduled_expire_time and not isinstance(scheduled_expire_time, int):
            raise TypeError("Expected argument 'scheduled_expire_time' to be a int")
        pulumi.set(__self__, "scheduled_expire_time", scheduled_expire_time)
        if tags and not isinstance(tags, list):
            raise TypeError("Expected argument 'tags' to be a list")
        pulumi.set(__self__, "tags", tags)
        if username and not isinstance(username, str):
            raise TypeError("Expected argument 'username' to be a str")
        pulumi.set(__self__, "username", username)
        if valid and not isinstance(valid, bool):
            raise TypeError("Expected argument 'valid' to be a bool")
        pulumi.set(__self__, "valid", valid)
        if valid_from and not isinstance(valid_from, int):
            raise TypeError("Expected argument 'valid_from' to be a int")
        pulumi.set(__self__, "valid_from", valid_from)
        if valid_to and not isinstance(valid_to, int):
            raise TypeError("Expected argument 'valid_to' to be a int")
        pulumi.set(__self__, "valid_to", valid_to)

    @property
    @pulumi.getter(name="accountId")
    def account_id(self) -> str:
        """
        Account Identifier for the Entity
        """
        return pulumi.get(self, "account_id")

    @property
    @pulumi.getter(name="apikeyId")
    def apikey_id(self) -> str:
        """
        Identifier of the API Key
        """
        return pulumi.get(self, "apikey_id")

    @property
    @pulumi.getter(name="apikeyType")
    def apikey_type(self) -> str:
        """
        Type of the API Key
        """
        return pulumi.get(self, "apikey_type")

    @property
    @pulumi.getter
    def description(self) -> str:
        """
        Description of the resource.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter
    def email(self) -> Optional[str]:
        """
        Email Id of the user who created the Token
        """
        return pulumi.get(self, "email")

    @property
    @pulumi.getter(name="encodedPassword")
    def encoded_password(self) -> Optional[str]:
        """
        Encoded password of the Token
        """
        return pulumi.get(self, "encoded_password")

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
        Unique identifier of the resource.
        """
        return pulumi.get(self, "identifier")

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
    @pulumi.getter(name="parentId")
    def parent_id(self) -> str:
        """
        Parent Entity Identifier of the API Key
        """
        return pulumi.get(self, "parent_id")

    @property
    @pulumi.getter(name="projectId")
    def project_id(self) -> Optional[str]:
        """
        Unique identifier of the project.
        """
        return pulumi.get(self, "project_id")

    @property
    @pulumi.getter(name="scheduledExpireTime")
    def scheduled_expire_time(self) -> Optional[int]:
        """
        Scheduled expiry time in milliseconds
        """
        return pulumi.get(self, "scheduled_expire_time")

    @property
    @pulumi.getter
    def tags(self) -> Sequence[str]:
        """
        Tags to associate with the resource.
        """
        return pulumi.get(self, "tags")

    @property
    @pulumi.getter
    def username(self) -> Optional[str]:
        """
        Name of the user who created the Token
        """
        return pulumi.get(self, "username")

    @property
    @pulumi.getter
    def valid(self) -> Optional[bool]:
        """
        Boolean value to indicate if Token is valid or not.
        """
        return pulumi.get(self, "valid")

    @property
    @pulumi.getter(name="validFrom")
    def valid_from(self) -> Optional[int]:
        """
        This is the time from which the Token is valid. The time is in milliseconds
        """
        return pulumi.get(self, "valid_from")

    @property
    @pulumi.getter(name="validTo")
    def valid_to(self) -> Optional[int]:
        """
        This is the time till which the Token is valid. The time is in milliseconds
        """
        return pulumi.get(self, "valid_to")


class AwaitableGetTokenResult(GetTokenResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetTokenResult(
            account_id=self.account_id,
            apikey_id=self.apikey_id,
            apikey_type=self.apikey_type,
            description=self.description,
            email=self.email,
            encoded_password=self.encoded_password,
            id=self.id,
            identifier=self.identifier,
            name=self.name,
            org_id=self.org_id,
            parent_id=self.parent_id,
            project_id=self.project_id,
            scheduled_expire_time=self.scheduled_expire_time,
            tags=self.tags,
            username=self.username,
            valid=self.valid,
            valid_from=self.valid_from,
            valid_to=self.valid_to)


def get_token(account_id: Optional[str] = None,
              apikey_id: Optional[str] = None,
              apikey_type: Optional[str] = None,
              email: Optional[str] = None,
              encoded_password: Optional[str] = None,
              identifier: Optional[str] = None,
              name: Optional[str] = None,
              org_id: Optional[str] = None,
              parent_id: Optional[str] = None,
              project_id: Optional[str] = None,
              scheduled_expire_time: Optional[int] = None,
              username: Optional[str] = None,
              valid: Optional[bool] = None,
              valid_from: Optional[int] = None,
              valid_to: Optional[int] = None,
              opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetTokenResult:
    """
    Data source for retrieving a Harness ApiKey Token.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_harness as harness

    test = harness.platform.get_token(identifier="test_token",
        parent_id="apikey_parent_id",
        org_id="org_id",
        project_id="project_id",
        apikey_id="apikey_id",
        apikey_type="USER")
    ```


    :param str account_id: Account Identifier for the Entity
    :param str apikey_id: Identifier of the API Key
    :param str apikey_type: Type of the API Key
    :param str email: Email Id of the user who created the Token
    :param str encoded_password: Encoded password of the Token
    :param str identifier: Unique identifier of the resource.
    :param str name: Name of the resource.
    :param str org_id: Unique identifier of the organization.
    :param str parent_id: Parent Entity Identifier of the API Key
    :param str project_id: Unique identifier of the project.
    :param int scheduled_expire_time: Scheduled expiry time in milliseconds
    :param str username: Name of the user who created the Token
    :param bool valid: Boolean value to indicate if Token is valid or not.
    :param int valid_from: This is the time from which the Token is valid. The time is in milliseconds
    :param int valid_to: This is the time till which the Token is valid. The time is in milliseconds
    """
    __args__ = dict()
    __args__['accountId'] = account_id
    __args__['apikeyId'] = apikey_id
    __args__['apikeyType'] = apikey_type
    __args__['email'] = email
    __args__['encodedPassword'] = encoded_password
    __args__['identifier'] = identifier
    __args__['name'] = name
    __args__['orgId'] = org_id
    __args__['parentId'] = parent_id
    __args__['projectId'] = project_id
    __args__['scheduledExpireTime'] = scheduled_expire_time
    __args__['username'] = username
    __args__['valid'] = valid
    __args__['validFrom'] = valid_from
    __args__['validTo'] = valid_to
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('harness:platform/getToken:getToken', __args__, opts=opts, typ=GetTokenResult).value

    return AwaitableGetTokenResult(
        account_id=pulumi.get(__ret__, 'account_id'),
        apikey_id=pulumi.get(__ret__, 'apikey_id'),
        apikey_type=pulumi.get(__ret__, 'apikey_type'),
        description=pulumi.get(__ret__, 'description'),
        email=pulumi.get(__ret__, 'email'),
        encoded_password=pulumi.get(__ret__, 'encoded_password'),
        id=pulumi.get(__ret__, 'id'),
        identifier=pulumi.get(__ret__, 'identifier'),
        name=pulumi.get(__ret__, 'name'),
        org_id=pulumi.get(__ret__, 'org_id'),
        parent_id=pulumi.get(__ret__, 'parent_id'),
        project_id=pulumi.get(__ret__, 'project_id'),
        scheduled_expire_time=pulumi.get(__ret__, 'scheduled_expire_time'),
        tags=pulumi.get(__ret__, 'tags'),
        username=pulumi.get(__ret__, 'username'),
        valid=pulumi.get(__ret__, 'valid'),
        valid_from=pulumi.get(__ret__, 'valid_from'),
        valid_to=pulumi.get(__ret__, 'valid_to'))


@_utilities.lift_output_func(get_token)
def get_token_output(account_id: Optional[pulumi.Input[str]] = None,
                     apikey_id: Optional[pulumi.Input[str]] = None,
                     apikey_type: Optional[pulumi.Input[str]] = None,
                     email: Optional[pulumi.Input[Optional[str]]] = None,
                     encoded_password: Optional[pulumi.Input[Optional[str]]] = None,
                     identifier: Optional[pulumi.Input[str]] = None,
                     name: Optional[pulumi.Input[Optional[str]]] = None,
                     org_id: Optional[pulumi.Input[Optional[str]]] = None,
                     parent_id: Optional[pulumi.Input[str]] = None,
                     project_id: Optional[pulumi.Input[Optional[str]]] = None,
                     scheduled_expire_time: Optional[pulumi.Input[Optional[int]]] = None,
                     username: Optional[pulumi.Input[Optional[str]]] = None,
                     valid: Optional[pulumi.Input[Optional[bool]]] = None,
                     valid_from: Optional[pulumi.Input[Optional[int]]] = None,
                     valid_to: Optional[pulumi.Input[Optional[int]]] = None,
                     opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetTokenResult]:
    """
    Data source for retrieving a Harness ApiKey Token.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_harness as harness

    test = harness.platform.get_token(identifier="test_token",
        parent_id="apikey_parent_id",
        org_id="org_id",
        project_id="project_id",
        apikey_id="apikey_id",
        apikey_type="USER")
    ```


    :param str account_id: Account Identifier for the Entity
    :param str apikey_id: Identifier of the API Key
    :param str apikey_type: Type of the API Key
    :param str email: Email Id of the user who created the Token
    :param str encoded_password: Encoded password of the Token
    :param str identifier: Unique identifier of the resource.
    :param str name: Name of the resource.
    :param str org_id: Unique identifier of the organization.
    :param str parent_id: Parent Entity Identifier of the API Key
    :param str project_id: Unique identifier of the project.
    :param int scheduled_expire_time: Scheduled expiry time in milliseconds
    :param str username: Name of the user who created the Token
    :param bool valid: Boolean value to indicate if Token is valid or not.
    :param int valid_from: This is the time from which the Token is valid. The time is in milliseconds
    :param int valid_to: This is the time till which the Token is valid. The time is in milliseconds
    """
    ...