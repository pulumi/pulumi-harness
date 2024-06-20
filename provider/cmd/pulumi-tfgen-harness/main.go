package main

import (
	"github.com/pulumi/pulumi-terraform-bridge/v3/pkg/tfgen"

	harness "github.com/pulumi/pulumi-harness/provider"
	"github.com/pulumi/pulumi-harness/provider/pkg/version"
)

func main() {
	// Modify the path to point to the new provider
	tfgen.Main("harness", version.Version, harness.Provider())
}
