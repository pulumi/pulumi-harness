package shim

import (
	"github.com/hashicorp/terraform-plugin-sdk/v2/helper/schema"
	"github.com/lbrlabs/pulumi-harness/provider/pkg/version"
	"github.com/harness/terraform-provider-harness/internal/provider"
)

func NewProvider() *schema.Provider {
	prov := provider.Provider(version.Version)()
	return prov
}
