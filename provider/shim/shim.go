package shim

import (
	"github.com/harness/terraform-provider-harness/internal/provider"
	"github.com/hashicorp/terraform-plugin-sdk/v2/helper/schema"
	"github.com/pulumi/pulumi-harness/provider/pkg/version"
)

func NewProvider() *schema.Provider {
	prov := provider.Provider(version.Version)()
	return prov
}
