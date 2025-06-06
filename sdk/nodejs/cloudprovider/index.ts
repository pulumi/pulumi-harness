// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

// Export members:
export { AwsArgs, AwsState } from "./aws";
export type Aws = import("./aws").Aws;
export const Aws: typeof import("./aws").Aws = null as any;
utilities.lazyLoad(exports, ["Aws"], () => require("./aws"));

export { AzureArgs, AzureState } from "./azure";
export type Azure = import("./azure").Azure;
export const Azure: typeof import("./azure").Azure = null as any;
utilities.lazyLoad(exports, ["Azure"], () => require("./azure"));

export { DatacenterArgs, DatacenterState } from "./datacenter";
export type Datacenter = import("./datacenter").Datacenter;
export const Datacenter: typeof import("./datacenter").Datacenter = null as any;
utilities.lazyLoad(exports, ["Datacenter"], () => require("./datacenter"));

export { GcpArgs, GcpState } from "./gcp";
export type Gcp = import("./gcp").Gcp;
export const Gcp: typeof import("./gcp").Gcp = null as any;
utilities.lazyLoad(exports, ["Gcp"], () => require("./gcp"));

export { GetDelegateIdsArgs, GetDelegateIdsResult, GetDelegateIdsOutputArgs } from "./getDelegateIds";
export const getDelegateIds: typeof import("./getDelegateIds").getDelegateIds = null as any;
export const getDelegateIdsOutput: typeof import("./getDelegateIds").getDelegateIdsOutput = null as any;
utilities.lazyLoad(exports, ["getDelegateIds","getDelegateIdsOutput"], () => require("./getDelegateIds"));

export { KubernetesArgs, KubernetesState } from "./kubernetes";
export type Kubernetes = import("./kubernetes").Kubernetes;
export const Kubernetes: typeof import("./kubernetes").Kubernetes = null as any;
utilities.lazyLoad(exports, ["Kubernetes"], () => require("./kubernetes"));

export { SpotArgs, SpotState } from "./spot";
export type Spot = import("./spot").Spot;
export const Spot: typeof import("./spot").Spot = null as any;
utilities.lazyLoad(exports, ["Spot"], () => require("./spot"));

export { TanzuArgs, TanzuState } from "./tanzu";
export type Tanzu = import("./tanzu").Tanzu;
export const Tanzu: typeof import("./tanzu").Tanzu = null as any;
utilities.lazyLoad(exports, ["Tanzu"], () => require("./tanzu"));


const _module = {
    version: utilities.getVersion(),
    construct: (name: string, type: string, urn: string): pulumi.Resource => {
        switch (type) {
            case "harness:cloudprovider/aws:Aws":
                return new Aws(name, <any>undefined, { urn })
            case "harness:cloudprovider/azure:Azure":
                return new Azure(name, <any>undefined, { urn })
            case "harness:cloudprovider/datacenter:Datacenter":
                return new Datacenter(name, <any>undefined, { urn })
            case "harness:cloudprovider/gcp:Gcp":
                return new Gcp(name, <any>undefined, { urn })
            case "harness:cloudprovider/kubernetes:Kubernetes":
                return new Kubernetes(name, <any>undefined, { urn })
            case "harness:cloudprovider/spot:Spot":
                return new Spot(name, <any>undefined, { urn })
            case "harness:cloudprovider/tanzu:Tanzu":
                return new Tanzu(name, <any>undefined, { urn })
            default:
                throw new Error(`unknown resource type ${type}`);
        }
    },
};
pulumi.runtime.registerResourceModule("harness", "cloudprovider/aws", _module)
pulumi.runtime.registerResourceModule("harness", "cloudprovider/azure", _module)
pulumi.runtime.registerResourceModule("harness", "cloudprovider/datacenter", _module)
pulumi.runtime.registerResourceModule("harness", "cloudprovider/gcp", _module)
pulumi.runtime.registerResourceModule("harness", "cloudprovider/kubernetes", _module)
pulumi.runtime.registerResourceModule("harness", "cloudprovider/spot", _module)
pulumi.runtime.registerResourceModule("harness", "cloudprovider/tanzu", _module)
