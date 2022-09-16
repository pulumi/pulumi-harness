import * as pulumi from "@pulumi/pulumi";
import * as harness from "@lbrlabs/pulumi-harness";

const environment = new harness.platform.Environment("example", {
    type: "PreProduction",
    identifier: "example"
})


