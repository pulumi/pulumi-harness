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
    'GetAwsAlbResult',
    'AwaitableGetAwsAlbResult',
    'get_aws_alb',
    'get_aws_alb_output',
]

@pulumi.output_type
class GetAwsAlbResult:
    """
    A collection of values returned by getAwsAlb.
    """
    def __init__(__self__, alb_arn=None, certificate_id=None, cloud_connector_id=None, delete_cloud_resources_on_destroy=None, host_name=None, id=None, identifier=None, name=None, region=None, route53_hosted_zone_id=None, security_groups=None, vpc=None):
        if alb_arn and not isinstance(alb_arn, str):
            raise TypeError("Expected argument 'alb_arn' to be a str")
        pulumi.set(__self__, "alb_arn", alb_arn)
        if certificate_id and not isinstance(certificate_id, str):
            raise TypeError("Expected argument 'certificate_id' to be a str")
        pulumi.set(__self__, "certificate_id", certificate_id)
        if cloud_connector_id and not isinstance(cloud_connector_id, str):
            raise TypeError("Expected argument 'cloud_connector_id' to be a str")
        pulumi.set(__self__, "cloud_connector_id", cloud_connector_id)
        if delete_cloud_resources_on_destroy and not isinstance(delete_cloud_resources_on_destroy, bool):
            raise TypeError("Expected argument 'delete_cloud_resources_on_destroy' to be a bool")
        pulumi.set(__self__, "delete_cloud_resources_on_destroy", delete_cloud_resources_on_destroy)
        if host_name and not isinstance(host_name, str):
            raise TypeError("Expected argument 'host_name' to be a str")
        pulumi.set(__self__, "host_name", host_name)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if identifier and not isinstance(identifier, str):
            raise TypeError("Expected argument 'identifier' to be a str")
        pulumi.set(__self__, "identifier", identifier)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if region and not isinstance(region, str):
            raise TypeError("Expected argument 'region' to be a str")
        pulumi.set(__self__, "region", region)
        if route53_hosted_zone_id and not isinstance(route53_hosted_zone_id, str):
            raise TypeError("Expected argument 'route53_hosted_zone_id' to be a str")
        pulumi.set(__self__, "route53_hosted_zone_id", route53_hosted_zone_id)
        if security_groups and not isinstance(security_groups, list):
            raise TypeError("Expected argument 'security_groups' to be a list")
        pulumi.set(__self__, "security_groups", security_groups)
        if vpc and not isinstance(vpc, str):
            raise TypeError("Expected argument 'vpc' to be a str")
        pulumi.set(__self__, "vpc", vpc)

    @property
    @pulumi.getter(name="albArn")
    def alb_arn(self) -> Optional[str]:
        """
        Arn of AWS ALB to be imported. Required only for importing existing ALB
        """
        return pulumi.get(self, "alb_arn")

    @property
    @pulumi.getter(name="certificateId")
    def certificate_id(self) -> Optional[str]:
        return pulumi.get(self, "certificate_id")

    @property
    @pulumi.getter(name="cloudConnectorId")
    def cloud_connector_id(self) -> str:
        """
        Id of the cloud connector
        """
        return pulumi.get(self, "cloud_connector_id")

    @property
    @pulumi.getter(name="deleteCloudResourcesOnDestroy")
    def delete_cloud_resources_on_destroy(self) -> bool:
        return pulumi.get(self, "delete_cloud_resources_on_destroy")

    @property
    @pulumi.getter(name="hostName")
    def host_name(self) -> str:
        """
        Hostname for the proxy
        """
        return pulumi.get(self, "host_name")

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
        Unique identifier of the resource
        """
        return pulumi.get(self, "identifier")

    @property
    @pulumi.getter
    def name(self) -> str:
        """
        Name of the proxy
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def region(self) -> str:
        """
        Region in which cloud resources are hosted
        """
        return pulumi.get(self, "region")

    @property
    @pulumi.getter(name="route53HostedZoneId")
    def route53_hosted_zone_id(self) -> Optional[str]:
        """
        Route 53 hosted zone id
        """
        return pulumi.get(self, "route53_hosted_zone_id")

    @property
    @pulumi.getter(name="securityGroups")
    def security_groups(self) -> Optional[Sequence[str]]:
        """
        Security Group to define the security rules that determine the inbound and outbound traffic
        """
        return pulumi.get(self, "security_groups")

    @property
    @pulumi.getter
    def vpc(self) -> str:
        """
        VPC in which cloud resources are hosted
        """
        return pulumi.get(self, "vpc")


