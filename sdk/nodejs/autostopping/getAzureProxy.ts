// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * Data source for Azure Autostopping proxy
 */
export function getAzureProxy(args: GetAzureProxyArgs, opts?: pulumi.InvokeOptions): Promise<GetAzureProxyResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("harness:autostopping/getAzureProxy:getAzureProxy", {
        "allocateStaticIp": args.allocateStaticIp,
        "apiKey": args.apiKey,
        "certificateId": args.certificateId,
        "certificates": args.certificates,
        "cloudConnectorId": args.cloudConnectorId,
        "deleteCloudResourcesOnDestroy": args.deleteCloudResourcesOnDestroy,
        "hostName": args.hostName,
        "keypair": args.keypair,
        "machineType": args.machineType,
        "name": args.name,
        "region": args.region,
        "resourceGroup": args.resourceGroup,
        "securityGroups": args.securityGroups,
        "subnetId": args.subnetId,
        "vpc": args.vpc,
    }, opts);
}

/**
 * A collection of arguments for invoking getAzureProxy.
 */
export interface GetAzureProxyArgs {
    /**
     * Boolean value to indicate if proxy vm needs to have static IP
     */
    allocateStaticIp?: boolean;
    /**
     * Harness NG API key
     */
    apiKey: string;
    certificateId?: string;
    certificates?: inputs.autostopping.GetAzureProxyCertificates;
    /**
     * Id of the cloud connector
     */
    cloudConnectorId: string;
    deleteCloudResourcesOnDestroy: boolean;
    /**
     * Hostname for the proxy
     */
    hostName: string;
    /**
     * Name of SSH Key to be used for proxy VM
     */
    keypair: string;
    /**
     * Type of instance to be used for proxy
     */
    machineType: string;
    /**
     * Name of the proxy
     */
    name: string;
    /**
     * Region in which cloud resources are hosted
     */
    region: string;
    /**
     * Resource group in which cloud resources are hosted
     */
    resourceGroup: string;
    /**
     * Security Group to define the security rules that determine the inbound and outbound traffic
     */
    securityGroups?: string[];
    /**
     * Subnet in which cloud resources are hosted
     */
    subnetId: string;
    /**
     * VPC in which cloud resources are hosted
     */
    vpc: string;
}

/**
 * A collection of values returned by getAzureProxy.
 */
export interface GetAzureProxyResult {
    /**
     * Boolean value to indicate if proxy vm needs to have static IP
     */
    readonly allocateStaticIp?: boolean;
    /**
     * Harness NG API key
     */
    readonly apiKey: string;
    readonly certificateId?: string;
    readonly certificates?: outputs.autostopping.GetAzureProxyCertificates;
    /**
     * Id of the cloud connector
     */
    readonly cloudConnectorId: string;
    readonly deleteCloudResourcesOnDestroy: boolean;
    /**
     * Hostname for the proxy
     */
    readonly hostName: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * Unique identifier of the resource
     */
    readonly identifier: string;
    /**
     * Name of SSH Key to be used for proxy VM
     */
    readonly keypair: string;
    /**
     * Type of instance to be used for proxy
     */
    readonly machineType: string;
    /**
     * Name of the proxy
     */
    readonly name: string;
    /**
     * Region in which cloud resources are hosted
     */
    readonly region: string;
    /**
     * Resource group in which cloud resources are hosted
     */
    readonly resourceGroup: string;
    /**
     * Security Group to define the security rules that determine the inbound and outbound traffic
     */
    readonly securityGroups?: string[];
    /**
     * Subnet in which cloud resources are hosted
     */
    readonly subnetId: string;
    /**
     * VPC in which cloud resources are hosted
     */
    readonly vpc: string;
}
/**
 * Data source for Azure Autostopping proxy
 */
export function getAzureProxyOutput(args: GetAzureProxyOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetAzureProxyResult> {
    return pulumi.output(args).apply((a: any) => getAzureProxy(a, opts))
}

/**
 * A collection of arguments for invoking getAzureProxy.
 */
export interface GetAzureProxyOutputArgs {
    /**
     * Boolean value to indicate if proxy vm needs to have static IP
     */
    allocateStaticIp?: pulumi.Input<boolean>;
    /**
     * Harness NG API key
     */
    apiKey: pulumi.Input<string>;
    certificateId?: pulumi.Input<string>;
    certificates?: pulumi.Input<inputs.autostopping.GetAzureProxyCertificatesArgs>;
    /**
     * Id of the cloud connector
     */
    cloudConnectorId: pulumi.Input<string>;
    deleteCloudResourcesOnDestroy: pulumi.Input<boolean>;
    /**
     * Hostname for the proxy
     */
    hostName: pulumi.Input<string>;
    /**
     * Name of SSH Key to be used for proxy VM
     */
    keypair: pulumi.Input<string>;
    /**
     * Type of instance to be used for proxy
     */
    machineType: pulumi.Input<string>;
    /**
     * Name of the proxy
     */
    name: pulumi.Input<string>;
    /**
     * Region in which cloud resources are hosted
     */
    region: pulumi.Input<string>;
    /**
     * Resource group in which cloud resources are hosted
     */
    resourceGroup: pulumi.Input<string>;
    /**
     * Security Group to define the security rules that determine the inbound and outbound traffic
     */
    securityGroups?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Subnet in which cloud resources are hosted
     */
    subnetId: pulumi.Input<string>;
    /**
     * VPC in which cloud resources are hosted
     */
    vpc: pulumi.Input<string>;
}