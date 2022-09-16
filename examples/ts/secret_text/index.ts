import * as pulumi from "@pulumi/pulumi";
import * as harness from "@lbrlabs/pulumi-harness";

const secret = new harness.platform.SecretText("example", {
    identifier: "ts_example",
    valueType: "Inline",
    value: "correct-horse-battery-stable",
    secretManagerIdentifier: "harnessSecretManager",
})