class AwaitableGetAwsAlbResult(GetAwsAlbResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetAwsAlbResult(
            alb_arn=self.alb_arn,
            certificate_id=self.certificate_id,
            cloud_connector_id=self.cloud_connector_id,
            delete_cloud_resources_on_destroy=self.delete_cloud_resources_on_destroy,
            host_name=self.host_name,
            id=self.id,
            identifier=self.identifier,
            name=self.name,
            region=self.region,
            route53_hosted_zone_id=self.route53_hosted_zone_id,
            security_groups=self.security_groups,
            vpc=self.vpc)


def get_aws_alb(alb_arn: Optional[str] = None,
                certificate_id: Optional[str] = None,
                cloud_connector_id: Optional[str] = None,
                delete_cloud_resources_on_destroy: Optional[bool] = None,
                host_name: Optional[str] = None,
                name: Optional[str] = None,
                region: Optional[str] = None,
                route53_hosted_zone_id: Optional[str] = None,
                security_groups: Optional[Sequence[str]] = None,
                vpc: Optional[str] = None,
                opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetAwsAlbResult:
    """
    Data source for AWS Autostopping proxy


    :param str alb_arn: Arn of AWS ALB to be imported. Required only for importing existing ALB
    :param str cloud_connector_id: Id of the cloud connector
    :param str host_name: Hostname for the proxy
    :param str name: Name of the proxy
    :param str region: Region in which cloud resources are hosted
    :param str route53_hosted_zone_id: Route 53 hosted zone id
    :param Sequence[str] security_groups: Security Group to define the security rules that determine the inbound and outbound traffic
    :param str vpc: VPC in which cloud resources are hosted
    """
    __args__ = dict()
    __args__['albArn'] = alb_arn
    __args__['certificateId'] = certificate_id
    __args__['cloudConnectorId'] = cloud_connector_id
    __args__['deleteCloudResourcesOnDestroy'] = delete_cloud_resources_on_destroy
    __args__['hostName'] = host_name
    __args__['name'] = name
    __args__['region'] = region
    __args__['route53HostedZoneId'] = route53_hosted_zone_id
    __args__['securityGroups'] = security_groups
    __args__['vpc'] = vpc
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('harness:autostopping/getAwsAlb:getAwsAlb', __args__, opts=opts, typ=GetAwsAlbResult).value

    return AwaitableGetAwsAlbResult(
        alb_arn=pulumi.get(__ret__, 'alb_arn'),
        certificate_id=pulumi.get(__ret__, 'certificate_id'),
        cloud_connector_id=pulumi.get(__ret__, 'cloud_connector_id'),
        delete_cloud_resources_on_destroy=pulumi.get(__ret__, 'delete_cloud_resources_on_destroy'),
        host_name=pulumi.get(__ret__, 'host_name'),
        id=pulumi.get(__ret__, 'id'),
        identifier=pulumi.get(__ret__, 'identifier'),
        name=pulumi.get(__ret__, 'name'),
        region=pulumi.get(__ret__, 'region'),
        route53_hosted_zone_id=pulumi.get(__ret__, 'route53_hosted_zone_id'),
        security_groups=pulumi.get(__ret__, 'security_groups'),
        vpc=pulumi.get(__ret__, 'vpc'))


@_utilities.lift_output_func(get_aws_alb)
def get_aws_alb_output(alb_arn: Optional[pulumi.Input[Optional[str]]] = None,
                       certificate_id: Optional[pulumi.Input[Optional[str]]] = None,
                       cloud_connector_id: Optional[pulumi.Input[str]] = None,
                       delete_cloud_resources_on_destroy: Optional[pulumi.Input[bool]] = None,
                       host_name: Optional[pulumi.Input[str]] = None,
                       name: Optional[pulumi.Input[str]] = None,
                       region: Optional[pulumi.Input[str]] = None,
                       route53_hosted_zone_id: Optional[pulumi.Input[Optional[str]]] = None,
                       security_groups: Optional[pulumi.Input[Optional[Sequence[str]]]] = None,
                       vpc: Optional[pulumi.Input[str]] = None,
                       opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetAwsAlbResult]:
    """
    Data source for AWS Autostopping proxy


    :param str alb_arn: Arn of AWS ALB to be imported. Required only for importing existing ALB
    :param str cloud_connector_id: Id of the cloud connector
    :param str host_name: Hostname for the proxy
    :param str name: Name of the proxy
    :param str region: Region in which cloud resources are hosted
    :param str route53_hosted_zone_id: Route 53 hosted zone id
    :param Sequence[str] security_groups: Security Group to define the security rules that determine the inbound and outbound traffic
    :param str vpc: VPC in which cloud resources are hosted
    """
    ...