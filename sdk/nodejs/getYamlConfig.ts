// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Data source for retrieving a yaml config.
 */
export function getYamlConfig(args: GetYamlConfigArgs, opts?: pulumi.InvokeOptions): Promise<GetYamlConfigResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("harness:index/getYamlConfig:getYamlConfig", {
        "appId": args.appId,
        "path": args.path,
    }, opts);
}

/**
 * A collection of arguments for invoking getYamlConfig.
 */
export interface GetYamlConfigArgs {
    /**
     * Unique identifier of the application. This is not required for account level resources (i.e. cloud providers, connectors, etc.).
     */
    appId?: string;
    /**
     * Path to the yaml file.
     */
    path: string;
}

/**
 * A collection of values returned by getYamlConfig.
 */
export interface GetYamlConfigResult {
    /**
     * Unique identifier of the application. This is not required for account level resources (i.e. cloud providers, connectors, etc.).
     */
    readonly appId?: string;
    /**
     * Content of the yaml file.
     */
    readonly content: string;
    /**
     * Unique identifier of the yaml resource.
     */
    readonly id: string;
    /**
     * Name of the yaml resource.
     */
    readonly name: string;
    /**
     * Path to the yaml file.
     */
    readonly path: string;
}
/**
 * Data source for retrieving a yaml config.
 */
export function getYamlConfigOutput(args: GetYamlConfigOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetYamlConfigResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("harness:index/getYamlConfig:getYamlConfig", {
        "appId": args.appId,
        "path": args.path,
    }, opts);
}

/**
 * A collection of arguments for invoking getYamlConfig.
 */
export interface GetYamlConfigOutputArgs {
    /**
     * Unique identifier of the application. This is not required for account level resources (i.e. cloud providers, connectors, etc.).
     */
    appId?: pulumi.Input<string>;
    /**
     * Path to the yaml file.
     */
    path: pulumi.Input<string>;
}