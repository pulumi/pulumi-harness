//go:generate go run ./generate.go

package main

import (
	_ "embed"

	harness "github.com/pulumi/pulumi-harness/provider"
	"github.com/pulumi/pulumi-harness/provider/pkg/version"
	"github.com/pulumi/pulumi-terraform-bridge/v3/pkg/tfbridge"
)

//go:embed schema-embed.json
var pulumiSchema []byte

func main() {
	// Modify the path to point to the new provider
	tfbridge.Main("harness", version.Version, harness.Provider(), pulumiSchema)
}
